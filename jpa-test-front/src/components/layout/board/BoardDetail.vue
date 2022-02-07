<template>
<div v-bind="list">
  {{list.mbrNo}}
  {{list.name}}
  {{list.id}}
</div>
</template>

<script>
export default {
  name: 'BoardDetail',
  data: () => ({
    list: []
  }),
  beforeCreate () {
    const mbrNo = this.$route.params.mbrNo
    // eslint-disable-next-line no-undef
    axios.get('/api/board-detail', { params: { mbrNo: mbrNo } })
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
