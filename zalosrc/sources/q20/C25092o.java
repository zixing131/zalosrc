package q20;

import android.content.res.Resources;

/* renamed from: q20.o */
/* loaded from: classes5.dex */
public final class C25092o {

    /* renamed from: a */
    public static final C25092o f120501a = new C25092o();

    /* renamed from: b */
    private static boolean f120502b;

    /* renamed from: c */
    private static int f120503c;

    /* renamed from: d */
    private static int f120504d;

    /* renamed from: e */
    private static int f120505e;

    /* renamed from: f */
    private static int f120506f;

    /* renamed from: g */
    private static int f120507g;

    /* renamed from: h */
    private static int f120508h;

    private C25092o() {
    }

    /* renamed from: a */
    private final int m130061a() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* renamed from: h */
    private final boolean m130062h() {
        if (m130061a() >= 320) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m130063b() {
        return f120504d;
    }

    /* renamed from: c */
    public final int m130064c() {
        return f120508h;
    }

    /* renamed from: d */
    public final int m130065d() {
        return f120506f;
    }

    /* renamed from: e */
    public final int m130066e() {
        return f120503c;
    }

    /* renamed from: f */
    public final int m130067f() {
        return f120507g;
    }

    /* renamed from: g */
    public final int m130068g() {
        return f120505e;
    }

    /* renamed from: i */
    public final void m130069i() {
        if (f120502b) {
            return;
        }
        if (m130062h()) {
            f120503c = 1080;
            f120504d = 720;
            f120505e = 540;
            f120506f = 360;
            f120507g = 360;
            f120508h = 240;
        } else {
            f120503c = 720;
            f120504d = 640;
            f120505e = 360;
            f120506f = 320;
            f120507g = 320;
            f120508h = 192;
        }
        f120502b = true;
    }
}
