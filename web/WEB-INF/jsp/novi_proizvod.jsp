

<%@page import="model.Proizvod"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novi proizvod</title>
        
        <style>
        
            .field
        {
            clear:both;
            padding:5px;           
            text-align: center;
        }

        .error
        {
            color: red;
        }

        .header {
            text-align: center;
            flex-basis: 100%;
            color: black;
            font-size: 1.2em;
        }

        .nav {
            display: flex;
            flex-basis: 100%;
            flex-grow: 1;
            background-color: black;
            font-size: 1.5em;
            padding: 1.5em;
            justify-content: space-around;
        }

        .body {
            display: flex;
            flex-flow: row wrap;
            text-align: center;
            margin: 0;
        }

        a {
            text-decoration: none;
            color: white;
        }

        .main {
            text-align: center;
            flex-grow: 5;
            font-size: 1.2em;
        }
             

    </style>
    
    </head>
    
    <body>

        <header class="header">
            <h1>Web prodavnica</h1>
        </header>

        <nav class="nav">
            <a href="index.htm">Pocetna</a>
            <a href="proizvodi.htm">Proizvodi</a>
            <a href="kupci.htm">Kupci</a>
            <a href="kupovina.htm">Kupovina</a>
        </nav>


        <div class="main">
        <form:form action="novi_proizvod.htm" method="post" commandName="proizvod">

                <div class="field">
                <form:label path="naziv">Naziv proizvoda: </form:label>
                <form:input path="naziv" />
                <form:errors path="naziv" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="kolicina">Kolicina: </form:label>
                <form:input path="kolicina" />
                <form:errors path="kolicina" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="cena">Cena: </form:label>
                <form:input path="cena"/>
                <form:errors path="cena" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="id">ID proizvoda:</form:label>
                <form:input path="id"/>
                <form:errors path="id" cssClass="error"></form:errors>
                </div>



                <input type="submit" value="Submit" />
        </form:form>
        </div>        
        
    </body>
</html>
