// service层,与数据库交互
app.service("goodsService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../goods/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (goods) {
        return $http.post("../goods/save",goods);
    }

    this.remove=function (idList) {
        return $http.get("../goods/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../goods/queryById?id="+id);
    }
});