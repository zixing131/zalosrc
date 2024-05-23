package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

/* loaded from: classes7.dex */
public abstract class EglBase {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    public int trace = 0;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12352, 4, EGL_RECORDABLE_ANDROID, 1, 12344};

    /* loaded from: classes7.dex */
    public static class Context {
    }

    public static EglBase create(Context context, int[] iArr) {
        if (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) {
            return new EglBase14((EglBase14.Context) context, iArr);
        }
        return new EglBase10((EglBase10.Context) context, iArr);
    }

    public abstract void createDummyPbufferSurface();

    public abstract void createPbufferSurface(int i11, int i12);

    public abstract void createSurface(SurfaceTexture surfaceTexture);

    public abstract void createSurface(Surface surface);

    public abstract void detachCurrent();

    public abstract Context getEglBaseContext();

    public int getTrace() {
        return this.trace;
    }

    public abstract boolean hasSurface();

    public abstract void makeCurrent();

    public abstract void release();

    public abstract void releaseSurface();

    public abstract int surfaceHeight();

    public abstract int surfaceWidth();

    public abstract void swapBuffers();

    public static EglBase create() {
        return create(null, CONFIG_RGBA);
    }

    public static EglBase create(Context context) {
        return create(context, CONFIG_RGBA);
    }
}
