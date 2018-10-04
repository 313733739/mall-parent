// service层,与数据库交互
app.service("typeTemplateService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../typeTemplate/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (typeTemplate) {
        return $http.post("../typeTemplate/save",typeTemplate);
    }

    this.remove=function (idList) {
        return $http.get("../typeTemplate/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../typeTemplate/queryById?id="+id);
    }
});