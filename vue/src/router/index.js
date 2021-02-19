import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: '/introduction'
  },
  {
    path: '/introduction',
    component: () => import('../views/Introduction.vue'),
  },
  {
    path: '/',
    component: () => import('../components/Home.vue'),
    children: [
      {
        path: '/userhome',
        component: () => import('../views/UserHome.vue'),
      },
     {
       path: '/courses',
       component: () => import('../views/Courses.vue'),
     }

    ]
  }

]

const router = new VueRouter({
  routes
})

export default router
