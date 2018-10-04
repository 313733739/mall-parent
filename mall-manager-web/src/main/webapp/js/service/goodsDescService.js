// service层,与数据库交互
app.service("goodsDescService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../goodsDesc/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (goodsDesc) {
        return $http.post("../goodsDesc/save",goodsDesc);
    }

    this.remove=function (idList) {
        return $http.get("../goodsDesc/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../goodsDesc/queryById?id="+id);
    }
});