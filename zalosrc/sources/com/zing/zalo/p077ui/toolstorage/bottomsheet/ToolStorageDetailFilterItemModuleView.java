package com.zing.zalo.p077ui.toolstorage.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.toolstorage.bottomsheet.ToolStorageDetailFilterBottomSheet;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ToolStorageDetailFilterItemModuleView extends ModulesView {

    /* renamed from: K */
    private C16716d f68468K;

    /* renamed from: L */
    private C21693c f68469L;

    /* renamed from: M */
    private C22126c0 f68470M;

    public ToolStorageDetailFilterItemModuleView(Context context) {
        super(context);
        m74846W();
    }

    /* renamed from: W */
    private final void m74846W() {
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, AbstractC23222t7.f112545X);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f68468K = c16716d;
        C21693c c21693c = new C21693c(getContext());
        C16718f m89035S = c21693c.m89106L().m89028L(-2, -2).m89017A(Boolean.TRUE).m89035S(AbstractC23222t7.f112512A);
        C16716d c16716d2 = this.f68468K;
        C16716d c16716d3 = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d2 = null;
        }
        m89035S.m89070w(c16716d2);
        Context context = c21693c.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_check_line_16, AbstractC2807a.selected));
        this.f68469L = c21693c;
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        C16716d c16716d4 = this.f68468K;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d4 = null;
        }
        m89028L.m89070w(c16716d4).m89046b0(AbstractC23222t7.f112586t);
        Context context2 = c22126c0.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_large));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f68470M = c22126c0;
        C16716d c16716d5 = this.f68468K;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d5 = null;
        }
        C21693c c21693c2 = this.f68469L;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mImageCheck");
            c21693c2 = null;
        }
        c16716d5.m89001g1(c21693c2);
        C16716d c16716d6 = this.f68468K;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d6 = null;
        }
        C22126c0 c22126c02 = this.f68470M;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewName");
            c22126c02 = null;
        }
        c16716d6.m89001g1(c22126c02);
        C16716d c16716d7 = this.f68468K;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mContentLayout");
        } else {
            c16716d3 = c16716d7;
        }
        mo69681L(c16716d3);
    }

    /* renamed from: V */
    public final void m74847V(String str, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        C22126c0 c22126c0 = this.f68470M;
        C21693c c21693c = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewName");
            c22126c0 = null;
        }
        ToolStorageDetailFilterBottomSheet.C13332a c13332a = ToolStorageDetailFilterBottomSheet.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c22126c0.m111959G1(c13332a.m74844a(context, str));
        C21693c c21693c2 = this.f68469L;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mImageCheck");
        } else {
            c21693c = c21693c2;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        c21693c.mo44614b1(i11);
    }

    public ToolStorageDetailFilterItemModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m74846W();
    }

    public ToolStorageDetailFilterItemModuleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m74846W();
    }
}
