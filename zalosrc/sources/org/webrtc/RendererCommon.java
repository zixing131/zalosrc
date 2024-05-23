package org.webrtc;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.View;
import java.nio.ByteBuffer;
import org.webrtc.EglRenderer;

/* loaded from: classes7.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.RendererCommon$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C245131 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$EglRenderer$RenderMode;
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EglRenderer.RenderMode.values().length];
            $SwitchMap$org$webrtc$EglRenderer$RenderMode = iArr2;
            try {
                iArr2[EglRenderer.RenderMode.ScaleToFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$EglRenderer$RenderMode[EglRenderer.RenderMode.AspectScaleToFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$webrtc$EglRenderer$RenderMode[EglRenderer.RenderMode.AspectScaleToFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface GlDrawer {
        void drawBlack(float[] fArr, int i11, int i12, int i13, int i14);

        void drawBlackCircle(float[] fArr, int i11, int i12, int i13, int i14);

        void drawBlackCornerRectangle(float[] fArr, int i11, int i12, int i13, int i14, float f11);

        void drawOes(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11);

        void drawOesCircle(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11);

        void drawOesCornerRectangle(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, float f11);

        void drawRGB(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11);

        void drawRGBCircle(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11);

        void drawRGBCornerRectangle(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, float f11);

        void drawYuv(int[] iArr, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11);

        void drawYuvCircle(int[] iArr, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11);

        void drawYuvCornerRectangle(int[] iArr, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, float f11, boolean z11);

        void release();
    }

    /* loaded from: classes7.dex */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* loaded from: classes7.dex */
    public static class VideoLayoutMeasure {
        private ScalingType scalingTypeMatchOrientation;
        private ScalingType scalingTypeMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public Point measure(int i11, int i12, int i13, int i14) {
            boolean z11;
            ScalingType scalingType;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i11);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i12);
            if (i13 != 0 && i14 != 0 && defaultSize != 0 && defaultSize2 != 0) {
                float f11 = i13 / i14;
                float f12 = defaultSize / defaultSize2;
                boolean z12 = false;
                if (f11 > 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (f12 > 1.0f) {
                    z12 = true;
                }
                if (z11 == z12) {
                    scalingType = this.scalingTypeMatchOrientation;
                } else {
                    scalingType = this.scalingTypeMismatchOrientation;
                }
                Point displaySize = RendererCommon.getDisplaySize(scalingType, f11, defaultSize, defaultSize2);
                if (View.MeasureSpec.getMode(i11) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i12) == 1073741824) {
                    displaySize.y = defaultSize2;
                }
                return displaySize;
            }
            return new Point(defaultSize, defaultSize2);
        }

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }
    }

    /* loaded from: classes7.dex */
    public static class YuvUploader {
        private ByteBuffer copyBuffer;

        public void uploadYuvData(int[] iArr, int i11, int i12, int[] iArr2, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i13 = i11 / 2;
            int[] iArr3 = {i11, i13, i13};
            int i14 = i12 / 2;
            int[] iArr4 = {i12, i14, i14};
            int i15 = 0;
            for (int i16 = 0; i16 < 3; i16++) {
                int i17 = iArr2[i16];
                int i18 = iArr3[i16];
                if (i17 > i18) {
                    i15 = Math.max(i15, i18 * iArr4[i16]);
                }
            }
            if (i15 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i15)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i15);
            }
            for (int i19 = 0; i19 < 3; i19++) {
                GLES20.glActiveTexture(33984 + i19);
                GLES20.glBindTexture(3553, iArr[i19]);
                int i21 = iArr2[i19];
                int i22 = iArr3[i19];
                if (i21 == i22) {
                    byteBuffer = byteBufferArr[i19];
                } else {
                    VideoRenderer.nativeCopyPlane(byteBufferArr[i19], i22, iArr4[i19], i21, this.copyBuffer, i22);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr3[i19], iArr4[i19], 0, 6409, 5121, byteBuffer);
            }
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f11 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f11;
        float f12 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f12;
        fArr[12] = f11 + 0.5f;
        fArr[13] = f12 + 0.5f;
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i11 = C245131.$SwitchMap$org$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return BALANCED_VISIBLE_FRACTION;
                }
                throw new IllegalArgumentException();
            }
            return 0.0f;
        }
        return 1.0f;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f11, int i11, int i12) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f11, i11, i12);
    }

    public static float[] getLayoutMatrix(boolean z11, float f11, float f12) {
        float f13;
        float f14;
        if (f12 > f11) {
            f14 = f11 / f12;
            f13 = 1.0f;
        } else {
            f13 = f12 / f11;
            f14 = 1.0f;
        }
        if (z11) {
            f13 *= -1.0f;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, f13, f14, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static final float[] horizontalFlipMatrix() {
        return new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] identityMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] multiplyMatrices(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    public static float[] rotateTextureMatrix(float[] fArr, float f11) {
        float[] fArr2 = new float[16];
        Matrix.setRotateM(fArr2, 0, f11, 0.0f, 0.0f, 1.0f);
        adjustOrigin(fArr2);
        return multiplyMatrices(fArr, fArr2);
    }

    public static final float[] verticalFlipMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }

    private static Point getDisplaySize(float f11, float f12, int i11, int i12) {
        if (f11 != 0.0f && f12 != 0.0f) {
            return new Point(Math.min(i11, Math.round((i12 / f11) * f12)), Math.min(i12, Math.round((i11 / f11) / f12)));
        }
        return new Point(i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:            if (r6 < r5) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:            r4 = r4 / (r5 * r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:            r5 = r5 / r6;        r4 = 1.0f;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:            if (r6 > r5) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float[] getLayoutMatrix(boolean z11, float f11, float f12, float f13, EglRenderer.RenderMode renderMode) {
        float f14;
        float f15;
        float f16;
        int i11 = C245131.$SwitchMap$org$webrtc$EglRenderer$RenderMode[renderMode.ordinal()];
        if (i11 == 2) {
            f14 = f12 / f11;
        } else if (i11 != 3) {
            f16 = 1.0f;
            f15 = 1.0f;
        } else {
            f14 = f12 / f11;
        }
        if (z11) {
            f16 *= -1.0f;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, f16, f15, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }
}
