package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzadj extends zzadd {
    public static final Parcelable.Creator<zzadj> CREATOR = new C5227z1();

    /* renamed from: q */
    public final String f31795q;

    /* renamed from: r */
    public final byte[] f31796r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadj(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31795q = readString;
        this.f31796r = (byte[]) g92.m22347h(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadj.class == obj.getClass()) {
            zzadj zzadjVar = (zzadj) obj;
            if (g92.m22362t(this.f31795q, zzadjVar.f31795q) && Arrays.equals(this.f31796r, zzadjVar.f31796r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        String str = this.f31795q;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        return ((i11 + 527) * 31) + Arrays.hashCode(this.f31796r);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": owner=" + this.f31795q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31795q);
        parcel.writeByteArray(this.f31796r);
    }

    public zzadj(String str, byte[] bArr) {
        super("PRIV");
        this.f31795q = str;
        this.f31796r = bArr;
    }
}
