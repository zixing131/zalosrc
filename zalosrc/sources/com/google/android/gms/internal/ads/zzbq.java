package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new h20();

    /* renamed from: p */
    private final zzbp[] f31902p;

    /* renamed from: q */
    public final long f31903q;

    public zzbq(long j11, zzbp... zzbpVarArr) {
        this.f31903q = j11;
        this.f31902p = zzbpVarArr;
    }

    /* renamed from: a */
    public final int m28707a() {
        return this.f31902p.length;
    }

    /* renamed from: b */
    public final zzbp m28708b(int i11) {
        return this.f31902p[i11];
    }

    /* renamed from: c */
    public final zzbq m28709c(zzbp... zzbpVarArr) {
        if (zzbpVarArr.length == 0) {
            return this;
        }
        return new zzbq(this.f31903q, (zzbp[]) g92.m22311E(this.f31902p, zzbpVarArr));
    }

    /* renamed from: d */
    public final zzbq m28710d(zzbq zzbqVar) {
        if (zzbqVar == null) {
            return this;
        }
        return m28709c(zzbqVar.f31902p);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbqVar = (zzbq) obj;
            if (Arrays.equals(this.f31902p, zzbqVar.f31902p) && this.f31903q == zzbqVar.f31903q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f31902p);
        long j11 = this.f31903q;
        return (hashCode * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f31902p);
        long j11 = this.f31903q;
        if (j11 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j11;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f31902p.length);
        for (zzbp zzbpVar : this.f31902p) {
            parcel.writeParcelable(zzbpVar, 0);
        }
        parcel.writeLong(this.f31903q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(Parcel parcel) {
        this.f31902p = new zzbp[parcel.readInt()];
        int i11 = 0;
        while (true) {
            zzbp[] zzbpVarArr = this.f31902p;
            if (i11 < zzbpVarArr.length) {
                zzbpVarArr[i11] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
                i11++;
            } else {
                this.f31903q = parcel.readLong();
                return;
            }
        }
    }

    public zzbq(List list) {
        this(-9223372036854775807L, (zzbp[]) list.toArray(new zzbp[0]));
    }
}
