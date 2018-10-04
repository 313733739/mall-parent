// service层,与数据库交互
app.service("contentCategoryService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../contentCategory/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (contentCategory) {
        return $http.post("../contentCategory/save",contentCategory);
    }

    this.remove=function (idList) {
        return $http.get("../contentCategory/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../contentCategory/queryById?id="+id);
    }
});