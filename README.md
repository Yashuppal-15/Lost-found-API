# Lost and Found API

This project is a Spring Boot REST API for managing lost and found items in a college.

## Features
- Add lost item
- Retrieve all lost items
- REST API built using Spring Boot
- Data stored using Spring Data JPA
- H2 in-memory database

## Technologies
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman (API Testing)

## API Endpoints

POST /items  
GET /items

## Example Request

POST /items

{
 "itemName": "Wallet",
 "description": "Black leather wallet",
 "color": "Black",
 "locationFound": "Library",
 "reportedBy": "Yash Uppal",
 "contactNumber": "6387578748"
}
