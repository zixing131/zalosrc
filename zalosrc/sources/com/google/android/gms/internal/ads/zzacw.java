package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzacw extends zzadd {
    public static final Parcelable.Creator<zzacw> CREATOR = new C4893q1();

    /* renamed from: q */
    public final String f31779q;

    /* renamed from: r */
    public final String f31780r;

    /* renamed from: s */
    public final String f31781s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacw(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31779q = readString;
        this.f31780r = parcel.readString();
        this.f31781s = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacw.class == obj.getClass()) {
            zzacw zzacwVar = (zzacw) obj;
            if (g92.m22362t(this.f31780r, zzacwVar.f31780r) && g92.m22362t(this.f31779q, zzacwVar.f31779q) && g92.m22362t(this.f31781s, zzacwVar.f31781s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12;
        String str = this.f31779q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i11 + 527) * 31;
        String str2 = this.f31780r;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        String str3 = this.f31781s;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return i15 + i13;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": language=" + this.f31779q + ", description=" + this.f31780r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31786p);
        parcel.writeString(this.f31779q);
        parcel.writeString(this.f31781s);
    }

    public zzacw(String str, String str2, String str3) {
        super("COMM");
        this.f31779q = str;
        this.f31780r = str2;
        this.f31781s = str3;
    }
}
