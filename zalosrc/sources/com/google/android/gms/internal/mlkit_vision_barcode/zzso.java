package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30372dh;

/* loaded from: classes2.dex */
public final class zzso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzso> CREATOR = new C30372dh();

    /* renamed from: p */
    private final int f33140p;

    /* renamed from: q */
    private final boolean f33141q;

    public zzso(int i11, boolean z11) {
        this.f33140p = i11;
        this.f33141q = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33140p);
        AbstractC2552a.m12914c(parcel, 2, this.f33141q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
