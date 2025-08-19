**#📝Online Notes Keeper**

A simple Spring Boot web application that allows users to create, edit, delete, and manage notes online. The project follows the MVC architecture and demonstrates full-stack development using Java, Spring Boot, Spring Data JPA, Thymeleaf, HTML, CSS, and MySQL.

##Features-

-Add new notes
-View all saved notes on the home page
-Edit existing notes
-Delete notes
-Clean UI with CSS & Font Awesome icons

----

##Tech Stack-

Backend: Java, Spring Boot, Spring Data JPA
Frontend: Thymeleaf, HTML, CSS, Font Awesome
Database: MySQL
Build Tool: Maven (or Gradle, if used)
Version Control: Git & GitHub

---

##⚙ Setup Instructions
**1️. Clone the repository**
git clone https://github.com/your-username/online-notes-keeper.git
cd online-notes-keeper

**2️. Configure Database**

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/notesdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

**3️. Run the project**
mvn spring-boot:run
or
./mvnw spring-boot:run

**4️. Open in browser**
http://localhost:8080

---

###Future Enhancements-

User login & authentication
Search and categorize notes
Cloud storage for notes
Dark mode UI

---

###Learning Outcomes-

Hands-on experience with Spring Boot & JPA CRUD
MVC architecture implementation
Integration of Thymeleaf frontend + Spring backend
Handling static resources in Spring Boot
