// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import kotlin.Suppress

/**
 * Dialog for confirmation of actions.
 *
 * Dialog for confirmation of actions. This dialog inherits from [godot.AcceptDialog], but has by default an OK and Cancel button (in host OS order).
 *
 * To get cancel action, you can use:
 *
 * ```
 * 		get_cancel().connect("pressed", self, "cancelled")
 * 		```.
 */
@GodotBaseType
open class ConfirmationDialog : AcceptDialog() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CONFIRMATIONDIALOG,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the cancel button.
   */
  open fun getCancel(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIRMATIONDIALOG_GET_CANCEL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }
}
