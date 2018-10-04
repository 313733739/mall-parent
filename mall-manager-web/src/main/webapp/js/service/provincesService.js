// service层,与数据库交互
app.service("provincesService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../provinces/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (provinces) {
        return $http.post("../provinces/save",provinces);
    }

    this.remove=function (idList) {
        return $http.get("../provinces/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../provinces/queryById?id="+id);
    }
});