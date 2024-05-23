package com.vng.zing.vn.zrtc.device;

import android.content.Context;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import ho0.AbstractC20110a;
import java.util.List;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Logging;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import p097db.AbstractC17849h;

/* loaded from: classes3.dex */
public class AndroidVideoCapturer {
    private static String FEATURE_CALL = "comm_call";
    private static String FEATURE_LIVESTREAM = "comm_csc";
    private static final int MIN_CAPTURE_RES = 360;
    private static String SOURCE_LIVESTREAM = "csc_attachment_live_stream";
    private static String SOURCE_VIDEO_CALL_1_1 = "call_video_call";
    private static String SOURCE_VIDEO_CALL_GROUP = "call_video_call_group";
    private static final String TAG = "AndroidVideoCapturer";
    private int captureFps;
    private int captureHeight;
    private int captureWidth;
    private CameraVideoCapturer capturer;
    CameraEnumerationAndroid.CaptureFormat chosenFormat;
    private String currentDeviceName;
    private CameraEnumerator enumerator;
    private List<CameraEnumerationAndroid.CaptureFormat> formats;
    private boolean initFormats;
    private int maxRes;

    public AndroidVideoCapturer(boolean z11) {
        this.enumerator = null;
        this.capturer = null;
        this.currentDeviceName = "";
        this.captureWidth = 0;
        this.captureHeight = 0;
        this.captureFps = 0;
        this.formats = null;
        this.chosenFormat = null;
        this.maxRes = 0;
        this.initFormats = true;
        this.enumerator = new Camera1Enumerator(z11);
        this.capturer = createVideoCapturer(true);
    }

    private CameraVideoCapturer createVideoCapturer(boolean z11) {
        CameraVideoCapturer createCapturer;
        CameraVideoCapturer createCapturer2;
        String[] deviceNames = this.enumerator.getDeviceNames();
        for (String str : deviceNames) {
            if (this.enumerator.isFrontFacing(str) && (createCapturer2 = this.enumerator.createCapturer(str, null)) != null) {
                this.currentDeviceName = str;
                if (z11) {
                    this.formats = this.enumerator.getSupportedFormats(str);
                }
                return createCapturer2;
            }
        }
        for (String str2 : deviceNames) {
            if (!this.enumerator.isFrontFacing(str2) && (createCapturer = this.enumerator.createCapturer(str2, null)) != null) {
                this.currentDeviceName = str2;
                this.formats = this.enumerator.getSupportedFormats(str2);
                return createCapturer;
            }
        }
        return null;
    }

    private SensitiveData getSensitiveData() {
        int m94292a = AbstractC17849h.m94292a();
        if (m94292a != 0) {
            if (m94292a != 1) {
                if (m94292a != 2) {
                    return null;
                }
                return new SensitiveData(SOURCE_VIDEO_CALL_GROUP, FEATURE_CALL);
            }
            return new SensitiveData(SOURCE_LIVESTREAM, FEATURE_LIVESTREAM);
        }
        return new SensitiveData(SOURCE_VIDEO_CALL_1_1, FEATURE_CALL);
    }

    public void changeCaptureFormat(int i11, int i12, int i13) {
        CameraVideoCapturer cameraVideoCapturer;
        if ((this.captureWidth != i11 || this.captureHeight != i12) && (cameraVideoCapturer = this.capturer) != null) {
            this.captureWidth = i11;
            this.captureHeight = i12;
            cameraVideoCapturer.changeCaptureFormat(i11, i12, i13);
        }
    }

    public void changeCaptureToTexture(boolean z11) {
        CameraEnumerator cameraEnumerator;
        if (this.capturer != null && (cameraEnumerator = this.enumerator) != null) {
            cameraEnumerator.setCaptureToTexture(z11);
            this.capturer.setCaptureToTexture(z11);
            refresh();
        }
    }

