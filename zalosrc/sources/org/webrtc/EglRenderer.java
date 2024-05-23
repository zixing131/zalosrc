package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.vng.zing.vn.zrtc.UtilityJNI;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoRenderer;

/* loaded from: classes7.dex */
public class EglRenderer implements VideoRenderer.Callbacks {
    static final long LOG_INTERVAL_SEC = 4;
    static final int MAX_SURFACE_CLEAR_COUNT = 3;
    static final String TAG = "EglRenderer";
    RendererCommon.GlDrawer drawer;
    EglBase eglBase;
    int framesDropped;
    int framesReceived;
    int framesRendered;
    float layoutAspectRatio;
    RendererListener mListenner;
    long minRenderPeriodNs;
    boolean mirror;
    final String name;
    long nextFrameTimeNs;
    private OffScreenDrawer offscreenDrawer;
    VideoRenderer.I420Frame pendingFilterFrame;
    VideoRenderer.I420Frame pendingFrame;
    int renderFrameTrace;
    private long renderSwapBufferTimeNs;
    Handler renderThreadHandler;
    long renderTimeNs;
    int renderTrace;
    long statisticsStartTimeNs;
    int surfaceHeight;
    public SurfaceTextureHelper surfaceTextureHelper;
    int surfaceWidth;
    boolean isNotiFailRender = false;
    final Object handlerLock = new Object();
    final Object fpsReductionLock = new Object();
    final RendererCommon.YuvUploader yuvUploader = new RendererCommon.YuvUploader();
    int[] yuvTextures = null;
    final Object frameLock = new Object();
    final Object scaleLock = new Object();
    final Object layoutLock = new Object();
    final Object statisticsLock = new Object();
    private RenderMode videoRenderMode = RenderMode.AspectScaleToFill;
    float scale = 1.0f;
    boolean effect = true;
    volatile boolean isAnim = false;
    volatile boolean circle = false;
    volatile float cornerRadius = 0.0f;
    float[] blackMatrix = new float[16];
    int timeoutAwait = 0;
    final Runnable renderFrameRunnable = new Runnable() { // from class: org.webrtc.m
        public /* synthetic */ RunnableC24532m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            EglRenderer.this.renderFrameOnRenderThread();
        }
    };
    final Runnable logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.1
        RunnableC245091() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (EglRenderer.this.handlerLock) {
                try {
                    EglRenderer eglRenderer = EglRenderer.this;
                    Handler handler = eglRenderer.renderThreadHandler;
                    if (handler != null) {
                        handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        eglRenderer2.renderThreadHandler.postDelayed(eglRenderer2.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.EglRenderer$1 */
    /* loaded from: classes7.dex */
    public class RunnableC245091 implements Runnable {
        RunnableC245091() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (EglRenderer.this.handlerLock) {
                try {
                    EglRenderer eglRenderer = EglRenderer.this;
                    Handler handler = eglRenderer.renderThreadHandler;
                    if (handler != null) {
                        handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        eglRenderer2.renderThreadHandler.postDelayed(eglRenderer2.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.EglRenderer$2 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C245102 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$EglRenderer$RenderMode;

        static {
            int[] iArr = new int[RenderMode.values().length];
            $SwitchMap$org$webrtc$EglRenderer$RenderMode = iArr;
            try {
                iArr[RenderMode.ScaleToFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$EglRenderer$RenderMode[RenderMode.AspectScaleToFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$EglRenderer$RenderMode[RenderMode.AspectScaleToFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public class BufferCapture {
        public ByteBuffer buf;
        public int height;
        public int width;

        public BufferCapture() {
            reset();
        }

        public void newBuffer(int i11, int i12) {
            this.width = i11;
            this.height = i12;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * i12 * 4);
            this.buf = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }

        public void reset() {
            this.buf = null;
            this.width = 0;
            this.height = 0;
        }
    }

    /* loaded from: classes7.dex */
    public class EglSurfaceCreation implements Runnable {
        Object surface;

        EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            EglBase eglBase;
            try {
                if (this.surface != null && (eglBase = EglRenderer.this.eglBase) != null && !eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) obj);
                    } else if (obj instanceof SurfaceTexture) {
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) obj);
                    } else {
                        throw new IllegalStateException("Invalid surface: " + this.surface);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    /* loaded from: classes7.dex */
    public enum RenderMode {
        ScaleToFill,
        AspectScaleToFit,
        AspectScaleToFill
    }

    /* loaded from: classes7.dex */
    public interface RendererListener {
        void onDraw(int i11, int i12);

        void onRenderFail();
    }

    public EglRenderer(String str) {
        this.renderTrace = 0;
        this.renderFrameTrace = 0;
        this.name = str;
        this.renderTrace = 0;
        this.renderFrameTrace = 0;
    }

    public /* synthetic */ void lambda$captureFrame$4(BufferCapture bufferCapture, Object obj) {
        int surfaceWidth;
        int surfaceHeight;
        try {
            try {
                surfaceWidth = this.eglBase.surfaceWidth();
                surfaceHeight = this.eglBase.surfaceHeight();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                synchronized (obj) {
                    obj.notify();
                }
            }
            if (surfaceWidth > 0 && surfaceHeight > 0) {
                bufferCapture.newBuffer(surfaceWidth, surfaceHeight);
                GLES20.glFinish();
                GLES20.glReadPixels(0, 0, surfaceWidth, surfaceHeight, 6408, 5121, bufferCapture.buf);
                GlUtil.checkNoGLES2Error("glReadPixels");
                bufferCapture.buf.rewind();
                synchronized (obj) {
                    obj.notify();
                }
                return;
            }
            synchronized (obj) {
                obj.notify();
            }
        } catch (Throwable th2) {
            synchronized (obj) {
                obj.notify();
                throw th2;
            }
        }
    }

    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = new EglBase10(null, iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = EglBase.create(context, iArr);
            this.surfaceTextureHelper = SurfaceTextureHelper.create("SurfaceTextureHelper", context);
        }
    }

    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        int[] iArr = this.yuvTextures;
        if (iArr != null) {
            GLES20.glDeleteTextures(3, iArr, 0);
            this.yuvTextures = null;
        }
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    public /* synthetic */ void lambda$releaseEglSurface$3() {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
    }

    public Bitmap captureFrame() {
        Object obj = new Object();
        BufferCapture bufferCapture = new BufferCapture();
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return null;
                }
                handler.post(new Runnable() { // from class: org.webrtc.l

                    /* renamed from: q */
                    public final /* synthetic */ EglRenderer.BufferCapture f118105q;

                    /* renamed from: r */
                    public final /* synthetic */ Object f118106r;

                    public /* synthetic */ RunnableC24531l(EglRenderer.BufferCapture bufferCapture2, Object obj2) {
                        r2 = bufferCapture2;
                        r3 = obj2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$captureFrame$4(r2, r3);
                    }
                });
                try {
                    synchronized (obj2) {
                        obj2.wait(1000L);
                    }
                    ByteBuffer byteBuffer = bufferCapture2.buf;
                    if (byteBuffer == null) {
                        return null;
                    }
                    int i11 = bufferCapture2.width;
                    int i12 = bufferCapture2.height;
                    bufferCapture2.reset();
                    int i13 = i11 * 4;
                    byte[] bArr = new byte[i13];
                    for (int i14 = 0; i14 < i12 / 2; i14++) {
                        byteBuffer.get(bArr);
                        System.arraycopy(byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), byteBuffer.array(), byteBuffer.position() - i13, i13);
                        System.arraycopy(bArr, 0, byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), i13);
                    }
                    byteBuffer.rewind();
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(byteBuffer);
                    return createBitmap;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return null;
                }
            } finally {
            }
        }
    }

    void clearSurfaceOnRenderThread() {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers();
        }
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public String getErrorTrace() {
        int i11;
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            i11 = eglBase.getTrace();
        } else {
            i11 = 0;
        }
        return String.format(",\"eglTrace\":%d,\"render\":%d,\"renderFrame\":%d", Integer.valueOf(i11), Integer.valueOf(this.renderTrace), Integer.valueOf(this.renderFrameTrace));
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Initializing EglRenderer");
                    this.drawer = glDrawer;
                    this.offscreenDrawer = new OffScreenDrawer(glDrawer);
                    HandlerThread handlerThread = new HandlerThread("Z:" + this.name + TAG);
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    this.renderThreadHandler = handler;
                    ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: org.webrtc.k

                        /* renamed from: q */
                        public final /* synthetic */ EglBase.Context f118102q;

                        /* renamed from: r */
                        public final /* synthetic */ int[] f118103r;

                        public /* synthetic */ RunnableC24530k(EglBase.Context context2, int[] iArr2) {
                            r2 = context2;
                            r3 = iArr2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EglRenderer.this.lambda$init$0(r2, r3);
                        }
                    });
                    this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                } else {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void logD(String str) {
        Logging.m127853d(TAG, this.name + " " + str);
    }

    void logV(String str) {
        Logging.m127855v(TAG, this.name + " " + str);
    }

    void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.h

                    /* renamed from: q */
                    public final /* synthetic */ CountDownLatch f118097q;

                    public /* synthetic */ RunnableC24527h(CountDownLatch countDownLatch2) {
                        r2 = countDownLatch2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$release$1(r2);
                    }
                });
                this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.i

                    /* renamed from: q */
                    public final /* synthetic */ Looper f118099q;

                    public /* synthetic */ RunnableC24528i(Looper looper) {
                        r2 = looper;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$release$2(r2);
                    }
                });
                this.renderThreadHandler = null;
                int i11 = this.timeoutAwait;
                if (i11 <= 0) {
                    ThreadUtils.awaitUninterruptibly(countDownLatch2);
                } else {
                    ThreadUtils.awaitUninterruptibly(countDownLatch2, i11);
                }
                synchronized (this.frameLock) {
                    try {
                        VideoRenderer.I420Frame i420Frame = this.pendingFrame;
                        if (i420Frame != null) {
                            VideoRenderer.renderFrameDone(i420Frame);
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public void releaseEglSurface() {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, new Runnable() { // from class: org.webrtc.n
                        public /* synthetic */ RunnableC24533n() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EglRenderer.this.lambda$releaseEglSurface$3();
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void renderBlackFrame() {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: org.webrtc.j
                    public /* synthetic */ RunnableC24529j() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.renderBlackFrameOnRenderThread();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);        android.opengl.GLES20.glClear(16384);        android.opengl.GLES20.glEnable(3042);        android.opengl.GLES20.glBlendFunc(770, 771);        r1 = r10.scaleLock;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:            monitor-enter(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:            r2 = r10.scale;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:            monitor-exit(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:            r1 = 1.0f - r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:            r3 = r10.surfaceHeight;        r6 = (int) (r1 * r3);        r7 = (int) (r10.surfaceWidth * r2);        r8 = (int) (r2 * r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:            if (r10.circle == false) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:            r10.drawer.drawBlackCircle(r10.blackMatrix, 0, r6, r7, r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:            r10.eglBase.swapBuffers();     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:            if (r10.cornerRadius <= 0.0f) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:            r10.drawer.drawBlackCornerRectangle(r10.blackMatrix, 0, r6, r7, r8, r10.cornerRadius);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:            r10.drawer.drawBlack(r10.blackMatrix, 0, r6, r7, r8);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderBlackFrameOnRenderThread() {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            try {
                synchronized (this.layoutLock) {
                    int i11 = 0;
                    while (true) {
                        if (this.eglBase.surfaceWidth() == this.surfaceWidth && this.eglBase.surfaceHeight() == this.surfaceHeight) {
                            break;
                        }
                        i11++;
                        if (i11 > 3) {
                            logV("Failed to get surface of expected size - dropping frame.");
                            return;
                        } else {
                            logV("Surface size mismatch - clearing surface.");
                            clearSurfaceOnRenderThread();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else {
            logV("No surface");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0029, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x009c, code lost:            throw r10;     */
    @Override // org.webrtc.VideoRenderer.Callbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderFrame(VideoRenderer.I420Frame i420Frame, boolean z11) {
        boolean z12;
        this.effect = z11;
        this.renderTrace = 1;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        this.renderTrace = 2;
        synchronized (this.handlerLock) {
            try {
                this.renderTrace = 3;
                if (this.renderThreadHandler == null) {
                    logV("Dropping frame - Not initialized or already released.");
                    VideoRenderer.renderFrameDone(i420Frame);
                    this.renderTrace = 9;
                    return;
                }
                this.renderTrace = 4;
                synchronized (this.fpsReductionLock) {
                    if (this.minRenderPeriodNs > 0) {
                        long nanoTime = System.nanoTime();
                        long j11 = this.nextFrameTimeNs;
                        if (nanoTime < j11) {
                            logV("Dropping frame - fps reduction is active.");
                            VideoRenderer.renderFrameDone(i420Frame);
                            this.renderTrace = 9;
                            return;
                        } else {
                            long j12 = j11 + this.minRenderPeriodNs;
                            this.nextFrameTimeNs = j12;
                            this.nextFrameTimeNs = Math.max(j12, nanoTime);
                        }
                    }
                    this.renderTrace = 5;
                    synchronized (this.frameLock) {
                        VideoRenderer.I420Frame i420Frame2 = this.pendingFrame;
                        if (i420Frame2 != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.renderTrace = 6;
                        if (z12) {
                            VideoRenderer.renderFrameDone(i420Frame2);
                        }
                        this.pendingFrame = i420Frame;
                        this.renderThreadHandler.post(this.renderFrameRunnable);
                    }
                    this.renderTrace = 7;
                    if (z12) {
                        synchronized (this.statisticsLock) {
                            this.framesDropped++;
                        }
                    }
                    this.renderTrace = 9;
                }
            } finally {
            }
        }
    }

    public boolean renderFrameNV21(byte[] bArr, int i11, int i12, int i13, long j11) {
        synchronized (this.handlerLock) {
            try {
                boolean z11 = false;
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return false;
                }
                int i14 = i11 * i12;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i14 / 4);
                ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(bArr, 0, i14), ByteBuffer.allocateDirect(i14 / 4), allocateDirect};
                UtilityJNI.convert_nv21_to_i420_uv_plane_only(bArr, i14, i14 / 2, byteBufferArr[1], allocateDirect);
                VideoRenderer.I420Frame i420Frame = new VideoRenderer.I420Frame(i11, i12, i13, new int[]{i11, i11 / 2, i11 / 2}, byteBufferArr, 0L, j11, VideoRenderer.I420Frame.TextureType.NON_TEXTURE.ordinal());
                synchronized (this.frameLock) {
                    try {
                        VideoRenderer.I420Frame i420Frame2 = this.pendingFrame;
                        if (i420Frame2 != null) {
                            z11 = true;
                        }
                        this.renderTrace = 6;
                        if (z11) {
                            VideoRenderer.renderFrameDone(i420Frame2);
                        }
                        this.pendingFilterFrame = i420Frame;
                        this.renderThreadHandler.post(this.renderFrameRunnable);
                    } finally {
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void renderFrameOnRenderThread() {
        VideoRenderer.I420Frame i420Frame;
        boolean z11;
        float[] identityMatrix;
        float f11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        this.renderFrameTrace = 1;
        synchronized (this.frameLock) {
            try {
                VideoRenderer.I420Frame i420Frame2 = this.pendingFrame;
                if (i420Frame2 == null && this.pendingFilterFrame == null) {
                    this.renderFrameTrace = 14;
                    return;
                }
                if (i420Frame2 != null) {
                    this.pendingFrame = null;
                    i420Frame = i420Frame2;
                    z11 = false;
                } else {
                    VideoRenderer.I420Frame i420Frame3 = this.pendingFilterFrame;
                    this.pendingFilterFrame = null;
                    i420Frame = i420Frame3;
                    z11 = true;
                }
                this.renderFrameTrace = 2;
                EglBase eglBase = this.eglBase;
                if (eglBase != null && eglBase.hasSurface()) {
                    this.renderFrameTrace = 3;
                    long nanoTime = System.nanoTime();
                    float[] rotateTextureMatrix = RendererCommon.rotateTextureMatrix(i420Frame.samplingMatrix, i420Frame.rotationDegree);
                    int i15 = this.surfaceWidth;
                    int i16 = this.surfaceHeight;
                    this.renderFrameTrace = 4;
                    this.offscreenDrawer.init(i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), this.surfaceTextureHelper);
                    synchronized (this.layoutLock) {
                        try {
                            if (this.isAnim) {
                                if (this.eglBase.surfaceWidth() == this.surfaceWidth) {
                                    if (this.eglBase.surfaceHeight() != this.surfaceHeight) {
                                    }
                                }
                                i16 = this.eglBase.surfaceHeight();
                                i15 = this.eglBase.surfaceWidth();
                            } else {
                                this.renderFrameTrace = 5;
                                int i17 = 0;
                                while (true) {
                                    if (this.eglBase.surfaceWidth() == this.surfaceWidth && this.eglBase.surfaceHeight() == this.surfaceHeight) {
                                        break;
                                    }
                                    i17++;
                                    if (i17 > 3) {
                                        logV("Failed to get surface of expected size - dropping frame.");
                                        VideoRenderer.renderFrameDone(i420Frame);
                                        return;
                                    }
                                    logV("Surface size mismatch - clearing surface from " + this.eglBase.surfaceWidth() + "x " + this.eglBase.surfaceHeight() + " -> " + this.surfaceWidth + "x" + this.surfaceHeight + " ; isAnim = " + this.isAnim);
                                    this.renderFrameTrace = 6;
                                    clearSurfaceOnRenderThread();
                                    this.renderFrameTrace = 7;
                                }
                            }
                            int i18 = i15;
                            int i19 = i16;
                            this.renderFrameTrace = 8;
                            if (this.layoutAspectRatio > 0.0f) {
                                int i21 = C245102.$SwitchMap$org$webrtc$EglRenderer$RenderMode[this.videoRenderMode.ordinal()];
                                if (i21 != 1 && i21 != 2) {
                                    identityMatrix = RendererCommon.getLayoutMatrix(this.mirror, i420Frame.rotatedWidth() / i420Frame.rotatedHeight(), this.layoutAspectRatio);
                                } else {
                                    identityMatrix = RendererCommon.getLayoutMatrix(this.mirror, i420Frame.rotatedWidth() / i420Frame.rotatedHeight(), i18, i19, this.videoRenderMode);
                                }
                            } else if (this.mirror) {
                                identityMatrix = RendererCommon.horizontalFlipMatrix();
                            } else {
                                identityMatrix = RendererCommon.identityMatrix();
                            }
                            float[] multiplyMatrices = RendererCommon.multiplyMatrices(rotateTextureMatrix, identityMatrix);
                            this.renderFrameTrace = 9;
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(16384);
                            GLES20.glEnable(3042);
                            GLES20.glBlendFunc(770, 771);
                            synchronized (this.scaleLock) {
                                f11 = this.scale;
                            }
                            float f12 = i19;
                            int i22 = (int) ((1.0f - f11) * f12);
                            int i23 = (int) (i18 * f11);
                            int i24 = (int) (f11 * f12);
                            try {
                                if (i420Frame.yuvFrame) {
                                    if (this.yuvTextures == null) {
                                        this.yuvTextures = new int[3];
                                        for (int i25 = 0; i25 < 3; i25++) {
                                            this.yuvTextures[i25] = GlUtil.generateTexture(3553);
                                        }
                                    }
                                    this.renderFrameTrace = 10;
                                    this.yuvUploader.uploadYuvData(this.yuvTextures, i420Frame.width, i420Frame.height, i420Frame.yuvStrides, i420Frame.yuvPlanes);
                                    if (this.circle) {
                                        i13 = i22;
                                        i11 = i19;
                                        i14 = i18;
                                        this.drawer.drawYuvCircle(this.yuvTextures, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, z11);
                                    } else {
                                        i13 = i22;
                                        i11 = i19;
                                        if (this.cornerRadius > 0.0f) {
                                            i14 = i18;
                                            this.drawer.drawYuvCornerRectangle(this.yuvTextures, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i13, i23, i24, this.cornerRadius, z11);
                                        } else {
                                            i14 = i18;
                                            this.drawer.drawYuv(this.yuvTextures, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i13, i23, i24, z11);
                                        }
                                    }
                                    if (z11) {
                                        float[] multiplyMatrices2 = RendererCommon.multiplyMatrices(RendererCommon.rotateTextureMatrix(i420Frame.samplingMatrix, i420Frame.rotationDegree), RendererCommon.horizontalFlipMatrix());
                                        this.eglBase.swapBuffers();
                                        this.offscreenDrawer.drawFilterAndSendFrame(this.yuvTextures, multiplyMatrices2, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i13, 0, i420Frame.timestamp);
                                    }
                                    i12 = i14;
                                } else {
                                    i11 = i19;
                                    i12 = i18;
                                    if (i420Frame.textureType == VideoRenderer.I420Frame.TextureType.TEXTURE_2D.ordinal()) {
                                        if (this.circle) {
                                            this.drawer.drawRGBCircle(i420Frame.textureId, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, false);
                                        } else if (this.cornerRadius > 0.0f) {
                                            this.drawer.drawRGBCornerRectangle(i420Frame.textureId, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, this.cornerRadius);
                                        } else {
                                            this.drawer.drawRGB(i420Frame.textureId, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, false);
                                        }
                                    } else if (this.circle) {
                                        this.drawer.drawOesCircle(i420Frame.textureId, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, false);
                                    } else if (this.cornerRadius > 0.0f) {
                                        this.drawer.drawOesCornerRectangle(i420Frame.textureId, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, this.cornerRadius);
                                    } else {
                                        this.drawer.drawOes(i420Frame.textureId, multiplyMatrices, i420Frame.rotatedWidth(), i420Frame.rotatedHeight(), 0, i22, i23, i24, false);
                                    }
                                }
                                this.renderFrameTrace = 11;
                                RendererListener rendererListener = this.mListenner;
                                if (rendererListener != null) {
                                    rendererListener.onDraw(i12, i11);
                                }
                                z12 = false;
                            } catch (Exception e11) {
                                Logging.m127854e("DUNGNNTEST", "Render frame failed " + e11.toString());
                                z12 = true;
                            }
                            long nanoTime2 = System.nanoTime();
                            this.renderFrameTrace = 12;
                            if (z11) {
                                VideoRenderer.renderFrameDone(i420Frame);
                            } else {
                                try {
                                    this.eglBase.swapBuffers();
                                    VideoRenderer.renderFrameDone(i420Frame);
                                } catch (Exception e12) {
                                    Logging.m127854e(TAG, "Swap buffer failed " + e12.toString());
                                }
                            }
                            this.renderFrameTrace = 13;
                            if (!z12) {
                                long nanoTime3 = System.nanoTime();
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs += nanoTime3 - nanoTime;
                                    this.renderSwapBufferTimeNs += nanoTime3 - nanoTime2;
                                }
                            } else {
                                RendererListener rendererListener2 = this.mListenner;
                                if (rendererListener2 != null && !this.isNotiFailRender) {
                                    this.isNotiFailRender = true;
                                    rendererListener2.onRenderFail();
                                }
                            }
                            this.renderFrameTrace = 14;
                            return;
                        } finally {
                        }
                    }
                }
                logV("Dropping frame - No surface");
                VideoRenderer.renderFrameDone(i420Frame);
                this.renderFrameTrace = 14;
            } finally {
            }
        }
    }

    public void scale(float f11) {
        synchronized (this.scaleLock) {
            this.scale = f11;
        }
    }

    public void setAnim(boolean z11) {
        logV("isAnim: " + z11);
        this.isAnim = z11;
    }

    public void setCircle(boolean z11) {
        logV("setCircle: " + z11);
        this.circle = z11;
    }

    public void setCorner(float f11) {
        logV("setCorner: " + f11);
        this.cornerRadius = f11;
    }

    public void setLayoutAspectRatio(float f11) {
        logV("setLayoutAspectRatio: " + f11);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f11;
        }
    }

    public void setMirror(boolean z11) {
        logV("setMirror: " + z11);
        synchronized (this.layoutLock) {
            this.mirror = z11;
        }
    }

    public void setRendererListener(RendererListener rendererListener) {
        this.mListenner = rendererListener;
    }

    public void setTimeoutAwait(int i11) {
        this.timeoutAwait = i11;
    }

    public void setVideoRenderMode(RenderMode renderMode) {
        logV("setVideoRenderMode: " + renderMode);
        synchronized (this.layoutLock) {
            this.videoRenderMode = renderMode;
        }
    }

    public void skipRenderFrame(VideoRenderer.I420Frame i420Frame) {
        synchronized (this.handlerLock) {
            logV("Skipping frame - Skipping frame cause by a reason.");
            VideoRenderer.renderFrameDone(i420Frame);
        }
    }

    public void surfaceSizeChanged(int i11, int i12) {
        logD("Surface size changed: " + i11 + "x" + i12);
        synchronized (this.layoutLock) {
            this.surfaceWidth = i11;
            this.surfaceHeight = i12;
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }
}
