package godot.benchmark

import godot.File
import godot.Node
import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.RID
import godot.core.VariantArray

@RegisterClass
class Memory : Object() {

    val objs = VariantArray<Node>()
    val refs = VariantArray<File?>()
    val cores = VariantArray<RID?>()
    val size = 1000


    init {
        for (i in 0 until size) {
            objs.append(Node())
            refs.append(File())
            cores.append(RID())
        }
    }

    @RegisterFunction
    fun benchmarkObjAccess() {
        var obj: Node
        for (i in 0 until size) {
            obj = objs[i]
        }
    }

    /**
    @RegisterFunction
    fun benchmarkRefAccess() {
        var ref: File?
        for (i in 0 until size) {
            ref = refs[i]
        }
    } **/

    @RegisterFunction
    fun benchmarkCoreAccess() {
        var core: RID?
        for (i in 0 until size) {
            core = cores[i]
        }
    }

    @RegisterFunction
    fun benchmarkStressObject() {
        var obj: Object?
        for (i in 0 until size) {
            obj = Node()
            obj.free()
        }
    }

    /**
    @RegisterFunction
    fun benchmarkStressReference() {
        var ref: File?
        for (i in 0 until size) {
            ref = File()
        }
    } **/

    @RegisterFunction
    fun benchmarkStressCore() {
        var core: RID?
        for (i in 0 until size) {
            core = RID()
        }
    }
}
