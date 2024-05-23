package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C5264c();

    /* renamed from: p */
    private final int f32183p = 1;

    /* renamed from: q */
    private final String f32184q;

    /* renamed from: r */
    private final byte[] f32185r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(int i11, String str, byte[] bArr) {
        this.f32184q = (String) AbstractC4205o.m19722k(str);
        this.f32185r = (byte[]) AbstractC4205o.m19722k(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32183p);
        AbstractC2552a.m12934w(parcel, 2, this.f32184q, false);
        AbstractC2552a.m12918g(parcel, 3, this.f32185r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
