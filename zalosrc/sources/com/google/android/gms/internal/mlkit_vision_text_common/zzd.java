package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p012a6.C0186c3;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C0186c3();

    /* renamed from: p */
    public int f33147p;

    /* renamed from: q */
    public int f33148q;

    /* renamed from: r */
    public int f33149r;

    /* renamed from: s */
    public long f33150s;

    /* renamed from: t */
    public int f33151t;

    public zzd(int i11, int i12, int i13, long j11, int i14) {
        this.f33147p = i11;
        this.f33148q = i12;
        this.f33149r = i13;
        this.f33150s = j11;
        this.f33151t = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f33147p);
        AbstractC2552a.m12924m(parcel, 3, this.f33148q);
        AbstractC2552a.m12924m(parcel, 4, this.f33149r);
        AbstractC2552a.m12929r(parcel, 5, this.f33150s);
        AbstractC2552a.m12924m(parcel, 6, this.f33151t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
