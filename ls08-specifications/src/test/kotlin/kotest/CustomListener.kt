package kotest

import io.kotest.core.annotation.AutoScan
import io.kotest.core.listeners.BeforeSpecListener
import io.kotest.core.listeners.IgnoredSpecListener
import io.kotest.core.spec.Spec
import kotlin.reflect.KClass

@AutoScan
class CustomListener : BeforeSpecListener {

    override suspend fun beforeSpec(spec: Spec) {
        println("This is my custom extension")
    }


}