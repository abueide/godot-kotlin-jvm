// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Long
import kotlin.Suppress

/**
 * Base class for nodes in a visual shader graph.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/shading/visual_shaders.html](https://docs.godotengine.org/en/latest/tutorials/shading/visual_shaders.html)
 */
@GodotBaseType
open class VisualShaderNode : Resource() {
  /**
   * Emitted when the node requests an editor refresh. Currently called only in setter of [godot.VisualShaderNodeTexture.source], [godot.VisualShaderNodeTexture], and [godot.VisualShaderNodeCubeMap] (and their derivatives).
   */
  val editorRefreshRequest: Signal0 by signal()

  open var defaultInputValues: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_DEFAULT_INPUT_VALUES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(value) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_DEFAULT_INPUT_VALUES, NIL)
    }

  /**
   * Sets the output port index which will be showed for preview. If set to `-1` no port will be open for preview.
   */
  open var outputPortForPreview: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_OUTPUT_PORT_FOR_PREVIEW, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_OUTPUT_PORT_FOR_PREVIEW, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODE)
  }

  /**
   * Returns the default value of the input `port`.
   */
  open fun getInputPortDefaultValue(port: Long): Any? {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_INPUT_PORT_DEFAULT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets the default value for the selected input `port`.
   */
  open fun setInputPortDefaultValue(port: Long, value: Any?) {
    TransferContext.writeArguments(LONG to port, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_INPUT_PORT_DEFAULT_VALUE, NIL)
  }

  enum class PortType(
    id: Long
  ) {
    /**
     * Floating-point scalar. Translated to `float` type in shader code.
     */
    PORT_TYPE_SCALAR(0),

    /**
     * 3D vector of floating-point values. Translated to `vec3` type in shader code.
     */
    PORT_TYPE_VECTOR(1),

    /**
     * Boolean type. Translated to `bool` type in shader code.
     */
    PORT_TYPE_BOOLEAN(2),

    /**
     * Transform type. Translated to `mat4` type in shader code.
     */
    PORT_TYPE_TRANSFORM(3),

    /**
     * Sampler type. Translated to reference of sampler uniform in shader code. Can only be used for input ports in non-uniform nodes.
     */
    PORT_TYPE_SAMPLER(4),

    /**
     * Represents the size of the [enum PortType] enum.
     */
    PORT_TYPE_MAX(5);

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
     * Boolean type. Translated to `bool` type in shader code.
     */
    final const val PORT_TYPE_BOOLEAN: Long = 2

    /**
     * Represents the size of the [enum PortType] enum.
     */
    final const val PORT_TYPE_MAX: Long = 5

    /**
     * Sampler type. Translated to reference of sampler uniform in shader code. Can only be used for input ports in non-uniform nodes.
     */
    final const val PORT_TYPE_SAMPLER: Long = 4

    /**
     * Floating-point scalar. Translated to `float` type in shader code.
     */
    final const val PORT_TYPE_SCALAR: Long = 0

    /**
     * Transform type. Translated to `mat4` type in shader code.
     */
    final const val PORT_TYPE_TRANSFORM: Long = 3

    /**
     * 3D vector of floating-point values. Translated to `vec3` type in shader code.
     */
    final const val PORT_TYPE_VECTOR: Long = 1
  }
}
