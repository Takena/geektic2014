var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});


app.controller('PersonneCtrl', function($scope, $http) {
    $http.get('/api/Personne').success(function(listeUtilisateur) {
        $scope.listeUtilisateur = listeUtilisateur;
    });
});

angular.module('ui.bootstrap.demo').controller('PopoverDemoCtrl', function ($scope) {
	  $scope.dynamicPopover = {
	    content: 'Hello, World!',
	    templateUrl: 'myPopoverTemplate.html',
	    title: 'Title'
	  };
	});