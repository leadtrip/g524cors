/*
grails {
    cors {
        enabled = true
        allowedHeaders = 'Content-Type'
        mappings {
            '/word/googleOnly' {            // the / are stripped from the path so this doesn't work
                allowedOrigins = ['https://www.google.com']
            }
            '/word/anywhere' {
                allowedOrigins = ['*']
            }
        }
    }
}*/
