// service层,与数据库交互
app.service("specificationService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../specification/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (specification) {
        return $http.post("../specification/save",specification);
    }

    this.remove=function (idList) {
        return $http.get("../specification/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../specification/queryById?id="+id);
    }
});