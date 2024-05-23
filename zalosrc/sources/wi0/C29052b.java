package wi0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.text.SimpleDateFormat;
import java.util.Date;
import mm0.AbstractC23350e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: wi0.b */
/* loaded from: classes7.dex */
public final class C29052b {

    /* renamed from: a */
    public static final C29052b f134592a = new C29052b();

    /* renamed from: b */
    private static final InterfaceC24854k f134593b;

    /* renamed from: wi0.b$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f134594q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat mo12V4() {
            return new SimpleDateFormat("HH:mm:ss.SSS");
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f134594q);
        f134593b = m129210a;
    }

    private C29052b() {
    }

    /* renamed from: a */
    public static final long m145089a(long j11) {
        return j11 / ((long) Math.pow(1024.0d, 2));
    }

    /* renamed from: b */
    private final long m145090b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    private final String m145091c(long j11) {
        try {
            String format = m145092d().format(new Date(j11));
            AbstractC19074t.m100207e(format, "fullTimeFormatter.format(date)");
            return format;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZFile", e11);
            return "";
        }
    }

    /* renamed from: d */
    private final SimpleDateFormat m145092d() {
        return (SimpleDateFormat) f134593b.getValue();
    }

    /* renamed from: e */
    public static final void m145093e(String str) {
        AbstractC19074t.m100208f(str, "message");
        m145094f("ZFile", str);
    }

    /* renamed from: f */
    public static final void m145094f(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        C29052b c29052b = f134592a;
        sb2.append(c29052b.m145091c(c29052b.m145090b()));
        sb2.append("] ");
        sb2.append(str2);
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, sb2.toString(), new Object[0]);
    }
}
