package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaco extends zzadd {
    public static final Parcelable.Creator<zzaco> CREATOR = new C4743m1();

    /* renamed from: q */
    public final String f31763q;

    /* renamed from: r */
    public final String f31764r;

    /* renamed from: s */
    public final int f31765s;

    /* renamed from: t */
    public final byte[] f31766t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaco(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31763q = readString;
        this.f31764r = parcel.readString();
        this.f31765s = parcel.readInt();
        this.f31766t = (byte[]) g92.m22347h(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaco.class == obj.getClass()) {
            zzaco zzacoVar = (zzaco) obj;
            if (this.f31765s == zzacoVar.f31765s && g92.m22362t(this.f31763q, zzacoVar.f31763q) && g92.m22362t(this.f31764r, zzacoVar.f31764r) && Arrays.equals(this.f31766t, zzacoVar.f31766t)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final void mo28672f0(C4518fy c4518fy) {
        c4518fy.m22242q(this.f31766t, this.f31765s);
    }

    public final int hashCode() {
        int i11;
        int i12 = (this.f31765s + 527) * 31;
        String str = this.f31763q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i12 + i11) * 31;
        String str2 = this.f31764r;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        return ((i14 + i13) * 31) + Arrays.hashCode(this.f31766t);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": mimeType=" + this.f31763q + ", description=" + this.f31764r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31763q);
        parcel.writeString(this.f31764r);
        parcel.writeInt(this.f31765s);
        parcel.writeByteArray(this.f31766t);
    }

    public zzaco(String str, String str2, int i11, byte[] bArr) {
        super("APIC");
        this.f31763q = str;
        this.f31764r = str2;
        this.f31765s = i11;
        this.f31766t = bArr;
    }
}
