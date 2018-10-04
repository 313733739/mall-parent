//控制层
app.controller("goodsController",function ($scope,$controller,goodsService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.goods={};
    }
    $scope.updateInit=function(id){
        goodsService.queryById(id).success(function(data){
            $scope.goods=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        goodsService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.goodsList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        goodsService.save($scope.goods).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        goodsService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});