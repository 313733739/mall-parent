//控制层
app.controller("areasController",function ($scope,$controller,areasService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.areas={};
    }
    $scope.updateInit=function(id){
        areasService.queryById(id).success(function(data){
            $scope.areas=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        areasService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.areasList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        areasService.save($scope.areas).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        areasService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});