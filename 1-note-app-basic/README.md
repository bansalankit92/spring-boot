## Spring Boot basic web Note application BackEnd


See here for more informations:

### Build and run

#### Prerequisites

- Java 8
- Maven > 3.0
- Rest Client Postman/ARC

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.


### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the Note List:
  As we are not using DB the data will be stored in the Memory so Each time you run, You have to add values again
  Use Rest Client like Postman or ARC to run the links.
  Body content-type: `application/x-www-form-urlencoded`
    * POST `/notes`: Body `note=note value` create a new note with an auto-generated id and time and note as passed values.
    * DELETE `/notes/{id}`: delete the note with the passed id in url .
    * GET `/notes/{id}`: retrieve note by passing the note id.
    * GET `/notes`: Get all notes as list.
    * PUT `/notes/{id}`: Body `note=updated value` To update the note 

Run the application and go on `http://localhost:8080/notes` to see the note list
