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
Empty First Name
    Input Text    id=lastname    ${LAST NAME}
    Input Text    id=organization    ${ORGANIZATION}
    Input Text    id=email    ${EMAIL}
    Input Text    id=phone    ${PHONE}
    Click Button  id=registerButton
    Location Should Contain    ${WELCOME URL}
    Title Should Be    Event Registration
    Page should contain    Please enter your first name!!
    Reload Page
Empty First Name and Last Name:
    Input Text    id=organization    ${ORGANIZATION}
    Input Text    id=email    ${EMAIL}
    Input Text    id=phone    ${PHONE}
    Click Button  id=registerButton
    Location Should Contain    ${WELCOME URL}
    Title Should Be    Event Registration
    Page should contain    Please enter your name!!
    Reload Page
Empty Email
    Input Text    id=firstname    ${FIRST NAME}
    Input Text    id=lastname    ${LAST NAME}
    Input Text    id=organization    ${ORGANIZATION}
    Input Text    id=phone    ${PHONE}
    Click Button  id=registerButton
    Location Should Contain    ${WELCOME URL}
    Title Should Be    Event Registration
    Page should contain    Please enter your email!!
    Reload Page
Empty Phone Number:
    Input Text    id=firstname    ${FIRST NAME}
    Input Text    id=lastname    ${LAST NAME}
    Input Text    id=organization    ${ORGANIZATION}
    Input Text    id=email    ${EMAIL}
    Click Button  id=registerButton
    Location Should Contain    ${WELCOME URL}
    Title Should Be    Event Registration
    Page should contain    Please enter your phone number!!
    Reload Page
Invalid Phone Number
    Input Text    id=firstname    ${FIRST NAME}
    Input Text    id=lastname    ${LAST NAME}
    Input Text    id=organization    ${ORGANIZATION}
    Input Text    id=email    ${EMAIL}
    Input Text    id=phone    1234
    Click Button  id=registerButton
    Location Should Contain    ${WELCOME URL}
    Title Should Be    Event Registration
    Page should contain    Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678)
    [Teardown]    Close Browser
    
