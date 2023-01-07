*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${SERVER}    localhost:7272
${BROWSER}    Firefox
${WELCOME URL}    http://${SERVER}/Lab11/Registration.html
${SUCCESS URL}    http://${SERVER}/Lab11/Success.html
${FIRST NAME}    Somsri
${LAST NAME}    Sodsai
${ORGANIZATION}    CS KKU
${EMAIL}    somsri@kkumail.com
${PHONE}    081-001-1234

*** Test Cases ***
Open Event Registration Page
    Open Browser    ${WELCOME URL}    ${BROWSER}
    Location Should Be    http://localhost:7272/Lab11/Registration.html
    Title Should Be     Event Registration
Register Success
    Input Text    id=firstname    ${FIRST NAME}
    Input Text    id=lastname    ${LAST NAME}
    Input Text    id=organization    ${ORGANIZATION}
    Input Text    id=email    ${EMAIL}
    Input Text    id=phone    ${PHONE}
    Click Button  id=registerButton
    Location Should Contain    Success.html
    Title Should Be    Success
    Page should contain    Success
    Page should contain    Thank you for participating in our event


