# Autor: Diego Ramirez
@stories
Feature: User Register
  As a software tester, I want to register on the platform

  @scenario1
  Scenario: Successful user sign up
    Given Diego wants to sign up on the platform of software testers
    When he sends the required information for registration
      | strFirstname | strLastname | strEmail               | strBirthMonth | strBirthDay | strBirthYear | strPassword |
      | Joseph       | Guardiola   | pepeguarrla@reto.com    | April         | 18          | 1969         | PEPEg1357!# |

    Then he receives the welcome and confirmation of his new account
      | strWelcome                   |
      | The last step                |
  #    | Welcome to the world's largest community of freelance software testers! |
