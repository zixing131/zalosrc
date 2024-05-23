package p716zh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0808c0;
import android.text.TextUtils;
import android.view.View;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jm0.InterfaceC21299i;
import me0.C23055e5;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p609wh.AbstractC29039u0;
import p609wh.C29037t0;
import qm0.AbstractC25376w;

/* renamed from: zh.md */
/* loaded from: classes3.dex */
public final class C32026md {

    /* renamed from: d */
    private static boolean f147456d;

    /* renamed from: e */
    private static boolean f147457e;

    /* renamed from: f */
    private static long f147458f;

    /* renamed from: a */
    public static final C32026md f147453a = new C32026md();

    /* renamed from: b */
    private static final List f147454b = new ArrayList();

    /* renamed from: c */
    private static List f147455c = new ArrayList();

    /* renamed from: g */
    private static long f147459g = 1800000;

    /* renamed from: zh.md$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ String f147460a;

        a(String str) {
            this.f147460a = str;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                if (TextUtils.equals(this.f147460a, CoreUtility.f89233i)) {
                    C32026md.f147453a.m154439y();
                    C32026md.f147456d = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            String str;
            AbstractC19074t.m100208f(jSONObject, "js");
            try {
                if (!TextUtils.equals(this.f147460a, CoreUtility.f89233i)) {
                    return;
                }
                C32026md c32026md = C32026md.f147453a;
                c32026md.m154439y();
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    str = optJSONObject.toString();
                    if (str == null) {
                    }
                    AbstractC23309i.m121923fy(str);
                    c32026md.m154431l();
                    c32026md.m154435s(optJSONObject, false);
                    C32026md.f147456d = false;
                }
                str = "";
                AbstractC23309i.m121923fy(str);
                c32026md.m154431l();
                c32026md.m154435s(optJSONObject, false);
                C32026md.f147456d = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.md$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f147461a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f147462b;

        /* renamed from: c */
        final /* synthetic */ boolean f147463c;

