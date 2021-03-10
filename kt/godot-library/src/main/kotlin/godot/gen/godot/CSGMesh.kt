// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress

@GodotBaseType
open class CSGMesh : CSGPrimitive() {
  open var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGMESH_GET_MATERIAL, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGMESH_SET_MATERIAL, NIL)
    }

  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGMESH_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGMESH_SET_MESH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CSGMESH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _meshChanged() {
  }
}
