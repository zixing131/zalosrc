package com.zing.zalo.uicontrol.zinstant;

import android.content.Context;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.exception.ZinstantException;
import fn0.AbstractC19074t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ZinstantPreviewLayout extends ZaloZinstantLayout {

    /* renamed from: g0 */
    private InterfaceC16697a f84632g0;

    /* renamed from: h0 */
    private C17244x0 f84633h0;

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantPreviewLayout$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16697a {
        /* renamed from: M0 */
        void mo87584M0();

        /* renamed from: N0 */
        void mo87585N0();

        /* renamed from: c */
        void mo87586c(Exception exc);
    }

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantPreviewLayout$b */
    /* loaded from: classes4.dex */
    public static final class C16698b extends C20588k {
        C16698b() {
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: b */
        public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
            AbstractC19074t.m100208f(abstractC20601x, "request");
            AbstractC19074t.m100208f(exc, "exception");
            super.mo61858b(abstractC20601x, exc);
            InterfaceC16697a interfaceC16697a = ZinstantPreviewLayout.this.f84632g0;
            if (interfaceC16697a != null) {
                interfaceC16697a.mo87586c(exc);
            }
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: c */
        public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            AbstractC19074t.m100208f(abstractC20601x, "request");
            AbstractC19074t.m100208f(interfaceC20578a0, "zinstantResult");
            super.mo61859c(abstractC20601x, interfaceC20578a0);
            InterfaceC16697a interfaceC16697a = ZinstantPreviewLayout.this.f84632g0;
            if (interfaceC16697a != null) {
                interfaceC16697a.mo87585N0();
            }
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: d */
        public void mo61860d(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            AbstractC19074t.m100208f(abstractC20601x, "request");
            AbstractC19074t.m100208f(interfaceC20578a0, "zinstantResult");
            super.mo61860d(abstractC20601x, interfaceC20578a0);
            InterfaceC16697a interfaceC16697a = ZinstantPreviewLayout.this.f84632g0;
            if (interfaceC16697a != null) {
                interfaceC16697a.mo87584M0();
            }
        }
    }

    public ZinstantPreviewLayout(Context context) {
        super(context);
    }

    /* renamed from: d1 */
    public final void m88955d1(JSONObject jSONObject, int i11) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        C17244x0 c17244x0 = new C17244x0(i11, jSONObject.optJSONObject("ZInstantAPIInfo"));
        this.f84633h0 = c17244x0;
        InterfaceC22508f m92064b = c17244x0.m92064b();
        if (m92064b != null) {
            m91447b1(m92064b, null);
            setZinstantViewRequestListener(new C16698b());
            m91446Z0(null);
        } else {
            InterfaceC16697a interfaceC16697a = this.f84632g0;
            if (interfaceC16697a != null) {
                interfaceC16697a.mo87586c(new ZinstantException(-5, "Can not get ZinstantData from json"));
            }
        }
    }

    public final C17244x0 getZinstantAPIInfo() {
        return this.f84633h0;
    }

    public final void setupData(InterfaceC16697a interfaceC16697a) {
        this.f84632g0 = interfaceC16697a;
    }
}
