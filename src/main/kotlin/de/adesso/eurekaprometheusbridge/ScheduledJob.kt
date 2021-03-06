package de.adesso.eurekaprometheusbridge

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class ScheduledJob(var eurekaQuery: EurekaQuery) {
    
    @Scheduled(fixedDelayString = "\${query.interval.seconds:60}000")
    fun executeBridge() {
        eurekaQuery.queryEureka()
    }
}

