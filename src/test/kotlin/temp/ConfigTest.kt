package temp

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.micronaut.context.ApplicationContext

class ConfigTest: StringSpec({

    "should pass" {
        val ctx = ApplicationContext.run(mapOf("test.props.hello.world" to 0, "test.props.hello.john" to 1, "test.props.hello.sally" to 2))
        val test = ctx.getBean(Test::class.java)

        test.props.size shouldBe 3
        test.props.get("hello.world") shouldBe 0
        test.props.get("hello.john") shouldBe 1
        test.props.get("hello.sally") shouldBe 2

        ctx.close()
    }

})