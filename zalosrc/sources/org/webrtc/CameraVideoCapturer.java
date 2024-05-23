package org.webrtc;

/* loaded from: classes7.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    /* loaded from: classes7.dex */
    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    /* loaded from: classes7.dex */
    public static class CameraStatistics {
        static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 6000;
        static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        static final String TAG = "CameraStatistics";
        final Runnable cameraObserver;
        final CameraEventsHandler eventsHandler;
        int frameCount;
        int freezePeriodCount;
        final SurfaceTextureHelper surfaceTextureHelper;

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    Math.round((CameraStatistics.this.frameCount * 1000.0f) / 2000.0f);
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    if (cameraStatistics.frameCount == 0) {
                        int i11 = cameraStatistics.freezePeriodCount + 1;
                        cameraStatistics.freezePeriodCount = i11;
                        if (i11 * 2000 >= CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS && cameraStatistics.eventsHandler != null) {
                            Logging.m127854e(CameraStatistics.TAG, "Camera freezed.");
                            if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        cameraStatistics.freezePeriodCount = 0;
                    }
                    cameraStatistics.frameCount = 0;
                    cameraStatistics.surfaceTextureHelper.getHandler().postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }

        private void checkThread() {
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    /* loaded from: classes7.dex */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z11);

        void onCameraSwitchError(String str);
    }

    void setCaptureToTexture(boolean z11);

    void setEventHandler(CameraEventsHandler cameraEventsHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);
}
