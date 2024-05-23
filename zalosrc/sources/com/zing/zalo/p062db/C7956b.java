package com.zing.zalo.p062db;

import ag0.C0810d;
import ag0.C0833n0;
import am.AbstractC0939u;
import android.os.SystemClock;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p062db.zadb.Zadb;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17958e1;
import dj.C17969i0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gm.C19490a;
import gm.C19491b;
import gm.C19493d;
import gm.C19494e;
import gm.C19496g;
import gm.C19497h;
import gm.C19498i;
import gm.C19499j;
import gm.C19505p;
import gm.C19506q;
import gw.AbstractC19646n0;
import hm.AbstractC20093c;
import hm.C20092b;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import ln0.C22537f;
import me0.AbstractC23008a2;
import me0.AbstractC23138m0;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.InterfaceC3534b;
import p128ed.C18390e;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p392oh.C24261h;
import p392oh.C24265l;
import p461qu.AbstractC25495a;
import p585vs.C28609a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31897e4;
import p716zh.C32037n9;
import pm0.AbstractC24866w;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import sm0.AbstractC26327c;
import tj.C26710b;
import vi.C28255a;

/* renamed from: com.zing.zalo.db.b */
/* loaded from: classes3.dex */
public final class C7956b {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC29232g f43215c = AbstractC29233h.m145990a(a.f43218q);

    /* renamed from: a */
    private boolean f43216a;

    /* renamed from: b */
    private String f43217b;

    /* renamed from: com.zing.zalo.db.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43218q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C7956b mo12V4() {
            return new C7956b(null);
        }
    }

    /* renamed from: com.zing.zalo.db.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final C7956b m41571c() {
            return (C7956b) C7956b.f43215c.getValue();
        }

        /* renamed from: a */
        public final void m41572a() {
            try {
                if (C7956b.f43215c.mo9375b()) {
                    C7956b.f43215c.reset();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
            }
        }

        /* renamed from: b */
        public final C7956b m41573b() {
            C7956b m41571c = m41571c();
            m41571c.m41491h();
            return m41571c;
        }
    }

    /* renamed from: com.zing.zalo.db.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f43219a;

        /* renamed from: b */
        final /* synthetic */ String f43220b;

