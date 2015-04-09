function check() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	if(num1==""||num2==""){
		window.alert("请输入内容");
		return false;
	}
	
	if(isNaN(num1)||isNaN(num2)){
		window.alert("格式不正确");
		return false;
	}
}