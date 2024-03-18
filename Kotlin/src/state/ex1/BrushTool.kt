package state.ex1

class BrushTool : Tool {
    override fun mouseDown() {
        println("brush tool mouse down selected")
    }

    override fun mouseUp() {
        println("brush tool mouse up selected")
    }
}