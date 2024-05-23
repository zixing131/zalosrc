package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30353ch;

/* loaded from: classes2.dex */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new C30353ch();

    /* renamed from: A */
    private final zzsg f33125A;

    /* renamed from: B */
    private final zzsc f33126B;

    /* renamed from: C */
    private final zzsd f33127C;

    /* renamed from: D */
    private final zzse f33128D;

    /* renamed from: p */
    private final int f33129p;

    /* renamed from: q */
    private final String f33130q;

    /* renamed from: r */
    private final String f33131r;

    /* renamed from: s */
    private final byte[] f33132s;

    /* renamed from: t */
    private final Point[] f33133t;

    /* renamed from: u */
    private final int f33134u;

    /* renamed from: v */
    private final zzsf f33135v;

    /* renamed from: w */
    private final zzsi f33136w;

    /* renamed from: x */
    private final zzsj f33137x;

    /* renamed from: y */
    private final zzsl f33138y;

    /* renamed from: z */
    private final zzsk f33139z;

    public zzsm(int i11, String str, String str2, byte[] bArr, Point[] pointArr, int i12, zzsf zzsfVar, zzsi zzsiVar, zzsj zzsjVar, zzsl zzslVar, zzsk zzskVar, zzsg zzsgVar, zzsc zzscVar, zzsd zzsdVar, zzse zzseVar) {
        this.f33129p = i11;
        this.f33130q = str;
        this.f33131r = str2;
        this.f33132s = bArr;
        this.f33133t = pointArr;
        this.f33134u = i12;
        this.f33135v = zzsfVar;
        this.f33136w = zzsiVar;
        this.f33137x = zzsjVar;
        this.f33138y = zzslVar;
        this.f33139z = zzskVar;
        this.f33125A = zzsgVar;
        this.f33126B = zzscVar;
        this.f33127C = zzsdVar;
        this.f33128D = zzseVar;
    }

    /* renamed from: F */
    public final String m30123F() {
        return this.f33131r;
    }

    /* renamed from: J */
    public final byte[] m30124J() {
        return this.f33132s;
    }

    /* renamed from: K */
    public final Point[] m30125K() {
        return this.f33133t;
    }

    /* renamed from: t */
    public final int m30126t() {
        return this.f33134u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33129p);
        AbstractC2552a.m12934w(parcel, 2, this.f33130q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33131r, false);
        AbstractC2552a.m12918g(parcel, 4, this.f33132s, false);
        AbstractC2552a.m12937z(parcel, 5, this.f33133t, i11, false);
        AbstractC2552a.m12924m(parcel, 6, this.f33134u);
        AbstractC2552a.m12932u(parcel, 7, this.f33135v, i11, false);
        AbstractC2552a.m12932u(parcel, 8, this.f33136w, i11, false);
        AbstractC2552a.m12932u(parcel, 9, this.f33137x, i11, false);
        AbstractC2552a.m12932u(parcel, 10, this.f33138y, i11, false);
        AbstractC2552a.m12932u(parcel, 11, this.f33139z, i11, false);
        AbstractC2552a.m12932u(parcel, 12, this.f33125A, i11, false);
        AbstractC2552a.m12932u(parcel, 13, this.f33126B, i11, false);
        AbstractC2552a.m12932u(parcel, 14, this.f33127C, i11, false);
        AbstractC2552a.m12932u(parcel, 15, this.f33128D, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public final int zza() {
        return this.f33129p;
    }
}
