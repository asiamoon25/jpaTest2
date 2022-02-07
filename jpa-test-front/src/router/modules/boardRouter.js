import Vue from 'vue'
import VueRouter from 'vue-router'
import BoardView from '@/views/BoardView'

Vue.use(VueRouter)

export default [
  {
    path: '/board',
    component: BoardView,
    children: [
      {
        path: '',
        component: () => import(/* webpackChunkName: "board" */ '@/components/layout/Board')
      },
      {
        path: 'chat',
        name: 'Chat',
        component: () => import(/* webpackChunkName: "chat" */ '@/components/layout/Chat')
      }
    ]
  }
]
