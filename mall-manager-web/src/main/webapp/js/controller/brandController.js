//控制层
app.controller("BrandController",function ($scope,$controller,brandService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.brand={};
    }
    $scope.updateInit=function(id){
        brandService.queryById(id).success(function(data){
            $scope.brand=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        brandService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.brandList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        brandService.save($scope.brand).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        brandService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});