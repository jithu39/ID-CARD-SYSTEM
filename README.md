# University Digital ID System

Simple console application to create and manage digital ID cards for students and faculty. This project demonstrates basic object-oriented design in Java (Person, Student, Faculty, IDCard, Admin) and provides a small CLI to interact with the system.

## Features
- Create and manage Student and Faculty records
- Issue and display ID cards
- Simple admin utilities for listing and searching records
- Console-based menu driven interface

## Prerequisites
- Java JDK 11+ installed
- A Linux terminal (commands shown below are for Linux)
- Source files located in the project root

## Project structure
- Person.java — abstract base class for people
- Student.java — student-specific implementation
- Faculty.java — faculty-specific implementation
- IDCard.java — model for the ID card
- Admin.java — administrative helper utilities
- IDCardSystem.java — CLI entry point

## Build
Open a terminal in the project directory:
```sh
cd "/home/jithenderrathod/JAVA PROBLEM/OOD MINI PROJECT"
javac *.java
```

If you use packages, compile with the appropriate package-aware javac command. The above assumes all .java files are in the project root with no package declarations.

## Run
After successful compilation:
```sh
java IDCardSystem
```
The program starts the console menu. Follow prompts to create students/faculty and manage ID cards.

## Usage example
- Start program: `java IDCardSystem`
- Choose options from the displayed menu (e.g., create Student, create Faculty, issue ID card, list all)
- Provide requested details (name, ID, department, etc.)
- View generated ID card output in the console

## Notes for developers
- Keep classes small and focused: Person (abstract) -> Student / Faculty.
- IDCard stores card details and can be extended for serialization (file/DB) if persistence is needed.
- Admin class contains helper methods for listing/searching; consider refactoring to use a repository/service layer for larger projects.

## Testing
No automated tests included. To add tests, create a tests directory and use JUnit:
- Add JUnit to classpath (Maven/Gradle recommended)
- Create unit tests for core classes (Person, IDCard, Admin utilities)

## Contribution
1. Fork the repository
2. Create a branch for your feature/bugfix
3. Implement changes and add tests
4. Submit a pull request with a clear description

## License
This project is licensed under the MIT License — see the included LICENSE file for details.

## Contact
For questions or improvements, open an issue in the repository or
