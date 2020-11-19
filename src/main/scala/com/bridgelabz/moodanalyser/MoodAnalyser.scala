package com.bridgelabz.moodanalyser

/**
 * Created on 11/19/2020.
 * Class: MoodAnalyser.scala
 * Author: Rajat G.L.
 */
object MoodAnalyser {
  def moodAnalyser(message: String): String = {
    if (message.contains("Sad"))
      "SAD"
    else
      "HAPPY"
  }
  def main(args: Array[String]): Unit = {
    println(moodAnalyser("I'm happy today"))
  }
}
