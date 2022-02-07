import MainView from '@/views/MainView'

// const routes = [
//
//
//   // route level code-splitting
//   // this generates a separate chunk (about.[hash].js) for this route
//   // which is lazy-loaded when the route is visited.
//   // component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
//
// ]

export default [
  {
    path: '/',
    name: 'MainView',
    component: MainView,
    children: [
      {
        path: '/',
        name: 'Main',
        component: () => import(/* webpackChunkName: "main" */ '@/components/layout/Main')
      }
    ]
  }
]
