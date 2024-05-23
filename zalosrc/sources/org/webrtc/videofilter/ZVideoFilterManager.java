package org.webrtc.videofilter;

import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglRenderer;
import org.webrtc.videofilter.ZVideoFilter;

/* loaded from: classes7.dex */
public class ZVideoFilterManager {
    private static final String LOG_TAG = "ZVideoFilterManager";
    private static boolean _needStartFilterV1 = false;
    private static ZVideoFilterAgent _videoFilterClientImpl;
    private static ZVideoFilter _videoFilterNativeImpl;

    public static boolean applyFilter(byte[] bArr, int i11, int i12, int i13, long j11) {
        try {
            ZVideoFilterAgent zVideoFilterAgent = _videoFilterClientImpl;
            if (zVideoFilterAgent != null && zVideoFilterAgent.filterType() == ZVideoFilter.FilterType.CLIENT) {
                _videoFilterClientImpl.applyFilter(bArr, i11, i12, i13, j11);
                _needStartFilterV1 = true;
            }
            if (_needStartFilterV1) {
                _videoFilterNativeImpl.start();
                _needStartFilterV1 = false;
            }
            if (_videoFilterNativeImpl == null || filterType() != ZVideoFilter.FilterType.NATIVE.getValue()) {
                return false;
            }
            return _videoFilterNativeImpl.applyFilter(bArr, i11, i12, i13, j11);
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("applyFilter on byteArray. Error: ");
            sb2.append(e11.getMessage());
            return false;
        }
    }

    public static int filterType() {
        ZVideoFilterAgent zVideoFilterAgent = _videoFilterClientImpl;
        if (zVideoFilterAgent != null) {
            ZVideoFilter.FilterType filterType = zVideoFilterAgent.filterType();
            ZVideoFilter.FilterType filterType2 = ZVideoFilter.FilterType.CLIENT;
            if (filterType == filterType2) {
                return filterType2.getValue();
            }
        }
        ZVideoFilter zVideoFilter = _videoFilterNativeImpl;
        if (zVideoFilter == null) {
            return ZVideoFilter.FilterType.NONE.getValue();
        }
        return zVideoFilter.filterType().getValue();
    }

    public static float getExposureValue() {
        ZVideoFilter zVideoFilter = _videoFilterNativeImpl;
        if (zVideoFilter == null) {
            return 1.0f;
        }
        return zVideoFilter.getExposureValue();
    }

    public static JSONObject getStat() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("avgNativeTimeMs", Math.round(ZVideoFilter.Stat.nativeTime.getAverage() * 10.0d) / 10.0d);
            jSONObject.put("avgApplyFilterTimeMs", Math.round(ZVideoFilter.Stat.applyFilterTime.getAverage() * 10.0d) / 10.0d);
            jSONObject.put("avgPreRenderTimeMs", Math.round(ZVideoFilter.Stat.preRenderTime.getAverage() * 10.0d) / 10.0d);
        } catch (JSONException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getStat error: ");
            sb2.append(e11.getMessage());
        }
        return jSONObject;
    }

    public static void regisRenderer(EglRenderer eglRenderer) {
        ZVideoFilter zVideoFilter = _videoFilterNativeImpl;
        if (zVideoFilter != null) {
            zVideoFilter.regisRenderer(eglRenderer);
        }
    }

    public static void register(ZVideoFilter zVideoFilter) {
        _videoFilterNativeImpl = zVideoFilter;
    }

    public static void resetState() {
        ZVideoFilter zVideoFilter = _videoFilterNativeImpl;
        if (zVideoFilter != null) {
            zVideoFilter.resetState();
        }
    }

    public ZVideoFilter.StatusCode getStatus() {
        ZVideoFilter zVideoFilter = _videoFilterNativeImpl;
        if (zVideoFilter == null) {
            return ZVideoFilter.StatusCode.UNKNOWN;
        }
        return zVideoFilter.getStatus();
    }

    public static void register(ZVideoFilterAgent zVideoFilterAgent) {
        _videoFilterClientImpl = zVideoFilterAgent;
    }

    public static boolean applyFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        try {
            ZVideoFilterAgent zVideoFilterAgent = _videoFilterClientImpl;
            if (zVideoFilterAgent == null || zVideoFilterAgent.filterType() != ZVideoFilter.FilterType.CLIENT) {
                return false;
            }
            return _videoFilterClientImpl.applyFilter(i11, i12, i13, fArr, i14, j11);
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("applyFilter on texture. Error: ");
            sb2.append(e11.getMessage());
            return false;
        }
    }
}
