package p455qo;

import bo.C2949b;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.C20834z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;

/* renamed from: qo.f0 */
/* loaded from: classes4.dex */
public final class C25408f0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121651a;

    /* renamed from: qo.f0$a */
    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a */
        private final C2949b f121652a;

        /* renamed from: b */
        private final long f121653b;

        public a(C2949b c2949b) {
            AbstractC19074t.m100208f(c2949b, "albumInfo");
            this.f121652a = c2949b;
            this.f121653b = c2949b.m13958a();
        }

        @Override // p455qo.C25408f0.c
        /* renamed from: a */
        public long mo131642a() {
            return this.f121653b;
        }

        @Override // p455qo.C25408f0.c
        /* renamed from: b */
        public void mo131643b(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            c3020p0.f12023C.f12106O.m13967j(this.f121652a.m13962e());
            c3020p0.f12023C.f12106O.m13965h(this.f121652a.m13960c());
            c3020p0.f12023C.f12106O.m13966i(this.f121652a.m13961d());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121652a, ((a) obj).f121652a);
        }

        public int hashCode() {
            return this.f121652a.hashCode();
        }

        public String toString() {
            return "ParamAlbumInfo(albumInfo=" + this.f121652a + ")";
        }
    }

    /* renamed from: qo.f0$b */
    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a */
        private final ProfileAlbumItem f121654a;

        /* renamed from: b */
        private final long f121655b;

        public b(ProfileAlbumItem profileAlbumItem) {
            AbstractC19074t.m100208f(profileAlbumItem, "profileAlbumItem");
            this.f121654a = profileAlbumItem;
            this.f121655b = profileAlbumItem.m46300c().m46277e();
        }

        @Override // p455qo.C25408f0.c
        /* renamed from: a */
        public long mo131642a() {
            return this.f121655b;
        }

        @Override // p455qo.C25408f0.c
        /* renamed from: b */
        public void mo131643b(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            c3020p0.f12023C.f12106O.m13967j(this.f121654a.m46300c().m46286n());
            c3020p0.f12023C.f12106O.m13965h(this.f121654a.m46300c().m46285m());
            c3020p0.f12023C.f12106O.m13966i(this.f121654a.m46300c().m46273a());
            c3020p0.f12042V = this.f121654a.m46300c().m46282j();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f121654a, ((b) obj).f121654a);
        }

        public int hashCode() {
            return this.f121654a.hashCode();
        }

        public String toString() {
            return "ParamProfileAlbumItem(profileAlbumItem=" + this.f121654a + ")";
        }
    }

    /* renamed from: qo.f0$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        long mo131642a();

        /* renamed from: b */
        void mo131643b(C3020p0 c3020p0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.f0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ c f121656q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(2);
            this.f121656q = cVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "feed");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            this.f121656q.mo131643b(c3020p0);
            C20834z0.f102412a.m108927f(true);
            return Boolean.TRUE;
        }
    }

    public C25408f0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(c cVar) {
        int m131511r;
        Object m131207g0;
        AbstractC19074t.m100208f(cVar, "params");
        List<C3000l0> m127477m = this.f121651a.m127477m();
        ArrayList arrayList = new ArrayList();
        for (C3000l0 c3000l0 : m127477m) {
            ArrayList arrayList2 = new ArrayList();
            List list = c3000l0.f11899s;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    List list2 = c3000l0.f11899s;
                    AbstractC19074t.m100207e(list2, "listNewFeed");
                    m131207g0 = AbstractC25332a0.m131207g0(list2, i11);
                    C3020p0 c3020p0 = (C3020p0) m131207g0;
                    if (c3020p0 != null && c3020p0.m14504e0() && c3020p0.f12023C.f12106O.m13958a() == cVar.mo131642a()) {
                        arrayList2.add(c3020p0);
                    }
                }
            }
            AbstractC25378x.m131548x(arrayList, arrayList2);
        }
        C24371m0 c24371m0 = this.f121651a;
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3020p0) it.next()).f12057p);
        }
        c24371m0.m127482t(arrayList3, new d(cVar));
    }

    public /* synthetic */ C25408f0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    public C25408f0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121651a = c24371m0;
    }
}
