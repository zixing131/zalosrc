package wa0;

import ch0.AbstractC3489d;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p019aj.C0876j;
import p213hl.C20087c;
import p716zh.C32034n6;
import qm0.AbstractC25366r;
import qm0.AbstractC25378x;
import ta0.AbstractC26611a;

/* renamed from: wa0.w */
/* loaded from: classes6.dex */
public final class C28897w extends AbstractC26611a {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final C20087c f133771I;

    /* renamed from: J */
    private final C0876j f133772J;

    /* renamed from: K */
    private final C32034n6 f133773K;

    /* renamed from: wa0.w$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wa0.w$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f133774q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17945a0 c17945a0) {
            super(1);
            this.f133774q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m94983Q3();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f133774q.m94983Q3()));
        }
    }

    /* renamed from: wa0.w$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f133775q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17945a0 c17945a0) {
            super(1);
            this.f133775q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            AbstractC19074t.m100208f(c13380a, "it");
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m94983Q3();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f133775q.m94983Q3()));
        }
    }

    public C28897w(C20087c c20087c, C0876j c0876j, C32034n6 c32034n6) {
        AbstractC19074t.m100208f(c20087c, "storageUsageRepo");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c32034n6, "fileCleaner");
        this.f133771I = c20087c;
        this.f133772J = c0876j;
        this.f133773K = c32034n6;
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: R */
    public List mo111798R(List list) {
        String str;
        Object obj;
        int i11;
        List m131496e;
        List m131496e2;
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        this.f133771I.m104458e(list);
        ArrayList arrayList = new ArrayList(m136587Y());
        List<C17945a0> m144302a = AbstractC28862a.m144302a(list);
        Iterator it = arrayList.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((C13380a) obj).m75072B()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C13380a c13380a = (C13380a) obj;
        if (c13380a != null) {
            str = c13380a.m75081a();
        }
        for (C17945a0 c17945a0 : m144302a) {
            if (AbstractC19074t.m100204b(str, c17945a0.m95029V3().m41044h())) {
                C7853b.Companion.m40150a().m40136j1();
            }
            AbstractC25378x.m131542D(arrayList, new b(c17945a0));
            AbstractC25378x.m131541C(m136590b0(), new c(c17945a0));
            if (AbstractC3489d.m17501i()) {
                i11 = 4;
            } else {
                i11 = 8;
            }
            C0876j c0876j = this.f133772J;
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            m131496e = AbstractC25366r.m131496e(c17945a0);
            c0876j.m2620X(mo95039W2, m131496e, i11);
            C0876j c0876j2 = this.f133772J;
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            m131496e2 = AbstractC25366r.m131496e(c17945a0);
            c0876j2.m2621Z(mo95039W22, m131496e2, "");
        }
        this.f133773K.m154504h(m144302a);
        return arrayList;
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: w0 */
    public List mo111806w0(List list) {
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        return mo111798R(list);
    }

    /* renamed from: z0 */
    public final void m144344z0(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadStorageUsageDetailsFromOwnerId(");
        sb2.append(str);
        sb2.append(")");
        if (!m136587Y().isEmpty()) {
            return;
        }
        if (str.length() == 0) {
            m136599l0(this.f133771I.m104460h());
        } else {
            m136599l0(this.f133771I.m104462j(str));
        }
    }
}
