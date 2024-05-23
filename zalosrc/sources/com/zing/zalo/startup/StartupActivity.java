package com.zing.zalo.startup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b30.AbstractC2506b;
import com.zing.zalo.startup.StartupApplication;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;

/* loaded from: classes.dex */
public class StartupActivity extends Activity implements StartupApplication.InterfaceC10902b {
    @Override // com.zing.zalo.startup.StartupApplication.InterfaceC10902b
    /* renamed from: a */
    public void mo12585a() {
        AbstractC20110a.m104535d("onOpenUiInitialized", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC20110a.m104535d("show StartupActivity", new Object[0]);
        Intent intent = getIntent();
        AbstractC19074t.m100207e(intent, "intent");
        AbstractC2506b.m12587b(intent);
        StartupApplication.Companion.m56558a().m56554m(this);
    }
}
