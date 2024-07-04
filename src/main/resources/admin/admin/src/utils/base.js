const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooteuw84/",
            name: "springbooteuw84",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooteuw84/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社团管理系统"
        } 
    }
}
export default base
