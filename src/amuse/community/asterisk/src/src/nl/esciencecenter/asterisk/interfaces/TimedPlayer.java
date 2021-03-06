package nl.esciencecenter.asterisk.interfaces;

import java.util.ArrayList;

import javax.media.opengl.GL3;

import nl.esciencecenter.asterisk.AsteriskInterfaceWindow.KeyFrame;

public interface TimedPlayer extends Runnable {
    public static enum states {
        UNOPENED, UNINITIALIZED, INITIALIZED, STOPPED, REDRAWING, SNAPSHOTTING, MOVIEMAKING, CLEANUP, WAITINGONFRAME, PLAYING, REVIEW
    }

    public void delete(GL3 gl);

    public void rewind();

    public void oneBack();

    public void oneForward();

    public void setFrame(int value, boolean override);

    public void redraw();

    public SceneStorage getSceneStorage();

    public boolean isInitialized();

    public void close();

    public boolean isPlaying();

    public void stop();

    public void start();

    public void movieMode();

    public void reviewMode();

    public boolean isScreenshotNeeded();

    public String getScreenshotFileName();

    public void setScreenshotNeeded(boolean b);

    public int getFrameNumber();

    public void init();

    public void makeScreenShot(String fileName);

    public void startSequence(ArrayList<KeyFrame> keyFrames, boolean record);

}
