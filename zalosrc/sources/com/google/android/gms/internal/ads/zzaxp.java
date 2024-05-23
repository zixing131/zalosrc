package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzaxp extends zzaxn {
    public static final Parcelable.Creator<zzaxp> CREATOR = new C4987sl();

    /* renamed from: q */
    public final String f31863q;

    /* renamed from: r */
    public final String f31864r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxp(Parcel parcel) {
        super(parcel.readString());
        this.f31863q = parcel.readString();
        this.f31864r = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxp.class == obj.getClass()) {
            zzaxp zzaxpVar = (zzaxp) obj;
            if (this.f31862p.equals(zzaxpVar.f31862p) && AbstractC4916qo.m25839o(this.f31863q, zzaxpVar.f31863q) && AbstractC4916qo.m25839o(this.f31864r, zzaxpVar.f31864r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = (this.f31862p.hashCode() + 527) * 31;
        String str = this.f31863q;
        int i12 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (hashCode + i11) * 31;
        String str2 = this.f31864r;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31862p);
        parcel.writeString(this.f31863q);
        parcel.writeString(this.f31864r);
    }

    public zzaxp(String str, String str2, String str3) {
        super(str);
        this.f31863q = null;
        this.f31864r = str3;
    }
}
