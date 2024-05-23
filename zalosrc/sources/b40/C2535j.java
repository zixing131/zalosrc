package b40;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ln0.AbstractC22543l;
import ln0.C22540i;
import org.json.JSONArray;
import org.json.JSONObject;
import p227i3.C20218v;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;

/* renamed from: b40.j */
/* loaded from: classes5.dex */
public final class C2535j {

    /* renamed from: a */
    public static final C2535j f10308a = new C2535j();

    /* renamed from: b */
    private static final HashMap f10309b = new HashMap();

    /* renamed from: c */
    private static final Map f10310c;

    /* renamed from: d */
    private static final Set f10311d;

    /* renamed from: e */
    private static boolean f10312e;

    /* renamed from: f */
    private static boolean f10313f;

    /* renamed from: g */
    private static final C22540i f10314g;

    /* renamed from: h */
    private static C22540i f10315h;

    /* renamed from: i */
    private static final int[] f10316i;

    /* renamed from: j */
    private static int[] f10317j;

    /* renamed from: b40.j$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final MessageId f10318a;

        /* renamed from: b */
        private final long f10319b;

        public a(MessageId messageId, long j11) {
            AbstractC19074t.m100208f(messageId, "messageId");
            this.f10318a = messageId;
            this.f10319b = j11;
        }

        /* renamed from: a */
        public final MessageId m12777a() {
            return this.f10318a;
        }

