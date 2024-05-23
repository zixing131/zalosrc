package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzadn extends zzadd {
    public static final Parcelable.Creator<zzadn> CREATOR = new C4339b2();

    /* renamed from: q */
    public final String f31799q;

    /* renamed from: r */
    public final String f31800r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzadn(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31799q = parcel.readString();
        this.f31800r = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadn.class == obj.getClass()) {
            zzadn zzadnVar = (zzadn) obj;
            if (this.f31786p.equals(zzadnVar.f31786p) && g92.m22362t(this.f31799q, zzadnVar.f31799q) && g92.m22362t(this.f31800r, zzadnVar.f31800r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = (this.f31786p.hashCode() + 527) * 31;
        String str = this.f31799q;
        int i12 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (hashCode + i11) * 31;
        String str2 = this.f31800r;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": url=" + this.f31800r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31786p);
        parcel.writeString(this.f31799q);
        parcel.writeString(this.f31800r);
    }

    public zzadn(String str, String str2, String str3) {
        super(str);
        this.f31799q = str2;
        this.f31800r = str3;
    }
}
