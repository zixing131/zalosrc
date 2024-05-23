package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30733wh;

/* loaded from: classes2.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C30733wh();

    /* renamed from: A */
    public String f33012A;

    /* renamed from: B */
    public String f33013B;

    /* renamed from: C */
    public String f33014C;

    /* renamed from: p */
    public String f33015p;

    /* renamed from: q */
    public String f33016q;

    /* renamed from: r */
    public String f33017r;

    /* renamed from: s */
    public String f33018s;

    /* renamed from: t */
    public String f33019t;

    /* renamed from: u */
    public String f33020u;

    /* renamed from: v */
    public String f33021v;

    /* renamed from: w */
    public String f33022w;

    /* renamed from: x */
    public String f33023x;

    /* renamed from: y */
    public String f33024y;

    /* renamed from: z */
    public String f33025z;

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f33015p = str;
        this.f33016q = str2;
        this.f33017r = str3;
        this.f33018s = str4;
        this.f33019t = str5;
        this.f33020u = str6;
        this.f33021v = str7;
        this.f33022w = str8;
        this.f33023x = str9;
        this.f33024y = str10;
        this.f33025z = str11;
        this.f33012A = str12;
        this.f33013B = str13;
        this.f33014C = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f33015p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33016q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33017r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33018s, false);
        AbstractC2552a.m12934w(parcel, 6, this.f33019t, false);
        AbstractC2552a.m12934w(parcel, 7, this.f33020u, false);
        AbstractC2552a.m12934w(parcel, 8, this.f33021v, false);
        AbstractC2552a.m12934w(parcel, 9, this.f33022w, false);
        AbstractC2552a.m12934w(parcel, 10, this.f33023x, false);
        AbstractC2552a.m12934w(parcel, 11, this.f33024y, false);
        AbstractC2552a.m12934w(parcel, 12, this.f33025z, false);
        AbstractC2552a.m12934w(parcel, 13, this.f33012A, false);
        AbstractC2552a.m12934w(parcel, 14, this.f33013B, false);
        AbstractC2552a.m12934w(parcel, 15, this.f33014C, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
