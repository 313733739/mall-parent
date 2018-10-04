//控制层
app.controller("userController",function ($scope,$controller,userService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.user={};
    }
    $scope.updateInit=function(id){
        userService.queryById(id).success(function(data){
            $scope.user=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        userService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.userList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        userService.save($scope.user).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        userService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});