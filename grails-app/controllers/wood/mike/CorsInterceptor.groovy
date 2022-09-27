package wood.mike


class CorsInterceptor {

    CorsInterceptor() {
        matchAll()
    }

    boolean before() {
        log.info('CorsInterceptor fired')
        if ("OPTIONS" == request.method) {
            log.info('options request recieved')
            header( "Access-Control-Allow-Origin", "*" )
            header( "Access-Control-Allow-Credentials", "true" )
            header( "Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE")
            header( "Access-Control-Max-Age", "3600" )

            response.status = 200
        }
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
