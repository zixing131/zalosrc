package p025b;

/* renamed from: b.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2473b {

    /* renamed from: a */
    private static a f10078a = a.debug;

    /* renamed from: b.b$a */
    /* loaded from: classes2.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        verbose(1),
        debug(2),
        /* JADX INFO: Fake field, exist only in values array */
        info(3),
        /* JADX INFO: Fake field, exist only in values array */
        warning(4),
        error(5),
        /* JADX INFO: Fake field, exist only in values array */
        none(6);


        /* renamed from: p */
        private int f10082p;

        a(int i11) {
            this.f10082p = i11;
        }

        /* renamed from: b */
        public int m12490b() {
            return this.f10082p;
        }
    }

    /* renamed from: a */
    public static void m12488a(String str, String str2) {
        f10078a.m12490b();
        a.debug.m12490b();
    }

    /* renamed from: b */
    public static void m12489b(String str, String str2, Exception exc) {
        f10078a.m12490b();
        a.error.m12490b();
    }
}
