// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Direct access object to a space in the [godot.Physics2DServer].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/latest/tutorials/physics/ray-casting.html)
 *
 * Direct access object to a space in the [godot.Physics2DServer]. It's used mainly to do queries against objects and areas residing in a given space.
 */
@GodotBaseType
open class Physics2DDirectSpaceState : Object() {
  override fun __new() {
    callConstructor(ENGINECLASS_PHYSICS2DDIRECTSPACESTATE)
  }

  /**
   * Checks how far the shape can travel toward a point. If the shape can not move, the array will be empty.
   *
   * **Note:** Both the shape and the motion are supplied through a [godot.Physics2DShapeQueryParameters] object. The method will return an array with two floats between 0 and 1, both representing a fraction of `motion`. The first is how far the shape can move without triggering a collision, and the second is the point at which a collision will occur. If no collision is detected, the returned array will be `[1, 1]`.
   */
  open fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_CAST_MOTION, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Checks the intersections of a shape, given through a [godot.Physics2DShapeQueryParameters] object, against the space. The resulting array contains a list of points where the shape intersects another. Like with [intersectShape], the number of returned results can be limited to save processing time.
   */
  open fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, LONG to maxResults)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_COLLIDE_SHAPE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Checks the intersections of a shape, given through a [godot.Physics2DShapeQueryParameters] object, against the space. If it collides with more than one shape, the nearest one is selected. If the shape did not intersect anything, then an empty dictionary is returned instead.
   *
   * **Note:** This method does not take into account the `motion` property of the object. The returned object is a dictionary containing the following fields:
   *
   * `collider_id`: The colliding object's ID.
   *
   * `linear_velocity`: The colliding object's velocity [godot.core.Vector2]. If the object is an [godot.Area2D], the result is `(0, 0)`.
   *
   * `metadata`: The intersecting shape's metadata. This metadata is different from [godot.Object.getMeta], and is set with [godot.Physics2DServer.shapeSetData].
   *
   * `normal`: The object's surface normal at the intersection point.
   *
   * `point`: The intersection point.
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   */
  open fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_GET_REST_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Checks whether a point is inside any shape. The shapes the point is inside of are returned in an array containing dictionaries with the following fields:
   *
   * `collider`: The colliding object.
   *
   * `collider_id`: The colliding object's ID.
   *
   * `metadata`: The intersecting shape's metadata. This metadata is different from [godot.Object.getMeta], and is set with [godot.Physics2DServer.shapeSetData].
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   *
   * Additionally, the method can take an `exclude` array of objects or [RID]s that are to be excluded from collisions, a `collision_mask` bitmask representing the physics layers to check in, or booleans to determine if the ray should collide with [godot.PhysicsBody]s or [godot.Area]s, respectively.
   */
  open fun intersectPoint(
    point: Vector2,
    maxResults: Long = 32,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR2 to point, LONG to maxResults, ARRAY to exclude, LONG to
        collisionLayer, BOOL to collideWithBodies, BOOL to collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_POINT, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   *
   */
  open fun intersectPointOnCanvas(
    point: Vector2,
    canvasInstanceId: Long,
    maxResults: Long = 32,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR2 to point, LONG to canvasInstanceId, LONG to maxResults,
        ARRAY to exclude, LONG to collisionLayer, BOOL to collideWithBodies, BOOL to
        collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_POINT_ON_CANVAS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Intersects a ray in a given space. The returned object is a dictionary with the following fields:
   *
   * `collider`: The colliding object.
   *
   * `collider_id`: The colliding object's ID.
   *
   * `metadata`: The intersecting shape's metadata. This metadata is different from [godot.Object.getMeta], and is set with [godot.Physics2DServer.shapeSetData].
   *
   * `normal`: The object's surface normal at the intersection point.
   *
   * `position`: The intersection point.
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   *
   * If the ray did not intersect anything, then an empty dictionary is returned instead.
   *
   * Additionally, the method can take an `exclude` array of objects or [RID]s that are to be excluded from collisions, a `collision_mask` bitmask representing the physics layers to check in, or booleans to determine if the ray should collide with [godot.PhysicsBody]s or [godot.Area]s, respectively.
   */
  open fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, ARRAY to exclude, LONG to
        collisionLayer, BOOL to collideWithBodies, BOOL to collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_RAY, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Checks the intersections of a shape, given through a [godot.Physics2DShapeQueryParameters] object, against the space.
   *
   * **Note:** This method does not take into account the `motion` property of the object. The intersected shapes are returned in an array containing dictionaries with the following fields:
   *
   * `collider`: The colliding object.
   *
   * `collider_id`: The colliding object's ID.
   *
   * `metadata`: The intersecting shape's metadata. This metadata is different from [godot.Object.getMeta], and is set with [godot.Physics2DServer.shapeSetData].
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   *
   * The number of intersections can be limited with the `max_results` parameter, to reduce the processing time.
   */
  open fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, LONG to maxResults)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DDIRECTSPACESTATE_INTERSECT_SHAPE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }
}
