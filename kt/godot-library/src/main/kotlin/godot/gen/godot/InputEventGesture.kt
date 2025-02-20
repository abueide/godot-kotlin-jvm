// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for touch control gestures.
 */
@GodotBaseType
open class InputEventGesture : InputEventWithModifiers() {
  /**
   * The local gesture position relative to the [godot.Viewport]. If used in [godot.Control.GuiInput], the position is relative to the current [godot.Control] that received this gesture.
   */
  open var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTGESTURE_GET_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTGESTURE_SET_POSITION,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_INPUTEVENTGESTURE)
  }

  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }

}
