package d00;

import e00.EnumC18157a;
import k00.C21424a;

/* renamed from: d00.c */
/* loaded from: classes4.dex */
public class C17689c extends AbstractC17690d {
    private static final long serialVersionUID = 1;

    public C17689c() {
        super(EnumC18157a.f91819p);
    }

    /* renamed from: p */
    public C17687a m93696p() {
        int m93703k = m93703k();
        int m93702j = m93702j();
        C17687a c17687a = new C17687a(m93703k, m93702j);
        for (int i11 = 0; i11 < m93702j; i11++) {
            for (int i12 = 0; i12 < m93703k; i12++) {
                float f11 = ((C17687a) this.f89692p.get(0)).f89691r[i11][i12];
                for (int i13 = 1; i13 < m93705n(); i13++) {
                    if (f11 < ((C17687a) this.f89692p.get(i13)).f89691r[i11][i12]) {
                        f11 = ((C17687a) this.f89692p.get(i13)).f89691r[i11][i12];
                    }
                }
                c17687a.f89691r[i11][i12] = f11;
            }
        }
        return c17687a;
    }

    /* renamed from: r */
    public C17689c m93697r(int[] iArr, int i11, int i12) {
        float[][] fArr;
        if (m93703k() != i11 || m93702j() != i12) {
            m93704l(m93699u(i11, i12));
        }
        float[][] fArr2 = ((C17687a) this.f89692p.get(0)).f89691r;
        float[][] fArr3 = ((C17687a) this.f89692p.get(1)).f89691r;
        float[][] fArr4 = ((C17687a) this.f89692p.get(2)).f89691r;
        if (this.f89693q == EnumC18157a.f91824u) {
            fArr = ((C17687a) this.f89692p.get(3)).f89691r;
        } else {
            fArr = null;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = 0;
            while (i15 < i11) {
                int i16 = iArr[i13];
                int i17 = (i16 >> 24) & 255;
                float[] fArr5 = fArr2[i14];
                float[] fArr6 = C21424a.f104416a;
                fArr5[i15] = fArr6[(i16 >> 16) & 255];
                fArr3[i14][i15] = fArr6[(i16 >> 8) & 255];
                fArr4[i14][i15] = fArr6[i16 & 255];
                if (fArr != null) {
                    fArr[i14][i15] = fArr6[i17];
                }
                i15++;
                i13++;
            }
        }
        return this;
    }

    @Override // d00.AbstractC17690d
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C17689c mo93695m() {
        return new C17689c();
    }

    /* renamed from: u */
    public C17689c m93699u(int i11, int i12) {
        C17689c c17689c = new C17689c(i11, i12, this.f89692p.size());
        c17689c.f89693q = this.f89693q;
        return c17689c;
    }

    public C17689c(int i11, int i12, int i13) {
        if (i13 == 3) {
            this.f89693q = EnumC18157a.f91819p;
        } else if (i13 == 4) {
            this.f89693q = EnumC18157a.f91824u;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            this.f89692p.add(new C17687a(i11, i12));
        }
    }

    public C17689c(int[] iArr, int i11, int i12, boolean z11) {
        this(i11, i12, z11 ? 4 : 3);
        m93697r(iArr, i11, i12);
    }
}
