package com.zing.zalo.p062db;

import am.AbstractC0924m0;
import android.content.Context;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.zadb.ZdbExtend;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gm.C19500k;
import gm.C19503n;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ln0.AbstractC22543l;
import me0.AbstractC23008a2;
import me0.AbstractC23138m0;
import p173fz.C19172a;
import p392oh.AbstractC24262i;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29239n;
import p620wt.InterfaceC29232g;
import ph.C24751d;
import ph.C24753f;
import ph.C24756i;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: com.zing.zalo.db.c */
/* loaded from: classes3.dex */
public final class C7958c {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC29232g f43224e = AbstractC29233h.m145990a(a.f43229q);

    /* renamed from: a */
    private final Context f43225a;

    /* renamed from: b */
    private final String f43226b;

    /* renamed from: c */
    private ZdbExtend f43227c;

    /* renamed from: d */
    private int f43228d;

    /* renamed from: com.zing.zalo.db.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43229q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C7958c mo12V4() {
            Context m35500c = MainApplication.Companion.m35500c();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            return new C7958c(m35500c, str);
        }
    }

    /* renamed from: com.zing.zalo.db.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m41592a() {
            try {
                if (C7958c.f43224e.mo9375b()) {
                    m41593b().m41577d();
                    C7958c.f43224e.reset();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("DatabaseReaction").mo104552e(e11);
            }
        }

        /* renamed from: b */
        public final C7958c m41593b() {
            return (C7958c) C7958c.f43224e.getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0012, B:5:0x001a, B:9:0x002d, B:11:0x0036, B:15:0x0040, B:18:0x0052, B:21:0x005d, B:23:0x008b, B:24:0x0096, B:28:0x0093), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0012, B:5:0x001a, B:9:0x002d, B:11:0x0036, B:15:0x0040, B:18:0x0052, B:21:0x005d, B:23:0x008b, B:24:0x0096, B:28:0x0093), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7958c(Context context, String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "currentUid");
        this.f43225a = context;
        this.f43226b = str;
        try {
            int m146002a = AbstractC29239n.m146002a(str, 0);
            this.f43228d = m146002a;
            if (m146002a != 0) {
                File databasePath = context.getDatabasePath("zalo");
                String parent = databasePath.getParent();
                String str2 = parent == null ? "" : parent;
                if (C7960e.m41971c6().f43256u && !AbstractC0924m0.m4287vd()) {
                    z11 = false;
                    int m100600k = C19172a.m100600k("react_db@log_level", 2);
                    if (C19172a.m100600k("react_db@renew_on_corrupt", 0) <= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (C19172a.m100600k("react_db@recover_corrupt", 0) <= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    int m100600k2 = C19172a.m100600k("react_db@recover_threshold", 0);
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DatabaseReaction Init DB Extended: Start migrate = ");
                    sb2.append(!z11);
                    aVar.mo104559s(sb2.toString(), new Object[0]);
                    ZdbExtend zdbExtend = new ZdbExtend(this.f43228d, str2, z11, z12, z13, m100600k2);
                    zdbExtend.m42804i(m100600k, true);
                    if (z11) {
                        zdbExtend.m42806k(databasePath.getAbsolutePath());
                    } else {
                        zdbExtend.m42805j();
                    }
                    this.f43227c = zdbExtend;
                }
                z11 = true;
                int m100600k3 = C19172a.m100600k("react_db@log_level", 2);
                if (C19172a.m100600k("react_db@renew_on_corrupt", 0) <= 0) {
                }
                if (C19172a.m100600k("react_db@recover_corrupt", 0) <= 0) {
                }
                int m100600k22 = C19172a.m100600k("react_db@recover_threshold", 0);
                AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("DatabaseReaction Init DB Extended: Start migrate = ");
                sb22.append(!z11);
                aVar2.mo104559s(sb22.toString(), new Object[0]);
                ZdbExtend zdbExtend2 = new ZdbExtend(this.f43228d, str2, z11, z12, z13, m100600k22);
                zdbExtend2.m42804i(m100600k3, true);
                if (z11) {
                }
                this.f43227c = zdbExtend2;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseReaction").mo104552e(e11);
        }
    }

    /* renamed from: c */
    private final synchronized boolean m41576c() {
        if (!m41581o()) {
            if (AbstractC23138m0.Companion.m118777d()) {
                Companion.m41592a();
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void m41577d() {
        try {
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null) {
                zdbExtend.m42803h();
            }
            this.f43227c = null;
            this.f43228d = 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseReaction").mo104552e(e11);
        }
    }

    /* renamed from: e */
    private final List m41578e(C19503n c19503n, Map map) {
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        int m101955d = c19503n.m101955d();
        for (int i11 = 0; i11 < m101955d; i11++) {
            C19500k m101954c = c19503n.m101954c(i11);
            MessageId messageId = (MessageId) map.get(m41580m(m101954c.f96820b));
            if (messageId != null) {
                Object obj = hashMap.get(messageId);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(messageId, obj);
                }
                AbstractC24262i.a aVar = AbstractC24262i.Companion;
                AbstractC19074t.m100205c(m101954c);
                ((ArrayList) obj).add(aVar.m126660b(m101954c));
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(new C24751d((MessageId) entry.getKey(), (ArrayList) entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static /* synthetic */ List m41579k(C7958c c7958c, String str, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return c7958c.m41586j(str, list, z11);
    }

    /* renamed from: m */
    private final String m41580m(long j11) {
        return String.valueOf(j11);
    }

    /* renamed from: o */
    private final boolean m41581o() {
        ZdbExtend zdbExtend;
        if (this.f43227c != null && AbstractC19074t.m100204b(this.f43226b, CoreUtility.f89233i) && (zdbExtend = this.f43227c) != null && zdbExtend.m42800e() == this.f43228d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m41582f(String str, List list) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listMsgId");
        System.currentTimeMillis();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            boolean m132079d = AbstractC25495a.m132079d(str);
            int m132090o = AbstractC25495a.m132090o(str);
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null) {
                zdbExtend.m42796a(m132090o, m132079d, AbstractC23008a2.m117948q(list), zdbApiCode);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final void m41583g(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        System.currentTimeMillis();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            boolean m132079d = AbstractC25495a.m132079d(str);
            int m132090o = AbstractC25495a.m132090o(str);
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null) {
                zdbExtend.m42799d(m132090o, m132079d, zdbApiCode);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final void m41584h(String str, int i11, List list) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listMsgId");
        System.currentTimeMillis();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            boolean m132079d = AbstractC25495a.m132079d(str);
            int m132090o = AbstractC25495a.m132090o(str);
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null) {
                zdbExtend.m42798c(m132090o, m132079d, AbstractC23008a2.m117945n(list, i11, ""), zdbApiCode);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    public final void m41585i(String str, C24753f c24753f, List list) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(c24753f, "reactionMsgType");
        AbstractC19074t.m100208f(list, "listMsgId");
        System.currentTimeMillis();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            boolean m132079d = AbstractC25495a.m132079d(str);
            int m132090o = AbstractC25495a.m132090o(str);
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null) {
                zdbExtend.m42797b(m132090o, m132079d, AbstractC23008a2.m117945n(list, c24753f.m128601n(), c24753f.m128595h()), zdbApiCode);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public final List m41586j(String str, List list, boolean z11) {
        C19503n m42802g;
        int m131511r;
        int m131400e;
        int m116580c;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listMsgId");
        System.currentTimeMillis();
        if (!m41576c()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            boolean m132079d = AbstractC25495a.m132079d(str);
            int m132090o = AbstractC25495a.m132090o(str);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null && (m42802g = zdbExtend.m42802g(m132090o, m132079d, AbstractC23008a2.m117948q(list), z11, zdbApiCode)) != null) {
                List list2 = list;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                m131400e = AbstractC25361o0.m131400e(m131511r);
                m116580c = AbstractC22543l.m116580c(m131400e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
                for (Object obj : list2) {
                    linkedHashMap.put(m41580m(((MessageId) obj).m41045i()), obj);
                }
                arrayList.addAll(m41578e(m42802g, linkedHashMap));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return arrayList;
    }

    /* renamed from: l */
    public final C24751d m41587l(String str, MessageId messageId) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "messageId");
        System.currentTimeMillis();
        Object obj = null;
        if (m41576c()) {
            try {
                m131500h = AbstractC25368s.m131500h(messageId);
                List m41579k = m41579k(this, str, m131500h, false, 4, null);
                if (!m41579k.isEmpty()) {
                    obj = m41579k.get(0);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return (C24751d) obj;
        }
        return null;
    }

    /* renamed from: n */
    public final List m41588n(List list) {
        long[] jArr;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(list, "listReactionMsgInfo");
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String m41048l = ((C24751d) obj).m128568l().m41048l();
                Object obj2 = linkedHashMap.get(m41048l);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m41048l, obj2);
                }
                ((List) obj2).add(obj);
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ZdbApiCode zdbApiCode = new ZdbApiCode();
                C19503n c19503n = new C19503n();
                int i12 = 0;
                boolean z12 = false;
                for (C24751d c24751d : (Iterable) entry.getValue()) {
                    z12 = c24751d.m128568l().m41057x();
                    int m41049m = c24751d.m128568l().m41049m();
                    Iterator it2 = c24751d.m128565g().iterator();
                    while (it2.hasNext()) {
                        c19503n.m101952a(AbstractC24262i.Companion.m126659a(c24751d.m128568l(), (C24753f) it2.next()));
                    }
                    i12 = m41049m;
                }
                ZdbExtend zdbExtend = this.f43227c;
                if (zdbExtend != null) {
                    jArr = zdbExtend.m42801f(i12, z12, c19503n, zdbApiCode);
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    int length = jArr.length;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < length) {
                        long j11 = jArr[i13];
                        int i15 = i14 + 1;
                        C19500k m101954c = c19503n.m101954c(i14);
                        int i16 = (int) j11;
                        int i17 = m101954c.f96822d;
                        if (m101954c.f96823e > 0) {
                            i11 = length;
                            z11 = true;
                        } else {
                            i11 = length;
                            z11 = false;
                        }
                        long j12 = m101954c.f96820b;
                        int i18 = m101954c.f96821c;
                        Iterator it3 = it;
                        int i19 = m101954c.f96824f;
                        C24753f.b bVar = C24753f.Companion;
                        long[] jArr2 = jArr;
                        String str = m101954c.f96825g;
                        AbstractC19074t.m100207e(str, "icon");
                        int m128620g = bVar.m128620g(str);
                        String str2 = m101954c.f96825g;
                        AbstractC19074t.m100207e(str2, "icon");
                        arrayList.add(new C24756i(i16, i17, z11, j12, i18, i19, m128620g, str2));
                        i13++;
                        length = i11;
                        i14 = i15;
                        it = it3;
                        jArr = jArr2;
                    }
                }
                it = it;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return arrayList;
    }

    /* renamed from: p */
    public final void m41589p() {
        try {
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null) {
                zdbExtend.m42805j();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseReaction").mo104552e(e11);
        }
    }

    /* renamed from: q */
    public final List m41590q(String str, List list) {
        ZdbApiCode zdbApiCode;
        boolean m132079d;
        int m132090o;
        C19503n c19503n;
        boolean z11;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listReactionMsgInfo");
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zdbApiCode = new ZdbApiCode();
            m132079d = AbstractC25495a.m132079d(str);
            m132090o = AbstractC25495a.m132090o(str);
            c19503n = new C19503n();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C24751d c24751d = (C24751d) it.next();
                Iterator it2 = c24751d.m128565g().iterator();
                while (it2.hasNext()) {
                    c19503n.m101952a(AbstractC24262i.Companion.m126659a(c24751d.m128568l(), (C24753f) it2.next()));
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            ZdbExtend zdbExtend = this.f43227c;
            if (zdbExtend != null && zdbExtend.m42807l(m132090o, m132079d, c19503n, zdbApiCode) == 0) {
                int m101955d = c19503n.m101955d();
                for (int i11 = 0; i11 < m101955d; i11++) {
                    C19500k m101954c = c19503n.m101954c(i11);
                    int i12 = m101954c.f96822d;
                    if (m101954c.f96823e > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j11 = m101954c.f96820b;
                    int i13 = m101954c.f96821c;
                    int i14 = m101954c.f96824f;
                    C24753f.b bVar = C24753f.Companion;
                    String str2 = m101954c.f96825g;
                    AbstractC19074t.m100207e(str2, "icon");
                    int m128620g = bVar.m128620g(str2);
                    String str3 = m101954c.f96825g;
                    AbstractC19074t.m100207e(str3, "icon");
                    arrayList.add(new C24756i(0, i12, z11, j11, i13, i14, m128620g, str3));
                }
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.f98889a.mo104552e(e);
            return arrayList;
        }
        return arrayList;
    }
}
