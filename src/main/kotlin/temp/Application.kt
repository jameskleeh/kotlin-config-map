package temp

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
            .packages("temp")
            .mainClass(Application.javaClass)
            .start()
    }
}