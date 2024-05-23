package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.measurement.internal.C6127s4;
import com.google.android.gms.measurement.internal.C6129s6;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.a */
/* loaded from: classes2.dex */
final class C5917a extends AbstractC5920d {

    /* renamed from: a */
    private final C6127s4 f33749a;

    /* renamed from: b */
    private final C6129s6 f33750b;

    public C5917a(C6127s4 c6127s4) {
        super(null);
        AbstractC4205o.m19722k(c6127s4);
        this.f33749a = c6127s4;
        this.f33750b = c6127s4.m31376I();
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: a */
    public final void mo30781a(String str, String str2, Bundle bundle) {
        this.f33750b.m31437q(str, str2, bundle);
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: b */
    public final List mo30782b(String str, String str2) {
        return this.f33750b.m31431Z(str, str2);
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: c */
    public final Map mo30783c(String str, String str2, boolean z11) {
        return this.f33750b.m31432a0(str, str2, z11);
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: d */
    public final void mo30784d(Bundle bundle) {
        this.f33750b.m31411D(bundle);
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: e */
    public final void mo30785e(String str, String str2, Bundle bundle) {
        this.f33749a.m31376I().m31434n(str, str2, bundle);
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: l */
    public final void mo30786l(String str) {
        this.f33749a.m31400y().m31481k(str, this.f33749a.mo31031a().mo105914b());
    }

    @Override // p230i6.InterfaceC20330v
    /* renamed from: r */
    public final void mo30787r(String str) {
        this.f33749a.m31400y().m31482l(str, this.f33749a.mo31031a().mo105914b());
    }

    @Override // p230i6.InterfaceC20330v
    public final int zza(String str) {
        this.f33750b.m31422Q(str);
        return 25;
    }

    @Override // p230i6.InterfaceC20330v
    public final long zzb() {
        return this.f33749a.m31381N().m31354t0();
    }

    @Override // p230i6.InterfaceC20330v
    public final String zzh() {
        return this.f33750b.m31427V();
    }

    @Override // p230i6.InterfaceC20330v
    public final String zzi() {
        return this.f33750b.m31428W();
    }

    @Override // p230i6.InterfaceC20330v
    public final String zzj() {
        return this.f33750b.m31429X();
    }

    @Override // p230i6.InterfaceC20330v
    public final String zzk() {
        return this.f33750b.m31427V();
    }
}
