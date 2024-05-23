package com.google.android.gms.internal.p734authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p438q5.C25131k;

/* loaded from: classes2.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C25131k();

    /* renamed from: p */
    private final Credential f32177p;

    public zzz(Credential credential) {
        this.f32177p = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f32177p, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
