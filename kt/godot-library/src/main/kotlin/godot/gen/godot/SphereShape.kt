// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress

/**
 * Sphere shape for 3D collisions.
 *
 * Sphere shape for 3D collisions, which can be set into a [godot.PhysicsBody] or [godot.Area]. This shape is useful for modeling sphere-like 3D objects.
 */
@GodotBaseType
open class SphereShape : Shape() {
  /**
   * The sphere's radius. The shape's diameter is double the radius.
   */
  open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPHERESHAPE_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPHERESHAPE_SET_RADIUS, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SPHERESHAPE)
  }
}
