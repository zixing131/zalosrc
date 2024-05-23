package p716zh;

import android.text.TextUtils;
import bo.C3043u0;
import ci.C3508j;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C32187y4;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25376w;

/* renamed from: zh.x4 */
/* loaded from: classes3.dex */
public abstract class AbstractC32173x4 {

    /* renamed from: a */
    private a f148328a;

    /* renamed from: b */
    private final List f148329b;

    /* renamed from: c */
    private final Map f148330c;

    /* renamed from: d */
    private C3043u0 f148331d;

    /* renamed from: e */
    private boolean f148332e;

    /* renamed from: zh.x4$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f148355q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(C32187y4 c32187y4, C32187y4 c32187y42) {
            AbstractC19074t.m100208f(c32187y4, "o1");
            AbstractC19074t.m100208f(c32187y42, "o2");
            return Integer.valueOf(c32187y4.m155178f() - c32187y42.m155178f());
        }
    }

    public AbstractC32173x4() {
        this.f148329b = Collections.synchronizedList(new ArrayList());
        this.f148330c = Collections.synchronizedMap(new HashMap());
    }

    /* renamed from: n */
    public static final int m155143n(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: b */
    public final void m155144b(C32187y4 c32187y4) {
        AbstractC19074t.m100208f(c32187y4, "item");
        List list = this.f148329b;
        AbstractC19074t.m100205c(list);
        synchronized (list) {
            try {
                if (!mo46310d(c32187y4)) {
                    a aVar = this.f148328a;
                    if (aVar != null) {
                        AbstractC19074t.m100205c(aVar);
                        c32187y4.m155190r(aVar.m155155a());
                    }
                    this.f148329b.add(c32187y4);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m155145c(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m155144b((C32187y4) it.next());
                }
                m155154m();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public abstract boolean mo46310d(C32187y4 c32187y4);

    /* renamed from: e */
    public final long m155146e() {
        a aVar = this.f148328a;
        if (aVar != null) {
            return aVar.m155155a();
        }
        return 0L;
    }

    /* renamed from: f */
    public final long m155147f() {
        a aVar = this.f148328a;
        if (aVar != null) {
            AbstractC19074t.m100205c(aVar);
            return aVar.m155156b();
        }
        return 0L;
    }

    /* renamed from: g */
    public final a m155148g() {
        return this.f148328a;
    }

    /* renamed from: h */
    public final int m155149h() {
        int i11;
        C32187y4.b m155176d;
        List list = this.f148329b;
        AbstractC19074t.m100205c(list);
        synchronized (list) {
            try {
                AbstractC19074t.m100205c(this.f148329b);
                if (!r1.isEmpty()) {
                    C32187y4 c32187y4 = (C32187y4) this.f148329b.get(this.f148329b.size() - 1);
                    if (c32187y4 != null && (m155176d = c32187y4.m155176d()) != null) {
                        i11 = m155176d.m155193b();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
                i11 = 0;
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: i */
    public final List m155150i() {
        ArrayList arrayList = new ArrayList();
        try {
            List list = this.f148329b;
            AbstractC19074t.m100205c(list);
            synchronized (list) {
                try {
                    AbstractC19074t.m100205c(this.f148329b);
                    if (!r2.isEmpty()) {
                        int i11 = 0;
                        int m155178f = ((C32187y4) this.f148329b.get(0)).m155178f();
                        int size = this.f148329b.size();
                        if (size >= 0) {
                            int i12 = 0;
                            while (true) {
                                if (i11 == this.f148329b.size()) {
                                    arrayList.add(new ArrayList(this.f148329b.subList(i12, i11)));
                                } else {
                                    C32187y4 c32187y4 = (C32187y4) this.f148329b.get(i11);
                                    if (m155178f != c32187y4.m155178f()) {
                                        arrayList.add(new ArrayList(this.f148329b.subList(i12, i11)));
                                        m155178f = c32187y4.m155178f();
                                        i12 = i11;
                                    }
                                }
                                if (i11 == size) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: j */
    public final List m155151j() {
        return this.f148329b;
    }

    /* renamed from: k */
    public final boolean m155152k() {
        return this.f148328a != null;
    }

    /* renamed from: l */
    public final boolean m155153l() {
        a aVar = this.f148328a;
        if (aVar == null || !aVar.m155161g()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void m155154m() {
        try {
            List list = this.f148329b;
            AbstractC19074t.m100205c(list);
            synchronized (list) {
                try {
                    AbstractC19074t.m100205c(this.f148329b);
                    if (!r1.isEmpty()) {
                        List list2 = this.f148329b;
                        AbstractC19074t.m100205c(list2);
                        AbstractC25376w.m131534w(list2, new Comparator() { // from class: zh.w4
                            public /* synthetic */ C32159w4() {
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                int m155143n;
                                m155143n = AbstractC32173x4.m155143n(InterfaceC18509p.this, obj, obj2);
                                return m155143n;
                            }
                        });
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f148329b.iterator();
        while (it.hasNext()) {
            sb2.append((C32187y4) it.next());
            sb2.append(" ");
        }
        return "FeedProfileAlbumItem{" + ((Object) sb2) + "}";
    }

    public AbstractC32173x4(JSONObject jSONObject) {
        this();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("header") && jSONObject.getJSONObject("header").length() > 0) {
                    this.f148328a = new a(jSONObject.getJSONObject("header"));
                }
                JSONArray jSONArray = !jSONObject.isNull("content") ? jSONObject.getJSONArray("content") : null;
                int i11 = 0;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    int i12 = 0;
                    while (i11 < length) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        boolean has = jSONObject2.has("layout");
                        m155144b(new C32187y4(jSONObject2));
                        i11++;
                        i12 = has;
                    }
                    i11 = i12;
                }
                if (!jSONObject.isNull("footer") && jSONObject.getJSONObject("footer").length() > 0) {
                    this.f148331d = new C3043u0(jSONObject.getJSONObject("footer"));
                }
                this.f148332e = jSONObject.optBoolean("isSelected");
                if (i11 != 0) {
                    m155154m();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.x4$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private String f148333a;

        /* renamed from: b */
        private long f148334b;

        /* renamed from: c */
        private long f148335c;

        /* renamed from: d */
        private double f148336d;

        /* renamed from: e */
        private double f148337e;

        /* renamed from: f */
        private int f148338f;

        /* renamed from: g */
        private int f148339g;

        /* renamed from: h */
        private int f148340h;

        /* renamed from: i */
        private int f148341i;

        /* renamed from: j */
        private String f148342j;

        /* renamed from: k */
        private String f148343k;

        /* renamed from: l */
        private String f148344l;

        /* renamed from: m */
        private final InterfaceC24854k f148345m;

        /* renamed from: n */
        private final InterfaceC24854k f148346n;

        /* renamed from: o */
        private final InterfaceC24854k f148347o;

        /* renamed from: p */
        private String f148348p;

        /* renamed from: q */
        private CharSequence f148349q;

        /* renamed from: r */
        private boolean f148350r;

        /* renamed from: s */
        private C3508j.b f148351s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zh.x4$a$a */
        /* loaded from: classes3.dex */
        public static final class C33066a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C33066a f148352q = new C33066a();

            C33066a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Set mo12V4() {
                return new LinkedHashSet();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zh.x4$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f148353q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Set mo12V4() {
                return new LinkedHashSet();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zh.x4$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final c f148354q = new c();

            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Set mo12V4() {
                return new LinkedHashSet();
            }
        }

        public a() {
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            m129210a = AbstractC24856m.m129210a(c.f148354q);
            this.f148345m = m129210a;
            m129210a2 = AbstractC24856m.m129210a(b.f148353q);
            this.f148346n = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(C33066a.f148352q);
            this.f148347o = m129210a3;
            this.f148351s = C3508j.b.f14699p;
        }

        /* renamed from: a */
        public final long m155155a() {
            return this.f148335c;
        }

        /* renamed from: b */
        public final long m155156b() {
            return this.f148334b;
        }

        /* renamed from: c */
        public final Set m155157c() {
            return (Set) this.f148347o.getValue();
        }

        /* renamed from: d */
        public final Set m155158d() {
            return (Set) this.f148346n.getValue();
        }

        /* renamed from: e */
        public final Set m155159e() {
            return (Set) this.f148345m.getValue();
        }

        /* renamed from: f */
        public final String m155160f() {
            return this.f148333a;
        }

        /* renamed from: g */
        public final boolean m155161g() {
            if (TextUtils.isEmpty(this.f148333a) && this.f148334b <= 0) {
                return false;
            }
            return true;
        }

        public a(JSONObject jSONObject) {
            this();
            if (jSONObject != null) {
                try {
                    this.f148333a = jSONObject.optString("title");
                    this.f148334b = jSONObject.optLong("createdTime");
                    this.f148336d = jSONObject.optDouble("lon", 0.0d);
                    this.f148337e = jSONObject.optDouble("lat", 0.0d);
                    this.f148335c = jSONObject.optLong("albumId");
                    this.f148338f = jSONObject.optInt("total");
                    this.f148339g = jSONObject.optInt("mediaTotal");
                    this.f148340h = jSONObject.optInt("linkTotal");
                    this.f148341i = jSONObject.optInt("fileTotal");
                    this.f148342j = jSONObject.optString("ownerId", "");
                    this.f148343k = jSONObject.optString("displayName", "");
                    this.f148344l = jSONObject.optString("avatar", "");
                    this.f148348p = jSONObject.optString("cover", "");
                    this.f148349q = jSONObject.optString("albumDescription", "");
                    boolean z11 = true;
                    if (jSONObject.optInt("isNew", 0) != 1) {
                        z11 = false;
                    }
                    this.f148350r = z11;
                    if (jSONObject.has("allItems")) {
                        m155159e().clear();
                        m155158d().clear();
                        m155157c().clear();
                        JSONObject optJSONObject = jSONObject.optJSONObject("allItems");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("mediaItems");
                            if (optJSONArray != null) {
                                int length = optJSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    m155159e().add(Long.valueOf(optJSONArray.getLong(i11)));
                                }
                            }
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("linkItems");
                            if (optJSONArray2 != null) {
                                int length2 = optJSONArray2.length();
                                for (int i12 = 0; i12 < length2; i12++) {
                                    m155158d().add(Long.valueOf(optJSONArray2.getLong(i12)));
                                }
                            }
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("fileItems");
                            if (optJSONArray3 != null) {
                                int length3 = optJSONArray3.length();
                                for (int i13 = 0; i13 < length3; i13++) {
                                    m155157c().add(Long.valueOf(optJSONArray3.getLong(i13)));
                                }
                            }
                        }
                    } else {
                        m155159e().clear();
                    }
                    for (C3508j.b bVar : C3508j.b.values()) {
                        if (bVar.ordinal() == jSONObject.optInt("subType", C3508j.b.f14699p.ordinal())) {
                            this.f148351s = bVar;
                            return;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }
}
