To deploy a springBoot application on an external web server, it needs to extend SpringBootServletInitializer.

##Why ?

Spring is based on Servlet API. To deploy any servlet based applications on a web server, a dispatcher servlet is required. Earlier this was configured using web.xml. But currently it is recommended and easier to set it up using Java configuration. The Java configuration is done via 'WebApplicationInitializer'.
In SpringBoot we have SpringBootServletInitializer which extends WebApplicationInitializer.

##What is a Servlet ?

Servlet is something or it is a Java programming language class(object ?) that SERVES HTTP requests from the web.
 