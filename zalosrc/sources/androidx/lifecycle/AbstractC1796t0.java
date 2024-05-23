package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC1796t0 {

    /* renamed from: p */
    private final Map f7400p = new HashMap();

    /* renamed from: q */
    private final Set f7401q = new LinkedHashSet();

    /* renamed from: r */
    private volatile boolean f7402r = false;

    /* renamed from: H */
    private static void m9369H(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final void m9370F() {
        this.f7402r = true;
        Map map = this.f7400p;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f7400p.values().iterator();
                    while (it.hasNext()) {
                        m9369H(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f7401q;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f7401q.iterator();
                    while (it2.hasNext()) {
                        m9369H((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        mo9130J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public Object m9371I(String str) {
        Object obj;
        Map map = this.f7400p;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f7400p.get(str);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public void mo9130J() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public Object m9372K(String str, Object obj) {
        Object obj2;
        synchronized (this.f7400p) {
            try {
                obj2 = this.f7400p.get(str);
                if (obj2 == null) {
                    this.f7400p.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f7402r) {
            m9369H(obj);
        }
        return obj;
    }
}
