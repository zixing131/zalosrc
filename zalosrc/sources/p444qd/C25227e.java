package p444qd;

import android.util.SparseArray;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import km0.EnumC21773h;
import km0.InterfaceC21769d;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p348mi.AbstractC23309i;
import p480rd.C25734e;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sd.C26231b;

/* renamed from: qd.e */
/* loaded from: classes3.dex */
public final class C25227e {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f120988e;

    /* renamed from: a */
    private final InterfaceC25225c f120989a;

    /* renamed from: b */
    private final InterfaceC25223a f120990b;

    /* renamed from: c */
    private final InterfaceC29232g f120991c;

    /* renamed from: d */
    private final InterfaceC29232g f120992d;

    /* renamed from: qd.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f120993q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25227e mo12V4() {
            return c.f120994a.m130507a();
        }
    }

    /* renamed from: qd.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25227e m130506a() {
            return (C25227e) C25227e.f120988e.getValue();
        }
    }

    /* renamed from: qd.e$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f120994a = new c();

        /* renamed from: b */
        private static final C25227e f120995b = new C25227e(new C25226d(), new C25224b());

        private c() {
        }

        /* renamed from: a */
        public final C25227e m130507a() {
            return f120995b;
        }
    }

    /* renamed from: qd.e$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C25227e.this.f120989a.mo130489b());
        }
    }

    /* renamed from: qd.e$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C25227e.this.m130496k();
        }
    }

    /* renamed from: qd.e$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f120998a;

        /* renamed from: b */
        final /* synthetic */ C25734e f120999b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f121000c;

        f(InterfaceC18509p interfaceC18509p, C25734e c25734e, InterfaceC18505l interfaceC18505l) {
            this.f120998a = interfaceC18509p;
            this.f120999b = c25734e;
            this.f121000c = interfaceC18505l;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            AbstractC20110a.f98889a.mo104556o(8, "getListEventByRangeTime error: (" + i11 + ") " + str, new Object[0]);
            this.f120998a.mo240pC(Integer.valueOf(i11), str);
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            AbstractC20110a.f98889a.mo104556o(8, "getListEventByRangeTime success, id=" + this.f120999b.m132847e() + "-" + this.f120999b.m132846d(), new Object[0]);
            this.f121000c.mo205i9((JSONObject) obj);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f120993q);
        f120988e = m129210a;
    }

    public C25227e(InterfaceC25225c interfaceC25225c, InterfaceC25223a interfaceC25223a) {
        AbstractC19074t.m100208f(interfaceC25225c, "localDataSource");
        AbstractC19074t.m100208f(interfaceC25223a, "remoteDataSource");
        this.f120989a = interfaceC25225c;
        this.f120990b = interfaceC25223a;
        this.f120991c = AbstractC29233h.m145990a(new d());
        this.f120992d = AbstractC29233h.m145990a(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final List m130496k() {
        String mo130488a = this.f120989a.mo130488a();
        if (mo130488a == null || mo130488a.length() == 0) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(mo130488a);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i11)));
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
            return null;
        }
    }

    /* renamed from: d */
    public final void m130497d() {
        AbstractC20110a.f98889a.m104564x("BirthdayHubRepo").mo104556o(8, "clearAllMemCache", new Object[0]);
        this.f120991c.reset();
        this.f120992d.reset();
    }

    /* renamed from: e */
    public final int m130498e() {
        return this.f120989a.mo130491d();
    }

    /* renamed from: f */
    public final int m130499f() {
        return this.f120989a.mo130490c();
    }

    /* renamed from: g */
    public final int m130500g() {
        return ((Number) this.f120991c.getValue()).intValue();
    }

    /* renamed from: h */
    public final void m130501h(C25734e c25734e, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c25734e, "eventTimeRangeRequest");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f120990b.mo130487a(c25734e, new f(interfaceC18509p, c25734e, interfaceC18505l));
    }

    /* renamed from: i */
    public final List m130502i() {
        return (List) this.f120992d.getValue();
    }

    /* renamed from: j */
    public final SparseArray m130503j() {
        boolean z11;
        int m134873k;
        C18635e c18635e = null;
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
        AbstractC19074t.m100205c(mo98465a);
        if (!mo98465a.isEmpty()) {
            c18635e = mo98465a;
        }
        if (c18635e != null) {
            SparseArray sparseArray = new SparseArray();
            Calendar m134869f = C26231b.f124604a.m134869f();
            String m122303q0 = AbstractC23309i.m122303q0();
            if (m122303q0 != null && m122303q0.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z12 = true ^ z11;
            Iterator<E> it = c18635e.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                try {
                    C26231b c26231b = C26231b.f124604a;
                    AbstractC19074t.m100205c(contactProfile);
                    if (c26231b.m134875n(contactProfile, z12) && (m134873k = c26231b.m134873k(contactProfile, m134869f)) >= 0) {
                        ArrayList arrayList = (ArrayList) sparseArray.get(m134873k);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            sparseArray.put(m134873k, arrayList);
                        }
                        arrayList.add(contactProfile.f42434r);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("[BirthdayHub]", e11);
                }
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    /* renamed from: l */
    public final void m130504l(List list) {
        try {
            String str = "";
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                str = new JSONArray((Collection) list).toString();
                AbstractC19074t.m100207e(str, "toString(...)");
            }
            this.f120989a.mo130492e(str);
            this.f120992d.reset();
            m130502i();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }
}
