package p285k1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: k1.g */
/* loaded from: classes2.dex */
public final class C21433g {

    /* renamed from: a */
    private final c f104422a;

    /* renamed from: k1.g$b */
    /* loaded from: classes2.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final Uri f104424a;

        /* renamed from: b */
        private final ClipDescription f104425b;

        /* renamed from: c */
        private final Uri f104426c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f104424a = uri;
            this.f104425b = clipDescription;
            this.f104426c = uri2;
        }

        @Override // p285k1.C21433g.c
        /* renamed from: a */
        public Object mo110951a() {
            return null;
        }

        @Override // p285k1.C21433g.c
        /* renamed from: b */
        public Uri mo110952b() {
            return this.f104424a;
        }

        @Override // p285k1.C21433g.c
        /* renamed from: c */
        public void mo110953c() {
        }

        @Override // p285k1.C21433g.c
        public ClipDescription getDescription() {
            return this.f104425b;
        }

        @Override // p285k1.C21433g.c
        /* renamed from: i */
        public Uri mo110954i() {
            return this.f104426c;
        }
    }

    /* renamed from: k1.g$c */
    /* loaded from: classes2.dex */
    private interface c {
        /* renamed from: a */
        Object mo110951a();

        /* renamed from: b */
        Uri mo110952b();

        /* renamed from: c */
        void mo110953c();

        ClipDescription getDescription();

        /* renamed from: i */
        Uri mo110954i();
    }

    public C21433g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f104422a = new a(uri, clipDescription, uri2);
        } else {
            this.f104422a = new b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C21433g m110945f(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new C21433g(new a(obj));
    }

    /* renamed from: a */
    public Uri m110946a() {
        return this.f104422a.mo110952b();
    }

    /* renamed from: b */
    public ClipDescription m110947b() {
        return this.f104422a.getDescription();
    }

    /* renamed from: c */
    public Uri m110948c() {
        return this.f104422a.mo110954i();
    }

    /* renamed from: d */
    public void m110949d() {
        this.f104422a.mo110953c();
    }

    /* renamed from: e */
    public Object m110950e() {
        return this.f104422a.mo110951a();
    }

    /* renamed from: k1.g$a */
    /* loaded from: classes2.dex */
    private static final class a implements c {

        /* renamed from: a */
        final InputContentInfo f104423a;

        a(Object obj) {
            this.f104423a = (InputContentInfo) obj;
        }

        @Override // p285k1.C21433g.c
        /* renamed from: a */
        public Object mo110951a() {
            return this.f104423a;
        }

        @Override // p285k1.C21433g.c
        /* renamed from: b */
        public Uri mo110952b() {
            return this.f104423a.getContentUri();
        }

        @Override // p285k1.C21433g.c
        /* renamed from: c */
        public void mo110953c() {
            this.f104423a.requestPermission();
        }

        @Override // p285k1.C21433g.c
        public ClipDescription getDescription() {
            return this.f104423a.getDescription();
        }

        @Override // p285k1.C21433g.c
        /* renamed from: i */
        public Uri mo110954i() {
            return this.f104423a.getLinkUri();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f104423a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C21433g(c cVar) {
        this.f104422a = cVar;
    }
}
