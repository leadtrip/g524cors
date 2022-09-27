package wood.mike

class WordController {

    def index() {
        render 'soup'
    }

    /**
     * Fine to access from same same domain and google.com with a simple request
     */
    def googleOnly() {
        log.info("bbcOnly accessed")
        header( "Access-Control-Allow-Origin", "https://www.google.com" )
        render 'Hello Google'
    }

    /**
     * Fine to access from anywhere
     */
    def anywhere() {
        log.info("anywhere accessed")
        header( "Access-Control-Allow-Origin", "*" )
        render 'Hello anywhere'
    }
}