        c(String str, String str2) {
            this.f43219a = str;
            this.f43220b = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41686B0(this.f43219a, this.f43220b);
        }
    }

    /* renamed from: com.zing.zalo.db.b$d */
    /* loaded from: classes3.dex */
    public static final class d implements Comparator {

        /* renamed from: p */
        final /* synthetic */ List f43221p;

        public d(List list) {
            this.f43221p = list;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C17945a0) this.f43221p.get(((Number) obj).intValue())).m94974P4()), Long.valueOf(((C17945a0) this.f43221p.get(((Number) obj2).intValue())).m94974P4()));
            return m135478b;
        }
    }

    /* renamed from: com.zing.zalo.db.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f43222a;

        e(C17945a0 c17945a0) {
            this.f43222a = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41683A0(this.f43222a.m95029V3().m41048l(), this.f43222a.m95029V3().m41045i());
        }
    }

    public /* synthetic */ C7956b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: B */
    public static final C7956b m41474B() {
        return Companion.m41573b();
    }

    /* renamed from: B0 */
    public static final void m41475B0(C7956b c7956b, C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c7956b, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        AbstractC19074t.m100208f(str, "$filePath");
        c7956b.m41569z0(c17945a0, str);
    }

    /* renamed from: E */
    private final List m41476E(String str, int i11, boolean z11) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19499j c19499j = new C19499j();
            C19499j.a aVar = new C19499j.a();
            aVar.f96817a = "TimeStamp";
            if (z11) {
                str2 = "ASC";
            } else {
                str2 = "DESC";
            }
            aVar.f96818b = str2;
            c19499j.m101946a(aVar);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), new C19494e(), new C19494e(), c19499j, Integer.MIN_VALUE, i11, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getLastMessages->getChatContentAPI", str, "limit=" + i11, "fromFirst=" + z11);
            int m101929d = m42783n.m101929d();
            for (int i12 = 0; i12 < m101929d; i12++) {
                C19490a m101928c = m42783n.m101928c(i12);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                arrayList.add(AbstractC20093c.m104486a(m101928c, false));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            AbstractC20887g.m109232j(str3, 16061, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return arrayList;
    }

    /* renamed from: F */
    static /* synthetic */ List m41477F(C7956b c7956b, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return c7956b.m41476E(str, i11, z11);
    }

    /* renamed from: H0 */
    public static final void m41478H0(C17945a0 c17945a0, int i11, int i12, String str) {
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        AbstractC19074t.m100208f(str, "$relativePath");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C20092b c20092b = C20092b.f98828a;
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        C19490a m104481h = c20092b.m104481h(Integer.parseInt(m94862C4), c17945a0.m94886F3(), c17945a0.m94847A6());
        m104481h.f96735u.f96753a = str;
        if (i11 != -1) {
            m104481h.f96716b = (byte) i11;
        }
        if (i12 != -1) {
            m104481h.f96717c = (byte) i12;
        }
        C19494e c19494e = new C19494e();
        if (m95029V3.m41052p()) {
            C19494e.a aVar = new C19494e.a();
            aVar.f96799a = "CliMsgId";
            aVar.f96801c = (byte) 3;
            aVar.f96800b = m95029V3.m41045i();
            c19494e.m101935a(aVar);
            String m94862C42 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
            if (m94862C42.length() > 0) {
                C19494e.a aVar2 = new C19494e.a();
                aVar2.f96799a = "SenderId";
                aVar2.f96801c = (byte) 3;
                String m94862C43 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C43, "getSenderUid(...)");
                aVar2.f96800b = Long.parseLong(m94862C43);
                c19494e.m101935a(aVar2);
            }
        }
        C19494e c19494e2 = new C19494e();
        if (m95029V3.m41053q()) {
            C19494e.a aVar3 = new C19494e.a();
            aVar3.f96799a = "GlbMsgId";
            aVar3.f96801c = (byte) 3;
            aVar3.f96800b = m95029V3.m41047k();
            c19494e2.m101935a(aVar3);
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        Zadb.f43387k.m42762I(m104481h, c19494e, c19494e2, zdbApiCode);
        C7967l.d dVar = C7967l.Companion;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        dVar.m42751f(zdbApiCode, "updateMsgStatusAndLocalPathQueueDbTask->updateChatMsgAPI", mo95039W2, c17945a0.m95029V3().toString(), String.valueOf(i11), String.valueOf(i12), str);
    }

    /* renamed from: I */
    private final long m41479I(int i11, boolean z11, long j11, long j12) {
        String str;
        if (!m41493j0()) {
            return -2147483648L;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        int m42774d = Zadb.f43387k.m42774d(i11, z11, j12, (int) j11, zdbApiCode);
        String[] strArr = new String[3];
        if (z11) {
            str = "group_";
        } else {
            str = "";
        }
        strArr[0] = str + i11;
        strArr[1] = "rowId=" + j11;
        strArr[2] = "ts=" + j12;
        AbstractC23008a2.m117942k(zdbApiCode, "countTotalMsgLessThanAPI", strArr);
        if (m42774d < 0) {
            return -2147483648L;
        }
        return m42774d;
    }

    /* renamed from: L0 */
    public static final void m41480L0(C7956b c7956b, C17945a0 c17945a0, C17969i0 c17969i0) {
        AbstractC19074t.m100208f(c7956b, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        c7956b.m41513J0(c17945a0, c17969i0);
    }

    /* renamed from: P */
    public static /* synthetic */ C19491b m41481P(C7956b c7956b, String str, long j11, long j12, int i11, long j13, int i12, Object obj) {
        long j14;
        if ((i12 & 16) != 0) {
            j14 = -1;
        } else {
            j14 = j13;
        }
        return c7956b.m41521O(str, j11, j12, i11, j14);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m41482Q0(C7956b c7956b, String str, List list, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = -1;
        }
        if ((i13 & 8) != 0) {
            i12 = -1;
        }
        c7956b.m41523P0(str, list, i11, i12);
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m41489f0(C7956b c7956b, C17945a0 c17945a0, C26710b c26710b, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c26710b = null;
        }
        return c7956b.m41539e0(c17945a0, c26710b);
    }

    /* renamed from: g0 */
    private final void m41490g0(String str, C17945a0 c17945a0, boolean z11) {
        if (!m41493j0()) {
            return;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        c17945a0.m95137fb(Zadb.f43387k.m42793x(AbstractC20093c.m104488c(c17945a0, str), z11, zdbApiCode));
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC23008a2.m117942k(zdbApiCode, "insertChatContentAPI", mo95039W2, c17945a0.m95029V3().toString());
        if (!AbstractC23008a2.m117941j(zdbApiCode) && c17945a0.m95303y4() != 2147483647L) {
            c17945a0.m95137fb(-2147483648L);
        }
    }

    /* renamed from: h */
    public final synchronized void m41491h() {
        if (!m41493j0() && AbstractC23138m0.Companion.m118777d()) {
            C7967l.d dVar = C7967l.Companion;
            dVar.m42748b().m42730E();
            String valueOf = String.valueOf(dVar.m42749c());
            this.f43217b = valueOf;
            this.f43216a = AbstractC19074t.m100204b(valueOf, CoreUtility.f89233i);
        }
    }

    /* renamed from: i0 */
    private final List m41492i0(List list, String str, InterfaceC3534b interfaceC3534b) {
        boolean z11;
        Object m131207g0;
        String str2;
        ArrayList arrayList = new ArrayList(list.size());
        if (!m41493j0()) {
            return arrayList;
        }
        if (list.isEmpty()) {
            return arrayList;
        }
        if (!AbstractC19074t.m100204b(interfaceC3534b, InterfaceC3534b.b.f14895a) && !AbstractC19074t.m100204b(interfaceC3534b, InterfaceC3534b.a.f14894a) && !AbstractC19074t.m100204b(interfaceC3534b, InterfaceC3534b.g.f14899a)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (list.size() == 1) {
            m41490g0(str, (C17945a0) list.get(0), z11);
            arrayList.add(Long.valueOf(((C17945a0) list.get(0)).m95303y4()));
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            C19491b c19491b = new C19491b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c19491b.m101926a(AbstractC20093c.m104488c((C17945a0) it.next(), str));
            }
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19506q m42794y = Zadb.f43387k.m42794y(c19491b, z11, zdbApiCode);
            int m101963c = m42794y.m101963c();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < m101963c; i13++) {
                Long l11 = m42794y.m101962b(i13).f96841b;
                arrayList.add(l11);
                if (l11 != null && l11.longValue() == -2147483648L) {
                    i11++;
                } else if (l11 != null && l11.longValue() == 2147483647L) {
                    i12++;
                }
            }
            if (zdbApiCode.error_code != 0) {
                m131207g0 = AbstractC25332a0.m131207g0(list, 0);
                C17945a0 c17945a0 = (C17945a0) m131207g0;
                if (c17945a0 == null || (str2 = c17945a0.mo95039W2()) == null) {
                    str2 = "";
                }
                String str3 = "[entry:" + interfaceC3534b + "][threadId:" + str2 + "][error:" + zdbApiCode.error_code + "][countInvalidRowId:" + i11 + "][countDuplicatedRowId:" + i12 + "]";
                C7967l.Companion.m42751f(zdbApiCode, "insertChatContentsSameThreadInternal", str2, "", str3);
                AbstractC20887g.m109242t(124660, str3, currentTimeMillis, System.currentTimeMillis());
            }
        }
        return arrayList;
    }

    /* renamed from: j0 */
    private final boolean m41493j0() {
        if (this.f43216a && this.f43217b.length() > 0 && AbstractC19074t.m100204b(this.f43217b, CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    public static /* synthetic */ List m41494l0(C7956b c7956b, String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        return c7956b.m41545k0(str, i11, i12, z11);
    }

    /* renamed from: m0 */
    private final C17945a0 m41495m0(int i11, boolean z11, MessageId messageId) {
        String str;
        C19491b c19491b;
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        Zadb zadb = Zadb.f43387k;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        C19491b m42782m = zadb.m42782m(i11, z11, Integer.parseInt(str2), AbstractC23008a2.m117947p(messageId), zdbApiCode);
        String[] strArr = new String[2];
        if (z11) {
            str = "group_";
        } else {
            str = "";
        }
        strArr[0] = str + i11;
        strArr[1] = messageId.toString();
        AbstractC23008a2.m117942k(zdbApiCode, "queryDataChatContent->getChatContentAPI", strArr);
        if (m42782m.m101929d() > 0) {
            c19491b = m42782m;
        } else {
            c19491b = null;
        }
        if (c19491b == null) {
            return null;
        }
        C19490a m101928c = m42782m.m101928c(0);
        AbstractC19074t.m100207e(m101928c, "get(...)");
        return AbstractC20093c.m104486a(m101928c, false);
    }

    /* renamed from: p0 */
    private final ZdbApiCode m41496p0(C19493d c19493d, MessageId messageId, String str) {
        if (!m41493j0()) {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            zdbApiCode.error_code = 7;
            return zdbApiCode;
        }
        ZdbApiCode zdbApiCode2 = new ZdbApiCode();
        Zadb.f43387k.m42766M(messageId.m41049m(), messageId.m41057x(), Integer.parseInt(str), c19493d, AbstractC23008a2.m117947p(messageId), zdbApiCode2);
        return zdbApiCode2;
    }

    /* renamed from: t0 */
    private final ZdbApiCode m41497t0(C19493d c19493d, String str, List list) {
        if (!m41493j0()) {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            zdbApiCode.error_code = 7;
            return zdbApiCode;
        }
        int m132090o = AbstractC25495a.m132090o(str);
        boolean m132079d = AbstractC25495a.m132079d(str);
        ZdbApiCode zdbApiCode2 = new ZdbApiCode();
        Zadb zadb = Zadb.f43387k;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        zadb.m42766M(m132090o, m132079d, Integer.parseInt(str2), c19493d, AbstractC23008a2.m117948q(list), zdbApiCode2);
        return zdbApiCode2;
    }

    /* renamed from: u0 */
    private final ZdbApiCode m41498u0(C19490a c19490a, MessageId messageId) {
        if (!m41493j0()) {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            zdbApiCode.error_code = 7;
            return zdbApiCode;
        }
        C19494e c19494e = new C19494e();
        if (messageId.m41052p()) {
            C19494e.a aVar = new C19494e.a();
            aVar.f96799a = "CliMsgId";
            aVar.f96801c = (byte) 3;
            aVar.f96800b = messageId.m41045i();
            c19494e.m101935a(aVar);
        }
        if (messageId.m41055u()) {
            C19494e.a aVar2 = new C19494e.a();
            aVar2.f96799a = "SenderId";
            aVar2.f96801c = (byte) 3;
            aVar2.f96800b = messageId.m41051o();
            c19494e.m101935a(aVar2);
        }
        C19494e c19494e2 = new C19494e();
        if (messageId.m41053q()) {
            C19494e.a aVar3 = new C19494e.a();
            aVar3.f96799a = "GlbMsgId";
            aVar3.f96801c = (byte) 3;
            aVar3.f96800b = messageId.m41047k();
            c19494e2.m101935a(aVar3);
        }
        ZdbApiCode zdbApiCode2 = new ZdbApiCode();
        Zadb.f43387k.m42761H(messageId.m41049m(), messageId.m41057x(), Integer.parseInt(this.f43217b), c19490a, c19494e, c19494e2, zdbApiCode2);
        return zdbApiCode2;
    }

    /* renamed from: x0 */
    public static final void m41499x0(C7956b c7956b, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c7956b, "this$0");
        c7956b.m41562v0(c17945a0);
    }

    /* renamed from: A */
    public final long m41500A(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (!m41493j0()) {
            return -2147483648L;
        }
        if (str.length() == 0 || j11 <= 0) {
            return 0L;
        }
        long m41479I = m41479I(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), -2147483648L, j11);
        if (m41479I <= 0) {
            return 0L;
        }
        return m41479I;
    }

    /* renamed from: A0 */
    public final void m41501A0(C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "filePath");
        if (!m41493j0()) {
            return;
        }
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC18428c.m97659b(C23288a.f113033a, mo95039W2, 0, new Runnable() { // from class: am.c

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f3377q;

            /* renamed from: r */
            public final /* synthetic */ String f3378r;

            public /* synthetic */ RunnableC0902c(C17945a0 c17945a02, String str2) {
                r2 = c17945a02;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7956b.m41475B0(C7956b.this, r2, r3);
            }
        }, 2, null);
    }

    /* renamed from: C */
    public final List m41502C(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m132090o = AbstractC25495a.m132090o(str);
            boolean m132079d = AbstractC25495a.m132079d(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C19491b m42784o = zadb.m42784o(m132090o, m132079d, Integer.parseInt(str2), AbstractC23306f.m120579F1().mo124314i(), zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getExpiredMessages->getExpireChatsAPI", str);
            int m101929d = m42784o.m101929d();
            while (true) {
                m101929d--;
                if (-1 >= m101929d) {
                    break;
                }
                C19490a m101928c = m42784o.m101928c(m101929d);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                arrayList.add(AbstractC20093c.m104486a(m101928c, false));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public final void m41503C0(String str, List list, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str2, "path");
        if (!m41493j0()) {
            return;
        }
        try {
            C19493d c19493d = new C19493d();
            c19493d.f96795a = "LocalPath";
            c19493d.f96797c = (byte) 1;
            c19493d.f96796b = "";
            AbstractC23008a2.m117942k(m41497t0(c19493d, str, AbstractC23008a2.m117949r(list)), "updateLocalPathOfMessage -> updateChatMsgAPI", str, str2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
    }

    /* renamed from: D */
    public final List m41504D(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        return m41477F(this, str, i11, false, 4, null);
    }

    /* renamed from: D0 */
    public final void m41505D0(C17945a0 c17945a0, String str) {
        String str2;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "currentUid");
        if (!m41493j0()) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C19490a m104481h = C20092b.f98828a.m104481h(m95029V3.m41051o(), m95029V3.m41049m(), m95029V3.m41057x());
            m104481h.f96720f = c17945a0.m95041W4();
            m104481h.f96726l = c17945a0.m95019U3();
            C31897e4 m95184l3 = c17945a0.m95184l3();
            if (m95184l3 != null) {
                JSONObject m153260A = m95184l3.m153260A();
                if (m153260A != null) {
                    str2 = m153260A.toString();
                    if (str2 == null) {
                    }
                    m104481h.f96727m = str2;
                    ZdbApiCode m41498u0 = m41498u0(m104481h, m95029V3);
                    String mo95039W2 = c17945a0.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    AbstractC23008a2.m117942k(m41498u0, "UpdateMessageE2eeFailAgain -> updateChatMsgAPI ", mo95039W2, c17945a0.m95029V3().toString());
                }
            }
            str2 = "";
            m104481h.f96727m = str2;
            ZdbApiCode m41498u02 = m41498u0(m104481h, m95029V3);
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            AbstractC23008a2.m117942k(m41498u02, "UpdateMessageE2eeFailAgain -> updateChatMsgAPI ", mo95039W22, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41506E0(MessageId messageId, boolean z11, C17958e1 c17958e1) {
        Vector vector;
        int i11;
        AbstractC19074t.m100208f(messageId, "messageId");
        if (!m41493j0()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C7961f.Companion.m42658b().m42644G(messageId);
            C20092b c20092b = C20092b.f98828a;
            C19490a m104481h = c20092b.m104481h(messageId.m41051o(), messageId.m41049m(), messageId.m41057x());
            m104481h.f96726l = "";
            m104481h.f96735u.f96753a = "";
            if (c17958e1 != null) {
                vector = c20092b.m104477d(c17958e1);
                if (vector == null) {
                }
                m104481h.f96732r = vector;
                if (!z11) {
                    i11 = 33;
                } else {
                    i11 = 36;
                }
                m104481h.f96720f = i11;
                AbstractC23008a2.m117942k(m41498u0(m104481h, messageId), "updateMessageUndo->updateChatMsgAPI: " + messageId, new String[0]);
            }
            vector = new Vector();
            m104481h.f96732r = vector;
            if (!z11) {
            }
            m104481h.f96720f = i11;
            AbstractC23008a2.m117942k(m41498u0(m104481h, messageId), "updateMessageUndo->updateChatMsgAPI: " + messageId, new String[0]);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16058, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: F0 */
    public final void m41507F0(C17945a0 c17945a0) {
        long j11;
        int i11;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m41493j0()) {
            return;
        }
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19497h c19497h = new C19497h();
            c19497h.f96813b = c17945a0.m95029V3().m41045i();
            if (c17945a0.m95029V3().m41053q()) {
                j11 = c17945a0.m95029V3().m41047k();
            } else {
                j11 = -1;
            }
            c19497h.f96812a = j11;
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            if (m94862C4.length() > 0) {
                String m94862C42 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                i11 = Integer.parseInt(m94862C42);
            } else {
                i11 = -1;
            }
            c19497h.f96814c = i11;
            Zadb zadb = Zadb.f43387k;
            int m94886F3 = c17945a0.m94886F3();
            boolean m94847A6 = c17945a0.m94847A6();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            int parseInt = Integer.parseInt(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            zadb.m42768O(m94886F3, m94847A6, parseInt, AbstractC20093c.m104488c(c17945a0, str2).f96731q, c19497h, zdbApiCode);
            C7967l.d dVar = C7967l.Companion;
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            dVar.m42751f(zdbApiCode, "updateMsgProperties->updatePropertyAPI", mo95039W2, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
    }

    /* renamed from: G */
    public final long m41508G(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (!m41493j0()) {
            return -2147483648L;
        }
        int m94886F3 = c17945a0.m94886F3();
        boolean m94847A6 = c17945a0.m94847A6();
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C17945a0 m41495m0 = m41495m0(m94886F3, m94847A6, m95029V3);
        if (m41495m0 == null) {
            return -2147483648L;
        }
        return m41479I(m41495m0.m94886F3(), m41495m0.m94847A6(), m41495m0.m95303y4(), m41495m0.m94974P4());
    }

    /* renamed from: G0 */
    public final void m41509G0(C17945a0 c17945a0, int i11, int i12, String str) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "relativePath");
        if (!m41493j0()) {
            return;
        }
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC18428c.m97659b(C23288a.f113033a, mo95039W2, 0, new Runnable() { // from class: am.e

            /* renamed from: q */
            public final /* synthetic */ int f3394q;

            /* renamed from: r */
            public final /* synthetic */ int f3395r;

            /* renamed from: s */
            public final /* synthetic */ String f3396s;

            public /* synthetic */ RunnableC0907e(int i112, int i122, String str2) {
                r2 = i112;
                r3 = i122;
                r4 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7956b.m41478H0(C17945a0.this, r2, r3, r4);
            }
        }, 2, null);
    }

    /* renamed from: H */
    public final long m41510H(MessageId messageId) {
        C17945a0 m41495m0;
        AbstractC19074t.m100208f(messageId, "messageId");
        if (!m41493j0() || (m41495m0 = m41495m0(messageId.m41049m(), messageId.m41057x(), messageId)) == null) {
            return -2147483648L;
        }
        return m41479I(m41495m0.m94886F3(), m41495m0.m94847A6(), m41495m0.m95303y4(), m41495m0.m94974P4());
    }

    /* renamed from: I0 */
    public final void m41511I0(C17945a0 c17945a0) {
        long j11;
        int i11;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m41493j0()) {
            return;
        }
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19497h c19497h = new C19497h();
            c19497h.f96813b = c17945a0.m95029V3().m41045i();
            if (c17945a0.m95029V3().m41053q()) {
                j11 = c17945a0.m95029V3().m41047k();
            } else {
                j11 = -1;
            }
            c19497h.f96812a = j11;
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            if (m94862C4.length() > 0) {
                String m94862C42 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                i11 = Integer.parseInt(m94862C42);
            } else {
                i11 = -1;
            }
            c19497h.f96814c = i11;
            Zadb zadb = Zadb.f43387k;
            int m94886F3 = c17945a0.m94886F3();
            boolean m94847A6 = c17945a0.m94847A6();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            int parseInt = Integer.parseInt(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            zadb.m42769P(m94886F3, m94847A6, parseInt, AbstractC20093c.m104488c(c17945a0, str2).f96733s, c19497h, zdbApiCode);
            C7967l.d dVar = C7967l.Companion;
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            dVar.m42751f(zdbApiCode, "updateReplyChatContent->updateQuoteAPI", mo95039W2, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: J */
    public final List m41512J(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        return m41476E(str, i11, false);
    }

    /* renamed from: J0 */
    public final void m41513J0(C17945a0 c17945a0, C17969i0 c17969i0) {
        long j11;
        int parseInt;
        Vector vector;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m41493j0()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19497h c19497h = new C19497h();
            c19497h.f96813b = c17945a0.m95029V3().m41045i();
            if (c17945a0.m95029V3().m41053q()) {
                j11 = c17945a0.m95029V3().m41047k();
            } else {
                j11 = -1;
            }
            c19497h.f96812a = j11;
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            if (m94862C4.length() == 0) {
                parseInt = -1;
            } else {
                String m94862C42 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                parseInt = Integer.parseInt(m94862C42);
            }
            c19497h.f96814c = parseInt;
            Zadb zadb = Zadb.f43387k;
            int m94886F3 = c17945a0.m94886F3();
            boolean m94847A6 = c17945a0.m94847A6();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            int parseInt2 = Integer.parseInt(str);
            if (c17969i0 != null) {
                vector = C20092b.f98828a.m104477d(c17969i0);
                if (vector == null) {
                }
                zadb.m42760G(m94886F3, m94847A6, parseInt2, vector, c17945a0.m95041W4(), c19497h, zdbApiCode);
                C7967l.d dVar = C7967l.Companion;
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                dVar.m42751f(zdbApiCode, "updateRichMessageChatContent->updateChatAttachAPI", mo95039W2, c17945a0.m95029V3().toString());
            }
            vector = new Vector();
            zadb.m42760G(m94886F3, m94847A6, parseInt2, vector, c17945a0.m95041W4(), c19497h, zdbApiCode);
            C7967l.d dVar2 = C7967l.Companion;
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            dVar2.m42751f(zdbApiCode, "updateRichMessageChatContent->updateChatAttachAPI", mo95039W22, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16051, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: K */
    public final C28609a m41514K(String str) {
        long j11;
        long j12;
        boolean z11;
        AbstractC19074t.m100208f(str, "threadId");
        if (!m41493j0()) {
            return new C28609a(str, 0L, 0L);
        }
        C28609a c28609a = new C28609a(str, 0L, 0L);
        try {
            C19499j.a aVar = new C19499j.a();
            aVar.f96817a = "GlbMsgId";
            aVar.f96818b = "DESC";
            C19499j c19499j = new C19499j();
            c19499j.m101946a(aVar);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), new C19494e(), new C19494e(), c19499j, 0, 1, zdbApiCode);
            C7967l.d dVar = C7967l.Companion;
            dVar.m42751f(zdbApiCode, "getLastMsgIdFromChatDatabase(globalId)", str);
            if (m42783n != null && m42783n.m101929d() > 0) {
                j11 = m42783n.m101928c(0).f96721g;
            } else {
                j11 = 0;
            }
            aVar.f96817a = "CliMsgId";
            ZdbApiCode zdbApiCode2 = new ZdbApiCode();
            C19491b m42783n2 = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), new C19494e(), new C19494e(), c19499j, 0, 1, zdbApiCode2);
            dVar.m42751f(zdbApiCode2, "getLastMsgIdFromChatDatabase(clientId)", str);
            if (m42783n2 != null && m42783n2.m101929d() > 0) {
                j12 = m42783n2.m101928c(0).f96723i;
            } else {
                j12 = 0;
            }
            if (j11 <= 0 && j12 <= 0) {
                z11 = false;
                return new C28609a(str, j11, j12, j11, j12, z11);
            }
            z11 = true;
            return new C28609a(str, j11, j12, j11, j12, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            return c28609a;
        }
    }

    /* renamed from: K0 */
    public final void m41515K0(C17945a0 c17945a0, C17969i0 c17969i0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m41493j0()) {
            return;
        }
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC18428c.m97659b(C23288a.f113033a, mo95039W2, 0, new Runnable() { // from class: am.d

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f3384q;

            /* renamed from: r */
            public final /* synthetic */ C17969i0 f3385r;

            public /* synthetic */ RunnableC0905d(C17945a0 c17945a02, C17969i0 c17969i02) {
                r2 = c17945a02;
                r3 = c17969i02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7956b.m41480L0(C7956b.this, r2, r3);
            }
        }, 2, null);
    }

    /* renamed from: L */
    public final C17945a0 m41516L(String str) {
        C19490a m101928c;
        AbstractC19074t.m100208f(str, "conversationId");
        if (!m41493j0()) {
            return null;
        }
        try {
            String str2 = CoreUtility.f89233i;
            C19494e c19494e = new C19494e();
            C19494e.a aVar = new C19494e.a();
            aVar.f96799a = "SenderId";
            aVar.f96801c = (byte) 3;
            AbstractC19074t.m100205c(str2);
            aVar.f96800b = Long.parseLong(str2);
            c19494e.m101935a(aVar);
            C19499j c19499j = new C19499j();
            C19499j.a aVar2 = new C19499j.a();
            aVar2.f96817a = "TimeStamp";
            aVar2.f96818b = "DESC";
            c19499j.m101946a(aVar2);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), c19494e, new C19494e(), c19499j, Integer.MIN_VALUE, 1, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getLastMsgOfMine->getChatContentAPI", str);
            if (m42783n == null) {
                return null;
            }
            if (m42783n.m101929d() <= 0) {
                m42783n = null;
            }
            if (m42783n == null || (m101928c = m42783n.m101928c(0)) == null) {
                return null;
            }
            return AbstractC20093c.m104487b(m101928c, false, 1, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
            return null;
        }
    }

    /* renamed from: M */
    public final C17945a0 m41517M(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (!m41493j0()) {
            return null;
        }
        try {
            C19494e c19494e = new C19494e();
            C19494e.a aVar = new C19494e.a();
            aVar.f96799a = "SenderId";
            aVar.f96801c = (byte) 3;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            aVar.f96800b = Long.parseLong(str2);
            c19494e.m101935a(aVar);
            C19499j c19499j = new C19499j();
            C19499j.a aVar2 = new C19499j.a();
            aVar2.f96817a = "TimeStamp";
            aVar2.f96818b = "DESC";
            c19499j.m101946a(aVar2);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), c19494e, new C19494e(), c19499j, Integer.MIN_VALUE, 1, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getLastOutGoingMsg->getChatContentAPI", str);
            if (m42783n != null && m42783n.m101929d() > 0) {
                C19490a m101928c = m42783n.m101928c(0);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                return AbstractC20093c.m104486a(m101928c, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
        return null;
    }

    /* renamed from: M0 */
    public final void m41518M0() {
        if (!m41493j0()) {
            return;
        }
        Zadb zadb = Zadb.f43387k;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        zadb.m42763J(Integer.parseInt(str), C18390e.m97409p(), new ZdbApiCode());
    }

    /* renamed from: N */
    public final C19491b m41519N(String str, String str2, C19498i c19498i, ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "conversationId");
        AbstractC19074t.m100208f(c19498i, "msgIdentifyVec");
        AbstractC19074t.m100208f(zdbApiCode, "zdbApiCode");
        if (!m41493j0()) {
            return new C19491b();
        }
        C19491b m42782m = Zadb.f43387k.m42782m(Integer.parseInt(AbstractC25495a.m132089n(str2)), AbstractC25495a.m132079d(str2), Integer.parseInt(str), c19498i, zdbApiCode);
        AbstractC19074t.m100207e(m42782m, "getChatContentAPI(...)");
        return m42782m;
    }

    /* renamed from: N0 */
    public final void m41520N0(int i11, boolean z11, C19498i c19498i, int i12, int i13) {
        String str;
        AbstractC19074t.m100208f(c19498i, "msgIdentifyVec");
        if (!m41493j0()) {
            return;
        }
        if (i12 == -1 && i13 == -1) {
            return;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        Zadb zadb = Zadb.f43387k;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        zadb.m42767N(i11, z11, Integer.parseInt(str2), c19498i, (byte) i12, (byte) i13, zdbApiCode);
        C7967l.d dVar = C7967l.Companion;
        String[] strArr = new String[4];
        if (z11) {
            str = "group_";
        } else {
            str = "";
        }
        strArr[0] = str + i11;
        strArr[1] = "msgStatus=" + i12;
        strArr[2] = "downloadStatus=" + i13;
        strArr[3] = "size=" + c19498i.m101944c();
        dVar.m42751f(zdbApiCode, "updateStatusOfListMessages->updateMsgStatusAPI", strArr);
    }

    /* renamed from: O */
    public final C19491b m41521O(String str, long j11, long j12, int i11, long j13) {
        AbstractC19074t.m100208f(str, "ownerId");
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        if (!m41493j0()) {
            zdbApiCode.error_code = 7;
            AbstractC23008a2.m117942k(zdbApiCode, "getMediaForBackupGoogleByThread", str);
            return null;
        }
        C19499j c19499j = new C19499j();
        C19499j.a aVar = new C19499j.a();
        aVar.f96817a = "rowid";
        aVar.f96818b = "DESC";
        c19499j.m101946a(aVar);
        C19494e.a aVar2 = new C19494e.a();
        aVar2.f96799a = "rowid";
        aVar2.f96801c = (byte) 4;
        aVar2.f96800b = j12;
        C19494e.a aVar3 = new C19494e.a();
        if (j13 > 0) {
            aVar3.f96799a = "TimeStamp";
            aVar3.f96801c = (byte) 6;
            aVar3.f96800b = j13;
        }
        Zadb zadb = Zadb.f43387k;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        C19491b m42785p = zadb.m42785p(Integer.parseInt(str2), Integer.parseInt(AbstractC25495a.m132089n(str)), AbstractC25495a.m132079d(str), new int[]{3, 4}, new int[0], -1, -1, -1, aVar3, j11, aVar2, new C19498i(), i11, c19499j, zdbApiCode);
        AbstractC23008a2.m117942k(zdbApiCode, "getMediaForBackupGoogleByThreadAPI", str, "minTsMediaQuery=" + j11, "maxRowIdMediaQuery=" + j12, "limitCountQuery=" + i11, "maxTsMediaQuery=" + j13);
        return m42785p;
    }

    /* renamed from: O0 */
    public final boolean m41522O0(C17945a0 c17945a0, int i11, int i12, boolean z11) {
        long j11;
        int parseInt;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m41493j0() || !AbstractC23138m0.Companion.m118777d()) {
            return false;
        }
        C19498i c19498i = new C19498i();
        C19497h c19497h = new C19497h();
        c19497h.f96813b = c17945a0.m95029V3().m41045i();
        if (c17945a0.m95029V3().m41053q()) {
            j11 = c17945a0.m95029V3().m41047k();
        } else {
            j11 = -1;
        }
        c19497h.f96812a = j11;
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        if (m94862C4.length() == 0) {
            parseInt = -1;
        } else {
            String m94862C42 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
            parseInt = Integer.parseInt(m94862C42);
        }
        c19497h.f96814c = parseInt;
        c19498i.m101942a(c19497h);
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        Zadb zadb = Zadb.f43387k;
        int m94886F3 = c17945a0.m94886F3();
        boolean m94847A6 = c17945a0.m94847A6();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        zadb.m42767N(m94886F3, m94847A6, Integer.parseInt(str), c19498i, (byte) i11, (byte) i12, zdbApiCode);
        C7967l.d dVar = C7967l.Companion;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        dVar.m42751f(zdbApiCode, "updateStatusOfMessage->updateMsgStatusAPI", mo95039W2, "msgStatus=" + i11, "downloadStatus=" + i12);
        if (AbstractC23008a2.m117941j(zdbApiCode) && z11) {
            C0810d.m2053b(new e(c17945a0));
        }
        return AbstractC23008a2.m117941j(zdbApiCode);
    }

    /* renamed from: P0 */
    public final void m41523P0(String str, List list, int i11, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "msgIdList");
        if (i11 == -1 && i12 == -1) {
            return;
        }
        int m132090o = AbstractC25495a.m132090o(str);
        boolean m132079d = AbstractC25495a.m132079d(str);
        C19498i c19498i = new C19498i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c19498i.m101942a(AbstractC23008a2.m117946o((MessageId) it.next()));
        }
        m41520N0(m132090o, m132079d, c19498i, i11, i12);
    }

    /* renamed from: Q */
    public final List m41524Q(String str, int i11, int i12, long[] jArr) {
        List m131502j;
        List m131502j2;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(jArr, "mediaTypes");
        if (!m41493j0()) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        try {
            C19494e c19494e = new C19494e();
            for (long j11 : jArr) {
                C19494e.a aVar = new C19494e.a();
                aVar.f96799a = "MsgType";
                aVar.f96801c = (byte) 3;
                aVar.f96800b = j11;
                c19494e.m101935a(aVar);
            }
            C19499j c19499j = new C19499j();
            C19499j.a aVar2 = new C19499j.a();
            aVar2.f96817a = "rowid";
            aVar2.f96818b = "ASC";
            c19499j.m101946a(aVar2);
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), new C19494e(), c19494e, c19499j, i11, i12, new ZdbApiCode());
            ArrayList arrayList = new ArrayList();
            int m101929d = m42783n.m101929d();
            for (int i13 = 0; i13 < m101929d; i13++) {
                C19490a m101928c = m42783n.m101928c(i13);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                arrayList.add(AbstractC20093c.m104486a(m101928c, false));
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: R */
    public final List m41525R(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        long[] m102900I0 = AbstractC19646n0.m102900I0();
        AbstractC19074t.m100207e(m102900I0, "getMediaTypeForToolStorage(...)");
        return m41524Q(str, i11, i12, m102900I0);
    }

    /* renamed from: R0 */
    public final void m41526R0(C17945a0 c17945a0, MessageId messageId, int i11, C17969i0 c17969i0) {
        long j11;
        int i12;
        Vector vector;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(messageId, "messageId");
        if (!m41493j0()) {
            return;
        }
        try {
            C19497h c19497h = new C19497h();
            c19497h.f96813b = messageId.m41045i();
            if (messageId.m41053q()) {
                j11 = messageId.m41047k();
            } else {
                j11 = -1;
            }
            c19497h.f96812a = j11;
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            if (m94862C4.length() > 0) {
                String m94862C42 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                i12 = Integer.parseInt(m94862C42);
            } else {
                i12 = -1;
            }
            c19497h.f96814c = i12;
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m94886F3 = c17945a0.m94886F3();
            boolean m94847A6 = c17945a0.m94847A6();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            int parseInt = Integer.parseInt(str);
            if (c17969i0 != null) {
                vector = C20092b.f98828a.m104477d(c17969i0);
                if (vector == null) {
                }
                zadb.m42760G(m94886F3, m94847A6, parseInt, vector, i11, c19497h, zdbApiCode);
                C7967l.d dVar = C7967l.Companion;
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                dVar.m42751f(zdbApiCode, "updateTypeAndAttachmentChatContent->updateChatAttachAPI", mo95039W2, c17945a0.m95029V3().toString(), "msgType=" + i11 + " attach=" + c17969i0);
                C7961f.Companion.m42658b().m42653s(c17945a0, true);
            }
            vector = new Vector();
            zadb.m42760G(m94886F3, m94847A6, parseInt, vector, i11, c19497h, zdbApiCode);
            C7967l.d dVar2 = C7967l.Companion;
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            dVar2.m42751f(zdbApiCode, "updateTypeAndAttachmentChatContent->updateChatAttachAPI", mo95039W22, c17945a0.m95029V3().toString(), "msgType=" + i11 + " attach=" + c17969i0);
            C7961f.Companion.m42658b().m42653s(c17945a0, true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
    }

    /* renamed from: S */
    public final C19496g m41527S(String str, String str2, String str3, ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "conversationId");
        AbstractC19074t.m100208f(str3, "senderUid");
        AbstractC19074t.m100208f(zdbApiCode, "zdbApiCode");
        if (!m41493j0()) {
            return new C19496g();
        }
        C19496g m42787r = Zadb.f43387k.m42787r(Integer.parseInt(AbstractC25495a.m132089n(str2)), AbstractC25495a.m132079d(str2), Integer.parseInt(str), Integer.parseInt(str3), zdbApiCode);
        AbstractC19074t.m100207e(m42787r, "getMediaStatisticAPI(...)");
        return m42787r;
    }

    /* renamed from: T */
    public final C19491b m41528T(String str, String str2, int[] iArr, String str3, long j11, long j12, int i11, int i12, int i13, ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "conversationId");
        AbstractC19074t.m100208f(iArr, "eMediaTypes");
        AbstractC19074t.m100208f(str3, "senderUid");
        AbstractC19074t.m100208f(zdbApiCode, "zdbApiCode");
        if (!m41493j0()) {
            return new C19491b();
        }
        C19491b m42788s = Zadb.f43387k.m42788s(Integer.parseInt(AbstractC25495a.m132089n(str2)), AbstractC25495a.m132079d(str2), Integer.parseInt(str), iArr, Integer.parseInt(str3), j11, j12, i11, i12, i13, zdbApiCode);
        AbstractC19074t.m100207e(m42788s, "getMediaWithTypeAPI(...)");
        return m42788s;
    }

    /* renamed from: U */
    public final MessageId m41529U(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        MessageId m41531W = m41531W(str);
        if (m41531W == null) {
            return MessageId.Companion.m41067h();
        }
        return m41531W;
    }

    /* renamed from: V */
    public final MessageId m41530V(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (!m41493j0()) {
            return null;
        }
        try {
            C19494e c19494e = new C19494e();
            C19494e.a aVar = new C19494e.a();
            aVar.f96799a = "GlbMsgId";
            aVar.f96801c = (byte) 2;
            aVar.f96800b = 0L;
            c19494e.m101935a(aVar);
            C19499j c19499j = new C19499j();
            C19499j.a aVar2 = new C19499j.a();
            aVar2.f96817a = "GlbMsgId";
            aVar2.f96818b = "ASC";
            c19499j.m101946a(aVar2);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), c19494e, new C19494e(), c19499j, 0, 1, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getMinMessageIdHaveGlobalIdOrNull", str);
            if (m42783n != null && m42783n.m101929d() > 0) {
                C19490a m101928c = m42783n.m101928c(0);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                return AbstractC23008a2.m117935d(m101928c);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageId m41531W(String str) {
        C19490a c19490a;
        ZdbApiCode zdbApiCode;
        AbstractC19074t.m100208f(str, "threadId");
        if (!m41493j0()) {
            return null;
        }
        try {
            zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m132090o = AbstractC25495a.m132090o(str);
            boolean m132079d = AbstractC25495a.m132079d(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            c19490a = zadb.m42789t(m132090o, m132079d, Integer.parseInt(str2), true, zdbApiCode);
        } catch (Exception e11) {
            e = e11;
            c19490a = null;
        }
        try {
            C7967l.Companion.m42751f(zdbApiCode, "getMsgWithMinMaxMsgIdAPI", str, "isMin=true");
        } catch (Exception e12) {
            e = e12;
            AbstractC23350e.m122776f("DatabaseChatHelper", e);
            if (c19490a != null) {
            }
        }
        if (c19490a != null) {
            return null;
        }
        return AbstractC23008a2.m117935d(c19490a);
    }

    /* renamed from: X */
    public final C19491b m41532X(int i11, int[] iArr, boolean[] zArr, ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(zdbApiCode, "apiCode");
        if (!m41493j0()) {
            zdbApiCode.error_code = 7;
            AbstractC23008a2.m117942k(zdbApiCode, "getNewestMsgsInAllDB", String.valueOf(i11));
            return null;
        }
        return Zadb.f43387k.m42790u(i11, iArr, zArr, zdbApiCode);
    }

    /* renamed from: Y */
    public final C17945a0 m41533Y(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        C19494e c19494e = new C19494e();
        C19494e.a aVar = new C19494e.a();
        aVar.f96799a = "GlbMsgId";
        aVar.f96801c = (byte) 2;
        aVar.f96800b = j11;
        c19494e.m101935a(aVar);
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), c19494e, new C19494e(), new C19499j(), 0, 1, zdbApiCode);
        C17945a0 c17945a0 = null;
        if (m42783n.m101929d() > 0) {
            C19490a m101928c = m42783n.m101928c(0);
            AbstractC19074t.m100207e(m101928c, "get(...)");
            c17945a0 = AbstractC20093c.m104487b(m101928c, false, 1, null);
        }
        C7967l.Companion.m42751f(zdbApiCode, "getNextNewerMsgOf->getChatContentAPI", str);
        return c17945a0;
    }

    /* renamed from: Z */
    public final Map m41534Z(int i11, long j11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!m41493j0()) {
            return linkedHashMap;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map m41840y1 = C7959d.Companion.m41850e().m41840y1(i11, j11);
        try {
            for (String str : m41840y1.keySet()) {
                C19498i c19498i = (C19498i) m41840y1.get(str);
                if (c19498i != null) {
                    ZdbApiCode zdbApiCode = new ZdbApiCode();
                    Zadb zadb = Zadb.f43387k;
                    int m132090o = AbstractC25495a.m132090o(str);
                    boolean m132079d = AbstractC25495a.m132079d(str);
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    C19491b m42782m = zadb.m42782m(m132090o, m132079d, Integer.parseInt(str2), c19498i, zdbApiCode);
                    C7967l.Companion.m42751f(zdbApiCode, "getSendingChatContents->getChatContentAPI", str, "size=" + c19498i.m101944c());
                    if (m42782m.m101929d() > 0 && zdbApiCode.error_code == 0) {
                        Object obj = linkedHashMap.get(str);
                        if (obj == null) {
                            obj = new LinkedList();
                            linkedHashMap.put(str, obj);
                        }
                        List list = (List) obj;
                        int m101929d = m42782m.m101929d();
                        for (int i12 = 0; i12 < m101929d; i12++) {
                            C19490a m101928c = m42782m.m101928c(i12);
                            if (m101928c != null) {
                                if (AbstractC23008a2.m117940i(m101928c)) {
                                    list.add(AbstractC20093c.m104486a(m101928c, false));
                                } else {
                                    C7959d.Companion.m41850e().m41683A0(str, m101928c.f96723i);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            AbstractC20887g.m109232j(str3, 16059, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return linkedHashMap;
    }

    /* renamed from: a0 */
    public final List m41535a0(int i11) {
        Map m41534Z = m41534Z(i11, 0L);
        ArrayList arrayList = new ArrayList();
        Iterator it = m41534Z.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC25378x.m131548x(arrayList, (List) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    /* renamed from: b0 */
    public final List m41536b0(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m132090o = AbstractC25495a.m132090o(str);
            boolean m132079d = AbstractC25495a.m132079d(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C19491b m42780k = zadb.m42780k(m132090o, m132079d, Integer.parseInt(str2), i12, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getSuccessfulCallChatContents->getAllCallSuccessAPI", str, "fromIndex=" + i11, "limit=" + i12);
            int m101929d = m42780k.m101929d();
            for (int i13 = 0; i13 < m101929d; i13++) {
                C19490a m101928c = m42780k.m101928c(i13);
                if (m101928c != null) {
                    arrayList.add(0, AbstractC20093c.m104486a(m101928c, false));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public final int m41537c0(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        C19494e c19494e = new C19494e();
        C19494e.a aVar = new C19494e.a();
        aVar.f96799a = "GlbMsgId";
        aVar.f96801c = (byte) 2;
        aVar.f96800b = j11;
        c19494e.m101935a(aVar);
        C19494e.a aVar2 = new C19494e.a();
        aVar2.f96799a = "SenderId";
        aVar2.f96801c = (byte) 7;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        aVar2.f96800b = Long.parseLong(str2);
        c19494e.m101935a(aVar2);
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        Zadb zadb = Zadb.f43387k;
        int m132090o = AbstractC25495a.m132090o(str);
        boolean m132079d = AbstractC25495a.m132079d(str);
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str3, "currentUserUid");
        int m42776f = zadb.m42776f(m132090o, m132079d, Integer.parseInt(str3), c19494e, zdbApiCode);
        C7967l.Companion.m42751f(zdbApiCode, "getTotalNewerMsgCountUnreadOf->countUnreadMsgAPI", str);
        return m42776f;
    }

    /* renamed from: d0 */
    public final int m41538d0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        return m41489f0(this, c17945a0, null, 2, null);
    }

    /* renamed from: e0 */
    public final int m41539e0(C17945a0 c17945a0, C26710b c26710b) {
        List m131496e;
        List list;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (m41493j0()) {
            m131496e = AbstractC25366r.m131496e(c17945a0);
            InterfaceC3534b.f fVar = InterfaceC3534b.f.f14898a;
            if (c26710b != null) {
                list = AbstractC25366r.m131496e(c26710b);
            } else {
                list = null;
            }
            if (!(!m41541h0(m131496e, fVar, list).isEmpty())) {
                return -1;
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: g */
    public final String m41540g(int i11, int[] iArr, boolean[] zArr, String str, String str2, String str3, int i12, long j11, float f11, float f12, long j12, long j13, ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(zdbApiCode, "apiCode");
        if (!m41493j0()) {
            zdbApiCode.error_code = 7;
            return "";
        }
        String m42771a = Zadb.f43387k.m42771a(i11, iArr, zArr, str, str2, str3, i12, j11, f11, f12, j12, j13, zdbApiCode);
        if (m42771a == null) {
            return "";
        }
        return m42771a;
    }

    /* renamed from: h0 */
    public final List m41541h0(List list, InterfaceC3534b interfaceC3534b, List list2) {
        C22537f m131503k;
        List m131177E0;
        ArrayList arrayList;
        List list3;
        C26710b c26710b;
        Object m131207g0;
        C26710b c26710b2;
        Object m131207g02;
        List list4 = list;
        AbstractC19074t.m100208f(list4, "chatContents");
        AbstractC19074t.m100208f(interfaceC3534b, "entry");
        LinkedList linkedList = new LinkedList();
        if (!m41493j0()) {
            return linkedList;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        String str = CoreUtility.f89233i;
        try {
            m131503k = AbstractC25368s.m131503k(list4);
            m131177E0 = AbstractC25332a0.m131177E0(m131503k, new d(list4));
            ArrayList arrayList2 = new ArrayList(list.size());
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
            } else {
                arrayList = null;
            }
            Iterator it = m131177E0.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                C17945a0 c17945a0 = (C17945a0) list4.get(intValue);
                if (list2 != null) {
                    m131207g02 = AbstractC25332a0.m131207g0(list2, intValue);
                    c26710b2 = (C26710b) m131207g02;
                } else {
                    c26710b2 = null;
                }
                if (interfaceC3534b instanceof InterfaceC3534b.d) {
                    C32037n9 c32037n9 = C32037n9.f147516a;
                    String mo95039W2 = c17945a0.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    long m154558r = c32037n9.m154558r(mo95039W2);
                    if (m154558r > 0 && c17945a0.m95269u7() && c17945a0.m95030V4() == 0) {
                        long m94974P4 = c17945a0.m94974P4();
                        String mo95039W22 = c17945a0.mo95039W2();
                        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                        if (m94974P4 > c32037n9.m154559s(mo95039W22)) {
                            c17945a0.m95318zb(m154558r);
                        }
                    }
                }
                c17945a0.m94988Q9();
                if (!c17945a0.m95218o7()) {
                    if (c17945a0.m95219o8()) {
                        c17945a0.m94911I1();
                    }
                    arrayList2.add(c17945a0);
                    if (arrayList != null) {
                        arrayList.add(c26710b2);
                    }
                }
                list4 = list;
            }
            if (arrayList2.size() > 0) {
                AbstractC19074t.m100205c(str);
                List m41492i0 = m41492i0(arrayList2, str, interfaceC3534b);
                int size = m41492i0.size();
                int i11 = 0;
                while (i11 < size) {
                    long longValue = ((Number) m41492i0.get(i11)).longValue();
                    if (longValue != -2147483648L && longValue != 2147483647L) {
                        Object obj = arrayList2.get(i11);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        C17945a0 c17945a02 = (C17945a0) obj;
                        if (arrayList != null) {
                            m131207g0 = AbstractC25332a0.m131207g0(arrayList, i11);
                            c26710b = (C26710b) m131207g0;
                        } else {
                            c26710b = null;
                        }
                        linkedList.add(c17945a02);
                        c17945a02.m95137fb(longValue);
                        InterfaceC3534b.a aVar = InterfaceC3534b.a.f14894a;
                        if (!AbstractC19074t.m100204b(interfaceC3534b, aVar)) {
                            C7961f.Companion.m42658b().m42653s(c17945a02, false);
                        }
                        if (c17945a02.m95030V4() > 0) {
                            list3 = m41492i0;
                            C0833n0.m2205h(C0833n0.f2934p, c17945a02, false, 2, null);
                        } else {
                            list3 = m41492i0;
                        }
                        if (c26710b != null && !AbstractC19074t.m100204b(interfaceC3534b, aVar)) {
                            C0876j m120584H0 = AbstractC23306f.m120584H0();
                            String m137328c = c26710b.m137328c();
                            long m41047k = c17945a02.m95029V3().m41047k();
                            String mo95039W23 = c17945a02.mo95039W2();
                            AbstractC19074t.m100207e(mo95039W23, "getOwnerId(...)");
                            m120584H0.m2611M(m137328c, m41047k, mo95039W23, c26710b.m137326a());
                        }
                    } else {
                        list3 = m41492i0;
                    }
                    i11++;
                    m41492i0 = list3;
                }
            }
        } catch (Exception e11) {
            long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16008, e11.toString(), currentThreadTimeMillis2, 16000, CoreUtility.f89236l);
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
        }
        return linkedList;
    }

    /* renamed from: i */
    public final int m41542i(String str, String str2, int[] iArr, String str3, long j11, long j12, ZdbApiCode zdbApiCode) {
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(str2, "conversationId");
        AbstractC19074t.m100208f(iArr, "eMediaTypes");
        AbstractC19074t.m100208f(str3, "senderUid");
        AbstractC19074t.m100208f(zdbApiCode, "zdbApiCode");
        if (!m41493j0()) {
            return 0;
        }
        return Zadb.f43387k.m42772b(Integer.parseInt(AbstractC25495a.m132089n(str2)), AbstractC25495a.m132079d(str2), Integer.parseInt(str), iArr, Integer.parseInt(str3), j11, j12, zdbApiCode);
    }

    /* renamed from: j */
    public final void m41543j(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (!m41493j0()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = CoreUtility.f89233i;
        try {
            if (str.length() != 0 && str2 != null && str2.length() != 0) {
                C7961f.Companion.m42658b().m42647M(str);
                ZdbApiCode zdbApiCode = new ZdbApiCode();
                Zadb.f43387k.m42779i(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), Integer.parseInt(str2), zdbApiCode);
                AbstractC23008a2.m117942k(zdbApiCode, "delMsgAPI", str);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            AbstractC19074t.m100205c(str2);
            AbstractC20887g.m109232j(str2, 16049, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: k */
    public final void m41544k(C17945a0 c17945a0) {
        long j11;
        int parseInt;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m41493j0()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            return;
        }
        try {
            C7961f m42658b = C7961f.Companion.m42658b();
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            m42658b.m42644G(m95029V3);
            MessageId m95029V32 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
            C19497h c19497h = new C19497h();
            c19497h.f96813b = m95029V32.m41045i();
            if (m95029V32.m41053q()) {
                j11 = m95029V32.m41047k();
            } else {
                j11 = -1;
            }
            c19497h.f96812a = j11;
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            if (m94862C4.length() == 0) {
                parseInt = -1;
            } else {
                String m94862C42 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                parseInt = Integer.parseInt(m94862C42);
            }
            c19497h.f96814c = parseInt;
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m94886F3 = c17945a0.m94886F3();
            boolean m94847A6 = c17945a0.m94847A6();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            zadb.m42777g(m94886F3, m94847A6, Integer.parseInt(str2), c19497h, zdbApiCode);
            C7967l.d dVar = C7967l.Companion;
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            dVar.m42751f(zdbApiCode, "deleteChatContent->delMsgAPI", mo95039W2, c17945a0.m95029V3().toString());
            c17945a0.m95069Z1();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            AbstractC20887g.m109232j(str3, 16013, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: k0 */
    public final List m41545k0(String str, int i11, int i12, boolean z11) {
        String str2;
        AbstractC19074t.m100208f(str, "ownerId");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19499j c19499j = new C19499j();
            C19499j.a aVar = new C19499j.a();
            aVar.f96817a = "TimeStamp";
            if (z11) {
                str2 = "DESC";
            } else {
                str2 = "ASC";
            }
            aVar.f96818b = str2;
            c19499j.m101946a(aVar);
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), new C19494e(), new C19494e(), c19499j, i11, i12, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "loadMessages->getChatContentAPI", "fromIndex=" + i11, "loadSize=" + i12, "fromLast=" + z11);
            int m101929d = m42783n.m101929d();
            for (int i13 = 0; i13 < m101929d; i13++) {
                C19490a m101928c = m42783n.m101928c(i13);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                C17945a0 m104486a = AbstractC20093c.m104486a(m101928c, true);
                if (z11) {
                    arrayList.add(0, m104486a);
                } else {
                    arrayList.add(m104486a);
                }
            }
            if (zdbApiCode.error_code == 7) {
                AbstractC20110a.f98889a.mo104552e(new Exception("ZDBAPI_ERR_CONFIG_NOT_SET"));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            AbstractC20887g.m109232j(str3, 16009, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m41546l(String str, String str2, String str3, C19498i c19498i) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "clientMsgIdSet");
        AbstractC19074t.m100208f(str3, "globalMsgIdSet");
        AbstractC19074t.m100208f(c19498i, "msgIdentifyVec");
        if (m41493j0() && str.length() != 0) {
            String str4 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str4, "currentUserUid");
            if (str4.length() == 0 || c19498i.m101944c() == 0) {
                return;
            }
            C7961f.Companion.m42658b().m42646J(str, str2, str3);
            try {
                ZdbApiCode zdbApiCode = new ZdbApiCode();
                Zadb zadb = Zadb.f43387k;
                int m132090o = AbstractC25495a.m132090o(str);
                boolean m132079d = AbstractC25495a.m132079d(str);
                String str5 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str5, "currentUserUid");
                zadb.m42778h(m132090o, m132079d, Integer.parseInt(str5), c19498i, zdbApiCode);
                C7967l.Companion.m42751f(zdbApiCode, "deleteMessages->deleteMsgsAPI", str, "size=" + c19498i.m101944c());
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChat", e11);
            }
            C0810d.m2053b(new c(str, str2));
        }
    }

    /* renamed from: m */
    public final void m41547m(String str, List list) {
        List m131195U;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messageIds");
        if (m41493j0() && !list.isEmpty()) {
            if (list.size() > 100) {
                m131195U = AbstractC25332a0.m131195U(list, 100);
                Iterator it = m131195U.iterator();
                while (it.hasNext()) {
                    m41547m(str, (List) it.next());
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            C19498i c19498i = new C19498i();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MessageId messageId = (MessageId) it2.next();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(messageId.m41044h());
                if (messageId.m41053q()) {
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(messageId.m41046j());
                }
                c19498i.m101942a(AbstractC23008a2.m117946o(messageId));
            }
            String sb4 = sb2.toString();
            AbstractC19074t.m100207e(sb4, "toString(...)");
            String sb5 = sb3.toString();
            AbstractC19074t.m100207e(sb5, "toString(...)");
            m41546l(str, sb4, sb5, c19498i);
        }
    }

    /* renamed from: n */
    public final long m41548n(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (!m41493j0()) {
            return 0L;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        long m42773c = Zadb.f43387k.m42773c(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), zdbApiCode);
        C7967l.Companion.m42751f(zdbApiCode, "fetchMsgCountOfConversation->countTotalMsgAPI", str);
        return m42773c;
    }

    /* renamed from: n0 */
    public final int m41549n0(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (!m41493j0()) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m132090o = AbstractC25495a.m132090o(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            int m42795z = zadb.m42795z(m132090o, Integer.parseInt(str2), zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "queryExistsChat->isStrangerConversationAPI", str);
            if (m42795z != 1) {
                return 2;
            }
            return 1;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            AbstractC20887g.m109232j(str3, 16011, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            return 2;
        }
    }

    /* renamed from: o */
    public final long m41550o(String str, String str2) {
        AbstractC19074t.m100208f(str, "accountUid");
        AbstractC19074t.m100208f(str2, "ownerId");
        if (!m41493j0()) {
            return 0L;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        long m42775e = Zadb.f43387k.m42775e(Integer.parseInt(str), AbstractC25495a.m132090o(str2), AbstractC25495a.m132079d(str2), zdbApiCode);
        C7967l.Companion.m42751f(zdbApiCode, "fetchMsgCountOfConversationOtherAccount->countTotalMsgOfOtherUserAPI", str2);
        return m42775e;
    }

    /* renamed from: o0 */
    public final void m41551o0(int i11, int[] iArr, boolean[] zArr, String str, String str2, String str3, ZdbApiCode zdbApiCode, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(zdbApiCode, "apiCode");
        if (!m41493j0()) {
            zdbApiCode.error_code = 7;
        } else {
            Zadb.f43387k.m42757C(i11, iArr, zArr, str, str2, str3, z12, zdbApiCode, z11);
        }
    }

    /* renamed from: p */
    public final int m41552p() {
        if (!m41493j0()) {
            return 0;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        int m42773c = Zadb.f43387k.m42773c(0, false, zdbApiCode);
        C7967l.Companion.m42751f(zdbApiCode, "fetchMsgCountOfCurrentUser->countTotalMsgAPI", new String[0]);
        return m42773c;
    }

    /* renamed from: q */
    public final C17945a0 m41553q(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        if (!m41493j0() || !messageId.m41059z()) {
            return null;
        }
        return m41495m0(messageId.m41049m(), messageId.m41057x(), messageId);
    }

    /* renamed from: q0 */
    public final void m41554q0(C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "currentUid");
        if (!m41493j0()) {
            return;
        }
        try {
            C19490a m104488c = AbstractC20093c.m104488c(c17945a0, str);
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            ZdbApiCode m41498u0 = m41498u0(m104488c, m95029V3);
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            AbstractC23008a2.m117942k(m41498u0, "updateChatContentData", mo95039W2, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
        }
    }

    /* renamed from: r */
    public final List m41555r(String str, List list) {
        List m131502j;
        List m131502j2;
        List m131502j3;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "msgIdList");
        if (!m41493j0()) {
            m131502j3 = AbstractC25368s.m131502j();
            return m131502j3;
        }
        if (str.length() == 0 || list.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        try {
            ArrayList arrayList = new ArrayList();
            C19498i c19498i = new C19498i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c19498i.m101942a(AbstractC23008a2.m117946o((MessageId) it.next()));
            }
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m132090o = AbstractC25495a.m132090o(str);
            boolean m132079d = AbstractC25495a.m132079d(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C19491b m42782m = zadb.m42782m(m132090o, m132079d, Integer.parseInt(str2), c19498i, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "findMessages->getChatContentAPI", str, "size=" + c19498i.m101944c());
            if (zdbApiCode.error_code == 0 && m42782m != null) {
                int m101929d = m42782m.m101929d();
                for (int i11 = 0; i11 < m101929d; i11++) {
                    C19490a m101928c = m42782m.m101928c(i11);
                    AbstractC19074t.m100207e(m101928c, "get(...)");
                    arrayList.add(AbstractC20093c.m104486a(m101928c, false));
                }
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
    }

    /* renamed from: r0 */
    public final void m41556r0(C17945a0 c17945a0, String str) {
        String str2;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "currentUid");
        try {
            if (str.length() == 0) {
                return;
            }
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C31897e4 m95184l3 = c17945a0.m95184l3();
            if (m95184l3 != null) {
                JSONObject m153260A = m95184l3.m153260A();
                if (m153260A != null) {
                    str2 = m153260A.toString();
                    if (str2 == null) {
                    }
                    C19493d c19493d = new C19493d();
                    c19493d.f96795a = "E2EE";
                    c19493d.f96797c = (byte) 1;
                    c19493d.f96796b = str2;
                    ZdbApiCode m41496p0 = m41496p0(c19493d, m95029V3, str);
                    String mo95039W2 = c17945a0.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    AbstractC23008a2.m117942k(m41496p0, "updateChatContentE2eeMsgInfo -> updateChatMsgAPI", mo95039W2, c17945a0.m95029V3().toString());
                }
            }
            str2 = "";
            C19493d c19493d2 = new C19493d();
            c19493d2.f96795a = "E2EE";
            c19493d2.f96797c = (byte) 1;
            c19493d2.f96796b = str2;
            ZdbApiCode m41496p02 = m41496p0(c19493d2, m95029V3, str);
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            AbstractC23008a2.m117942k(m41496p02, "updateChatContentE2eeMsgInfo -> updateChatMsgAPI", mo95039W22, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseChat").mo104552e(e11);
        }
    }

    /* renamed from: s */
    public final List m41557s(List list) {
        AbstractC19074t.m100208f(list, "messageIds");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 m41553q = m41553q((MessageId) it.next());
            if (m41553q != null) {
                arrayList.add(m41553q);
            }
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public final void m41558s0(String str, MessageId messageId, boolean z11) {
        long j11;
        AbstractC19074t.m100208f(str, "ownerId");
        if (m41493j0() && messageId != null) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            if (str2.length() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                ZdbApiCode zdbApiCode = new ZdbApiCode();
                try {
                    try {
                        C19498i c19498i = new C19498i();
                        C19497h c19497h = new C19497h();
                        c19497h.f96813b = messageId.m41045i();
                        if (messageId.m41053q()) {
                            j11 = messageId.m41047k();
                        } else {
                            j11 = -1;
                        }
                        c19497h.f96812a = j11;
                        c19498i.m101942a(c19497h);
                        Zadb zadb = Zadb.f43387k;
                        int m132090o = AbstractC25495a.m132090o(str);
                        boolean m132079d = AbstractC25495a.m132079d(str);
                        String str3 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str3, "currentUserUid");
                        zadb.m42770Q(m132090o, m132079d, Integer.parseInt(str3), z11, c19498i, zdbApiCode);
                        C7967l.Companion.m42751f(zdbApiCode, "updateChatContentReaction->updateReactionStateAPI", str, messageId.toString());
                        if (!C24265l.Companion.m126709b().m126699o().m128550h()) {
                            return;
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("DatabaseChat", e11);
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        String str4 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str4, "currentUserUid");
                        AbstractC20887g.m109232j(str4, 16051, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                        if (!C24265l.Companion.m126709b().m126699o().m128550h()) {
                            return;
                        }
                    }
                    C24261h.Companion.m126657c(230406011, currentTimeMillis, System.currentTimeMillis(), 1, AbstractC23008a2.m117941j(zdbApiCode));
                } catch (Throwable th2) {
                    if (C24265l.Companion.m126709b().m126699o().m128550h()) {
                        C24261h.Companion.m126657c(230406011, currentTimeMillis, System.currentTimeMillis(), 1, AbstractC23008a2.m117941j(zdbApiCode));
                    }
                    throw th2;
                }
            }
        }
    }

    /* renamed from: t */
    public final List m41559t(String str, List list) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messages");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        try {
            if (str.length() > 0) {
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                if (str2.length() > 0 && (!list.isEmpty())) {
                    C19498i c19498i = new C19498i();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MessageId m95029V3 = ((C17945a0) it.next()).m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        c19498i.m101942a(AbstractC23008a2.m117946o(m95029V3));
                    }
                    ZdbApiCode zdbApiCode = new ZdbApiCode();
                    Zadb zadb = Zadb.f43387k;
                    int m132090o = AbstractC25495a.m132090o(str);
                    boolean m132079d = AbstractC25495a.m132079d(str);
                    String str3 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str3, "currentUserUid");
                    C19491b m42782m = zadb.m42782m(m132090o, m132079d, Integer.parseInt(str3), c19498i, zdbApiCode);
                    C7967l.Companion.m42751f(zdbApiCode, "findOriginalMessagesInConversation->getChatContentAPI", str, "size=" + c19498i.m101944c());
                    if (zdbApiCode.error_code == 0 && m42782m != null) {
                        int m101929d = m42782m.m101929d();
                        for (int i11 = 0; i11 < m101929d; i11++) {
                            C19490a m101928c = m42782m.m101928c(i11);
                            AbstractC19074t.m100207e(m101928c, "get(...)");
                            arrayList.add(AbstractC20093c.m104486a(m101928c, false));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
        return arrayList;
    }

    /* renamed from: u */
    public final List m41560u() {
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        Zadb zadb = Zadb.f43387k;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C19491b m42781l = zadb.m42781l(Integer.parseInt(str), false, zdbApiCode);
        if (zdbApiCode.error_code == 0) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int m101929d = m42781l.m101929d();
            for (int i11 = 0; i11 < m101929d; i11++) {
                try {
                    C19490a m101928c = m42781l.m101928c(i11);
                    AbstractC19074t.m100207e(m101928c, "get(...)");
                    C17945a0 m104486a = AbstractC20093c.m104486a(m101928c, false);
                    String mo95039W2 = m104486a.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    if (!hashSet.contains(mo95039W2)) {
                        if (!hashSet2.contains(mo95039W2)) {
                            if (AbstractC21935u.m114518H(mo95039W2)) {
                                hashSet.add(mo95039W2);
                            } else {
                                hashSet2.add(mo95039W2);
                            }
                        }
                        String str2 = "";
                        String m95090b5 = m104486a.m95090b5();
                        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                        if (m95090b5.length() > 0) {
                            str2 = AbstractC23352g.m122788d(m95090b5);
                            AbstractC19074t.m100207e(str2, "md5(...)");
                        }
                        String m103034u0 = AbstractC19646n0.m103034u0(m104486a.m94983Q3(), m104486a.m95041W4());
                        C28255a.a aVar = C28255a.Companion;
                        AbstractC19074t.m100205c(m103034u0);
                        arrayList.add(aVar.m142285b(m103034u0, m104486a.m94974P4(), str2));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DatabaseChat", e11);
                }
            }
            return arrayList;
        }
        throw new Exception("Get all local media error (" + zdbApiCode.error_code + ")");
    }

    /* renamed from: v */
    public final List m41561v(String str, int i11, int i12) {
        List m131502j;
        List m131502j2;
        AbstractC19074t.m100208f(str, "ownerId");
        if (!m41493j0()) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ArrayList arrayList = new ArrayList();
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            long[] m102897H0 = AbstractC19646n0.m102897H0();
            AbstractC19074t.m100207e(m102897H0, "getMediaMsgTypes(...)");
            C19494e c19494e = new C19494e();
            for (long j11 : m102897H0) {
                C19494e.a aVar = new C19494e.a();
                aVar.f96799a = "MsgType";
                aVar.f96801c = (byte) 3;
                aVar.f96800b = j11;
                c19494e.m101935a(aVar);
            }
            C19499j c19499j = new C19499j();
            C19499j.a aVar2 = new C19499j.a();
            aVar2.f96817a = "rowid";
            aVar2.f96818b = "ASC";
            c19499j.m101946a(aVar2);
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), new C19494e(), c19494e, c19499j, i11, i12, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getAllMediaMessages->getChatContentAPI", str);
            int m101929d = m42783n.m101929d();
            for (int i13 = 0; i13 < m101929d; i13++) {
                C19490a m101928c = m42783n.m101928c(i13);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                arrayList.add(AbstractC20093c.m104486a(m101928c, false));
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16062, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: v0 */
    public final void m41562v0(C17945a0 c17945a0) {
        if (m41493j0() && c17945a0 != null) {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            if (str.length() != 0) {
                try {
                    MessageId m95029V3 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    C19498i m117947p = AbstractC23008a2.m117947p(m95029V3);
                    String m104478e = C20092b.f98828a.m104478e(c17945a0);
                    ZdbApiCode zdbApiCode = new ZdbApiCode();
                    Zadb zadb = Zadb.f43387k;
                    int m41049m = m95029V3.m41049m();
                    boolean m41057x = m95029V3.m41057x();
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    zadb.m42764K(m41049m, m41057x, Integer.parseInt(str2), m104478e, AbstractC23008a2.m117946o(m95029V3), zdbApiCode);
                    C7967l.Companion.m42751f(zdbApiCode, "updateChatContentReaction->updateExtraMsgData", m117947p.toString());
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DatabaseChat", e11);
                }
            }
        }
    }

    /* renamed from: w */
    public final List m41563w(String str, String str2, int i11, int i12) {
        List m131502j;
        List m131502j2;
        AbstractC19074t.m100208f(str, "accountUid");
        AbstractC19074t.m100208f(str2, "ownerId");
        if (!m41493j0()) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        try {
            long[] m102897H0 = AbstractC19646n0.m102897H0();
            AbstractC19074t.m100207e(m102897H0, "getMediaMsgTypes(...)");
            C19491b m42786q = Zadb.f43387k.m42786q(Integer.parseInt(str), AbstractC25495a.m132090o(str2), AbstractC25495a.m132079d(str2), m102897H0, i11, i12, new ZdbApiCode());
            ArrayList arrayList = new ArrayList();
            int m101929d = m42786q.m101929d();
            for (int i13 = 0; i13 < m101929d; i13++) {
                C19490a m101928c = m42786q.m101928c(i13);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                arrayList.add(AbstractC20093c.m104486a(m101928c, false));
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: w0 */
    public final void m41564w0(C17945a0 c17945a0) {
        if (c17945a0 == null || !m41493j0()) {
            return;
        }
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC18428c.m97659b(C23288a.f113033a, mo95039W2, 0, new Runnable() { // from class: am.b

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f3375q;

            public /* synthetic */ RunnableC0899b(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7956b.m41499x0(C7956b.this, r2);
            }
        }, 2, null);
    }

    /* renamed from: x */
    public final List m41565x(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "replyMessageId");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19494e c19494e = new C19494e();
            if (messageId.m41052p()) {
                C19494e.a aVar = new C19494e.a();
                aVar.f96799a = "RefCliMsgId";
                aVar.f96801c = (byte) 3;
                aVar.f96800b = messageId.m41045i();
                c19494e.m101935a(aVar);
            }
            if (messageId.m41053q()) {
                C19494e.a aVar2 = new C19494e.a();
                aVar2.f96799a = "RefCliMsgId";
                aVar2.f96801c = (byte) 3;
                aVar2.f96800b = messageId.m41047k();
                c19494e.m101935a(aVar2);
            }
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            String m41048l = messageId.m41048l();
            C19491b m42783n = Zadb.f43387k.m42783n(AbstractC25495a.m132090o(m41048l), AbstractC25495a.m132079d(m41048l), new C19494e(), c19494e, new C19499j(), Integer.MIN_VALUE, Integer.MAX_VALUE, zdbApiCode);
            C7967l.Companion.m42751f(zdbApiCode, "getAllMsgWithMsgIdReply->getChatContentAPI", m41048l, messageId.toString());
            int m101929d = m42783n.m101929d();
            for (int i11 = 0; i11 < m101929d; i11++) {
                C19490a m101928c = m42783n.m101928c(i11);
                AbstractC19074t.m100207e(m101928c, "get(...)");
                arrayList.add(AbstractC20093c.m104486a(m101928c, false));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16009, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return arrayList;
    }

    /* renamed from: y */
    public final List m41566y(String str, MessageId messageId, boolean z11, int i11, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(messageId, "pivotMsgId");
        ArrayList arrayList = new ArrayList();
        if (!m41493j0()) {
            return arrayList;
        }
        if (messageId.m41059z()) {
            try {
                ZdbApiCode zdbApiCode = new ZdbApiCode();
                Zadb zadb = Zadb.f43387k;
                int m132090o = AbstractC25495a.m132090o(str);
                boolean m132079d = AbstractC25495a.m132079d(str);
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                C19491b m42791v = zadb.m42791v(m132090o, m132079d, Integer.parseInt(str2), messageId.m41045i(), messageId.m41047k(), z11, i11, i12, zdbApiCode);
                C7967l.Companion.m42751f(zdbApiCode, "getAllSentMsgAbove->getSentMsgOlderThanMsgIdAPI", str, messageId.toString(), "skipSendingMessages=" + z11);
                int m101929d = m42791v.m101929d();
                for (int i13 = 0; i13 < m101929d; i13++) {
                    C19490a m101928c = m42791v.m101928c(i13);
                    AbstractC19074t.m100207e(m101928c, "get(...)");
                    arrayList.add(AbstractC20093c.m104486a(m101928c, false));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChat", e11);
            }
        }
        return arrayList;
    }

    /* renamed from: y0 */
    public final void m41567y0(int i11, boolean z11, boolean z12, C19498i c19498i) {
        String str;
        AbstractC19074t.m100208f(c19498i, "msgIdentifyVec");
        if (!m41493j0()) {
            return;
        }
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        if (str2.length() == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        try {
            try {
                Zadb zadb = Zadb.f43387k;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                zadb.m42770Q(i11, z11, Integer.parseInt(str3), z12, c19498i, zdbApiCode);
                C7967l.d dVar = C7967l.Companion;
                String[] strArr = new String[3];
                if (z11) {
                    str = "group_";
                } else {
                    str = "";
                }
                strArr[0] = str + i11;
                strArr[1] = "hasReaction=" + z12;
                strArr[2] = "size=" + c19498i.m101944c();
                dVar.m42751f(zdbApiCode, "updateListChatMsgReaction->updateReactionStateAPI", strArr);
                if (!C24265l.Companion.m126709b().m126699o().m128550h()) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChat", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str4 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str4, "currentUserUid");
                AbstractC20887g.m109232j(str4, 16051, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                if (!C24265l.Companion.m126709b().m126699o().m128550h()) {
                    return;
                }
            }
            C24261h.Companion.m126657c(230406011, currentTimeMillis, System.currentTimeMillis(), c19498i.m101944c(), AbstractC23008a2.m117941j(zdbApiCode));
        } catch (Throwable th2) {
            if (C24265l.Companion.m126709b().m126699o().m128550h()) {
                C24261h.Companion.m126657c(230406011, currentTimeMillis, System.currentTimeMillis(), c19498i.m101944c(), AbstractC23008a2.m117941j(zdbApiCode));
            }
            throw th2;
        }
    }

    /* renamed from: z */
    public final List m41568z() {
        List m131502j;
        List m131502j2;
        if (!m41493j0()) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        try {
            Zadb zadb = Zadb.f43387k;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            C19505p m42792w = zadb.m42792w(Integer.parseInt(str), new ZdbApiCode());
            if (m42792w != null && m42792w.m101960c() > 0) {
                ArrayList arrayList = new ArrayList();
                int m101960c = m42792w.m101960c();
                for (int i11 = 0; i11 < m101960c; i11++) {
                    arrayList.add(AbstractC24866w.m129235a(Integer.valueOf(m42792w.m101959b(i11).f96836a), Integer.valueOf(m42792w.m101959b(i11).f96837b)));
                }
                return arrayList;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
        }
        m131502j = AbstractC25368s.m131502j();
        return m131502j;
    }

    /* renamed from: z0 */
    public final void m41569z0(C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "localPath");
        if (!m41493j0()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19493d c19493d = new C19493d();
            c19493d.f96795a = "LocalPath";
            c19493d.f96797c = (byte) 1;
            c19493d.f96796b = str;
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C19494e c19494e = new C19494e();
            if (m95029V3.m41052p()) {
                C19494e.a aVar = new C19494e.a();
                aVar.f96799a = "CliMsgId";
                aVar.f96801c = (byte) 3;
                aVar.f96800b = m95029V3.m41045i();
                c19494e.m101935a(aVar);
                String m94862C4 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
                if (m94862C4.length() > 0) {
                    C19494e.a aVar2 = new C19494e.a();
                    aVar2.f96799a = "SenderId";
                    aVar2.f96801c = (byte) 3;
                    String m94862C42 = c17945a0.m94862C4();
                    AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
                    aVar2.f96800b = Long.parseLong(m94862C42);
                    c19494e.m101935a(aVar2);
                }
            }
            C19494e c19494e2 = new C19494e();
            if (m95029V3.m41053q()) {
                C19494e.a aVar3 = new C19494e.a();
                aVar3.f96799a = "GlbMsgId";
                aVar3.f96801c = (byte) 3;
                aVar3.f96800b = m95029V3.m41047k();
                c19494e2.m101935a(aVar3);
            }
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            Zadb zadb = Zadb.f43387k;
            int m94886F3 = c17945a0.m94886F3();
            boolean m94847A6 = c17945a0.m94847A6();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            zadb.m42765L(m94886F3, m94847A6, Integer.parseInt(str2), c19493d, c19494e, c19494e2, zdbApiCode);
            C7967l.d dVar = C7967l.Companion;
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            dVar.m42751f(zdbApiCode, "updateLocalPathChatContent->updateMsgAPI", mo95039W2, c17945a0.m95029V3().toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChat", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str3, "currentUserUid");
            AbstractC20887g.m109232j(str3, 16050, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    private C7956b() {
        this.f43217b = "";
    }
}
