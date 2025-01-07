//Getter Setter and Stack Overflow
class User{
    constructor(email,password){
        this.email=email;
        this.password=password;
    }
    get email(){
        return  this._email.toLowerCase();
    }
    set email(value){
        this._email=value;
    }

    // You are directly assigning to this._email instead
    //  of this.email. This avoids triggering the setter again because
    //   _email is treated as a separate property
    
    get password(){
        //return this._password.toUpperCase();//12ABS
        return `${this._password}ayushi`
    }
    set password(value){
        this._password=value;//_password is just like private property
    }

}
const ayushi=new User("411@ai","12abs");
// console.log(ayushi.password);
// console.log(ayushi.email);

//when we set a variable many times as not the required,then Maximum call Stack size exceeded.
//constuctor is also setting value and setter() also sets the value,so the stack size is exceeded.


//DEFINING GETTER AND SETTER through properties
function user1(email,password){
    this._email=email;
    this._password=password;
    Object.defineProperty(this,'email',{
        get:function(){
            return this._email.toUpperCase()
        },
        set:function(value){
            this._email=value
        }
    });


    Object.defineProperty(this,'password',{
        get:function(){
            return this._password.toUpperCase()
        },
        set:function(value){
            this.password=value
        }
    });
}

const ayu=new user1("ayushichai@ai","122")
//console.log(ayu.email);


//function is function and object both.


//object based getters and setters(99% chance h yhi milega)
const user={
    _email:'210ayushi@gmail.com',
    _password:"abc",
    get email(){//getter and setter special method hai wo jo property ke upar rkh rhe hai
        return this._email.toUpperCase()//_ defines private property not in normal property
    },
    set email(value){
             this._email=value
    }
}

const tea=Object.create(user)
console.log(tea.email);




