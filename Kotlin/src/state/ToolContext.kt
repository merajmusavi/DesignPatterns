package state

class ToolContext {
    private var currentState: Tool = SelectionTool()

    fun setCurrentState(newState: Tool) {
        currentState = newState
    }

    fun mouseDown() {
        currentState.mouseDown()
    }

    fun mouseUp() {
        currentState.mouseUp()
    }
}