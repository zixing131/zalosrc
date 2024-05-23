package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.media.b */
/* loaded from: classes2.dex */
abstract class AbstractC1828b {

    /* renamed from: androidx.media.b$a */
    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a */
        final String f7546a;

        /* renamed from: b */
        final Bundle f7547b;
    }

    /* renamed from: androidx.media.b$b */
    /* loaded from: classes2.dex */
    static class b extends MediaBrowserService {

        /* renamed from: p */
        final d f7548p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Context context, d dVar) {
            attachBaseContext(context);
            this.f7548p = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i11, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.m4600a(bundle);
            d dVar = this.f7548p;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            dVar.mo9473d(str, i11, bundle2);
            return null;
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result result) {
            this.f7548p.mo9474e(str, new c(result));
        }
    }

    /* renamed from: androidx.media.b$c */
    /* loaded from: classes2.dex */
    static class c {

        /* renamed from: a */
        MediaBrowserService.Result f7549a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(MediaBrowserService.Result result) {
            this.f7549a = result;
        }

        /* renamed from: a */
        List m9502a(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* renamed from: b */
        public void m9503b(Object obj) {
            if (obj instanceof List) {
                this.f7549a.sendResult(m9502a((List) obj));
                return;
            }
            if (obj instanceof Parcel) {
                Parcel parcel = (Parcel) obj;
                parcel.setDataPosition(0);
                this.f7549a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            this.f7549a.sendResult(null);
        }
    }

    /* renamed from: androidx.media.b$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: d */
        a mo9473d(String str, int i11, Bundle bundle);

        /* renamed from: e */
        void mo9474e(String str, c cVar);
    }

    /* renamed from: a */
    public static Object m9499a(Context context, d dVar) {
        return new b(context, dVar);
    }

    /* renamed from: b */
    public static IBinder m9500b(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: c */
    public static void m9501c(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }
}
