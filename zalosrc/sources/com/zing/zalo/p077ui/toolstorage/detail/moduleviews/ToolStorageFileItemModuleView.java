package com.zing.zalo.p077ui.toolstorage.detail.moduleviews;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17073y;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import java.util.Locale;
import k30.C21459a;
import kd0.C21692b;
import kd0.C21693c;
import ki0.C21733a;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import ti0.C26705d;
import ti0.C26707f;
import vg.AbstractC28236y3;

/* loaded from: classes6.dex */
public final class ToolStorageFileItemModuleView extends ToolStorageItemBaseModuleView {

    /* renamed from: O */
    private C21693c f68632O;

    /* renamed from: P */
    private C22126c0 f68633P;

    /* renamed from: Q */
    private C22126c0 f68634Q;

    /* renamed from: R */
    private C22126c0 f68635R;

    /* renamed from: S */
    private C16719g f68636S;

    /* renamed from: T */
    private C16716d f68637T;

    /* renamed from: U */
    private C17073y f68638U;

    /* renamed from: V */
    private C16716d f68639V;

    /* renamed from: W */
    private C21692b f68640W;

    /* renamed from: a0 */
    private C16716d f68641a0;

    /* renamed from: b0 */
    private C16716d f68642b0;

    /* renamed from: c0 */
    private int f68643c0;

