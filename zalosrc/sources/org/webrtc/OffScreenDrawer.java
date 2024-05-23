package org.webrtc;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.videofilter.ZVideoFilter;
import p097db.AbstractC17849h;

/* loaded from: classes7.dex */
public class OffScreenDrawer {
    private RendererCommon.GlDrawer drawer;
    private GlFramebufferObject fbo;
    private ByteBuffer rgbData;
    private SurfaceTextureHelper surfaceTextureHelper;
    private float[] yuvConvertTexMatrix;
    private ByteBuffer yuvData;
    private int lastFrameWidth = 0;
    private int lastFrameHeight = 0;
    private int yuvLength = 0;
    private int rgbLength = 0;
    private int stride = 0;

    public OffScreenDrawer(RendererCommon.GlDrawer glDrawer) {
        this.drawer = glDrawer;
    }

    private ByteBuffer convertRGBtoYUV(int i11, int i12) {
        if (this.surfaceTextureHelper != null && this.yuvData != null) {
            restoreFrameBuffer();
            this.surfaceTextureHelper.textureToYUV(this.yuvData, i11, i12, this.stride, this.fbo.getTexName(), this.yuvConvertTexMatrix);
            return this.yuvData;
        }
        return null;
    }

    private void drawYUVToFBO(int[] iArr, float[] fArr, int i11, int i12, int i13, int i14, int i15) {
        GlFramebufferObject glFramebufferObject = this.fbo;
        if (glFramebufferObject != null) {
            glFramebufferObject.enable();
            this.drawer.drawYuv(iArr, fArr, i13, i14, i11, i12, i13, i14, true);
        }
    }

    private void restoreFrameBuffer() {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFinish();
    }

    private void sendFrameAppliedFilter(int i11, int i12, int i13) {
        GLES20.glReadPixels(0, 0, i11, i12, 6408, 5121, this.rgbData);
        ByteBuffer byteBuffer = this.rgbData;
        if (byteBuffer != null && byteBuffer.hasArray() && this.rgbData.limit() == this.rgbLength) {
            AbstractC17849h.m94297f(this.rgbData.array(), this.rgbData.arrayOffset(), this.rgbData.limit(), i11, i12, this.stride, i13, 0L);
        }
        restoreFrameBuffer();
    }

    private void setupFBO(int i11, int i12) {
        if (this.lastFrameWidth != i11 || this.lastFrameHeight != i12) {
            GlFramebufferObject glFramebufferObject = this.fbo;
            if (glFramebufferObject != null) {
                glFramebufferObject.release();
                this.fbo = null;
            }
            this.lastFrameWidth = i11;
            this.lastFrameHeight = i12;
            this.stride = ((i11 + 7) / 8) * 8;
        }
        if (this.fbo == null) {
            GlFramebufferObject glFramebufferObject2 = new GlFramebufferObject();
            this.fbo = glFramebufferObject2;
            try {
                glFramebufferObject2.setup(i11, i12);
            } catch (Exception unused) {
            }
            this.yuvConvertTexMatrix = RendererCommon.rotateTextureMatrix(RendererCommon.horizontalFlipMatrix(), 0.0f);
            int i13 = ((this.stride * i12) * 3) / 2;
            this.yuvLength = i13;
            this.yuvData = ByteBuffer.allocateDirect(i13);
            int i14 = i11 * i12 * 4;
            this.rgbLength = i14;
            this.rgbData = ByteBuffer.allocateDirect(i14);
        }
    }

    public void drawFilterAndSendFrame(int[] iArr, float[] fArr, int i11, int i12, int i13, int i14, int i15, long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        drawYUVToFBO(iArr, fArr, i13, i14, i11, i12, i15);
        ByteBuffer convertRGBtoYUV = convertRGBtoYUV(i11, i12);
        ZVideoFilter.Stat.applyFilterTime.addValue((int) (System.currentTimeMillis() - currentTimeMillis));
        if (convertRGBtoYUV != null && convertRGBtoYUV.hasArray() && convertRGBtoYUV.limit() == this.yuvLength) {
            AbstractC17849h.m94297f(convertRGBtoYUV.array(), convertRGBtoYUV.arrayOffset(), convertRGBtoYUV.limit(), i11, i12, this.stride, i15, j11);
        }
    }

    public void init(int i11, int i12, SurfaceTextureHelper surfaceTextureHelper) {
        setupFBO(i11, i12);
        this.surfaceTextureHelper = surfaceTextureHelper;
    }
}
