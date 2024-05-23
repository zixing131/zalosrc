package androidx.work;

/* renamed from: androidx.work.u */
/* loaded from: classes.dex */
public abstract class AbstractC2253u {

    /* renamed from: a */
    private static final Object f9468a = new Object();

    /* renamed from: b */
    private static volatile AbstractC2253u f9469b = null;

    /* renamed from: c */
    private static final int f9470c = 20;

    /* renamed from: androidx.work.u$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2253u {

        /* renamed from: d */
        private final int f9471d;

        public a(int i11) {
            super(i11);
            this.f9471d = i11;
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: a */
        public void mo11898a(String str, String str2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: b */
        public void mo11899b(String str, String str2, Throwable th2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: c */
        public void mo11900c(String str, String str2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: d */
        public void mo11901d(String str, String str2, Throwable th2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: f */
        public void mo11902f(String str, String str2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: g */
        public void mo11903g(String str, String str2, Throwable th2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: j */
        public void mo11904j(String str, String str2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: k */
        public void mo11905k(String str, String str2) {
        }

        @Override // androidx.work.AbstractC2253u
        /* renamed from: l */
        public void mo11906l(String str, String str2, Throwable th2) {
        }
    }

    public AbstractC2253u(int i11) {
    }

    /* renamed from: e */
    public static AbstractC2253u m11895e() {
        AbstractC2253u abstractC2253u;
        synchronized (f9468a) {
            try {
                if (f9469b == null) {
                    f9469b = new a(3);
                }
                abstractC2253u = f9469b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC2253u;
    }

    /* renamed from: h */
    public static void m11896h(AbstractC2253u abstractC2253u) {
        synchronized (f9468a) {
            f9469b = abstractC2253u;
        }
    }

    /* renamed from: i */
    public static String m11897i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i11 = f9470c;
        if (length >= i11) {
            sb2.append(str.substring(0, i11));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract void mo11898a(String str, String str2);

    /* renamed from: b */
    public abstract void mo11899b(String str, String str2, Throwable th2);

    /* renamed from: c */
    public abstract void mo11900c(String str, String str2);

    /* renamed from: d */
    public abstract void mo11901d(String str, String str2, Throwable th2);

    /* renamed from: f */
    public abstract void mo11902f(String str, String str2);

    /* renamed from: g */
    public abstract void mo11903g(String str, String str2, Throwable th2);

    /* renamed from: j */
    public abstract void mo11904j(String str, String str2);

    /* renamed from: k */
    public abstract void mo11905k(String str, String str2);

    /* renamed from: l */
    public abstract void mo11906l(String str, String str2, Throwable th2);
}
