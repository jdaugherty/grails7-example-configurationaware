package com.example

import grails.util.Holders
import groovy.util.logging.Slf4j

@Slf4j
class BootStrap {
    ConfigurationExampleService configurationExampleService

    def init = { servletContext ->
        log.info("********************** Bootstrap ********************************")
        log.info("Property Configuration Test from Bootstrap: ${Holders.config.get('setting.some.property')}")
        log.info("Plugin Class used in application.groovy Test from Bootstrap: ${Holders.config.get('another.property')}")
        log.info("Plugin Class used in runtime.groovy Test from Bootstrap: ${Holders.config.get('yet.another.property')}")
        log.info("Closure syntax used in application.groovy Test from Bootstrap: ${Holders.config.get('closureSyntax.propertyTest')}")
        log.info("*****************************************************************")
        configurationExampleService.testMyPropertySetting()
    }
    def destroy = {
    }
}