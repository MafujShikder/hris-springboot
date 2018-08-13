# HRIS

Human Resource Information System(HRIS)is a software that enables organisations to collect, validate, 
analyse and present raw and statistical human resource information for reporting, analysis and decision making. 
It is a generic software tool that allows customization to fit organization specific requirements, its built
with open meta-data models and flexible and customizable user interface that allows user to adjust the system 
to peform, behave, look and feel based on organisation's specific requirements without the need for software development.

HRIS Software is a loosely coupled modular web based software bundle that is built with free 
and open source Java Web Frameworks. Among the frameworks involved are

    Spring Boot Web Framework
    JPA/ Hibernate for persistence
    GraphQl and REST for managing API calls
    Maven Dependency Manager

## Project Configurations

To use this software for testing and development, clone this repository to your drive and edit the file with the path

    hris/src/main/resources/application.properties

to suit your machine:

    spring.datasource.url=jdbc:postgres://localhost:5432/hris
    spring.datasource.username=
    spring.datasource.password=
    
    
and create a database with the name 'hris'. Open the link 
    
    http://localhost:8080/graphiql
    
Check out the mutations and queries defined in the GraphQL schemas found in the directory below for the possible API operations that can be perfomed with this API or at the Docs link in the graphiql interface at the address above.

    /hris/src/main/resources/graphql
  
 ## Examples
    
 A sample mutation would be like:
 
    mutation{
          newUser(organisationunitId:4, username:"testing",usernameCanonical:"tester", email:"testing@gmail.com",       emailCanonical:"test@yahoo.com",
          enabled:"true", salt:"true", password:"my_password", locked:1,expired:1, confirmationToken:"ndsfgldfkgns34535",
          roles:"admin", credentialsExpired:1, uid:"34534",
          phonenumber:"0754008843", jobtitle:"Singer", firstname:"Lazarus", middlename:"Andrew", surname:"Jake",
          description:"We are about to finish this"){
                organisationunitId
                username
                email
          }
        }
 
 
 A sample query can be like:
 
    {
    users{
        id
        username
        email
         }
    }

Instead of using the graphiql interface the same responce above can be initiated via a HTTP post to hrhis.hisptz.org/graphql.
    
    {
        "query":"{users{id, username, email}}"
    }





 
    
