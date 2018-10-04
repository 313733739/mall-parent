//控制层
app.controller("typeTemplateController",function ($scope,$controller,typeTemplateService,brandService,specificationService) {
    //继承
    $controller("baseController",{$scope:$scope});
    //初始化
    $scope.addInit=function(){
        $scope.typeTemplate={customAttributeItems:[]};
    }
    $scope.updateInit=function(id){
        typeTemplateService.queryById(id).success(function(data){
            $scope.typeTemplate=data;

            $scope.typeTemplate.brandIds=JSON.parse($scope.typeTemplate.brandIds);
            $scope.typeTemplate.specIds=JSON.parse($scope.typeTemplate.specIds);
            $scope.typeTemplate.customAttributeItems=JSON.parse($scope.typeTemplate.customAttributeItems);
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

    //获取下拉框数据
    //防止ajax异步导致为空，声明一个空的
    $scope.brandList={data:[]};
    $scope.specificationList={data:[]}
    $scope.getOptionList=function () {
        brandService.getOptionList().success(function(data){
            $scope.brandList={data:data};
        });
        specificationService.getOptionList().success(function(data){
            $scope.specificationList={data:data};
        });
    }

    //新增行表
    $scope.addRow=function(){
        $scope.typeTemplate.customAttributeItems.push({});
    }
    //删除行表
    $scope.deleteRow=function(index){
        $scope.typeTemplate.customAttributeItems.splice(index,1);
    }
});