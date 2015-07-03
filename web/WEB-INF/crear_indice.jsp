<%-- 
    Document   : crear_indice
    Created on : 27-06-2015, 10:28:49
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <h:head>
        <title>Musearch: Búsqueda de álbumes </title>
    </h:head>
    <h:body>
        <h1 style="text-align: center; margin-top: 5%; margin-bottom: 10%">Musearch</h1>
        <div style="text-align: center">
            <h:form>
                <p:inputText value="#{bookCatalog.user_input}"/>
                <p:commandButton value=" GO!"  style="margin-left: 10px" action="table_1">
                </p:commandButton>
<!--                <h:link value="Ir a la otra wea" outcome="table" >
                    
                </h:link>-->
                
            </h:form>
        </div>
    </h:body>
</html>
