package com.zing.zalo.zmedia.player;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes7.dex */
public final class ZQOS {
    private static final String TAG = "ZQOS";

    @Keep
    @Deprecated
    private static void onCacheCompleteTraceInvoke(int i11, int i12, int i13, long j11, long j12) {
        if (ZMediaPlayerSettings.DEBUG_ENABLED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCacheCompleteTraceInvoke --- processID ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onCacheCompleteTraceInvoke --- source ");
            sb3.append(i12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onCacheCompleteTraceInvoke --- code ");
            sb4.append(i13);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onCacheCompleteTraceInvoke --- startTime ");
            sb5.append(j11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onCacheCompleteTraceInvoke --- endTime ");
            sb6.append(j12);
        }
        if (ZMediaPlayerSettings.ENABLE_QOS_NETWORK) {
            ZQOSLogKt.logCompleteDownloadZMediaPlayer(i11, i12, i13, j11, j12);
        }
    }

    @Keep
    @Deprecated
    private static void onDownloadInvoke(String str, int i11, long j11, long j12) {
        ZMediaPlayer.updateCacheData(str, i11, j11, j12);
    }

    @Keep
    @Deprecated
    private static void onTraceInvoke(int i11, String str, int i12, String str2, long j11, long j12, double d11, long j13, long j14) {
        long j15 = j11;
        long j16 = j12;
        if (ZMediaPlayerSettings.DEBUG_ENABLED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onTraceInvoke --- processID ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onTraceInvoke --- originalUrl ");
            sb3.append(str);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onTraceInvoke --- errorCode ");
            sb4.append(i12);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onTraceInvoke --- description ");
            sb5.append(str2);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onTraceInvoke --- startTime ");
            sb6.append(j15);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onTraceInvoke --- endTime ");
            sb7.append(j16);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onTraceInvoke --- timeConsume ");
            sb8.append(j16 - j15);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("onTraceInvoke --- speed ");
            sb9.append(d11);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("onTraceInvoke --- connectionTime ");
            sb10.append(j13);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onTraceInvoke --- dnsLookup ");
            sb11.append(j14);
        }
        if (j15 <= 0) {
            j15 = 0;
        }
        if (j16 <= 0 || j16 < j15) {
            j16 = j15 + 1;
        }
        if (ZMediaPlayerSettings.ENABLE_QOS_STATISTICS) {
            ZQOSLogKt.logStatusZMediaPlayer(i11, str, i12, str2, j15, j16, d11, j13, j14);
        }
    }

    @Keep
    @Deprecated
    private static void onVideoDataTraceInvoke(int i11, int i12, long j11, long j12, String str, String str2, String str3, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (ZMediaPlayerSettings.DEBUG_ENABLED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVideoDataTraceInvoke --- processID ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onVideoDataTraceInvoke --- code ");
            sb3.append(i12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onVideoDataTraceInvoke --- startTime ");
            sb4.append(j11);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onVideoDataTraceInvoke --- endTime ");
            sb5.append(j12);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onVideoDataTraceInvoke --- videoResolution ");
            sb6.append(str);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onVideoDataTraceInvoke --- videoCodec ");
            sb7.append(str2);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("onVideoDataTraceInvoke --- audioCodec ");
            sb8.append(str3);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("onVideoDataTraceInvoke --- totalWaitBuffer ");
            sb9.append(i13);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("onVideoDataTraceInvoke --- maxTimeWait ");
            sb10.append(i14);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("onVideoDataTraceInvoke --- minTimeWait ");
            sb11.append(i15);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("onVideoDataTraceInvoke --- avgTimeWait ");
            sb12.append(i16);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("onVideoDataTraceInvoke --- totalFrames ");
            sb13.append(i17);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("onVideoDataTraceInvoke --- numFramesFailed ");
            sb14.append(i18);
        }
        if (ZMediaPlayerSettings.ENABLE_QOS_INFO) {
            ZQOSLogKt.logStatusZMediaPlayerQuality(i11, i12, j11, j12, str, str2, str3, i13, i14, i15, i16, i17, i18);
        }
    }

    @Keep
    @Deprecated
    private static void onVideoStateTraceInvoke(int i11, int i12, int i13, long j11, long j12, String str) {
        if (ZMediaPlayerSettings.DEBUG_ENABLED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVideoStateTraceInvoke --- processID ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onVideoStateTraceInvoke --- source ");
            sb3.append(i12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onVideoStateTraceInvoke --- code ");
            sb4.append(i13);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("onVideoStateTraceInvoke --- startTime ");
            sb5.append(j11);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onVideoStateTraceInvoke --- endTime ");
            sb6.append(j12);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("onVideoStateTraceInvoke --- description ");
            sb7.append(str);
        }
        if (ZMediaPlayerSettings.ENABLE_QOS_STATE) {
            ZQOSLogKt.logQOSZMediaPlayer(i11, i12, i13, j11, j12, str);
        }
    }

    @Keep
    public static void writeLogQoS(int i11, int i12, long j11, long j12, int i13, String str) {
        ZQOSLogKt.writeLogQOS(i11, i12, i13, j11, j12, str);
    }
}
