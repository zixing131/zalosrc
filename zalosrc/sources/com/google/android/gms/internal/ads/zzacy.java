package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzacy extends zzadd {
    public static final Parcelable.Creator<zzacy> CREATOR = new C4930r1();

    /* renamed from: q */
    public final String f31782q;

    /* renamed from: r */
    public final String f31783r;

    /* renamed from: s */
    public final String f31784s;

    /* renamed from: t */
    public final byte[] f31785t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacy(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31782q = readString;
        this.f31783r = parcel.readString();
        this.f31784s = parcel.readString();
        this.f31785t = (byte[]) g92.m22347h(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacy.class == obj.getClass()) {
            zzacy zzacyVar = (zzacy) obj;
            if (g92.m22362t(this.f31782q, zzacyVar.f31782q) && g92.m22362t(this.f31783r, zzacyVar.f31783r) && g92.m22362t(this.f31784s, zzacyVar.f31784s) && Arrays.equals(this.f31785t, zzacyVar.f31785t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12;
        String str = this.f31782q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i11 + 527) * 31;
        String str2 = this.f31783r;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        String str3 = this.f31784s;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((i15 + i13) * 31) + Arrays.hashCode(this.f31785t);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": mimeType=" + this.f31782q + ", filename=" + this.f31783r + ", description=" + this.f31784s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31782q);
        parcel.writeString(this.f31783r);
        parcel.writeString(this.f31784s);
        parcel.writeByteArray(this.f31785t);
    }

    public zzacy(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f31782q = str;
        this.f31783r = str2;
        this.f31784s = str3;
        this.f31785t = bArr;
    }
}
