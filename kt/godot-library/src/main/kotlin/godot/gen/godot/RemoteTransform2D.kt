// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Boolean
import kotlin.Suppress

/**
 * RemoteTransform2D pushes its own [godot.core.Transform2D] to another [godot.CanvasItem] derived Node in the scene.
 *
 * RemoteTransform2D pushes its own [godot.core.Transform2D] to another [godot.CanvasItem] derived Node (called the remote node) in the scene.
 *
 * It can be set to update another Node's position, rotation and/or scale. It can use either global or local coordinates.
 */
@GodotBaseType
open class RemoteTransform2D : Node2D() {
  /**
   * The [godot.core.NodePath] to the remote node, relative to the RemoteTransform2D's position in the scene.
   */
  open var remotePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_GET_REMOTE_PATH,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_SET_REMOTE_PATH,
          NIL)
    }

  /**
   * If `true`, the remote node's position is updated.
   */
  open var updatePosition: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_GET_UPDATE_POSITION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_SET_UPDATE_POSITION, NIL)
    }

  /**
   * If `true`, the remote node's rotation is updated.
   */
  open var updateRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_GET_UPDATE_ROTATION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_SET_UPDATE_ROTATION, NIL)
    }

  /**
   * If `true`, the remote node's scale is updated.
   */
  open var updateScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_GET_UPDATE_SCALE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_SET_UPDATE_SCALE, NIL)
    }

  /**
   * If `true`, global coordinates are used. If `false`, local coordinates are used.
   */
  open var useGlobalCoordinates: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_GET_USE_GLOBAL_COORDINATES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_SET_USE_GLOBAL_COORDINATES, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_REMOTETRANSFORM2D)
  }

  /**
   * [godot.RemoteTransform2D] caches the remote node. It may not notice if the remote node disappears; [forceUpdateCache] forces it to update the cache again.
   */
  open fun forceUpdateCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM2D_FORCE_UPDATE_CACHE, NIL)
  }
}
