// service层,与数据库交互
app.service("specificationOptionService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../specificationOption/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (specificationOption) {
        return $http.post("../specificationOption/save",specificationOption);
    }

    this.remove=function (idList) {
        return $http.get("../specificationOption/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../specificationOption/queryById?id="+id);
    }
});