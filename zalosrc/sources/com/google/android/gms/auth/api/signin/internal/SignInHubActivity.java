package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.AbstractC1809a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.Status;
import p438q5.AbstractC25121a;
import p537u4.C27011d;
import p537u4.C27022o;
import p564v1.AbstractC27421b;

@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: V */
    private static boolean f16091V = false;

    /* renamed from: Q */
    private boolean f16092Q = false;

    /* renamed from: R */
    private SignInConfiguration f16093R;

    /* renamed from: S */
    private boolean f16094S;

    /* renamed from: T */
    private int f16095T;

    /* renamed from: U */
    private Intent f16096U;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    /* loaded from: classes2.dex */
    public class C4046a implements AbstractC1809a.a {
        private C4046a() {
        }

        @Override // androidx.loader.app.AbstractC1809a.a
        /* renamed from: a */
        public final /* synthetic */ void mo9422a(AbstractC27421b abstractC27421b, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f16095T, SignInHubActivity.this.f16096U);
            SignInHubActivity.this.finish();
        }

        @Override // androidx.loader.app.AbstractC1809a.a
        /* renamed from: b */
        public final AbstractC27421b mo9423b(int i11, Bundle bundle) {
            return new C27011d(SignInHubActivity.this, AbstractC4073c.m19254h());
        }

        @Override // androidx.loader.app.AbstractC1809a.a
        /* renamed from: c */
        public final void mo9424c(AbstractC27421b abstractC27421b) {
        }
    }

    /* renamed from: B2 */
    private final void m19138B2() {
        m8907a2().mo9420c(0, null, new C4046a());
        f16091V = false;
    }

    /* renamed from: t2 */
    private final void m19140t2(int i11) {
        Status status = new Status(i11);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f16091V = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i11, int i12, Intent intent) {
        if (this.f16092Q) {
            return;
        }
        setResult(0);
        if (i11 == 40962) {
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && signInAccount.m19130t() != null) {
                    GoogleSignInAccount m19130t = signInAccount.m19130t();
                    C27022o.m139165c(this).m139168b(this.f16093R.m19137t(), (GoogleSignInAccount) AbstractC25121a.m130214a(m19130t));
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", m19130t);
                    this.f16094S = true;
                    this.f16095T = i12;
                    this.f16096U = intent;
                    m19138B2();
                    return;
                }
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    m19140t2(intExtra);
                    return;
                }
            }
            m19140t2(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) AbstractC25121a.m130214a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            m19140t2(12500);
            return;
        }
        if (!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            }
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) AbstractC25121a.m130214a(intent.getBundleExtra("config"))).getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f16093R = signInConfiguration;
        if (bundle == null) {
            if (f16091V) {
                setResult(0);
                m19140t2(12502);
                return;
            }
            f16091V = true;
            Intent intent2 = new Intent(str);
            if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.f16093R);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (ActivityNotFoundException unused) {
                this.f16092Q = true;
                m19140t2(17);
                return;
            }
        }
        boolean z11 = bundle.getBoolean("signingInGoogleApiClients");
        this.f16094S = z11;
        if (z11) {
            this.f16095T = bundle.getInt("signInResultCode");
            this.f16096U = (Intent) AbstractC25121a.m130214a((Intent) bundle.getParcelable("signInResultData"));
            m19138B2();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f16094S);
        if (this.f16094S) {
            bundle.putInt("signInResultCode", this.f16095T);
            bundle.putParcelable("signInResultData", this.f16096U);
        }
    }
}
