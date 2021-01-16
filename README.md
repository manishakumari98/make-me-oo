**Problems With Shivam's OOP Solution**

- Problems with Point Class:
    - It doesn't have a behaviour.
    - Unnecessary setter methods are written which are not even used.
    - The fields should be made final, because if values are changed the point doesn't remain same. Hence, no setters are needed.
    - The fields should not be accessible outside class. Hence, getters are also not needed.

- Problems with DistanceAndDirectionCalculator Class:
    - It should not be a class.
    - It doesn't have any properties/fields.
    - It doesn't have a Constructor.
    - The methods are static which violates OOP principle of Polymorphism.
    - The methods should be behaviour of Point Class. Hence, will have only one Point argument.

- Problems with DistanceAndDirectionCalculatorTest:
    - AAA format is not followed.
    - Magic number code smell exists.
    - imports are not optimized.

- His solution doesn't follow OOP principles and looks procedural.

**Solution To The Problems**
- DistanceAndDirectionCalculator Class should be deleted.
- distance and direction methods should be behaviours of Point Class. Hence, should have only one argument of Point data-type.
- fields of Point Class should be made final.
- getters and setters are removed in order to preserve Encapsulation.