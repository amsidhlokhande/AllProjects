$(document).ready(function() {

	/*$("h1").click(function(){
		$("h2").hide(1000);
	}); 
	*/
	/*$("h1").click(function(){
		$("h2").hide(1000);
	});
	$("h1").click(function(){
		$("h2").show(1000);
	});*/ 
	
	/*$("h2").hide();
	$("h1").click(function(){
		$("h2").show(1000);
	});*/
	
	/*$("h2").hide();
	$("h1").click(function(){
		$("h2").toggle(1000);
	});*/
	
	
	/*$("h1").click(function(){
		$("h2").slideUp(1000);
	});*/
	
	/*$("h2").hide();
	$("h1").click(function(){
		$("h2").slideDown(5000);
	});*/
	
	/*$("h2").hide();
	$("h1").click(function(){
		$("h2").slideToggle(1000);
	});*/
	
	/*
	$("h1").click(function(){
		$("h2").fadeOut(1000);
	});*/
	
	/*$("h2").hide();
	$("h1").click(function(){
		$("h2").fadeIn(1000);
	});*/
	
	/*$("h2").hide();
	$("h1").click(function(){
		$("h2").fadeToggle(1000);
	});*/
	
	
	/*$("h1").click(function(){
		$("h2").fadeTo(1000,0.3);
	});*/
	
	/*$("h1").click(function(){
		$("h2").delay(2000).fadeToggle(1000);
	});*/
	
	$("h1").click(function(){
		$("h2").hide(1000,function() {
			
			$("h3").fadeOut(1000);
		});
	});
});