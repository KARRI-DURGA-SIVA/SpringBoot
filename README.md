# SpringBoot

A simple Spring Boot web application with one REST endpoint.

## Requirements

- Java 17
- Maven is not required locally because this project includes the Maven wrapper.

## Run

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

On macOS/Linux:

```bash
./mvnw spring-boot:run
```

The app starts on port `8008`.

## Endpoint

```text
GET http://localhost:8008/hello
```

Response:

```text
Hello Siva!
```

## Test

On Windows:

```powershell
.\mvnw.cmd test
```

