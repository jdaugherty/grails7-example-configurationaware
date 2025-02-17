package com.example

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import grails.util.Holders
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Value
import com.example.TestOption

@Slf4j
class ConfigurationExampleService implements GrailsConfigurationAware {
    @Value('${setting.some.property}')
    String myProperty

    @Value('${yet.another.property}')
    TestOption runtimeProperty

    @Value('${closureSyntax.propertyTest}')
    TestOption applicationClosureProperty

    @Override
    void setConfiguration(Config config) {
        log.info("********** Service Config ***********")
        log.info("Property Configuration Test in Service via Aware: ${config.get('setting.some.property')}")
        log.info("Plugin Class used in runtime.groovy Test in Service: ${Holders.config.get('yet.another.property')}")
        log.info("Closure syntax used in application.groovy Test in Service: ${Holders.config.get('closureSyntax.propertyTest')}")
        log.info("*************************************")
    }

    void testMyPropertySetting() {
        log.info("********** Service Method ***********")
        log.info("Basic Property Configuration Test in Service via Value: ${myProperty}")
        log.info("Runtime.groovy Property Configuration Test in Service via Value: ${runtimeProperty}")
        log.info("Closure Property Configuration Test in Service via Value: ${applicationClosureProperty}")
        log.info("*************************************")
    }
}
