package okio;

/* renamed from: okio.d */
/* loaded from: classes7.dex */
final class C24294d {

    /* renamed from: a */
    final byte[] f117285a;

    /* renamed from: b */
    int f117286b;

    /* renamed from: c */
    int f117287c;

    /* renamed from: d */
    boolean f117288d;

    /* renamed from: e */
    boolean f117289e;

    /* renamed from: f */
    C24294d f117290f;

    /* renamed from: g */
    C24294d f117291g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24294d() {
        this.f117285a = new byte[8192];
        this.f117289e = true;
        this.f117288d = false;
    }

    /* renamed from: a */
    public final C24294d m126829a() {
        C24294d c24294d;
        C24294d c24294d2 = this.f117290f;
        if (c24294d2 != this) {
            c24294d = c24294d2;
        } else {
            c24294d = null;
        }
        C24294d c24294d3 = this.f117291g;
        c24294d3.f117290f = c24294d2;
        this.f117290f.f117291g = c24294d3;
        this.f117290f = null;
        this.f117291g = null;
        return c24294d;
    }

    /* renamed from: b */
    public final C24294d m126830b(C24294d c24294d) {
        c24294d.f117291g = this;
        c24294d.f117290f = this.f117290f;
        this.f117290f.f117291g = c24294d;
        this.f117290f = c24294d;
        return c24294d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C24294d m126831c() {
        this.f117288d = true;
        return new C24294d(this.f117285a, this.f117286b, this.f117287c, true, false);
    }

    C24294d(byte[] bArr, int i11, int i12, boolean z11, boolean z12) {
        this.f117285a = bArr;
        this.f117286b = i11;
        this.f117287c = i12;
        this.f117288d = z11;
        this.f117289e = z12;
    }
}
