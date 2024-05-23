package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30600ph;

/* loaded from: classes2.dex */
public final class zzsh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsh> CREATOR = new C30600ph();

    /* renamed from: p */
    private final String f33109p;

    /* renamed from: q */
    private final String f33110q;

    /* renamed from: r */
    private final String f33111r;

    /* renamed from: s */
    private final String f33112s;

    /* renamed from: t */
    private final String f33113t;

    /* renamed from: u */
    private final String f33114u;

    /* renamed from: v */
    private final String f33115v;

    public zzsh(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f33109p = str;
        this.f33110q = str2;
        this.f33111r = str3;
        this.f33112s = str4;
        this.f33113t = str5;
        this.f33114u = str6;
        this.f33115v = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33109p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33110q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33111r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33112s, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33113t, false);
        AbstractC2552a.m12934w(parcel, 6, this.f33114u, false);
        AbstractC2552a.m12934w(parcel, 7, this.f33115v, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
