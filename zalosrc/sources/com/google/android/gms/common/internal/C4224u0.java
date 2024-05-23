package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p538u5.AbstractC27034a;
import p538u5.AbstractC27036c;

/* renamed from: com.google.android.gms.common.internal.u0 */
/* loaded from: classes2.dex */
public final class C4224u0 extends AbstractC27034a implements InterfaceC4230w0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4224u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4230w0
    /* renamed from: D3 */
    public final zzq mo19801D3(zzo zzoVar) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139181d(m139177N, zzoVar);
        Parcel m139176E = m139176E(6, m139177N);
        zzq zzqVar = (zzq) AbstractC27036c.m139178a(m139176E, zzq.CREATOR);
        m139176E.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4230w0
    /* renamed from: S2 */
    public final boolean mo19802S2(zzs zzsVar, InterfaceC4271b interfaceC4271b) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139181d(m139177N, zzsVar);
        AbstractC27036c.m139182e(m139177N, interfaceC4271b);
        Parcel m139176E = m139176E(5, m139177N);
        boolean m139183f = AbstractC27036c.m139183f(m139176E);
        m139176E.recycle();
        return m139183f;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4230w0
    /* renamed from: U3 */
    public final zzq mo19803U3(zzo zzoVar) {
        Parcel m139177N = m139177N();
        AbstractC27036c.m139181d(m139177N, zzoVar);
        Parcel m139176E = m139176E(8, m139177N);
        zzq zzqVar = (zzq) AbstractC27036c.m139178a(m139176E, zzq.CREATOR);
        m139176E.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4230w0
    public final boolean zzi() {
        Parcel m139176E = m139176E(7, m139177N());
        boolean m139183f = AbstractC27036c.m139183f(m139176E);
        m139176E.recycle();
        return m139183f;
    }
}
