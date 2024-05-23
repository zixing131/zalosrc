package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzaxl extends zzaxn {
    public static final Parcelable.Creator<zzaxl> CREATOR = new C4913ql();

    /* renamed from: q */
    public final String f31859q;

    /* renamed from: r */
    public final String f31860r;

    /* renamed from: s */
    public final String f31861s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxl(Parcel parcel) {
        super("COMM");
        this.f31859q = parcel.readString();
        this.f31860r = parcel.readString();
        this.f31861s = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxl.class == obj.getClass()) {
            zzaxl zzaxlVar = (zzaxl) obj;
            if (AbstractC4916qo.m25839o(this.f31860r, zzaxlVar.f31860r) && AbstractC4916qo.m25839o(this.f31859q, zzaxlVar.f31859q) && AbstractC4916qo.m25839o(this.f31861s, zzaxlVar.f31861s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int i12;
        String str = this.f31859q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i11 + 527) * 31;
        String str2 = this.f31860r;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        String str3 = this.f31861s;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return i15 + i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31862p);
        parcel.writeString(this.f31859q);
        parcel.writeString(this.f31861s);
    }

    public zzaxl(String str, String str2, String str3) {
        super("COMM");
        this.f31859q = "und";
        this.f31860r = str2;
        this.f31861s = str3;
    }
}
