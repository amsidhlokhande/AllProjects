$(document).ready(function() {

       
       $("p").hide();
	   
	   $("h1").click(function() {
	      $(this).next().slideToggle(300);
	      $("p:even").css("background-color","pink");
	      $("p:odd").css("background-color","yellow");
	   });


});