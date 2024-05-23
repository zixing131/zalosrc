package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p010a4.AbstractC0123p;
import p010a4.C0128u;
import p314l4.AbstractC22060a;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18907b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i11 = intent.getExtras().getInt("attemptNumber");
        C0128u.m563f(context);
        AbstractC0123p.a mo519d = AbstractC0123p.m549a().mo517b(queryParameter).mo519d(AbstractC22060a.m115181b(intValue));
        if (queryParameter2 != null) {
            mo519d.mo518c(Base64.decode(queryParameter2, 0));
        }
        C0128u.m561c().m564e().m103513v(mo519d.mo516a(), i11, new Runnable() { // from class: h4.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m18907b();
            }
        });
    }
}
