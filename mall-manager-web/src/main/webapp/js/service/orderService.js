// service层,与数据库交互
app.service("orderService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../order/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (order) {
        return $http.post("../order/save",order);
    }

    this.remove=function (idList) {
        return $http.get("../order/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../order/queryById?id="+id);
    }
});