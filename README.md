# Loops

Here I revisit and practice the Java Fundamentals that I previously learned at Zip Code Wilmington coding bootcamp:

- Using for loops - to run code a specific number of times
- Using while loops - to run code as long as something is true
- Using continue keyword - to skip a run and continue to next one
- Using break keyword - to break out of a loop
- How nested loops run

In the end, I complete TWO projects "Pokerito!" and "BlackJack", which test what I've learned about Loops.

I also build small series of apps to practice what I learn on the way, which can be found here:
<a href="https://github.com/ReiCode28/Java-Section-5-Recap" title="">Loops Recap</a>

# Pokerito!

An interactive app where a user can play Pokerito! It's almost like poker, but the rules much simpler:

- The dealer will give you one card
- And the computer one card
- Then, the dealer will draw five cards (the river)
- The player with the most matches wins. If the matches are equal, everyone's a winner!

# BlackJack

A simple, interactive version of the popular game BlackJack where a player plays against the dealer.

<b>Logic for starting the game:</b>

- The dealer gives the player two cards face up
- The dealer also starts with two cards. 
- But only one of the dealers cards is face up, the other is facedown

<b>Logic for playing the game</b> 

- Player draws first and can decide whether to hit or stay.
- "Hit" = draw another card || "stay" = do nothing
- If the player decides to hit, and their hand value exceeds 21, they go bust(lose). 
- Once player decides to stay, the dealer reveals the hidden facedown card.
- Then the dealer must "hit" until dealer total = 17. If it is greater than 17, the dealer's turn ends.
- Player wins if their hand value is higher than the dealer's hand.
- Player also wins if dealer goes bust(exceeds 21)
- Dealer wins if hand value is higher than the player
