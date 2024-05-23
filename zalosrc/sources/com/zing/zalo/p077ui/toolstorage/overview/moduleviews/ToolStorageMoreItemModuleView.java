package com.zing.zalo.p077ui.toolstorage.overview.moduleviews;

import android.content.Context;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public final class ToolStorageMoreItemModuleView extends ToolStorageBaseLargestItemModuleView {

    /* renamed from: N */
    private C22126c0 f68911N;

    /* renamed from: O */
    private C16716d f68912O;

    public ToolStorageMoreItemModuleView(Context context) {
        super(context);
        m88987U(-1, getItemHeight());
        setGravity(3);
        m75455W();
    }

    @Override // com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageBaseLargestItemModuleView
    /* renamed from: V */
    public void mo75450V(C13380a c13380a) {
        C22126c0 c22126c0 = this.f68911N;
        CharSequence charSequence = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewMore");
            c22126c0 = null;
        }
        if (c13380a != null) {
            charSequence = c13380a.m75083e();
        }
        c22126c0.m111959G1("+" + ((Object) charSequence));
    }

    /* renamed from: W */
    public final void m75455W() {
        int i11;
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(getItemWidth(), getItemHeight());
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.ng20;
        } else {
            i11 = AbstractC2808b.ng90;
        }
        c16716d.mo89161z0(AbstractC23136l9.m118639A(i11));
        this.f68912O = c16716d;
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89025I(true);
        c22126c0.mo111965M1(1);
        c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f68911N = c22126c0;
        C16716d c16716d2 = this.f68912O;
        C16716d c16716d3 = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d2 = null;
        }
        C22126c0 c22126c02 = this.f68911N;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewMore");
            c22126c02 = null;
        }
        c16716d2.m89001g1(c22126c02);
        C16716d c16716d4 = this.f68912O;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
        } else {
            c16716d3 = c16716d4;
        }
        mo69681L(c16716d3);
    }
}
