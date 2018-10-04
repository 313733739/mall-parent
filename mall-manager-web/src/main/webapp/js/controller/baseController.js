app.controller("baseController",function ($scope) {
    //分页控件配置
    $scope.pageConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };
    //页面刷新，翻页
    $scope.reloadList=function(){
        $scope.idList=[];
        $scope.query($scope.pageConf.currentPage,$scope.pageConf.itemsPerPage);
    };

    //获取选中id集合
    $scope.idList=[];
    $scope.updateSelected=function($event,id){
        if($event.target.checked){
            $scope.idList.push(id);
        }else {
            var index=$scope.idList.indexOf(id);
            $scope.idList.splice(index,1);
        }
    }
});