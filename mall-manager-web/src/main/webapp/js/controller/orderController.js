//控制层
app.controller("orderController",function ($scope,$controller,orderService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.order={};
    }
    $scope.updateInit=function(id){
        orderService.queryById(id).success(function(data){
            $scope.order=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        orderService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.orderList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        orderService.save($scope.order).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        orderService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});