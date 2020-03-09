 var P1 = prompt("Rock, Paper, or Scissors");
 var P2 = prompt("Rock, Paper, or Scissors");

var Mygame = function(p1,p2){
    var r = "Rock";
    var p = "Paper";
    var s = "Scissors";
    if(p1 === p2){
        console.log("No winner, Match Tie");
    }else{
        if(p1===r&&p2===s||p1===p&&p2===r||p1===s&&p2===p){
            console.log("P1 is the winner!!!!");
        }else{
            console.log("P2 is the winner!!!!");
        }
    }
};

Mygame(Player1,Player2);
