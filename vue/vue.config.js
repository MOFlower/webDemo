module.exports = {
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:1234',
                changOrigin: true,  
                pathRewrite: {
                    '^/api': ''
                }
            },
        }
    },
}