package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p031b5.AbstractC2552a;
import p568v5.C27538i;

/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new C27538i();

    /* renamed from: p */
    private final String f32223p;

    /* renamed from: q */
    private final long f32224q;

    /* renamed from: r */
    private final short f32225r;

    /* renamed from: s */
    private final double f32226s;

    /* renamed from: t */
    private final double f32227t;

    /* renamed from: u */
    private final float f32228u;

    /* renamed from: v */
    private final int f32229v;

    /* renamed from: w */
    private final int f32230w;

    /* renamed from: x */
    private final int f32231x;

    public zzbe(String str, int i11, short s7, double d11, double d12, float f11, long j11, int i12, int i13) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f11 > 0.0f) {
                if (d11 <= 90.0d && d11 >= -90.0d) {
                    if (d12 <= 180.0d && d12 >= -180.0d) {
                        int i14 = i11 & 7;
                        if (i14 != 0) {
                            this.f32225r = s7;
                            this.f32223p = str;
                            this.f32226s = d11;
                            this.f32227t = d12;
                            this.f32228u = f11;
                            this.f32224q = j11;
                            this.f32229v = i14;
                            this.f32230w = i12;
                            this.f32231x = i13;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("No supported transition specified: ");
                        sb2.append(i11);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(43);
                    sb3.append("invalid longitude: ");
                    sb3.append(d12);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("invalid latitude: ");
                sb4.append(d11);
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(31);
            sb5.append("invalid radius: ");
            sb5.append(f11);
            throw new IllegalArgumentException(sb5.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.f32228u == zzbeVar.f32228u && this.f32226s == zzbeVar.f32226s && this.f32227t == zzbeVar.f32227t && this.f32225r == zzbeVar.f32225r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f32226s);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f32227t);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f32228u)) * 31) + this.f32225r) * 31) + this.f32229v;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s7 = this.f32225r;
        if (s7 != -1) {
            if (s7 != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.f32223p.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f32229v);
        objArr[3] = Double.valueOf(this.f32226s);
        objArr[4] = Double.valueOf(this.f32227t);
        objArr[5] = Float.valueOf(this.f32228u);
        objArr[6] = Integer.valueOf(this.f32230w / 1000);
        objArr[7] = Integer.valueOf(this.f32231x);
        objArr[8] = Long.valueOf(this.f32224q);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f32223p, false);
        AbstractC2552a.m12929r(parcel, 2, this.f32224q);
        AbstractC2552a.m12933v(parcel, 3, this.f32225r);
        AbstractC2552a.m12919h(parcel, 4, this.f32226s);
        AbstractC2552a.m12919h(parcel, 5, this.f32227t);
        AbstractC2552a.m12921j(parcel, 6, this.f32228u);
        AbstractC2552a.m12924m(parcel, 7, this.f32229v);
        AbstractC2552a.m12924m(parcel, 8, this.f32230w);
        AbstractC2552a.m12924m(parcel, 9, this.f32231x);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
