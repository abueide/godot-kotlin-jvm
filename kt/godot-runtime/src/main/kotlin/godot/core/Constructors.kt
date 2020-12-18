package godot.core

abstract class KtConstructor<T: KtObject>(
    val parameterTypes: Array<VariantType>,
) {
    abstract operator fun invoke(vararg args: Any?): T
}

class KtConstructor0<T: KtObject>(
    private val constructor: () -> T
) : KtConstructor<T>(arrayOf()) {
    override fun invoke(vararg args: Any?): T {
        return constructor()
    }
}

class KtConstructor1<T: KtObject, P0>(
    private val constructor: (P0) -> T,
    p0VariantType: VariantType
) : KtConstructor<T>(arrayOf(p0VariantType)) {
    override fun invoke(vararg args: Any?): T {
        return constructor(
            args[0] as P0
        )
    }
}