package dev.whyoleg.kamp.builtin

import dev.whyoleg.kamp.plugin.*

object BuiltInPlugins {
    val kotlinMpp = Plugin("kotlin-multiplatform", BuiltInDependencies.kotlin.plugin.gradle)
    val kotlinJvm = Plugin("org.jetbrains.kotlin.jvm", BuiltInDependencies.kotlin.plugin.gradle)
    val serialization = Plugin("kotlinx-serialization", BuiltInDependencies.kotlin.plugin.serialization)
    val atomicfu = Plugin("kotlinx-atomicfu", BuiltInDependencies.kotlinx.plugin.atomicfu)

    val shadow = Plugin("com.github.johnrengelman.shadow", BuiltInDependencies.shadow)
    val updates = Plugin("com.github.ben-manes.versions", BuiltInDependencies.updates)

    val application = Plugin("org.gradle.application", null)
    val docker = Plugin("com.google.cloud.tools.jib", BuiltInDependencies.docker)
    val detekt = Plugin("io.gitlab.arturbosch.detekt", BuiltInDependencies.detekt)

    internal val kamp = Plugin("dev.whyoleg.kamp", BuiltInDependencies.kamp)
}