package p365nk;

import b90.C2665b;
import ci.C3526u;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kw.C21956b;
import mw.AbstractC23463h;
import p056cj.C3554v;
import p246iw.C20843c0;
import p395ok.C24283b;
import p395ok.InterfaceC24282a;
import pk.C24797a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25370t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: nk.a */
/* loaded from: classes3.dex */
public final class C23805a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f115050c;

    /* renamed from: a */
    private final InterfaceC24282a f115051a;

    /* renamed from: b */
    private final ConcurrentHashMap f115052b;

    /* renamed from: nk.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f115053q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23805a mo12V4() {
            return c.f115054a.m124390a();
        }
    }

    /* renamed from: nk.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23805a m124389a() {
            return (C23805a) C23805a.f115050c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nk.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f115054a = new c();

        /* renamed from: b */
        private static final C23805a f115055b = new C23805a(new C24283b());

        private c() {
        }

        /* renamed from: a */
        public final C23805a m124390a() {
            return f115055b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nk.a$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: p */
        public static final d f115056p = new d("MODE_MEDIA", 0);

        /* renamed from: q */
        public static final d f115057q = new d("MODE_MY_CLOUD_GRID_VIEW", 1);

        /* renamed from: r */
        public static final d f115058r = new d("MODE_TEXT_ONLY", 2);

        /* renamed from: s */
        public static final d f115059s = new d("MODE_FILE", 3);

        /* renamed from: t */
        public static final d f115060t = new d("MODE_LINK", 4);

        /* renamed from: u */
        private static final /* synthetic */ d[] f115061u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f115062v;

        static {
            d[] m124391b = m124391b();
            f115061u = m124391b;
            f115062v = AbstractC30166b.m148796a(m124391b);
        }

        private d(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m124391b() {
            return new d[]{f115056p, f115057q, f115058r, f115059s, f115060t};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f115061u.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nk.a$e */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: p */
        public static final e f115063p = new e("MODE_FULL", 0);

        /* renamed from: q */
        public static final e f115064q = new e("MODE_COLLECTION_DETAIL", 1);

        /* renamed from: r */
        private static final /* synthetic */ e[] f115065r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f115066s;

        static {
            e[] m124392b = m124392b();
            f115065r = m124392b;
            f115066s = AbstractC30166b.m148796a(m124392b);
        }

        private e(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m124392b() {
            return new e[]{f115063p, f115064q};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f115065r.clone();
        }
    }

    /* renamed from: nk.a$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f115067a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f115068b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f115063p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f115064q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f115067a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.f115057q.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.f115058r.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.f115056p.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.f115059s.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[d.f115060t.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f115068b = iArr2;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f115053q);
        f115050c = m129210a;
    }

    public C23805a(InterfaceC24282a interfaceC24282a) {
        AbstractC19074t.m100208f(interfaceC24282a, "localDataSource");
        this.f115051a = interfaceC24282a;
        this.f115052b = new ConcurrentHashMap();
    }

    /* renamed from: i */
    public static final C23805a m124375i() {
        return Companion.m124389a();
    }

    /* renamed from: l */
    public static /* synthetic */ C24797a m124376l(C23805a c23805a, e eVar, d dVar, int i11, int i12, long j11, int i13, Object obj) {
        int i14;
        int i15;
        if ((i13 & 4) != 0) {
            i14 = 0;
        } else {
            i14 = i11;
        }
        if ((i13 & 8) != 0) {
            i15 = 100;
        } else {
            i15 = i12;
        }
        if ((i13 & 16) != 0) {
            j11 = 0;
        }
        return c23805a.m124387k(eVar, dVar, i14, i15, j11);
    }

    /* renamed from: m */
    private final C24797a m124377m(d dVar, long j11) {
        int m131511r;
        int i11 = f.f115068b[dVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            i12 = 4;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    i12 = 2;
                }
            }
        } else {
            i12 = 0;
        }
        C20843c0.a aVar = C20843c0.Companion;
        boolean m109083n1 = aVar.m109092a().m109083n1();
        String m109057K0 = aVar.m109092a().m109057K0();
        ArrayList m109090w0 = aVar.m109092a().m109090w0(j11, i12);
        m131511r = AbstractC25370t.m131511r(m109090w0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m109090w0.iterator();
        while (it.hasNext()) {
            MyCloudMessageItem myCloudMessageItem = new MyCloudMessageItem((C17945a0) it.next());
            if (m109083n1) {
                Pattern compile = Pattern.compile(m109057K0, 2);
                AbstractC19074t.m100205c(compile);
                myCloudMessageItem.m71042z(compile);
            }
            arrayList.add(myCloudMessageItem);
        }
        return new C24797a(m109090w0.size(), arrayList);
    }

    /* renamed from: n */
    private final C24797a m124378n(d dVar, int i11, int i12) {
        int m131511r;
        List mo126791b = this.f115051a.mo126791b("204278670", dVar, i11, i12);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo126791b) {
            if (!((C17945a0) obj).m94890F7()) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new MyCloudMessageItem((C17945a0) it.next()));
        }
        return new C24797a(mo126791b.size(), arrayList2);
    }

    /* renamed from: b */
    public final void m124379b(MyCloudMessageItem myCloudMessageItem) {
        AbstractC19074t.m100208f(myCloudMessageItem, "myCloudMsgItem");
        ConcurrentHashMap concurrentHashMap = this.f115052b;
        MessageId m95029V3 = myCloudMessageItem.m71033m().m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        concurrentHashMap.put(m95029V3, myCloudMessageItem);
    }

    /* renamed from: c */
    public final void m124380c() {
        C21956b.m114656f("SMLMyCloudDataRepository", "clearAllMemCache()", null, 4, null);
        m124381d();
    }

    /* renamed from: d */
    public final void m124381d() {
        this.f115052b.clear();
    }

    /* renamed from: e */
    public final void m124382e() {
    }

    /* renamed from: f */
    public final LinkedHashMap m124383f(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(arrayList, "msgIdList");
        return this.f115051a.mo126792c(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a7 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m124384g(C2665b c2665b, List list, d dVar, boolean z11, int i11) {
        String[] strArr;
        ArrayList arrayList;
        int m131511r;
        int m131511r2;
        int m131511r3;
        int m131511r4;
        int m131511r5;
        AbstractC19074t.m100208f(c2665b, "data");
        AbstractC19074t.m100208f(list, "searchResults");
        AbstractC19074t.m100208f(dVar, "modeMessage");
        if (z11) {
            c2665b.m13091j();
            c2665b.m13087f().m109115e();
            int i12 = f.f115068b[dVar.ordinal()];
            if (i12 == 1) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC23463h.m123189q((C3554v) obj)) {
                        arrayList2.add(obj);
                    }
                }
                m131511r = AbstractC25370t.m131511r(arrayList2, 10);
                arrayList = new ArrayList(m131511r);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3554v) it.next()).m18061c());
                }
            } else if (i12 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (AbstractC23463h.m123191s((C3554v) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                m131511r2 = AbstractC25370t.m131511r(arrayList3, 10);
                arrayList = new ArrayList(m131511r2);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C3554v) it2.next()).m18061c());
                }
            } else if (i12 == 3) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (AbstractC23463h.m123187o((C3554v) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                m131511r3 = AbstractC25370t.m131511r(arrayList4, 10);
                arrayList = new ArrayList(m131511r3);
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C3554v) it3.next()).m18061c());
                }
            } else if (i12 == 4) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list) {
                    if (AbstractC23463h.m123183k((C3554v) obj4)) {
                        arrayList5.add(obj4);
                    }
                }
                m131511r4 = AbstractC25370t.m131511r(arrayList5, 10);
                arrayList = new ArrayList(m131511r4);
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((C3554v) it4.next()).m18061c());
                }
            } else if (i12 == 5) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list) {
                    if (AbstractC23463h.m123185m((C3554v) obj5)) {
                        arrayList6.add(obj5);
                    }
                }
                m131511r5 = AbstractC25370t.m131511r(arrayList6, 10);
                arrayList = new ArrayList(m131511r5);
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    arrayList.add(((C3554v) it5.next()).m18061c());
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            c2665b.m13087f().m109113c().addAll(arrayList);
        }
        try {
            Iterator it6 = c2665b.m13087f().m109111a(i11, dVar).iterator();
            while (it6.hasNext()) {
                MyCloudMessageItem m13082a = c2665b.m13082a((C17945a0) it6.next());
                C3526u.a aVar = C3526u.Companion;
                ArrayList arrayList7 = ((C3554v) list.get(0)).f15021j;
                if (arrayList7 != null) {
                    strArr = (String[]) arrayList7.toArray(new String[0]);
                    if (strArr == null) {
                    }
                    Pattern compile = Pattern.compile(aVar.m17866b(strArr), 2);
                    if (m13082a == null) {
                        AbstractC19074t.m100205c(compile);
                        m13082a.m71042z(compile);
                    }
                }
                strArr = new String[0];
                Pattern compile2 = Pattern.compile(aVar.m17866b(strArr), 2);
                if (m13082a == null) {
                }
            }
        } catch (Exception e11) {
            C21956b.m114652b(e11);
        }
        c2665b.m13092k(c2665b.m13087f().m109112b());
    }

    /* renamed from: h */
    public final MyCloudMessageItem m124385h(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        return (MyCloudMessageItem) this.f115052b.get(messageId);
    }

    /* renamed from: j */
    public final Map m124386j() {
        return this.f115051a.mo126790a();
    }

    /* renamed from: k */
    public final C24797a m124387k(e eVar, d dVar, int i11, int i12, long j11) {
        C24797a m124378n;
        AbstractC19074t.m100208f(eVar, "viewMode");
        AbstractC19074t.m100208f(dVar, "modeMessage");
        int i13 = f.f115067a[eVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                m124378n = m124377m(dVar, j11);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            m124378n = m124378n(dVar, i11, i12);
        }
        C21956b.m114656f("SMLMyCloudDataRepository", "loadMessages(" + eVar + ", " + dVar + ", " + i11 + ", " + i12 + "): Loaded " + m124378n.m128811b() + " msg(s)", null, 4, null);
        return m124378n;
    }
}
