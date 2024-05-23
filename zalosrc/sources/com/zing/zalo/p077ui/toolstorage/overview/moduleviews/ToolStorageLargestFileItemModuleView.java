package com.zing.zalo.p077ui.toolstorage.overview.moduleviews;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import dj.C17945a0;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import k30.C21459a;
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
public final class ToolStorageLargestFileItemModuleView extends ToolStorageBaseLargestItemModuleView {

    /* renamed from: N */
    private C21693c f68899N;

    /* renamed from: O */
    private C22122a0 f68900O;

    /* renamed from: P */
    private C22126c0 f68901P;

    /* renamed from: Q */
    private C22126c0 f68902Q;

    /* renamed from: R */
    private C16716d f68903R;

    public ToolStorageLargestFileItemModuleView(Context context) {
        super(context);
        m88987U(-1, getItemHeight());
        setGravity(3);
        m75452W();
    }

    /* renamed from: X */
    private final String m75451X(String str) {
        try {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76613c();
            c13704p1.setTextSize(AbstractC23222t7.f112574n);
            c13704p1.setColor(C23212s8.m119606n(AbstractC2807a.text_02));
            return AbstractC19646n0.m102924Q0(str, c13704p1, getItemWidth(), 1, 4).toString();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return str;
        }
    }

    @Override // com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageBaseLargestItemModuleView
    /* renamed from: V */
    public void mo75450V(C13380a c13380a) {
        String str;
        String str2;
        if (c13380a == null) {
            return;
        }
        C22126c0 c22126c0 = this.f68901P;
        C22126c0 c22126c02 = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c0 = null;
        }
        c22126c0.m111959G1(C21459a.m111038f(c13380a.m75087i(), 0, 2, null));
        if (c13380a.m75100v()) {
            C21693c c21693c = this.f68899N;
            if (c21693c == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c = null;
            }
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m95223p3();
            } else {
                str = null;
            }
            c21693c.mo111926w1(AbstractC28236y3.m142203n(str));
            C22126c0 c22126c03 = this.f68902Q;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
                c22126c03 = null;
            }
            C17945a0 m75089k2 = c13380a.m75089k();
            if (m75089k2 != null) {
                str2 = m75089k2.m95232q3();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            c22126c03.m111959G1(m75451X(str2));
            C22126c0 c22126c04 = this.f68902Q;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
            } else {
                c22126c02 = c22126c04;
            }
            c22126c02.mo44614b1(0);
            return;
        }
        if (c13380a.m75076F()) {
            C21693c c21693c2 = this.f68899N;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mImageFileType");
                c21693c2 = null;
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c21693c2.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_mic_line_24, AbstractC2807a.icon_02));
            C22126c0 c22126c05 = this.f68902Q;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mTextViewFileName");
            } else {
                c22126c02 = c22126c05;
            }
            c22126c02.mo44614b1(8);
        }
    }

    /* renamed from: W */
    public final void m75452W() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(getItemWidth(), getItemHeight());
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f68903R = c16716d;
        C21693c c21693c = new C21693c(getContext());
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112592w;
        C16718f m89036T = m89106L.m89028L(i11, i11).m89034R(AbstractC23222t7.f112566j).m89036T(AbstractC23222t7.f112562h);
        Boolean bool = Boolean.TRUE;
        m89036T.m89073z(bool).m89018B(bool);
        c21693c.m111929z1(6);
        this.f68899N = c21693c;
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89072y(bool).m89073z(bool).m89034R(AbstractC23222t7.f112556e).m89033Q(AbstractC23222t7.f112552c);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxxxsmall_m));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f68901P = c22126c0;
        C22126c0 c22126c02 = new C22126c0(getContext());
        C16718f m89028L = c22126c02.m89106L().m89028L(-2, -2);
        C22126c0 c22126c03 = this.f68901P;
        C16716d c16716d2 = null;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c03 = null;
        }
        m89028L.m89066s(c22126c03).m89034R(AbstractC23222t7.f112556e).m89035S(AbstractC23222t7.f112556e).m89033Q(AbstractC23222t7.f112552c);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(TextUtils.TruncateAt.END);
        Context context2 = c22126c02.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c02).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_xxxxsmall));
        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC2807a.text_02));
        this.f68902Q = c22126c02;
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.m89106L().m89028L(-1, -1).m89041Y(1);
        c22122a0.m115384R1(true);
        c22122a0.m115388V1(AbstractC23136l9.m118639A(C23212s8.m119610r(AbstractC16781w.ItemSeparatorColor)));
        c22122a0.m115389W1(AbstractC23222t7.f112552c);
        this.f68900O = c22122a0;
        C16716d c16716d3 = this.f68903R;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d3 = null;
        }
        C21693c c21693c2 = this.f68899N;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mImageFileType");
            c21693c2 = null;
        }
        c16716d3.m89001g1(c21693c2);
        C16716d c16716d4 = this.f68903R;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d4 = null;
        }
        C22126c0 c22126c04 = this.f68901P;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("mTextViewFileSize");
            c22126c04 = null;
        }
        c16716d4.m89001g1(c22126c04);
        C16716d c16716d5 = this.f68903R;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d5 = null;
        }
        C22126c0 c22126c05 = this.f68902Q;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mTextViewFileName");
            c22126c05 = null;
        }
        c16716d5.m89001g1(c22126c05);
        C16716d c16716d6 = this.f68903R;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d6 = null;
        }
        C22122a0 c22122a02 = this.f68900O;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("mDefaultThumb");
            c22122a02 = null;
        }
        c16716d6.m89001g1(c22122a02);
        C16716d c16716d7 = this.f68903R;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mContentLayout");
        } else {
            c16716d2 = c16716d7;
        }
        mo69681L(c16716d2);
    }
}
