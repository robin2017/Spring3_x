//������Ϊ����������,������������Ҫ��Ӷ��ţ��������ʧ��
var EventUtils={
	//������������
	//��������function(�β�){}
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