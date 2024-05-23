package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzfof extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfof> CREATOR = new e13();

    /* renamed from: p */
    public final int f32115p;

    /* renamed from: q */
    public final String f32116q;

    /* renamed from: r */
    public final String f32117r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfof(int i11, String str, String str2) {
        this.f32115p = i11;
        this.f32116q = str;
        this.f32117r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32115p);
        AbstractC2552a.m12934w(parcel, 2, this.f32116q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f32117r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzfof(String str, String str2) {
        this(1, str, str2);
    }
}