        /* renamed from: b */
        public final long m12778b() {
            return this.f10319b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f10318a, aVar.f10318a) && this.f10319b == aVar.f10319b;
        }

        public int hashCode() {
            return (this.f10318a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f10319b);
        }

        public String toString() {
            return "MessageInfo(messageId=" + this.f10318a + ", timestamp=" + this.f10319b + ")";
        }
    }

    /* renamed from: b40.j$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f10320a;

        /* renamed from: b */
        private final String f10321b;

        /* renamed from: c */
        private final Set f10322c;

        /* renamed from: d */
        private final Set f10323d;

        /* renamed from: e */
        private final Set f10324e;

        /* renamed from: f */
        private final Set f10325f;

        /* renamed from: g */
        private final Set f10326g;

        /* renamed from: h */
        private final Set f10327h;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "entryPoint");
            AbstractC19074t.m100208f(str2, "threadId");
            this.f10320a = str;
            this.f10321b = str2;
            Set synchronizedSet = Collections.synchronizedSet(new HashSet());
            AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
            this.f10322c = synchronizedSet;
            Set synchronizedSet2 = Collections.synchronizedSet(new HashSet());
            AbstractC19074t.m100207e(synchronizedSet2, "synchronizedSet(...)");
            this.f10323d = synchronizedSet2;
            Set synchronizedSet3 = Collections.synchronizedSet(new HashSet());
            AbstractC19074t.m100207e(synchronizedSet3, "synchronizedSet(...)");
            this.f10324e = synchronizedSet3;
            Set synchronizedSet4 = Collections.synchronizedSet(new HashSet());
            AbstractC19074t.m100207e(synchronizedSet4, "synchronizedSet(...)");
            this.f10325f = synchronizedSet4;
            Set synchronizedSet5 = Collections.synchronizedSet(new HashSet());
            AbstractC19074t.m100207e(synchronizedSet5, "synchronizedSet(...)");
            this.f10326g = synchronizedSet5;
            Set synchronizedSet6 = Collections.synchronizedSet(new HashSet());
            AbstractC19074t.m100207e(synchronizedSet6, "synchronizedSet(...)");
            this.f10327h = synchronizedSet6;
        }

        /* renamed from: a */
        public final Set m12779a() {
            return this.f10327h;
        }

        /* renamed from: b */
        public final Set m12780b() {
            return this.f10325f;
        }

        /* renamed from: c */
        public final Set m12781c() {
            return this.f10326g;
        }

        /* renamed from: d */
        public final Set m12782d() {
            return this.f10324e;
        }

        /* renamed from: e */
        public final Set m12783e() {
            return this.f10322c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f10320a, bVar.f10320a) && AbstractC19074t.m100204b(this.f10321b, bVar.f10321b);
        }

        /* renamed from: f */
        public final Set m12784f() {
            return this.f10323d;
        }

        /* renamed from: g */
        public final boolean m12785g() {
            if ((!this.f10322c.isEmpty()) || (!this.f10323d.isEmpty()) || (!this.f10324e.isEmpty()) || (!this.f10325f.isEmpty()) || (!this.f10326g.isEmpty()) || (!this.f10327h.isEmpty())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f10320a.hashCode() * 31) + this.f10321b.hashCode();
        }

        public String toString() {
            return "VisibleMediaRecord(entryPoint=" + this.f10320a + ", threadId=" + this.f10321b + ")";
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f10310c = synchronizedMap;
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        f10311d = synchronizedSet;
        f10314g = new C22540i(0L, 0L);
        f10316i = new int[]{10, 14};
    }

    private C2535j() {
    }

    /* renamed from: C */
    public static final void m12745C(String str, String str2, C2535j c2535j) {
        int i11;
        AbstractC19074t.m100208f(str, "$entryPoint");
        AbstractC19074t.m100208f(str2, "$threadId");
        AbstractC19074t.m100208f(c2535j, "this$0");
        try {
            C2535j c2535j2 = f10308a;
            if (!c2535j2.m12755g() && !c2535j2.m12756h()) {
                return;
            }
            String str3 = CoreUtility.f89233i + "_" + str + "_" + str2;
            HashMap hashMap = f10309b;
            synchronized (hashMap) {
                b bVar = (b) hashMap.remove(str3);
                if (bVar == null) {
                    return;
                }
                AbstractC19074t.m100207e(bVar, "synchronized(...)");
                if (!bVar.m12785g()) {
                    return;
                }
                int[] m12757i = c2535j.m12757i();
                JSONObject jSONObject = new JSONObject();
                if (!bVar.m12783e().isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vw", bVar.m12783e().size());
                    jSONObject2.put("lts", c2535j2.m12764w(bVar.m12783e()));
                    if (!bVar.m12780b().isEmpty()) {
                        int i12 = 0;
                        for (Object obj : c2535j2.m12754f(bVar.m12780b(), m12757i)) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                AbstractC25368s.m131509q();
                            }
                            jSONObject2.put("r" + i13, ((Number) obj).intValue());
                            i12 = i13;
                        }
                    }
                    jSONObject.put("p", jSONObject2);
                }
                if (!bVar.m12784f().isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vw", bVar.m12784f().size());
                    C2535j c2535j3 = f10308a;
                    jSONObject3.put("lts", c2535j3.m12764w(bVar.m12784f()));
                    if (!bVar.m12781c().isEmpty()) {
                        int i14 = 0;
                        for (Object obj2 : c2535j3.m12754f(bVar.m12781c(), m12757i)) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                AbstractC25368s.m131509q();
                            }
                            jSONObject3.put("r" + i15, ((Number) obj2).intValue());
                            i14 = i15;
                        }
                    }
                    synchronized (bVar.m12784f()) {
                        try {
                            Iterator it = bVar.m12784f().iterator();
                            i11 = 0;
                            while (it.hasNext()) {
                                Integer num = (Integer) f10310c.get(((a) it.next()).m12777a());
                                if (num != null && num.intValue() == 1) {
                                    i11++;
                                }
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                    if (i11 > 0) {
                        jSONObject3.put("rc", i11);
                    }
                    jSONObject.put(C20218v.f100059b, jSONObject3);
                }
                if (!bVar.m12782d().isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("vw", bVar.m12782d().size());
                    C2535j c2535j4 = f10308a;
                    jSONObject4.put("lts", c2535j4.m12764w(bVar.m12782d()));
                    if (!bVar.m12779a().isEmpty()) {
                        int i16 = 0;
                        for (Object obj3 : c2535j4.m12754f(bVar.m12779a(), m12757i)) {
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                AbstractC25368s.m131509q();
                            }
                            jSONObject4.put("r" + i17, ((Number) obj3).intValue());
                            i16 = i17;
                        }
                    }
                    jSONObject.put("f", jSONObject4);
                }
                C2535j c2535j5 = f10308a;
                jSONObject.put("fr", c2535j5.m12758j().m116558d());
                jSONObject.put("to", c2535j5.m12758j().m116559e());
                if (AbstractC25495a.m132079d(str2)) {
                    jSONObject.put("tid", AbstractC25495a.m132089n(str2));
                    C31973j5 m4473g = C0943w.f3447a.m4473g(str2);
                    if (m4473g != null) {
                        jSONObject.put("tsz", m4473g.m153732O());
                    }
                } else {
                    jSONObject.put("tid", str2);
                }
                C0815e1.m2075D().m2100V(new C23648e(44, str, 1, "media_roll", C2526d.f10270a.m12733y(str2), jSONObject.toString()), false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: D */
    private final a m12746D(ItemAlbumMobile itemAlbumMobile) {
        MessageId m40496C = itemAlbumMobile.m40496C();
        if (m40496C != null) {
            return new a(m40496C, itemAlbumMobile.f42564O);
        }
        return null;
    }

    /* renamed from: E */
    private final a m12747E(MediaStoreItem mediaStoreItem) {
        return new a(mediaStoreItem.m40571M(), mediaStoreItem.m40599m().m95313z4());
    }

    /* renamed from: F */
    private final a m12748F(C17945a0 c17945a0) {
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        return new a(m95029V3, c17945a0.m94974P4());
    }

    /* renamed from: f */
    private final List m12754f(Set set, int[] iArr) {
        int m131360H;
        List m131496e;
        if (iArr.length == 0) {
            m131496e = AbstractC25366r.m131496e(Integer.valueOf(set.size()));
            return m131496e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = iArr.length;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = iArr[i12];
            int i15 = i13 + 1;
            linkedHashMap.put(new C24860q(Integer.valueOf(i11), Integer.valueOf(i14)), 0);
            m131360H = AbstractC25358n.m131360H(iArr);
            if (i13 == m131360H) {
                linkedHashMap.put(new C24860q(Integer.valueOf(i14), Integer.MAX_VALUE), 0);
            }
            i12++;
            i11 = i14;
            i13 = i15;
        }
        long mo124314i = AbstractC23306f.m120579F1().mo124314i();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int m12778b = (int) ((mo124314i - ((a) it.next()).m12778b()) / 86400000);
            if (m12778b >= 0) {
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C24860q c24860q = (C24860q) it2.next();
                        if (m12778b >= ((Number) c24860q.m129215c()).intValue() && m12778b < ((Number) c24860q.m129216d()).intValue()) {
                            AbstractC19074t.m100205c(c24860q);
                            Object obj = linkedHashMap.get(c24860q);
                            AbstractC19074t.m100205c(obj);
                            linkedHashMap.put(c24860q, Integer.valueOf(((Number) obj).intValue() + 1));
                            break;
                        }
                    }
                }
            }
        }
        return new ArrayList(linkedHashMap.values());
    }

    /* renamed from: g */
    private final boolean m12755g() {
        f10312e = true;
        return AbstractC0924m0.m4342xa();
    }

    /* renamed from: h */
    private final boolean m12756h() {
        f10313f = true;
        return AbstractC0924m0.m4371ya();
    }

    /* renamed from: i */
    private final int[] m12757i() {
        String m3507V6;
        try {
            if (f10317j == null && (m3507V6 = AbstractC0924m0.m3507V6()) != null && m3507V6.length() > 0) {
                m12765y(new JSONArray(m3507V6));
            }
            int[] iArr = f10317j;
            if (iArr != null) {
                AbstractC19074t.m100205c(iArr);
                return iArr;
            }
            return f10316i;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return f10316i;
        }
    }

    /* renamed from: j */
    private final C22540i m12758j() {
        String m3536W6;
        try {
            if (f10315h == null && (m3536W6 = AbstractC0924m0.m3536W6()) != null && m3536W6.length() > 0) {
                m12766z(new JSONArray(m3536W6));
            }
            C22540i c22540i = f10315h;
            if (c22540i != null) {
                AbstractC19074t.m100205c(c22540i);
                return c22540i;
            }
            return f10314g;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return f10314g;
        }
    }

    /* renamed from: l */
    private final boolean m12759l(C22540i c22540i, long j11) {
        if ((c22540i.m116558d() > 0 && c22540i.m116558d() > j11) || (c22540i.m116559e() > 0 && c22540i.m116559e() < j11)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static final void m12760p(MessageId messageId, int i11) {
        AbstractC19074t.m100208f(messageId, "$messageId");
        f10310c.put(messageId, Integer.valueOf(i11));
    }

    /* renamed from: t */
    public static final void m12761t(boolean z11, C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        AbstractC19074t.m100208f(str, "$entryPoint");
        try {
            C2535j c2535j = f10308a;
            if ((!c2535j.m12755g() && (!c2535j.m12756h() || !z11)) || !c2535j.m12759l(c2535j.m12758j(), c17945a0.m94974P4()) || c17945a0.m94974P4() > AbstractC23306f.m120579F1().mo124314i()) {
                return;
            }
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            String str2 = CoreUtility.f89233i + "_" + str + "_" + mo95039W2;
            HashMap hashMap = f10309b;
            synchronized (hashMap) {
                try {
                    b bVar = (b) hashMap.get(str2);
                    if (bVar == null) {
                        bVar = new b(str, mo95039W2);
                        hashMap.put(str2, bVar);
                    }
                    a m12748F = c2535j.m12748F(c17945a0);
                    if (c17945a0.m94871D7()) {
                        bVar.m12783e().add(m12748F);
                        if (z11) {
                            bVar.m12780b().add(m12748F);
                        } else {
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    } else if (c17945a0.m95306y8()) {
                        bVar.m12784f().add(m12748F);
                        if (z11) {
                            bVar.m12781c().add(m12748F);
                        } else {
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        }
                    } else {
                        if (c17945a0.m95276v6()) {
                            bVar.m12782d().add(m12748F);
                            if (z11) {
                                bVar.m12779a().add(m12748F);
                            }
                        }
                        C24848g0 c24848g03 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: u */
    public static final void m12762u(boolean z11, MediaStoreItem mediaStoreItem, String str) {
        AbstractC19074t.m100208f(mediaStoreItem, "$mediaStoreItem");
        AbstractC19074t.m100208f(str, "$entryPoint");
        try {
            C2535j c2535j = f10308a;
            if ((!c2535j.m12755g() && (!c2535j.m12756h() || !z11)) || !c2535j.m12759l(c2535j.m12758j(), mediaStoreItem.m40599m().m95313z4()) || mediaStoreItem.m40599m().m95313z4() > AbstractC23306f.m120579F1().mo124314i()) {
                return;
            }
            String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            String str2 = CoreUtility.f89233i + "_" + str + "_" + mo95039W2;
            HashMap hashMap = f10309b;
            synchronized (hashMap) {
                try {
                    b bVar = (b) hashMap.get(str2);
                    if (bVar == null) {
                        bVar = new b(str, mo95039W2);
                        hashMap.put(str2, bVar);
                    }
                    a m12747E = c2535j.m12747E(mediaStoreItem);
                    if (mediaStoreItem.m40594i0()) {
                        bVar.m12783e().add(m12747E);
                        if (z11) {
                            bVar.m12780b().add(m12747E);
                        } else {
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    } else if (mediaStoreItem.m40602n0()) {
                        bVar.m12784f().add(m12747E);
                        if (z11) {
                            bVar.m12781c().add(m12747E);
                        } else {
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        }
                    } else {
                        if (mediaStoreItem.m40581Y()) {
                            bVar.m12782d().add(m12747E);
                            if (z11) {
                                bVar.m12779a().add(m12747E);
                            }
                        }
                        C24848g0 c24848g03 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: v */
    public static final void m12763v(boolean z11, ItemAlbumMobile itemAlbumMobile, String str) {
        AbstractC19074t.m100208f(itemAlbumMobile, "$itemAlbumMobile");
        AbstractC19074t.m100208f(str, "$entryPoint");
        try {
            C2535j c2535j = f10308a;
            if ((!c2535j.m12755g() && (!c2535j.m12756h() || !z11)) || !c2535j.m12759l(c2535j.m12758j(), itemAlbumMobile.f42564O) || itemAlbumMobile.f42564O > AbstractC23306f.m120579F1().mo124314i()) {
                return;
            }
            String str2 = itemAlbumMobile.f42579d0;
            String str3 = CoreUtility.f89233i + "_" + str + "_" + str2;
            HashMap hashMap = f10309b;
            synchronized (hashMap) {
                try {
                    b bVar = (b) hashMap.get(str3);
                    if (bVar == null) {
                        AbstractC19074t.m100205c(str2);
                        bVar = new b(str, str2);
                        hashMap.put(str3, bVar);
                    }
                    a m12746D = c2535j.m12746D(itemAlbumMobile);
                    if (m12746D == null) {
                        return;
                    }
                    int i11 = itemAlbumMobile.f42591p;
                    if (i11 == 1) {
                        bVar.m12783e().add(m12746D);
                        if (z11) {
                            bVar.m12780b().add(m12746D);
                        } else {
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    } else if (i11 == 2) {
                        bVar.m12784f().add(m12746D);
                        if (z11) {
                            bVar.m12781c().add(m12746D);
                        } else {
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        }
                    } else {
                        if (itemAlbumMobile.f42610y0) {
                            bVar.m12782d().add(m12746D);
                            if (z11) {
                                bVar.m12779a().add(m12746D);
                            }
                        }
                        C24848g0 c24848g03 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: w */
    private final long m12764w(Set set) {
        Iterator it = set.iterator();
        long j11 = Long.MAX_VALUE;
        while (it.hasNext()) {
            j11 = AbstractC22543l.m116585h(j11, ((a) it.next()).m12778b());
        }
        return j11;
    }

    /* renamed from: y */
    private final void m12765y(JSONArray jSONArray) {
        int[] iArr;
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            try {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = jSONArray.getInt(i11);
                    if (i12 > 0 && !arrayList.contains(Integer.valueOf(i12))) {
                        arrayList.add(Integer.valueOf(jSONArray.getInt(i11)));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            AbstractC25376w.m131533v(arrayList);
            if (!arrayList.isEmpty()) {
                iArr = AbstractC25332a0.m131184L0(arrayList);
            } else {
                iArr = f10316i;
            }
        } else {
            iArr = f10316i;
        }
        f10317j = iArr;
    }

    /* renamed from: z */
    private final void m12766z(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                f10315h = new C22540i(jSONArray.getLong(0), jSONArray.getLong(1));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        if (f10315h == null) {
            f10315h = f10314g;
        }
    }

    /* renamed from: A */
    public final void m12767A() {
        f10317j = null;
        f10315h = null;
        f10312e = false;
        HashMap hashMap = f10309b;
        synchronized (hashMap) {
            hashMap.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: B */
    public final void m12768B(String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "threadId");
        if (f10312e && !m12755g() && f10313f && !m12756h()) {
            return;
        }
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.i

            /* renamed from: p */
            public final /* synthetic */ String f10305p;

            /* renamed from: q */
            public final /* synthetic */ String f10306q;

            /* renamed from: r */
            public final /* synthetic */ C2535j f10307r;

            public /* synthetic */ RunnableC2534i(String str3, String str22, C2535j this) {
                r1 = str3;
                r2 = str22;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2535j.m12745C(r1, r2, r3);
            }
        });
    }

    /* renamed from: k */
    public final int m12769k(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        Integer num = (Integer) f10310c.get(messageId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: m */
    public final boolean m12770m(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        return f10311d.contains(messageId);
    }

    /* renamed from: n */
    public final void m12771n(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        f10311d.add(messageId);
    }

    /* renamed from: o */
    public final void m12772o(MessageId messageId, int i11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.f

            /* renamed from: q */
            public final /* synthetic */ int f10291q;

            public /* synthetic */ RunnableC2530f(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2535j.m12760p(MessageId.this, r2);
            }
        });
    }

    /* renamed from: q */
    public final void m12773q(String str, ItemAlbumMobile itemAlbumMobile, boolean z11) {
        String str2;
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(itemAlbumMobile, "itemAlbumMobile");
        if ((!f10312e || m12755g() || !f10313f || m12756h()) && (str2 = itemAlbumMobile.f42579d0) != null && str2.length() != 0) {
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.h

                /* renamed from: p */
                public final /* synthetic */ boolean f10302p;

                /* renamed from: q */
                public final /* synthetic */ ItemAlbumMobile f10303q;

                /* renamed from: r */
                public final /* synthetic */ String f10304r;

                public /* synthetic */ RunnableC2533h(boolean z112, ItemAlbumMobile itemAlbumMobile2, String str3) {
                    r1 = z112;
                    r2 = itemAlbumMobile2;
                    r3 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2535j.m12763v(r1, r2, r3);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m12774r(String str, MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        if (f10312e && !m12755g() && f10313f && !m12756h()) {
            return;
        }
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.g

            /* renamed from: p */
            public final /* synthetic */ boolean f10299p;

            /* renamed from: q */
            public final /* synthetic */ MediaStoreItem f10300q;

            /* renamed from: r */
            public final /* synthetic */ String f10301r;

            public /* synthetic */ RunnableC2532g(boolean z112, MediaStoreItem mediaStoreItem2, String str2) {
                r1 = z112;
                r2 = mediaStoreItem2;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2535j.m12762u(r1, r2, r3);
            }
        });
    }

    /* renamed from: s */
    public final void m12775s(String str, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (f10312e && !m12755g() && f10313f && !m12756h()) {
            return;
        }
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.e

            /* renamed from: p */
            public final /* synthetic */ boolean f10282p;

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f10283q;

            /* renamed from: r */
            public final /* synthetic */ String f10284r;

            public /* synthetic */ RunnableC2528e(boolean z112, C17945a0 c17945a02, String str2) {
                r1 = z112;
                r2 = c17945a02;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2535j.m12761t(r1, r2, r3);
            }
        });
    }

    /* renamed from: x */
    public final void m12776x(JSONObject jSONObject) {
        boolean z11;
        String str;
        JSONArray optJSONArray;
        String jSONArray;
        AbstractC19074t.m100208f(jSONObject, "configJsonObject");
        try {
            boolean z12 = false;
            if (jSONObject.optInt("enable_tl_rolled_media") > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m4233th(z11);
            if (jSONObject.optInt("enable_tl_rolled_media_item") > 0) {
                z12 = true;
            }
            AbstractC0924m0.m4262uh(z12);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("tl_rolled_media_segments");
            String str2 = "";
            if (optJSONArray2 != null) {
                str = optJSONArray2.toString();
                if (str == null) {
                }
                AbstractC0924m0.m3207Kp(str);
                m12765y(optJSONArray2);
                optJSONArray = jSONObject.optJSONArray("tl_rolled_media_time_range");
                if (optJSONArray != null && (jSONArray = optJSONArray.toString()) != null) {
                    str2 = jSONArray;
                }
                AbstractC0924m0.m3236Lp(str2);
                m12766z(optJSONArray);
            }
            str = "";
            AbstractC0924m0.m3207Kp(str);
            m12765y(optJSONArray2);
            optJSONArray = jSONObject.optJSONArray("tl_rolled_media_time_range");
            if (optJSONArray != null) {
                str2 = jSONArray;
            }
            AbstractC0924m0.m3236Lp(str2);
            m12766z(optJSONArray);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
