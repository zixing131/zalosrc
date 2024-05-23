package com.zing.zalo.qrcode.p069ui.sheet;

import ac.C0708i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.custom.C11874v;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.qrcode.p069ui.sheet.LinkSheet;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.EnumC17017m;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import id0.C20518d;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mj0.AbstractC23322a;
import n80.C23622b;
import n80.C23623c;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class LinkSheet extends ResultSheet {

    /* renamed from: b1 */
    private C23622b f49142b1;

    /* renamed from: c1 */
    private C23623c f49143c1;

    /* renamed from: d1 */
    private final InterfaceC24854k f49144d1;

    /* renamed from: com.zing.zalo.qrcode.ui.sheet.LinkSheet$a */
    /* loaded from: classes4.dex */
    public static final class C9263a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C11874v f49145l1;

        /* renamed from: m1 */
        final /* synthetic */ LinkSheet f49146m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f49147n1;

        C9263a(C11874v c11874v, LinkSheet linkSheet, boolean z11) {
            this.f49145l1 = c11874v;
            this.f49146m1 = linkSheet;
            this.f49147n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (AbstractC19074t.m100204b(this.f49145l1.m89133b0(), str) && c3979l != null) {
                    this.f49146m1.m49562PL().setImageInfo(c3979l, false);
                    this.f49145l1.mo111924u1(c3979l.m18839c());
                    if (!this.f49147n1) {
                        this.f49145l1.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.sheet.LinkSheet$b */
    /* loaded from: classes4.dex */
    static final class C9264b extends AbstractC19075u implements InterfaceC18494a {
        C9264b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3977j mo12V4() {
            Context m92689tK = LinkSheet.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            return new C3977j(m92689tK);
        }
    }

    public LinkSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C9264b());
        this.f49144d1 = m129210a;
    }

    /* renamed from: OL */
    private final void m49561OL(C11874v c11874v, String str) {
        if (str.length() > 0) {
            Context context = c11874v.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c11874v.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_link_line_32, AbstractC2807a.icon_02));
            boolean m125696L2 = C23999j.m125696L2(str, C23278z2.m120126f0());
            c11874v.m89129Y0(str);
            c11874v.m89106L().m89041Y(AbstractC23136l9.m118712h(m92689tK(), 1.0f));
            ((C23528a) new C23528a(m92689tK()).m123612r(m49562PL())).m123579C(str, C23278z2.m120126f0(), new C9263a(c11874v, this, m125696L2));
            return;
        }
        c11874v.m89106L().m89041Y(AbstractC23136l9.m118742r(16.0f));
        Context context2 = c11874v.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        c11874v.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_link_line_32, AbstractC2807a.icon_02));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public final C3977j m49562PL() {
        return (C3977j) this.f49144d1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QL */
    public static final void m49563QL(C16716d c16716d, C1421e c1421e) {
        AbstractC19074t.m100208f(c16716d, "$groupModule");
        AbstractC19074t.m100208f(c1421e, "it");
        c16716d.m89106L().m89042Z(c1421e.f6230a, 0, c1421e.f6232c, c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public static final void m49564RL(LinkSheet linkSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        String str;
        AbstractC19074t.m100208f(linkSheet, "this$0");
        InterfaceC1801w m92650VI = linkSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            Bundle m92642L3 = linkSheet.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("name")) == null) {
                str = "";
            }
            interfaceC26029r.mo49336w6(linkSheet, str, "primary-button");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SL */
    public static final void m49565SL(LinkSheet linkSheet, C16719g c16719g) {
        InterfaceC26029r interfaceC26029r;
        String str;
        AbstractC19074t.m100208f(linkSheet, "this$0");
        InterfaceC1801w m92650VI = linkSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            Bundle m92642L3 = linkSheet.m92642L3();
            if (m92642L3 == null || (str = m92642L3.getString("name")) == null) {
                str = "";
            }
            interfaceC26029r.mo49336w6(linkSheet, str, "more-button");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:            if (r7 != null) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:            if (r8 != null) goto L46;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        int i11;
        String str;
        String str2;
        Bundle m92642L3;
        String string;
        boolean z11;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        final C16716d c16716d = new C16716d(linearLayout.getContext());
        c16716d.m89106L().m89028L(-1, -2);
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.d
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                LinkSheet.m49563QL(C16716d.this, c1421e);
            }
        });
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("source-scan");
        } else {
            i11 = 0;
        }
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C23622b c23622b = new C23622b(context);
        c23622b.setIdTracking("scan_qr_result_link_preview");
        C0708i c0708i = new C0708i();
        c0708i.m1072c("src_scan", i11);
        c23622b.setTrackingExtraData(c0708i);
        C22126c0 m123837o1 = c23622b.m123837o1();
        Bundle m92642L33 = m92642L3();
        String str3 = null;
        if (m92642L33 != null && (str = m92642L33.getString("body-title")) != null) {
            AbstractC19074t.m100205c(str);
            if (str.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!Boolean.valueOf(z11).booleanValue()) {
                str = null;
            }
        }
        str = "-";
        m123837o1.m111959G1(str);
        Bundle m92642L34 = m92642L3();
        if (m92642L34 != null && (str2 = m92642L34.getString("body-subtitle")) != null) {
            AbstractC19074t.m100205c(str2);
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                c23622b.m123838p1().mo44614b1(0);
                c23622b.m123838p1().m111959G1(str2);
                if (str2 == null) {
                    c23622b.m123838p1().mo44614b1(8);
                }
                C11874v m123839q1 = c23622b.m123839q1();
                m92642L3 = m92642L3();
                if (m92642L3 != null && (string = m92642L3.getString("body-thumb")) != null) {
                    AbstractC19074t.m100205c(string);
                    if (string.length() > 0) {
                        str3 = string;
                    }
                }
                str3 = "";
                AbstractC19074t.m100205c(str3);
                m49561OL(m123839q1, str3);
                c16716d.m89001g1(c23622b);
                this.f49142b1 = c23622b;
                Context context2 = linearLayout.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                C23623c c23623c = new C23623c(context2);
                c23623c.m123841p1().setIdTracking("scan_qr_result_link_open");
                C17023o m123841p1 = c23623c.m123841p1();
                C0708i c0708i2 = new C0708i();
                c0708i2.m1072c("src_scan", i11);
                m123841p1.setTrackingExtraData(c0708i2);
                c23623c.m123841p1().m91111q1(AbstractC23322a.zds_ic_globe_line_24);
                c23623c.m123841p1().m91114u1(AbstractC8020f0.str_open_link);
                c23623c.m123841p1().mo89109M0(new C16719g.c() { // from class: ry.e
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        LinkSheet.m49564RL(LinkSheet.this, c16719g);
                    }
                });
                c23623c.m123840o1().mo89109M0(new C16719g.c() { // from class: ry.f
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        LinkSheet.m49565SL(LinkSheet.this, c16719g);
                    }
                });
                c23623c.m89106L().m89023G(this.f49142b1);
                c16716d.m89001g1(c23623c);
                this.f49143c1 = c23623c;
                Context context3 = linearLayout.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                linearLayout.addView(new DecorModuleView(context3, c16716d), -1, -2);
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        C11874v m123839q12 = c23622b.m123839q1();
        m92642L3 = m92642L3();
        if (m92642L3 != null) {
            AbstractC19074t.m100205c(string);
            if (string.length() > 0) {
            }
        }
        str3 = "";
        AbstractC19074t.m100205c(str3);
        m49561OL(m123839q12, str3);
        c16716d.m89001g1(c23622b);
        this.f49142b1 = c23622b;
        Context context22 = linearLayout.getContext();
        AbstractC19074t.m100207e(context22, "getContext(...)");
        C23623c c23623c2 = new C23623c(context22);
        c23623c2.m123841p1().setIdTracking("scan_qr_result_link_open");
        C17023o m123841p12 = c23623c2.m123841p1();
        C0708i c0708i22 = new C0708i();
        c0708i22.m1072c("src_scan", i11);
        m123841p12.setTrackingExtraData(c0708i22);
        c23623c2.m123841p1().m91111q1(AbstractC23322a.zds_ic_globe_line_24);
        c23623c2.m123841p1().m91114u1(AbstractC8020f0.str_open_link);
        c23623c2.m123841p1().mo89109M0(new C16719g.c() { // from class: ry.e
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                LinkSheet.m49564RL(LinkSheet.this, c16719g);
            }
        });
        c23623c2.m123840o1().mo89109M0(new C16719g.c() { // from class: ry.f
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                LinkSheet.m49565SL(LinkSheet.this, c16719g);
            }
        });
        c23623c2.m89106L().m89023G(this.f49142b1);
        c16716d.m89001g1(c23623c2);
        this.f49143c1 = c23623c2;
        Context context32 = linearLayout.getContext();
        AbstractC19074t.m100207e(context32, "getContext(...)");
        linearLayout.addView(new DecorModuleView(context32, c16716d), -1, -2);
    }
}
