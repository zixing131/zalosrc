package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p012a6.C0276gh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C0276gh();

    /* renamed from: p */
    public final zzn[] f33169p;

    /* renamed from: q */
    public final zzf f33170q;

    /* renamed from: r */
    public final zzf f33171r;

    /* renamed from: s */
    public final String f33172s;

    /* renamed from: t */
    public final float f33173t;

    /* renamed from: u */
    public final String f33174u;

    /* renamed from: v */
    public final boolean f33175v;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f11, String str2, boolean z11) {
        this.f33169p = zznVarArr;
        this.f33170q = zzfVar;
        this.f33171r = zzfVar2;
        this.f33172s = str;
        this.f33173t = f11;
        this.f33174u = str2;
        this.f33175v = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12937z(parcel, 2, this.f33169p, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f33170q, i11, false);
        AbstractC2552a.m12932u(parcel, 4, this.f33171r, i11, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33172s, false);
        AbstractC2552a.m12921j(parcel, 6, this.f33173t);
        AbstractC2552a.m12934w(parcel, 7, this.f33174u, false);
        AbstractC2552a.m12914c(parcel, 8, this.f33175v);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
