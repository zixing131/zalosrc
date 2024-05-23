package p608wg;

import android.os.Bundle;
import com.zing.zalo.qrcode.p069ui.MyQRView;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import org.json.JSONObject;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;

/* renamed from: wg.m */
/* loaded from: classes3.dex */
public final class C28977m implements InterfaceC28970f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f134101a;

    /* renamed from: b */
    private final String f134102b;

    /* renamed from: c */
    private final InterfaceC27218a f134103c;

    /* renamed from: d */
    private final InterfaceC25792a.c f134104d;

    /* renamed from: e */
    private final Bundle f134105e;

    /* renamed from: wg.m$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28977m(String str, String str2, InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, Bundle bundle) {
        AbstractC19074t.m100208f(str2, "strAction");
        AbstractC19074t.m100208f(bundle, "bundle");
        this.f134101a = str;
        this.f134102b = str2;
        this.f134103c = interfaceC27218a;
        this.f134104d = cVar;
        this.f134105e = bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m144688c(C28977m c28977m) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(c28977m, "this$0");
        InterfaceC27218a interfaceC27218a = c28977m.f134103c;
        if (interfaceC27218a != null && (mo35579p = interfaceC27218a.mo35579p()) != null) {
            mo35579p.m93069k2(MyQRView.class, c28977m.f134105e, 1, true);
        }
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        try {
            JSONObject m131571b = AbstractC25384a.m131571b(this.f134101a);
            if (m131571b == null) {
                InterfaceC25792a.c cVar = this.f134104d;
                if (cVar != null) {
                    InterfaceC25792a.c.a.m132932a(cVar, m144689e(-1, "Fail", this.f134102b), null, 2, null);
                    return;
                }
                return;
            }
            if (!m131571b.has("uid")) {
                InterfaceC25792a.c cVar2 = this.f134104d;
                if (cVar2 != null) {
                    InterfaceC25792a.c.a.m132932a(cVar2, m144689e(-1, "Fail", this.f134102b), null, 2, null);
                    return;
                }
                return;
            }
            long j11 = m131571b.getLong("uid");
            String string = m131571b.getString("dpn");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f134105e.putInt("destination", 2);
            this.f134105e.putString("qr_viewer_id", String.valueOf(j11));
            this.f134105e.putString("qr_viewer_name", string);
            AbstractC19444a.m101697e(new Runnable() { // from class: wg.l
                @Override // java.lang.Runnable
                public final void run() {
                    C28977m.m144688c(C28977m.this);
                }
            });
            InterfaceC25792a.c cVar3 = this.f134104d;
            if (cVar3 != null) {
                InterfaceC25792a.c.a.m132932a(cVar3, mo2446a(this.f134102b), null, 2, null);
            }
        } catch (Exception unused) {
            InterfaceC25792a.c cVar4 = this.f134104d;
            if (cVar4 != null) {
                InterfaceC25792a.c.a.m132932a(cVar4, m144689e(-1, "Fail", this.f134102b), null, 2, null);
            }
        }
    }

    /* renamed from: e */
    public String m144689e(int i11, String str, String str2) {
        return InterfaceC28970f.a.m144681a(this, i11, str, str2);
    }

    public /* synthetic */ C28977m(String str, String str2, InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, interfaceC27218a, cVar, (i11 & 16) != 0 ? new Bundle() : bundle);
    }
}
