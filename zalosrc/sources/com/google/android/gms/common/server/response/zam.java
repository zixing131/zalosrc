package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C4260b();

    /* renamed from: p */
    final int f16762p;

    /* renamed from: q */
    final String f16763q;

    /* renamed from: r */
    final FastJsonResponse.Field f16764r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zam(int i11, String str, FastJsonResponse.Field field) {
        this.f16762p = i11;
        this.f16763q = str;
        this.f16764r = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16762p);
        AbstractC2552a.m12934w(parcel, 2, this.f16763q, false);
        AbstractC2552a.m12932u(parcel, 3, this.f16764r, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zam(String str, FastJsonResponse.Field field) {
        this.f16762p = 1;
        this.f16763q = str;
        this.f16764r = field;
    }
}
