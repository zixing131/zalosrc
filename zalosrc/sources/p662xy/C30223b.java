package p662xy;

import bg0.C2797c;
import com.androidquery.util.C3977j;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23112j7;
import mm0.AbstractC23350e;
import p185gc.AbstractC19378b;
import p405ov.C24561c;
import p590vy.C28675d;
import p625wy.C29269b;
import p662xy.C30223b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import sx.C26404f;

/* renamed from: xy.b */
/* loaded from: classes4.dex */
public final class C30223b extends AbstractC19378b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC24854k f140380a;

    /* renamed from: xy.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xy.b$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C29269b f140381a;

        /* renamed from: b */
        private final String f140382b;

        /* renamed from: c */
        private final String f140383c;

        /* renamed from: d */
        private final C2797c f140384d;

        /* renamed from: e */
        private final long f140385e;

        public b(C29269b c29269b, String str, String str2, C2797c c2797c, long j11) {
            AbstractC19074t.m100208f(c29269b, "personalIdentity");
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "entryPointSendMsg");
            AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
            this.f140381a = c29269b;
            this.f140382b = str;
            this.f140383c = str2;
            this.f140384d = c2797c;
            this.f140385e = j11;
        }

        /* renamed from: a */
        public final long m149028a() {
            return this.f140385e;
        }

        /* renamed from: b */
        public final String m149029b() {
            return this.f140383c;
        }

        /* renamed from: c */
        public final String m149030c() {
            return this.f140382b;
        }

        /* renamed from: d */
        public final C29269b m149031d() {
            return this.f140381a;
        }

        /* renamed from: e */
        public final C2797c m149032e() {
            return this.f140384d;
        }
    }

    /* renamed from: xy.b$c */
    /* loaded from: classes4.dex */
    public static final class c {
    }

    /* renamed from: xy.b$d */
    /* loaded from: classes4.dex */
    public static final class d implements C28675d.a {

        /* renamed from: a */
        final /* synthetic */ Map f140386a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18494a f140387b;

        /* renamed from: c */
        final /* synthetic */ String f140388c;

        d(Map map, InterfaceC18494a interfaceC18494a, String str) {
            this.f140386a = map;
            this.f140387b = interfaceC18494a;
            this.f140388c = str;
        }

        @Override // p590vy.C28675d.a
        /* renamed from: a */
        public void mo143627a(String str, File file) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(file, "file");
            Map map = this.f140386a;
            String str2 = this.f140388c;
            synchronized (map) {
                String absolutePath = file.getAbsolutePath();
                AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                map.put(str2, absolutePath);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            this.f140387b.mo12V4();
        }

        @Override // p590vy.C28675d.a
        /* renamed from: b */
        public void mo143628b() {
            Map map = this.f140386a;
            String str = this.f140388c;
            synchronized (map) {
                map.put(str, "-1");
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            this.f140387b.mo12V4();
        }
    }

    /* renamed from: xy.b$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f140389q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return Collections.synchronizedList(new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xy.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Map f140390q;

        /* renamed from: r */
        final /* synthetic */ C19051f0 f140391r;

        /* renamed from: s */
        final /* synthetic */ AbstractC19378b.a f140392s;

        /* renamed from: t */
        final /* synthetic */ b f140393t;

        /* renamed from: u */
        final /* synthetic */ C30223b f140394u;

        /* renamed from: v */
        final /* synthetic */ String f140395v;

        /* renamed from: w */
        final /* synthetic */ C29269b f140396w;

        /* renamed from: x */
        final /* synthetic */ String f140397x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Map map, C19051f0 c19051f0, AbstractC19378b.a aVar, b bVar, C30223b c30223b, String str, C29269b c29269b, String str2) {
            super(0);
            this.f140390q = map;
            this.f140391r = c19051f0;
            this.f140392s = aVar;
            this.f140393t = bVar;
            this.f140394u = c30223b;
            this.f140395v = str;
            this.f140396w = c29269b;
            this.f140397x = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m149035c(C30223b c30223b, String str, C29269b c29269b, Map map, String str2, AbstractC19378b.a aVar, b bVar) {
            List m131185M0;
            AbstractC19074t.m100208f(c30223b, "this$0");
            AbstractC19074t.m100208f(str, "$ownerId");
            AbstractC19074t.m100208f(c29269b, "$personalIdentity");
            AbstractC19074t.m100208f(map, "$mapPhotoDownload");
            AbstractC19074t.m100208f(str2, "$entryPointSendMsg");
            AbstractC19074t.m100208f(bVar, "$params");
            String m146268b = c29269b.m146268b();
            m131185M0 = AbstractC25332a0.m131185M0(map.values());
            c30223b.m149023l(str, m146268b, m131185M0, str2, aVar);
            c30223b.m149024m(bVar.m149028a());
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m149036b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m149036b() {
            boolean z11;
            List m131185M0;
            Map map = this.f140390q;
            synchronized (map) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b((String) it.next(), "")) {
                        return;
                    }
                }
                Iterator it2 = map.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (AbstractC19074t.m100204b((String) it2.next(), "-1")) {
                            z11 = false;
                            break;
                        }
                    } else {
                        z11 = true;
                        break;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                C19051f0 c19051f0 = this.f140391r;
                if (c19051f0.f94928p) {
                    AbstractC23350e.m122776f("QRWallet", new Exception("isFinish is called twice!!!"));
                    AbstractC19378b.a aVar = this.f140392s;
                    if (aVar != null) {
                        aVar.mo1004b();
                        return;
                    }
                    return;
                }
                c19051f0.f94928p = true;
                C24561c.m127942b("QRWallet", "[SendCCCD] allPhotoSuccess: " + z11);
                if (z11) {
                    if (this.f140393t.m149028a() > 0) {
                        C2797c m149032e = this.f140393t.m149032e();
                        final C30223b c30223b = this.f140394u;
                        final String str = this.f140395v;
                        final C29269b c29269b = this.f140396w;
                        final Map map2 = this.f140390q;
                        final String str2 = this.f140397x;
                        final AbstractC19378b.a aVar2 = this.f140392s;
                        final b bVar = this.f140393t;
                        m149032e.mo13474a(new Runnable() { // from class: xy.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                C30223b.f.m149035c(C30223b.this, str, c29269b, map2, str2, aVar2, bVar);
                            }
                        });
                        return;
                    }
                    C30223b c30223b2 = this.f140394u;
                    String str3 = this.f140395v;
                    String m146268b = this.f140396w.m146268b();
                    m131185M0 = AbstractC25332a0.m131185M0(this.f140390q.values());
                    c30223b2.m149023l(str3, m146268b, m131185M0, this.f140397x, this.f140392s);
                    return;
                }
                AbstractC19378b.a aVar3 = this.f140392s;
                if (aVar3 != null) {
                    aVar3.mo1004b();
                }
            }
        }
    }

    public C30223b() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(e.f140389q);
        this.f140380a = m129210a;
    }

    /* renamed from: g */
    private final void m149019g(String str, Map map, InterfaceC18494a interfaceC18494a) {
        C3977j c3977j = new C3977j(MainApplication.Companion.m35500c());
        m149020h().add(c3977j);
        C28675d.Companion.m143630a().m143626g(str, c3977j, new d(map, interfaceC18494a, str));
    }

    /* renamed from: h */
    private final List m149020h() {
        Object value = this.f140380a.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (List) value;
    }

    /* renamed from: j */
    private final void m149021j(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            MediaItem mediaItem = new MediaItem();
            mediaItem.mo41082W0(str2);
            arrayList.add(mediaItem);
        }
        C26404f c26404f = new C26404f(arrayList);
        c26404f.f125429K = 55;
        AbstractC23112j7.m118513W(str, c26404f);
    }

    /* renamed from: k */
    private final void m149022k(String str, String str2, String str3) {
        AbstractC23112j7.m118534i0(str, str2, null, null, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m149023l(String str, String str2, List list, String str3, AbstractC19378b.a aVar) {
        m149022k(str, str2, str3);
        m149025n(this, 0L, 1, null);
        m149021j(str, list);
        if (aVar != null) {
            aVar.onSuccess(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m149024m(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m149025n(C30223b c30223b, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 100;
        }
        c30223b.m149024m(j11);
    }

    /* renamed from: o */
    private final boolean m149026o(b bVar) {
        if (bVar.m149031d().m146270d() && bVar.m149030c().length() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19378b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo1884d(b bVar, AbstractC19378b.a aVar) {
        AbstractC19074t.m100208f(bVar, "params");
        if (!m149026o(bVar)) {
            C24561c.m127942b("QRWallet", "[SendCCCD] invalid params");
            if (aVar != null) {
                aVar.mo1004b();
                return;
            }
            return;
        }
        C29269b m149031d = bVar.m149031d();
        String m149030c = bVar.m149030c();
        String m149029b = bVar.m149029b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C29269b.b m146269c = m149031d.m146269c();
        if (m146269c != null && m146269c.m146272a().length() > 0) {
            linkedHashMap.put(m146269c.m146272a(), "");
        }
        C29269b.b m146267a = m149031d.m146267a();
        if (m146267a != null && m146267a.m146272a().length() > 0) {
            linkedHashMap.put(m146267a.m146272a(), "");
        }
        C19051f0 c19051f0 = new C19051f0();
        C24561c.m127942b("QRWallet", "[SendCCCD] Count photos sending: " + linkedHashMap.size());
        if (!linkedHashMap.isEmpty()) {
            m149020h().clear();
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                m149019g((String) it.next(), linkedHashMap, new f(linkedHashMap, c19051f0, aVar, bVar, this, m149030c, m149031d, m149029b));
            }
            return;
        }
        m149022k(m149030c, m149031d.m146268b(), m149029b);
        if (aVar != null) {
            aVar.onSuccess(new c());
        }
    }
}
