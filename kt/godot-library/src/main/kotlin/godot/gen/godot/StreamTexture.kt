// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A `.stex` texture.
 *
 * A texture that is loaded from a `.stex` file.
 */
@GodotBaseType
open class StreamTexture : Texture() {
  /**
   * The StreamTexture's file path to a `.stex` file.
   */
  open val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMTEXTURE_GET_LOAD_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  override fun __new() {
    callConstructor(ENGINECLASS_STREAMTEXTURE)
  }

  /**
   * Loads the texture from the given path.
   */
  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMTEXTURE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
