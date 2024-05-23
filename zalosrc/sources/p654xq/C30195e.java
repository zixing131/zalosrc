package p654xq;

import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import p398oo.C24371m0;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p618wq.C29190a;
import p665y0.C30239a;
import pm0.C24848g0;
import qm0.AbstractC25370t;

/* renamed from: xq.e */
/* loaded from: classes4.dex */
public final class C30195e implements InterfaceC30192b {

    /* renamed from: a */
    private final C7960e f140243a;

    /* renamed from: b */
    private final InterfaceC26357f f140244b;

    /* renamed from: xq.e$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f140245q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start get local data ";
        }
    }

    /* renamed from: xq.e$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140246q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(0);
            this.f140246q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            int m131511r;
            List list = this.f140246q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29190a) it.next()).m145737a());
            }
            return "Get local data complete: " + arrayList + " - Detail: " + this.f140246q;
        }
    }

    /* renamed from: xq.e$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140247q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(0);
            this.f140247q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            int m131511r;
            List list = this.f140247q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29190a) it.next()).m145737a());
            }
            return "Start save to db: " + arrayList + " - Details: " + this.f140247q;
        }
    }

    /* renamed from: xq.e$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140248q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list) {
            super(0);
            this.f140248q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            int m131511r;
            List list = this.f140248q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29190a) it.next()).m145737a());
            }
            return "Save to db success: " + arrayList + " - Details: " + this.f140248q;
        }
    }

    public C30195e(C7960e c7960e, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c7960e, "databaseHelper");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f140243a = c7960e;
        this.f140244b = interfaceC26357f;
    }

    @Override // p654xq.InterfaceC30192b
    /* renamed from: a */
    public Object mo148862a(List list, Continuation continuation) {
        this.f140244b.mo135685a("REAL_TIME_LIKE_COMMENT", "LOCAL_SOURCE_SAVE_LIKE_COMMENT_TO_DATABASE", new c(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29190a c29190a = (C29190a) it.next();
            String m145737a = c29190a.m145737a();
            String jSONObject = c29190a.m145742f().toString();
            AbstractC19074t.m100207e(jSONObject, "toString(...)");
            linkedHashMap.put(m145737a, jSONObject);
        }
        this.f140243a.m42095D8(linkedHashMap);
        this.f140244b.mo135685a("REAL_TIME_LIKE_COMMENT", "LOCAL_SOURCE_SAVE_LIKE_COMMENT_TO_DATABASE", new d(list));
        return C24848g0.f119245a;
    }

    @Override // p654xq.InterfaceC30192b
    /* renamed from: b */
    public int mo148863b(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return C24371m0.Companion.m127483a().m127476l(str) + 1;
    }

    @Override // p654xq.InterfaceC30192b
    /* renamed from: c */
    public Object mo148864c(Continuation continuation) {
        this.f140244b.mo135685a("REAL_TIME_LIKE_COMMENT", "LOCAL_SOURCE_GET_LOCAL_LIKE_COMMENT_INFO", a.f140245q);
        C30239a m42130G6 = this.f140243a.m42130G6(CoreUtility.f89233i);
        ArrayList arrayList = new ArrayList();
        AbstractC19074t.m100205c(m42130G6);
        for (Map.Entry entry : m42130G6.entrySet()) {
            C29190a.a aVar = C29190a.f135245f;
            Object key = entry.getKey();
            AbstractC19074t.m100207e(key, "<get-key>(...)");
            arrayList.add(aVar.m145744b((String) key, new JSONObject((String) entry.getValue()).optJSONObject((String) entry.getKey())));
        }
        this.f140244b.mo135685a("REAL_TIME_LIKE_COMMENT", "LOCAL_SOURCE_GET_LOCAL_LIKE_COMMENT_INFO", new b(arrayList));
        return arrayList;
    }

    @Override // p654xq.InterfaceC30192b
    /* renamed from: d */
    public Object mo148865d(List list, Continuation continuation) {
        this.f140243a.m42077Bc(list);
        return C24848g0.f119245a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C30195e(C7960e c7960e, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this(c7960e, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
        if ((i11 & 1) != 0) {
            c7960e = C7960e.m41971c6();
            AbstractC19074t.m100207e(c7960e, "getInstance(...)");
        }
    }
}
