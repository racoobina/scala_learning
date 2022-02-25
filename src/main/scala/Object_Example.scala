import ru.tinkoff.Module.{name => prefix, name2 => _}

import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.math.{Pi, exp, pow, sqrt}
import scala.math.BigDecimal.RoundingMode.HALF_UP

object Object_Example {
  def main(args: Array[String]): Unit = {
    val name= readLine()
    println("Hello, " + name)

  }
}
object Chapter2_StartWorks extends App {
  val x, y, z = readInt()
  println(x*y*z)

  val name: AnyRef = "Oleg"
  println(prefix+name)
}

object Chapter3_Types extends App{


 def normalDistribution(mu:Double, sigma:Double, x:Double):Double ={
   val P:Double = exp(-(pow(x-mu, 2) / 2 * pow(sigma, 2) ) ) / (sigma * sqrt( 2 * Pi))
   P
 }

  def crispsWeight(weight:BigDecimal=90.0, potatoWaterRatio:Double=0.9, crispWaterRatio:Double=0.1): BigDecimal = {
val w:BigDecimal= (weight*(1-potatoWaterRatio)/(1-crispWaterRatio)).setScale(5, HALF_UP)
    w
  }
  println(crispsWeight())

 def nonZeroBiteCounter(x : Int =15): Int ={
   var c = 0
   var a = x
   for (_<- 1 to 32){
     c += a & 1
     a = a>>1
   }
   c

 }
  println(nonZeroBiteCounter())
  //Красивый способ:
  //println(readLine().toInt.toBinaryString.replaceAll("0", "").length)

  def isCapital(word: String= "aNy STring", pos: Int=1): Boolean = {
    word.charAt(pos).isUpper
    //Можно было так: word(pos).isUpper
  }
  println(isCapital())

  def substringRevers(interval: String= "2 6", str: String="foobarbaz"): String ={
    val Array(startIndex, endIndex) = interval.split(" ").map(_.toInt)
    val result = s"${str.take(startIndex)}${str.substring(startIndex, endIndex + 1).reverse}${str.drop(endIndex + 1)}"
    result
  }
println(substringRevers())

  def isSnakeCaseStyle(inputStr: String="Snake_Case"): Boolean = {
  val str1=inputStr.matches("""^[a-z]+(_[a-z]+)*$""")
    str1
  }
println(isSnakeCaseStyle())
}
