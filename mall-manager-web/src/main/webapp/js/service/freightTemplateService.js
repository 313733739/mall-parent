// service层,与数据库交互
app.service("feightTemplateService",function($http){
    //BASE crud
    this.query=function(pageNum,pageSize,condition){
        return $http.post("../feightTemplate/query?pageNum="+pageNum+"&pageSize="+pageSize,condition);
    }

    this.save=function (feightTemplate) {
        return $http.post("../feightTemplate/save",feightTemplate);
    }

    this.remove=function (idList) {
        return $http.get("../feightTemplate/delete?idList="+idList);
    }

    this.queryById=function (id) {
        return $http.get("../feightTemplate/queryById?id="+id);
    }
});