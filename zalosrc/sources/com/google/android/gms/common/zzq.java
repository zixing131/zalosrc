package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C4265t();

    /* renamed from: p */
    private final boolean f16795p;

    /* renamed from: q */
    private final String f16796q;

    /* renamed from: r */
    private final int f16797r;

    /* renamed from: s */
    private final int f16798s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(boolean z11, String str, int i11, int i12) {
        this.f16795p = z11;
        this.f16796q = str;
        this.f16797r = AbstractC4269x.m19890a(i11) - 1;
        this.f16798s = AbstractC4158h.m19600a(i12) - 1;
    }

    /* renamed from: F */
    public final boolean m19891F() {
        return this.f16795p;
    }

    /* renamed from: J */
    public final int m19892J() {
        return AbstractC4158h.m19600a(this.f16798s);
    }

    /* renamed from: K */
    public final int m19893K() {
        return AbstractC4269x.m19890a(this.f16797r);
    }

    /* renamed from: t */
    public final String m19894t() {
        return this.f16796q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, this.f16795p);
        AbstractC2552a.m12934w(parcel, 2, this.f16796q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16797r);
        AbstractC2552a.m12924m(parcel, 4, this.f16798s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
