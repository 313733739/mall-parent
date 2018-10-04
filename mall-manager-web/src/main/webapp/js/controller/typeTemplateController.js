//控制层
app.controller("typeTemplateController",function ($scope,$controller,typeTemplateService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.typeTemplate={};
    }
    $scope.updateInit=function(id){
        typeTemplateService.queryById(id).success(function(data){
            $scope.typeTemplate=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        typeTemplateService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.typeTemplateList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        typeTemplateService.save($scope.typeTemplate).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        typeTemplateService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});