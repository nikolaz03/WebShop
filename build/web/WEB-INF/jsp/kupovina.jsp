

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kupovina</title>
        <style type="text/css">

            .field
            {
                clear:both;
                padding:5px;
                justify-content: center;
                text-align: center;
                flex-basis: 100%;
                margin:0 auto;
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
                flex-basis: 100%;
                margin:0 auto;
                
            }
            
            .table {
                flex-grow: 5;
                flex-basis: 50%;
                margin: 0 auto;
                width: 50%;
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
            <form action="kupovina.htm" method="post">

                <div class="field">
                <label>ID kupca:</label>
                <input type="number" name="idk"/>                
                </div>

                <div class="field">
                <label>ID proizvoda:</label>
                <input type="number" name="idp" />               
                </div>
                
                <div class="field">
                    <label>Kolicina:</label>
                <input type="number" name="kol" />                
                </div>
                    
                
                
                <input type="submit" value="Kupi" />
                
            </form>
        </div>
    </body>
</html>
