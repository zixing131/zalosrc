package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.InterfaceC0992b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.AbstractC1336f;
import androidx.core.util.C1483e;
import androidx.media.AbstractC1828b;
import androidx.media.AbstractC1829c;
import androidx.media.AbstractC1830d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: u */
    static final boolean f7459u = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: p */
    private InterfaceC1817g f7460p;

    /* renamed from: r */
    C1816f f7462r;

    /* renamed from: t */
    MediaSessionCompat.Token f7464t;

    /* renamed from: q */
    final C30239a f7461q = new C30239a();

    /* renamed from: s */
    final HandlerC1826p f7463s = new HandlerC1826p();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    /* loaded from: classes2.dex */
    public class C1811a extends C1822l {

        /* renamed from: f */
        final /* synthetic */ C1816f f7465f;

        /* renamed from: g */
        final /* synthetic */ String f7466g;

        /* renamed from: h */
        final /* synthetic */ Bundle f7467h;

        /* renamed from: i */
        final /* synthetic */ Bundle f7468i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1811a(Object obj, C1816f c1816f, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f7465f = c1816f;
            this.f7466g = str;
            this.f7467h = bundle;
            this.f7468i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C1822l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo9465d(List list) {
            if (MediaBrowserServiceCompat.this.f7461q.get(this.f7465f.f7481f.asBinder()) != this.f7465f) {
                if (MediaBrowserServiceCompat.f7459u) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb2.append(this.f7465f.f7476a);
                    sb2.append(" id=");
                    sb2.append(this.f7466g);
                    return;
                }
                return;
            }
            if ((m9480a() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.m9450b(list, this.f7467h);
            }
            try {
                this.f7465f.f7481f.mo9494a(this.f7466g, list, this.f7467h, this.f7468i);
            } catch (RemoteException unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Calling onLoadChildren() failed for id=");
                sb3.append(this.f7466g);
                sb3.append(" package=");
                sb3.append(this.f7465f.f7476a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    /* loaded from: classes2.dex */
    public class C1812b extends C1822l {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f7470f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1812b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f7470f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C1822l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo9465d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((m9480a() & 2) != 0) {
                this.f7470f.m4624b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f7470f.m4624b(0, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    /* loaded from: classes2.dex */
    public class C1813c extends C1822l {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f7472f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1813c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f7472f = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C1822l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo9465d(List list) {
            if ((m9480a() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.f7472f.m4624b(0, bundle);
                return;
            }
            this.f7472f.m4624b(-1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    /* loaded from: classes2.dex */
    public class C1814d extends C1822l {

        /* renamed from: f */
        final /* synthetic */ ResultReceiver f7474f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1814d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f7474f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C1822l
        /* renamed from: c */
        void mo9469c(Bundle bundle) {
            this.f7474f.m4624b(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.C1822l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo9465d(Bundle bundle) {
            this.f7474f.m4624b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    /* loaded from: classes2.dex */
    public static final class C1815e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    /* loaded from: classes2.dex */
    public class C1816f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f7476a;

        /* renamed from: b */
        public final int f7477b;

        /* renamed from: c */
        public final int f7478c;

        /* renamed from: d */
        public final C1831e f7479d;

        /* renamed from: e */
        public final Bundle f7480e;

        /* renamed from: f */
        public final InterfaceC1824n f7481f;

        /* renamed from: g */
        public final HashMap f7482g = new HashMap();

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = C1816f.this;
                MediaBrowserServiceCompat.this.f7461q.remove(c1816f.f7481f.asBinder());
            }
        }

        C1816f(String str, int i11, int i12, Bundle bundle, InterfaceC1824n interfaceC1824n) {
            this.f7476a = str;
            this.f7477b = i11;
            this.f7478c = i12;
            this.f7479d = new C1831e(str, i11, i12);
            this.f7480e = bundle;
            this.f7481f = interfaceC1824n;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f7463s.post(new a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    /* loaded from: classes2.dex */
    interface InterfaceC1817g {
        /* renamed from: a */
        void mo9471a();

        /* renamed from: f */
        IBinder mo9472f(Intent intent);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    /* loaded from: classes2.dex */
    class C1818h implements InterfaceC1817g, AbstractC1828b.d {

        /* renamed from: a */
        final List f7485a = new ArrayList();

        /* renamed from: b */
        Object f7486b;

        /* renamed from: c */
        Messenger f7487c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        /* loaded from: classes2.dex */
        class a extends C1822l {

            /* renamed from: f */
            final /* synthetic */ AbstractC1828b.c f7489f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, AbstractC1828b.c cVar) {
                super(obj);
                this.f7489f = cVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C1822l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo9465d(List list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f7489f.m9503b(arrayList);
            }
        }

        C1818h() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC1817g
        /* renamed from: a */
        public void mo9471a() {
            Object m9499a = AbstractC1828b.m9499a(MediaBrowserServiceCompat.this, this);
            this.f7486b = m9499a;
            AbstractC1828b.m9501c(m9499a);
        }

        @Override // androidx.media.AbstractC1828b.d
        /* renamed from: d */
        public AbstractC1828b.a mo9473d(String str, int i11, Bundle bundle) {
            IBinder asBinder;
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.f7487c = new Messenger(MediaBrowserServiceCompat.this.f7463s);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                AbstractC1336f.m6713b(bundle2, "extra_messenger", this.f7487c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f7464t;
                if (token != null) {
                    InterfaceC0992b m4607c = token.m4607c();
                    if (m4607c == null) {
                        asBinder = null;
                    } else {
                        asBinder = m4607c.asBinder();
                    }
                    AbstractC1336f.m6713b(bundle2, "extra_session_binder", asBinder);
                } else {
                    this.f7485a.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f7462r = new C1816f(str, -1, i11, bundle, null);
            MediaBrowserServiceCompat.this.m9453e(str, i11, bundle);
            MediaBrowserServiceCompat.this.f7462r = null;
            return null;
        }

        @Override // androidx.media.AbstractC1828b.d
        /* renamed from: e */
        public void mo9474e(String str, AbstractC1828b.c cVar) {
            MediaBrowserServiceCompat.this.m9454f(str, new a(str, cVar));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC1817g
        /* renamed from: f */
        public IBinder mo9472f(Intent intent) {
            return AbstractC1828b.m9500b(this.f7486b, intent);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    /* loaded from: classes2.dex */
    class C1819i extends C1818h implements AbstractC1829c.b {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        /* loaded from: classes2.dex */
        class a extends C1822l {

            /* renamed from: f */
            final /* synthetic */ AbstractC1828b.c f7492f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, AbstractC1828b.c cVar) {
                super(obj);
                this.f7492f = cVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C1822l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo9465d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f7492f.m9503b(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f7492f.m9503b(obtain);
            }
        }

        C1819i() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C1818h, androidx.media.MediaBrowserServiceCompat.InterfaceC1817g
        /* renamed from: a */
        public void mo9471a() {
            Object m9504a = AbstractC1829c.m9504a(MediaBrowserServiceCompat.this, this);
            this.f7486b = m9504a;
            AbstractC1828b.m9501c(m9504a);
        }

        @Override // androidx.media.AbstractC1829c.b
        /* renamed from: b */
        public void mo9476b(String str, AbstractC1828b.c cVar) {
            MediaBrowserServiceCompat.this.m9456h(str, new a(str, cVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    /* loaded from: classes2.dex */
    class C1820j extends C1819i implements AbstractC1830d.c {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        /* loaded from: classes2.dex */
        class a extends C1822l {

            /* renamed from: f */
            final /* synthetic */ AbstractC1830d.b f7495f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, AbstractC1830d.b bVar) {
                super(obj);
                this.f7495f = bVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.C1822l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo9465d(List list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f7495f.m9507b(arrayList, m9480a());
            }
        }

        C1820j() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C1819i, androidx.media.MediaBrowserServiceCompat.C1818h, androidx.media.MediaBrowserServiceCompat.InterfaceC1817g
        /* renamed from: a */
        public void mo9471a() {
            Object m9505a = AbstractC1830d.m9505a(MediaBrowserServiceCompat.this, this);
            this.f7486b = m9505a;
            AbstractC1828b.m9501c(m9505a);
        }

        @Override // androidx.media.AbstractC1830d.c
        /* renamed from: c */
        public void mo9478c(String str, AbstractC1830d.b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.m9455g(str, new a(str, bVar), bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    /* loaded from: classes2.dex */
    class C1821k extends C1820j {
        C1821k() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    /* loaded from: classes2.dex */
    public static class C1822l {

        /* renamed from: a */
        private final Object f7498a;

        /* renamed from: b */
        private boolean f7499b;

        /* renamed from: c */
        private boolean f7500c;

        /* renamed from: d */
        private boolean f7501d;

        /* renamed from: e */
        private int f7502e;

        C1822l(Object obj) {
            this.f7498a = obj;
        }

        /* renamed from: a */
        int m9480a() {
            return this.f7502e;
        }

        /* renamed from: b */
        boolean m9481b() {
            return this.f7499b || this.f7500c || this.f7501d;
        }

        /* renamed from: c */
        void mo9469c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f7498a);
        }

        /* renamed from: d */
        abstract void mo9465d(Object obj);

        /* renamed from: e */
        public void m9482e(Bundle bundle) {
            if (!this.f7500c && !this.f7501d) {
                this.f7501d = true;
                mo9469c(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f7498a);
            }
        }

        /* renamed from: f */
        public void m9483f(Object obj) {
            if (!this.f7500c && !this.f7501d) {
                this.f7500c = true;
                mo9465d(obj);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f7498a);
            }
        }

        /* renamed from: g */
        void m9484g(int i11) {
            this.f7502e = i11;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    /* loaded from: classes2.dex */
    private class C1823m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$a */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7504p;

            /* renamed from: q */
            final /* synthetic */ String f7505q;

            /* renamed from: r */
            final /* synthetic */ int f7506r;

            /* renamed from: s */
            final /* synthetic */ int f7507s;

            /* renamed from: t */
            final /* synthetic */ Bundle f7508t;

            a(InterfaceC1824n interfaceC1824n, String str, int i11, int i12, Bundle bundle) {
                this.f7504p = interfaceC1824n;
                this.f7505q = str;
                this.f7506r = i11;
                this.f7507s = i12;
                this.f7508t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceCompat.this.f7461q.remove(this.f7504p.asBinder());
                C1816f c1816f = new C1816f(this.f7505q, this.f7506r, this.f7507s, this.f7508t, this.f7504p);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f7462r = c1816f;
                mediaBrowserServiceCompat.m9453e(this.f7505q, this.f7507s, this.f7508t);
                MediaBrowserServiceCompat.this.f7462r = null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No root for client ");
                sb2.append(this.f7505q);
                sb2.append(" from service ");
                sb2.append(getClass().getName());
                try {
                    this.f7504p.mo9495b();
                } catch (RemoteException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                    sb3.append(this.f7505q);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$b */
        /* loaded from: classes2.dex */
        public class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7510p;

            b(InterfaceC1824n interfaceC1824n) {
                this.f7510p = interfaceC1824n;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.remove(this.f7510p.asBinder());
                if (c1816f != null) {
                    c1816f.f7481f.asBinder().unlinkToDeath(c1816f, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$c */
        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7512p;

            /* renamed from: q */
            final /* synthetic */ String f7513q;

            /* renamed from: r */
            final /* synthetic */ IBinder f7514r;

            /* renamed from: s */
            final /* synthetic */ Bundle f7515s;

            c(InterfaceC1824n interfaceC1824n, String str, IBinder iBinder, Bundle bundle) {
                this.f7512p = interfaceC1824n;
                this.f7513q = str;
                this.f7514r = iBinder;
                this.f7515s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.get(this.f7512p.asBinder());
                if (c1816f == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("addSubscription for callback that isn't registered id=");
                    sb2.append(this.f7513q);
                    return;
                }
                MediaBrowserServiceCompat.this.m9449a(this.f7513q, c1816f, this.f7514r, this.f7515s);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$d */
        /* loaded from: classes2.dex */
        public class d implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7517p;

            /* renamed from: q */
            final /* synthetic */ String f7518q;

            /* renamed from: r */
            final /* synthetic */ IBinder f7519r;

            d(InterfaceC1824n interfaceC1824n, String str, IBinder iBinder) {
                this.f7517p = interfaceC1824n;
                this.f7518q = str;
                this.f7519r = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.get(this.f7517p.asBinder());
                if (c1816f == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription for callback that isn't registered id=");
                    sb2.append(this.f7518q);
                } else if (!MediaBrowserServiceCompat.this.m9464p(this.f7518q, c1816f, this.f7519r)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("removeSubscription called for ");
                    sb3.append(this.f7518q);
                    sb3.append(" which is not subscribed");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$e */
        /* loaded from: classes2.dex */
        public class e implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7521p;

            /* renamed from: q */
            final /* synthetic */ String f7522q;

            /* renamed from: r */
            final /* synthetic */ ResultReceiver f7523r;

            e(InterfaceC1824n interfaceC1824n, String str, ResultReceiver resultReceiver) {
                this.f7521p = interfaceC1824n;
                this.f7522q = str;
                this.f7523r = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.get(this.f7521p.asBinder());
                if (c1816f == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getMediaItem for callback that isn't registered id=");
                    sb2.append(this.f7522q);
                    return;
                }
                MediaBrowserServiceCompat.this.m9462n(this.f7522q, c1816f, this.f7523r);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$f */
        /* loaded from: classes2.dex */
        public class f implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7525p;

            /* renamed from: q */
            final /* synthetic */ String f7526q;

            /* renamed from: r */
            final /* synthetic */ int f7527r;

            /* renamed from: s */
            final /* synthetic */ int f7528s;

            /* renamed from: t */
            final /* synthetic */ Bundle f7529t;

            f(InterfaceC1824n interfaceC1824n, String str, int i11, int i12, Bundle bundle) {
                this.f7525p = interfaceC1824n;
                this.f7526q = str;
                this.f7527r = i11;
                this.f7528s = i12;
                this.f7529t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f7525p.asBinder();
                MediaBrowserServiceCompat.this.f7461q.remove(asBinder);
                C1816f c1816f = new C1816f(this.f7526q, this.f7527r, this.f7528s, this.f7529t, this.f7525p);
                MediaBrowserServiceCompat.this.f7461q.put(asBinder, c1816f);
                try {
                    asBinder.linkToDeath(c1816f, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$g */
        /* loaded from: classes2.dex */
        public class g implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7531p;

            g(InterfaceC1824n interfaceC1824n) {
                this.f7531p = interfaceC1824n;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f7531p.asBinder();
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.remove(asBinder);
                if (c1816f != null) {
                    asBinder.unlinkToDeath(c1816f, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$h */
        /* loaded from: classes2.dex */
        public class h implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7533p;

            /* renamed from: q */
            final /* synthetic */ String f7534q;

            /* renamed from: r */
            final /* synthetic */ Bundle f7535r;

            /* renamed from: s */
            final /* synthetic */ ResultReceiver f7536s;

            h(InterfaceC1824n interfaceC1824n, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f7533p = interfaceC1824n;
                this.f7534q = str;
                this.f7535r = bundle;
                this.f7536s = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.get(this.f7533p.asBinder());
                if (c1816f == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("search for callback that isn't registered query=");
                    sb2.append(this.f7534q);
                    return;
                }
                MediaBrowserServiceCompat.this.m9463o(this.f7534q, this.f7535r, c1816f, this.f7536s);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.MediaBrowserServiceCompat$m$i */
        /* loaded from: classes2.dex */
        public class i implements Runnable {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1824n f7538p;

            /* renamed from: q */
            final /* synthetic */ String f7539q;

            /* renamed from: r */
            final /* synthetic */ Bundle f7540r;

            /* renamed from: s */
            final /* synthetic */ ResultReceiver f7541s;

            i(InterfaceC1824n interfaceC1824n, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f7538p = interfaceC1824n;
                this.f7539q = str;
                this.f7540r = bundle;
                this.f7541s = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1816f c1816f = (C1816f) MediaBrowserServiceCompat.this.f7461q.get(this.f7538p.asBinder());
                if (c1816f == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("sendCustomAction for callback that isn't registered action=");
                    sb2.append(this.f7539q);
                    sb2.append(", extras=");
                    sb2.append(this.f7540r);
                    return;
                }
                MediaBrowserServiceCompat.this.m9460l(this.f7539q, this.f7540r, c1816f, this.f7541s);
            }
        }

        C1823m() {
        }

        /* renamed from: a */
        public void m9485a(String str, IBinder iBinder, Bundle bundle, InterfaceC1824n interfaceC1824n) {
            MediaBrowserServiceCompat.this.f7463s.m9497a(new c(interfaceC1824n, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void m9486b(String str, int i11, int i12, Bundle bundle, InterfaceC1824n interfaceC1824n) {
            if (MediaBrowserServiceCompat.this.m9451c(str, i12)) {
                MediaBrowserServiceCompat.this.f7463s.m9497a(new a(interfaceC1824n, str, i11, i12, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i12 + " package=" + str);
        }

        /* renamed from: c */
        public void m9487c(InterfaceC1824n interfaceC1824n) {
            MediaBrowserServiceCompat.this.f7463s.m9497a(new b(interfaceC1824n));
        }

        /* renamed from: d */
        public void m9488d(String str, ResultReceiver resultReceiver, InterfaceC1824n interfaceC1824n) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f7463s.m9497a(new e(interfaceC1824n, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void m9489e(InterfaceC1824n interfaceC1824n, String str, int i11, int i12, Bundle bundle) {
            MediaBrowserServiceCompat.this.f7463s.m9497a(new f(interfaceC1824n, str, i11, i12, bundle));
        }

        /* renamed from: f */
        public void m9490f(String str, IBinder iBinder, InterfaceC1824n interfaceC1824n) {
            MediaBrowserServiceCompat.this.f7463s.m9497a(new d(interfaceC1824n, str, iBinder));
        }

        /* renamed from: g */
        public void m9491g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC1824n interfaceC1824n) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f7463s.m9497a(new h(interfaceC1824n, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void m9492h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC1824n interfaceC1824n) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f7463s.m9497a(new i(interfaceC1824n, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void m9493i(InterfaceC1824n interfaceC1824n) {
            MediaBrowserServiceCompat.this.f7463s.m9497a(new g(interfaceC1824n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    /* loaded from: classes2.dex */
    public interface InterfaceC1824n {
        /* renamed from: a */
        void mo9494a(String str, List list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        /* renamed from: b */
        void mo9495b();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    /* loaded from: classes2.dex */
    private static class C1825o implements InterfaceC1824n {

        /* renamed from: a */
        final Messenger f7543a;

        C1825o(Messenger messenger) {
            this.f7543a = messenger;
        }

        /* renamed from: c */
        private void m9496c(int i11, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i11;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f7543a.send(obtain);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC1824n
        /* renamed from: a */
        public void mo9494a(String str, List list, Bundle bundle, Bundle bundle2) {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList("data_media_item_list", arrayList);
            }
            m9496c(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC1824n
        public IBinder asBinder() {
            return this.f7543a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC1824n
        /* renamed from: b */
        public void mo9495b() {
            m9496c(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    /* loaded from: classes2.dex */
    public final class HandlerC1826p extends Handler {

        /* renamed from: a */
        private final C1823m f7544a;

        HandlerC1826p() {
            this.f7544a = new C1823m();
        }

        /* renamed from: a */
        public void m9497a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m4600a(bundle);
                    this.f7544a.m9486b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C1825o(message.replyTo));
                    return;
                case 2:
                    this.f7544a.m9487c(new C1825o(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m4600a(bundle2);
                    this.f7544a.m9485a(data.getString("data_media_item_id"), AbstractC1336f.m6712a(data, "data_callback_token"), bundle2, new C1825o(message.replyTo));
                    return;
                case 4:
                    this.f7544a.m9490f(data.getString("data_media_item_id"), AbstractC1336f.m6712a(data, "data_callback_token"), new C1825o(message.replyTo));
                    return;
                case 5:
                    this.f7544a.m9488d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C1825o(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m4600a(bundle3);
                    this.f7544a.m9489e(new C1825o(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f7544a.m9493i(new C1825o(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m4600a(bundle4);
                    this.f7544a.m9491g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C1825o(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m4600a(bundle5);
                    this.f7544a.m9492h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C1825o(message.replyTo));
                    return;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unhandled message: ");
                    sb2.append(message);
                    sb2.append("\n  Service version: ");
                    sb2.append(2);
                    sb2.append("\n  Client version: ");
                    sb2.append(message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j11) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j11);
        }
    }

    /* renamed from: a */
    void m9449a(String str, C1816f c1816f, IBinder iBinder, Bundle bundle) {
        List<C1483e> list = (List) c1816f.f7482g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (C1483e c1483e : list) {
            if (iBinder == c1483e.f6374a && AbstractC1827a.m9498a(bundle, (Bundle) c1483e.f6375b)) {
                return;
            }
        }
        list.add(new C1483e(iBinder, bundle));
        c1816f.f7482g.put(str, list);
        m9461m(str, c1816f, bundle, null);
        this.f7462r = c1816f;
        m9458j(str, bundle);
        this.f7462r = null;
    }

    /* renamed from: b */
    List m9450b(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i11 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i12 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i11 == -1 && i12 == -1) {
            return list;
        }
        int i13 = i12 * i11;
        int i14 = i13 + i12;
        if (i11 >= 0 && i12 >= 1 && i13 < list.size()) {
            if (i14 > list.size()) {
                i14 = list.size();
            }
            return list.subList(i13, i14);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    boolean m9451c(String str, int i11) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i11)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m9452d(String str, Bundle bundle, C1822l c1822l) {
        c1822l.m9482e(null);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public abstract C1815e m9453e(String str, int i11, Bundle bundle);

    /* renamed from: f */
    public abstract void m9454f(String str, C1822l c1822l);

    /* renamed from: g */
    public void m9455g(String str, C1822l c1822l, Bundle bundle) {
        c1822l.m9484g(1);
        m9454f(str, c1822l);
    }

    /* renamed from: h */
    public void m9456h(String str, C1822l c1822l) {
        c1822l.m9484g(2);
        c1822l.m9483f(null);
    }

    /* renamed from: i */
    public void m9457i(String str, Bundle bundle, C1822l c1822l) {
        c1822l.m9484g(4);
        c1822l.m9483f(null);
    }

    /* renamed from: j */
    public void m9458j(String str, Bundle bundle) {
    }

    /* renamed from: k */
    public void m9459k(String str) {
    }

    /* renamed from: l */
    void m9460l(String str, Bundle bundle, C1816f c1816f, ResultReceiver resultReceiver) {
        C1814d c1814d = new C1814d(str, resultReceiver);
        this.f7462r = c1816f;
        m9452d(str, bundle, c1814d);
        this.f7462r = null;
        if (c1814d.m9481b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    /* renamed from: m */
    void m9461m(String str, C1816f c1816f, Bundle bundle, Bundle bundle2) {
        C1811a c1811a = new C1811a(str, c1816f, str, bundle, bundle2);
        this.f7462r = c1816f;
        if (bundle == null) {
            m9454f(str, c1811a);
        } else {
            m9455g(str, c1811a, bundle);
        }
        this.f7462r = null;
        if (c1811a.m9481b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c1816f.f7476a + " id=" + str);
    }

    /* renamed from: n */
    void m9462n(String str, C1816f c1816f, ResultReceiver resultReceiver) {
        C1812b c1812b = new C1812b(str, resultReceiver);
        this.f7462r = c1816f;
        m9456h(str, c1812b);
        this.f7462r = null;
        if (c1812b.m9481b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    /* renamed from: o */
    void m9463o(String str, Bundle bundle, C1816f c1816f, ResultReceiver resultReceiver) {
        C1813c c1813c = new C1813c(str, resultReceiver);
        this.f7462r = c1816f;
        m9457i(str, bundle, c1813c);
        this.f7462r = null;
        if (c1813c.m9481b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7460p.mo9472f(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.f7460p = new C1821k();
        } else if (i11 >= 26) {
            this.f7460p = new C1820j();
        } else if (i11 >= 23) {
            this.f7460p = new C1819i();
        } else {
            this.f7460p = new C1818h();
        }
        this.f7460p.mo9471a();
    }

    /* renamed from: p */
    boolean m9464p(String str, C1816f c1816f, IBinder iBinder) {
        boolean z11 = false;
        try {
            if (iBinder == null) {
                if (c1816f.f7482g.remove(str) != null) {
                    z11 = true;
                }
            } else {
                List list = (List) c1816f.f7482g.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((C1483e) it.next()).f6374a) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (list.size() == 0) {
                        c1816f.f7482g.remove(str);
                    }
                }
            }
            return z11;
        } finally {
            this.f7462r = c1816f;
            m9459k(str);
            this.f7462r = null;
        }
    }
}
