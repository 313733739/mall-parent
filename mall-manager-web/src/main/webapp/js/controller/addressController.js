//控制层
app.controller("addressController",function ($scope,$controller,addressService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.address={};
    }
    $scope.updateInit=function(id){
        addressService.queryById(id).success(function(data){
            $scope.address=data;
        });
    }
    //查询
    $scope.query=function (pageNum,pageSize) {
        addressService.query(pageNum,pageSize,$scope.condition).success(function (data) {
            $scope.addressList=data.rows;
            $scope.pageConf.totalItems=data.total;
        });
    }
    //新增&修改
    $scope.save=function () {
        addressService.save($scope.address).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
    //批量删除
    $scope.remove=function(){
        addressService.remove($scope.idList).success(function (data) {
            if(data.success){
                $scope.reloadList();
            }else{
                alert(data.message);
            }
        });
    }
});