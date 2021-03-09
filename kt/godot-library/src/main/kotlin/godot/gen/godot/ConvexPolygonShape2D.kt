// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import kotlin.Suppress

@GodotBaseType
open class ConvexPolygonShape2D : Shape2D() {
  open var points: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_GET_POINTS,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINTS,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE2D,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun setPointCloud(pointCloud: PoolVector2Array) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to pointCloud)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINT_CLOUD, NIL)
  }
}
