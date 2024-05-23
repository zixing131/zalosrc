package com.zing.zalo.p077ui.backuprestore.drive;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c50.C3297h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountMediaRestoreView;
import com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreExplainContactPermissionView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dg0.AbstractC17927b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p320ld.C22441m;
import p320ld.C22447s;
import p542ub.InterfaceC27218a;
import p649xl.C30003qd;

/* loaded from: classes5.dex */
public final class SyncGoogleAccountMediaRestoreView extends SyncGoogleAccountBaseView implements InterfaceC17463d.d {
    public static final C11018a Companion = new C11018a(null);

    /* renamed from: V0 */
    private C30003qd f55676V0;

    /* renamed from: X0 */
    private TargetBackupInfo f55678X0;

    /* renamed from: Z0 */
    private int f55680Z0;

    /* renamed from: a1 */
    private String f55681a1;

    /* renamed from: W0 */
    private final int f55677W0 = 1;

    /* renamed from: Y0 */
    private String f55679Y0 = "";

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountMediaRestoreView$a */
    /* loaded from: classes5.dex */
    public static final class C11018a {
        private C11018a() {
        }

        public /* synthetic */ C11018a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: GM */
    private final void m57551GM() {
        C30003qd c30003qd = this.f55676V0;
        C30003qd c30003qd2 = null;
        if (c30003qd == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd = null;
        }
        c30003qd.f139152x.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_account_ggdrive_media_restore_diff_account_backup));
        C30003qd c30003qd3 = this.f55676V0;
        if (c30003qd3 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd3 = null;
        }
        c30003qd3.f139148t.setVisibility(8);
        C30003qd c30003qd4 = this.f55676V0;
        if (c30003qd4 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd4 = null;
        }
        c30003qd4.f139149u.setVisibility(8);
        C30003qd c30003qd5 = this.f55676V0;
        if (c30003qd5 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd5 = null;
        }
        c30003qd5.f139153y.setVisibility(0);
        C30003qd c30003qd6 = this.f55676V0;
        if (c30003qd6 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd6 = null;
        }
        c30003qd6.f139151w.setVisibility(0);
        C30003qd c30003qd7 = this.f55676V0;
        if (c30003qd7 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd7 = null;
        }
        RobotoTextView robotoTextView = c30003qd7.f139151w;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_account_ggdrive_media_restore_diff_account_backup);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{this.f55681a1}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C30003qd c30003qd8 = this.f55676V0;
        if (c30003qd8 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30003qd2 = c30003qd8;
        }
        c30003qd2.f139146r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_relogin_account_ggdrive_media_restore_diff_account_backup));
    }

    /* renamed from: HM */
    private final void m57552HM() {
        C30003qd c30003qd = this.f55676V0;
        C30003qd c30003qd2 = null;
        if (c30003qd == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd = null;
        }
        c30003qd.f139152x.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_account_ggdrive_media_restore));
        C30003qd c30003qd3 = this.f55676V0;
        if (c30003qd3 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd3 = null;
        }
        c30003qd3.f139148t.setVisibility(0);
        C30003qd c30003qd4 = this.f55676V0;
        if (c30003qd4 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd4 = null;
        }
        c30003qd4.f139150v.setText(this.f55679Y0);
        C30003qd c30003qd5 = this.f55676V0;
        if (c30003qd5 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd5 = null;
        }
        c30003qd5.f139153y.setVisibility(4);
        C30003qd c30003qd6 = this.f55676V0;
        if (c30003qd6 == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd6 = null;
        }
        c30003qd6.f139151w.setVisibility(8);
        C30003qd c30003qd7 = this.f55676V0;
        if (c30003qd7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30003qd2 = c30003qd7;
        }
        c30003qd2.f139146r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_login_account_ggdrive_media_restore));
    }

    /* renamed from: IM */
    private final void m57553IM() {
        if (m57562RM()) {
            m57551GM();
        } else {
            m57552HM();
        }
    }

    /* renamed from: JM */
    private final void m57554JM() {
        if (this.f55680Z0 == 1) {
            m57555KM(this.f55679Y0);
            return;
        }
        BaseZaloView baseZaloView = this.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        if (!C22441m.m115982a(baseZaloView)) {
            BaseZaloView baseZaloView2 = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView2, "mThis");
            C22441m.m115984c(baseZaloView2, 0, 2, null);
            return;
        }
        m57555KM(this.f55679Y0);
    }

    /* renamed from: KM */
    private final void m57555KM(String str) {
        try {
            Account[] accountsByType = AccountManager.get(this.f72421L0.getContext()).getAccountsByType("com.google");
            AbstractC19074t.m100207e(accountsByType, "getAccountsByType(...)");
            for (Account account : accountsByType) {
                if (AbstractC19074t.m100204b(account.name, str)) {
                    m57534rM(str);
                    return;
                }
            }
            m57532mM(str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: LM */
    private final void m57556LM() {
        C30003qd c30003qd = this.f55676V0;
        C30003qd c30003qd2 = null;
        if (c30003qd == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd = null;
        }
        c30003qd.f139146r.setOnClickListener(new View.OnClickListener() { // from class: n40.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncGoogleAccountMediaRestoreView.m57557MM(SyncGoogleAccountMediaRestoreView.this, view);
            }
        });
        C30003qd c30003qd3 = this.f55676V0;
        if (c30003qd3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30003qd2 = c30003qd3;
        }
        c30003qd2.f139145q.setOnClickListener(new View.OnClickListener() { // from class: n40.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncGoogleAccountMediaRestoreView.m57559OM(SyncGoogleAccountMediaRestoreView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m57557MM(final SyncGoogleAccountMediaRestoreView syncGoogleAccountMediaRestoreView, View view) {
        AbstractC19074t.m100208f(syncGoogleAccountMediaRestoreView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_ACTION_SETUP_ACCOUNT_RESTORE_MEDIA", new Runnable() { // from class: n40.n
            @Override // java.lang.Runnable
            public final void run() {
                SyncGoogleAccountMediaRestoreView.m57558NM(SyncGoogleAccountMediaRestoreView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m57558NM(SyncGoogleAccountMediaRestoreView syncGoogleAccountMediaRestoreView) {
        AbstractC19074t.m100208f(syncGoogleAccountMediaRestoreView, "this$0");
        syncGoogleAccountMediaRestoreView.m57554JM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m57559OM(final SyncGoogleAccountMediaRestoreView syncGoogleAccountMediaRestoreView, View view) {
        AbstractC19074t.m100208f(syncGoogleAccountMediaRestoreView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_ACTION_SETUP_ACCOUNT_RESTORE_MEDIA", new Runnable() { // from class: n40.o
            @Override // java.lang.Runnable
            public final void run() {
                SyncGoogleAccountMediaRestoreView.m57560PM(SyncGoogleAccountMediaRestoreView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m57560PM(SyncGoogleAccountMediaRestoreView syncGoogleAccountMediaRestoreView) {
        AbstractC19074t.m100208f(syncGoogleAccountMediaRestoreView, "this$0");
        syncGoogleAccountMediaRestoreView.m57565UM();
    }

    /* renamed from: QM */
    private final void m57561QM() {
        BaseZaloView baseZaloView = this.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        C30003qd c30003qd = null;
        if (C22441m.m115982a(baseZaloView)) {
            C30003qd c30003qd2 = this.f55676V0;
            if (c30003qd2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30003qd = c30003qd2;
            }
            c30003qd.f139149u.setVisibility(8);
            return;
        }
        C30003qd c30003qd3 = this.f55676V0;
        if (c30003qd3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30003qd = c30003qd3;
        }
        c30003qd.f139149u.setVisibility(0);
    }

    /* renamed from: RM */
    private final boolean m57562RM() {
        String str;
        if (this.f55680Z0 == 1 && (str = this.f55681a1) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: SM */
    private final void m57563SM() {
        C22447s.f109797a.m116070G0(m92676n2(), new InterfaceC17463d.d() { // from class: n40.m
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SyncGoogleAccountMediaRestoreView.m57564TM(SyncGoogleAccountMediaRestoreView.this, interfaceC17463d, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m57564TM(SyncGoogleAccountMediaRestoreView syncGoogleAccountMediaRestoreView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(syncGoogleAccountMediaRestoreView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        syncGoogleAccountMediaRestoreView.m57567WM();
    }

    /* renamed from: UM */
    private final void m57565UM() {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(7).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_ignore_restore_login_media)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_ignore_restore_login_media)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_btn_skip), new InterfaceC17463d.d() { // from class: n40.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SyncGoogleAccountMediaRestoreView.m57566VM(SyncGoogleAccountMediaRestoreView.this, interfaceC17463d, i11);
            }
        });
        aVar.m43152a().mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m57566VM(SyncGoogleAccountMediaRestoreView syncGoogleAccountMediaRestoreView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(syncGoogleAccountMediaRestoreView, "this$0");
        syncGoogleAccountMediaRestoreView.mo50035CK(-1, null);
        syncGoogleAccountMediaRestoreView.finish();
    }

    /* renamed from: WM */
    private final void m57567WM() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35581q(SyncRestoreExplainContactPermissionView.class, null, 18072, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String m40959o;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                TargetBackupInfo targetBackupInfo = (TargetBackupInfo) m92642L3.getParcelable("extra_target_backup_info");
                if (targetBackupInfo != null && (m40959o = targetBackupInfo.m40959o()) != null && m40959o.length() != 0) {
                    this.f55678X0 = targetBackupInfo;
                    AbstractC19074t.m100205c(targetBackupInfo);
                    this.f55679Y0 = targetBackupInfo.m40959o();
                    return;
                }
                SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == this.f55677W0) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4);
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_perm_dialog_contact_account_ggdrive_media_restore));
            aVar.m43173v(3);
            aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_perm_dialog_contact_account_ggdrive_media_restore));
            aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_negative_sync_media_no_permission_deny), new InterfaceC17463d.b());
            aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.sync_media_intro_permission_btn), this);
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30003qd m148418c = C30003qd.m148418c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148418c, "inflate(...)");
        this.f55676V0 = m148418c;
        m57556LM();
        C30003qd c30003qd = this.f55676V0;
        if (c30003qd == null) {
            AbstractC19074t.m100223u("binding");
            c30003qd = null;
        }
        FrameLayout root = c30003qd.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            if (interfaceC17463d.mo92862f() == this.f55677W0 && i11 == -1) {
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            if (m57562RM()) {
                this.f55680Z0 = 0;
                m57553IM();
            } else {
                SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
            }
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putInt("STATE_MODE_UI", this.f55680Z0);
        bundle.putString("STATE_CUR_ACCOUNT_AUTH", this.f55681a1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        C3297h.m16742n(this.f88760a0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncGoogleAccountMediaRestoreView";
    }

    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 18072 && i12 == -1) {
            if (intent != null && intent.getBooleanExtra("EXTRA_IGNORE_RESTORE_MEDIA", false)) {
                mo50035CK(-1, null);
                finish();
                return;
            }
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                m57555KM(this.f55679Y0);
            } else {
                SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            if (m57562RM()) {
                this.f55680Z0 = 0;
                m57553IM();
            } else {
                SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 150) {
            m57561QM();
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                m57555KM(this.f55679Y0);
            } else {
                Context m92648SI = this.f72421L0.m92648SI();
                AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
                if (!AbstractC23034c6.m118111A0((Activity) m92648SI, "android.permission.READ_CONTACTS")) {
                    AbstractC20110a.f98889a.mo104548a("Don't ask again", new Object[0]);
                    if (!AbstractC23034c6.m118132R("android.permission.READ_CONTACTS")) {
                        m57563SM();
                    } else {
                        m57567WM();
                    }
                } else {
                    AbstractC20110a.f98889a.mo104548a("Denied before", new Object[0]);
                    m57567WM();
                }
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f55680Z0 == 0) {
            m57561QM();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView
    /* renamed from: qM */
    public boolean mo57533qM(String str) {
        AbstractC19074t.m100208f(str, "email");
        try {
            if (AbstractC19074t.m100204b(str, this.f55679Y0)) {
                this.f55680Z0 = 0;
                m57553IM();
                return true;
            }
            this.f55680Z0 = 1;
            this.f55681a1 = str;
            m57553IM();
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return super.mo57533qM(str);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            this.f55680Z0 = bundle.getInt("STATE_MODE_UI", this.f55680Z0);
            this.f55681a1 = bundle.getString("STATE_CUR_ACCOUNT_AUTH", this.f55681a1);
        }
        m57553IM();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView
    /* renamed from: xM */
    protected void mo57507xM() {
    }
}
