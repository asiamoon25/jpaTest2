<template>
  <div
    class="mx-auto overflow-hidden mb-5"
  >
    <v-app-bar
      color="deep-purple"
      dark
      app
    >
      <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>

      <v-toolbar-title>Title</v-toolbar-title>
    </v-app-bar>

    <v-navigation-drawer
      v-model="drawer"
      absolute
      temporary
    >
      <v-list
        nav
        dense
      >
        <v-list-item-group
          v-model="group"
          active-class="deep-purple--text text--accent-4"
        >
          <v-list-item
          v-for="(category,i) in categories"
          :key="i"
          link
          :to="category.to"
          >
            <v-list-item-icon>
              <v-icon>{{category.icon}}</v-icon>
            </v-list-item-icon>
            <v-list-item-title>{{ category.title }}</v-list-item-title>
          </v-list-item>
        </v-list-item-group>
      </v-list>
    </v-navigation-drawer>
  </div>
</template>

<script>
export default {
  name: 'DefaultHeader',
  data: () => ({
    drawer: false,
    group: null,
    categories: [
      { icon: 'mdi-icon', title: 'Main', to: '/' },
      { icon: 'mdi-book', title: 'Board', to: '/board' }
    ]
  })
}
</script>
