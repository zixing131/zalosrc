package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.C17761c0;

/* loaded from: classes2.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new C17761c0();

    /* renamed from: p */
    private final int f33544p;

    /* renamed from: q */
    private final int f33545q;

    /* renamed from: r */
    private final int f33546r;

    /* renamed from: s */
    private final int f33547s;

    public zzbx(int i11, int i12, int i13, int i14) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (i11 >= 0 && i11 <= 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19727p(z11, "Start hour must be in range [0, 23].");
        if (i12 >= 0 && i12 <= 59) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4205o.m19727p(z12, "Start minute must be in range [0, 59].");
        if (i13 >= 0 && i13 <= 23) {
            z13 = true;
        } else {
            z13 = false;
        }
        AbstractC4205o.m19727p(z13, "End hour must be in range [0, 23].");
        if (i14 >= 0 && i14 <= 59) {
            z14 = true;
        } else {
            z14 = false;
        }
        AbstractC4205o.m19727p(z14, "End minute must be in range [0, 59].");
        AbstractC4205o.m19727p(((i11 + i12) + i13) + i14 > 0, "Parameters can't be all 0.");
        this.f33544p = i11;
        this.f33545q = i12;
        this.f33546r = i13;
        this.f33547s = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        if (this.f33544p == zzbxVar.f33544p && this.f33545q == zzbxVar.f33545q && this.f33546r == zzbxVar.f33546r && this.f33547s == zzbxVar.f33547s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33544p), Integer.valueOf(this.f33545q), Integer.valueOf(this.f33546r), Integer.valueOf(this.f33547s));
    }

    public final String toString() {
        int i11 = this.f33544p;
        int i12 = this.f33545q;
        int i13 = this.f33546r;
        int i14 = this.f33547s;
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i11);
        sb2.append(", startMinute=");
        sb2.append(i12);
        sb2.append(", endHour=");
        sb2.append(i13);
        sb2.append(", endMinute=");
        sb2.append(i14);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33544p);
        AbstractC2552a.m12924m(parcel, 2, this.f33545q);
        AbstractC2552a.m12924m(parcel, 3, this.f33546r);
        AbstractC2552a.m12924m(parcel, 4, this.f33547s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
