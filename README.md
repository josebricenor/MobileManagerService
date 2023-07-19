# Mobile Manager Service

This is a simple application that allows users to manage a list of mobile phones and book or return them.

## Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [Tests](#tests)
4. [License](#license)

## Installation

To install this project locally, follow these steps:

```bash
# Clone the repository
git clone https://github.com/josebricenor/MobileManagerService.git

# Navigate to the project directory
cd MobileManagerService

# Install the dependencies
mvn clean install
```

## Usage

This project is a Spring Boot application, and you can run it with the following command:

```bash
mvn spring-boot:run
```

Once the application is running, you can access the API on `http://localhost:8080`.

The API exposes the following endpoints:

- `GET /phones`: Get a list of all available phones.
- `POST /phones/{id}/book?bookedBy={username}`: Book a phone by its ID. You need to pass the username who is booking the phone as a query parameter.
- `POST /phones/{id}/return`: Return a phone by its ID.

## Tests

This project uses JUnit for unit testing. You can run the tests with the following command:

```bash
mvn test
```

## License

This project is released under the MIT License. Please refer to the `LICENSE` file for more details.
