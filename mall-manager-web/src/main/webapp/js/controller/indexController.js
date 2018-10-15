app.controller("indexController",function ($scope,$controller,loginService) {
    $controller("baseController",{$scope:$scope});

    //显示用户名
    $scope.getUserName=function () {
        loginService.loginName().success(function (data) {
            $scope.userName=data.userName;
        });
    }
});