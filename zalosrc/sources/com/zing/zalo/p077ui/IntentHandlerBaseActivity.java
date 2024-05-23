package com.zing.zalo.p077ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import ap0.C2279a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.IntentHandlerBaseActivity;
import com.zing.zalo.p077ui.zviews.ProgressDialogView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23165o5;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23269y3;
import p133ek.AbstractC18458a;
import p207he.C20024r;
import p348mi.AbstractC23306f;
import vg.C28023b6;
import vg.C28203u6;

/* loaded from: classes5.dex */
public abstract class IntentHandlerBaseActivity extends ZaloActivity {

    /* renamed from: T */
    ProgressDialogView f55243T;

    /* renamed from: V */
    private int f55245V;

    /* renamed from: W */
    private int f55246W;

    /* renamed from: S */
    Handler f55242S = new Handler();

    /* renamed from: U */
    private String f55244U = null;

    /* renamed from: T2 */
    private void m56807T2(final Intent intent) {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                this.f55242S.post(new Runnable() { // from class: h40.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntentHandlerBaseActivity.this.m56809W2();
                    }
                });
            } else {
                this.f55242S.post(new Runnable() { // from class: h40.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntentHandlerBaseActivity.this.m56810X2(intent);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void m56808V2() {
        try {
            ProgressDialogView progressDialogView = this.f55243T;
            if (progressDialogView != null && progressDialogView.m92595KK()) {
                this.f55243T.dismiss();
                this.f55243T = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m56809W2() {
        try {
            AbstractC20110a.m104535d("handleIntentIfLoggedIn: RESULT_CODE_ZALO_NOT_LOGIN", new Object[0]);
            setResult(4);
            finish();
            startActivity(AbstractC23152n3.m119018R(StartUpNewView.class, null));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void m56810X2(Intent intent) {
        try {
            mo56788Q2(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m56811Y2(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m56812b3(InterfaceC17463d interfaceC17463d, int i11) {
        m56816f3(this.f55246W, this.f55244U, this.f55245V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void m56813d3(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B8 */
    public void m56814B8(CharSequence charSequence, boolean z11) {
        try {
            ProgressDialogView progressDialogView = this.f55243T;
            if (progressDialogView != null && progressDialogView.m92595KK()) {
                this.f55243T.dismiss();
                this.f55243T = null;
            }
            if (this.f55243T == null) {
                this.f55243T = new ProgressDialogView();
            }
            this.f55243T.mo43041MK(z11);
            if (charSequence != null) {
                this.f55243T.m83097WK(charSequence);
            } else {
                this.f55243T.m83097WK(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING));
            }
            this.f55243T.mo83093TK(mo35579p());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    /* renamed from: Q2 */
    protected abstract void mo56788Q2(Intent intent);

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        Context m120036c = C23269y3.m120036c(context, AbstractC18458a.f93019a);
        if (m120036c != null) {
            context = m120036c;
        }
        super.attachBaseContext(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c4 */
    public void m56815c4() {
        if (this.f55243T == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: h40.n0
            @Override // java.lang.Runnable
            public final void run() {
                IntentHandlerBaseActivity.this.m56808V2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f3 */
    public boolean m56816f3(int i11, String str, int i12) {
        this.f55246W = i11;
        boolean z11 = true;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c == null) {
                ToastUtils.m89270r(getString(AbstractC8020f0.str_in_sub_noti_video_call_error));
                return true;
            }
            if (!C23055e5.m118272g(true)) {
                return true;
            }
            try {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), m141809c.f42434r)) {
                        C20024r.m103949w();
                        C28023b6.m141250h0().m141290I(i12);
                        finish();
                    } else {
                        ToastUtils.m89270r(getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        return true;
                    }
                } else {
                    Context appContext = MainApplication.getAppContext();
                    String[] strArr = AbstractC23034c6.f112033j;
                    if (AbstractC23034c6.m118167n(appContext, strArr) != 0) {
                        AbstractC23034c6.m118186w0(this, strArr, 145);
                        this.f55244U = str;
                        this.f55245V = i12;
                        return false;
                    }
                    if (AbstractC23165o5.m119333b()) {
                        AbstractC23152n3.m119058n0(this, m141809c, true, i11);
                    } else {
                        AbstractC23306f.m120722w0().m101508a(new C2279a.a(m141809c.f42434r, m141809c.m40383Q(true, false), m141809c.f42446v, true, i11));
                    }
                    this.f55244U = null;
                    C28023b6.m141250h0().m141290I(i12);
                    finish();
                }
                return false;
            } catch (Exception e11) {
                e = e11;
                z11 = false;
                e.printStackTrace();
                return z11;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23212s8.m119599f(getContext(), true, AbstractC8915g0.ThemeDefault_IntentHandlerDark, AbstractC8915g0.ThemeDefault_IntentHandlerLight);
        overridePendingTransition(0, 0);
        m56807T2(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m56807T2(intent);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 145) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112033j) == 0) {
                if (TextUtils.isEmpty(this.f55244U) || m56816f3(this.f55246W, this.f55244U, this.f55245V)) {
                    finish();
                }
            } else {
                AbstractC23034c6.m118170o0(this, new InterfaceC17463d.d() { // from class: h40.k0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        IntentHandlerBaseActivity.this.m56811Y2(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: h40.l0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        IntentHandlerBaseActivity.this.m56812b3(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.c() { // from class: h40.m0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        IntentHandlerBaseActivity.this.m56813d3(interfaceC17463d);
                    }
                });
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        if (!C23269y3.m120038e(getResources().getConfiguration()).equals(AbstractC18458a.f93019a)) {
            recreate();
        }
        super.onStart();
    }
}
