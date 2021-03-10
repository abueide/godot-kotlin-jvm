// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class GradientTexture : Texture() {
  open var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE_GET_GRADIENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE_SET_GRADIENT, NIL)
    }

  open var width: Long
    get() = super.getTextureWidth()
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE_SET_WIDTH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_GRADIENTTEXTURE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _update() {
  }
}
