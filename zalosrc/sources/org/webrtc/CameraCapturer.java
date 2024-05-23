package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.Objects;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoCapturer;
import zh0.C32210a;

/* loaded from: classes7.dex */
public class CameraCapturer implements CameraVideoCapturer {
    static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    static final int OPEN_CAMERA_DELAY_MS = 500;
    static final int OPEN_CAMERA_TIMEOUT = 10000;
    static final String TAG = "CameraCapturer";
    Context applicationContext;
    final CameraEnumerator cameraEnumerator;
    String cameraName;
    CameraVideoCapturer.CameraStatistics cameraStatistics;
    volatile boolean captureToTexture;
    VideoCapturer.CapturerObserver capturerObserver;
    CameraSession currentSession;
    CameraVideoCapturer.CameraEventsHandler eventsHandler;
    boolean firstFrameObserved;
    int framerate;
    int height;
    int openAttemptsRemaining;
    boolean sessionOpening;
    SurfaceTextureHelper surfaceHelper;
    CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    final Handler uiThreadHandler;
    int width;
    final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            Logging.m127853d(CameraCapturer.TAG, "Create session done");
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    cameraCapturer2.sessionOpening = false;
                    cameraCapturer2.currentSession = cameraSession;
                    cameraCapturer2.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer2.surfaceHelper, cameraCapturer2.eventsHandler);
                    CameraCapturer cameraCapturer3 = CameraCapturer.this;
                    cameraCapturer3.firstFrameObserved = false;
                    cameraCapturer3.stateLock.notifyAll();
                    CameraCapturer cameraCapturer4 = CameraCapturer.this;
                    SwitchState switchState = cameraCapturer4.switchState;
                    if (switchState == SwitchState.IN_PROGRESS) {
                        boolean isFrontFacing = cameraCapturer4.cameraEnumerator.isFrontFacing(cameraCapturer4.cameraName);
                        CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = CameraCapturer.this.switchEventsHandler;
                        if (cameraSwitchHandler != null) {
                            cameraSwitchHandler.onCameraSwitchDone(isFrontFacing);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        VideoCapturer.CapturerObserver capturerObserver = CameraCapturer.this.capturerObserver;
                        if (capturerObserver != null) {
                            capturerObserver.onSwitchCameraDone(isFrontFacing);
                        }
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                    } else if (switchState == SwitchState.PENDING) {
                        cameraCapturer4.switchState = SwitchState.IDLE;
                        cameraCapturer4.lambda$switchCamera$1(cameraCapturer4.switchEventsHandler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(String str) {
            Logging.m127853d(CameraCapturer.TAG, "Create session onFailure: " + str);
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    int i11 = cameraCapturer2.openAttemptsRemaining - 1;
                    cameraCapturer2.openAttemptsRemaining = i11;
                    if (i11 <= 0) {
                        cameraCapturer2.sessionOpening = false;
                        cameraCapturer2.stateLock.notifyAll();
                        CameraCapturer cameraCapturer3 = CameraCapturer.this;
                        SwitchState switchState = cameraCapturer3.switchState;
                        SwitchState switchState2 = SwitchState.IDLE;
                        if (switchState != switchState2) {
                            if (cameraCapturer3.switchEventsHandler != null) {
                                cameraCapturer3.switchEventsHandler = null;
                            }
                            cameraCapturer3.switchState = switchState2;
                        }
                        cameraCapturer3.eventsHandler.onCameraError(str);
                    } else {
                        cameraCapturer2.createSessionInternal(500);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: org.webrtc.CameraCapturer.2
        @Override // org.webrtc.CameraSession.Events
        public void onByteBufferFrameCaptured(CameraSession cameraSession, byte[] bArr, int i11, int i12, int i13, long j11) {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    if (cameraSession != cameraCapturer.currentSession) {
                        Logging.m127856w(CameraCapturer.TAG, "onByteBufferFrameCaptured from another session.");
                        return;
                    }
                    if (!cameraCapturer.firstFrameObserved) {
                        cameraCapturer.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onByteBufferFrameCaptured(bArr, i11, i12, i13, j11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    CameraSession cameraSession2 = cameraCapturer.currentSession;
                    if (cameraSession != cameraSession2 && cameraSession2 != null) {
                        Logging.m127853d(CameraCapturer.TAG, "onCameraClosed from another session.");
                    } else {
                        cameraCapturer.eventsHandler.onCameraClosed();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    if (cameraSession != cameraCapturer.currentSession) {
                        Logging.m127856w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                    } else {
                        cameraCapturer.eventsHandler.onCameraDisconnected();
                        CameraCapturer.this.stopCapture();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    if (cameraSession != cameraCapturer.currentSession) {
                        Logging.m127856w(CameraCapturer.TAG, "onCameraError from another session: " + str);
                        return;
                    }
                    cameraCapturer.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    if (cameraCapturer.currentSession != null) {
                        Logging.m127856w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                    } else {
                        cameraCapturer.eventsHandler.onCameraOpening(cameraCapturer.cameraName);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onTextureFrameCaptured(CameraSession cameraSession, int i11, int i12, int i13, float[] fArr, int i14, long j11) {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    if (cameraSession != cameraCapturer.currentSession) {
                        cameraCapturer.surfaceHelper.returnTextureFrame();
                        Logging.m127856w(CameraCapturer.TAG, "onTextureFrameCaptured from another session.");
                        return;
                    }
                    if (!cameraCapturer.firstFrameObserved) {
                        cameraCapturer.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onTextureFrameCaptured(i11, i12, i13, fArr, i14, j11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: org.webrtc.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    final Object stateLock = new Object();
    SwitchState switchState = SwitchState.IDLE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator, boolean z11) {
        this.captureToTexture = false;
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.4
            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
                CameraCapturer.this.sendBroadcast(new Intent(Constants.ACTION_CAMERA_CLOSE));
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
                CameraCapturer.this.sendBroadcast(new Intent(Constants.ACTION_CAMERA_FREEZE));
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
                CameraCapturer.this.sendBroadcast(new Intent(Constants.ACTION_CAMERA_OPENING));
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.captureToTexture = z11;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length != 0) {
            if (Arrays.asList(deviceNames).contains(this.cameraName)) {
                return;
            }
            throw new IllegalArgumentException("Camera name " + this.cameraName + " does not match any known camera device.");
        }
        throw new RuntimeException("No cameras attached.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSessionInternal$0() {
        try {
            Camera1Session.create(this.createSessionCallback, this.cameraSessionEventsHandler, this.captureToTexture, this.applicationContext, this.surfaceHelper, Camera1Enumerator.getCameraIndex(this.cameraName), this.width, this.height, this.framerate);
        } catch (Exception e11) {
            Logging.m127853d(TAG, e11.toString());
            this.createSessionCallback.onFailure(e11.getMessage());
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i11, int i12, int i13) {
        Logging.m127853d(TAG, "changeCaptureFormat: " + i11 + "x" + i12 + "@" + i13);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i11, i12, i13);
        }
    }

    void createSessionInternal(int i11) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i11 + OPEN_CAMERA_TIMEOUT);
        C32210a.m155320a().m155322c(new Runnable() { // from class: org.webrtc.f
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$createSessionInternal$0();
            }
        }, i11);
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        Logging.m127853d(TAG, "dispose");
        stopCapture();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        Logging.m127853d(TAG, "Camera capture initialize");
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
    }

    void sendBroadcast(Intent intent) {
        try {
            Context context = this.applicationContext;
            if (context != null) {
                context.sendBroadcast(intent);
            }
        } catch (Exception e11) {
            Logging.m127854e(TAG, "sendBroadcast fail " + e11.toString());
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setCaptureToTexture(boolean z11) {
        this.captureToTexture = z11;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setEventHandler(CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        this.eventsHandler = cameraEventsHandler;
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i11, int i12, int i13) {
        synchronized (this.stateLock) {
            try {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i11;
                    this.height = i12;
                    this.framerate = i13;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0);
                }
            } finally {
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        Logging.m127853d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                try {
                    Logging.m127853d(TAG, "Stop capture: Waiting for session to open");
                    ThreadUtils.waitUninterruptibly(this.stateLock);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.currentSession != null) {
                Logging.m127853d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                CameraSession cameraSession = this.currentSession;
                C32210a m155320a = C32210a.m155320a();
                Objects.requireNonNull(cameraSession);
                m155320a.m155321b(new RunnableC24523e(cameraSession));
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.m127853d(TAG, "Stop capture: No session open");
            }
        }
        Logging.m127853d(TAG, "Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m127853d(TAG, "switchCamera");
        C32210a.m155320a().m155321b(new Runnable() { // from class: org.webrtc.g
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$switchCamera$1(cameraSwitchHandler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: switchCameraInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$switchCamera$1(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m127853d(TAG, "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length < 2) {
            if (cameraSwitchHandler != null) {
                cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
                return;
            }
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    Logging.m127853d(TAG, "switchCamera switchInProgress");
                    if (cameraSwitchHandler != null) {
                        cameraSwitchHandler.onCameraSwitchError("Camera switch already in progress.");
                    }
                    return;
                }
                boolean z11 = this.sessionOpening;
                if (!z11 && this.currentSession == null) {
                    Logging.m127853d(TAG, "switchCamera: No session open");
                    if (cameraSwitchHandler != null) {
                        cameraSwitchHandler.onCameraSwitchError("Camera is not running.");
                    }
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z11) {
                    this.switchState = SwitchState.PENDING;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                Logging.m127853d(TAG, "switchCamera: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                CameraSession cameraSession = this.currentSession;
                C32210a m155320a = C32210a.m155320a();
                Objects.requireNonNull(cameraSession);
                m155320a.m155321b(new RunnableC24523e(cameraSession));
                this.currentSession = null;
                boolean isFrontFacing = this.cameraEnumerator.isFrontFacing(this.cameraName);
                int length = deviceNames.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    String str = deviceNames[i11];
                    if (this.cameraEnumerator.isFrontFacing(str) != isFrontFacing) {
                        this.cameraName = str;
                        break;
                    }
                    i11++;
                }
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0);
                Logging.m127853d(TAG, "switchCamera done");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
