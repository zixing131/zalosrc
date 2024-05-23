package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzbau implements Parcelable {
    public static final Parcelable.Creator<zzbau> CREATOR = new C4990so();

    /* renamed from: p */
    public final int f31868p;

    /* renamed from: q */
    public final int f31869q;

    /* renamed from: r */
    public final int f31870r;

    /* renamed from: s */
    public final byte[] f31871s;

    /* renamed from: t */
    private int f31872t;

    public zzbau(int i11, int i12, int i13, byte[] bArr) {
        this.f31868p = i11;
        this.f31869q = i12;
        this.f31870r = i13;
        this.f31871s = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbau.class == obj.getClass()) {
            zzbau zzbauVar = (zzbau) obj;
            if (this.f31868p == zzbauVar.f31868p && this.f31869q == zzbauVar.f31869q && this.f31870r == zzbauVar.f31870r && Arrays.equals(this.f31871s, zzbauVar.f31871s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f31872t;
        if (i11 == 0) {
            int hashCode = ((((((this.f31868p + 527) * 31) + this.f31869q) * 31) + this.f31870r) * 31) + Arrays.hashCode(this.f31871s);
            this.f31872t = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final String toString() {
        boolean z11;
        int i11 = this.f31868p;
        int i12 = this.f31869q;
        int i13 = this.f31870r;
        if (this.f31871s != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return "ColorInfo(" + i11 + ", " + i12 + ", " + i13 + ", " + z11 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12;
        parcel.writeInt(this.f31868p);
        parcel.writeInt(this.f31869q);
        parcel.writeInt(this.f31870r);
        if (this.f31871s != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        parcel.writeInt(i12);
        byte[] bArr = this.f31871s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbau(Parcel parcel) {
        this.f31868p = parcel.readInt();
        this.f31869q = parcel.readInt();
        this.f31870r = parcel.readInt();
        this.f31871s = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
