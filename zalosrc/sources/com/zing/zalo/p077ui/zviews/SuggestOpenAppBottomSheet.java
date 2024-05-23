package com.zing.zalo.p077ui.zviews;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.zviews.BTSSuggestOpenApp;
import com.zing.zalo.p077ui.zviews.SuggestOpenAppBottomSheet;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import lk0.InterfaceC22508f;
import mm0.AbstractC23350e;
import nj0.AbstractC23803b;
import org.json.JSONObject;
import p361nb.C23648e;
import p405ov.C24561c;
import p454qn.AbstractC25384a;
import p542ub.InterfaceC27218a;
import p649xl.C29757d1;
import pj0.InterfaceC24775a;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class SuggestOpenAppBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private C29757d1 f78214b1;

    /* renamed from: c1 */
    private C15836l1 f78215c1;

    /* renamed from: e1 */
    private boolean f78217e1;

    /* renamed from: d1 */
    private String f78216d1 = "";

    /* renamed from: f1 */
    private final C17170o f78218f1 = new C15159a();

    /* renamed from: g1 */
    private final C15160b f78219g1 = new C15160b();

    /* renamed from: h1 */
    private final C15161c f78220h1 = new C15161c();

    /* renamed from: com.zing.zalo.ui.zviews.SuggestOpenAppBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C15159a extends C17170o {
        C15159a() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            C29757d1 c29757d1 = SuggestOpenAppBottomSheet.this.f78214b1;
            if (c29757d1 == null) {
                AbstractC19074t.m100223u("binding");
                c29757d1 = null;
            }
            return c29757d1.getRoot().getWidth();
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestOpenAppBottomSheet$b */
    /* loaded from: classes6.dex */
    public static final class C15160b extends AbstractC23803b {
        C15160b() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            String str6;
            if (AbstractC19074t.m100204b(str3, "open_app") || AbstractC19074t.m100204b(str3, "open_in_zalo")) {
                SuggestOpenAppBottomSheet.this.f78216d1 = str3;
                if (AbstractC19074t.m100204b(str3, "open_app")) {
                    SuggestOpenAppBottomSheet.this.m84976RL(0);
                }
                SuggestOpenAppBottomSheet.this.close();
                JSONObject m131571b = AbstractC25384a.m131571b(str4);
                if (m131571b != null) {
                    str6 = m131571b.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                } else {
                    str6 = null;
                }
                String str7 = str6;
                ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
                InterfaceC27218a m92692wK = SuggestOpenAppBottomSheet.this.m92692wK();
                AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                ZaloWebView.C15403a.m87157l(c15403a, m92692wK, null, str7, 2, null);
                return;
            }
            SuggestOpenAppBottomSheet.this.close();
            SuggestOpenAppBottomSheet.this.m84974PL(str3, str4);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SuggestOpenAppBottomSheet$c */
    /* loaded from: classes6.dex */
    public static final class C15161c implements InterfaceC24775a {
        C15161c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m84979d(SuggestOpenAppBottomSheet suggestOpenAppBottomSheet) {
            AbstractC19074t.m100208f(suggestOpenAppBottomSheet, "this$0");
            C29757d1 c29757d1 = null;
            if (!suggestOpenAppBottomSheet.m84977NL()) {
                C29757d1 c29757d12 = suggestOpenAppBottomSheet.f78214b1;
                if (c29757d12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29757d12 = null;
                }
                c29757d12.f137471r.m91999q0("js.action.oa_suggestion", "{\"reset\": true}");
            }
            C29757d1 c29757d13 = suggestOpenAppBottomSheet.f78214b1;
            if (c29757d13 == null) {
                AbstractC19074t.m100223u("binding");
                c29757d13 = null;
            }
            c29757d13.f137470q.setState(MultiStateView.EnumC15914e.CONTENT);
            C29757d1 c29757d14 = suggestOpenAppBottomSheet.f78214b1;
            if (c29757d14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29757d1 = c29757d14;
            }
            c29757d1.f137471r.onStart();
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            C24561c.m127942b("BTSSuggestOpenApp", "initZinstantLayout success");
            SuggestOpenAppBottomSheet.this.m84976RL(1);
            final SuggestOpenAppBottomSheet suggestOpenAppBottomSheet = SuggestOpenAppBottomSheet.this;
            suggestOpenAppBottomSheet.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.kq0
                @Override // java.lang.Runnable
                public final void run() {
                    SuggestOpenAppBottomSheet.C15161c.m84979d(SuggestOpenAppBottomSheet.this);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            int i11;
            if (exc instanceof ZinstantException) {
                i11 = ((ZinstantException) exc).m91676a();
            } else {
                i11 = -1;
            }
            C24561c.m127942b("BTSSuggestOpenApp", "initZinstantLayout errorCode=" + i11);
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92692wK = SuggestOpenAppBottomSheet.this.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C15836l1 c15836l1 = SuggestOpenAppBottomSheet.this.f78215c1;
            if (c15836l1 == null) {
                AbstractC19074t.m100223u("viewArgs");
                c15836l1 = null;
            }
            ZaloWebView.C15403a.m87157l(c15403a, m92692wK, null, c15836l1.m87332c(), 2, null);
        }
    }

    /* renamed from: OL */
    private final void m84973OL(InterfaceC22508f interfaceC22508f) {
        C29757d1 c29757d1 = this.f78214b1;
        if (c29757d1 == null) {
            AbstractC19074t.m100223u("binding");
            c29757d1 = null;
        }
        ZaloZinstantLayout zaloZinstantLayout = c29757d1.f137471r;
        zaloZinstantLayout.m91447b1(interfaceC22508f, null);
        zaloZinstantLayout.setOnZinstantClickListener(this.f78219g1);
        zaloZinstantLayout.m91445Y0(this.f78218f1, this.f78220h1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public final void m84974PL(String str, String str2) {
        InterfaceC27218a m92676n2 = m92676n2();
        C29757d1 c29757d1 = this.f78214b1;
        if (c29757d1 == null) {
            AbstractC19074t.m100223u("binding");
            c29757d1 = null;
        }
        AbstractC28207v1.m141989h3(str, 2, m92676n2, this, str2, c29757d1.f137471r.m91448V0(str, str2, null), null, null, null);
    }

    /* renamed from: QL */
    private final void m84975QL() {
        int i11;
        BTSSuggestOpenApp.C14083a c14083a = BTSSuggestOpenApp.Companion;
        C15836l1 c15836l1 = this.f78215c1;
        C15836l1 c15836l12 = null;
        if (c15836l1 == null) {
            AbstractC19074t.m100223u("viewArgs");
            c15836l1 = null;
        }
        JSONObject m78271c = c14083a.m78271c(c15836l1.m87330a());
        if (m78271c != null) {
            i11 = m78271c.optInt("showedCount");
        } else {
            i11 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showedTime", System.currentTimeMillis());
        jSONObject.put("action", this.f78216d1);
        jSONObject.put("showedCount", i11 + 1);
        JSONObject m131571b = AbstractC25384a.m131571b(AbstractC0924m0.m3862h6());
        if (m131571b == null) {
            m131571b = new JSONObject();
        }
        C15836l1 c15836l13 = this.f78215c1;
        if (c15836l13 == null) {
            AbstractC19074t.m100223u("viewArgs");
        } else {
            c15836l12 = c15836l13;
        }
        m131571b.put(c15836l12.m87330a(), jSONObject);
        AbstractC0924m0.m3293No(m131571b.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public final void m84976RL(int i11) {
        int i12;
        BTSSuggestOpenApp.C14083a c14083a = BTSSuggestOpenApp.Companion;
        C15836l1 c15836l1 = this.f78215c1;
        C15836l1 c15836l12 = null;
        if (c15836l1 == null) {
            AbstractC19074t.m100223u("viewArgs");
            c15836l1 = null;
        }
        JSONObject m78271c = c14083a.m78271c(c15836l1.m87330a());
        if (m78271c != null) {
            i12 = m78271c.optInt("showedCount");
        } else {
            i12 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        C15836l1 c15836l13 = this.f78215c1;
        if (c15836l13 == null) {
            AbstractC19074t.m100223u("viewArgs");
            c15836l13 = null;
        }
        jSONObject.put("app_id", c15836l13.m87330a());
        jSONObject.put("show_count", i12 + 1);
        C15836l1 c15836l14 = this.f78215c1;
        if (c15836l14 == null) {
            AbstractC19074t.m100223u("viewArgs");
        } else {
            c15836l12 = c15836l14;
        }
        jSONObject.put("source", c15836l12.m87331b());
        C0815e1.m2075D().m2100V(new C23648e(67, "", i11, "open_app_suggest_dialogue", "", jSONObject.toString()), false);
    }

    /* renamed from: NL */
    public final boolean m84977NL() {
        return this.f78217e1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C29757d1 c29757d1 = this.f78214b1;
        if (c29757d1 == null) {
            AbstractC19074t.m100223u("binding");
            c29757d1 = null;
        }
        c29757d1.f137471r.onStop();
        this.f78217e1 = true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C15836l1 c15836l1 = null;
        try {
            C15836l1 m87334a = C15836l1.Companion.m87334a(m92642L3());
            this.f78215c1 = m87334a;
            if (m87334a == null) {
                AbstractC19074t.m100223u("viewArgs");
                m87334a = null;
            }
            InterfaceC22508f m92064b = new C17244x0(55, AbstractC25384a.m131571b(m87334a.m87333d())).m92064b();
            if (m92064b != null) {
                AbstractC19074t.m100205c(m92064b);
                m84973OL(m92064b);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("BTSSuggestOpenApp", e11);
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92692wK = m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C15836l1 c15836l12 = this.f78215c1;
            if (c15836l12 == null) {
                AbstractC19074t.m100223u("viewArgs");
            } else {
                c15836l1 = c15836l12;
            }
            ZaloWebView.C15403a.m87157l(c15403a, m92692wK, null, c15836l1.m87332c(), 2, null);
            close();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        super.finish();
        m84975QL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29757d1 m147835c = C29757d1.m147835c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147835c, "inflate(...)");
        this.f78214b1 = m147835c;
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90527vL(0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C29757d1 c29757d1 = this.f78214b1;
        if (c29757d1 == null) {
            AbstractC19074t.m100223u("binding");
            c29757d1 = null;
        }
        c29757d1.f137471r.onStart();
    }
}
