package com.zing.zalo.zinstant;

import dk0.C18020c;
import ho0.AbstractC20110a;
import lk0.C22509g;
import org.json.JSONObject;
import p371nv.C23952g;
import pj0.C24777c;

/* renamed from: com.zing.zalo.zinstant.a */
/* loaded from: classes.dex */
public final class C17099a {

    /* renamed from: e */
    private static final String f87463e = "a";

    /* renamed from: a */
    InterfaceC17169n0 f87464a;

    /* renamed from: b */
    C22509g f87465b;

    /* renamed from: c */
    C18020c f87466c;

    /* renamed from: d */
    boolean f87467d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private static final C17099a f87468a = new C17099a();
    }

    /* renamed from: a */
    private void m91451a() {
        if (this.f87467d) {
        } else {
            throw new IllegalStateException("ApiPayloadReceiver has not been initialized. Did you forget to call init()?");
        }
    }

    /* renamed from: b */
    private void m91452b() {
        try {
            m91456f();
            C24777c.m128780t().m128791x();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static C17099a m91453c() {
        return b.f87468a;
    }

    /* renamed from: d */
    public void m91454d(InterfaceC17169n0 interfaceC17169n0, C22509g c22509g, C18020c c18020c) {
        this.f87464a = interfaceC17169n0;
        this.f87465b = c22509g;
        this.f87466c = c18020c;
        this.f87467d = true;
    }

    /* renamed from: e */
    public void m91455e(int i11, JSONObject jSONObject) {
        if (!this.f87464a.mo91764e()) {
            return;
        }
        try {
            C23952g.m125345j(f87463e, "Receive message type = " + i11 + ", payload = " + jSONObject);
        } catch (Exception e11) {
            AbstractC20110a.m104537f(e11, "Error while printing log", new Object[0]);
        }
        m91451a();
        if (i11 != 1) {
            if (i11 != 5) {
                if (i11 == 6 && this.f87464a.mo91767h()) {
                    try {
                        C18020c.m95817m().m95824C(jSONObject.toString());
                        return;
                    } catch (Exception e12) {
                        AbstractC20110a.m104543l(f87463e).mo104560t(e12);
                        return;
                    }
                }
                return;
            }
            if (jSONObject.optInt("clear_all_bin", 0) == 1) {
                m91452b();
                return;
            }
            return;
        }
        if (this.f87464a.mo91767h()) {
            try {
                if (jSONObject.optInt("clear_data", 0) == 1) {
                    m91456f();
                    AbstractC17153h.m91713e();
                }
            } catch (Exception e13) {
                AbstractC17153h.m91712d(e13);
            }
        }
    }

    /* renamed from: f */
    public void m91456f() {
        this.f87466c.m95826F();
    }

    private C17099a() {
    }
}
