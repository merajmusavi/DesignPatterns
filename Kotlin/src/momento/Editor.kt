package momento

class Editor
{
    lateinit var content : String

    fun getContent():String {
        return content
    }
    fun createState():EditorState{
        return EditorState(content)
    }

    fun restore(content:String){
        this.content = content
    }

    fun setContent(content:String) {
        this.content = content
    }

}