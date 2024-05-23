package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p437q4.C25108a;

/* loaded from: classes2.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C25108a();

    /* renamed from: p */
    private final PendingIntent f15997p;

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f15997p = (PendingIntent) AbstractC4205o.m19722k(pendingIntent);
    }

    /* renamed from: t */
    public final PendingIntent m19077t() {
        return this.f15997p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, m19077t(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
