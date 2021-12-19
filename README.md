
#Add Student to Database

``
POST 'localhost:8080/student/add' 
Content-Type: application/json
{
"name":"John",
"address":"USA"
}
``

#Get All Students from Database
``
GET 'localhost:8080/student/getAll'
``