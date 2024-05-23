package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.InterfaceC0991a;
import android.support.v4.media.session.InterfaceC0992b;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.core.app.AbstractC1336f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final InterfaceC0982b f3506a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f3507b;

    /* renamed from: c */
    private final HashSet f3508c = new HashSet();

    /* loaded from: classes2.dex */
    static class MediaControllerImplApi21 implements InterfaceC0982b {

        /* renamed from: a */
        protected final Object f3509a;

        /* renamed from: b */
        final Object f3510b = new Object();

        /* renamed from: c */
        private final List f3511c = new ArrayList();

        /* renamed from: d */
        private HashMap f3512d = new HashMap();

        /* renamed from: e */
        final MediaSessionCompat.Token f3513e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: p */
            private WeakReference f3514p;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f3514p = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i11, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f3514p.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f3510b) {
                        mediaControllerImplApi21.f3513e.m4609e(InterfaceC0992b.a.m4619E(AbstractC1336f.m6712a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f3513e.m4610f(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.m4585b();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        /* loaded from: classes2.dex */
        public static class BinderC0980a extends AbstractC0981a.a {
            BinderC0980a(AbstractC0981a abstractC0981a) {
                super(abstractC0981a);
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: J0 */
            public void mo4587J0(List list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: R3 */
            public void mo4588R3(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: c3 */
            public void mo4589c3(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: p1 */
            public void mo4590p1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: r1 */
            public void mo4591r1(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: y2 */
            public void mo4592y2(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f3513e = token;
            Object m4621b = AbstractC0993c.m4621b(context, token.m4608d());
            this.f3509a = m4621b;
            if (m4621b != null) {
                if (token.m4607c() == null) {
                    m4583c();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }

        /* renamed from: c */
        private void m4583c() {
            m4586d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0982b
        /* renamed from: a */
        public boolean mo4584a(KeyEvent keyEvent) {
            return AbstractC0993c.m4620a(this.f3509a, keyEvent);
        }

        /* renamed from: b */
        void m4585b() {
            if (this.f3513e.m4607c() == null) {
                return;
            }
            Iterator it = this.f3511c.iterator();
            if (!it.hasNext()) {
                this.f3511c.clear();
                return;
            }
            AbstractC30228a.m149044a(it.next());
            this.f3512d.put(null, new BinderC0980a(null));
            throw null;
        }

        /* renamed from: d */
        public void m4586d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            AbstractC0993c.m4622c(this.f3509a, str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0981a implements IBinder.DeathRecipient {

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        /* loaded from: classes2.dex */
        private static class a extends InterfaceC0991a.a {

            /* renamed from: p */
            private final WeakReference f3515p;

            a(AbstractC0981a abstractC0981a) {
                this.f3515p = new WeakReference(abstractC0981a);
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: B3 */
            public void mo4593B3(boolean z11) {
                AbstractC30228a.m149044a(this.f3515p.get());
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: P3 */
            public void mo4594P3(boolean z11) {
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: Q4 */
            public void mo4595Q4(PlaybackStateCompat playbackStateCompat) {
                AbstractC30228a.m149044a(this.f3515p.get());
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: R */
            public void mo4596R(String str, Bundle bundle) {
                AbstractC30228a.m149044a(this.f3515p.get());
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: S1 */
            public void mo4597S1(int i11) {
                AbstractC30228a.m149044a(this.f3515p.get());
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: h4 */
            public void mo4598h4(int i11) {
                AbstractC30228a.m149044a(this.f3515p.get());
            }

            @Override // android.support.v4.media.session.InterfaceC0991a
            /* renamed from: v0 */
            public void mo4599v0() {
                AbstractC30228a.m149044a(this.f3515p.get());
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    /* loaded from: classes2.dex */
    interface InterfaceC0982b {
        /* renamed from: a */
        boolean mo4584a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    /* loaded from: classes2.dex */
    static class C0983c extends MediaControllerImplApi21 {
        public C0983c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    /* loaded from: classes2.dex */
    static class C0984d extends C0983c {
        public C0984d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f3507b = token;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                this.f3506a = new C0984d(context, token);
                return;
            } else if (i11 >= 23) {
                this.f3506a = new C0983c(context, token);
                return;
            } else {
                this.f3506a = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public boolean m4582a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f3506a.mo4584a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
