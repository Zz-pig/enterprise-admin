<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <!-- 左侧：项目介绍 -->
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>后台管理系统</h2>
        <p>
          本系统是基于 Spring Boot + MyBatis 构建的企业级后台管理平台，采用前后端分离架构，
          实现了 RBAC 权限控制、JWT 登录鉴权、Redis 缓存、操作日志、定时任务等通用能力，
          可作为各类 Web 应用（管理后台、CMS、CRM、OA 等）的基础框架进行二次开发。
        </p>
        <p>
          <b>当前版本:</b> <span>v{{ version }}</span>
        </p>
        <p>
          <el-tag type="success">Spring Boot</el-tag>
          <el-tag type="primary" style="margin-left: 8px">MyBatis</el-tag>
          <el-tag type="warning" style="margin-left: 8px">Redis</el-tag>
          <el-tag type="danger" style="margin-left: 8px">Vue</el-tag>
        </p>
      </el-col>

      <!-- 右侧：技术选型 -->
      <el-col :sm="24" :lg="12" style="padding-left: 50px">
        <el-row>
          <el-col :span="12">
            <h2>技术选型</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>后端技术</h4>
            <ul>
              <li>Spring Boot</li>
              <li>Spring Security</li>
              <li>JWT</li>
              <li>MyBatis</li>
              <li>Druid</li>
              <li>Redis</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>前端技术</h4>
            <ul>
              <li>Vue</li>
              <li>Vuex</li>
              <li>Element-ui</li>
              <li>Axios</li>
              <li>Sass</li>
              <li>Quill</li>
              <li>...</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>

    <el-divider />

    <!-- 核心功能模块 -->
    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>权限管理</span>
          </div>
          <div class="body">
            <ul>
              <li>用户管理：系统操作用户的配置</li>
              <li>角色管理：角色菜单权限分配</li>
              <li>菜单管理：配置系统菜单与按钮权限</li>
              <li>部门管理：配置组织机构（公司、部门）</li>
              <li>岗位管理：配置用户所属岗位</li>
            </ul>
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>系统监控</span>
          </div>
          <div class="body">
            <ul>
              <li>操作日志：记录正常与异常操作</li>
              <li>登录日志：记录用户登录信息</li>
              <li>在线用户：监控活动用户状态</li>
              <li>定时任务：在线调度任务（Quartz）</li>
              <li>缓存监控：查询 Redis 缓存信息</li>
            </ul>
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>系统工具</span>
          </div>
          <div class="body">
            <ul>
              <li>参数配置：动态配置常用系统参数</li>
              <li>数据字典：维护常用固定数据枚举</li>
              <li>通知公告：系统通知公告发布</li>
              <li>代码生成：一键生成增删改查代码</li>
              <li>接口文档：自动生成 API 文档</li>
            </ul>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "1.0.0"
    }
  }
}
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    padding: 0;
    margin: 0;
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ul {
      li {
        line-height: 26px;
      }
    }
  }
}
</style>
