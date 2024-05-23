package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p012a6.C0352kh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new C0352kh();

    /* renamed from: p */
    private final String f33200p;

    /* renamed from: q */
    private final List f33201q;

    public zzsg(String str, List list) {
        this.f33200p = str;
        this.f33201q = list;
    }

    /* renamed from: F */
    public final List m30146F() {
        return this.f33201q;
    }

    /* renamed from: t */
    public final String m30147t() {
        return this.f33200p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33200p, false);
        AbstractC2552a.m12907A(parcel, 2, this.f33201q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
