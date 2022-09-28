package wood.mike


class CorsInterceptor {

    CorsInterceptor() {
        matchAll()
    }

    boolean before() {
        logRequest()

        header( "Access-Control-Allow-Origin", "*" )
        boolean options = ("OPTIONS" == request.method)
        if (options) {
            log.info("Adding OPTIONS headers")
            header( "Access-Control-Allow-Origin", "*" )
            header( "Access-Control-Allow-Credentials", "true" )
            header( "Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE")
            header( "Access-Control-Max-Age", "3600" )

            response.status = 200
        }

        true
    }

    def logRequest() {
        log.info("****************************** ${request.method} - ${request.getHeader('referer')} ******************************")
        request.getHeaderNames().each {
            log.info("$it - ${request.getHeader(it)}")
        }
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
