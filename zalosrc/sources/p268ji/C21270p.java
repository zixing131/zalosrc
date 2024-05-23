package p268ji;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import android.util.SparseArray;
import bg0.C2797c;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import d30.C17725e;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g30.C19216b;
import gi.EnumC19450c;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import k30.C21459a;
import lc.EnumC22425a;
import me0.AbstractC23020b3;
import me0.AbstractC23160o0;
import nh0.InterfaceC23792b;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.C20215s;
import p227i3.C20218v;
import p263jc.C21216s;
import p263jc.C21219v;
import p268ji.C21270p;
import p296kc.C21654a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p361nb.C23667x;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29231f;
import p716zh.C31973j5;
import p716zh.C32024mb;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import v30.C27517h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ji.p */
/* loaded from: classes.dex */
public final class C21270p {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final int[] f103614h = {1, 1, 1};

    /* renamed from: i */
    private static final Object f103615i = new Object();

    /* renamed from: a */
    private final SparseArray f103616a;

    /* renamed from: b */
    private final SparseArray f103617b;

    /* renamed from: c */
    private boolean f103618c;

    /* renamed from: d */
    private final InterfaceC23792b f103619d;

    /* renamed from: e */
    private final C21216s f103620e;

    /* renamed from: f */
    private final C21219v f103621f;

    /* renamed from: g */
    private final InterfaceC24854k f103622g;

    /* renamed from: ji.p$a */
    /* loaded from: classes3.dex */
    public static final class a extends Enum {

        /* renamed from: p */
        public static final a f103623p = new a("RECEIVED", 0);

        /* renamed from: q */
        public static final a f103624q = new a("QUEUED", 1);

        /* renamed from: r */
        public static final a f103625r = new a("NEW_DOWNLOAD", 2);

        /* renamed from: s */
        public static final a f103626s = new a("CACHE_DOWNLOAD", 3);

        /* renamed from: t */
        public static final a f103627t = new a("ROLLED_REMAIN_DAILY", 4);

        /* renamed from: u */
        private static final /* synthetic */ a[] f103628u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f103629v;

        static {
            a[] m110159b = m110159b();
            f103628u = m110159b;
            f103629v = AbstractC30166b.m148796a(m110159b);
        }

        private a(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m110159b() {
            return new a[]{f103623p, f103624q, f103625r, f103626s, f103627t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f103628u.clone();
        }
    }

    /* renamed from: ji.p$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m110160a(EnumC19450c enumC19450c) {
            AbstractC19074t.m100208f(enumC19450c, "curSuggestType");
            if (enumC19450c == EnumC19450c.f96554q) {
                return 3;
            }
            if (enumC19450c == EnumC19450c.f96556s) {
                return 1;
            }
            if (enumC19450c == EnumC19450c.f96557t) {
                return 2;
            }
            if (enumC19450c == EnumC19450c.f96562y) {
                return 4;
            }
            return -1;
        }

        /* renamed from: b */
        public final C21270p m110161b() {
            return c.f103630a.m110162a();
        }
    }

    /* renamed from: ji.p$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f103630a = new c();

        /* renamed from: b */
        private static final C21270p f103631b = new C21270p(null);

        private c() {
        }

        /* renamed from: a */
        public final C21270p m110162a() {
            return f103631b;
        }
    }

