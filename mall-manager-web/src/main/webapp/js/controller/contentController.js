//控制层
app.controller("contentController",function ($scope,$controller,contentService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.content={};
    }
    $scope.updateInit=function(id){
        contentService.queryById(id).success(function(data){
            $scope.content=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        contentService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.contentList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        contentService.save($scope.content).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        contentService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});