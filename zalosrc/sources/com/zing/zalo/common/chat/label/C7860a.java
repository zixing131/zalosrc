package com.zing.zalo.common.chat.label;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import am.AbstractC0924m0;
import am.C0943w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7962g;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.C19636i1;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p102dh.C17931a;
import p130eh.C18430a;
import p130eh.C18431b;
import p132ej.C18440b;
import p132ej.C18446h;
import p132ej.C18451m;
import p148f3.C18711c;
import p304ks.AbstractC21935u;
import p405ov.C24559a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: com.zing.zalo.common.chat.label.a */
/* loaded from: classes3.dex */
public final class C7860a {
    public static final b Companion = new b(null);

    /* renamed from: t */
    private static final InterfaceC29232g f42267t = AbstractC29233h.m145990a(a.f42287q);

    /* renamed from: a */
    private long f42268a;

    /* renamed from: b */
    private long f42269b;

    /* renamed from: c */
    private AtomicBoolean f42270c;

    /* renamed from: d */
    private final AtomicBoolean f42271d;

    /* renamed from: e */
    private final Map f42272e;

    /* renamed from: f */
    private final HashMap f42273f;

    /* renamed from: g */
    private final HashMap f42274g;

    /* renamed from: h */
    private final Map f42275h;

    /* renamed from: i */
    private final Map f42276i;

    /* renamed from: j */
    private final List f42277j;

    /* renamed from: k */
    private final List f42278k;

    /* renamed from: l */
    private C18431b f42279l;

    /* renamed from: m */
    private final AtomicBoolean f42280m;

    /* renamed from: n */
    private final AtomicBoolean f42281n;

    /* renamed from: o */
    private boolean f42282o;

    /* renamed from: p */
    private boolean f42283p;

    /* renamed from: q */
    private String f42284q;

    /* renamed from: r */
    private boolean f42285r;

    /* renamed from: s */
    private boolean f42286s;

    /* renamed from: com.zing.zalo.common.chat.label.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f42287q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C7860a mo12V4() {
            return new C7860a(null);
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final C7860a m40302a() {
            return (C7860a) C7860a.f42267t.getValue();
        }

        /* renamed from: b */
        public final C7860a m40303b() {
            return m40302a();
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.a$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo40215a(C20096c c20096c);

        /* renamed from: b */
        void mo40216b(Object obj);

        /* renamed from: c */
        void mo40217c();

        /* renamed from: d */
        void mo40218d();
    }

    /* renamed from: com.zing.zalo.common.chat.label.a$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f42289b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f42290c;

        /* renamed from: d */
        final /* synthetic */ c f42291d;

        /* renamed from: e */
        final /* synthetic */ String f42292e;

        d(int i11, ArrayList arrayList, c cVar, String str) {
            this.f42289b = i11;
            this.f42290c = arrayList;
            this.f42291d = cVar;
            this.f42292e = str;
        }

