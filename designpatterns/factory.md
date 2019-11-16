1. When to use factory pattern?

Factory pattern introduces **loose coupling between classes** which is the most important principle one should consider and apply while designing the application architecture. Loose coupling can be introduced in application architecture by programming against abstract entities rather than concrete implementations. This not only makes our architecture more flexible but also less fragile.

2.Code

//to-do add explanation of code here or in code itself

https://github.com/dhanu10896/algos-and-ds/tree/master/src/main/java/designpatterns/creational/factory

3.

Factory pattern is most suitable where there is some complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used. We can see many realtime examples of factory pattern in JDK itself e.g.

- [java.sql.DriverManager#getConnection()](https://docs.oracle.com/javase/10/docs/api/java/sql/DriverManager.html#getConnection%28java.lang.String%29)
- [java.net.URL#openConnection()](https://docs.oracle.com/javase/10/docs/api/java/net/URL.html#openConnection%28%29)
- [java.lang.Class#newInstance()](https://docs.oracle.com/javase/10/docs/api/java/lang/Class.html#newInstance%28%29)
- [java.lang.Class#forName()](https://docs.oracle.com/javase/10/docs/api/java/lang/Class.html#forName%28java.lang.String%29)