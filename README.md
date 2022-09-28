Testing grails CORS functionality

Various issues when grails.cors.enabled in either application.yml or application.groovy

Trying to implement manually without grails.cors.enabled works with simple requests but
complex requests don't work as the pre-flight OPTIONS request doesn't make it to the app
either in the interceptor or the controller action.