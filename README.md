# RockPaperScissors

Rock, paper and scissors is a old and nice game. It has basic rules. Rock is greater than scissors, scissors is greater than paper and paper is greater than rock. Rock, paper and scissors is move in this project.

I created a interface(IMove) and rock, paper, scissors classes are implementing IMove. 

I created two different gamer type as adult and child. They have different calculator. But they need to have same methods. So I created a abstract classes (GameCalculator) and then AdultGameCalculator and ChildGameCalculator are extends GameCalculator. GameCalculator has some abstract method and final method.  

Lastly, I created UserInterfaceTool class for get move from user and write something.
