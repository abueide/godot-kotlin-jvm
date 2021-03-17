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

    private val objs = VariantArray<Node>()
    private val refs = VariantArray<File>()
    private val cores = VariantArray<RID>()
    private val accessSize = 1000
    private val stressSize = 100

    init {
        for (i in 0 until accessSize) {
            objs.append(Node())
            refs.append(File())
            cores.append(RID())
        }
    }

    override fun _onDestroy() {
        for (i in 0 until accessSize) {
            objs[i].free()
        }
        refs.clear()
        cores.clear()
    }

    @RegisterFunction
    fun benchmarkAccessObj() {
        var obj: Node
        for (i in 0 until accessSize) {
            obj = objs[i]
        }
    }

    @RegisterFunction
    fun benchmarkAccessRef() {
        var ref: File
        for (i in 0 until accessSize) {
            ref = refs[i]
        }
    }

    @RegisterFunction
    fun benchmarkAccessCore() {
        var core: RID
        for (i in 0 until accessSize) {
            core = cores[i]
        }
    }

    @RegisterFunction
    fun benchmarkStressObject() {
        var obj: Node
        for (i in 0 until stressSize) {
            obj = Node()
            obj.free()
        }
    }

    @RegisterFunction
    fun benchmarkStressReference() {
        var ref: File?
        for (i in 0 until stressSize) {
            ref = File()
        }
    }

    @RegisterFunction
    fun benchmarkStressCore() {
        var core: RID?
        for (i in 0 until stressSize) {
            core = RID()
        }
    }

    @RegisterFunction
    fun benchmarkStressZMix() {
        var core: RID?
        var obj: Node
        var ref: File?
        for (i in 0 until stressSize) {
            obj = Node()
            obj.free()
            core = RID()
            ref = File()
        }
    }
}
