package com.zing.zalo.p077ui.toolstorage.detail.moduleviews;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17067v;
import com.zing.zalo.zdesign.component.EnumC17071x;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import k30.C21459a;
import kd0.C21692b;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;
import vg.AbstractC28236y3;

/* loaded from: classes6.dex */
public final class ToolStorageTabAllItemModuleView extends ToolStorageItemBaseModuleView {

    /* renamed from: O */
    private C21693c f68669O;

    /* renamed from: P */
    private C22122a0 f68670P;

    /* renamed from: Q */
    private C22126c0 f68671Q;

    /* renamed from: R */
    private C22126c0 f68672R;

    /* renamed from: S */
    private C16716d f68673S;

    /* renamed from: T */
    private C22126c0 f68674T;

    /* renamed from: U */
    private C17067v f68675U;

    /* renamed from: V */
    private C16716d f68676V;

    /* renamed from: W */
    private C21692b f68677W;

    /* renamed from: a0 */
    private final int f68678a0;

    /* renamed from: b0 */
    private final int f68679b0;

    public ToolStorageTabAllItemModuleView(Context context) {
        super(context);
        int screenWidth = (getScreenWidth() - (AbstractC23222t7.f112552c * 3)) / 3;
        this.f68678a0 = screenWidth;
        this.f68679b0 = screenWidth;
        m88987U(-1, screenWidth);
        m75201v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m75195t0(ToolStorageTabAllItemModuleView toolStorageTabAllItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageTabAllItemModuleView, "this$0");
        toolStorageTabAllItemModuleView.mo75159n0(!c13380a.m75073C(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m75196u0(ToolStorageTabAllItemModuleView toolStorageTabAllItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageTabAllItemModuleView, "this$0");
        toolStorageTabAllItemModuleView.mo75159n0(!c13380a.m75073C(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m75197w0(ToolStorageTabAllItemModuleView toolStorageTabAllItemModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageTabAllItemModuleView, "this$0");
        ToolStorageItemBaseModuleView.InterfaceC13386a mListener = toolStorageTabAllItemModuleView.getMListener();
        if (mListener != null) {
            mListener.mo75144b(toolStorageTabAllItemModuleView.getStorageUsageDetailItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m75198x0(ToolStorageTabAllItemModuleView toolStorageTabAllItemModuleView, C16719g c16719g) {
        boolean z11;
        AbstractC19074t.m100208f(toolStorageTabAllItemModuleView, "this$0");
        C13380a storageUsageDetailItem = toolStorageTabAllItemModuleView.getStorageUsageDetailItem();
        if (storageUsageDetailItem != null) {
            z11 = storageUsageDetailItem.m75073C();
        } else {
            z11 = false;
        }
        toolStorageTabAllItemModuleView.mo75159n0(!z11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m75199y0(boolean z11, ToolStorageTabAllItemModuleView toolStorageTabAllItemModuleView) {
        AbstractC19074t.m100208f(toolStorageTabAllItemModuleView, "this$0");
        C21693c c21693c = null;
        if (z11) {
            C21692b c21692b = toolStorageTabAllItemModuleView.f68677W;
            if (c21692b == null) {
                AbstractC19074t.m100223u("mCircleProgressModule");
                c21692b = null;
            }
            c21692b.mo44614b1(0);
            C21693c c21693c2 = toolStorageTabAllItemModuleView.f68669O;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mImageFileType");
            } else {
                c21693c = c21693c2;
            }
            c21693c.mo44614b1(4);
            return;
        }
        C21692b c21692b2 = toolStorageTabAllItemModuleView.f68677W;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c21692b2.mo44614b1(8);
        C21693c c21693c3 = toolStorageTabAllItemModuleView.f68669O;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mImageFileType");
        } else {
            c21693c = c21693c3;
        }
        c21693c.mo44614b1(0);
    }

    /* renamed from: z0 */
    private final String m75200z0(String str) {
        try {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76613c();
            c13704p1.setTextSize(AbstractC23222t7.f112574n);
            c13704p1.setColor(C23212s8.m119606n(AbstractC2807a.text_02));
            return AbstractC19646n0.m102924Q0(str, c13704p1, this.f68678a0 - (AbstractC23222t7.f112566j * 2), 2, 4).toString();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return str;
        }
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: d0 */
    public void mo75157d0(final C13380a c13380a) {
        if (c13380a == null) {
            return;
        }
        if (c13380a.m75089k() == null && c13380a.m75082d() == null) {
            return;
        }
        super.mo75157d0(c13380a);
        C16716d c16716d = this.f68673S;
        C16716d c16716d2 = null;
        if (c16716d == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d = null;
        }
        c16716d.mo44614b1(0);
        C22126c0 c22126c0 = this.f68671Q;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c0 = null;
        }
        c22126c0.m111959G1(C21459a.m111038f(c13380a.m75087i(), 0, 2, null));
        if (c13380a.m75100v()) {
            C22126c0 c22126c02 = this.f68674T;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mTextViewMediaTime");
                c22126c02 = null;
            }
            c22126c02.mo44614b1(8);
            C21693c c21693c = this.f68669O;
            if (c21693c == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c = null;
            }
            c21693c.mo111926w1(AbstractC28236y3.m142203n(c13380a.m75085g()));
            C22126c0 c22126c03 = this.f68672R;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
                c22126c03 = null;
            }
            c22126c03.m111959G1(m75200z0(c13380a.m75086h()));
            C16716d c16716d3 = this.f68673S;
            if (c16716d3 == null) {
                AbstractC19074t.m100223u("mContentLayout");
            } else {
                c16716d2 = c16716d3;
            }
            c16716d2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.q
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ToolStorageTabAllItemModuleView.m75195t0(ToolStorageTabAllItemModuleView.this, c13380a, c16719g);
                }
            });
            return;
        }
        if (c13380a.m75076F()) {
            C22126c0 c22126c04 = this.f68674T;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTextViewMediaTime");
                c22126c04 = null;
            }
            c22126c04.mo44614b1(0);
            C21693c c21693c2 = this.f68669O;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c2 = null;
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c21693c2.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_mic_line_24, AbstractC2807a.icon_02));
            C22126c0 c22126c05 = this.f68672R;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
                c22126c05 = null;
            }
            c22126c05.m111959G1(getContext().getString(AbstractC8020f0.share_voice));
            C22126c0 c22126c06 = this.f68674T;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mTextViewMediaTime");
                c22126c06 = null;
            }
            c22126c06.m111959G1(c13380a.m75092n());
            C16716d c16716d4 = this.f68673S;
            if (c16716d4 == null) {
                AbstractC19074t.m100223u("mContentLayout");
            } else {
                c16716d2 = c16716d4;
            }
            c16716d2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.r
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ToolStorageTabAllItemModuleView.m75196u0(ToolStorageTabAllItemModuleView.this, c13380a, c16719g);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: m0 */
    public void mo75158m0(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.s
            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageTabAllItemModuleView.m75199y0(z11, this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: n0 */
    public void mo75159n0(boolean z11, boolean z12) {
        C17067v c17067v = null;
        if (!z12) {
            C17067v c17067v2 = this.f68675U;
            if (c17067v2 == null) {
                AbstractC19074t.m100223u("mCheckBox");
                c17067v2 = null;
            }
            c17067v2.mo89107L0(null);
        }
        C17067v c17067v3 = this.f68675U;
        if (c17067v3 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17067v3 = null;
        }
        c17067v3.m91350r1(z11, false);
        C17067v c17067v4 = this.f68675U;
        if (c17067v4 == null) {
            AbstractC19074t.m100223u("mCheckBox");
        } else {
            c17067v = c17067v4;
        }
        c17067v.mo89107L0(getCbCheckedChangedListener());
    }

    /* renamed from: v0 */
    public final void m75201v0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(this.f68678a0, this.f68679b0).m89025I(true);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.o
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ToolStorageTabAllItemModuleView.m75197w0(ToolStorageTabAllItemModuleView.this, c16719g);
            }
        });
        this.f68673S = c16716d;
        C21693c c21693c = new C21693c(getContext());
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112526H;
        C16718f m89036T = m89106L.m89028L(i11, i11).m89034R(AbstractC23222t7.f112572m).m89036T(AbstractC23222t7.f112572m);
        Boolean bool = Boolean.TRUE;
        m89036T.m89073z(bool).m89018B(bool);
        c21693c.m111929z1(6);
        this.f68669O = c21693c;
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89072y(bool).m89073z(bool).m89034R(AbstractC23222t7.f112572m).m89033Q(AbstractC23222t7.f112566j);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall_m));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f68671Q = c22126c0;
        C22126c0 c22126c02 = new C22126c0(getContext());
        C16718f m89028L = c22126c02.m89106L().m89028L(-2, -2);
        C22126c0 c22126c03 = this.f68671Q;
        C16716d c16716d2 = null;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c03 = null;
        }
        m89028L.m89066s(c22126c03).m89034R(AbstractC23222t7.f112572m).m89035S(AbstractC23222t7.f112580q).m89033Q(AbstractC23222t7.f112552c);
        c22126c02.m111953A1(2);
        c22126c02.m111980v1(TextUtils.TruncateAt.END);
        Context context2 = c22126c02.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c02).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_xxxsmall));
        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC2807a.text_02));
        this.f68672R = c22126c02;
        C22126c0 c22126c04 = new C22126c0(getContext());
        C16718f m89028L2 = c22126c04.m89106L().m89028L(-2, -2);
        C22126c0 c22126c05 = this.f68671Q;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c05 = null;
        }
        m89028L2.m89070w(c22126c05).m89017A(bool).m89035S(AbstractC23222t7.f112566j).m89046b0(AbstractC23222t7.f112556e).m89047c0(AbstractC23222t7.f112556e);
        Context context3 = c22126c04.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c04).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_xxsmall));
        c22126c04.m111962J1(AbstractC23136l9.m118639A(AbstractC16801x.white));
        c22126c04.m89087B0(AbstractC16803z.bg_video_duration);
        this.f68674T = c22126c04;
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.m89106L().m89028L(-1, -1).m89041Y(1);
        c22122a0.m115384R1(true);
        c22122a0.m115388V1(AbstractC23136l9.m118639A(C23212s8.m119610r(AbstractC16781w.ItemSeparatorColor)));
        c22122a0.m115389W1(1);
        this.f68670P = c22122a0;
        C21692b c21692b = new C21692b(getContext());
        C16718f m89106L2 = c21692b.m89106L();
        int i12 = AbstractC23222t7.f112526H;
        m89106L2.m89028L(i12, i12).m89034R(AbstractC23222t7.f112572m).m89036T(AbstractC23222t7.f112572m).m89073z(bool).m89018B(bool);
        c21692b.mo44614b1(8);
        this.f68677W = c21692b;
        C16716d c16716d3 = this.f68673S;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d3 = null;
        }
        C21693c c21693c2 = this.f68669O;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mImageFileType");
            c21693c2 = null;
        }
        c16716d3.m89001g1(c21693c2);
        C16716d c16716d4 = this.f68673S;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d4 = null;
        }
        C22126c0 c22126c06 = this.f68671Q;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c06 = null;
        }
        c16716d4.m89001g1(c22126c06);
        C16716d c16716d5 = this.f68673S;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d5 = null;
        }
        C22126c0 c22126c07 = this.f68672R;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mTextViewFileName");
            c22126c07 = null;
        }
        c16716d5.m89001g1(c22126c07);
        C16716d c16716d6 = this.f68673S;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d6 = null;
        }
        C22126c0 c22126c08 = this.f68674T;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("mTextViewMediaTime");
            c22126c08 = null;
        }
        c16716d6.m89001g1(c22126c08);
        C16716d c16716d7 = this.f68673S;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d7 = null;
        }
        C22122a0 c22122a02 = this.f68670P;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mDefaultThumb");
            c22122a02 = null;
        }
        c16716d7.m89001g1(c22122a02);
        C16716d c16716d8 = this.f68673S;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d8 = null;
        }
        C21692b c21692b2 = this.f68677W;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c16716d8.m89001g1(c21692b2);
        C16716d c16716d9 = this.f68673S;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d9 = null;
        }
        mo69681L(c16716d9);
        int i13 = AbstractC23222t7.f112566j;
        C16716d c16716d10 = new C16716d(getContext());
        c16716d10.m89106L().m89028L(-2, -2).m89017A(bool);
        c16716d10.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.p
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ToolStorageTabAllItemModuleView.m75198x0(ToolStorageTabAllItemModuleView.this, c16719g);
            }
        });
        this.f68676V = c16716d10;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C17067v c17067v = new C17067v(context4, EnumC17071x.MEDIUM);
        c17067v.m89106L().m89031O(i13).m89017A(bool);
        c17067v.mo89093E0(false);
        c17067v.mo89107L0(getCbCheckedChangedListener());
        c17067v.m91350r1(false, false);
        this.f68675U = c17067v;
        C16716d c16716d11 = this.f68676V;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
            c16716d11 = null;
        }
        C17067v c17067v2 = this.f68675U;
        if (c17067v2 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17067v2 = null;
        }
        c16716d11.m89001g1(c17067v2);
        C16716d c16716d12 = this.f68676V;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
        } else {
            c16716d2 = c16716d12;
        }
        mo69681L(c16716d2);
    }
}
