package p495rx;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0927o;
import android.text.TextUtils;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18011x0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23160o0;
import org.json.JSONArray;
import org.json.JSONObject;
import p363nh.C23744a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import pm0.C24848g0;

/* renamed from: rx.n */
/* loaded from: classes4.dex */
public final class C26000n {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f124026a;

    /* renamed from: b */
    private long f124027b;

    /* renamed from: c */
    private final C1761c0 f124028c;

    /* renamed from: d */
    private final ArrayList f124029d;

    /* renamed from: e */
    private int f124030e;

    /* renamed from: f */
    private long f124031f;

    /* renamed from: g */
    private long f124032g;

    /* renamed from: h */
    private final C1761c0 f124033h;

    /* renamed from: rx.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: rx.n$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            String optString;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                if (C26000n.this.m133949B() && (optJSONObject = ((JSONObject) obj).optJSONObject("data")) != null) {
                    if (AbstractC25495a.m132079d(C26000n.this.m133962n())) {
                        optString = "group_" + optJSONObject.optString("groupId");
                    } else {
                        optString = optJSONObject.optString("friendId");
                    }
                    if (AbstractC19074t.m100204b(C26000n.this.m133962n(), optString)) {
                        int optInt = optJSONObject.optInt("maxBoardItems", 10);
                        long optLong = optJSONObject.optLong("boardVersion");
                        C26000n c26000n = C26000n.this;
                        synchronized (c26000n) {
                            try {
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArray = optJSONObject.getJSONArray("items");
                                int length = jSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    Object obj2 = jSONArray.get(i11);
                                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                    C7904b c7904b = new C7904b((JSONObject) obj2, c26000n.m133962n());
                                    AbstractC25989c.m133908a(c7904b);
                                    arrayList.add(c7904b);
                                }
                                c26000n.m133955P(optInt);
                                c26000n.m133952J(optLong, arrayList);
                                c26000n.m133953L(AbstractC23160o0.m119186C0(), false);
                                String str = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str, "currentUserUid");
                                c26000n.m133927D(str);
                                c26000n.m133929G();
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: rx.n$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            String optString;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                if (C26000n.this.m133949B() && (optJSONObject = ((JSONObject) obj).optJSONObject("data")) != null) {
                    if (AbstractC25495a.m132079d(C26000n.this.m133962n())) {
                        optString = "group_" + optJSONObject.optString("groupId");
                    } else {
                        optString = optJSONObject.optString("friendId");
                    }
                    if (AbstractC19074t.m100204b(C26000n.this.m133962n(), optString)) {
                        long optLong = optJSONObject.optLong("boardVersion");
                        int optInt = optJSONObject.optInt("maxBoardItems", 10);
                        C26000n c26000n = C26000n.this;
                        synchronized (c26000n) {
                            try {
                                if (c26000n.f124027b != 0 && optLong <= c26000n.f124027b) {
                                    c26000n.m133953L(AbstractC23160o0.m119186C0(), true);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                }
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArray = optJSONObject.getJSONArray("items");
                                int length = jSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    Object obj2 = jSONArray.get(i11);
                                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                    JSONObject jSONObject = (JSONObject) obj2;
                                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                                    aVar.mo104548a("PinBoardRepository -> received from server: %s", jSONObject);
                                    C7904b c7904b = new C7904b(jSONObject, c26000n.m133962n());
                                    AbstractC25989c.m133908a(c7904b);
                                    aVar.mo104548a("PinBoardRepository -> attachJson converted: %s", c7904b.m40764b());
                                    arrayList.add(c7904b);
                                }
                                c26000n.m133955P(optInt);
                                c26000n.m133952J(optLong, arrayList);
                                c26000n.m133953L(AbstractC23160o0.m119186C0(), false);
                                String str = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str, "currentUserUid");
                                c26000n.m133927D(str);
                                c26000n.m133929G();
                                C24848g0 c24848g02 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public C26000n(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "conversationId");
        this.f124030e = 10;
        this.f124033h = new C1761c0();
        this.f124026a = str;
        this.f124029d = new ArrayList();
        this.f124028c = new C1761c0();
        if (z11) {
            m133947s();
        }
    }

    /* renamed from: D */
    public final void m133927D(String str) {
        this.f124033h.mo9221n(str);
    }

    /* renamed from: E */
    private final void m133928E() {
        this.f124028c.mo9221n(this.f124029d);
        C23744a.Companion.m124119a().m124116d(132, this.f124026a);
    }

