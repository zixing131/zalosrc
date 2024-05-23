package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.AbstractBinderC17783r;
import p093d6.AbstractBinderC17786u;
import p093d6.InterfaceC17784s;
import p093d6.InterfaceC17787v;
import p568v5.InterfaceC27534e;

/* loaded from: classes2.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C5274h();

    /* renamed from: p */
    final int f32217p;

    /* renamed from: q */
    final zzba f32218q;

    /* renamed from: r */
    final InterfaceC17787v f32219r;

    /* renamed from: s */
    final PendingIntent f32220s;

    /* renamed from: t */
    final InterfaceC17784s f32221t;

    /* renamed from: u */
    final InterfaceC27534e f32222u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(int i11, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        InterfaceC17787v m93919N;
        InterfaceC17784s m93917N;
        this.f32217p = i11;
        this.f32218q = zzbaVar;
        InterfaceC27534e interfaceC27534e = null;
        if (iBinder == null) {
            m93919N = null;
        } else {
            m93919N = AbstractBinderC17786u.m93919N(iBinder);
        }
        this.f32219r = m93919N;
        this.f32220s = pendingIntent;
        if (iBinder2 == null) {
            m93917N = null;
        } else {
            m93917N = AbstractBinderC17783r.m93917N(iBinder2);
        }
        this.f32221t = m93917N;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC27534e) {
                interfaceC27534e = (InterfaceC27534e) queryLocalInterface;
            } else {
                interfaceC27534e = new C5267a(iBinder3);
            }
        }
        this.f32222u = interfaceC27534e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [d6.s, android.os.IBinder] */
    /* renamed from: t */
    public static zzbc m28854t(InterfaceC17784s interfaceC17784s, InterfaceC27534e interfaceC27534e) {
        if (interfaceC27534e == null) {
            interfaceC27534e = null;
        }
        return new zzbc(2, null, null, null, interfaceC17784s, interfaceC27534e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        IBinder asBinder;
        IBinder asBinder2;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32217p);
        AbstractC2552a.m12932u(parcel, 2, this.f32218q, i11, false);
        InterfaceC17787v interfaceC17787v = this.f32219r;
        IBinder iBinder = null;
        if (interfaceC17787v == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC17787v.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 3, asBinder, false);
        AbstractC2552a.m12932u(parcel, 4, this.f32220s, i11, false);
        InterfaceC17784s interfaceC17784s = this.f32221t;
        if (interfaceC17784s == null) {
            asBinder2 = null;
        } else {
            asBinder2 = interfaceC17784s.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 5, asBinder2, false);
        InterfaceC27534e interfaceC27534e = this.f32222u;
        if (interfaceC27534e != null) {
            iBinder = interfaceC27534e.asBinder();
        }
        AbstractC2552a.m12923l(parcel, 6, iBinder, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
