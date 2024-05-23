package in;

import android.os.Build;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import in.AbstractC20631e;
import in.C20627a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;

/* renamed from: in.c */
/* loaded from: classes3.dex */
public final class C20629c {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f101484e;

    /* renamed from: a */
    private Map f101485a;

    /* renamed from: b */
    private Map f101486b;

    /* renamed from: c */
    private Map f101487c;

    /* renamed from: d */
    private final Object f101488d;

    /* renamed from: in.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f101489q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20629c mo12V4() {
            return new C20629c(null);
        }
    }

    /* renamed from: in.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20629c m107461a() {
            return (C20629c) C20629c.f101484e.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: in.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f101490a;

        /* renamed from: b */
        private final String f101491b;

        /* renamed from: c */
        private final String f101492c;

        /* renamed from: d */
        private final boolean f101493d;

        /* renamed from: e */
        public InterfaceC20633g f101494e;

        public c(String str, String str2, String str3, boolean z11) {
            AbstractC19074t.m100208f(str, "callerId");
            AbstractC19074t.m100208f(str2, "originalId");
            AbstractC19074t.m100208f(str3, "pathOut");
            this.f101490a = str;
            this.f101491b = str2;
            this.f101492c = str3;
            this.f101493d = z11;
        }

        /* renamed from: a */
        public final String m107462a() {
            return this.f101490a;
        }

        /* renamed from: b */
        public final InterfaceC20633g m107463b() {
            InterfaceC20633g interfaceC20633g = this.f101494e;
            if (interfaceC20633g != null) {
                return interfaceC20633g;
            }
            AbstractC19074t.m100223u("listener");
            return null;
        }

        /* renamed from: c */
        public final String m107464c() {
            return this.f101491b;
        }

        /* renamed from: d */
        public final String m107465d() {
            return this.f101492c;
        }

        /* renamed from: e */
        public final boolean m107466e() {
            return this.f101493d;
        }

