package com.zing.zalo.p077ui.backuprestore.syncpass;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b50.C2556d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.C23212s8;
import p227i3.C20215s;
import p361nb.AbstractC23647d;
import si.C26263i;

/* loaded from: classes5.dex */
public abstract class SyncMsgEditPwdBaseView extends SlidableZaloView {
    public static final C11132a Companion = new C11132a(null);

    /* renamed from: P0 */
    private int f56052P0 = -1;

    /* renamed from: Q0 */
    private TextWatcher f56053Q0 = new C11133b();

    /* renamed from: com.zing.zalo.ui.backuprestore.syncpass.SyncMsgEditPwdBaseView$a */
    /* loaded from: classes5.dex */
    public static final class C11132a {
        private C11132a() {
        }

        public /* synthetic */ C11132a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ void m58333c(C11132a c11132a, C17487o0 c17487o0, Class cls, int i11, int i12, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                i12 = -1;
            }
            c11132a.m58335b(c17487o0, cls, i11, i12);
        }

        /* renamed from: a */
        public final void m58334a(C17487o0 c17487o0, Class cls, int i11) {
            m58333c(this, c17487o0, cls, i11, 0, 8, null);
        }

        /* renamed from: b */
        public final void m58335b(C17487o0 c17487o0, Class cls, int i11, int i12) {
            Bundle bundle;
            if (c17487o0 != null) {
                if (i12 != -1) {
                    bundle = new Bundle();
                    bundle.putInt("EXTRA_SOURCE_ACTION", i12);
                } else {
                    bundle = null;
                }
                c17487o0.m93066i2(cls, bundle, i11, 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.syncpass.SyncMsgEditPwdBaseView$b */
    /* loaded from: classes5.dex */
    public static final class C11133b extends AbstractC18391a {
        C11133b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            super.afterTextChanged(editable);
            SyncMsgEditPwdBaseView.this.mo58266kM();
        }
    }

    /* renamed from: gM */
    private final void m58326gM() {
        switch (mo58267lM()) {
            case 10:
                AbstractC23647d.m123897g("711303");
                return;
            case 11:
                AbstractC23647d.m123897g("711322");
                return;
            case 12:
                AbstractC23647d.m123897g("711315");
                return;
            default:
                return;
        }
    }

    /* renamed from: hM */
    private final void m58327hM() {
        switch (mo58267lM()) {
            case 10:
                AbstractC23647d.m123897g("711302");
                return;
            case 11:
                AbstractC23647d.m123897g("711321");
                return;
            case 12:
                AbstractC23647d.m123897g("711314");
                return;
            default:
                return;
        }
    }

    /* renamed from: iM */
    private final void m58328iM() {
        switch (mo58267lM()) {
            case 10:
                AbstractC23647d.m123897g("711306");
                return;
            case 11:
                AbstractC23647d.m123897g("711325");
                return;
            case 12:
                AbstractC23647d.m123897g("711318");
                return;
            default:
                return;
        }
    }

    /* renamed from: sM */
    public static final void m58329sM(C17487o0 c17487o0, Class cls, int i11) {
        Companion.m58334a(c17487o0, cls, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle == null) {
            m58327hM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(this.f72421L0.getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutTransition(new LayoutTransition());
        linearLayout.setBackgroundColor(C23212s8.m119607o(linearLayout.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        ActionBar actionBar = new ActionBar(this.f72421L0.getContext());
        actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
        actionBar.setId(AbstractC6918a0.zalo_action_bar);
        actionBar.setElevation(actionBar.getResources().getDimension(AbstractC17454d.width_shadow_action_bar));
        actionBar.setTitle(m92652XI(mo58269nM()));
        this.f88760a0 = actionBar;
        linearLayout.addView(actionBar, new LinearLayout.LayoutParams(-1, -2));
        View mo58268mM = mo58268mM(layoutInflater, viewGroup);
        linearLayout.addView(mo58268mM);
        mo58270oM(mo58268mM);
        return linearLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m58326gM();
            finish();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: jM */
    public final void m58330jM(CustomEditText... customEditTextArr) {
        AbstractC19074t.m100208f(customEditTextArr, "editTexts");
        for (CustomEditText customEditText : customEditTextArr) {
            if (customEditText != null) {
                customEditText.removeTextChangedListener(this.f56053Q0);
                customEditText.addTextChangedListener(this.f56053Q0);
            }
        }
    }

    /* renamed from: kM */
    protected abstract void mo58266kM();

    /* renamed from: lM */
    protected abstract int mo58267lM();

    /* renamed from: mM */
    protected abstract View mo58268mM(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: nM */
    protected abstract int mo58269nM();

    /* renamed from: oM */
    protected abstract void mo58270oM(View view);

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            m58326gM();
            finish();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo58271qM();
    }

    /* renamed from: pM */
    public final void m58331pM() {
        ZaloView zaloView;
        m58328iM();
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m93004H0();
        } else {
            zaloView = null;
        }
        if (zaloView instanceof SyncMessagePassManageView) {
            try {
                ((SyncMessagePassManageView) zaloView).f88756W = 0;
                ((SyncMessagePassManageView) zaloView).finish();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        int mo58267lM = mo58267lM();
        C26263i.m135055u().m135085r0(mo58267lM);
        if (mo58267lM == 10) {
            if (C2556d.m12981o().m12987H()) {
                C2556d m12981o = C2556d.m12981o();
                int i11 = this.f56052P0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                m12981o.m12990O("6", sb2.toString());
            }
            C2556d.m12981o().m13007x(5);
        }
        finish();
    }

    /* renamed from: qM */
    protected abstract void mo58271qM();

    /* renamed from: rM */
    public final void m58332rM(int i11) {
        this.f56052P0 = i11;
    }
}
