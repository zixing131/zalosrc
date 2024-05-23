package ul0;

import android.webkit.URLUtil;
import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24341v;
import on0.AbstractC24342w;

/* renamed from: ul0.f */
/* loaded from: classes7.dex */
public final class C27307f extends AbstractC27304c {
    public static final a Companion = new a(null);

    /* renamed from: ul0.f$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m139836a(String str) {
            boolean m127149O;
            AbstractC19074t.m100208f(str, "uri");
            m127149O = AbstractC24342w.m127149O(str, " ", false, 2, null);
            if (m127149O) {
                return false;
            }
            return URLUtil.isValidUrl(str);
        }
    }

    @Override // ul0.AbstractC27304c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C27306e mo139828c(Result.Success success) {
        boolean m127120J;
        CharSequence m127168X0;
        boolean m127120J2;
        CharSequence m127168X02;
        AbstractC19074t.m100208f(success, "result");
        String m139827b = AbstractC27304c.m139827b(success);
        m127120J = AbstractC24341v.m127120J(m139827b, "URL:", false, 2, null);
        if (!m127120J) {
            m127120J2 = AbstractC24341v.m127120J(m139827b, "URI:", false, 2, null);
            if (!m127120J2) {
                m127168X02 = AbstractC24342w.m127168X0(m139827b);
                String obj = m127168X02.toString();
                if (!Companion.m139836a(obj)) {
                    return null;
                }
                return new C27306e(obj, null);
            }
        }
        String substring = m139827b.substring(4);
        AbstractC19074t.m100207e(substring, "this as java.lang.String).substring(startIndex)");
        m127168X0 = AbstractC24342w.m127168X0(substring);
        return new C27306e(m127168X0.toString(), null);
    }
}