        b(long j11, WeakReference weakReference, boolean z11) {
            this.f147461a = j11;
            this.f147462b = weakReference;
            this.f147463c = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            BaseZaloView baseZaloView;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (this.f147463c && (baseZaloView = (BaseZaloView) this.f147462b.get()) != null && baseZaloView.m92674mJ() && !baseZaloView.mo60294yp()) {
                baseZaloView.finish();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            try {
                if (System.currentTimeMillis() - this.f147461a > 2000) {
                    return;
                }
                BaseZaloView baseZaloView = (BaseZaloView) this.f147462b.get();
                if (this.f147463c && baseZaloView != null && baseZaloView.m92674mJ() && !baseZaloView.mo60294yp()) {
                    baseZaloView.finish();
                }
                if (baseZaloView != null && baseZaloView.m92672lJ()) {
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null && optJSONObject.optInt("flag") == 1) {
                        String optString = optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                        if (!TextUtils.isEmpty(optString)) {
                            ZaloWebView.Companion.m87168C(baseZaloView.m92676n2(), optString);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.md$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final c f147464q = new c();

        c() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(C32041nd c32041nd, C32041nd c32041nd2) {
            AbstractC19074t.m100208f(c32041nd, "o1");
            AbstractC19074t.m100208f(c32041nd2, "o2");
            return Integer.valueOf(c32041nd.m154575d() - c32041nd2.m154575d());
        }
    }

    private C32026md() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m154430k(String str) {
        if (!f147457e) {
            String m121156Lc = AbstractC23309i.m121156Lc();
            if (!TextUtils.equals(str, CoreUtility.f89233i)) {
                return;
            }
            f147457e = true;
            f147458f = AbstractC23309i.m121193Mc();
            if (!TextUtils.isEmpty(m121156Lc)) {
                try {
                    if (f147453a.m154435s(new JSONObject(m121156Lc), true)) {
                        f147456d = false;
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        if (C23055e5.m118273h(false, 1, null)) {
            C29037t0 c29037t0 = new C29037t0(new a(str));
            c29037t0.f103775r = 11;
            c29037t0.m110314j(AbstractC29039u0.m145033a(AbstractC29039u0.b.ADS_PLATFORM_GET_ADS_TAB_MESSAGE), "", new String[0], new String[0]);
            C0808c0.m2046b(c29037t0);
            return;
        }
        f147456d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m154431l() {
        f147454b.clear();
        f147455c.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m154432p(WeakReference weakReference) {
        AbstractC19074t.m100208f(weakReference, "$weakZaloView");
        BaseZaloView baseZaloView = (BaseZaloView) weakReference.get();
        if (baseZaloView != null && baseZaloView.m92674mJ() && !baseZaloView.mo60294yp()) {
            baseZaloView.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m154433q(C32041nd c32041nd, int i11, long j11, WeakReference weakReference, boolean z11) {
        AbstractC19074t.m100208f(weakReference, "$weakZaloView");
        try {
            f147453a.m154439y();
            AbstractC23309i.m121999hy(new JSONArray(f147455c.toArray(new Long[0])).toString());
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(j11, weakReference, z11));
            c0766k.mo1464Ja(c32041nd.m154576e(), c32041nd.m154577f(), i11, c32041nd.m154574c(), 1, c32041nd.m154575d());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    private final boolean m154434r(C32041nd c32041nd) {
        List list = f147455c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).longValue() == c32041nd.m154574c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final boolean m154435s(JSONObject jSONObject, boolean z11) {
        String str;
        if (jSONObject != null) {
            try {
                long optLong = jSONObject.optLong("next_req_in_millis", 1800000L);
                f147459g = optLong;
                if (optLong <= 0) {
                    f147459g = 1800000L;
                }
                int i11 = 0;
                if (z11 && C23793c.Companion.m124321a().mo124311f() - f147458f > f147459g) {
                    return false;
                }
                if (jSONObject.optInt("has_ads", 0) == 1) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("ads");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i12 = 0; i12 < length; i12++) {
                            try {
                                f147454b.add(new C32041nd(optJSONArray.getJSONObject(i12)));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (z11) {
                        String m121230Nc = AbstractC23309i.m121230Nc();
                        if (!TextUtils.isEmpty(m121230Nc)) {
                            ArrayList arrayList = new ArrayList();
                            JSONArray jSONArray = new JSONArray(m121230Nc);
                            int length2 = jSONArray.length();
                            while (i11 < length2) {
                                arrayList.add(Long.valueOf(jSONArray.getLong(i11)));
                                i11++;
                            }
                            f147455c = arrayList;
                        }
                    } else {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("removed_ads");
                        if (optJSONArray2 == null || (str = optJSONArray2.toString()) == null) {
                            str = "";
                        }
                        AbstractC23309i.m121999hy(str);
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            int length3 = optJSONArray2.length();
                            while (i11 < length3) {
                                arrayList2.add(Long.valueOf(optJSONArray2.getLong(i11)));
                                i11++;
                            }
                        }
                        f147455c = arrayList2;
                    }
                    if (m154436t()) {
                        C19669z.Companion.m103232a().m103198O0();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: t */
    private final boolean m154436t() {
        List list = f147454b;
        final c cVar = c.f147464q;
        AbstractC25376w.m131534w(list, new Comparator() { // from class: zh.ld
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m154437u;
                m154437u = C32026md.m154437u(InterfaceC18509p.this, obj, obj2);
                return m154437u;
            }
        });
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            C32041nd c32041nd = (C32041nd) it.next();
            if (!m154434r(c32041nd)) {
                c32041nd.m154573b();
                z11 |= c32041nd.m154582k();
            } else {
                it.remove();
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final int m154437u(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m154438x() {
        try {
            AbstractC23309i.m121999hy(new JSONArray(f147455c.toArray(new Long[0])).toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m154439y() {
        long mo124311f = C23793c.Companion.m124321a().mo124311f();
        f147458f = mo124311f;
        AbstractC23309i.m121961gy(mo124311f);
    }

    /* renamed from: j */
    public final void m154440j() {
        if (f147456d || C23793c.Companion.m124321a().mo124311f() - f147458f < f147459g) {
            return;
        }
        f147456d = true;
        final String str = CoreUtility.f89233i;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.hd
            @Override // java.lang.Runnable
            public final void run() {
                C32026md.m154430k(str);
            }
        });
    }

    /* renamed from: m */
    public final void m154441m() {
        m154431l();
        f147456d = false;
        f147457e = false;
        f147458f = 0L;
        f147459g = 1800000L;
    }

    /* renamed from: n */
    public final List m154442n() {
        return f147454b;
    }

    /* renamed from: o */
    public final void m154443o(BaseZaloView baseZaloView, long j11, final int i11, final boolean z11) {
        try {
            final WeakReference weakReference = new WeakReference(baseZaloView);
            final C32041nd m154445w = m154445w(j11);
            if (z11 && baseZaloView != null) {
                if (m154445w != null) {
                    baseZaloView.mo46829Y();
                    View m92656bJ = baseZaloView.m92656bJ();
                    if (m92656bJ != null) {
                        m92656bJ.postDelayed(new Runnable() { // from class: zh.id
                            @Override // java.lang.Runnable
                            public final void run() {
                                C32026md.m154432p(weakReference);
                            }
                        }, 2000L);
                    }
                } else {
                    baseZaloView.finish();
                }
            }
            if (m154445w == null) {
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.jd
                @Override // java.lang.Runnable
                public final void run() {
                    C32026md.m154433q(C32041nd.this, i11, currentTimeMillis, weakReference, z11);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public final void m154444v() {
        f147458f = 0L;
        AbstractC23309i.m121961gy(0L);
        m154440j();
    }

    /* renamed from: w */
    public final C32041nd m154445w(long j11) {
        C32041nd c32041nd;
        Iterator it = f147454b.iterator();
        while (true) {
            if (it.hasNext()) {
                c32041nd = (C32041nd) it.next();
                if (c32041nd.m154574c() == j11) {
                    f147454b.remove(c32041nd);
                    break;
                }
            } else {
                c32041nd = null;
                break;
            }
        }
        if (c32041nd != null) {
            f147455c.add(Long.valueOf(j11));
            C19669z.Companion.m103232a().m103198O0();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.kd
                @Override // java.lang.Runnable
                public final void run() {
                    C32026md.m154438x();
                }
            });
        }
        return c32041nd;
    }
}
