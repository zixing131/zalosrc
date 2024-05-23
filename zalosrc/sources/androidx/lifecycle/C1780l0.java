package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.AbstractC1438d;
import androidx.savedstate.C1938a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;
import p664y.AbstractC30228a;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;

/* renamed from: androidx.lifecycle.l0 */
/* loaded from: classes2.dex */
public final class C1780l0 {

    /* renamed from: f */
    public static final a f7345f = new a(null);

    /* renamed from: g */
    private static final Class[] f7346g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    private final Map f7347a;

    /* renamed from: b */
    private final Map f7348b;

    /* renamed from: c */
    private final Map f7349c;

    /* renamed from: d */
    private final Map f7350d;

    /* renamed from: e */
    private final C1938a.c f7351e;

    /* renamed from: androidx.lifecycle.l0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C1780l0 m9322a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1780l0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    AbstractC19074t.m100207e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new C1780l0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = parcelableArrayList.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i11));
                }
                return new C1780l0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        /* renamed from: b */
        public final boolean m9323b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1780l0.f7346g) {
                AbstractC19074t.m100205c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1780l0(Map map) {
        AbstractC19074t.m100208f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7347a = linkedHashMap;
        this.f7348b = new LinkedHashMap();
        this.f7349c = new LinkedHashMap();
        this.f7350d = new LinkedHashMap();
        this.f7351e = new C1938a.c() { // from class: androidx.lifecycle.k0
            @Override // androidx.savedstate.C1938a.c
            /* renamed from: a */
            public final Bundle mo4659a() {
                Bundle m9317f;
                m9317f = C1780l0.m9317f(C1780l0.this);
                return m9317f;
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Bundle m9317f(C1780l0 c1780l0) {
        Map m131415t;
        AbstractC19074t.m100208f(c1780l0, "this$0");
        m131415t = AbstractC25363p0.m131415t(c1780l0.f7348b);
        for (Map.Entry entry : m131415t.entrySet()) {
            c1780l0.m9321g((String) entry.getKey(), ((C1938a.c) entry.getValue()).mo4659a());
        }
        Set<String> keySet = c1780l0.f7347a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(c1780l0.f7347a.get(str));
        }
        return AbstractC1438d.m7341b(AbstractC24866w.m129235a("keys", arrayList), AbstractC24866w.m129235a("values", arrayList2));
    }

    /* renamed from: c */
    public final Object m9318c(String str) {
        AbstractC19074t.m100208f(str, "key");
        try {
            return this.f7347a.get(str);
        } catch (ClassCastException unused) {
            m9319d(str);
            return null;
        }
    }

    /* renamed from: d */
    public final Object m9319d(String str) {
        AbstractC19074t.m100208f(str, "key");
        Object remove = this.f7347a.remove(str);
        AbstractC30228a.m149044a(this.f7349c.remove(str));
        this.f7350d.remove(str);
        return remove;
    }

    /* renamed from: e */
    public final C1938a.c m9320e() {
        return this.f7351e;
    }

    /* renamed from: g */
    public final void m9321g(String str, Object obj) {
        C1761c0 c1761c0;
        AbstractC19074t.m100208f(str, "key");
        if (f7345f.m9323b(obj)) {
            Object obj2 = this.f7349c.get(str);
            if (obj2 instanceof C1761c0) {
                c1761c0 = (C1761c0) obj2;
            } else {
                c1761c0 = null;
            }
            if (c1761c0 != null) {
                c1761c0.mo9224q(obj);
            } else {
                this.f7347a.put(str, obj);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f7350d.get(str);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(obj);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        AbstractC19074t.m100205c(obj);
        sb2.append(obj.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public C1780l0() {
        this.f7347a = new LinkedHashMap();
        this.f7348b = new LinkedHashMap();
        this.f7349c = new LinkedHashMap();
        this.f7350d = new LinkedHashMap();
        this.f7351e = new C1938a.c() { // from class: androidx.lifecycle.k0
            @Override // androidx.savedstate.C1938a.c
            /* renamed from: a */
            public final Bundle mo4659a() {
                Bundle m9317f;
                m9317f = C1780l0.m9317f(C1780l0.this);
                return m9317f;
            }
        };
    }
}
