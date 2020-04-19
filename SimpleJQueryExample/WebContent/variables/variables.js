$(document).ready(function() {
  
	/*var htext = "This is just some text";
  
	$("h1").click(function(){
	   	$("p").text(htext);
	});
	*/
	
	/*var htext = $("#head1").text();
	  
	$("h1").click(function(){
	   	$("p").text(htext);
	});*/
	
	/*var htext = $("#head1").text();
	var text1= "This us heading text is ";
	var text2= text1 + htext;
	$("h1").click(function(){
	   	$("p").text(text2);
	});*/
	
	/*var htext = "This is heading text is " + $("#head1").text();
	$("h1").click(function(){
	   	$("p").text(htext);
	});*/
	
	/*var lineNum = 2;
	$("h1").click(function(){
	   	$("p").eq(lineNum).css("background-color","red");
	});*/
	
	/*var lineNum = 2;
	var aNum = 5;
	lineNum = aNum - 4;
	$("h1").click(function(){
	   	$("p").eq(lineNum).css("background-color","red");
	});
	*/
	
	/*var lineNum = 1;
	$("h1").click(function(){
	   	$("p").css("background-color","yellow");
	   	$("p").eq(lineNum).css("background-color","red");
	   $("p").eq(++lineNum).css("background-color","red");
	});*/
	/*var lineNum = 2;
	$("h1").click(function(){
	   	$("p").css("background-color","yellow");
	   	$("p").eq(lineNum).css("background-color","red");
	   $("p").eq(--lineNum).css("background-color","red");
	});*/
	
	/*var lineNum = 0;
	$("h1").click(function(){
	   	$("p").css("background-color","yellow");
	   	$("p").eq(lineNum).css("background-color","red");
	   lineNum++;
	   if(lineNum > 2)
	   {
		   lineNum = 0;
		   
	   }
	});*/
	
	
	/*var imageName = ["1.jpg","2.jpg","3.jpg"];
	var indexNum = 0;
	$("img").click(function(){
	   	$("#picture").attr("src",imageName[indexNum]);
	   	indexNum++;
	   	if(indexNum > 2)
	   	{
	   		indexNum=0;
	   	}
	});
	*/
	
	var imageName = ["1.jpg","2.jpg","3.jpg"];
	var indexNum = 0;
	$("#picture").click(function(){
	   	$("#picture").fadeOut(300,function(){
	   		$("#picture").attr("src",imageName[indexNum]);
	   		indexNum++;
	   		if(indexNum > 2)
	   		{
	   			indexNum=0;	
	   		}
	   		
	   	$("#picture").fadeIn(500);	
	   		
	   	});
	});
	
	
	
});