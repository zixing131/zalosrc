package p007a1;

/* renamed from: a1.i */
/* loaded from: classes2.dex */
public class C0028i extends C0022c {

    /* renamed from: d */
    double f111d;

    /* renamed from: e */
    double f112e;

    public C0028i(String str) {
        this.f61a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f111d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i11 = indexOf2 + 1;
        this.f112e = Double.parseDouble(str.substring(i11, str.indexOf(44, i11)).trim());
    }

    /* renamed from: d */
    private double m86d(double d11) {
        double d12 = this.f112e;
        if (d11 < d12) {
            double d13 = this.f111d;
            return ((d13 * d12) * d12) / ((((d12 - d11) * d13) + d11) * ((d13 * (d12 - d11)) + d11));
        }
        double d14 = this.f111d;
        return (((d12 - 1.0d) * d14) * (d12 - 1.0d)) / (((((-d14) * (d12 - d11)) - d11) + 1.0d) * ((((-d14) * (d12 - d11)) - d11) + 1.0d));
    }

    /* renamed from: e */
    private double m87e(double d11) {
        double d12 = this.f112e;
        return d11 < d12 ? (d12 * d11) / (d11 + (this.f111d * (d12 - d11))) : ((1.0d - d12) * (d11 - 1.0d)) / ((1.0d - d11) - (this.f111d * (d12 - d11)));
    }

    @Override // p007a1.C0022c
    /* renamed from: a */
    public double mo60a(double d11) {
        return m87e(d11);
    }

    @Override // p007a1.C0022c
    /* renamed from: b */
    public double mo61b(double d11) {
        return m86d(d11);
    }
}
