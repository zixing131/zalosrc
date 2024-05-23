package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AbstractC1829c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.media.d */
/* loaded from: classes2.dex */
abstract class AbstractC1830d {

    /* renamed from: a */
    static Field f7550a;

    /* renamed from: androidx.media.d$a */
    /* loaded from: classes2.dex */
    static class a extends AbstractC1829c.a {
        a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
            MediaSessionCompat.m4600a(bundle);
            ((c) this.f7548p).mo9478c(str, new b(result), bundle);
        }
    }

    /* renamed from: androidx.media.d$b */
    /* loaded from: classes2.dex */
    static class b {

        /* renamed from: a */
        MediaBrowserService.Result f7551a;

        b(MediaBrowserService.Result result) {
            this.f7551a = result;
        }

        /* renamed from: a */
        List m9506a(List list) {
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
        public void m9507b(List list, int i11) {
            try {
                AbstractC1830d.f7550a.setInt(this.f7551a, i11);
            } catch (IllegalAccessException unused) {
            }
            this.f7551a.sendResult(m9506a(list));
        }
    }

    /* renamed from: androidx.media.d$c */
    /* loaded from: classes2.dex */
    public interface c extends AbstractC1829c.b {
        /* renamed from: c */
        void mo9478c(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f7550a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: a */
    public static Object m9505a(Context context, c cVar) {
        return new a(context, cVar);
    }
}
