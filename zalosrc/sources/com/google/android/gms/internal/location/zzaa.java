package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p568v5.C27531b;
import p669y4.InterfaceC30289f;

/* loaded from: classes2.dex */
public final class zzaa extends AbstractSafeParcelable implements InterfaceC30289f {

    /* renamed from: p */
    private final Status f32204p;

    /* renamed from: q */
    public static final zzaa f32203q = new zzaa(Status.f16167v);
    public static final Parcelable.Creator<zzaa> CREATOR = new C27531b();

    public zzaa(Status status) {
        this.f32204p = status;
    }

    @Override // p669y4.InterfaceC30289f
    public final Status getStatus() {
        return this.f32204p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f32204p, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
