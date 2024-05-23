package p162fh;

import ae.C0766k;
import am.AbstractC0924m0;
import am.C0943w;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.chattag.C11837a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gh.C19446a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23089h6;
import me0.C23139m1;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p132ej.C18440b;
import p132ej.C18451m;
import p210hh.C20060c;
import p210hh.C20061d;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p405ov.C24559a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import vg.C28203u6;

/* renamed from: fh.d */
/* loaded from: classes3.dex */
public final class C18935d {
    public static final b Companion = new b(null);

    /* renamed from: l */
    private static final InterfaceC29232g f94448l = AbstractC29233h.m145990a(a.f94460q);

    /* renamed from: a */
    private AtomicBoolean f94449a;

    /* renamed from: b */
    private final Map f94450b;

    /* renamed from: c */
    private final Map f94451c;

    /* renamed from: d */
    private final C19446a f94452d;

    /* renamed from: e */
    private final InterfaceC29232g f94453e;

    /* renamed from: f */
    private boolean f94454f;

    /* renamed from: g */
    private List f94455g;

    /* renamed from: h */
    private List f94456h;

    /* renamed from: i */
    private final Comparator f94457i;

    /* renamed from: j */
    private final Comparator f94458j;

    /* renamed from: k */
    private AtomicBoolean f94459k;

