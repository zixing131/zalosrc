package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzadf extends zzadd {
    public static final Parcelable.Creator<zzadf> CREATOR = new C5153x1();

    /* renamed from: q */
    public final String f31787q;

    /* renamed from: r */
    public final String f31788r;

    /* renamed from: s */
    public final String f31789s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadf(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31787q = readString;
        this.f31788r = parcel.readString();
        this.f31789s = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadf.class == obj.getClass()) {
            zzadf zzadfVar = (zzadf) obj;
            if (g92.m22362t(this.f31788r, zzadfVar.f31788r) && g92.m22362t(this.f31787q, zzadfVar.f31787q) && g92.m22362t(this.f31789s, zzadfVar.f31789s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12;
        String str = this.f31787q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i11 + 527) * 31;
        String str2 = this.f31788r;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        String str3 = this.f31789s;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return i15 + i13;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": domain=" + this.f31787q + ", description=" + this.f31788r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31786p);
        parcel.writeString(this.f31787q);
        parcel.writeString(this.f31789s);
    }

    public zzadf(String str, String str2, String str3) {
        super("----");
        this.f31787q = str;
        this.f31788r = str2;
        this.f31789s = str3;
    }
}
