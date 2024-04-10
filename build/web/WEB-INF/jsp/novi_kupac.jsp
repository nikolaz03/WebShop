

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novi kupac</title>
        
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
    
    <body class="body">

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
            <form:form action="novi_kupac.htm" method="post" commandName="kupac">



                <div class="field">
                <form:label path="id">ID kupca:</form:label>
                <form:input path="id"/>
                <form:errors path="id" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="ime">Ime:</form:label>
                <form:input path="ime" />
                <form:errors path="ime" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="prezime">Prezime: </form:label>
                <form:input path="prezime" />
                <form:errors path="prezime" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="godine">Godine: </form:label>
                <form:input path="godine"/>
                <form:errors path="godine" cssClass="error"></form:errors>
                </div>


                <div class="field">
                <form:label path="adresa">Adresa:</form:label>
                <form:input path="adresa"/>
                <form:errors path="adresa" cssClass="error"></form:errors>
                </div>

                <div class="field">
                <form:label path="email">Email:</form:label>
                <form:input path="email"/>
                <form:errors path="email" cssClass="error"></form:errors>
                </div>
                
                <div class="field">
                <form:label path="novac">Raspoloziv novac (RSD):</form:label>
                <form:input path="novac"/>
                <form:errors path="novac" cssClass="error"></form:errors>
                </div>

                <input type="submit" value="Submit" />
            </form:form>
        </div>

    </body>
</html>
