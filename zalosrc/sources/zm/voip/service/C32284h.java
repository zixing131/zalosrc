package zm.voip.service;

import ag0.C0815e1;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import com.zing.zalo.AbstractC6918a0;
import gg0.AbstractC19444a;
import lo0.C22592c;
import lo0.C22626t;
import p097db.AbstractC17849h;
import p361nb.C23648e;
import zm.voip.p721ui.incall.MiniGroupCallView;
import zm.voip.p721ui.incall.VoIPFloatingZView;

/* renamed from: zm.voip.service.h */
/* loaded from: classes7.dex */
public class C32284h {

    /* renamed from: a */
    private final Context f148934a;

    /* renamed from: b */
    private C32369y f148935b;

    /* renamed from: f */
    private Handler f148939f;

    /* renamed from: g */
    private Runnable f148940g;

    /* renamed from: h */
    private final CameraManager f148941h;

    /* renamed from: i */
    private CameraManager.AvailabilityCallback f148942i;

    /* renamed from: d */
    private boolean f148937d = false;

    /* renamed from: e */
    private boolean f148938e = false;

    /* renamed from: c */
    private volatile boolean f148936c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.h$a */
    /* loaded from: classes7.dex */
    public class a extends CameraManager.AvailabilityCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            AbstractC3082b0.m15421c("FloatingCallManager", "cam is available");
            C32284h.this.f148937d = true;
            if (C32257b4.m155726m().m155737l().m117047N0() && C32284h.this.f148938e) {
                C32284h.this.f148939f.removeCallbacks(C32284h.this.f148940g);
                C32284h.this.f148939f.postDelayed(C32284h.this.f148940g, 700L);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            AbstractC3082b0.m15421c("FloatingCallManager", "cam is UnAvailable");
            C32284h.this.f148937d = false;
            C32284h.this.f148938e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32284h(Context context) {
        this.f148934a = context;
        this.f148941h = (CameraManager) context.getSystemService("camera");
    }

    /* renamed from: j */
    private Context m155962j() {
        return this.f148934a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m155963k() {
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.g
            @Override // java.lang.Runnable
            public final void run() {
                C32284h.this.m155967o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m155964l() {
        C22592c m156362c = C32328p3.m156358e().m156362c();
        if (m156362c != null && m156362c.m116854J() && AbstractC3096i0.m15513S() && m156362c.m116885e() != 6) {
            if (this.f148939f == null) {
                this.f148939f = new Handler();
            }
            if (this.f148936c) {
                C32369y c32369y = new C32369y(m155962j());
                this.f148935b = c32369y;
                if (c32369y.mo35579p().mo57057c2(AbstractC6918a0.zalo_view_container, MiniGroupCallView.class, null, 0, null, 0, false) instanceof MiniGroupCallView) {
                    this.f148936c = false;
                    m155966n();
                    C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 1, "call_miniview", new String[0]).m123926s(String.valueOf(2), "0"), false);
                    C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
                    C0815e1.m2075D().m2096R(2, System.currentTimeMillis());
                    return;
                }
                m155970r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m155965m() {
        C22626t m155737l = C32257b4.m155726m().m155737l();
        if (m155737l != null) {
            if ((!m155737l.m117047N0() || m155737l.m117126k0()) && !AbstractC3096i0.f13166j && AbstractC3096i0.m15513S() && m155737l.m117113h() != 6) {
                if (this.f148939f == null) {
                    this.f148939f = new Handler();
                }
                if (this.f148936c) {
                    C32369y c32369y = new C32369y(m155962j(), m155737l.m117047N0());
                    this.f148935b = c32369y;
                    if (c32369y.mo35579p().mo57057c2(AbstractC6918a0.zalo_view_container, VoIPFloatingZView.class, null, 0, null, 0, false) instanceof VoIPFloatingZView) {
                        this.f148936c = false;
                        m155966n();
                        if (m155737l.m117047N0()) {
                            AbstractC32273e3.m155748Q().mo155917s1(4);
                        }
                        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 1, "call_miniview", new String[0]).m123926s(String.valueOf(m155737l.m117047N0() ? 1 : 0), "0"), false);
                        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
                        C0815e1.m2075D().m2096R(2, System.currentTimeMillis());
                        return;
                    }
                    m155970r();
                }
            }
        }
    }

    /* renamed from: n */
    private void m155966n() {
        this.f148940g = new Runnable() { // from class: zm.voip.service.f
            @Override // java.lang.Runnable
            public final void run() {
                C32284h.this.m155963k();
            }
        };
        if (AbstractC3103o.m15619h(21)) {
            a aVar = new a();
            this.f148942i = aVar;
            this.f148941h.registerAvailabilityCallback(aVar, this.f148939f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m155967o() {
        if (this.f148937d) {
            AbstractC3082b0.m15424f("FloatingCallManager", "restartCam");
            this.f148937d = false;
            AbstractC17849h.m94301j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m155968p() {
        AbstractC19444a.m101695c(new Runnable() { // from class: zm.voip.service.d
            @Override // java.lang.Runnable
            public final void run() {
                C32284h.this.m155964l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m155969q() {
        AbstractC19444a.m101695c(new Runnable() { // from class: zm.voip.service.e
            @Override // java.lang.Runnable
            public final void run() {
                C32284h.this.m155965m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m155970r() {
        try {
            C32369y c32369y = this.f148935b;
            if (c32369y != null) {
                c32369y.finish();
                this.f148935b = null;
                if (C32257b4.m155726m().m155737l().m117047N0() && AbstractC3096i0.f13167k >= 5) {
                    AbstractC32273e3.m155748Q().mo155917s1(1);
                }
                C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
            }
            if (AbstractC3103o.m15619h(21)) {
                this.f148937d = false;
                this.f148938e = false;
                CameraManager.AvailabilityCallback availabilityCallback = this.f148942i;
                if (availabilityCallback != null) {
                    this.f148941h.unregisterAvailabilityCallback(availabilityCallback);
                }
                Runnable runnable = this.f148940g;
                if (runnable != null) {
                    this.f148939f.removeCallbacks(runnable);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f148936c = true;
    }
}
