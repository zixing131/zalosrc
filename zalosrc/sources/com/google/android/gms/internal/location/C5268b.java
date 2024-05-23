package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import p568v5.AbstractC27530a;
import p568v5.AbstractC27554y;
import p568v5.InterfaceC27535f;

/* renamed from: com.google.android.gms.internal.location.b */
/* loaded from: classes2.dex */
public final class C5268b extends AbstractC27530a implements InterfaceC27535f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5268b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p568v5.InterfaceC27535f
    /* renamed from: T4 */
    public final void mo28839T4(boolean z11) {
        Parcel m140738E = m140738E();
        AbstractC27554y.m140764a(m140738E, z11);
        m140740Q(12, m140738E);
    }

    @Override // p568v5.InterfaceC27535f
    /* renamed from: f0 */
    public final void mo28840f0(zzbc zzbcVar) {
        Parcel m140738E = m140738E();
        AbstractC27554y.m140766c(m140738E, zzbcVar);
        m140740Q(59, m140738E);
    }

    @Override // p568v5.InterfaceC27535f
    public final Location zzm() {
        Parcel m140739N = m140739N(7, m140738E());
        Location location = (Location) AbstractC27554y.m140765b(m140739N, Location.CREATOR);
        m140739N.recycle();
        return location;
    }

    @Override // p568v5.InterfaceC27535f
    public final Location zzn(String str) {
        Parcel m140738E = m140738E();
        m140738E.writeString(str);
        Parcel m140739N = m140739N(80, m140738E);
        Location location = (Location) AbstractC27554y.m140765b(m140739N, Location.CREATOR);
        m140739N.recycle();
        return location;
    }
}
