fun main(args: Array<String>) {
    var currentState = State.STARTED
    for (i in 1..30) {
        println(currentState)
        currentState = changeState(currentState)
    }
}

fun changeState(currentState: State): State {
    when (currentState) {
        State.STARTED -> return State.PLAYING
        State.PLAYING -> return State.GAMEOVER
        State.GAMEOVER -> return State.STARTED
    }
}

enum class State {
    STARTED,
    PLAYING,
    GAMEOVER
}