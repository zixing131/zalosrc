package com.zing.zalo.qrcode.p069ui.sheet;

import ac.C0708i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.qrcode.p069ui.sheet.PhoneNumberSheet;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.C16979g1;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import kd0.C21697g;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import n80.C23623c;
import n80.C23625e;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;

/* loaded from: classes4.dex */
public final class PhoneNumberSheet extends ResultSheet {

    /* renamed from: b1 */
    private C23625e f49149b1;

    /* renamed from: c1 */
    private C23623c f49150c1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m49579NL(C16716d c16716d, C1421e c1421e) {
        AbstractC19074t.m100208f(c16716d, "$groupModule");
        AbstractC19074t.m100208f(c1421e, "it");
        c16716d.m89106L().m89042Z(c1421e.f6230a, 0, c1421e.f6232c, c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m49580OL(PhoneNumberSheet phoneNumberSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        String str;
        AbstractC19074t.m100208f(phoneNumberSheet, "this$0");
        InterfaceC1801w m92650VI = phoneNumberSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            Bundle m92642L3 = phoneNumberSheet.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("name")) == null) {
                str = "";
            }
            interfaceC26029r.mo49336w6(phoneNumberSheet, str, "primary-button");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public static final void m49581PL(PhoneNumberSheet phoneNumberSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        String str;
        AbstractC19074t.m100208f(phoneNumberSheet, "this$0");
        InterfaceC1801w m92650VI = phoneNumberSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            Bundle m92642L3 = phoneNumberSheet.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("name")) == null) {
                str = "";
            }
            interfaceC26029r.mo49336w6(phoneNumberSheet, str, "more-button");
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        int i11;
        String str;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        final C16716d c16716d = new C16716d(linearLayout.getContext());
        c16716d.m89106L().m89028L(-1, -2);
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.k
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                PhoneNumberSheet.m49579NL(C16716d.this, c1421e);
            }
        });
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("source-scan");
        } else {
            i11 = 0;
        }
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C23625e c23625e = new C23625e(context);
        c23625e.m123844o1().setIdTracking("scan_qr_result_phone_preview");
        C16979g1 m123844o1 = c23625e.m123844o1();
        C0708i c0708i = new C0708i();
        c0708i.m1072c("src_scan", i11);
        m123844o1.setTrackingExtraData(c0708i);
        c23625e.m123845p1().m111958F1(AbstractC8020f0.str_scan_qr_code_phone_number);
        C21697g m123846q1 = c23625e.m123846q1();
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            str = m92642L32.getString("body-title", "-");
        } else {
            str = null;
        }
        m123846q1.m111959G1(str);
        c23625e.m123846q1().mo111964L1(AbstractC23136l9.m118712h(c23625e.getContext(), 22.0f));
        c23625e.m123846q1().mo111965M1(1);
        c23625e.m123846q1().m111953A1(1);
        c16716d.m89001g1(c23625e);
        this.f49149b1 = c23625e;
        Context context2 = linearLayout.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C23623c c23623c = new C23623c(context2);
        c23623c.m123841p1().setIdTracking("scan_qr_result_phone_call");
        C17023o m123841p1 = c23623c.m123841p1();
        C0708i c0708i2 = new C0708i();
        c0708i2.m1072c("src_scan", i11);
        m123841p1.setTrackingExtraData(c0708i2);
        c23623c.m123841p1().m91111q1(AbstractC23322a.zds_ic_call_solid_24);
        c23623c.m123841p1().m91114u1(AbstractC8020f0.str_call);
        c23623c.m123841p1().mo89109M0(new C16719g.c() { // from class: ry.l
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                PhoneNumberSheet.m49580OL(PhoneNumberSheet.this, c16719g);
            }
        });
        c23623c.m123840o1().mo89109M0(new C16719g.c() { // from class: ry.m
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                PhoneNumberSheet.m49581PL(PhoneNumberSheet.this, c16719g);
            }
        });
        c23623c.m89106L().m89023G(this.f49149b1);
        c16716d.m89001g1(c23623c);
        this.f49150c1 = c23623c;
        Context context3 = linearLayout.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        linearLayout.addView(new DecorModuleView(context3, c16716d), -1, -2);
    }
}
