var app = angular.module('bam', ['ngRoute']);
app.config(function($routeProvider, $locationProvider){
	$locationProvider.html5Mode(false).hashPrefix('');
	$routeProvider.when("/",{
		templateUrl: "static/pages/login.html",
		controller: 'loginCtl'
	}).when("/batchesAll",{
		templateUrl:"static/pages/batchesAll.html",
		controller: "batchesAllCtr"
	}).when("/register",{
		templateUrl: "static/pages/register.html",
		controller: "registerCtrl"
	}).when("/home",{
		templateUrl: "static/pages/calendar.html"
	}).when("/associates",{
		templateUrl: "static/pages/ViewAssociates.html",
		controller: "associatesController"
	}).when("/update",{
		templateUrl: "static/pages/update.html",
		controller: "updateAssociateCtrl"
	}).when("/reset",{
		templateUrl: "static/pages/reset.html"
	}).when("/batchesPast",{
		templateUrl: "static/pages/batchesPast.html",
		controller: "batchesPast"
	}).when("/batchesFuture",{
		templateUrl: "static/pages/batchesFuture.html",
		controller: "batchesFuture"
	}).when("/editBatch", {
		templateUrl: "static/pages/EditBatch.html",
		controller: "editBatchController"
	}).when("/noBatch",{
		templateUrl: "static/pages/NoBatch.html"
	}).otherwise({redirectTo: '/'});
});
