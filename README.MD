#Je bent net begonnen als developer bij een bedrijf genaamd Tech It Easy, dat TV's verkoopt. Tijdens de cursus Spring Boot ga jij een backend applicatie programmeren voor het bedrijf. De winkel heeft een inventaris van televisies die moet worden bijgehouden. Na iedere les gaan we deze applicatie een stukje verder uitbouwen door middel van de huiswerkopdrachten. Zo krijg je stap-voor-stap meer ervaring in het bouwen van een backend applicatie. Aan het einde van de cursus zullen we een werkende Tech It Easy backend applicatie hebben!
#Opdrachtbeschrijving

###Je gaat via de Spring Boot Initialzr een project aanmaken, waarbij je gebruikmaakt van de volgende dependency:

    Spring Web

#Gedurende de cursus Spring Boot zal het langzamerhand duidelijk worden waarom je deze dependency nodig hebt. Voor nu mag je dit gewoon van ons aannemen!
##Randvoorwaarden

#De opdracht moet voldoen aan de volgende voorwaarden:

    Het project bevat, op de juiste plaats in de map-structuur, een map genaamd controllers;
    Het project bevat, op de juiste plaats in de map-structuur, een map genaamd exceptions;
    Het project bevat een TelevisionsController;
    Het project bevat een ExceptionController;
    Het project bevat een RecordNotFoundException;
    De TelevisionsController bevat:
        een GET-request voor alle televisies
        een GET-request voor 1 televisie
        een POST-request voor 1 televisie
        een PUT-request voor 1 televisie
        een DELETE-request voor 1 televisie
    De ExceptionController bevat:
        een exceptionhandler
    De RecordNotFoundException bevat:
        een default exception
        een exception met message

#Belangrijk

#Bij het inleveren van deze opdracht is de applicatie nog niet geheel functioneel, omdat we hier meer kennis over andere technieken voor nodig hebben die later in de cursus aan bod komt.

#Je mag de volgende ResponseEntiteiten als return waardes gebruiken:

    ResponseEntiteit.ok("television")
    ResponseEntiteit.created(null).body("television")
    ResponseEntiteit.noContent().build()


#Let op: het is uitdagender om jouw eigen stappenplan te maken. Mocht je niet zo goed weten waar je moet beginnen, kun je onderstaand stappenplan volgen:

    Zet een nieuw project op via Spring Boot Initialzr genaamd TechItEasy.
    Maak een nieuwe map aan in je project genaamd controllers.
    Maak een nieuwe map aan in je project genaamd exceptions.
    Maak een nieuwe klasse aan in de map controllers voor de TelevisionController.
    Voorzie de klasse van de juiste annotatie.
    Maak in de klasse de (in de randvoorwaarden) gevraagde requests aan met de juiste response entities.
    Maak een nieuwe klasse aan in de map controllers voor de ExceptionController.
    Voorzie de klasse van de juiste annotatie.
    Maak in de klasse een exceptionHandler met de juiste notatie en response entitiy.
    Maak een nieuwe klasse aan in de map exceptions.
    Extent de klasse met de RunTimeException.
    Vul de klasse aan aan de hand van het voorbeeld in hoofdstuk 3.4 van de cursus Spring Boot.
