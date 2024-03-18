package state.ex2

class RedState : TrafficLightState {
    override fun next(context: TrafficLightContext) {
        context.currentState = GreenState()

    }

    override fun prev(context: TrafficLightContext) {
     // red state has no prev value

    }

    override fun display() {
        println("currently, red ! :)")
    }
}