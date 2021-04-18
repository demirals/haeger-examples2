# quarkus-userservice 

Die UserService-Applikation ist ein kleiner REST-Service, der CRUD-Operationen für eine Benutzerverwaltung anbietet. Ein Benutzer (User-Objekt) besitzt die folgenden Attribute: id, userName, firstName, lastName, email, password.

Dieses Projekt nutzt Quarkus als technologische Basis: https://quarkus.io/ .

Ids sind eindeutig und werden von der DB erzeugt. 

Die Applikation benutzt eine Datei-basierte H2-Datenbank und ist derzeit so konfiguriert, dass sie erzeugt
wird wenn keine vorhanden ist. Bestehende Inhalte bleiben nicht erhalten.

Die Anwendung lauscht auf den Port 8080. Somit sind die Endpunkte sind unter der Adresse **http://localhost:8080/users**
erreichbar.

## Starten der Anwendung im DEV-Modus

Man kann die Anwendung in einem DEV-Modus starten, welcher Live-Coding am gestarteten Objekt ermöglicht:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Sonstiges
Die Endpunkte liefern und erwarten JSON-Daten (Content-Type: application/json)

## Implementierte Endpunkte
* GET http://localhost:8080/users
* GET http://localhost:8080/users/{id}
* POST http://localhost:8080/users
* DELETE http://localhost:8080/users


