package sn;

import ag0.C0815e1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import bo.C3047v0;
import fn0.AbstractC19074t;
import hf0.C20047i;
import is.C20803k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nh0.C23793c;
import org.json.JSONObject;
import p173fz.C19172a;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p361nb.C23657n;
import p361nb.C23664u;
import p361nb.C23669z;
import p398oo.C24371m0;
import p458qr.C25482o;
import p616wo.C29116a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32123ta;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25363p0;

/* renamed from: sn.b */
/* loaded from: classes4.dex */
public final class C26333b {

    /* renamed from: e */
    private static long f125017e;

    /* renamed from: f */
    private static long f125018f;

    /* renamed from: g */
    private static long f125019g;

    /* renamed from: h */
    private static long f125020h;

    /* renamed from: a */
    public static final C26333b f125013a = new C26333b();

    /* renamed from: b */
    private static final Object f125014b = new Object();

    /* renamed from: c */
    private static long f125015c = 2000;

    /* renamed from: d */
    private static long f125016d = 300;

    /* renamed from: i */
    private static final Handler f125021i = new a(Looper.getMainLooper());

    /* renamed from: j */
    private static final HashMap f125022j = new HashMap();

    /* renamed from: k */
    private static final HashMap f125023k = new HashMap();

    /* renamed from: l */
    private static final HashMap f125024l = new HashMap();

