package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import go0.C19525a;
import ho0.AbstractC20110a;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoRenderer;

/* loaded from: classes7.dex */
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, VideoRenderer.Callbacks, EglRenderer.RendererListener {
    private static final String TAG = "SurfaceViewRenderer";
    private EglRenderer eglRenderer;
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private final Object layoutLock;
    private C19525a mAnimHeart;
    private Point mSize;
    private ICallbackSurfaceViewCreated mSurfaceViewCreatedCallback;
    private ViewRenderListener renderListener;
    private String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public SurfaceViewRenderer(Context context, String str) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        initContructor(str);
    }

    public void addHeart() {
        C19525a c19525a = this.mAnimHeart;
        if (c19525a != null) {
            c19525a.m102063b();
        }
    }

    public Bitmap captureFrame() {
        EglRenderer eglRenderer = this.eglRenderer;
        if (eglRenderer != null) {
            return eglRenderer.captureFrame();
        }
        return null;
    }

    public void finishRender() {
        C19525a c19525a = this.mAnimHeart;
        if (c19525a != null) {
            c19525a.m102064f();
        }
    }

    public String getErrorTrace() {
        EglRenderer eglRenderer = this.eglRenderer;
        if (eglRenderer != null) {
            return eglRenderer.getErrorTrace();
        }
        return "";
    }

    public void init(EglBase.Context context) {
        init(context, EglBase.CONFIG_RGBA, new GlRectDrawer());
    }

    void initContructor(String str) {
        this.resourceName = str;
        EglRenderer eglRenderer = new EglRenderer(str);
        this.eglRenderer = eglRenderer;
        eglRenderer.setRendererListener(this);
        getHolder().addCallback(this);
    }

    @Override // org.webrtc.EglRenderer.RendererListener
    public void onDraw(int i11, int i12) {
        if (this.mAnimHeart == null) {
            C19525a c19525a = new C19525a();
            this.mAnimHeart = c19525a;
            c19525a.m102067j();
            this.mAnimHeart.m102066i(i11, i12);
            setFrameAnim(0, 0, i11, i12);
        }
        this.mAnimHeart.m102065h();
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ThreadUtils.checkIsOnMainThread();
        Logging.m127855v(TAG, String.format("On layout change, left:%d, top:%d, right:%d, bottom:%d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        this.eglRenderer.setLayoutAspectRatio((i13 - i11) / (i14 - i12));
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i11, int i12) {
        Point measure;
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            try {
                measure = this.videoLayoutMeasure.measure(i11, i12, this.rotatedFrameWidth, this.rotatedFrameHeight);
                this.mSize = measure;
                ViewRenderListener viewRenderListener = this.renderListener;
                if (viewRenderListener != null && measure != null) {
                    viewRenderListener.onVideoFrameChange(this.rotatedFrameWidth, this.rotatedFrameHeight, measure.x, measure.y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (measure != null) {
            setMeasuredDimension(measure.x, measure.y);
        }
    }

    @Override // org.webrtc.EglRenderer.RendererListener
    public void onRenderFail() {
    }

    public void registerSurfaceViewCallback(ICallbackSurfaceViewCreated iCallbackSurfaceViewCreated) {
        this.mSurfaceViewCreatedCallback = iCallbackSurfaceViewCreated;
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void renderBlackFrame() {
        EglRenderer eglRenderer = this.eglRenderer;
        if (eglRenderer != null) {
            eglRenderer.renderBlackFrame();
        }
    }

    @Override // org.webrtc.VideoRenderer.Callbacks
    public void renderFrame(VideoRenderer.I420Frame i420Frame, boolean z11) {
        Point point;
        synchronized (this.layoutLock) {
            try {
                if (this.mSize == null) {
                    this.eglRenderer.skipRenderFrame(i420Frame);
                    return;
                }
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                }
                if (this.rotatedFrameWidth != i420Frame.rotatedWidth() || this.rotatedFrameHeight != i420Frame.rotatedHeight() || this.frameRotation != i420Frame.rotationDegree) {
                    this.rotatedFrameWidth = i420Frame.rotatedWidth();
                    int rotatedHeight = i420Frame.rotatedHeight();
                    this.rotatedFrameHeight = rotatedHeight;
                    this.frameRotation = i420Frame.rotationDegree;
                    ViewRenderListener viewRenderListener = this.renderListener;
                    if (viewRenderListener != null && (point = this.mSize) != null) {
                        viewRenderListener.onVideoFrameChange(this.rotatedFrameWidth, rotatedHeight, point.x, point.y);
                    }
                    post(new Runnable() { // from class: org.webrtc.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            SurfaceViewRenderer.this.requestLayout();
                        }
                    });
                }
                this.eglRenderer.renderFrame(i420Frame, z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void scale(float f11) {
        if (f11 >= 0.0f && f11 <= 1.0f) {
            this.eglRenderer.scale(f11);
        }
    }

    public void setAnim(boolean z11) {
        Logging.m127853d(TAG, "setAnim " + z11);
        this.eglRenderer.setAnim(z11);
    }

    public void setCircle(boolean z11) {
        Logging.m127853d(TAG, "setCircle " + z11);
        this.eglRenderer.setCircle(z11);
        if (z11) {
            getHolder().setFormat(-3);
        } else {
            getHolder().setFormat(3);
        }
    }

    public void setCorner(float f11) {
        Logging.m127853d(TAG, "setCorner " + f11);
        this.eglRenderer.setCorner(f11);
        if (f11 > 0.0f) {
            getHolder().setFormat(-3);
        } else {
            getHolder().setFormat(3);
        }
    }

    public void setFrameAnim(int i11, int i12, int i13, int i14) {
        C19525a c19525a = this.mAnimHeart;
        if (c19525a != null) {
            c19525a.m102068k(((i13 * 9) / 10) - i11, (i14 / 12) - i12, i13, i14);
        }
    }

    public void setMirror(boolean z11) {
        this.eglRenderer.setMirror(z11);
    }

    public void setRenderListener(ViewRenderListener viewRenderListener) {
        this.renderListener = viewRenderListener;
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
    }

    public void setTimeoutAwait(int i11) {
        EglRenderer eglRenderer = this.eglRenderer;
        if (eglRenderer != null) {
            eglRenderer.setTimeoutAwait(i11);
        }
    }

    public void setVideoRenderMode(EglRenderer.RenderMode renderMode) {
        this.eglRenderer.setVideoRenderMode(renderMode);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.surfaceSizeChanged(i12, i13);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.createEglSurface(surfaceHolder.getSurface());
        ICallbackSurfaceViewCreated iCallbackSurfaceViewCreated = this.mSurfaceViewCreatedCallback;
        if (iCallbackSurfaceViewCreated != null) {
            iCallbackSurfaceViewCreated.onSurfaceViewCreated(1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.releaseEglSurface();
        ICallbackSurfaceViewCreated iCallbackSurfaceViewCreated = this.mSurfaceViewCreatedCallback;
        if (iCallbackSurfaceViewCreated != null) {
            iCallbackSurfaceViewCreated.onSurfaceViewCreated(0);
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        this.eglRenderer.init(context, iArr, glDrawer);
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        String str;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        try {
            str = getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException e11) {
            AbstractC20110a.m104539h(e11);
            str = "";
        }
        initContructor(str);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        try {
            str = getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException e11) {
            AbstractC20110a.m104539h(e11);
            str = "";
        }
        initContructor(str);
    }
}
