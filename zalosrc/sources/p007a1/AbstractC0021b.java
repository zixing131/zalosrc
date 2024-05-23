package p007a1;

/* renamed from: a1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0021b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1.b$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC0021b {

        /* renamed from: a */
        double f57a;

        /* renamed from: b */
        double[] f58b;

        a(double d11, double[] dArr) {
            this.f57a = d11;
            this.f58b = dArr;
        }

        @Override // p007a1.AbstractC0021b
        /* renamed from: c */
        public double mo40c(double d11, int i11) {
            return this.f58b[i11];
        }

        @Override // p007a1.AbstractC0021b
        /* renamed from: d */
        public void mo41d(double d11, double[] dArr) {
            double[] dArr2 = this.f58b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p007a1.AbstractC0021b
        /* renamed from: e */
        public void mo42e(double d11, float[] fArr) {
            int i11 = 0;
            while (true) {
                double[] dArr = this.f58b;
                if (i11 < dArr.length) {
                    fArr[i11] = (float) dArr[i11];
                    i11++;
                } else {
                    return;
                }
            }
        }

        @Override // p007a1.AbstractC0021b
        /* renamed from: f */
        public double mo43f(double d11, int i11) {
            return 0.0d;
        }

        @Override // p007a1.AbstractC0021b
        /* renamed from: g */
        public void mo44g(double d11, double[] dArr) {
            for (int i11 = 0; i11 < this.f58b.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        @Override // p007a1.AbstractC0021b
        /* renamed from: h */
        public double[] mo45h() {
            return new double[]{this.f57a};
        }
    }

    /* renamed from: a */
    public static AbstractC0021b m57a(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        if (i11 != 0) {
            if (i11 != 2) {
                return new C0025f(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new C0026g(dArr, dArr2);
    }

    /* renamed from: b */
    public static AbstractC0021b m58b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C0020a(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo40c(double d11, int i11);

    /* renamed from: d */
    public abstract void mo41d(double d11, double[] dArr);

    /* renamed from: e */
    public abstract void mo42e(double d11, float[] fArr);

    /* renamed from: f */
    public abstract double mo43f(double d11, int i11);

    /* renamed from: g */
    public abstract void mo44g(double d11, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo45h();
}
