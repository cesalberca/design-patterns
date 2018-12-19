package command

fun main(args: Array<String>) {
    val simpleRemoteControl = RemoteControl()
    val light = Light()
    val garageDoor = GarageDoor()

    simpleRemoteControl.setCommand(0, Command() { execute () {light.on()} }, light.off)
    simpleRemoteControl.setCommand(1, garageDoor::up, garageDoor::down)

    simpleRemoteControl.onButtonWasPressed(0)
    simpleRemoteControl.onButtonWasPressed(1)
    simpleRemoteControl.onButtonWasPressed(0)
    simpleRemoteControl.onButtonWasPressed(1)
}