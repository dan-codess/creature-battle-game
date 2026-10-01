# Pokémon Ga-Olé

A turn-based, text-based Pokémon battle game written in Java. Built as a
university Object-Oriented Programming assignment.

## Gameplay

1. Your starting collection is loaded from `pokemon_collection.txt`.
2. Three wild Pokémon appear at random from a predefined roster — you catch one.
3. You pick up to two Pokémon from your collection to take into battle.
4. Battles are turn-based: damage is scaled by a type-effectiveness chart
   (super effective ×2, not very effective ×0.5).
5. A score is calculated at the end and the top five scores persist to
   `top_scores.txt`.

Scoring starts at a 10,000-point base, subtracts 10 points per turn taken, and
adds 50 points per wild Pokémon captured, floored at zero.

## Project structure

| File | Responsibility |
|---|---|
| `PokemonGame.java` | Entry point and game loop |
| `Pokemon.java` | Core Pokémon entity — stats, attacking, taking damage |
| `WildPokemon.java` | Catchable wild variant, extends `Pokemon` |
| `Player.java` | Player's collection, save/load to file |
| `Battle.java` | Turn-based battle resolution |
| `PokeBall.java` | Ball types (Poké/Great/Ultra/Master) and catch rates |
| `TypeEffectiveness.java` | Type matchup multiplier chart |
| `PokemonList.java` | Predefined Pokémon roster |
| `ScoreManager.java` | Score calculation and top-five persistence |

## Running it

Requires a JDK (developed against JDK 22).

```sh
javac -d bin src/*.java
cd bin && java PokemonGame
```

Run from the directory containing `pokemon_collection.txt` so the collection
loads — or copy that file next to the compiled classes.

The project also imports directly into Eclipse (`.classpath` and `.project` are
included), with `src` as the source folder and `bin` as output.

## Data files

- `pokemon_collection.txt` — your starting Pokémon, one per line as
  `name,hp,defenderType,moveType,movesetType`
- `top_scores.txt` — written by the game, holds the top five scores
