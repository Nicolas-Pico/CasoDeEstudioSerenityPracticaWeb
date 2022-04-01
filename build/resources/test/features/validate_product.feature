Feature: validate product

  Scenario Outline: validate product
    Given He user logs in


    When The user add a new product to list

      | email    | <email> |
      | password | <password> |

    Then the could see a product in the list

    Examples: Data Login
      | email | password |
      | Juan@gmail.com | juan2468 |


