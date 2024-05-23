package com.zing.zalo.feed.components;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import au.C2343e;
import bo.C2971f1;
import bo.C3030r0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.custom.C11851b;
import com.zing.zalo.p077ui.widget.C13647i0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20820s0;
import l80.C22126c0;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23999j;
import p471r3.C25630b;
import p588vw.C28652r;
import th.AbstractC26683d;
import vg.AbstractC28245z3;

/* loaded from: classes4.dex */
public class FeedItemCommentBarModulesView extends ModulesView {

    /* renamed from: T */
    private static final int f44350T = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left);

    /* renamed from: U */
    private static final int f44351U = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);

    /* renamed from: V */
    private static final int f44352V = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom);

    /* renamed from: W */
    private static final int f44353W = AbstractC23136l9.m118736p(AbstractC16802y.quick_comment_sticker_preview_timeline_size);

    /* renamed from: a0 */
    private static final int f44354a0 = AbstractC23136l9.m118736p(AbstractC16802y.quick_comment_sticker_preview_timeline_padding_top);

    /* renamed from: K */
    protected C16719g f44355K;

    /* renamed from: L */
    protected C11851b f44356L;

    /* renamed from: M */
    protected C22126c0 f44357M;

    /* renamed from: N */
    protected C22126c0 f44358N;

    /* renamed from: O */
    protected C16719g f44359O;

    /* renamed from: P */
    protected C13647i0 f44360P;

    /* renamed from: Q */
    protected C23528a f44361Q;

    /* renamed from: R */
    protected int f44362R;

    /* renamed from: S */
    C3030r0 f44363S;

    public FeedItemCommentBarModulesView(Context context) {
        super(context);
        this.f44363S = null;
    }

    /* renamed from: a0 */
    public /* synthetic */ void m43723a0(InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        C3030r0 c3030r0;
        if (interfaceC2259a != null && (c3030r0 = this.f44363S) != null) {
            interfaceC2259a.mo11969ta(c3030r0.f12209g);
        }
    }

    /* renamed from: b0 */
    public /* synthetic */ void m43724b0() {
        int i11;
        C16719g c16719g = this.f44359O;
        C3030r0 c3030r0 = this.f44363S;
        if (c3030r0 != null && c3030r0.f12215m) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
    }

    /* renamed from: c0 */
    public /* synthetic */ void m43725c0() {
        AbstractC20789d.m108478l(this.f44363S);
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.e1
            public /* synthetic */ RunnableC8262e1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FeedItemCommentBarModulesView.this.m43724b0();
            }
        });
    }

    /* renamed from: Y */
    public void m43726Y(Context context, int i11) {
        try {
            this.f44361Q = new C23528a(context);
            this.f44362R = i11;
            this.f44355K = new C16719g(context);
            this.f44356L = new C11851b(context);
            this.f44358N = new C22126c0(context);
            this.f44357M = new C22126c0(context);
            this.f44359O = new C16719g(context);
            this.f44360P = new C13647i0(context);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            int i12 = f44352V;
            setPadding(0, 0, 0, i12);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
            if (i11 != 11) {
                i12 = f44350T;
            }
            this.f44355K.m89106L().m89060k0(-1).m89030N(1).m89034R(i12).m89035S(i12);
            this.f44355K.mo44614b1(8);
            this.f44355K.m89085A0(C23212s8.m119609q(context, AbstractC16781w.ItemSeparatorColor));
            C16718f m89030N = this.f44356L.m89106L().m89060k0(AbstractC23136l9.m118655I(AbstractC16802y.avt_XSa)).m89030N(AbstractC23136l9.m118655I(AbstractC16802y.avt_XSa));
            int i13 = f44350T;
            m89030N.m89034R(i13).m89035S(i13).m89036T(i13).m89023G(this.f44355K);
            this.f44356L.m111929z1(3);
            this.f44356L.m65874Z1(AbstractC23136l9.m118641B(context, AbstractC16801x.cLine1), 255);
            this.f44356L.m65873Y1(1);
            this.f44359O.m89106L().m89060k0(AbstractC23136l9.m118742r(8.0f)).m89030N(AbstractC23136l9.m118742r(8.0f)).m89067t(this.f44356L).m89019C(this.f44356L);
            this.f44359O.mo44614b1(8);
            this.f44359O.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_feed_detail_online));
            C16718f m89030N2 = this.f44357M.m89106L().m89060k0(-2).m89030N(-2);
            int i14 = f44351U;
            m89030N2.m89035S(i14).m89036T(i13).m89023G(this.f44355K).m89054h0(this.f44356L);
            this.f44357M.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f44357M.m111982x1(false);
            this.f44357M.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f44357M.m111957E1(true);
            C22126c0 c22126c0 = this.f44357M;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            this.f44357M.mo111965M1(1);
            this.f44358N.m89106L().m89060k0(-2).m89030N(-2).m89035S(i14).m89023G(this.f44357M).m89054h0(this.f44356L);
            this.f44358N.m111953A1(2);
            this.f44358N.m111980v1(truncateAt);
            this.f44358N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f44358N.mo111964L1(AbstractC23136l9.m118742r(15.0f));
            this.f44360P.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f44358N).m89054h0(this.f44356L).m89035S(i14);
            this.f44360P.mo44614b1(8);
            mo69681L(this.f44355K);
            mo69681L(this.f44356L);
            mo69681L(this.f44359O);
            mo69681L(this.f44357M);
            mo69681L(this.f44358N);
            mo69681L(this.f44360P);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: d0 */
    public void m43727d0(C3030r0 c3030r0, int i11, boolean z11, InterfaceC2259a interfaceC2259a) {
        int i12;
        try {
            this.f44363S = c3030r0;
            if (c3030r0 != null && this.f44362R != 4) {
                C8244c1 c8244c1 = new C16719g.c() { // from class: com.zing.zalo.feed.components.c1

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC2259a f45266q;

                    public /* synthetic */ C8244c1(InterfaceC2259a interfaceC2259a2) {
                        r2 = interfaceC2259a2;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        FeedItemCommentBarModulesView.this.m43723a0(r2, c16719g);
                    }
                };
                int i13 = 0;
                this.f44356L.mo44614b1(0);
                this.f44356L.mo89109M0(c8244c1);
                this.f44356L.mo111926w1(AbstractC16803z.default_avatar);
                C3030r0 c3030r02 = this.f44363S;
                String m114542i = AbstractC21935u.m114542i(this.f44363S.f12209g, AbstractC20826v0.m108761H(c3030r02.f12209g, c3030r02.f12205c));
                if (!TextUtils.isEmpty(this.f44363S.f12206d)) {
                    if (C23302b.f113247a.m120523d(this.f44363S.f12206d) && !CoreUtility.f89233i.equals(this.f44363S.f12209g)) {
                        int m12307a = C2343e.m12307a(this.f44363S.f12209g, false);
                        this.f44356L.mo111925v1(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), m12307a));
                    } else if (!z11 || C23999j.m125696L2(this.f44363S.f12206d, C23278z2.m120143n())) {
                        this.f44356L.m115376H1(this.f44361Q, this.f44363S.f12206d, C23278z2.m120143n(), 10);
                    }
                }
                this.f44357M.mo44614b1(0);
                this.f44357M.m111959G1(m114542i);
                this.f44357M.mo89109M0(c8244c1);
                CharSequence m143353D = C28652r.m143349v().m143353D(this.f44363S.f12207e);
                this.f44358N.m111959G1(m143353D);
                C22126c0 c22126c0 = this.f44358N;
                if (c22126c0 != null) {
                    AbstractC20814p0.m108678x(c22126c0.m111973m1(), this.f44358N);
                }
                C22126c0 c22126c02 = this.f44358N;
                if (TextUtils.isEmpty(m143353D)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                c22126c02.mo44614b1(i12);
                if (this.f44363S.f12211i == 1) {
                    C25630b c25630b = new C25630b();
                    c25630b.m132405O(this.f44363S.f12212j);
                    c25630b.m132404N(this.f44363S.f12213k);
                    c25630b.m132414X(this.f44363S.f12213k);
                    c25630b.m132424d0(this.f44363S.f12214l);
                    C2971f1 c2971f1 = new C2971f1();
                    c2971f1.m14059f(c25630b);
                    c2971f1.m14058e(z11);
                    c2971f1.m14060g("TIMELINE_QUICK_COMMENT_PREVIEW");
                    c2971f1.m14061h(this.f44363S.f12210h);
                    C13647i0 c13647i0 = this.f44360P;
                    int i14 = f44353W;
                    c13647i0.m76266Z1(i14, i14);
                    this.f44360P.mo44614b1(0);
                    C20820s0.m108741o(this.f44360P, c2971f1, this.f44361Q);
                } else {
                    this.f44360P.m76264X1();
                    this.f44360P.mo44614b1(8);
                }
                C16719g c16719g = this.f44359O;
                if (!this.f44363S.f12215m) {
                    i13 = 8;
                }
                c16719g.mo44614b1(i13);
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.feed.components.d1
                    public /* synthetic */ RunnableC8253d1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedItemCommentBarModulesView.this.m43725c0();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C22126c0 c22126c0;
        super.onDetachedFromWindow();
        if (AbstractC26683d.f126393l && (c22126c0 = this.f44358N) != null) {
            AbstractC28245z3.m142218a(c22126c0.m111973m1(), this.f44358N);
        }
        C13647i0 c13647i0 = this.f44360P;
        if (c13647i0 != null) {
            c13647i0.m76265Y1();
        }
    }
}
