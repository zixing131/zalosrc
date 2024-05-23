package org.webrtc;

/* loaded from: classes7.dex */
public interface CameraSession {

    /* loaded from: classes7.dex */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(String str);
    }

    /* loaded from: classes7.dex */
    public interface Events {
        void onByteBufferFrameCaptured(CameraSession cameraSession, byte[] bArr, int i11, int i12, int i13, long j11);

        void onCameraClosed(CameraSession cameraSession);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onTextureFrameCaptured(CameraSession cameraSession, int i11, int i12, int i13, float[] fArr, int i14, long j11);
    }

    void stop();
}
