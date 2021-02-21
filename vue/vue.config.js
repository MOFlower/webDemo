module.exports = {
    devServer: {
        proxy: {
            '/api': {
                // target: 'http://moflowerlkh.top:80',
                target: 'http://localhost:80',
                changOrigin: true,  
                pathRewrite: {
                    '^/api': '/api'
                }
            },
        }
    },
}