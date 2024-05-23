package vg;

import ae.C0766k;
import android.text.TextUtils;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23006a0;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p716zh.C32006l8;

/* renamed from: vg.t6 */
/* loaded from: classes3.dex */
public class C28194t6 {

    /* renamed from: g */
    private static C28194t6 f131355g;

    /* renamed from: b */
    Map f131357b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    List f131358c = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    LinkedHashMap f131356a = new a(50, 0.75f, true);

    /* renamed from: e */
    Map f131360e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    List f131361f = Collections.synchronizedList(new ArrayList());

    /* renamed from: d */
    LinkedHashMap f131359d = new b(50, 0.75f, true);

    /* renamed from: vg.t6$a */
    /* loaded from: classes3.dex */
    class a extends LinkedHashMap {
        a(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: vg.t6$b */
    /* loaded from: classes3.dex */
    class b extends LinkedHashMap {
        b(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: vg.t6$c */
    /* loaded from: classes3.dex */
    class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f131364a;

        c(String str) {
            this.f131364a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28194t6.this.m141772h(this.f131364a, -1, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C32006l8 c32006l8 = new C32006l8((JSONObject) obj);
                if (c32006l8.f147274a != null && c32006l8.f147277d != null && c32006l8.f147276c != null && c32006l8.f147281h != null) {
                    c32006l8.f147279f = System.currentTimeMillis();
                    String str = this.f131364a;
                    c32006l8.f147278e = str;
                    C28194t6.this.m141772h(str, 0, c32006l8);
                    return;
                }
                throw new IllegalArgumentException("Invalid latest profile info of user: " + this.f131364a);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C28194t6.this.m141772h(this.f131364a, -1, null);
            }
        }
    }

    /* renamed from: vg.t6$d */
    /* loaded from: classes3.dex */
    class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f131366a;

        d(String str) {
            this.f131366a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28194t6.this.m141772h(this.f131366a, -1, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C32006l8 c32006l8 = new C32006l8((JSONObject) obj);
                if (c32006l8.f147274a != null && c32006l8.f147277d != null && c32006l8.f147276c != null && c32006l8.f147281h != null) {
                    c32006l8.f147279f = System.currentTimeMillis();
                    String str = this.f131366a;
                    c32006l8.f147278e = str;
                    C28194t6.this.m141772h(str, 0, c32006l8);
                    return;
                }
                throw new IllegalArgumentException("Invalid latest profile info of user: " + this.f131366a);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C28194t6.this.m141772h(this.f131366a, -1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.t6$e */
    /* loaded from: classes3.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f131368a;

        /* renamed from: b */
        final /* synthetic */ String f131369b;

        /* renamed from: c */
        final /* synthetic */ boolean f131370c;

        /* renamed from: d */
        final /* synthetic */ int f131371d;

        /* renamed from: e */
        final /* synthetic */ C32006l8 f131372e;

        e(String str, String str2, boolean z11, int i11, C32006l8 c32006l8) {
            this.f131368a = str;
            this.f131369b = str2;
            this.f131370c = z11;
            this.f131371d = i11;
            this.f131372e = c32006l8;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28194t6.this.m141771g(this.f131368a, -1, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C32006l8 c32006l8 = new C32006l8((JSONObject) obj);
                if (c32006l8.f147274a != null && c32006l8.f147277d != null && c32006l8.f147276c != null && c32006l8.f147281h != null) {
                    if (TextUtils.isEmpty(c32006l8.f147275b) && !TextUtils.isEmpty(this.f131369b)) {
                        c32006l8.f147275b = this.f131369b;
                    }
                    c32006l8.f147279f = System.currentTimeMillis();
                    String str = this.f131368a;
                    c32006l8.f147278e = str;
                    c32006l8.f147297x = this.f131370c;
                    c32006l8.f147298y = this.f131371d;
                    if (c32006l8.f147286m == -1) {
                        c32006l8.f147286m = this.f131372e.f147286m;
                    }
                    C28194t6.this.m141771g(str, 0, c32006l8);
                    return;
                }
                throw new IllegalArgumentException("Invalid latest profile info of user: " + this.f131368a);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C28194t6.this.m141771g(this.f131368a, -1, null);
            }
        }
    }

    /* renamed from: vg.t6$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: n */
        void mo60866n(int i11, String str, C32006l8 c32006l8);
    }

    C28194t6() {
    }

    /* renamed from: b */
    public static C28194t6 m141765b() {
        if (f131355g == null) {
            synchronized (C28194t6.class) {
                f131355g = new C28194t6();
            }
        }
        return f131355g;
    }

    /* renamed from: a */
    public void m141766a() {
        LinkedHashMap linkedHashMap = this.f131359d;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    /* renamed from: c */
    public synchronized void m141767c(C32006l8 c32006l8, f fVar) {
        try {
            try {
                String str = c32006l8.f147278e;
                String str2 = c32006l8.f147275b;
                int i11 = c32006l8.f147287n;
                boolean z11 = c32006l8.f147297x;
                int i12 = c32006l8.f147298y;
                if (!TextUtils.isEmpty(str) && fVar != null) {
                    C32006l8 c32006l82 = (C32006l8) this.f131359d.get(str);
                    if (c32006l82 != null && !m141770f(c32006l82)) {
                        if (TextUtils.isEmpty(c32006l82.f147275b) && !TextUtils.isEmpty(str2)) {
                            c32006l82.f147275b = str2;
                        }
                        c32006l82.f147291r = c32006l8.f147291r;
                        c32006l82.f147292s = c32006l8.f147292s;
                        c32006l82.f147297x = c32006l8.f147297x;
                        c32006l82.f147298y = i12;
                        if (c32006l82.f147286m == -1) {
                            c32006l82.f147286m = c32006l8.f147286m;
                        }
                        fVar.mo60866n(0, str, c32006l82);
                        return;
                    }
                    this.f131360e.put(str, fVar);
                    if (!this.f131361f.contains(str)) {
                        this.f131361f.add(str);
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new e(str, str2, z11, i12, c32006l8));
                        c0766k.mo1587Z5(str, AbstractC23006a0.m117914j(), i11, true);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public synchronized void m141768d(String str, f fVar) {
        try {
            if (!TextUtils.isEmpty(str) && fVar != null) {
                C32006l8 c32006l8 = (C32006l8) this.f131356a.get(str);
                if (c32006l8 != null && !m141770f(c32006l8)) {
                    fVar.mo60866n(0, str, c32006l8);
                    return;
                }
                this.f131357b.put(str, fVar);
                if (!this.f131358c.contains(str)) {
                    this.f131358c.add(str);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new c(str));
                    c0766k.mo1610c5(str);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public synchronized void m141769e(String str, f fVar) {
        try {
            if (!TextUtils.isEmpty(str) && fVar != null) {
                C32006l8 c32006l8 = (C32006l8) this.f131356a.get(str);
                if (c32006l8 != null && !m141770f(c32006l8)) {
                    fVar.mo60866n(0, str, c32006l8);
                    return;
                }
                this.f131357b.put(str, fVar);
                if (!this.f131358c.contains(str)) {
                    this.f131358c.add(str);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new d(str));
                    c0766k.mo1587Z5(str, AbstractC23006a0.m117914j(), 0, false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f */
    public boolean m141770f(C32006l8 c32006l8) {
        if (c32006l8 != null && c32006l8.f147279f > 0 && System.currentTimeMillis() - c32006l8.f147279f > 300000) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    synchronized void m141771g(String str, int i11, C32006l8 c32006l8) {
        try {
            try {
                this.f131361f.remove(str);
                f fVar = (f) this.f131360e.remove(str);
                if (i11 == 0 && c32006l8 != null && c32006l8.f147274a != null && c32006l8.f147281h != null) {
                    this.f131359d.put(str, c32006l8);
                    if (fVar != null) {
                        fVar.mo60866n(0, str, c32006l8);
                    }
                } else if (fVar != null) {
                    fVar.mo60866n(-1, str, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h */
    synchronized void m141772h(String str, int i11, C32006l8 c32006l8) {
        try {
            try {
                this.f131358c.remove(str);
                f fVar = (f) this.f131357b.remove(str);
                if (i11 == 0 && c32006l8 != null && c32006l8.f147274a != null && c32006l8.f147281h != null) {
                    this.f131356a.put(str, c32006l8);
                    if (fVar != null) {
                        fVar.mo60866n(0, str, c32006l8);
                    }
                } else if (fVar != null) {
                    fVar.mo60866n(-1, str, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
