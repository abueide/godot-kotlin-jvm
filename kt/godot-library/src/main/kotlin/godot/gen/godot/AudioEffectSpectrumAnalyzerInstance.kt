// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class AudioEffectSpectrumAnalyzerInstance : AudioEffectInstance() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun getMagnitudeForFrequencyRange(
    fromHz: Double,
    toHz: Double,
    mode: Long = 1
  ): Vector2 {
    TransferContext.writeArguments(DOUBLE to fromHz, DOUBLE to toHz, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE_GET_MAGNITUDE_FOR_FREQUENCY_RANGE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  enum class MagnitudeMode(
    id: Long
  ) {
    MAGNITUDE_AVERAGE(0),

    MAGNITUDE_MAX(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MAGNITUDE_AVERAGE: Long = 0

    final const val MAGNITUDE_MAX: Long = 1
  }
}
