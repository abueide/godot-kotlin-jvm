// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

@GodotBaseType
open class VisualShaderNodeTransformDecompose : VisualShaderNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMDECOMPOSE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
