
import dev.robocode.tankroyale.botapi.Bot
import dev.robocode.tankroyale.botapi.BotInfo
import dev.robocode.tankroyale.botapi.events.*

class RoboCode_AntonioSereno: Bot(BotInfo.fromFile("RoboCode_AntonioSereno.json")){
    //esse arquivo .json deve ficar na pasta res(resorces) que deve ser criada dentro do projeto

    override fun run(){
        //setar as cores do bot
        this.bodyColor.green
        this.gunColor.green
        this.radarColor.green
        this.bulletColor.green

        //função princinpal
        while(this.isRunning){ //aqui ele faz um movimento de hexagono
            this.turnRadarRight(Double.POSITIVE_INFINITY)//isso faz com que o radar fique girando pra sempre, ate achar alguem

            this.scan() // todos esses scans que eu coloquei pode ser que tenham de sair pois nao sei se o robo fica escaneando tudo automaticamente ou tem que dizer mesmo pra ele escannear
            this.forward(30.0)
            this.scan()
            this.turnGunRight(45.0)
            this.forward(15.0)
            this.scan()
            this.turnGunRight(45.0)
            this.forward(30.0)
            this.scan()
            this.turnGunRight(45.0)
            this.forward(15.0)
            this.scan()
            this.turnGunRight(45.0)
            this.forward(30.0)
            this.scan()
            this.turnGunRight(45.0)
            this.forward(15.0)
            this.scan()
            this.turnGunRight(45.0)
            this.forward(30.0)
            this.scan()
        }
    }

    override fun onScannedBot(scannedBotEvent: ScannedBotEvent?){
        var distanciaEntreInimigo:Double = distanceRemaining //pelo oq eu li essa funçao retorna a distancia entre o meu robo e o inimigo

        if(distanciaEntreInimigo > 50.0){ //talvez eu tenha que ajustar essas distancias
                                            // -- mas o melhor seria usar as dintancias que se arrumassem com o
                                            // tamanho da arena, tipo: distancia do iniigo maior que 30% de um lado da arena atira ocm 1;
                                            // distancia do inimigo menor que 10% da arena, atira com dois;
                                            // distancia do ainimigo menor que 5% do tamanho da arena, atira com 3;
            this.fire(1.0)
            this.scan()
        }else if(distanciaEntreInimigo > 50){
            this.fire(2.0)
            this.scan()
        }else if(distanciaEntreInimigo > 15){
            this.fire(3.0)
            this.scan()
        }

//        this.fire(2.0)
//        this.scan()
        //assim que descobrir com calcular a distancia entre o meu robo e o inimigo, a ideia é colocar tipos diferentes de tiros, quando o inimigo estiver perto atirar no nivel 3.0 e qunado estiver longe atirar no nivel 1.
    }

    override fun onHitBot(e: HitBotEvent) { //essa funçao é pra se o robo for atingido por outro robo

        if(e.isRammed){//aqui é quando eu fui atingido pelo inimigo -- no pdf tinha falando sobre uma funçao isMyFault(), mas nao achei ela aqui

            if(e.getBearing() > - 90.0 && e.getbearing() < 90.0 ){ //aqui ta errado, o "e" nao ta dando certo com o getbearing()
                this.back(50.0)
                this.scan() //aqui eu scanneio pq se eu bate em um robo e eu scannera ele, eu me movo pra longe dele e atiro
            }else{
                this.forward(50.0)
                this.scan()
            }

        }else{//aqui é quando eu qe atingi o inimigo
            fire(3.0)

            this.back(10.0)
            fire(2.0)
            //era aqui verificar se o robo inimigo ja morreu ou nao, pra nao gatsra balas em vão
            //tem uma funçao onBulletHit(), tem que ver como ela vai funcionar
        }


        //se o if funcionar com o bearing, essa parte aqui fica obsoleta.
        this.turnRight(35.0)
        this.forward(10.0)
        this.turnGunRight(35.0)
        this.fire(2.0)
    }

//    override fun onBulletHit(bulletHitBotEvent: BulletHitBotEvent?):Boolean {
//        if()
            //tem qu efazer esse if retornar um boolean pra poder saber se a bala bateu ou nao.
//    }

    override fun onHitWall(botHitWallEvent: HitWallEvent?) {
        this.turnRight(90.0)
        this.turnGunRight(180.0)
        this.scan()

        var i = 0
        for(i in 0..1){
            this.forward(Math.max(arenaWidth,arenaHeight).toDouble())
            this.scan()
            this.turnRight(90.0)
            //this.turnGunRight(90.0) -- essa parte aqui so precisa se a arma se manter estatica qunado o robo dobra os 90 graus
        }
        this.turnRight(30.0)
        this.scan()
        this.forward(30.0)

        //aqui, quando o robo bater em uma parede ele vai acompanhar ela ate achar o seu final e depois percorrer outra parede, e quando acabar ele vai virar 30 graus e ir pra frente.
    }

    override fun onHitByBullet(bulletHitBotEvent: BulletHitBotEvent) {
        //quando o bot for atacado eele deve achar de onde veio o tiro, virar e ver se o outro bot ainda esta ali, se sim, ele atira de volta

        var deOndeVeioABala: Double = calcBearing(bulletHitBotEvent.getBullet().getDirection())
        this.turnLeft(90 - deOndeVeioABala)
        this.scan()
    }

    override fun onWonRound(wonRoundEvent: WonRoundEvent?) {
        this.turnRight(Double.POSITIVE_INFINITY)
    }

}

fun main() {
    RoboCode_AntonioSereno().start()
}