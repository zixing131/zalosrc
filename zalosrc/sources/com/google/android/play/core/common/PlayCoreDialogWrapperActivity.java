package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: p */
    private ResultReceiver f36323p;

    /* renamed from: a */
    private final void m33366a() {
        ResultReceiver resultReceiver = this.f36323p;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 0 && (resultReceiver = this.f36323p) != null) {
            if (i12 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i12 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f36323p = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                m33366a();
                finish();
                return;
            } else {
                try {
                    startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    m33366a();
                    finish();
                    return;
                }
            }
        }
        this.f36323p = (ResultReceiver) bundle.getParcelable("result_receiver");
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f36323p);
    }
}
