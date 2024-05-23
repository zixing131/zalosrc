package g00;

import d00.C17687a;
import i00.C20180c;
import i00.C20182e;

/* renamed from: g00.d */
/* loaded from: classes4.dex */
public abstract class AbstractC19191d {

    /* renamed from: a */
    public C17687a f95315a;

    /* renamed from: b */
    private a f95316b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g00.d$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: g00.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C32822a implements a {

            /* renamed from: a */
            protected C17687a f95317a;

            C32822a(C17687a c17687a) {
                this.f95317a = c17687a;
            }

            @Override // g00.AbstractC19191d.a
            /* renamed from: a */
            public void mo100643a(C17687a c17687a) {
                C17687a c17687a2 = this.f95317a;
                int i11 = c17687a2.f89694p;
                int i12 = c17687a2.f89695q;
                int i13 = i11 / 2;
                int i14 = i12 / 2;
                C17687a m93692s = c17687a.m93692s(c17687a.f89695q, c17687a.f89694p);
                for (int i15 = i13; i15 < c17687a.f89694p - (i11 - i13); i15++) {
                    for (int i16 = i14; i16 < c17687a.f89695q - (i12 - i14); i16++) {
                        int i17 = i11 - 1;
                        float f11 = 0.0f;
                        int i18 = 0;
                        while (i18 < i11) {
                            int i19 = i12 - 1;
                            int i21 = 0;
                            while (i21 < i12) {
                                f11 += c17687a.f89691r[(i15 + i18) - i13][(i16 + i21) - i14] * this.f95317a.f89691r[i17][i19];
                                i21++;
                                i19--;
                            }
                            i18++;
                            i17--;
                        }
                        m93692s.f89691r[i15][i16] = f11;
                    }
                }
                c17687a.m93689n(m93692s);
            }
        }

        /* renamed from: g00.d$a$b */
        /* loaded from: classes4.dex */
        public static class b implements a {

            /* renamed from: a */
            private final float[] f95318a;

            /* renamed from: b */
            private final boolean f95319b;

            b(C17687a c17687a) {
                int i11 = c17687a.f89694p;
                if (i11 == 1) {
                    this.f95319b = true;
                    this.f95318a = c17687a.f89691r[0];
                    return;
                }
                this.f95319b = false;
                this.f95318a = new float[i11];
                for (int i12 = 0; i12 < c17687a.f89694p; i12++) {
                    this.f95318a[i12] = c17687a.f89691r[i12][0];
                }
            }

            @Override // g00.AbstractC19191d.a
            /* renamed from: a */
            public void mo100643a(C17687a c17687a) {
                if (this.f95319b) {
                    AbstractC19193f.m100646a(c17687a, this.f95318a);
                } else {
                    AbstractC19193f.m100647b(c17687a, this.f95318a);
                }
            }
        }

        /* renamed from: g00.d$a$c */
        /* loaded from: classes4.dex */
        public static class c implements a {

            /* renamed from: a */
            private final float[] f95320a;

            /* renamed from: b */
            private final float[] f95321b;

            c(C20182e c20182e) {
                int m105275k = c20182e.m105283b().m105275k();
                this.f95320a = new float[m105275k];
                this.f95321b = new float[m105275k];
                float sqrt = (float) Math.sqrt(c20182e.m105282a().m105268c(0, 0));
                for (int i11 = 0; i11 < m105275k; i11++) {
                    this.f95320a[i11] = ((float) c20182e.m105283b().m105268c(i11, 0)) * sqrt;
                    this.f95321b[i11] = ((float) c20182e.m105284c().m105268c(i11, 0)) * sqrt;
                }
            }

            @Override // g00.AbstractC19191d.a
            /* renamed from: a */
            public void mo100643a(C17687a c17687a) {
                AbstractC19193f.m100646a(c17687a, this.f95321b);
                AbstractC19193f.m100647b(c17687a, this.f95320a);
            }
        }

        /* renamed from: a */
        void mo100643a(C17687a c17687a);
    }

    public AbstractC19191d(C17687a c17687a) {
        this.f95315a = c17687a;
        m100641c(false);
    }

    /* renamed from: a */
    public static C20180c m100640a(float[][] fArr) {
        C20180c c20180c = new C20180c(fArr.length, fArr[0].length);
        for (int i11 = 0; i11 < fArr.length; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 < fArr[i11].length) {
                    c20180c.m105277p(i11, i12, r4[i12]);
                    i12++;
                }
            }
        }
        return c20180c;
    }

    /* renamed from: c */
    private void m100641c(boolean z11) {
        if (z11) {
            this.f95316b = new a.C32822a(this.f95315a);
            return;
        }
        C17687a c17687a = this.f95315a;
        if (c17687a.f89695q != 1 && c17687a.f89694p != 1) {
            C20182e c20182e = new C20182e(m100640a(c17687a.f89691r));
            if (c20182e.m105285d() == 1) {
                this.f95316b = new a.c(c20182e);
                return;
            } else {
                this.f95316b = new a.C32822a(this.f95315a);
                return;
            }
        }
        this.f95316b = new a.b(c17687a);
    }

    /* renamed from: b */
    public void m100642b(C17687a c17687a) {
        this.f95316b.mo100643a(c17687a);
    }
}
