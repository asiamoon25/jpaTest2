import Vue from 'vue'
import VueRouter from 'vue-router'
import boardRouter from '@/router/modules/boardRouter'
import main from '@/router/modules/main'

Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    ...boardRouter,
    ...main
  ]
})

export default router
