package me.zalo.startuphelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes7.dex */
public class StartupHelperReceiver extends BroadcastReceiver {

    /* renamed from: me.zalo.startuphelper.StartupHelperReceiver$a */
    /* loaded from: classes7.dex */
    class RunnableC22996a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Context f111828p;

        /* renamed from: q */
        final /* synthetic */ int f111829q;

        RunnableC22996a(Context context, int i11) {
            this.f111828p = context;
            this.f111829q = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC23000d.m117859q(this.f111828p, this.f111829q);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        if (intent.getAction() == null || !"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || (intExtra = intent.getIntExtra("android.intent.extra.UID", 0)) == 0) {
            return;
        }
        AbstractC23004h.m117868a(new RunnableC22996a(context, intExtra));
    }
}
