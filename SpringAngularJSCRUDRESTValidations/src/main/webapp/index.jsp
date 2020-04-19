<!DOCTYPE html>
<!-- Declares the root element that allows behaviour to be modified through Angular custom HTML tags. -->
<html ng-app="persons">
<head>
<title></title>
<script src="https://code.angularjs.org/1.4.5/angular.js"></script>
<!--<script src="https://code.angularjs.org/1.4.5/angular.min.js"></script>  -->
<script src="https://code.angularjs.org/1.4.5/angular-resource.js"></script>
<!-- <script src="https://code.angularjs.org/1.4.5/angular-resource.min.js"></script> -->
<script src="./static/js/jquery-1.9.1.js"></script>
<script src="./static/js/ui-bootstrap-0.10.0.min.js"></script>
<script src="./static/js/ui-bootstrap-tpls.js"></script>
<script src="./static/js/ng-grid.min.js"></script>
<script src="./static/js/person.js"></script>

<link rel="stylesheet" type="text/css"
	href="./static/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="./static/css/ng-grid.min.css" />
<link rel="stylesheet" type="text/css" href="./static/css/style.css" />

</head>

<body>

	<br>
	<!-- Specify a JavaScript controller script that binds Javascript variables to the HTML.-->
	<div class="grid" ng-controller="personsListController">
		<div>
			<h3>List Persons</h3>
		</div>
		<!-- Binds the grid component to be displayed. -->
		<div class="gridStyle" ng-grid="gridOptions"></div>

		<!--  Bind the pagination component to be displayed. -->
		<pagination direction-links="true" boundary-links="true"
			total-items="persons.totalResults" items-per-page="persons.pageSize"
			ng-model="persons.currentPage" ng-change="refreshGrid()">
		</pagination>
	</div>
	<div ng-controller="personsFormController" class="form">
		<!-- Verify person, if there is no id present, that we are Adding a Person -->
		<div ng-if="person.id == null">
			<h3>Add Person</h3>
		</div>
		<!-- Otherwise it's an Edit -->
		<div ng-if="person.id != null">
			<h3>Edit Person</h3>
		</div>
		<!-- Specify the function to be called on submit and disable HTML5 validation, since we're using Angular validation-->
		<form name="personForm" ng-submit="updatePerson()" noValidate>
			<!-- Display an error if the input is invalid and is dirty (only when someone changes the value) -->
			<div class="form-group"
				ng-class="{'has-error' : personForm.name.$invalid && personForm.name.$dirty}">
				<label for="name">Name:</label>
				<!-- Display a check when the field is valid and was modified -->
				<span
					ng-class="{'glyphicon glyphicon-ok' : personForm.name.$valid && personForm.name.$dirty}"></span>
				<input id="name" name="name" type="text" class="form-control"
					maxlength="50" ng-model="person.name" required ng-minlength="2"
					ng-maxlength="50" />
				<!-- Validation messages to be displayed on required, minlength and maxlength -->
				<p class="help-block" ng-show="personForm.name.$error.required">Add
					Name.</p>
				<p class="help-block" ng-show="personForm.name.$error.minlength">Name
					must be at least 2 characters long.</p>
				<p class="help-block" ng-show="personForm.name.$error.maxlength">Name
					cannot be longer than 50 characters.</p>
			</div>

			<!-- Display an error if the input is invalid and is dirty (only when someone changes the value) -->
			<div class="form-group"
				ng-class="{'has-error' : personForm.description.$invalid && personForm.description.$dirty}">
				<label for="description">Description:</label>
				<!-- Display a check when the field is valid and was modified -->
				<span
					ng-class="{'glyphicon glyphicon-ok' : personForm.description.$valid && personForm.description.$dirty}"></span>

				<input id="description" name="description" type="text"
					class="form-control" maxlength="100" ng-model="person.description"
					required ng-minlength="5" ng-maxlength="100" />

				<!-- Validation messages to be displayed on required, minlength and maxlength -->
				<p class="help-block"
					ng-show="personForm.description.$error.required">Add
					Description.</p>
				<p class="help-block"
					ng-show="personForm.description.$error.minlength">Description
					must be at least 5 characters long.</p>
				<p class="help-block"
					ng-show="personForm.description.$error.maxlength">Description
					cannot be longer than 100 characters.</p>
			</div>

			<!-- Display an error if the input is invalid and is dirty (only when someone changes the value) -->
			<div class="form-group"
				ng-class="{'has-error' : personForm.imageUrl.$invalid && personForm.imageUrl.$dirty}">
				<label for="imageUrl">Image URL:</label>
				<!-- Display a check when the field is valid and was modified -->
				<span
					ng-class="{'glyphicon glyphicon-ok' : personForm.imageUrl.$valid && personForm.imageUrl.$dirty}"></span>

				<input id="imageUrl" name="imageUrl" type="url" class="form-control"
					maxlength="500" ng-model="person.imageUrl" required />

				<!-- Validation messages to be displayed on required and invalid. Type 'url' makes checks to a proper url format. -->
				<p class="help-block" ng-show="personForm.imageUrl.$error.required">Add
					Image URL.</p>
				<p class="help-block"
					ng-show="personForm.imageUrl.$invalid && personForm.imageUrl.$dirty">Invalid
					Image URL.</p>
			</div>

			<div class="avatar" ng-if="person.imageUrl">
				<img ng-src="{{person.imageUrl}}" width="400" height="250" />
			</div>

			<!-- Form buttons. The 'Save' button is only enabled when the form is valid. -->
			<div class="buttons">
				<button type="button" class="btn btn-primary" ng-click="clearForm()">Clear</button>
				<button type="submit" class="btn btn-primary"
					ng-disabled="personForm.$invalid">Save</button>
			</div>
		</form>
	</div>
	</div>
	<!-- Specify a Angular controller script that binds Javascript variables to the feedback messages.-->
	<div class="message" ng-controller="alertMessagesController">
		<alert ng-repeat="alert in alerts" type="{{alert.type}}"
			close="closeAlert($index)">{{alert.msg}}</alert>
	</div>
</body>
</html>
