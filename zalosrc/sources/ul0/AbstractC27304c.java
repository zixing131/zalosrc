package ul0;

import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.regex.Pattern;
import on0.AbstractC24341v;

/* renamed from: ul0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC27304c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final AbstractC27304c[] f128536a = {new C27307f()};

    /* renamed from: b */
    private static final Pattern f128537b = Pattern.compile("\\d*");

    /* renamed from: c */
    private static final Pattern f128538c = Pattern.compile("[a-zA-Z0-9]*");

    /* renamed from: d */
    private static final Pattern f128539d = Pattern.compile("&");

    /* renamed from: e */
    private static final Pattern f128540e = Pattern.compile("=");

    /* renamed from: ul0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        protected final String m139829a(Result.Success success) {
            boolean m127120J;
            AbstractC19074t.m100208f(success, "result");
            String m92585e = success.m92585e();
            m127120J = AbstractC24341v.m127120J(m92585e, "\ufeff", false, 2, null);
            if (m127120J) {
                String substring = m92585e.substring(1);
                AbstractC19074t.m100207e(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            return m92585e;
        }

        /* renamed from: b */
        public final AbstractC27302a m139830b(Result.Success success) {
            AbstractC19074t.m100208f(success, "theResult");
            for (AbstractC27304c abstractC27304c : AbstractC27304c.f128536a) {
                AbstractC27302a mo139828c = abstractC27304c.mo139828c(success);
                if (mo139828c != null) {
                    return mo139828c;
                }
            }
            return new C27305d(success.m92585e(), null);
        }
    }

    /* renamed from: b */
    public static final String m139827b(Result.Success success) {
        return Companion.m139829a(success);
    }

    /* renamed from: c */
    public abstract AbstractC27302a mo139828c(Result.Success success);
}
