package m00;

import ai.InterfaceC0861a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: m00.h */
/* loaded from: classes4.dex */
public final class C22709h {

    /* renamed from: a */
    public static final C22709h f111259a = new C22709h();

    private C22709h() {
    }

    /* renamed from: a */
    public static final void m117426a(List list, String str, int i11, List list2, List list3, InterfaceC18505l interfaceC18505l, InterfaceC18510q interfaceC18510q) {
        float f11;
        AbstractC19074t.m100208f(list, "srcList");
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list2, "highlightPosList");
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        AbstractC19074t.m100208f(interfaceC18510q, "doOnResultFound");
        for (Object obj : list) {
            String str2 = (String) interfaceC18505l.mo205i9(obj);
            if (str2 != null) {
                f11 = C22708g.m117420h(str, str2, obj, list2, list3, i11);
            } else {
                f11 = 0.0f;
            }
            if (f11 > 0.0f && str2 != null) {
                interfaceC18510q.mo45599Hr(obj, str2, Float.valueOf(f11));
            }
        }
    }

    /* renamed from: b */
    public static final void m117427b(List list, String str, List list2, int i11, InterfaceC22705d interfaceC22705d, InterfaceC18511r interfaceC18511r) {
        int i12;
        AbstractC19074t.m100208f(list, "srcList");
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list2, "recentClickList");
        AbstractC19074t.m100208f(interfaceC22705d, "searchPredicates");
        AbstractC19074t.m100208f(interfaceC18511r, "doOnResultFound");
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = list.iterator();
        C22704c c22704c = null;
        Object obj = null;
        float f11 = 0.0f;
        while (it.hasNext()) {
            InterfaceC0861a interfaceC0861a = (InterfaceC0861a) it.next();
            Iterator it2 = interfaceC22705d.mo117409a(interfaceC0861a).iterator();
            int i13 = 0;
            while (true) {
                if (it2.hasNext()) {
                    C22704c c22704c2 = (C22704c) it2.next();
                    String str2 = (String) c22704c2.m117412b().mo205i9(interfaceC0861a);
                    if (str2 != null) {
                        f11 = C22708g.m117420h(str, str2, interfaceC0861a, interfaceC0861a.mo2482h(), arrayList, i11);
                    } else {
                        f11 = 0.0f;
                    }
                    i13++;
                    if (f11 > 0.0f) {
                        i12 = i13;
                        c22704c = c22704c2;
                        obj = str2;
                        break;
                    }
                    c22704c = c22704c2;
                    obj = str2;
                } else {
                    i12 = i13;
                    break;
                }
            }
            if (f11 > 0.0f && obj != null && c22704c != null) {
                String mo2478b = interfaceC0861a.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                interfaceC0861a.mo2483i(C22708g.m117417e(mo2478b, null, list2, currentTimeMillis, i11, null) + f11);
                interfaceC18511r.mo49340Uc(interfaceC0861a, obj, Integer.valueOf(c22704c.m117411a()), Integer.valueOf(i12));
            }
        }
    }
}