    /* renamed from: G */
    public final void m133929G() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.l
            public /* synthetic */ RunnableC25998l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26000n.m133930H(C26000n.this);
            }
        });
    }

    /* renamed from: H */
    public static final void m133930H(C26000n c26000n) {
        AbstractC19074t.m100208f(c26000n, "this$0");
        C7960e.m41971c6().m42143H8(c26000n.f124026a, c26000n.f124027b, c26000n.f124029d, c26000n.f124030e, c26000n.f124031f, c26000n.f124032g);
    }

    /* renamed from: I */
    private final void m133931I(long j11) {
        synchronized (this) {
            this.f124027b = j11;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: K */
    private final void m133932K(ArrayList arrayList) {
        synchronized (this.f124029d) {
            this.f124029d.clear();
            this.f124029d.addAll(arrayList);
        }
        m133928E();
    }

    /* renamed from: M */
    public static final void m133933M(C26000n c26000n, long j11) {
        AbstractC19074t.m100208f(c26000n, "this$0");
        C7960e.m41971c6().m42157Id(c26000n.f124026a, j11);
    }

    /* renamed from: O */
    public static final void m133934O(C26000n c26000n, long j11) {
        AbstractC19074t.m100208f(c26000n, "this$0");
        C7960e.m41971c6().m42170Jd(c26000n.f124026a, j11);
    }

    /* renamed from: Q */
    private final void m133935Q() {
        if (!m133949B()) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c());
        if (AbstractC25495a.m132079d(this.f124026a)) {
            c0766k.mo1437G8(AbstractC25495a.m132088m(this.f124026a), this.f124027b);
        } else {
            c0766k.mo1434G5(this.f124026a, this.f124027b);
        }
    }

    /* renamed from: U */
    public static final void m133936U(C26000n c26000n) {
        boolean z11;
        AbstractC19074t.m100208f(c26000n, "this$0");
        synchronized (c26000n.f124029d) {
            try {
                Iterator it = c26000n.f124029d.iterator();
                z11 = false;
                while (it.hasNext()) {
                    if (AbstractC25989c.m133908a((C7904b) it.next())) {
                        z11 = true;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            c26000n.m133928E();
        }
    }

    /* renamed from: f */
    public static final void m133942f(C26000n c26000n) {
        AbstractC19074t.m100208f(c26000n, "this$0");
        C26000n m42072B6 = C7960e.m41971c6().m42072B6(c26000n.f124026a);
        if (m42072B6 != null) {
            long j11 = m42072B6.f124027b;
            if (j11 > c26000n.f124027b) {
                c26000n.f124030e = m42072B6.f124030e;
                c26000n.m133952J(j11, m42072B6.f124029d);
                c26000n.m133953L(m42072B6.f124031f, false);
                c26000n.m133954N(m42072B6.f124032g, false);
            }
        }
    }

    /* renamed from: k */
    private final boolean m133946k(long j11, long j12) {
        long j13 = this.f124027b;
        if (j13 == j11) {
            return true;
        }
        if (j13 < j12) {
            m133935Q();
        }
        return false;
    }

    /* renamed from: s */
    private final C24848g0 m133947s() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.k
            public /* synthetic */ RunnableC25997k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26000n.m133942f(C26000n.this);
            }
        });
        return C24848g0.f119245a;
    }

    /* renamed from: A */
    public final boolean m133948A() {
        if (AbstractC23160o0.m119186C0() - this.f124027b > 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m133949B() {
        if (AbstractC25495a.m132079d(this.f124026a) && C25489b.f122105a.m132046f(this.f124026a)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final LiveData m133950C() {
        return this.f124033h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:            java.util.Collections.swap(r11, r2, r6);        r2 = r2 + 1;     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m133951F(long j11, long j12, String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "actorUid");
        if (m133946k(j11, j12)) {
            synchronized (this.f124029d) {
                try {
                    ArrayList arrayList2 = new ArrayList(this.f124029d);
                    if (arrayList != null && arrayList.size() == this.f124029d.size()) {
                        int size = arrayList.size();
                        int i11 = 0;
                        loop0: while (i11 < size) {
                            C25988b c25988b = (C25988b) arrayList.get(i11);
                            if (c25988b != null) {
                                String m133906a = c25988b.m133906a();
                                int m133907b = c25988b.m133907b();
                                int size2 = arrayList2.size();
                                int i12 = i11;
                                while (i12 < size2) {
                                    C7904b c7904b = (C7904b) arrayList2.get(i12);
                                    AbstractC19074t.m100205c(c7904b);
                                    if (!AbstractC19074t.m100204b(c7904b.f42715C, m133906a) || c7904b.f42729a != m133907b) {
                                        i12++;
                                    }
                                }
                            }
                        }
                        m133952J(j12, arrayList2);
                        m133927D(str);
                        m133953L(AbstractC23160o0.m119186C0(), false);
                        m133929G();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    m133935Q();
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: J */
    public final void m133952J(long j11, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "dataPinBoard");
        m133932K(arrayList);
        m133931I(j11);
    }

    /* renamed from: L */
    public final void m133953L(long j11, boolean z11) {
        this.f124031f = j11;
        if (z11) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.m

                /* renamed from: q */
                public final /* synthetic */ long f124025q;

                public /* synthetic */ RunnableC25999m(long j112) {
                    r2 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26000n.m133933M(C26000n.this, r2);
                }
            });
        }
    }

    /* renamed from: N */
    public final void m133954N(long j11, boolean z11) {
        boolean m133969v = m133969v();
        this.f124032g = j11;
        if (z11 && m133969v) {
            C23744a.Companion.m124119a().m124116d(132, this.f124026a);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.i

                /* renamed from: q */
                public final /* synthetic */ long f124020q;

                public /* synthetic */ RunnableC25995i(long j112) {
                    r2 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26000n.m133934O(C26000n.this, r2);
                }
            });
        }
    }

    /* renamed from: P */
    public final void m133955P(int i11) {
        this.f124030e = i11;
    }

    /* renamed from: R */
    public final void m133956R(long j11, long j12, String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "actorUid");
        if (m133946k(j11, j12)) {
            synchronized (this.f124029d) {
                int i12 = 0;
                while (i12 < this.f124029d.size()) {
                    try {
                        Object obj = this.f124029d.get(i12);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        C7904b c7904b = (C7904b) obj;
                        if (TextUtils.equals(c7904b.f42715C, str2) && c7904b.f42729a == i11) {
                            this.f124029d.remove(i12);
                            i12--;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m133931I(j12);
            m133953L(AbstractC23160o0.m119186C0(), false);
            m133929G();
            m133927D(str);
            m133928E();
        }
    }

    /* renamed from: S */
    public final void m133957S(long j11, long j12, String str, C7904b c7904b) {
        AbstractC19074t.m100208f(str, "actorUid");
        AbstractC19074t.m100208f(c7904b, "newTopic");
        if (m133946k(j11, j12)) {
            synchronized (this.f124029d) {
                try {
                    int size = this.f124029d.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj = this.f124029d.get(i11);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        C7904b c7904b2 = (C7904b) obj;
                        if (TextUtils.equals(c7904b2.f42715C, c7904b.f42715C) && c7904b2.f42729a == c7904b.f42729a) {
                            this.f124029d.set(i11, c7904b);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m133931I(j12);
            m133929G();
            m133953L(AbstractC23160o0.m119186C0(), false);
            m133927D(str);
            m133928E();
        }
    }

    /* renamed from: T */
    public final void m133958T() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.j
            public /* synthetic */ RunnableC25996j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26000n.m133936U(C26000n.this);
            }
        });
    }

    /* renamed from: j */
    public final void m133959j() {
        long m4304w1;
        if (AbstractC25495a.m132079d(this.f124026a)) {
            m4304w1 = AbstractC0924m0.m4333x1();
        } else {
            m4304w1 = AbstractC0924m0.m4304w1();
        }
        if (this.f124031f == 0 || AbstractC23160o0.m119186C0() - this.f124031f >= m4304w1) {
            m133935Q();
        }
    }

    /* renamed from: l */
    public final void m133960l() {
        if (!m133949B()) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b());
        if (AbstractC25495a.m132079d(this.f124026a)) {
            c0766k.mo1437G8(AbstractC25495a.m132088m(this.f124026a), 0L);
        } else {
            c0766k.mo1434G5(this.f124026a, 0L);
        }
    }

    /* renamed from: m */
    public final long m133961m() {
        return this.f124027b;
    }

    /* renamed from: n */
    public final String m133962n() {
        return this.f124026a;
    }

    /* renamed from: o */
    public final boolean m133963o() {
        if (this.f124029d.size() >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final ArrayList m133964p() {
        return this.f124029d;
    }

    /* renamed from: q */
    public final LiveData m133965q() {
        return this.f124028c;
    }

    /* renamed from: r */
    public final int m133966r() {
        return this.f124030e;
    }

    /* renamed from: t */
    public final C7904b m133967t(C17945a0 c17945a0) {
        C18011x0 c18011x0;
        String str;
        Object obj = null;
        if (c17945a0 == null) {
            return null;
        }
        if (c17945a0.m94899G7()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C18011x0) {
                c18011x0 = (C18011x0) m94929K2;
            } else {
                c18011x0 = null;
            }
            if (c18011x0 != null) {
                str = c18011x0.f91248K;
            } else {
                str = null;
            }
            Iterator it = this.f124029d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C7904b c7904b = (C7904b) next;
                if (AbstractC19074t.m100204b(c7904b.f42715C, str) && c7904b.f42729a == 3) {
                    obj = next;
                    break;
                }
            }
            return (C7904b) obj;
        }
        Iterator it2 = this.f124029d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            C7904b c7904b2 = (C7904b) next2;
            if (c7904b2.f42729a == 2 && AbstractC19074t.m100204b(c7904b2.f42747s, c17945a0.m95029V3())) {
                obj = next2;
                break;
            }
        }
        return (C7904b) obj;
    }

    /* renamed from: u */
    public final C7904b m133968u(C25988b c25988b) {
        Object obj;
        AbstractC19074t.m100208f(c25988b, "topicMask");
        Iterator it = this.f124029d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C7904b c7904b = (C7904b) obj;
                if (AbstractC19074t.m100204b(c7904b.f42715C, c25988b.m133906a()) && c7904b.f42729a == c25988b.m133907b()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C7904b) obj;
    }

    /* renamed from: v */
    public final boolean m133969v() {
        return this.f124027b > this.f124032g;
    }

    /* renamed from: w */
    public final void m133970w(long j11, long j12, String str, String str2, int i11, C7904b c7904b) {
        AbstractC19074t.m100208f(str, "actorUid");
        AbstractC19074t.m100208f(c7904b, "newTopic");
        if (m133946k(j11, j12)) {
            synchronized (this.f124029d) {
                int i12 = 0;
                while (i12 < this.f124029d.size()) {
                    try {
                        Object obj = this.f124029d.get(i12);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        C7904b c7904b2 = (C7904b) obj;
                        if (TextUtils.equals(c7904b2.f42715C, c7904b.f42715C)) {
                            if (c7904b2.f42729a != c7904b.f42729a) {
                            }
                            this.f124029d.remove(i12);
                            i12--;
                            i12++;
                        }
                        if (TextUtils.equals(c7904b2.f42715C, str2)) {
                            if (c7904b2.f42729a != i11) {
                            }
                            this.f124029d.remove(i12);
                            i12--;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f124029d.add(0, c7904b);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m133931I(j12);
            m133953L(AbstractC23160o0.m119186C0(), false);
            m133929G();
            m133927D(str);
            m133928E();
        }
    }

    /* renamed from: x */
    public final boolean m133971x(C7904b c7904b) {
        AbstractC19074t.m100208f(c7904b, "topicInfo");
        try {
            String str = c7904b.f42715C;
            if (str != null) {
                AbstractC19074t.m100207e(str, "id");
                if (m133968u(new C25988b(str, c7904b.f42729a)) != null) {
                    return true;
                }
            }
            if (TextUtils.isEmpty(c7904b.f42715C) && c7904b.f42729a == 2) {
                MessageId messageId = c7904b.f42747s;
                Iterator it = this.f124029d.iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(messageId, ((C7904b) it.next()).f42747s)) {
                        return true;
                    }
                }
                int size = this.f124029d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = this.f124029d.get(i11);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    if (AbstractC19074t.m100204b(messageId, ((C7904b) obj).f42747s)) {
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m133972y(C17945a0 c17945a0) {
        if (m133967t(c17945a0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m133973z() {
        if (this.f124029d.size() >= this.f124030e) {
            return true;
        }
        return false;
    }

    public C26000n(String str, long j11, ArrayList arrayList, int i11, long j12, long j13) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(arrayList, "listPinBoard");
        this.f124030e = 10;
        this.f124033h = new C1761c0();
        this.f124026a = str;
        this.f124027b = j11;
        this.f124030e = i11;
        this.f124031f = j12;
        this.f124032g = j13;
        this.f124029d = arrayList;
        this.f124028c = new C1761c0(arrayList);
    }
}
