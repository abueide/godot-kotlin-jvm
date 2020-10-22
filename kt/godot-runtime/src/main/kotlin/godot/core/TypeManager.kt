package godot.core

import godot.util.VoidPtr

object TypeManager {
    private val userTypes = HashSet<String>()

    val engineTypeNames = LinkedHashSet<String>()
    val engineTypesConstructors = mutableListOf<() -> KtObject>()

    val objectInstancesMap = mutableMapOf<VoidPtr, KtObject>()

    fun registerUserType(className: String) = userTypes.add(className)

    fun <T: KtObject> registerEngineType(className: String, invocator: () -> T) {
        engineTypesConstructors.add(invocator)
        engineTypeNames.add(className)
    }

    fun isUserType(className: String) = userTypes.contains(className)

    fun isEngineType(className: String) = engineTypeNames.contains(className)
}