        /* renamed from: d */
        public static final void m40305d(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "$listInsertOrUpdate");
            C17931a.Companion.m94570a().m94569y(arrayList);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C7860a.this.m40292p0(false);
                c cVar = this.f42291d;
                if (cVar != null) {
                    cVar.mo40215a(c20096c);
                    cVar.mo40218d();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            long j11;
            long j12;
            ArrayList arrayList;
            HashMap hashMap;
            Collection values;
            try {
                C7860a.this.m40292p0(false);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    C7860a c7860a = C7860a.this;
                    int i11 = this.f42289b;
                    ArrayList arrayList2 = this.f42290c;
                    c cVar = this.f42291d;
                    String str = this.f42292e;
                    if (jSONObject.has("data")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null) {
                            j11 = optJSONObject.optLong("oldListLabelConversationVersion", 0L);
                        } else {
                            j11 = 0;
                        }
                        if (optJSONObject != null) {
                            j12 = optJSONObject.optLong("listLabelConversationVersion", 0L);
                        } else {
                            j12 = 0;
                        }
                        HashMap hashMap2 = (HashMap) c7860a.f42273f.get(Integer.valueOf(i11));
                        if (hashMap2 != null && (values = hashMap2.values()) != null) {
                            arrayList = new ArrayList(values);
                        } else {
                            arrayList = new ArrayList();
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            AbstractC19074t.m100205c(str2);
                            arrayList.add(new C18430a(str2, i11));
                            C18431b c18431b = (C18431b) c7860a.f42272e.get(Integer.valueOf(i11));
                            if (c18431b != null && c18431b.m97666d() == 1) {
                                c7860a.m40297x0(str2);
                            }
                        }
                        if (c7860a.f42273f.containsKey(Integer.valueOf(i11)) && (hashMap = (HashMap) c7860a.f42273f.get(Integer.valueOf(i11))) != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C18430a c18430a = (C18430a) it2.next();
                                AbstractC19074t.m100205c(hashMap);
                                String m97662b = c18430a.m97662b();
                                AbstractC19074t.m100205c(c18430a);
                                hashMap.put(m97662b, c18430a);
                            }
                        }
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.k

                            /* renamed from: p */
                            public final /* synthetic */ ArrayList f14574p;

                            public /* synthetic */ RunnableC3476k(ArrayList arrayList3) {
                                r1 = arrayList3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C7860a.d.m40305d(r1);
                            }
                        });
                        if (cVar != null) {
                            cVar.mo40216b(obj);
                            cVar.mo40218d();
                        }
                        c7860a.m40222D0(i11, j11, j12);
                    }
                    C24559a.m127933c("[ConversationLabel]", "addConversationToLabel labelId = " + i11 + ", listThreadId = " + arrayList2 + ", trackingSource = " + str);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.a$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20094a {
        e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C7860a.this.f42282o = false;
                if (c20096c != null) {
                    C7860a c7860a = C7860a.this;
                    if (c20096c.m104491c() != -69) {
                        AbstractC0924m0.m3229Li(0L);
                    } else {
                        c7860a.m40284b0().compareAndSet(false, true);
                        AbstractC0924m0.m3229Li(System.currentTimeMillis());
                    }
                }
                C24559a.m127933c("[ConversationLabel]", "pullAllLabels versionLoad = " + C7860a.this.m40265I() + ", error message = " + c20096c);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            try {
                int i11 = 0;
                C7860a.this.f42282o = false;
                AbstractC0924m0.m3229Li(System.currentTimeMillis());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data")) {
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                        long optLong = jSONObject2.optLong("listLabelVersion", 0L);
                        if (optLong > C7860a.this.m40265I()) {
                            C7860a.this.m40290n0(optLong);
                            AbstractC0924m0.m3762dq(C7860a.this.m40265I());
                        }
                        JSONObject optJSONObject = jSONObject2.optJSONObject("defaultLabel");
                        if (optJSONObject != null) {
                            C7860a c7860a = C7860a.this;
                            C18431b m40267K = c7860a.m40267K();
                            if (m40267K == null || (str2 = m40267K.m97664b()) == null) {
                                str2 = "";
                            }
                            C18431b c18431b = new C18431b(optJSONObject, 0, str2);
                            linkedHashMap.put(Integer.valueOf(c18431b.m97665c()), c18431b);
                            c7860a.m40291o0(c18431b);
                        }
                        JSONArray optJSONArray = jSONObject2.optJSONArray("labels");
                        if (optJSONArray != null) {
                            C7860a c7860a2 = C7860a.this;
                            while (i11 < optJSONArray.length()) {
                                Object obj2 = optJSONArray.get(i11);
                                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                i11++;
                                C18431b c18431b2 = new C18431b((JSONObject) obj2, i11, "");
                                C18431b c18431b3 = (C18431b) c7860a2.f42272e.get(Integer.valueOf(c18431b2.m97665c()));
                                if (c18431b3 == null || (str = c18431b3.m97664b()) == null) {
                                    str = "";
                                }
                                c18431b2.m97668f(str);
                                linkedHashMap.put(Integer.valueOf(c18431b2.m97665c()), c18431b2);
                            }
                        }
                    } catch (Exception unused) {
                        AbstractC0924m0.m3496Uo(true);
                        C24559a.m127933c("[ConversationLabel]", "pullAllLabels versionLoad = " + C7860a.this.m40265I() + ", json = " + jSONObject);
                        return;
                    }
                }
                C7860a c7860a3 = C7860a.this;
                Map map = c7860a3.f42272e;
                AbstractC19074t.m100207e(map, "access$getMapLabelInfo$p(...)");
                c7860a3.m40253v0(map, linkedHashMap);
                AbstractC0924m0.m3496Uo(true);
                C24559a.m127933c("[ConversationLabel]", "pullAllLabels versionLoad = " + C7860a.this.m40265I() + ", json = " + jSONObject);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.a$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f42295b;

        /* renamed from: c */
        final /* synthetic */ long f42296c;

        f(int i11, long j11) {
            this.f42295b = i11;
            this.f42296c = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C7860a.this.f42283p = false;
                if (c20096c != null) {
                    C7860a c7860a = C7860a.this;
                    if (c20096c.m104491c() != -69) {
                        AbstractC0924m0.m3229Li(0L);
                    } else {
                        c7860a.m40283a0().compareAndSet(false, true);
                        AbstractC0924m0.m3229Li(System.currentTimeMillis());
                    }
                }
                C24559a.m127933c("[ConversationLabel]", "pullConversationLabel versionLoad = " + this.f42296c + ", error message = " + c20096c);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                C7860a.this.f42283p = false;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    long optLong = jSONObject2.optLong("listLabelConversationVersion", 0L);
                    if (C7860a.this.f42284q.length() == 0) {
                        AbstractC0924m0.m3525Vo(false);
                        C7860a c7860a = C7860a.this;
                        c7860a.m40222D0(this.f42295b, c7860a.m40266J(), optLong);
                    }
                    C7860a c7860a2 = C7860a.this;
                    String optString = jSONObject2.optString("cursor", "");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    c7860a2.f42284q = optString;
                    if (C7860a.this.f42284q.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f42296c < optLong) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("conversations");
                        int i11 = this.f42295b;
                        C7860a c7860a3 = C7860a.this;
                        HashMap hashMap = new HashMap();
                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                            Object obj2 = jSONArray.get(i12);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            C18430a c18430a = new C18430a(i11, (JSONObject) obj2);
                            hashMap.put(c18430a.m97662b(), c18430a);
                            HashMap hashMap2 = c7860a3.f42274g;
                            Integer valueOf = Integer.valueOf(i11);
                            Object obj3 = hashMap2.get(valueOf);
                            if (obj3 == null) {
                                HashMap hashMap3 = new HashMap();
                                hashMap2.put(valueOf, hashMap3);
                                obj3 = hashMap3;
                            }
                            ((HashMap) obj3).put(c18430a.m97662b(), c18430a);
                        }
                        if (!z11) {
                            AbstractC0924m0.m3525Vo(true);
                            AbstractC0924m0.m3229Li(System.currentTimeMillis());
                            C7860a c7860a4 = C7860a.this;
                            c7860a4.m40250t0(this.f42295b, c7860a4.f42273f, C7860a.this.f42274g);
                        } else {
                            C24559a.m127933c("[ConversationLabel]", "pullConversationLabel -> continue sync");
                            if (!C7860a.this.m40283a0().get()) {
                                C7860a.this.m40287i0(this.f42295b, 0L);
                            }
                        }
                    } else {
                        AbstractC0924m0.m3525Vo(true);
                        AbstractC0924m0.m3229Li(System.currentTimeMillis());
                        C7860a.this.m40285c0(true);
                    }
                    C24559a.m127933c("[ConversationLabel]", "pullConversationLabel versionLoad = " + this.f42296c + ", hasMore = " + z11 + ", " + jSONObject2);
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.a$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ArrayList f42298b;

        /* renamed from: c */
        final /* synthetic */ int f42299c;

        /* renamed from: d */
        final /* synthetic */ c f42300d;

        /* renamed from: e */
        final /* synthetic */ String f42301e;

        g(ArrayList arrayList, int i11, c cVar, String str) {
            this.f42298b = arrayList;
            this.f42299c = i11;
            this.f42300d = cVar;
            this.f42301e = str;
        }

        /* renamed from: d */
        public static final void m40307d(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "$listDelete");
            C17931a.Companion.m94570a().m94565r(arrayList);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C7860a.this.m40293q0(false);
                c cVar = this.f42300d;
                if (cVar != null) {
                    cVar.mo40215a(c20096c);
                    cVar.mo40218d();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            long j11;
            long j12;
            HashMap hashMap;
            try {
                C7860a.this.m40293q0(false);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    ArrayList arrayList = this.f42298b;
                    int i11 = this.f42299c;
                    C7860a c7860a = C7860a.this;
                    c cVar = this.f42300d;
                    String str = this.f42301e;
                    if (jSONObject.has("data")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null) {
                            j11 = optJSONObject.optLong("oldListLabelConversationVersion", 0L);
                        } else {
                            j11 = 0;
                        }
                        if (optJSONObject != null) {
                            j12 = optJSONObject.optLong("listLabelConversationVersion", 0L);
                        } else {
                            j12 = 0;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            AbstractC19074t.m100205c(str2);
                            arrayList2.add(new C18430a(str2, i11));
                        }
                        if (c7860a.f42273f.containsKey(Integer.valueOf(i11)) && (hashMap = (HashMap) c7860a.f42273f.get(Integer.valueOf(i11))) != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                hashMap.remove((String) it2.next());
                            }
                        }
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.l

                            /* renamed from: p */
                            public final /* synthetic */ ArrayList f14575p;

                            public /* synthetic */ RunnableC3477l(ArrayList arrayList22) {
                                r1 = arrayList22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C7860a.g.m40307d(r1);
                            }
                        });
                        if (cVar != null) {
                            cVar.mo40216b(obj);
                            cVar.mo40218d();
                        }
                        c7860a.m40222D0(i11, j11, j12);
                        C24559a.m127933c("[ConversationLabel]", "removeConversationFromLabel labelId = " + i11 + ", listThreadId = " + arrayList + ", trackingSource = " + str);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    public /* synthetic */ C7860a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: A */
    public static final void m40219A(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listInsertOrUpdate");
        C17931a.Companion.m94570a().m94563A(arrayList);
    }

    /* renamed from: C */
    private final void m40220C(List list, C18431b c18431b) {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: ch.h

            /* renamed from: q */
            public final /* synthetic */ C18431b f14568q;

            /* renamed from: r */
            public final /* synthetic */ List f14569r;

            public /* synthetic */ RunnableC3473h(C18431b c18431b2, List list2) {
                r2 = c18431b2;
                r3 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7860a.m40221D(C7860a.this, r2, r3);
            }
        });
    }

    /* renamed from: D */
    public static final void m40221D(C7860a c7860a, C18431b c18431b, List list) {
        C18446h m41003g;
        AbstractC19074t.m100208f(c7860a, "this$0");
        AbstractC19074t.m100208f(c18431b, "$readLaterLabel");
        AbstractC19074t.m100208f(list, "$tabMsgItemList");
        c7860a.f42278k.clear();
        int m97665c = c18431b.m97665c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18451m c18451m = (C18451m) it.next();
            if (c18451m instanceof C18440b) {
                C18440b c18440b = (C18440b) c18451m;
                String str = c18440b.m97729o().f42893q;
                HashMap hashMap = (HashMap) c7860a.f42273f.get(Integer.valueOf(m97665c));
                if (hashMap == null || !hashMap.containsKey(str)) {
                    if (!c7860a.f42275h.containsKey(str)) {
                        C18451m c18451m2 = new C18451m(40);
                        c18451m2.f92992c = c18440b.m97729o().m40996I();
                        if (C0804b.m2025g().m2032f(c18451m.mo97719a()) != null) {
                            c7860a.f42278k.add(c18451m2);
                        } else {
                            C18440b c18440b2 = (C18440b) c18451m;
                            if (c18440b2.m97729o().m41013q()) {
                                C31973j5 m4472f = C0943w.f3447a.m4472f(c18451m.mo97719a());
                                if (m4472f != null && m4472f.m153732O() > 10) {
                                    c7860a.f42278k.add(c18451m2);
                                }
                            } else if (AbstractC21935u.m114518H(c18451m.mo97719a()) && !c18451m.mo97726j()) {
                                c7860a.f42278k.add(c18451m2);
                            } else if (!C19636i1.Companion.m102800a().m102761R(c18451m.mo97719a()) && !c18451m.mo97726j() && (m41003g = c18440b2.m97729o().m41003g()) != null && !m41003g.m97758w()) {
                                c7860a.f42278k.add(c18451m2);
                            }
                        }
                    }
                }
            }
        }
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: D0 */
    public final void m40222D0(int i11, long j11, long j12) {
        long j13 = this.f42268a;
        if (j13 < j11) {
            this.f42284q = "";
            HashMap hashMap = (HashMap) this.f42274g.get(Integer.valueOf(i11));
            if (hashMap != null) {
                hashMap.clear();
            }
            AbstractC0924m0.m3525Vo(false);
            this.f42281n.compareAndSet(true, false);
            C24559a.m127933c("[ConversationLabel]", "updateVersionLoadLabelConversation -> force re-sync");
            m40294r0(false);
            return;
        }
        if (j13 < j12) {
            this.f42268a = j12;
            AbstractC0924m0.m3792eq(j12);
            C24559a.m127933c("[ConversationLabel]", "after updateVersionLoadLabelConversation -> clientVersionLoadLabelConversation = " + this.f42268a);
        }
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m40227d0(C7860a c7860a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c7860a.m40285c0(z11);
    }

    /* renamed from: e0 */
    public static final void m40229e0(C7860a c7860a, boolean z11) {
        C17931a.a aVar;
        AbstractC19074t.m100208f(c7860a, "this$0");
        try {
            if (c7860a.f42271d.get()) {
                return;
            }
            Map map = c7860a.f42272e;
            AbstractC19074t.m100207e(map, "mapLabelInfo");
            synchronized (map) {
                try {
                    c7860a.f42272e.clear();
                    C24559a.m127933c("[ConversationLabel]", "loadLabelDataFromDB -> mapLabelInfo.clear()");
                    Map map2 = c7860a.f42272e;
                    aVar = C17931a.Companion;
                    map2.putAll(aVar.m94570a().m94568v());
                    if (c7860a.f42272e.containsKey(-1)) {
                        c7860a.f42279l = (C18431b) c7860a.f42272e.get(-1);
                        c7860a.f42272e.remove(-1);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            c7860a.f42273f.clear();
            C24559a.m127933c("[ConversationLabel]", "loadLabelDataFromDB -> mapConversationLabelInfo.clear()");
            c7860a.f42273f.putAll(aVar.m94570a().m94567t());
            c7860a.f42271d.compareAndSet(false, true);
            if (z11) {
                AbstractC19444a.m101697e(new Runnable() { // from class: ch.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7860a.m40231f0();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[ConversationLabel]", e11);
        }
    }

    /* renamed from: f0 */
    public static final void m40231f0() {
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: g0 */
    private final String m40233g0(String str, String str2) {
        String m127114D;
        String m127114D2;
        m127114D = AbstractC24341v.m127114D(str2, str, "", false, 4, null);
        m127114D2 = AbstractC24341v.m127114D(m127114D, ",,", ",", false, 4, null);
        if (AbstractC19074t.m100204b(m127114D2, ",")) {
            return "";
        }
        return m127114D2;
    }

    /* renamed from: l0 */
    public static final void m40239l0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listInsertOrUpdate");
        C17931a.Companion.m94570a().m94563A(arrayList);
    }

    /* renamed from: m0 */
    private final void m40241m0() {
        this.f42280m.compareAndSet(true, false);
        this.f42281n.compareAndSet(true, false);
    }

    /* renamed from: s0 */
    public static final void m40248s0(boolean z11, C7860a c7860a) {
        AbstractC19074t.m100208f(c7860a, "this$0");
        boolean m2933Bc = AbstractC0924m0.m2933Bc();
        boolean m2962Cc = AbstractC0924m0.m2962Cc();
        C24559a.m127933c("[ConversationLabel]", "syncLabelDone = " + m2933Bc + ", syncConversationLabelDone = " + m2962Cc + ", needResetStopRetry = " + z11);
        if (z11) {
            c7860a.m40241m0();
        }
        if (!m2933Bc) {
            AbstractC0924m0.m3762dq(0L);
        }
        if (!m2962Cc) {
            AbstractC0924m0.m3792eq(0L);
        }
        c7860a.f42274g.clear();
        c7860a.f42268a = AbstractC0924m0.m3983l7();
        c7860a.f42269b = AbstractC0924m0.m3953k7();
        if (!c7860a.f42280m.get()) {
            Companion.m40303b().m40286h0();
        }
        if (!c7860a.f42281n.get()) {
            Companion.m40303b().m40287i0(AbstractC0924m0.m2896A4(), AbstractC0924m0.m3983l7());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:            if (r2 == null) goto L63;     */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m40250t0(int i11, HashMap hashMap, HashMap hashMap2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap3 = (HashMap) hashMap.get(Integer.valueOf(i11));
        if (hashMap3 != null) {
            HashMap hashMap4 = (HashMap) hashMap2.get(Integer.valueOf(i11));
            if (hashMap4 != null) {
                AbstractC19074t.m100205c(hashMap4);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    String str = (String) entry.getKey();
                    C18430a c18430a = (C18430a) entry.getValue();
                    if (!hashMap3.containsKey(str)) {
                        arrayList2.add(c18430a);
                    }
                }
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    C18430a c18430a2 = (C18430a) entry2.getValue();
                    if (!hashMap4.containsKey(str2)) {
                        arrayList.add(c18430a2);
                    }
                }
                hashMap.put(Integer.valueOf(i11), hashMap4);
                obj = C24848g0.f119245a;
            } else {
                arrayList.addAll(hashMap3.values());
                HashMap hashMap5 = (HashMap) hashMap.get(Integer.valueOf(i11));
                if (hashMap5 != null) {
                    hashMap5.clear();
                }
                obj = this;
            }
        }
        HashMap hashMap6 = (HashMap) hashMap2.get(Integer.valueOf(i11));
        if (hashMap6 != null) {
            arrayList2.addAll(hashMap6.values());
            Integer valueOf = Integer.valueOf(i11);
            AbstractC19074t.m100205c(hashMap6);
            hashMap.put(valueOf, hashMap6);
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.j

            /* renamed from: p */
            public final /* synthetic */ ArrayList f14572p;

            /* renamed from: q */
            public final /* synthetic */ ArrayList f14573q;

            public /* synthetic */ RunnableC3475j(ArrayList arrayList22, ArrayList arrayList3) {
                r1 = arrayList22;
                r2 = arrayList3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7860a.m40252u0(r1, r2);
            }
        });
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: u0 */
    public static final void m40252u0(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC19074t.m100208f(arrayList, "$listInsert");
        AbstractC19074t.m100208f(arrayList2, "$listDelete");
        C17931a.a aVar = C17931a.Companion;
        aVar.m94570a().m94569y(arrayList);
        aVar.m94570a().m94565r(arrayList2);
    }

    /* renamed from: v0 */
    public final void m40253v0(Map map, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            C18431b c18431b = (C18431b) entry.getValue();
            if (!linkedHashMap.containsKey(Integer.valueOf(intValue))) {
                arrayList.add(c18431b);
            }
        }
        arrayList2.addAll(linkedHashMap.values());
        this.f42272e.clear();
        C24559a.m127933c("[ConversationLabel]", "syncLabelInfo -> mapLabelInfo.clear()");
        C18431b c18431b2 = this.f42279l;
        if (c18431b2 != null) {
            linkedHashMap.remove(Integer.valueOf(c18431b2.m97665c()));
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue2 = ((Number) entry2.getKey()).intValue();
            map.put(Integer.valueOf(intValue2), (C18431b) entry2.getValue());
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.i

            /* renamed from: p */
            public final /* synthetic */ ArrayList f14570p;

            /* renamed from: q */
            public final /* synthetic */ ArrayList f14571q;

            public /* synthetic */ RunnableC3474i(ArrayList arrayList3, ArrayList arrayList22) {
                r1 = arrayList3;
                r2 = arrayList22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7860a.m40254w0(r1, r2);
            }
        });
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: w0 */
    public static final void m40254w0(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC19074t.m100208f(arrayList, "$listLabelInfoDelete");
        AbstractC19074t.m100208f(arrayList2, "$listLabelInfoInsertOrUpdate");
        C17931a.a aVar = C17931a.Companion;
        aVar.m94570a().m94566s(arrayList);
        aVar.m94570a().m94563A(arrayList2);
    }

    /* renamed from: x */
    public static final void m40255x(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listInsertOrUpdate");
        C17931a.Companion.m94570a().m94563A(arrayList);
    }

    /* renamed from: z0 */
    public static final void m40256z0(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC19074t.m100208f(arrayList, "$listAdded");
        AbstractC19074t.m100208f(arrayList2, "$listRemoved");
        if (!arrayList.isEmpty()) {
            C17931a.Companion.m94570a().m94569y(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            C17931a.Companion.m94570a().m94565r(arrayList2);
        }
    }

    /* renamed from: A0 */
    public final void m40257A0(List list) {
        AbstractC19074t.m100208f(list, "listItem");
        List list2 = this.f42277j;
        AbstractC19074t.m100207e(list2, "listDefaultConversationLabel");
        synchronized (list2) {
            this.f42277j.clear();
            this.f42277j.addAll(list);
        }
    }

    /* renamed from: B */
    public final void m40258B(List list) {
        C18431b c18431b;
        int m131504l;
        int m131504l2;
        int m131504l3;
        ArrayList arrayList;
        boolean z11;
        try {
            List synchronizedList = Collections.synchronizedList(new ArrayList());
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            Map map = this.f42272e;
            AbstractC19074t.m100207e(map, "mapLabelInfo");
            synchronized (map) {
                try {
                    c18431b = null;
                    for (C18431b c18431b2 : this.f42272e.values()) {
                        AbstractC19074t.m100205c(synchronizedMap);
                        synchronizedMap.put(Integer.valueOf(c18431b2.m97665c()), new ArrayList());
                        if (c18431b2.m97666d() == 1) {
                            c18431b = c18431b2;
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            if (this.f42270c.get()) {
                this.f42278k.clear();
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C18451m c18451m = (C18451m) it.next();
                    c18451m.f92993d = false;
                    Map map2 = this.f42272e;
                    AbstractC19074t.m100207e(map2, "mapLabelInfo");
                    synchronized (map2) {
                        try {
                            z11 = false;
                            for (C18431b c18431b3 : this.f42272e.values()) {
                                HashMap hashMap = this.f42273f;
                                Integer valueOf = Integer.valueOf(c18431b3.m97665c());
                                Object obj = hashMap.get(valueOf);
                                if (obj == null) {
                                    obj = new HashMap();
                                    hashMap.put(valueOf, obj);
                                }
                                if (((HashMap) obj).containsKey(c18451m.mo97719a())) {
                                    AbstractC19074t.m100205c(synchronizedMap);
                                    Integer valueOf2 = Integer.valueOf(c18431b3.m97665c());
                                    Object obj2 = synchronizedMap.get(valueOf2);
                                    if (obj2 == null) {
                                        obj2 = new ArrayList();
                                        synchronizedMap.put(valueOf2, obj2);
                                    }
                                    ((ArrayList) obj2).add(c18451m);
                                    z11 = true;
                                }
                            }
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                    if (!z11) {
                        synchronizedList.add(c18451m);
                    }
                }
                if (c18431b != null && this.f42270c.get() && this.f42278k.isEmpty() && (arrayList = (ArrayList) synchronizedMap.get(Integer.valueOf(c18431b.m97665c()))) != null && arrayList.isEmpty()) {
                    this.f42270c.set(false);
                    m40220C(list, c18431b);
                }
            }
            this.f42270c.set(false);
            for (int size = this.f42278k.size() - 1; -1 < size; size--) {
                C18451m c18451m2 = (C18451m) this.f42278k.get(size);
                Map map3 = this.f42272e;
                AbstractC19074t.m100207e(map3, "mapLabelInfo");
                synchronized (map3) {
                    try {
                        Iterator it2 = this.f42272e.values().iterator();
                        while (it2.hasNext()) {
                            HashMap hashMap2 = (HashMap) this.f42273f.get(Integer.valueOf(((C18431b) it2.next()).m97665c()));
                            if (hashMap2 != null && hashMap2.containsKey(c18451m2.mo97719a())) {
                                this.f42278k.remove(size);
                            }
                        }
                        C24848g0 c24848g03 = C24848g0.f119245a;
                    } finally {
                    }
                }
            }
            Map map4 = this.f42272e;
            AbstractC19074t.m100207e(map4, "mapLabelInfo");
            synchronized (map4) {
                try {
                    Iterator it3 = this.f42272e.values().iterator();
                    while (it3.hasNext()) {
                        ArrayList arrayList2 = (ArrayList) synchronizedMap.get(Integer.valueOf(((C18431b) it3.next()).m97665c()));
                        if (arrayList2 != null && (!arrayList2.isEmpty())) {
                            m131504l3 = AbstractC25368s.m131504l(arrayList2);
                            ((C18451m) arrayList2.get(m131504l3)).f92993d = true;
                        }
                    }
                    C24848g0 c24848g04 = C24848g0.f119245a;
                } finally {
                }
            }
            AbstractC19074t.m100205c(synchronizedList);
            if (!synchronizedList.isEmpty()) {
                m131504l2 = AbstractC25368s.m131504l(synchronizedList);
                ((C18451m) synchronizedList.get(m131504l2)).f92993d = true;
            }
            List list2 = this.f42278k;
            AbstractC19074t.m100205c(list2);
            if (!list2.isEmpty()) {
                m131504l = AbstractC25368s.m131504l(list2);
                ((C18451m) list2.get(m131504l)).f92993d = true;
            }
            List list3 = this.f42277j;
            AbstractC19074t.m100207e(list3, "listDefaultConversationLabel");
            synchronized (list3) {
                this.f42277j.clear();
                List list4 = this.f42277j;
                AbstractC19074t.m100205c(synchronizedList);
                list4.addAll(synchronizedList);
            }
            Map map5 = this.f42276i;
            AbstractC19074t.m100207e(map5, "mapListConversationResultFilterByLabel");
            synchronized (map5) {
                this.f42276i.clear();
                Map map6 = this.f42276i;
                AbstractC19074t.m100205c(synchronizedMap);
                map6.putAll(synchronizedMap);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: B0 */
    public final void m40259B0(String str) {
        AbstractC19074t.m100208f(str, "threadIdRemove");
        int size = this.f42278k.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (AbstractC19074t.m100204b(((C18451m) this.f42278k.get(i11)).mo97719a(), str)) {
                this.f42278k.remove(i11);
            }
        }
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: C0 */
    public final void m40260C0() {
        AbstractC0924m0.m3937jl(!AbstractC0924m0.m3136Ic());
    }

    /* renamed from: E */
    public final String m40261E(String str, String str2, String str3, int i11, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "sessionId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        AbstractC19074t.m100208f(str3, "actionId");
        AbstractC19074t.m100208f(arrayList, "listConversation");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessionId", str);
            jSONObject.put("entry", str2);
            jSONObject.put("actionId", str3);
            jSONObject.put("actionType", i11);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Conversation conversation = (Conversation) it.next();
                boolean z11 = C0804b.m2025g().m2032f(conversation.f42893q) != null;
                if (conversation.m41013q()) {
                    Integer num = (Integer) hashMap.get(C7962g.f43287r);
                    hashMap.put(C7962g.f43287r, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                    if (z11) {
                        Integer num2 = (Integer) hashMap2.get(C7962g.f43287r);
                        hashMap2.put(C7962g.f43287r, Integer.valueOf(num2 != null ? 1 + num2.intValue() : 1));
                    }
                } else if (conversation.m41015u()) {
                    Integer num3 = (Integer) hashMap.get("ft");
                    hashMap.put("ft", Integer.valueOf(num3 != null ? num3.intValue() + 1 : 1));
                    if (z11) {
                        Integer num4 = (Integer) hashMap2.get("ft");
                        hashMap2.put("ft", Integer.valueOf(num4 != null ? 1 + num4.intValue() : 1));
                    }
                } else if (AbstractC21935u.m114518H(conversation.f42893q)) {
                    Integer num5 = (Integer) hashMap.get("oa");
                    hashMap.put("oa", Integer.valueOf(num5 != null ? num5.intValue() + 1 : 1));
                    if (z11) {
                        Integer num6 = (Integer) hashMap2.get("oa");
                        hashMap2.put("oa", Integer.valueOf(num6 != null ? 1 + num6.intValue() : 1));
                    }
                } else if (conversation.m41016w()) {
                    Integer num7 = (Integer) hashMap.get(C18711c.f94014e);
                    hashMap.put(C18711c.f94014e, Integer.valueOf(num7 != null ? num7.intValue() + 1 : 1));
                    if (z11) {
                        Integer num8 = (Integer) hashMap2.get(C18711c.f94014e);
                        hashMap2.put(C18711c.f94014e, Integer.valueOf(num8 != null ? 1 + num8.intValue() : 1));
                    }
                } else {
                    Integer num9 = (Integer) hashMap.get("un");
                    hashMap.put("un", Integer.valueOf(num9 != null ? num9.intValue() + 1 : 1));
                    if (z11) {
                        Integer num10 = (Integer) hashMap2.get("un");
                        hashMap2.put("un", Integer.valueOf(num10 != null ? 1 + num10.intValue() : 1));
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            for (String str4 : hashMap.keySet()) {
                jSONObject2.put(str4, hashMap.get(str4));
            }
            jSONObject.put("sct", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            for (String str5 : hashMap2.keySet()) {
                jSONObject3.put(str5, hashMap2.get(str5));
            }
            jSONObject.put("muteCount", jSONObject3);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        String jSONObject4 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
        return jSONObject4;
    }

    /* renamed from: F */
    public final String m40262F(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "sessionId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        AbstractC19074t.m100208f(str3, "actionId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessionId", str);
            jSONObject.put("entry", str2);
            jSONObject.put("actionId", str3);
            jSONObject.put("actionType", i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: G */
    public final LinkedHashMap m40263G() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18431b c18431b = this.f42279l;
        if (c18431b != null) {
            linkedHashMap.put(Integer.valueOf(c18431b.m97665c()), c18431b);
        }
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            try {
                for (C18431b c18431b2 : this.f42272e.values()) {
                    Integer valueOf = Integer.valueOf(c18431b2.m97665c());
                    AbstractC19074t.m100205c(c18431b2);
                    linkedHashMap.put(valueOf, c18431b2);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedHashMap;
    }

    /* renamed from: H */
    public final List m40264H() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m40263G().values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(m40277U(((C18431b) it.next()).m97666d()));
        }
        return arrayList;
    }

    /* renamed from: I */
    public final long m40265I() {
        return this.f42269b;
    }

    /* renamed from: J */
    public final long m40266J() {
        return this.f42268a;
    }

    /* renamed from: K */
    public final C18431b m40267K() {
        return this.f42279l;
    }

    /* renamed from: L */
    public final List m40268L() {
        List list = this.f42277j;
        AbstractC19074t.m100207e(list, "listDefaultConversationLabel");
        return list;
    }

    /* renamed from: M */
    public final C18451m m40269M(int i11) {
        List<C18451m> m40277U = Companion.m40303b().m40277U(i11);
        C18451m c18451m = (C18451m) m40277U.get(0);
        for (C18451m c18451m2 : m40277U) {
            if (c18451m2.f92990a == 1) {
                return c18451m2;
            }
        }
        return c18451m;
    }

    /* renamed from: N */
    public final C18431b m40270N(int i11) {
        return (C18431b) this.f42272e.get(Integer.valueOf(i11));
    }

    /* renamed from: O */
    public final C18431b m40271O(int i11) {
        C18431b c18431b = this.f42279l;
        if (c18431b != null && c18431b.m97666d() == i11) {
            return this.f42279l;
        }
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            for (C18431b c18431b2 : this.f42272e.values()) {
                if (c18431b2.m97666d() == i11) {
                    return c18431b2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return null;
        }
    }

    /* renamed from: P */
    public final String m40272P(int i11) {
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            for (C18431b c18431b : this.f42272e.values()) {
                if (c18431b.m97665c() == i11) {
                    return c18431b.m97667e().toString();
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            C18431b c18431b2 = this.f42279l;
            if (c18431b2 != null && -1 == i11) {
                return c18431b2.m97667e().toString();
            }
            return "";
        }
    }

    /* renamed from: Q */
    public final String m40273Q(int i11) {
        C24559a.m127933c("[ConversationLabel]", "getLabelNameByTabIndex(" + i11 + ") defaultChatLabel = " + this.f42279l + ", mapLabelInfo = " + this.f42272e.values());
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            for (C18431b c18431b : this.f42272e.values()) {
                if (c18431b.m97666d() == i11) {
                    return c18431b.m97667e().toString();
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            C18431b c18431b2 = this.f42279l;
            if (c18431b2 != null && i11 == c18431b2.m97666d()) {
                return c18431b2.m97667e().toString();
            }
            return "";
        }
    }

    /* renamed from: R */
    public final ArrayList m40274R(String str) {
        C18430a c18430a;
        AbstractC19074t.m100208f(str, "threadId");
        ArrayList arrayList = new ArrayList();
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            try {
                Iterator it = this.f42272e.values().iterator();
                while (it.hasNext()) {
                    HashMap hashMap = (HashMap) this.f42273f.get(Integer.valueOf(((C18431b) it.next()).m97665c()));
                    if (hashMap != null && hashMap.containsKey(str) && (c18430a = (C18430a) hashMap.get(str)) != null) {
                        arrayList.add(c18430a);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: S */
    public final List m40275S() {
        ArrayList arrayList;
        int m116584g;
        try {
            List list = this.f42278k;
            AbstractC19074t.m100207e(list, "listReadLaterSuggest");
            synchronized (list) {
                arrayList = new ArrayList();
                AbstractC19074t.m100207e(this.f42278k, "listReadLaterSuggest");
                if (!r2.isEmpty()) {
                    arrayList.add(new C18451m(2));
                    C18451m c18451m = new C18451m(6);
                    ContactProfile contactProfile = new ContactProfile();
                    contactProfile.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggestion_section_title);
                    c18451m.f92992c = contactProfile;
                    arrayList.add(c18451m);
                    List list2 = this.f42278k;
                    m116584g = AbstractC22543l.m116584g(list2.size(), 3);
                    arrayList.addAll(list2.subList(0, m116584g));
                    if (this.f42278k.size() > 0) {
                        arrayList.add(new C18451m(41));
                    }
                }
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return new ArrayList();
        }
    }

    /* renamed from: T */
    public final LinkedHashMap m40276T(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            try {
                for (C18431b c18431b : this.f42272e.values()) {
                    HashMap hashMap = (HashMap) this.f42273f.get(Integer.valueOf(c18431b.m97665c()));
                    if (hashMap != null && hashMap.containsKey(str)) {
                        Integer valueOf = Integer.valueOf(c18431b.m97665c());
                        AbstractC19074t.m100205c(c18431b);
                        linkedHashMap.put(valueOf, c18431b);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C18431b c18431b2 = this.f42279l;
        if (c18431b2 != null && linkedHashMap.isEmpty()) {
            linkedHashMap.put(Integer.valueOf(c18431b2.m97665c()), c18431b2);
        }
        return linkedHashMap;
    }

    /* renamed from: U */
    public final List m40277U(int i11) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        C18431b m40271O = m40271O(i11);
        if (m40271O != null && (arrayList = (ArrayList) this.f42276i.get(Integer.valueOf(m40271O.m97665c()))) != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList2.isEmpty() && i11 == 0) {
            arrayList2.addAll(this.f42277j);
        }
        return arrayList2;
    }

    /* renamed from: V */
    public final AtomicBoolean m40278V() {
        return this.f42270c;
    }

    /* renamed from: W */
    public final void m40279W(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        Map map = this.f42275h;
        AbstractC19074t.m100207e(map, "mapIgnoreSuggestReadLater");
        map.put(str, str);
        m40297x0(str);
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: X */
    public final boolean m40280X(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            Iterator it = this.f42272e.keySet().iterator();
            while (it.hasNext()) {
                HashMap hashMap = (HashMap) this.f42273f.get((Integer) it.next());
                if (hashMap != null && hashMap.containsKey(str)) {
                    return true;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return false;
        }
    }

    /* renamed from: Y */
    public final boolean m40281Y(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        HashMap hashMap = (HashMap) this.f42273f.get(Integer.valueOf(AbstractC0924m0.m2896A4()));
        if (hashMap == null || !hashMap.containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public final boolean m40282Z(int i11) {
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            for (C18431b c18431b : this.f42272e.values()) {
                if (c18431b.m97666d() == i11) {
                    return c18431b.m97663a();
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            C18431b c18431b2 = this.f42279l;
            if (c18431b2 != null && i11 == c18431b2.m97666d()) {
                return c18431b2.m97663a();
            }
            return false;
        }
    }

    /* renamed from: a0 */
    public final AtomicBoolean m40283a0() {
        return this.f42281n;
    }

    /* renamed from: b0 */
    public final AtomicBoolean m40284b0() {
        return this.f42280m;
    }

    /* renamed from: c0 */
    public final void m40285c0(boolean z11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.d

            /* renamed from: q */
            public final /* synthetic */ boolean f14562q;

            public /* synthetic */ RunnableC3469d(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7860a.m40229e0(C7860a.this, r2);
            }
        });
    }

    /* renamed from: h0 */
    public final void m40286h0() {
        if (this.f42282o) {
            return;
        }
        AbstractC0924m0.m3496Uo(false);
        this.f42282o = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e());
        c0766k.mo1681l7(this.f42269b);
    }

    /* renamed from: i0 */
    public final void m40287i0(int i11, long j11) {
        if (this.f42283p) {
            return;
        }
        this.f42283p = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(i11, j11));
        C24559a.m127933c("[ConversationLabel]", "pullConversationLabel cursor = " + this.f42284q + ", version = " + j11);
        c0766k.m1812H(i11, this.f42284q, j11);
    }

    /* renamed from: j0 */
    public final void m40288j0(int i11, ArrayList arrayList, c cVar, String str) {
        AbstractC19074t.m100208f(arrayList, "listThreadId");
        AbstractC19074t.m100208f(str, "trackingSource");
        C0766k c0766k = new C0766k();
        if (this.f42286s) {
            return;
        }
        if (cVar != null) {
            cVar.mo40217c();
        }
        this.f42286s = true;
        c0766k.mo1704o8(new g(arrayList, i11, cVar, str));
        c0766k.m1858m0(i11, arrayList, str);
    }

    /* renamed from: k0 */
    public final void m40289k0(String... strArr) {
        boolean z11;
        C18431b c18431b;
        boolean m127149O;
        boolean m127149O2;
        AbstractC19074t.m100208f(strArr, "listThreadId");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Map map = this.f42272e;
            AbstractC19074t.m100207e(map, "mapLabelInfo");
            synchronized (map) {
                try {
                    z11 = false;
                    for (C18431b c18431b2 : this.f42272e.values()) {
                        m127149O2 = AbstractC24342w.m127149O(c18431b2.m97664b(), str, false, 2, null);
                        if (m127149O2 && c18431b2.m97664b().length() > 0) {
                            c18431b2.m97668f(m40233g0(str, c18431b2.m97664b()));
                            arrayList.add(c18431b2);
                            z11 = true;
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z11 && (c18431b = this.f42279l) != null) {
                m127149O = AbstractC24342w.m127149O(c18431b.m97664b(), str, false, 2, null);
                if (m127149O && c18431b.m97664b().length() > 0) {
                    c18431b.m97668f(m40233g0(str, c18431b.m97664b()));
                    arrayList.add(c18431b);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.b

                /* renamed from: p */
                public final /* synthetic */ ArrayList f14559p;

                public /* synthetic */ RunnableC3467b(ArrayList arrayList2) {
                    r1 = arrayList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7860a.m40239l0(r1);
                }
            });
        }
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: n0 */
    public final void m40290n0(long j11) {
        this.f42269b = j11;
    }

    /* renamed from: o0 */
    public final void m40291o0(C18431b c18431b) {
        this.f42279l = c18431b;
    }

    /* renamed from: p0 */
    public final void m40292p0(boolean z11) {
        this.f42285r = z11;
    }

    /* renamed from: q0 */
    public final void m40293q0(boolean z11) {
        this.f42286s = z11;
    }

    /* renamed from: r0 */
    public final void m40294r0(boolean z11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.e

            /* renamed from: p */
            public final /* synthetic */ boolean f14563p;

            /* renamed from: q */
            public final /* synthetic */ C7860a f14564q;

            public /* synthetic */ RunnableC3470e(boolean z112, C7860a this) {
                r1 = z112;
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7860a.m40248s0(r1, r2);
            }
        });
    }

    /* renamed from: v */
    public final void m40295v(int i11, ArrayList arrayList, c cVar, String str) {
        AbstractC19074t.m100208f(arrayList, "listThreadId");
        AbstractC19074t.m100208f(str, "trackingSource");
        C0766k c0766k = new C0766k();
        if (this.f42285r) {
            return;
        }
        if (cVar != null) {
            cVar.mo40217c();
        }
        this.f42285r = true;
        c0766k.mo1704o8(new d(i11, arrayList, cVar, str));
        c0766k.m1837c(i11, arrayList, str);
    }

    /* renamed from: w */
    public final void m40296w(String str) {
        boolean z11;
        C18431b c18431b;
        boolean m127149O;
        boolean m127149O2;
        AbstractC19074t.m100208f(str, "threadId");
        if (C0804b.m2025g().m2033i(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            try {
                z11 = false;
                for (C18431b c18431b2 : this.f42272e.values()) {
                    HashMap hashMap = (HashMap) this.f42273f.get(Integer.valueOf(c18431b2.m97665c()));
                    if (hashMap != null && hashMap.containsKey(str)) {
                        m127149O2 = AbstractC24342w.m127149O(c18431b2.m97664b(), str, false, 2, null);
                        if (!m127149O2) {
                            if (c18431b2.m97664b().length() > 0) {
                                c18431b2.m97668f(c18431b2.m97664b() + "," + str);
                            } else {
                                c18431b2.m97668f(str);
                            }
                        }
                        arrayList.add(c18431b2);
                        z11 = true;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11 && (c18431b = this.f42279l) != null) {
            m127149O = AbstractC24342w.m127149O(c18431b.m97664b(), str, false, 2, null);
            if (!m127149O) {
                if (c18431b.m97664b().length() > 0) {
                    c18431b.m97668f(c18431b.m97664b() + "," + str);
                } else {
                    c18431b.m97668f(str);
                }
            }
            arrayList.add(c18431b);
        }
        if (!arrayList.isEmpty()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.c

                /* renamed from: p */
                public final /* synthetic */ ArrayList f14560p;

                public /* synthetic */ RunnableC3468c(ArrayList arrayList2) {
                    r1 = arrayList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7860a.m40255x(r1);
                }
            });
        }
    }

    /* renamed from: x0 */
    public final void m40297x0(String str) {
        Object m131216p0;
        AbstractC19074t.m100208f(str, "threadId");
        int size = this.f42278k.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            C18451m c18451m = (C18451m) this.f42278k.get(i11);
            if (AbstractC19074t.m100204b(c18451m.mo97719a(), str)) {
                if (this.f42278k.size() > 3) {
                    List list = this.f42278k;
                    list.set(i11, list.get(3));
                    this.f42278k.remove(3);
                } else {
                    this.f42278k.remove(c18451m);
                }
            } else {
                i11++;
            }
        }
        for (Object obj : this.f42278k) {
            AbstractC19074t.m100207e(obj, "next(...)");
            ((C18451m) obj).f92993d = false;
        }
        AbstractC19074t.m100207e(this.f42278k, "listReadLaterSuggest");
        if (!r6.isEmpty()) {
            List list2 = this.f42278k;
            AbstractC19074t.m100207e(list2, "listReadLaterSuggest");
            m131216p0 = AbstractC25332a0.m131216p0(list2);
            ((C18451m) m131216p0).f92993d = true;
        }
    }

    /* renamed from: y */
    public final void m40298y() {
        f42267t.reset();
        C24559a.m127933c("[ConversationLabel]", "clearData() -> reset instance ConversationLabelManager");
    }

    /* renamed from: y0 */
    public final void m40299y0(int i11, ArrayList arrayList, ArrayList arrayList2, long j11, long j12) {
        AbstractC19074t.m100208f(arrayList, "listRemoved");
        AbstractC19074t.m100208f(arrayList2, "listAdded");
        if (j11 >= this.f42268a) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18430a c18430a = (C18430a) it.next();
                HashMap hashMap = (HashMap) this.f42273f.get(Integer.valueOf(c18430a.m97661a()));
                if (hashMap != null) {
                    hashMap.remove(c18430a.m97662b());
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C18430a c18430a2 = (C18430a) it2.next();
                HashMap hashMap2 = (HashMap) this.f42273f.get(Integer.valueOf(c18430a2.m97661a()));
                if (hashMap2 != null) {
                    String m97662b = c18430a2.m97662b();
                    AbstractC19074t.m100205c(c18430a2);
                    hashMap2.put(m97662b, c18430a2);
                }
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.g

                /* renamed from: p */
                public final /* synthetic */ ArrayList f14565p;

                /* renamed from: q */
                public final /* synthetic */ ArrayList f14566q;

                public /* synthetic */ RunnableC3472g(ArrayList arrayList22, ArrayList arrayList3) {
                    r1 = arrayList22;
                    r2 = arrayList3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7860a.m40256z0(r1, r2);
                }
            });
            C19669z.Companion.m103232a().m103198O0();
        }
        C24559a.m127933c("[ConversationLabel]", "received notify -> update data change");
        m40222D0(i11, j11, j12);
    }

    /* renamed from: z */
    public final void m40300z(int i11) {
        ArrayList arrayList = new ArrayList();
        C18431b c18431b = this.f42279l;
        if (c18431b != null && c18431b.m97666d() == i11) {
            c18431b.m97668f("");
            arrayList.add(c18431b);
        }
        Map map = this.f42272e;
        AbstractC19074t.m100207e(map, "mapLabelInfo");
        synchronized (map) {
            try {
                for (C18431b c18431b2 : this.f42272e.values()) {
                    if (c18431b2.m97666d() == i11) {
                        c18431b2.m97668f("");
                        arrayList.add(c18431b2);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ch.a

            /* renamed from: p */
            public final /* synthetic */ ArrayList f14558p;

            public /* synthetic */ RunnableC3466a(ArrayList arrayList2) {
                r1 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7860a.m40219A(r1);
            }
        });
    }

    private C7860a() {
        this.f42268a = AbstractC0924m0.m3983l7();
        this.f42269b = AbstractC0924m0.m3953k7();
        this.f42270c = new AtomicBoolean(true);
        this.f42271d = new AtomicBoolean(false);
        this.f42272e = Collections.synchronizedMap(new LinkedHashMap());
        this.f42273f = new HashMap();
        this.f42274g = new HashMap();
        this.f42275h = Collections.synchronizedMap(new HashMap());
        this.f42276i = Collections.synchronizedMap(new HashMap());
        this.f42277j = Collections.synchronizedList(new ArrayList());
        this.f42278k = Collections.synchronizedList(new ArrayList());
        this.f42280m = new AtomicBoolean(false);
        this.f42281n = new AtomicBoolean(false);
        this.f42284q = "";
    }
}
