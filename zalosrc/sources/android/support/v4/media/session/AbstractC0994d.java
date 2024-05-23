package android.support.v4.media.session;

import android.media.session.MediaSession;

/* renamed from: android.support.v4.media.session.d */
/* loaded from: classes2.dex */
abstract class AbstractC0994d {
    /* renamed from: a */
    public static Object m4623a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
