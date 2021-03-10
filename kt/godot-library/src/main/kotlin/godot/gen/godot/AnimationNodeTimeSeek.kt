// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * A time-seeking animation node to be used with [godot.AnimationTree].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 *
 * This node can be used to cause a seek command to happen to any sub-children of the graph. After setting the time, this value returns to -1.
 */
@GodotBaseType
open class AnimationNodeTimeSeek : AnimationNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODETIMESEEK)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
