package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30410fh;

/* loaded from: classes2.dex */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new C30410fh();

    /* renamed from: p */
    private final String f33075p;

    /* renamed from: q */
    private final String f33076q;

    /* renamed from: r */
    private final String f33077r;

    /* renamed from: s */
    private final String f33078s;

    /* renamed from: t */
    private final String f33079t;

    /* renamed from: u */
    private final zzsb f33080u;

    /* renamed from: v */
    private final zzsb f33081v;

    public zzsc(String str, String str2, String str3, String str4, String str5, zzsb zzsbVar, zzsb zzsbVar2) {
        this.f33075p = str;
        this.f33076q = str2;
        this.f33077r = str3;
        this.f33078s = str4;
        this.f33079t = str5;
        this.f33080u = zzsbVar;
        this.f33081v = zzsbVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33075p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33076q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33077r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33078s, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33079t, false);
        AbstractC2552a.m12932u(parcel, 6, this.f33080u, i11, false);
        AbstractC2552a.m12932u(parcel, 7, this.f33081v, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
