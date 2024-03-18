package state.ex2

class TrafficLightContext(var currentState:TrafficLightState) {
    fun next(){
        currentState.next(this)

    }

    fun prev() {
         currentState.prev(this)
    }

    fun display(){
        currentState.display()
    }
}