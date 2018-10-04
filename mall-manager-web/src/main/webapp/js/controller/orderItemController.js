//控制层
app.controller("orderItemController",function ($scope,$controller,orderItemService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.orderItem={};
    }
    $scope.updateInit=function(id){
        orderItemService.queryById(id).success(function(data){
            $scope.orderItem=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        orderItemService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.orderItemList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        orderItemService.save($scope.orderItem).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        orderItemService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});