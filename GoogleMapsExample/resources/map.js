   	
function updateAddress(address) {
	geocoder.getLatLng(address, function(location) {
		map.setCenter(location, 13);
		var marker = new google.maps.Marker(location);
		map.addOverlay(marker);
		marker.openInfoWindowHtml(getAddressInfo(address));
		
		latField.value = location.lat();
		lngField.value = location.lng();
	});
}

function getAddressInfo(address) {
	return address + "<br><a href=\"http://www.myeclipseide.com\">Powered by MyEclipse IDE</a>";
}
