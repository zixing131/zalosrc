package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C4254s();

    /* renamed from: p */
    private final String f16790p;

    /* renamed from: q */
    private final boolean f16791q;

    /* renamed from: r */
    private final boolean f16792r;

    /* renamed from: s */
    private final Context f16793s;

    /* renamed from: t */
    private final boolean f16794t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(String str, boolean z11, boolean z12, IBinder iBinder, boolean z13) {
        this.f16790p = str;
        this.f16791q = z11;
        this.f16792r = z12;
        this.f16793s = (Context) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder));
        this.f16794t = z13;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.dynamic.b, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f16790p, false);
        AbstractC2552a.m12914c(parcel, 2, this.f16791q);
        AbstractC2552a.m12914c(parcel, 3, this.f16792r);
        AbstractC2552a.m12923l(parcel, 4, BinderC4273d.m19913I3(this.f16793s), false);
        AbstractC2552a.m12914c(parcel, 5, this.f16794t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
