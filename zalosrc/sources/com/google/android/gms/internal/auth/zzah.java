package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C5265d();

    /* renamed from: p */
    private final int f32186p = 1;

    /* renamed from: q */
    private final String f32187q;

    /* renamed from: r */
    private final PendingIntent f32188r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(int i11, String str, PendingIntent pendingIntent) {
        this.f32187q = (String) AbstractC4205o.m19722k(str);
        this.f32188r = (PendingIntent) AbstractC4205o.m19722k(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32186p);
        AbstractC2552a.m12934w(parcel, 2, this.f32187q, false);
        AbstractC2552a.m12932u(parcel, 3, this.f32188r, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
