# externallog4j
Basic example of log4j configuration externalization

Simple webapp with a servlet that load and initializes Log4j based on a path declared in the initialization params of the servlet, in the web.xml

To run it:
- clone the repo
- edit the location on the file declared in web.xml
- create a log4j.properties at this location
- run the command mvn clean package tomcat7:run
- go to http://localhost:8080/externallog4j/log
