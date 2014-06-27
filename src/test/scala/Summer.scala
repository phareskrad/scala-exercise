/**
 * Created by lliao on 6/27/14.
 */
import ChecksumAccumulator.calculate

object Summer
{
  def main(args: Array[String])
  {
    for (arg <- args)
      println(arg +": "+ calculate(arg))
  }
}