    /* renamed from: fh.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f94460q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18935d mo12V4() {
            return new C18935d(null);
        }
    }

    /* renamed from: fh.d$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18935d m99234a() {
            return (C18935d) C18935d.f94448l.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh.d$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f94461q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC0924m0.m3210L());
        }
    }

    /* renamed from: fh.d$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ List f94463b;

        d(List list) {
            this.f94463b = list;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C18935d.this.f94459k.compareAndSet(true, false);
                if (c20096c != null) {
                    C18935d c18935d = C18935d.this;
                    if (c20096c.m104491c() != -69 && c20096c.m104491c() != 1001) {
                        AbstractC0924m0.m3258Mi(0L);
                    } else {
                        c18935d.m99222K(true);
                        AbstractC0924m0.m3258Mi(System.currentTimeMillis());
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            C18935d.this.f94459k.compareAndSet(true, false);
            AbstractC0924m0.m3258Mi(System.currentTimeMillis());
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                List list = this.f94463b;
                C18935d c18935d = C18935d.this;
                C24559a.m127933c("[ConversationTag]", "getListTagDataFromServer ->listLoadedTagId=" + list + " \ndata=" + jSONObject);
                if (jSONObject.optInt("error_code", 0) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    c18935d.m99201J(optJSONObject.optJSONArray("items"), optJSONObject.optBoolean("hasMore", false), optJSONObject.optInt("version", 0));
                }
            }
        }
    }

    public /* synthetic */ C18935d(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: A */
    private final boolean m99194A() {
        try {
            this.f94450b.clear();
            this.f94450b.putAll(this.f94452d.m101716y());
            this.f94455g.clear();
            for (C20060c c20060c : this.f94450b.values()) {
                if (c20060c.m104219h()) {
                    this.f94455g.add(Integer.valueOf(c20060c.m104215d()));
                }
            }
            C24559a.m127933c("[ConversationTag]", "loadChatTagFromDB -> totalTag=" + this.f94450b.size());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        AbstractC19074t.m100207e(this.f94450b, "mMapTagInfo");
        return !r0.isEmpty();
    }

    /* renamed from: B */
    private final boolean m99195B() {
        try {
            this.f94451c.clear();
            this.f94451c.putAll(this.f94452d.m101715v());
            C24559a.m127933c("[ConversationTag]", "loadChatTagItemFromDB -> totalThread=" + this.f94451c.size() + " totalTagItem=" + m99218x());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        AbstractC19074t.m100207e(this.f94451c, "mMapChatTagItem");
        return !r0.isEmpty();
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m99196D(C18935d c18935d, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return c18935d.m99220C(z11, z12);
    }

    /* renamed from: E */
    private final boolean m99197E(int i11, int i12) {
        if (m99216v() < i11 && i12 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private final void m99198F(boolean z11, boolean z12) {
        C11837a.Companion.m65784a().m65780k(z11);
        if (z12) {
            this.f94456h.clear();
        }
    }

    /* renamed from: G */
    static /* synthetic */ void m99199G(C18935d c18935d, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        c18935d.m99198F(z11, z12);
    }

    /* renamed from: I */
    private final List m99200I(int i11, JSONArray jSONArray) {
        String str;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            Object obj = jSONArray.get(i12);
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null) {
                C20061d.a aVar = C20061d.Companion;
                arrayList.add(new C20061d(i11, aVar.m104228b(str), aVar.m104229c(str), 0L));
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public final void m99201J(JSONArray jSONArray, boolean z11, int i11) {
        int i12;
        JSONObject jSONObject;
        if (jSONArray != null) {
            i12 = jSONArray.length();
        } else {
            i12 = 0;
        }
        C24559a.m127933c("[ConversationTag]", "processChatInfoData ->numTagInfo=" + i12 + " hasMore=" + z11 + " serverVersion=" + i11);
        if (jSONArray != null) {
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < length; i13++) {
                Object obj = jSONArray.get(i13);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    C20060c m104220a = C20060c.Companion.m104220a(jSONObject);
                    arrayList.add(m104220a);
                    JSONArray optJSONArray = jSONObject.optJSONArray("conversations");
                    if (optJSONArray != null) {
                        AbstractC19074t.m100205c(optJSONArray);
                        arrayList2.addAll(m99200I(m104220a.m104215d(), optJSONArray));
                    }
                }
            }
            if (m99197E(i11, this.f94455g.size())) {
                this.f94455g.clear();
                C24559a.m127933c("[ConversationTag]", "processChatInfoData->clear data local totalChatTagInfoDeleted=" + this.f94452d.m101710o() + " totalChatTagItemDeleted=" + this.f94452d.m101711q());
            }
            if (!arrayList.isEmpty()) {
                this.f94452d.m101708F(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f94455g.add(Integer.valueOf(((C20060c) it.next()).m104215d()));
                }
            }
            if (!arrayList2.isEmpty()) {
                this.f94452d.m101707E(arrayList2);
            }
        }
        m99203M(i11);
        boolean z12 = !z11;
        this.f94454f = z12;
        if (!z12) {
            List list = this.f94455g;
            AbstractC19074t.m100207e(list, "mLoadedListTagId");
            m99215t(list);
        } else {
            m99196D(this, true, false, 2, null);
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124116d(8100, new Object[0]);
            bVar.m124119a().m124116d(36, new Object[0]);
            C24559a.m127933c("[ConversationTag]", "sync chat tag info done -> notify refresh UI");
        }
    }

    /* renamed from: L */
    private final void m99202L() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f94456h.iterator();
        while (it.hasNext()) {
            C20060c c20060c = (C20060c) this.f94450b.get(Integer.valueOf(((C20060c) it.next()).m104215d()));
            if (c20060c != null) {
                arrayList.add(c20060c);
            }
        }
        this.f94456h.clear();
        this.f94456h.addAll(arrayList);
    }

    /* renamed from: M */
    private final void m99203M(int i11) {
        C24559a.m127933c("[ConversationTag]", "updateTagVersion -> beforeUpdated=" + m99216v() + " afterUpdated=" + i11);
        this.f94453e.reset();
        AbstractC0924m0.m4230te(i11);
    }

    /* renamed from: g */
    private final void m99209g() {
        C24559a.m127933c("[ConversationTag]", "checkSyncDataTagInfo -> mIsSyncedDone=" + this.f94454f);
        if (!this.f94454f) {
            List list = this.f94455g;
            AbstractC19074t.m100207e(list, "mLoadedListTagId");
            m99215t(list);
        }
    }

    /* renamed from: j */
    public static final int m99210j(C18451m c18451m, C18451m c18451m2) {
        int m104526b;
        boolean m118442j = AbstractC23089h6.m118442j(AbstractC23089h6.m118443k(c18451m.mo97719a()));
        boolean m118442j2 = AbstractC23089h6.m118442j(AbstractC23089h6.m118443k(c18451m2.mo97719a()));
        if (c18451m.f92990a != c18451m2.f92990a) {
            return 0;
        }
        if (m118442j == m118442j2) {
            if (c18451m.mo97720b() != c18451m2.mo97720b() || !(c18451m instanceof C18440b) || !(c18451m2 instanceof C18440b)) {
                m104526b = AbstractC20104d.m104526b(c18451m2.mo97720b() - c18451m.mo97720b());
            } else {
                m104526b = Conversation.m40990d(((C18440b) c18451m).m97729o(), true, false, false, 4, null).compareTo(Conversation.m40990d(((C18440b) c18451m2).m97729o(), true, false, false, 4, null));
            }
            return m104526b;
        }
        if (m118442j) {
            return -1;
        }
        if (!m118442j2) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k */
    public static final int m99211k(C20060c c20060c, C20060c c20060c2) {
        int m104525a;
        m104525a = AbstractC20104d.m104525a(c20060c.m104218g() - c20060c2.m104218g());
        return m104525a;
    }

    /* renamed from: l */
    private final C18451m m99212l(String str, byte b11) {
        ContactProfile m141801m;
        if (b11 == 1) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            if (m4472f == null || m4472f.m153748Z()) {
                return null;
            }
            return new C18440b(new Conversation(C23139m1.f112256a.m118803u(m4472f)));
        }
        if (b11 != 2 || (m141801m = C28203u6.m141801m(C28203u6.f131407a, str, false, 2, null)) == null) {
            return null;
        }
        return new C18440b(new Conversation(m141801m));
    }

    /* renamed from: n */
    public static /* synthetic */ List m99213n(C18935d c18935d, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return c18935d.m99226m(list, z11, z12);
    }

    /* renamed from: s */
    public static final C18935d m99214s() {
        return Companion.m99234a();
    }

    /* renamed from: t */
    private final void m99215t(List list) {
        if (this.f94459k.get()) {
            return;
        }
        this.f94459k.compareAndSet(false, true);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(list));
        c0766k.m1819M(list, Integer.valueOf(m99216v()));
    }

    /* renamed from: v */
    private final int m99216v() {
        return ((Number) this.f94453e.getValue()).intValue();
    }

    /* renamed from: w */
    private final byte m99217w(List list, HashMap hashMap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20060c c20060c = (C20060c) it.next();
            if (hashMap.containsKey(Integer.valueOf(c20060c.m104215d()))) {
                C20061d c20061d = (C20061d) hashMap.get(Integer.valueOf(c20060c.m104215d()));
                if (c20061d != null) {
                    return c20061d.m104225d();
                }
                return (byte) 0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: x */
    private final int m99218x() {
        Iterator it = this.f94451c.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((HashMap) it.next()).size();
        }
        return i11;
    }

    /* renamed from: z */
    private final boolean m99219z(boolean z11, List list, HashMap hashMap) {
        if (z11) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!hashMap.containsKey(Integer.valueOf(((C20060c) it.next()).m104215d()))) {
                        return false;
                    }
                }
            }
        } else {
            List list3 = list;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                return false;
            }
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (hashMap.containsKey(Integer.valueOf(((C20060c) it2.next()).m104215d()))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m99220C(boolean z11, boolean z12) {
        synchronized (this) {
            boolean z13 = false;
            if (!z11) {
                if (this.f94449a.get() && (!z12 || this.f94454f)) {
                    return false;
                }
            }
            C24559a.m127933c("[ConversationTag]", "loadDataTagFromDB -> isForceLoad=" + z11 + " mIsLoadedDataOnMem=" + this.f94449a.get() + " needSyncFromServer=" + z12);
            if (z11 || !this.f94449a.get()) {
                this.f94449a.compareAndSet(false, true);
                boolean m99194A = m99194A();
                boolean m99195B = m99195B();
                if (m99194A || m99195B) {
                    z13 = true;
                }
                m99202L();
            }
            if (z12) {
                m99209g();
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return z13;
        }
    }

    /* renamed from: H */
    public final void m99221H(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        AbstractC19074t.m100208f(jSONObject, "jsonData");
        C24559a.m127933c("[ConversationTag]", "onReceivedNotificationUpdateDataChatTag -> " + jSONObject);
        if (jSONObject.optBoolean("forceResync", false)) {
            m99227o();
            return;
        }
        int optInt = jSONObject.optInt("oldVersion", 0);
        int optInt2 = jSONObject.optInt("version", 0);
        if (optInt == m99216v()) {
            List m104221b = C20060c.Companion.m104221b(jSONObject.optJSONArray("removedTagIds"));
            C19446a.a aVar = C19446a.Companion;
            aVar.m101717a().m101712r(m104221b);
            aVar.m101717a().m101714t(m104221b);
            JSONArray optJSONArray = jSONObject.optJSONArray("addedTags");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = optJSONArray.get(i11);
                    if (obj instanceof JSONObject) {
                        jSONObject3 = (JSONObject) obj;
                    } else {
                        jSONObject3 = null;
                    }
                    if (jSONObject3 != null) {
                        C20060c m104220a = C20060c.Companion.m104220a(jSONObject3);
                        arrayList2.add(m104220a);
                        JSONArray optJSONArray2 = jSONObject3.optJSONArray("conversations");
                        if (optJSONArray2 != null) {
                            AbstractC19074t.m100205c(optJSONArray2);
                            arrayList.addAll(m99200I(m104220a.m104215d(), optJSONArray2));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C19446a.Companion.m101717a().m101708F(arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    C19446a.Companion.m101717a().m101707E(arrayList);
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("changedTags");
            if (optJSONArray3 != null) {
                AbstractC19074t.m100205c(optJSONArray3);
                arrayList2.clear();
                arrayList.clear();
                ArrayList arrayList3 = new ArrayList();
                int length2 = optJSONArray3.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    Object obj2 = optJSONArray3.get(i12);
                    if (obj2 instanceof JSONObject) {
                        jSONObject2 = (JSONObject) obj2;
                    } else {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        C20060c m104220a2 = C20060c.Companion.m104220a(jSONObject2);
                        arrayList2.add(m104220a2);
                        JSONArray optJSONArray4 = jSONObject2.optJSONArray("addedConvs");
                        if (optJSONArray4 != null) {
                            AbstractC19074t.m100205c(optJSONArray4);
                            arrayList.addAll(m99200I(m104220a2.m104215d(), optJSONArray4));
                        }
                        JSONArray optJSONArray5 = jSONObject2.optJSONArray("removedConvs");
                        if (optJSONArray5 != null) {
                            AbstractC19074t.m100205c(optJSONArray5);
                            arrayList3.addAll(m99200I(m104220a2.m104215d(), optJSONArray5));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C19446a.Companion.m101717a().m101708F(arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    C19446a.Companion.m101717a().m101707E(arrayList);
                }
                if (!arrayList3.isEmpty()) {
                    C19446a.Companion.m101717a().m101713s(arrayList3);
                }
            }
            m99203M(optInt2);
            m99196D(this, true, false, 2, null);
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124116d(8100, new Object[0]);
            bVar.m124119a().m124116d(36, new Object[0]);
            C24559a.m127933c("[ConversationTag]", "update data from notification done -> notify refresh UI");
            return;
        }
        m99227o();
    }

    /* renamed from: K */
    public final void m99222K(boolean z11) {
        this.f94454f = z11;
    }

    /* renamed from: f */
    public final void m99223f(List list) {
        AbstractC19074t.m100208f(list, "listTag");
        this.f94456h.addAll(list);
    }

    /* renamed from: h */
    public final void m99224h() {
        this.f94456h.clear();
    }

    /* renamed from: i */
    public final void m99225i() {
        m99199G(this, false, false, 2, null);
        f94448l.reset();
    }

    /* renamed from: m */
    public final List m99226m(List list, boolean z11, boolean z12) {
        List m131177E0;
        int m131504l;
        HashMap hashMap;
        AbstractC19074t.m100208f(list, "listMsgItemInfo");
        AbstractC19074t.m100207e(this.f94456h, "mCurrentListTagFilter");
        if (!r0.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            boolean m99182f = C18932a.f94442a.m99182f();
            HashMap hashMap2 = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18451m c18451m = (C18451m) it.next();
                hashMap2.put(c18451m.mo97719a(), c18451m);
            }
            synchronized (hashMap2) {
                try {
                    for (String str : this.f94451c.keySet()) {
                        if (!C21927m.m114302u().m114345m(str) && (hashMap = (HashMap) this.f94451c.get(str)) != null) {
                            C18451m c18451m2 = (C18451m) hashMap2.get(str);
                            if (c18451m2 != null) {
                                if (c18451m2.f92990a != 43) {
                                    List list2 = this.f94456h;
                                    AbstractC19074t.m100207e(list2, "mCurrentListTagFilter");
                                    if (m99219z(z11, list2, hashMap)) {
                                        arrayList.add(c18451m2);
                                    }
                                }
                            } else {
                                C7860a m40303b = C7860a.Companion.m40303b();
                                AbstractC19074t.m100205c(str);
                                boolean m40280X = m40303b.m40280X(str);
                                List list3 = this.f94456h;
                                AbstractC19074t.m100207e(list3, "mCurrentListTagFilter");
                                if (m99219z(z11, list3, hashMap) && (!m99182f || z12 != m40280X)) {
                                    List list4 = this.f94456h;
                                    AbstractC19074t.m100207e(list4, "mCurrentListTagFilter");
                                    C18451m m99212l = m99212l(str, m99217w(list4, hashMap));
                                    if (m99212l != null) {
                                        arrayList.add(m99212l);
                                    }
                                }
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C18451m) it2.next()).f92993d = false;
            }
            m131177E0 = AbstractC25332a0.m131177E0(arrayList, this.f94458j);
            if (!m131177E0.isEmpty()) {
                m131504l = AbstractC25368s.m131504l(m131177E0);
                ((C18451m) m131177E0.get(m131504l)).f92993d = true;
            }
            return m131177E0;
        }
        return list;
    }

    /* renamed from: o */
    public final void m99227o() {
        this.f94454f = false;
        m99209g();
    }

    /* renamed from: p */
    public final List m99228p(String str) {
        List m131177E0;
        AbstractC19074t.m100208f(str, "threadId");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = (HashMap) this.f94451c.get(str);
        if (hashMap != null) {
            Set keySet = hashMap.keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                C20060c c20060c = (C20060c) this.f94450b.get((Integer) it.next());
                if (c20060c != null) {
                    arrayList.add(c20060c);
                }
            }
        }
        m131177E0 = AbstractC25332a0.m131177E0(arrayList, this.f94457i);
        return m131177E0;
    }

    /* renamed from: q */
    public final List m99229q() {
        List m131177E0;
        ArrayList arrayList = new ArrayList();
        m131177E0 = AbstractC25332a0.m131177E0(this.f94450b.values(), this.f94457i);
        arrayList.addAll(m131177E0);
        if (arrayList.isEmpty() && AbstractC0924m0.m3270N1() > 0 && m99216v() <= 0) {
            arrayList.addAll(C18932a.f94442a.m99180d().m104196c());
        }
        return arrayList;
    }

    /* renamed from: r */
    public final List m99230r() {
        List m131177E0;
        List list = this.f94456h;
        AbstractC19074t.m100207e(list, "mCurrentListTagFilter");
        m131177E0 = AbstractC25332a0.m131177E0(list, this.f94457i);
        return m131177E0;
    }

    /* renamed from: u */
    public final AtomicBoolean m99231u() {
        return this.f94449a;
    }

    /* renamed from: y */
    public final boolean m99232y() {
        if (C18932a.f94442a.m99184h()) {
            AbstractC19074t.m100207e(this.f94456h, "mCurrentListTagFilter");
            if (!r0.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private C18935d() {
        this.f94449a = new AtomicBoolean(false);
        this.f94450b = Collections.synchronizedMap(new LinkedHashMap());
        this.f94451c = Collections.synchronizedMap(new LinkedHashMap());
        C19446a m120565B = AbstractC23306f.m120565B();
        AbstractC19074t.m100207e(m120565B, "provideChatTagDatabaseHelper(...)");
        this.f94452d = m120565B;
        this.f94453e = AbstractC29233h.m145990a(c.f94461q);
        this.f94455g = Collections.synchronizedList(new ArrayList());
        this.f94456h = Collections.synchronizedList(new ArrayList());
        this.f94457i = new Comparator() { // from class: fh.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m99211k;
                m99211k = C18935d.m99211k((C20060c) obj, (C20060c) obj2);
                return m99211k;
            }
        };
        this.f94458j = new Comparator() { // from class: fh.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m99210j;
                m99210j = C18935d.m99210j((C18451m) obj, (C18451m) obj2);
                return m99210j;
            }
        };
        this.f94459k = new AtomicBoolean(false);
    }
}
