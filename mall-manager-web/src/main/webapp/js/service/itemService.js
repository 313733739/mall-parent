// service层,与数据库交互
app.service("itemService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../item/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (item) {
        return $http.post("../item/save",item);
    }

    this.remove=function (idList) {
        return $http.get("../item/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../item/queryById?id="+id);
    }
});