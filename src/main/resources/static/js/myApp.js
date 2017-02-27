/**
 * Created by naoufal on 26/02/2017.
 */

var app=angular.module("myApp",['ui.router']);
app.config(function($stateProvider,$urlRouterProvider){

    $stateProvider.state("produits",{
        url:"/allProduits",
        templateUrl:"views/produits.html",
        controller:"produitController"
    });
    $stateProvider.state("categories",{
        url:"/categories",
        templateUrl:"views/categories.html",
        controller:"categorieController"
    });
    $urlRouterProvider.otherwise("produits");

});
app.controller("categorieController",function($scope,$url){

});
app.controller("produitController",function($scope,$http){
    $scope.pageProduits=null;
    $scope.page=0;
    $scope.size=5;
    $scope.name="";
    $scope.pages=null;
    $scope.chercher=function(){
        $http.get("http://localhost:8080/findProduits?mc="+$scope.name+"&page="+$scope.page+
            "&size="+$scope.size)
            .then(function(data){$scope.pageProduits=data.data;console.log(data);
                    $scope.pages=new Array(data.data.totalPages);
            },function(result){console.log(result)});

    };
    $scope.gotoPage=function(p){
        $scope.page=p;
        $scope.chercher();
    }

});

