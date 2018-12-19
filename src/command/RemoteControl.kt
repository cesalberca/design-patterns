package command

class RemoteControl {

    private var onCommands: MutableList<Command> = mutableListOf()
    private var offCommands: MutableList<Command> = mutableListOf()

    init {
        for (i in 1..7) {
            onCommands.add(NoCommand())
            offCommands.add(NoCommand())
        }
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPressed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPressed(slot: Int) {
        offCommands[slot].execute()
    }

}