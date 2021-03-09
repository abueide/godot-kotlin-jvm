// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class InputEventGesture : InputEventWithModifiers() {
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
    TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENTGESTURE,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }

}
