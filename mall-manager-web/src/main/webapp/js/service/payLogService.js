// service层,与数据库交互
app.service("payLogService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../payLog/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (payLog) {
        return $http.post("../payLog/save",payLog);
    }

    this.remove=function (idList) {
        return $http.get("../payLog/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../payLog/queryById?id="+id);
    }
});