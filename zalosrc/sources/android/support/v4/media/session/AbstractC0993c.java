package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes2.dex */
abstract class AbstractC0993c {
    /* renamed from: a */
    public static boolean m4620a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: b */
    public static Object m4621b(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* renamed from: c */
    public static void m4622c(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
