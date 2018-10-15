// service层,与数据库交互
app.service("sellerService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../seller/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (seller) {
        return $http.post("../seller/save",seller);
    }

    this.remove=function (idList) {
        return $http.get("../seller/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../seller/queryById?id="+id);
    }

    this.register=function (seller) {
        return $http.post("../seller/register",seller);
    }
});