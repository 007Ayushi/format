//Falsy values:->false condition,false,0
//truthy values->everything except falsy values
//every number except 0 are considered as true
if(NaN){
  console.log("hello");//truthy
}
else console.log("mello");//falsy

//null,undefined,NaN->mello
//'null' ,"null",'0'->hello
console.log(typeof a);//undefined
console.log(typeof NaN)//number