    /* renamed from: ji.p$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f103632a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f103623p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f103624q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f103625r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f103626s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f103627t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f103632a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ji.p$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f103633q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    public /* synthetic */ C21270p(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: A */
    private final void m110076A(JSONArray jSONArray, C17945a0 c17945a0, C21216s c21216s) {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null && AbstractC19074t.m100204b(optJSONObject.optString("id", ""), c17945a0.mo95039W2())) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    m110137x(optJSONArray, c17945a0, c21216s, false);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: A0 */
    private final void m110077A0(C23667x c23667x, String str, String str2) {
        List m131502j;
        List m131502j2;
        try {
            if (str2.length() > 0) {
                String optString = c23667x.f114649i.optString(str, "");
                List m127021i = new C24329j("_").m127021i(str2, 0);
                if (!m127021i.isEmpty()) {
                    ListIterator listIterator = m127021i.listIterator(m127021i.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            m131502j = AbstractC25332a0.m131179G0(m127021i, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m131502j = AbstractC25368s.m131502j();
                String[] strArr = (String[]) m131502j.toArray(new String[0]);
                if (strArr.length == 2) {
                    AbstractC19074t.m100205c(optString);
                    List m127021i2 = new C24329j("_").m127021i(optString, 0);
                    if (!m127021i2.isEmpty()) {
                        ListIterator listIterator2 = m127021i2.listIterator(m127021i2.size());
                        while (listIterator2.hasPrevious()) {
                            if (((String) listIterator2.previous()).length() != 0) {
                                m131502j2 = AbstractC25332a0.m131179G0(m127021i2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    m131502j2 = AbstractC25368s.m131502j();
                    String[] strArr2 = (String[]) m131502j2.toArray(new String[0]);
                    if (strArr2.length == 2) {
                        if (AbstractC19074t.m100204b(strArr[0], strArr2[0])) {
                            int parseInt = Integer.parseInt(strArr[1]);
                            int parseInt2 = Integer.parseInt(strArr2[1]);
                            str2 = strArr[0] + "_" + (parseInt + parseInt2);
                        } else {
                            str2 = optString;
                        }
                    }
                    c23667x.f114649i.put(str, str2);
                }
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: B */
    private final C2797c m110078B() {
        return (C2797c) this.f103622g.getValue();
    }

    /* renamed from: C */
    public static final C21270p m110079C() {
        return Companion.m110161b();
    }

    /* renamed from: D */
    private final List m110080D(int i11, int i12, int i13) {
        SparseArray sparseArray = (SparseArray) this.f103616a.get(i11);
        if (sparseArray != null) {
            List list = (List) sparseArray.get(i12);
            if (list != null) {
                AbstractC19074t.m100205c(list);
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (((C23667x) list.get(i14)).f114657d == i13) {
                        arrayList.add(list.get(i14));
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
        return new ArrayList();
    }

    /* renamed from: D0 */
    public static final void m110081D0(C21270p c21270p, int i11) {
        AbstractC19074t.m100208f(c21270p, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (f103615i) {
                try {
                    SparseArray sparseArray = (SparseArray) c21270p.f103617b.get(i11);
                    if (sparseArray != null) {
                        AbstractC19074t.m100205c(sparseArray);
                        int size = sparseArray.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            List list = (List) sparseArray.get(sparseArray.keyAt(i12));
                            if (list != null) {
                                AbstractC19074t.m100205c(list);
                                arrayList.addAll(c21270p.m110114k0(list));
                            }
                        }
                        c21270p.f103617b.remove(i11);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
            if (arrayList.size() > 0) {
                C7960e.m41971c6().m42573w8(arrayList);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    private final void m110082E(JSONArray jSONArray, C17945a0 c17945a0, C21216s c21216s, a aVar, boolean z11, boolean z12) {
        String mo95039W2;
        int m109888n0 = c21216s.m109888n0(c17945a0);
        if (m109888n0 != 1) {
            if (m109888n0 != 2) {
                if (m109888n0 != 4) {
                    if (m109888n0 == 8) {
                        m110085G(jSONArray, c17945a0, 2, aVar, z11, z12);
                    }
                } else {
                    m110085G(jSONArray, c17945a0, 3, aVar, z11, z12);
                }
            } else {
                m110085G(jSONArray, c17945a0, 1, aVar, z11, z12);
            }
        } else {
            m110085G(jSONArray, c17945a0, 0, aVar, z11, z12);
        }
        if (z12) {
            mo95039W2 = "";
        } else {
            mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        }
        m110126r(jSONArray, mo95039W2);
    }

    /* renamed from: E0 */
    public static final void m110083E0(C21270p c21270p, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(c21270p, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (f103615i) {
                try {
                    SparseArray sparseArray = (SparseArray) c21270p.f103617b.get(i11);
                    if (sparseArray != null) {
                        AbstractC19074t.m100205c(sparseArray);
                        List list = (List) sparseArray.get(i12);
                        if (list != null) {
                            AbstractC19074t.m100205c(list);
                            int size = list.size() - 1;
                            int i14 = 0;
                            while (i14 <= size) {
                                if (((C23667x) list.get(i14)).f114657d == i13) {
                                    C23667x c23667x = (C23667x) list.get(i14);
                                    arrayList.add(new C23667x(c23667x));
                                    c21270p.m110123p0(c23667x);
                                    Collections.swap(list, i14, size);
                                    list.remove(size);
                                    size--;
                                } else {
                                    i14++;
                                }
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    }
                } finally {
                }
            }
            if (arrayList.size() > 0) {
                C7960e.m41971c6().m42573w8(arrayList);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: F */
    private final void m110084F(JSONArray jSONArray, C17945a0 c17945a0, C21216s c21216s, a aVar) {
        int m109888n0 = c21216s.m109888n0(c17945a0);
        if (m109888n0 != 1) {
            if (m109888n0 != 2) {
                if (m109888n0 != 4) {
                    if (m109888n0 == 8) {
                        m110086H(jSONArray, c17945a0, 2, aVar);
                    }
                } else {
                    m110086H(jSONArray, c17945a0, 3, aVar);
                }
            } else {
                m110086H(jSONArray, c17945a0, 1, aVar);
            }
        } else {
            m110086H(jSONArray, c17945a0, 0, aVar);
        }
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        m110128s(jSONArray, mo95039W2);
    }

    /* renamed from: G */
    private final void m110085G(JSONArray jSONArray, C17945a0 c17945a0, int i11, a aVar, boolean z11, boolean z12) {
        try {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
            int i12 = d.f103632a[aVar.ordinal()];
            if (i12 != 1) {
                int i13 = 2;
                if (i12 != 2) {
                    if (i12 != 3) {
                        int i14 = 5;
                        if (i12 != 4) {
                            if (i12 == 5 && !z12) {
                                AbstractC19074t.m100205c(jSONArray2);
                                m110124q(c17945a0, jSONArray2, 8);
                            }
                        } else {
                            AbstractC19074t.m100205c(jSONArray2);
                            if (!z11) {
                                i14 = 6;
                            }
                            m110124q(c17945a0, jSONArray2, i14);
                        }
                    } else {
                        AbstractC19074t.m100205c(jSONArray2);
                        if (!z11) {
                            i13 = 3;
                        }
                        m110124q(c17945a0, jSONArray2, i13);
                    }
                } else {
                    AbstractC19074t.m100205c(jSONArray2);
                    m110124q(c17945a0, jSONArray2, !z11 ? 1 : 0);
                }
            } else {
                AbstractC19074t.m100205c(jSONArray2);
                m110124q(c17945a0, jSONArray2, 4);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: H */
    private final void m110086H(JSONArray jSONArray, C17945a0 c17945a0, int i11, a aVar) {
        try {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
            int i12 = d.f103632a[aVar.ordinal()];
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        AbstractC19074t.m100205c(jSONArray2);
                        m110124q(c17945a0, jSONArray2, 1);
                    }
                } else {
                    AbstractC19074t.m100205c(jSONArray2);
                    m110124q(c17945a0, jSONArray2, 1);
                }
            } else {
                AbstractC19074t.m100205c(jSONArray2);
                m110124q(c17945a0, jSONArray2, 0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: I */
    private final void m110087I(JSONArray jSONArray, C17945a0 c17945a0, int i11, a aVar) {
        if (!c17945a0.m95180k8()) {
            return;
        }
        JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
        int i12 = d.f103632a[aVar.ordinal()];
        if (i12 != 1) {
            if (i12 == 3 || i12 == 4) {
                AbstractC19074t.m100205c(jSONArray2);
                m110124q(c17945a0, jSONArray2, 1);
                return;
            }
            return;
        }
        AbstractC19074t.m100205c(jSONArray2);
        m110124q(c17945a0, jSONArray2, 0);
    }

    /* renamed from: J */
    private final void m110088J(JSONObject jSONObject, C17945a0 c17945a0, C21216s c21216s, a aVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            optJSONArray = m110133v(2);
        }
        int m109888n0 = c21216s.m109888n0(c17945a0);
        if (m109888n0 != 1) {
            if (m109888n0 != 2) {
                if (m109888n0 != 4) {
                    if (m109888n0 == 8) {
                        m110087I(optJSONArray, c17945a0, 2, aVar);
                    }
                } else {
                    m110087I(optJSONArray, c17945a0, 3, aVar);
                }
            } else {
                m110087I(optJSONArray, c17945a0, 1, aVar);
            }
        } else {
            m110087I(optJSONArray, c17945a0, 0, aVar);
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        jSONObject.put("data", optJSONArray);
    }

    /* renamed from: K */
    private final void m110089K(JSONArray jSONArray, C17945a0 c17945a0, C21216s c21216s, String str, a aVar, boolean z11) {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null && AbstractC19074t.m100204b(optJSONObject.optString("id", ""), c17945a0.mo95039W2())) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    m110082E(optJSONArray, c17945a0, c21216s, aVar, z11, false);
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c17945a0.mo95039W2());
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            int m109889o0 = c21216s.m109889o0(mo95039W2);
            if (m109889o0 != 0) {
                if (m109889o0 != 1) {
                    if (m109889o0 != 2) {
                        if (m109889o0 != 4) {
                            if (m109889o0 != 8) {
                                if (m109889o0 == 16) {
                                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, C7962g.f43287r);
                                }
                            } else {
                                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "oa");
                            }
                        } else {
                            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "ft");
                        }
                    } else {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, C20215s.f99966b);
                    }
                } else {
                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "f");
                }
            } else {
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "un");
            }
            jSONObject.put("date", str);
            try {
                JSONArray m110133v = m110133v(9);
                m110082E(m110133v, c17945a0, c21216s, aVar, z11, false);
                C24848g0 c24848g0 = C24848g0.f119245a;
                jSONObject.put("data", m110133v);
                jSONArray.put(jSONObject);
            } catch (Exception e11) {
                e = e11;
                AbstractC20110a.f98889a.mo104552e(e);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: L */
    private final void m110090L(JSONArray jSONArray, C17945a0 c17945a0, C21216s c21216s, String str, a aVar) {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null && AbstractC19074t.m100204b(optJSONObject.optString("id", ""), c17945a0.mo95039W2())) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    m110084F(optJSONArray, c17945a0, c21216s, aVar);
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c17945a0.mo95039W2());
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            int m109889o0 = c21216s.m109889o0(mo95039W2);
            if (m109889o0 != 0) {
                if (m109889o0 != 1) {
                    if (m109889o0 != 2) {
                        if (m109889o0 != 4) {
                            if (m109889o0 != 8) {
                                if (m109889o0 == 16) {
                                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, C7962g.f43287r);
                                }
                            } else {
                                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "oa");
                            }
                        } else {
                            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "ft");
                        }
                    } else {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, C20215s.f99966b);
                    }
                } else {
                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "f");
                }
            } else {
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, "un");
            }
            jSONObject.put("thread_date", str);
            JSONArray m110133v = m110133v(3);
            m110084F(m110133v, c17945a0, c21216s, aVar);
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("data", m110133v);
            jSONArray.put(jSONObject);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: N */
    public static final void m110091N(C21270p c21270p, C17945a0 c17945a0, a aVar, boolean z11) {
        C23667x c23667x;
        Object obj;
        JSONObject jSONObject;
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(aVar, "$logState");
        try {
            String m119227X = AbstractC23160o0.m119227X(c21270p.f103619d.mo124314i());
            AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
            synchronized (f103615i) {
                try {
                    Iterator it = c21270p.m110080D(13, 1, 1).iterator();
                    while (true) {
                        c23667x = null;
                        if (it.hasNext()) {
                            Object next = it.next();
                            C23667x c23667x2 = (C23667x) next;
                            if (AbstractC19074t.m100204b(c23667x2.f114649i.optString("param1", ""), m119227X) && c21270p.m110107g0(c23667x2.f114649i)) {
                                obj = next;
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C23667x c23667x3 = (C23667x) obj;
                    if (c23667x3 != null) {
                        c21270p.m110122p(c23667x3);
                        JSONArray optJSONArray = c23667x3.f114649i.optJSONArray("param2");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        } else {
                            AbstractC19074t.m100205c(optJSONArray);
                        }
                        c21270p.m110089K(optJSONArray, c17945a0, c21270p.f103620e, m119227X, aVar, z11);
                        JSONObject optJSONObject = c23667x3.f114649i.optJSONObject("param3");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        } else {
                            AbstractC19074t.m100205c(optJSONObject);
                        }
                        c21270p.m110088J(optJSONObject, c17945a0, c21270p.f103620e, aVar);
                        try {
                            c23667x3.f114649i.put("param2", optJSONArray);
                            c23667x3.f114649i.put("param3", optJSONObject);
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                        c23667x = c23667x3;
                    }
                    if (c23667x == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("param1", m119227X);
                            JSONArray jSONArray = new JSONArray();
                            jSONObject = jSONObject2;
                            try {
                                c21270p.m110089K(jSONArray, c17945a0, c21270p.f103620e, m119227X, aVar, z11);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                jSONObject.put("param2", jSONArray);
                                JSONObject jSONObject3 = new JSONObject();
                                c21270p.m110088J(jSONObject3, c17945a0, c21270p.f103620e, aVar);
                                jSONObject.put("param3", jSONObject3);
                            } catch (Exception e12) {
                                e = e12;
                                AbstractC20110a.f98889a.mo104552e(e);
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                c21270p.m110149V(false, 13, 1, 1, jSONObject);
                                c21270p.m110144C0(13, 1, 1);
                                C24848g0 c24848g03 = C24848g0.f119245a;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            jSONObject = jSONObject2;
                        }
                        C24848g0 c24848g022 = C24848g0.f119245a;
                        c21270p.m110149V(false, 13, 1, 1, jSONObject);
                    }
                    c21270p.m110144C0(13, 1, 1);
                    C24848g0 c24848g032 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e14) {
            AbstractC20110a.f98889a.mo104552e(e14);
        }
    }

    /* renamed from: P */
    public static final void m110092P(C21270p c21270p, String str, int i11, int i12, long j11, int i13) {
        C23667x c23667x;
        Object obj;
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(str, "$kwd");
        synchronized (f103615i) {
            try {
                Iterator it = c21270p.m110080D(8, 0, 5).iterator();
                while (true) {
                    c23667x = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        C23667x c23667x2 = (C23667x) obj;
                        if (AbstractC19074t.m100204b(c23667x2.f114649i.optString("param1", ""), str) && AbstractC19074t.m100204b(c23667x2.f114649i.optString("param3", ""), String.valueOf(i11)) && AbstractC19074t.m100204b(c23667x2.f114649i.optString("param6", ""), String.valueOf(i12))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C23667x c23667x3 = (C23667x) obj;
                if (c23667x3 != null) {
                    c21270p.m110122p(c23667x3);
                    String optString = c23667x3.f114649i.optString("param5", "0");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    int parseInt = Integer.parseInt(optString);
                    String optString2 = c23667x3.f114649i.optString("param4", "0");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    long parseLong = (Long.parseLong(optString2) * parseInt) + j11;
                    int i14 = parseInt + 1;
                    long j12 = parseLong / i14;
                    try {
                        c23667x3.f114649i.put("param2", String.valueOf(i13));
                        c23667x3.f114649i.put("param4", String.valueOf(j12));
                        c23667x3.f114649i.put("param5", String.valueOf(i14));
                    } catch (JSONException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    c23667x = c23667x3;
                }
                if (c23667x == null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("param1", str);
                        jSONObject.put("param2", String.valueOf(i13));
                        jSONObject.put("param3", String.valueOf(i11));
                        jSONObject.put("param4", String.valueOf(j11));
                        jSONObject.put("param5", "1");
                        jSONObject.put("param6", String.valueOf(i12));
                    } catch (JSONException e12) {
                        AbstractC20110a.f98889a.mo104552e(e12);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    c21270p.m110149V(false, 8, 0, 5, jSONObject);
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:            r13.m110122p(r10);        r0 = r10.f114649i.optString("param3", "0");        fn0.AbstractC19074t.m100207e(r0, "optString(...)");        r0 = java.lang.Integer.parseInt(r0);        r1 = r10.f114649i.optString("param2", "0");        fn0.AbstractC19074t.m100207e(r1, "optString(...)");        r7 = (java.lang.Long.parseLong(r1) * r0) + r17;        r0 = r0 + 1;        r7 = r7 / r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:            r10.f114649i.put("param5", java.lang.String.valueOf(r14));        r10.f114649i.put("param2", java.lang.String.valueOf(r7));        r10.f114649i.put("param3", java.lang.String.valueOf(r0));     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:            r7 = new org.json.JSONObject();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:            r7.put("param1", java.lang.String.valueOf(r15));        r7.put("param2", java.lang.String.valueOf(r17));        r7.put("param3", "1");        r7.put("param4", java.lang.String.valueOf(r16));        r7.put("param5", java.lang.String.valueOf(r14));     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r0);     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m110093R(C21270p c21270p, int i11, int i12, int i13, long j11) {
        JSONObject jSONObject;
        AbstractC19074t.m100208f(c21270p, "this$0");
        synchronized (f103615i) {
            int i14 = 0;
            List m110080D = c21270p.m110080D(8, 0, 9);
            int size = m110080D.size();
            while (true) {
                if (i14 >= size) {
                    break;
                }
                C23667x c23667x = (C23667x) m110080D.get(i14);
                if (AbstractC19074t.m100204b(c23667x.f114649i.optString("param5", ""), String.valueOf(i11)) && AbstractC19074t.m100204b(c23667x.f114649i.optString("param1", ""), String.valueOf(i12)) && AbstractC19074t.m100204b(c23667x.f114649i.optString("param4", ""), String.valueOf(i13))) {
                    break;
                } else {
                    i14++;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        c21270p.m110149V(false, 8, 0, 9, jSONObject);
        C24848g0 c24848g02 = C24848g0.f119245a;
    }

    /* renamed from: S */
    private final void m110094S(SparseArray sparseArray, C23667x c23667x) {
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(c23667x.f114654a);
        if (sparseArray2 != null) {
            List list = (List) sparseArray2.get(c23667x.f114655b);
            if (list != null) {
                list.add(c23667x);
                return;
            }
            int i11 = c23667x.f114655b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c23667x);
            C24848g0 c24848g0 = C24848g0.f119245a;
            sparseArray2.put(i11, arrayList);
            return;
        }
        int i12 = c23667x.f114654a;
        SparseArray sparseArray3 = new SparseArray();
        int i13 = c23667x.f114655b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c23667x);
        C24848g0 c24848g02 = C24848g0.f119245a;
        sparseArray3.put(i13, arrayList2);
        sparseArray.put(i12, sparseArray3);
    }

    /* renamed from: U */
    public static final void m110095U(C19216b c19216b, C21270p c21270p) {
        C23667x c23667x;
        Object obj;
        int m104529e;
        int m104529e2;
        int m104529e3;
        int m104529e4;
        int m104529e5;
        int m104529e6;
        AbstractC19074t.m100208f(c19216b, "$trackingData");
        AbstractC19074t.m100208f(c21270p, "this$0");
        if (c19216b.m100850i()) {
            return;
        }
        c19216b.m100859r(true);
        synchronized (f103615i) {
            try {
                Iterator it = c21270p.m110080D(8, 0, 7).iterator();
                while (true) {
                    c23667x = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        C23667x c23667x2 = (C23667x) obj;
                        if (AbstractC19074t.m100204b(c23667x2.f114649i.optString("param1", ""), c19216b.m100848g()) && AbstractC19074t.m100204b(c23667x2.f114649i.optString("param2", ""), String.valueOf(c19216b.m100849h())) && AbstractC19074t.m100204b(c23667x2.f114649i.optString("param3", ""), String.valueOf(c19216b.m100844c())) && AbstractC19074t.m100204b(c23667x2.f114649i.optString("param4", ""), String.valueOf(c19216b.m100843b())) && AbstractC19074t.m100204b(c23667x2.f114649i.optString("param5", ""), String.valueOf(c19216b.m100847f()))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C23667x c23667x3 = (C23667x) obj;
                if (c23667x3 != null) {
                    c21270p.m110122p(c23667x3);
                    JSONArray optJSONArray = c23667x3.f114649i.optJSONArray("param6");
                    if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                    } else {
                        AbstractC19074t.m100205c(optJSONArray);
                    }
                    JSONArray optJSONArray2 = c23667x3.f114649i.optJSONArray("param7");
                    if (optJSONArray2 == null) {
                        optJSONArray2 = new JSONArray();
                    } else {
                        AbstractC19074t.m100205c(optJSONArray2);
                    }
                    JSONArray optJSONArray3 = c23667x3.f114649i.optJSONArray("param8");
                    if (optJSONArray3 == null) {
                        optJSONArray3 = new JSONArray();
                    } else {
                        AbstractC19074t.m100205c(optJSONArray3);
                    }
                    try {
                        JSONObject jSONObject = c23667x3.f114649i;
                        float f11 = 1000;
                        m104529e4 = AbstractC20104d.m104529e(c19216b.m100846e() * f11);
                        optJSONArray.put(m104529e4 / 1000.0d);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        jSONObject.put("param6", optJSONArray);
                        JSONObject jSONObject2 = c23667x3.f114649i;
                        m104529e5 = AbstractC20104d.m104529e(c19216b.m100845d() * f11);
                        optJSONArray2.put(m104529e5 / 1000.0d);
                        jSONObject2.put("param7", optJSONArray2);
                        JSONObject jSONObject3 = c23667x3.f114649i;
                        m104529e6 = AbstractC20104d.m104529e(c19216b.m100842a() * f11);
                        optJSONArray3.put(m104529e6 / 1000.0d);
                        jSONObject3.put("param8", optJSONArray3);
                    } catch (JSONException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    c23667x = c23667x3;
                }
                if (c23667x == null) {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("param1", c19216b.m100848g());
                        jSONObject4.put("param2", c19216b.m100849h());
                        jSONObject4.put("param3", c19216b.m100844c());
                        jSONObject4.put("param4", c19216b.m100843b());
                        jSONObject4.put("param5", c19216b.m100847f());
                        JSONArray jSONArray = new JSONArray();
                        float f12 = 1000;
                        m104529e = AbstractC20104d.m104529e(c19216b.m100846e() * f12);
                        jSONArray.put(m104529e / 1000.0d);
                        C24848g0 c24848g02 = C24848g0.f119245a;
                        jSONObject4.put("param6", jSONArray);
                        JSONArray jSONArray2 = new JSONArray();
                        m104529e2 = AbstractC20104d.m104529e(c19216b.m100845d() * f12);
                        jSONArray2.put(m104529e2 / 1000.0d);
                        jSONObject4.put("param7", jSONArray2);
                        JSONArray jSONArray3 = new JSONArray();
                        m104529e3 = AbstractC20104d.m104529e(c19216b.m100842a() * f12);
                        jSONArray3.put(m104529e3 / 1000.0d);
                        jSONObject4.put("param8", jSONArray3);
                    } catch (JSONException e12) {
                        AbstractC20110a.f98889a.mo104552e(e12);
                    }
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    c21270p.m110149V(false, 8, 0, 7, jSONObject4);
                }
                C24848g0 c24848g04 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: X */
    public static final void m110096X(C21270p c21270p, long j11, long j12, int i11, String str, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(str, "$actionSession");
        synchronized (f103615i) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("param1", j11);
                jSONObject.put("param2", j12);
                jSONObject.put("param3", i11);
                jSONObject.put("param4", str);
                jSONObject.put("param5", i12 + "_" + i13);
                jSONObject.put("param6", i14);
                C24848g0 c24848g0 = C24848g0.f119245a;
                c21270p.m110149V(false, 8, 0, 2, jSONObject);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
        }
    }

    /* renamed from: a0 */
    public static final void m110098a0(C21270p c21270p, int i11, int i12, String str, int i13) {
        C23667x c23667x;
        Object obj;
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(str, "$frequencySourcePanel");
        synchronized (f103615i) {
            try {
                try {
                    Iterator it = c21270p.m110080D(8, 0, 1).iterator();
                    while (true) {
                        c23667x = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            C23667x c23667x2 = (C23667x) obj;
                            if (c23667x2.f114659f != null && c23667x2.f114649i.optInt("param1") == i11 && c23667x2.f114649i.optInt("param2", -1) == i12) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C23667x c23667x3 = (C23667x) obj;
                    if (c23667x3 != null) {
                        c21270p.m110122p(c23667x3);
                        c21270p.m110077A0(c23667x3, "param3", str);
                        JSONArray optJSONArray = c23667x3.f114649i.optJSONArray("param4");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        } else {
                            AbstractC19074t.m100205c(optJSONArray);
                        }
                        if (i12 == 6 || i12 == 7) {
                            optJSONArray.put(i13);
                        }
                        c23667x3.f114649i.put("param4", optJSONArray);
                        c23667x = c23667x3;
                    }
                    if (c23667x == null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("param1", i11);
                        jSONObject.put("param2", i12);
                        jSONObject.put("param3", str);
                        JSONArray jSONArray = new JSONArray();
                        if (i12 == 6 || i12 == 7) {
                            jSONArray.put(i13);
                        }
                        jSONObject.put("param4", jSONArray);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        c21270p.m110149V(false, 8, 0, 1, jSONObject);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d0 */
    public static final void m110102d0(C21270p c21270p, C17945a0 c17945a0, a aVar) {
        C23667x c23667x;
        Object obj;
        JSONObject jSONObject;
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(aVar, "$logState");
        try {
            String m119227X = AbstractC23160o0.m119227X(c21270p.f103619d.mo124314i());
            AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
            synchronized (f103615i) {
                try {
                    Iterator it = c21270p.m110080D(13, 1, 2).iterator();
                    while (true) {
                        c23667x = null;
                        if (it.hasNext()) {
                            Object next = it.next();
                            C23667x c23667x2 = (C23667x) next;
                            if (AbstractC19074t.m100204b(c23667x2.f114649i.optString("date", ""), m119227X) && c21270p.m110109h0(c23667x2.f114649i)) {
                                obj = next;
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C23667x c23667x3 = (C23667x) obj;
                    if (c23667x3 != null) {
                        c21270p.m110122p(c23667x3);
                        JSONArray optJSONArray = c23667x3.f114649i.optJSONArray("thread_array");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        } else {
                            AbstractC19074t.m100205c(optJSONArray);
                        }
                        c21270p.m110090L(optJSONArray, c17945a0, c21270p.f103620e, m119227X, aVar);
                        try {
                            c23667x3.f114649i.put("thread_array", optJSONArray);
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                        c23667x = c23667x3;
                    }
                    if (c23667x == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("date", m119227X);
                            JSONArray jSONArray = new JSONArray();
                            jSONObject = jSONObject2;
                            try {
                                c21270p.m110090L(jSONArray, c17945a0, c21270p.f103620e, m119227X, aVar);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                jSONObject.put("thread_array", jSONArray);
                            } catch (Exception e12) {
                                e = e12;
                                AbstractC20110a.f98889a.mo104552e(e);
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                c21270p.m110149V(false, 13, 1, 2, jSONObject);
                                c21270p.m110144C0(13, 1, 2);
                                C24848g0 c24848g03 = C24848g0.f119245a;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            jSONObject = jSONObject2;
                        }
                        C24848g0 c24848g022 = C24848g0.f119245a;
                        c21270p.m110149V(false, 13, 1, 2, jSONObject);
                    }
                    c21270p.m110144C0(13, 1, 2);
                    C24848g0 c24848g032 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e14) {
            AbstractC20110a.f98889a.mo104552e(e14);
        }
    }

    /* renamed from: f0 */
    public static final void m110105f0(C21270p c21270p, String str, long j11, int i11, int i12) {
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(str, "$distanceInSession");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", str);
            jSONObject.put("param2", j11);
            jSONObject.put("param3", i11);
            jSONObject.put("param4", i12);
            C24848g0 c24848g0 = C24848g0.f119245a;
            c21270p.m110149V(false, 8, 0, 6, jSONObject);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g0 */
    private final boolean m110107g0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONArray jSONArray;
        JSONArray names = jSONObject.names();
        int m123991a = C23667x.Companion.m123991a(13, 1, 1);
        if (names != null && names.length() == m123991a && (optJSONArray = jSONObject.optJSONArray("param2")) != null && optJSONArray.length() != 0 && (optJSONArray2 = optJSONArray.getJSONObject(0).optJSONArray("data")) != null && optJSONArray2.length() == 4) {
            int length = optJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i11);
                if (optJSONArray3 == null || optJSONArray3.length() != 9) {
                    return false;
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("param3");
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("data");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() == 4) {
                int length2 = jSONArray.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONArray optJSONArray4 = jSONArray.optJSONArray(i12);
                    if (optJSONArray4 == null || optJSONArray4.length() != 2) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: h0 */
    private final boolean m110109h0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONArray names = jSONObject.names();
        if (names == null || names.length() != 2 || (optJSONArray = jSONObject.optJSONArray("thread_array")) == null || optJSONArray.length() == 0 || (optJSONArray2 = optJSONArray.getJSONObject(0).optJSONArray("data")) == null || optJSONArray2.length() != 4) {
            return false;
        }
        int length = optJSONArray2.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i11);
            if (optJSONArray3 == null || optJSONArray3.length() != 3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j0 */
    public static final void m110112j0(C21270p c21270p) {
        AbstractC19074t.m100208f(c21270p, "this$0");
        synchronized (f103615i) {
            c21270p.f103617b.clear();
            c21270p.f103616a.clear();
            C7960e.m41971c6().m42389f7();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        c21270p.f103618c = false;
    }

    /* renamed from: k0 */
    private final List m110114k0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23667x c23667x = (C23667x) it.next();
            arrayList.add(new C23667x(c23667x));
            m110123p0(c23667x);
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private final void m110116l0(SparseArray sparseArray, int i11, int i12, int i13) {
        List list;
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
        if (sparseArray2 != null && (list = (List) sparseArray2.get(i12)) != null) {
            AbstractC19074t.m100205c(list);
            if (list.size() > 0) {
                int size = list.size() - 1;
                int i14 = 0;
                while (i14 <= size) {
                    if (((C23667x) list.get(i14)).f114657d == i13) {
                        Collections.swap(list, i14, size);
                        list.remove(size);
                        size--;
                    } else {
                        i14++;
                    }
                }
            }
            if (list.isEmpty()) {
                sparseArray2.remove(i12);
            }
            if (sparseArray2.size() == 0) {
                sparseArray.remove(i11);
            }
        }
    }

    /* renamed from: m0 */
    private final void m110118m0(SparseArray sparseArray, int i11, int i12, int i13, List list) {
        List list2;
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
        if (sparseArray2 != null && (list2 = (List) sparseArray2.get(i12)) != null) {
            AbstractC19074t.m100205c(list2);
            if (list2.size() > 0) {
                int size = list2.size() - 1;
                int i14 = 0;
                while (i14 <= size) {
                    if (((C23667x) list2.get(i14)).f114657d == i13 && list.contains(list2.get(i14))) {
                        Collections.swap(list2, i14, size);
                        list2.remove(size);
                        size--;
                    } else {
                        i14++;
                    }
                }
            }
            if (list2.isEmpty()) {
                sparseArray2.remove(i12);
            }
            if (sparseArray2.size() == 0) {
                sparseArray.remove(i11);
            }
        }
    }

    /* renamed from: o0 */
    public static final void m110121o0(C21270p c21270p, C17945a0 c17945a0) {
        Object obj;
        AbstractC19074t.m100208f(c21270p, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        try {
            synchronized (f103615i) {
                try {
                    Iterator it = c21270p.m110080D(13, 1, 1).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            C23667x c23667x = (C23667x) obj;
                            if (AbstractC19074t.m100204b(c23667x.f114649i.optString("param1", ""), AbstractC23160o0.m119227X(c21270p.f103619d.mo124314i())) && c21270p.m110107g0(c23667x.f114649i)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C23667x c23667x2 = (C23667x) obj;
                    if (c23667x2 != null) {
                        c21270p.m110122p(c23667x2);
                        JSONArray optJSONArray = c23667x2.f114649i.optJSONArray("param2");
                        if (optJSONArray != null) {
                            AbstractC19074t.m100205c(optJSONArray);
                            c21270p.m110076A(optJSONArray, c17945a0, c21270p.f103620e);
                        }
                        JSONObject optJSONObject = c23667x2.f114649i.optJSONObject("param3");
                        if (optJSONObject != null) {
                            AbstractC19074t.m100205c(optJSONObject);
                            c21270p.m110141z(optJSONObject, c17945a0, c21270p.f103620e);
                        }
                    }
                    c21270p.m110144C0(13, 1, 1);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    private final void m110122p(C23667x c23667x) {
        if (c23667x.f114650j == 0) {
            SparseArray sparseArray = this.f103617b;
            c23667x.f114650j = 1;
            String jSONObject = c23667x.f114649i.toString();
            AbstractC19074t.m100207e(jSONObject, "toString(...)");
            c23667x.f114651k = jSONObject;
            C24848g0 c24848g0 = C24848g0.f119245a;
            m110094S(sparseArray, c23667x);
        }
    }

    /* renamed from: p0 */
    private final void m110123p0(C23667x c23667x) {
        c23667x.f114650j = 0;
        c23667x.f114651k = "";
    }

    /* renamed from: q */
    private final void m110124q(C17945a0 c17945a0, JSONArray jSONArray, int i11) {
        JSONArray optJSONArray = jSONArray.optJSONArray(i11);
        if (optJSONArray != null && !m110129t(optJSONArray).contains(c17945a0.m95029V3().toString())) {
            optJSONArray.put(c17945a0.m95029V3().toString());
        }
    }

    /* renamed from: q0 */
    private final void m110125q0(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (C23667x c23667x : new ArrayList(m110080D(13, 1, 1))) {
            if (!AbstractC19074t.m100204b(c23667x.f114649i.optString("param1"), str2)) {
                JSONArray optJSONArray = c23667x.f114649i.optJSONArray("param2");
                if (m110107g0(c23667x.f114649i) && optJSONArray != null && optJSONArray.length() != 0) {
                    C21654a.m111580g("Submit log DAILY", C21654a.a.f105050s, false);
                    AbstractC19074t.m100205c(c23667x);
                    String[] m110140y0 = m110140y0(c23667x);
                    C0815e1.m2075D().m2100V(new C23648e(f103614h[1], "media_daily", 1, "chat_media_auto_download_log", (String[]) Arrays.copyOf(m110140y0, m110140y0.length)), false);
                    for (String str3 : m110140y0) {
                        C21654a.m111582i(str3, C21654a.a.f105050s, false, 4, null);
                    }
                    arrayList.add(c23667x);
                } else {
                    arrayList.add(c23667x);
                }
            }
        }
        m110118m0(this.f103616a, 13, 1, 1, arrayList);
        m110118m0(this.f103617b, 13, 1, 1, arrayList);
        m110078B().mo13474a(new Runnable() { // from class: ji.n

            /* renamed from: p */
            public final /* synthetic */ String f103610p;

            /* renamed from: q */
            public final /* synthetic */ ArrayList f103611q;

            public /* synthetic */ RunnableC21268n(String str4, ArrayList arrayList2) {
                r1 = str4;
                r2 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110127r0(r1, r2);
            }
        });
    }

    /* renamed from: r */
    private final void m110126r(JSONArray jSONArray, String str) {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            jSONArray.getJSONArray(i11).put(7, new JSONArray());
        }
        C21216s c21216s = this.f103620e;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        for (C17945a0 c17945a0 : c21216s.m109852D0(str2, str, EnumC22425a.f109726q)) {
            int m109888n0 = this.f103620e.m109888n0(c17945a0);
            if (m109888n0 != 1) {
                if (m109888n0 != 2) {
                    if (m109888n0 != 4) {
                        if (m109888n0 == 8) {
                            jSONArray.getJSONArray(2).getJSONArray(7).put(c17945a0.m95029V3().toString());
                        }
                    } else {
                        jSONArray.getJSONArray(3).getJSONArray(7).put(c17945a0.m95029V3().toString());
                    }
                } else {
                    jSONArray.getJSONArray(1).getJSONArray(7).put(c17945a0.m95029V3().toString());
                }
            } else {
                jSONArray.getJSONArray(0).getJSONArray(7).put(c17945a0.m95029V3().toString());
            }
        }
    }

    /* renamed from: r0 */
    public static final void m110127r0(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "$currentUserId");
        AbstractC19074t.m100208f(arrayList, "$deletedLogs");
        C7960e.m41971c6().m42184L0(str, 13, 1, 1, arrayList);
    }

    /* renamed from: s */
    private final void m110128s(JSONArray jSONArray, String str) {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            jSONArray.getJSONArray(i11).put(2, new JSONArray());
        }
        C21216s c21216s = this.f103620e;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        for (C17945a0 c17945a0 : c21216s.m109852D0(str2, str, EnumC22425a.f109728s)) {
            int m109888n0 = this.f103620e.m109888n0(c17945a0);
            if (m109888n0 != 1) {
                if (m109888n0 != 2) {
                    if (m109888n0 != 4) {
                        if (m109888n0 == 8) {
                            jSONArray.getJSONArray(2).getJSONArray(2).put(c17945a0.m95029V3().toString());
                        }
                    } else {
                        jSONArray.getJSONArray(3).getJSONArray(2).put(c17945a0.m95029V3().toString());
                    }
                } else {
                    jSONArray.getJSONArray(1).getJSONArray(2).put(c17945a0.m95029V3().toString());
                }
            } else {
                jSONArray.getJSONArray(0).getJSONArray(2).put(c17945a0.m95029V3().toString());
            }
        }
    }

    /* renamed from: t */
    private final Set m110129t(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(jSONArray.getString(i11));
        }
        return hashSet;
    }

    /* renamed from: t0 */
    private final void m110130t0(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (AbstractC23309i.m121963h()) {
            arrayList.addAll(m110080D(8, 0, 5));
            m110116l0(this.f103616a, 8, 0, 5);
            m110116l0(this.f103617b, 8, 0, 5);
            arrayList2.add("'5'");
            arrayList.addAll(m110080D(8, 0, 9));
            m110116l0(this.f103616a, 8, 0, 9);
            m110116l0(this.f103617b, 8, 0, 9);
            arrayList2.add("'9'");
        }
        if (AbstractC23309i.m121925g()) {
            arrayList.addAll(m110080D(8, 0, 1));
            m110116l0(this.f103616a, 8, 0, 1);
            m110116l0(this.f103617b, 8, 0, 1);
            arrayList2.add("'1'");
            arrayList.addAll(m110080D(8, 0, 2));
            m110116l0(this.f103616a, 8, 0, 2);
            m110116l0(this.f103617b, 8, 0, 2);
            arrayList2.add("'2'");
            arrayList.addAll(m110080D(8, 0, 6));
            m110116l0(this.f103616a, 8, 0, 6);
            m110116l0(this.f103617b, 8, 0, 6);
            arrayList2.add("'6'");
        }
        if (AbstractC23309i.m121887f()) {
            arrayList.addAll(m110080D(8, 0, 7));
            m110116l0(this.f103616a, 8, 0, 7);
            m110116l0(this.f103617b, 8, 0, 7);
            arrayList2.add("'7'");
        }
        if (arrayList.size() != 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0815e1.m2075D().m2109g((C23667x) arrayList.get(i11));
            }
        }
        m110078B().mo13474a(new Runnable() { // from class: ji.k

            /* renamed from: p */
            public final /* synthetic */ String f103600p;

            /* renamed from: q */
            public final /* synthetic */ List f103601q;

            public /* synthetic */ RunnableC21265k(String str2, List arrayList22) {
                r1 = str2;
                r2 = arrayList22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110132u0(r1, r2);
            }
        });
    }

    /* renamed from: u */
    private final int m110131u(JSONArray jSONArray, int i11) {
        JSONArray optJSONArray;
        if (jSONArray != null && (optJSONArray = jSONArray.optJSONArray(i11)) != null) {
            return optJSONArray.length();
        }
        return 0;
    }

    /* renamed from: u0 */
    public static final void m110132u0(String str, List list) {
        AbstractC19074t.m100208f(str, "$currentUserId");
        AbstractC19074t.m100208f(list, "$removedStickerLogSource");
        C7960e.m41971c6().m42195M0(str, 8, 0, list);
    }

    /* renamed from: v */
    private final JSONArray m110133v(int i11) {
        JSONArray jSONArray = new JSONArray();
        for (int i12 = 0; i12 < 4; i12++) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < i11; i13++) {
                jSONArray2.put(new JSONArray());
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /* renamed from: v0 */
    private final void m110134v0(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (C23667x c23667x : new ArrayList(m110080D(13, 1, 2))) {
            if (!AbstractC19074t.m100204b(c23667x.f114649i.optString("date"), str2)) {
                JSONArray optJSONArray = c23667x.f114649i.optJSONArray("thread_array");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    AbstractC19074t.m100205c(c23667x);
                    String[] m110142z0 = m110142z0(c23667x);
                    C0815e1.m2075D().m2100V(new C23648e(f103614h[2], "sync_pc_daily", 1, "chat_media_auto_download_log", (String[]) Arrays.copyOf(m110142z0, m110142z0.length)), false);
                    for (String str3 : m110142z0) {
                        C21654a.m111580g("Submit log DAILY: " + str3, C21654a.a.f105050s, false);
                    }
                    arrayList.add(c23667x);
                } else {
                    arrayList.add(c23667x);
                }
            }
        }
        m110118m0(this.f103616a, 13, 1, 2, arrayList);
        m110118m0(this.f103617b, 13, 1, 2, arrayList);
        m110078B().mo13474a(new Runnable() { // from class: ji.m

            /* renamed from: p */
            public final /* synthetic */ String f103608p;

            /* renamed from: q */
            public final /* synthetic */ ArrayList f103609q;

            public /* synthetic */ RunnableC21267m(String str4, ArrayList arrayList2) {
                r1 = str4;
                r2 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110136w0(r1, r2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000d, B:9:0x001e, B:13:0x002d, B:15:0x0034, B:17:0x003d, B:21:0x004f, B:27:0x0019), top: B:1:0x0000 }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m110135w(JSONArray jSONArray, C17945a0 c17945a0, int i11) {
        Set hashSet;
        try {
            JSONArray optJSONArray = jSONArray.optJSONArray(i11);
            if (optJSONArray != null) {
                JSONArray optJSONArray2 = optJSONArray.optJSONArray(1);
                if (optJSONArray2 != null) {
                    AbstractC19074t.m100205c(optJSONArray2);
                    hashSet = m110129t(optJSONArray2);
                    if (hashSet == null) {
                    }
                    if (!hashSet.contains(c17945a0.m95029V3().toString())) {
                        return;
                    }
                    JSONArray optJSONArray3 = optJSONArray.optJSONArray(0);
                    if (optJSONArray3 != null) {
                        AbstractC19074t.m100205c(optJSONArray3);
                        int length = optJSONArray3.length();
                        for (int i12 = 0; i12 < length; i12++) {
                            if (AbstractC19074t.m100204b(optJSONArray3.get(i12), c17945a0.m95029V3().toString())) {
                                optJSONArray3.remove(i12);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                hashSet = new HashSet();
                if (!hashSet.contains(c17945a0.m95029V3().toString())) {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: w0 */
    public static final void m110136w0(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "$currentUserId");
        AbstractC19074t.m100208f(arrayList, "$deletedLogs");
        C7960e.m41971c6().m42184L0(str, 13, 1, 2, arrayList);
    }

    /* renamed from: x */
    private final void m110137x(JSONArray jSONArray, C17945a0 c17945a0, C21216s c21216s, boolean z11) {
        String mo95039W2;
        int m109888n0 = c21216s.m109888n0(c17945a0);
        if (m109888n0 != 1) {
            if (m109888n0 != 2) {
                if (m109888n0 != 4) {
                    if (m109888n0 == 8) {
                        m110139y(jSONArray, c17945a0, 2, z11);
                    }
                } else {
                    m110139y(jSONArray, c17945a0, 3, z11);
                }
            } else {
                m110139y(jSONArray, c17945a0, 1, z11);
            }
        } else {
            m110139y(jSONArray, c17945a0, 0, z11);
        }
        if (z11) {
            mo95039W2 = "";
        } else {
            mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        }
        m110126r(jSONArray, mo95039W2);
    }

    /* renamed from: x0 */
    private final JSONObject m110138x0(JSONArray jSONArray, int i11) {
        if (jSONArray != null) {
            Integer num = null;
            if (jSONArray.length() == 0) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    Integer valueOf = Integer.valueOf(m110131u(jSONArray.optJSONArray(0), i11));
                    if (valueOf.intValue() == 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        jSONObject.put("a", valueOf.intValue());
                    }
                    Integer valueOf2 = Integer.valueOf(m110131u(jSONArray.optJSONArray(1), i11));
                    if (valueOf2.intValue() == 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        jSONObject.put("p", valueOf2.intValue());
                    }
                    Integer valueOf3 = Integer.valueOf(m110131u(jSONArray.optJSONArray(2), i11));
                    if (valueOf3.intValue() == 0) {
                        valueOf3 = null;
                    }
                    if (valueOf3 != null) {
                        jSONObject.put("f", valueOf3.intValue());
                    }
                    Integer valueOf4 = Integer.valueOf(m110131u(jSONArray.optJSONArray(3), i11));
                    if (valueOf4.intValue() != 0) {
                        num = valueOf4;
                    }
                    if (num != null) {
                        jSONObject.put(C20218v.f100059b, num.intValue());
                        return jSONObject;
                    }
                    return jSONObject;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return new JSONObject();
                }
            }
        }
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0012, B:8:0x001b, B:9:0x0026, B:13:0x0038, B:15:0x003f, B:17:0x0048, B:18:0x0050, B:21:0x0062, B:23:0x0069, B:25:0x0072, B:26:0x007a, B:29:0x008c, B:31:0x0093, B:33:0x009c, B:34:0x00a4, B:39:0x00ba, B:41:0x00c2, B:43:0x00cb, B:44:0x00d3, B:47:0x00e5, B:49:0x00eb, B:51:0x00f4, B:52:0x00fc, B:55:0x0137, B:57:0x013e, B:59:0x0148, B:63:0x015a, B:61:0x015e, B:65:0x0161, B:67:0x0168, B:69:0x0171, B:73:0x0183, B:79:0x00f7, B:80:0x00ce, B:81:0x010e, B:83:0x0114, B:85:0x011d, B:86:0x0125, B:89:0x0120, B:90:0x009f, B:91:0x0075, B:92:0x004b, B:93:0x0021), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0012, B:8:0x001b, B:9:0x0026, B:13:0x0038, B:15:0x003f, B:17:0x0048, B:18:0x0050, B:21:0x0062, B:23:0x0069, B:25:0x0072, B:26:0x007a, B:29:0x008c, B:31:0x0093, B:33:0x009c, B:34:0x00a4, B:39:0x00ba, B:41:0x00c2, B:43:0x00cb, B:44:0x00d3, B:47:0x00e5, B:49:0x00eb, B:51:0x00f4, B:52:0x00fc, B:55:0x0137, B:57:0x013e, B:59:0x0148, B:63:0x015a, B:61:0x015e, B:65:0x0161, B:67:0x0168, B:69:0x0171, B:73:0x0183, B:79:0x00f7, B:80:0x00ce, B:81:0x010e, B:83:0x0114, B:85:0x011d, B:86:0x0125, B:89:0x0120, B:90:0x009f, B:91:0x0075, B:92:0x004b, B:93:0x0021), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0012, B:8:0x001b, B:9:0x0026, B:13:0x0038, B:15:0x003f, B:17:0x0048, B:18:0x0050, B:21:0x0062, B:23:0x0069, B:25:0x0072, B:26:0x007a, B:29:0x008c, B:31:0x0093, B:33:0x009c, B:34:0x00a4, B:39:0x00ba, B:41:0x00c2, B:43:0x00cb, B:44:0x00d3, B:47:0x00e5, B:49:0x00eb, B:51:0x00f4, B:52:0x00fc, B:55:0x0137, B:57:0x013e, B:59:0x0148, B:63:0x015a, B:61:0x015e, B:65:0x0161, B:67:0x0168, B:69:0x0171, B:73:0x0183, B:79:0x00f7, B:80:0x00ce, B:81:0x010e, B:83:0x0114, B:85:0x011d, B:86:0x0125, B:89:0x0120, B:90:0x009f, B:91:0x0075, B:92:0x004b, B:93:0x0021), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0012, B:8:0x001b, B:9:0x0026, B:13:0x0038, B:15:0x003f, B:17:0x0048, B:18:0x0050, B:21:0x0062, B:23:0x0069, B:25:0x0072, B:26:0x007a, B:29:0x008c, B:31:0x0093, B:33:0x009c, B:34:0x00a4, B:39:0x00ba, B:41:0x00c2, B:43:0x00cb, B:44:0x00d3, B:47:0x00e5, B:49:0x00eb, B:51:0x00f4, B:52:0x00fc, B:55:0x0137, B:57:0x013e, B:59:0x0148, B:63:0x015a, B:61:0x015e, B:65:0x0161, B:67:0x0168, B:69:0x0171, B:73:0x0183, B:79:0x00f7, B:80:0x00ce, B:81:0x010e, B:83:0x0114, B:85:0x011d, B:86:0x0125, B:89:0x0120, B:90:0x009f, B:91:0x0075, B:92:0x004b, B:93:0x0021), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136 A[RETURN] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m110139y(JSONArray jSONArray, C17945a0 c17945a0, int i11, boolean z11) {
        Collection hashSet;
        Collection hashSet2;
        Collection hashSet3;
        Collection hashSet4;
        Collection hashSet5;
        Collection hashSet6;
        Collection hashSet7;
        try {
            JSONArray optJSONArray = jSONArray.optJSONArray(i11);
            if (optJSONArray != null) {
                HashSet hashSet8 = new HashSet();
                JSONArray optJSONArray2 = optJSONArray.optJSONArray(2);
                if (optJSONArray2 != null) {
                    AbstractC19074t.m100205c(optJSONArray2);
                    Collection m110129t = m110129t(optJSONArray2);
                    if (m110129t != null) {
                        hashSet = m110129t;
                        hashSet8.addAll(hashSet);
                        if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                            return;
                        }
                        JSONArray optJSONArray3 = optJSONArray.optJSONArray(3);
                        if (optJSONArray3 != null) {
                            AbstractC19074t.m100205c(optJSONArray3);
                            Collection m110129t2 = m110129t(optJSONArray3);
                            if (m110129t2 != null) {
                                hashSet2 = m110129t2;
                                hashSet8.addAll(hashSet2);
                                if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                    return;
                                }
                                JSONArray optJSONArray4 = optJSONArray.optJSONArray(5);
                                if (optJSONArray4 != null) {
                                    AbstractC19074t.m100205c(optJSONArray4);
                                    Collection m110129t3 = m110129t(optJSONArray4);
                                    if (m110129t3 != null) {
                                        hashSet3 = m110129t3;
                                        hashSet8.addAll(hashSet3);
                                        if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                            return;
                                        }
                                        JSONArray optJSONArray5 = optJSONArray.optJSONArray(6);
                                        if (optJSONArray5 != null) {
                                            AbstractC19074t.m100205c(optJSONArray5);
                                            Collection m110129t4 = m110129t(optJSONArray5);
                                            if (m110129t4 != null) {
                                                hashSet4 = m110129t4;
                                                hashSet8.addAll(hashSet4);
                                                if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                    return;
                                                }
                                                if (z11) {
                                                    JSONArray optJSONArray6 = optJSONArray.optJSONArray(9);
                                                    if (optJSONArray6 != null) {
                                                        AbstractC19074t.m100205c(optJSONArray6);
                                                        Collection m110129t5 = m110129t(optJSONArray6);
                                                        if (m110129t5 != null) {
                                                            hashSet6 = m110129t5;
                                                            hashSet8.addAll(hashSet6);
                                                            if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                                return;
                                                            }
                                                            JSONArray optJSONArray7 = optJSONArray.optJSONArray(8);
                                                            if (optJSONArray7 != null) {
                                                                AbstractC19074t.m100205c(optJSONArray7);
                                                                Collection m110129t6 = m110129t(optJSONArray7);
                                                                if (m110129t6 != null) {
                                                                    hashSet7 = m110129t6;
                                                                    hashSet8.addAll(hashSet7);
                                                                    if (hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                            hashSet7 = new HashSet();
                                                            hashSet8.addAll(hashSet7);
                                                            if (hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                            }
                                                        }
                                                    }
                                                    hashSet6 = new HashSet();
                                                    hashSet8.addAll(hashSet6);
                                                    if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                    }
                                                } else {
                                                    JSONArray optJSONArray8 = optJSONArray.optJSONArray(8);
                                                    if (optJSONArray8 != null) {
                                                        AbstractC19074t.m100205c(optJSONArray8);
                                                        Collection m110129t7 = m110129t(optJSONArray8);
                                                        if (m110129t7 != null) {
                                                            hashSet5 = m110129t7;
                                                            hashSet8.addAll(hashSet5);
                                                            if (hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    hashSet5 = new HashSet();
                                                    hashSet8.addAll(hashSet5);
                                                    if (hashSet8.contains(c17945a0.m95029V3().toString())) {
                                                    }
                                                }
                                                JSONArray optJSONArray9 = optJSONArray.optJSONArray(0);
                                                if (optJSONArray9 != null) {
                                                    AbstractC19074t.m100205c(optJSONArray9);
                                                    int length = optJSONArray9.length();
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 >= length) {
                                                            break;
                                                        }
                                                        if (AbstractC19074t.m100204b(optJSONArray9.get(i12), c17945a0.m95029V3().toString())) {
                                                            optJSONArray9.remove(i12);
                                                            break;
                                                        }
                                                        i12++;
                                                    }
                                                }
                                                JSONArray optJSONArray10 = optJSONArray.optJSONArray(1);
                                                if (optJSONArray10 != null) {
                                                    AbstractC19074t.m100205c(optJSONArray10);
                                                    int length2 = optJSONArray10.length();
                                                    for (int i13 = 0; i13 < length2; i13++) {
                                                        if (AbstractC19074t.m100204b(optJSONArray10.get(i13), c17945a0.m95029V3().toString())) {
                                                            optJSONArray10.remove(i13);
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        hashSet4 = new HashSet();
                                        hashSet8.addAll(hashSet4);
                                        if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                        }
                                    }
                                }
                                hashSet3 = new HashSet();
                                hashSet8.addAll(hashSet3);
                                if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                                }
                            }
                        }
                        hashSet2 = new HashSet();
                        hashSet8.addAll(hashSet2);
                        if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                        }
                    }
                }
                hashSet = new HashSet();
                hashSet8.addAll(hashSet);
                if (!hashSet8.contains(c17945a0.m95029V3().toString())) {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: y0 */
    private final String[] m110140y0(C23667x c23667x) {
        boolean z11;
        Object obj;
        JSONArray jSONArray;
        int i11;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceId", AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString());
        if (C21459a.m111034b(C20128b.m104761h()) < this.f103620e.m109886m0().m128658t()) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str = "0";
        if (!z11) {
            obj = "0";
        } else {
            obj = "1";
        }
        jSONObject.put("isFull", obj);
        if (!AbstractC23306f.m120660f().m124326d()) {
            str = "1";
        }
        jSONObject.put("isOffSetting", str);
        JSONArray jSONArray2 = new JSONArray();
        JSONArray optJSONArray = c23667x.f114649i.optJSONArray("param2");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i12);
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AbstractC25495a.m132089n(optJSONObject.optString("id")));
                        if (AbstractC25495a.m132079d(optJSONObject.optString("id"))) {
                            C31973j5 m4472f = C0943w.f3447a.m4472f(optJSONObject.optString("id"));
                            if (m4472f != null) {
                                i11 = m4472f.m153732O();
                            } else {
                                i11 = 0;
                            }
                            jSONObject2.put("tsz", i11);
                        }
                        jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, optJSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                        jSONObject2.put("date", optJSONObject.optString("date"));
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("data");
                        jSONObject2.put("tc", m110138x0(optJSONArray2, 4));
                        AbstractC29231f.m145986d(jSONObject2, "qca", m110138x0(optJSONArray2, 0));
                        AbstractC29231f.m145986d(jSONObject2, "qcv", m110138x0(optJSONArray2, 1));
                        AbstractC29231f.m145986d(jSONObject2, "dca", m110138x0(optJSONArray2, 2));
                        AbstractC29231f.m145986d(jSONObject2, "dcv", m110138x0(optJSONArray2, 3));
                        AbstractC29231f.m145986d(jSONObject2, "cca", m110138x0(optJSONArray2, 5));
                        AbstractC29231f.m145986d(jSONObject2, "ccv", m110138x0(optJSONArray2, 6));
                        AbstractC29231f.m145986d(jSONObject2, "rqc", m110138x0(optJSONArray2, 7));
                        AbstractC29231f.m145986d(jSONObject2, "rrqc", m110138x0(optJSONArray2, 8));
                        jSONArray2.put(jSONObject2);
                    } catch (JSONException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject optJSONObject2 = c23667x.f114649i.optJSONObject("param3");
        if (optJSONObject2 != null) {
            jSONArray = optJSONObject2.optJSONArray("data");
        } else {
            jSONArray = null;
        }
        jSONObject3.put("tsc", m110138x0(jSONArray, 0));
        jSONObject3.put("dsc", m110138x0(jSONArray, 1));
        String jSONObject4 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
        String jSONArray3 = jSONArray2.toString();
        AbstractC19074t.m100207e(jSONArray3, "toString(...)");
        String jSONObject5 = jSONObject3.toString();
        AbstractC19074t.m100207e(jSONObject5, "toString(...)");
        return new String[]{jSONObject4, jSONArray3, jSONObject5};
    }

    /* renamed from: z */
    private final void m110141z(JSONObject jSONObject, C17945a0 c17945a0, C21216s c21216s) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            int m109888n0 = c21216s.m109888n0(c17945a0);
            if (m109888n0 != 1) {
                if (m109888n0 != 2) {
                    if (m109888n0 != 4) {
                        if (m109888n0 == 8) {
                            m110135w(optJSONArray, c17945a0, 2);
                            return;
                        }
                        return;
                    }
                    m110135w(optJSONArray, c17945a0, 3);
                    return;
                }
                m110135w(optJSONArray, c17945a0, 1);
                return;
            }
            m110135w(optJSONArray, c17945a0, 0);
        }
    }

    /* renamed from: z0 */
    private final String[] m110142z0(C23667x c23667x) {
        int i11;
        String uuid = AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        JSONArray jSONArray = new JSONArray();
        JSONArray optJSONArray = c23667x.f114649i.optJSONArray("thread_array");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i12);
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AbstractC25495a.m132089n(optJSONObject.optString("id")));
                        if (AbstractC25495a.m132079d(optJSONObject.optString("id"))) {
                            C31973j5 m4472f = C0943w.m4462l().m4472f(optJSONObject.optString("id"));
                            if (m4472f != null) {
                                i11 = m4472f.m153732O();
                            } else {
                                i11 = 0;
                            }
                            jSONObject.put("tsz", i11);
                        }
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, optJSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                        jSONObject.put("date", optJSONObject.optString("thread_date"));
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("data");
                        jSONObject.put("qc", m110138x0(optJSONArray2, 0));
                        jSONObject.put("dc", m110138x0(optJSONArray2, 1));
                        jSONObject.put("rqc", m110138x0(optJSONArray2, 2));
                        jSONArray.put(jSONObject);
                    } catch (JSONException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return new String[]{uuid, jSONArray2};
    }

    /* renamed from: B0 */
    public final void m110143B0(int i11) {
        m110078B().mo13474a(new Runnable() { // from class: ji.a

            /* renamed from: q */
            public final /* synthetic */ int f103562q;

            public /* synthetic */ RunnableC21255a(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110081D0(C21270p.this, r2);
            }
        });
    }

    /* renamed from: C0 */
    public final void m110144C0(int i11, int i12, int i13) {
        m110078B().mo13474a(new Runnable() { // from class: ji.e

            /* renamed from: q */
            public final /* synthetic */ int f103576q;

            /* renamed from: r */
            public final /* synthetic */ int f103577r;

            /* renamed from: s */
            public final /* synthetic */ int f103578s;

            public /* synthetic */ RunnableC21259e(int i112, int i122, int i132) {
                r2 = i112;
                r3 = i122;
                r4 = i132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110083E0(C21270p.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: M */
    public final void m110145M(C17945a0 c17945a0, a aVar, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(aVar, "logState");
        m110078B().mo13474a(new Runnable() { // from class: ji.d

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f103572q;

            /* renamed from: r */
            public final /* synthetic */ C21270p.a f103573r;

            /* renamed from: s */
            public final /* synthetic */ boolean f103574s;

            public /* synthetic */ RunnableC21258d(C17945a0 c17945a02, C21270p.a aVar2, boolean z112) {
                r2 = c17945a02;
                r3 = aVar2;
                r4 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110091N(C21270p.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: O */
    public final void m110146O(String str, int i11, int i12, long j11, int i13) {
        AbstractC19074t.m100208f(str, "kwd");
        if (AbstractC23309i.m121963h()) {
            m110078B().mo13474a(new Runnable() { // from class: ji.l

                /* renamed from: q */
                public final /* synthetic */ String f103603q;

                /* renamed from: r */
                public final /* synthetic */ int f103604r;

                /* renamed from: s */
                public final /* synthetic */ int f103605s;

                /* renamed from: t */
                public final /* synthetic */ long f103606t;

                /* renamed from: u */
                public final /* synthetic */ int f103607u;

                public /* synthetic */ RunnableC21266l(String str2, int i122, int i132, long j112, int i112) {
                    r2 = str2;
                    r3 = i122;
                    r4 = i132;
                    r5 = j112;
                    r7 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110092P(C21270p.this, r2, r3, r4, r5, r7);
                }
            });
        }
    }

    /* renamed from: Q */
    public final void m110147Q(int i11, long j11, int i12, int i13) {
        if (AbstractC23309i.m121963h()) {
            m110078B().mo13474a(new Runnable() { // from class: ji.b

                /* renamed from: q */
                public final /* synthetic */ int f103564q;

                /* renamed from: r */
                public final /* synthetic */ int f103565r;

                /* renamed from: s */
                public final /* synthetic */ int f103566s;

                /* renamed from: t */
                public final /* synthetic */ long f103567t;

                public /* synthetic */ RunnableC21256b(int i132, int i112, int i122, long j112) {
                    r2 = i132;
                    r3 = i112;
                    r4 = i122;
                    r5 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110093R(C21270p.this, r2, r3, r4, r5);
                }
            });
        }
    }

    /* renamed from: T */
    public final void m110148T(C19216b c19216b) {
        AbstractC19074t.m100208f(c19216b, "trackingData");
        if (AbstractC23309i.m121887f()) {
            m110078B().mo13474a(new Runnable() { // from class: ji.o

                /* renamed from: q */
                public final /* synthetic */ C21270p f103613q;

                public /* synthetic */ RunnableC21269o(C21270p this) {
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110095U(C19216b.this, r2);
                }
            });
        }
    }

    /* renamed from: V */
    public final void m110149V(boolean z11, int i11, int i12, int i13, JSONObject jSONObject) {
        synchronized (f103615i) {
            try {
                C23667x c23667x = new C23667x(i11, i12, i13, jSONObject);
                m110094S(this.f103616a, c23667x);
                if (!z11) {
                    c23667x.f114650j = 2;
                    m110094S(this.f103617b, c23667x);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W */
    public final void m110150W(long j11, long j12, int i11, String str, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(str, "actionSession");
        if (AbstractC23309i.m121925g()) {
            m110078B().mo13474a(new Runnable() { // from class: ji.h

                /* renamed from: q */
                public final /* synthetic */ long f103583q;

                /* renamed from: r */
                public final /* synthetic */ long f103584r;

                /* renamed from: s */
                public final /* synthetic */ int f103585s;

                /* renamed from: t */
                public final /* synthetic */ String f103586t;

                /* renamed from: u */
                public final /* synthetic */ int f103587u;

                /* renamed from: v */
                public final /* synthetic */ int f103588v;

                /* renamed from: w */
                public final /* synthetic */ int f103589w;

                public /* synthetic */ RunnableC21262h(long j112, long j122, int i112, String str2, int i122, int i132, int i142) {
                    r2 = j112;
                    r4 = j122;
                    r6 = i112;
                    r7 = str2;
                    r8 = i122;
                    r9 = i132;
                    r10 = i142;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110096X(C21270p.this, r2, r4, r6, r7, r8, r9, r10);
                }
            });
        }
    }

    /* renamed from: Y */
    public final void m110151Y(C32024mb c32024mb) {
        if (c32024mb != null && c32024mb.m154402h() == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("param1", c32024mb.m154404j());
                jSONObject.put("param2", c32024mb.m154400f() + 1);
                jSONObject.put("param3", c32024mb.m154399e() + 1);
                jSONObject.put("param4", c32024mb.m154405k());
                jSONObject.put("param5", c32024mb.m154395a());
                jSONObject.put("param6", C27517h.Companion.m140723a().m140703H());
                C0815e1.m2075D().m2109g(new C23667x(8, 0, 10, jSONObject));
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: Z */
    public final void m110152Z(int i11, int i12, String str, int i13) {
        AbstractC19074t.m100208f(str, "frequencySourcePanel");
        if (AbstractC23309i.m121925g() && i11 != -1) {
            m110078B().mo13474a(new Runnable() { // from class: ji.j

                /* renamed from: q */
                public final /* synthetic */ int f103596q;

                /* renamed from: r */
                public final /* synthetic */ int f103597r;

                /* renamed from: s */
                public final /* synthetic */ String f103598s;

                /* renamed from: t */
                public final /* synthetic */ int f103599t;

                public /* synthetic */ RunnableC21264j(int i112, int i122, String str2, int i132) {
                    r2 = i112;
                    r3 = i122;
                    r4 = str2;
                    r5 = i132;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110098a0(C21270p.this, r2, r3, r4, r5);
                }
            });
        }
    }

    /* renamed from: b0 */
    public final void m110153b0(int i11, C17725e c17725e, int i12) {
        AbstractC19074t.m100208f(c17725e, "data");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param1", i11);
            jSONObject.put("param2", c17725e.m93827a());
            jSONObject.put("param3", c17725e.m93828b());
            jSONObject.put("param4", c17725e.m93829c());
            jSONObject.put("param5", i12);
            C0815e1.m2075D().m2109g(new C23667x(8, 0, 11, jSONObject));
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c0 */
    public final void m110154c0(C17945a0 c17945a0, a aVar) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(aVar, "logState");
        if (!this.f103621f.m109956w()) {
            return;
        }
        m110078B().mo13474a(new Runnable() { // from class: ji.c

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f103569q;

            /* renamed from: r */
            public final /* synthetic */ C21270p.a f103570r;

            public /* synthetic */ RunnableC21257c(C17945a0 c17945a02, C21270p.a aVar2) {
                r2 = c17945a02;
                r3 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110102d0(C21270p.this, r2, r3);
            }
        });
    }

    /* renamed from: e0 */
    public final void m110155e0(String str, long j11, int i11, int i12) {
        AbstractC19074t.m100208f(str, "distanceInSession");
        if (AbstractC23309i.m121925g()) {
            m110078B().mo13474a(new Runnable() { // from class: ji.i

                /* renamed from: q */
                public final /* synthetic */ String f103591q;

                /* renamed from: r */
                public final /* synthetic */ long f103592r;

                /* renamed from: s */
                public final /* synthetic */ int f103593s;

                /* renamed from: t */
                public final /* synthetic */ int f103594t;

                public /* synthetic */ RunnableC21263i(String str2, long j112, int i122, int i112) {
                    r2 = str2;
                    r3 = j112;
                    r5 = i122;
                    r6 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110105f0(C21270p.this, r2, r3, r5, r6);
                }
            });
        }
    }

    /* renamed from: i0 */
    public final void m110156i0() {
        if (!this.f103618c) {
            this.f103618c = true;
            m110078B().mo13474a(new Runnable() { // from class: ji.g
                public /* synthetic */ RunnableC21261g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21270p.m110112j0(C21270p.this);
                }
            });
        }
    }

    /* renamed from: n0 */
    public final void m110157n0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        m110078B().mo13474a(new Runnable() { // from class: ji.f

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f103580q;

            public /* synthetic */ RunnableC21260f(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21270p.m110121o0(C21270p.this, r2);
            }
        });
    }

    /* renamed from: s0 */
    public final void m110158s0() {
        String str = CoreUtility.f89233i;
        Calendar calendar = Calendar.getInstance();
        long m3708c2 = AbstractC0924m0.m3708c2();
        calendar.setTimeInMillis(m3708c2);
        String m119240c0 = AbstractC23160o0.m119240c0(calendar);
        AbstractC19074t.m100207e(m119240c0, "getDdMmYyyySlashStr(...)");
        long mo124314i = this.f103619d.mo124314i();
        calendar.setTimeInMillis(mo124314i);
        String m119240c02 = AbstractC23160o0.m119240c0(calendar);
        AbstractC19074t.m100207e(m119240c02, "getDdMmYyyySlashStr(...)");
        if (!this.f103618c && mo124314i > m3708c2 && !AbstractC19074t.m100204b(m119240c0, m119240c02)) {
            synchronized (f103615i) {
                AbstractC19074t.m100205c(str);
                m110130t0(str);
                m110125q0(str, m119240c02);
                m110134v0(str, m119240c02);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            AbstractC0924m0.m3695bj(this.f103619d.mo124314i());
        }
    }

    private C21270p() {
        InterfaceC24854k m129210a;
        this.f103616a = new SparseArray();
        this.f103617b = new SparseArray();
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        this.f103619d = m120579F1;
        C21216s m120652d = AbstractC23306f.m120652d();
        AbstractC19074t.m100207e(m120652d, "provideAutoDownloadMsgResourcesController(...)");
        this.f103620e = m120652d;
        C21219v m120573D1 = AbstractC23306f.m120573D1();
        AbstractC19074t.m100207e(m120573D1, "provideSyncActionMediaController(...)");
        this.f103621f = m120573D1;
        m129210a = AbstractC24856m.m129210a(e.f103633q);
        this.f103622g = m129210a;
        this.f103618c = false;
    }
}
