package state.ex1

class SelectionTool : Tool {
    override fun mouseDown() {
        println("selection tool mouse down selected")
    }

    override fun mouseUp() {
        println("selection tool mouse up selected")
    }
}