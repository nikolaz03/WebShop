

<%@page import="model.Proizvod"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proizvodi</title>

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
            
            .form {
                
                display: flex;
                flex-basis: 100%;
                text-align: center;
                flex-grow: 5;
                justify-content: center;
                
            }
            
            .table {
                flex-grow: 5;
                flex-basis: 50%;
                margin: 0 auto;
                width: 50%;
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
            <h1>Lista proizvoda</h1>
            <br/>
            
        </div>
        
        <div class="form">
            
            <form style="margin: 0 50px 0 0;" action="novi_proizvod.htm" method="get">
                <input type="submit" value="Dodaj proizvod" size="20px"/>
            </form>

            <form style="margin: 0 50px 0 0;" action="izmeni_proizvod.htm" method="get">
                <input type="submit" value="Izmeni postojeci proizvod"/>
            </form>
            
            <form style="margin: 0 50px 0 0;" action="obrisi_proizvod.htm" method="get">
                <input type="submit" value="Obrisi proizvod" size="20px" />
            </form>
            
            <br/><br/>
        </div>
        
        <div class="field">
            <table class="table" border='0' cellpadding='6'>
                <tr>
                    <td bgcolor="#1ccebc">ID</td>
                    <td bgcolor="#1ccebc">Naziv proizvoda</td>
                    <td bgcolor="#1ccebc">Kolicina</td>
                    <td bgcolor="#1ccebc">Cena (RSD)</td>
                </tr>
                <%
                    for (int i = 0; i < Proizvod.listaProizvodi.size(); i++) {
                %>
                <tr>
                    <td><%= Proizvod.listaProizvodi.get(i).getId()%></td>
                    <td><%= Proizvod.listaProizvodi.get(i).getNaziv()%></td>
                    <td><%= Proizvod.listaProizvodi.get(i).getKolicina()%></td>
                    <td><%= Proizvod.listaProizvodi.get(i).getCena()%></td>    
                </tr>
                <%
                    }
                %>

            </table>
        
        </div>
    </body>
</html>
