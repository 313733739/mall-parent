// service层,与数据库交互
app.service("addressService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../address/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (address) {
        return $http.post("../address/save",address);
    }

    this.remove=function (idList) {
        return $http.get("../address/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../address/queryById?id="+id);
    }
});