package p103di;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import au.EnumC2382z;
import ci.AbstractC3501f0;
import ci.C3499e0;
import ci.C3521p0;
import ci.C3526u;
import ci.C3529x;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import java.util.ArrayList;
import java.util.List;
import p103di.AbstractC17936c;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: di.h */
/* loaded from: classes3.dex */
public class C17941h extends AbstractC17936c {

    /* renamed from: i */
    private final String f90559i;

    /* renamed from: j */
    private final boolean f90560j;

    /* renamed from: k */
    private final a f90561k;

    /* renamed from: l */
    private boolean f90562l;

    /* renamed from: m */
    private final InterfaceC24854k f90563m;

    /* renamed from: n */
    private final Object f90564n;

    /* renamed from: o */
    private boolean f90565o;

    /* renamed from: p */
    private boolean f90566p;

    /* renamed from: q */
    private C3521p0 f90567q;

    /* renamed from: r */
    private AbstractC3501f0 f90568r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: di.h$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f90569p = new a("SOURCE_FROM_MEDIA_CATE", 0);

        /* renamed from: q */
        public static final a f90570q = new a("SOURCE_FROM_SEARCH_RESULT_FULL", 1);

        /* renamed from: r */
        private static final /* synthetic */ a[] f90571r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f90572s;

        static {
            a[] m94629b = m94629b();
            f90571r = m94629b;
            f90572s = AbstractC30166b.m148796a(m94629b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m94629b() {
            return new a[]{f90569p, f90570q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f90571r.clone();
        }
    }

    /* renamed from: di.h$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3499e0 mo12V4() {
            return C17941h.this.mo94614F();
        }
    }

    /* renamed from: di.h$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC3501f0 {
        c() {
        }

        @Override // ci.AbstractC3501f0
        /* renamed from: a */
        public void mo17659a(String str, EnumC2382z enumC2382z, C3529x c3529x, boolean z11) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (TextUtils.equals(str, C17941h.this.m94621A().m17608M()) && enumC2382z == EnumC2382z.f9945r) {
                C17941h.this.mo94615G(c3529x, z11);
            }
        }

        @Override // ci.AbstractC3501f0
        /* renamed from: b */
        public void mo17660b(String str, EnumC2382z enumC2382z, List list, boolean z11) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            AbstractC19074t.m100208f(list, "deletedMsgIds");
            if (TextUtils.equals(str, C17941h.this.m94621A().m17608M()) && C17941h.this.m94622B()) {
                C17941h.this.mo94613D(list);
            }
        }

        @Override // ci.AbstractC3501f0
        /* renamed from: d */
        public void mo17662d(String str, EnumC2382z enumC2382z, boolean z11, C20096c c20096c) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (TextUtils.equals(str, C17941h.this.m94621A().m17608M()) && enumC2382z == EnumC2382z.f9945r) {
                C17941h.this.mo94616H();
            }
        }
    }

    public C17941h(String str, boolean z11, a aVar) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "mConversationId");
        AbstractC19074t.m100208f(aVar, "mMediaStoreDataSource");
        this.f90559i = str;
        this.f90560j = z11;
        this.f90561k = aVar;
        m129210a = AbstractC24856m.m129210a(new b());
        this.f90563m = m129210a;
        this.f90564n = new Object();
        C3521p0 m120569C0 = AbstractC23306f.m120569C0();
        AbstractC19074t.m100207e(m120569C0, "provideMediaStoresManager(...)");
        this.f90567q = m120569C0;
        this.f90568r = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m94617E(C17941h c17941h) {
        AbstractC19074t.m100208f(c17941h, "this$0");
        AbstractC17936c.b m94594i = c17941h.m94594i();
        if (m94594i != null) {
            m94594i.mo66899a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m94618I(C17941h c17941h) {
        AbstractC19074t.m100208f(c17941h, "this$0");
        AbstractC17936c.b m94594i = c17941h.m94594i();
        if (m94594i != null) {
            m94594i.mo66899a();
        }
    }

    /* renamed from: A */
    public final C3499e0 m94621A() {
        return (C3499e0) this.f90563m.getValue();
    }

    /* renamed from: B */
    public final boolean m94622B() {
        return this.f90565o;
    }

    /* renamed from: C */
    public final C3521p0 m94623C() {
        return this.f90567q;
    }

    /* renamed from: D */
    public void mo94613D(List list) {
        AbstractC19074t.m100208f(list, "deletedMsgIds");
        if (!this.f90565o) {
            return;
        }
        m94603s(list, false);
        if (this.f90562l) {
            synchronized (m94596k()) {
                m94593h().clear();
                m94593h().addAll(m94621A().m17613R());
            }
            m94589d().post(new Runnable() { // from class: di.f
                @Override // java.lang.Runnable
                public final void run() {
                    C17941h.m94617E(C17941h.this);
                }
            });
        }
    }

    /* renamed from: F */
    public C3499e0 mo94614F() {
        return this.f90567q.m17791p(new CreateMediaStoreParam(this.f90559i, null, null, 6, null));
    }

    /* renamed from: G */
    public void mo94615G(C3529x c3529x, boolean z11) {
    }

    /* renamed from: H */
    public void mo94616H() {
        this.f90566p = false;
        if (this.f90565o && this.f90562l) {
            synchronized (m94596k()) {
                m94593h().clear();
                m94593h().addAll(m94621A().m17613R());
            }
            m94589d().post(new Runnable() { // from class: di.g
                @Override // java.lang.Runnable
                public final void run() {
                    C17941h.m94618I(C17941h.this);
                }
            });
        }
    }

    /* renamed from: J */
    public final void m94624J(boolean z11) {
        this.f90566p = z11;
    }

    /* renamed from: K */
    public final void m94625K(boolean z11) {
        this.f90565o = z11;
    }

    /* renamed from: L */
    public final void m94626L(boolean z11) {
        this.f90562l = z11;
        if (z11) {
            this.f90565o = true;
            List arrayList = new ArrayList();
            if (this.f90561k == a.f90570q) {
                C3526u m17610O = m94621A().m17610O();
                if (m17610O != null) {
                    arrayList = m17610O.m17844c();
                }
            } else {
                arrayList = m94621A().m17613R();
            }
            synchronized (m94596k()) {
                m94593h().clear();
                m94593h().addAll(arrayList);
            }
            return;
        }
        this.f90565o = false;
    }

    @Override // p103di.AbstractC17936c
    /* renamed from: o */
    public void mo94600o(List list, int i11, SparseIntArray sparseIntArray, SparseArray sparseArray, boolean z11) {
        super.mo94600o(list, i11, sparseIntArray, sparseArray, z11);
        m94621A().m17631o0(this.f90564n);
        m94621A().m17627m0(this.f90568r);
    }

    @Override // p103di.AbstractC17936c
    /* renamed from: p */
    public void mo94601p() {
        this.f90567q.m17794v(m94621A(), this.f90564n);
        m94621A().m17637s0(this.f90568r);
    }

    /* renamed from: y */
    public final String m94627y() {
        return this.f90559i;
    }

    /* renamed from: z */
    public final boolean m94628z() {
        return this.f90566p;
    }
}
