
import pureconfig._
import pureconfig.generic.auto._
import Configuration._

object Test  {
  def main(args: Array[String]): Unit = {      
      val conf = loadConfig[Configuration]("configuration") 
      println(s"$conf")
  }
}