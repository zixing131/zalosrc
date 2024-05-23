package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C4083c;
import com.google.android.gms.common.internal.AbstractC4205o;

@KeepName
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: p */
    protected int f16161p = 0;

    /* renamed from: a */
    public static Intent m19217a(Context context, PendingIntent pendingIntent, int i11, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i11);
        intent.putExtra("notify_manager", z11);
        return intent;
    }

    /* renamed from: b */
    private final void m19218b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f16161p = 1;
                return;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    C4083c.m19370y(this).m19377J(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.f16161p = 1;
                finish();
                return;
            } catch (IntentSender.SendIntentException unused2) {
                finish();
                return;
            }
        }
        C4070a.m19196p().m19205q(this, ((Integer) AbstractC4205o.m19722k(num)).intValue(), 2, this);
        this.f16161p = 1;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f16161p = 0;
            setResult(i12, intent);
            if (booleanExtra) {
                C4083c m19370y = C4083c.m19370y(this);
                if (i12 != -1) {
                    if (i12 == 0) {
                        m19370y.m19377J(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    m19370y.m19378b();
                }
            }
        } else if (i11 == 2) {
            this.f16161p = 0;
            setResult(i12, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f16161p = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16161p = bundle.getInt("resolution");
        }
        if (this.f16161p != 1) {
            m19218b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f16161p);
        super.onSaveInstanceState(bundle);
    }
}
