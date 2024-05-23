package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaci implements zzbp {
    public static final Parcelable.Creator<zzaci> CREATOR = new C4632j1();

    /* renamed from: p */
    public final int f31747p;

    /* renamed from: q */
    public final String f31748q;

    /* renamed from: r */
    public final String f31749r;

    /* renamed from: s */
    public final int f31750s;

    /* renamed from: t */
    public final int f31751t;

    /* renamed from: u */
    public final int f31752u;

    /* renamed from: v */
    public final int f31753v;

    /* renamed from: w */
    public final byte[] f31754w;

    public zzaci(int i11, String str, String str2, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f31747p = i11;
        this.f31748q = str;
        this.f31749r = str2;
        this.f31750s = i12;
        this.f31751t = i13;
        this.f31752u = i14;
        this.f31753v = i15;
        this.f31754w = bArr;
    }

    /* renamed from: a */
    public static zzaci m28673a(x02 x02Var) {
        int m27782m = x02Var.m27782m();
        String m27767F = x02Var.m27767F(x02Var.m27782m(), w43.f29780a);
        String m27767F2 = x02Var.m27767F(x02Var.m27782m(), w43.f29782c);
        int m27782m2 = x02Var.m27782m();
        int m27782m3 = x02Var.m27782m();
        int m27782m4 = x02Var.m27782m();
        int m27782m5 = x02Var.m27782m();
        int m27782m6 = x02Var.m27782m();
        byte[] bArr = new byte[m27782m6];
        x02Var.m27771b(bArr, 0, m27782m6);
        return new zzaci(m27782m, m27767F, m27767F2, m27782m2, m27782m3, m27782m4, m27782m5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaci.class == obj.getClass()) {
            zzaci zzaciVar = (zzaci) obj;
            if (this.f31747p == zzaciVar.f31747p && this.f31748q.equals(zzaciVar.f31748q) && this.f31749r.equals(zzaciVar.f31749r) && this.f31750s == zzaciVar.f31750s && this.f31751t == zzaciVar.f31751t && this.f31752u == zzaciVar.f31752u && this.f31753v == zzaciVar.f31753v && Arrays.equals(this.f31754w, zzaciVar.f31754w)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final void mo28672f0(C4518fy c4518fy) {
        c4518fy.m22242q(this.f31754w, this.f31747p);
    }

    public final int hashCode() {
        return ((((((((((((((this.f31747p + 527) * 31) + this.f31748q.hashCode()) * 31) + this.f31749r.hashCode()) * 31) + this.f31750s) * 31) + this.f31751t) * 31) + this.f31752u) * 31) + this.f31753v) * 31) + Arrays.hashCode(this.f31754w);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f31748q + ", description=" + this.f31749r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f31747p);
        parcel.writeString(this.f31748q);
        parcel.writeString(this.f31749r);
        parcel.writeInt(this.f31750s);
        parcel.writeInt(this.f31751t);
        parcel.writeInt(this.f31752u);
        parcel.writeInt(this.f31753v);
        parcel.writeByteArray(this.f31754w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaci(Parcel parcel) {
        this.f31747p = parcel.readInt();
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31748q = readString;
        this.f31749r = parcel.readString();
        this.f31750s = parcel.readInt();
        this.f31751t = parcel.readInt();
        this.f31752u = parcel.readInt();
        this.f31753v = parcel.readInt();
        this.f31754w = (byte[]) g92.m22347h(parcel.createByteArray());
    }
}
