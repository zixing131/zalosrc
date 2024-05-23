package com.zing.zalo.zmedia.player;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import p248iy.AbstractC20887g;

/* loaded from: classes7.dex */
public final class ZQOSLogKt {
    public static final void logCompleteDownloadZMediaPlayer(int i11, int i12, int i13, long j11, long j12) {
        boolean z11;
        long j13 = j12 - j11;
        if (i13 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC20887g.m109221H(false, z11, i13, i11, i12, j13, "", j11, j12);
        if (i13 != 0) {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, i13, "", j13, i11, CoreUtility.f89236l);
        }
    }

    public static final void logQOSZMediaPlayer(int i11, int i12, int i13, long j11, long j12, String str) {
        boolean z11;
        long j13 = j12 - j11;
        if (i13 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC20887g.m109221H(false, z11, i13, i11, i12, j13, "", j11, j12);
        if (i13 != 0) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, i13, String.valueOf(str), j13, i11, CoreUtility.f89236l);
        }
    }

    public static final void logStatusZMediaPlayer(int i11, String str, int i12, String str2, long j11, long j12, double d11, long j13, long j14) {
        boolean z11;
        String str3 = str + " - speed: " + d11 + " - connectionTime: " + j13 + " - dnsLookup: " + j14 + " - error: " + str2;
        long j15 = j12 - j11;
        if (i12 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC20887g.m109221H(false, z11, i12, i11, 0, j15, "", j11, j12);
        if (i12 != 0) {
            String str4 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str4, "currentUserUid");
            AbstractC20887g.m109232j(str4, i12, str3, j15, i11, CoreUtility.f89236l);
        }
    }

    public static final void logStatusZMediaPlayerQuality(int i11, int i12, long j11, long j12, String str, String str2, String str3, long j13, long j14, long j15, long j16, int i13, int i14) {
        String str4 = " resolution: " + str + " - video_codec: " + str2 + " - audio_codec: " + str3 + " - total_wait_buffer: " + j13 + " - max_time_wait: " + j14 + " - min_time_wait: " + j15 + " - avg_time_wait: " + j16 + " - total_frame: " + i13 + " - total_frame_fail: " + i14;
        long j17 = j12 - j11;
        AbstractC20887g.m109221H(false, i12 == 0, i12, i11, 0, j17, str4, j11, j12);
        if (i12 != 0) {
            String str5 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str5, "currentUserUid");
            AbstractC20887g.m109232j(str5, i12, str4, j17, i11, CoreUtility.f89236l);
        }
    }

    public static final void writeLogQOS(int i11, int i12, int i13, long j11, long j12, String str) {
        boolean z11;
        AbstractC19074t.m100208f(str, "errorMsg");
        long j13 = j12 - j11;
        if (i13 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC20887g.m109221H(false, z11, i13, i11, i12, j13, str, j11, j12);
        if (i13 != 0) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109235m(i11, str, str2, i13, j13, CoreUtility.f89236l);
        }
    }
}
