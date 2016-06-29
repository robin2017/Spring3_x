//对象定义为：函数集合,各个函数结束要添加逗号，否则调用失败
var EventUtils={
	//函数定义如下
	//函数名：function(形参){}
	addHandler:function(element,type,handler){
			element.addEventListener(type,handler);
	},
	getEvent:function(event){
		return event;
	},
	getTarget:function(event){
		return event.target;
	}
}