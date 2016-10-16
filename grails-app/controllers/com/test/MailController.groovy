package com.test

class MailController {
    static responseFormats = ['json', 'xml']

    def index() {
        Map headers = (request.headerNames as List).collectEntries {
            return [(it): request.getHeader(it)]
        }

        println "Incoming email $headers"
        render status: 200
    }
}
