package je0;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20128b;
import i30.C20222a;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import je0.C21232c;
import k30.C21459a;
import ne0.C23731a;
import p213hl.C20086b;
import p405ov.C24561c;
import qm0.AbstractC25376w;
import za0.C31747a;

/* renamed from: je0.e */
/* loaded from: classes4.dex */
public final class C21234e extends C21232c {

    /* renamed from: d */
    private final C20222a f103517d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: je0.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f103518q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(ThreadStorageInfo threadStorageInfo, ThreadStorageInfo threadStorageInfo2) {
            AbstractC19074t.m100208f(threadStorageInfo, "o1");
            AbstractC19074t.m100208f(threadStorageInfo2, "o2");
            return Integer.valueOf(AbstractC19074t.m100210h(threadStorageInfo2.m74777O(), threadStorageInfo.m74777O()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21234e(C20086b c20086b, C20222a c20222a) {
        super(c20086b);
        AbstractC19074t.m100208f(c20086b, "storageUsageRepository");
        AbstractC19074t.m100208f(c20222a, "conversationStorageAnalyzer");
        this.f103517d = c20222a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final int m110031j(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je0.C21232c
    /* renamed from: f */
    public void mo110024f(InterfaceC21231b interfaceC21231b) {
        super.mo110024f(interfaceC21231b);
        List m18069b = C7959d.Companion.m41850e().m41778d2().m18069b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m18069b) {
            if (true ^ C21459a.f104477a.m111044h(((Conversation) obj).f42893q)) {
                arrayList.add(obj);
            }
        }
        C21459a.m111041j();
        File[] m124077b = C23731a.m124077b(C23731a.f114819a, null, 1, null);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            ThreadStorageInfo m105678a = this.f103517d.m105678a((Conversation) it.next(), m124077b, C20222a.b.f100075p);
            j11 += m105678a.m74777O();
            arrayList2.add(m105678a);
        }
        final a aVar = a.f103518q;
        AbstractC25376w.m131534w(arrayList2, new Comparator() { // from class: je0.d
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int m110031j;
                m110031j = C21234e.m110031j(InterfaceC18509p.this, obj2, obj3);
                return m110031j;
            }
        });
        m110022d().m104446q(arrayList2);
        m110022d().m104448s(j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je0.C21232c, p185gc.AbstractC19383g
    /* renamed from: h */
    public void mo12006b(C21232c.d dVar) {
        long j11;
        long j12;
        long j13;
        long j14;
        AbstractC19074t.m100208f(dVar, "params");
        super.mo12006b(dVar);
        long currentTimeMillis = System.currentTimeMillis();
        long m104766m = C20128b.m104766m();
        long m104764k = C20128b.m104764k();
        mo110024f(null);
        m110023e(null);
        long m104437h = m110022d().m104437h();
        long m104438i = m110022d().m104438i();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        m110022d().m104444o(-1L);
        C24561c.m127942b("ToolStorage", "Load summary data: totalDeviceStorage=" + m104766m + ", freeDeviceStorage=" + m104764k + ", totalAppCache=" + m104437h + ", totalConversationData=" + m104438i);
        InterfaceC21231b m110021c = m110021c();
        if (m110021c != null) {
            j11 = m104438i;
            j12 = m104437h;
            j13 = m104764k;
            j14 = m104766m;
            m110021c.mo17102a(m104437h, m104438i, m104764k, m104766m, true, currentTimeMillis2);
        } else {
            j11 = m104438i;
            j12 = m104437h;
            j13 = m104764k;
            j14 = m104766m;
        }
        C31747a.m152719r(j14, j13, j11, j12, currentTimeMillis2);
    }
}
