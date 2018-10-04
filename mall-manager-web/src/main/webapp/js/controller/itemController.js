//控制层
app.controller("itemController",function ($scope,$controller,itemService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.item={};
    }
    $scope.updateInit=function(id){
        itemService.queryById(id).success(function(data){
            $scope.item=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        itemService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.itemList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        itemService.save($scope.item).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        itemService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});