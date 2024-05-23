package qm0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rm0.C25836b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.r */
/* loaded from: classes.dex */
public abstract class AbstractC25366r {
    /* renamed from: a */
    public static List m131492a(List list) {
        AbstractC19074t.m100208f(list, "builder");
        return ((C25836b) list).m133223p();
    }

    /* renamed from: b */
    public static final Object[] m131493b(Object[] objArr, boolean z11) {
        AbstractC19074t.m100208f(objArr, "<this>");
        if (!z11 || !AbstractC19074t.m100204b(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            AbstractC19074t.m100207e(copyOf, "copyOf(...)");
            return copyOf;
        }
        return objArr;
    }

    /* renamed from: c */
    public static List m131494c() {
        return new C25836b();
    }

    /* renamed from: d */
    public static List m131495d(int i11) {
        return new C25836b(i11);
    }

    /* renamed from: e */
    public static List m131496e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC19074t.m100207e(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* renamed from: f */
    public static List m131497f(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        List m131186N0 = AbstractC25332a0.m131186N0(iterable);
        Collections.shuffle(m131186N0);
        return m131186N0;
    }

    /* renamed from: g */
    public static Object[] m131498g(int i11, Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
