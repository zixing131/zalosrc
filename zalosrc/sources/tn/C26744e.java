package tn;

import android.text.TextUtils;
import com.zing.zalo.social.controls.C10873l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: tn.e */
/* loaded from: classes4.dex */
public class C26744e {

    /* renamed from: c */
    private static volatile C26744e f126859c;

    /* renamed from: a */
    final Object f126860a = new Object();

    /* renamed from: b */
    final Map f126861b = new LinkedHashMap();

    /* renamed from: tn.e$a */
    /* loaded from: classes4.dex */
    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C10873l c10873l, C10873l c10873l2) {
            long j11 = c10873l.f54888D - c10873l2.f54888D;
            if (j11 > 0) {
                return 1;
            }
            if (j11 < 0) {
                return -1;
            }
            return 0;
        }
    }

    private C26744e() {
    }

    /* renamed from: e */
    public static synchronized C26744e m137551e() {
        C26744e c26744e;
        synchronized (C26744e.class) {
            try {
                if (f126859c == null) {
                    synchronized (C26744e.class) {
                        try {
                            if (f126859c == null) {
                                f126859c = new C26744e();
                            }
                        } finally {
                        }
                    }
                }
                c26744e = f126859c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26744e;
    }

    /* renamed from: h */
    private void m137552h(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10873l c10873l = (C10873l) it.next();
                if (c10873l != null && c10873l.m56446L()) {
                    it.remove();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m137553a(C10873l c10873l) {
        if (c10873l != null && !TextUtils.isEmpty(c10873l.m56493u())) {
            try {
                synchronized (this.f126860a) {
                    try {
                        if (!this.f126861b.containsKey(c10873l.m56493u())) {
                            this.f126861b.put(c10873l.m56493u(), c10873l);
                        } else {
                            throw new IllegalArgumentException("Comment already existed: " + c10873l.m56493u());
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void m137554b() {
        try {
            this.f126861b.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public List m137555c(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        m137552h(arrayList);
        ArrayList<C10873l> m137557f = m137557f();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C10873l c10873l : m137557f) {
            if (c10873l != null && str.equals(c10873l.m56437D())) {
                if (c10873l.m56449O()) {
                    arrayList3.add(c10873l);
                } else if (c10873l.m56452R()) {
                    arrayList2.add(c10873l);
                }
            }
        }
        Collections.sort(arrayList3, new a());
        Collections.sort(arrayList2, new a());
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: d */
    public C10873l m137556d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126860a) {
                    try {
                        if (this.f126861b.containsKey(str)) {
                            return (C10873l) this.f126861b.get(str);
                        }
                        return null;
                    } finally {
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public ArrayList m137557f() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        try {
            synchronized (this.f126860a) {
                arrayList = new ArrayList(this.f126861b.values());
            }
            return arrayList;
        } catch (Exception e11) {
            e11.printStackTrace();
            return arrayList2;
        }
    }

    /* renamed from: g */
    public int m137558g() {
        return this.f126861b.size();
    }

    /* renamed from: i */
    public void m137559i(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126860a) {
                    this.f126861b.remove(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
