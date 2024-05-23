package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C5882c();

    /* renamed from: p */
    int f33491p;

    /* renamed from: q */
    long f33492q;

    /* renamed from: r */
    long f33493r;

    /* renamed from: s */
    boolean f33494s;

    /* renamed from: t */
    long f33495t;

    /* renamed from: u */
    int f33496u;

    /* renamed from: v */
    float f33497v;

    /* renamed from: w */
    long f33498w;

    /* renamed from: x */
    boolean f33499x;

    @Deprecated
    public LocationRequest() {
        this.f33491p = 102;
        this.f33492q = 3600000L;
        this.f33493r = 600000L;
        this.f33494s = false;
        this.f33495t = Long.MAX_VALUE;
        this.f33496u = Integer.MAX_VALUE;
        this.f33497v = 0.0f;
        this.f33498w = 0L;
        this.f33499x = false;
    }

    /* renamed from: o0 */
    private static void m30603o0(long j11) {
        if (j11 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: t */
    public static LocationRequest m30604t() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.m30611i0(true);
        return locationRequest;
    }

    /* renamed from: F */
    public long m30605F() {
        long j11 = this.f33498w;
        long j12 = this.f33492q;
        return j11 < j12 ? j12 : j11;
    }

    /* renamed from: J */
    public LocationRequest m30606J(long j11) {
        m30603o0(j11);
        this.f33494s = true;
        this.f33493r = j11;
        return this;
    }

    /* renamed from: K */
    public LocationRequest m30607K(long j11) {
        m30603o0(j11);
        this.f33492q = j11;
        if (!this.f33494s) {
            this.f33493r = (long) (j11 / 6.0d);
        }
        return this;
    }

    /* renamed from: M */
    public LocationRequest m30608M(long j11) {
        m30603o0(j11);
        this.f33498w = j11;
        return this;
    }

    /* renamed from: Q */
    public LocationRequest m30609Q(int i11) {
        if (i11 != 100 && i11 != 102 && i11 != 104 && i11 != 105) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("invalid quality: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f33491p = i11;
        return this;
    }

    /* renamed from: Z */
    public LocationRequest m30610Z(float f11) {
        if (f11 >= 0.0f) {
            this.f33497v = f11;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f33491p == locationRequest.f33491p && this.f33492q == locationRequest.f33492q && this.f33493r == locationRequest.f33493r && this.f33494s == locationRequest.f33494s && this.f33495t == locationRequest.f33495t && this.f33496u == locationRequest.f33496u && this.f33497v == locationRequest.f33497v && m30605F() == locationRequest.m30605F() && this.f33499x == locationRequest.f33499x) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33491p), Long.valueOf(this.f33492q), Float.valueOf(this.f33497v), Long.valueOf(this.f33498w));
    }

    /* renamed from: i0 */
    public LocationRequest m30611i0(boolean z11) {
        this.f33499x = z11;
        return this;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i11 = this.f33491p;
        if (i11 != 100) {
            if (i11 != 102) {
                if (i11 != 104) {
                    if (i11 != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb2.append(str);
        if (this.f33491p != 105) {
            sb2.append(" requested=");
            sb2.append(this.f33492q);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f33493r);
        sb2.append("ms");
        if (this.f33498w > this.f33492q) {
            sb2.append(" maxWait=");
            sb2.append(this.f33498w);
            sb2.append("ms");
        }
        if (this.f33497v > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f33497v);
            sb2.append("m");
        }
        long j11 = this.f33495t;
        if (j11 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f33496u != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f33496u);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33491p);
        AbstractC2552a.m12929r(parcel, 2, this.f33492q);
        AbstractC2552a.m12929r(parcel, 3, this.f33493r);
        AbstractC2552a.m12914c(parcel, 4, this.f33494s);
        AbstractC2552a.m12929r(parcel, 5, this.f33495t);
        AbstractC2552a.m12924m(parcel, 6, this.f33496u);
        AbstractC2552a.m12921j(parcel, 7, this.f33497v);
        AbstractC2552a.m12929r(parcel, 8, this.f33498w);
        AbstractC2552a.m12914c(parcel, 9, this.f33499x);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i11, long j11, long j12, boolean z11, long j13, int i12, float f11, long j14, boolean z12) {
        this.f33491p = i11;
        this.f33492q = j11;
        this.f33493r = j12;
        this.f33494s = z11;
        this.f33495t = j13;
        this.f33496u = i12;
        this.f33497v = f11;
        this.f33498w = j14;
        this.f33499x = z12;
    }
}
