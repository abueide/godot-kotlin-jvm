// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

/**
 * Calculates a vector derivative within the visual shader graph.
 *
 * This node is only available in `Fragment` and `Light` visual shaders.
 */
@GodotBaseType
open class VisualShaderNodeVectorDerivativeFunc : VisualShaderNode() {
  /**
   * A derivative type. See [enum Function] for options.
   */
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTORDERIVATIVEFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTORDERIVATIVEFUNC_SET_FUNCTION, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORDERIVATIVEFUNC)
  }

  enum class Function(
    id: Long
  ) {
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    FUNC_SUM(0),

    /**
     * Derivative in `x` using local differencing.
     */
    FUNC_X(1),

    /**
     * Derivative in `y` using local differencing.
     */
    FUNC_Y(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    final const val FUNC_SUM: Long = 0

    /**
     * Derivative in `x` using local differencing.
     */
    final const val FUNC_X: Long = 1

    /**
     * Derivative in `y` using local differencing.
     */
    final const val FUNC_Y: Long = 2
  }
}
