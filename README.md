
## Spring_DB_MySQL_Gradle.ver

* Spring Boot : `2.3.4.RELEASE`

* Java : `11`

* Build Tool : `Gradle`

* DB : `MySQL`

* Feature 

  - If you want to use this code
  
    you have to find `TODO : Modify to the appropriate value` Comment.

  - There is `QueryLoggingInterceptor`
    
    So you can check the SQL statement.
  
> Example

``` java
## SQL Logging 
[Id] dev.be.goodgid.repository.oltp.UserMapper.selectByPrimaryKey
[Statement] select * from USER where user_seq = /*userSequence*/1 , 352ms Elapsed.
```
  


