function onChangeSelect(){
	var select=document.getElementById("mainSelect").value;

	url=select+".html";
	
	var xhr=null;
	if(window.XMLHttpRequest){
		xhr=new XMLHttpRequest();
	}else{
		xhr=new ActiveXObject("Microsoft.XMLHTTP");
	}
	

	xhr.onreadystatechange=function(){
		//这里是ready，不是read，失误！！！
		if(xhr.readyState==4)
			document.getElementById("subSelect").innerHTML=xhr.responseText;
	}
	xhr.open("post",url,true);
	xhr.send(null);
	
}