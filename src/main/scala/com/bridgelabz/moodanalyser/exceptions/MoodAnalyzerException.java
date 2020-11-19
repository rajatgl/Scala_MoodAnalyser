package com.bridgelabz.moodanalyser.exceptions;

public class MoodAnalyzerException extends Exception{

    private static final long serialVersionUID = 1L;
    private Issue error;
    public static enum Issue{
        NULL_POINTER_EXCEPTION,
        EMPTY_STRING_EXCEPTION,
        UNDEFINED_MOOD_EXCEPTION
    }

    public MoodAnalyzerException(Issue error){
        this.error = error;
    }
    public MoodAnalyzerException() {}

    @Override
    public String toString() {
        switch(this.error) {
            case NULL_POINTER_EXCEPTION:
                return "MoodAnalysisException: Null Message Provided";
            case EMPTY_STRING_EXCEPTION:
                return "MoodAnalysisException: Empty String Provided";
            default:
                return "MoodAnalysisException: Undefined Mood. We only work with HAPPY or SAD for now.";
        }
    }
}