    /* renamed from: sn.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long m135510k;
            AbstractC19074t.m100208f(message, "msg");
            super.handleMessage(message);
            if (message.what == 1000) {
                synchronized (C26333b.f125014b) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = C26333b.f125013a.m135516l().entrySet().iterator();
                        long j11 = Long.MIN_VALUE;
                        long j12 = Long.MAX_VALUE;
                        while (it.hasNext()) {
                            C26332a c26332a = (C26332a) ((Map.Entry) it.next()).getValue();
                            long m135486b = c26332a.m135486b();
                            if (C23793c.Companion.m124321a().mo124314i() - m135486b > C26333b.f125013a.m135510k(c26332a.m135489e())) {
                                it.remove();
                                arrayList.add(c26332a);
                                j11 = Math.max(j11, m135486b);
                            } else {
                                j12 = Math.min(j12, m135486b);
                            }
                        }
                        if (j12 == Long.MAX_VALUE || j11 == Long.MIN_VALUE) {
                            m135510k = C26333b.f125013a.m135510k(0);
                        } else {
                            m135510k = j12 - j11;
                        }
                        C26333b c26333b = C26333b.f125013a;
                        if (!c26333b.m135516l().isEmpty()) {
                            c26333b.m135517m("timeDelay: " + m135510k);
                            try {
                                sendEmptyMessageDelayed(1000, m135510k);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        c26333b.m135517m("submitItems: " + arrayList);
                        c26333b.m135512u(arrayList);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
    }

    static {
        f125017e = 2000L;
        f125018f = 300L;
        f125019g = 2000L;
        f125020h = 300L;
        f125017e = AbstractC23309i.m121816d4() * 1000;
        f125018f = AbstractC23309i.m121854e4();
        f125019g = C19172a.m100600k("social@story@story_impression@relog_delay_time", 2) * 1000;
        f125020h = C19172a.m100600k("social@story@story_impression@impression_threshold", 300);
    }

    private C26333b() {
    }

    /* renamed from: d */
    private final String m135504d(C26332a c26332a) {
        StringBuilder sb2 = new StringBuilder();
        if (c26332a.m135485a() >= 0) {
            sb2.append("blur_quality:0-");
            sb2.append("average_fps:" + c26332a.m135485a() + "-");
            sb2.append("is_muted:" + (!C29116a.f134962a.mo117210a() ? 1 : 0) + "-");
        }
        if (!TextUtils.isEmpty(c26332a.m135491g())) {
            sb2.append("zvideo_id:" + c26332a.m135491g() + "-");
            sb2.append("zvideo_preview_time:" + c26332a.m135492h() + "-");
            sb2.append("auto_play:" + c26332a.m135490f() + "-");
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: f */
    private final String m135505f(String str, int i11) {
        String str2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    str2 = "unknown";
                } else {
                    str2 = "story";
                }
            } else {
                str2 = "suggest_comment";
            }
        } else {
            str2 = "feed";
        }
        return str2 + "_" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:            if ((r3 instanceof java.lang.Integer) != false) goto L113;     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C26332a m135506g(C3020p0 c3020p0, int i11, C32002l4 c32002l4, Object... objArr) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        long j11;
        C23669z c23657n;
        C3047v0 c3047v0;
        String str5;
        String str6;
        int i12;
        C3025q0 c3025q0;
        C3023p3 c3023p3;
        C3025q0 c3025q02;
        C3023p3 c3023p32;
        boolean z11;
        int i13;
        int i14;
        long mo124314i = C23793c.Companion.m124321a().mo124314i();
        C26332a c26332a = new C26332a(0, 0L, 0L, 0, null, null, 0, 0, 255, null);
        if (i11 != 1) {
            if (i11 != 2) {
                c23657n = new C23669z();
            } else {
                if (objArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    Object obj = objArr[0];
                    if (obj instanceof Integer) {
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                        i13 = ((Integer) obj).intValue();
                        if (objArr.length >= 2) {
                            i14 = objArr[1];
                        }
                        i14 = -1;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("feedType", i14);
                        jSONObject.put("suggestionType", i13);
                        c23657n = new C23648e(14, C32017m4.m154326S().m154365k(c32002l4), 1, "view_list_suggest_comment", jSONObject.toString());
                    }
                }
                i13 = 0;
                if (objArr.length >= 2) {
                }
                i14 = -1;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("feedType", i14);
                jSONObject2.put("suggestionType", i13);
                c23657n = new C23648e(14, C32017m4.m154326S().m154365k(c32002l4), 1, "view_list_suggest_comment", jSONObject2.toString());
            }
            j11 = mo124314i;
        } else {
            C24371m0 m127483a = C24371m0.Companion.m127483a();
            String str7 = null;
            if (c3020p0 != null) {
                str = c3020p0.f12057p;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            int m127475k = m127483a.m127475k(str);
            for (Object obj2 : objArr) {
                if (obj2 instanceof C20803k) {
                    C20803k c20803k = (C20803k) obj2;
                    if (c20803k.m108542b() >= 0) {
                        if (c3020p0 != null) {
                            str5 = c3020p0.f12057p;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (AbstractC19074t.m100204b(str5, c20803k.m108541a())) {
                            m127475k = c20803k.m108542b();
                        }
                    }
                }
            }
            if (c3020p0 != null) {
                str2 = c3020p0.f12057p;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (c3020p0 != null) {
                num = Integer.valueOf(c3020p0.f12058q);
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            if (c3020p0 != null && (c3047v0 = c3020p0.f12022B) != null) {
                str7 = c3047v0.f12280b;
            }
            if (str7 == null) {
                str4 = "";
            } else {
                str4 = str7;
            }
            j11 = mo124314i;
            c23657n = new C23657n(mo124314i, 0L, str3, valueOf, str4, C32017m4.m154326S().m154348W(c32002l4), m127475k, null, 130, null);
        }
        c26332a.m135497m(i11);
        c26332a.m135495k(j11);
        c26332a.m135496l(c23657n);
        if (c3020p0 == null || (c3025q02 = c3020p0.f12023C) == null || (c3023p32 = c3025q02.f12100I) == null || (str6 = c3023p32.m14554k()) == null) {
            str6 = "";
        }
        c26332a.m135499o(str6);
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (c3023p3 = c3025q0.f12100I) != null) {
            i12 = c3023p3.m14546c();
        } else {
            i12 = 0;
        }
        c26332a.m135500p(i12);
        c26332a.m135498n(C20047i.Companion.m104098b(1) ? 1 : 0);
        return c26332a;
    }

    /* renamed from: h */
    private final C26332a m135507h(C32123ta c32123ta, int i11, int i12, int i13) {
        String str;
        String str2;
        String str3;
        long mo124314i = C23793c.Companion.m124321a().mo124314i();
        String str4 = null;
        if (c32123ta != null) {
            str = c32123ta.f148138h;
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "0";
        } else {
            str2 = str;
        }
        if (c32123ta != null) {
            str4 = c32123ta.f148136g;
        }
        if (str4 == null) {
            str3 = "0";
        } else {
            str3 = str4;
        }
        C23664u c23664u = new C23664u(i11, mo124314i, 0L, str2, str3, i12, i13, 4, null);
        C26332a c26332a = new C26332a(0, 0L, 0L, 0, null, null, 0, 0, 255, null);
        c26332a.m135497m(3);
        c26332a.m135495k(mo124314i);
        c26332a.m135496l(c23664u);
        return c26332a;
    }

    /* renamed from: i */
    private final int m135508i(String str) {
        HashMap hashMap = f125024l;
        int i11 = -1;
        if (!hashMap.containsKey(str)) {
            return -1;
        }
        HashMap hashMap2 = (HashMap) hashMap.remove(str);
        if (hashMap2 != null) {
            int i12 = 0;
            for (Map.Entry entry : hashMap2.entrySet()) {
                if (((Number) entry.getValue()).intValue() >= i12) {
                    i12 = ((Number) entry.getValue()).intValue();
                    i11 = ((Number) entry.getKey()).intValue();
                }
            }
        }
        return i11;
    }

    /* renamed from: j */
    private final long m135509j(int i11) {
        return i11 != 1 ? i11 != 3 ? f125016d : f125020h : f125018f;
    }

    /* renamed from: k */
    public final long m135510k(int i11) {
        return i11 != 1 ? i11 != 3 ? f125015c : f125019g : f125017e;
    }

    /* renamed from: t */
    private final void m135511t(String str, C26332a c26332a) {
        C23657n c23657n;
        C23657n c23657n2;
        String m123976h;
        String m123975g;
        String m123976h2;
        C23657n c23657n3;
        String str2;
        HashMap hashMap = f125023k;
        if (!hashMap.keySet().contains(str)) {
            m135517m("putToVisible: " + c26332a);
            hashMap.put(str, c26332a);
            C23669z m135488d = c26332a.m135488d();
            C23657n c23657n4 = null;
            if (m135488d instanceof C23657n) {
                c23657n = (C23657n) m135488d;
            } else {
                c23657n = null;
            }
            String str3 = "";
            if (c23657n != null && (m123976h2 = c23657n.m123976h()) != null && Integer.parseInt(m123976h2) == 17) {
                C23669z m135488d2 = c26332a.m135488d();
                if (m135488d2 instanceof C23657n) {
                    c23657n3 = (C23657n) m135488d2;
                } else {
                    c23657n3 = null;
                }
                if (c23657n3 == null || (str2 = c23657n3.m123975g()) == null) {
                    str2 = "";
                }
                C25482o.f122075a.m131996Q(str2, System.currentTimeMillis());
            }
            C23669z m135488d3 = c26332a.m135488d();
            if (m135488d3 instanceof C23657n) {
                c23657n2 = (C23657n) m135488d3;
            } else {
                c23657n2 = null;
            }
            if (c23657n2 != null && (m123976h = c23657n2.m123976h()) != null && Integer.parseInt(m123976h) == 24) {
                C23669z m135488d4 = c26332a.m135488d();
                if (m135488d4 instanceof C23657n) {
                    c23657n4 = (C23657n) m135488d4;
                }
                if (c23657n4 != null && (m123975g = c23657n4.m123975g()) != null) {
                    str3 = m123975g;
                }
                C25482o.f122075a.m131997R(str3, System.currentTimeMillis());
            }
        }
    }

    /* renamed from: u */
    public final void m135512u(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26332a c26332a = (C26332a) it.next();
            if (c26332a.m135489e() == 1 && (c26332a.m135488d() instanceof C23657n)) {
                C23669z m135488d = c26332a.m135488d();
                AbstractC19074t.m100206d(m135488d, "null cannot be cast to non-null type com.zing.zalo.actionlog.FeedImpressionTrackingInfo");
                arrayList.add((C23657n) m135488d);
            } else if (c26332a.m135489e() == 2 && (c26332a.m135488d() instanceof C23648e)) {
                C23669z m135488d2 = c26332a.m135488d();
                AbstractC19074t.m100206d(m135488d2, "null cannot be cast to non-null type com.zing.zalo.actionlog.ActionLogV2Info");
                arrayList2.add((C23648e) m135488d2);
            } else if (c26332a.m135489e() == 3 && (c26332a.m135488d() instanceof C23664u)) {
                C23669z m135488d3 = c26332a.m135488d();
                AbstractC19074t.m100206d(m135488d3, "null cannot be cast to non-null type com.zing.zalo.actionlog.StoryImpressionTrackingInfo");
                arrayList3.add((C23664u) m135488d3);
            }
        }
        C0815e1.m2075D().m2106d(arrayList);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C0815e1.m2075D().m2100V((C23648e) it2.next(), false);
        }
        C0815e1.m2075D().m2110h(arrayList3);
    }

