package androidx.lifecycle;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public abstract class AbstractC1785o {

    /* renamed from: a */
    private AtomicReference f7361a = new AtomicReference();

    /* renamed from: androidx.lifecycle.o$a */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C32633a Companion = new C32633a(null);

        /* renamed from: androidx.lifecycle.o$a$a */
        /* loaded from: classes.dex */
        public static final class C32633a {

            /* renamed from: androidx.lifecycle.o$a$a$a */
            /* loaded from: classes.dex */
            public /* synthetic */ class C32634a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f7362a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f7362a = iArr;
                }
            }

            private C32633a() {
            }

            public /* synthetic */ C32633a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final a m9341a(b bVar) {
                AbstractC19074t.m100208f(bVar, "state");
                int i11 = C32634a.f7362a[bVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return a.ON_PAUSE;
                    }
                    return a.ON_STOP;
                }
                return a.ON_DESTROY;
            }

            /* renamed from: b */
            public final a m9342b(b bVar) {
                AbstractC19074t.m100208f(bVar, "state");
                int i11 = C32634a.f7362a[bVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 5) {
                            return null;
                        }
                        return a.ON_CREATE;
                    }
                    return a.ON_RESUME;
                }
                return a.ON_START;
            }

            /* renamed from: c */
            public final a m9343c(b bVar) {
                AbstractC19074t.m100208f(bVar, "state");
                int i11 = C32634a.f7362a[bVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return a.ON_RESUME;
                    }
                    return a.ON_START;
                }
                return a.ON_CREATE;
            }
        }

        /* renamed from: androidx.lifecycle.o$a$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f7363a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f7363a = iArr;
            }
        }

        /* renamed from: c */
        public final b m9340c() {
            switch (b.f7363a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.o$b */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: c */
        public final boolean m9345c(b bVar) {
            AbstractC19074t.m100208f(bVar, "state");
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public abstract void mo9335a(InterfaceC1799v interfaceC1799v);

    /* renamed from: b */
    public abstract b mo9336b();

    /* renamed from: c */
    public final AtomicReference m9337c() {
        return this.f7361a;
    }

    /* renamed from: d */
    public abstract void mo9338d(InterfaceC1799v interfaceC1799v);
}
