package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30333bg;

/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C30333bg();

    /* renamed from: A */
    public zzg f33048A;

    /* renamed from: B */
    public zzh f33049B;

    /* renamed from: C */
    public zzi f33050C;

    /* renamed from: D */
    public byte[] f33051D;

    /* renamed from: E */
    public boolean f33052E;

    /* renamed from: F */
    public double f33053F;

    /* renamed from: p */
    public int f33054p;

    /* renamed from: q */
    public String f33055q;

    /* renamed from: r */
    public String f33056r;

    /* renamed from: s */
    public int f33057s;

    /* renamed from: t */
    public Point[] f33058t;

    /* renamed from: u */
    public zzj f33059u;

    /* renamed from: v */
    public zzm f33060v;

    /* renamed from: w */
    public zzn f33061w;

    /* renamed from: x */
    public zzp f33062x;

    /* renamed from: y */
    public zzo f33063y;

    /* renamed from: z */
    public zzk f33064z;

    public zzq(int i11, String str, String str2, int i12, Point[] pointArr, zzj zzjVar, zzm zzmVar, zzn zznVar, zzp zzpVar, zzo zzoVar, zzk zzkVar, zzg zzgVar, zzh zzhVar, zzi zziVar, byte[] bArr, boolean z11, double d11) {
        this.f33054p = i11;
        this.f33055q = str;
        this.f33051D = bArr;
        this.f33056r = str2;
        this.f33057s = i12;
        this.f33058t = pointArr;
        this.f33052E = z11;
        this.f33053F = d11;
        this.f33059u = zzjVar;
        this.f33060v = zzmVar;
        this.f33061w = zznVar;
        this.f33062x = zzpVar;
        this.f33063y = zzoVar;
        this.f33064z = zzkVar;
        this.f33048A = zzgVar;
        this.f33049B = zzhVar;
        this.f33050C = zziVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f33054p);
        AbstractC2552a.m12934w(parcel, 3, this.f33055q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33056r, false);
        AbstractC2552a.m12924m(parcel, 5, this.f33057s);
        AbstractC2552a.m12937z(parcel, 6, this.f33058t, i11, false);
        AbstractC2552a.m12932u(parcel, 7, this.f33059u, i11, false);
        AbstractC2552a.m12932u(parcel, 8, this.f33060v, i11, false);
        AbstractC2552a.m12932u(parcel, 9, this.f33061w, i11, false);
        AbstractC2552a.m12932u(parcel, 10, this.f33062x, i11, false);
        AbstractC2552a.m12932u(parcel, 11, this.f33063y, i11, false);
        AbstractC2552a.m12932u(parcel, 12, this.f33064z, i11, false);
        AbstractC2552a.m12932u(parcel, 13, this.f33048A, i11, false);
        AbstractC2552a.m12932u(parcel, 14, this.f33049B, i11, false);
        AbstractC2552a.m12932u(parcel, 15, this.f33050C, i11, false);
        AbstractC2552a.m12918g(parcel, 16, this.f33051D, false);
        AbstractC2552a.m12914c(parcel, 17, this.f33052E);
        AbstractC2552a.m12919h(parcel, 18, this.f33053F);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
