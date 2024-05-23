package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new C5886g();

    /* renamed from: p */
    public final int f33537p;

    /* renamed from: q */
    public final int f33538q;

    /* renamed from: r */
    public final long f33539r;

    /* renamed from: s */
    public final long f33540s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbo(int i11, int i12, long j11, long j12) {
        this.f33537p = i11;
        this.f33538q = i12;
        this.f33539r = j11;
        this.f33540s = j12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f33537p == zzboVar.f33537p && this.f33538q == zzboVar.f33538q && this.f33539r == zzboVar.f33539r && this.f33540s == zzboVar.f33540s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33538q), Integer.valueOf(this.f33537p), Long.valueOf(this.f33540s), Long.valueOf(this.f33539r));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f33537p + " Cell status: " + this.f33538q + " elapsed time NS: " + this.f33540s + " system time ms: " + this.f33539r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33537p);
        AbstractC2552a.m12924m(parcel, 2, this.f33538q);
        AbstractC2552a.m12929r(parcel, 3, this.f33539r);
        AbstractC2552a.m12929r(parcel, 4, this.f33540s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
