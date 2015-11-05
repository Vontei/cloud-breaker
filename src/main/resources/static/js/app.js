/**
 * Created by nickmattei on 11/4/15.
 */

var app = angular.module("gibson", []);

    app.controller("hello", ["$scope",
        function($scope) {
        $scope.hai = "Hello World";
        $scope.bai = "Hey Bai";
        }
    ]);

