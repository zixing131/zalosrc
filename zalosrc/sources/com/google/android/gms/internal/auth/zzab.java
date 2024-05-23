package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C5262a();

    /* renamed from: p */
    private final int f32178p = 1;

    /* renamed from: q */
    private final String f32179q;

    /* renamed from: r */
    private final int f32180r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(int i11, String str, int i12) {
        this.f32179q = (String) AbstractC4205o.m19722k(str);
        this.f32180r = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32178p);
        AbstractC2552a.m12934w(parcel, 2, this.f32179q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f32180r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
