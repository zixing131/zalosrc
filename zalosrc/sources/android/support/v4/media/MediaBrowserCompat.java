package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.AbstractC0975a;
import android.support.v4.media.session.InterfaceC0992b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.core.app.AbstractC1336f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p664y.AbstractC30228a;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f3461b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final InterfaceC0965c f3462a;

    /* loaded from: classes2.dex */
    private static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        protected void mo4515a(int i11, Bundle bundle) {
        }
    }

    /* loaded from: classes2.dex */
    private static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        protected void mo4515a(int i11, Bundle bundle) {
            MediaSessionCompat.m4600a(bundle);
            if (i11 == 0) {
                if (bundle != null) {
                    if (bundle.containsKey("media_item")) {
                        Parcelable parcelable = bundle.getParcelable("media_item");
                        if (parcelable != null && !(parcelable instanceof MediaItem)) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0962a();

        /* renamed from: p */
        private final int f3463p;

        /* renamed from: q */
        private final MediaDescriptionCompat f3464q;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        /* loaded from: classes2.dex */
        static class C0962a implements Parcelable.Creator {
            C0962a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i11) {
                return new MediaItem[i11];
            }
        }

        MediaItem(Parcel parcel) {
            this.f3463p = parcel.readInt();
            this.f3464q = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f3463p + ", mDescription=" + this.f3464q + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f3463p);
            this.f3464q.writeToParcel(parcel, i11);
        }
    }

    /* loaded from: classes2.dex */
    private static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        protected void mo4515a(int i11, Bundle bundle) {
            MediaSessionCompat.m4600a(bundle);
            if (i11 == 0) {
                if (bundle != null) {
                    if (bundle.containsKey("search_results")) {
                        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                        if (parcelableArray != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : parcelableArray) {
                                arrayList.add((MediaItem) parcelable);
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    /* loaded from: classes2.dex */
    private static class HandlerC0963a extends Handler {

        /* renamed from: a */
        private final WeakReference f3465a;

        /* renamed from: b */
        private WeakReference f3466b;

        HandlerC0963a(InterfaceC0969g interfaceC0969g) {
            this.f3465a = new WeakReference(interfaceC0969g);
        }

        /* renamed from: a */
        void m4518a(Messenger messenger) {
            this.f3466b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f3466b;
            if (weakReference != null && weakReference.get() != null && this.f3465a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m4600a(data);
                InterfaceC0969g interfaceC0969g = (InterfaceC0969g) this.f3465a.get();
                Messenger messenger = (Messenger) this.f3466b.get();
                try {
                    int i11 = message.what;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unhandled message: ");
                                sb2.append(message);
                                sb2.append("\n  Client version: ");
                                sb2.append(1);
                                sb2.append("\n  Service version: ");
                                sb2.append(message.arg1);
                            } else {
                                Bundle bundle = data.getBundle("data_options");
                                MediaSessionCompat.m4600a(bundle);
                                Bundle bundle2 = data.getBundle("data_notify_children_changed_options");
                                MediaSessionCompat.m4600a(bundle2);
                                interfaceC0969g.mo4531e(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle, bundle2);
                            }
                        } else {
                            interfaceC0969g.mo4533h(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle("data_root_hints");
                        MediaSessionCompat.m4600a(bundle3);
                        interfaceC0969g.mo4532g(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        interfaceC0969g.mo4533h(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    /* loaded from: classes2.dex */
    public static class C0964b {

        /* renamed from: a */
        final Object f3467a = AbstractC0975a.m4556c(new b());

        /* renamed from: b */
        a f3468b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        /* loaded from: classes2.dex */
        public interface a {
            /* renamed from: a */
            void mo4523a();

            /* renamed from: c */
            void mo4524c();

            /* renamed from: d */
            void mo4525d();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        /* loaded from: classes2.dex */
        private class b implements AbstractC0975a.a {
            b() {
            }

            @Override // android.support.v4.media.AbstractC0975a.a
            /* renamed from: a */
            public void mo4526a() {
                a aVar = C0964b.this.f3468b;
                if (aVar != null) {
                    aVar.mo4523a();
                }
                C0964b.this.mo4520b();
            }

            @Override // android.support.v4.media.AbstractC0975a.a
            /* renamed from: c */
            public void mo4527c() {
                a aVar = C0964b.this.f3468b;
                if (aVar != null) {
                    aVar.mo4524c();
                }
                C0964b.this.mo4519a();
            }

            @Override // android.support.v4.media.AbstractC0975a.a
            /* renamed from: d */
            public void mo4528d() {
                a aVar = C0964b.this.f3468b;
                if (aVar != null) {
                    aVar.mo4525d();
                }
                C0964b.this.mo4521c();
            }
        }

        /* renamed from: a */
        public abstract void mo4519a();

        /* renamed from: b */
        public abstract void mo4520b();

        /* renamed from: c */
        public abstract void mo4521c();

        /* renamed from: d */
        void m4522d(a aVar) {
            this.f3468b = aVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    /* loaded from: classes2.dex */
    interface InterfaceC0965c {
        /* renamed from: b */
        void mo4529b();

        void disconnect();

        /* renamed from: f */
        MediaSessionCompat.Token mo4530f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    /* loaded from: classes2.dex */
    static class C0966d implements InterfaceC0965c, InterfaceC0969g, C0964b.a {

        /* renamed from: a */
        final Context f3470a;

        /* renamed from: b */
        protected final Object f3471b;

        /* renamed from: c */
        protected final Bundle f3472c;

        /* renamed from: d */
        protected final HandlerC0963a f3473d = new HandlerC0963a(this);

        /* renamed from: e */
        private final C30239a f3474e = new C30239a();

        /* renamed from: f */
        protected int f3475f;

        /* renamed from: g */
        protected C0970h f3476g;

        /* renamed from: h */
        protected Messenger f3477h;

        /* renamed from: i */
        private MediaSessionCompat.Token f3478i;

        C0966d(Context context, ComponentName componentName, C0964b c0964b, Bundle bundle) {
            Bundle bundle2;
            this.f3470a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f3472c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            c0964b.m4522d(this);
            this.f3471b = AbstractC0975a.m4555b(context, componentName, c0964b.f3467a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0964b.a
        /* renamed from: a */
        public void mo4523a() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0965c
        /* renamed from: b */
        public void mo4529b() {
            AbstractC0975a.m4554a(this.f3471b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0964b.a
        /* renamed from: c */
        public void mo4524c() {
            Bundle m4558e = AbstractC0975a.m4558e(this.f3471b);
            if (m4558e == null) {
                return;
            }
            this.f3475f = m4558e.getInt("extra_service_version", 0);
            IBinder m6712a = AbstractC1336f.m6712a(m4558e, "extra_messenger");
            if (m6712a != null) {
                this.f3476g = new C0970h(m6712a, this.f3472c);
                Messenger messenger = new Messenger(this.f3473d);
                this.f3477h = messenger;
                this.f3473d.m4518a(messenger);
                try {
                    this.f3476g.m4535a(this.f3470a, this.f3477h);
                } catch (RemoteException unused) {
                }
            }
            InterfaceC0992b m4619E = InterfaceC0992b.a.m4619E(AbstractC1336f.m6712a(m4558e, "extra_session_binder"));
            if (m4619E != null) {
                this.f3478i = MediaSessionCompat.Token.m4606b(AbstractC0975a.m4559f(this.f3471b), m4619E);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0964b.a
        /* renamed from: d */
        public void mo4525d() {
            this.f3476g = null;
            this.f3477h = null;
            this.f3478i = null;
            this.f3473d.m4518a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0965c
        public void disconnect() {
            Messenger messenger;
            C0970h c0970h = this.f3476g;
            if (c0970h != null && (messenger = this.f3477h) != null) {
                try {
                    c0970h.m4536c(messenger);
                } catch (RemoteException unused) {
                }
            }
            AbstractC0975a.m4557d(this.f3471b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0969g
        /* renamed from: e */
        public void mo4531e(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f3477h != messenger) {
                return;
            }
            AbstractC30228a.m149044a(this.f3474e.get(str));
            if (MediaBrowserCompat.f3461b) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLoadChildren for id that isn't subscribed id=");
                sb2.append(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0965c
        /* renamed from: f */
        public MediaSessionCompat.Token mo4530f() {
            if (this.f3478i == null) {
                this.f3478i = MediaSessionCompat.Token.m4605a(AbstractC0975a.m4559f(this.f3471b));
            }
            return this.f3478i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0969g
        /* renamed from: g */
        public void mo4532g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0969g
        /* renamed from: h */
        public void mo4533h(Messenger messenger) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    /* loaded from: classes2.dex */
    static class C0967e extends C0966d {
        C0967e(Context context, ComponentName componentName, C0964b c0964b, Bundle bundle) {
            super(context, componentName, c0964b, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    /* loaded from: classes2.dex */
    static class C0968f extends C0967e {
        C0968f(Context context, ComponentName componentName, C0964b c0964b, Bundle bundle) {
            super(context, componentName, c0964b, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    /* loaded from: classes2.dex */
    interface InterfaceC0969g {
        /* renamed from: e */
        void mo4531e(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        /* renamed from: g */
        void mo4532g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: h */
        void mo4533h(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    /* loaded from: classes2.dex */
    private static class C0970h {

        /* renamed from: a */
        private Messenger f3479a;

        /* renamed from: b */
        private Bundle f3480b;

        public C0970h(IBinder iBinder, Bundle bundle) {
            this.f3479a = new Messenger(iBinder);
            this.f3480b = bundle;
        }

        /* renamed from: b */
        private void m4534b(int i11, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i11;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f3479a.send(obtain);
        }

        /* renamed from: a */
        void m4535a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f3480b);
            m4534b(6, bundle, messenger);
        }

        /* renamed from: c */
        void m4536c(Messenger messenger) {
            m4534b(7, null, messenger);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0964b c0964b, Bundle bundle) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f3462a = new C0968f(context, componentName, c0964b, bundle);
        } else if (i11 >= 23) {
            this.f3462a = new C0967e(context, componentName, c0964b, bundle);
        } else {
            this.f3462a = new C0966d(context, componentName, c0964b, bundle);
        }
    }

    /* renamed from: a */
    public void m4512a() {
        this.f3462a.mo4529b();
    }

    /* renamed from: b */
    public void m4513b() {
        this.f3462a.disconnect();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token m4514c() {
        return this.f3462a.mo4530f();
    }
}
