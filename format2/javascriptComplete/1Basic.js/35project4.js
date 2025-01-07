let randomNumber=parseInt(Math.random()*100+1);

const submit=document.querySelector('#subt');
const userInput=document.querySelector('#guessField');
const guessSlot=document.querySelector('.guesses');
const remaining=document.querySelector('.lastResult');
const lowOrHi=document.querySelector('.lowOrHi');

const startOver=document.querySelector('.resultParas');
const p=document.createElement('p')

let prevGuess=[]
let numGuess=1

let playGame=true

if(playGame){
    submit.addEventListener('click',function(e){
        e.preventDefault()//value ko khi ni leke jaana h
       const guess= parseInt(userInput.value)
       console.log(guess)
       validateGuess(guess)
    })
}

function validateGuess(guess){
    //it only validates that no is between 1 and 100.
    if(isNaN(guess)){
        alert('pls enter a valid number')
    }else if(guess<1){
        alert('pls enter a number more than 1')
    }else if(guess>100){
        alert('pls enter a valid number less than 100')
    }else{
        prevGuess.push(guess)
        if( numGuess === 11){
            displayGuess(guess)
            displayMessage(`game over. random number was ${randomNumber} `)
            endGame()
        }else{
            displayGuess(guess)
            checkGuess(guess)
        }
    }
}

function checkGuess(guess){
    //it checks the guess and tells that is it high or low in displayMessage()
    if(guess === randomNumber){
        displayMessage('you guessed it right')
        endGame()
    }else if(guess < randomNumber){
        displayMessage('Number is  too low')
    }
    else if(guess > randomNumber){
        displayMessage('Number is too high')
    }
}
function displayGuess(guess){
    //html and dom manipulation here cleanup() method
    userInput.value=''
    guessSlot.innerHTML+=` ${guess}, `;
    numGuess++;
    remaining.innerHTML=` ${11-numGuess} `;
}
function displayMessage(message){
   lowOrHi.innerHTML=`<h2>${message}</h2>`
}
function endGame(){
    userInput.value=''
    userInput.setAttribute('disabled','')//key value pairs hoga 
    p.classList.add('button')
    p.innerHTML=`<h2 id="newGame">Start new Game</h2>`
    startOver.appendChild(p) 
    playGame=false
    newGame();
}
function newGame(){
    const newGameButton=document.querySelector('#newGame')
    newGameButton.addEventListener('click',function(e){
        randomNumber=parseInt(Math.random()*100+1);
        prevGuess=[]
        guessSlot.innerHTML=''
        remaining.innerHTML=`${11-numGuess}`;
        userInput.removeAttribute('disabled')
        startOver.removeChild(p)
        playGame=true 
    })
}










