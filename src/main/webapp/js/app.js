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

app.controller('InteretsCtrl', function($scope, $http) {
    $http.get('/api/Interets').success(function(listeInteret) {
        $scope.listeInteret = listeInteret;
    });
    
app.controller('SexeCtrl', function($scope) {
	$scope.options = ['Homme', 'Femme'];
});
    
    $scope.filtre = function(genre,interets) {
    	$http.get("/api/Personne/"+genre+"/"+interets).success(function(listeUtilisateur) {
            $scope.listeUtilisateur = listeUtilisateur;
        });
    };
});

app.config(function($routeProvider) {
                    $routeProvider.
                      when('/ShowProfile', {
                        templateUrl: 'templates/profile.html',
                        controller: 'SearchingController'
                    }).
                    when('/FilterListe', {
                      templateUrl: 'templates/listeFiltre.html',
                      controller: 'SearchingController'
                    }).
                    otherwise({
                        redirectTo: '/'
                      });
});


app.controller('SearchingController', function($scope, $http, $routeParams) {
    $http.get("/api/Personne/"+$routeParams.genre+"/"+$routeParams.centreInteret).success(function(listeUtilisateur) {
        $scope.listeUtilisateur = listeUtilisateur;
    });
});
