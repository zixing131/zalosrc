package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcaq> CREATOR = new cf0();

    /* renamed from: p */
    public final boolean f31996p;

    /* renamed from: q */
    public final List f31997q;

    public zzcaq(boolean z11, List list) {
        this.f31996p = z11;
        this.f31997q = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 2, this.f31996p);
        AbstractC2552a.m12936y(parcel, 3, this.f31997q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
