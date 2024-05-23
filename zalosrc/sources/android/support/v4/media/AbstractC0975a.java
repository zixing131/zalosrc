package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes2.dex */
abstract class AbstractC0975a {

    /* renamed from: android.support.v4.media.a$a */
    /* loaded from: classes2.dex */
    interface a {
        /* renamed from: a */
        void mo4526a();

        /* renamed from: c */
        void mo4527c();

        /* renamed from: d */
        void mo4528d();
    }

    /* renamed from: android.support.v4.media.a$b */
    /* loaded from: classes2.dex */
    static class b extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        protected final a f3505a;

        public b(a aVar) {
            this.f3505a = aVar;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f3505a.mo4527c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f3505a.mo4526a();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f3505a.mo4528d();
        }
    }

    /* renamed from: a */
    public static void m4554a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static Object m4555b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* renamed from: c */
    public static Object m4556c(a aVar) {
        return new b(aVar);
    }

    /* renamed from: d */
    public static void m4557d(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: e */
    public static Bundle m4558e(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: f */
    public static Object m4559f(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }
}
