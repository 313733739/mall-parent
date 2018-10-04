//控制层
app.controller("citiesController",function ($scope,$controller,citiesService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.cities={};
    }
    $scope.updateInit=function(id){
        citiesService.queryById(id).success(function(data){
            $scope.cities=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        citiesService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.citiesList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        citiesService.save($scope.cities).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        citiesService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});