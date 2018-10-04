//控制层
app.controller("goodsDescController",function ($scope,$controller,goodsDescService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.goodsDesc={};
    }
    $scope.updateInit=function(id){
        goodsDescService.queryById(id).success(function(data){
            $scope.goodsDesc=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        goodsDescService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.goodsDescList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        goodsDescService.save($scope.goodsDesc).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        goodsDescService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});