package com.vng.zing.vn.zrtc.device;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RealtimeStats;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoRenderer;
import org.webrtc.videofilter.ZVideoFilter;
import org.webrtc.videofilter.ZVideoFilterManager;
import p097db.AbstractC17849h;

/* loaded from: classes3.dex */
public class AndroidVideoCapturerObserver implements VideoCapturer.CapturerObserver {
    private static RealtimeStats stats = new RealtimeStats(1000);
    private static AtomicBoolean liveMode = new AtomicBoolean(false);
    private static AtomicBoolean isUsingFilterV2 = new AtomicBoolean(false);
    private static AtomicBoolean isUsingFilterV1 = new AtomicBoolean(false);
    private static int callType = 0;

    public static int getCallType() {
        return callType;
    }

    public static JSONObject getFilterStat() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isFilterV1", isUsingFilterV1.get());
            jSONObject.put("isFilterV2", isUsingFilterV2.get());
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getStat() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fps", stats.getNum());
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean isLiveMode() {
        return liveMode.get();
    }

    public static void setCallType(int i11) {
        callType = i11;
        AbstractC17849h.m94302k(i11);
    }

    public static void setLiveMode(boolean z11) {
        liveMode.set(z11);
    }

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    public void onByteBufferFrameCaptured(byte[] bArr, int i11, int i12, int i13, long j11) {
        stats.addValue(1);
        if ((ZVideoFilterManager.filterType() == ZVideoFilter.FilterType.NATIVE.getValue() || ZVideoFilterManager.filterType() == ZVideoFilter.FilterType.CLIENT.getValue()) && ZVideoFilterManager.applyFilter(bArr, i11, i12, i13, j11)) {
            isUsingFilterV1.compareAndSet(false, true);
        } else {
            isUsingFilterV1.compareAndSet(true, false);
            AbstractC17849h.m94298g(bArr, i11, i12, i13, j11);
        }
    }

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStarted(boolean z11) {
    }

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStopped() {
    }

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    public void onSwitchCameraDone(boolean z11) {
        AbstractC17849h.m94296e(z11);
    }

    @Override // org.webrtc.VideoCapturer.CapturerObserver
    public void onTextureFrameCaptured(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        boolean z11 = true;
        stats.addValue(1);
        if (ZVideoFilterManager.filterType() == ZVideoFilter.FilterType.CLIENT.getValue() && ZVideoFilterManager.applyFilter(i11, i12, i13, fArr, i14, j11)) {
            isUsingFilterV2.compareAndSet(false, true);
            return;
        }
        AbstractC17849h.m94299h(i11, i12, i13, fArr, i14, j11, VideoRenderer.I420Frame.TextureType.OES_TEXTURE.ordinal());
        AtomicBoolean atomicBoolean = isUsingFilterV1;
        if (ZVideoFilterManager.filterType() != ZVideoFilter.FilterType.NATIVE.getValue()) {
            z11 = false;
        }
        atomicBoolean.set(z11);
    }
}
