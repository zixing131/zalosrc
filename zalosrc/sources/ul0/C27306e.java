package ul0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.regex.Pattern;
import on0.AbstractC24342w;
import ul0.AbstractC27302a;

/* renamed from: ul0.e */
/* loaded from: classes7.dex */
public final class C27306e extends AbstractC27302a {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final Pattern f128543d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: b */
    private final String f128544b;

    /* renamed from: c */
    private final String f128545c;

    /* renamed from: ul0.e$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final boolean m139833b(String str, int i11) {
            int m127172a0;
            int i12 = i11 + 1;
            m127172a0 = AbstractC24342w.m127172a0(str, '/', i12, false, 4, null);
            if (m127172a0 < 0) {
                m127172a0 = str.length();
            }
            if (m127172a0 <= i12) {
                return false;
            }
            while (i12 < m127172a0) {
                if (AbstractC19074t.m100209g(str.charAt(i12), 48) < 0 || AbstractC19074t.m100209g(str.charAt(i12), 57) > 0) {
                    return false;
                }
                i12++;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m139834c(String str) {
            CharSequence m127168X0;
            int m127172a0;
            m127168X0 = AbstractC24342w.m127168X0(str);
            String obj = m127168X0.toString();
            m127172a0 = AbstractC24342w.m127172a0(obj, ':', 0, false, 6, null);
            if (m127172a0 < 0) {
                return "http://" + obj;
            }
            if (m139833b(obj, m127172a0)) {
                return "http://" + obj;
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27306e(String str, String str2) {
        super(EnumC27303b.URI);
        AbstractC19074t.m100208f(str, "uri");
        this.f128544b = str2;
        this.f128545c = Companion.m139834c(str);
    }

    @Override // ul0.AbstractC27302a
    /* renamed from: a */
    public String mo139823a() {
        StringBuilder sb2 = new StringBuilder(30);
        AbstractC27302a.a aVar = AbstractC27302a.Companion;
        aVar.m139824a(this.f128544b, sb2);
        aVar.m139824a(this.f128545c, sb2);
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "result.toString()");
        return sb3;
    }

    /* renamed from: b */
    public final String m139831b() {
        return this.f128545c;
    }
}
