$(document).ready(function() {

	/*$("h1").click(function() {
	      $(this).css("background-color","red");
	});*/
	
	/*$("h1").mousedown(function() {
	      $(this).css("background-color","red");
	});
	$("h1").mouseup(function() {
	      $(this).css("background-color","yellow");
	});*/
	
	/*$("h1").mouseenter(function() {
	      $(this).css("background-color","red");
	});
	$("h1").mouseleave(function() {
	      $(this).css("background-color","yellow");
	});
	*/
	
	/*$("h1").mouseenter(function() {
	      $(this).css("background-color","red");
	});
	$("h1").mouseleave(function() {
	      $(this).css("background-color","yellow");
	      $(this).unbind();
	});*/
	
	/*$("h1").mouseenter(function() {
	      $(this).css("background-color","red");
	});
	$("h1").mouseleave(function() {
	      $(this).css("background-color","yellow");
	     $("*").unbind(); 
	});*/
	
	/*$("h1").mouseenter(function() {
	      $(this).css("background-color","red");
	});
	$("h1").mouseleave(function() {
	      $(this).css("background-color","yellow");
	     $("*").unbind("mouseleave"); 
	});*/
	
	$("h1").mouseenter(function() {
	      $(this).css("background-color","red");
	      $("*").unbind("mouseenter"); 
	});
	$("h1").mouseleave(function() {
	      $(this).css("background-color","yellow");
	     
	});
	
});