package uk.ac.lincoln.a15564263students.geoquiz;

/**
 * Created by martinlewis on 02/10/2017.
 */

public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue) {

        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }

}
