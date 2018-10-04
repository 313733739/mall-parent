// service层,与数据库交互
app.service("areasService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../areas/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (areas) {
        return $http.post("../areas/save",areas);
    }

    this.remove=function (idList) {
        return $http.get("../areas/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../areas/queryById?id="+id);
    }
});