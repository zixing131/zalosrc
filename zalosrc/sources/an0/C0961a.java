package an0;

import jn0.AbstractC21317c;
import kn0.C21778a;
import zm0.AbstractC32512a;

/* renamed from: an0.a */
/* loaded from: classes.dex */
public class C0961a extends AbstractC32512a {

    /* renamed from: an0.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f3459a = new a();

        /* renamed from: b */
        public static final Integer f3460b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f3460b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f3460b = num2;
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m4510c(int i11) {
        Integer num = a.f3460b;
        if (num != null && num.intValue() < i11) {
            return false;
        }
        return true;
    }

    @Override // ym0.AbstractC31020a
    /* renamed from: b */
    public AbstractC21317c mo4511b() {
        if (m4510c(34)) {
            return new C21778a();
        }
        return super.mo4511b();
    }
}
