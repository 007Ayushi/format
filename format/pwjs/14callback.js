//callback function is that function 
//which pass inside a function

//callback function ek esa function hota hai
//jo ek function ke andar pass hota hai

function product(a,b,c){
    return a*b*c;
}
function fun(x,y){
    let a=x(1,2,3);
    console.log(a-y);
}
fun(product,7);