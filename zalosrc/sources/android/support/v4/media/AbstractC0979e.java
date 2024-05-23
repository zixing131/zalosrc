package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
/* loaded from: classes2.dex */
abstract class AbstractC0979e {

    /* renamed from: android.support.v4.media.e$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        public static void m4581a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m4580a(Object obj) {
        Uri mediaUri;
        mediaUri = ((MediaDescription) obj).getMediaUri();
        return mediaUri;
    }
}
