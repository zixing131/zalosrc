package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C5885f();

    /* renamed from: p */
    private final List f33502p;

    /* renamed from: q */
    private final boolean f33503q;

    /* renamed from: r */
    private final boolean f33504r;

    /* renamed from: s */
    private zzbj f33505s;

    public LocationSettingsRequest(List list, boolean z11, boolean z12, zzbj zzbjVar) {
        this.f33502p = list;
        this.f33503q = z11;
        this.f33504r = z12;
        this.f33505s = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, Collections.unmodifiableList(this.f33502p), false);
        AbstractC2552a.m12914c(parcel, 2, this.f33503q);
        AbstractC2552a.m12914c(parcel, 3, this.f33504r);
        AbstractC2552a.m12932u(parcel, 5, this.f33505s, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
