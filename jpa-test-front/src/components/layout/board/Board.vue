<template>
  <v-container>
    <v-simple-table>
        <thead>
          <tr>
            <th class="text-left">
              No
            </th>
            <th class="text-left">
              Title
            </th>
            <th class="text-left">
              Content
            </th>
            <th class="text-left">
              Writer
            </th>
            <th>
              Date
            </th><th>
              Like
            </th>
          </tr>
        </thead>
        <tbody>
          <tr
            v-for="(list,i) in lists"
            :key="i"
          >
            <td @click="move(list.bno)">{{ list.bno }}</td>
            <td @click="move(list.bno)">{{ list.title }}</td>
            <td @click="move(list.bno)">{{ list.content }}</td>
            <td @click="move(list.bno)">{{ list.writer}}</td>
            <td @click="move(list.bno)">{{ list.writeDate}}</td>
            <td>
              <v-btn
                class="primary"
                x-small>
                <v-icon>mdi-heart</v-icon>
              </v-btn>
            </td>
          </tr>
        </tbody>
    </v-simple-table>
  </v-container>

</template>

<script>
export default {
  name: 'Board',
  data: () => ({
    lists: [],
    icon: 'mdi-search'
  }),
  beforeCreate () {
    let page = this.$route.query.page

    if (page === null || page === '') {
      page = '1'
    }
    // eslint-disable-next-line no-undef
    axios.get('/api/board', { params: { page: page, size: 10, sort: 'bno,desc' } })
      .then(res => {
        this.lists = res.data.content
      }).catch(err => {
        console.log(err)
      })
  },
  methods: {
    move (bno) {
      this.$router.push('/board/' + bno).catch(err => { console.log(err) })
    }
  }
}
</script>

<style scoped>

</style>
