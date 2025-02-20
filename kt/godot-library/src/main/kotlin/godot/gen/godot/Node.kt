// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import godot.util.camelToSnakeCase
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KFunction0
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction10
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KFunction7
import kotlin.reflect.KFunction8
import kotlin.reflect.KFunction9
import kotlin.reflect.KMutableProperty

/**
 * Base class for all *scene* objects.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/step_by_step/scenes_and_nodes.html](https://docs.godotengine.org/en/latest/getting_started/step_by_step/scenes_and_nodes.html)
 *
 * Nodes are Godot's building blocks. They can be assigned as the child of another node, resulting in a tree arrangement. A given node can contain any number of nodes as children with the requirement that all siblings (direct children of a node) should have unique names.
 *
 * A tree of nodes is called a *scene*. Scenes can be saved to the disk and then instanced into other scenes. This allows for very high flexibility in the architecture and data model of Godot projects.
 *
 * **Scene tree:** The [godot.SceneTree] contains the active tree of nodes. When a node is added to the scene tree, it receives the [NOTIFICATION_ENTER_TREE] notification and its [_enterTree] callback is triggered. Child nodes are always added *after* their parent node, i.e. the [_enterTree] callback of a parent node will be triggered before its child's.
 *
 * Once all nodes have been added in the scene tree, they receive the [NOTIFICATION_READY] notification and their respective [_ready] callbacks are triggered. For groups of nodes, the [_ready] callback is called in reverse order, starting with the children and moving up to the parent nodes.
 *
 * This means that when adding a node to the scene tree, the following order will be used for the callbacks: [_enterTree] of the parent, [_enterTree] of the children, [_ready] of the children and finally [_ready] of the parent (recursively for the entire scene tree).
 *
 * **Processing:** Nodes can override the "process" state, so that they receive a callback on each frame requesting them to process (do something). Normal processing (callback [_process], toggled with [setProcess]) happens as fast as possible and is dependent on the frame rate, so the processing time *delta* is passed as an argument. Physics processing (callback [_physicsProcess], toggled with [setPhysicsProcess]) happens a fixed number of times per second (60 by default) and is useful for code related to the physics engine.
 *
 * Nodes can also process input events. When present, the [_input] function will be called for each input that the program receives. In many cases, this can be overkill (unless used for simple projects), and the [_unhandledInput] function might be preferred; it is called when the input event was not handled by anyone else (typically, GUI [godot.Control] nodes), ensuring that the node only receives the events that were meant for it.
 *
 * To keep track of the scene hierarchy (especially when instancing scenes into other scenes), an "owner" can be set for the node with the [owner] property. This keeps track of who instanced what. This is mostly useful when writing editors and tools, though.
 *
 * Finally, when a node is freed with [godot.Object.free] or [queueFree], it will also free all its children.
 *
 * **Groups:** Nodes can be added to as many groups as you want to be easy to manage, you could create groups like "enemies" or "collectables" for example, depending on your game. See [addToGroup], [isInGroup] and [removeFromGroup]. You can then retrieve all nodes in these groups, iterate them and even call methods on groups via the methods on [godot.SceneTree].
 *
 * **Networking with nodes:** After connecting to a server (or making one, see [godot.NetworkedMultiplayerENet]), it is possible to use the built-in RPC (remote procedure call) system to communicate over the network. By calling [rpc] with a method name, it will be called locally and in all connected peers (peers = clients and the server that accepts connections). To identify which node receives the RPC call, Godot will use its [godot.core.NodePath] (make sure node names are the same on all peers). Also, take a look at the high-level networking tutorial and corresponding demos.
 */
@GodotBaseType
open class Node : Object() {
  /**
   * Emitted when the node is ready.
   */
  val ready: Signal0 by signal()

  /**
   * Emitted when the node is renamed.
   */
  val renamed: Signal0 by signal()

  /**
   * Emitted when the node enters the tree.
   */
  val treeEntered: Signal0 by signal()

  /**
   * Emitted after the node exits the tree and is no longer active.
   */
  val treeExited: Signal0 by signal()

  /**
   * Emitted when the node is still active but about to exit the tree. This is the right place for de-initialization (or a "destructor", if you will).
   */
  val treeExiting: Signal0 by signal()

