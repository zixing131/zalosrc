package p127eb;

import org.webrtc.voiceengine.WebRtcAudioUtils;
import p097db.EnumC17862u;

/* renamed from: eb.f */
/* loaded from: classes3.dex */
public class C18377f {

    /* renamed from: b */
    private static C18377f f92769b;

    /* renamed from: a */
    private C18376e f92770a = null;

    /* renamed from: a */
    public static synchronized void m97371a() {
        synchronized (C18377f.class) {
            C18377f c18377f = f92769b;
            if (c18377f != null && c18377f.f92770a != null) {
                c18377f.f92770a = null;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C18377f m97372b() {
        C18377f c18377f;
        synchronized (C18377f.class) {
            try {
                if (f92769b == null) {
                    f92769b = new C18377f();
                }
                C18377f c18377f2 = f92769b;
                if (c18377f2.f92770a == null) {
                    c18377f2.f92770a = new C18376e();
                }
                c18377f = f92769b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18377f;
    }

    /* renamed from: c */
    public void m97373c(Object obj) {
        C18376e c18376e = this.f92770a;
        if (c18376e != null) {
            c18376e.m97364b(obj);
        }
    }

    /* renamed from: d */
    public int m97374d(Object obj) {
        C18376e c18376e = this.f92770a;
        if (c18376e == null) {
            return EnumC17862u.CONFIG_NOT_SET.m94384b();
        }
        return c18376e.m97365c(obj);
    }

    /* renamed from: e */
    public void m97375e(int i11) {
        WebRtcAudioUtils.setDefaultSampleRateHz(i11);
    }

    /* renamed from: f */
    public int m97376f(Object obj) {
        C18376e c18376e = this.f92770a;
        if (c18376e == null) {
            return EnumC17862u.CONFIG_NOT_SET.m94384b();
        }
        return c18376e.m97366d(obj);
    }

    /* renamed from: g */
    public void m97377g(int i11) {
        C18376e c18376e = this.f92770a;
        if (c18376e != null) {
            c18376e.m97367e(i11);
        }
    }

    /* renamed from: h */
    public int m97378h(Object obj) {
        C18376e c18376e = this.f92770a;
        if (c18376e == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        c18376e.m97368f(obj);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: i */
    public int m97379i(String str) {
        C18376e c18376e = this.f92770a;
        if (c18376e != null) {
            return c18376e.m97369g(str);
        }
        return EnumC17862u.FAILED.m94384b();
    }

    /* renamed from: j */
    public void m97380j() {
        C18376e c18376e = this.f92770a;
        if (c18376e != null) {
            c18376e.m97370h();
        }
    }
}
