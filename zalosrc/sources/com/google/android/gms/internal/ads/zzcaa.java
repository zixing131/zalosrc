package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Map;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcaa> CREATOR = new oe0();

    /* renamed from: p */
    public final View f31936p;

    /* renamed from: q */
    public final Map f31937q;

    public zzcaa(IBinder iBinder, IBinder iBinder2) {
        this.f31936p = (View) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder));
        this.f31937q = (Map) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12923l(parcel, 1, BinderC4273d.m19913I3(this.f31936p).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 2, BinderC4273d.m19913I3(this.f31937q).asBinder(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
