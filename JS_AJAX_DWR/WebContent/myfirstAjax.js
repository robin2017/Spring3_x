function onChangeSelect(){
	var select=document.getElementById("mainSelect").value;
	alert(select);
	url=select+".html";
	
	alert(url);
	var xhr=null;
	if(window.XMLHttpRequest){
		xhr=new XMLHttpRequest();
	}else{
		xhr=new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	xhr.open("post",url,true);
	xhr.send(null);
	xhr.onreadystatechange=function(){
		if(xhr.readState==4)
			document.getElementById("subSelect").innerHTML=xhr.responseText;
	}
	
}