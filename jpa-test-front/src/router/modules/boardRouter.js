import Vue from 'vue'
import VueRouter from 'vue-router'
import BoardView from '@/views/BoardView'
import BoardDetail from '@/components/layout/board/BoardDetail'

Vue.use(VueRouter)

export default [
  {
    path: '/board',
    component: BoardView,
    children: [
      {
        path: '',
        component: () => import(/* webpackChunkName: "board" */ '@/components/layout/board/Board')
      },
      {
        path: 'chat',
        name: 'Chat',
        component: () => import(/* webpackChunkName: "chat" */ '@/components/layout/Chat')
      },
      {
        path: 'board-detail/:bno',
        name: 'BoardDetail',
        component: BoardDetail
      },
      {
        path: ':page',
        component: () => import(/* webpackChunkName: "board-page" */ '@/components/layout/board/Board')
      }
    ]
  }
]
