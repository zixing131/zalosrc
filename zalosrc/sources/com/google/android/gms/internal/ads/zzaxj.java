package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaxj extends zzaxn {
    public static final Parcelable.Creator<zzaxj> CREATOR = new C4876pl();

    /* renamed from: q */
    public final String f31855q;

    /* renamed from: r */
    public final String f31856r;

    /* renamed from: s */
    public final int f31857s;

    /* renamed from: t */
    public final byte[] f31858t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxj(Parcel parcel) {
        super("APIC");
        this.f31855q = parcel.readString();
        this.f31856r = parcel.readString();
        this.f31857s = parcel.readInt();
        this.f31858t = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxj.class == obj.getClass()) {
            zzaxj zzaxjVar = (zzaxj) obj;
            if (this.f31857s == zzaxjVar.f31857s && AbstractC4916qo.m25839o(this.f31855q, zzaxjVar.f31855q) && AbstractC4916qo.m25839o(this.f31856r, zzaxjVar.f31856r) && Arrays.equals(this.f31858t, zzaxjVar.f31858t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12 = (this.f31857s + 527) * 31;
        String str = this.f31855q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i12 + i11) * 31;
        String str2 = this.f31856r;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        return ((i14 + i13) * 31) + Arrays.hashCode(this.f31858t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31855q);
        parcel.writeString(this.f31856r);
        parcel.writeInt(this.f31857s);
        parcel.writeByteArray(this.f31858t);
    }

    public zzaxj(String str, String str2, int i11, byte[] bArr) {
        super("APIC");
        this.f31855q = str;
        this.f31856r = null;
        this.f31857s = 3;
        this.f31858t = bArr;
    }
}