    /* renamed from: v */
    private final void m135513v(C23669z c23669z, long j11, C26332a c26332a) {
        if (c23669z instanceof C23657n) {
            C23657n c23657n = (C23657n) c23669z;
            c23657n.m123977j(j11);
            c23657n.m123978k(m135504d(c26332a));
        }
    }

    /* renamed from: w */
    private final void m135514w(C26332a c26332a) {
        String str;
        boolean z11;
        String str2;
        if (c26332a != null) {
            long mo124314i = C23793c.Companion.m124321a().mo124314i();
            C23669z m135488d = c26332a.m135488d();
            int m135489e = c26332a.m135489e();
            if (m135489e != 1) {
                if (m135489e != 2) {
                    if (m135489e == 3 && (m135488d instanceof C23664u)) {
                        ((C23664u) m135488d).m123988h(mo124314i);
                        return;
                    }
                    return;
                }
                if (m135488d instanceof C23648e) {
                    C23648e c23648e = (C23648e) m135488d;
                    String m123918k = c23648e.m123918k();
                    String str3 = "";
                    if (m123918k == null) {
                        str = "";
                    } else {
                        str = m123918k;
                    }
                    if (c23648e.m123919l().length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((!z11) && (str2 = c23648e.m123919l()[0]) != null) {
                        str3 = str2;
                    }
                    JSONObject jSONObject = new JSONObject(str3);
                    jSONObject.put("time", mo124314i - c26332a.m135487c());
                    c26332a.m135496l(new C23648e(14, str, 1, "view_list_suggest_comment", jSONObject.toString()));
                    return;
                }
                return;
            }
            m135513v(m135488d, mo124314i, c26332a);
        }
    }

    /* renamed from: e */
    public final void m135515e() {
        Iterator it = f125023k.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m135519o((C26332a) entry.getValue(), (String) entry.getKey());
            it.remove();
        }
    }

