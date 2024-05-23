package p186gj;

import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import p056cj.InterfaceC3534b;
import p212hj.C20072c;
import p212hj.C20073d;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import tw.AbstractC26902d;
import xd0.C29594j;

/* renamed from: gj.b */
/* loaded from: classes3.dex */
public final class C19458b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C20073d f96575a;

    /* renamed from: b */
    private final C20072c f96576b;

    /* renamed from: c */
    private final C29594j f96577c;

    /* renamed from: d */
    private int f96578d;

    /* renamed from: e */
    private int f96579e;

    /* renamed from: gj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19458b(C20073d c20073d, C20072c c20072c, C29594j c29594j) {
        AbstractC19074t.m100208f(c20073d, "msgPreProcessor");
        AbstractC19074t.m100208f(c20072c, "msgPostProcessor");
        AbstractC19074t.m100208f(c29594j, "insertMsgMultiUseCase");
        this.f96575a = c20073d;
        this.f96576b = c20072c;
        this.f96577c = c29594j;
        this.f96578d = -1;
        this.f96579e = -1;
    }

    /* renamed from: b */
    private final boolean m101759b(C17945a0 c17945a0) {
        return c17945a0.m94933K7();
    }

    /* renamed from: c */
    private final void m101760c(Exception exc, long j11) {
        long currentTimeMillis = System.currentTimeMillis() - j11;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        AbstractC20887g.m109232j(str, 15002, exc.toString(), currentTimeMillis, 15000, CoreUtility.f89236l);
    }

    /* renamed from: a */
    public final List m101761a(String str, C19457a c19457a, InterfaceC3534b interfaceC3534b) {
        List list;
        C19458b c19458b = this;
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(c19457a, "batch");
        AbstractC19074t.m100208f(interfaceC3534b, "entry");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String m101756d = c19457a.m101756d();
            List m101755c = c19457a.m101755c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m101755c) {
                try {
                    if (!c19458b.m101759b((C17945a0) obj)) {
                        arrayList.add(obj);
                    }
                } catch (Exception e11) {
                    e = e11;
                    c19458b.m101760c(e, currentTimeMillis);
                    AbstractC23350e.m122776f("MessageProcessor", e);
                    return null;
                }
            }
            if (!arrayList.isEmpty()) {
                C29594j.b bVar = (C29594j.b) c19458b.f96577c.m101509a(new C29594j.a(str, m101756d, arrayList, interfaceC3534b, c19457a.m101754b(), false, false, null, 224, null));
                if (bVar != null) {
                    list = bVar.m147070b();
                } else {
                    list = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : m101755c) {
                    C17945a0 c17945a0 = (C17945a0) obj2;
                    if (arrayList.contains(c17945a0)) {
                        if (list != null && list.contains(c17945a0)) {
                        }
                    }
                    arrayList2.add(obj2);
                }
                return arrayList2;
            }
            return m101755c;
        } catch (Exception e12) {
            e = e12;
            c19458b = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:6:0x003b, B:8:0x0045, B:12:0x0053, B:13:0x0057, B:15:0x0061, B:17:0x006d, B:18:0x0077, B:21:0x0095, B:22:0x009b, B:24:0x00a1, B:29:0x004e), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:6:0x003b, B:8:0x0045, B:12:0x0053, B:13:0x0057, B:15:0x0061, B:17:0x006d, B:18:0x0077, B:21:0x0095, B:22:0x009b, B:24:0x00a1, B:29:0x004e), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:6:0x003b, B:8:0x0045, B:12:0x0053, B:13:0x0057, B:15:0x0061, B:17:0x006d, B:18:0x0077, B:21:0x0095, B:22:0x009b, B:24:0x00a1, B:29:0x004e), top: B:5:0x003b }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C19457a m101762d(String str, String str2, List list, InterfaceC3534b interfaceC3534b, boolean z11, boolean z12, int i11) {
        List m101761a;
        List list2;
        int i12;
        Integer num;
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(list, "listMsgPacket");
        AbstractC19074t.m100208f(interfaceC3534b, "entry");
        if (AbstractC23304d.m120544o()) {
            this.f96575a.m104348i(this.f96578d);
            this.f96575a.m104349j(this.f96579e);
        }
        C19457a m104347b = this.f96575a.m104347b(str, str2, list, z11, z12, i11);
        try {
            m101761a = m101761a(str, m104347b, interfaceC3534b);
            list2 = m101761a;
            i12 = 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (list2 != null) {
            if (list2.isEmpty()) {
            }
            if (m101761a != null) {
                i12 = m101761a.size();
            }
            if (i12 < m104347b.m101755c().size()) {
                int size = m104347b.m101755c().size();
                if (m101761a != null) {
                    num = Integer.valueOf(m101761a.size());
                } else {
                    num = null;
                }
                AbstractC26902d.m138659a("MessageProcessor", "Fail insert multi msg: total=" + size + " | success count=" + num);
            }
            if (m101761a != null) {
                Iterator it = m101761a.iterator();
                while (it.hasNext()) {
                    this.f96576b.m104338d(str, (C17945a0) it.next(), interfaceC3534b);
                }
            }
            return m104347b;
        }
        m104347b.m101758f(false);
        if (m101761a != null) {
        }
        if (i12 < m104347b.m101755c().size()) {
        }
        if (m101761a != null) {
        }
        return m104347b;
    }

    /* renamed from: e */
    public final void m101763e(int i11) {
        this.f96578d = i11;
    }

    /* renamed from: f */
    public final void m101764f(int i11) {
        this.f96579e = i11;
    }
}
