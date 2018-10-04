// service层,与数据库交互
app.service("orderItemService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../orderItem/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (orderItem) {
        return $http.post("../orderItem/save",orderItem);
    }

    this.remove=function (idList) {
        return $http.get("../orderItem/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../orderItem/queryById?id="+id);
    }
});