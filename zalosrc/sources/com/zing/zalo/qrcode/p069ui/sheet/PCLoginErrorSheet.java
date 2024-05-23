package com.zing.zalo.qrcode.p069ui.sheet;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.qrcode.p069ui.sheet.PCLoginErrorSheet;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24341v;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;

/* loaded from: classes4.dex */
public final class PCLoginErrorSheet extends ModalBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m49574uM(C16716d c16716d, C1421e c1421e) {
        AbstractC19074t.m100208f(c16716d, "$groupModule");
        AbstractC19074t.m100208f(c1421e, "it");
        c16716d.m89106L().m89042Z(c1421e.f6230a, 0, c1421e.f6232c, c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m49575vM(PCLoginErrorSheet pCLoginErrorSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        AbstractC19074t.m100208f(pCLoginErrorSheet, "this$0");
        InterfaceC1801w m92650VI = pCLoginErrorSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            interfaceC26029r.mo49336w6(pCLoginErrorSheet, "sheet-pc-login-error", "primary-button");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:            if (r6 == null) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:            if (r13 == null) goto L33;     */
    @Override // com.zing.zalo.p077ui.zviews.ModalBottomSheet
    /* renamed from: nM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo49571nM(BottomSheet bottomSheet, LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        String string;
        String str;
        String string2;
        C22126c0 c22126c0;
        C22126c0 c22126c02;
        int i11;
        C16719g c16719g;
        boolean m127128x;
        CharSequence charSequence;
        boolean m127128x2;
        AbstractC19074t.m100208f(bottomSheet, "sheet");
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        bottomSheet.m90533zL(EnumC17017m.HUG_CONTENT);
        int m118712h = AbstractC23136l9.m118712h(linearLayout.getContext(), 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(linearLayout.getContext(), 8.0f);
        int m118712h3 = AbstractC23136l9.m118712h(linearLayout.getContext(), 16.0f);
        int m119607o = C23212s8.m119607o(linearLayout.getContext(), AbstractC2807a.text_01);
        final C16716d c16716d = new C16716d(linearLayout.getContext());
        c16716d.m89106L().m89028L(-1, -2);
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        linearLayout.addView(new DecorModuleView(context, c16716d), -1, -2);
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.i
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                PCLoginErrorSheet.m49574uM(C16716d.this, c1421e);
            }
        });
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (string = m92642L3.getString("body-title")) != null) {
            m127128x2 = AbstractC24341v.m127128x(string);
            if (m127128x2) {
                string = null;
            }
        }
        string = m92651WI().getString(AbstractC8020f0.qrcode_notice);
        AbstractC19074t.m100205c(string);
        Bundle m92642L32 = m92642L3();
        CharSequence charSequence2 = "";
        if (m92642L32 == null || (str = m92642L32.getString("body-subtitle")) == null) {
            str = "";
        }
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null && (charSequence = m92642L33.getCharSequence("body-sub-subtitle")) != null) {
            charSequence2 = charSequence;
        }
        Bundle m92642L34 = m92642L3();
        if (m92642L34 != null && (string2 = m92642L34.getString("primary-button")) != null) {
            m127128x = AbstractC24341v.m127128x(string2);
            if (m127128x) {
                string2 = null;
            }
        }
        string2 = m92651WI().getString(AbstractC8020f0.str_try_again_button);
        AbstractC19074t.m100205c(string2);
        C22126c0 c22126c03 = new C22126c0(linearLayout.getContext());
        c22126c03.m111959G1(string);
        c22126c03.m111962J1(m119607o);
        c22126c03.mo111964L1(AbstractC23136l9.m118712h(c22126c03.getContext(), 20.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c22126c03.m111961I1(alignment);
        c22126c03.mo111965M1(1);
        c22126c03.m111953A1(1);
        c22126c03.m111980v1(TextUtils.TruncateAt.END);
        c22126c03.m89106L().m89028L(-1, -2).m89042Z(m118712h3, AbstractC23136l9.m118712h(c22126c03.getContext(), 12.0f), m118712h3, m118712h2);
        c16716d.m89001g1(c22126c03);
        if (str.length() > 0) {
            c22126c0 = new C22126c0(linearLayout.getContext());
            c22126c0.m111959G1(str);
            c22126c0.m111962J1(m119607o);
            c22126c0.mo111964L1(AbstractC23136l9.m118712h(c22126c0.getContext(), 15.0f));
            c22126c0.m111961I1(alignment);
            c22126c0.m89106L().m89028L(-1, -2).m89042Z(m118712h3, m118712h2, m118712h3, m118712h2).m89023G(c22126c03);
            c16716d.m89001g1(c22126c0);
        } else {
            c22126c0 = null;
        }
        if (str.length() > 0) {
            c22126c02 = new C22126c0(linearLayout.getContext());
            c22126c02.m111959G1(charSequence2);
            c22126c02.m111962J1(m119607o);
            if (charSequence2.length() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c22126c02.mo44614b1(i11);
            c22126c02.mo111964L1(AbstractC23136l9.m118712h(c22126c02.getContext(), 15.0f));
            c22126c02.m111961I1(alignment);
            C16718f m89028L = c22126c02.m89106L().m89028L(-1, -2);
            if (c22126c0 == null) {
                m118712h = m118712h2;
            }
            C16718f m89042Z = m89028L.m89042Z(m118712h3, m118712h, m118712h3, m118712h2);
            if (c22126c0 == null) {
                c16719g = c22126c03;
            } else {
                c16719g = c22126c0;
            }
            m89042Z.m89023G(c16719g);
            c16716d.m89001g1(c22126c02);
        } else {
            c22126c02 = null;
        }
        C16716d c16716d2 = new C16716d(linearLayout.getContext());
        C16718f m89042Z2 = c16716d2.m89106L().m89028L(-1, -2).m89042Z(m118712h3, m118712h3, m118712h3, AbstractC23136l9.m118712h(c16716d2.getContext(), 40.0f));
        if (c22126c02 == null) {
            if (c22126c0 != null) {
                c22126c03 = c22126c0;
            }
        } else {
            c22126c03 = c22126c02;
        }
        m89042Z2.m89023G(c22126c03);
        c16716d.m89001g1(c16716d2);
        Context context2 = linearLayout.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C17023o c17023o = new C17023o(context2, AbstractC2814h.ButtonMedium_Primary);
        c17023o.m91115v1(string2);
        c17023o.m89106L().m89028L(-1, -2);
        c16716d2.m89001g1(c17023o);
        c17023o.mo89109M0(new C16719g.c() { // from class: ry.j
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                PCLoginErrorSheet.m49575vM(PCLoginErrorSheet.this, c16719g2);
            }
        });
    }
}
