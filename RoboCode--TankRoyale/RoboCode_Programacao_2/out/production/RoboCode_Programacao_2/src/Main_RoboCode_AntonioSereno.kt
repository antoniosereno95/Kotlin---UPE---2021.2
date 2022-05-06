
import dev.robocode.tankroyale.botapi.Bot
import dev.robocode.tankroyale.botapi.events.ScannedBotEvent
import dev.robocode.tankroyale.botapi.BotInfo
import dev.robocode.tankroyale.botapi.events.BulletHitBotEvent


class RoboCode_AntonioSereno: Bot(BotInfo.fromFile("RoboCode_AntonioSereno.json")){
    //esse arquivo .json deve ficar na pasta res(resorces) que deve ser criada dentro do projeto

    override fun run(){
        while(this.isRunning){
            this.forward(100.0)
            this.turnGunRight(360.0)
            this.back(100.0)
            this.turnGunLeft(360.0)

        }
    }

    override fun onScannedBot(scannedBotEvent: ScannedBotEvent?){
        this.fire(1.0)
    }

//    override fun onHitByBullet(bulletHitBotEvent: BulletHitBotEvent) {
//        //se o codigo der erro foi pq eu tirei o "?" depois da funçao BUllet
//        //quando o bot for atacado eele deve achar de onde veio o tiro, virar e ver se o outro bot ainda esta ali, se sim, ele atira de volta
//        var deOndeVeioABala: Double = calcBearing(bulletHitBotEvent.getBullet().getDirection())
//
//
//
//    }

}

fun main() {
    RoboCode_AntonioSereno().start()
}