//控制层
app.controller("specificationOptionController",function ($scope,$controller,specificationOptionService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.specificationOption={};
    }
    $scope.updateInit=function(id){
        specificationOptionService.queryById(id).success(function(data){
            $scope.specificationOption=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        specificationOptionService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.specificationOptionList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        specificationOptionService.save($scope.specificationOption).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        specificationOptionService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});