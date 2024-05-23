package me0;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import au.AbstractC2361n;
import au.C2342d0;
import bz.C3162g;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import vg.C28023b6;

/* renamed from: me0.g9 */
/* loaded from: classes4.dex */
public final class C23081g9 {

    /* renamed from: a */
    public static final C23081g9 f112134a = new C23081g9();

    /* renamed from: b */
    private static long f112135b;

    private C23081g9() {
    }

    /* renamed from: a */
    private final void m118404a() {
        AudioAttributes audioAttributes;
        if (Math.abs(System.currentTimeMillis() - f112135b) >= 2000) {
            f112135b = System.currentTimeMillis();
            long[] m118406c = m118406c();
            if (Build.VERSION.SDK_INT >= 26) {
                audioAttributes = m118405b();
            } else {
                audioAttributes = null;
            }
            m118415h(m118406c, -1, audioAttributes);
        }
    }

    /* renamed from: b */
    public static final AudioAttributes m118405b() {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(4);
        builder.setUsage(5);
        AudioAttributes build = builder.build();
        AbstractC19074t.m100207e(build, "build(...)");
        return build;
    }

    /* renamed from: c */
    public static final long[] m118406c() {
        long j11 = 100;
        long j12 = 200;
        return new long[]{0, j11, j12, j11, j12, j11, 400};
    }

    /* renamed from: d */
    public static final void m118407d() {
        if (AbstractC23309i.m121867eg()) {
            int m12355b = AbstractC2361n.m12355b(MainApplication.Companion.m35500c());
            if (m12355b == 0) {
                return;
            }
            C7853b.a aVar = C7853b.Companion;
            if (!aVar.m40150a().m40137k0()) {
                if (AbstractC23309i.m121827de() && m12355b > 0) {
                    f112134a.m118404a();
                }
                if (AbstractC23309i.m121825dc() && m12355b > 1 && !C3162g.f13363a.m15938y()) {
                    aVar.m40150a().m40100N();
                    return;
                }
                return;
            }
            return;
        }
        try {
            if (C28023b6.m141250h0().f130687e == 2) {
                if (Settings.Global.getInt(MainApplication.Companion.m35500c().getContentResolver(), "zen_mode") != 0) {
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        C7853b.a aVar2 = C7853b.Companion;
        if (!aVar2.m40150a().m40137k0()) {
            if (AbstractC23309i.m121827de()) {
                f112134a.m118404a();
            }
            if (AbstractC23309i.m121825dc() && !C3162g.f13363a.m15938y()) {
                aVar2.m40150a().m40100N();
            }
        }
    }

    /* renamed from: e */
    public static final void m118408e() {
        if (AbstractC23309i.m121867eg()) {
            int m12355b = AbstractC2361n.m12355b(MainApplication.Companion.m35500c());
            if (m12355b != 0 && AbstractC23309i.m121827de() && m12355b > 0) {
                f112134a.m118404a();
                return;
            }
            return;
        }
        try {
            if (C28023b6.m141250h0().f130687e == 2) {
                if (Settings.Global.getInt(MainApplication.Companion.m35500c().getContentResolver(), "zen_mode") != 0) {
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (AbstractC23309i.m121827de()) {
            f112134a.m118404a();
        }
    }

    /* renamed from: f */
    public static final void m118409f(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contact");
        if ((contactProfile.m40374K0() && AbstractC23309i.m122450u()) || (!contactProfile.m40374K0() && AbstractC23309i.m122413t())) {
            if (AbstractC23309i.m121867eg()) {
                int m12355b = AbstractC2361n.m12355b(MainApplication.Companion.m35500c());
                if (m12355b == 0) {
                    return;
                }
                C7853b.a aVar = C7853b.Companion;
                if (!aVar.m40150a().m40137k0()) {
                    if (m12355b > 0) {
                        m118413k();
                    }
                    if (m12355b > 1 && !C3162g.f13363a.m15938y()) {
                        aVar.m40150a().m40098L0();
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                if (C28023b6.m141250h0().f130687e == 2) {
                    if (Settings.Global.getInt(MainApplication.Companion.m35500c().getContentResolver(), "zen_mode") != 0) {
                        return;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C7853b.a aVar2 = C7853b.Companion;
            if (!aVar2.m40150a().m40137k0()) {
                m118413k();
                if (!C3162g.f13363a.m15938y()) {
                    aVar2.m40150a().m40098L0();
                }
            }
        }
    }

    /* renamed from: g */
    public static final void m118410g(long j11) {
        Vibrator vibrator;
        VibrationEffect createOneShot;
        try {
            Object m12306a = C2342d0.f9844a.m12306a("VIBRATOR_SERVICE");
            if (m12306a instanceof Vibrator) {
                vibrator = (Vibrator) m12306a;
            } else {
                vibrator = null;
            }
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    createOneShot = VibrationEffect.createOneShot(j11, -1);
                    vibrator.vibrate(createOneShot);
                } else {
                    vibrator.vibrate(j11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    public static final void m118411i() {
        m118410g(50L);
    }

    /* renamed from: j */
    public static final void m118412j(long j11) {
    }

    /* renamed from: k */
    public static final void m118413k() {
        try {
            if (!AbstractC23775p0.m124213r() && AbstractC23309i.m121827de()) {
                Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                int ringerMode = ((AudioManager) systemService).getRingerMode();
                if (ringerMode == 1 || ringerMode == 2) {
                    f112134a.m118404a();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public static final void m118414l(long j11) {
        m118410g(j11);
    }

    /* renamed from: h */
    public final void m118415h(long[] jArr, int i11, AudioAttributes audioAttributes) {
        Vibrator vibrator;
        VibrationEffect createWaveform;
        try {
            Object m12306a = C2342d0.f9844a.m12306a("VIBRATOR_SERVICE");
            if (m12306a instanceof Vibrator) {
                vibrator = (Vibrator) m12306a;
            } else {
                vibrator = null;
            }
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    createWaveform = VibrationEffect.createWaveform(jArr, i11);
                    vibrator.vibrate(createWaveform, audioAttributes);
                } else {
                    vibrator.vibrate(jArr, i11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
