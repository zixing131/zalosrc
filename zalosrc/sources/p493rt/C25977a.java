package p493rt;

import ho0.AbstractC20110a;

/* renamed from: rt.a */
/* loaded from: classes4.dex */
public class C25977a {

    /* renamed from: a */
    public int f123940a;

    /* renamed from: b */
    public int f123941b;

    /* renamed from: c */
    public int f123942c;

    private C25977a() {
    }

    /* renamed from: a */
    private void m133804a() {
        this.f123940a = (int) (Math.round(this.f123940a / 16.0d) * 16);
        this.f123941b = (int) (Math.round(this.f123941b / 16.0d) * 16);
    }

    /* renamed from: b */
    public static C25977a m133805b(int i11, int i12, float f11) {
        C25977a c25977a = new C25977a();
        float min = Math.min(i11, i12) / f11;
        if (min >= 1.0f) {
            c25977a.f123940a = (int) (i11 / min);
            c25977a.f123941b = (int) (i12 / min);
        } else {
            c25977a.f123940a = i11;
            c25977a.f123941b = i12;
        }
        c25977a.m133804a();
        AbstractC20110a.m104535d("width: " + c25977a.f123940a + ", height: " + c25977a.f123941b, new Object[0]);
        return c25977a;
    }

    /* renamed from: c */
    public static C25977a m133806c(int i11, int i12, float f11, String str) {
        C25977a c25977a = new C25977a();
        float min = Math.min(i11, i12) / f11;
        if (min >= 1.0f) {
            c25977a.f123940a = (int) (i11 / min);
            c25977a.f123941b = (int) (i12 / min);
        } else {
            c25977a.f123940a = i11;
            c25977a.f123941b = i12;
        }
        c25977a.m133804a();
        c25977a.f123942c = Integer.parseInt(str);
        AbstractC20110a.m104535d("width: " + c25977a.f123940a + ", height: " + c25977a.f123941b + ", videoBitrate: " + c25977a.f123942c, new Object[0]);
        return c25977a;
    }
}
