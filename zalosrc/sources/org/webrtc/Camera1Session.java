package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.SystemClock;
import android.view.WindowManager;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.SurfaceTextureHelper;
import zh0.C32210a;
import zh0.C32211b;

/* loaded from: classes7.dex */
public class Camera1Session implements CameraSession {
    static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    static final String TAG = "Camera1Session";
    final Context applicationContext;
    final int cameraId;
    final CameraEnumerationAndroid.CaptureFormat captureFormat;
    final boolean captureToTexture;
    final long constructionTimeNs;
    final CameraSession.Events events;
    final int framerate;
    final int height;
    final Camera.CameraInfo info;
    SessionState state;
    final SurfaceTextureHelper surfaceTextureHelper;
    final int width;
    final Object lastCamErrLock = new Object();
    int lastCameraError = 0;
    boolean firstFrameReported = false;

    /* loaded from: classes7.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    Camera1Session(CameraSession.Events events, boolean z11, Context context, SurfaceTextureHelper surfaceTextureHelper, int i11, int i12, int i13, int i14, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j11) {
        Logging.m127853d(TAG, "Create new camera1 session on camera " + i11);
        this.events = events;
        this.captureToTexture = z11;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i11;
        this.width = i12;
        this.height = i13;
        this.framerate = i14;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j11;
        startCapturing();
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z11, Context context, SurfaceTextureHelper surfaceTextureHelper, int i11, int i12, int i13, int i14) {
        try {
            long nanoTime = System.nanoTime();
            Logging.m127853d(TAG, "Open camera " + i11);
            events.onCameraOpening();
            try {
                C32211b.m155324b().m155327e(i11);
                try {
                    C32211b.m155323a().setPreviewTexture(surfaceTextureHelper.surfaceTexture);
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i11, cameraInfo);
                    Camera.Parameters parameters = C32211b.m155323a().getParameters();
                    CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i12, i13, i14);
                    updateCameraParameters(C32211b.m155323a(), parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i12, i13), z11);
                    if (!z11) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        for (int i15 = 0; i15 < 3; i15++) {
                            C32211b.m155323a().addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                        }
                    }
                    C32211b.m155323a().setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events, z11, context, surfaceTextureHelper, i11, i12, i13, i14, C32211b.m155323a(), cameraInfo, findClosestCaptureFormat, nanoTime));
                } catch (Exception e11) {
                    createSessionCallback.onFailure(e11.getMessage());
                }
            } catch (RuntimeException e12) {
                createSessionCallback.onFailure(e12.getMessage());
            }
        } catch (Exception e13) {
            createSessionCallback.onFailure(e13.getMessage());
        }
    }

    static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i11, int i12, int i13) {
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.m127855v(TAG, "Available fps ranges: " + convertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i13);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i11, i12);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    static Size findClosestPictureSize(Camera.Parameters parameters, int i11, int i12) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i11, i12);
    }

    public /* synthetic */ void lambda$listenForFrames$1(byte[] bArr, Camera camera) {
        if (camera != C32211b.m155323a()) {
            Logging.m127854e(TAG, "Callback from a different camera. This should never happen.");
            return;
        }
        if (this.state != SessionState.RUNNING) {
            Logging.m127853d(TAG, "Bytebuffer frame captured but camera is no longer running.");
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
        if (!this.firstFrameReported) {
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs);
            this.firstFrameReported = true;
        }
        try {
            CameraSession.Events events = this.events;
            CameraEnumerationAndroid.CaptureFormat captureFormat = this.captureFormat;
            events.onByteBufferFrameCaptured(this, bArr, captureFormat.width, captureFormat.height, getFrameOrientation(), nanos);
            C32211b.m155323a().addCallbackBuffer(bArr);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public /* synthetic */ void lambda$listenForFrames$2(int i11, float[] fArr, long j11) {
        float[] fArr2;
        if (this.state != SessionState.RUNNING) {
            Logging.m127853d(TAG, "Texture frame captured but camera is no longer running.");
            this.surfaceTextureHelper.returnTextureFrame();
            return;
        }
        if (!this.firstFrameReported) {
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs);
            this.firstFrameReported = true;
        }
        int frameOrientation = getFrameOrientation();
        if (this.info.facing == 1) {
            fArr2 = RendererCommon.multiplyMatrices(fArr, RendererCommon.horizontalFlipMatrix());
        } else {
            fArr2 = fArr;
        }
        CameraSession.Events events = this.events;
        CameraEnumerationAndroid.CaptureFormat captureFormat = this.captureFormat;
        events.onTextureFrameCaptured(this, captureFormat.width, captureFormat.height, i11, fArr2, frameOrientation, j11);
    }

    public /* synthetic */ void lambda$startCapturing$0(int i11, Camera camera) {
        synchronized (this.lastCamErrLock) {
            this.lastCameraError = i11;
        }
        C32210a.m155320a().m155321b(new Runnable() { // from class: org.webrtc.b
            public /* synthetic */ RunnableC24517b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera1Session.this.stopCameraOnError();
            }
        });
    }

