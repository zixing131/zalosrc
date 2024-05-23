package vg;

import ae.C0766k;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import fg0.ThreadFactoryC18928a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.AbstractC21935u;

/* renamed from: vg.s6 */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC28185s6 implements Runnable {

    /* renamed from: v */
    private static final HashMap f131322v = new HashMap();

    /* renamed from: w */
    private static final ExecutorService f131323w = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ProfileCallback"));

    /* renamed from: x */
    private static final Map f131324x = new ConcurrentHashMap();

    /* renamed from: y */
    static int f131325y = 1090453521;

    /* renamed from: p */
    WeakReference f131326p;

    /* renamed from: q */
    List f131327q;

    /* renamed from: r */
    String f131328r;

    /* renamed from: s */
    final ArrayList f131329s = new ArrayList();

    /* renamed from: t */
    final Map f131330t = new HashMap();

    /* renamed from: u */
    int f131331u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.s6$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f131332a;

        /* renamed from: b */
        final /* synthetic */ String f131333b;

        a(String str, String str2) {
            this.f131332a = str;
            this.f131333b = str2;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                List<AbstractRunnableC28185s6> list = (List) AbstractRunnableC28185s6.f131324x.remove(this.f131332a);
                if (list != null) {
                    for (AbstractRunnableC28185s6 abstractRunnableC28185s6 : list) {
                        synchronized (abstractRunnableC28185s6.f131330t) {
                            try {
                                abstractRunnableC28185s6.f131330t.remove(this.f131332a);
                                if (abstractRunnableC28185s6.f131330t.isEmpty()) {
                                    abstractRunnableC28185s6.m141751d();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            if (obj != null) {
                try {
                    contactProfile = new ContactProfile((JSONObject) obj);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                if (str.length() > 0 && !str.equalsIgnoreCase("null")) {
                    C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(str));
                }
            }
            List<AbstractRunnableC28185s6> list = (List) AbstractRunnableC28185s6.f131324x.remove(this.f131332a);
            if (list != null) {
                for (AbstractRunnableC28185s6 abstractRunnableC28185s6 : list) {
                    if (contactProfile != null) {
                        synchronized (abstractRunnableC28185s6.f131329s) {
                            abstractRunnableC28185s6.f131329s.add(contactProfile);
                        }
                    }
                    synchronized (abstractRunnableC28185s6.f131330t) {
                        try {
                            abstractRunnableC28185s6.f131330t.remove(this.f131332a);
                            if (abstractRunnableC28185s6.f131330t.isEmpty()) {
                                abstractRunnableC28185s6.m141751d();
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: vg.s6$b */
    /* loaded from: classes3.dex */
    public interface b {
        Object getTag(int i11);

        void setTag(int i11, Object obj);
    }

    public AbstractRunnableC28185s6(b bVar, List list, int i11) {
        this.f131326p = new WeakReference(bVar);
        ArrayList arrayList = new ArrayList(list);
        this.f131327q = arrayList;
        this.f131331u = i11;
        Collections.sort(arrayList);
        String join = TextUtils.join(",", this.f131327q);
        this.f131328r = join;
        bVar.setTag(f131325y, join);
    }

    /* renamed from: f */
    private void m141749f(AbstractRunnableC28185s6 abstractRunnableC28185s6) {
        HashMap hashMap = f131322v;
        WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(abstractRunnableC28185s6.f131328r);
        if (weakHashMap == null) {
            if (hashMap.containsKey(abstractRunnableC28185s6.f131328r)) {
                WeakHashMap weakHashMap2 = new WeakHashMap();
                weakHashMap2.put((b) abstractRunnableC28185s6.f131326p.get(), abstractRunnableC28185s6);
                hashMap.put(abstractRunnableC28185s6.f131328r, weakHashMap2);
                return;
            }
            hashMap.put(abstractRunnableC28185s6.f131328r, null);
            return;
        }
        weakHashMap.put((b) abstractRunnableC28185s6.f131326p.get(), abstractRunnableC28185s6);
    }

    /* renamed from: b */
    public void m141750b() {
        Iterator it = this.f131327q.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str) && !str.startsWith("http") && !str.contains(".png") && !str.contains(".jpg")) {
                ContactProfile m141811g = C28203u6.f131407a.m141811g(str);
                if (m141811g != null) {
                    synchronized (this.f131329s) {
                        this.f131329s.add(m141811g);
                    }
                    it.remove();
                } else {
                    continue;
                }
            } else {
                it.remove();
            }
        }
        if (this.f131327q.isEmpty()) {
            mo61137c(this.f131329s);
        } else if (!f131322v.containsKey(this.f131328r)) {
            m141749f(this);
            f131323w.execute(this);
        } else {
            m141749f(this);
        }
    }

    /* renamed from: c */
    public void mo61137c(ArrayList arrayList) {
    }

    /* renamed from: d */
    void m141751d() {
        WeakHashMap weakHashMap;
        WeakReference weakReference;
        HashMap hashMap = f131322v;
        synchronized (hashMap) {
            weakHashMap = (WeakHashMap) hashMap.remove(this.f131328r);
        }
        b bVar = (b) this.f131326p.get();
        if ((weakHashMap == null || !weakHashMap.containsKey(bVar)) && (weakReference = this.f131326p) != null && weakReference.get() != null && ((b) this.f131326p.get()).getTag(f131325y).equals(this.f131328r)) {
            mo61137c(this.f131329s);
        }
        if (weakHashMap != null) {
            for (b bVar2 : weakHashMap.keySet()) {
                AbstractRunnableC28185s6 abstractRunnableC28185s6 = (AbstractRunnableC28185s6) weakHashMap.get(bVar2);
                if (bVar2 != null && bVar2.getTag(f131325y).equals(this.f131328r)) {
                    abstractRunnableC28185s6.mo61137c(this.f131329s);
                }
            }
        }
    }

    /* renamed from: e */
    void m141752e(String str, String str2) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(str, str2));
        c0766k.mo1514Q4(str, 0, new TrackingSource(this.f131331u));
    }

    @Override // java.lang.Runnable
    public void run() {
        for (String str : this.f131327q) {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                synchronized (this.f131329s) {
                    this.f131329s.add(m141809c);
                }
            } else {
                Map map = f131324x;
                if (!map.containsKey(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this);
                    map.put(str, arrayList);
                    m141752e(str, this.f131328r);
                } else {
                    ((List) map.get(str)).add(this);
                }
                this.f131330t.put(str, str);
            }
        }
        if (this.f131330t.isEmpty()) {
            m141751d();
        }
    }
}
