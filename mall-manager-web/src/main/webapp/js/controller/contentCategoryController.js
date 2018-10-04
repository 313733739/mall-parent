//控制层
app.controller("contentCategoryController",function ($scope,$controller,contentCategoryService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.contentCategory={};
    }
    $scope.updateInit=function(id){
        contentCategoryService.queryById(id).success(function(data){
            $scope.contentCategory=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        contentCategoryService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.contentCategoryList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        contentCategoryService.save($scope.contentCategory).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        contentCategoryService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});