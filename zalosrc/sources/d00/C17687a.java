package d00;

import java.lang.reflect.Array;
import java.util.logging.Logger;

/* renamed from: d00.a */
/* loaded from: classes4.dex */
public class C17687a extends AbstractC17691e {

    /* renamed from: s */
    protected static Logger f89690s = Logger.getLogger(C17687a.class.getName());
    private static final long serialVersionUID = 1;

    /* renamed from: r */
    public float[][] f89691r;

    public C17687a(float[][] fArr) {
        this.f89691r = fArr;
        this.f89694p = fArr.length;
        this.f89695q = fArr[0].length;
    }

    @Override // d00.AbstractC17691e
    public boolean equals(Object obj) {
        if (!(obj instanceof C17687a)) {
            return false;
        }
        return m93687l((C17687a) obj, 0.0f);
    }

    @Override // d00.AbstractC17691e
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C17687a mo93685e() {
        C17687a c17687a = new C17687a(this.f89695q, this.f89694p);
        for (int i11 = 0; i11 < this.f89694p; i11++) {
            System.arraycopy(this.f89691r[i11], 0, c17687a.f89691r[i11], 0, this.f89695q);
        }
        return c17687a;
    }

    /* renamed from: l */
    public boolean m93687l(C17687a c17687a, float f11) {
        if (c17687a.f89694p != this.f89694p || c17687a.f89695q != this.f89695q) {
            return false;
        }
        for (int i11 = 0; i11 < this.f89694p; i11++) {
            for (int i12 = 0; i12 < this.f89695q; i12++) {
                if (Math.abs(c17687a.f89691r[i11][i12] - this.f89691r[i11][i12]) > f11) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public Float m93688m(int i11, int i12) {
        return Float.valueOf(this.f89691r[i12][i11]);
    }

    /* renamed from: n */
    public C17687a m93689n(C17687a c17687a) {
        this.f89691r = c17687a.f89691r;
        this.f89694p = c17687a.f89694p;
        this.f89695q = c17687a.f89695q;
        return this;
    }

    /* renamed from: p */
    public Float m93690p() {
        float f11 = Float.MIN_VALUE;
        for (int i11 = 0; i11 < this.f89694p; i11++) {
            for (int i12 = 0; i12 < this.f89695q; i12++) {
                float f12 = this.f89691r[i11][i12];
                if (f11 < f12) {
                    f11 = f12;
                }
            }
        }
        return Float.valueOf(f11);
    }

    /* renamed from: r */
    public Float m93691r() {
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < this.f89694p; i11++) {
            for (int i12 = 0; i12 < this.f89695q; i12++) {
                float f12 = this.f89691r[i11][i12];
                if (f11 > f12) {
                    f11 = f12;
                }
            }
        }
        return Float.valueOf(f11);
    }

    /* renamed from: s */
    public C17687a m93692s(int i11, int i12) {
        return new C17687a(i11, i12);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < this.f89694p) {
            int i12 = 0;
            while (i12 < this.f89695q) {
                sb2.append(String.format("%+.3f ", Float.valueOf(this.f89691r[i11][i12])));
                if (i12 == 16 && this.f89695q - 16 > i12) {
                    sb2.append("... ");
                    i12 = this.f89695q - 16;
                }
                i12++;
            }
            sb2.append("\n");
            if (i11 == 16) {
                int i13 = this.f89694p;
                if (i13 - 16 > i11) {
                    i11 = i13 - 16;
                    sb2.append("... \n");
                }
            }
            i11++;
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public C17687a m93693u() {
        float floatValue = m93691r().floatValue();
        float floatValue2 = m93690p().floatValue();
        if (floatValue2 == floatValue) {
            return this;
        }
        for (int i11 = 0; i11 < this.f89694p; i11++) {
            for (int i12 = 0; i12 < this.f89695q; i12++) {
                float[] fArr = this.f89691r[i11];
                fArr[i12] = (fArr[i12] - floatValue) / (floatValue2 - floatValue);
            }
        }
        return this;
    }

    /* renamed from: v */
    public C17687a m93694v() {
        for (int i11 = 0; i11 < this.f89694p; i11++) {
            for (int i12 = 0; i12 < this.f89695q; i12++) {
                this.f89691r[i11][i12] = 0.0f;
            }
        }
        return this;
    }

    public C17687a(int i11, int i12) {
        this.f89691r = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i12, i11);
        this.f89694p = i12;
        this.f89695q = i11;
    }
}
