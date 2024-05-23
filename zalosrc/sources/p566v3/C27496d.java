package p566v3;

import p631x3.AbstractC29302c;

/* renamed from: v3.d */
/* loaded from: classes2.dex */
public class C27496d implements InterfaceC27493a {

    /* renamed from: a */
    private final int f129338a;

    /* renamed from: b */
    private final float[] f129339b;

    /* renamed from: v3.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f129340a;

        /* renamed from: b */
        public float[] f129341b;

        /* renamed from: a */
        public C27496d m140605a() {
            return new C27496d(this.f129340a, this.f129341b);
        }
    }

    @Override // p566v3.InterfaceC27493a
    /* renamed from: a */
    public int mo140593a() {
        return this.f129338a;
    }

    /* renamed from: b */
    public float[] m140604b() {
        return this.f129339b;
    }

    private C27496d(int i11, float[] fArr) {
        this.f129338a = i11;
        this.f129339b = (float[]) AbstractC29302c.m146400b(fArr, fArr.length > 0, "data");
    }

    public C27496d(C27496d c27496d) {
        this.f129338a = c27496d.f129338a;
        float[] fArr = c27496d.f129339b;
        if (fArr == null) {
            this.f129339b = null;
            return;
        }
        this.f129339b = new float[fArr.length];
        int i11 = 0;
        while (true) {
            float[] fArr2 = c27496d.f129339b;
            if (i11 >= fArr2.length) {
                return;
            }
            this.f129339b[i11] = fArr2[i11];
            i11++;
        }
    }
}
