
function hello(){
	var user = $('user').value;
	Hello.sayHello(user,callback);
}
function callback(msg){
	DWRUtil.setValue('result',msg);
}