    static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z11) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z11) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    int getDeviceOrientation() {
        try {
            int rotation = ((WindowManager) this.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                    return 270;
                }
                return 180;
            }
            return 90;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    int getFrameOrientation() {
        int deviceOrientation = getDeviceOrientation();
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo.orientation + deviceOrientation) % 360;
    }

    void listenForFrames(boolean z11) {
        if (z11) {
            C32211b.m155323a().setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: org.webrtc.c
                public /* synthetic */ C24519c() {
                }

                @Override // android.hardware.Camera.PreviewCallback
                public final void onPreviewFrame(byte[] bArr, Camera camera) {
                    Camera1Session.this.lambda$listenForFrames$1(bArr, camera);
                }
            });
        } else {
            this.surfaceTextureHelper.startListening(new SurfaceTextureHelper.OnTextureFrameAvailableListener() { // from class: org.webrtc.d
                public /* synthetic */ C24521d() {
                }

                @Override // org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener
                public final void onTextureFrameAvailable(int i11, float[] fArr, long j11) {
                    Camera1Session.this.lambda$listenForFrames$2(i11, fArr, j11);
                }
            });
            this.surfaceTextureHelper.reset();
        }
    }

    void startCapturing() {
        Logging.m127853d(TAG, "Start capturing");
        this.state = SessionState.RUNNING;
        if (C32211b.m155323a() != null) {
            C32211b.m155323a().setErrorCallback(new Camera.ErrorCallback() { // from class: org.webrtc.a
                public /* synthetic */ C24515a() {
                }

                @Override // android.hardware.Camera.ErrorCallback
                public final void onError(int i11, Camera camera) {
                    Camera1Session.this.lambda$startCapturing$0(i11, camera);
                }
            });
        }
        listenForFrames(!this.captureToTexture);
        try {
            C32211b.m155323a().startPreview();
        } catch (Exception e11) {
            this.state = SessionState.STOPPED;
            stopInternal();
            this.events.onCameraError(this, e11.getMessage());
        }
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        Logging.m127853d(TAG, "Stop camera1 session on camera " + this.cameraId);
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        }
    }

    public void stopCameraOnError() {
        String str;
        synchronized (this.lastCamErrLock) {
            try {
                if (this.lastCameraError == 100) {
                    str = "Camera server died!";
                } else {
                    str = "Camera error: " + this.lastCameraError;
                }
                Logging.m127854e(TAG, str + " \tThreadID: " + Thread.currentThread().getId());
                this.state = SessionState.STOPPED;
                stopInternal();
                if (this.lastCameraError == 2) {
                    this.events.onCameraDisconnected(this);
                } else {
                    this.events.onCameraError(this, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void stopInternal() {
        Logging.m127853d(TAG, "Stop internal");
        this.surfaceTextureHelper.stopListening();
        try {
            C32211b.m155323a().stopPreview();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            C32211b.m155324b().m155328f();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        this.events.onCameraClosed(this);
        Logging.m127853d(TAG, "Stop done");
    }
}
