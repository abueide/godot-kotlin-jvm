// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ResourcePreloader : Node() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RESOURCEPRELOADER,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getResources(): VariantArray<Any?> {
    throw NotImplementedError("_get_resources is not implemented for ResourcePreloader")
  }

  open fun _setResources(arg0: VariantArray<Any?>) {
  }

  open fun addResource(name: String, resource: Resource) {
    TransferContext.writeArguments(STRING to name, OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_ADD_RESOURCE, NIL)
  }

  open fun getResource(name: String): Resource? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_GET_RESOURCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  open fun getResourceList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_GET_RESOURCE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun hasResource(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_HAS_RESOURCE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeResource(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_REMOVE_RESOURCE,
        NIL)
  }

  open fun renameResource(name: String, newname: String) {
    TransferContext.writeArguments(STRING to name, STRING to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_RENAME_RESOURCE,
        NIL)
  }
}
