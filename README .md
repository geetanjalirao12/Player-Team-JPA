Given five files,

- `PlayerController.java`
- `PlayerRepository.java`
- `PlayerJpaService.java`
- `PlayerJpaRepository.java`
- `Player.java`

And also given a database file `cricketteam` which contains `TEAM` table.

#### TEAM Table

|   Columns    |  Type   |
| :----------: | :-----: |
|   playerId   | INTEGER |
|  playerName  |  TEXT   |
| jerseyNumber | INTEGER |
|     role     |  TEXT   |

<MultiLineNote>

Use only `team` as the table name in both query writing and in the model class within your code.

</MultiLineNote>

### Completion Instructions

- `Player.java`: The `Player` class should contain the following attributes.

    |  Attribute   |  Type  |
    | :----------: | :----: |
    |   playerId   |  int   |
    |  playerName  | String |
    | jerseyNumber |  int   |
    |     role     | String |

- `PlayerRepository.java`: Create an `interface` containing the required methods.
- `PlayerJpaService.java`: Update the service class with logic for managing player data.
- `PlayerController.java`: Create the controller class to handle HTTP requests.
- `PlayerJpaRepository.java`: Create an interface that implements the `JpaRepository` interface.
  

Implement the following APIs.

### API 1

#### Path: `/players`

#### Method: `GET`

#### Description:

Returns a list of all players in the `team`.

#### Response

```
[
    {
        "playerId": 1,
        "playerName": "Alexander",
        "jerseyNumber": 5,
        "role": "All-rounder"
    },
   ...
]
```

### API 2

#### Path: `/players`

#### Method: `POST`

#### Description:

Creates a new player in the `team`. The `playerId` is auto-incremented.

#### Request

```
{
  "playerName": "Prince",
  "jerseyNumber": 24,
  "role": "Bowler"
}
```

#### Response

```
{
    "playerId": 12,
    "playerName": "Prince",
    "jerseyNumber": 24,
    "role": "Bowler"
}
```

### API 3

#### Path: `/players/{playerId}`

#### Method: `GET`

#### Description:

Returns a player based on the `playerId`. If the given `playerId` is not found in the `team`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.


#### Success Response

```
{
    "playerId": 1,
    "playerName": "Alexander",
    "jerseyNumber": 5,
    "role": "All-rounder"
}
```

### API 4

#### Path: `/players/{playerId}`

#### Method: `PUT`

#### Description:

Updates the details of a player in the team based on the `playerId` and returns the updated player details.
If the given `playerId` is not found in the `team`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Request

```
{
    "playerName": "Yuvi"
    "jerseyNumber": 12,
    "role": "All-rounder"
}
```

#### Success Response

```
{
    "playerId": 3,
    "playerName": "Yuvi",
    "jerseyNumber": 12,
    "role": "All-rounder"
}
```

### API 5

#### Path: `/players/{playerId}`

#### Method: `DELETE`

#### Description:

Deletes a player from the team  based on the `playerId`.
If the given `playerId` is not found in the `team`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`. 


**Do not modify the code in `PlayerApplication.java`**

**Do not  modify anything in the `application.properties` file**

**Do not add any SQL files**
