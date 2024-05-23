package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.AbstractC6501a;
import p051c7.AbstractC3324s;
import p051c7.C3325t;

/* renamed from: com.google.android.play.core.appupdate.i */
/* loaded from: classes.dex */
public final class C6483i extends AbstractC3324s {
    public C6483i(Context context) {
        super(new C3325t("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p051c7.AbstractC3324s
    /* renamed from: a */
    public final void mo16792a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f14136a.m16797a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f14136a.m16797a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f14136a.m16797a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        AbstractC6501a m33368f = AbstractC6501a.m33368f(intent, this.f14136a);
        this.f14136a.m16797a("ListenerRegistryBroadcastReceiver.onReceive: %s", m33368f);
        m16795d(m33368f);
    }
}
