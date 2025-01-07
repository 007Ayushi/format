function loggedIn(username){
    if(username===undefined){
        console.log(`my name is ${username}`);
        return
    }
    return `${username} just logged in`
}
console.log(loggedIn("ayushi"));//my name is undefined //undefined