package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzadq implements zzbp {
    public static final Parcelable.Creator<zzadq> CREATOR = new C4375c2();

    /* renamed from: p */
    public final String f31801p;

    /* renamed from: q */
    public final byte[] f31802q;

    /* renamed from: r */
    public final int f31803r;

    /* renamed from: s */
    public final int f31804s;

    public zzadq(String str, byte[] bArr, int i11, int i12) {
        this.f31801p = str;
        this.f31802q = bArr;
        this.f31803r = i11;
        this.f31804s = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadq.class == obj.getClass()) {
            zzadq zzadqVar = (zzadq) obj;
            if (this.f31801p.equals(zzadqVar.f31801p) && Arrays.equals(this.f31802q, zzadqVar.f31802q) && this.f31803r == zzadqVar.f31803r && this.f31804s == zzadqVar.f31804s) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final /* synthetic */ void mo28672f0(C4518fy c4518fy) {
    }

    public final int hashCode() {
        return ((((((this.f31801p.hashCode() + 527) * 31) + Arrays.hashCode(this.f31802q)) * 31) + this.f31803r) * 31) + this.f31804s;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f31801p));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31801p);
        parcel.writeByteArray(this.f31802q);
        parcel.writeInt(this.f31803r);
        parcel.writeInt(this.f31804s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzadq(Parcel parcel, AbstractC4412d2 abstractC4412d2) {
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31801p = readString;
        this.f31802q = (byte[]) g92.m22347h(parcel.createByteArray());
        this.f31803r = parcel.readInt();
        this.f31804s = parcel.readInt();
    }
}
