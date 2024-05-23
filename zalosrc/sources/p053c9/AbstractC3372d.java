package p053c9;

import p053c9.C3369a;
import p053c9.C3371c;

/* renamed from: c9.d */
/* loaded from: classes.dex */
public abstract class AbstractC3372d {

    /* renamed from: a */
    public static AbstractC3372d f14268a = m16967a().mo16946a();

    /* renamed from: c9.d$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC3372d mo16946a();

        /* renamed from: b */
        public abstract a mo16947b(String str);

        /* renamed from: c */
        public abstract a mo16948c(long j11);

        /* renamed from: d */
        public abstract a mo16949d(String str);

        /* renamed from: e */
        public abstract a mo16950e(String str);

        /* renamed from: f */
        public abstract a mo16951f(String str);

        /* renamed from: g */
        public abstract a mo16952g(C3371c.a aVar);

        /* renamed from: h */
        public abstract a mo16953h(long j11);
    }

    /* renamed from: a */
    public static a m16967a() {
        return new C3369a.b().mo16953h(0L).mo16952g(C3371c.a.ATTEMPT_MIGRATION).mo16948c(0L);
    }

    /* renamed from: b */
    public abstract String mo16938b();

    /* renamed from: c */
    public abstract long mo16939c();

    /* renamed from: d */
    public abstract String mo16940d();

    /* renamed from: e */
    public abstract String mo16941e();

    /* renamed from: f */
    public abstract String mo16942f();

    /* renamed from: g */
    public abstract C3371c.a mo16943g();

    /* renamed from: h */
    public abstract long mo16944h();

    /* renamed from: i */
    public boolean m16968i() {
        if (mo16943g() == C3371c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m16969j() {
        if (mo16943g() != C3371c.a.NOT_GENERATED && mo16943g() != C3371c.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m16970k() {
        if (mo16943g() == C3371c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m16971l() {
        if (mo16943g() == C3371c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m16972m() {
        if (mo16943g() == C3371c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract a mo16945n();

    /* renamed from: o */
    public AbstractC3372d m16973o(String str, long j11, long j12) {
        return mo16945n().mo16947b(str).mo16948c(j11).mo16953h(j12).mo16946a();
    }

    /* renamed from: p */
    public AbstractC3372d m16974p() {
        return mo16945n().mo16947b(null).mo16946a();
    }

    /* renamed from: q */
    public AbstractC3372d m16975q(String str) {
        return mo16945n().mo16950e(str).mo16952g(C3371c.a.REGISTER_ERROR).mo16946a();
    }

    /* renamed from: r */
    public AbstractC3372d m16976r() {
        return mo16945n().mo16952g(C3371c.a.NOT_GENERATED).mo16946a();
    }

    /* renamed from: s */
    public AbstractC3372d m16977s(String str, String str2, long j11, String str3, long j12) {
        return mo16945n().mo16949d(str).mo16952g(C3371c.a.REGISTERED).mo16947b(str3).mo16951f(str2).mo16948c(j12).mo16953h(j11).mo16946a();
    }

    /* renamed from: t */
    public AbstractC3372d m16978t(String str) {
        return mo16945n().mo16949d(str).mo16952g(C3371c.a.UNREGISTERED).mo16946a();
    }
}
