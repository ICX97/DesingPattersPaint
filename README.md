## Opis zahteva za projekat iz predmeta Dizajnerski obrasci
Korišćenjem *Java Swing* implementirati desktop aplikaciju za rad sa 2D grafikom. Aplikacija mora podržavati funkcionalnosti koje su rađene u projektnom zadatku na predmetu Objektno orijentisane informacione tehnologije.
Izmene/Dodatne funkcionalnosti:
1. crtanje oblika različitim bojama (boja ivice i boja unutrašnjosti) za šta je potrebno koristiti *JColorChooser* klasu,
2. unutrašnjost oblika krug sa rupom treba da bude transparentna (java.awt.Graphics2D, java.awt.Shape, java.awt.geom.Area, java.awt.geom.Ellipse2D),
3. nazivi klasa, metoda i promenljivih moraju biti na engleskom jeziku,
4. aplikacija mora biti realizovan u skladu sa MVC arhitektonskim obrascem,
5. dodavanje, brisanje i modifikacija šestougla (hexagon) koristeći Adapter obrazac za hexagon.jar,
6. poništavanje izvršenih komandi (*undo* funkcionalnost) – *Command* i *Prototype* obrazac, ponovno izvršenje poništenih komandi (*redo* funkcionalnost) – *Command* i *Prototype* obrazac, *undo* i *redo* dugme treba da budu dostupni samo kada je dostupna i funkcionalnost,
7. generisanje i prikaz loga izvršenih komandi u okviru aplikacije,
8. zapis u tekstualnu datoteku loga izvršenih komandi na eksterni memorijski medijum, zapis kompletnog crteža (*Serialization*) na eksterni memorijski medijum, - *Strategy* obrazac,
9. učitavanje tekstualne datoteke koja sadrži log izvršenih komandi i na osnovu sadržaja, kreiranje odgovarajućeg crteža, komandu po komandu u interakciji sa korisnikom, učitavanje kompletnog crteža,
10. promenu pozicije oblika po Z osi, *To Front* (pozicija po pozicija), *To Back* (pozicija po pozicija), *Bring To Front* (na najvišu poziciju), *Bring To Back* (na najnižu poziciju),
11. prikazati trenutno aktivne boje za crtanje ivice i popunjavanje oblika, klikom na boju, otvara se dijalog sa mogućnošću promene trenutno aktivne boje,
12. omogućiti selekciju više oblika,
13. dugme za brisanje treba da bude dostupno samo u slučaju da postoje selektovani objekti – *Observer* obrazac,
14. dugme za modifikaciju treba da bude dostupan samo u slučaju kada je selektovan samo jedan oblik – *Observer* obrazac.
