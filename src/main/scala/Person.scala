abstract class Person
case class Gamer(diceCount: Int) extends Person
case class Trainer() extends Person
case class Bloger(map:Map[String,Int]) extends Person
class Scenario {


  def scenarioPerson(person : Person): String ={

          def gamerRandom(): Int ={
          val diceNumber=scala.util.Random
          diceNumber.nextInt(6)
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
            case 1 | 6 =>scenarioPerson(Gamer(diceCount + 1))
            case _ => "Looser"
          }
        }
          case 3 => "Winner"
          case _=> "Looser"
        }
      }

      case Trainer() =>{
        val strength=scala.util.Random
        s"Class Strength =${strength.nextInt(51)}"
      }

      case Bloger(map:Map[String,Int]) => {
""
      }
    }

  }





}
object Companion extends App{
  print("hello world")
  val trainer=Trainer()
  val gamer=Gamer(0)
val obj=new Scenario
  val map=Map("scala"-> 2,"java"->5,"kafka"->6)
  val bloger=Bloger(map)
  print(obj.scenarioPerson(bloger))
  print(obj.scenarioPerson(trainer))
  print(obj.scenarioPerson(gamer))
}
