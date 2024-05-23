package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p122e5.C18207h;

/* loaded from: classes2.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new C18207h();

    /* renamed from: p */
    private final int f16700p;

    /* renamed from: q */
    private final boolean f16701q;

    public ModuleInstallResponse(int i11) {
        this(i11, false);
    }

    /* renamed from: t */
    public int m19831t() {
        return this.f16700p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, m19831t());
        AbstractC2552a.m12914c(parcel, 2, this.f16701q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public ModuleInstallResponse(int i11, boolean z11) {
        this.f16700p = i11;
        this.f16701q = z11;
    }
}
