// service层,与数据库交互
app.service("itemCatService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../itemCat/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (itemCat) {
        return $http.post("../itemCat/save",itemCat);
    }

    this.remove=function (idList) {
        return $http.get("../itemCat/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../itemCat/queryById?id="+id);
    }
});