    public ToolStorageFileItemModuleView(Context context) {
        super(context);
        this.f68643c0 = getScreenWidth();
        m88987U(-1, -2);
        m75160t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m75152s0(ToolStorageFileItemModuleView toolStorageFileItemModuleView, C13380a c13380a, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageFileItemModuleView, "this$0");
        toolStorageFileItemModuleView.mo75159n0(!c13380a.m75073C(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m75153u0(ToolStorageFileItemModuleView toolStorageFileItemModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(toolStorageFileItemModuleView, "this$0");
        ToolStorageItemBaseModuleView.InterfaceC13386a mListener = toolStorageFileItemModuleView.getMListener();
        if (mListener != null) {
            mListener.mo75144b(toolStorageFileItemModuleView.getStorageUsageDetailItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m75154v0(ToolStorageFileItemModuleView toolStorageFileItemModuleView, C16719g c16719g) {
        boolean z11;
        AbstractC19074t.m100208f(toolStorageFileItemModuleView, "this$0");
        C13380a storageUsageDetailItem = toolStorageFileItemModuleView.getStorageUsageDetailItem();
        if (storageUsageDetailItem != null) {
            z11 = storageUsageDetailItem.m75073C();
        } else {
            z11 = false;
        }
        toolStorageFileItemModuleView.mo75159n0(!z11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m75155w0(boolean z11, ToolStorageFileItemModuleView toolStorageFileItemModuleView) {
        AbstractC19074t.m100208f(toolStorageFileItemModuleView, "this$0");
        C21693c c21693c = null;
        if (z11) {
            C21692b c21692b = toolStorageFileItemModuleView.f68640W;
            if (c21692b == null) {
                AbstractC19074t.m100223u("mCircleProgressModule");
                c21692b = null;
            }
            c21692b.mo44614b1(0);
            C21693c c21693c2 = toolStorageFileItemModuleView.f68632O;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mImageModule");
            } else {
                c21693c = c21693c2;
            }
            c21693c.mo44614b1(4);
            return;
        }
        C21692b c21692b2 = toolStorageFileItemModuleView.f68640W;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c21692b2.mo44614b1(8);
        C21693c c21693c3 = toolStorageFileItemModuleView.f68632O;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("mImageModule");
        } else {
            c21693c = c21693c3;
        }
        c21693c.mo44614b1(0);
    }

    /* renamed from: x0 */
    private final String m75156x0(String str) {
        try {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76613c();
            c13704p1.setTextSize(AbstractC23222t7.f112582r);
            c13704p1.setColor(C23212s8.m119606n(AbstractC2807a.text_02));
            return AbstractC19646n0.m102924Q0(str, c13704p1, this.f68643c0, 2, 4).toString();
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
        super.mo75157d0(c13380a);
        C16716d c16716d = this.f68637T;
        C22126c0 c22126c0 = null;
        if (c16716d == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d = null;
        }
        c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.c
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ToolStorageFileItemModuleView.m75152s0(ToolStorageFileItemModuleView.this, c13380a, c16719g);
            }
        });
        C21693c c21693c = this.f68632O;
        if (c21693c == null) {
            AbstractC19074t.m100223u("mImageModule");
            c21693c = null;
        }
        c21693c.mo111926w1(AbstractC28236y3.m142203n(c13380a.m75085g()));
        C22126c0 c22126c02 = this.f68633P;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c02 = null;
        }
        c22126c02.m111959G1(C21459a.m111038f(c13380a.m75087i(), 0, 2, null));
        String m75156x0 = m75156x0(c13380a.m75086h());
        if (m75156x0.length() == 0) {
            C22126c0 c22126c03 = this.f68634Q;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
                c22126c03 = null;
            }
            c22126c03.mo44614b1(8);
        } else {
            C22126c0 c22126c04 = this.f68634Q;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
                c22126c04 = null;
            }
            c22126c04.mo44614b1(0);
            C22126c0 c22126c05 = this.f68634Q;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
                c22126c05 = null;
            }
            c22126c05.m111959G1(m75156x0);
        }
        String upperCase = c13380a.m75085g().toUpperCase(Locale.ROOT);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        if (upperCase.length() == 0) {
            C22126c0 c22126c06 = this.f68635R;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("mTextViewFileExtension");
            } else {
                c22126c0 = c22126c06;
            }
            c22126c0.mo44614b1(8);
            return;
        }
        C22126c0 c22126c07 = this.f68635R;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mTextViewFileExtension");
            c22126c07 = null;
        }
        c22126c07.mo44614b1(0);
        C22126c0 c22126c08 = this.f68635R;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("mTextViewFileExtension");
        } else {
            c22126c0 = c22126c08;
        }
        c22126c0.m111959G1(" • " + upperCase);
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: m0 */
    public void mo75158m0(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.d
            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageFileItemModuleView.m75155w0(z11, this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView
    /* renamed from: n0 */
    public void mo75159n0(boolean z11, boolean z12) {
        C17073y c17073y = null;
        if (!z12) {
            C17073y c17073y2 = this.f68638U;
            if (c17073y2 == null) {
                AbstractC19074t.m100223u("mCheckBox");
                c17073y2 = null;
            }
            c17073y2.mo89107L0(null);
        }
        C17073y c17073y3 = this.f68638U;
        if (c17073y3 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17073y3 = null;
        }
        c17073y3.m91362p1(z11, false);
        C17073y c17073y4 = this.f68638U;
        if (c17073y4 == null) {
            AbstractC19074t.m100223u("mCheckBox");
        } else {
            c17073y = c17073y4;
        }
        c17073y.mo89107L0(getCbCheckedChangedListener());
    }

    /* renamed from: t0 */
    public final void m75160t0() {
        this.f68643c0 -= ((AbstractC23222t7.f112553c0 + AbstractC23222t7.f112534M) + AbstractC23222t7.f112514B) + AbstractC23222t7.f112586t;
        C16716d c16716d = new C16716d(getContext());
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -1);
        int i11 = AbstractC23222t7.f112553c0;
        int i12 = AbstractC23222t7.f112586t;
        m89028L.m89042Z(i11, i12, i12, i12);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.a
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                ToolStorageFileItemModuleView.m75153u0(ToolStorageFileItemModuleView.this, c16719g);
            }
        });
        this.f68637T = c16716d;
        mo69681L(c16716d);
        C16716d c16716d2 = new C16716d(getContext());
        C16718f m89106L = c16716d2.m89106L();
        int i13 = AbstractC23222t7.f112534M;
        m89106L.m89028L(i13, i13).m89027K(true);
        this.f68641a0 = c16716d2;
        C16716d c16716d3 = this.f68637T;
        C16719g c16719g = null;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d3 = null;
        }
        C16716d c16716d4 = this.f68641a0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mImageContainer");
            c16716d4 = null;
        }
        c16716d3.m89001g1(c16716d4);
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(-2, -2).m89025I(true);
        this.f68632O = c21693c;
        C16716d c16716d5 = this.f68641a0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mImageContainer");
            c16716d5 = null;
        }
        C21693c c21693c2 = this.f68632O;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mImageModule");
            c21693c2 = null;
        }
        c16716d5.m89001g1(c21693c2);
        C21692b c21692b = new C21692b(getContext());
        C16718f m89106L2 = c21692b.m89106L();
        int i14 = AbstractC23222t7.f112526H;
        m89106L2.m89028L(i14, i14).m89025I(true);
        c21692b.mo44614b1(8);
        this.f68640W = c21692b;
        C16716d c16716d6 = this.f68641a0;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mImageContainer");
            c16716d6 = null;
        }
        C21692b c21692b2 = this.f68640W;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c16716d6.m89001g1(c21692b2);
        C16716d c16716d7 = new C16716d(getContext());
        C16718f m89028L2 = c16716d7.m89106L().m89028L(-1, -2);
        C16716d c16716d8 = this.f68641a0;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("mImageContainer");
            c16716d8 = null;
        }
        m89028L2.m89054h0(c16716d8).m89025I(true).m89034R(AbstractC23222t7.f112596y);
        this.f68642b0 = c16716d7;
        C16716d c16716d9 = this.f68637T;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d9 = null;
        }
        C16716d c16716d10 = this.f68642b0;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d10 = null;
        }
        c16716d9.m89001g1(c16716d10);
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L3 = c22126c0.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L3.m89018B(bool);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_large));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f68633P = c22126c0;
        C16716d c16716d11 = this.f68642b0;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d11 = null;
        }
        C22126c0 c22126c02 = this.f68633P;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c02 = null;
        }
        c16716d11.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(getContext());
        C16718f m89028L4 = c22126c03.m89106L().m89028L(-1, -2);
        C22126c0 c22126c04 = this.f68633P;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c04 = null;
        }
        m89028L4.m89023G(c22126c04);
        c22126c03.m111953A1(2);
        c22126c03.m111980v1(TextUtils.TruncateAt.END);
        Context context2 = c22126c03.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c03).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_small));
        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC2807a.text_02));
        this.f68634Q = c22126c03;
        C16716d c16716d12 = this.f68642b0;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d12 = null;
        }
        C22126c0 c22126c05 = this.f68634Q;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mTextViewFileName");
            c22126c05 = null;
        }
        c16716d12.m89001g1(c22126c05);
        C22126c0 c22126c06 = new C22126c0(getContext());
        C16718f m89028L5 = c22126c06.m89106L().m89028L(-2, -2);
        C22126c0 c22126c07 = this.f68633P;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c07 = null;
        }
        C16718f m89054h0 = m89028L5.m89054h0(c22126c07);
        C22126c0 c22126c08 = this.f68633P;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c08 = null;
        }
        m89054h0.m89020D(c22126c08).m89034R(AbstractC23222t7.f112566j);
        Context context3 = c22126c06.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c06).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_normal));
        c22126c06.m111962J1(C23212s8.m119607o(c22126c06.getContext(), AbstractC2807a.text_02));
        this.f68635R = c22126c06;
        C16716d c16716d13 = this.f68642b0;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16716d13 = null;
        }
        C22126c0 c22126c09 = this.f68635R;
        if (c22126c09 == null) {
            AbstractC19074t.m100223u("mTextViewFileExtension");
            c22126c09 = null;
        }
        c16716d13.m89001g1(c22126c09);
        C16719g c16719g2 = new C16719g(getContext());
        C16718f m89060k0 = c16719g2.m89106L().m89030N(1).m89060k0(-1);
        C16719g c16719g3 = this.f68642b0;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("mDetailsContainer");
            c16719g3 = null;
        }
        m89060k0.m89071x(c16719g3).m89072y(bool);
        c16719g2.mo89161z0(C23212s8.m119607o(c16719g2.getContext(), AbstractC16781w.ItemSeparatorColor));
        this.f68636S = c16719g2;
        mo69681L(c16719g2);
        C16716d c16716d14 = new C16716d(getContext());
        c16716d14.m89106L().m89028L(-2, -2).m89027K(true).m89073z(bool).m89034R(AbstractC23222t7.f112566j);
        c16716d14.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.b
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g4) {
                ToolStorageFileItemModuleView.m75154v0(ToolStorageFileItemModuleView.this, c16719g4);
            }
        });
        this.f68639V = c16716d14;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C17073y c17073y = new C17073y(context4, C21733a.a.MEDIUM);
        c17073y.m89106L().m89041Y(AbstractC23222t7.f112566j);
        c17073y.mo89093E0(false);
        c17073y.mo89107L0(getCbCheckedChangedListener());
        c17073y.m91362p1(false, false);
        this.f68638U = c17073y;
        C16716d c16716d15 = this.f68639V;
        if (c16716d15 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
            c16716d15 = null;
        }
        C17073y c17073y2 = this.f68638U;
        if (c17073y2 == null) {
            AbstractC19074t.m100223u("mCheckBox");
            c17073y2 = null;
        }
        c16716d15.m89001g1(c17073y2);
        C16719g c16719g4 = this.f68639V;
        if (c16719g4 == null) {
            AbstractC19074t.m100223u("mCheckBoxContainer");
        } else {
            c16719g = c16719g4;
        }
        mo69681L(c16719g);
    }
}
