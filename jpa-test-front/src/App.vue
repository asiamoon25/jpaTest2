<template>
  <v-app>
    <!-- header -->
    <default-header/>
    <!-- header -->

    <v-main>
     <router-view/>
    </v-main>

    <!-- footer -->
    <default-footer/>
    <!-- footer -->
  </v-app>
</template>

<script>

import DefaultHeader from '@/components/default/DefaultHeader'
import DefaultFooter from '@/components/default/DefaultFooter'

export default {
  name: 'App',
  components: { DefaultFooter, DefaultHeader },
  data: () => ({
    //
  })
}
</script>
