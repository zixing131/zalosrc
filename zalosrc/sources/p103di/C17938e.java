package p103di;

import android.util.SparseArray;
import android.util.SparseIntArray;
import au.EnumC2382z;
import ci.C3490a;
import ci.C3499e0;
import ci.C3529x;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p103di.AbstractC17936c;
import p103di.C17941h;
import pm0.C24848g0;

/* renamed from: di.e */
/* loaded from: classes3.dex */
public final class C17938e extends C17941h {

    /* renamed from: s */
    private C3529x f90554s;

    /* renamed from: t */
    private boolean f90555t;

    /* renamed from: u */
    private boolean f90556u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17938e(String str, boolean z11) {
        super(str, z11, C17941h.a.f90569p);
        AbstractC19074t.m100208f(str, "conversationId");
        this.f90556u = true;
    }

    /* renamed from: N */
    private final void m94610N(List list, String str) {
    }

    /* renamed from: O */
    private final void m94611O() {
        ArrayList arrayList;
        synchronized (m94596k()) {
            arrayList = new ArrayList(m94593h());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.mo104548a("tryMergingDataFromMediaStore: START", new Object[0]);
        aVar.mo104548a("tryMergingDataFromMediaStore: mMediaList size= %s", Integer.valueOf(arrayList.size()));
        m94610N(arrayList, " 1.CURRENT combine:");
        List m17602E = m94621A().m17602E(arrayList, this.f90556u);
        m94610N(m17602E, " 2.CHAT combine:");
        aVar.mo104548a("tryMergingDataFromMediaStore: mMediaList merged= %s", Integer.valueOf(m17602E.size()));
        if (m17602E == arrayList) {
            aVar.mo104548a("tryMergingDataFromMediaStore: Same list returned. ABORT!", new Object[0]);
            this.f90555t = false;
            return;
        }
        if (m17602E.isEmpty()) {
            aVar.mo104548a("tryMergingDataFromMediaStore: Empty list returned. ABORT!", new Object[0]);
            this.f90555t = false;
            return;
        }
        synchronized (m94596k()) {
            try {
                HashMap hashMap = new HashMap(m94592g());
                HashMap hashMap2 = new HashMap(m94591f());
                m94593h().clear();
                m94593h().addAll(m17602E);
                m94592g().clear();
                m94591f().clear();
                m94590e().clear();
                int size = m94593h().size();
                for (int i11 = 0; i11 < size; i11++) {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) m94593h().get(i11);
                    AbstractC17936c.a aVar2 = (AbstractC17936c.a) hashMap.get(itemAlbumMobile.m40495B());
                    if (aVar2 == null) {
                        aVar2 = (AbstractC17936c.a) hashMap2.get(itemAlbumMobile.m40534w());
                    }
                    if (aVar2 == null) {
                        aVar2 = new AbstractC17936c.a();
                    }
                    if (itemAlbumMobile.m40508S()) {
                        Map m94592g = m94592g();
                        String m40495B = itemAlbumMobile.m40495B();
                        AbstractC19074t.m100207e(m40495B, "getGlobalMsgId(...)");
                        m94592g.put(m40495B, aVar2);
                    }
                    if (itemAlbumMobile.m40507R()) {
                        Map m94591f = m94591f();
                        String m40534w = itemAlbumMobile.m40534w();
                        AbstractC19074t.m100207e(m40534w, "getClientMsgId(...)");
                        m94591f.put(m40534w, aVar2);
                    }
                    m94590e().add(aVar2);
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m94625K(true);
        m94589d().post(new Runnable() { // from class: di.d
            @Override // java.lang.Runnable
            public final void run() {
                C17938e.m94612P(C17938e.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m94612P(C17938e c17938e) {
        AbstractC19074t.m100208f(c17938e, "this$0");
        AbstractC17936c.b m94594i = c17938e.m94594i();
        if (m94594i != null) {
            m94594i.mo66899a();
        }
        c17938e.f90555t = true;
    }

    @Override // p103di.C17941h
    /* renamed from: D */
    public void mo94613D(List list) {
        AbstractC19074t.m100208f(list, "deletedMsgIds");
        super.mo94613D(list);
        if (m94622B() && this.f90555t) {
            m94611O();
        }
    }

    @Override // p103di.C17941h
    /* renamed from: F */
    public C3499e0 mo94614F() {
        return m94623C().m17792q(m94627y());
    }

    @Override // p103di.C17941h
    /* renamed from: G */
    public void mo94615G(C3529x c3529x, boolean z11) {
        String str;
        String str2;
        if (!AbstractC19074t.m100204b(c3529x, this.f90554s)) {
            return;
        }
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        Object[] objArr = new Object[1];
        if (c3529x != null) {
            str = c3529x.m17880b();
        } else {
            str = null;
        }
        objArr[0] = str;
        aVar.mo104548a("onFindMediaStoreTargetResult: START targetInfo= %s", objArr);
        if (!z11) {
            Object[] objArr2 = new Object[1];
            if (c3529x != null) {
                str2 = c3529x.m17880b();
            } else {
                str2 = null;
            }
            objArr2[0] = str2;
            aVar.mo104548a("onFindMediaStoreTargetResult: NOT FOUND! targetInfo= %s", objArr2);
        }
        m94611O();
        synchronized (m94596k()) {
            this.f90554s = null;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    @Override // p103di.C17941h
    /* renamed from: H */
    public void mo94616H() {
        super.mo94616H();
        if (this.f90555t) {
            m94611O();
        }
    }

    @Override // p103di.AbstractC17936c
    /* renamed from: c */
    public void mo94588c() {
        if (this.f90555t && !m94628z()) {
            m94624J(true);
            AbstractC20110a.f98889a.mo104548a("checkLoadDataFromMediaStore: Load more data : ", new Object[0]);
            m94621A().m17623g0(new C3490a(EnumC2382z.f9945r, true));
        }
    }

    @Override // p103di.C17941h, p103di.AbstractC17936c
    /* renamed from: o */
    public void mo94600o(List list, int i11, SparseIntArray sparseIntArray, SparseArray sparseArray, boolean z11) {
        ItemAlbumMobile itemAlbumMobile;
        MessageId m40496C;
        super.mo94600o(list, i11, sparseIntArray, sparseArray, z11);
        this.f90556u = z11;
        AbstractC20110a.f98889a.mo104548a(" INIT POSITION", new Object[0]);
        List m94595j = m94595j();
        if (m94595j != null && (!m94595j.isEmpty()) && i11 < m94595j.size() && (m40496C = (itemAlbumMobile = (ItemAlbumMobile) m94595j.get(i11)).m40496C()) != null) {
            if (m40496C.m41052p() || m40496C.m41053q()) {
                C3529x c3529x = new C3529x();
                EnumC2382z enumC2382z = EnumC2382z.f9945r;
                c3529x.m17884f(enumC2382z);
                c3529x.m17887i(2);
                c3529x.m17885g(m40496C);
                c3529x.m17886h(itemAlbumMobile.f42564O - 3600000);
                synchronized (m94596k()) {
                    this.f90554s = c3529x;
                    m94621A().m17605I(enumC2382z, c3529x);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }
    }
}
