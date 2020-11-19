package com.bridgelabz.moodanalyser

/**
 * Created on 11/19/2020.
 * Class: MoodAnalyser.scala
 * Author: Rajat G.L.
 */
import com.bridgelabz.moodanalyser.exceptions.MoodAnalyzerException

object MoodAnalyser {
  /**
   *
   * @param message passed by user regarding his/her mood
   * @throws com.bridgelabz.moodanalyser.exceptions.MoodAnalyzerException whenever mood isn't happy or sad
   * @return Happy or Sad message
   */
  @throws(classOf[MoodAnalyzerException])
  def moodAnalyser(message: String): String = {
    if(message == null)
      throw new MoodAnalyzerException(MoodAnalyzerException.Issue.NULL_POINTER_EXCEPTION)
    val messageLower = message.toLowerCase()
    if(messageLower.contains("sad"))
      "You are sad... :("
    else if(messageLower.contains("happy"))
      "Happy, happy, happy!"
    else if(messageLower.trim.isEmpty)
      throw new MoodAnalyzerException(MoodAnalyzerException.Issue.EMPTY_STRING_EXCEPTION)
    else
      throw new MoodAnalyzerException(MoodAnalyzerException.Issue.UNDEFINED_MOOD_EXCEPTION)
  }
  def main(args: Array[String]): Unit = {
    try {
      var mood: String = ""
      println("Hey there! Enter a message regarding what you feel right now:")
      mood = scala.io.StdIn.readLine()
      println(moodAnalyser(mood))
    }
    catch{
      case e:MoodAnalyzerException => println(e.toString)
    }
  }
}
