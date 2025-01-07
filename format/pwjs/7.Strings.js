let a="Ayushi"
console.log(a,a.length);

//console.log(a[0]);A

//for loop
for(let i=0;i<a.length;i++){
  console.log(a.charAt(i));
}

//forOf
for(let ele of a){
    console.log(ele);
}
//forEach doesn't work on strings TypeError: Cannot read properties of undefined (reading 'forEach')
// a.array.forEach(element => {
//     console.log(element)
// });
