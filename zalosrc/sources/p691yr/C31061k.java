package p691yr;

import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.TextLocalization;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p173fz.C19172a;
import p509sp.C26359h;
import p509sp.C26360i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: yr.k */
/* loaded from: classes4.dex */
public final class C31061k {

    /* renamed from: a */
    private final CoroutineDispatcher f143200a;

    /* renamed from: yr.k$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f143201t;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean z11;
            boolean z12;
            boolean z13;
            String str;
            String str2;
            JSONObject jSONObject;
            Iterator it;
            boolean z14;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            String str3;
            String str4;
            String str5 = "optString(...)";
            String str6 = "";
            AbstractC28298d.m142578e();
            if (this.f143201t == 0) {
                AbstractC24862s.m129228b(obj);
                int i17 = 0;
                int i18 = 1;
                if (C19172a.m100600k("social@feed_reactions@enable", 0) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long m100605p = C19172a.m100605p("social@feed_reactions@range_support_fid", Long.MAX_VALUE);
                if (C19172a.m100600k("social@feed_reactions@enable_ui_v2", 0) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    String m100607r = C19172a.m100607r("social@feed_reactions@reaction_ids", "");
                    ArrayList arrayList2 = new ArrayList();
                    if (m100607r.length() > 0) {
                        JSONArray jSONArray = new JSONArray(m100607r);
                        int length = jSONArray.length();
                        for (int i19 = 0; i19 < length; i19++) {
                            Object obj2 = jSONArray.get(i19);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                            arrayList2.add(AbstractC29094b.m145341c(((Integer) obj2).intValue()));
                        }
                    }
                    JSONObject m100604o = C19172a.m100604o("social@feed_reactions@reaction_info", null, 2, null);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        JSONObject optJSONObject = m100604o.optJSONObject(String.valueOf(intValue));
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("effect_id", str6);
                            String optString2 = optJSONObject.optString("effect_text");
                            if (optJSONObject.optInt("enable_post", i17) == i18) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("background_color");
                            if (optJSONObject2 != null) {
                                int optInt = optJSONObject2.optInt("l");
                                i12 = optJSONObject2.optInt("d");
                                str2 = str6;
                                i11 = optInt;
                            } else {
                                str2 = str6;
                                i11 = 0;
                                i12 = 0;
                            }
                            JSONObject optJSONObject3 = optJSONObject.optJSONObject("border_color");
                            if (optJSONObject3 != null) {
                                int optInt2 = optJSONObject3.optInt("l");
                                i13 = optJSONObject3.optInt("d");
                                jSONObject = m100604o;
                                it = it2;
                                i14 = optInt2;
                            } else {
                                jSONObject = m100604o;
                                it = it2;
                                i13 = 0;
                                i14 = 0;
                            }
                            JSONObject optJSONObject4 = optJSONObject.optJSONObject("text_color");
                            if (optJSONObject4 != null) {
                                i15 = optJSONObject4.optInt("l");
                                i16 = optJSONObject4.optInt("d");
                            } else {
                                i15 = 0;
                                i16 = 0;
                            }
                            JSONObject optJSONObject5 = optJSONObject.optJSONObject("reaction_text");
                            if (optJSONObject5 != null) {
                                String optString3 = optJSONObject5.optString("en");
                                AbstractC19074t.m100207e(optString3, str5);
                                str3 = optJSONObject5.optString("vi");
                                AbstractC19074t.m100207e(str3, str5);
                                str = str5;
                                str4 = optString3;
                            } else {
                                str = str5;
                                str3 = str2;
                                str4 = str3;
                            }
                            z13 = z12;
                            try {
                                TextLocalization textLocalization = new TextLocalization(str3, str4);
                                AbstractC19074t.m100205c(optString);
                                AbstractC19074t.m100205c(optString2);
                                arrayList.add(new C31058h(intValue, textLocalization, z14, optString, optString2, new NumberTheme(i11, i12), new NumberTheme(i14, i13), new NumberTheme(i15, i16), null, null, 768, null));
                            } catch (JSONException e11) {
                                e = e11;
                                AbstractC20110a.f98889a.mo104552e(e);
                                return new C31065o(z11, m100605p, z13, arrayList);
                            }
                        } else {
                            str = str5;
                            str2 = str6;
                            jSONObject = m100604o;
                            it = it2;
                            z13 = z12;
                        }
                        str6 = str2;
                        m100604o = jSONObject;
                        it2 = it;
                        str5 = str;
                        z12 = z13;
                        i17 = 0;
                        i18 = 1;
                    }
                    z13 = z12;
                    C31061k.this.m150953c();
                } catch (JSONException e12) {
                    e = e12;
                    z13 = z12;
                }
                return new C31065o(z11, m100605p, z13, arrayList);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yr.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f143203q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String jSONObject = C19172a.m100604o("social@feed_reactions", null, 2, null).toString(4);
            if (jSONObject == null) {
                return "";
            }
            return jSONObject;
        }
    }

    public C31061k(CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(coroutineDispatcher, "defaultDispatcher");
        this.f143200a = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m150953c() {
        if (C26360i.f125213a.m135694c("FEED_MULTI_REACTIONS")) {
            C26359h.f125209a.mo135685a("FEED_MULTI_REACTIONS", "FEED_REACTION_CONFIG_REPO", b.f143203q);
        }
    }

    /* renamed from: b */
    public final Object m150954b(Continuation continuation) {
        return BuildersKt.m112534g(this.f143200a, new a(null), continuation);
    }

    public /* synthetic */ C31061k(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}
