# Checkmate_FunnyChessGame
Knight vs King Checkmate Challenge

      ====================
***** Helping your friend: *****
      ====================

One of your friends is playing this funny chess game and he/she needs your help knowing that you're a software engineer. He/she wants you to tell him/her all the possible moves/jumps of the knight. Your friend also wants to know if the king is in check from the static position of the knight.

Now assume that in a funny chess play we have only 2 pieces, knight and the king. The king and knight stay at a static position (but not in the same position) and can not move at all.

      ==========
***** The Board: ******
      ==========

The chess board has 8 rows and 8 columns. The coordinate of a piece i.e knight, the king can be denoted as a {row number, column number}.

For example, in the first diagram, the coordinate of the black horse is {4,1} and the white horse is {6,5}

      =============
***** Sample input: *****
      =============

You will be provided two String, one is the king's coordinate and one for the knight.

[String one:]  x, y

[String two:] x, y

WHERE:  8>= x and y >=1

      ==============
***** Sample output: *****
      ==============

The possible moves of the knight: {3,3}, {5,3}, {2,3}, {6,2}

Checkmate possible - Yes or No
