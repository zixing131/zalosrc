package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.AbstractBinderC17780o;
import p093d6.InterfaceC17781p;
import p568v5.InterfaceC27534e;

/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C5278l();

    /* renamed from: p */
    final int f32237p;

    /* renamed from: q */
    final zzj f32238q;

    /* renamed from: r */
    final InterfaceC17781p f32239r;

    /* renamed from: s */
    final InterfaceC27534e f32240s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(int i11, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        InterfaceC17781p m93916N;
        this.f32237p = i11;
        this.f32238q = zzjVar;
        InterfaceC27534e interfaceC27534e = null;
        if (iBinder == null) {
            m93916N = null;
        } else {
            m93916N = AbstractBinderC17780o.m93916N(iBinder);
        }
        this.f32239r = m93916N;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC27534e) {
                interfaceC27534e = (InterfaceC27534e) queryLocalInterface;
            } else {
                interfaceC27534e = new C5267a(iBinder2);
            }
        }
        this.f32240s = interfaceC27534e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        IBinder asBinder;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32237p);
        AbstractC2552a.m12932u(parcel, 2, this.f32238q, i11, false);
        InterfaceC17781p interfaceC17781p = this.f32239r;
        IBinder iBinder = null;
        if (interfaceC17781p == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC17781p.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 3, asBinder, false);
        InterfaceC27534e interfaceC27534e = this.f32240s;
        if (interfaceC27534e != null) {
            iBinder = interfaceC27534e.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 4, iBinder, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
