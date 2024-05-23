package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C5263b();

    /* renamed from: p */
    private final int f32181p = 1;

    /* renamed from: q */
    private final String f32182q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(int i11, String str) {
        this.f32182q = (String) AbstractC4205o.m19722k(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32181p);
        AbstractC2552a.m12934w(parcel, 2, this.f32182q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
