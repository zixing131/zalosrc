package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.ZinstantZaloView;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import me0.AbstractC23136l9;
import ml0.AbstractC23344a;
import org.json.JSONArray;
import org.json.JSONObject;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.widget.o3 */
/* loaded from: classes6.dex */
public final class C13701o3 {
    public static final e Companion = new e(null);

    /* renamed from: a */
    private a f70852a;

    /* renamed from: b */
    private CoroutineScope f70853b;

    /* renamed from: c */
    private ZinstantZaloView f70854c;

    /* renamed from: d */
    private final C23528a f70855d;

    /* renamed from: e */
    private AtomicInteger f70856e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.o3$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a */
        private final Drawable f70857a;

        /* renamed from: b */
        private final List f70858b;

        /* renamed from: c */
        private final List f70859c;

        public a(Drawable drawable, List list, List list2) {
            AbstractC19074t.m100208f(list, "action");
            AbstractC19074t.m100208f(list2, "popupAction");
            this.f70857a = drawable;
            this.f70858b = list;
            this.f70859c = list2;
        }

        /* renamed from: a */
        public final boolean m76578a() {
            if ((!this.f70858b.isEmpty()) || (!this.f70859c.isEmpty())) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final List m76579b() {
            return this.f70858b;
        }

        /* renamed from: c */
        public final List m76580c() {
            return this.f70859c;
        }

        /* renamed from: d */
        public final Drawable m76581d() {
            return this.f70857a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.o3$b */
    /* loaded from: classes6.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f70860a;

        /* renamed from: b */
        private final List f70861b;

        /* renamed from: c */
        private final List f70862c;

        /* renamed from: com.zing.zalo.ui.widget.o3$b$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m76585a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "data");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("menuListItems");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        int optInt = optJSONObject.optInt("showAsAction", 0);
                        if (optInt != 0) {
                            if (optInt != 1) {
                                d.a aVar = d.Companion;
                                AbstractC19074t.m100205c(optJSONObject);
                                arrayList.add(aVar.m76597a(optJSONObject));
                            } else {
                                d.a aVar2 = d.Companion;
                                AbstractC19074t.m100205c(optJSONObject);
                                arrayList.add(aVar2.m76597a(optJSONObject));
                            }
                        } else {
                            d.a aVar3 = d.Companion;
                            AbstractC19074t.m100205c(optJSONObject);
                            arrayList2.add(aVar3.m76597a(optJSONObject));
                        }
                    }
                }
                String optString = jSONObject.optString("popupIconUrl");
                AbstractC19074t.m100207e(optString, "optString(...)");
                return new b(optString, arrayList, arrayList2, null);
            }
        }

        public /* synthetic */ b(String str, List list, List list2, AbstractC19060k abstractC19060k) {
            this(str, list, list2);
        }

        /* renamed from: a */
        public final List m76582a() {
            return this.f70861b;
        }

        /* renamed from: b */
        public final List m76583b() {
            return this.f70862c;
        }

        /* renamed from: c */
        public final String m76584c() {
            return this.f70860a;
        }

        private b(String str, List list, List list2) {
            this.f70860a = str;
            this.f70861b = list;
            this.f70862c = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.o3$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a */
        private final Drawable f70863a;

        /* renamed from: b */
        private final String f70864b;

        /* renamed from: c */
        private final String f70865c;

        /* renamed from: d */
        private final String f70866d;

        /* renamed from: e */
        private final String f70867e;

        /* renamed from: f */
        private final int f70868f;

        public c(Drawable drawable, String str, String str2, String str3, String str4, int i11) {
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "title_en");
            AbstractC19074t.m100208f(str3, "action");
            AbstractC19074t.m100208f(str4, "data");
            this.f70863a = drawable;
            this.f70864b = str;
            this.f70865c = str2;
            this.f70866d = str3;
            this.f70867e = str4;
            this.f70868f = i11;
        }

        /* renamed from: a */
        public final String m76586a() {
            return this.f70866d;
        }

        /* renamed from: b */
        public final String m76587b() {
            return this.f70867e;
        }

        /* renamed from: c */
        public final Drawable m76588c() {
            return this.f70863a;
        }

        /* renamed from: d */
        public final int m76589d() {
            return this.f70868f;
        }

        /* renamed from: e */
        public final String m76590e() {
            return this.f70864b;
        }

        /* renamed from: f */
        public final String m76591f() {
            return this.f70865c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.o3$d */
    /* loaded from: classes6.dex */
    public static final class d {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f70869a;

        /* renamed from: b */
        private final String f70870b;

        /* renamed from: c */
        private final String f70871c;

        /* renamed from: d */
        private final String f70872d;

        /* renamed from: e */
        private final String f70873e;

        /* renamed from: com.zing.zalo.ui.widget.o3$d$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m76597a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "data");
                String optString = jSONObject.optString("iconUrl");
                AbstractC19074t.m100207e(optString, "optString(...)");
                String optString2 = jSONObject.optString("title");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                String optString3 = jSONObject.optString("title_en");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                String optString4 = jSONObject.optString("action");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                String optString5 = jSONObject.optString("data");
                AbstractC19074t.m100207e(optString5, "optString(...)");
                return new d(optString, optString2, optString3, optString4, optString5);
            }
        }

        public d(String str, String str2, String str3, String str4, String str5) {
            AbstractC19074t.m100208f(str, "iconUrl");
            AbstractC19074t.m100208f(str2, "title");
            AbstractC19074t.m100208f(str3, "title_en");
            AbstractC19074t.m100208f(str4, "action");
            AbstractC19074t.m100208f(str5, "data");
            this.f70869a = str;
            this.f70870b = str2;
            this.f70871c = str3;
            this.f70872d = str4;
            this.f70873e = str5;
        }

        /* renamed from: a */
        public final String m76592a() {
            return this.f70872d;
        }

        /* renamed from: b */
        public final String m76593b() {
            return this.f70873e;
        }

        /* renamed from: c */
        public final String m76594c() {
            return this.f70869a;
        }

        /* renamed from: d */
        public final String m76595d() {
            return this.f70870b;
        }

        /* renamed from: e */
        public final String m76596e() {
            return this.f70871c;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o3$e */
    /* loaded from: classes6.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o3$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f70874t;

        /* renamed from: u */
        long f70875u;

        /* renamed from: v */
        Object f70876v;

        /* renamed from: w */
        int f70877w;

        /* renamed from: y */
        final /* synthetic */ String f70879y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation continuation) {
            super(2, continuation);
            this.f70879y = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f70879y, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x006b A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x001a, B:8:0x0060, B:10:0x006b, B:11:0x0072, B:19:0x002b, B:20:0x0046, B:25:0x0032), top: B:2:0x000c }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long j11;
            long j12;
            C13701o3 c13701o3;
            long j13;
            ZinstantZaloView zinstantZaloView;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f70877w;
            try {
            } catch (Throwable th2) {
                AbstractC20110a.f98889a.mo104552e(th2);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        j13 = this.f70875u;
                        j12 = this.f70874t;
                        c13701o3 = (C13701o3) this.f70876v;
                        AbstractC24862s.m129228b(obj);
                        a aVar = (a) obj;
                        zinstantZaloView = C13701o3.this.f70854c;
                        if (zinstantZaloView != null) {
                            zinstantZaloView.m92637BK(aVar.m76578a());
                        }
                        c13701o3.f70852a = (a) obj;
                        long currentTimeMillis = System.currentTimeMillis();
                        AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                        aVar2.m104564x("DebugZinstantAction").mo104548a("afterPrepare: " + (j13 - j12) + " ms.", new Object[0]);
                        aVar2.m104564x("DebugZinstantAction").mo104548a("consumeData: " + (currentTimeMillis - j13) + " ms.", new Object[0]);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f70874t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis2 = System.currentTimeMillis();
                C13701o3 c13701o32 = C13701o3.this;
                String str = this.f70879y;
                this.f70874t = currentTimeMillis2;
                this.f70877w = 1;
                obj = c13701o32.m76573t(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                j11 = currentTimeMillis2;
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            C13701o3 c13701o33 = C13701o3.this;
            this.f70876v = c13701o33;
            this.f70874t = j11;
            this.f70875u = currentTimeMillis3;
            this.f70877w = 2;
            obj = c13701o33.m76565i((b) obj, this);
            if (obj == m142578e) {
                return m142578e;
            }
            j12 = j11;
            c13701o3 = c13701o33;
            j13 = currentTimeMillis3;
            a aVar3 = (a) obj;
            zinstantZaloView = C13701o3.this.f70854c;
            if (zinstantZaloView != null) {
            }
            c13701o3.f70852a = (a) obj;
            long currentTimeMillis4 = System.currentTimeMillis();
            AbstractC20110a.a aVar22 = AbstractC20110a.f98889a;
            aVar22.m104564x("DebugZinstantAction").mo104548a("afterPrepare: " + (j13 - j12) + " ms.", new Object[0]);
            aVar22.m104564x("DebugZinstantAction").mo104548a("consumeData: " + (currentTimeMillis4 - j13) + " ms.", new Object[0]);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o3$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ b f70880A;

        /* renamed from: B */
        final /* synthetic */ C13701o3 f70881B;

        /* renamed from: t */
        Object f70882t;

        /* renamed from: u */
        Object f70883u;

        /* renamed from: v */
        Object f70884v;

        /* renamed from: w */
        Object f70885w;

        /* renamed from: x */
        Object f70886x;

        /* renamed from: y */
        Object f70887y;

        /* renamed from: z */
        int f70888z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b bVar, C13701o3 c13701o3, Continuation continuation) {
            super(2, continuation);
            this.f70880A = bVar;
            this.f70881B = c13701o3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f70880A, this.f70881B, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0186 -> B:7:0x0190). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x019e -> B:8:0x019f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e9 -> B:24:0x00f3). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Drawable drawable;
            Object m76569n;
            Drawable drawable2;
            g gVar;
            ArrayList arrayList;
            Iterator it;
            C19059j0 c19059j0;
            C13701o3 c13701o3;
            C13701o3 c13701o32;
            Iterator it2;
            C19059j0 c19059j02;
            ArrayList arrayList2;
            Drawable drawable3;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f70888z;
            int i12 = 3;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            d dVar = (d) this.f70887y;
                            Iterator it3 = (Iterator) this.f70886x;
                            C13701o3 c13701o33 = (C13701o3) this.f70885w;
                            C19059j0 c19059j03 = (C19059j0) this.f70884v;
                            ArrayList arrayList3 = (ArrayList) this.f70883u;
                            Drawable drawable4 = (Drawable) this.f70882t;
                            AbstractC24862s.m129228b(obj);
                            Object m76569n2 = obj;
                            Drawable drawable5 = drawable4;
                            ArrayList arrayList4 = arrayList3;
                            C19059j0 c19059j04 = c19059j03;
                            C13701o3 c13701o34 = c13701o33;
                            Iterator it4 = it3;
                            g gVar2 = this;
                            Drawable drawable6 = (Drawable) m76569n2;
                            Drawable drawable7 = drawable5;
                            d dVar2 = dVar;
                            gVar = gVar2;
                            it2 = it4;
                            c13701o32 = c13701o34;
                            c19059j02 = c19059j04;
                            arrayList2 = arrayList4;
                            drawable3 = drawable7;
                            ((ArrayList) c19059j02.f94941p).add(new c(drawable6, dVar2.m76595d(), dVar2.m76596e(), dVar2.m76592a(), dVar2.m76593b(), c13701o32.f70856e.getAndIncrement()));
                            i12 = 3;
                            if (!it2.hasNext()) {
                                dVar2 = (d) it2.next();
                                if (dVar2.m76594c().length() > 0) {
                                    String m76594c = dVar2.m76594c();
                                    gVar.f70882t = drawable3;
                                    gVar.f70883u = arrayList2;
                                    gVar.f70884v = c19059j02;
                                    gVar.f70885w = c13701o32;
                                    gVar.f70886x = it2;
                                    gVar.f70887y = dVar2;
                                    gVar.f70888z = i12;
                                    m76569n2 = c13701o32.m76569n(m76594c, gVar);
                                    if (m76569n2 == m142578e) {
                                        return m142578e;
                                    }
                                    Iterator it5 = it2;
                                    gVar2 = gVar;
                                    dVar = dVar2;
                                    drawable5 = drawable3;
                                    arrayList4 = arrayList2;
                                    c19059j04 = c19059j02;
                                    c13701o34 = c13701o32;
                                    it4 = it5;
                                    Drawable drawable62 = (Drawable) m76569n2;
                                    Drawable drawable72 = drawable5;
                                    d dVar22 = dVar;
                                    gVar = gVar2;
                                    it2 = it4;
                                    c13701o32 = c13701o34;
                                    c19059j02 = c19059j04;
                                    arrayList2 = arrayList4;
                                    drawable3 = drawable72;
                                    ((ArrayList) c19059j02.f94941p).add(new c(drawable62, dVar22.m76595d(), dVar22.m76596e(), dVar22.m76592a(), dVar22.m76593b(), c13701o32.f70856e.getAndIncrement()));
                                    i12 = 3;
                                    if (!it2.hasNext()) {
                                        return new a(drawable3, arrayList2, (List) c19059j02.f94941p);
                                    }
                                } else {
                                    drawable62 = null;
                                    ((ArrayList) c19059j02.f94941p).add(new c(drawable62, dVar22.m76595d(), dVar22.m76596e(), dVar22.m76592a(), dVar22.m76593b(), c13701o32.f70856e.getAndIncrement()));
                                    i12 = 3;
                                    if (!it2.hasNext()) {
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        d dVar3 = (d) this.f70887y;
                        Iterator it6 = (Iterator) this.f70886x;
                        C13701o3 c13701o35 = (C13701o3) this.f70885w;
                        C19059j0 c19059j05 = (C19059j0) this.f70884v;
                        ArrayList arrayList5 = (ArrayList) this.f70883u;
                        Drawable drawable8 = (Drawable) this.f70882t;
                        AbstractC24862s.m129228b(obj);
                        Object m76569n3 = obj;
                        Drawable drawable9 = drawable8;
                        ArrayList arrayList6 = arrayList5;
                        C19059j0 c19059j06 = c19059j05;
                        C13701o3 c13701o36 = c13701o35;
                        Iterator it7 = it6;
                        g gVar3 = this;
                        Drawable drawable10 = (Drawable) m76569n3;
                        if (drawable10 != null) {
                            arrayList6.add(new c(drawable10, dVar3.m76595d(), dVar3.m76596e(), dVar3.m76592a(), dVar3.m76593b(), c13701o36.f70856e.getAndIncrement()));
                        }
                        gVar = gVar3;
                        it = it7;
                        c13701o3 = c13701o36;
                        c19059j0 = c19059j06;
                        arrayList = arrayList6;
                        drawable2 = drawable9;
                        while (it.hasNext()) {
                            d dVar4 = (d) it.next();
                            if (dVar4.m76594c().length() > 0) {
                                String m76594c2 = dVar4.m76594c();
                                gVar.f70882t = drawable2;
                                gVar.f70883u = arrayList;
                                gVar.f70884v = c19059j0;
                                gVar.f70885w = c13701o3;
                                gVar.f70886x = it;
                                gVar.f70887y = dVar4;
                                gVar.f70888z = 2;
                                m76569n3 = c13701o3.m76569n(m76594c2, gVar);
                                if (m76569n3 == m142578e) {
                                    return m142578e;
                                }
                                Iterator it8 = it;
                                gVar3 = gVar;
                                dVar3 = dVar4;
                                drawable9 = drawable2;
                                arrayList6 = arrayList;
                                c19059j06 = c19059j0;
                                c13701o36 = c13701o3;
                                it7 = it8;
                                Drawable drawable102 = (Drawable) m76569n3;
                                if (drawable102 != null) {
                                }
                                gVar = gVar3;
                                it = it7;
                                c13701o3 = c13701o36;
                                c19059j0 = c19059j06;
                                arrayList = arrayList6;
                                drawable2 = drawable9;
                                while (it.hasNext()) {
                                }
                            } else {
                                arrayList.add(new c(null, dVar4.m76595d(), dVar4.m76596e(), dVar4.m76592a(), dVar4.m76593b(), c13701o3.f70856e.getAndIncrement()));
                            }
                        }
                        List m76583b = gVar.f70880A.m76583b();
                        c13701o32 = gVar.f70881B;
                        it2 = m76583b.iterator();
                        c19059j02 = c19059j0;
                        arrayList2 = arrayList;
                        drawable3 = drawable2;
                        if (!it2.hasNext()) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m76569n = obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (!this.f70880A.m76583b().isEmpty()) {
                    C13701o3 c13701o37 = this.f70881B;
                    String m76584c = this.f70880A.m76584c();
                    this.f70888z = 1;
                    m76569n = c13701o37.m76569n(m76584c, this);
                    if (m76569n == m142578e) {
                        return m142578e;
                    }
                } else {
                    drawable = null;
                    ArrayList arrayList7 = new ArrayList();
                    C19059j0 c19059j07 = new C19059j0();
                    c19059j07.f94941p = new ArrayList();
                    List m76582a = this.f70880A.m76582a();
                    C13701o3 c13701o38 = this.f70881B;
                    drawable2 = drawable;
                    gVar = this;
                    arrayList = arrayList7;
                    it = m76582a.iterator();
                    c19059j0 = c19059j07;
                    c13701o3 = c13701o38;
                    while (it.hasNext()) {
                    }
                    List m76583b2 = gVar.f70880A.m76583b();
                    c13701o32 = gVar.f70881B;
                    it2 = m76583b2.iterator();
                    c19059j02 = c19059j0;
                    arrayList2 = arrayList;
                    drawable3 = drawable2;
                    if (!it2.hasNext()) {
                    }
                }
            }
            drawable = (Drawable) m76569n;
            ArrayList arrayList72 = new ArrayList();
            C19059j0 c19059j072 = new C19059j0();
            c19059j072.f94941p = new ArrayList();
            List m76582a2 = this.f70880A.m76582a();
            C13701o3 c13701o382 = this.f70881B;
            drawable2 = drawable;
            gVar = this;
            arrayList = arrayList72;
            it = m76582a2.iterator();
            c19059j0 = c19059j072;
            c13701o3 = c13701o382;
            while (it.hasNext()) {
            }
            List m76583b22 = gVar.f70880A.m76583b();
            c13701o32 = gVar.f70881B;
            it2 = m76583b22.iterator();
            c19059j02 = c19059j0;
            arrayList2 = arrayList;
            drawable3 = drawable2;
            if (!it2.hasNext()) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o3$h */
    /* loaded from: classes6.dex */
    public static final class h extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Continuation f70889l1;

        /* renamed from: m1 */
        final /* synthetic */ C13701o3 f70890m1;

        h(Continuation continuation, C13701o3 c13701o3) {
            this.f70889l1 = continuation;
            this.f70890m1 = c13701o3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c23995f != null && c23995f.m125657h() == 200 && c3979l.m18849m()) {
                Continuation continuation = this.f70889l1;
                C13701o3 c13701o3 = this.f70890m1;
                Bitmap m18839c = c3979l.m18839c();
                AbstractC19074t.m100207e(m18839c, "getBitmap(...)");
                continuation.mo112492g(C24861r.m129218b(c13701o3.m76566j(m18839c)));
                return;
            }
            this.f70889l1.mo112492g(C24861r.m129218b(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o3$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f70891t;

        /* renamed from: u */
        final /* synthetic */ String f70892u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Continuation continuation) {
            super(2, continuation);
            this.f70892u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f70892u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f70891t == 0) {
                AbstractC24862s.m129228b(obj);
                return b.Companion.m76585a(new JSONObject(this.f70892u));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C13701o3(ZinstantZaloView zinstantZaloView) {
        Context context;
        AbstractC19074t.m100208f(zinstantZaloView, "initView");
        this.f70853b = CoroutineScopeKt.m112637a(Dispatchers.m112681c());
        this.f70854c = zinstantZaloView;
        if (zinstantZaloView != null) {
            context = zinstantZaloView.getContext();
        } else {
            context = null;
        }
        this.f70855d = new C23528a(context);
        this.f70856e = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final Object m76565i(b bVar, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new g(bVar, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final BitmapDrawable m76566j(Bitmap bitmap) {
        Resources resources;
        ZinstantZaloView zinstantZaloView = this.f70854c;
        if (zinstantZaloView != null) {
            resources = zinstantZaloView.m92651WI();
        } else {
            resources = null;
        }
        return new BitmapDrawable(resources, bitmap.copy(Bitmap.Config.ARGB_8888, false));
    }

    /* renamed from: l */
    private final c m76567l(int i11) {
        Object obj;
        a aVar = this.f70852a;
        Object obj2 = null;
        if (aVar == null) {
            return null;
        }
        Iterator it = aVar.m76579b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((c) obj).m76589d() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        c cVar = (c) obj;
        if (cVar == null) {
            Iterator it2 = aVar.m76580c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((c) next).m76589d() == i11) {
                    obj2 = next;
                    break;
                }
            }
            return (c) obj2;
        }
        return cVar;
    }

    /* renamed from: m */
    private final C24003n m76568m() {
        C24003n c24003n = new C24003n(0, null, 0, false, 0, false, null, 127, null);
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116261b = new BitmapDrawable(AbstractC3972e.m18756M(), AbstractC17158i1.m91745d());
        c24003n.f116263d = true;
        c24003n.f116260a = AbstractC23136l9.m118742r(24.0f);
        return c24003n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final Object m76569n(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        Context context = null;
        if (URLUtil.isNetworkUrl(str)) {
            h hVar = new h(c27317h, this);
            C23528a c23528a = this.f70855d;
            ZinstantZaloView zinstantZaloView = this.f70854c;
            if (zinstantZaloView != null) {
                context = zinstantZaloView.getContext();
            }
            ((C23528a) c23528a.m123612r(new RecyclingImageView(context))).m123579C(str, m76568m(), hVar);
        } else {
            c27317h.mo112492g(C24861r.m129218b(null));
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: o */
    private final String m76570o(String str, String str2) {
        if (!AbstractC19074t.m100204b(AbstractC17158i1.f87698h, "vi") && str2.length() > 0) {
            return str2;
        }
        return str;
    }

    /* renamed from: q */
    private final void m76571q(ActionBarMenu actionBarMenu) {
        Context context;
        a aVar;
        List<c> m76579b;
        ZinstantZaloView zinstantZaloView = this.f70854c;
        if (zinstantZaloView != null && (context = zinstantZaloView.getContext()) != null && (aVar = this.f70852a) != null && (m76579b = aVar.m76579b()) != null) {
            for (c cVar : m76579b) {
                if (cVar.m76588c() != null) {
                    actionBarMenu.m92742i(cVar.m76589d(), cVar.m76588c());
                } else {
                    actionBarMenu.m92746m(cVar.m76589d(), m76575k(context, m76570o(cVar.m76590e(), cVar.m76591f())), new LinearLayout.LayoutParams(-2, -2));
                }
            }
        }
    }

    /* renamed from: r */
    private final void m76572r(ActionBarMenu actionBarMenu) {
        Context context;
        a aVar;
        ActionBarMenuItem m92738e;
        Drawable drawable;
        ZinstantZaloView zinstantZaloView = this.f70854c;
        if (zinstantZaloView != null && (context = zinstantZaloView.getContext()) != null && (aVar = this.f70852a) != null) {
            boolean z11 = true;
            if (!aVar.m76580c().isEmpty()) {
                if (aVar.m76581d() != null) {
                    m92738e = actionBarMenu.m92742i(1000, aVar.m76581d());
                } else {
                    m92738e = actionBarMenu.m92738e(1000, AbstractC16803z.icn_header_menu_white);
                }
                for (c cVar : aVar.m76580c()) {
                    if (z11 && cVar.m76588c() == null && m76570o(cVar.m76590e(), cVar.m76591f()).length() > 0) {
                        z11 = false;
                    }
                }
                for (c cVar2 : aVar.m76580c()) {
                    String m76570o = m76570o(cVar2.m76590e(), cVar2.m76591f());
                    if (m76570o.length() > 0) {
                        int m76589d = cVar2.m76589d();
                        if (z11) {
                            drawable = cVar2.m76588c();
                        } else {
                            drawable = null;
                        }
                        m92738e.m92774j(AbstractC23136l9.m118733o(context, m76589d, m76570o, drawable));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final Object m76573t(String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112679a(), new i(str, null), continuation);
    }

    /* renamed from: h */
    public final Job m76574h(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "data");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f70853b, null, null, new f(str, null), 3, null);
        return m112540d;
    }

    /* renamed from: k */
    public final View m76575k(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "title");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setId(AbstractC23344a.action_bar_title);
        robotoTextView.setGravity(17);
        robotoTextView.setTextColor(-1);
        robotoTextView.setSingleLine(true);
        robotoTextView.setLines(1);
        robotoTextView.setMaxLines(1);
        robotoTextView.setBackgroundResource(AbstractC7356u0.item_actionbar_background_ripple);
        robotoTextView.setTextSize(1, 16.0f);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setTypeface(C13718q1.m76694c(context, 7));
        robotoTextView.setText(str);
        robotoTextView.setPadding(0, 0, AbstractC23136l9.m118742r(16.0f), 0);
        new FrameLayout.LayoutParams(-2, -2).gravity = 1;
        return robotoTextView;
    }

    /* renamed from: p */
    public final void m76576p(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        if (this.f70852a != null) {
            m76571q(actionBarMenu);
            m76572r(actionBarMenu);
        }
    }

    /* renamed from: s */
    public final boolean m76577s(int i11) {
        try {
            c m76567l = m76567l(i11);
            if (m76567l != null) {
                ZinstantZaloView zinstantZaloView = this.f70854c;
                if (zinstantZaloView != null) {
                    zinstantZaloView.m87244XM(m76567l.m76586a(), m76567l.m76587b(), null);
                    return true;
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }
}
