package p348mi;

/* renamed from: mi.l */
/* loaded from: classes3.dex */
public final class C23312l {

    /* renamed from: a */
    private int f113495a;

    /* renamed from: b */
    private int f113496b;

    /* renamed from: c */
    private long f113497c;

    /* renamed from: d */
    private long f113498d;

    /* renamed from: e */
    private int f113499e = Integer.MAX_VALUE;

    /* renamed from: f */
    private int f113500f = -1;

    /* renamed from: a */
    public final void m122683a(long j11) {
        long j12 = this.f113498d;
        if (j12 != 0) {
            this.f113497c += j11 - j12;
            this.f113498d = 0L;
        }
    }

    /* renamed from: b */
    public final String m122684b() {
        int i11;
        int i12 = this.f113499e;
        if (i12 != Integer.MAX_VALUE && (i11 = this.f113500f) != -1) {
            return i12 + "_" + i11;
        }
        return "";
    }

    /* renamed from: c */
    public final int m122685c() {
        return this.f113496b;
    }

    /* renamed from: d */
    public final int m122686d() {
        return this.f113495a;
    }

    /* renamed from: e */
    public final long m122687e() {
        return this.f113497c;
    }

    /* renamed from: f */
    public final void m122688f() {
        this.f113496b++;
    }

    /* renamed from: g */
    public final void m122689g(long j11) {
        this.f113498d = j11;
    }
}
