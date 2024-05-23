package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p012a6.C0181bh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzrr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrr> CREATOR = new C0181bh();

    /* renamed from: p */
    private final int f33176p;

    /* renamed from: q */
    private final int f33177q;

    /* renamed from: r */
    private final int f33178r;

    /* renamed from: s */
    private final int f33179s;

    /* renamed from: t */
    private final long f33180t;

    public zzrr(int i11, int i12, int i13, int i14, long j11) {
        this.f33176p = i11;
        this.f33177q = i12;
        this.f33178r = i13;
        this.f33179s = i14;
        this.f33180t = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33176p);
        AbstractC2552a.m12924m(parcel, 2, this.f33177q);
        AbstractC2552a.m12924m(parcel, 3, this.f33178r);
        AbstractC2552a.m12924m(parcel, 4, this.f33179s);
        AbstractC2552a.m12929r(parcel, 5, this.f33180t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
