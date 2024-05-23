package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class dz2 {

    /* renamed from: a */
    private final HashMap f19455a = new HashMap();

    /* renamed from: b */
    private final HashMap f19456b = new HashMap();

    /* renamed from: c */
    private final HashMap f19457c = new HashMap();

    /* renamed from: d */
    private final HashSet f19458d = new HashSet();

    /* renamed from: e */
    private final HashSet f19459e = new HashSet();

    /* renamed from: f */
    private final HashSet f19460f = new HashSet();

    /* renamed from: g */
    private final HashMap f19461g = new HashMap();

    /* renamed from: h */
    private final Map f19462h = new WeakHashMap();

    /* renamed from: i */
    private boolean f19463i;

    /* renamed from: a */
    public final View m21572a(String str) {
        return (View) this.f19457c.get(str);
    }

    /* renamed from: b */
    public final cz2 m21573b(View view) {
        cz2 cz2Var = (cz2) this.f19456b.get(view);
        if (cz2Var != null) {
            this.f19456b.remove(view);
        }
        return cz2Var;
    }

    /* renamed from: c */
    public final String m21574c(String str) {
        return (String) this.f19461g.get(str);
    }

    /* renamed from: d */
    public final String m21575d(View view) {
        if (this.f19455a.size() == 0) {
            return null;
        }
        String str = (String) this.f19455a.get(view);
        if (str != null) {
            this.f19455a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet m21576e() {
        return this.f19460f;
    }

    /* renamed from: f */
    public final HashSet m21577f() {
        return this.f19459e;
    }

    /* renamed from: g */
    public final void m21578g() {
        this.f19455a.clear();
        this.f19456b.clear();
        this.f19457c.clear();
        this.f19458d.clear();
        this.f19459e.clear();
        this.f19460f.clear();
        this.f19461g.clear();
        this.f19463i = false;
    }

    /* renamed from: h */
    public final void m21579h() {
        this.f19463i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final void m21580i() {
        Boolean bool;
        String str;
        iy2 m23465a = iy2.m23465a();
        if (m23465a != null) {
            for (xx2 xx2Var : m23465a.m23466b()) {
                View m28059f = xx2Var.m28059f();
                if (xx2Var.m28063j()) {
                    String m28061h = xx2Var.m28061h();
                    if (m28059f != null) {
                        if (!m28059f.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (m28059f.hasWindowFocus()) {
                                this.f19462h.remove(m28059f);
                                bool = Boolean.FALSE;
                            } else if (this.f19462h.containsKey(m28059f)) {
                                bool = (Boolean) this.f19462h.get(m28059f);
                            } else {
                                Map map = this.f19462h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(m28059f, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = m28059f;
                                while (true) {
                                    if (view != null) {
                                        String m20774b = bz2.m20774b(view);
                                        if (m20774b != null) {
                                            str = m20774b;
                                            break;
                                        }
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.f19458d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.f19459e.add(m28061h);
                            this.f19455a.put(m28059f, m28061h);
                            for (ky2 ky2Var : xx2Var.m28062i()) {
                                View view2 = (View) ky2Var.m24093b().get();
                                if (view2 != null) {
                                    cz2 cz2Var = (cz2) this.f19456b.get(view2);
                                    if (cz2Var != null) {
                                        cz2Var.m21244c(xx2Var.m28061h());
                                    } else {
                                        this.f19456b.put(view2, new cz2(ky2Var, xx2Var.m28061h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f19460f.add(m28061h);
                            this.f19457c.put(m28061h, m28059f);
                            this.f19461g.put(m28061h, str);
                        }
                    } else {
                        this.f19460f.add(m28061h);
                        this.f19461g.put(m28061h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m21581j(View view) {
        if (this.f19462h.containsKey(view)) {
            this.f19462h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int m21582k(View view) {
        if (this.f19458d.contains(view)) {
            return 1;
        }
        if (this.f19463i) {
            return 2;
        }
        return 3;
    }
}
