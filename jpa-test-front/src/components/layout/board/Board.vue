<template>
  <v-container>
    <v-simple-table>
        <thead>
          <tr>
            <th class="text-left">
              No
            </th>
            <th class="text-left">
              Id
            </th>
            <th class="text-left">
              Name
            </th>
          </tr>
        </thead>
        <tbody>
          <tr
            v-for="(item,i) in desserts"
            :key="i"
            @click="move(item.mbrNo)"
          >
            <td>{{ item.mbrNo }}</td>
            <td>{{ item.id }}</td>
            <td>{{ item.name }}</td>
          </tr>
        </tbody>
    </v-simple-table>
  </v-container>

</template>

<script>
export default {
  name: 'Board',
  data: () => ({
    desserts: []
  }),
  beforeCreate () {
    // eslint-disable-next-line no-undef
    axios.get('/api/board')
      .then(res => {
        this.desserts = res.data.list
      }).catch(err => {
        console.log(err)
      })
  },
  methods: {
    move (mbrNo) {
      this.$router.push('/board/' + mbrNo).catch(err => { console.log(err) })
    }
  }
}
</script>

<style scoped>

</style>
