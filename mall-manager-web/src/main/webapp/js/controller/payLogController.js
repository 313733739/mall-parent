//控制层
app.controller("payLogController",function ($scope,$controller,payLogService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.payLog={};
    }
    $scope.updateInit=function(id){
        payLogService.queryById(id).success(function(data){
            $scope.payLog=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        payLogService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.payLogList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        payLogService.save($scope.payLog).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        payLogService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});