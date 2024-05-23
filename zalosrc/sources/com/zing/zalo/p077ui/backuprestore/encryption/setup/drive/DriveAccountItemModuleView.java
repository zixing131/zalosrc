package com.zing.zalo.p077ui.backuprestore.encryption.setup.drive;

import android.content.Context;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ti0.C26705d;
import ti0.C26707f;

/* loaded from: classes5.dex */
public final class DriveAccountItemModuleView extends ModulesView {

    /* renamed from: K */
    private C16716d f55696K;

    /* renamed from: L */
    private C22126c0 f55697L;

    public DriveAccountItemModuleView(Context context) {
        super(context);
        m57593W();
    }

    /* renamed from: W */
    private final void m57593W() {
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, AbstractC23222t7.f112545X);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f55696K = c16716d;
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89028L = c22126c0.m89106L().m89028L(-1, -2);
        C16716d c16716d2 = this.f55696K;
        C16716d c16716d3 = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d2 = null;
        }
        m89028L.m89070w(c16716d2).m89046b0(AbstractC23222t7.f112586t);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_large));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        this.f55697L = c22126c0;
        C16716d c16716d4 = this.f55696K;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d4 = null;
        }
        C22126c0 c22126c02 = this.f55697L;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTextViewName");
            c22126c02 = null;
        }
        c16716d4.m89001g1(c22126c02);
        C16716d c16716d5 = this.f55696K;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentLayout");
        } else {
            c16716d3 = c16716d5;
        }
        mo69681L(c16716d3);
    }

    /* renamed from: V */
    public final void m57594V(String str) {
        AbstractC19074t.m100208f(str, "account");
        C22126c0 c22126c0 = this.f55697L;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("mTextViewName");
            c22126c0 = null;
        }
        c22126c0.m111959G1(str);
    }

    public DriveAccountItemModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57593W();
    }

    public DriveAccountItemModuleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m57593W();
    }
}
