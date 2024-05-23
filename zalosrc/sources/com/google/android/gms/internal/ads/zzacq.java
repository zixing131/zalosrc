package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzacq extends zzadd {
    public static final Parcelable.Creator<zzacq> CREATOR = new C4781n1();

    /* renamed from: q */
    public final byte[] f31767q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzacq(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31767q = (byte[]) g92.m22347h(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacq.class == obj.getClass()) {
            zzacq zzacqVar = (zzacq) obj;
            if (this.f31786p.equals(zzacqVar.f31786p) && Arrays.equals(this.f31767q, zzacqVar.f31767q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f31786p.hashCode() + 527) * 31) + Arrays.hashCode(this.f31767q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31786p);
        parcel.writeByteArray(this.f31767q);
    }

    public zzacq(String str, byte[] bArr) {
        super(str);
        this.f31767q = bArr;
    }
}
