package com.zing.zalo.p077ui.moduleview.group;

import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.moduleview.group.ContentFirstPanelModuleView;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import hd0.C20005c;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p692ys.C31070a;
import p716zh.C32020m7;
import rs.C25976a;

/* loaded from: classes6.dex */
public class ContentFirstPanelModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C22126c0 f64737K;

    /* renamed from: L */
    C16716d f64738L;

    /* renamed from: M */
    C12416a[] f64739M;

    /* renamed from: N */
    C16719g f64740N;

    /* renamed from: O */
    C23528a f64741O;

    /* renamed from: P */
    C25976a.a f64742P;

    /* renamed from: com.zing.zalo.ui.moduleview.group.ContentFirstPanelModuleView$a */
    /* loaded from: classes6.dex */
    public class C12416a extends C16716d {

        /* renamed from: M0 */
        C21693c f64743M0;

        /* renamed from: N0 */
        C22126c0 f64744N0;

        /* renamed from: O0 */
        C3977j f64745O0;

        C12416a(Context context) {
            super(context);
            this.f64745O0 = new C3977j(context);
            C21693c c21693c = new C21693c(context);
            this.f64743M0 = c21693c;
            c21693c.mo111926w1(AbstractC16803z.default_avatar);
            this.f64743M0.m89106L().m89028L(-1, 0).m89022F(1.0f).m89026J(true).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89036T(AbstractC23136l9.m118742r(6.0f));
            C22126c0 c22126c0 = new C22126c0(context);
            this.f64744N0 = c22126c0;
            c22126c0.mo111965M1(0);
            this.f64744N0.m111953A1(1);
            this.f64744N0.m115422R1();
            this.f64744N0.mo111964L1(AbstractC23136l9.m118742r(12.0f));
            this.f64744N0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f64744N0.m111980v1(TextUtils.TruncateAt.END);
            this.f64744N0.m89106L().m89023G(this.f64743M0).m89034R(AbstractC23136l9.m118742r(6.0f)).m89035S(AbstractC23136l9.m118742r(6.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89026J(true).m89028L(-2, -2);
            m89001g1(this.f64743M0);
            m89001g1(this.f64744N0);
            m89087B0(AbstractC16803z.stencils_contact_bg);
        }

        /* renamed from: o1 */
        public void m69747o1(C31070a c31070a, boolean z11) {
            this.f64744N0.m111959G1(c31070a.f143230c);
            AbstractC23268y2.m120033g(ContentFirstPanelModuleView.this.f64741O, this.f64745O0, this.f64743M0, c31070a.f143241n, C23278z2.m120087O0(), z11);
        }
    }

    public ContentFirstPanelModuleView(Context context, C25976a.a aVar, C23528a c23528a) {
        super(context);
        this.f64739M = new C12416a[4];
        m88987U(-1, -2);
        this.f64742P = aVar;
        this.f64741O = c23528a;
        setId(AbstractC6918a0.cel_contact_tab_popular_feature);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64737K = c22126c0;
        c22126c0.mo111965M1(1);
        this.f64737K.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64737K.m111958F1(AbstractC8020f0.str_group_tab_top_features);
        this.f64737K.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f64737K.m89106L().m89073z(Boolean.TRUE).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89036T(AbstractC23136l9.m118742r(6.0f)).m89028L(-2, -2);
        C16716d c16716d = new C16716d(context);
        this.f64738L = c16716d;
        c16716d.m89106L().m89023G(this.f64737K).m89028L(-1, -2);
        C20005c[] c20005cArr = new C20005c[5];
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            c20005cArr[i12] = new C20005c().m103822e(i12 / 4.0f);
        }
        while (i11 < 4) {
            this.f64739M[i11] = new C12416a(context);
            int i13 = i11 + 1;
            this.f64739M[i11].m89106L().m89028L(-1, -2).m89058j0(c20005cArr[i11]).m89052g0(c20005cArr[i13]);
            this.f64738L.m89001g1(this.f64739M[i11]);
            i11 = i13;
        }
        C16719g c16719g = new C16719g(context);
        this.f64740N = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        this.f64740N.m89106L().m89028L(-1, AbstractC23136l9.m118742r(8.0f)).m89023G(this.f64738L).m89036T(AbstractC23136l9.m118742r(6.0f));
        mo69681L(this.f64737K);
        mo69681L(this.f64738L);
        mo69681L(this.f64740N);
    }

    /* renamed from: W */
    public /* synthetic */ void m69746W(C31070a c31070a, C16719g c16719g) {
        C25976a.a aVar = this.f64742P;
        if (aVar != null) {
            aVar.mo67809Va(c31070a, c31070a.f143235h, c31070a.f143234g, new TrackingSource((short) 2));
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f64739M.length; i14++) {
            if (i14 < c32020m7.f147417h.size()) {
                this.f64739M[i14].mo44614b1(0);
                C31070a c31070a = (C31070a) c32020m7.f147417h.get(i14);
                this.f64739M[i14].mo89109M0(new C16719g.c() { // from class: i80.a

                    /* renamed from: q */
                    public final /* synthetic */ C31070a f100594q;

                    public /* synthetic */ C20426a(C31070a c31070a2) {
                        r2 = c31070a2;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        ContentFirstPanelModuleView.this.m69746W(r2, c16719g);
                    }
                });
                this.f64739M[i14].m69747o1(c31070a2, z11);
            } else {
                this.f64739M[i14].mo89109M0(null);
                this.f64739M[i14].mo44614b1(4);
            }
        }
        C22126c0 c22126c0 = this.f64737K;
        if (c32020m7.f147416g) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        c22126c0.mo44614b1(i12);
        C16719g c16719g = this.f64740N;
        if (!c32020m7.f147415f) {
            i13 = 8;
        }
        c16719g.mo44614b1(i13);
    }
}
