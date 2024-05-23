package kh;

import android.location.GnssStatus;
import android.os.Handler;
import bf0.C2793a;
import fn0.AbstractC19074t;
import p006a0.C0015d;
import vg.C28139n5;

/* renamed from: kh.b */
/* loaded from: classes3.dex */
public final class C21722b extends GnssStatus.Callback implements InterfaceC21724d {

    /* renamed from: a */
    private final C0015d f105496a;

    public C21722b(C0015d c0015d) {
        AbstractC19074t.m100208f(c0015d, "locationManager");
        this.f105496a = c0015d;
    }

    @Override // kh.InterfaceC21724d
    /* renamed from: a */
    public void mo112124a() {
        m112125b().m25d(AbstractC21721a.m112123a(this), new Handler(C2793a.f11144a.m13457b()));
    }

    /* renamed from: b */
    public C0015d m112125b() {
        return this.f105496a;
    }

    /* renamed from: c */
    public void m112126c() {
        m112125b().m29j(AbstractC21721a.m112123a(this));
        C28139n5.m141620j().m141626D(1);
    }

    @Override // android.location.GnssStatus.Callback
    public void onFirstFix(int i11) {
        super.onFirstFix(i11);
        m112126c();
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        AbstractC19074t.m100208f(gnssStatus, "status");
        super.onSatelliteStatusChanged(gnssStatus);
        m112126c();
    }

    @Override // android.location.GnssStatus.Callback
    public void onStarted() {
        super.onStarted();
        m112126c();
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
        super.onStopped();
        m112126c();
    }
}
