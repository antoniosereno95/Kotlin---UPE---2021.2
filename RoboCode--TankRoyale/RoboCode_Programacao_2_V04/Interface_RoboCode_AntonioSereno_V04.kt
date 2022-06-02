import dev.robocode.tankroyale.botapi.events.*

interface Interface_RoboCode_AntonioSereno_V04 {

    fun onScannedBot(scannedBotEvent: ScannedBotEvent?)
    fun onHitBot(e: HitBotEvent)
    fun onHitWall(botHitWallEvent: HitWallEvent?)
    fun onHitByBullet(e: BulletHitBotEvent)
    fun onWonRound(wonRoundEvent: WonRoundEvent?)
    fun quantoPercentualArena(pporcentagem:Double):Double

}