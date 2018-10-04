// service层,与数据库交互
app.service("citiesService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../cities/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (cities) {
        return $http.post("../cities/save",cities);
    }

    this.remove=function (idList) {
        return $http.get("../cities/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../cities/queryById?id="+id);
    }
});