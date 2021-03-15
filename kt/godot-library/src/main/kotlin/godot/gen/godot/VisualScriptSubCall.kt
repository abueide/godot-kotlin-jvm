// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Any
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class VisualScriptSubCall : VisualScriptNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTSUBCALL,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _subcall(arguments: Any?): Any? {
    throw NotImplementedError("_subcall is not implemented for VisualScriptSubCall")
  }
}
