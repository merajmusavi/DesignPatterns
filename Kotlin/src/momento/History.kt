package momento

class History {
    private val states:MutableList<EditorState> = mutableListOf()

    fun push(state: EditorState) {
        states.add(state)
    }

    fun pop():EditorState {
        val lastIndex = states.size - 1
        val state = states.get(lastIndex)

        states.removeAt(lastIndex)
        return state

    }
}