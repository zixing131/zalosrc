package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoRenderer;
import org.webrtc.videofilter.ZVideoFilterManager;

/* loaded from: classes7.dex */
public class TextureViewRenderer extends TextureView implements TextureView.SurfaceTextureListener, VideoRenderer.Callbacks, EglRenderer.RendererListener {
    private static final String TAG = "TextureViewRenderer";
    private OnNextRenderCallback actionOnNextRender;
    private EglRenderer eglRenderer;
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private final Object layoutLock;
    private Point mSize;
    private ICallbackSurfaceViewCreated mSurfaceViewCreatedCallback;
    private ViewRenderListener renderListener;
    private String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public TextureViewRenderer(Context context, String str) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        initContructor(str);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public void addHeart() {
    }

    public void finishRender() {
    }

    public String getErrorTrace() {
        EglRenderer eglRenderer = this.eglRenderer;
        if (eglRenderer != null) {
            return eglRenderer.getErrorTrace();
        }
        return "";
    }

    public int getRotatedFrameHeight() {
        return this.rotatedFrameHeight;
    }

    public int getRotatedFrameWidth() {
        return this.rotatedFrameWidth;
    }

    public void init(EglBase.Context context) {
        init(context, EglBase.CONFIG_RGBA, new GlRectDrawer());
    }

    void initContructor(String str) {
        this.resourceName = str;
        EglRenderer eglRenderer = new EglRenderer(str);
        this.eglRenderer = eglRenderer;
        eglRenderer.setRendererListener(this);
        setSurfaceTextureListener(this);
    }

    @Override // org.webrtc.EglRenderer.RendererListener
    public void onDraw(int i11, int i12) {
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ThreadUtils.checkIsOnMainThread();
        Logging.m127855v(TAG, String.format("On layout change, left:%d, top:%d, right:%d, bottom:%d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        this.eglRenderer.setLayoutAspectRatio((i13 - i11) / (i14 - i12));
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        Point measure;
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            measure = this.videoLayoutMeasure.measure(i11, i12, this.rotatedFrameWidth, this.rotatedFrameHeight);
            this.mSize = measure;
        }
        setMeasuredDimension(measure.x, measure.y);
        Logging.m127853d(TAG, "onMeasure(). New size: " + measure.x + "x" + measure.y);
    }

    @Override // org.webrtc.EglRenderer.RendererListener
    public void onRenderFail() {
        ViewRenderListener viewRenderListener = this.renderListener;
        if (viewRenderListener != null) {
            viewRenderListener.onRenderFail();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.createEglSurface(surfaceTexture);
        this.eglRenderer.surfaceSizeChanged(i11, i12);
        this.eglRenderer.renderBlackFrame();
        ICallbackSurfaceViewCreated iCallbackSurfaceViewCreated = this.mSurfaceViewCreatedCallback;
        if (iCallbackSurfaceViewCreated != null) {
            iCallbackSurfaceViewCreated.onSurfaceViewCreated(1);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.releaseEglSurface();
        ICallbackSurfaceViewCreated iCallbackSurfaceViewCreated = this.mSurfaceViewCreatedCallback;
        if (iCallbackSurfaceViewCreated != null) {
            iCallbackSurfaceViewCreated.onSurfaceViewCreated(0);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.surfaceSizeChanged(i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void registerActionOnNextRender(OnNextRenderCallback onNextRenderCallback) {
        this.actionOnNextRender = onNextRenderCallback;
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
                    if (viewRenderListener != null) {
                        int i11 = this.rotatedFrameWidth;
                        Point point = this.mSize;
                        viewRenderListener.onVideoFrameChange(i11, rotatedHeight, point.x, point.y);
                    }
                    Logging.m127853d(this.resourceName, "w, h: " + this.rotatedFrameWidth + ", " + this.rotatedFrameHeight + " degree: " + this.frameRotation);
                    post(new Runnable() { // from class: org.webrtc.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextureViewRenderer.this.requestLayout();
                        }
                    });
                }
                OnNextRenderCallback onNextRenderCallback = this.actionOnNextRender;
                if (onNextRenderCallback != null) {
                    onNextRenderCallback.onNextRender();
                    this.actionOnNextRender = null;
                }
                this.eglRenderer.renderFrame(i420Frame, z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void retryFailRender() {
        this.eglRenderer.release();
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
        setOpaque(z11 ^ true);
    }

    public void setCorner(float f11) {
        boolean z11;
        Logging.m127853d(TAG, "setCorner " + f11);
        this.eglRenderer.setCorner(f11);
        if (f11 <= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        setOpaque(z11);
    }

    public void setFrameAnim(int i11, int i12, int i13, int i14) {
    }

    public void setMirror(boolean z11) {
        this.eglRenderer.setMirror(z11);
    }

    public void setRenderListener(ViewRenderListener viewRenderListener) {
        this.renderListener = viewRenderListener;
    }

    public void setRole(boolean z11) {
        Logging.m127853d(TAG, "setRole " + z11);
        if (z11) {
            ZVideoFilterManager.regisRenderer(this.eglRenderer);
        }
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

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        this.eglRenderer.init(context, iArr, glDrawer);
    }

    public TextureViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        initContructor(getResourceName());
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        initContructor(getResourceName());
    }
}
