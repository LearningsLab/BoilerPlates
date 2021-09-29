### Design a Snake-Ladder Game

## Requirements
- Players shall be able to play the game with snakes and ladder on a board having 100 cells.
- Game ends when 1 player is left
- Dice gives the number uniformly in any range.
- 
## Future Scope to add fishes in board
- We may add fishes on board in future

## Translation into Objects
- GAme has a Board,multiple Players and Dice. 
  - Game has rules.
  - Game knows the turn of a player
  - Game has a winner
- Board has cells.
- cells may or may not have objects like snake/ladder/fishes.
- Player has a symbl.
  - we can have an AiPlayer
  - We can have Human Players
- Dice behavior has to be uniform for all the numbers being generated.


## Class Diagram Walk Through
1. Board and cells need to be built.
2. Since cells are of different type we are using factory pattern to generate different cells.
3. Players are of different type we are using factory pattern to generate different players.
4. Building a player is done using builder pattern.


### ClassDiangram
[Link](https://github.com/mkumar9009/BoilerPlates/blob/main/Snake%26Ladder.drawio.png)
<img src="https://github.com/mkumar9009/BoilerPlates/blob/main/Snake%26Ladder.drawio.png?raw=true" >

### Code 
[Link](https://github.com/mkumar9009/BoilerPlates/tree/main/SnakeLadder)