// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Returns the [godot.core.Vector3] that points in the direction of refraction. For use within the visual shader graph.
 *
 * Translated to `refract(I, N, eta)` in the shader language, where `I` is the incident vector, `N` is the normal vector and `eta` is the ratio of the indicies of the refraction.
 */
@GodotBaseType
open class VisualShaderNodeVectorRefract : VisualShaderNode() {
  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORREFRACT)
  }
}
