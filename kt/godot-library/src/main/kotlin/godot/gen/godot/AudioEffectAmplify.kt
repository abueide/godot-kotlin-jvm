// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress

@GodotBaseType
open class AudioEffectAmplify : AudioEffect() {
  open var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTAMPLIFY_GET_VOLUME_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTAMPLIFY_SET_VOLUME_DB,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTAMPLIFY,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
