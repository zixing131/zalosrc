package com.zing.zalo.p077ui.toolstorage.detail.moduleviews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.C17073y;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import k30.C21459a;
import kd0.C21692b;
import ki0.C21733a;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p241ij.C20568e;
import p348mi.AbstractC23304d;
import pm0.C24848g0;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;
import wa0.C28900z;

/* loaded from: classes6.dex */
public final class ToolStorageVoiceItemModuleView extends ToolStorageItemBaseModuleView {

    /* renamed from: O */
    private C22122a0 f68680O;

    /* renamed from: P */
    private C22126c0 f68681P;

    /* renamed from: Q */
    private C22126c0 f68682Q;

    /* renamed from: R */
    private C17023o f68683R;

    /* renamed from: S */
    private C16719g f68684S;

    /* renamed from: T */
    private C16716d f68685T;

    /* renamed from: U */
    private C16716d f68686U;

    /* renamed from: V */
    private C28900z f68687V;

    /* renamed from: W */
    private C17073y f68688W;

    /* renamed from: a0 */
    private C16716d f68689a0;

    /* renamed from: b0 */
    private C21692b f68690b0;

    /* renamed from: c0 */
    private C16716d f68691c0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.moduleviews.ToolStorageVoiceItemModuleView$a */
    /* loaded from: classes6.dex */
    public static final class C13389a extends AbstractC19075u implements InterfaceC18505l {
        C13389a() {
            super(1);
        }

