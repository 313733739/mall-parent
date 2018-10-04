//控制层
app.controller("itemCatController",function ($scope,$controller,itemCatService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.itemCat={};
    }
    $scope.updateInit=function(id){
        itemCatService.queryById(id).success(function(data){
            $scope.itemCat=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        itemCatService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.itemCatList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        itemCatService.save($scope.itemCat).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        itemCatService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});