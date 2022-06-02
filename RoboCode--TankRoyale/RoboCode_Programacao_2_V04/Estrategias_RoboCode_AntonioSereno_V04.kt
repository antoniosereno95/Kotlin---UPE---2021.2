import dev.robocode.tankroyale.botapi.Bot
import dev.robocode.tankroyale.botapi.BotInfo
import dev.robocode.tankroyale.botapi.Color
import dev.robocode.tankroyale.botapi.events.*

open class Estrategias_RoboCode_AntonioSereno_V04: Interface_RoboCode_AntonioSereno_V04, Bot(BotInfo.fromFile("res/RoboCode_AntonioSereno.json")) {

    override fun onScannedBot(scannedBotEvent: ScannedBotEvent?) {
        var distanciaEntreInimigo:Double = distanceRemaining
        if(distanciaEntreInimigo < quantoPercentualArena(5.0)){
            this.fire(3.0)
            this.scan()
        }else if(distanciaEntreInimigo < quantoPercentualArena(10.0)){
            this.fire(2.0)
            this.scan()
        }else if(distanciaEntreInimigo < quantoPercentualArena(40.0) ) {
            this.fire(1.0)
            this.scan()
        }
    }

    override fun onHitBot(e: HitBotEvent){
        if(e.isRammed){
            this.scan()
            this.back(quantoPercentualArena(20.0))
            this.scan()
        }else{
            for(i in 0..2){
                this.turnRight(30.0)
                this.forward(quantoPercentualArena(10.0))
                this.scan()
            }
        }
    }

    override fun onHitWall(botHitWallEvent: HitWallEvent?){
        this.turnRight(90.0)
        this.turnGunRight(270.0)
        this.scan()
        var i = 0
        for(i in 0..1){
            this.forward(Math.max(arenaWidth,arenaHeight).toDouble())
            this.scan()
            this.turnRight(90.0)
            }
        this.turnRight(30.0)
        this.scan()
        this.forward(quantoPercentualArena(20.0))
    }

    override fun onHitByBullet(e: BulletHitBotEvent){
        var deOndeVeioABala: Double = calcBearing(e.getBullet().getDirection())
        this.turnLeft(90 - deOndeVeioABala)
        this.scan()
    }

    override fun onWonRound(wonRoundEvent: WonRoundEvent?){
        this.turnRight(Double.POSITIVE_INFINITY)
    }

    override fun quantoPercentualArena(pporcentagem:Double):Double{
        var retorno: Double = 0.0
        retorno = Math.max(arenaWidth, arenaHeight) * (pporcentagem/100)
        return retorno
    }

}