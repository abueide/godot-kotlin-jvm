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
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * A helper node for displaying scrollable elements such as lists.
 *
 * A ScrollContainer node meant to contain a [godot.Control] child. ScrollContainers will automatically create a scrollbar child ([godot.HScrollBar], [godot.VScrollBar], or both) when needed and will only draw the Control within the ScrollContainer area. Scrollbars will automatically be drawn at the right (for vertical) or bottom (for horizontal) and will enable dragging to move the viewable Control (and its children) within the ScrollContainer. Scrollbars will also automatically resize the grabber based on the [godot.Control.rectMinSize] of the Control relative to the ScrollContainer. Works great with a [godot.Panel] control. You can set `EXPAND` on the children's size flags, so they will upscale to the ScrollContainer's size if it's larger (scroll is invisible for the chosen dimension).
 */
@GodotBaseType
open class ScrollContainer : Container() {
  /**
   * Emitted when scrolling stops.
   */
  val scrollEnded: Signal0 by signal()

  /**
   * Emitted when scrolling is started.
   */
  val scrollStarted: Signal0 by signal()

  /**
   * If `true`, the ScrollContainer will automatically scroll to focused children (including indirect children) to make sure they are fully visible.
   */
  open var followFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_FOLLOW_FOCUS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_FOLLOW_FOCUS,
          NIL)
    }

  /**
   *
   */
  open var scrollDeadzone: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_DEADZONE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_DEADZONE, NIL)
    }

  /**
   * The current horizontal scroll value.
   */
  open var scrollHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_HORIZONTAL, NIL)
    }

  /**
   * If `true`, enables horizontal scrolling.
   */
  open var scrollHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_HORIZONTAL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_HORIZONTAL_ENABLED, NIL)
    }

  /**
   * The current vertical scroll value.
   */
  open var scrollVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_VERTICAL, NIL)
    }

  /**
   * If `true`, enables vertical scrolling.
   */
  open var scrollVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_VERTICAL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_VERTICAL_ENABLED, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SCROLLCONTAINER)
  }

  open fun _ensureFocusedVisible(arg0: Control) {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _scrollMoved(arg0: Double) {
  }

  open fun _updateScrollbarPosition() {
  }

  /**
   * Returns the horizontal scrollbar [godot.HScrollBar] of this [godot.ScrollContainer].
   */
  open fun getHScrollbar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_H_SCROLLBAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as HScrollBar?
  }

  /**
   * Returns the vertical scrollbar [godot.VScrollBar] of this [godot.ScrollContainer].
   */
  open fun getVScrollbar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_V_SCROLLBAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }
}