  /**
   * The override to the default [godot.MultiplayerAPI]. Set to `null` to use the default [godot.SceneTree] one.
   */
  open var customMultiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CUSTOM_MULTIPLAYER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_CUSTOM_MULTIPLAYER, NIL)
    }

  /**
   * When a scene is instanced from a file, its topmost node contains the filename from which it was loaded.
   */
  open var filename: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_FILENAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_FILENAME, NIL)
    }

  /**
   * The [godot.MultiplayerAPI] instance associated with this node. Either the [customMultiplayer], or the default SceneTree one (if inside tree).
   */
  open val multiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_MULTIPLAYER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }

  /**
   * The name of the node. This name is unique among the siblings (other child nodes from the same parent). When set to an existing name, the node will be automatically renamed.
   */
  open var name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_NAME, NIL)
    }

  /**
   * The node owner. A node can have any other node as owner (as long as it is a valid parent, grandparent, etc. ascending in the tree). When saving a node (using [godot.PackedScene]), all the nodes it owns will be saved with it. This allows for the creation of complex [godot.SceneTree]s, with instancing and subinstancing.
   */
  open var owner: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_OWNER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_OWNER, NIL)
    }

  /**
   * Pause mode. How the node will behave if the [godot.SceneTree] is paused.
   */
  open var pauseMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PAUSE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PAUSE_MODE, NIL)
    }

  /**
   * The node's priority in the execution order of the enabled processing callbacks (i.e. [NOTIFICATION_PROCESS], [NOTIFICATION_PHYSICS_PROCESS] and their internal counterparts). Nodes whose process priority value is *lower* will have their processing callbacks executed first.
   */
  open var processPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_PRIORITY, NIL)
    }

  inline fun <reified FUNCTION : KFunction0<*>> rpc(function: FUNCTION) =
      rpc(function.name.camelToSnakeCase())

  inline fun <reified FUNCTION : KFunction0<*>> rpcId(id: Long, function: FUNCTION) = rpcId(id,
      function.name.camelToSnakeCase())

  inline fun <reified FUNCTION : KFunction0<*>> rpcUnreliable(function: FUNCTION) =
      rpcUnreliable(function.name.camelToSnakeCase())

  inline fun <reified FUNCTION : KFunction0<*>> rpcUnreliableId(id: Long, function: FUNCTION) =
      rpcUnreliableId(id, function.name.camelToSnakeCase())

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpc(function: FUNCTION, arg0: ARG0) =
      rpc(function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcUnreliable(function: FUNCTION,
      arg0: ARG0) = rpcUnreliable(function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>>
      rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>>
      rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>>
      rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
      arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7, arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7, arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8,
      arg9)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
      arg8, arg9)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7, arg8, arg9)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7, arg8, arg9)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rset(property: PROPERTY, value: TYPE)
      = rset(property.name.camelToSnakeCase(), value)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rsetId(
    id: Long,
    property: PROPERTY,
    value: TYPE
  ) = rsetId(id, property.name.camelToSnakeCase(), value)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rsetUnreliable(property: PROPERTY,
      value: TYPE) = rsetUnreliable(property.name.camelToSnakeCase(), value)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rsetUnreliableId(
    id: Long,
    property: PROPERTY,
    value: TYPE
  ) = rsetUnreliableId(id, property.name.camelToSnakeCase(), value)

  override fun __new() {
    callConstructor(ENGINECLASS_NODE)
  }

  /**
   * Called when the node enters the [godot.SceneTree] (e.g. upon instancing, scene changing, or after calling [addChild] in a script). If the node has children, its [_enterTree] callback will be called first, and then that of the children.
   *
   * Corresponds to the [NOTIFICATION_ENTER_TREE] notification in [godot.Object.Notification].
   */
  open fun _enterTree() {
  }

  /**
   * Called when the node is about to leave the [godot.SceneTree] (e.g. upon freeing, scene changing, or after calling [removeChild] in a script). If the node has children, its [_exitTree] callback will be called last, after all its children have left the tree.
   *
   * Corresponds to the [NOTIFICATION_EXIT_TREE] notification in [godot.Object.Notification] and signal [treeExiting]. To get notified when the node has already left the active tree, connect to the [treeExited].
   */
  open fun _exitTree() {
  }

  /**
   * The string returned from this method is displayed as a warning in the Scene Dock if the script that overrides it is a `tool` script.
   *
   * Returning an empty string produces no warning.
   *
   * Call [updateConfigurationWarning] when the warning needs to be updated for this node.
   */
  open fun _getConfigurationWarning(): String {
    throw NotImplementedError("_get_configuration_warning is not implemented for Node")
  }

  open fun _getEditorDescription(): String {
    throw NotImplementedError("_get_editor_description is not implemented for Node")
  }

  open fun _getImportPath(): NodePath {
    throw NotImplementedError("_get_import_path is not implemented for Node")
  }

  /**
   * Called when there is an input event. The input event propagates up through the node tree until a node consumes it.
   *
   * It is only called if input processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcessInput].
   *
   * To consume the input event and stop it propagating further to other nodes, [godot.SceneTree.setInputAsHandled] can be called.
   *
   * For gameplay input, [_unhandledInput] and [_unhandledKeyInput] are usually a better fit as they allow the GUI to intercept the events first.
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not orphan).
   */
  open fun _input(event: InputEvent) {
  }

  /**
   * Called during the physics processing step of the main loop. Physics processing means that the frame rate is synced to the physics, i.e. the `delta` variable should be constant.
   *
   * It is only called if physics processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setPhysicsProcess].
   *
   * Corresponds to the [NOTIFICATION_PHYSICS_PROCESS] notification in [godot.Object.Notification].
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not orphan).
   */
  open fun _physicsProcess(delta: Double) {
  }

  /**
   * Called during the processing step of the main loop. Processing happens at every frame and as fast as possible, so the `delta` time since the previous frame is not constant.
   *
   * It is only called if processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcess].
   *
   * Corresponds to the [NOTIFICATION_PROCESS] notification in [godot.Object.Notification].
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not orphan).
   */
  open fun _process(delta: Double) {
  }

  /**
   * Called when the node is "ready", i.e. when both the node and its children have entered the scene tree. If the node has children, their [_ready] callbacks get triggered first, and the parent node will receive the ready notification afterwards.
   *
   * Corresponds to the [NOTIFICATION_READY] notification in [godot.Object.Notification]. See also the `onready` keyword for variables.
   *
   * Usually used for initialization. For even earlier initialization, [godot.Object.Init] may be used. See also [_enterTree].
   *
   * **Note:** [_ready] may be called only once for each node. After removing a node from the scene tree and adding again, `_ready` will not be called for the second time. This can be bypassed with requesting another call with [requestReady], which may be called anywhere before adding the node again.
   */
  open fun _ready() {
  }

  open fun _setEditorDescription(editorDescription: String) {
  }

  open fun _setImportPath(importPath: NodePath) {
  }

  /**
   * Called when an [godot.InputEvent] hasn't been consumed by [_input] or any GUI. The input event propagates up through the node tree until a node consumes it.
   *
   * It is only called if unhandled input processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcessUnhandledInput].
   *
   * To consume the input event and stop it propagating further to other nodes, [godot.SceneTree.setInputAsHandled] can be called.
   *
   * For gameplay input, this and [_unhandledKeyInput] are usually a better fit than [_input] as they allow the GUI to intercept the events first.
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not orphan).
   */
  open fun _unhandledInput(event: InputEvent) {
  }

  /**
   * Called when an [godot.InputEventKey] hasn't been consumed by [_input] or any GUI. The input event propagates up through the node tree until a node consumes it.
   *
   * It is only called if unhandled key input processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcessUnhandledKeyInput].
   *
   * To consume the input event and stop it propagating further to other nodes, [godot.SceneTree.setInputAsHandled] can be called.
   *
   * For gameplay input, this and [_unhandledInput] are usually a better fit than [_input] as they allow the GUI to intercept the events first.
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not orphan).
   */
  open fun _unhandledKeyInput(event: InputEventKey) {
  }

  /**
   * Adds a child node. Nodes can have any number of children, but every child must have a unique name. Child nodes are automatically deleted when the parent node is deleted, so an entire scene can be removed by deleting its topmost node.
   *
   * If `legible_unique_name` is `true`, the child node will have an human-readable name based on the name of the node being instanced instead of its type.
   *
   * **Note:** If the child node already has a parent, the function will fail. Use [removeChild] first to remove the node from its current parent. For example:
   *
   * ```
   * 				if child_node.get_parent():
   * 				    child_node.get_parent().remove_child(child_node)
   * 				add_child(child_node)
   * 				```
   *
   * **Note:** If you want a child to be persisted to a [godot.PackedScene], you must set [owner] in addition to calling [addChild]. This is typically relevant for [tool scripts](https://godot.readthedocs.io/en/latest/tutorials/misc/running_code_in_the_editor.html) and [editor plugins](https://godot.readthedocs.io/en/latest/tutorials/plugins/editor/index.html). If [addChild] is called without setting [owner], the newly added [godot.Node] will not be visible in the scene tree, though it will be visible in the 2D/3D view.
   */
  open fun addChild(node: Node, legibleUniqueName: Boolean = false) {
    TransferContext.writeArguments(OBJECT to node, BOOL to legibleUniqueName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_CHILD, NIL)
  }

  /**
   * Adds `child_node` as a child. The child is placed below the given `node` in the list of children.
   *
   * If `legible_unique_name` is `true`, the child node will have an human-readable name based on the name of the node being instanced instead of its type.
   */
  open fun addChildBelowNode(
    node: Node,
    childNode: Node,
    legibleUniqueName: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to node, OBJECT to childNode, BOOL to legibleUniqueName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_CHILD_BELOW_NODE, NIL)
  }

  /**
   * Adds the node to a group. Groups are helpers to name and organize a subset of nodes, for example "enemies" or "collectables". A node can be in any number of groups. Nodes can be assigned a group at any time, but will not be added until they are inside the scene tree (see [isInsideTree]). See notes in the description, and the group methods in [godot.SceneTree].
   *
   * The `persistent` option is used when packing node to [godot.PackedScene] and saving to file. Non-persistent groups aren't stored.
   */
  open fun addToGroup(group: String, persistent: Boolean = false) {
    TransferContext.writeArguments(STRING to group, BOOL to persistent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_TO_GROUP, NIL)
  }

  /**
   * Returns `true` if the node can process while the scene tree is paused (see [pauseMode]). Always returns `true` if the scene tree is not paused, and `false` if the node is not in the tree.
   */
  open fun canProcess(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_CAN_PROCESS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Duplicates the node, returning a new node.
   *
   * You can fine-tune the behavior using the `flags` (see [enum DuplicateFlags]).
   *
   * **Note:** It will not work properly if the node contains a script with constructor arguments (i.e. needs to supply arguments to [godot.Object.Init] method). In that case, the node will be duplicated without a script.
   */
  open fun duplicate(flags: Long = 15): Node? {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Finds a descendant of this node whose name matches `mask` as in [godot.String.match] (i.e. case-sensitive, but `"*"` matches zero or more characters and `"?"` matches any single character except `"."`).
   *
   * **Note:** It does not match against the full path, just against individual node names.
   *
   * If `owned` is `true`, this method only finds nodes whose owner is this node. This is especially important for scenes instantiated through a script, because those scenes don't have an owner.
   *
   * **Note:** As this method walks through all the descendants of the node, it is the slowest way to get a reference to another node. Whenever possible, consider using [getNode] instead. To avoid using [findNode] too often, consider caching the node reference into a variable.
   */
  open fun findNode(
    mask: String,
    recursive: Boolean = true,
    owned: Boolean = true
  ): Node? {
    TransferContext.writeArguments(STRING to mask, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_FIND_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Finds the first parent of the current node whose name matches `mask` as in [godot.String.match] (i.e. case-sensitive, but `"*"` matches zero or more characters and `"?"` matches any single character except `"."`).
   *
   * **Note:** It does not match against the full path, just against individual node names.
   *
   * **Note:** As this method walks upwards in the scene tree, it can be slow in large, deeply nested scene trees. Whenever possible, consider using [getNode] instead. To avoid using [findParent] too often, consider caching the node reference into a variable.
   */
  open fun findParent(mask: String): Node? {
    TransferContext.writeArguments(STRING to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_FIND_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns a child node by its index (see [getChildCount]). This method is often used for iterating all children of a node.
   *
   * To access a child node via its name, use [getNode].
   */
  open fun getChild(idx: Long): Node? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the number of child nodes.
   */
  open fun getChildCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILD_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array of references to node's children.
   */
  open fun getChildren(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILDREN, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array listing the groups that the node is a member of.
   */
  open fun getGroups(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_GROUPS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the node's index, i.e. its position among the siblings of its parent.
   */
  open fun getIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the peer ID of the network master for this node. See [setNetworkMaster].
   */
  open fun getNetworkMaster(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NETWORK_MASTER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Fetches a node. The [godot.core.NodePath] can be either a relative path (from the current node) or an absolute path (in the scene tree) to a node. If the path does not exist, a `null instance` is returned and an error is logged. Attempts to access methods on the return value will result in an "Attempt to call <method> on a null instance." error.
   *
   * **Note:** Fetching absolute paths only works when the node is inside the scene tree (see [isInsideTree]).
   *
   * **Example:** Assume your current node is Character and the following tree:
   *
   * ```
   * 				/root
   * 				/root/Character
   * 				/root/Character/Sword
   * 				/root/Character/Backpack/Dagger
   * 				/root/MyGame
   * 				/root/Swamp/Alligator
   * 				/root/Swamp/Mosquito
   * 				/root/Swamp/Goblin
   * 				```
   *
   * Possible paths are:
   *
   * ```
   * 				get_node("Sword")
   * 				get_node("Backpack/Dagger")
   * 				get_node("../Swamp/Alligator")
   * 				get_node("/root/MyGame")
   * 				```
   */
  open fun getNode(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Fetches a node and one of its resources as specified by the [godot.core.NodePath]'s subname (e.g. `Area2D/CollisionShape2D:shape`). If several nested resources are specified in the [godot.core.NodePath], the last one will be fetched.
   *
   * The return value is an array of size 3: the first index points to the [godot.Node] (or `null` if not found), the second index points to the [godot.Resource] (or `null` if not found), and the third index is the remaining [godot.core.NodePath], if any.
   *
   * For example, assuming that `Area2D/CollisionShape2D` is a valid node and that its `shape` property has been assigned a [godot.RectangleShape2D] resource, one could have this kind of output:
   *
   * ```
   * 				print(get_node_and_resource("Area2D/CollisionShape2D")) # [[godot.CollisionShape2D:1161], Null, ]
   * 				print(get_node_and_resource("Area2D/CollisionShape2D:shape")) # [[godot.CollisionShape2D:1161], [godot.RectangleShape2D:1156], ]
   * 				print(get_node_and_resource("Area2D/CollisionShape2D:shape:extents")) # [[godot.CollisionShape2D:1161], [godot.RectangleShape2D:1156], :extents]
   * 				```
   */
  open fun getNodeAndResource(path: NodePath): VariantArray<Any?> {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE_AND_RESOURCE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Similar to [getNode], but does not log an error if `path` does not point to a valid [godot.Node].
   */
  open fun getNodeOrNull(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE_OR_NULL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the parent node of the current node, or a `null instance` if the node lacks a parent.
   */
  open fun getParent(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the absolute path of the current node. This only works if the current node is inside the scene tree (see [isInsideTree]).
   */
  open fun getPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the relative [godot.core.NodePath] from this node to the specified `node`. Both nodes must be in the same scene or the function will fail.
   */
  open fun getPathTo(node: Node): NodePath {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PATH_TO, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the time elapsed since the last physics-bound frame (see [_physicsProcess]). This is always a constant value in physics processing unless the frames per second is changed via [godot.Engine.iterationsPerSecond].
   */
  open fun getPhysicsProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PHYSICS_PROCESS_DELTA_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the node's order in the scene tree branch. For example, if called on the first child node the position is `0`.
   */
  open fun getPositionInParent(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_POSITION_IN_PARENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the time elapsed (in seconds) since the last process callback. This value may vary from frame to frame.
   */
  open fun getProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_DELTA_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if this is an instance load placeholder. See [godot.InstancePlaceholder].
   */
  open fun getSceneInstanceLoadPlaceholder(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_GET_SCENE_INSTANCE_LOAD_PLACEHOLDER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.SceneTree] that contains this node.
   */
  open fun getTree(): SceneTree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_TREE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTree?
  }

  /**
   * Returns the node's [godot.Viewport].
   */
  open fun getViewport(): Viewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_VIEWPORT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Viewport?
  }

  /**
   * Returns `true` if the node that the [godot.core.NodePath] points to exists.
   */
  open fun hasNode(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_HAS_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the [godot.core.NodePath] points to a valid node and its subname points to a valid resource, e.g. `Area2D/CollisionShape2D:shape`. Properties with a non-[godot.Resource] type (e.g. nodes or primitive math types) are not considered resources.
   */
  open fun hasNodeAndResource(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_HAS_NODE_AND_RESOURCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given node is a direct or indirect child of the current node.
   */
  open fun isAParentOf(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_A_PARENT_OF, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is folded (collapsed) in the Scene dock.
   */
  open fun isDisplayedFolded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_DISPLAYED_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given node occurs later in the scene hierarchy than the current node.
   */
  open fun isGreaterThan(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_GREATER_THAN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this node is in the specified group. See notes in the description, and the group methods in [godot.SceneTree].
   */
  open fun isInGroup(group: String): Boolean {
    TransferContext.writeArguments(STRING to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_IN_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this node is currently inside a [godot.SceneTree].
   */
  open fun isInsideTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_INSIDE_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the local system is the master of this node.
   */
  open fun isNetworkMaster(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_NETWORK_MASTER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if physics processing is enabled (see [setPhysicsProcess]).
   */
  open fun isPhysicsProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PHYSICS_PROCESSING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if internal physics processing is enabled (see [setPhysicsProcessInternal]).
   */
  open fun isPhysicsProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PHYSICS_PROCESSING_INTERNAL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if processing is enabled (see [setProcess]).
   */
  open fun isProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is processing input (see [setProcessInput]).
   */
  open fun isProcessingInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if internal processing is enabled (see [setProcessInternal]).
   */
  open fun isProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_INTERNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is processing unhandled input (see [setProcessUnhandledInput]).
   */
  open fun isProcessingUnhandledInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_UNHANDLED_INPUT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is processing unhandled key input (see [setProcessUnhandledKeyInput]).
   */
  open fun isProcessingUnhandledKeyInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_UNHANDLED_KEY_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves a child node to a different position (order) among the other children. Since calls, signals, etc are performed by tree order, changing the order of children nodes may be useful.
   */
  open fun moveChild(childNode: Node, toPosition: Long) {
    TransferContext.writeArguments(OBJECT to childNode, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_MOVE_CHILD, NIL)
  }

  /**
   * Prints all stray nodes (nodes outside the [godot.SceneTree]). Used for debugging. Works only in debug builds.
   */
  open fun printStrayNodes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_STRAY_NODES, NIL)
  }

  /**
   * Prints the tree to stdout. Used mainly for debugging purposes. This version displays the path relative to the current node, and is good for copy/pasting into the [getNode] function.
   *
   * **Example output:**
   *
   * ```
   * 				TheGame
   * 				TheGame/Menu
   * 				TheGame/Menu/Label
   * 				TheGame/Menu/Camera2D
   * 				TheGame/SplashScreen
   * 				TheGame/SplashScreen/Camera2D
   * 				```
   */
  open fun printTree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_TREE, NIL)
  }

  /**
   * Similar to [printTree], this prints the tree to stdout. This version displays a more graphical representation similar to what is displayed in the scene inspector. It is useful for inspecting larger trees.
   *
   * **Example output:**
   *
   * ```
   * 				 ┖╴TheGame
   * 				    ┠╴Menu
   * 				    ┃  ┠╴Label
   * 				    ┃  ┖╴Camera2D
   * 				    ┖╴SplashScreen
   * 				       ┖╴Camera2D
   * 				```
   */
  open fun printTreePretty() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_TREE_PRETTY, NIL)
  }

  /**
   * Calls the given method (if present) with the arguments given in `args` on this node and recursively on all its children. If the `parent_first` argument is `true`, the method will be called on the current node first, then on all its children. If `parent_first` is `false`, the children will be called first.
   */
  open fun propagateCall(
    method: String,
    args: VariantArray<Any?> = VariantArray(),
    parentFirst: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to method, ARRAY to args, BOOL to parentFirst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PROPAGATE_CALL, NIL)
  }

  /**
   * Notifies the current node and all its children recursively by calling [godot.Object.notification] on all of them.
   */
  open fun propagateNotification(what: Long) {
    TransferContext.writeArguments(LONG to what)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PROPAGATE_NOTIFICATION, NIL)
  }

  /**
   * Queues a node for deletion at the end of the current frame. When deleted, all of its child nodes will be deleted as well. This method ensures it's safe to delete the node, contrary to [godot.Object.free]. Use [godot.Object.isQueuedForDeletion] to check whether a node will be deleted at the end of the frame.
   */
  open fun queueFree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_QUEUE_FREE, NIL)
  }

  /**
   * Moves this node to the bottom of parent node's children hierarchy. This is often useful in GUIs ([godot.Control] nodes), because their order of drawing depends on their order in the tree, i.e. the further they are on the node list, the higher they are drawn. After using `raise`, a Control will be drawn on top of their siblings.
   */
  open fun raise() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RAISE, NIL)
  }

  /**
   * Removes a node and sets all its children as children of the parent node (if it exists). All event subscriptions that pass by the removed node will be unsubscribed.
   */
  open fun removeAndSkip() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_AND_SKIP, NIL)
  }

  /**
   * Removes a child node. The node is NOT deleted and must be deleted manually.
   */
  open fun removeChild(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_CHILD, NIL)
  }

  /**
   * Removes a node from a group. See notes in the description, and the group methods in [godot.SceneTree].
   */
  open fun removeFromGroup(group: String) {
    TransferContext.writeArguments(STRING to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_FROM_GROUP, NIL)
  }

  /**
   * Replaces a node in a scene by the given one. Subscriptions that pass through this node will be lost.
   */
  open fun replaceBy(node: Node, keepData: Boolean = false) {
    TransferContext.writeArguments(OBJECT to node, BOOL to keepData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REPLACE_BY, NIL)
  }

  /**
   * Requests that `_ready` be called again. Note that the method won't be called immediately, but is scheduled for when the node is added to the scene tree again (see [_ready]). `_ready` is called only for the node which requested it, which means that you need to request ready for each child if you want them to call `_ready` too (in which case, `_ready` will be called in the same order as it would normally).
   */
  open fun requestReady() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REQUEST_READY, NIL)
  }

  /**
   * Sends a remote procedure call request for the given `method` to peers on the network (and locally), optionally sending all additional arguments as arguments to the method called by the RPC. The call request will only be received by nodes with the same [godot.core.NodePath], including the exact same node name. Behaviour depends on the RPC configuration for the given method, see [rpcConfig]. Methods are not exposed to RPCs by default. See also [rset] and [rsetConfig] for properties. Returns an empty [Variant].
   *
   * **Note:** You can only safely use RPCs on clients after you received the `connected_to_server` signal from the [godot.SceneTree]. You also need to keep track of the connection state, either by the [godot.SceneTree] signals like `server_disconnected` or by checking `SceneTree.network_peer.get_connection_status() == CONNECTION_CONNECTED`.
   */
  open fun rpc(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Changes the RPC mode for the given `method` to the given `mode`. See [enum MultiplayerAPI.RPCMode]. An alternative is annotating methods and properties with the corresponding keywords (`remote`, `master`, `puppet`, `remotesync`, `mastersync`, `puppetsync`). By default, methods are not exposed to networking (and RPCs). See also [rset] and [rsetConfig] for properties.
   */
  open fun rpcConfig(method: String, mode: Long) {
    TransferContext.writeArguments(STRING to method, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_CONFIG, NIL)
  }

  /**
   * Sends a [rpc] to a specific peer identified by `peer_id` (see [godot.NetworkedMultiplayerPeer.setTargetPeer]). Returns an empty [Variant].
   */
  open fun rpcId(
    peerId: Long,
    method: String,
    vararg __var_args: Any?
  ): Any? {
    TransferContext.writeArguments(LONG to peerId, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_ID, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sends a [rpc] using an unreliable protocol. Returns an empty [Variant].
   */
  open fun rpcUnreliable(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_UNRELIABLE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sends a [rpc] to a specific peer identified by `peer_id` using an unreliable protocol (see [godot.NetworkedMultiplayerPeer.setTargetPeer]). Returns an empty [Variant].
   */
  open fun rpcUnreliableId(
    peerId: Long,
    method: String,
    vararg __var_args: Any?
  ): Any? {
    TransferContext.writeArguments(LONG to peerId, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_UNRELIABLE_ID, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Remotely changes a property's value on other peers (and locally). Behaviour depends on the RPC configuration for the given property, see [rsetConfig]. See also [rpc] for RPCs for methods, most information applies to this method as well.
   */
  open fun rset(property: String, value: Any?) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET, NIL)
  }

  /**
   * Changes the RPC mode for the given `property` to the given `mode`. See [enum MultiplayerAPI.RPCMode]. An alternative is annotating methods and properties with the corresponding keywords (`remote`, `master`, `puppet`, `remotesync`, `mastersync`, `puppetsync`). By default, properties are not exposed to networking (and RPCs). See also [rpc] and [rpcConfig] for methods.
   */
  open fun rsetConfig(property: String, mode: Long) {
    TransferContext.writeArguments(STRING to property, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_CONFIG, NIL)
  }

  /**
   * Remotely changes the property's value on a specific peer identified by `peer_id` (see [godot.NetworkedMultiplayerPeer.setTargetPeer]).
   */
  open fun rsetId(
    peerId: Long,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(LONG to peerId, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_ID, NIL)
  }

  /**
   * Remotely changes the property's value on other peers (and locally) using an unreliable protocol.
   */
  open fun rsetUnreliable(property: String, value: Any?) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_UNRELIABLE, NIL)
  }

  /**
   * Remotely changes property's value on a specific peer identified by `peer_id` using an unreliable protocol (see [godot.NetworkedMultiplayerPeer.setTargetPeer]).
   */
  open fun rsetUnreliableId(
    peerId: Long,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(LONG to peerId, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_UNRELIABLE_ID, NIL)
  }

  /**
   * Sets the folded state of the node in the Scene dock.
   */
  open fun setDisplayFolded(fold: Boolean) {
    TransferContext.writeArguments(BOOL to fold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_DISPLAY_FOLDED, NIL)
  }

  /**
   * Sets the node's network master to the peer with the given peer ID. The network master is the peer that has authority over the node on the network. Useful in conjunction with the `master` and `puppet` keywords. Inherited from the parent node by default, which ultimately defaults to peer ID 1 (the server). If `recursive`, the given peer is recursively set as the master for all children of this node.
   */
  open fun setNetworkMaster(id: Long, recursive: Boolean = true) {
    TransferContext.writeArguments(LONG to id, BOOL to recursive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_NETWORK_MASTER, NIL)
  }

  /**
   * Enables or disables physics (i.e. fixed framerate) processing. When a node is being processed, it will receive a [NOTIFICATION_PHYSICS_PROCESS] at a fixed (usually 60 FPS, see [godot.Engine.iterationsPerSecond] to change) interval (and the [_physicsProcess] callback will be called if exists). Enabled automatically if [_physicsProcess] is overridden. Any calls to this before [_ready] will be ignored.
   */
  open fun setPhysicsProcess(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PHYSICS_PROCESS, NIL)
  }

  /**
   * Enables or disables internal physics for this node. Internal physics processing happens in isolation from the normal [_physicsProcess] calls and is used by some nodes internally to guarantee proper functioning even if the node is paused or physics processing is disabled for scripting ([setPhysicsProcess]). Only useful for advanced uses to manipulate built-in nodes' behaviour.
   */
  open fun setPhysicsProcessInternal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PHYSICS_PROCESS_INTERNAL,
        NIL)
  }

  /**
   * Enables or disables processing. When a node is being processed, it will receive a [NOTIFICATION_PROCESS] on every drawn frame (and the [_process] callback will be called if exists). Enabled automatically if [_process] is overridden. Any calls to this before [_ready] will be ignored.
   */
  open fun setProcess(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS, NIL)
  }

  /**
   * Enables or disables input processing. This is not required for GUI controls! Enabled automatically if [_input] is overridden. Any calls to this before [_ready] will be ignored.
   */
  open fun setProcessInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_INPUT, NIL)
  }

  /**
   * Enables or disabled internal processing for this node. Internal processing happens in isolation from the normal [_process] calls and is used by some nodes internally to guarantee proper functioning even if the node is paused or processing is disabled for scripting ([setProcess]). Only useful for advanced uses to manipulate built-in nodes' behaviour.
   */
  open fun setProcessInternal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_INTERNAL, NIL)
  }

  /**
   * Enables unhandled input processing. This is not required for GUI controls! It enables the node to receive all input that was not previously handled (usually by a [godot.Control]). Enabled automatically if [_unhandledInput] is overridden. Any calls to this before [_ready] will be ignored.
   */
  open fun setProcessUnhandledInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_UNHANDLED_INPUT,
        NIL)
  }

  /**
   * Enables unhandled key input processing. Enabled automatically if [_unhandledKeyInput] is overridden. Any calls to this before [_ready] will be ignored.
   */
  open fun setProcessUnhandledKeyInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_UNHANDLED_KEY_INPUT, NIL)
  }

  /**
   * Sets whether this is an instance load placeholder. See [godot.InstancePlaceholder].
   */
  open fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    TransferContext.writeArguments(BOOL to loadPlaceholder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_SET_SCENE_INSTANCE_LOAD_PLACEHOLDER, NIL)
  }

  /**
   * Updates the warning displayed for this node in the Scene Dock.
   *
   * Use [_getConfigurationWarning] to setup the warning message to display.
   */
  open fun updateConfigurationWarning() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_UPDATE_CONFIGURATION_WARNING,
        NIL)
  }

  enum class PauseMode(
    id: Long
  ) {
    /**
     * Inherits pause mode from the node's parent. For the root node, it is equivalent to [PAUSE_MODE_STOP]. Default.
     */
    PAUSE_MODE_INHERIT(0),

    /**
     * Stops processing when the [godot.SceneTree] is paused.
     */
    PAUSE_MODE_STOP(1),

    /**
     * Continue to process regardless of the [godot.SceneTree] pause state.
     */
    PAUSE_MODE_PROCESS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DuplicateFlags(
    id: Long
  ) {
    /**
     * Duplicate the node's signals.
     */
    DUPLICATE_SIGNALS(1),

    /**
     * Duplicate the node's groups.
     */
    DUPLICATE_GROUPS(2),

    /**
     * Duplicate the node's scripts.
     */
    DUPLICATE_SCRIPTS(4),

    /**
     * Duplicate using instancing.
     *
     * An instance stays linked to the original so when the original changes, the instance changes too.
     */
    DUPLICATE_USE_INSTANCING(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Duplicate the node's groups.
     */
    final const val DUPLICATE_GROUPS: Long = 2

    /**
     * Duplicate the node's scripts.
     */
    final const val DUPLICATE_SCRIPTS: Long = 4

    /**
     * Duplicate the node's signals.
     */
    final const val DUPLICATE_SIGNALS: Long = 1

    /**
     * Duplicate using instancing.
     *
     * An instance stays linked to the original so when the original changes, the instance changes too.
     */
    final const val DUPLICATE_USE_INSTANCING: Long = 8

    /**
     * Notification received from the OS when the app is paused.
     *
     * Specific to the Android platform.
     */
    final const val NOTIFICATION_APP_PAUSED: Long = 1015

    /**
     * Notification received from the OS when the app is resumed.
     *
     * Specific to the Android platform.
     */
    final const val NOTIFICATION_APP_RESUMED: Long = 1014

    /**
     * Notification received from Godot's crash handler when the engine is about to crash.
     *
     * Implemented on desktop platforms if the crash handler is enabled.
     */
    final const val NOTIFICATION_CRASH: Long = 1012

    /**
     * Notification received when a drag begins.
     */
    final const val NOTIFICATION_DRAG_BEGIN: Long = 21

    /**
     * Notification received when a drag ends.
     */
    final const val NOTIFICATION_DRAG_END: Long = 22

    /**
     * Notification received when the node enters a [godot.SceneTree].
     */
    final const val NOTIFICATION_ENTER_TREE: Long = 10

    /**
     * Notification received when the node is about to exit a [godot.SceneTree].
     */
    final const val NOTIFICATION_EXIT_TREE: Long = 11

    /**
     * Notification received when the node is instanced.
     */
    final const val NOTIFICATION_INSTANCED: Long = 20

    /**
     * Notification received every frame when the internal physics process flag is set (see [setPhysicsProcessInternal]).
     */
    final const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Long = 26

    /**
     * Notification received every frame when the internal process flag is set (see [setProcessInternal]).
     */
    final const val NOTIFICATION_INTERNAL_PROCESS: Long = 25

    /**
     * Notification received when the node is moved in the parent.
     */
    final const val NOTIFICATION_MOVED_IN_PARENT: Long = 12

    /**
     * Notification received from the OS when an update of the Input Method Engine occurs (e.g. change of IME cursor position or composition string).
     *
     * Specific to the macOS platform.
     */
    final const val NOTIFICATION_OS_IME_UPDATE: Long = 1013

    /**
     * Notification received from the OS when the application is exceeding its allocated memory.
     *
     * Specific to the iOS platform.
     */
    final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 1009

    /**
     * Notification received when a node is set as a child of another node.
     *
     * **Note:** This doesn't mean that a node entered the [godot.SceneTree].
     */
    final const val NOTIFICATION_PARENTED: Long = 18

    /**
     * Notification received when the node's [godot.core.NodePath] changed.
     */
    final const val NOTIFICATION_PATH_CHANGED: Long = 23

    /**
     * Notification received when the node is paused.
     */
    final const val NOTIFICATION_PAUSED: Long = 14

    /**
     * Notification received every frame when the physics process flag is set (see [setPhysicsProcess]).
     */
    final const val NOTIFICATION_PHYSICS_PROCESS: Long = 16

    /**
     * Notification received every frame when the process flag is set (see [setProcess]).
     */
    final const val NOTIFICATION_PROCESS: Long = 17

    /**
     * Notification received when the node is ready. See [_ready].
     */
    final const val NOTIFICATION_READY: Long = 13

    /**
     * Notification received when translations may have changed. Can be triggered by the user changing the locale. Can be used to respond to language changes, for example to change the UI strings on the fly. Useful when working with the built-in translation support, like [godot.Object.tr].
     */
    final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 1010

    /**
     * Notification received when a node is unparented (parent removed it from the list of children).
     */
    final const val NOTIFICATION_UNPARENTED: Long = 19

    /**
     * Notification received when the node is unpaused.
     */
    final const val NOTIFICATION_UNPAUSED: Long = 15

    /**
     * Notification received from the OS when a request for "About" information is sent.
     *
     * Specific to the macOS platform.
     */
    final const val NOTIFICATION_WM_ABOUT: Long = 1011

    /**
     * Notification received from the OS when the game window is focused.
     *
     * Implemented on all platforms.
     */
    final const val NOTIFICATION_WM_FOCUS_IN: Long = 1004

    /**
     * Notification received from the OS when the game window is unfocused.
     *
     * Implemented on all platforms.
     */
    final const val NOTIFICATION_WM_FOCUS_OUT: Long = 1005

    /**
     * Notification received from the OS when a go back request is sent (e.g. pressing the "Back" button on Android).
     *
     * Specific to the Android platform.
     */
    final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    /**
     * Notification received from the OS when the mouse enters the game window.
     *
     * Implemented on desktop and web platforms.
     */
    final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    /**
     * Notification received from the OS when the mouse leaves the game window.
     *
     * Implemented on desktop and web platforms.
     */
    final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    /**
     * Notification received from the OS when a quit request is sent (e.g. closing the window with a "Close" button or Alt+F4).
     *
     * Implemented on desktop platforms.
     */
    final const val NOTIFICATION_WM_QUIT_REQUEST: Long = 1006

    /**
     * Notification received from the OS when an unfocus request is sent (e.g. another OS window wants to take the focus).
     *
     * No supported platforms currently send this notification.
     */
    final const val NOTIFICATION_WM_UNFOCUS_REQUEST: Long = 1008

    /**
     * Inherits pause mode from the node's parent. For the root node, it is equivalent to [PAUSE_MODE_STOP]. Default.
     */
    final const val PAUSE_MODE_INHERIT: Long = 0

    /**
     * Continue to process regardless of the [godot.SceneTree] pause state.
     */
    final const val PAUSE_MODE_PROCESS: Long = 2

    /**
     * Stops processing when the [godot.SceneTree] is paused.
     */
    final const val PAUSE_MODE_STOP: Long = 1
  }
}
