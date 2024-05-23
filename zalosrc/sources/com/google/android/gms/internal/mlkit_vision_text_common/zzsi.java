package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p012a6.C0371lh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new C0371lh();

    /* renamed from: p */
    private final String f33202p;

    /* renamed from: q */
    private final String f33203q;

    /* renamed from: r */
    private final String f33204r;

    /* renamed from: s */
    private final boolean f33205s;

    /* renamed from: t */
    private final int f33206t;

    /* renamed from: u */
    private final String f33207u;

    public zzsi(String str, String str2, String str3, boolean z11, int i11, String str4) {
        this.f33202p = str;
        this.f33203q = str2;
        this.f33204r = str3;
        this.f33207u = str4;
        this.f33206t = i11;
        this.f33205s = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33202p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33203q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33204r, false);
        AbstractC2552a.m12914c(parcel, 4, this.f33205s);
        AbstractC2552a.m12924m(parcel, 5, this.f33206t);
        AbstractC2552a.m12934w(parcel, 6, this.f33207u, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
