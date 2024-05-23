package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbrd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrd> CREATOR = new r50();

    /* renamed from: p */
    public final String f31904p;

    /* renamed from: q */
    public final String[] f31905q;

    /* renamed from: r */
    public final String[] f31906r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrd(String str, String[] strArr, String[] strArr2) {
        this.f31904p = str;
        this.f31905q = strArr;
        this.f31906r = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f31904p, false);
        AbstractC2552a.m12935x(parcel, 2, this.f31905q, false);
        AbstractC2552a.m12935x(parcel, 3, this.f31906r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
