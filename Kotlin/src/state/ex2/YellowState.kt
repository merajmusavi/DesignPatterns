package state.ex2

class YellowState : TrafficLightState {
    override fun next(context: TrafficLightContext) {
        context.currentState = RedState()
    }

    override fun prev(context: TrafficLightContext) {
        context.currentState = GreenState()
    }


    override fun display() {
        println("yellow right now! :) fuck this life")
    }
}