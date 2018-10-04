// service层,与数据库交互
app.service("contentService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../content/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (content) {
        return $http.post("../content/save",content);
    }

    this.remove=function (idList) {
        return $http.get("../content/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../content/queryById?id="+id);
    }
});