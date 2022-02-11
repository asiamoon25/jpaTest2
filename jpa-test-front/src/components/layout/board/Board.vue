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
    <v-pagination
      v-model="page"
      :length="length"
      total-visible="7"
      @input="pageMove(page)"
    />
  </v-container>

</template>

<script>
export default {
  name: 'Board',
  data: () => ({
    lists: [],
    length: 0,
    page: 1
  }),
  beforeCreate () {
    let page = this.$route.params.page

    if (page === null || page === '') {
      page = '1'
    }
    // eslint-disable-next-line no-undef
    axios.get('/api/board', { params: { page: page, size: 10, sort: 'bno,desc' } })
      .then(res => {
        this.lists = res.data.content
        this.length = res.data.content.length
        this.page = parseInt(page)
      }).catch(err => {
        console.log(err)
      })
  },
  methods: {
    move (bno) {
      this.$router.push('/board/board-detail/' + bno).catch(err => { console.log(err) })
    },
    pageMove (page) {
      const pageNo = page - 1
      // eslint-disable-next-line no-undef
      axios.get('/api/board', { params: { page: pageNo, size: 10, sort: 'bno,desc' } })
        .then(res => {
          this.lists = res.data.content
          this.length = res.data.totalPages
          this.$router.push('/board/' + page).catch(err => err)
        }).catch(err => {
          console.log(err)
        })
    }
  }
}
</script>

<style scoped>

</style>
