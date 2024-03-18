package state.ex2

class GreenState : TrafficLightState {
    override fun next(context: TrafficLightContext) {
        context.currentState = YellowState()
    }

    override fun prev(context: TrafficLightContext) {
        context.currentState = RedState()
    }


    override fun display() {
        println("currently green! again fuck this life, im sad : this code is for my future me! am i still sad?")
    }
}