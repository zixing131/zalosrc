package p234ia;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ia.e */
/* loaded from: classes.dex */
public abstract class AbstractC20456e {

    /* renamed from: a */
    private final Map f100658a = new HashMap();

    /* renamed from: a */
    protected abstract Object mo902a(Object obj);

    /* renamed from: b */
    public Object m106487b(Object obj) {
        synchronized (this.f100658a) {
            try {
                if (this.f100658a.containsKey(obj)) {
                    return this.f100658a.get(obj);
                }
                Object mo902a = mo902a(obj);
                this.f100658a.put(obj, mo902a);
                return mo902a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
