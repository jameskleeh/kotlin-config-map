package temp

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.core.convert.format.MapFormat
import io.micronaut.core.naming.conventions.StringConvention

@ConfigurationProperties("test")
class Test {
    lateinit var props: Map<String, Any>
}