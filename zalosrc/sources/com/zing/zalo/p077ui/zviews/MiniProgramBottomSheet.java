package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import me0.C23278z2;
import p189gv.C19609h;
import p354n3.C23528a;
import p379o3.C23999j;
import p649xl.C29890k8;

/* loaded from: classes6.dex */
public final class MiniProgramBottomSheet extends BottomPickerView {
    public static final C14631a Companion = new C14631a(null);

    /* renamed from: U0 */
    public C29890k8 f75239U0;

    /* renamed from: V0 */
    private C19609h f75240V0;

    /* renamed from: com.zing.zalo.ui.zviews.MiniProgramBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C14631a {
        private C14631a() {
        }

        public /* synthetic */ C14631a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        dismiss();
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        super.mo12457Tv(interfaceC17463d);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        String str2 = null;
        if (m92642L3 != null) {
            serializable = m92642L3.getSerializable("EXTRA_MINI_PROGRAM_INFO");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f75240V0 = (C19609h) serializable;
        }
        C29890k8 m148162a = C29890k8.m148162a(this.f83659I0);
        AbstractC19074t.m100207e(m148162a, "bind(...)");
        m81850oL(m148162a);
        m81849nL().f138476t.setIdTracking("mp_share_menu");
        m81849nL().f138474r.setIdTracking("mp_reload_menu");
        m81849nL().f138475s.setIdTracking("mp_report_menu");
        m81849nL().f138473q.setIdTracking("mp_cancel_menu");
        TextView textView = m81849nL().f138479w;
        C19609h c19609h = this.f75240V0;
        if (c19609h != null) {
            str = c19609h.m102619m();
        } else {
            str = null;
        }
        textView.setText(str);
        C23528a c23528a = (C23528a) this.f72447O0.m123612r(m81849nL().f138478v);
        C19609h c19609h2 = this.f75240V0;
        if (c19609h2 != null) {
            str2 = c19609h2.m102612f();
        }
        c23528a.m123579C(str2, C23278z2.m120143n(), new C23999j());
        m81849nL().f138476t.setOnClickListener(this);
        m81849nL().f138474r.setOnClickListener(this);
        m81849nL().f138475s.setOnClickListener(this);
        m81849nL().f138473q.setOnClickListener(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.mp_bottom_sheet;
    }

    /* renamed from: nL */
    public final C29890k8 m81849nL() {
        C29890k8 c29890k8 = this.f75239U0;
        if (c29890k8 != null) {
            return c29890k8;
        }
        AbstractC19074t.m100223u("vb");
        return null;
    }

    /* renamed from: oL */
    public final void m81850oL(C29890k8 c29890k8) {
        AbstractC19074t.m100208f(c29890k8, "<set-?>");
        this.f75239U0 = c29890k8;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.btn_share;
        if (num == null || num.intValue() != i11) {
            int i12 = AbstractC6918a0.btn_reload;
            if ((num == null || num.intValue() != i12) && num != null) {
                num.intValue();
            }
        }
        dismiss();
    }
}
