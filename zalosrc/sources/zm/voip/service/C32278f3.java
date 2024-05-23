package zm.voip.service;

import p097db.EnumC17851j;
import p097db.EnumC17859r;

/* renamed from: zm.voip.service.f3 */
/* loaded from: classes7.dex */
public final class C32278f3 {

    /* renamed from: a */
    public static final C32278f3 f148929a = new C32278f3();

    private C32278f3() {
    }

    /* renamed from: a */
    public static final boolean m155945a(int i11) {
        if (m155948d(i11) || m155949e(i11) || m155950f(i11) || m155951g(i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m155946b(int i11) {
        if (i11 == EnumC17859r.ZSMC_CAMERA_CANNOT_CAPTURE.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m155947c(int i11) {
        if (i11 == EnumC17859r.ZSMC_CAMERA_CAPUTE_NO_ERROR.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m155948d(int i11) {
        if (i11 == EnumC17851j.ZSMC_AUDIO_CANNOT_RECORD.ordinal() || i11 == EnumC17851j.ZSMC_AUDIO_RECORD_SLOW.ordinal() || i11 == EnumC17851j.ZSMC_AUDIO_RECORD_EMPTY.ordinal() || i11 == EnumC17851j.ZSMC_AUDIO_RECORD_FAST.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m155949e(int i11) {
        if (i11 == EnumC17851j.ZSMC_AUDIO_RECORD_NO_ERROR.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m155950f(int i11) {
        if (i11 == EnumC17851j.ZSMC_AUDIO_CANNOT_PLAY.ordinal() || i11 == EnumC17851j.ZSMC_AUDIO_PLAYOUT_SLOW.ordinal() || i11 == EnumC17851j.ZSMC_AUDIO_PLAY_FAST.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m155951g(int i11) {
        if (i11 == EnumC17851j.ZSMC_AUDIO_PLAY_NO_ERROR.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m155952h(int i11) {
        if (m155946b(i11) || m155947c(i11)) {
            return true;
        }
        return false;
    }
}
