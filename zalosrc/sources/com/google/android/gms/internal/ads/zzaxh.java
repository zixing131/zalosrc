package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaxh implements Parcelable {
    public static final Parcelable.Creator<zzaxh> CREATOR = new C4838ol();

    /* renamed from: p */
    private final zzaxg[] f31854p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxh(Parcel parcel) {
        this.f31854p = new zzaxg[parcel.readInt()];
        int i11 = 0;
        while (true) {
            zzaxg[] zzaxgVarArr = this.f31854p;
            if (i11 >= zzaxgVarArr.length) {
                return;
            }
            zzaxgVarArr[i11] = (zzaxg) parcel.readParcelable(zzaxg.class.getClassLoader());
            i11++;
        }
    }

    /* renamed from: a */
    public final int m28694a() {
        return this.f31854p.length;
    }

    /* renamed from: b */
    public final zzaxg m28695b(int i11) {
        return this.f31854p[i11];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxh.class == obj.getClass()) {
            return Arrays.equals(this.f31854p, ((zzaxh) obj).f31854p);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31854p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f31854p.length);
        for (zzaxg zzaxgVar : this.f31854p) {
            parcel.writeParcelable(zzaxgVar, 0);
        }
    }

    public zzaxh(List list) {
        zzaxg[] zzaxgVarArr = new zzaxg[list.size()];
        this.f31854p = zzaxgVarArr;
        list.toArray(zzaxgVarArr);
    }
}