        /* renamed from: f */
        public final void m107467f(InterfaceC20633g interfaceC20633g) {
            AbstractC19074t.m100208f(interfaceC20633g, "<set-?>");
            this.f101494e = interfaceC20633g;
        }
    }

    /* renamed from: in.c$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20630d {

        /* renamed from: b */
        final /* synthetic */ String f101496b;

        /* renamed from: c */
        final /* synthetic */ String f101497c;

        /* renamed from: d */
        final /* synthetic */ boolean f101498d;

        /* renamed from: e */
        final /* synthetic */ MessageId f101499e;

        d(String str, String str2, boolean z11, MessageId messageId) {
            this.f101496b = str;
            this.f101497c = str2;
            this.f101498d = z11;
            this.f101499e = messageId;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "path");
            C20629c.this.m107449m(this.f101496b, str, z11);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            AbstractC20130d.m104858T0(new File(this.f101497c));
            if (this.f101498d || i11 == 1) {
                C20629c.this.m107445h(this.f101496b, i11);
            } else {
                C20629c.this.m107451u(this.f101499e, i11, this.f101497c, this.f101496b, z11);
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
            C20629c.this.m107446i(this.f101496b, j11);
        }
    }

    /* renamed from: in.c$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC24301d {

        /* renamed from: b */
        final /* synthetic */ String f101501b;

        /* renamed from: c */
        final /* synthetic */ boolean f101502c;

        /* renamed from: d */
        final /* synthetic */ int f101503d;

        e(String str, boolean z11, int i11) {
            this.f101501b = str;
            this.f101502c = z11;
            this.f101503d = i11;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            C20629c.this.m107446i(this.f101501b, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return false;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return EnumC24298a.f117300s;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            if (C24302e.Companion.m126916e(i11)) {
                C20629c.this.m107445h(this.f101501b, this.f101503d);
            } else {
                C20629c.this.m107445h(this.f101501b, 3);
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            C20629c.this.m107449m(this.f101501b, str2, this.f101502c);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return InterfaceC24301d.a.m126884a(this);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f101489q);
        f101484e = m129210a;
    }

    public /* synthetic */ C20629c(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: g */
    private final String m107444g(File file, String str, boolean z11) {
        boolean m127120J;
        boolean m127120J2;
        if (Build.VERSION.SDK_INT >= 29 && !AbstractC20130d.m104852Q0(str)) {
            m127120J = AbstractC24341v.m127120J(str, C20131e.m104909A(), false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, C20131e.m104918Z(), false, 2, null);
                if (!m127120J2) {
                    String m120300L = AbstractC23280z4.m120300L(file.getAbsolutePath(), AbstractC23041d2.m118212k(str), true, new SensitiveData("gallery_save_photo_detail", "photo_download", null, 4, null));
                    if (z11) {
                        AbstractC20130d.m104858T0(file);
                        return m120300L;
                    }
                    return m120300L;
                }
            }
        }
        File file2 = new File(str);
        if (z11) {
            if (!AbstractC23238v2.m119718c(file, file2)) {
                return null;
            }
            return str;
        }
        AbstractC23238v2.m119717b(file, file2);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m107445h(String str, int i11) {
        try {
            ArrayList<c> arrayList = new ArrayList();
            synchronized (this.f101488d) {
                try {
                    this.f101485a.remove(str);
                    Set<c> set = (Set) this.f101487c.remove(str);
                    if (set != null) {
                        for (c cVar : set) {
                            this.f101486b.remove(cVar.m107462a());
                            arrayList.add(cVar);
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
            for (c cVar2 : arrayList) {
                cVar2.m107463b().mo62758b(cVar2.m107464c(), i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DownloadFileAsyncController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final synchronized void m107446i(String str, long j11) {
        try {
            try {
                ArrayList<c> arrayList = new ArrayList();
                synchronized (this.f101488d) {
                    try {
                        Set set = (Set) this.f101487c.get(str);
                        if (set != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                arrayList.add((c) it.next());
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    } finally {
                    }
                }
                for (c cVar : arrayList) {
                    cVar.m107463b().mo62757a(cVar.m107464c(), j11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DownloadFileAsyncController", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    private final String m107447j(String str, String str2) {
        return str2 + "_" + str;
    }

    /* renamed from: k */
    public static final C20629c m107448k() {
        return Companion.m107461a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m107449m(String str, String str2, boolean z11) {
        File file;
        boolean z12;
        boolean z13;
        c cVar;
        boolean z14;
        try {
            AbstractC20110a.f98889a.mo104558r("onDataProcessed: %s", str);
            ArrayList<C24860q> arrayList = new ArrayList();
            ArrayList<c> arrayList2 = new ArrayList();
            synchronized (this.f101488d) {
                try {
                    this.f101485a.remove(str);
                    file = new File(str2);
                } catch (Exception e11) {
                    arrayList2.add(cVar);
                    AbstractC23350e.m122776f("DownloadFileAsyncController", e11);
                } finally {
                }
                if (file.exists()) {
                    Set set = (Set) this.f101487c.remove(str);
                    if (set != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            cVar = (c) it.next();
                            it.remove();
                            this.f101486b.remove(cVar.m107462a());
                            if (set.size() == 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String m107444g = m107444g(file, cVar.m107465d(), z14);
                            if (m107444g != null && m107444g.length() != 0) {
                                arrayList.add(AbstractC24866w.m129235a(cVar, m107444g));
                            }
                            arrayList2.add(cVar);
                        }
                    }
                    z12 = false;
                } else {
                    z12 = true;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            for (C24860q c24860q : arrayList) {
                c cVar2 = (c) c24860q.m129213a();
                String str3 = (String) c24860q.m129214b();
                if (!z11 && cVar2.m107466e()) {
                    z13 = false;
                    cVar2.m107463b().mo62759c(cVar2.m107464c(), str3, z13);
                }
                z13 = true;
                cVar2.m107463b().mo62759c(cVar2.m107464c(), str3, z13);
            }
            for (c cVar3 : arrayList2) {
                cVar3.m107463b().mo62758b(cVar3.m107464c(), 3);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("DownloadFileAsyncController", e12);
        }
        if (z12) {
            m107445h(str, 3);
        }
    }

    /* renamed from: t */
    public static /* synthetic */ void m107450t(C20629c c20629c, MessageId messageId, String str, String str2, String str3, InterfaceC20633g interfaceC20633g, boolean z11, int i11, int i12, long j11, int i13, long j12, AbstractC20631e.c cVar, C20627a.a aVar, boolean z12, String str4, boolean z13, Map map, boolean z14, int i14, Object obj) {
        Map map2;
        Map m131404i;
        boolean z15 = (i14 & 32768) != 0 ? false : z13;
        if ((i14 & 65536) != 0) {
            m131404i = AbstractC25363p0.m131404i();
            map2 = m131404i;
        } else {
            map2 = map;
        }
        c20629c.m107456p(messageId, str, str2, str3, interfaceC20633g, z11, i11, i12, j11, i13, j12, cVar, aVar, z12, str4, z15, map2, (i14 & 131072) != 0 ? false : z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m107451u(MessageId messageId, int i11, String str, String str2, boolean z11) {
        C17945a0 m2635r;
        C24302e.b bVar = C24302e.Companion;
        if (bVar.m126923n() && messageId != null && (m2635r = AbstractC23306f.m120584H0().m2635r(messageId)) != null) {
            bVar.m126919j().m126905n(m2635r, str, new e(str2, z11, i11));
        } else {
            m107445h(str2, i11);
        }
    }

    /* renamed from: f */
    public final void m107452f(String str, String str2) {
        Set set;
        C20627a c20627a;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "id");
        if (str.length() == 0 || str2.length() == 0) {
            return;
        }
        try {
            String m107447j = m107447j(str, str2);
            synchronized (this.f101488d) {
                try {
                    c cVar = (c) this.f101486b.remove(m107447j);
                    if (cVar != null && (set = (Set) this.f101487c.get(str)) != null) {
                        set.remove(cVar);
                        if (set.isEmpty() && (c20627a = (C20627a) this.f101485a.remove(str)) != null) {
                            c20627a.mo107421i(true);
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DownloadFileAsyncController", e11);
        }
    }

    /* renamed from: l */
    public final String m107453l(String str) {
        String str2;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        synchronized (this.f101488d) {
            C20627a c20627a = (C20627a) this.f101485a.get(str);
            if (c20627a != null) {
                str2 = c20627a.f101516h;
            } else {
                str2 = null;
            }
        }
        return str2;
    }

    /* renamed from: n */
    public final boolean m107454n(String str, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "id");
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        try {
            String m107447j = m107447j(str, str2);
            synchronized (this.f101488d) {
                if (this.f101486b.get(m107447j) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            return z11;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DownloadFileAsyncController", e11);
            return false;
        }
    }

    /* renamed from: o */
    public final void m107455o(MessageId messageId, String str, String str2, String str3, InterfaceC20633g interfaceC20633g, boolean z11, int i11, int i12, long j11, int i13, long j12, AbstractC20631e.c cVar, C20627a.a aVar, boolean z12, String str4) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "pathOut");
        AbstractC19074t.m100208f(str3, "id");
        AbstractC19074t.m100208f(interfaceC20633g, "listener");
        AbstractC19074t.m100208f(str4, "checkSumCode");
        m107450t(this, messageId, str, str2, str3, interfaceC20633g, z11, i11, i12, j11, i13, j12, cVar, aVar, z12, str4, false, null, false, 196608, null);
    }

    /* renamed from: p */
    public final void m107456p(MessageId messageId, String str, String str2, String str3, InterfaceC20633g interfaceC20633g, boolean z11, int i11, int i12, long j11, int i13, long j12, AbstractC20631e.c cVar, C20627a.a aVar, boolean z12, String str4, boolean z13, Map map, boolean z14) {
        String str5;
        boolean z15;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "pathOut");
        AbstractC19074t.m100208f(str3, "id");
        AbstractC19074t.m100208f(interfaceC20633g, "listener");
        AbstractC19074t.m100208f(str4, "checkSumCode");
        AbstractC19074t.m100208f(map, "httpHeaders");
        try {
            if (str.length() != 0 && str2.length() != 0 && str3.length() != 0) {
                String m107447j = m107447j(str, str3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("startDownload: callerID: ");
                sb2.append(m107447j);
                sb2.append(" - url: ");
                sb2.append(str);
                Object obj = " - PathOut: ";
                sb2.append(" - PathOut: ");
                sb2.append(str2);
                Object obj2 = this.f101488d;
                synchronized (obj2) {
                    try {
                        C20627a c20627a = (C20627a) this.f101485a.get(str);
                        try {
                            if (c20627a == null) {
                                String str6 = AbstractC20130d.m104892r0() + "temp_" + System.currentTimeMillis();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("startDownload: PathTemp: ");
                                sb3.append(str6);
                                C20627a c20627a2 = new C20627a(false);
                                c20627a2.m107419g0(new d(str, str6, z14, messageId));
                                c20627a2.m107420h0(str6);
                                c20627a2.m107416d0(false);
                                c20627a2.m107418f0(aVar);
                                c20627a2.m107425l0(z12);
                                if (z11) {
                                    c20627a2.f101478v = i11;
                                }
                                c20627a2.f101481y = z13;
                                c20627a2.f101480x = map;
                                if (cVar != null) {
                                    c20627a2.m107484G(cVar);
                                }
                                c20627a2.m107417e0(str4);
                                obj = obj2;
                                str5 = m107447j;
                                c20627a2.m107489o(i12, j11, i13, j12, str5, str);
                                Map map2 = this.f101485a;
                                AbstractC19074t.m100207e(map2, "mapUrlDownloadTask");
                                map2.put(str, c20627a2);
                                z15 = true;
                            } else {
                                obj = obj2;
                                str5 = m107447j;
                                c20627a.m107413a0(str);
                                z15 = false;
                            }
                            Map map3 = this.f101486b;
                            Object obj3 = map3.get(str5);
                            if (obj3 == null) {
                                obj3 = new c(str5, str3, str2, z15);
                                map3.put(str5, obj3);
                            }
                            c cVar2 = (c) obj3;
                            cVar2.m107467f(interfaceC20633g);
                            Map map4 = this.f101487c;
                            Object obj4 = map4.get(str);
                            if (obj4 == null) {
                                obj4 = new LinkedHashSet();
                                map4.put(str, obj4);
                            }
                            ((Set) obj4).add(cVar2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                }
            }
            interfaceC20633g.mo62758b(str3, 3);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DownloadFileAsyncController", e11);
        }
    }

    /* renamed from: q */
    public final void m107457q(MessageId messageId, String str, String str2, String str3, InterfaceC20633g interfaceC20633g, boolean z11, String str4) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "pathOut");
        AbstractC19074t.m100208f(str3, "id");
        AbstractC19074t.m100208f(interfaceC20633g, "listener");
        AbstractC19074t.m100208f(str4, "checkSumCode");
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        m107455o(messageId, str, str2, str3, interfaceC20633g, z11, 26002, 1, m120579F1.mo124310e(), 0, 0L, null, null, false, str4);
    }

    /* renamed from: r */
    public final void m107458r(String str, String str2, String str3, InterfaceC20633g interfaceC20633g, boolean z11, String str4) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "pathOut");
        AbstractC19074t.m100208f(str3, "id");
        AbstractC19074t.m100208f(interfaceC20633g, "listener");
        AbstractC19074t.m100208f(str4, "checkSumCode");
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        m107450t(this, null, str, str2, str3, interfaceC20633g, z11, 26002, 1, m120579F1.mo124310e(), 0, 0L, null, null, false, str4, false, null, false, 229376, null);
    }

    /* renamed from: s */
    public final void m107459s(String str, String str2, String str3, InterfaceC20633g interfaceC20633g, boolean z11, Map map, int i11, boolean z12) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "pathOut");
        AbstractC19074t.m100208f(str3, "id");
        AbstractC19074t.m100208f(interfaceC20633g, "listener");
        AbstractC19074t.m100208f(map, "httpHeaders");
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        m107456p(null, str, str2, str3, interfaceC20633g, false, i11, 1, m120579F1.mo124310e(), 0, 0L, null, null, true, "", z11, map, z12);
    }

    private C20629c() {
        this.f101485a = Collections.synchronizedMap(new LinkedHashMap());
        this.f101486b = new LinkedHashMap();
        this.f101487c = new LinkedHashMap();
        this.f101488d = new Object();
    }
}
