// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Plays audio in 2D.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/audio/audio_streams.html](https://docs.godotengine.org/en/latest/tutorials/audio/audio_streams.html)
 *
 * Plays audio that dampens with distance from screen center.
 */
@GodotBaseType
open class AudioStreamPlayer2D : Node2D() {
  /**
   * Emitted when the audio stops playing.
   */
  val finished: Signal0 by signal()

  /**
   * Areas in which this sound plays.
   */
  open var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_AREA_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_AREA_MASK,
          NIL)
    }

  /**
   * Dampens audio over distance with this as an exponent.
   */
  open var attenuation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_ATTENUATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_ATTENUATION, NIL)
    }

  /**
   * If `true`, audio plays when added to scene tree.
   */
  open var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_AUTOPLAY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_AUTOPLAY,
          NIL)
    }

  /**
   * Bus on which this audio is playing.
   */
  open var bus: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_BUS,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_BUS, NIL)
    }

  /**
   * Maximum distance from which audio is still hearable.
   */
  open var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_MAX_DISTANCE, NIL)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  open var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PITCH_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_PITCH_SCALE, NIL)
    }

  /**
   * If `true`, audio is playing.
   */
  open val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PLAYING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * The [godot.AudioStream] object to be played.
   */
  open var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_STREAM,
          NIL)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting `stream_paused` to `false`.
   */
  open var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_STREAM_PAUSED, NIL)
    }

  /**
   * Base volume without dampening.
   */
  open var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_VOLUME_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_VOLUME_DB,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER2D)
  }

  open fun _busLayoutChanged() {
  }

  open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer2D")
  }

  open fun _setPlaying(enable: Boolean) {
  }

  /**
   * Returns the position in the [godot.AudioStream].
   */
  open fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PLAYBACK_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer2D].
   */
  open fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM_PLAYBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  /**
   * Plays the audio from the given position `from_position`, in seconds.
   */
  open fun play(fromPosition: Double = 0.0) {
    TransferContext.writeArguments(DOUBLE to fromPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_PLAY, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  open fun seek(toPosition: Double) {
    TransferContext.writeArguments(DOUBLE to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SEEK, NIL)
  }

  /**
   * Stops the audio.
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_STOP, NIL)
  }
}
