$(document).ready(function() {

	/*$("h1").click(function(){
		$("h2").animate({
		"font-size" : "3em"	
		},1000);
		
	});
	*/
	
	/*$("h1").click(function(){
		$("h2").animate({
		"font-size" : "3em",
		"width" : "50%"
		},1000);
		
	});*/
	
	/*$("h1").click(function(){
		$("h2").animate({
		"font-size" : "3em",
		"width" : "50%",
		"left" : "100px"
			
		},1000);
		
	});*/
	/*
	$("h1").click(function(){
		$("h2").animate({
		"font-size" : "3em",
		"width" : "50%",
		"left" : "+=100px"
			
		},1000);
		
	});*/
	

	/*$("h1").click(function(){
		$("h2").animate({
		"font-size" : "3em",
		"width" : "50%",
		"left" : "-=100px"
			
		},1000);
		
	});*/
	
	/*$("h1").click(function(){
		$("h2").animate({
		"font-size" : "hide",
		"width" : "50%",
		"left" : "-=100px"
			
		},1000);
		
	});*/
	
	/*$("h1").click(function(){
		$("h2").animate({
		"font-size" : "toggle",
		"width" : "50%",
		"left" : "+=100px"
			
		},1000);
		
	});*/
	
	$("h1").click(function(){
		$("h2").animate({
		"font-size" : "toggle",
		"width" : "50%",
		"left" : "+=100px"
			
		},1000,function() {
			
			$("h3").toggle(2000);
		});
		
	});
	
});