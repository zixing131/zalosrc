package c30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p683yj.C30997b;

/* renamed from: c30.k0 */
/* loaded from: classes5.dex */
public class C3250k0 {

    /* renamed from: a */
    private final TreeMap f13904a = new TreeMap(new Comparator() { // from class: c30.j0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m16505g;
            m16505g = C3250k0.m16505g((Integer) obj, (Integer) obj2);
            return m16505g;
        }
    });

    /* renamed from: b */
    private final List f13905b = new ArrayList();

    /* renamed from: c */
    private final List f13906c = new ArrayList();

    /* renamed from: d */
    private a f13907d;

    /* renamed from: c30.k0$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        int f13908a;

        /* renamed from: b */
        String f13909b;

        /* renamed from: c */
        C30997b f13910c;

        public a(int i11, String str, C30997b c30997b) {
            this.f13908a = i11;
            this.f13909b = str;
            this.f13910c = c30997b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m16505g(Integer num, Integer num2) {
        return num2.compareTo(num);
    }

    /* renamed from: b */
    public void m16506b(a aVar) {
        if (aVar != null && aVar.f13908a >= 0) {
            if (aVar.f13910c.m150673q()) {
                this.f13907d = aVar;
            }
            if (this.f13904a.containsKey(Integer.valueOf(aVar.f13908a))) {
                this.f13905b.remove((a) this.f13904a.get(Integer.valueOf(aVar.f13908a)));
            }
            this.f13904a.put(Integer.valueOf(aVar.f13908a), aVar);
            this.f13905b.add(aVar);
        }
    }

    /* renamed from: c */
    public void m16507c() {
        this.f13904a.clear();
        this.f13905b.clear();
        this.f13906c.clear();
        this.f13907d = null;
    }

    /* renamed from: d */
    public a m16508d() {
        return this.f13907d;
    }

    /* renamed from: e */
    public List m16509e() {
        return this.f13905b;
    }

    /* renamed from: f */
    public void m16510f(int i11, int i12, int i13) {
        Iterator it = this.f13904a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((a) entry.getValue()).f13908a < i13) {
                break;
            }
            it.remove();
            ((a) entry.getValue()).f13908a -= i11;
            if (((a) entry.getValue()).f13908a >= i13) {
                ((a) entry.getValue()).f13908a += i12;
                this.f13906c.add((a) entry.getValue());
            } else {
                this.f13905b.remove(entry.getValue());
            }
        }
        for (int i14 = 0; i14 < this.f13906c.size(); i14++) {
            this.f13904a.put(Integer.valueOf(((a) this.f13906c.get(i14)).f13908a), (a) this.f13906c.get(i14));
        }
        this.f13906c.clear();
    }
}
