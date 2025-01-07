//print 1 to 10 but with delay of 1sec
//after each number gets printed.

for(let i=1;i<=10;i++){
    setTimeout(function(){
     console.log(i);
    },i*1000);
}

for(let i=1;i<=10;i++){
    setTimeout(function(){
       console.log(11-i);
       console.log(Math.random());
    },i*200)
}

setTimeout(function(){
  console.log("aur bhaii kya haal")
},5*1000)
