package com.zing.zalo.p077ui.backuprestore.syncmessage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c50.C3297h;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreExplainContactPermissionView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p320ld.C22441m;
import p320ld.C22447s;
import p649xl.C30065u6;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public final class SyncRestoreExplainContactPermissionView extends SlidableZaloView implements View.OnClickListener {

    /* renamed from: P0 */
    private C30065u6 f56012P0;

    /* renamed from: hM */
    private final void m58245hM() {
        C22447s.f109797a.m116070G0(m92676n2(), new InterfaceC17463d.d() { // from class: a50.k
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SyncRestoreExplainContactPermissionView.m58246iM(interfaceC17463d, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m58246iM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30065u6 m148569c = C30065u6.m148569c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148569c, "inflate(...)");
        this.f56012P0 = m148569c;
        if (m148569c == null) {
            AbstractC19074t.m100223u("binding");
            m148569c = null;
        }
        FrameLayout root = m148569c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        C3297h.m16742n(this.f88760a0);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C30065u6 c30065u6 = this.f56012P0;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c30065u6 == null) {
            AbstractC19074t.m100223u("binding");
            c30065u6 = null;
        }
        c30065u6.f139553r.setOnClickListener(this);
        C30065u6 c30065u62 = this.f56012P0;
        if (c30065u62 == null) {
            AbstractC19074t.m100223u("binding");
            c30065u62 = null;
        }
        c30065u62.f139552q.setOnClickListener(this);
        C30065u6 c30065u63 = this.f56012P0;
        if (c30065u63 == null) {
            AbstractC19074t.m100223u("binding");
            c30065u63 = null;
        }
        ViewGroup.LayoutParams layoutParams = c30065u63.f139557v.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                marginLayoutParams.topMargin = (AbstractC23136l9.m118655I(AbstractC16802y.backup_restore_margin_top_big) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height)) - AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
            } else {
                marginLayoutParams.topMargin = AbstractC23136l9.m118655I(AbstractC16802y.backup_restore_margin_top_big) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncRestoreExplainContactPermissionView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100205c(view);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_continue) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_IGNORE_RESTORE_MEDIA", true);
            mo50035CK(-1, intent);
            finish();
            return;
        }
        if (id2 == AbstractC6918a0.btn_grant_permission) {
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            C22441m.m115984c(baseZaloView, 0, 2, null);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 150) {
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                mo50035CK(-1, null);
                finish();
                return;
            }
            Context m92648SI = this.f72421L0.m92648SI();
            AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
            if (!AbstractC23034c6.m118111A0((Activity) m92648SI, "android.permission.READ_CONTACTS")) {
                AbstractC20110a.f98889a.mo104548a("Don't ask again", new Object[0]);
                m58245hM();
            } else {
                AbstractC20110a.f98889a.mo104548a("Denied before", new Object[0]);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        BaseZaloView baseZaloView = this.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        if (C22441m.m115982a(baseZaloView)) {
            mo50035CK(-1, null);
            finish();
        }
    }
}
