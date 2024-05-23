package pm0;

import fn0.AbstractC19074t;
import java.io.PrintWriter;
import java.io.StringWriter;
import ym0.AbstractC31021b;

/* renamed from: pm0.f */
/* loaded from: classes.dex */
public abstract class AbstractC24845f {
    /* renamed from: a */
    public static void m129182a(Throwable th2, Throwable th3) {
        AbstractC19074t.m100208f(th2, "<this>");
        AbstractC19074t.m100208f(th3, "exception");
        if (th2 != th3) {
            AbstractC31021b.f143085a.mo150824a(th2, th3);
        }
    }

    /* renamed from: b */
    public static String m129183b(Throwable th2) {
        AbstractC19074t.m100208f(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        AbstractC19074t.m100207e(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
