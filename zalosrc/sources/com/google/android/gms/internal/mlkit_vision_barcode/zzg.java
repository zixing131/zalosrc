package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30581oh;

/* loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C30581oh();

    /* renamed from: p */
    public String f32998p;

    /* renamed from: q */
    public String f32999q;

    /* renamed from: r */
    public String f33000r;

    /* renamed from: s */
    public String f33001s;

    /* renamed from: t */
    public String f33002t;

    /* renamed from: u */
    public zzf f33003u;

    /* renamed from: v */
    public zzf f33004v;

    public zzg(String str, String str2, String str3, String str4, String str5, zzf zzfVar, zzf zzfVar2) {
        this.f32998p = str;
        this.f32999q = str2;
        this.f33000r = str3;
        this.f33001s = str4;
        this.f33002t = str5;
        this.f33003u = zzfVar;
        this.f33004v = zzfVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f32998p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f32999q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33000r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33001s, false);
        AbstractC2552a.m12934w(parcel, 6, this.f33002t, false);
        AbstractC2552a.m12932u(parcel, 7, this.f33003u, i11, false);
        AbstractC2552a.m12932u(parcel, 8, this.f33004v, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
