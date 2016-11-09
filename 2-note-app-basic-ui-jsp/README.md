## Spring Boot basic web Note application BackEnd


See here for more informations:

### Build and run

#### Prerequisites

- Java 8
- Maven > 3.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.


### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the Note List:
  As we are not using DB the data will be stored in the Memory so each time you run/restart the server , You will need to add values again.
  Body content-type: `application/x-www-form-urlencoded`
  All this method return ModelAndView i.e. GUI of the application
    * POST `/notes`: Body `note=note value` create a new note with an auto-generated id and time and note as passed values.
    * GET `/notes/delete?id=1`: delete the note with the passed id in url .
    * GET `/notes/id?id=1`: retrieve note by passing the note id.
    * GET `/notes`: Get all notes as list.
    * POST `/notes/update?id=1`: Body `note=updated value` To update the note 

Run the application and go on `http://localhost:8080/notes` to see the note with UI 
