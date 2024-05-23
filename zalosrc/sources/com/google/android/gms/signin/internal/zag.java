package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;
import p290k6.C21482d;
import p669y4.InterfaceC30289f;

/* loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC30289f {
    public static final Parcelable.Creator<zag> CREATOR = new C21482d();

    /* renamed from: p */
    private final List f34721p;

    /* renamed from: q */
    private final String f34722q;

    public zag(List list, String str) {
        this.f34721p = list;
        this.f34722q = str;
    }

    @Override // p669y4.InterfaceC30289f
    public final Status getStatus() {
        if (this.f34722q != null) {
            return Status.f16167v;
        }
        return Status.f16171z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12936y(parcel, 1, this.f34721p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f34722q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
