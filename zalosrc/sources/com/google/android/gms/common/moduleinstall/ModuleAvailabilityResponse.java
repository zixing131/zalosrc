package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p122e5.C18204e;

/* loaded from: classes2.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new C18204e();

    /* renamed from: p */
    private final boolean f16697p;

    /* renamed from: q */
    private final int f16698q;

    public ModuleAvailabilityResponse(boolean z11, int i11) {
        this.f16697p = z11;
        this.f16698q = i11;
    }

    /* renamed from: F */
    public int m19828F() {
        return this.f16698q;
    }

    /* renamed from: t */
    public boolean m19829t() {
        return this.f16697p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, m19829t());
        AbstractC2552a.m12924m(parcel, 2, m19828F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
