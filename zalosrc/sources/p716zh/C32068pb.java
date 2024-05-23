package p716zh;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p363nh.C23744a;
import p394oj.C24279e;

/* renamed from: zh.pb */
/* loaded from: classes3.dex */
public class C32068pb {

    /* renamed from: a */
    public final Map f147655a;

    /* renamed from: b */
    Handler f147656b;

    /* renamed from: c */
    private final Runnable f147657c;

    /* renamed from: zh.pb$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C32068pb.this.f147655a) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i11 = 12000;
                    try {
                        Iterator it = C32068pb.this.f147655a.values().iterator();
                        while (it.hasNext()) {
                            C24279e c24279e = (C24279e) it.next();
                            long j11 = currentTimeMillis - c24279e.f117260g;
                            if (j11 >= 12000) {
                                it.remove();
                                C23744a.m124114c().m124116d(100, c24279e.f117255b);
                            } else {
                                i11 = (int) Math.min(12000 - j11, i11);
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (!C32068pb.this.f147655a.isEmpty()) {
                        C32068pb.this.f147656b.postDelayed(this, i11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: zh.pb$b */
    /* loaded from: classes3.dex */
    private static final class b {

        /* renamed from: a */
        static final C32068pb f147659a = new C32068pb();
    }

    /* renamed from: b */
    public static C32068pb m154702b() {
        return b.f147659a;
    }

    /* renamed from: a */
    public void m154703a(C24279e c24279e) {
        if (c24279e != null) {
            synchronized (this.f147655a) {
                try {
                    if (!this.f147655a.containsKey(c24279e.f117255b)) {
                        boolean isEmpty = this.f147655a.isEmpty();
                        this.f147655a.put(c24279e.f117255b, c24279e);
                        if (isEmpty) {
                            this.f147656b.postDelayed(this.f147657c, 12000L);
                        }
                        C23744a.m124114c().m124116d(100, c24279e.f117255b);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public void m154704c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f147655a) {
            try {
                if (this.f147655a.containsKey(str)) {
                    this.f147655a.remove(str);
                    C23744a.m124114c().m124116d(100, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C32068pb() {
        this.f147655a = Collections.synchronizedMap(new HashMap());
        this.f147656b = new Handler(Looper.getMainLooper());
        this.f147657c = new a();
    }
}
