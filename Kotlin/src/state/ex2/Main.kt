package state.ex2

fun main(){
    val context  = TrafficLightContext(RedState())

    for (i in 0..10){
        context.display()
        context.next()
    }
}