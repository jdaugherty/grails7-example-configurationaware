package com.example

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Value

@Slf4j
class ConfigurationExampleService implements GrailsConfigurationAware {
    @Value('${setting.some.property}')
    String myProperty

    @Override
    void setConfiguration(Config config) {
        log.info("Property Configuration Test from Service via Aware: ${config.get('setting.some.property')}")
    }

    void testMyPropertySetting() {
        log.info("Property Configuration Test from Service via Value: ${myProperty}")
    }
}
