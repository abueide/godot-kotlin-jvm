// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class AudioEffectEQ : AudioEffect() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTEQ, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun getBandCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTEQ_GET_BAND_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getBandGainDb(bandIdx: Long): Double {
    TransferContext.writeArguments(LONG to bandIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTEQ_GET_BAND_GAIN_DB,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun setBandGainDb(bandIdx: Long, volumeDb: Double) {
    TransferContext.writeArguments(LONG to bandIdx, DOUBLE to volumeDb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTEQ_SET_BAND_GAIN_DB, NIL)
  }
}
