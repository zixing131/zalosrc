package p254j3;

import com.adtima.Adtima;
import java.util.ArrayList;
import p009a3.C0098c;
import p009a3.C0099d;
import p009a3.C0101f;
import p227i3.AbstractC20202f;

/* renamed from: j3.b */
/* loaded from: classes2.dex */
public final class C20911b {

    /* renamed from: a */
    private static final String f102738a = "b";

    /* renamed from: b */
    private static C20911b f102739b;

    private C20911b() {
    }

    /* renamed from: a */
    public static C20911b m109386a() {
        if (f102739b == null) {
            f102739b = new C20911b();
        }
        return f102739b;
    }

    /* renamed from: b */
    public void m109387b(String str, String str2, String str3, C0101f c0101f) {
        try {
            C20910a.m109380a().m109382c(str, str2, str3, c0101f);
        } catch (Exception e11) {
            Adtima.m18329e(f102738a, "setup", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:            if (p227i3.C20218v.m105636a().m105640e(((p009a3.C0098c) r3).f492X) != false) goto L8;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m109388c(Object obj) {
        if (obj != null) {
            try {
                if (!(obj instanceof C0098c)) {
                    boolean z11 = obj instanceof C0099d;
                }
            } catch (Exception e11) {
                Adtima.m18329e(f102738a, "checkIfValid", e11);
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m109389d(String str, String str2, String str3) {
        try {
            return C20910a.m109380a().m109381b(str, str2, str3);
        } catch (Exception e11) {
            Adtima.m18329e(f102738a, "clean", e11);
            return false;
        }
    }

    /* renamed from: e */
    public C0101f m109390e(String str, String str2, String str3) {
        try {
            return C20910a.m109380a().m109383d(str, str2, str3);
        } catch (Exception e11) {
            Adtima.m18329e(f102738a, "get", e11);
            return null;
        }
    }

    /* renamed from: f */
    public boolean m109391f(String str, String str2, String str3, C0101f c0101f) {
        try {
            return C20910a.m109380a().m109385f(str, str2, str3, c0101f);
        } catch (Exception e11) {
            Adtima.m18329e(f102738a, "update", e11);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:            if (r2.size() <= 1) goto L50;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:18:0x002a, B:24:0x008f, B:26:0x0097, B:29:0x009b), top: B:17:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:18:0x002a, B:24:0x008f, B:26:0x0097, B:29:0x009b), top: B:17:0x002a }] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [j3.b] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m109392g(String str, String str2, String str3) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        Object obj3 = null;
        try {
            C0101f m109383d = C20910a.m109380a().m109383d(str, str2, str3);
            if (m109383d != null && (arrayList = m109383d.f575a) != null && arrayList.size() != 0) {
                if (!AbstractC20202f.f99796X.equals(AbstractC20202f.f99794V)) {
                    obj = 0;
                    Object obj4 = null;
                    do {
                        try {
                            obj4 = m109383d.f575a.remove(0);
                            obj = obj;
                            if (!(obj4 instanceof C0098c)) {
                                if (obj == 0) {
                                    obj = new ArrayList();
                                }
                                C0099d c0099d = (C0099d) obj4;
                                if (m109388c(c0099d)) {
                                    obj.add(c0099d);
                                }
                                if (m109383d.f575a.size() == 0 || (obj2 = m109383d.f575a.get(0)) == null || !(obj2 instanceof C0099d)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            obj3 = obj4;
                            Adtima.m18329e(f102738a, "pop", e);
                            return obj3;
                        }
                    } while (m109383d.f575a.size() > 0);
                    obj = obj4;
                    if (m109383d.f575a.size() != 0) {
                        m109391f(str, str2, str3, null);
                    } else {
                        m109391f(str, str2, str3, m109383d);
                    }
                    return obj;
                }
                while (true) {
                    obj = m109383d.f575a.remove(0);
                    try {
                        if (m109388c(obj)) {
                            break;
                        }
                        if (m109383d.f575a.size() <= 0) {
                            obj = 0;
                            break;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        obj3 = obj;
                        Adtima.m18329e(f102738a, "pop", e);
                        return obj3;
                    }
                }
                if (m109383d.f575a.size() != 0) {
                }
                return obj;
            }
            return null;
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* renamed from: h */
    public int m109393h(String str, String str2, String str3) {
        ArrayList arrayList;
        try {
            C0101f m109383d = C20910a.m109380a().m109383d(str, str2, str3);
            if (m109383d != null && (arrayList = m109383d.f575a) != null) {
                return arrayList.size();
            }
        } catch (Exception e11) {
            Adtima.m18329e(f102738a, "size", e11);
        }
        return 0;
    }
}
