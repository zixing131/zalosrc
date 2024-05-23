package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30373e;

/* loaded from: classes2.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C30373e();

    /* renamed from: p */
    public int f32981p;

    /* renamed from: q */
    public boolean f32982q;

    public zzad() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.f32981p == zzadVar.f32981p && AbstractC4199m.m19701a(Boolean.valueOf(this.f32982q), Boolean.valueOf(zzadVar.f32982q))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f32981p), Boolean.valueOf(this.f32982q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f32981p);
        AbstractC2552a.m12914c(parcel, 3, this.f32982q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzad(int i11, boolean z11) {
        this.f32981p = i11;
        this.f32982q = z11;
    }
}
