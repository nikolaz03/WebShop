

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Izmena kupca</title>
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
            <form action="izmeni_kupca.htm" method="post">

                <div class="field">
                <label>ID kupca:</label>
                <input type="number" name="id"/>                
                </div>
                
                <br/><br/><br/>

                <div class="field">
                <label>Novo ime:</label>
                <input type="text" name="ime" />               
                </div>
                
                <div class="field">
                    <label>Novo prezime:</label>
                    <input type="text" name="prez" />                
                </div>
                
                <div class="field">
                    <label>Novi br. godina:</label>
                <input type="number" name=god />                
                </div>
                
                <div class="field">
                    <label>Novi eMail:</label>
                    <input type="email" name="mail" />                
                </div>
                
                <div class="field">
                    <label>Novo stanje na racunu (RSD):</label>
                <input type="number" name="rsd" />                
                </div>
                
                <div class="field">
                    <label>Nova adresa:</label>
                    <input type="text" name="adr" />                
                </div>
                
                               
                <input type="submit" value="Izmeni" />
                
            </form>
        </div>
    </body>
</html>
