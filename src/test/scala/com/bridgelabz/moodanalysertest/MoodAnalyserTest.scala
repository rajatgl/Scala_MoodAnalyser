package com.bridgelabz.moodanalysertest

import com.bridgelabz.moodanalyser.MoodAnalyser
import com.bridgelabz.moodanalyser.exceptions.MoodAnalyzerException
import org.scalatest._

class MoodAnalyserTest extends FlatSpec with Matchers {
  "MoodAnalyser" should "Return Sad mood when given message is Sad" in {
    MoodAnalyser.moodAnalyser("I am in Sad Mood") should be("You are sad... :(")
  }
  it should "Return Happy mood when given message is Happy" in {
    MoodAnalyser.moodAnalyser("I am in Happy Mood") should be("Happy, happy, happy!")
  }
  it should "Throw MoodAnalyserException when given message is Null" in {
    a[MoodAnalyzerException] should be thrownBy MoodAnalyser.moodAnalyser(null)
  }
  it should "Throw MoodAnalyserException when given message is Empty" in {
    a[MoodAnalyzerException] should be thrownBy MoodAnalyser.moodAnalyser("")
  }
  it should "Throw MoodAnalyserException when given message is Undefined" in {
    a[MoodAnalyzerException] should be thrownBy MoodAnalyser.moodAnalyser("Yo Boy!")
  }
}
