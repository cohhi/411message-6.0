//实现数据库的连接
let mysql = require("mysql")

let connection = mysql.createConnection({
    host:"localhost",//连接本机
    port:3306,//数据库端口
    user:"root",//账号
    password:"123456",
    database:"user"//连接的数据库s
});

//调用connect连接
connection.connect((message)=>{
    if(message){
        console.log("连接失败:"+message.stack);//打印堆栈信息
        return;
    }
    console.log("连接成功")
})

connection.end();//断开数据库连接