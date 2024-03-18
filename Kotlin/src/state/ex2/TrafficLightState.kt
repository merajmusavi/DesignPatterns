package state.ex2

interface TrafficLightState {
    fun next(context: TrafficLightContext)
    fun prev(context: TrafficLightContext)

    fun display()
}