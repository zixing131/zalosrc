package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import wh0.C29046a;
import zh0.C32211b;

/* loaded from: classes7.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private boolean captureToTexture;

    public Camera1Enumerator(boolean z11) {
        this.captureToTexture = z11;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i11) {
        int i12;
        Logging.m127855v(TAG, "Get supported formats for camera index " + i11 + ".");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                Logging.m127853d(TAG, "Opening camera with index " + i11);
                C32211b.m155324b().m155327e(i11);
                C29046a.f134547b = "Call/Live";
                C32211b.m155325c(C32211b.m155323a(), TAG);
                Camera.Parameters parameters = C32211b.m155323a().getParameters();
                try {
                    C32211b.m155324b().m155328f();
                    C32211b.m155326d(C32211b.m155323a(), TAG);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i13 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i13 = iArr[0];
                        i12 = iArr[1];
                    } else {
                        i12 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i13, i12));
                    }
                } catch (Exception unused) {
                    Logging.m127854e(TAG, "getSupportedFormats() failed on camera index " + i11);
                }
                Logging.m127853d(TAG, "Get supported formats for camera index " + i11 + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException unused2) {
                Logging.m127854e(TAG, "Open camera failed on camera index " + i11);
                ArrayList arrayList2 = new ArrayList();
                try {
                    C32211b.m155324b().m155328f();
                    C32211b.m155326d(C32211b.m155323a(), TAG);
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
                return arrayList2;
            }
        } catch (Throwable th2) {
            try {
                C32211b.m155324b().m155328f();
                C32211b.m155326d(C32211b.m155323a(), TAG);
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
            }
            throw th2;
        }
    }

    public static int getCameraIndex(String str) {
        Logging.m127853d(TAG, "getCameraIndex: " + str);
        for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
            if (str.equals(CameraEnumerationAndroid.getDeviceName(i11))) {
                return i11;
            }
        }
        throw new IllegalArgumentException("No such camera: " + str);
    }

    private static Camera.CameraInfo getCameraInfo(int i11) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i11, cameraInfo);
            return cameraInfo;
        } catch (Exception unused) {
            Logging.m127854e(TAG, "getCameraInfo failed on index " + i11);
            return null;
        }
    }

    public static String getDeviceName(int i11) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i11);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        return "Camera " + i11 + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new CameraCapturer(str, cameraEventsHandler, this, this.captureToTexture);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
            String deviceName = getDeviceName(i11);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.m127853d(TAG, "Index: " + i11 + ". " + deviceName);
            } else {
                Logging.m127854e(TAG, "Index: " + i11 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 0) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        try {
            Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
            if (cameraInfo == null) {
                return false;
            }
            if (cameraInfo.facing != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public void setCaptureToTexture(boolean z11) {
        this.captureToTexture = z11;
    }

    synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i11) {
        try {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i12 = 0; i12 < getDeviceNames().length; i12++) {
                    cachedSupportedFormats.add(enumerateFormats(i12));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cachedSupportedFormats.get(i11);
    }
}
