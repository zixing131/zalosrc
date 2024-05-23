package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzfoc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoc> CREATOR = new c13();

    /* renamed from: p */
    public final int f32113p;

    /* renamed from: q */
    public final byte[] f32114q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoc(int i11, byte[] bArr) {
        this.f32113p = i11;
        this.f32114q = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32113p);
        AbstractC2552a.m12918g(parcel, 2, this.f32114q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzfoc(byte[] bArr) {
        this(1, bArr);
    }
}
