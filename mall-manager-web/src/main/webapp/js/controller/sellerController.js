//控制层
app.controller("sellerController",function ($scope,$controller,sellerService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.seller={};
    }
    $scope.updateInit=function(id){
        sellerService.queryById(id).success(function(data){
            $scope.seller=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        sellerService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.sellerList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        sellerService.save($scope.seller).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        sellerService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});