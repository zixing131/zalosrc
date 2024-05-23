package com.zing.zalo.p077ui.zviews;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import fn0.AbstractC19074t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import org.json.JSONObject;
import pj0.AbstractC24788n;
import pj0.InterfaceC24785k;

/* loaded from: classes6.dex */
public final class MiniAppZinstantLayout extends ZaloZinstantLayout {

    /* renamed from: g0 */
    private InterfaceC14613a f75149g0;

    /* renamed from: h0 */
    private int f75150h0;

    /* renamed from: i0 */
    private int f75151i0;

    /* renamed from: j0 */
    private String f75152j0;

    /* renamed from: k0 */
    private C17244x0 f75153k0;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14613a {
        /* renamed from: L0 */
        void mo81778L0(String str, String str2);

        /* renamed from: M0 */
        void mo81779M0();

        /* renamed from: N0 */
        void mo81780N0();

        /* renamed from: O0 */
        void mo81781O0();

        /* renamed from: c */
        void mo81782c(Exception exc);
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantLayout$b */
    /* loaded from: classes6.dex */
    public static final class C14614b extends AbstractC23803b {
        C14614b() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            InterfaceC14613a interfaceC14613a;
            if (str3 != null && str3.length() != 0 && (interfaceC14613a = MiniAppZinstantLayout.this.f75149g0) != null) {
                interfaceC14613a.mo81778L0(str3, str4);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantLayout$c */
    /* loaded from: classes6.dex */
    public static final class C14615c extends AbstractC24788n {
        C14615c() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            InterfaceC14613a interfaceC14613a;
            if (str != null && str.length() != 0 && (interfaceC14613a = MiniAppZinstantLayout.this.f75149g0) != null) {
                interfaceC14613a.mo81778L0(str, str2);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantLayout$d */
    /* loaded from: classes6.dex */
    public static final class C14616d extends C20588k {
        C14616d() {
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: b */
        public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
            AbstractC19074t.m100208f(abstractC20601x, "request");
            AbstractC19074t.m100208f(exc, "exception");
            super.mo61858b(abstractC20601x, exc);
            InterfaceC14613a interfaceC14613a = MiniAppZinstantLayout.this.f75149g0;
            if (interfaceC14613a != null) {
                interfaceC14613a.mo81782c(exc);
            }
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: d */
        public void mo61860d(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            AbstractC19074t.m100208f(abstractC20601x, "request");
            AbstractC19074t.m100208f(interfaceC20578a0, "zinstantResult");
            InterfaceC14613a interfaceC14613a = MiniAppZinstantLayout.this.f75149g0;
            if (interfaceC14613a != null) {
                interfaceC14613a.mo81779M0();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantLayout$e */
    /* loaded from: classes6.dex */
    public static final class C14617e extends C17170o {
        C14617e() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return MiniAppZinstantLayout.this.f75152j0;
        }
    }

    public MiniAppZinstantLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81773f1();
        m81774g1();
    }

    /* renamed from: f1 */
    private final void m81773f1() {
        setOnZinstantClickListener(new C14614b());
        setExternalScriptListener(new C14615c());
        setZinstantViewRequestListener(new C14616d());
    }

    /* renamed from: g1 */
    private final void m81774g1() {
        setContextProvider(new C14617e());
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m81775i1(MiniAppZinstantLayout miniAppZinstantLayout, JSONObject jSONObject, int i11, String str, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        miniAppZinstantLayout.m81777h1(jSONObject, i11, str);
    }

    /* renamed from: j1 */
    public static final void m81776j1(MiniAppZinstantLayout miniAppZinstantLayout, String str, int i11, JSONObject jSONObject) {
        C17244x0 c17244x0;
        InterfaceC22508f m92064b;
        AbstractC19074t.m100208f(miniAppZinstantLayout, "this$0");
        AbstractC19074t.m100208f(jSONObject, "$jsonObject");
        miniAppZinstantLayout.f75152j0 = str;
        try {
            c17244x0 = new C17244x0(i11, jSONObject);
        } catch (Exception unused) {
            c17244x0 = null;
        }
        miniAppZinstantLayout.f75153k0 = c17244x0;
        if (c17244x0 != null && (m92064b = c17244x0.m92064b()) != null) {
            if (miniAppZinstantLayout.m91989T()) {
                miniAppZinstantLayout.onStop();
            }
            miniAppZinstantLayout.m91447b1(m92064b, null);
            miniAppZinstantLayout.m91446Z0(null);
            return;
        }
        InterfaceC14613a interfaceC14613a = miniAppZinstantLayout.f75149g0;
        if (interfaceC14613a != null) {
            interfaceC14613a.mo81782c(new ZinstantException(-5, "Can not get ZinstantData from json"));
        }
    }

    public final C17244x0 getZinstantAPIInfo() {
        return this.f75153k0;
    }

    /* renamed from: h1 */
    public final void m81777h1(JSONObject jSONObject, int i11, String str) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.xx

            /* renamed from: q */
            public final /* synthetic */ String f82674q;

            /* renamed from: r */
            public final /* synthetic */ int f82675r;

            /* renamed from: s */
            public final /* synthetic */ JSONObject f82676s;

            public /* synthetic */ RunnableC16355xx(String str2, int i112, JSONObject jSONObject2) {
                r2 = str2;
                r3 = i112;
                r4 = jSONObject2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniAppZinstantLayout.m81776j1(MiniAppZinstantLayout.this, r2, r3, r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.ZaloZinstantLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        InterfaceC14613a interfaceC14613a;
        boolean z11 = false;
        if (configuration != null && (this.f75150h0 != configuration.screenLayout || this.f75151i0 != configuration.orientation)) {
            z11 = true;
        }
        super.onConfigurationChanged(configuration);
        if (z11 && (interfaceC14613a = this.f75149g0) != null) {
            interfaceC14613a.mo81781O0();
        }
    }

    public final void setExternalData(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = jSONObject.getJSONObject("externaldata");
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null && jSONObject2.has("action") && jSONObject2.has("data")) {
            m91999q0(jSONObject2.getString("action"), jSONObject2.getString("data"));
        }
    }

    public final void setZinstantAPIInfo(C17244x0 c17244x0) {
        this.f75153k0 = c17244x0;
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantRootLayout, com.zing.zalo.zinstant.view.ZinstantLayout
    public void setZinstantRootView(C23855s0 c23855s0) {
        super.setZinstantRootView(c23855s0);
        InterfaceC14613a interfaceC14613a = this.f75149g0;
        if (interfaceC14613a != null) {
            interfaceC14613a.mo81780N0();
        }
    }

    public final void setupData(InterfaceC14613a interfaceC14613a) {
        this.f75149g0 = interfaceC14613a;
    }

    public MiniAppZinstantLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m81773f1();
        m81774g1();
    }
}
