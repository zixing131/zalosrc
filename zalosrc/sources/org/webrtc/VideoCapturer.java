package org.webrtc;

import android.content.Context;

/* loaded from: classes7.dex */
public interface VideoCapturer {

    /* loaded from: classes7.dex */
    public interface CapturerObserver {
        void onByteBufferFrameCaptured(byte[] bArr, int i11, int i12, int i13, long j11);

        void onCapturerStarted(boolean z11);

        void onCapturerStopped();

        void onSwitchCameraDone(boolean z11);

        void onTextureFrameCaptured(int i11, int i12, int i13, float[] fArr, int i14, long j11);
    }

    void changeCaptureFormat(int i11, int i12, int i13);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    void startCapture(int i11, int i12, int i13);

    void stopCapture() throws InterruptedException;
}
