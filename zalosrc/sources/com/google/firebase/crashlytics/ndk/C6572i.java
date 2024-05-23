package com.google.firebase.crashlytics.ndk;

import java.io.File;
import p292k8.AbstractC21569b0;

/* renamed from: com.google.firebase.crashlytics.ndk.i */
/* loaded from: classes.dex */
final class C6572i {

    /* renamed from: a */
    public final c f36481a;

    /* renamed from: b */
    public final File f36482b;

    /* renamed from: c */
    public final File f36483c;

    /* renamed from: d */
    public final File f36484d;

    /* renamed from: e */
    public final File f36485e;

    /* renamed from: f */
    public final File f36486f;

    /* renamed from: g */
    public final File f36487g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.ndk.i$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private c f36488a;

        /* renamed from: b */
        private File f36489b;

        /* renamed from: c */
        private File f36490c;

        /* renamed from: d */
        private File f36491d;

        /* renamed from: e */
        private File f36492e;

        /* renamed from: f */
        private File f36493f;

        /* renamed from: g */
        private File f36494g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h */
        public b m33572h(File file) {
            this.f36492e = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public C6572i m33573i() {
            return new C6572i(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public b m33574j(File file) {
            this.f36493f = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public b m33575k(File file) {
            this.f36490c = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l */
        public b m33576l(c cVar) {
            this.f36488a = cVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m */
        public b m33577m(File file) {
            this.f36494g = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public b m33578n(File file) {
            this.f36491d = file;
            return this;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.ndk.i$c */
    /* loaded from: classes3.dex */
    static final class c {

        /* renamed from: a */
        public final File f36495a;

        /* renamed from: b */
        public final AbstractC21569b0.a f36496b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(File file, AbstractC21569b0.a aVar) {
            this.f36495a = file;
            this.f36496b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m33579a() {
            File file = this.f36495a;
            if ((file != null && file.exists()) || this.f36496b != null) {
                return true;
            }
            return false;
        }
    }

    private C6572i(b bVar) {
        this.f36481a = bVar.f36488a;
        this.f36482b = bVar.f36489b;
        this.f36483c = bVar.f36490c;
        this.f36484d = bVar.f36491d;
        this.f36485e = bVar.f36492e;
        this.f36486f = bVar.f36493f;
        this.f36487g = bVar.f36494g;
    }
}
