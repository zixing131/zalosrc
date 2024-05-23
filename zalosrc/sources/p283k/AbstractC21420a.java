package p283k;

/* renamed from: k.a */
/* loaded from: classes2.dex */
public abstract class AbstractC21420a {

    /* renamed from: a */
    private static a f104405a = a.debug;

    /* renamed from: k.a$a */
    /* loaded from: classes2.dex */
    public enum a {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);


        /* renamed from: p */
        private int f104413p;

        a(int i11) {
            this.f104413p = i11;
        }

        /* renamed from: b */
        public int m110925b() {
            return this.f104413p;
        }
    }

    /* renamed from: a */
    public static void m110921a(String str, String str2) {
        f104405a.m110925b();
        a.debug.m110925b();
    }

    /* renamed from: b */
    public static void m110922b(String str, String str2, Exception exc) {
        f104405a.m110925b();
        a.error.m110925b();
    }

    /* renamed from: c */
    public static void m110923c(String str, String str2) {
        f104405a.m110925b();
        a.error.m110925b();
    }

    /* renamed from: d */
    public static void m110924d(String str, String str2) {
        f104405a.m110925b();
        a.verbose.m110925b();
    }
}
