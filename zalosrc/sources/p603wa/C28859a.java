package p603wa;

/* renamed from: wa.a */
/* loaded from: classes3.dex */
public final class C28859a {

    /* renamed from: h */
    public static final C28859a f133661h = new C28859a(4201, 4096, 1);

    /* renamed from: i */
    public static final C28859a f133662i = new C28859a(1033, 1024, 1);

    /* renamed from: j */
    public static final C28859a f133663j;

    /* renamed from: k */
    public static final C28859a f133664k;

    /* renamed from: l */
    public static final C28859a f133665l;

    /* renamed from: m */
    public static final C28859a f133666m;

    /* renamed from: n */
    public static final C28859a f133667n;

    /* renamed from: o */
    public static final C28859a f133668o;

    /* renamed from: a */
    private final int[] f133669a;

    /* renamed from: b */
    private final int[] f133670b;

    /* renamed from: c */
    private final C28860b f133671c;

    /* renamed from: d */
    private final C28860b f133672d;

    /* renamed from: e */
    private final int f133673e;

    /* renamed from: f */
    private final int f133674f;

    /* renamed from: g */
    private final int f133675g;

    static {
        C28859a c28859a = new C28859a(67, 64, 1);
        f133663j = c28859a;
        f133664k = new C28859a(19, 16, 1);
        f133665l = new C28859a(285, 256, 0);
        C28859a c28859a2 = new C28859a(301, 256, 1);
        f133666m = c28859a2;
        f133667n = c28859a2;
        f133668o = c28859a;
    }

    public C28859a(int i11, int i12, int i13) {
        this.f133674f = i11;
        this.f133673e = i12;
        this.f133675g = i13;
        this.f133669a = new int[i12];
        this.f133670b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f133669a[i15] = i14;
            i14 *= 2;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f133670b[this.f133669a[i16]] = i16;
        }
        this.f133671c = new C28860b(this, new int[]{0});
        this.f133672d = new C28860b(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m144284a(int i11, int i12) {
        return i11 ^ i12;
    }

    /* renamed from: b */
    public C28860b m144285b(int i11, int i12) {
        if (i11 >= 0) {
            if (i12 == 0) {
                return this.f133671c;
            }
            int[] iArr = new int[i11 + 1];
            iArr[0] = i12;
            return new C28860b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m144286c(int i11) {
        return this.f133669a[i11];
    }

    /* renamed from: d */
    public int m144287d() {
        return this.f133675g;
    }

    /* renamed from: e */
    public C28860b m144288e() {
        return this.f133671c;
    }

    /* renamed from: f */
    public int m144289f(int i11) {
        if (i11 != 0) {
            return this.f133669a[(this.f133673e - this.f133670b[i11]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public int m144290g(int i11) {
        if (i11 != 0) {
            return this.f133670b[i11];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public int m144291h(int i11, int i12) {
        if (i11 != 0 && i12 != 0) {
            int[] iArr = this.f133669a;
            int[] iArr2 = this.f133670b;
            return iArr[(iArr2[i11] + iArr2[i12]) % (this.f133673e - 1)];
        }
        return 0;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f133674f) + ',' + this.f133673e + ')';
    }
}
