// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Helper class to handle INI-style files.
 *
 * This helper class can be used to store [Variant] values on the filesystem using INI-style formatting. The stored values are identified by a section and a key:
 *
 * ```
 * 		[section]
 * 		some_key=42
 * 		string_example="Hello World!"
 * 		a_vector=Vector3( 1, 0, 2 )
 * 		```
 *
 * The stored data can be saved to or parsed from a file, though ConfigFile objects can also be used directly without accessing the filesystem.
 *
 * The following example shows how to parse an INI-style file from the system, read its contents and store new values in it:
 *
 * ```
 * 		var config = ConfigFile.new()
 * 		var err = config.load("user://settings.cfg")
 * 		if err == OK: # If not, something went wrong with the file loading
 * 		    # Look for the display/width pair, and default to 1024 if missing
 * 		    var screen_width = config.get_value("display", "width", 1024)
 * 		    # Store a variable if and only if it hasn't been defined yet
 * 		    if not config.has_section_key("audio", "mute"):
 * 		        config.set_value("audio", "mute", false)
 * 		    # Save the changes by overwriting the previous file
 * 		    config.save("user://settings.cfg")
 * 		```
 *
 * Keep in mind that section and property names can't contain spaces. Anything after a space will be ignored on save and on load.
 *
 * ConfigFiles can also contain manually written comment lines starting with a semicolon (`;`). Those lines will be ignored when parsing the file. Note that comments will be lost when saving the ConfigFile. This can still be useful for dedicated server configuration files, which are typically never overwritten without explicit user action.
 */
@GodotBaseType
open class ConfigFile : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_CONFIGFILE)
  }

  /**
   * Deletes the specified section along with all the key-value pairs inside. Raises an error if the section does not exist.
   */
  open fun eraseSection(section: String) {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ERASE_SECTION, NIL)
  }

  /**
   * Deletes the specified key in a section. Raises an error if either the section or the key do not exist.
   */
  open fun eraseSectionKey(section: String, key: String) {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ERASE_SECTION_KEY, NIL)
  }

  /**
   * Returns an array of all defined key identifiers in the specified section. Raises an error and returns an empty array if the section does not exist.
   */
  open fun getSectionKeys(section: String): PoolStringArray {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_SECTION_KEYS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns an array of all defined section identifiers.
   */
  open fun getSections(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_SECTIONS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the current value for the specified section and key. If either the section or the key do not exist, the method returns the fallback `default` value. If `default` is not specified or set to `null`, an error is also raised.
   */
  open fun getValue(
    section: String,
    key: String,
    default: Any? = null
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the specified section exists.
   */
  open fun hasSection(section: String): Boolean {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_HAS_SECTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the specified section-key pair exists.
   */
  open fun hasSectionKey(section: String, key: String): Boolean {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_HAS_SECTION_KEY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Loads the config file specified as a parameter. The file's contents are parsed and loaded in the [godot.ConfigFile] object which the method was called on.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads the encrypted config file specified as a parameter, using the provided `key` to decrypt it. The file's contents are parsed and loaded in the [godot.ConfigFile] object which the method was called on.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun loadEncrypted(path: String, key: PoolByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads the encrypted config file specified as a parameter, using the provided `password` to decrypt it. The file's contents are parsed and loaded in the [godot.ConfigFile] object which the method was called on.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun loadEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD_ENCRYPTED_PASS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Parses the the passed string as the contents of a config file. The string is parsed and loaded in the ConfigFile object which the method was called on.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun parse(data: String): GodotError {
    TransferContext.writeArguments(STRING to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_PARSE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the contents of the [godot.ConfigFile] object to the file specified as a parameter. The output file uses an INI-style structure.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the contents of the [godot.ConfigFile] object to the AES-256 encrypted file specified as a parameter, using the provided `key` to encrypt it. The output file uses an INI-style structure.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun saveEncrypted(path: String, key: PoolByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the contents of the [godot.ConfigFile] object to the AES-256 encrypted file specified as a parameter, using the provided `password` to encrypt it. The output file uses an INI-style structure.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun saveEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE_ENCRYPTED_PASS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Assigns a value to the specified key of the specified section. If either the section or the key do not exist, they are created. Passing a `null` value deletes the specified key if it exists, and deletes the section if it ends up empty once the key has been removed.
   */
  open fun setValue(
    section: String,
    key: String,
    value: Any?
  ) {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SET_VALUE, NIL)
  }
}
