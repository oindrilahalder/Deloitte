function display()
{
	var num1 = prompt("enter first number:","12");
	var num2 = prompt("enter first number:","20");
	var result = parseInt(num1)+parseInt(num2); //convert into number
	alert("the sum of two numbers are:"+result);
}
function demo()
{
	var res = confirm("do you want to continue");
	if(res==true){
		alert("ok clicked");
	}
	else{
		alert("cancel clicked");
	}
}
function displaygreetings(msg)
{
	if(msg==null)
		msg="good night";
	alert(msg);
}