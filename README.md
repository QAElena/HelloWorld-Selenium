# HelloWorld-Wicket

##Generar Proyecto
Proyecto web generado automáticamente con QuickStart Wicket.
Para generar el proyecto es necesario tener instalado Maven. Se introduce el siguiente comando:
 
 ``
 mvn archetype:generate -DarchetypeCatalog=http://wicket.apache.org 
``



 En pantalla tendremos que elegir diferentes parámetros como IdGroup, IdArtifact, version ,...
 
##Compilar y generar .WAR
En la carpeta Target esta el .WAR para desplegarlo en Tomcat

Comandos Maven : mvn clean install

##Desplegar en Tomcat
Desplegar en Tomcat desde local: Copiar el .WAR en la carpeta WEBAPP de Tomcat

Desplegar en Tomcat desde admin-web: Desplegar .WAR
