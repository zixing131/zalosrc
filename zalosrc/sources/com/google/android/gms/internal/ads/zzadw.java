package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzadw implements zzbp {
    public static final Parcelable.Creator<zzadw> CREATOR = new C4523g2();

    /* renamed from: p */
    public final float f31810p;

    /* renamed from: q */
    public final int f31811q;

    public zzadw(float f11, int i11) {
        this.f31810p = f11;
        this.f31811q = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.f31810p == zzadwVar.f31810p && this.f31811q == zzadwVar.f31811q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final /* synthetic */ void mo28672f0(C4518fy c4518fy) {
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f31810p).hashCode() + 527) * 31) + this.f31811q;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f31810p + ", svcTemporalLayerCount=" + this.f31811q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f31810p);
        parcel.writeInt(this.f31811q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzadw(Parcel parcel, AbstractC4560h2 abstractC4560h2) {
        this.f31810p = parcel.readFloat();
        this.f31811q = parcel.readInt();
    }
}
