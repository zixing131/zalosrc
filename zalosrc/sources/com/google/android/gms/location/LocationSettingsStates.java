package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.C17790y;

/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C17790y();

    /* renamed from: p */
    private final boolean f33508p;

    /* renamed from: q */
    private final boolean f33509q;

    /* renamed from: r */
    private final boolean f33510r;

    /* renamed from: s */
    private final boolean f33511s;

    /* renamed from: t */
    private final boolean f33512t;

    /* renamed from: u */
    private final boolean f33513u;

    public LocationSettingsStates(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f33508p = z11;
        this.f33509q = z12;
        this.f33510r = z13;
        this.f33511s = z14;
        this.f33512t = z15;
        this.f33513u = z16;
    }

    /* renamed from: F */
    public boolean m30615F() {
        return this.f33510r;
    }

    /* renamed from: J */
    public boolean m30616J() {
        return this.f33511s;
    }

    /* renamed from: K */
    public boolean m30617K() {
        return this.f33508p;
    }

    /* renamed from: M */
    public boolean m30618M() {
        return this.f33512t;
    }

    /* renamed from: Q */
    public boolean m30619Q() {
        return this.f33509q;
    }

    /* renamed from: t */
    public boolean m30620t() {
        return this.f33513u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, m30617K());
        AbstractC2552a.m12914c(parcel, 2, m30619Q());
        AbstractC2552a.m12914c(parcel, 3, m30615F());
        AbstractC2552a.m12914c(parcel, 4, m30616J());
        AbstractC2552a.m12914c(parcel, 5, m30618M());
        AbstractC2552a.m12914c(parcel, 6, m30620t());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
