# Spring Boot MongoDB CRUD Project

## Description
This project is a REST API built using Spring Boot and MongoDB Atlas that performs CRUD (Create, Read, Update, Delete) operations on Student data.

## Technologies Used
- Java
- Spring Boot
- MongoDB Atlas
- Maven
- Postman

## Features
- Create a new student
- Get all students
- Get a student by ID
- Update student details
- Delete a student

## API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| POST | /students | Create a student |
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |

## Sample JSON
```json
{
  "name": "Siri Chandana",
  "age": 21,
  "department": "CSE-DS",
  "email": "sirichandana@gmail.com"
}
```

## Author
Akula Siri Chandana
