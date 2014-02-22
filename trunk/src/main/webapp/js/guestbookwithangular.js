var trombi = angular.module('trombi', ['ngRoute','ngResource','controllers']);


var controllers = angular.module('controllers', []);

//the controller definition
var guestbookwithangularCtrl = function($scope, $routeParams) {
	$scope.title = "Mouhahahaha";
	$scope.id = $routeParams.id;
	
	if(!$scope.$$phase) { //this is used to prevent an overlap of scope digestion
		$scope.$apply(); //this will kickstart angular to recognize the change
	}
}


var signCtr = function($scope, $routeParams) {
	alert("hey!");
	 $scope.submit = function() {
		    if (this.content) {
		      alert(this.content);
		      this.content = '';
		    }
		  };
}


trombi.controller('guestbookwithangularCtrl', ['$scope', '$routeParams',guestbookwithangularCtrl]);
trombi.controller('signCtr', ['$scope', '$routeParams',signCtr]);


// definir la route
trombi.config(['$routeProvider', function($routeProvider) {
	$routeProvider.
	when('/guestbookwithangular',{
		  controller : 'Ctrl',
		  templateUrl : 'jsp/guestbook.jsp'
	}).
	when('/guestbookwithangular/:id',{
		  controller : 'Ctrl',
		  templateUrl : 'jsp/guestbook.jsp'
	}).
	when('/sign',{
		  controller : 'signCtr',
		  templateUrl : 'jsp/guestbook.jsp'
	}).
	otherwise({
	        redirectTo: '/guestbookwithangular'
	      });
}]);