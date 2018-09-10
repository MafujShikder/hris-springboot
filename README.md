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
  
 ## Accessing the Hris api
 ### Using the rest api
 You can access the hris api using the rest api via the url:
    
    http://localhost:8080/api/
    
 An example of a get request would be:
 
    http://localhot:8080/api/users.json/?fields=id,uid,email
    
    
    
 ### Using the graphql service
 Using the graphql interface json POST request of the form:
    
    {"query":"{Users{id uid}}"}
  
  can be sent to the uri
  
    http://localhost:8080/graphiql
    
    
The following the are the sample of the queries that can be sent:
 
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

The following are queries to achieve differently desired responces:

    mutation{
 
      newFieldDataType(name:"FieldOne",description:"SDfaf",uid:"343"){ # Create a new FieldDataType record
        name
        id
        description
      }

      newInputType(name:"InputOne",uid:"2323",htmltag:"23143", description:"This"){ # Create a new InputType record
        name
        id
        description
      }

      newFormSection(description:"fegsfgs",formId:993,uid:"343",name:"adfa"){  # Create a new FormSection record
         description
         id
      }

       newFieldGroup(description:"This is the test "){
        id
        description
        fields{
          dataType{
            name
            description
          }
        }
      }

      newField(datatypeId:3, compulsory:"true", dataType:1, inputType:1,fieldGroup:1){ # Create a new Field record
        uid
        fieldGroups{
          fields{
            caption
            compulsory
          }
        }
        dataType{
          name
          description
        }
       caption
        inputType{
          name
        }
      }



      updateField(id:1, compulsory:"false", uid:"Hey Eliah is me"){  # update the field 
        compulsory
        uid
      }


      updateFieldGroup(id:1, field:1){  # update the field group and add a new field 
        description
        fields{
          uid
          compulsory
          dataType{
            name
            description
          }
        }
      }


    }



 
    
