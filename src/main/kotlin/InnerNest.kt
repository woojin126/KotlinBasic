import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button: View {
    override fun getCurrentState(): State {

        return ButtonState()
    }

    override fun restoreState(state: State) {

    }
    class ButtonState: State {

    }
}

fun main() {
    println(Button().getCurrentState())
}