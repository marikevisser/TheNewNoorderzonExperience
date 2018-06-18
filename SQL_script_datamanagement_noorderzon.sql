/* Met deze query kan data toegevoegd worden aan de database. 
Het betreft hier input van de organisator aangaande de gegevens van exposanten.
De gegevens tussen de komma moeten gegenereerd worden vanuit gebruikers input via (bijvoorbeeld) de JAVA-scanner*/
INSERT INTO exposanten_data VALUES (/*naam,genre,locatie*/);

/*Input van de data betreffende de dagen en tijdstippen van optreden.
De foreign-key in deze tabel is "naam" vanuit "exposanten_data"*/
INSERT INTO agenda_data VALUES (/*tijd,dag,naam*/);

/*Input van de data van de gebruikers*/
-- deze is nog Under construction
INSERT INTO user_data VALUES (/**/);
