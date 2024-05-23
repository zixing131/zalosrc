package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxq> CREATOR = new cc0();

    /* renamed from: p */
    public final int f31930p;

    /* renamed from: q */
    public final int f31931q;

    /* renamed from: r */
    public final int f31932r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxq(int i11, int i12, int i13) {
        this.f31930p = i11;
        this.f31931q = i12;
        this.f31932r = i13;
    }

    /* renamed from: t */
    public static zzbxq m28714t(VersionInfo versionInfo) {
        return new zzbxq(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbxq)) {
            zzbxq zzbxqVar = (zzbxq) obj;
            if (zzbxqVar.f31932r == this.f31932r && zzbxqVar.f31931q == this.f31931q && zzbxqVar.f31930p == this.f31930p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f31930p, this.f31931q, this.f31932r});
    }

    public final String toString() {
        return this.f31930p + "." + this.f31931q + "." + this.f31932r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f31930p);
        AbstractC2552a.m12924m(parcel, 2, this.f31931q);
        AbstractC2552a.m12924m(parcel, 3, this.f31932r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
