package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C5891l();

    /* renamed from: p */
    boolean f33548p;

    /* renamed from: q */
    long f33549q;

    /* renamed from: r */
    float f33550r;

    /* renamed from: s */
    long f33551s;

    /* renamed from: t */
    int f33552t;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (this.f33548p == zzsVar.f33548p && this.f33549q == zzsVar.f33549q && Float.compare(this.f33550r, zzsVar.f33550r) == 0 && this.f33551s == zzsVar.f33551s && this.f33552t == zzsVar.f33552t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Boolean.valueOf(this.f33548p), Long.valueOf(this.f33549q), Float.valueOf(this.f33550r), Long.valueOf(this.f33551s), Integer.valueOf(this.f33552t));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f33548p);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f33549q);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f33550r);
        long j11 = this.f33551s;
        if (j11 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f33552t != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f33552t);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, this.f33548p);
        AbstractC2552a.m12929r(parcel, 2, this.f33549q);
        AbstractC2552a.m12921j(parcel, 3, this.f33550r);
        AbstractC2552a.m12929r(parcel, 4, this.f33551s);
        AbstractC2552a.m12924m(parcel, 5, this.f33552t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(boolean z11, long j11, float f11, long j12, int i11) {
        this.f33548p = z11;
        this.f33549q = j11;
        this.f33550r = f11;
        this.f33551s = j12;
        this.f33552t = i11;
    }
}
