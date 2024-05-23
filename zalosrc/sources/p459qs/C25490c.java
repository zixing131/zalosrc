package p459qs;

import com.zing.zalo.control.C7904b;
import java.util.ArrayList;
import java.util.HashMap;
import p716zh.C31961i8;
import p716zh.C31988k5;

/* renamed from: qs.c */
/* loaded from: classes4.dex */
public class C25490c {

    /* renamed from: c */
    private static volatile C25490c f122111c;

    /* renamed from: a */
    final HashMap f122112a = new HashMap();

    /* renamed from: b */
    private final HashMap f122113b = new HashMap();

    /* renamed from: i */
    public static int m132053i(String str) {
        if (str == null) {
            return 0;
        }
        Integer[] numArr = {1, 2, 3, 4};
        for (int i11 = 0; i11 < 4; i11++) {
            Integer num = numArr[i11];
            if (str.indexOf(String.format("%d_", num)) >= 0) {
                return num.intValue();
            }
        }
        return 0;
    }

    /* renamed from: j */
    public static synchronized C25490c m132054j() {
        C25490c c25490c;
        synchronized (C25490c.class) {
            try {
                if (f122111c == null) {
                    synchronized (C25490c.class) {
                        try {
                            if (f122111c == null) {
                                f122111c = new C25490c();
                            }
                        } finally {
                        }
                    }
                }
                c25490c = f122111c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c25490c;
    }

    /* renamed from: a */
    public void m132055a(String str, String str2) {
        if (str2 != null && str != null) {
            ArrayList arrayList = (ArrayList) this.f122112a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(0, str2);
            this.f122112a.put(str, arrayList);
        }
    }

    /* renamed from: b */
    public void m132056b(C31988k5 c31988k5) {
        if (c31988k5 == null) {
            return;
        }
        this.f122113b.put(c31988k5.m154218b(), c31988k5);
    }

    /* renamed from: c */
    public C31988k5 m132057c(C7904b c7904b) {
        if (c7904b == null) {
            return null;
        }
        C31988k5 c31988k5 = new C31988k5(1);
        c31988k5.f147201b = c7904b;
        m132056b(c31988k5);
        return c31988k5;
    }

    /* renamed from: d */
    public C31988k5 m132058d(C7904b c7904b) {
        if (c7904b == null) {
            return null;
        }
        C31988k5 c31988k5 = new C31988k5(4);
        c31988k5.f147201b = c7904b;
        m132056b(c31988k5);
        return c31988k5;
    }

    /* renamed from: e */
    public C31988k5 m132059e(C7904b c7904b) {
        if (c7904b == null) {
            return null;
        }
        C31988k5 c31988k5 = new C31988k5(2);
        c31988k5.f147201b = c7904b;
        m132056b(c31988k5);
        return c31988k5;
    }

    /* renamed from: f */
    public C31988k5 m132060f(C31961i8 c31961i8) {
        if (c31961i8 == null) {
            return null;
        }
        C31988k5 c31988k5 = new C31988k5(3);
        c31988k5.f147202c = c31961i8;
        m132056b(c31988k5);
        return c31988k5;
    }

    /* renamed from: g */
    public void m132061g() {
        this.f122112a.clear();
        this.f122113b.clear();
    }

    /* renamed from: h */
    public C31988k5 m132062h(String str) {
        if (str == null) {
            return null;
        }
        return (C31988k5) this.f122113b.get(str);
    }

    /* renamed from: k */
    public void m132063k(String str, String str2) {
        if (str2 != null && str != null) {
            ArrayList arrayList = (ArrayList) this.f122112a.get(str);
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((String) arrayList.get(i11)).equals(str2)) {
                        arrayList.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            this.f122112a.put(str, arrayList);
        }
    }
}
