<p align="center">
	<img alt="logo" src="https://via.placeholder.com/120x120?text=EA">
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">EnterpriseAdmin v3.9.2</h1>
<h4 align="center">基于SpringBoot+Vue前后端分离的Java快速开发框架</h4>
<p align="center">
	<a href="https://github.com/Zz-pig/enterprise-admin/stargazers"><img src="https://github.com/Zz-pig/enterprise-admin/badge/star.svg?theme=dark"></a>
	<a href="https://github.com/Zz-pig/enterprise-admin"><img src="https://img.shields.io/badge/EnterpriseAdmin-v3.9.2-brightgreen.svg"></a>
	<a href="https://github.com/Zz-pig/enterprise-admin/blob/master/LICENSE"><img src="https://img.shields.io/github/license/mashape/apistatus.svg"></a>
</p>

## 平台简介

企业后台管理是一套全部开源的快速开发平台

* 前端采用Vue、Element UI。
* 后端采用Spring Boot、Spring Security、Redis & Jwt。
* 权限认证使用Jwt，支持多终端认证系统。
* 支持加载动态权限菜单，多方式轻松权限控制。
* 高效率开发，使用代码生成器可以一键生成前后端代码。

# 版本分支

EnterpriseAdmin-Vue 后端项目提供 Spring Boot 2.x / 3.x / 4.x 多版本分支的并行维护。

| 名称              | 说明                      | 地址                                                    |
| :---------------- | :------------------------ | :------------------------------------------------------ |
| master 默认分支   | Spring Boot 4.x (JDK 17+) | https://github.com/Zz-pig/enterprise-admin                   |
| springboot3 分支  | Spring Boot 3.x (JDK 17+) | https://github.com/Zz-pig/enterprise-admin/tree/springboot3  |
| springboot2 分支  | Spring Boot 2.x (JDK 8+)  | https://github.com/Zz-pig/enterprise-admin/tree/springboot2  |  

EnterpriseAdmin-Vue 前端项目提供 Vue 2.x / 3.x / JavaScript TypeScript 版本均可混用搭配

| 项目名称      | **EnterpriseAdmin-Vue** | **EnterpriseAdmin-Vue3** | **EnterpriseAdmin-Vue3-TypeScript**   |
| :---          | :---          | :---           | :---                        |
| **前端框架**  | Vue 2        | Vue 3          | Vue 3                       |
| **脚本语言**  | JavaScript   | JavaScript     | TypeScript                  |
| **构建工具**  | Vue CLI      | Vite           | Vite                        |
| **UI 组件库** | Element UI   | Element Plus   | Element Plus                |
| **状态管理**  | Vuex         | Pinia          | Pinia                       |
| **路由管理**  | Vue Router 3 | Vue Router 4   | Vue Router 4                |
| **核心特点**  | 1. 技术栈经典稳定<br>2. 社区资料丰富<br>3. 当前维护重心已转移 | 1. 现代前端技术栈<br>2. 开发体验与性能更优<br>3. 官方主推的活跃版本 | 1. 类型加持，减少沟通成本<br>2. 开发时有提示，效率更高<br>3. 多人协作企业级开发项目 |
| **仓库地址**  | [EnterpriseAdmin-Vue](https://github.com/Zz-pig/enterprise-admin) | [EnterpriseAdmin-Vue3](https://gitcode.com/yangzongzhuan/EnterpriseAdmin-Vue3) | [EnterpriseAdmin-Vue3-TypeScript](https://gitcode.com/yangzongzhuan/EnterpriseAdmin-Vue3/tree/typescript) |

## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 缓存监控：对系统的缓存信息查询，命令统计等。
17. 在线构建器：拖动表单元素生成相应的HTML代码。
18. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 演示图

<table>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/cd1f90be5f2684f4560c9519c0f2a232ee8.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/1cbcf0e6f257c7d3a063c0e3f2ff989e4b3.jpg"/></td>
    </tr>
    <tr>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
    </tr>
    <tr>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
    </tr>
	<tr>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
    </tr>	 
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/5e8c387724954459291aafd5eb52b456f53.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/644e78da53c2e92a95dfda4f76e6d117c4b.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
    </tr>
	<tr>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/b6115bc8c31de52951982e509930b20684a.jpg"/></td>
        <td><img src="https://via.placeholder.com/120x120?text=EA"/></td>
    </tr>
</table>


