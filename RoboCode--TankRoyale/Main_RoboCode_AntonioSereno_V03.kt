import dev.robocode.tankroyale.botapi.Bot
import dev.robocode.tankroyale.botapi.BotInfo
import dev.robocode.tankroyale.botapi.Color
import dev.robocode.tankroyale.botapi.events.*
import kotlin.random.Random

class RoboCode_AntonioSereno_V03: Bot(BotInfo.fromFile("RoboCode_AntonioSereno.json")){
    //esse arquivo .json deve ficar na pasta res(resorces) que deve ser criada dentro do projeto

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
        this.scan() // todos esses scans que eu coloquei pode ser que tenham de sair pois nao sei se o robo fica escaneando tudo automaticamente ou tem que dizer mesmo pra ele escannear
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(60.0)
        this.forward(quandoAndarr)
        this.scan()
    }
    fun Quadrado(){
        var quandoAndarr = quantoPercentualArena(22.0)
        this.scan() // todos esses scans que eu coloquei pode ser que tenham de sair pois nao sei se o robo fica escaneando tudo automaticamente ou tem que dizer mesmo pra ele escannear
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(90.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(90.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(90.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(90.0)
        this.forward(quandoAndarr)
        this.scan()
    }
    fun Triangulo(){
        var quandoAndarr = quantoPercentualArena(27.0)
        this.scan() // todos esses scans que eu coloquei pode ser que tenham de sair pois nao sei se o robo fica escaneando tudo automaticamente ou tem que dizer mesmo pra ele escannear
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(120.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(120.0)
        this.forward(quandoAndarr)
        this.scan()
        this.turnGunRight(120.0)
        this.forward(quandoAndarr)
        this.scan()
    }
    //Essa ideia das varias taticas d emovimento aleatorio foram desenvolvidas em 10/05

    override fun onScannedBot(scannedBotEvent: ScannedBotEvent?){
        var distanciaEntreInimigo:Double = distanceRemaining //pelo oq eu li essa funçao retorna a distancia entre o meu robo e o inimigo

        perseguir(scannedBotEvent,distanciaEntreInimigo)

        if(distanciaEntreInimigo < quantoPercentualArena(5.0)){
            this.fire(3.0)
            this.scan()
        }else if(distanciaEntreInimigo < quantoPercentualArena(10.0)){
            this.fire(2.0)
            this.scan()
        }else if(distanciaEntreInimigo < quantoPercentualArena(40.0) ) { //40% pq nao vale a pena dar tiros muitos longe
            // -- mas o melhor seria usar as dintancias que se arrumassem com o
            // tamanho da arena, tipo: distancia do iniigo maior que 30% de um lado da arena atira ocm 1;
            // distancia do inimigo menor que 10% da arena, atira com dois;
            // distancia do ainimigo menor que 5% do tamanho da arena, atira com 3;
            this.fire(1.0)
            this.scan()
        }
    }

    override fun onHitBot(e: HitBotEvent) { //essa funçao é pra se o robo for atingido por outro robo

        if(e.isRammed){//Checks if the other bot got rammed by your bot.

            //aqui é quando eu atingir o inimigo
            this.scan()
            this.back(quantoPercentualArena(20.0))
            this.scan()

        }else{ //aqui é quando eu for atingido
            //ja que o bearing nao quer funcionar, vou fazer algo mais simples
            for(i in 0..2){
                ficarDeFrenteParaOInimigo(e.x, e.y) //tem que testar se isso aqui esta funcionando
                var contador = 0
                while(e.energy != 0.0 || contador >= 2) { //tem que ver aqui. pq eu quero o meu bot scaneie pelomenos 2 vezes
                    //com esse while, depois que o bot virar para quem bateu nele, ele vai scannear, e consequentemente atirar no bot inimigo ate ele morrer
                    this.scan()//com esse scann ele mata o bot
                    contador++
                }
//                this.turnRight(30.0)
//                this.forward(quantoPercentualArena(10.0))
//                this.scan()
            }

//            if(e.calcbearing(e.)) > - 90.0 && e.bearing < 90.0 ){
//                //aqui ta errado, o "e" nao ta dando certo com o getbearing() --> essa funçao nao existe no evento HitBotEvent --> talvez tenha que usar o getx e y do robo inimigo
//
//                this.back(50.0)
//                this.scan() //aqui eu scanneio pq se eu bate em um robo e eu scannera ele, eu me movo pra longe dele e atiro
//            }else{
//                this.forward(50.0)
//                this.scan()
//            }

        }
    }

//    override fun onBulletHit(bulletHitBotEvent: BulletHitBotEvent?) {
//        //falta ver como isso funciona aqui
//    }

    override fun onHitWall(botHitWallEvent: HitWallEvent?) {
        this.turnRight(90.0)
        this.turnGunRight(270.0)
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
        this.forward(quantoPercentualArena(20.0))

        //aqui, quando o robo bater em uma parede ele vai acompanhar ela ate achar o seu final e depois percorrer outra parede, e quando acabar ele vai virar 30 graus e ir pra frente.
    }

    override fun onHitByBullet(e: BulletHitBotEvent) {
        //quando o bot for atacado eele deve achar de onde veio o tiro, virar e ver se o outro bot ainda esta ali, se sim, ele atira de volta

        var deOndeVeioABala: Double = calcBearing(e.getBullet().getDirection())
        this.turnLeft(90 - deOndeVeioABala)
        this.scan()
    }

    override fun onWonRound(wonRoundEvent: WonRoundEvent?) {
        this.turnRight(Double.POSITIVE_INFINITY)
        //talvez isso faça o robo ficar girando no seu proprio eixo infinitamente
    }

    fun quantoPercentualArena(pporcentagem:Double):Double {
        var retorno: Double = 0.0
        retorno = Math.max(arenaWidth, arenaHeight) * (pporcentagem/100)
        return retorno
    }//essa função é so pra o moviemnto do bot ficar dinamica quando a arena trocar de tamanho

    //função nova, tem que ver se ta funcionando
    fun ficarDeFrenteParaOInimigo(x: Double, y: Double) {
        val bearing = bearingTo(x, y)
        if (bearing >= 0) {
            this.turnLeft(bearing)
        } else {
            this.turnLeft(90.0 - bearing)
        }
    }

    fun perseguir(scannedBotEvent: ScannedBotEvent? , distanciaEntreInimigo:Double){
//        if(this.)
        //a ideia aqui era: se tiverem somente 2 bots na arena, o meu bot ia perseguir o outro de qualquer forma, pique camicaze
        // e se tivessem mais do que 2 bota na arena ele fazia o codigo a baixo

        if(scannedBotEvent != null && distanciaEntreInimigo < quantoPercentualArena(20.0) && scannedBotEvent!!.energy >= 50.0 && scannedBotEvent!!.energy > this.energy) { //esse && menor que distancia 20% é pq nao vale a pena persseguir alguem que esteja longe -- e o && com a energia do bot é pq nao vale a pena persseguir um bot com a vida cheia nem um bot ocm vida maior que a da gente
            ficarDeFrenteParaOInimigo(scannedBotEvent.x, scannedBotEvent.y)
            forward(distanciaEntreInimigo - quantoPercentualArena(3.0))
            //aqui eu coloco percentual 3% para ele nao bater no inimigo mas ficar perto o suficiente para dar um tiro de poder 4.0
        }
    }
}

fun main() {
    RoboCode_AntonioSereno_V03().start()
}