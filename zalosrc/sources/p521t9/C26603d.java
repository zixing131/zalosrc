package p521t9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: t9.d */
/* loaded from: classes.dex */
public class C26603d {

    /* renamed from: b */
    private static volatile C26603d f125943b;

    /* renamed from: a */
    private final Set f125944a = new HashSet();

    C26603d() {
    }

    /* renamed from: a */
    public static C26603d m136562a() {
        C26603d c26603d = f125943b;
        if (c26603d == null) {
            synchronized (C26603d.class) {
                try {
                    c26603d = f125943b;
                    if (c26603d == null) {
                        c26603d = new C26603d();
                        f125943b = c26603d;
                    }
                } finally {
                }
            }
        }
        return c26603d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set m136563b() {
        Set unmodifiableSet;
        synchronized (this.f125944a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f125944a);
        }
        return unmodifiableSet;
    }
}
