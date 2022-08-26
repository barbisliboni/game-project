# game-project

## How does it work?
**game-project** is a REST API responsible for creating, updating, reading and deleting games. 
Before running the project on the IDE, run the terminal command ```docker-compose up``` to run the postgres image file. 

## Methods
**GET /games/{id}**

**POST /games**
```
{
    "name": "Grand Theft Auto V",
    "pcOnly": false,
    "releaseYear": 2013,
    "price": 120.00,
    "genre": "Action"
}
```
**PUT /games**
```
{
    "name": "Grand Theft Auto V",
    "pcOnly": false,
    "releaseYear": 2013,
    "price": 120.00,
    "genre": "Action"
}
```
**DELETE /games/{id}**
### Arguments

**id:** game id <br>
**name:** game name <br>
**pcOnly:** if the game is available only for personal computers <br>
**releaseYear:** the year the game was released <br>
**price:** game price <br>
**genre:** game genre <br>

### Examples

http://localhost:8080/games/1
