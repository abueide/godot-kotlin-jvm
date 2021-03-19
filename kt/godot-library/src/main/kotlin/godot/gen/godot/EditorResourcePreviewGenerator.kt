// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Vector2
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Custom generator of previews.
 *
 * Custom code to generate previews. Please check `file_dialog/thumbnail_size` in [godot.EditorSettings] to find out the right size to do previews at.
 */
@GodotBaseType
open class EditorResourcePreviewGenerator : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORRESOURCEPREVIEWGENERATOR)
  }

  /**
   * If this function returns `true`, the generator will call [generate] or [generateFromPath] for small previews as well.
   *
   * By default, it returns `false`.
   */
  open fun _canGenerateSmallPreview(): Boolean {
    throw
        NotImplementedError("can_generate_small_preview is not implemented for EditorResourcePreviewGenerator")
  }

  /**
   * Generate a preview from a given resource with the specified size. This must always be implemented.
   *
   * Returning an empty texture is an OK way to fail and let another generator take care.
   *
   * Care must be taken because this function is always called from a thread (not the main thread).
   */
  open fun _generate(from: Resource, size: Vector2): Texture? {
    throw NotImplementedError("generate is not implemented for EditorResourcePreviewGenerator")
  }

  /**
   * Generate a preview directly from a path with the specified size. Implementing this is optional, as default code will load and call [generate].
   *
   * Returning an empty texture is an OK way to fail and let another generator take care.
   *
   * Care must be taken because this function is always called from a thread (not the main thread).
   */
  open fun _generateFromPath(path: String, size: Vector2): Texture? {
    throw
        NotImplementedError("generate_from_path is not implemented for EditorResourcePreviewGenerator")
  }

  /**
   * If this function returns `true`, the generator will automatically generate the small previews from the normal preview texture generated by the methods [generate] or [generateFromPath].
   *
   * By default, it returns `false`.
   */
  open fun _generateSmallPreviewAutomatically(): Boolean {
    throw
        NotImplementedError("generate_small_preview_automatically is not implemented for EditorResourcePreviewGenerator")
  }

  /**
   * Returns `true` if your generator supports the resource of type `type`.
   */
  open fun _handles(type: String): Boolean {
    throw NotImplementedError("handles is not implemented for EditorResourcePreviewGenerator")
  }
}
