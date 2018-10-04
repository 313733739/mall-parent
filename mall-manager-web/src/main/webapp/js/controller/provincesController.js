//控制层
app.controller("provincesController",function ($scope,$controller,provincesService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.provinces={};
    }
    $scope.updateInit=function(id){
        provincesService.queryById(id).success(function(data){
            $scope.provinces=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        provincesService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.provincesList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        provincesService.save($scope.provinces).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        provincesService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});