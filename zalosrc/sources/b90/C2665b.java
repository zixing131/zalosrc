package b90;

import androidx.work.AbstractC2144f;
import au.EnumC2369r;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23160o0;
import me0.C23250w4;
import p246iw.C20861l0;
import p716zh.C31950hc;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25378x;

/* renamed from: b90.b */
/* loaded from: classes6.dex */
public final class C2665b {

    /* renamed from: a */
    private int f10665a;

    /* renamed from: b */
    private boolean f10666b;

    /* renamed from: c */
    private final Map f10667c;

    /* renamed from: d */
    private final InterfaceC24854k f10668d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b90.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10669q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17945a0 c17945a0) {
            super(1);
            this.f10669q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(MyCloudMessageItem myCloudMessageItem) {
            AbstractC19074t.m100208f(myCloudMessageItem, "it");
            return Boolean.valueOf(myCloudMessageItem.m71033m().m95135f9(this.f10669q.m95029V3()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b90.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f10670q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C20861l0 mo12V4() {
            return new C20861l0();
        }
    }

    public C2665b(int i11, boolean z11, Map map) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(map, "sectionList");
        this.f10665a = i11;
        this.f10666b = z11;
        this.f10667c = map;
        m129210a = AbstractC24856m.m129210a(b.f10670q);
        this.f10668d = m129210a;
    }

    /* renamed from: a */
    public final MyCloudMessageItem m13082a(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        MyCloudMessageItem myCloudMessageItem = new MyCloudMessageItem(c17945a0);
        myCloudMessageItem.m71024h(AbstractC23160o0.m119182A0(c17945a0.m95313z4()));
        if (!m13083b(myCloudMessageItem)) {
            return null;
        }
        return myCloudMessageItem;
    }

    /* renamed from: b */
    public final boolean m13083b(MyCloudMessageItem myCloudMessageItem) {
        AbstractC19074t.m100208f(myCloudMessageItem, "myCloudItem");
        Collection values = this.f10667c.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                List m13098c = ((C2666c) it.next()).m13098c();
                if (!(m13098c instanceof Collection) || !m13098c.isEmpty()) {
                    Iterator it2 = m13098c.iterator();
                    while (it2.hasNext()) {
                        if (((MyCloudMessageItem) it2.next()).m71033m().m95135f9(myCloudMessageItem.m71033m().m95029V3())) {
                            return false;
                        }
                    }
                }
            }
        }
        if (this.f10667c.containsKey(Long.valueOf(myCloudMessageItem.m71020d()))) {
            C2666c c2666c = (C2666c) this.f10667c.get(Long.valueOf(myCloudMessageItem.m71020d()));
            if (c2666c != null) {
                c2666c.m13096a(myCloudMessageItem);
                if (!myCloudMessageItem.m71022f()) {
                    c2666c.m13099d().m71025i(false);
                }
            }
        } else {
            C2666c c2666c2 = new C2666c(null, 0L, null, 7, null);
            c2666c2.m13101f(C23250w4.m119785D(myCloudMessageItem.m71020d(), EnumC2369r.f9911q, true));
            c2666c2.m13102g(myCloudMessageItem.m71020d());
            c2666c2.m13096a(myCloudMessageItem);
            this.f10667c.put(Long.valueOf(myCloudMessageItem.m71020d()), c2666c2);
        }
        return true;
    }

    /* renamed from: c */
    public final void m13084c(C2665b c2665b) {
        AbstractC19074t.m100208f(c2665b, "data");
        this.f10665a = c2665b.f10665a;
        this.f10666b = c2665b.f10666b;
        this.f10667c.clear();
        Iterator it = c2665b.f10667c.keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            C2666c c2666c = (C2666c) c2665b.f10667c.get(Long.valueOf(longValue));
            if (c2666c != null) {
                this.f10667c.put(Long.valueOf(longValue), c2666c);
            }
        }
    }

    /* renamed from: d */
    public final boolean m13085d() {
        return this.f10666b;
    }

    /* renamed from: e */
    public final int m13086e() {
        return this.f10665a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2665b)) {
            return false;
        }
        C2665b c2665b = (C2665b) obj;
        return this.f10665a == c2665b.f10665a && this.f10666b == c2665b.f10666b && AbstractC19074t.m100204b(this.f10667c, c2665b.f10667c);
    }

    /* renamed from: f */
    public final C20861l0 m13087f() {
        return (C20861l0) this.f10668d.getValue();
    }

    /* renamed from: g */
    public final Map m13088g() {
        return this.f10667c;
    }

    /* renamed from: h */
    public final int m13089h() {
        int i11;
        synchronized (this) {
            try {
                Iterator it = this.f10667c.entrySet().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    i11 += ((C2666c) ((Map.Entry) it.next()).getValue()).m13098c().size();
                }
                C31950hc c31950hc = C31950hc.f146830a;
                if (c31950hc.m153634E()) {
                    i11 -= c31950hc.m153643v();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public int hashCode() {
        return (((this.f10665a * 31) + AbstractC2144f.m11520a(this.f10666b)) * 31) + this.f10667c.hashCode();
    }

    /* renamed from: i */
    public final boolean m13090i(C17945a0 c17945a0) {
        boolean z11;
        List m13098c;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        long m119182A0 = AbstractC23160o0.m119182A0(c17945a0.m95313z4());
        C2666c c2666c = (C2666c) this.f10667c.get(Long.valueOf(m119182A0));
        if (c2666c != null && (m13098c = c2666c.m13098c()) != null) {
            z11 = AbstractC25378x.m131542D(m13098c, new a(c17945a0));
        } else {
            z11 = false;
        }
        if (z11) {
            Object obj = this.f10667c.get(Long.valueOf(m119182A0));
            AbstractC19074t.m100205c(obj);
            if (((C2666c) obj).m13098c().isEmpty()) {
                this.f10667c.remove(Long.valueOf(m119182A0));
            }
        }
        return z11;
    }

    /* renamed from: j */
    public final void m13091j() {
        this.f10665a = 0;
        this.f10667c.clear();
        this.f10666b = true;
    }

    /* renamed from: k */
    public final void m13092k(boolean z11) {
        this.f10666b = z11;
    }

    /* renamed from: l */
    public final void m13093l(int i11) {
        this.f10665a = i11;
    }

    public String toString() {
        return "MyCloudMessagePageData(offset=" + this.f10665a + ", hasMore=" + this.f10666b + ", sectionList=" + this.f10667c + ")";
    }

    public /* synthetic */ C2665b(int i11, boolean z11, Map map, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? new ConcurrentHashMap() : map);
    }
}
