package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC1023b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC1022a;
import com.android.billingclient.api.C3918k;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import p145f0.C18684b;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes2.dex */
public class ProxyBillingActivity extends ComponentActivity {

    /* renamed from: G */
    private AbstractC1023b f15463G;

    /* renamed from: H */
    private ResultReceiver f15464H;

    /* renamed from: I */
    private ResultReceiver f15465I;

    /* renamed from: J */
    private ResultReceiver f15466J;

    /* renamed from: K */
    private boolean f15467K;

    /* renamed from: L */
    private boolean f15468L;

    /* renamed from: T1 */
    private Intent m18518T1(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* renamed from: V1 */
    private Intent m18519V1() {
        getApplicationContext().getPackageName();
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void m18520Y1(ActivityResult activityResult) {
        Bundle extras;
        Intent m4669a = activityResult.m4669a();
        int m30534c = AbstractC5856w.m30534c(m4669a, "ProxyBillingActivity");
        ResultReceiver resultReceiver = this.f15466J;
        if (resultReceiver != null) {
            if (m4669a == null) {
                extras = null;
            } else {
                extras = m4669a.getExtras();
            }
            resultReceiver.send(m30534c, extras);
        }
        if (activityResult.m4670b() != -1 || m30534c != 0) {
            AbstractC5856w.m30542k("ProxyBillingActivity", "Alternative billing only dialog finished with resultCode " + activityResult.m4670b() + " and billing's responseCode: " + m30534c);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i11, int i12, Intent intent) {
        ResultReceiver resultReceiver;
        Intent m18519V1;
        super.onActivityResult(i11, i12, intent);
        Bundle bundle = null;
        if (i11 != 100 && i11 != 110) {
            if (i11 == 101) {
                int m30532a = AbstractC5856w.m30532a(intent, "ProxyBillingActivity");
                ResultReceiver resultReceiver2 = this.f15465I;
                if (resultReceiver2 != null) {
                    if (intent != null) {
                        bundle = intent.getExtras();
                    }
                    resultReceiver2.send(m30532a, bundle);
                }
            } else {
                AbstractC5856w.m30542k("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i11 + "; skipping...");
            }
        } else {
            int m30534c = AbstractC5856w.m30534c(intent, "ProxyBillingActivity");
            if (i12 == -1) {
                if (m30534c != 0) {
                    i12 = -1;
                } else {
                    m30534c = 0;
                    resultReceiver = this.f15464H;
                    if (resultReceiver == null) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        resultReceiver.send(m30534c, bundle);
                    } else {
                        if (intent != null) {
                            if (intent.getExtras() != null) {
                                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                                if (string != null) {
                                    m18519V1 = m18518T1(string);
                                    m18519V1.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                } else {
                                    m18519V1 = m18519V1();
                                    m18519V1.putExtras(intent.getExtras());
                                    m18519V1.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                }
                            } else {
                                m18519V1 = m18519V1();
                                AbstractC5856w.m30542k("ProxyBillingActivity", "Got null bundle!");
                                m18519V1.putExtra("RESPONSE_CODE", 6);
                                m18519V1.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                                C3918k.a m18648c = C3918k.m18648c();
                                m18648c.m18655c(6);
                                m18648c.m18654b("An internal error occurred.");
                                m18519V1.putExtra("FAILURE_LOGGING_PAYLOAD", AbstractC3941r0.m18694a(22, 2, m18648c.m18653a()).m30565c());
                                m18519V1.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            }
                        } else {
                            m18519V1 = m18519V1();
                        }
                        if (i11 == 110) {
                            m18519V1.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(m18519V1);
                    }
                }
            }
            AbstractC5856w.m30542k("ProxyBillingActivity", "Activity finished with resultCode " + i12 + " and billing's responseCode: " + m30534c);
            resultReceiver = this.f15464H;
            if (resultReceiver == null) {
            }
        }
        this.f15467K = false;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i11;
        super.onCreate(bundle);
        this.f15463G = m4641F1(new C18684b(), new InterfaceC1022a() { // from class: com.android.billingclient.api.m1
            @Override // androidx.activity.result.InterfaceC1022a
            /* renamed from: a */
            public final void mo4692a(Object obj) {
                ProxyBillingActivity.this.m18520Y1((ActivityResult) obj);
            }
        });
        if (bundle == null) {
            AbstractC5856w.m30541j("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.f15466J = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.f15463G.m4693a(new IntentSenderRequest.C1021b(pendingIntent2).m4691a());
                return;
            }
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f15468L = true;
                    i11 = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10;
                }
                i11 = 100;
            } else {
                if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f15464H = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f15465I = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i11 = 101;
                } else {
                    pendingIntent = null;
                }
                i11 = 100;
            }
            try {
                this.f15467K = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i11, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e11) {
                AbstractC5856w.m30543l("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e11);
                ResultReceiver resultReceiver = this.f15464H;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f15465I;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent m18519V1 = m18519V1();
                        if (this.f15468L) {
                            m18519V1.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        m18519V1.putExtra("RESPONSE_CODE", 6);
                        m18519V1.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(m18519V1);
                    }
                }
                this.f15467K = false;
                finish();
                return;
            }
        }
        AbstractC5856w.m30541j("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f15467K = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.f15464H = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f15465I = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f15466J = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        }
        this.f15468L = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f15467K) {
            Intent m18519V1 = m18519V1();
            m18519V1.putExtra("RESPONSE_CODE", 1);
            m18519V1.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(m18519V1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f15464H;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f15465I;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f15466J;
        if (resultReceiver3 != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver3);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f15467K);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f15468L);
    }
}
