package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new C4297a();

    /* renamed from: p */
    List f16838p;

    public UserAddressRequest(List list) {
        this.f16838p = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 2, this.f16838p, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
