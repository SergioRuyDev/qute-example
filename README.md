# Qute Example Project

## Description of Project

This project demonstrates how to generate PDF documents from HTML templates using Quarkus and the openhtmltopdf library. It is a practice project designed to explore the capabilities of Quarkus in generating dynamic PDFs for various purposes such as receipts, reports, or any document requirement.

## Functionalities

:bell: Generation of PDF documents from HTML templates.

:bell: Utilization of Quarkus Qute Templating Engine for dynamic HTML content.

:bell: Integration with openhtmltopdf library for converting HTML to PDF format.

## Tools and technologies used:
1. Java 17+
2. Quarkus
3. Qute Templating Engine
4. openhtmltopdf
5. Maven
6. Your preferred IDE (e.g., IntelliJ IDEA, VSCode)
7. Postman or any API testing tool

## Steps and Requirements to build and run the Project
**1. Clone the application.**
```bash
git clone https://github.com/SergioRuyDev/qute-example.git
```

2. Navigate to the project directory.

```bash
cd qute-example
```
3. Run the application using Maven.

```bash
./mvnw quarkus:dev
```
This command will start the application in development mode with live coding enabled.

4. Access the application.

The application should now be running on http://localhost:8080.
You can generate a PDF using the provided endpoint and view it in your browser or download it.
5. Test the PDF generation.

Use Postman or any API testing tool to send a request to the PDF generation endpoint.
Example POST request:
```bash
POST - URL - http://localhost:8080/pdf
```
Project Purpose
This project is created for educational purposes, focusing on learning Quarkus, Qute Templating Engine, and PDF generation using openhtmltopdf. 
It demonstrates the capabilities of these technologies in a simple, practical example. 
Feel free to explore, modify, and use the code for your learning and development.