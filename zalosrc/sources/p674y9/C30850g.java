package p674y9;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: y9.g */
/* loaded from: classes3.dex */
public final class C30850g extends Number {

    /* renamed from: p */
    private final String f142353p;

    public C30850g(String str) {
        this.f142353p = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f142353p);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f142353p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30850g)) {
            return false;
        }
        String str = this.f142353p;
        String str2 = ((C30850g) obj).f142353p;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f142353p);
    }

    public int hashCode() {
        return this.f142353p.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f142353p);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f142353p).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f142353p);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f142353p);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f142353p).longValue();
        }
    }

    public String toString() {
        return this.f142353p;
    }
}
