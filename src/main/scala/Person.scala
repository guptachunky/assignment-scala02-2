import org.apache.log4j.Logger

abstract class Person
case class Gamer(diceCount: Int) extends Person
case class Trainer() extends Person
case class Bloger(map:Map[String,Int]) extends Person
class Scenario {

  def scenarioPerson(person : Person): String ={
          def gamerRandom(): Int ={
          val diceNumber=scala.util.Random
            val limit = 6
          diceNumber.nextInt(limit)
          }

//    def blogerRandom(map:Map[String,Int],count :Int) :Map[String,Int]={
//
//      count match{
//        case 0 => map
//        case _ =>{
//          val diceNumber=scala.util.Random
//          //map.put(diceNumber.nextInt(map.length))
//
//        }
//      }
//    }

    person match{
      case Gamer(diceCount) =>
      {
        diceCount match{
        case count if(diceCount < -1) => "Invalid input"
        case count if(diceCount < 3 ) => {
          gamerRandom() match {
            case 1  =>scenarioPerson(Gamer(diceCount + 1))
            case _ => "Looser"
          }
        }
          case 3 => "Winner"
          case _=> "Looser"
        }
      }

      case Trainer() =>{
        val strength=scala.util.Random
        val limit = 51
        s"Class Strength =${strength.nextInt(limit)}"
      }

      case Bloger(map:Map[String,Int]) => {
""
      }
    }
  }
}

object Companion extends App{

  val log = Logger.getLogger(this.getClass)
  val trainer=Trainer()
  val gamer=Gamer(3)
  val scenarioObj=new Scenario
  val map=Map("scala"-> 2,"java"->5,"kafka"->6)
  val bloger=Bloger(map)
  log.info(scenarioObj.scenarioPerson(bloger)+"\n")
  log.info(scenarioObj.scenarioPerson(trainer)+"\n")
  log.info(scenarioObj.scenarioPerson(gamer)+"\n")
}
