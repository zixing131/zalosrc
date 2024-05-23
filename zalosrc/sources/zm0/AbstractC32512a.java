package zm0;

import fn0.AbstractC19074t;
import ym0.AbstractC31020a;

/* renamed from: zm0.a */
/* loaded from: classes.dex */
public abstract class AbstractC32512a extends AbstractC31020a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f150224a = new a();

        /* renamed from: b */
        public static final Integer f150225b;

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
                f150225b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f150225b = num2;
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m157467c(int i11) {
        Integer num = a.f150225b;
        if (num != null && num.intValue() < i11) {
            return false;
        }
        return true;
    }

    @Override // ym0.AbstractC31020a
    /* renamed from: a */
    public void mo150824a(Throwable th2, Throwable th3) {
        AbstractC19074t.m100208f(th2, "cause");
        AbstractC19074t.m100208f(th3, "exception");
        if (m157467c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.mo150824a(th2, th3);
        }
    }
}
