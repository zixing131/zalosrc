package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;
import p568v5.AbstractC27550u;

/* loaded from: classes2.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new C5887h();

    /* renamed from: p */
    private final List f33541p;

    /* renamed from: q */
    private final PendingIntent f33542q;

    /* renamed from: r */
    private final String f33543r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(List list, PendingIntent pendingIntent, String str) {
        AbstractC27550u m140761p;
        if (list == null) {
            m140761p = AbstractC27550u.m140760n();
        } else {
            m140761p = AbstractC27550u.m140761p(list);
        }
        this.f33541p = m140761p;
        this.f33542q = pendingIntent;
        this.f33543r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12936y(parcel, 1, this.f33541p, false);
        AbstractC2552a.m12932u(parcel, 2, this.f33542q, i11, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33543r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
