package ga0;

import ae.C0766k;
import ai.C0862b;
import android.text.SpannableStringBuilder;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import ga0.C19342m0;
import ga0.C19372y0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23006a0;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23282z6;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.C21927m;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p612wk.C29074f;
import p716zh.C31853b5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qe0.AbstractC25251g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25356m;
import qm0.AbstractC25376w;
import qm0.AbstractC25378x;
import tk.C26725d;

/* renamed from: ga0.a1 */
/* loaded from: classes6.dex */
public final class C19307a1 extends AbstractC19358r1 {

    /* renamed from: t */
    private final byte f95871t;

    /* renamed from: u */
    private final HashMap f95872u;

    /* renamed from: v */
    private final List f95873v;

    /* renamed from: w */
    private final List f95874w;

    /* renamed from: x */
    private final List f95875x;

    /* renamed from: y */
    private final long f95876y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.a1$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f95877q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(AbstractC29069a abstractC29069a) {
            AbstractC19074t.m100208f(abstractC29069a, "it");
            return Boolean.valueOf(abstractC29069a instanceof AbstractC29069a.m);
        }
    }

    /* renamed from: ga0.a1$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f95878a;

        public b(InterfaceC18505l interfaceC18505l) {
            this.f95878a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            this.f95878a.mo205i9(obj);
        }
    }

    /* renamed from: ga0.a1$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f95879a;

        public c(InterfaceC18505l interfaceC18505l) {
            this.f95879a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            this.f95879a.mo205i9(null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.a1$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19325g1 f95881r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18505l f95882s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C19325g1 c19325g1, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f95881r = c19325g1;
            this.f95882s = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m101056a(Object obj) {
            C19325g1 c19325g1;
            C26725d m101219j;
            if (!C19307a1.this.isCancelled() && obj != null && (c19325g1 = this.f95881r) != null && (m101219j = c19325g1.m101219j()) != null) {
                C19307a1 c19307a1 = C19307a1.this;
                synchronized (m101219j) {
                    m101219j.m137457d(obj);
                    m101219j.m137458e(c19307a1.m101455l());
                    m101219j.m137459f(System.currentTimeMillis());
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
            this.f95882s.mo205i9(obj);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m101056a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ga0.a1$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f95884r;

        /* renamed from: s */
        final /* synthetic */ boolean[] f95885s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18494a f95886t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C19059j0 c19059j0, boolean[] zArr, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f95884r = c19059j0;
            this.f95885s = zArr;
            this.f95886t = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m101057a(Object obj) {
            if (C19307a1.this.isCancelled()) {
                return;
            }
            this.f95884r.f94941p = obj;
            this.f95885s[0] = true;
            this.f95886t.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m101057a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ga0.a1$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f95888r;

        /* renamed from: s */
        final /* synthetic */ boolean[] f95889s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18494a f95890t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C19059j0 c19059j0, boolean[] zArr, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f95888r = c19059j0;
            this.f95889s = zArr;
            this.f95890t = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m101058a(List list) {
            AbstractC19074t.m100208f(list, "it");
            if (C19307a1.this.isCancelled()) {
                return;
            }
            this.f95888r.f94941p = list;
            this.f95889s[1] = true;
            this.f95890t.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m101058a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ga0.a1$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean[] f95891q;

        /* renamed from: r */
        final /* synthetic */ C19059j0 f95892r;

        /* renamed from: s */
        final /* synthetic */ C19307a1 f95893s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f95894t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean[] zArr, C19059j0 c19059j0, C19307a1 c19307a1, C19059j0 c19059j02) {
            super(0);
            this.f95891q = zArr;
            this.f95892r = c19059j0;
            this.f95893s = c19307a1;
            this.f95894t = c19059j02;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m101059a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m101059a() {
            for (boolean z11 : this.f95891q) {
                if (!z11) {
                    return;
                }
            }
            Object obj = this.f95892r.f94941p;
            if (obj != null) {
                this.f95893s.m101050r(obj, (List) this.f95894t.f94941p);
            } else {
                this.f95893s.m101049q();
            }
        }
    }

    public /* synthetic */ C19307a1(InterfaceC18319c interfaceC18319c, String str, byte b11, HashMap hashMap, List list, List list2, List list3, long j11, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, str, b11, hashMap, list, list2, list3, (i11 & 128) != 0 ? System.currentTimeMillis() : j11);
    }

    /* renamed from: p */
    private final void m101048p(List list, String str, int i11) {
        Object obj;
        ContactProfile m118066m;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ContactProfile m118066m2 = C23024b7.f111993a.m118066m((AbstractC29069a) next);
            if (m118066m2 != null) {
                obj = m118066m2.f42434r;
            }
            if (AbstractC19074t.m100204b(obj, str)) {
                obj = next;
                break;
            }
        }
        AbstractC29069a abstractC29069a = (AbstractC29069a) obj;
        if (abstractC29069a != null && (m118066m = C23024b7.f111993a.m118066m(abstractC29069a)) != null) {
            m118066m.f42352K0 = i11;
            m118066m.f42447v0 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m101049q() {
        List m131187O0;
        AbstractC29076h.f fVar = AbstractC29076h.f.f134820b;
        String m101455l = m101455l();
        ArrayList arrayList = new ArrayList();
        AbstractC29072d.a aVar = AbstractC29072d.a.f134803a;
        C29074f m145258e = AbstractC29075g.m145258e(AbstractC29075g.m145255b(fVar, m101455l, arrayList, aVar), AbstractC29075g.m145255b(AbstractC29076h.g.f134821b, m101455l(), new ArrayList(), aVar), AbstractC29075g.m145255b(AbstractC29076h.r.f134832b, m101455l(), new ArrayList(), aVar));
        AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(AbstractC29076h.k.f134825b, m101455l(), this.f95873v, aVar));
        AbstractC29076h.n nVar = AbstractC29076h.n.f134828b;
        String m101455l2 = m101455l();
        m131187O0 = AbstractC25332a0.m131187O0(this.f95874w);
        AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(nVar, m101455l2, m131187O0, aVar));
        C24848g0 c24848g0 = C24848g0.f119245a;
        mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", m145258e, null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m101050r(final Object obj, final List list) {
        m101437d().mo2040a(new Runnable() { // from class: ga0.z0
            @Override // java.lang.Runnable
            public final void run() {
                C19307a1.m101051s(C19307a1.this, obj, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:464|465|466|(2:467|468)|(4:(15:470|(1:472)|473|474|475|476|(1:478)(1:502)|479|(1:481)(2:492|(1:494)(2:495|(1:497)(2:498|(1:500)(1:501))))|482|483|484|485|486|488)|485|486|488)|506|473|474|475|476|(0)(0)|479|(0)(0)|482|483|484) */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x043b, code lost:            r0 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06d7 A[Catch: Exception -> 0x06ad, TryCatch #24 {Exception -> 0x06ad, blocks: (B:246:0x0676, B:210:0x06b6, B:213:0x06c8, B:215:0x06d7, B:217:0x0702, B:226:0x06dc, B:228:0x06e4, B:229:0x06e7, B:231:0x06ef, B:232:0x06f2, B:234:0x06fc, B:235:0x06ff), top: B:245:0x0676 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06dc A[Catch: Exception -> 0x06ad, TryCatch #24 {Exception -> 0x06ad, blocks: (B:246:0x0676, B:210:0x06b6, B:213:0x06c8, B:215:0x06d7, B:217:0x0702, B:226:0x06dc, B:228:0x06e4, B:229:0x06e7, B:231:0x06ef, B:232:0x06f2, B:234:0x06fc, B:235:0x06ff), top: B:245:0x0676 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0661 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08aa A[Catch: Exception -> 0x07ce, TryCatch #42 {Exception -> 0x07ce, blocks: (B:311:0x07ca, B:312:0x07d3, B:313:0x07e0, B:315:0x07e6, B:317:0x07f6, B:323:0x080f, B:325:0x0817, B:327:0x082d, B:328:0x0833, B:330:0x0837, B:332:0x083d, B:333:0x0843, B:335:0x084b, B:344:0x08a4, B:346:0x08aa, B:347:0x08af, B:350:0x08b8, B:352:0x08bf, B:354:0x08c7, B:355:0x08d0, B:357:0x08d6, B:360:0x08de, B:365:0x08e2, B:367:0x090d, B:368:0x0915, B:370:0x091b, B:372:0x092c, B:378:0x095e, B:379:0x0965, B:382:0x096c, B:403:0x089a, B:338:0x0853, B:390:0x0878, B:393:0x087f, B:395:0x0883, B:343:0x0895, B:400:0x086e), top: B:310:0x07ca, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08bf A[Catch: Exception -> 0x07ce, TryCatch #42 {Exception -> 0x07ce, blocks: (B:311:0x07ca, B:312:0x07d3, B:313:0x07e0, B:315:0x07e6, B:317:0x07f6, B:323:0x080f, B:325:0x0817, B:327:0x082d, B:328:0x0833, B:330:0x0837, B:332:0x083d, B:333:0x0843, B:335:0x084b, B:344:0x08a4, B:346:0x08aa, B:347:0x08af, B:350:0x08b8, B:352:0x08bf, B:354:0x08c7, B:355:0x08d0, B:357:0x08d6, B:360:0x08de, B:365:0x08e2, B:367:0x090d, B:368:0x0915, B:370:0x091b, B:372:0x092c, B:378:0x095e, B:379:0x0965, B:382:0x096c, B:403:0x089a, B:338:0x0853, B:390:0x0878, B:393:0x087f, B:395:0x0883, B:343:0x0895, B:400:0x086e), top: B:310:0x07ca, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08d6 A[Catch: Exception -> 0x07ce, TryCatch #42 {Exception -> 0x07ce, blocks: (B:311:0x07ca, B:312:0x07d3, B:313:0x07e0, B:315:0x07e6, B:317:0x07f6, B:323:0x080f, B:325:0x0817, B:327:0x082d, B:328:0x0833, B:330:0x0837, B:332:0x083d, B:333:0x0843, B:335:0x084b, B:344:0x08a4, B:346:0x08aa, B:347:0x08af, B:350:0x08b8, B:352:0x08bf, B:354:0x08c7, B:355:0x08d0, B:357:0x08d6, B:360:0x08de, B:365:0x08e2, B:367:0x090d, B:368:0x0915, B:370:0x091b, B:372:0x092c, B:378:0x095e, B:379:0x0965, B:382:0x096c, B:403:0x089a, B:338:0x0853, B:390:0x0878, B:393:0x087f, B:395:0x0883, B:343:0x0895, B:400:0x086e), top: B:310:0x07ca, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x09d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0436 A[Catch: Exception -> 0x043b, TryCatch #47 {Exception -> 0x043b, blocks: (B:476:0x03f2, B:479:0x0427, B:481:0x0436, B:483:0x0466, B:492:0x0440, B:494:0x0448, B:495:0x044b, B:497:0x0453, B:498:0x0456, B:500:0x0460, B:501:0x0463), top: B:475:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0440 A[Catch: Exception -> 0x043b, TryCatch #47 {Exception -> 0x043b, blocks: (B:476:0x03f2, B:479:0x0427, B:481:0x0436, B:483:0x0466, B:492:0x0440, B:494:0x0448, B:495:0x044b, B:497:0x0453, B:498:0x0456, B:500:0x0460, B:501:0x0463), top: B:475:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x00dd A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #46 {Exception -> 0x003c, blocks: (B:3:0x000e, B:5:0x0039, B:7:0x0043, B:9:0x004d, B:11:0x0057, B:13:0x0061, B:15:0x006b, B:18:0x0076, B:20:0x0084, B:21:0x008a, B:27:0x0095, B:31:0x00fc, B:33:0x0102, B:35:0x012a, B:51:0x02ba, B:84:0x02b7, B:136:0x02cf, B:137:0x02fa, B:557:0x00dd, B:564:0x00d9, B:565:0x00ce, B:567:0x00d6, B:568:0x00c0, B:570:0x00c8, B:571:0x00ac, B:573:0x00b4, B:576:0x00b9, B:577:0x009e), top: B:2:0x000e }] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m101051s(C19307a1 c19307a1, Object obj, List list) {
        Object obj2;
        ArrayList arrayList;
        String str;
        String str2;
        JSONArray jSONArray;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        String str6;
        ArrayList arrayList3;
        int i11;
        String str7;
        ArrayList arrayList4;
        String str8;
        String str9;
        String str10;
        String str11;
        int i12;
        ArrayList arrayList5;
        JSONObject jSONObject;
        boolean optBoolean;
        String optString;
        String optString2;
        int optInt;
        String optString3;
        boolean optBoolean2;
        String str12;
        int optInt2;
        JSONObject optJSONObject;
        String str13;
        boolean m98558u;
        AbstractC29069a.p pVar;
        boolean m127137G0;
        C19307a1 c19307a12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str14;
        ArrayList arrayList8;
        C17244x0 c17244x0;
        Object obj3;
        Throwable m129221e;
        String m101131E;
        Object m129218b;
        C17244x0 c17244x02;
        C18316b c18316b;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int i13;
        int i14;
        String str15;
        JSONArray jSONArray2;
        ArrayList arrayList11;
        String str16;
        JSONObject jSONObject2;
        String str17;
        int optInt3;
        String optString4;
        boolean optBoolean3;
        int optInt4;
        String str18;
        int optInt5;
        String optString5;
        String str19;
        String str20;
        int optInt6;
        String str21;
        List m131320c;
        boolean m98558u2;
        AbstractC29069a.p pVar2;
        String str22;
        JSONArray jSONArray3;
        String str23;
        int i15;
        String str24;
        String str25;
        String str26;
        ArrayList arrayList12;
        C31853b5 c31853b5;
        JSONObject jSONObject3;
        String optString6;
        CharSequence m127168X0;
        List m131320c2;
        C19307a1 c19307a13 = c19307a1;
        AbstractC19074t.m100208f(c19307a13, "this$0");
        AbstractC19074t.m100208f(obj, "$entity");
        try {
            ArrayList arrayList13 = new ArrayList();
            arrayList13.addAll(c19307a13.f95874w);
            ArrayList arrayList14 = new ArrayList();
            arrayList14.addAll(c19307a13.f95873v);
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            ArrayList arrayList17 = new ArrayList();
            JSONObject jSONObject4 = obj instanceof JSONObject ? (JSONObject) obj : null;
            JSONObject optJSONObject2 = jSONObject4 != null ? jSONObject4.optJSONObject("data") : null;
            JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("oaSearchRS") : null;
            JSONArray optJSONArray2 = optJSONObject2 != null ? optJSONObject2.optJSONArray("phoneSearchRS") : null;
            JSONArray optJSONArray3 = optJSONObject2 != null ? optJSONObject2.optJSONArray("uNameSearchRS") : null;
            JSONArray optJSONArray4 = optJSONObject2 != null ? optJSONObject2.optJSONArray("miniAppRS") : null;
            Integer valueOf = optJSONObject2 != null ? Integer.valueOf(optJSONObject2.optInt("search_phone_empty", 0)) : null;
            String m118048i = optJSONObject2 != null ? C23024b7.m118048i(optJSONObject2) : null;
            if (c19307a1.isCancelled()) {
                return;
            }
            if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                if (valueOf != null && valueOf.intValue() == 0) {
                    obj2 = null;
                    if (obj2 != null) {
                        arrayList15.add(obj2);
                    }
                }
                if (valueOf != null && valueOf.intValue() == 1001) {
                    if (m118048i == null) {
                        m118048i = "";
                    }
                    obj2 = new AbstractC29069a.d.a.C33036a(m118048i);
                    if (obj2 != null) {
                    }
                }
                if (valueOf.intValue() == 1011) {
                    obj2 = AbstractC29069a.d.a.b.f134673c;
                    if (obj2 != null) {
                    }
                }
                if (valueOf != null && valueOf.intValue() == 1012) {
                    obj2 = AbstractC29069a.d.a.c.f134674c;
                    if (obj2 != null) {
                    }
                }
                obj2 = AbstractC29069a.d.a.C33037d.f134675c;
                if (obj2 != null) {
                }
            }
            String str27 = "group_msg";
            String str28 = "chatable";
            String str29 = "ttf";
            String str30 = "avt";
            String str31 = "is_fan";
            ArrayList arrayList18 = arrayList17;
            String str32 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
            JSONArray jSONArray4 = optJSONArray4;
            String str33 = "dpn";
            ArrayList arrayList19 = arrayList16;
            String str34 = "uid";
            JSONArray jSONArray5 = optJSONArray3;
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                arrayList = arrayList15;
                str = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                str2 = "avt";
                jSONArray = optJSONArray2;
                str3 = "ttf";
                str4 = "is_fan";
                str5 = "chatable";
                arrayList2 = arrayList13;
            } else {
                C31853b5 m114357s = C21927m.m114302u().m114357s();
                arrayList = arrayList15;
                String[] m118488a = C23282z6.m120367c(c19307a1.m101455l(), 4096).m118488a();
                ArrayList arrayList20 = new ArrayList();
                jSONArray = optJSONArray2;
                int length = optJSONArray.length();
                C31853b5 c31853b52 = m114357s;
                int i16 = 0;
                while (i16 < length) {
                    if (c19307a1.isCancelled()) {
                        return;
                    }
                    try {
                        jSONObject3 = optJSONArray.getJSONObject(i16);
                        jSONArray3 = optJSONArray;
                    } catch (Exception e11) {
                        e = e11;
                        str22 = str32;
                        jSONArray3 = optJSONArray;
                    }
                    try {
                        String optString7 = jSONObject3.optString("uid");
                        i15 = length;
                        try {
                            int optInt7 = jSONObject3.optInt(str32);
                            str22 = str32;
                            try {
                                if (c19307a13.f95872u.containsKey(optString7)) {
                                    AbstractC19074t.m100205c(optString7);
                                    c19307a13.m101048p(arrayList13, optString7, optInt7);
                                    c19307a13.m101048p(arrayList14, optString7, optInt7);
                                    arrayList12 = arrayList13;
                                    str23 = str30;
                                    str24 = str29;
                                    str25 = str31;
                                    str26 = str28;
                                    c31853b5 = c31853b52;
                                } else {
                                    HashMap hashMap = c19307a13.f95872u;
                                    AbstractC19074t.m100205c(optString7);
                                    hashMap.put(optString7, optString7);
                                    boolean optBoolean4 = jSONObject3.optBoolean(str31);
                                    str25 = str31;
                                    try {
                                        optString6 = jSONObject3.optString(str30);
                                        str23 = str30;
                                    } catch (Exception e12) {
                                        e = e12;
                                        arrayList12 = arrayList13;
                                        str23 = str30;
                                    }
                                    try {
                                        int optInt8 = jSONObject3.optInt(str29);
                                        str24 = str29;
                                        try {
                                            String optString8 = jSONObject3.optString("dpn");
                                            ArrayList arrayList21 = arrayList13;
                                            try {
                                                boolean optBoolean5 = jSONObject3.optBoolean(str28);
                                                ArrayList arrayList22 = arrayList14;
                                                str26 = str28;
                                                try {
                                                    int optInt9 = jSONObject3.optInt("group_msg", 1);
                                                    String optString9 = jSONObject3.optString("desc");
                                                    ContactProfile contactProfile = new ContactProfile(optString7);
                                                    contactProfile.f42441t0 = optBoolean4;
                                                    contactProfile.f42446v = optString6;
                                                    contactProfile.f42438s0 = optInt8;
                                                    contactProfile.f42437s = optString8;
                                                    contactProfile.f42444u0 = optBoolean5;
                                                    contactProfile.f42447v0 = optInt7;
                                                    contactProfile.f42352K0 = optInt7;
                                                    contactProfile.f42453x0 = optInt9;
                                                    contactProfile.f42392X1 = i16;
                                                    arrayList20.clear();
                                                    ArrayList arrayList23 = new ArrayList();
                                                    String str35 = contactProfile.f42437s;
                                                    AbstractC19074t.m100207e(str35, "dpn");
                                                    m127168X0 = AbstractC24342w.m127168X0(str35);
                                                    String obj4 = m127168X0.toString();
                                                    AbstractC23262x6.m119994g(c19307a1.m101455l(), obj4, contactProfile, arrayList20, arrayList23, 0);
                                                    String str36 = contactProfile.f42434r;
                                                    AbstractC19074t.m100207e(str36, "uid");
                                                    contactProfile.f42387W = C23024b7.m118038J(str36, obj4, c19307a13.f95875x, c19307a13.f95876y, 0, null) + 1.0f;
                                                    Iterator it = arrayList20.iterator();
                                                    while (it.hasNext()) {
                                                        contactProfile.f42399a1.add(Integer.valueOf(((Number) it.next()).intValue()));
                                                    }
                                                    arrayList20.clear();
                                                    m131320c2 = AbstractC25356m.m131320c(m118488a);
                                                    contactProfile.f42436r1 = AbstractC23217t2.m119655g(optString9, m131320c2, 0);
                                                    c31853b5 = c31853b52;
                                                    try {
                                                        if (c31853b5.m153137g(contactProfile.f42434r)) {
                                                            try {
                                                                arrayList14 = arrayList22;
                                                                try {
                                                                    arrayList14.add(C19372y0.a.m101483e(C19372y0.Companion, contactProfile, 16, null, null, null, null, null, 124, null));
                                                                    arrayList12 = arrayList21;
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    arrayList12 = arrayList21;
                                                                    e.printStackTrace();
                                                                    i16++;
                                                                    c31853b52 = c31853b5;
                                                                    arrayList13 = arrayList12;
                                                                    optJSONArray = jSONArray3;
                                                                    length = i15;
                                                                    str32 = str22;
                                                                    str31 = str25;
                                                                    str30 = str23;
                                                                    str29 = str24;
                                                                    str28 = str26;
                                                                }
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                arrayList14 = arrayList22;
                                                            }
                                                        } else {
                                                            arrayList14 = arrayList22;
                                                            arrayList12 = arrayList21;
                                                            try {
                                                                arrayList12.add(C19372y0.a.m101483e(C19372y0.Companion, contactProfile, 16, null, null, null, null, null, 124, null));
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                e.printStackTrace();
                                                                i16++;
                                                                c31853b52 = c31853b5;
                                                                arrayList13 = arrayList12;
                                                                optJSONArray = jSONArray3;
                                                                length = i15;
                                                                str32 = str22;
                                                                str31 = str25;
                                                                str30 = str23;
                                                                str29 = str24;
                                                                str28 = str26;
                                                            }
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        arrayList12 = arrayList21;
                                                        arrayList14 = arrayList22;
                                                        e.printStackTrace();
                                                        i16++;
                                                        c31853b52 = c31853b5;
                                                        arrayList13 = arrayList12;
                                                        optJSONArray = jSONArray3;
                                                        length = i15;
                                                        str32 = str22;
                                                        str31 = str25;
                                                        str30 = str23;
                                                        str29 = str24;
                                                        str28 = str26;
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    c31853b5 = c31853b52;
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                str26 = str28;
                                                c31853b5 = c31853b52;
                                            }
                                        } catch (Exception e19) {
                                            e = e19;
                                            arrayList12 = arrayList13;
                                            str26 = str28;
                                            c31853b5 = c31853b52;
                                            e.printStackTrace();
                                            i16++;
                                            c31853b52 = c31853b5;
                                            arrayList13 = arrayList12;
                                            optJSONArray = jSONArray3;
                                            length = i15;
                                            str32 = str22;
                                            str31 = str25;
                                            str30 = str23;
                                            str29 = str24;
                                            str28 = str26;
                                        }
                                    } catch (Exception e21) {
                                        e = e21;
                                        arrayList12 = arrayList13;
                                        str24 = str29;
                                        str26 = str28;
                                        c31853b5 = c31853b52;
                                        e.printStackTrace();
                                        i16++;
                                        c31853b52 = c31853b5;
                                        arrayList13 = arrayList12;
                                        optJSONArray = jSONArray3;
                                        length = i15;
                                        str32 = str22;
                                        str31 = str25;
                                        str30 = str23;
                                        str29 = str24;
                                        str28 = str26;
                                    }
                                }
                            } catch (Exception e22) {
                                e = e22;
                                arrayList12 = arrayList13;
                                str23 = str30;
                                str24 = str29;
                                str25 = str31;
                            }
                        } catch (Exception e23) {
                            e = e23;
                            str22 = str32;
                            str23 = str30;
                            str24 = str29;
                            str25 = str31;
                            str26 = str28;
                            arrayList12 = arrayList13;
                            c31853b5 = c31853b52;
                            e.printStackTrace();
                            i16++;
                            c31853b52 = c31853b5;
                            arrayList13 = arrayList12;
                            optJSONArray = jSONArray3;
                            length = i15;
                            str32 = str22;
                            str31 = str25;
                            str30 = str23;
                            str29 = str24;
                            str28 = str26;
                        }
                    } catch (Exception e24) {
                        e = e24;
                        str22 = str32;
                        str23 = str30;
                        i15 = length;
                        str24 = str29;
                        str25 = str31;
                        str26 = str28;
                        arrayList12 = arrayList13;
                        c31853b5 = c31853b52;
                        e.printStackTrace();
                        i16++;
                        c31853b52 = c31853b5;
                        arrayList13 = arrayList12;
                        optJSONArray = jSONArray3;
                        length = i15;
                        str32 = str22;
                        str31 = str25;
                        str30 = str23;
                        str29 = str24;
                        str28 = str26;
                    }
                    i16++;
                    c31853b52 = c31853b5;
                    arrayList13 = arrayList12;
                    optJSONArray = jSONArray3;
                    length = i15;
                    str32 = str22;
                    str31 = str25;
                    str30 = str23;
                    str29 = str24;
                    str28 = str26;
                }
                str = str32;
                str2 = str30;
                str3 = str29;
                str4 = str31;
                str5 = str28;
                arrayList2 = arrayList13;
                C19342m0.a aVar = C19342m0.Companion;
                AbstractC25376w.m131534w(arrayList14, aVar.m101360f());
                AbstractC25376w.m131534w(arrayList2, aVar.m101360f());
            }
            if (c19307a1.isCancelled()) {
                return;
            }
            String str37 = "getString(...)";
            String str38 = "sourceView";
            String str39 = "srcType";
            String str40 = "stt";
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() > 0) {
                        int length2 = jSONArray.length();
                        int i17 = 0;
                        while (i17 < length2) {
                            JSONArray jSONArray6 = jSONArray;
                            try {
                                jSONObject = jSONArray6.getJSONObject(i17);
                            } catch (Exception e25) {
                                e = e25;
                                str6 = str37;
                                arrayList3 = arrayList14;
                                i11 = i17;
                                str7 = str34;
                                arrayList4 = arrayList2;
                                jSONArray = jSONArray6;
                            }
                            try {
                                String optString10 = jSONObject.optString(str34);
                                i12 = length2;
                                try {
                                    if (c19307a13.f95872u.containsKey(optString10)) {
                                        str6 = str37;
                                        arrayList3 = arrayList14;
                                        i11 = i17;
                                        str7 = str34;
                                        arrayList4 = arrayList2;
                                        str8 = str33;
                                        str9 = str39;
                                        str10 = str27;
                                        str11 = str40;
                                        arrayList5 = arrayList;
                                    } else {
                                        HashMap hashMap2 = c19307a13.f95872u;
                                        AbstractC19074t.m100205c(optString10);
                                        hashMap2.put(optString10, optString10);
                                        arrayList3 = arrayList14;
                                        String str41 = str4;
                                        try {
                                            optBoolean = jSONObject.optBoolean(str41);
                                            arrayList4 = arrayList2;
                                            str4 = str41;
                                            String str42 = str2;
                                            try {
                                                optString = jSONObject.optString(str42);
                                                str2 = str42;
                                            } catch (Exception e26) {
                                                e = e26;
                                                str6 = str37;
                                                i11 = i17;
                                                str7 = str34;
                                                str2 = str42;
                                            }
                                        } catch (Exception e27) {
                                            e = e27;
                                            str6 = str37;
                                            i11 = i17;
                                            str7 = str34;
                                            arrayList4 = arrayList2;
                                            str8 = str33;
                                            str9 = str39;
                                            str10 = str27;
                                            str11 = str40;
                                            str4 = str41;
                                        }
                                        try {
                                            optString2 = jSONObject.optString(str40);
                                            str11 = str40;
                                            String str43 = str3;
                                            try {
                                                optInt = jSONObject.optInt(str43);
                                                str3 = str43;
                                                try {
                                                    optString3 = jSONObject.optString(str33);
                                                    str7 = str34;
                                                    str8 = str33;
                                                    String str44 = str5;
                                                    try {
                                                        optBoolean2 = jSONObject.optBoolean(str44);
                                                        i11 = i17;
                                                        str5 = str44;
                                                        str12 = str;
                                                    } catch (Exception e28) {
                                                        e = e28;
                                                        str6 = str37;
                                                        i11 = i17;
                                                        str5 = str44;
                                                    }
                                                } catch (Exception e29) {
                                                    e = e29;
                                                    str6 = str37;
                                                    i11 = i17;
                                                    str7 = str34;
                                                    str8 = str33;
                                                }
                                            } catch (Exception e31) {
                                                e = e31;
                                                str6 = str37;
                                                i11 = i17;
                                                str7 = str34;
                                                str8 = str33;
                                                str9 = str39;
                                                str10 = str27;
                                                str3 = str43;
                                            }
                                        } catch (Exception e32) {
                                            e = e32;
                                            str6 = str37;
                                            i11 = i17;
                                            str7 = str34;
                                            str8 = str33;
                                            str9 = str39;
                                            str10 = str27;
                                            str11 = str40;
                                            arrayList5 = arrayList;
                                            e.printStackTrace();
                                            i17 = i11 + 1;
                                            arrayList = arrayList5;
                                            length2 = i12;
                                            str40 = str11;
                                            str33 = str8;
                                            str34 = str7;
                                            str27 = str10;
                                            arrayList2 = arrayList4;
                                            arrayList14 = arrayList3;
                                            str39 = str9;
                                            str37 = str6;
                                            c19307a13 = c19307a1;
                                        }
                                        try {
                                            int optInt10 = jSONObject.optInt(str12);
                                            String str45 = str37;
                                            str = str12;
                                            try {
                                                int optInt11 = jSONObject.optInt(str27, 1);
                                                str10 = str27;
                                                try {
                                                    int optInt12 = jSONObject.optInt(str39, -1);
                                                    str9 = str39;
                                                    try {
                                                        optInt2 = jSONObject.optInt("account_type", 0);
                                                        optJSONObject = jSONObject.optJSONObject("business_account");
                                                    } catch (Exception e33) {
                                                        e = e33;
                                                        arrayList5 = arrayList;
                                                        str6 = str45;
                                                        e.printStackTrace();
                                                        i17 = i11 + 1;
                                                        arrayList = arrayList5;
                                                        length2 = i12;
                                                        str40 = str11;
                                                        str33 = str8;
                                                        str34 = str7;
                                                        str27 = str10;
                                                        arrayList2 = arrayList4;
                                                        arrayList14 = arrayList3;
                                                        str39 = str9;
                                                        str37 = str6;
                                                        c19307a13 = c19307a1;
                                                    }
                                                    try {
                                                        if (optJSONObject != null) {
                                                            str13 = optJSONObject.toString();
                                                            if (str13 == null) {
                                                            }
                                                            ContactProfile contactProfile2 = new ContactProfile(optString10);
                                                            contactProfile2.f42441t0 = optBoolean;
                                                            contactProfile2.f42446v = optString;
                                                            contactProfile2.f42458z = optString2;
                                                            contactProfile2.f42438s0 = optInt;
                                                            contactProfile2.f42437s = optString3;
                                                            contactProfile2.f42444u0 = optBoolean2;
                                                            contactProfile2.f42447v0 = optInt10;
                                                            contactProfile2.f42352K0 = optInt10;
                                                            contactProfile2.f42453x0 = optInt11;
                                                            contactProfile2.f42376S0 = optInt12;
                                                            contactProfile2.f42373R0 = 85;
                                                            contactProfile2.f42361N0 = optInt2;
                                                            contactProfile2.f42364O0 = str13;
                                                            TrackingSource trackingSource = new TrackingSource(85);
                                                            trackingSource.m40677a("sourceView", 11);
                                                            C21927m.m114302u().m114330e0(optString10, trackingSource);
                                                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.des_phone_title);
                                                            str6 = str45;
                                                            AbstractC19074t.m100207e(m118743r0, str6);
                                                            contactProfile2.f42436r1.append((CharSequence) m118743r0);
                                                            int length3 = contactProfile2.f42436r1.length();
                                                            contactProfile2.f42436r1.append((CharSequence) c19307a1.m101455l());
                                                            AbstractC23217t2.m119663o(contactProfile2.f42436r1, length3, contactProfile2.f42436r1.length(), 0);
                                                            m98558u = C18644n.m98531l().m98558u(contactProfile2.f42434r);
                                                            C19372y0.a aVar2 = C19372y0.Companion;
                                                            int m101485a = (!m98558u ? 2 : 32) | 134217728 | aVar2.m101485a(contactProfile2);
                                                            if (!m98558u) {
                                                                pVar = AbstractC29069a.p.l.f134728b;
                                                            } else if (AbstractC23063f2.m118359k(contactProfile2.f42434r)) {
                                                                pVar = AbstractC29069a.p.d.f134718a;
                                                            } else if (AbstractC23063f2.m118360l(contactProfile2.f42434r)) {
                                                                pVar = AbstractC29069a.p.a.f134715c;
                                                            } else if (!AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile2.f42434r)) {
                                                                pVar = AbstractC29069a.p.b.f134716c;
                                                            } else {
                                                                pVar = AbstractC29069a.p.d.f134718a;
                                                            }
                                                            AbstractC29069a.o m101483e = C19372y0.a.m101483e(aVar2, contactProfile2, m101485a, null, null, pVar, null, null, 108, null);
                                                            arrayList5 = arrayList;
                                                            arrayList5.add(m101483e);
                                                        }
                                                        arrayList5.add(m101483e);
                                                    } catch (Exception e34) {
                                                        e = e34;
                                                        e.printStackTrace();
                                                        i17 = i11 + 1;
                                                        arrayList = arrayList5;
                                                        length2 = i12;
                                                        str40 = str11;
                                                        str33 = str8;
                                                        str34 = str7;
                                                        str27 = str10;
                                                        arrayList2 = arrayList4;
                                                        arrayList14 = arrayList3;
                                                        str39 = str9;
                                                        str37 = str6;
                                                        c19307a13 = c19307a1;
                                                    }
                                                    str13 = "";
                                                    ContactProfile contactProfile22 = new ContactProfile(optString10);
                                                    contactProfile22.f42441t0 = optBoolean;
                                                    contactProfile22.f42446v = optString;
                                                    contactProfile22.f42458z = optString2;
                                                    contactProfile22.f42438s0 = optInt;
                                                    contactProfile22.f42437s = optString3;
                                                    contactProfile22.f42444u0 = optBoolean2;
                                                    contactProfile22.f42447v0 = optInt10;
                                                    contactProfile22.f42352K0 = optInt10;
                                                    contactProfile22.f42453x0 = optInt11;
                                                    contactProfile22.f42376S0 = optInt12;
                                                    contactProfile22.f42373R0 = 85;
                                                    contactProfile22.f42361N0 = optInt2;
                                                    contactProfile22.f42364O0 = str13;
                                                    TrackingSource trackingSource2 = new TrackingSource(85);
                                                    trackingSource2.m40677a("sourceView", 11);
                                                    C21927m.m114302u().m114330e0(optString10, trackingSource2);
                                                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.des_phone_title);
                                                    str6 = str45;
                                                    AbstractC19074t.m100207e(m118743r02, str6);
                                                    contactProfile22.f42436r1.append((CharSequence) m118743r02);
                                                    int length32 = contactProfile22.f42436r1.length();
                                                    contactProfile22.f42436r1.append((CharSequence) c19307a1.m101455l());
                                                    AbstractC23217t2.m119663o(contactProfile22.f42436r1, length32, contactProfile22.f42436r1.length(), 0);
                                                    m98558u = C18644n.m98531l().m98558u(contactProfile22.f42434r);
                                                    C19372y0.a aVar22 = C19372y0.Companion;
                                                    int m101485a2 = (!m98558u ? 2 : 32) | 134217728 | aVar22.m101485a(contactProfile22);
                                                    if (!m98558u) {
                                                    }
                                                    AbstractC29069a.o m101483e2 = C19372y0.a.m101483e(aVar22, contactProfile22, m101485a2, null, null, pVar, null, null, 108, null);
                                                    arrayList5 = arrayList;
                                                } catch (Exception e35) {
                                                    e = e35;
                                                    str9 = str39;
                                                }
                                            } catch (Exception e36) {
                                                e = e36;
                                                str9 = str39;
                                                str10 = str27;
                                            }
                                        } catch (Exception e37) {
                                            e = e37;
                                            str6 = str37;
                                            str = str12;
                                            str9 = str39;
                                            str10 = str27;
                                            arrayList5 = arrayList;
                                            e.printStackTrace();
                                            i17 = i11 + 1;
                                            arrayList = arrayList5;
                                            length2 = i12;
                                            str40 = str11;
                                            str33 = str8;
                                            str34 = str7;
                                            str27 = str10;
                                            arrayList2 = arrayList4;
                                            arrayList14 = arrayList3;
                                            str39 = str9;
                                            str37 = str6;
                                            c19307a13 = c19307a1;
                                        }
                                    }
                                } catch (Exception e38) {
                                    e = e38;
                                    str6 = str37;
                                    arrayList3 = arrayList14;
                                    i11 = i17;
                                    str7 = str34;
                                    arrayList4 = arrayList2;
                                }
                            } catch (Exception e39) {
                                e = e39;
                                str6 = str37;
                                arrayList3 = arrayList14;
                                i11 = i17;
                                str7 = str34;
                                arrayList4 = arrayList2;
                                str8 = str33;
                                str9 = str39;
                                str10 = str27;
                                str11 = str40;
                                i12 = length2;
                                arrayList5 = arrayList;
                                e.printStackTrace();
                                i17 = i11 + 1;
                                arrayList = arrayList5;
                                length2 = i12;
                                str40 = str11;
                                str33 = str8;
                                str34 = str7;
                                str27 = str10;
                                arrayList2 = arrayList4;
                                arrayList14 = arrayList3;
                                str39 = str9;
                                str37 = str6;
                                c19307a13 = c19307a1;
                            }
                            i17 = i11 + 1;
                            arrayList = arrayList5;
                            length2 = i12;
                            str40 = str11;
                            str33 = str8;
                            str34 = str7;
                            str27 = str10;
                            arrayList2 = arrayList4;
                            arrayList14 = arrayList3;
                            str39 = str9;
                            str37 = str6;
                            c19307a13 = c19307a1;
                        }
                    }
                } catch (Exception e41) {
                    e = e41;
                    e.printStackTrace();
                    if (c19307a1.isCancelled()) {
                        c19307a1.m101049q();
                        return;
                    }
                    return;
                }
            }
            String str46 = str37;
            ArrayList arrayList24 = arrayList14;
            String str47 = str34;
            ArrayList arrayList25 = arrayList2;
            String str48 = str33;
            String str49 = str39;
            String str50 = str27;
            String str51 = str40;
            ArrayList arrayList26 = arrayList;
            if (c19307a1.isCancelled()) {
                return;
            }
            m127137G0 = AbstractC24342w.m127137G0(c19307a1.m101455l(), '@', false, 2, null);
            if (m127137G0 && jSONArray5 != null && jSONArray5.length() > 0) {
                int length4 = jSONArray5.length();
                int i18 = 0;
                while (i18 < length4) {
                    JSONArray jSONArray7 = jSONArray5;
                    try {
                        jSONObject2 = jSONArray7.getJSONObject(i18);
                        str17 = str47;
                    } catch (Exception e42) {
                        e = e42;
                        arrayList10 = arrayList26;
                        i13 = length4;
                        i14 = i18;
                    }
                    try {
                        String optString11 = jSONObject2.optString(str17);
                        if (c19307a1.f95872u.containsKey(optString11)) {
                            arrayList10 = arrayList26;
                            i13 = length4;
                            i14 = i18;
                            str47 = str17;
                            str15 = str38;
                            jSONArray2 = jSONArray7;
                            arrayList11 = arrayList19;
                            str16 = str46;
                        } else {
                            HashMap hashMap3 = c19307a1.f95872u;
                            AbstractC19074t.m100205c(optString11);
                            hashMap3.put(optString11, optString11);
                            String str52 = str4;
                            try {
                                boolean optBoolean6 = jSONObject2.optBoolean(str52);
                                String str53 = str2;
                                try {
                                    String optString12 = jSONObject2.optString(str53);
                                    i13 = length4;
                                    jSONArray2 = jSONArray7;
                                    String str54 = str51;
                                    try {
                                        String optString13 = jSONObject2.optString(str54);
                                        str51 = str54;
                                        str4 = str52;
                                        String str55 = str3;
                                        try {
                                            optInt3 = jSONObject2.optInt(str55);
                                            str3 = str55;
                                            str2 = str53;
                                            String str56 = str48;
                                            try {
                                                optString4 = jSONObject2.optString(str56);
                                                arrayList10 = arrayList26;
                                                str48 = str56;
                                                String str57 = str5;
                                                try {
                                                    optBoolean3 = jSONObject2.optBoolean(str57);
                                                    str5 = str57;
                                                    str47 = str17;
                                                    String str58 = str;
                                                    try {
                                                        optInt4 = jSONObject2.optInt(str58);
                                                        str = str58;
                                                        i14 = i18;
                                                        str18 = str50;
                                                    } catch (Exception e43) {
                                                        e = e43;
                                                        str = str58;
                                                        i14 = i18;
                                                    }
                                                } catch (Exception e44) {
                                                    e = e44;
                                                    str5 = str57;
                                                    i14 = i18;
                                                    str47 = str17;
                                                    str15 = str38;
                                                    arrayList11 = arrayList19;
                                                    str16 = str46;
                                                    e.printStackTrace();
                                                    i18 = i14 + 1;
                                                    arrayList19 = arrayList11;
                                                    str46 = str16;
                                                    length4 = i13;
                                                    jSONArray5 = jSONArray2;
                                                    arrayList26 = arrayList10;
                                                    str38 = str15;
                                                }
                                            } catch (Exception e45) {
                                                e = e45;
                                                arrayList10 = arrayList26;
                                                str48 = str56;
                                            }
                                        } catch (Exception e46) {
                                            e = e46;
                                            arrayList10 = arrayList26;
                                            str3 = str55;
                                            i14 = i18;
                                            str47 = str17;
                                            str15 = str38;
                                            str2 = str53;
                                            arrayList11 = arrayList19;
                                            str16 = str46;
                                            e.printStackTrace();
                                            i18 = i14 + 1;
                                            arrayList19 = arrayList11;
                                            str46 = str16;
                                            length4 = i13;
                                            jSONArray5 = jSONArray2;
                                            arrayList26 = arrayList10;
                                            str38 = str15;
                                        }
                                        try {
                                            optInt5 = jSONObject2.optInt(str18, 1);
                                            optString5 = jSONObject2.optString("uname");
                                            str19 = str46;
                                            str50 = str18;
                                            str20 = str38;
                                            String str59 = str49;
                                            try {
                                                optInt6 = jSONObject2.optInt(str59, -1);
                                                str49 = str59;
                                            } catch (Exception e47) {
                                                e = e47;
                                                str49 = str59;
                                            }
                                        } catch (Exception e48) {
                                            e = e48;
                                            str50 = str18;
                                            str15 = str38;
                                            arrayList11 = arrayList19;
                                            str16 = str46;
                                            e.printStackTrace();
                                            i18 = i14 + 1;
                                            arrayList19 = arrayList11;
                                            str46 = str16;
                                            length4 = i13;
                                            jSONArray5 = jSONArray2;
                                            arrayList26 = arrayList10;
                                            str38 = str15;
                                        }
                                        try {
                                            int optInt13 = jSONObject2.optInt("account_type", 0);
                                            JSONObject optJSONObject3 = jSONObject2.optJSONObject("business_account");
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (optJSONObject3 != null) {
                                                                str21 = optJSONObject3.toString();
                                                                if (str21 == null) {
                                                                }
                                                                ContactProfile contactProfile3 = new ContactProfile(optString11);
                                                                contactProfile3.f42441t0 = optBoolean6;
                                                                contactProfile3.f42446v = optString12;
                                                                contactProfile3.f42458z = optString13;
                                                                contactProfile3.f42438s0 = optInt3;
                                                                contactProfile3.f42437s = optString4;
                                                                contactProfile3.f42444u0 = optBoolean3;
                                                                contactProfile3.f42447v0 = optInt4;
                                                                contactProfile3.f42352K0 = optInt4;
                                                                contactProfile3.f42453x0 = optInt5;
                                                                contactProfile3.f42460z1 = optString5;
                                                                contactProfile3.f42376S0 = optInt6;
                                                                contactProfile3.f42373R0 = 86;
                                                                contactProfile3.f42361N0 = optInt13;
                                                                contactProfile3.f42364O0 = str21;
                                                                TrackingSource trackingSource3 = new TrackingSource(86);
                                                                str15 = str20;
                                                                trackingSource3.m40677a(str15, 11);
                                                                C21927m.m114302u().m114330e0(optString11, trackingSource3);
                                                                String[] m118488a2 = C23282z6.m120367c(c19307a1.m101455l(), 4096).m118488a();
                                                                if (optString5 != null) {
                                                                    try {
                                                                        if (optString5.length() != 0) {
                                                                            C19067n0 c19067n0 = C19067n0.f94947a;
                                                                            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.prefix_username);
                                                                            str16 = str19;
                                                                            try {
                                                                                AbstractC19074t.m100207e(m118743r03, str16);
                                                                                String str60 = contactProfile3.f42460z1;
                                                                                m131320c = AbstractC25356m.m131320c(m118488a2);
                                                                                String format = String.format(m118743r03, Arrays.copyOf(new Object[]{AbstractC23217t2.m119655g(str60, m131320c, 0)}, 1));
                                                                                AbstractC19074t.m100207e(format, "format(...)");
                                                                                contactProfile3.f42439s1 = new SpannableStringBuilder("Username: " + format);
                                                                                m98558u2 = C18644n.m98531l().m98558u(contactProfile3.f42434r);
                                                                                C19372y0.a aVar3 = C19372y0.Companion;
                                                                                int m101485a3 = (m98558u2 ? 2 : 32) | 268435456 | aVar3.m101485a(contactProfile3);
                                                                                if (m98558u2) {
                                                                                    pVar2 = AbstractC29069a.p.l.f134728b;
                                                                                } else if (AbstractC23063f2.m118359k(contactProfile3.f42434r)) {
                                                                                    pVar2 = AbstractC29069a.p.d.f134718a;
                                                                                } else if (AbstractC23063f2.m118360l(contactProfile3.f42434r)) {
                                                                                    pVar2 = AbstractC29069a.p.a.f134715c;
                                                                                } else if (!AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile3.f42434r)) {
                                                                                    pVar2 = AbstractC29069a.p.b.f134716c;
                                                                                } else {
                                                                                    pVar2 = AbstractC29069a.p.d.f134718a;
                                                                                }
                                                                                AbstractC29069a.o m101483e3 = C19372y0.a.m101483e(aVar3, contactProfile3, m101485a3, null, null, pVar2, null, null, 108, null);
                                                                                arrayList11 = arrayList19;
                                                                                arrayList11.add(m101483e3);
                                                                            } catch (Exception e49) {
                                                                                e = e49;
                                                                                arrayList11 = arrayList19;
                                                                                e.printStackTrace();
                                                                                i18 = i14 + 1;
                                                                                arrayList19 = arrayList11;
                                                                                str46 = str16;
                                                                                length4 = i13;
                                                                                jSONArray5 = jSONArray2;
                                                                                arrayList26 = arrayList10;
                                                                                str38 = str15;
                                                                            }
                                                                        }
                                                                    } catch (Exception e51) {
                                                                        e = e51;
                                                                        str16 = str19;
                                                                        arrayList11 = arrayList19;
                                                                        e.printStackTrace();
                                                                        i18 = i14 + 1;
                                                                        arrayList19 = arrayList11;
                                                                        str46 = str16;
                                                                        length4 = i13;
                                                                        jSONArray5 = jSONArray2;
                                                                        arrayList26 = arrayList10;
                                                                        str38 = str15;
                                                                    }
                                                                }
                                                                str16 = str19;
                                                                m98558u2 = C18644n.m98531l().m98558u(contactProfile3.f42434r);
                                                                C19372y0.a aVar32 = C19372y0.Companion;
                                                                int m101485a32 = (m98558u2 ? 2 : 32) | 268435456 | aVar32.m101485a(contactProfile3);
                                                                if (m98558u2) {
                                                                }
                                                                AbstractC29069a.o m101483e32 = C19372y0.a.m101483e(aVar32, contactProfile3, m101485a32, null, null, pVar2, null, null, 108, null);
                                                                arrayList11 = arrayList19;
                                                                arrayList11.add(m101483e32);
                                                            }
                                                            arrayList11.add(m101483e32);
                                                        } catch (Exception e52) {
                                                            e = e52;
                                                            e.printStackTrace();
                                                            i18 = i14 + 1;
                                                            arrayList19 = arrayList11;
                                                            str46 = str16;
                                                            length4 = i13;
                                                            jSONArray5 = jSONArray2;
                                                            arrayList26 = arrayList10;
                                                            str38 = str15;
                                                        }
                                                        String[] m118488a22 = C23282z6.m120367c(c19307a1.m101455l(), 4096).m118488a();
                                                        if (optString5 != null) {
                                                        }
                                                        str16 = str19;
                                                        m98558u2 = C18644n.m98531l().m98558u(contactProfile3.f42434r);
                                                        C19372y0.a aVar322 = C19372y0.Companion;
                                                        int m101485a322 = (m98558u2 ? 2 : 32) | 268435456 | aVar322.m101485a(contactProfile3);
                                                        if (m98558u2) {
                                                        }
                                                        AbstractC29069a.o m101483e322 = C19372y0.a.m101483e(aVar322, contactProfile3, m101485a322, null, null, pVar2, null, null, 108, null);
                                                        arrayList11 = arrayList19;
                                                    } catch (Exception e53) {
                                                        e = e53;
                                                        arrayList11 = arrayList19;
                                                        str16 = str19;
                                                    }
                                                    trackingSource3.m40677a(str15, 11);
                                                    C21927m.m114302u().m114330e0(optString11, trackingSource3);
                                                } catch (Exception e54) {
                                                    e = e54;
                                                    arrayList11 = arrayList19;
                                                    str16 = str19;
                                                    e.printStackTrace();
                                                    i18 = i14 + 1;
                                                    arrayList19 = arrayList11;
                                                    str46 = str16;
                                                    length4 = i13;
                                                    jSONArray5 = jSONArray2;
                                                    arrayList26 = arrayList10;
                                                    str38 = str15;
                                                }
                                                str15 = str20;
                                            } catch (Exception e55) {
                                                e = e55;
                                                arrayList11 = arrayList19;
                                                str15 = str20;
                                            }
                                            str21 = "";
                                            ContactProfile contactProfile32 = new ContactProfile(optString11);
                                            contactProfile32.f42441t0 = optBoolean6;
                                            contactProfile32.f42446v = optString12;
                                            contactProfile32.f42458z = optString13;
                                            contactProfile32.f42438s0 = optInt3;
                                            contactProfile32.f42437s = optString4;
                                            contactProfile32.f42444u0 = optBoolean3;
                                            contactProfile32.f42447v0 = optInt4;
                                            contactProfile32.f42352K0 = optInt4;
                                            contactProfile32.f42453x0 = optInt5;
                                            contactProfile32.f42460z1 = optString5;
                                            contactProfile32.f42376S0 = optInt6;
                                            contactProfile32.f42373R0 = 86;
                                            contactProfile32.f42361N0 = optInt13;
                                            contactProfile32.f42364O0 = str21;
                                            TrackingSource trackingSource32 = new TrackingSource(86);
                                        } catch (Exception e56) {
                                            e = e56;
                                            arrayList11 = arrayList19;
                                            str15 = str20;
                                            str16 = str19;
                                            e.printStackTrace();
                                            i18 = i14 + 1;
                                            arrayList19 = arrayList11;
                                            str46 = str16;
                                            length4 = i13;
                                            jSONArray5 = jSONArray2;
                                            arrayList26 = arrayList10;
                                            str38 = str15;
                                        }
                                    } catch (Exception e57) {
                                        e = e57;
                                        arrayList10 = arrayList26;
                                        str51 = str54;
                                        i14 = i18;
                                        str47 = str17;
                                        str15 = str38;
                                        str4 = str52;
                                        str2 = str53;
                                        arrayList11 = arrayList19;
                                        str16 = str46;
                                        e.printStackTrace();
                                        i18 = i14 + 1;
                                        arrayList19 = arrayList11;
                                        str46 = str16;
                                        length4 = i13;
                                        jSONArray5 = jSONArray2;
                                        arrayList26 = arrayList10;
                                        str38 = str15;
                                    }
                                } catch (Exception e58) {
                                    e = e58;
                                    arrayList10 = arrayList26;
                                    i13 = length4;
                                    i14 = i18;
                                    str47 = str17;
                                    str15 = str38;
                                    jSONArray2 = jSONArray7;
                                }
                            } catch (Exception e59) {
                                e = e59;
                                arrayList10 = arrayList26;
                                i13 = length4;
                                i14 = i18;
                                str47 = str17;
                                str15 = str38;
                                jSONArray2 = jSONArray7;
                                str4 = str52;
                            }
                        }
                    } catch (Exception e61) {
                        e = e61;
                        arrayList10 = arrayList26;
                        i13 = length4;
                        i14 = i18;
                        str47 = str17;
                        str15 = str38;
                        jSONArray2 = jSONArray7;
                        arrayList11 = arrayList19;
                        str16 = str46;
                        e.printStackTrace();
                        i18 = i14 + 1;
                        arrayList19 = arrayList11;
                        str46 = str16;
                        length4 = i13;
                        jSONArray5 = jSONArray2;
                        arrayList26 = arrayList10;
                        str38 = str15;
                    }
                    i18 = i14 + 1;
                    arrayList19 = arrayList11;
                    str46 = str16;
                    length4 = i13;
                    jSONArray5 = jSONArray2;
                    arrayList26 = arrayList10;
                    str38 = str15;
                }
            }
            ArrayList arrayList27 = arrayList26;
            ArrayList arrayList28 = arrayList19;
            C19322f1 c19322f1 = C19322f1.f95950a;
            if (c19322f1.m101159p()) {
                ArrayList<C0862b> arrayList29 = new ArrayList();
                if (jSONArray4 != null) {
                    c19307a12 = c19307a1;
                    try {
                        c19307a12.m101054w(jSONArray4, arrayList29);
                    } catch (Exception e62) {
                        e = e62;
                        e.printStackTrace();
                        if (c19307a1.isCancelled()) {
                        }
                    }
                } else {
                    c19307a12 = c19307a1;
                }
                HashSet hashSet = new HashSet();
                boolean m101135M = c19322f1.m101135M();
                for (C0862b c0862b : arrayList29) {
                    if (hashSet.contains(c0862b.mo2478b())) {
                        arrayList9 = arrayList18;
                    } else {
                        arrayList9 = arrayList18;
                        arrayList9.add(new AbstractC29069a.n(4194304, c0862b, m101135M));
                        hashSet.add(c0862b.mo2478b());
                    }
                    arrayList18 = arrayList9;
                }
                arrayList6 = arrayList18;
                InterfaceC18319c m101438e = c19307a1.m101438e();
                Object m97245a = (m101438e == null || (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) == null) ? null : c18316b.m97245a();
                C19325g1 c19325g1 = m97245a instanceof C19325g1 ? (C19325g1) m97245a : null;
                if (AbstractC19074t.m100204b(c19325g1 != null ? c19325g1.m101177D() : null, "10")) {
                    C19322f1 c19322f12 = C19322f1.f95950a;
                    if (c19322f12.m101130D()) {
                        try {
                            C24861r.a aVar4 = C24861r.f119264q;
                            m101131E = c19322f12.m101131E();
                            if (m101131E.length() <= 0) {
                                m101131E = null;
                            }
                        } catch (Throwable th2) {
                            C24861r.a aVar5 = C24861r.f119264q;
                            obj3 = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                        }
                        if (m101131E != null) {
                            try {
                                m129218b = C24861r.m129218b(new JSONObject(m101131E));
                            } catch (Throwable th3) {
                                C24861r.a aVar6 = C24861r.f119264q;
                                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th3));
                            }
                            if (C24861r.m129223g(m129218b)) {
                                m129218b = null;
                            }
                            JSONObject jSONObject5 = (JSONObject) m129218b;
                            if (jSONObject5 != null) {
                                c17244x02 = new C17244x0(47, jSONObject5);
                                if (c17244x02.m92065c()) {
                                    obj3 = C24861r.m129218b(c17244x02);
                                    m129221e = C24861r.m129221e(obj3);
                                    if (m129221e != null) {
                                        AbstractC20110a.f98889a.mo104552e(m129221e);
                                    }
                                    c17244x0 = (C17244x0) (!C24861r.m129223g(obj3) ? null : obj3);
                                    if (c17244x0 != null && (!arrayList6.isEmpty())) {
                                        ArrayList arrayList30 = new ArrayList();
                                        for (Object obj5 : arrayList6) {
                                            if (obj5 instanceof AbstractC29069a.m) {
                                                arrayList30.add(obj5);
                                            }
                                        }
                                        AbstractC25378x.m131542D(arrayList6, a.f95877q);
                                        arrayList6.add(new AbstractC29069a.z(4194304, ((AbstractC29069a.m) arrayList30.get(0)).m145192b(), C23024b7.m118047d(C23024b7.f111993a, arrayList30, c17244x0, 0, 4, null)));
                                    }
                                }
                            }
                        }
                        c17244x02 = null;
                        obj3 = C24861r.m129218b(c17244x02);
                        m129221e = C24861r.m129221e(obj3);
                        if (m129221e != null) {
                        }
                        c17244x0 = (C17244x0) (!C24861r.m129223g(obj3) ? null : obj3);
                        if (c17244x0 != null) {
                            ArrayList arrayList302 = new ArrayList();
                            while (r1.hasNext()) {
                            }
                            AbstractC25378x.m131542D(arrayList6, a.f95877q);
                            arrayList6.add(new AbstractC29069a.z(4194304, ((AbstractC29069a.m) arrayList302.get(0)).m145192b(), C23024b7.m118047d(C23024b7.f111993a, arrayList302, c17244x0, 0, 4, null)));
                        }
                    }
                }
                c17244x0 = null;
                if (c17244x0 != null) {
                }
            } else {
                c19307a12 = c19307a1;
                arrayList6 = arrayList18;
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ContactProfile contactProfile4 = (ContactProfile) it2.next();
                    if (c19307a12.f95872u.containsKey(contactProfile4.f42434r)) {
                        str14 = str47;
                        arrayList8 = arrayList25;
                    } else {
                        HashMap hashMap4 = c19307a12.f95872u;
                        String str61 = contactProfile4.f42434r;
                        str14 = str47;
                        AbstractC19074t.m100207e(str61, str14);
                        String str62 = contactProfile4.f42434r;
                        AbstractC19074t.m100207e(str62, str14);
                        hashMap4.put(str61, str62);
                        arrayList8 = arrayList25;
                        arrayList8.add(C19372y0.a.m101483e(C19372y0.Companion, contactProfile4, 16, null, null, null, null, AbstractC29069a.w.b.f134783a, 60, null));
                    }
                    arrayList25 = arrayList8;
                    str47 = str14;
                }
                arrayList7 = arrayList25;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                arrayList7 = arrayList25;
            }
            if (c19307a1.isCancelled()) {
                return;
            }
            AbstractC29076h.f fVar = AbstractC29076h.f.f134820b;
            String m101455l = c19307a1.m101455l();
            AbstractC29072d.d dVar = AbstractC29072d.d.f134806a;
            C29074f m145258e = AbstractC29075g.m145258e(AbstractC29075g.m145255b(fVar, m101455l, arrayList27, dVar), AbstractC29075g.m145255b(AbstractC29076h.g.f134821b, c19307a1.m101455l(), arrayList28, dVar), AbstractC29075g.m145255b(AbstractC29076h.r.f134832b, c19307a1.m101455l(), arrayList6, dVar));
            AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(AbstractC29076h.k.f134825b, c19307a1.m101455l(), arrayList24, dVar));
            AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(AbstractC29076h.n.f134828b, c19307a1.m101455l(), arrayList7, dVar));
            C24848g0 c24848g02 = C24848g0.f119245a;
            c19307a12.mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", m145258e, null, null, 12, null));
        } catch (Exception e63) {
            e = e63;
        }
    }

    /* renamed from: t */
    private final void m101052t(C19325g1 c19325g1, String str, int i11, int i12, int i13, int i14, InterfaceC18505l interfaceC18505l) {
        if (C19372y0.Companion.m101486b(c19325g1, str)) {
            C0766k c0766k = new C0766k();
            AbstractC25251g.m130681a(c0766k, new b(interfaceC18505l));
            AbstractC25251g.m130681a(c0766k, new c(interfaceC18505l));
            c0766k.mo1677ka(str, i11, i12, i13, i14, 87);
            return;
        }
        interfaceC18505l.mo205i9(new Object());
    }

    /* renamed from: u */
    private final void m101053u(InterfaceC18505l interfaceC18505l) {
        Object obj;
        C19325g1 c19325g1;
        C26725d m101219j;
        C26725d m101219j2;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 != null && (m101219j2 = c19325g1.m101219j()) != null && m101219j2.m137455b().contentEquals(m101455l()) && Math.abs(m101219j2.m137456c() - System.currentTimeMillis()) <= 10000) {
            interfaceC18505l.mo205i9(m101219j2.m137454a());
            return;
        }
        if (c19325g1 != null && (m101219j = c19325g1.m101219j()) != null) {
            m101219j.m137457d(null);
            m101219j.m137459f(0L);
            m101219j.m137458e("");
        }
        m101052t(c19325g1, m101455l(), AbstractC23006a0.m117905e(), 1, 50, this.f95871t, new d(c19325g1, interfaceC18505l));
    }

    /* renamed from: w */
    private final void m101054w(JSONArray jSONArray, List list) {
        String str;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        String optString;
        String optString2;
        List m131320c;
        List m131320c2;
        String str2 = "findMatchWordFromArrKeyWord(...)";
        if (jSONArray.length() > 0) {
            String[] m118488a = C23282z6.m120367c(m101455l(), 4096).m118488a();
            int length = jSONArray.length();
            int i11 = 0;
            while (i11 < length && !isCancelled()) {
                try {
                    jSONObject = jSONArray.getJSONObject(i11);
                    optJSONObject = jSONObject.optJSONObject("mpInfo");
                } catch (Exception e11) {
                    e = e11;
                    str = str2;
                }
                if (optJSONObject == null || (optString = jSONObject.optString("mpUrl")) == null || (optString2 = optJSONObject.optString("appId")) == null) {
                    return;
                }
                String optString3 = optJSONObject.optString("appName", "");
                String optString4 = optJSONObject.optString("appAvtUrl", "");
                String optString5 = optJSONObject.optString("appVersion", "");
                optJSONObject.optString("appQRUrl", "");
                String optString6 = optJSONObject.optString("appDesc", "");
                m131320c = AbstractC25356m.m131320c(m118488a);
                SpannableStringBuilder m119655g = AbstractC23217t2.m119655g(optString3, m131320c, 0);
                AbstractC19074t.m100207e(m119655g, str2);
                m131320c2 = AbstractC25356m.m131320c(m118488a);
                SpannableStringBuilder m119655g2 = AbstractC23217t2.m119655g(optString6, m131320c2, 0);
                AbstractC19074t.m100207e(m119655g2, str2);
                AbstractC19074t.m100205c(optString4);
                AbstractC19074t.m100205c(optString5);
                str = str2;
                try {
                    C0862b c0862b = new C0862b(optString2, optString, m119655g, optString4, optString5, new String[0], m119655g2, jSONObject);
                    c0862b.mo2483i(C23024b7.m118038J(c0862b.mo2478b(), c0862b.mo2475c(), this.f95875x, this.f95876y, 0, null) + 1.0f);
                    try {
                        list.add(c0862b);
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        i11++;
                        str2 = str;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                i11++;
                str2 = str;
            }
        }
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        if (isCancelled()) {
            return;
        }
        C19059j0 c19059j0 = new C19059j0();
        C19059j0 c19059j02 = new C19059j0();
        boolean[] zArr = {false, false};
        g gVar = new g(zArr, c19059j0, this, c19059j02);
        m101053u(new e(c19059j0, zArr, gVar));
        C19357r0.m101447f(4, new f(c19059j02, zArr, gVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19307a1(InterfaceC18319c interfaceC18319c, String str, byte b11, HashMap hashMap, List list, List list2, List list3, long j11) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "mapUidContact");
        AbstractC19074t.m100208f(list, "highPriorityOfflineOAResult");
        AbstractC19074t.m100208f(list2, "lowPriorityOfflineOAResult");
        AbstractC19074t.m100208f(list3, "infoArrToCheck");
        this.f95871t = b11;
        this.f95872u = hashMap;
        this.f95873v = list;
        this.f95874w = list2;
        this.f95875x = list3;
        this.f95876y = j11;
    }
}
