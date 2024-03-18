package state.ex1

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