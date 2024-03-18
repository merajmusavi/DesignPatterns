package state.ex1

fun main(){
    val toolContext = ToolContext()

    toolContext.mouseUp()
    toolContext.mouseDown()

    toolContext.setCurrentState(BrushTool())

    toolContext.mouseUp()
    toolContext.mouseDown()
}