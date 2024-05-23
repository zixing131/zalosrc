package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p598w5.AbstractC28761s;

/* loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C5909f();

    /* renamed from: q */
    private static final AbstractC28761s f33742q = AbstractC28761s.m143897n("ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "COUNTRY", "LOCALITY", "POSTAL_CODE", "SCHOOL_DISTRICT", new String[0]);

    /* renamed from: p */
    private final String f33743p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(String str) {
        this.f33743p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f33743p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, str, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
