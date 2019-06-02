## Blackjack Project
 

#### Skill Distillery Week 4 Homework

This project simulates a game of blackjack. In this version there is one deck of cards. There is one player, and the game takes the role of the dealer. Both the player and the dealer try to reach a value of their hand as close as possible to 21 without going over. 21 is considered to be "Blackjack." Going over 21 is considered a "Bust." It is possible for either player to win or lose, and they can both tie (if they both bust, both reach 21 or have equal values under 21.) During this game, the player may take a card or hold as long as they have not reached 21 or higher in their hand. In this game Aces are always high.

#### Technologies Used

Object-oriented design, while loops, collections, Arraylists, inheritance, an interface and associated methods.

#### Lessons Learned

This was a tough project! I would not have gotten through it without design help from Denise and extensive troubleshooting assistance from Jeremy, who worked very hard with everyone who asked.

I ended up regretting not pushing my code regularly or saving off a backup because I found that when I fixed one issue, I caused another one, and I wasn't always certain what I had changed. Some of the issues that came up:
- if the player pulled a 21 on the first round, they were still offered a choice to "hit me" or stay.
- when I fixed the above issue (by checking if the hand was at 21), I caused an issue where the player could not "hit me" more than once. This was tough to fix, and I ended up in endless loops a few times. I finally fixed it by checking the hand value every time before prompting the user to see if they wanted to take another card. (I had this in a variable which did not change value after adding a card...because that value was in another class and not returned to the app that called it.)
- I improved in my understanding of calling and instantiating objects with this project...however...
- I had a lot of difficulty in figuring out how to move values between classes. For example, initially when I showed cards, I always showed their points value instead of which actual card it was when either player pulled a face card.
- While I'm satisfied with the end result, it seems like this program might be too long, there are some unused lines of code, and a few scenarios where I would like to improve the output. For example, if the dealer wins, it's possible to have multiple messages saying so. Or none. I'd like to be more meticulous in this kind of thing.
- Overall, I'm glad it worked, and I learned a lot about moving values between classes and when to check if they had changed.

Note:
I have tested extensively, but it's possible I missed something and that there could be a scenario that works incorrectly. Also, I have some error checking for entering input, but it's not complete across the board. That is an area for improvement in subsequent programs.

#### UML Diagram
![Blackjack UML Diagram](BlackJackUML.jpg)
