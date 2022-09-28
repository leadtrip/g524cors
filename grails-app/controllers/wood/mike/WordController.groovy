package wood.mike

import grails.converters.JSON

class WordController {

    def index() {
        render 'soup'
    }

    /**
     * Fine to access from same same domain and google.com with a simple request
     */
    def googleOnly() {
        log.info("googleOnly accessed")
        //header( "Access-Control-Allow-Origin", "https://www.google.com" )  // we'd do this if we were doing this manually without grails cors enabled
        render 'Hello Google'
    }

    /**
     * Fine to access from anywhere
     */
    def anywhere() {
        log.info("anywhere accessed")
        // header( "Access-Control-Allow-Origin", "*" )     // we'd do this if we were doing this manually without grails cors enabled
        if ( request.method == 'POST' )
            render (['Hello anywhere'] as JSON )
        else
            render 'Hello anywhere'
    }
}
