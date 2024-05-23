package p127eb;

import org.webrtc.voiceengine.WebRtcAudioUtils;
import p097db.EnumC17862u;

/* renamed from: eb.b */
/* loaded from: classes3.dex */
public class C18373b {

    /* renamed from: b */
    private static C18373b f92744b = null;

    /* renamed from: c */
    public static volatile boolean f92745c = false;

    /* renamed from: a */
    private C18372a f92746a = null;

    /* renamed from: c */
    public static synchronized C18373b m97334c() {
        C18373b c18373b;
        synchronized (C18373b.class) {
            try {
                if (f92744b == null) {
                    f92744b = new C18373b();
                }
                if (f92744b.f92746a == null && f92745c) {
                    f92744b.f92746a = new C18372a();
                }
                c18373b = f92744b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18373b;
    }

    /* renamed from: a */
    public void m97335a() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97313a();
        }
    }

    /* renamed from: b */
    public void m97336b() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97315c();
        }
        this.f92746a = null;
    }

    /* renamed from: d */
    public String m97337d(String str) {
        C18372a c18372a = this.f92746a;
        if (c18372a == null) {
            return "";
        }
        return c18372a.m97316d(str);
    }

    /* renamed from: e */
    public int m97338e() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            return c18372a.m97317e();
        }
        return EnumC17862u.FAILED.m94384b();
    }

    /* renamed from: f */
    public boolean m97339f() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            return c18372a.m97318f();
        }
        return false;
    }

    /* renamed from: g */
    public void m97340g(boolean z11) {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97319g(z11);
        }
    }

    /* renamed from: h */
    public int m97341h(byte[] bArr, int i11, int i12, int i13, long j11) {
        C18372a c18372a = this.f92746a;
        if (c18372a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        c18372a.m97320h(bArr, i11, i12, i13, j11);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: i */
    public int m97342i(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        C18372a c18372a = this.f92746a;
        if (c18372a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        c18372a.m97321i(i11, i12, i13, fArr, i14, j11);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: j */
    public void m97343j() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97322j();
        }
    }

    /* renamed from: k */
    public void m97344k() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97323k();
        }
    }

    /* renamed from: l */
    public void m97345l(Object obj) {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97324l(obj);
        }
    }

    /* renamed from: m */
    public void m97346m() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97325m();
        }
    }

    /* renamed from: n */
    public void m97347n() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97326n();
        }
    }

    /* renamed from: o */
    public int m97348o(Object obj) {
        C18372a c18372a = this.f92746a;
        if (c18372a == null) {
            return EnumC17862u.CONFIG_NOT_SET.m94384b();
        }
        return c18372a.m97327o(obj);
    }

    /* renamed from: p */
    public void m97349p(int i11) {
        WebRtcAudioUtils.setDefaultSampleRateHz(i11);
    }

    /* renamed from: q */
    public int m97350q(Object obj) {
        C18372a c18372a = this.f92746a;
        if (c18372a == null) {
            return EnumC17862u.CONFIG_NOT_SET.m94384b();
        }
        return c18372a.m97328p(obj);
    }

    /* renamed from: r */
    public void m97351r(C18375d c18375d) {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97329q(c18375d);
        }
    }

    /* renamed from: s */
    public int m97352s(Object obj) {
        C18372a c18372a = this.f92746a;
        if (c18372a == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        c18372a.m97330r(obj);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: t */
    public void m97353t(int i11) {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97331s(i11);
        }
    }

    /* renamed from: u */
    public int m97354u() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            return c18372a.m97332t();
        }
        return EnumC17862u.FAILED.m94384b();
    }

    /* renamed from: v */
    public void m97355v() {
        C18372a c18372a = this.f92746a;
        if (c18372a != null) {
            c18372a.m97333u();
        }
    }
}
