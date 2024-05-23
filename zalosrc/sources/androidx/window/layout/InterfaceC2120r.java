package androidx.window.layout;

import fn0.AbstractC19060k;

/* renamed from: androidx.window.layout.r */
/* loaded from: classes2.dex */
public interface InterfaceC2120r extends InterfaceC2113l {

    /* renamed from: androidx.window.layout.r$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b */
        public static final C32642a f8991b = new C32642a(null);

        /* renamed from: c */
        public static final a f8992c = new a("FLAT");

        /* renamed from: d */
        public static final a f8993d = new a("HALF_OPENED");

        /* renamed from: a */
        private final String f8994a;

        /* renamed from: androidx.window.layout.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32642a {
            private C32642a() {
            }

            public /* synthetic */ C32642a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        private a(String str) {
            this.f8994a = str;
        }

        public String toString() {
            return this.f8994a;
        }
    }

    a getState();
}
