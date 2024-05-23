package wm0;

import fn0.AbstractC19074t;
import java.lang.reflect.Field;

/* renamed from: wm0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC29099g {
    /* renamed from: a */
    private static final void m145349a(int i11, int i12) {
        if (i12 <= i11) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i11 + ", got " + i12 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC29098f m145350b(AbstractC29093a abstractC29093a) {
        return (InterfaceC29098f) abstractC29093a.getClass().getAnnotation(InterfaceC29098f.class);
    }

    /* renamed from: c */
    private static final int m145351c(AbstractC29093a abstractC29093a) {
        Integer num;
        int i11;
        try {
            Field declaredField = abstractC29093a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC29093a);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            return i11 - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m145352d(AbstractC29093a abstractC29093a) {
        int i11;
        String str;
        AbstractC19074t.m100208f(abstractC29093a, "<this>");
        InterfaceC29098f m145350b = m145350b(abstractC29093a);
        if (m145350b == null) {
            return null;
        }
        m145349a(1, m145350b.m145348v());
        int m145351c = m145351c(abstractC29093a);
        if (m145351c < 0) {
            i11 = -1;
        } else {
            i11 = m145350b.m145346l()[m145351c];
        }
        String m145357b = C29101i.f134920a.m145357b(abstractC29093a);
        if (m145357b == null) {
            str = m145350b.m145344c();
        } else {
            str = m145357b + '/' + m145350b.m145344c();
        }
        return new StackTraceElement(str, m145350b.m145347m(), m145350b.m145345f(), i11);
    }
}
