package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C4209p0();

    /* renamed from: p */
    final int f16688p;

    /* renamed from: q */
    private final int f16689q;

    /* renamed from: r */
    private final int f16690r;

    /* renamed from: s */
    private final Scope[] f16691s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zax(int i11, int i12, int i13, Scope[] scopeArr) {
        this.f16688p = i11;
        this.f16689q = i12;
        this.f16690r = i13;
        this.f16691s = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16688p);
        AbstractC2552a.m12924m(parcel, 2, this.f16689q);
        AbstractC2552a.m12924m(parcel, 3, this.f16690r);
        AbstractC2552a.m12937z(parcel, 4, this.f16691s, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