    /* renamed from: l */
    public final HashMap m135516l() {
        return f125022j;
    }

    /* renamed from: m */
    public final void m135517m(String str) {
        AbstractC19074t.m100208f(str, "message");
    }

    /* renamed from: n */
    public final void m135518n(String str, int i11) {
        AbstractC19074t.m100208f(str, "feedId");
        String m135505f = m135505f(str, i11);
        C26332a c26332a = (C26332a) f125023k.remove(m135505f);
        if (c26332a != null) {
            m135519o(c26332a, m135505f);
        }
    }

    /* renamed from: o */
    public final void m135519o(C26332a c26332a, String str) {
        C23657n c23657n;
        C23657n c23657n2;
        String m123976h;
        String str2;
        String m123976h2;
        C23657n c23657n3;
        String str3;
        AbstractC19074t.m100208f(c26332a, "trackingData");
        AbstractC19074t.m100208f(str, "key");
        m135517m("onImpressionEnd: " + c26332a);
        long m135487c = c26332a.m135487c();
        long mo124314i = C23793c.Companion.m124321a().mo124314i();
        int m135489e = c26332a.m135489e();
        int m135508i = m135508i(str);
        C23669z m135488d = c26332a.m135488d();
        C23657n c23657n4 = null;
        if (m135488d instanceof C23657n) {
            c23657n = (C23657n) m135488d;
        } else {
            c23657n = null;
        }
        if (c23657n != null && (m123976h2 = c23657n.m123976h()) != null && Integer.parseInt(m123976h2) == 17) {
            C23669z m135488d2 = c26332a.m135488d();
            if (m135488d2 instanceof C23657n) {
                c23657n3 = (C23657n) m135488d2;
            } else {
                c23657n3 = null;
            }
            if (c23657n3 == null || (str3 = c23657n3.m123975g()) == null) {
                str3 = "";
            }
            C25482o.f122075a.m131989J(str3);
        }
        C23669z m135488d3 = c26332a.m135488d();
        if (m135488d3 instanceof C23657n) {
            c23657n2 = (C23657n) m135488d3;
        } else {
            c23657n2 = null;
        }
        if (c23657n2 != null && (m123976h = c23657n2.m123976h()) != null && Integer.parseInt(m123976h) == 24) {
            C23669z m135488d4 = c26332a.m135488d();
            if (m135488d4 instanceof C23657n) {
                c23657n4 = (C23657n) m135488d4;
            }
            if (c23657n4 == null || (str2 = c23657n4.m123975g()) == null) {
                str2 = "";
            }
            C25482o.f122075a.m131991L(str2);
        }
        if (mo124314i - m135487c > m135509j(m135489e)) {
            c26332a.m135494j(mo124314i);
            c26332a.m135493i(m135508i);
            m135514w(c26332a);
            synchronized (f125014b) {
                try {
                    HashMap hashMap = f125022j;
                    if (!hashMap.containsKey(str)) {
                        C26333b c26333b = f125013a;
                        c26333b.m135517m("putToValidItems: " + c26332a);
                        hashMap.put(str, c26332a);
                        Handler handler = f125021i;
                        if (!handler.hasMessages(1000)) {
                            handler.sendEmptyMessageDelayed(1000, c26333b.m135510k(m135489e));
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: p */
    public final void m135520p(C3020p0 c3020p0, int i11, C32002l4 c32002l4, Object... objArr) {
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        AbstractC19074t.m100208f(objArr, "args");
        C26332a m135506g = m135506g(c3020p0, i11, c32002l4, Arrays.copyOf(objArr, objArr.length));
        String str = c3020p0.f12057p;
        AbstractC19074t.m100207e(str, "fid");
        String m135505f = m135505f(str, i11);
        m135517m("onImpressionStart: " + m135506g);
        m135511t(m135505f, m135506g);
    }

    /* renamed from: q */
    public final void m135521q(String str, int i11, C32002l4 c32002l4, Object... objArr) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        AbstractC19074t.m100208f(objArr, "args");
        C26332a m135506g = m135506g(null, i11, c32002l4, Arrays.copyOf(objArr, objArr.length));
        String m135505f = m135505f(str, i11);
        m135517m("onImpressionStart: " + m135506g);
        m135511t(m135505f, m135506g);
    }

    /* renamed from: r */
    public final void m135522r(C32123ta c32123ta, int i11, int i12, int i13) {
        String str;
        C26332a m135507h = m135507h(c32123ta, i11, i12, i13);
        if (c32123ta != null) {
            str = c32123ta.f148138h;
        } else {
            str = null;
        }
        if (str == null) {
            str = "0";
        }
        String m135505f = m135505f(str, 3);
        m135517m("onImpressionStart: " + m135507h);
        m135511t(m135505f, m135507h);
    }

    /* renamed from: s */
    public final void m135523s(String str, int i11, int i12) {
        HashMap m131406k;
        AbstractC19074t.m100208f(str, "feedId");
        String m135505f = m135505f(str, i11);
        HashMap hashMap = f125024l;
        if (!hashMap.containsKey(m135505f)) {
            m131406k = AbstractC25363p0.m131406k(new C24860q(Integer.valueOf(i12), 1));
            hashMap.put(m135505f, m131406k);
            return;
        }
        HashMap hashMap2 = (HashMap) hashMap.get(m135505f);
        if (hashMap2 != null) {
            Integer num = (Integer) hashMap2.get(Integer.valueOf(i12));
            if (num != null) {
                hashMap2.put(Integer.valueOf(i12), Integer.valueOf(num.intValue() + 1));
            } else {
                hashMap2.put(Integer.valueOf(i12), 1);
            }
        }
    }
}
