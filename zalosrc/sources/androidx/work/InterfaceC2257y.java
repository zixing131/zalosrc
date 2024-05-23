package androidx.work;

import androidx.lifecycle.LiveData;

/* renamed from: androidx.work.y */
/* loaded from: classes.dex */
public interface InterfaceC2257y {

    /* renamed from: a */
    public static final b.c f9481a;

    /* renamed from: b */
    public static final b.C32644b f9482b;

    /* renamed from: androidx.work.y$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: androidx.work.y$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final Throwable f9483a;

            public a(Throwable th2) {
                this.f9483a = th2;
            }

            /* renamed from: a */
            public Throwable m11913a() {
                return this.f9483a;
            }

            public String toString() {
                return "FAILURE (" + this.f9483a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.y$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32644b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C32644b() {
            }
        }

        /* renamed from: androidx.work.y$b$c */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f9481a = new b.c();
        f9482b = new b.C32644b();
    }

    LiveData getState();
}
