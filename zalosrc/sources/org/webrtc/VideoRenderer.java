package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class VideoRenderer {

    /* loaded from: classes7.dex */
    public interface Callbacks {
        void renderFrame(I420Frame i420Frame, boolean z11);
    }

    public static native void nativeCopyPlane(ByteBuffer byteBuffer, int i11, int i12, int i13, ByteBuffer byteBuffer2, int i14);

    static native void releaseNativeFrame(long j11);

    public static void renderFrameDone(I420Frame i420Frame) {
        i420Frame.yuvPlanes = null;
        i420Frame.textureId = 0;
        long j11 = i420Frame.nativeFramePointer;
        if (j11 != 0) {
            releaseNativeFrame(j11);
            i420Frame.nativeFramePointer = 0L;
        }
    }

    /* loaded from: classes7.dex */
    public static class I420Frame {
        public final int height;
        long nativeFramePointer;
        public int rotationDegree;
        public final float[] samplingMatrix;
        public int textureId;
        public final int textureType;
        public final long timestamp;
        public final int width;
        public final boolean yuvFrame;
        public ByteBuffer[] yuvPlanes;
        public final int[] yuvStrides;

        /* loaded from: classes7.dex */
        public enum TextureType {
            NON_TEXTURE,
            OES_TEXTURE,
            TEXTURE_2D
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public I420Frame(int i11, int i12, int i13, int[] iArr, ByteBuffer[] byteBufferArr, long j11, long j12, int i14) {
            this.width = i11;
            this.height = i12;
            this.yuvStrides = iArr;
            this.yuvPlanes = byteBufferArr;
            this.textureType = i14;
            this.yuvFrame = true;
            this.rotationDegree = i13;
            this.nativeFramePointer = j11;
            this.timestamp = j12;
            if (i13 % 90 == 0) {
                this.samplingMatrix = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
                return;
            }
            throw new IllegalArgumentException("Rotation degree not multiple of 90: " + i13);
        }

        public int rotatedHeight() {
            if (this.rotationDegree % 180 == 0) {
                return this.height;
            }
            return this.width;
        }

        public int rotatedWidth() {
            if (this.rotationDegree % 180 == 0) {
                return this.width;
            }
            return this.height;
        }

        I420Frame(int i11, int i12, int i13, int i14, float[] fArr, long j11, long j12, int i15) {
            this.width = i11;
            this.height = i12;
            this.textureType = i15;
            this.yuvStrides = null;
            this.yuvPlanes = null;
            this.samplingMatrix = fArr;
            this.textureId = i14;
            this.yuvFrame = false;
            this.rotationDegree = i13;
            this.nativeFramePointer = j11;
            this.timestamp = j12;
            if (i13 % 90 == 0) {
                return;
            }
            throw new IllegalArgumentException("Rotation degree not multiple of 90: " + i13);
        }
    }
}
