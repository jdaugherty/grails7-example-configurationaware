package com.example

import grails.util.Holders
import groovy.util.logging.Slf4j

@Slf4j
class BootStrap {
    ConfigurationExampleService configurationExampleService

    def init = { servletContext ->
        log.info("Property Configuration Test from Bootstrap: ${Holders.config.get('setting.some.property')}")
        configurationExampleService.testMyPropertySetting()
    }
    def destroy = {
    }
}