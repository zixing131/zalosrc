package p348mi;

import org.json.JSONArray;

/* renamed from: mi.k */
/* loaded from: classes3.dex */
public final class C23311k {

    /* renamed from: c */
    private int f113491c;

    /* renamed from: a */
    private long f113489a = -1;

    /* renamed from: b */
    private long f113490b = -1;

    /* renamed from: d */
    private final JSONArray f113492d = new JSONArray();

    /* renamed from: e */
    private int f113493e = Integer.MAX_VALUE;

    /* renamed from: f */
    private int f113494f = -1;

    /* renamed from: a */
    public final JSONArray m122673a() {
        return this.f113492d;
    }

    /* renamed from: b */
    public final long m122674b() {
        return this.f113490b;
    }

    /* renamed from: c */
    public final int m122675c() {
        return this.f113494f;
    }

    /* renamed from: d */
    public final int m122676d() {
        return this.f113493e;
    }

    /* renamed from: e */
    public final int m122677e() {
        return this.f113491c;
    }

    /* renamed from: f */
    public final long m122678f() {
        return this.f113489a;
    }

    /* renamed from: g */
    public final void m122679g() {
        this.f113491c++;
    }

    /* renamed from: h */
    public final void m122680h(long j11) {
        this.f113490b = j11;
    }

    /* renamed from: i */
    public final void m122681i(int i11) {
        if (i11 < this.f113493e) {
            this.f113493e = i11;
        }
        if (i11 > this.f113494f) {
            this.f113494f = i11;
        }
    }

    /* renamed from: j */
    public final void m122682j(long j11) {
        this.f113489a = j11;
    }
}