    public boolean init(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer == null) {
            return false;
        }
        cameraVideoCapturer.initialize(surfaceTextureHelper, context, capturerObserver);
        return true;
    }

    public void initFormats(int i11) {
        try {
            CameraEnumerator cameraEnumerator = this.enumerator;
            if (cameraEnumerator != null) {
                this.formats = cameraEnumerator.getSupportedFormats(this.currentDeviceName);
            }
            selectSize(i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public void refresh() {
        int i11;
        int i12;
        int i13;
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null && (i11 = this.captureWidth) > 0 && (i12 = this.captureHeight) > 0 && (i13 = this.captureFps) > 0) {
            cameraVideoCapturer.changeCaptureFormat(i11, i12, i13);
        }
    }

    public void selectSize(int i11) {
        List<CameraEnumerationAndroid.CaptureFormat> list = this.formats;
        if (list == null) {
            return;
        }
        int[] iArr = {i11, MIN_CAPTURE_RES};
        CameraEnumerationAndroid.CaptureFormat captureFormat = null;
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = null;
        CameraEnumerationAndroid.CaptureFormat captureFormat3 = null;
        for (CameraEnumerationAndroid.CaptureFormat captureFormat4 : list) {
            int i12 = captureFormat4.height;
            int i13 = captureFormat4.width;
            Logging.m127855v(TAG, "selectSize height = " + i12 + " - width = " + i13);
            if (i12 * 16 == i13 * 9) {
                if (i12 <= iArr[0] && i12 >= iArr[1] && (captureFormat == null || i12 > captureFormat.height)) {
                    captureFormat = captureFormat4;
                }
            } else if (i12 * 4 == i13 * 3) {
                if (i12 <= iArr[0] && i12 >= iArr[1] && (captureFormat2 == null || i12 > captureFormat2.height)) {
                    captureFormat2 = captureFormat4;
                }
            } else if (i12 * 3 == i13 * 2 && i12 <= iArr[0] && i12 >= iArr[1] && (captureFormat3 == null || i12 > captureFormat3.height)) {
                captureFormat3 = captureFormat4;
            }
        }
        if (captureFormat != null) {
            this.chosenFormat = captureFormat;
            return;
        }
        if (captureFormat2 != null) {
            this.chosenFormat = captureFormat2;
            return;
        }
        if (captureFormat3 != null) {
            this.chosenFormat = captureFormat3;
            return;
        }
        for (CameraEnumerationAndroid.CaptureFormat captureFormat5 : this.formats) {
            CameraEnumerationAndroid.CaptureFormat captureFormat6 = this.chosenFormat;
            if (captureFormat6 == null) {
                this.chosenFormat = captureFormat5;
            } else {
                int i14 = captureFormat5.height;
                int i15 = iArr[0];
                if (i14 >= i15) {
                    int i16 = captureFormat6.height;
                    if (i14 < i16 || i16 < i15) {
                        this.chosenFormat = captureFormat5;
                    }
                } else if (i14 > captureFormat6.height) {
                    this.chosenFormat = captureFormat5;
                }
            }
        }
    }

    public void setEventHandler(CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null) {
            cameraVideoCapturer.setEventHandler(cameraEventsHandler);
        }
    }

    public void start(int i11, int i12, int i13, boolean z11) {
        int i14;
        SensitiveData sensitiveData = getSensitiveData();
        if (sensitiveData == null) {
            return;
        }
        C8937j0.m47656d().m40938d(sensitiveData);
        if (!this.initFormats && !z11) {
            initFormats(this.maxRes);
        }
        Object[] objArr = new Object[5];
        CameraEnumerationAndroid.CaptureFormat captureFormat = this.chosenFormat;
        int i15 = 0;
        if (captureFormat != null) {
            i14 = captureFormat.width;
        } else {
            i14 = 0;
        }
        objArr[0] = Integer.valueOf(i14);
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = this.chosenFormat;
        if (captureFormat2 != null) {
            i15 = captureFormat2.height;
        }
        objArr[1] = Integer.valueOf(i15);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = Integer.valueOf(i12);
        objArr[4] = Integer.valueOf(i13);
        Logging.m127853d(TAG, String.format("Video capturer start with format:%dx%d(default %dx%d), %dpfs", objArr));
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null) {
            CameraEnumerationAndroid.CaptureFormat captureFormat3 = this.chosenFormat;
            if (captureFormat3 != null) {
                i11 = captureFormat3.width;
            }
            this.captureWidth = i11;
            if (captureFormat3 != null) {
                i12 = captureFormat3.height;
            }
            this.captureHeight = i12;
            this.captureFps = i13;
            cameraVideoCapturer.startCapture(i11, i12, i13);
        }
    }

    public void stop() {
        C8937j0.m47656d().m40937b();
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null) {
            try {
                cameraVideoCapturer.stopCapture();
            } catch (Exception e11) {
                Logging.m127853d(TAG, e11.getMessage());
            }
        }
    }

    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null) {
            cameraVideoCapturer.switchCamera(cameraSwitchHandler);
        }
    }

    public void updateMaxRes(int i11) {
        int i12;
        int i13;
        this.maxRes = i11;
        selectSize(i11);
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null) {
            CameraEnumerationAndroid.CaptureFormat captureFormat = this.chosenFormat;
            if (captureFormat != null) {
                i12 = captureFormat.width;
            } else {
                i12 = this.captureWidth;
            }
            this.captureWidth = i12;
            if (captureFormat != null) {
                i13 = captureFormat.height;
            } else {
                i13 = this.captureHeight;
            }
            this.captureHeight = i13;
            cameraVideoCapturer.changeCaptureFormat(i12, i13, this.captureFps);
        }
    }

    public void switchCamera() {
        CameraVideoCapturer cameraVideoCapturer = this.capturer;
        if (cameraVideoCapturer != null) {
            cameraVideoCapturer.switchCamera(null);
        }
    }

    public AndroidVideoCapturer(boolean z11, int i11, int i12) {
        this.enumerator = null;
        this.capturer = null;
        this.currentDeviceName = "";
        this.captureWidth = 0;
        this.captureHeight = 0;
        this.captureFps = 0;
        this.formats = null;
        this.chosenFormat = null;
        this.initFormats = true;
        this.maxRes = i12;
        this.initFormats = i11 == 0;
        this.enumerator = new Camera1Enumerator(z11);
        this.capturer = createVideoCapturer(this.initFormats);
        if (this.initFormats) {
            selectSize(i12);
        }
    }
}
