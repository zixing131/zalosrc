package p716zh;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* renamed from: zh.b4 */
/* loaded from: classes3.dex */
public final class C31852b4 {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final List f146268c;

    /* renamed from: d */
    private static final List f146269d;

    /* renamed from: e */
    private static final InterfaceC24854k f146270e;

    /* renamed from: f */
    private static final C31852b4 f146271f;

    /* renamed from: a */
    private final int f146272a;

    /* renamed from: b */
    private final boolean f146273b;

    /* renamed from: zh.b4$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f146274q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            HashMap hashMap = new HashMap();
            Iterator it = C31852b4.Companion.m153134h().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                AbstractC19060k abstractC19060k = null;
                C31852b4 c31852b4 = new C31852b4(intValue, false, abstractC19060k);
                hashMap.put(Integer.valueOf(c31852b4.hashCode()), c31852b4);
                C31852b4 c31852b42 = new C31852b4(intValue, true, abstractC19060k);
                hashMap.put(Integer.valueOf(c31852b42.hashCode()), c31852b42);
            }
            return hashMap;
        }
    }

    /* renamed from: zh.b4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m153128c(int i11, boolean z11) {
            return (z11 ? 100 : 0) + i11;
        }

        /* renamed from: b */
        public final C31852b4 m153129b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            return m153130d(jSONObject.optInt("platform"), jSONObject.optBoolean("isMine"));
        }

        /* renamed from: d */
        public final C31852b4 m153130d(int i11, boolean z11) {
            int m153128c = m153128c(i11, z11);
            C31852b4 c31852b4 = (C31852b4) m153131e().get(Integer.valueOf(m153128c));
            if (c31852b4 == null) {
                C31852b4 c31852b42 = new C31852b4(i11, z11, null);
                C31852b4.Companion.m153131e().put(Integer.valueOf(m153128c), c31852b42);
                return c31852b42;
            }
            return c31852b4;
        }

        /* renamed from: e */
        public final HashMap m153131e() {
            return (HashMap) C31852b4.f146270e.getValue();
        }

        /* renamed from: f */
        public final List m153132f() {
            return C31852b4.f146269d;
        }

        /* renamed from: g */
        public final C31852b4 m153133g() {
            return C31852b4.f146271f;
        }

        /* renamed from: h */
        public final List m153134h() {
            return C31852b4.f146268c;
        }

        /* renamed from: i */
        public final C31852b4 m153135i(int i11) {
            boolean z11;
            if (i11 / 100 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return m153130d(i11 % 100, z11);
        }
    }

    static {
        List m131505m;
        InterfaceC24854k m129210a;
        m131505m = AbstractC25368s.m131505m(0, 2, 1);
        f146268c = m131505m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : m131505m) {
            if (((Number) obj).intValue() != 0) {
                arrayList.add(obj);
            }
        }
        f146269d = arrayList;
        m129210a = AbstractC24856m.m129210a(a.f146274q);
        f146270e = m129210a;
        f146271f = Companion.m153130d(0, false);
    }

    public /* synthetic */ C31852b4(int i11, boolean z11, AbstractC19060k abstractC19060k) {
        this(i11, z11);
    }

    /* renamed from: e */
    public final int m153123e() {
        return this.f146272a;
    }

    public boolean equals(Object obj) {
        if (obj != this && (obj == null || obj.hashCode() != hashCode())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m153124f() {
        return this.f146273b;
    }

    /* renamed from: g */
    public final JSONObject m153125g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", this.f146272a);
        jSONObject.put("isMine", this.f146273b);
        return jSONObject;
    }

    public int hashCode() {
        return Companion.m153128c(this.f146272a, this.f146273b);
    }

    private C31852b4(int i11, boolean z11) {
        this.f146272a = i11;
        this.f146273b = z11;
    }
}
