package p716zh;

import android.text.TextUtils;
import i40.C20275e;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zh.kc */
/* loaded from: classes3.dex */
public class C31995kc {

    /* renamed from: b */
    static volatile C31995kc f147232b;

    /* renamed from: a */
    Map f147233a = new a(20);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.kc$a */
    /* loaded from: classes3.dex */
    public class a extends LinkedHashMap {
        a(int i11) {
            super(i11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    }

    private C31995kc() {
    }

    /* renamed from: c */
    public static synchronized C31995kc m154255c() {
        C31995kc c31995kc;
        synchronized (C31995kc.class) {
            try {
                if (f147232b == null) {
                    synchronized (C31995kc.class) {
                        try {
                            if (f147232b == null) {
                                f147232b = new C31995kc();
                            }
                        } finally {
                        }
                    }
                }
                c31995kc = f147232b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31995kc;
    }

    /* renamed from: a */
    public void m154256a() {
        Map map = this.f147233a;
        if (map != null) {
            map.clear();
        }
    }

    /* renamed from: b */
    public void m154257b(String str) {
        C20275e c20275e;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map map = this.f147233a;
            if (map != null) {
                c20275e = (C20275e) map.get(str);
            } else {
                c20275e = null;
            }
            if (c20275e != null) {
                c20275e.m105883v(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m154258d(String str, C20275e c20275e) {
        try {
            Map map = this.f147233a;
            if (map != null) {
                map.put(str, c20275e);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m154259e(String str) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f147233a) != null) {
                map.remove(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
