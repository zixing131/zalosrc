package g00;

import d00.C17687a;

/* renamed from: g00.g */
/* loaded from: classes4.dex */
public class C19194g {

    /* renamed from: d */
    public static final C17687a f95323d = new C17687a(new float[][]{new float[]{1.0f, 0.0f, -1.0f}, new float[]{2.0f, 0.0f, -2.0f}, new float[]{1.0f, 0.0f, -1.0f}});

    /* renamed from: e */
    public static final C17687a f95324e = new C17687a(new float[][]{new float[]{1.0f, 2.0f, 1.0f}, new float[]{0.0f, 0.0f, 0.0f}, new float[]{-1.0f, -2.0f, -1.0f}});

    /* renamed from: a */
    public C17687a f95325a;

    /* renamed from: b */
    public C17687a f95326b;

    /* renamed from: c */
    private final float f95327c;

    /* renamed from: g00.g$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC19191d {
        a() {
            super(C19194g.f95323d);
        }
    }

    /* renamed from: g00.g$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC19191d {
        b() {
            super(C19194g.f95324e);
        }
    }

    public C19194g(float f11) {
        this.f95327c = f11;
    }

    /* renamed from: a */
    public void m100648a(C17687a c17687a) {
        C17687a mo93685e = c17687a.mo93685e();
        float f11 = this.f95327c;
        if (f11 != 0.0f) {
            new C19192e(f11).m100645b(mo93685e);
        }
        this.f95325a = mo93685e.mo93685e();
        new a().m100642b(this.f95325a);
        this.f95326b = mo93685e.mo93685e();
        new b().m100642b(this.f95326b);
    }
}
