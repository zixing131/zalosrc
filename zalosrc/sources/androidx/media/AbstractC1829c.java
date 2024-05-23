package androidx.media;

import android.content.Context;
import android.service.media.MediaBrowserService;
import androidx.media.AbstractC1828b;

/* renamed from: androidx.media.c */
/* loaded from: classes2.dex */
abstract class AbstractC1829c {

    /* renamed from: androidx.media.c$a */
    /* loaded from: classes2.dex */
    static class a extends AbstractC1828b.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result result) {
            ((b) this.f7548p).mo9476b(str, new AbstractC1828b.c(result));
        }
    }

    /* renamed from: androidx.media.c$b */
    /* loaded from: classes2.dex */
    public interface b extends AbstractC1828b.d {
        /* renamed from: b */
        void mo9476b(String str, AbstractC1828b.c cVar);
    }

    /* renamed from: a */
    public static Object m9504a(Context context, b bVar) {
        return new a(context, bVar);
    }
}
