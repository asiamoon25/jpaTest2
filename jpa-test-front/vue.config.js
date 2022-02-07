const target = 'http://localhost:3000'

module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    port: 8080,
    proxy: {
      '/api': {
        changeOrigin: true,
        target
      }
    }
  }
}
