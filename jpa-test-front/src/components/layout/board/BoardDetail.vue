<template>
<div v-bind="list">
  {{list.bno}}
  {{list.title}}
  {{list.content}}
  {{list.writer}}
  {{list.writeDate}}
</div>
</template>

<script>
export default {
  name: 'BoardDetail',
  data: () => ({
    list: []
  }),
  beforeCreate () {
    const bno = this.$route.params.bno
    // eslint-disable-next-line no-undef
    axios.get('/api/board-detail', { params: { bno: bno } })
      .then(res => {
        this.list = res.data.list
      })
      .catch(err => {
        console.log(err)
      })
  }
}
</script>

<style scoped>

</style>
