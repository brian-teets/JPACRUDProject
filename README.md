# JPA CRUD Project

## Week 9 Weekend Project for Skill Distillery

### Project Overview

The objective of this project is to create a full-stack Java application from start to finish and perform basic `CRUD` operations on a single table database.

#### National Park Service Tracker

For my project, I wanted to create a full-stack application to start to track National Parks and NPS managed locations that I've visited.

### Learning Objectives

- Creating a SQL database and creating a SQL table
- Configuring a JPA Project
- Mapping *Entities* to a SQL table
- Creating JUnit tests to ensure JPA entity mappings are correct
- Integrating a Spring MVC project with a JPA project
- Performing basic CRUD operations
- Deploying an application to AWS

## How to Use the Application

#### With the Application Deployed to AWS:

- User will land on the index page of application via provided i.p address: `http://52.8.112.153:8080/NPSLocationTracker/`. 
- 14 records have already been included on the main page as part of the SQL insert.
     - Click the name of any NPS location to view more details on a new page.
- Use the `Search by Id` option located on the left side of the page. The single result will display on a result page.
- `Add a new location` to the database by entering the name of the NPS location and clicking the `Add Location` button. The newly created location will then display on a result page. From this page, you have options to `UPDATE` or `DELETE` the location data you just created.
- Options to `UPDATE` or `DELETE` are also available from the search result page.
     - If you update a location record, your changes will display automatically on the result page.
     - If you delete a location record, you will be redirected to a page confirming deletion. The deleted record's Id is then no longer searchable.

## Technologies Used

- Java
- Spring Framework
- Spring MVC
- Spring Boot
- Spring ToolSuite
- MAMP Server
- SQL
- MySQL Workbench
- JSP
- HTML
- CSS
- Bootstrap
- Terminal
- git
- GitHub

## Lessons Learned

- Importance of annotations
     - `@Table` annotation - I used snake case when naming my SQL table, so I learned I needed the `@Table` annotation on my Entity
- How to map a String from an HTML date picker form to a Java object by parsing the String to a LocalDate data type
- Gained exposure working with a JPA DAO implementation for CRUD methods and accompanying Controller request mappings
- Gained practice tracing my 404 errors and 500 errors in the console
