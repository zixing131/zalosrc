package p664y;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p467r.C25589l;
import p512t.C26435a;
import p512t.C26437c;
import p562v.AbstractC27393f;

/* renamed from: y.c */
/* loaded from: classes2.dex */
public class C30230c {

    /* renamed from: a */
    private final HashMap f140419a = new HashMap();

    /* renamed from: b */
    private final HashMap f140420b = new HashMap();

    /* renamed from: c */
    private final HashMap f140421c = new HashMap();

    /* renamed from: d */
    private final HashSet f140422d = new HashSet();

    /* renamed from: e */
    private final HashSet f140423e = new HashSet();

    /* renamed from: f */
    private final HashSet f140424f = new HashSet();

    /* renamed from: g */
    private final HashMap f140425g = new HashMap();

    /* renamed from: h */
    private boolean f140426h;

    /* renamed from: y.c$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final C26437c f140427a;

        /* renamed from: b */
        private final ArrayList f140428b = new ArrayList();

        public a(C26437c c26437c, String str) {
            this.f140427a = c26437c;
            m149079b(str);
        }

        /* renamed from: a */
        public C26437c m149078a() {
            return this.f140427a;
        }

        /* renamed from: b */
        public void m149079b(String str) {
            this.f140428b.add(str);
        }

        /* renamed from: c */
        public ArrayList m149080c() {
            return this.f140428b;
        }
    }

    /* renamed from: d */
    private void m149065d(C25589l c25589l) {
        Iterator it = c25589l.m132168k().iterator();
        while (it.hasNext()) {
            m149066e((C26437c) it.next(), c25589l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m149066e(C26437c c26437c, C25589l c25589l) {
        View view = (View) c26437c.m136290a().get();
        if (view == null) {
            return;
        }
        a aVar = (a) this.f140420b.get(view);
        if (aVar != null) {
            aVar.m149079b(c25589l.m132175t());
        } else {
            this.f140420b.put(view, new a(c26437c, c25589l.m132175t()));
        }
    }

    /* renamed from: k */
    private String m149067k(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String m140352e = AbstractC27393f.m140352e(view);
            if (m140352e != null) {
                return m140352e;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f140422d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String m149068a(View view) {
        if (this.f140419a.size() == 0) {
            return null;
        }
        String str = (String) this.f140419a.get(view);
        if (str != null) {
            this.f140419a.remove(view);
        }
        return str;
    }

    /* renamed from: b */
    public String m149069b(String str) {
        return (String) this.f140425g.get(str);
    }

    /* renamed from: c */
    public HashSet m149070c() {
        return this.f140423e;
    }

    /* renamed from: f */
    public View m149071f(String str) {
        return (View) this.f140421c.get(str);
    }

    /* renamed from: g */
    public HashSet m149072g() {
        return this.f140424f;
    }

    /* renamed from: h */
    public a m149073h(View view) {
        a aVar = (a) this.f140420b.get(view);
        if (aVar != null) {
            this.f140420b.remove(view);
        }
        return aVar;
    }

    /* renamed from: i */
    public EnumC30238k m149074i(View view) {
        return this.f140422d.contains(view) ? EnumC30238k.PARENT_VIEW : this.f140426h ? EnumC30238k.OBSTRUCTION_VIEW : EnumC30238k.UNDERLYING_VIEW;
    }

    /* renamed from: j */
    public void m149075j() {
        C26435a m136271a = C26435a.m136271a();
        if (m136271a != null) {
            for (C25589l c25589l : m136271a.m136275e()) {
                View m132171p = c25589l.m132171p();
                if (c25589l.m132172q()) {
                    String m132175t = c25589l.m132175t();
                    if (m132171p != null) {
                        String m149067k = m149067k(m132171p);
                        if (m149067k == null) {
                            this.f140423e.add(m132175t);
                            this.f140419a.put(m132171p, m132175t);
                            m149065d(c25589l);
                        } else {
                            this.f140424f.add(m132175t);
                            this.f140421c.put(m132175t, m132171p);
                            this.f140425g.put(m132175t, m149067k);
                        }
                    } else {
                        this.f140424f.add(m132175t);
                        this.f140425g.put(m132175t, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public void m149076l() {
        this.f140419a.clear();
        this.f140420b.clear();
        this.f140421c.clear();
        this.f140422d.clear();
        this.f140423e.clear();
        this.f140424f.clear();
        this.f140425g.clear();
        this.f140426h = false;
    }

    /* renamed from: m */
    public void m149077m() {
        this.f140426h = true;
    }
}
