// service层,与数据库交互
app.service("brandService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../brand/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (brand) {
        return $http.post("../brand/save",brand);
    }

    this.remove=function (idList) {
        return $http.get("../brand/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../brand/queryById?id="+id);
    }
});