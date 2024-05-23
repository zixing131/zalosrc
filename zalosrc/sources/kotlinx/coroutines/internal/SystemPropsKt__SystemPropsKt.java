package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
final /* synthetic */ class SystemPropsKt__SystemPropsKt {

    /* renamed from: a */
    private static final int f107421a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m113721a() {
        return f107421a;
    }

    /* renamed from: b */
    public static final String m113722b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
