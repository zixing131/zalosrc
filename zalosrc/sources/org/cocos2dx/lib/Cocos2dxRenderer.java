package org.cocos2dx.lib;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes7.dex */
public class Cocos2dxRenderer implements GLSurfaceView.Renderer {
    private static final long NANOSECONDSPERMICROSECOND = 1000000;
    private static final long NANOSECONDSPERSECOND = 1000000000;
    public static int dismissEffectActive = 0;
    private static boolean firstCallInitOrOnSurfaceChanged = true;
    public static boolean isReceiveActionCloseFromNative = false;
    private static long sAnimationInterval = 16666666;
    private long mLastTickInNanoSeconds;
    private boolean mNativeInitCompleted = false;
    private int mScreenHeight;
    private int mScreenWidth;

    public static void initOrOnSurfaceChanged(int i11, int i12) {
    }

    private static native void nativeDeleteBackward();

    private static native String nativeGetContentText();

    public static native void nativeInit(int i11, int i12);

    private static native void nativeInsertText(String str);

    public static native boolean nativeKeyEvent(int i11, boolean z11);

    public static native void nativeOnPause();

    public static native void nativeOnResume();

    public static native void nativeOnSurfaceChanged(int i11, int i12);

    public static native void nativeRender();

    public static native void nativeTouchesBegin(int i11, float f11, float f12);

    public static native void nativeTouchesCancel(int[] iArr, float[] fArr, float[] fArr2);

    public static native void nativeTouchesEnd(int i11, float f11, float f12);

    public static native void nativeTouchesMove(int[] iArr, float[] fArr, float[] fArr2);

    public static void setAnimationInterval(float f11) {
        sAnimationInterval = f11 * 1.0E9f;
    }

    public String getContentText() {
        return nativeGetContentText();
    }

    public void handleActionCancel(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesCancel(iArr, fArr, fArr2);
    }

    public void handleActionDown(int i11, float f11, float f12) {
        nativeTouchesBegin(i11, f11, f12);
    }

    public void handleActionMove(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesMove(iArr, fArr, fArr2);
    }

    public void handleActionUp(int i11, float f11, float f12) {
        nativeTouchesEnd(i11, f11, f12);
    }

    public void handleDeleteBackward() {
        nativeDeleteBackward();
    }

    public void handleInsertText(String str) {
        nativeInsertText(str);
    }

    public void handleKeyDown(int i11) {
        nativeKeyEvent(i11, true);
    }

    public void handleKeyUp(int i11) {
        nativeKeyEvent(i11, false);
    }

    public void handleOnPause() {
        if (!this.mNativeInitCompleted) {
            return;
        }
        Cocos2dxHelper.onEnterBackground();
        nativeOnPause();
    }

    public void handleOnResume() {
        Cocos2dxHelper.onEnterForeground();
        nativeOnResume();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (sAnimationInterval <= 1.6666666666666666E7d) {
            nativeRender();
            return;
        }
        long nanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
        long j11 = sAnimationInterval;
        if (nanoTime < j11) {
            try {
                Thread.sleep((j11 - nanoTime) / NANOSECONDSPERMICROSECOND);
            } catch (Exception unused) {
            }
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        nativeRender();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        nativeOnSurfaceChanged(i11, i12);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeInit(this.mScreenWidth, this.mScreenHeight);
        this.mLastTickInNanoSeconds = System.nanoTime();
        this.mNativeInitCompleted = true;
    }

    public void setScreenWidthAndHeight(int i11, int i12) {
        this.mScreenWidth = i11;
        this.mScreenHeight = i12;
    }
}
