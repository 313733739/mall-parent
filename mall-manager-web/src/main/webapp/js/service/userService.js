// service层,与数据库交互
app.service("userService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../user/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (user) {
        return $http.post("../user/save",user);
    }

    this.remove=function (idList) {
        return $http.get("../user/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../user/queryById?id="+id);
    }
});