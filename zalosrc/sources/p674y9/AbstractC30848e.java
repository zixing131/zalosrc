package p674y9;

/* renamed from: y9.e */
/* loaded from: classes3.dex */
public abstract class AbstractC30848e {

    /* renamed from: a */
    private static final int f142351a = m149968a();

    /* renamed from: a */
    private static int m149968a() {
        return m149971d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m149969b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m149970c() {
        return f142351a;
    }

    /* renamed from: d */
    static int m149971d(String str) {
        int m149973f = m149973f(str);
        if (m149973f == -1) {
            m149973f = m149969b(str);
        }
        if (m149973f == -1) {
            return 6;
        }
        return m149973f;
    }

    /* renamed from: e */
    public static boolean m149972e() {
        return f142351a >= 9;
    }

    /* renamed from: f */
    private static int m149973f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
