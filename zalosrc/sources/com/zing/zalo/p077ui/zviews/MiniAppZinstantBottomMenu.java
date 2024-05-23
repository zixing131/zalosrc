package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantBottomMenu;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import org.json.JSONObject;
import p649xl.C29944n8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import rf0.C25770d;

/* loaded from: classes6.dex */
public class MiniAppZinstantBottomMenu extends MiniAppZinstantDialog {

    /* renamed from: a1 */
    private boolean f75138a1;

    /* renamed from: b1 */
    private final InterfaceC24854k f75139b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f75140c1;

    /* renamed from: d1 */
    private JSONObject f75141d1;

    /* renamed from: e1 */
    private String f75142e1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantBottomMenu$a */
    /* loaded from: classes6.dex */
    public static final class C14609a extends AbstractC19075u implements InterfaceC18494a {
        C14609a() {
            super(0);
        }

        /* renamed from: c */
        public static final void m81761c(MiniAppZinstantBottomMenu miniAppZinstantBottomMenu, List list) {
            AbstractC19074t.m100208f(miniAppZinstantBottomMenu, "this$0");
            AbstractC19074t.m100208f(list, "it");
            miniAppZinstantBottomMenu.m81758WM(list);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final InterfaceC1764d0 mo12V4() {
            return new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.wx
                public /* synthetic */ C16318wx() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    MiniAppZinstantBottomMenu.C14609a.m81761c(MiniAppZinstantBottomMenu.this, (List) obj);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantBottomMenu$b */
    /* loaded from: classes6.dex */
    public static final class C14610b extends AbstractC19075u implements InterfaceC18494a {
        C14610b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25770d mo12V4() {
            C25770d c25770d = (C25770d) new C1802w0(MiniAppZinstantBottomMenu.this, new C1802w0.c()).m9378a(C25770d.class);
            C1761c0 m132906Q = c25770d.m132906Q();
            MiniAppZinstantBottomMenu miniAppZinstantBottomMenu = MiniAppZinstantBottomMenu.this;
            m132906Q.m9219j(miniAppZinstantBottomMenu, miniAppZinstantBottomMenu.m81756UM());
            return c25770d;
        }
    }

    public MiniAppZinstantBottomMenu() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C14609a());
        this.f75139b1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C14610b());
        this.f75140c1 = m129210a2;
    }

    /* renamed from: UM */
    public final InterfaceC1764d0 m81756UM() {
        return (InterfaceC1764d0) this.f75139b1.getValue();
    }

    /* renamed from: VM */
    private final C25770d m81757VM() {
        return (C25770d) this.f75140c1.getValue();
    }

    /* renamed from: WM */
    public final void m81758WM(List list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "js.action.mp.menu.receiver");
        jSONObject.put("data", list.toString());
        JSONObject jSONObject2 = new JSONObject();
        this.f75141d1 = jSONObject2;
        jSONObject2.put("externaldata", jSONObject);
        m81759XM();
    }

    /* renamed from: XM */
    private final void m81759XM() {
        MiniAppZinstantLayout miniAppZinstantLayout;
        if (this.f75138a1 && this.f75141d1 != null) {
            C29944n8 m81765QM = m81765QM();
            if (m81765QM != null && (miniAppZinstantLayout = m81765QM.f138781t) != null) {
                miniAppZinstantLayout.setExternalData(this.f75141d1);
            }
            this.f75141d1 = null;
            super.mo81422yo(this.f75142e1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m81757VM().m132906Q().mo9222o(m81756UM());
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantDialog, com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        RelativeRoundedLayout relativeRoundedLayout;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C29944n8 m81765QM = m81765QM();
        if (m81765QM != null && (relativeRoundedLayout = m81765QM.f138779r) != null) {
            relativeRoundedLayout.setPadding(relativeRoundedLayout.getPaddingLeft(), relativeRoundedLayout.getPaddingTop(), relativeRoundedLayout.getPaddingRight(), 0);
        }
        m81757VM().m132907R();
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, zf0.InterfaceC31826c
    /* renamed from: yo */
    public void mo81422yo(String str) {
        this.f75142e1 = str;
        this.f75138a1 = true;
        m81759XM();
    }
}
