import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jiarushetuan from '@/views/modules/jiarushetuan/list'
    import shetuanhuodong from '@/views/modules/shetuanhuodong/list'
    import jingfeixinxi from '@/views/modules/jingfeixinxi/list'
    import discussxinwenxinxi from '@/views/modules/discussxinwenxinxi/list'
    import discussshetuanxinxi from '@/views/modules/discussshetuanxinxi/list'
    import shetuanxinxi from '@/views/modules/shetuanxinxi/list'
    import shezhang from '@/views/modules/shezhang/list'
    import storeup from '@/views/modules/storeup/list'
    import discussshetuanhuodong from '@/views/modules/discussshetuanhuodong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import xinwenxinxi from '@/views/modules/xinwenxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/jiarushetuan',
        name: '加入社团',
        component: jiarushetuan
      }
      ,{
	path: '/shetuanhuodong',
        name: '社团活动',
        component: shetuanhuodong
      }
      ,{
	path: '/jingfeixinxi',
        name: '经费信息',
        component: jingfeixinxi
      }
      ,{
	path: '/discussxinwenxinxi',
        name: '新闻信息评论',
        component: discussxinwenxinxi
      }
      ,{
	path: '/discussshetuanxinxi',
        name: '社团信息评论',
        component: discussshetuanxinxi
      }
      ,{
	path: '/shetuanxinxi',
        name: '社团信息',
        component: shetuanxinxi
      }
      ,{
	path: '/shezhang',
        name: '社长',
        component: shezhang
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discussshetuanhuodong',
        name: '社团活动评论',
        component: discussshetuanhuodong
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
      ,{
	path: '/xinwenxinxi',
        name: '新闻信息',
        component: xinwenxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
