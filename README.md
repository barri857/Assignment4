# Assignment4
Real Estate Management System (Assignment 4)

A. SOLID Documentation:

SRP per class The project follows Single Responsibility Principle by separating concerns. PropertyRepository handles low-level database operations, PropertyService contains business logic and validation, and the Main class acts as the basic controller for user interaction.

OCP in subclass extension The system is open for extension via the abstract Property class. You can add new property types like House or Apartment without modifying the existing codebase or the service layer logic.

LSP between base class and children Subclasses like House and Apartment can be used interchangeably with the base Property type. They implement the abstract displayBasicInfo method, ensuring they do not break the functionality of the base class.

ISP for clean, narrow interfaces Instead of a single heavy interface, the project uses small, specialized interfaces such as Validatable, Taxable, and PricedItem. This ensures classes only implement the specific behavior they require.

DIP for constructor-injected interfaces The PropertyService depends on the CrudRepository interface rather than a concrete implementation. This allows for easier testing and the ability to swap database implementations without changing the service layer.

B. Advanced OOP Features:

Generics The system utilizes a generic CrudRepository<T> interface. This allows the repository layer to handle any entity type while maintaining type safety.

Lambdas Lambda expressions are implemented in the SortingUtils class. They are used to define custom comparator logic for sorting property lists by their price attribute.

Reflection The ReflectionUtils class performs runtime inspection of objects. It extracts class names and lists all declared fields and methods using the Java Reflection API.

Interface default/static methods The Validatable interface demonstrates modern Java features by including a default method for basic validation and a static method for null checks.

C. OOP Documentation:

Abstract class + subclasses The Property class is the abstract base entity. It is extended by the House and Apartment subclasses which provide specific implementations for abstract methods.

Composition relationships A composition relationship exists between Property and Agent. Each property listing contains a reference to the Agent responsible for it.

Polymorphism examples Polymorphism is demonstrated by iterating through a list of Property objects and calling displayBasicInfo. The JVM calls the correct subclass version at runtime.

UML diagram An updated class diagram is provided in the docs/uml.png file to visualize the system structure.
![UML Diagram](./Assignment4/docs/screenshots/uml.diagram.png)

D. Database Section:

Schema The database consists of two primary tables: agents and properties.

Constraints Foreign key constraints ensure that every property is linked to a valid agent. Price fields include numeric constraints to prevent negative values.

Sample inserts The resources/schema.sql file contains standard INSERT statements to populate the system with initial data for testing.

E. Architecture Explanation:

Roles:

Controller: Handles simple input and delegates to the service.

Service: Applies business rules and coordinates between repository and controller.

Repository: Uses JDBC to perform standard CRUD operations.

Request/Response A typical request involves the controller calling service.addProperty(p), which validates the data before calling repository.create(p) to save it to the database.

F. Execution Instructions:

How to compile and run:

Ensure a PostgreSQL database is running.

Run resources/schema.sql to set up the database.

Open the project in IntelliJ IDEA and run Main.java.

Requirements:

Java SDK 17+

PostgreSQL JDBC Driver

Database connection details configured in DatabaseConnection.java.

G. Screenshots:

The following screenshots are available in the docs/screenshots directory:

![Successful CRUD](Assignment4/docs/screenshots/suc_execution.png)

![Validation Failures](Assignment4/docs/screenshots/other_outputs_allinone.png)

![Reflection Output](Assignment4/docs/screenshots/reflection_output.png)

![Sorted Lists](Assignment4/docs/screenshots/other_outputs_allinone.png)

H. Reflection:

What you learned This assignment provided deep insights into refactoring code for SOLID principles. I learned how to move from a monolithic design to a decoupled, multi-layer architecture.

Challenges Managing the dependency between the Service and Repository layers while ensuring the Generic types were correctly handled was the most significant technical challenge.

Value of SOLID Applying SOLID makes the code significantly more maintainable. The Open-Closed Principle specifically allows for much easier scaling of the real estate platform in the future.
