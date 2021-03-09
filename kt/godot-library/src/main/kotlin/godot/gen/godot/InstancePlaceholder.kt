// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class InstancePlaceholder : Node() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_INSTANCEPLACEHOLDER,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun createInstance(replace: Boolean = false, customScene: PackedScene? = null): Node? {
    TransferContext.writeArguments(BOOL to replace, OBJECT to customScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_CREATE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getInstancePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_INSTANCE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getStoredValues(withOrder: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to withOrder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_STORED_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun replaceByInstance(customScene: PackedScene? = null) {
    TransferContext.writeArguments(OBJECT to customScene)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_REPLACE_BY_INSTANCE, NIL)
  }
}
