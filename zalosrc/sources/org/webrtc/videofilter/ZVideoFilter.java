package org.webrtc.videofilter;

import org.json.JSONObject;
import org.webrtc.EglRenderer;
import org.webrtc.RealtimeStats;

/* loaded from: classes7.dex */
public interface ZVideoFilter {

    /* loaded from: classes7.dex */
    public enum FilterType {
        NONE(-1),
        NATIVE(0),
        CLIENT(1);

        int value;

        FilterType(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public static class Stat {
        public static RealtimeStats nativeTime = new RealtimeStats(1000);
        public static RealtimeStats preRenderTime = new RealtimeStats(1000);
        public static RealtimeStats applyFilterTime = new RealtimeStats(1000);
    }

    /* loaded from: classes7.dex */
    public enum StatusCode {
        NOT_SUPPORT(-1),
        UNKNOWN(0),
        ON(1),
        OFF(2);

        int value;

        StatusCode(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum SupportType {
        UNKNOWN(-1),
        NO(0),
        YES(1);

        int value;

        SupportType(int i11) {
            this.value = i11;
        }

        public static SupportType forInt(int i11) {
            for (SupportType supportType : values()) {
                if (supportType.value == i11) {
                    return supportType;
                }
            }
            throw new IllegalArgumentException("Invalid support type: " + i11);
        }

        public int getValue() {
            return this.value;
        }
    }

    StatusCode applyConfig(JSONObject jSONObject);

    boolean applyFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11);

    boolean applyFilter(byte[] bArr, int i11, int i12, int i13, long j11);

    FilterType filterType();

    float getExposureValue();

    StatusCode getStatus();

    void regisRenderer(EglRenderer eglRenderer);

    void resetState();

    boolean start();

    boolean stop();
}
