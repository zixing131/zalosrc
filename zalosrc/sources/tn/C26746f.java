package tn;

import ae.C0766k;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: tn.f */
/* loaded from: classes4.dex */
public class C26746f extends Thread {

    /* renamed from: q */
    private static volatile C26746f f126864q;

    /* renamed from: s */
    private static volatile int f126866s;

    /* renamed from: p */
    private volatile boolean f126869p;

    /* renamed from: r */
    private static final Object f126865r = new Object();

    /* renamed from: t */
    static List f126867t = new LinkedList();

    /* renamed from: u */
    static Map f126868u = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.f$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f126870a;

        a(int i11) {
            this.f126870a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C26746f.m137566f("onErrorData: " + c20096c);
                synchronized (C26746f.f126865r) {
                    C26746f.f126868u.remove(Integer.valueOf(this.f126870a));
                }
                C26746f.m137562b();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            List list;
            try {
                C26746f.m137566f("onDataProcessed: " + obj);
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                C26746f.m137562b();
                synchronized (C26746f.f126865r) {
                    list = (List) C26746f.f126868u.remove(Integer.valueOf(this.f126870a));
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).mo46704a(optJSONObject);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: tn.f$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo46704a(JSONObject jSONObject);
    }

    private C26746f() {
        super("Z:CommentLikesLoader");
        this.f126869p = true;
        if (f126864q == null) {
            f126864q = this;
            List list = f126867t;
            if (list != null) {
                list.clear();
            } else {
                f126867t = new LinkedList();
            }
            Map map = f126868u;
            if (map != null) {
                map.clear();
            } else {
                f126868u = new HashMap();
            }
            start();
        }
    }

    /* renamed from: b */
    static void m137562b() {
        synchronized (f126865r) {
            m137566f("decreaseRunningTask: ");
            f126866s--;
            m137570j();
        }
    }

    /* renamed from: c */
    public static void m137563c() {
        C26748g c26748g;
        List list;
        try {
            if (f126867t.isEmpty()) {
                return;
            }
            synchronized (f126865r) {
                c26748g = (C26748g) f126867t.remove(0);
            }
            if (c26748g != null && (list = c26748g.f126903a) != null) {
                int hashCode = list.hashCode();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(hashCode));
                m137565e();
                c0766k.mo1553V3(c26748g.f126903a, 2, c26748g.f126904b, c26748g.f126905c, 1, 200);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    static int m137564d() {
        int i11;
        synchronized (f126865r) {
            m137566f("getRunningTaskCount: " + f126866s);
            i11 = f126866s;
        }
        return i11;
    }

    /* renamed from: e */
    static void m137565e() {
        synchronized (f126865r) {
            m137566f("increaseRunningTask: ");
            f126866s++;
        }
    }

    /* renamed from: f */
    static void m137566f(String str) {
    }

    /* renamed from: g */
    public static void m137567g(C26748g c26748g, b bVar) {
        List list;
        try {
            m137568h();
            if (c26748g != null && (list = c26748g.f126903a) != null && !list.isEmpty()) {
                m137566f("queueTask: " + c26748g.f126903a.size());
                if (f126864q != null) {
                    synchronized (f126865r) {
                        try {
                            f126867t.add(c26748g);
                            int hashCode = c26748g.f126903a.hashCode();
                            List list2 = (List) f126868u.get(Integer.valueOf(hashCode));
                            if (list2 == null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(bVar);
                                f126868u.put(Integer.valueOf(hashCode), linkedList);
                            } else {
                                list2.add(bVar);
                            }
                            m137570j();
                        } finally {
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    public static synchronized void m137568h() {
        synchronized (C26746f.class) {
            if (f126864q == null) {
                synchronized (C26746f.class) {
                    try {
                        if (f126864q == null) {
                            f126864q = new C26746f();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static void m137569i() {
        try {
            if (f126864q != null) {
                synchronized (f126865r) {
                    f126864q.f126869p = false;
                    m137570j();
                }
                if (f126864q != null) {
                    f126864q.interrupt();
                }
                f126868u = null;
                f126867t = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    static void m137570j() {
        try {
            if (m137564d() < 3) {
                m137566f("wake notify: ");
                Object obj = f126865r;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f126869p) {
            m137566f("run: ");
            Object obj = f126865r;
            synchronized (obj) {
                if (m137564d() >= 3 || f126867t.isEmpty()) {
                    try {
                        m137566f("wait: ");
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!this.f126869p) {
                break;
            } else {
                m137563c();
            }
        }
        f126864q = null;
    }
}
