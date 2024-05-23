package u10;

import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.ComplexAds;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import ln0.C22537f;
import on0.AbstractC24341v;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import z10.C31179n0;

/* renamed from: u10.b */
/* loaded from: classes5.dex */
public final class C26948b {

    /* renamed from: b */
    private ComplexAds.Config f127427b;

    /* renamed from: e */
    private InterfaceC18494a f127430e;

    /* renamed from: a */
    private c f127426a = new c();

    /* renamed from: c */
    private int f127428c = -1;

    /* renamed from: d */
    private int f127429d = -1;

    /* renamed from: u10.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final VideoAdsData f127431a;

        /* renamed from: b */
        private final ComplexAds.Config f127432b;

        /* renamed from: c */
        private int f127433c;

        public a(VideoAdsData videoAdsData, ComplexAds.Config config, int i11) {
            AbstractC19074t.m100208f(videoAdsData, "data");
            AbstractC19074t.m100208f(config, "config");
            this.f127431a = videoAdsData;
            this.f127432b = config;
            this.f127433c = i11;
        }

        /* renamed from: a */
        public final ComplexAds.Config m138880a() {
            return this.f127432b;
        }

        /* renamed from: b */
        public final VideoAdsData m138881b() {
            return this.f127431a;
        }

        /* renamed from: c */
        public final int m138882c() {
            return this.f127433c;
        }
    }

    /* renamed from: u10.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final int f127434a;

        /* renamed from: b */
        private final Video f127435b;

        /* renamed from: c */
        private long f127436c;

        /* renamed from: d */
        private boolean f127437d;

        /* renamed from: e */
        private boolean f127438e;

        public b(int i11, Video video, long j11, boolean z11, boolean z12) {
            this.f127434a = i11;
            this.f127435b = video;
            this.f127436c = j11;
            this.f127437d = z11;
            this.f127438e = z12;
        }

        /* renamed from: a */
        public final Video m138883a() {
            return this.f127435b;
        }

        /* renamed from: b */
        public final int m138884b() {
            return this.f127434a;
        }

        /* renamed from: c */
        public final long m138885c() {
            return this.f127436c;
        }

        /* renamed from: d */
        public final boolean m138886d() {
            return this.f127437d;
        }

        /* renamed from: e */
        public final boolean m138887e() {
            return this.f127438e;
        }

        /* renamed from: f */
        public final void m138888f(boolean z11) {
            this.f127437d = z11;
        }

        /* renamed from: g */
        public final void m138889g(boolean z11) {
            this.f127438e = z11;
        }

        /* renamed from: h */
        public final void m138890h(long j11) {
            this.f127436c = j11;
        }

        public /* synthetic */ b(int i11, Video video, long j11, boolean z11, boolean z12, int i12, AbstractC19060k abstractC19060k) {
            this(i11, video, (i12 & 4) != 0 ? 0L : j11, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? true : z12);
        }
    }

    /* renamed from: u10.b$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final ArrayList f127439a = new ArrayList();

        /* renamed from: b */
        private final ArrayList f127440b = new ArrayList();

        /* renamed from: a */
        public final void m138891a(int i11, b bVar) {
            ArrayList m131500h;
            AbstractC19074t.m100208f(bVar, "entry");
            ArrayList arrayList = this.f127440b;
            m131500h = AbstractC25368s.m131500h(bVar);
            arrayList.add(i11, m131500h);
        }

        /* renamed from: b */
        public final void m138892b() {
            this.f127439a.clear();
            this.f127440b.clear();
        }

        /* renamed from: c */
        public final ArrayList m138893c(int i11) {
            if (i11 == -1) {
                return this.f127439a;
            }
            Object obj = this.f127440b.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            return (ArrayList) obj;
        }

        /* renamed from: d */
        public final C22537f m138894d() {
            C22537f m116593p;
            m116593p = AbstractC22543l.m116593p(0, m138896f());
            return m116593p;
        }

        /* renamed from: e */
        public final void m138895e(int i11) {
            if (i11 == 0) {
                this.f127439a.addAll((Collection) this.f127440b.get(0));
            } else {
                ((ArrayList) this.f127440b.get(i11 - 1)).addAll((Collection) this.f127440b.get(i11));
            }
            this.f127440b.remove(i11);
        }

        /* renamed from: f */
        public final int m138896f() {
            return this.f127440b.size();
        }

        /* renamed from: g */
        public final void m138897g(int i11, b bVar) {
            AbstractC19074t.m100208f(bVar, "entry");
            ((ArrayList) this.f127440b.get(i11)).set(0, bVar);
        }
    }

    /* renamed from: u10.b$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a */
        private final c f127441a;

        /* renamed from: b */
        private final int f127442b;

        /* renamed from: c */
        private final int f127443c;

        public d(c cVar, int i11, int i12) {
            AbstractC19074t.m100208f(cVar, "map");
            this.f127441a = cVar;
            this.f127442b = i11;
            this.f127443c = i12;
        }

        /* renamed from: a */
        public final int m138898a() {
            return this.f127443c;
        }

        /* renamed from: b */
        public final int m138899b() {
            return this.f127442b;
        }

        /* renamed from: c */
        public final c m138900c() {
            return this.f127441a;
        }
    }

    /* renamed from: u10.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends RecyclerView.AbstractC1882i {

        /* renamed from: b */
        final /* synthetic */ C31179n0 f127445b;

        e(C31179n0 c31179n0) {
            this.f127445b = c31179n0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            C26948b.this.m138868c();
            int mo10003k = this.f127445b.mo10003k();
            for (int i11 = 0; i11 < mo10003k; i11++) {
                c cVar = C26948b.this.f127426a;
                int mo10005m = this.f127445b.mo10005m(i11);
                Object obj = this.f127445b.f143912B.get(i11);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                cVar.m138891a(i11, new b(mo10005m, (Video) obj, 0L, false, false, 28, null));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: b */
        public void mo10027b(int i11, int i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i11 + i13;
                int mo10005m = this.f127445b.mo10005m(i14);
                Object obj = this.f127445b.f143912B.get(i14);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                C26948b.this.f127426a.m138897g(i14, new b(mo10005m, (Video) obj, 0L, false, false, 28, null));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: c */
        public void mo10028c(int i11, int i12, Object obj) {
            if (obj == null) {
                mo10027b(i11, i12);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: d */
        public void mo10029d(int i11, int i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i11 + i13;
                int mo10005m = this.f127445b.mo10005m(i14);
                Object obj = this.f127445b.f143912B.get(i14);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                C26948b.this.f127426a.m138891a(i14, new b(mo10005m, (Video) obj, 0L, false, false, 28, null));
                if (mo10005m == 4) {
                    C26948b.this.m138873i(i14);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: f */
        public void mo10031f(int i11, int i12) {
            while (true) {
                i12--;
                if (-1 < i12) {
                    C26948b.this.f127426a.m138895e(i11 + i12);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private final boolean m138864h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).m138884b() == 4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m138865j(int i11) {
        Object m131205e0;
        ArrayList m138893c = this.f127426a.m138893c(i11);
        if (!m138893c.isEmpty()) {
            m131205e0 = AbstractC25332a0.m131205e0(m138893c);
            if (((b) m131205e0).m138884b() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m138866k(int i11) {
        Object m131205e0;
        ArrayList m138893c = this.f127426a.m138893c(i11);
        if (!m138893c.isEmpty()) {
            m131205e0 = AbstractC25332a0.m131205e0(m138893c);
            return ((b) m131205e0).m138887e();
        }
        return false;
    }

    /* renamed from: b */
    public final void m138867b(C31179n0 c31179n0) {
        AbstractC19074t.m100208f(c31179n0, "adapter");
        c31179n0.m9998I(new e(c31179n0));
    }

    /* renamed from: c */
    public final void m138868c() {
        this.f127428c = -1;
        this.f127429d = -1;
        this.f127426a.m138892b();
    }

    /* renamed from: d */
    public final int m138869d() {
        return this.f127429d;
    }

    /* renamed from: e */
    public final int m138870e(int i11) {
        int i12 = 0;
        while (-1 < i11) {
            if (m138865j(i11)) {
                i12++;
            }
            i11--;
        }
        return i12;
    }

    /* renamed from: f */
    public final int m138871f() {
        int i11 = 0;
        for (int i12 = this.f127429d; -2 < i12 && !m138864h(this.f127426a.m138893c(i12)); i12--) {
            if (m138865j(i12) && m138866k(i12)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: g */
    public final int m138872g() {
        Object m131206f0;
        long j11;
        ComplexAds.Config config = this.f127427b;
        int i11 = 0;
        if (config != null) {
            long m50885e = config.m50885e();
            for (int i12 = this.f127428c; -1 < i12; i12--) {
                ArrayList m138893c = this.f127426a.m138893c(i12);
                if (m138864h(m138893c)) {
                    break;
                }
                m131206f0 = AbstractC25332a0.m131206f0(m138893c);
                b bVar = (b) m131206f0;
                if (bVar != null) {
                    j11 = bVar.m138885c();
                } else {
                    j11 = 0;
                }
                if (j11 >= m50885e) {
                    i11++;
                }
            }
        }
        return i11;
    }

    /* renamed from: i */
    public final void m138873i(int i11) {
        Object m131206f0;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f127426a.m138893c(i12));
                b bVar = (b) m131206f0;
                if (bVar != null) {
                    bVar.m138889g(false);
                }
                if (i12 != i11) {
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final void m138874l(int i11) {
        Object m131206f0;
        C22537f m138894d = this.f127426a.m138894d();
        int m116547d = m138894d.m116547d();
        if (i11 <= m138894d.m116548e() && m116547d <= i11) {
            m131206f0 = AbstractC25332a0.m131206f0(this.f127426a.m138893c(i11));
            b bVar = (b) m131206f0;
            if (bVar == null) {
                return;
            }
            this.f127429d = i11;
            if (!bVar.m138886d()) {
                bVar.m138888f(true);
                this.f127428c = i11;
            }
            InterfaceC18494a interfaceC18494a = this.f127430e;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: m */
    public final void m138875m(String str, long j11) {
        boolean m127128x;
        int i11;
        Object m131206f0;
        String str2;
        InterfaceC18494a interfaceC18494a;
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x && (i11 = this.f127429d) != -1) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f127426a.m138893c(i11));
                b bVar = (b) m131206f0;
                if (bVar == null) {
                    return;
                }
                Video m138883a = bVar.m138883a();
                if (m138883a != null) {
                    str2 = m138883a.m52911t();
                } else {
                    str2 = null;
                }
                if (!AbstractC19074t.m100204b(str2, str)) {
                    return;
                }
                long m138885c = bVar.m138885c();
                if (m138885c > j11) {
                    return;
                }
                bVar.m138890h(j11);
                ComplexAds.Config config = this.f127427b;
                if (config != null && m138885c < config.m50885e() && j11 >= config.m50885e() && (interfaceC18494a = this.f127430e) != null) {
                    interfaceC18494a.mo12V4();
                }
            }
        }
    }

    /* renamed from: n */
    public final void m138876n(d dVar) {
        AbstractC19074t.m100208f(dVar, "savedInstance");
        this.f127426a = dVar.m138900c();
        this.f127428c = dVar.m138899b();
        this.f127429d = dVar.m138898a();
    }

    /* renamed from: o */
    public final void m138877o(ComplexAds.Config config) {
        InterfaceC18494a interfaceC18494a;
        this.f127427b = config;
        if (config != null && (interfaceC18494a = this.f127430e) != null) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: p */
    public final void m138878p(InterfaceC18494a interfaceC18494a) {
        this.f127430e = interfaceC18494a;
    }

    /* renamed from: q */
    public final d m138879q() {
        return new d(this.f127426a, this.f127428c, this.f127429d);
    }
}
