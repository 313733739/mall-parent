//控制层
app.controller("frightTemplateController",function ($scope,$controller,frightTemplateService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.frightTemplate={};
    }
    $scope.updateInit=function(id){
        frightTemplateService.queryById(id).success(function(data){
            $scope.frightTemplate=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        frightTemplateService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.frightTemplateList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        frightTemplateService.save($scope.frightTemplate).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        frightTemplateService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});