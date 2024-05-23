package p666y1;

/* renamed from: y1.c */
/* loaded from: classes2.dex */
public final class C30257c {

    /* renamed from: e */
    public static final C30257c f140545e;

    /* renamed from: f */
    public static final C30257c f140546f;

    /* renamed from: g */
    public static final C30257c f140547g;

    /* renamed from: h */
    public static final C30257c f140548h;

    /* renamed from: i */
    public static final C30257c f140549i;

    /* renamed from: j */
    public static final C30257c f140550j;

    /* renamed from: a */
    final float[] f140551a;

    /* renamed from: b */
    final float[] f140552b;

    /* renamed from: c */
    final float[] f140553c = new float[3];

    /* renamed from: d */
    boolean f140554d = true;

    static {
        C30257c c30257c = new C30257c();
        f140545e = c30257c;
        m149258m(c30257c);
        m149261p(c30257c);
        C30257c c30257c2 = new C30257c();
        f140546f = c30257c2;
        m149260o(c30257c2);
        m149261p(c30257c2);
        C30257c c30257c3 = new C30257c();
        f140547g = c30257c3;
        m149257l(c30257c3);
        m149261p(c30257c3);
        C30257c c30257c4 = new C30257c();
        f140548h = c30257c4;
        m149258m(c30257c4);
        m149259n(c30257c4);
        C30257c c30257c5 = new C30257c();
        f140549i = c30257c5;
        m149260o(c30257c5);
        m149259n(c30257c5);
        C30257c c30257c6 = new C30257c();
        f140550j = c30257c6;
        m149257l(c30257c6);
        m149259n(c30257c6);
    }

    C30257c() {
        float[] fArr = new float[3];
        this.f140551a = fArr;
        float[] fArr2 = new float[3];
        this.f140552b = fArr2;
        m149263r(fArr);
        m149263r(fArr2);
        m149262q();
    }

    /* renamed from: l */
    private static void m149257l(C30257c c30257c) {
        float[] fArr = c30257c.f140552b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    private static void m149258m(C30257c c30257c) {
        float[] fArr = c30257c.f140552b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    private static void m149259n(C30257c c30257c) {
        float[] fArr = c30257c.f140551a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    private static void m149260o(C30257c c30257c) {
        float[] fArr = c30257c.f140552b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    private static void m149261p(C30257c c30257c) {
        float[] fArr = c30257c.f140551a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: q */
    private void m149262q() {
        float[] fArr = this.f140553c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* renamed from: r */
    private static void m149263r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float m149264a() {
        return this.f140553c[1];
    }

    /* renamed from: b */
    public float m149265b() {
        return this.f140552b[2];
    }

    /* renamed from: c */
    public float m149266c() {
        return this.f140551a[2];
    }

    /* renamed from: d */
    public float m149267d() {
        return this.f140552b[0];
    }

    /* renamed from: e */
    public float m149268e() {
        return this.f140551a[0];
    }

    /* renamed from: f */
    public float m149269f() {
        return this.f140553c[2];
    }

    /* renamed from: g */
    public float m149270g() {
        return this.f140553c[0];
    }

    /* renamed from: h */
    public float m149271h() {
        return this.f140552b[1];
    }

    /* renamed from: i */
    public float m149272i() {
        return this.f140551a[1];
    }

    /* renamed from: j */
    public boolean m149273j() {
        return this.f140554d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m149274k() {
        int length = this.f140553c.length;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            float f12 = this.f140553c[i11];
            if (f12 > 0.0f) {
                f11 += f12;
            }
        }
        if (f11 != 0.0f) {
            int length2 = this.f140553c.length;
            for (int i12 = 0; i12 < length2; i12++) {
                float[] fArr = this.f140553c;
                float f13 = fArr[i12];
                if (f13 > 0.0f) {
                    fArr[i12] = f13 / f11;
                }
            }
        }
    }
}
