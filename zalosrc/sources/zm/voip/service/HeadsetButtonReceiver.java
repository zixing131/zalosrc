package zm.voip.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import bp0.AbstractC3082b0;

/* loaded from: classes7.dex */
public class HeadsetButtonReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static boolean m155534a(Context context) {
        return AbstractC32273e3.m155748Q().m155886i0(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        AbstractC3082b0.m15421c("HeadsetButtonReceiver", "onReceive");
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        AbstractC3082b0.m15421c("HeadsetButtonReceiver", "Key : " + keyEvent.getKeyCode());
        if (keyEvent.getAction() == 0) {
            if ((keyEvent.getKeyCode() == 79 || keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && m155534a(context)) {
                abortBroadcast();
            }
        }
    }
}
