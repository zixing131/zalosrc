package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzacm implements zzbp {
    public static final Parcelable.Creator<zzacm> CREATOR = new C4706l1();

    /* renamed from: p */
    public final int f31757p;

    /* renamed from: q */
    public final String f31758q;

    /* renamed from: r */
    public final String f31759r;

    /* renamed from: s */
    public final String f31760s;

    /* renamed from: t */
    public final boolean f31761t;

    /* renamed from: u */
    public final int f31762u;

    public zzacm(int i11, String str, String str2, String str3, boolean z11, int i12) {
        boolean z12 = true;
        if (i12 != -1 && i12 <= 0) {
            z12 = false;
        }
        v71.m27173d(z12);
        this.f31757p = i11;
        this.f31758q = str;
        this.f31759r = str2;
        this.f31760s = str3;
        this.f31761t = z11;
        this.f31762u = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacm.class == obj.getClass()) {
            zzacm zzacmVar = (zzacm) obj;
            if (this.f31757p == zzacmVar.f31757p && g92.m22362t(this.f31758q, zzacmVar.f31758q) && g92.m22362t(this.f31759r, zzacmVar.f31759r) && g92.m22362t(this.f31760s, zzacmVar.f31760s) && this.f31761t == zzacmVar.f31761t && this.f31762u == zzacmVar.f31762u) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final void mo28672f0(C4518fy c4518fy) {
        String str = this.f31759r;
        if (str != null) {
            c4518fy.m22236G(str);
        }
        String str2 = this.f31758q;
        if (str2 != null) {
            c4518fy.m22251z(str2);
        }
    }

    public final int hashCode() {
        int i11;
        int i12;
        int i13 = (this.f31757p + 527) * 31;
        String str = this.f31758q;
        int i14 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i13 + i11) * 31;
        String str2 = this.f31759r;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        String str3 = this.f31760s;
        if (str3 != null) {
            i14 = str3.hashCode();
        }
        return ((((i16 + i14) * 31) + (this.f31761t ? 1 : 0)) * 31) + this.f31762u;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f31759r + "\", genre=\"" + this.f31758q + "\", bitrate=" + this.f31757p + ", metadataInterval=" + this.f31762u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f31757p);
        parcel.writeString(this.f31758q);
        parcel.writeString(this.f31759r);
        parcel.writeString(this.f31760s);
        g92.m22361s(parcel, this.f31761t);
        parcel.writeInt(this.f31762u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacm(Parcel parcel) {
        this.f31757p = parcel.readInt();
        this.f31758q = parcel.readString();
        this.f31759r = parcel.readString();
        this.f31760s = parcel.readString();
        this.f31761t = g92.m22368z(parcel);
        this.f31762u = parcel.readInt();
    }
}
