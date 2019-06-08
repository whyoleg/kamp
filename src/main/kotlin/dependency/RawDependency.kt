package dev.whyoleg.kamp.dependency

data class RawDependency(val group: Group, val name: String, val version: String?)


operator fun LibraryVersionDependency.invoke(name: String): RawDependency = RawDependency(group, name, version)

fun RawDependency.string(rawPostfix: String? = null): String {
    val (group, name, rawVersion) = this
    val postfix = rawPostfix?.let { "-$it" } ?: ""
    val version = rawVersion?.let { ":$it" } ?: ""
    return "${group.name}:$name$postfix$version"
}