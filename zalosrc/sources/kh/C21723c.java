package kh;

import android.location.GpsStatus;
import fn0.AbstractC19074t;
import p006a0.C0015d;
import vg.C28139n5;

/* renamed from: kh.c */
/* loaded from: classes3.dex */
public final class C21723c implements InterfaceC21724d, GpsStatus.Listener {

    /* renamed from: a */
    private final C0015d f105497a;

    public C21723c(C0015d c0015d) {
        AbstractC19074t.m100208f(c0015d, "locationManager");
        this.f105497a = c0015d;
    }

    @Override // kh.InterfaceC21724d
    /* renamed from: a */
    public void mo112124a() {
        m112127b().m22a(this);
    }

    /* renamed from: b */
    public C0015d m112127b() {
        return this.f105497a;
    }

    @Override // android.location.GpsStatus.Listener
    public void onGpsStatusChanged(int i11) {
        m112127b().m26e(this);
        C28139n5.m141620j().m141626D(1);
    }
}
