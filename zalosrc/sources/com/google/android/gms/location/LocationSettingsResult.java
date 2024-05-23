package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.C17789x;
import p669y4.InterfaceC30289f;

/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements InterfaceC30289f {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C17789x();

    /* renamed from: p */
    private final Status f33506p;

    /* renamed from: q */
    private final LocationSettingsStates f33507q;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f33506p = status;
        this.f33507q = locationSettingsStates;
    }

    @Override // p669y4.InterfaceC30289f
    public Status getStatus() {
        return this.f33506p;
    }

    /* renamed from: t */
    public LocationSettingsStates m30614t() {
        return this.f33507q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, getStatus(), i11, false);
        AbstractC2552a.m12932u(parcel, 2, m30614t(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
