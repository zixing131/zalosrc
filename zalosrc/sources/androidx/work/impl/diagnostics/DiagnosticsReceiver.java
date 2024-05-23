package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2253u;
import androidx.work.C2256x;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f9247a = AbstractC2253u.m11897i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC2253u.m11895e().mo11898a(f9247a, "Requesting diagnostics");
        try {
            AbstractC2151i0.m11547h(context).m11551c(C2256x.m11909e(DiagnosticsWorker.class));
        } catch (IllegalStateException e11) {
            AbstractC2253u.m11895e().mo11901d(f9247a, "WorkManager is not initialized", e11);
        }
    }
}
