package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C4047a();

    /* renamed from: p */
    final int f16086p;

    /* renamed from: q */
    private int f16087q;

    /* renamed from: r */
    private Bundle f16088r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptionsExtensionParcelable(int i11, int i12, Bundle bundle) {
        this.f16086p = i11;
        this.f16087q = i12;
        this.f16088r = bundle;
    }

    /* renamed from: t */
    public int m19136t() {
        return this.f16087q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16086p);
        AbstractC2552a.m12924m(parcel, 2, m19136t());
        AbstractC2552a.m12916e(parcel, 3, this.f16088r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
