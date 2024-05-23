package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzba extends AbstractSafeParcelable {

    /* renamed from: A */
    static final List f32205A = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new C5273g();

    /* renamed from: p */
    final LocationRequest f32206p;

    /* renamed from: q */
    final List f32207q;

    /* renamed from: r */
    final String f32208r;

    /* renamed from: s */
    final boolean f32209s;

    /* renamed from: t */
    final boolean f32210t;

    /* renamed from: u */
    final boolean f32211u;

    /* renamed from: v */
    final String f32212v;

    /* renamed from: w */
    final boolean f32213w;

    /* renamed from: x */
    boolean f32214x;

    /* renamed from: y */
    String f32215y;

    /* renamed from: z */
    long f32216z;

    public zzba(LocationRequest locationRequest, List list, String str, boolean z11, boolean z12, boolean z13, String str2, boolean z14, boolean z15, String str3, long j11) {
        this.f32206p = locationRequest;
        this.f32207q = list;
        this.f32208r = str;
        this.f32209s = z11;
        this.f32210t = z12;
        this.f32211u = z13;
        this.f32212v = str2;
        this.f32213w = z14;
        this.f32214x = z15;
        this.f32215y = str3;
        this.f32216z = j11;
    }

    /* renamed from: t */
    public static zzba m28852t(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, f32205A, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    /* renamed from: F */
    public final zzba m28853F(String str) {
        this.f32215y = str;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (AbstractC4199m.m19701a(this.f32206p, zzbaVar.f32206p) && AbstractC4199m.m19701a(this.f32207q, zzbaVar.f32207q) && AbstractC4199m.m19701a(this.f32208r, zzbaVar.f32208r) && this.f32209s == zzbaVar.f32209s && this.f32210t == zzbaVar.f32210t && this.f32211u == zzbaVar.f32211u && AbstractC4199m.m19701a(this.f32212v, zzbaVar.f32212v) && this.f32213w == zzbaVar.f32213w && this.f32214x == zzbaVar.f32214x && AbstractC4199m.m19701a(this.f32215y, zzbaVar.f32215y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32206p.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32206p);
        if (this.f32208r != null) {
            sb2.append(" tag=");
            sb2.append(this.f32208r);
        }
        if (this.f32212v != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f32212v);
        }
        if (this.f32215y != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f32215y);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f32209s);
        sb2.append(" clients=");
        sb2.append(this.f32207q);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f32210t);
        if (this.f32211u) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f32213w) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f32214x) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f32206p, i11, false);
        AbstractC2552a.m12907A(parcel, 5, this.f32207q, false);
        AbstractC2552a.m12934w(parcel, 6, this.f32208r, false);
        AbstractC2552a.m12914c(parcel, 7, this.f32209s);
        AbstractC2552a.m12914c(parcel, 8, this.f32210t);
        AbstractC2552a.m12914c(parcel, 9, this.f32211u);
        AbstractC2552a.m12934w(parcel, 10, this.f32212v, false);
        AbstractC2552a.m12914c(parcel, 11, this.f32213w);
        AbstractC2552a.m12914c(parcel, 12, this.f32214x);
        AbstractC2552a.m12934w(parcel, 13, this.f32215y, false);
        AbstractC2552a.m12929r(parcel, 14, this.f32216z);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
