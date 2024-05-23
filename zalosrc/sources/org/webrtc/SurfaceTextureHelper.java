package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;

/* loaded from: classes7.dex */
public class SurfaceTextureHelper {
    static final String TAG = "SurfaceTextureHelper";
    final EglBase eglBase;
    public final Handler handler;
    OnTextureFrameAvailableListener listener;
    final int oesTextureId;
    OnTextureFrameAvailableListener pendingListener;
    ZRGBConverter rgbConverter;
    public final SurfaceTexture surfaceTexture;
    YuvConverter yuvConverter;
    boolean hasPendingTexture = false;
    boolean firstFrame = true;
    volatile boolean isTextureInUse = false;
    boolean isQuitting = false;
    boolean forceReleaseInWrongThread = false;
    final Runnable setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.1
        RunnableC245141() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logging.m127853d(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
            SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
            surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
            surfaceTextureHelper.pendingListener = null;
            if (surfaceTextureHelper.hasPendingTexture) {
                surfaceTextureHelper.updateTexImage();
                SurfaceTextureHelper.this.hasPendingTexture = false;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.SurfaceTextureHelper$1 */
    /* loaded from: classes7.dex */
    public class RunnableC245141 implements Runnable {
        RunnableC245141() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logging.m127853d(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
            SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
            surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
            surfaceTextureHelper.pendingListener = null;
            if (surfaceTextureHelper.hasPendingTexture) {
                surfaceTextureHelper.updateTexImage();
                SurfaceTextureHelper.this.hasPendingTexture = false;
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface OnTextureFrameAvailableListener {
        void onTextureFrameAvailable(int i11, float[] fArr, long j11);
    }

    SurfaceTextureHelper(EglBase.Context context, Handler handler) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler;
            EglBase create = EglBase.create(context, EglBase.CONFIG_PIXEL_RGBA_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.v
                    public /* synthetic */ C24541v() {
                    }

                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                        SurfaceTextureHelper.this.lambda$new$1(surfaceTexture2);
                    }
                });
                return;
            } catch (RuntimeException e11) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e11;
            }
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        HandlerThread handlerThread = new HandlerThread("Z:" + str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: org.webrtc.r

            /* renamed from: b */
            public final /* synthetic */ Handler f118114b;

            /* renamed from: c */
            public final /* synthetic */ String f118115c;

            public /* synthetic */ CallableC24537r(Handler handler2, String str2) {
                r2 = handler2;
                r3 = str2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                SurfaceTextureHelper lambda$create$0;
                lambda$create$0 = SurfaceTextureHelper.lambda$create$0(EglBase.Context.this, r2, r3);
                return lambda$create$0;
            }
        });
    }

    public static /* synthetic */ SurfaceTextureHelper lambda$create$0(EglBase.Context context, Handler handler, String str) throws Exception {
        try {
            return new SurfaceTextureHelper(context, handler);
        } catch (RuntimeException unused) {
            Logging.m127854e(TAG, str + " create failure");
            return null;
        }
    }

    public /* synthetic */ void lambda$dispose$4() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            try {
                release();
            } catch (RuntimeException e11) {
                Logging.m127853d(TAG, "dispose error: " + e11.toString());
            }
        }
    }

    public /* synthetic */ void lambda$new$1(SurfaceTexture surfaceTexture) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$returnTextureFrame$3() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            try {
                release();
                return;
            } catch (RuntimeException e11) {
                Logging.m127853d(TAG, "dispose error: " + e11.toString());
                return;
            }
        }
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$stopListening$2() {
        this.listener = null;
        this.pendingListener = null;
    }

    public /* synthetic */ void lambda$textureToRGB$6(ByteBuffer byteBuffer, int i11, int i12, int i13, float[] fArr) {
        if (this.rgbConverter == null) {
            this.rgbConverter = new ZRGBConverter();
        }
        this.rgbConverter.convert(byteBuffer, i11, i12, i13, this.oesTextureId, fArr);
    }

    public /* synthetic */ void lambda$textureToYUV$5(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, float[] fArr) {
        if (this.yuvConverter == null) {
            this.yuvConverter = new YuvConverter();
        }
        this.yuvConverter.convert(byteBuffer, i11, i12, i13, i14, fArr);
    }

    public void dispose() {
        Logging.m127853d(TAG, "dispose()");
        if (!ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.s
            public /* synthetic */ RunnableC24538s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$dispose$4();
            }
        }, 2000L)) {
            this.forceReleaseInWrongThread = true;
            this.isQuitting = true;
            if (!this.isTextureInUse) {
                try {
                    release();
                } catch (RuntimeException e11) {
                    Logging.m127853d(TAG, "dispose error: " + e11.toString());
                }
            }
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread() && !this.forceReleaseInWrongThread) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (!this.isTextureInUse && this.isQuitting) {
            YuvConverter yuvConverter = this.yuvConverter;
            if (yuvConverter != null) {
                yuvConverter.release();
            }
            ZRGBConverter zRGBConverter = this.rgbConverter;
            if (zRGBConverter != null) {
                zRGBConverter.release();
            }
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            Logging.m127853d(TAG, "done release");
            return;
        }
        throw new IllegalStateException("Unexpected release.");
    }

    public void reset() {
        this.firstFrame = true;
    }

    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.x
            public /* synthetic */ RunnableC24543x() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$returnTextureFrame$3();
            }
        });
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = onTextureFrameAvailableListener;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        Logging.m127853d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        if (!ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.w
            public /* synthetic */ RunnableC24542w() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$stopListening$2();
            }
        }, 500L)) {
            Logging.m127854e(TAG, "Wait too long to stopListening");
        }
    }

    public void textureToRGB(ByteBuffer byteBuffer, int i11, int i12, int i13, float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.u

            /* renamed from: q */
            public final /* synthetic */ ByteBuffer f118125q;

            /* renamed from: r */
            public final /* synthetic */ int f118126r;

            /* renamed from: s */
            public final /* synthetic */ int f118127s;

            /* renamed from: t */
            public final /* synthetic */ int f118128t;

            /* renamed from: u */
            public final /* synthetic */ float[] f118129u;

            public /* synthetic */ RunnableC24540u(ByteBuffer byteBuffer2, int i112, int i122, int i132, float[] fArr2) {
                r2 = byteBuffer2;
                r3 = i112;
                r4 = i122;
                r5 = i132;
                r6 = fArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$textureToRGB$6(r2, r3, r4, r5, r6);
            }
        });
    }

    public void textureToYUV(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.t

            /* renamed from: q */
            public final /* synthetic */ ByteBuffer f118118q;

            /* renamed from: r */
            public final /* synthetic */ int f118119r;

            /* renamed from: s */
            public final /* synthetic */ int f118120s;

            /* renamed from: t */
            public final /* synthetic */ int f118121t;

            /* renamed from: u */
            public final /* synthetic */ int f118122u;

            /* renamed from: v */
            public final /* synthetic */ float[] f118123v;

            public /* synthetic */ RunnableC24539t(ByteBuffer byteBuffer2, int i112, int i122, int i132, int i142, float[] fArr2) {
                r2 = byteBuffer2;
                r3 = i112;
                r4 = i122;
                r5 = i132;
                r6 = i142;
                r7 = fArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$textureToYUV$5(r2, r3, r4, r5, r6, r7);
            }
        });
    }

    void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                this.isTextureInUse = true;
                this.hasPendingTexture = false;
                updateTexImage();
                float[] fArr = new float[16];
                this.surfaceTexture.getTransformMatrix(fArr);
                this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, this.surfaceTexture.getTimestamp());
                return;
            }
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    void updateTexImage() {
        synchronized (EglBase.lock) {
            try {
                this.surfaceTexture.updateTexImage();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}
