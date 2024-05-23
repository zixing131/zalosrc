package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzadh extends zzadd {
    public static final Parcelable.Creator<zzadh> CREATOR = new C5190y1();

    /* renamed from: q */
    public final int f31790q;

    /* renamed from: r */
    public final int f31791r;

    /* renamed from: s */
    public final int f31792s;

    /* renamed from: t */
    public final int[] f31793t;

    /* renamed from: u */
    public final int[] f31794u;

    public zzadh(int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f31790q = i11;
        this.f31791r = i12;
        this.f31792s = i13;
        this.f31793t = iArr;
        this.f31794u = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadh.class == obj.getClass()) {
            zzadh zzadhVar = (zzadh) obj;
            if (this.f31790q == zzadhVar.f31790q && this.f31791r == zzadhVar.f31791r && this.f31792s == zzadhVar.f31792s && Arrays.equals(this.f31793t, zzadhVar.f31793t) && Arrays.equals(this.f31794u, zzadhVar.f31794u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f31790q + 527) * 31) + this.f31791r) * 31) + this.f31792s) * 31) + Arrays.hashCode(this.f31793t)) * 31) + Arrays.hashCode(this.f31794u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f31790q);
        parcel.writeInt(this.f31791r);
        parcel.writeInt(this.f31792s);
        parcel.writeIntArray(this.f31793t);
        parcel.writeIntArray(this.f31794u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadh(Parcel parcel) {
        super("MLLT");
        this.f31790q = parcel.readInt();
        this.f31791r = parcel.readInt();
        this.f31792s = parcel.readInt();
        this.f31793t = (int[]) g92.m22347h(parcel.createIntArray());
        this.f31794u = (int[]) g92.m22347h(parcel.createIntArray());
    }
}
