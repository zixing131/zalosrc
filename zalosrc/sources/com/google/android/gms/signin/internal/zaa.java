package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p669y4.InterfaceC30289f;

/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC30289f {
    public static final Parcelable.Creator<zaa> CREATOR = new C6211b();

    /* renamed from: p */
    final int f34718p;

    /* renamed from: q */
    private int f34719q;

    /* renamed from: r */
    private Intent f34720r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaa(int i11, int i12, Intent intent) {
        this.f34718p = i11;
        this.f34719q = i12;
        this.f34720r = intent;
    }

    @Override // p669y4.InterfaceC30289f
    public final Status getStatus() {
        if (this.f34719q == 0) {
            return Status.f16167v;
        }
        return Status.f16171z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f34718p);
        AbstractC2552a.m12924m(parcel, 2, this.f34719q);
        AbstractC2552a.m12932u(parcel, 3, this.f34720r, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
