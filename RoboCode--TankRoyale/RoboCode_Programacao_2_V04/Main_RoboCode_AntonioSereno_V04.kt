
import dev.robocode.tankroyale.botapi.Bot
import dev.robocode.tankroyale.botapi.BotInfo
import dev.robocode.tankroyale.botapi.Color
import dev.robocode.tankroyale.botapi.events.*
import kotlin.random.Random

class RoboCode_AntonioSereno_V04: Bot(BotInfo.fromFile("res/RoboCode_AntonioSereno.json")),
    Estrategias_RoboCode_AntonioSereno_V04() {

    override fun run(){
    //setar as cores do bot
    this.bodyColor = Color.GREEN
    this.gunColor = Color.GREEN
    this.radarColor = Color.GREEN
    this.bulletColor = Color.GREEN
    this.radarColor = Color.GREEN

    //função princinpal
    var inteiroRandomm:Int?
    while(this.isRunning){ //aqui ele faz um movimento de hexagono
        this.turnRadarRight(360.0)//isso faz com que o radar fique girando pra sempre, ate achar alguem
        //ver se o radar tambem funciona com o DOUBLE_mAXINT ou com o DUOBLE_POSITE_INFINITY

        inteiroRandomm = Random.nextInt(0,2)
        when(inteiroRandomm){
            0 -> Hecxagono()
            1 -> Quadrado()
            2 -> Triangulo()
        }

    }
}

fun Hecxagono(){
    var quandoAndarr = quantoPercentualArena(17.0)

    for(i in 1..6) {
        this.scan()
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
    }

}
fun Quadrado(){
    var quandoAndarr = quantoPercentualArena(22.0)

    for(i in 1..4) {
        this.scan() // todos esses scans que eu coloquei pode ser que tenham de sair pois nao sei se o robo fica escaneando tudo automaticamente ou tem que dizer mesmo pra ele escannear
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(90.0)
        this.scan()
    }
}
fun Triangulo(){
    var quandoAndarr = quantoPercentualArena(27.0)

    for(i in 1..3) {
        this.scan() // todos esses scans que eu coloquei pode ser que tenham de sair pois nao sei se o robo fica escaneando tudo automaticamente ou tem que dizer mesmo pra ele escannear
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(120.0)
        this.scan()
    }
}

}

fun main() {
    RoboCode_AntonioSereno_V02().start()
}
