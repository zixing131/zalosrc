package bp0;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.os.PowerManager;
import fn0.AbstractC19074t;
import gp0.C19561o0;
import ho0.AbstractC20110a;
import je.C21228a;
import lo0.C22626t;
import org.json.JSONObject;
import p321le.C22453d;
import p348mi.AbstractC23304d;
import zm.voip.service.BatteryInfoHelper;
import zm.voip.service.C32257b4;

/* renamed from: bp0.g */
/* loaded from: classes7.dex */
public final class C3091g {

    /* renamed from: a */
    public static final C3091g f13151a = new C3091g();

    private C3091g() {
    }

    /* renamed from: b */
    private final void m15471b(JSONObject jSONObject, C22626t c22626t) {
        int i11 = AbstractC23304d.f113384f2;
        boolean z11 = true;
        if (i11 == 1) {
            jSONObject.put("set_rbt_success", c22626t.m117023F0());
            return;
        }
        if (i11 == 2) {
            C21228a c21228a = (C21228a) new C22453d(null, 1, null).m101506a();
            if (c21228a == null || AbstractC19074t.m100204b(c21228a.m110002b(), "0")) {
                z11 = false;
            }
            if (c22626t.m117129l() == C22626t.b.PLAYED && !z11 && m15475f() && c22626t.m117023F0() != -1) {
                jSONObject.put("set_rbt_success", 2);
                C21228a m117025G = c22626t.m117025G();
                AbstractC19074t.m100207e(m117025G, "getRingBackTone(...)");
                jSONObject.put("melody", m15474e(m117025G));
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: bp0.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3091g.m15472c();
                    }
                });
                return;
            }
            jSONObject.put("set_rbt_success", c22626t.m117023F0());
        }
    }

    /* renamed from: c */
    public static final void m15472c() {
        AbstractC0924m0.m3725cj(System.currentTimeMillis());
    }

    /* renamed from: d */
    public static final JSONObject m15473d() {
        JSONObject jSONObject = new JSONObject();
        try {
            C22626t m155737l = C32257b4.m155726m().m155737l();
            AbstractC19074t.m100207e(m155737l, "getActiveCallInfo(...)");
            C19561o0 m102161L = C19561o0.m102161L();
            if (C19561o0.m102161L().m102245c0()) {
                jSONObject.put("autoReconnect", 1);
            }
            jSONObject.put("answerType", C19561o0.m102161L().m102284z());
            jSONObject.put("interruptCall", m155737l.f110960y);
            if (m102161L.m102209K() > 0) {
                jSONObject.put("initLibDuration", m102161L.m102209K());
            }
            if (!m155737l.m117090b0() && m102161L.m102207J() > 0) {
                jSONObject.put("incomingDelay", m102161L.m102207J());
            }
            Object systemService = AbstractC3096i0.m15574y().getSystemService("power");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) systemService;
            if (AbstractC3103o.m15619h(21) && powerManager.isPowerSaveMode()) {
                jSONObject.put("isPowerSaveMode", 1);
            }
            if (m155737l.m117133m() != null) {
                jSONObject.put("DeviceRouteInfo", m155737l.m117133m());
            }
            f13151a.m15471b(jSONObject, m155737l);
            jSONObject.put("battery", BatteryInfoHelper.f148742a.m155522c());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    /* renamed from: e */
    private final JSONObject m15474e(C21228a c21228a) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("thumb", c21228a.m110006f());
        jSONObject.put("artist", c21228a.m110001a());
        jSONObject.put("name", c21228a.m110004d());
        jSONObject.put("id", c21228a.m110002b());
        return jSONObject;
    }

    /* renamed from: f */
    private final boolean m15475f() {
        if (System.currentTimeMillis() - AbstractC0924m0.m3738d2() > 86400000) {
            return true;
        }
        return false;
    }
}