        /* renamed from: a */
        public final void m75216a(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "it");
            ToolStorageVoiceItemModuleView.this.m75203B0(c13380a);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75216a((C13380a) obj);
            return C24848g0.f119245a;
        }
    }

    public ToolStorageVoiceItemModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        m75215w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m75202A0(boolean z11, ToolStorageVoiceItemModuleView toolStorageVoiceItemModuleView) {
        AbstractC19074t.m100208f(toolStorageVoiceItemModuleView, "this$0");
        C22122a0 c22122a0 = null;
        if (z11) {
            C21692b c21692b = toolStorageVoiceItemModuleView.f68690b0;
            if (c21692b == null) {
                AbstractC19074t.m100223u("mCircleProgressModule");
                c21692b = null;
            }
            c21692b.mo44614b1(0);
            C22122a0 c22122a02 = toolStorageVoiceItemModuleView.f68680O;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("mImageModule");
            } else {
                c22122a0 = c22122a02;
            }
            c22122a0.mo44614b1(4);
            toolStorageVoiceItemModuleView.setHeaderVoiceDrawable(false);
            return;
        }
        C21692b c21692b2 = toolStorageVoiceItemModuleView.f68690b0;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c21692b2.mo44614b1(8);
        C22122a0 c22122a03 = toolStorageVoiceItemModuleView.f68680O;
        if (c22122a03 == null) {
            AbstractC19074t.m100223u("mImageModule");
        } else {
            c22122a0 = c22122a03;
        }
        c22122a0.mo44614b1(0);
        toolStorageVoiceItemModuleView.setHeaderVoiceDrawable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m75203B0(C13380a c13380a) {
        if (c13380a == null) {
            return;
        }
        ArrayList arrayList = AbstractC23304d.f113413n;
        if (arrayList.size() > 0) {
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b(c13380a.m75090l(), ((C20568e) it.next()).m107018b())) {
                    ToolStorageItemBaseModuleView.InterfaceC13386a mListener = getMListener();
                    if (mListener != null) {
                        mListener.mo75145c(c13380a);
                        return;
                    }
                    return;
                }
            }
        }
        boolean z11 = !c13380a.m75072B();
        c13380a.m75078H(z11);
        C17023o c17023o = this.f68683R;
        if (c17023o == null) {
            AbstractC19074t.m100223u("mPlayButton");
            c17023o = null;
        }
        c17023o.m91112r1(m75214z0(z11));
        setHeaderVoiceDrawable(z11);
        ToolStorageItemBaseModuleView.InterfaceC13386a mListener2 = getMListener();
        if (mListener2 != null) {
            mListener2.mo75146d(c13380a);
        }
    }

    private final void setHeaderVoiceDrawable(boolean z11) {
        C28900z c28900z = null;
        if (z11) {
            C28900z c28900z2 = this.f68687V;
            if (c28900z2 == null) {
                AbstractC19074t.m100223u("voiceAnim");
                c28900z2 = null;
            }
            c28900z2.mo44614b1(0);
            C22122a0 c22122a0 = this.f68680O;
            if (c22122a0 == null) {
                AbstractC19074t.m100223u("mImageModule");
                c22122a0 = null;
            }
            c22122a0.mo44614b1(4);
            C28900z c28900z3 = this.f68687V;
            if (c28900z3 == null) {
                AbstractC19074t.m100223u("voiceAnim");
            } else {
                c28900z = c28900z3;
            }
            c28900z.m144356g1();
            return;
        }
        C28900z c28900z4 = this.f68687V;
        if (c28900z4 == null) {
            AbstractC19074t.m100223u("voiceAnim");
            c28900z4 = null;
        }
        c28900z4.mo44614b1(4);
        C22122a0 c22122a02 = this.f68680O;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mImageModule");
            c22122a02 = null;
        }
        c22122a02.mo44614b1(0);
        C28900z c28900z5 = this.f68687V;
        if (c28900z5 == null) {
            AbstractC19074t.m100223u("voiceAnim");
        } else {
            c28900z = c28900z5;
        }
        c28900z.m144357h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m75210u0(ToolStorageVoiceItemModuleView toolStorageVoiceItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageVoiceItemModuleView, "this$0");
        toolStorageVoiceItemModuleView.mo75159n0(!c13380a.m75073C(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m75211v0(ToolStorageVoiceItemModuleView toolStorageVoiceItemModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageVoiceItemModuleView, "this$0");
        toolStorageVoiceItemModuleView.m75175f0(new C13389a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m75212x0(ToolStorageVoiceItemModuleView toolStorageVoiceItemModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageVoiceItemModuleView, "this$0");
        ToolStorageItemBaseModuleView.InterfaceC13386a mListener = toolStorageVoiceItemModuleView.getMListener();
        if (mListener != null) {
            mListener.mo75144b(toolStorageVoiceItemModuleView.getStorageUsageDetailItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m75213y0(ToolStorageVoiceItemModuleView toolStorageVoiceItemModuleView, C16719g c16719g) {
        boolean z11;
        AbstractC19074t.m100208f(toolStorageVoiceItemModuleView, "this$0");
        C13380a storageUsageDetailItem = toolStorageVoiceItemModuleView.getStorageUsageDetailItem();
        if (storageUsageDetailItem != null) {
            z11 = storageUsageDetailItem.m75073C();
        } else {
            z11 = false;
        }
        toolStorageVoiceItemModuleView.mo75159n0(!z11, true);
    }

    /* renamed from: z0 */
    private final Drawable m75214z0(boolean z11) {
        if (z11) {
            int i11 = AbstractC23322a.zds_ic_pause_line_24;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return C27280g.m139660c(context, i11, AbstractC2807a.icon_01);
        }
        int i12 = AbstractC23322a.zds_ic_play_line_24;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        return C27280g.m139660c(context2, i12, AbstractC2807a.icon_01);
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: d0 */
    public void mo75157d0(final C13380a c13380a) {
        if (c13380a == null) {
            return;
        }
        super.mo75157d0(c13380a);
        C16716d c16716d = this.f68685T;
        C17023o c17023o = null;
        if (c16716d == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d = null;
        }
        c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.v
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ToolStorageVoiceItemModuleView.m75210u0(ToolStorageVoiceItemModuleView.this, c13380a, c16719g);
            }
        });
        C22126c0 c22126c0 = this.f68681P;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c0 = null;
        }
        int i11 = 0;
        c22126c0.m111959G1(C21459a.m111038f(c13380a.m75087i(), 0, 2, null));
        String m75092n = c13380a.m75092n();
        C22126c0 c22126c02 = this.f68682Q;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewVoiceDuration");
            c22126c02 = null;
        }
        c22126c02.m111959G1(m75092n);
        if (m75092n.length() == 0) {
            i11 = 8;
        }
        c22126c02.mo44614b1(i11);
        C17023o c17023o2 = this.f68683R;
        if (c17023o2 == null) {
            AbstractC19074t.m100223u("mPlayButton");
        } else {
            c17023o = c17023o2;
        }
        c17023o.m91112r1(m75214z0(c13380a.m75072B()));
        setHeaderVoiceDrawable(c13380a.m75072B());
        c17023o.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.w
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ToolStorageVoiceItemModuleView.m75211v0(ToolStorageVoiceItemModuleView.this, c16719g);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: m0 */
    public void mo75158m0(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.x
            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageVoiceItemModuleView.m75202A0(z11, this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: n0 */
    public void mo75159n0(boolean z11, boolean z12) {
        C17073y c17073y = null;
        if (!z12) {
            C17073y c17073y2 = this.f68688W;
            if (c17073y2 == null) {
                AbstractC19074t.m100223u("mCheckBox");
                c17073y2 = null;
            }
            c17073y2.mo89107L0(null);
        }
        C17073y c17073y3 = this.f68688W;
        if (c17073y3 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17073y3 = null;
        }
        c17073y3.m91362p1(z11, false);
        C17073y c17073y4 = this.f68688W;
        if (c17073y4 == null) {
            AbstractC19074t.m100223u("mCheckBox");
        } else {
            c17073y = c17073y4;
        }
        c17073y.mo89107L0(getCbCheckedChangedListener());
    }

    /* renamed from: w0 */
    public final void m75215w0() {
        C16716d c16716d = new C16716d(getContext());
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -1);
        int i11 = AbstractC23222t7.f112553c0;
        int i12 = AbstractC23222t7.f112586t;
        m89028L.m89042Z(i11, i12, i12, i12);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.t
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ToolStorageVoiceItemModuleView.m75212x0(ToolStorageVoiceItemModuleView.this, c16719g);
            }
        });
        this.f68685T = c16716d;
        mo69681L(c16716d);
        C16716d c16716d2 = new C16716d(getContext());
        c16716d2.m89106L().m89028L(-2, -2).m89027K(true);
        this.f68686U = c16716d2;
        C16716d c16716d3 = this.f68685T;
        C16719g c16719g = null;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d3 = null;
        }
        C16716d c16716d4 = this.f68686U;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("headerImageContainer");
            c16716d4 = null;
        }
        c16716d3.m89001g1(c16716d4);
        C22122a0 c22122a0 = new C22122a0(getContext());
        C16718f m89106L = c22122a0.m89106L();
        int i13 = AbstractC23222t7.f112514B;
        m89106L.m89028L(i13, i13).m89025I(true);
        c22122a0.m111929z1(6);
        Context context = c22122a0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c22122a0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_mic_line_24, AbstractC2807a.icon_02));
        this.f68680O = c22122a0;
        C16716d c16716d5 = this.f68686U;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("headerImageContainer");
            c16716d5 = null;
        }
        C22122a0 c22122a02 = this.f68680O;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mImageModule");
            c22122a02 = null;
        }
        c16716d5.m89001g1(c22122a02);
        C28900z c28900z = new C28900z(getContext());
        c28900z.m89106L().m89028L(AbstractC23222t7.f112514B, AbstractC23222t7.f112522F).m89025I(true);
        this.f68687V = c28900z;
        C16716d c16716d6 = this.f68686U;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("headerImageContainer");
            c16716d6 = null;
        }
        C28900z c28900z2 = this.f68687V;
        if (c28900z2 == null) {
            AbstractC19074t.m100223u("voiceAnim");
            c28900z2 = null;
        }
        c16716d6.m89001g1(c28900z2);
        C21692b c21692b = new C21692b(getContext());
        C16718f m89106L2 = c21692b.m89106L();
        int i14 = AbstractC23222t7.f112514B;
        m89106L2.m89028L(i14, i14).m89025I(true);
        c21692b.mo44614b1(8);
        this.f68690b0 = c21692b;
        C16716d c16716d7 = this.f68686U;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("headerImageContainer");
            c16716d7 = null;
        }
        C21692b c21692b2 = this.f68690b0;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c16716d7.m89001g1(c21692b2);
        C16716d c16716d8 = new C16716d(getContext());
        C16718f m89028L2 = c16716d8.m89106L().m89028L(-1, -2);
        C16716d c16716d9 = this.f68686U;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("headerImageContainer");
            c16716d9 = null;
        }
        m89028L2.m89054h0(c16716d9).m89025I(true).m89034R(AbstractC23222t7.f112596y);
        this.f68691c0 = c16716d8;
        C16716d c16716d10 = this.f68685T;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d10 = null;
        }
        C16716d c16716d11 = this.f68691c0;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d11 = null;
        }
        c16716d10.m89001g1(c16716d11);
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L3 = c22126c0.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L3.m89018B(bool);
        Context context2 = c22126c0.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_large));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f68681P = c22126c0;
        C16716d c16716d12 = this.f68691c0;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d12 = null;
        }
        C22126c0 c22126c02 = this.f68681P;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c02 = null;
        }
        c16716d12.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(getContext());
        C16718f m89028L4 = c22126c03.m89106L().m89028L(-2, -2);
        C22126c0 c22126c04 = this.f68681P;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c04 = null;
        }
        m89028L4.m89023G(c22126c04);
        c22126c03.m111953A1(2);
        c22126c03.m111980v1(TextUtils.TruncateAt.END);
        Context context3 = c22126c03.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c03).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_small));
        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC2807a.text_02));
        this.f68682Q = c22126c03;
        C16716d c16716d13 = this.f68691c0;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d13 = null;
        }
        C22126c0 c22126c05 = this.f68682Q;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mTextViewVoiceDuration");
            c22126c05 = null;
        }
        c16716d13.m89001g1(c22126c05);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C17023o c17023o = new C17023o(context4, AbstractC2814h.ButtonMedium_SecondaryNeutral);
        c17023o.m89106L().m89017A(bool).m89027K(true);
        c17023o.m91112r1(m75214z0(false));
        this.f68683R = c17023o;
        C16716d c16716d14 = this.f68685T;
        if (c16716d14 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d14 = null;
        }
        C17023o c17023o2 = this.f68683R;
        if (c17023o2 == null) {
            AbstractC19074t.m100223u("mPlayButton");
            c17023o2 = null;
        }
        c16716d14.m89001g1(c17023o2);
        C16719g c16719g2 = new C16719g(getContext());
        C16718f m89060k0 = c16719g2.m89106L().m89030N(1).m89060k0(-1);
        C16719g c16719g3 = this.f68691c0;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16719g3 = null;
        }
        m89060k0.m89071x(c16719g3).m89072y(bool);
        c16719g2.mo89161z0(C23212s8.m119607o(c16719g2.getContext(), AbstractC16781w.ItemSeparatorColor));
        this.f68684S = c16719g2;
        mo69681L(c16719g2);
        C16716d c16716d15 = new C16716d(getContext());
        c16716d15.m89106L().m89028L(-2, -2).m89027K(true).m89073z(bool).m89034R(AbstractC23222t7.f112566j);
        c16716d15.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.u
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g4) {
                ToolStorageVoiceItemModuleView.m75213y0(ToolStorageVoiceItemModuleView.this, c16719g4);
            }
        });
        this.f68689a0 = c16716d15;
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        C17073y c17073y = new C17073y(context5, C21733a.a.MEDIUM);
        c17073y.m89106L().m89041Y(AbstractC23222t7.f112566j);
        c17073y.mo89093E0(false);
        c17073y.mo89107L0(getCbCheckedChangedListener());
        c17073y.m91362p1(false, false);
        this.f68688W = c17073y;
        C16716d c16716d16 = this.f68689a0;
        if (c16716d16 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
            c16716d16 = null;
        }
        C17073y c17073y2 = this.f68688W;
        if (c17073y2 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17073y2 = null;
        }
        c16716d16.m89001g1(c17073y2);
        C16719g c16719g4 = this.f68689a0;
        if (c16719g4 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
        } else {
            c16719g = c16719g4;
        }
        mo69681L(c16719g);
    }
}
