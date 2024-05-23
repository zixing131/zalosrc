package am;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23350e;
import p716zh.C31901e8;

/* renamed from: am.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC0906d0 {

    /* renamed from: a */
    private static final Map f3386a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static final Map f3387b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private static final Map f3388c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private static final Map f3389d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private static final String f3390e = AbstractC0906d0.class.getSimpleName();

    /* renamed from: f */
    private static final AtomicBoolean f3391f = new AtomicBoolean(false);

    /* renamed from: g */
    private static final Semaphore f3392g = new Semaphore(1);

    /* renamed from: a */
    public static void m2795a() {
        f3388c.clear();
        f3389d.clear();
    }

    /* renamed from: b */
    public static boolean m2796b(Context context, String str) {
        if (m2800f(context, str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m2797c(Context context, String str) {
        if (m2801g(context, str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m2798d(List list) {
        try {
            try {
                f3392g.acquire();
                m2803i();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C31901e8 c31901e8 = (C31901e8) it.next();
                    if (c31901e8.m153300r() > 0) {
                        f3386a.put(Long.valueOf(c31901e8.m153300r()), c31901e8);
                    }
                    if (c31901e8.m153301s()) {
                        f3387b.put(c31901e8.m153298m(), c31901e8);
                    }
                }
                f3391f.set(true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f3390e, e11);
            }
            f3392g.release();
        } catch (Throwable th2) {
            f3392g.release();
            throw th2;
        }
    }

    /* renamed from: e */
    private static Collection m2799e(Context context) {
        List<C31901e8> list;
        AtomicBoolean atomicBoolean;
        if (f3391f.get()) {
            return f3387b.values();
        }
        synchronized (AbstractC0906d0.class) {
            list = null;
            try {
                try {
                    list = C0927o.m4426d(context).m4429i();
                    for (C31901e8 c31901e8 : list) {
                        if (c31901e8.m153300r() > 0) {
                            f3386a.put(Long.valueOf(c31901e8.m153300r()), c31901e8);
                        }
                        if (c31901e8.m153301s()) {
                            f3387b.put(c31901e8.m153298m(), c31901e8);
                        }
                    }
                    atomicBoolean = f3391f;
                    atomicBoolean.set(true);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f3390e, e11);
                    atomicBoolean = f3391f;
                }
                atomicBoolean.set(true);
                if (list == null) {
                    list = new ArrayList(0);
                }
            } catch (Throwable th2) {
                f3391f.set(true);
                throw th2;
            }
        }
        return list;
    }

    /* renamed from: f */
    public static C31901e8 m2800f(Context context, String str) {
        C31901e8 c31901e8 = null;
        try {
            Map map = f3387b;
            C31901e8 c31901e82 = (C31901e8) map.get(str);
            if (c31901e82 == null) {
                try {
                    c31901e82 = (C31901e8) f3389d.get(str);
                } catch (Exception e11) {
                    e = e11;
                    c31901e8 = c31901e82;
                    AbstractC23350e.m122776f(f3390e, e);
                    return c31901e8;
                }
            }
            if (c31901e82 == null && !map.containsKey(str) && !f3391f.get()) {
                C31901e8 m4430o = C0927o.m4426d(context).m4430o(str);
                if (m4430o != null) {
                    map.put(str, m4430o);
                    if (m4430o.m153300r() > 0) {
                        f3386a.put(Long.valueOf(m4430o.m153300r()), m4430o);
                        return m4430o;
                    }
                    return m4430o;
                }
                map.put(str, null);
                return m4430o;
            }
            return c31901e82;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: g */
    public static C31901e8 m2801g(Context context, String str) {
        C31901e8 c31901e8 = null;
        try {
            Long valueOf = Long.valueOf(Long.parseLong(str));
            Map map = f3386a;
            C31901e8 c31901e82 = (C31901e8) map.get(valueOf);
            if (c31901e82 == null) {
                try {
                    c31901e82 = (C31901e8) f3388c.get(valueOf);
                } catch (Exception e11) {
                    e = e11;
                    c31901e8 = c31901e82;
                    AbstractC23350e.m122776f(f3390e, e);
                    return c31901e8;
                }
            }
            if (c31901e82 == null && !f3391f.get()) {
                C31901e8 m4431q = C0927o.m4426d(context).m4431q(str);
                if (m4431q != null) {
                    map.put(valueOf, m4431q);
                    if (m4431q.m153301s()) {
                        f3387b.put(m4431q.m153298m(), m4431q);
                        return m4431q;
                    }
                    return m4431q;
                }
                map.put(valueOf, null);
                return m4431q;
            }
            return c31901e82;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: h */
    public static List m2802h(Context context) {
        ArrayList arrayList = new ArrayList(m2799e(context));
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C31901e8) it.next()) == null) {
                    it.remove();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f3390e, e11);
        }
        return arrayList;
    }

    /* renamed from: i */
    private static void m2803i() {
        m2806l();
        f3387b.clear();
        f3386a.clear();
        f3391f.set(false);
    }

    /* renamed from: j */
    public static boolean m2804j() {
        return f3391f.get();
    }

    /* renamed from: k */
    public static void m2805k(Context context, String str, long j11) {
        try {
            try {
                Semaphore semaphore = f3392g;
                if (semaphore.availablePermits() <= 0) {
                    AbstractC23350e.m122774d(f3390e, String.format("skip mappingPhoneNumberZaloUID (availablePermits is zero) :%s - %d", str, Long.valueOf(j11)));
                    semaphore.release();
                    return;
                }
                semaphore.acquire();
                C31901e8 m2800f = m2800f(context, str);
                if (m2800f == null) {
                    semaphore.release();
                    return;
                }
                m2800f.m153291A(j11);
                f3386a.put(Long.valueOf(j11), m2800f);
                semaphore.release();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f3390e, e11);
                f3392g.release();
            }
        } catch (Throwable th2) {
            f3392g.release();
            throw th2;
        }
    }

    /* renamed from: l */
    private static void m2806l() {
        Map map = f3387b;
        synchronized (map) {
            f3389d.putAll(map);
        }
        Map map2 = f3386a;
        synchronized (map2) {
            f3388c.putAll(map2);
        }
    }
}
