/*Maak een selectie vanuit de tabellen waarbij je alles selecteert)*/
SELECT * FROM artiest;
SELECT * FROM locatie;
SELECT * FROM tijd;
SELECT * FROM voorstelling;
/*Laad data in de verschillende tabellen*/
INSERT INTO artiest (naam, genre, naam_voorstelling)
VALUES (value1, value2, value3);
INSERT INTO locatie (naam, capaciteit)
VALUES (value1, value2);
INSERT INTO tijd (dag, tijdstip)
VALUES (value1, value2);
INSERT INTO table_name (voorstelling_naam, capaciteit)
VALUES (value1, value2);

/*Wat nog uitgezocht moet worden is de mogelijkheid om in de database te laten muteren door een JAVA gestuurde input.
Dit ten behoeve van het weergeven van de beschikbare plaatsen. Op basis van de presentatie van Ralf concludeer ik dat de 
berekening in de Query uitgevoerd moet worden. Dit wil ik vrijdag navragen bij Ralf.*/