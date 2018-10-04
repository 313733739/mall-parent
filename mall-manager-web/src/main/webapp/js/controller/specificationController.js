//控制层
app.controller("specificationController",function ($scope,$controller,specificationService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.specification={"rows":[]};
    }
    $scope.updateInit=function(id){
        specificationService.queryById(id).success(function(data){
            $scope.specification=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        specificationService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.specificationList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        specificationService.save($scope.specification).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        specificationService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }

    //新增行表
    $scope.addRow=function(){
        $scope.specification.rows.push({});
    }
    //删除行表
    $scope.deleteRow=function(index){
        console.log($scope.specification.rows);
        $scope.specification.rows.splice(index,1);
    }
});