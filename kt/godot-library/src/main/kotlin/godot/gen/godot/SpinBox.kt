// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Numerical input text field.
 *
 * SpinBox is a numerical input text field. It allows entering integers and floats.
 *
 * **Example:**
 *
 * ```
 * 		var spin_box = SpinBox.new()
 * 		add_child(spin_box)
 * 		var line_edit = spin_box.get_line_edit()
 * 		line_edit.context_menu_enabled = false
 * 		spin_box.align = LineEdit.ALIGN_RIGHT
 * 		```
 *
 * The above code will create a [godot.SpinBox], disable context menu on it and set the text alignment to right.
 *
 * See [godot.Range] class for more options over the [godot.SpinBox].
 */
@GodotBaseType
open class SpinBox : Range() {
  /**
   * Sets the text alignment of the [godot.SpinBox].
   */
  open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_ALIGN, NIL)
    }

  /**
   * If `true`, the [godot.SpinBox] will be editable. Otherwise, it will be read only.
   */
  open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_EDITABLE, NIL)
    }

  /**
   * Adds the specified `prefix` string before the numerical value of the [godot.SpinBox].
   */
  open var prefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_PREFIX, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_PREFIX, NIL)
    }

  /**
   * Adds the specified `suffix` string after the numerical value of the [godot.SpinBox].
   */
  open var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_SUFFIX, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_SUFFIX, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SPINBOX)
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _lineEditFocusExit() {
  }

  open fun _lineEditInput(arg0: InputEvent) {
  }

  open fun _rangeClickTimeout() {
  }

  open fun _textEntered(arg0: String) {
  }

  /**
   * Applies the current value of this [godot.SpinBox].
   */
  open fun apply() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_APPLY, NIL)
  }

  /**
   * Returns the [godot.LineEdit] instance from this [godot.SpinBox]. You can use it to access properties and methods of [godot.LineEdit].
   */
  open fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_LINE_EDIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as LineEdit?
  }
}
