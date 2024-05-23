package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {

    /* renamed from: p */
    final zzs f32234p;

    /* renamed from: q */
    final List f32235q;

    /* renamed from: r */
    final String f32236r;

    /* renamed from: s */
    static final List f32232s = Collections.emptyList();

    /* renamed from: t */
    static final zzs f32233t = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new C5277k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(zzs zzsVar, List list, String str) {
        this.f32234p = zzsVar;
        this.f32235q = list;
        this.f32236r = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!AbstractC4199m.m19701a(this.f32234p, zzjVar.f32234p) || !AbstractC4199m.m19701a(this.f32235q, zzjVar.f32235q) || !AbstractC4199m.m19701a(this.f32236r, zzjVar.f32236r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32234p.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32234p);
        String valueOf2 = String.valueOf(this.f32235q);
        String str = this.f32236r;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f32234p, i11, false);
        AbstractC2552a.m12907A(parcel, 2, this.f32235q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f32236r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
