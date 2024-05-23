package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;
import p181g6.C19236b;

/* loaded from: classes2.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new C5916m();

    /* renamed from: p */
    protected final C19236b f33697p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StampStyle(IBinder iBinder) {
        this.f33697p = new C19236b(InterfaceC4271b.a.m19911N(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C19236b c19236b = this.f33697p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12923l(parcel, 2, c19236b.m100918a().asBinder(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
