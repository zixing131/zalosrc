package com.zing.zalo.qrcode.p069ui.sheet;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.qrcode.p069ui.sheet.JoinWifiSheet;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import n80.C23621a;
import n80.C23624d;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;

/* loaded from: classes4.dex */
public final class JoinWifiSheet extends ResultSheet {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m49554NL(C16716d c16716d, C1421e c1421e) {
        AbstractC19074t.m100208f(c16716d, "$groupModule");
        AbstractC19074t.m100208f(c1421e, "it");
        c16716d.m89106L().m89042Z(c1421e.f6230a, 0, c1421e.f6232c, c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m49555OL(JoinWifiSheet joinWifiSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        String str;
        AbstractC19074t.m100208f(joinWifiSheet, "this$0");
        InterfaceC1801w m92650VI = joinWifiSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            Bundle m92642L3 = joinWifiSheet.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("name")) == null) {
                str = "";
            }
            interfaceC26029r.mo49336w6(joinWifiSheet, str, "primary-button");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public static final void m49556PL(JoinWifiSheet joinWifiSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        String str;
        AbstractC19074t.m100208f(joinWifiSheet, "this$0");
        InterfaceC1801w m92650VI = joinWifiSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            Bundle m92642L3 = joinWifiSheet.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("name")) == null) {
                str = "";
            }
            interfaceC26029r.mo49336w6(joinWifiSheet, str, "secondary-button");
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        final C16716d c16716d = new C16716d(linearLayout.getContext());
        c16716d.m89106L().m89028L(-1, -2);
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.a
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                JoinWifiSheet.m49554NL(C16716d.this, c1421e);
            }
        });
        int m118712h = AbstractC23136l9.m118712h(linearLayout.getContext(), 12.0f);
        int m118712h2 = AbstractC23136l9.m118712h(linearLayout.getContext(), 16.0f);
        C22126c0 c22126c0 = new C22126c0(linearLayout.getContext());
        c22126c0.m111958F1(AbstractC8020f0.str_mini_dialog_connect_wifi_title);
        c22126c0.mo111964L1(AbstractC23136l9.m118712h(linearLayout.getContext(), 18.0f));
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(C23212s8.m119606n(AbstractC2807a.text_01));
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
        c22126c0.m89106L().m89028L(-1, -2).m89042Z(m118712h2, m118712h, m118712h2, m118712h);
        c16716d.m89001g1(c22126c0);
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C23621a c23621a = new C23621a(context);
        C21697g m123836o1 = c23621a.m123836o1();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("body", "-");
        } else {
            str = null;
        }
        m123836o1.m111959G1(str);
        c23621a.m89106L().m89028L(-1, -2).m89023G(c22126c0);
        c16716d.m89001g1(c23621a);
        Context context2 = linearLayout.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C23624d c23624d = new C23624d(context2);
        c23624d.m123842o1().setIdTracking("scan_qr_result_wifi_connect");
        c23624d.m123842o1().m91114u1(AbstractC8020f0.str_mini_dialog_connect_wifi_button);
        c23624d.m123842o1().mo89109M0(new C16719g.c() { // from class: ry.b
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                JoinWifiSheet.m49555OL(JoinWifiSheet.this, c16719g);
            }
        });
        c23624d.m123843p1().setIdTracking("scan_qr_result_wifi_cancel");
        c23624d.m123843p1().m91114u1(AbstractC8020f0.cancel);
        c23624d.m123843p1().mo89109M0(new C16719g.c() { // from class: ry.c
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                JoinWifiSheet.m49556PL(JoinWifiSheet.this, c16719g);
            }
        });
        c23624d.m89106L().m89023G(c23621a);
        c16716d.m89001g1(c23624d);
        Context context3 = linearLayout.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        linearLayout.addView(new DecorModuleView(context3, c16716d), -1, -2);
    }
}
