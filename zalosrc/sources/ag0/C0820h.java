package ag0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import mm0.AbstractC23350e;
import p588vw.C28652r;

/* renamed from: ag0.h */
/* loaded from: classes6.dex */
public class C0820h extends Thread {

    /* renamed from: A */
    public static Editable f2871A;

    /* renamed from: r */
    private static volatile C0820h f2872r;

    /* renamed from: s */
    private static final Object f2873s = new Object();

    /* renamed from: t */
    public static final List f2874t = new LinkedList();

    /* renamed from: u */
    public static final List f2875u = new LinkedList();

    /* renamed from: v */
    public static final List f2876v = new LinkedList();

    /* renamed from: w */
    public static final List f2877w = new LinkedList();

    /* renamed from: x */
    public static String f2878x;

    /* renamed from: y */
    public static int f2879y;

    /* renamed from: z */
    public static Editable f2880z;

    /* renamed from: p */
    private a f2881p;

    /* renamed from: q */
    private volatile boolean f2882q;

    /* renamed from: ag0.h$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo2144a(Editable editable, int i11, int i12);
    }

    private C0820h(a aVar) {
        super("Z:ComposeInsertEmojiWorker");
        this.f2881p = null;
        this.f2882q = true;
        this.f2881p = aVar;
        if (f2872r == null) {
            f2872r = this;
            start();
        }
    }

    /* renamed from: b */
    static void m2139b(String str) {
    }

    /* renamed from: c */
    public static void m2140c(Editable editable, int i11, String str, float f11, a aVar) {
        List list;
        List list2;
        try {
            m2141d(aVar);
            if (f2872r != null) {
                Object obj = f2873s;
                synchronized (obj) {
                    try {
                        m2139b("queueEmoji: " + str + " ; " + i11 + " ; " + ((Object) editable));
                        if (f2880z != null && editable.toString().equals(f2880z.toString())) {
                            f2880z = null;
                        }
                        List list3 = f2874t;
                        if (list3 != null && (list = f2875u) != null && (list2 = f2877w) != null) {
                            list2.add(new SpannableStringBuilder(editable));
                            list3.add(str);
                            list.add(Integer.valueOf(i11));
                            f2876v.add(Float.valueOf(f11));
                            obj.notifyAll();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    public static synchronized void m2141d(a aVar) {
        synchronized (C0820h.class) {
            if (f2872r == null) {
                synchronized (C0820h.class) {
                    try {
                        if (f2872r == null) {
                            f2872r = new C0820h(aVar);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m2142e() {
        try {
            if (f2872r != null) {
                synchronized (f2873s) {
                    while (!f2874t.isEmpty()) {
                        try {
                            f2872r.m2143a();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    f2872r.f2882q = false;
                    f2873s.notifyAll();
                    f2871A = null;
                    f2880z = null;
                }
                if (f2872r != null) {
                    f2872r.interrupt();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a */
    void m2143a() {
        Editable editable;
        try {
            synchronized (f2873s) {
                try {
                    List list = f2874t;
                    String str = (String) list.remove(0);
                    int intValue = ((Integer) f2875u.remove(0)).intValue();
                    Editable editable2 = (Editable) f2877w.remove(0);
                    float floatValue = ((Float) f2876v.remove(0)).floatValue();
                    if (!(editable2 instanceof SpannableStringBuilder)) {
                        editable = new SpannableStringBuilder(editable2);
                    } else {
                        editable = editable2;
                    }
                    if (f2880z != null && !editable2.toString().equals(f2880z.toString())) {
                        editable = new SpannableStringBuilder(f2880z);
                        intValue = f2879y;
                    }
                    m2139b("beforeInsertEmoji: " + str + " ; " + intValue + " ; " + ((Object) editable));
                    if (!TextUtils.isEmpty(str)) {
                        editable.insert(intValue, str);
                        C28652r.m143349v().m143363Y(editable, intValue, str.length() + intValue, floatValue);
                    }
                    m2139b("afterInsertEmoji: " + str + " ; " + (str.length() + intValue) + " ; " + ((Object) editable));
                    f2878x = str;
                    f2879y = str.length() + intValue;
                    f2880z = editable;
                    if (this.f2881p != null && list.isEmpty()) {
                        this.f2881p.mo2144a(editable, intValue, str.length() + intValue);
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2882q) {
            Object obj = f2873s;
            synchronized (obj) {
                if (f2874t.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!this.f2882q) {
                break;
            } else {
                m2143a();
            }
        }
        f2872r = null;
    }
}
