package ge;

import java.util.HashSet;

/* renamed from: ge.h */
/* loaded from: classes3.dex */
public class C19416h {

    /* renamed from: e */
    private static final HashSet f96333e = new HashSet();

    /* renamed from: a */
    public int f96334a;

    /* renamed from: b */
    public String f96335b;

    /* renamed from: c */
    public long f96336c;

    /* renamed from: d */
    public long f96337d;

    public C19416h(int i11, String str, long j11, long j12) {
        this(i11, str, j11, j12, false);
    }

    /* renamed from: a */
    public static void m101549a() {
        f96333e.clear();
    }

    /* renamed from: b */
    public static C19416h m101550b(String str, long j11, long j12) {
        return new C19416h(-1, str, j11, j12, true);
    }

    /* renamed from: c */
    public static boolean m101551c(int i11) {
        return !f96333e.contains(Integer.valueOf(i11));
    }

    /* renamed from: e */
    public static void m101552e(int i11) {
        f96333e.remove(Integer.valueOf(i11));
    }

    /* renamed from: d */
    public String m101553d() {
        return this.f96335b + "_" + this.f96337d;
    }

    private C19416h(int i11, String str, long j11, long j12, boolean z11) {
        this.f96334a = i11;
        this.f96335b = str;
        this.f96336c = j11;
        this.f96337d = j12;
        if (z11) {
            return;
        }
        f96333e.add(Integer.valueOf(i11));
    }
}
