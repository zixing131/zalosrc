package ym0;

import fn0.AbstractC19074t;
import java.lang.reflect.Method;
import jn0.AbstractC21317c;
import jn0.C21316b;
import qm0.AbstractC25358n;

/* renamed from: ym0.a */
/* loaded from: classes.dex */
public abstract class AbstractC31020a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ym0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f143082a = new a();

        /* renamed from: b */
        public static final Method f143083b;

        /* renamed from: c */
        public static final Method f143084c;

        static {
            Method method;
            Method method2;
            Object m131377Y;
            Method[] methods = Throwable.class.getMethods();
            AbstractC19074t.m100205c(methods);
            int length = methods.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                method = null;
                if (i12 < length) {
                    method2 = methods[i12];
                    if (AbstractC19074t.m100204b(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC19074t.m100207e(parameterTypes, "getParameterTypes(...)");
                        m131377Y = AbstractC25358n.m131377Y(parameterTypes);
                        if (AbstractC19074t.m100204b(m131377Y, Throwable.class)) {
                            break;
                        }
                    }
                    i12++;
                } else {
                    method2 = null;
                    break;
                }
            }
            f143083b = method2;
            int length2 = methods.length;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                Method method3 = methods[i11];
                if (AbstractC19074t.m100204b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i11++;
            }
            f143084c = method;
        }

        private a() {
        }
    }

    /* renamed from: a */
    public void mo150824a(Throwable th2, Throwable th3) {
        AbstractC19074t.m100208f(th2, "cause");
        AbstractC19074t.m100208f(th3, "exception");
        Method method = a.f143083b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    /* renamed from: b */
    public AbstractC21317c mo4511b() {
        return new C21316b();
    }
}
