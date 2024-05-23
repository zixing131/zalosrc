package ag0;

import am.AbstractC0939u;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import bg0.C2797c;
import com.zing.zalo.MainApplication;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import ff0.C18907d;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.C20097d;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import me0.AbstractC23193r0;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;
import p105dn.EnumC18030a;
import p148f3.C18711c;
import p227i3.AbstractC20216t;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23668y;
import p361nb.C23644a0;
import p361nb.C23648e;
import p361nb.C23649f;
import p361nb.C23651h;
import p361nb.C23653j;
import p361nb.C23658o;
import p361nb.C23659p;
import p361nb.C23661r;
import p361nb.C23662s;
import p361nb.C23666w;
import p361nb.C23667x;
import p361nb.C23669z;
import p386ob.C24192c;
import p420pb.C24709a;
import p461qu.AbstractC25495a;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p716zh.C31862c;
import p716zh.C32044o1;
import p716zh.C32080q9;
import p716zh.C32094r9;
import th.AbstractC26681b;

/* renamed from: ag0.e1 */
/* loaded from: classes6.dex */
public class C0815e1 {

    /* renamed from: d */
    private static volatile C0815e1 f2813d;

    /* renamed from: e */
    private static final Map f2814e = new HashMap();

    /* renamed from: f */
    private static int f2815f = -1;

    /* renamed from: b */
    C20097d f2817b;

    /* renamed from: a */
    private final C2797c f2816a = new C2797c(AbstractC0837p0.m2225f());

    /* renamed from: c */
    private final SparseBooleanArray f2818c = new SparseBooleanArray();

    /* renamed from: ag0.e1$a */
    /* loaded from: classes6.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23666w f2819a;

        a(C23666w c23666w) {
            this.f2819a = c23666w;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2819a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$b */
    /* loaded from: classes6.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f2821a;

        b(C23669z c23669z) {
            this.f2821a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2821a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$c */
    /* loaded from: classes6.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23659p f2823a;

        c(C23659p c23659p) {
            this.f2823a = c23659p;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2823a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$d */
    /* loaded from: classes6.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23661r f2825a;

        d(C23661r c23661r) {
            this.f2825a = c23661r;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2825a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$e */
    /* loaded from: classes6.dex */
    public class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23667x f2827a;

        e(C23667x c23667x) {
            this.f2827a = c23667x;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$f */
    /* loaded from: classes6.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23658o f2829a;

        f(C23658o c23658o) {
            this.f2829a = c23658o;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2829a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$g */
    /* loaded from: classes6.dex */
    public class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f2831a;

        g(List list) {
            this.f2831a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128309a(this.f2831a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$h */
    /* loaded from: classes6.dex */
    public class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f2833a;

        h(List list) {
            this.f2833a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128309a(this.f2833a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$i */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class i {

        /* renamed from: a */
        static final /* synthetic */ int[] f2835a;

        static {
            int[] iArr = new int[EnumC18030a.values().length];
            f2835a = iArr;
            try {
                iArr[EnumC18030a.SINGLE_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2835a[EnumC18030a.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2835a[EnumC18030a.SINGLE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ag0.e1$j */
    /* loaded from: classes6.dex */
    public class j implements s {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2836a;

        j(ArrayList arrayList) {
            this.f2836a = arrayList;
        }

        @Override // ag0.C0815e1.s
        /* renamed from: a */
        public void mo2126a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128307N(this.f2836a);
        }

        @Override // ag0.C0815e1.s
        /* renamed from: b */
        public void mo2127b() {
        }
    }

    /* renamed from: ag0.e1$k */
    /* loaded from: classes6.dex */
    public class k implements InterfaceC20098e {

        /* renamed from: a */
        final /* synthetic */ int f2838a;

        /* renamed from: b */
        final /* synthetic */ s f2839b;

        /* renamed from: c */
        final /* synthetic */ long f2840c;

        k(int i11, s sVar, long j11) {
            this.f2838a = i11;
            this.f2839b = sVar;
            this.f2840c = j11;
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            C0815e1.this.f2818c.put(this.f2838a, false);
            AbstractC20110a.m104538g("doUploadZaloTrackingLogToServer fail %s", c20096c);
            this.f2839b.mo2127b();
            AbstractC20887g.m109241s((this.f2838a % 100) + 12100, "" + c20096c, this.f2840c);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            C0815e1.this.f2818c.put(this.f2838a, false);
            AbstractC20110a.m104542k(8, "doUploadZaloTrackingLogToServer success %s", obj);
            this.f2839b.mo2126a();
            AbstractC20887g.m109246x((this.f2838a % 100) + 12100, this.f2840c);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
        }
    }

    /* renamed from: ag0.e1$l */
    /* loaded from: classes6.dex */
    public class l extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f2842a;

        l(C23669z c23669z) {
            this.f2842a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2842a);
        }
    }

    /* renamed from: ag0.e1$m */
    /* loaded from: classes6.dex */
    public class m extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23648e f2844a;

        m(C23648e c23648e) {
            this.f2844a = c23648e;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128304J(this.f2844a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$n */
    /* loaded from: classes6.dex */
    public class n extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23653j f2846a;

        n(C23653j c23653j) {
            this.f2846a = c23653j;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128304J(this.f2846a.m123965a());
        }
    }

    /* renamed from: ag0.e1$o */
    /* loaded from: classes6.dex */
    public class o extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f2848a;

        o(C23669z c23669z) {
            this.f2848a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2848a);
        }
    }

    /* renamed from: ag0.e1$p */
    /* loaded from: classes6.dex */
    public class p extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f2850a;

        p(C23669z c23669z) {
            this.f2850a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2850a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.e1$q */
    /* loaded from: classes6.dex */
    public class q extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f2852a;

        q(C23669z c23669z) {
            this.f2852a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2852a);
        }
    }

    /* renamed from: ag0.e1$r */
    /* loaded from: classes6.dex */
    public class r extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f2854a;

        r(C23669z c23669z) {
            this.f2854a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f2854a);
        }
    }

    /* renamed from: ag0.e1$s */
    /* loaded from: classes6.dex */
    public interface s {
        /* renamed from: a */
        void mo2126a();

        /* renamed from: b */
        void mo2127b();
    }

    /* renamed from: C */
    private Pair m2074C(ArrayList arrayList) {
        try {
            byte[] m89297a = Utils.m89297a(2);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                C23669z c23669z = (C23669z) arrayList.get(i11);
                if (c23669z != null) {
                    String mo123915d = c23669z.mo123915d();
                    if (!TextUtils.isEmpty(mo123915d)) {
                        sb2.append(mo123915d);
                    }
                }
            }
            AbstractC20110a.m104535d("ActionLogV2: %s", sb2);
            byte[] m147357f = AbstractC29633j.m147357f(sb2.toString());
            int length = m147357f.length;
            return new Pair(Integer.valueOf(length), AbstractC17527f.m93442f(m147357f, m89297a, length));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return new Pair(0, new byte[0]);
        }
    }

    /* renamed from: D */
    public static synchronized C0815e1 m2075D() {
        C0815e1 c0815e1;
        synchronized (C0815e1.class) {
            try {
                if (f2813d == null) {
                    synchronized (C0815e1.class) {
                        try {
                            if (f2813d == null) {
                                f2813d = new C0815e1();
                            }
                        } finally {
                        }
                    }
                }
                c0815e1 = f2813d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0815e1;
    }

    /* renamed from: E */
    public static String m2076E(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        str.hashCode();
        if (!str.equals("1")) {
            if (!str.equals("2")) {
                return str2;
            }
            return str2.replace("group_", "");
        }
        return CoreUtility.f89233i + "_" + str2;
    }

    /* renamed from: G */
    public /* synthetic */ void m2077G(int i11) {
        long currentTimeMillis;
        try {
            try {
                currentTimeMillis = System.currentTimeMillis();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (i11 <= 0) {
                AbstractC23309i.m122404sr(System.currentTimeMillis(), i11);
                return;
            }
            int m123995d = AbstractC23668y.m123995d(i11);
            int m121004H8 = AbstractC23309i.m121004H8(i11);
            int m120931F9 = AbstractC23309i.m120931F9(i11);
            long m121813d1 = currentTimeMillis - (AbstractC23309i.m121813d1(i11) * 1000);
            if (m123995d > 0) {
                if (m123995d > m121004H8) {
                    if (i11 != 13) {
                        C24709a.m128299t(MainApplication.getAppContext()).m128312i(m121813d1, i11);
                    } else {
                        C24709a.m128299t(MainApplication.getAppContext()).m128311h(m121813d1);
                    }
                }
                ArrayList m128315s = C24709a.m128299t(MainApplication.getAppContext()).m128315s(m120931F9, i11);
                if (m128315s != null) {
                    int size = m128315s.size();
                    if (size < m120931F9) {
                        AbstractC23668y.m123997f(i11, size);
                    }
                    if (!m128315s.isEmpty()) {
                        Pair m2074C = m2074C(m128315s);
                        int intValue = ((Integer) m2074C.first).intValue();
                        byte[] bArr = (byte[]) m2074C.second;
                        if (bArr.length > 0) {
                            m2115p(intValue, bArr, i11, new j(m128315s));
                            AbstractC20110a.m104545n("Submit Zalo Tracking Log (%d): %d", Integer.valueOf(i11), Integer.valueOf(m128315s.size()));
                            if (AbstractC26681b.f126376u) {
                                ToastUtils.showMess("Submit to server: typeLog=" + i11 + " numberItem=" + m128315s.size());
                            }
                        }
                    }
                }
            }
            AbstractC23309i.m122404sr(System.currentTimeMillis(), i11);
        } catch (Throwable th2) {
            AbstractC23309i.m122404sr(System.currentTimeMillis(), i11);
            throw th2;
        }
    }

    /* renamed from: H */
    public static void m2078H(String str, int i11, String str2) {
        try {
            m2075D().m2099U(3, 2, 32, str, String.valueOf(i11), str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N */
    public static void m2079N(int i11, int i12, int i13, int i14, int i15) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source_type", i12);
            jSONObject.put("setting_id", i11);
            jSONObject.put("keyword_number", i13);
            jSONObject.put("result_index", i14);
            jSONObject.put("total_result", i15);
            m2075D().m2099U(3, 1, 31, String.valueOf(i11), jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    private void m2080P(int i11, int i12, C23666w c23666w) {
        try {
            c23666w.f114656c = System.currentTimeMillis();
            c23666w.f114654a = i11;
            c23666w.f114655b = i12;
            C0809c1.m2050b(new a(c23666w));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Q */
    private void m2081Q(int i11, int i12, int i13, ArrayList arrayList) {
        try {
            C23651h m123960h = C23651h.m123960h(i13, arrayList);
            if (m123960h == null) {
                return;
            }
            m123960h.f114656c = System.currentTimeMillis();
            m123960h.f114654a = i11;
            m123960h.f114655b = i12;
            m123960h.f114657d = i13;
            C0809c1.m2050b(new o(m123960h));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    private void m2084j(HashMap hashMap, String str, int i11) {
        if (hashMap.containsKey(str)) {
            Integer num = (Integer) hashMap.get(str);
            Objects.requireNonNull(num);
            hashMap.put(str, Integer.valueOf(num.intValue() + i11));
            return;
        }
        hashMap.put(str, Integer.valueOf(i11));
    }

    /* renamed from: l */
    private boolean m2085l(int i11) {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return false;
        }
        int m120931F9 = AbstractC23309i.m120931F9(i11);
        if (m120931F9 < 0) {
            m120931F9 = 0;
        }
        int m123995d = AbstractC23668y.m123995d(i11);
        if (m123995d <= 0 || this.f2818c.get(i11) || AbstractC23309i.m120962G3(i11) == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - AbstractC23309i.m121483U6(i11);
        if (currentTimeMillis < AbstractC23309i.m121670Z8(i11) * 1000) {
            return false;
        }
        if (currentTimeMillis < AbstractC23309i.m121864ed(i11) * 1000 && m123995d < m120931F9) {
            return false;
        }
        m2086o(i11);
        return true;
    }

    /* renamed from: o */
    private void m2086o(int i11) {
        this.f2816a.mo13474a(new Runnable() { // from class: ag0.d1

            /* renamed from: q */
            public final /* synthetic */ int f2805q;

            public /* synthetic */ RunnableC0812d1(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0815e1.this.m2077G(r2);
            }
        });
    }

    /* renamed from: A */
    public String m2087A(String str, String str2, boolean z11, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
            if (z11) {
                jSONObject.put("onboarding", 1);
            }
            if (i11 == C11598e.e.f60096p.ordinal()) {
                jSONObject.put("vm", "csc");
            } else if (i11 == C11598e.e.f60097q.ordinal()) {
                jSONObject.put("vm", "listing");
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: B */
    public String m2088B(List list, String str) {
        int m154631s;
        int m154632t;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean equals = str.equals("chat_delete_withdraw");
            HashMap hashMap = new HashMap();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!AbstractC25495a.m132081f(str2) && !AbstractC25495a.m132084i(str2)) {
                        if (AbstractC25495a.m132079d(str2)) {
                            m2084j(hashMap, C7962g.f43287r, 1);
                        } else if (AbstractC25495a.m132078c(str2)) {
                            m2084j(hashMap, "ft", 1);
                        } else if (AbstractC21935u.m114518H(str2)) {
                            m2084j(hashMap, "oa", 1);
                        } else {
                            m2084j(hashMap, C18711c.f94014e, 1);
                        }
                    }
                    m2084j(hashMap, "fd", 1);
                    if (AbstractC25495a.m132081f(str2)) {
                        if (equals) {
                            m154631s = C19669z.m103146Y().m103223i0();
                        } else {
                            m154631s = C32044o1.m154612r().m154631s();
                        }
                        m2084j(hashMap, "oa", m154631s);
                    } else {
                        if (equals) {
                            m154632t = C19669z.m103146Y().m103222h0();
                        } else {
                            m154632t = C32044o1.m154612r().m154632t();
                        }
                        m2084j(hashMap, C18711c.f94014e, m154632t);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("sct", jSONObject2);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: F */
    public boolean m2089F(int i11) {
        return i11 == 13;
    }

    /* renamed from: I */
    public void m2090I(String str, String str2, boolean z11) {
        String str3;
        try {
            C0815e1 m2075D = m2075D();
            String[] strArr = new String[3];
            if (z11) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            strArr[0] = str3;
            strArr[1] = str;
            strArr[2] = str2;
            m2075D.m2099U(3, 2, 23, strArr);
            AbstractC20110a.m104541j("logMsgFooter actionType: " + str + "\tkwd: " + str2 + "\tisMine: " + z11, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public void m2091J(int i11, String str, String str2, int i12) {
        try {
            m2075D().m2099U(3, 2, 20, String.valueOf(i11), str2, str, String.valueOf(i12));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K */
    public void m2092K(C31862c c31862c, String str, int i11) {
        if (c31862c == null) {
            return;
        }
        m2091J(c31862c.f146308a, c31862c.f146311d, str, i11);
    }

    /* renamed from: L */
    public void m2093L(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            m2075D().m2099U(3, 2, 30, "1", str, str2, str3, str4, str5, str6);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public void m2094M(EnumC18030a enumC18030a, Set set, JSONObject jSONObject) {
        int i11;
        try {
            int i12 = i.f2835a[enumC18030a.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 3;
            }
            String join = TextUtils.join(",", set);
            m2075D().m2099U(3, 2, 28, i11 + "", join, "", jSONObject.toString(), "", "", "", "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    public void m2095O(String str, String str2, String str3, String str4) {
        try {
            m2075D().m2099U(3, 2, 24, str, str2, str3, str4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public void m2096R(int i11, long j11) {
        f2814e.put(Integer.valueOf(i11), Long.valueOf(j11));
        f2815f = i11;
    }

    /* renamed from: S */
    public void m2097S(int i11, int i12, long j11) {
        int i13;
        Map map = f2814e;
        if (map.containsKey(Integer.valueOf(f2815f)) && (i13 = f2815f) != -1) {
            long longValue = ((Long) map.get(Integer.valueOf(i13))).longValue();
            map.remove(Integer.valueOf(f2815f));
            long j12 = j11 - longValue;
            if (j12 >= 0 && j12 <= 86400000) {
                m2080P(i11, i12, new C23666w(j12, AbstractC20626a.m107387c(), C29628e.m147249E0().m93432x() ? 1 : 0, longValue, f2815f));
            }
        }
    }

    /* renamed from: T */
    public void m2098T(C23659p c23659p) {
        c23659p.f114655b = 1;
        c23659p.f114657d = 0;
        C0809c1.m2050b(new c(c23659p));
    }

    /* renamed from: U */
    public void m2099U(int i11, int i12, int i13, String... strArr) {
        AbstractC20110a.m104535d("addTrackingLog type %d, - subType %d - source %d - params %s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Arrays.toString(strArr));
        if (m2089F(i11)) {
            return;
        }
        m2081Q(i11, i12, i13, new ArrayList(Arrays.asList(strArr)));
    }

    /* renamed from: V */
    public void m2100V(C23648e c23648e, boolean z11) {
        if (c23648e == null) {
            return;
        }
        try {
            c23648e.f114656c = C23793c.m124316k().mo124314i();
            if (z11) {
                if (c23648e.m123921n() == 0) {
                    c23648e.m123928u(c23648e.f114656c + 86400000);
                }
                c23648e.m123922o(AbstractC23668y.m123992a(c23648e).m123966b() + 1);
                AbstractC23668y.m123998g(c23648e, false);
            } else {
                c23648e.m123928u(0L);
                c23648e.m123922o(1);
                C0809c1.m2050b(new m(c23648e));
            }
            if (AbstractC26681b.f126376u) {
                c23648e.mo123890f();
                ToastUtils.showMess(c23648e.mo123915d().replaceAll("\n|\t", " "));
                AbstractC23350e.m122780j("ActionLogV2 \n" + c23648e.mo123915d().replaceAll("\n|\t", " "), new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public void m2101W(C32094r9 c32094r9, boolean z11) {
        int i11;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("at", c32094r9.m154856G() + c32094r9.m154902n());
            jSONObject.put("bg", c32094r9.m154861L() ? 1 : 0);
            jSONObject.put(AbstractC20216t.f99969a, c32094r9.m154857H().m126129c());
            jSONObject.put("ss", c32094r9.m154862M() ? 1 : 0);
            jSONObject.put("bp", c32094r9.m154859J() ? 1 : 0);
            jSONObject.put("isrn", c32094r9.m154904o().m126131c());
            jSONObject.put("upType", c32094r9.m154858I());
            jSONObject.put("f", c32094r9.m154886f().m126133c());
            jSONObject.put("grc", c32094r9.m154896k());
            jSONObject.put("idx", c32094r9.m154898l());
            jSONObject.put("dv", AbstractC23193r0.m119497f());
            jSONObject.put("e2ee", c32094r9.m154860K() ? 1 : 0);
            jSONObject.put("groupid", c32094r9.m154894j());
            jSONObject.put("pi", c32094r9.m154902n());
            jSONObject.put("ex", c32094r9.m154910s());
            jSONObject.put("ex1", c32094r9.m154912t());
            jSONObject.put("eex", c32094r9.m154878b());
            jSONObject.put("dlr", c32094r9.m154916v());
            jSONObject.put("rn", c32094r9.m154850A());
            jSONObject.put("up", c32094r9.m154854E());
            jSONObject.put("eup", c32094r9.m154880c());
            jSONObject.put("rntv", c32094r9.m154851B());
            jSONObject.put("uptv", c32094r9.m154855F());
            jSONObject.put("euptv", c32094r9.m154882d());
            jSONObject.put("sm", c32094r9.m154852C());
            if (c32094r9.m154924z() > 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            jSONObject.put("ipre", i11);
            jSONObject.put("pt", c32094r9.m154924z());
            jSONObject.put("pts", c32094r9.m154853D());
            jSONObject.put("pc", c32094r9.m154922y());
            jSONObject.put("osz", c32094r9.m154900m());
            jSONObject.put("sz", c32094r9.m154890h());
            jSONObject.put("sz2", c32094r9.m154892i());
            jSONObject.put("nw", !C23055e5.m118270e() ? 1 : 0);
            jSONObject.put("cmi", c32094r9.m154876a());
            jSONObject.put("frome2ee", C32094r9.m154849r(c32094r9.m154906p()));
            jSONObject.put("zcp", c32094r9.m154863N() ? 1 : 0);
            C24192c c24192c = new C24192c(z11, jSONObject.toString());
            c24192c.f114656c = System.currentTimeMillis();
            c24192c.f114655b = 0;
            C0809c1.m2050b(new p(c24192c));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: X */
    public void m2102X(C23661r c23661r) {
        c23661r.f114656c = System.currentTimeMillis();
        c23661r.f114654a = 7;
        C0809c1.m2050b(new d(c23661r));
    }

    /* renamed from: Y */
    public void m2103Y(C32080q9 c32080q9, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("groupid", c32080q9.m154771a());
            jSONObject.put("at", c32080q9.m154777g());
            jSONObject.put("grc", c32080q9.m154775e());
            jSONObject.put("sz", c32080q9.m154774d());
            jSONObject.put("ph", c32080q9.m154773c());
            jSONObject.put("hdp", c32080q9.m154772b());
            jSONObject.put("vc", c32080q9.m154778h());
            jSONObject.put("hdvc", c32080q9.m154779i());
            jSONObject.put("ss", c32080q9.m154781k() ? 1 : 0);
            jSONObject.put("dv", AbstractC23193r0.m119497f());
            jSONObject.put("e2ee", c32080q9.m154780j() ? 1 : 0);
            jSONObject.put("nw", !C23055e5.m118270e() ? 1 : 0);
            jSONObject.put("frome2ee", C32094r9.m154849r(c32080q9.m154776f()));
            jSONObject.put("zcp", c32080q9.m154782l() ? 1 : 0);
            C24192c c24192c = new C24192c(z11, jSONObject.toString());
            c24192c.f114656c = System.currentTimeMillis();
            c24192c.f114655b = 1;
            C0809c1.m2050b(new q(c24192c));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    public void m2104Z(int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5) {
        C23644a0 c23644a0 = new C23644a0(str, str2, str3, str4, str5);
        c23644a0.f114656c = System.currentTimeMillis();
        c23644a0.f114654a = i11;
        c23644a0.f114655b = i12;
        c23644a0.f114657d = i13;
        C0809c1.m2050b(new b(c23644a0));
    }

    /* renamed from: c */
    public void m2105c(int i11, int i12, int i13, String... strArr) {
        AbstractC20110a.m104535d("addTrackingLog type %d, - subType %d - source %d - params %s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Arrays.toString(strArr));
        try {
            C23669z c23669z = new C23669z();
            int length = strArr.length;
            c23669z.f114658e = length;
            String[] strArr2 = new String[length];
            c23669z.f114659f = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, length);
            c23669z.f114656c = System.currentTimeMillis();
            c23669z.f114654a = i11;
            c23669z.f114655b = i12;
            c23669z.f114657d = i13;
            C0809c1.m2050b(new l(c23669z));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m2106d(List list) {
        C0809c1.m2050b(new g(list));
    }

    /* renamed from: e */
    public void m2107e(C23658o c23658o) {
        C0809c1.m2050b(new f(c23658o));
    }

    /* renamed from: f */
    public void m2108f(C32094r9 c32094r9, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("at", c32094r9.m154856G() + c32094r9.m154902n() + c32094r9.m154918w());
            jSONObject.put("ext", c32094r9.m154884e());
            jSONObject.put("ss", c32094r9.m154862M() ? 1 : 0);
            jSONObject.put("dv", AbstractC23193r0.m119497f());
            jSONObject.put("e2ee", c32094r9.m154860K() ? 1 : 0);
            jSONObject.put("bg", c32094r9.m154861L() ? 1 : 0);
            jSONObject.put("sz", c32094r9.m154900m());
            jSONObject.put("tsz", c32094r9.m154892i());
            jSONObject.put("nw", !C23055e5.m118270e() ? 1 : 0);
            jSONObject.put("cmi", c32094r9.m154876a());
            jSONObject.put("isrn", c32094r9.m154904o().m126131c());
            jSONObject.put("upType", c32094r9.m154858I());
            jSONObject.put("f", c32094r9.m154888g().toString());
            jSONObject.put("pi", c32094r9.m154902n());
            jSONObject.put("eex", c32094r9.m154878b());
            jSONObject.put("ex", c32094r9.m154910s());
            jSONObject.put("tex", c32094r9.m154920x());
            jSONObject.put("dlr1", c32094r9.m154914u());
            jSONObject.put("dlr2", c32094r9.m154916v());
            jSONObject.put("dlwait", c32094r9.m154918w());
            jSONObject.put("rn", c32094r9.m154850A());
            jSONObject.put("eup", c32094r9.m154880c());
            jSONObject.put("up", c32094r9.m154854E());
            jSONObject.put("rntv", c32094r9.m154851B());
            jSONObject.put("euptv", c32094r9.m154882d());
            jSONObject.put("uptv", c32094r9.m154855F());
            jSONObject.put("sm", c32094r9.m154852C());
            C24192c c24192c = new C24192c(z11, jSONObject.toString());
            c24192c.f114656c = System.currentTimeMillis();
            c24192c.f114655b = 2;
            C0809c1.m2050b(new r(c24192c));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g */
    public void m2109g(C23667x c23667x) {
        if (c23667x.f114654a == 8) {
            c23667x.f114656c = System.currentTimeMillis();
            C0809c1.m2050b(new e(c23667x));
        }
    }

    /* renamed from: h */
    public void m2110h(List list) {
        C0809c1.m2050b(new h(list));
    }

    /* renamed from: i */
    public void m2111i(InterfaceC7761b interfaceC7761b) {
        C18907d mo39537a = interfaceC7761b.mo39537a();
        m2075D().m2099U(3, 1, 19, String.valueOf(interfaceC7761b.mo39541e().m126581c()), String.valueOf(mo39537a.m99108b()), String.valueOf(mo39537a.m99107a()), String.valueOf(-1), String.valueOf(-1), String.valueOf(mo39537a.m99109c()), String.valueOf(interfaceC7761b.mo39542h()));
        AbstractC20110a.m104535d("StatusVideoCompress: " + interfaceC7761b.mo39541e().m126581c() + ", hardwareAsyncCompressResult: " + mo39537a.m99108b() + ", blendResult: " + mo39537a.m99107a() + ", ffmpegCompressResult: -1, staticVideoResult: -1, nativeCompressResult: " + mo39537a.m99109c() + ", sourceLog: " + interfaceC7761b.mo39542h(), new Object[0]);
    }

    /* renamed from: k */
    public void m2112k() {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            SparseArray m123994c = AbstractC23668y.m123994c();
            int size = m123994c.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (m2085l(m123994c.keyAt(i11))) {
                    return;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m2113m() {
        long currentTimeMillis = System.currentTimeMillis();
        for (String str : AbstractC23668y.m123993b().keySet()) {
            C23653j c23653j = (C23653j) AbstractC23668y.m123993b().get(str);
            if (c23653j != null && c23653j.m123967c() > 0 && c23653j.m123967c() < currentTimeMillis && c23653j.m123966b() > 0) {
                AbstractC20110a.m104541j("ActionLogV2 checkWriteActionLogV2ToDatabase key = %s", str);
                C0809c1.m2050b(new n(c23653j));
            }
        }
    }

    /* renamed from: n */
    public JSONObject m2114n(String str, C23649f... c23649fArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (c23649fArr.length > 0) {
                boolean z11 = false;
                jSONObject.put("tid", m2076E(str, c23649fArr[0].m123936d()));
                HashMap hashMap = new HashMap();
                int length = c23649fArr.length;
                long j11 = Long.MAX_VALUE;
                C23649f c23649f = null;
                int i11 = 0;
                int i12 = Integer.MAX_VALUE;
                long j12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = 1;
                    if (i11 >= length) {
                        break;
                    }
                    C23649f c23649f2 = c23649fArr[i11];
                    int m102878B = AbstractC19646n0.m102878B(c23649f2.m123933a(), z11);
                    Integer valueOf = Integer.valueOf(m102878B);
                    if (hashMap.containsKey(Integer.valueOf(m102878B))) {
                        i14 = 1 + ((Integer) hashMap.get(Integer.valueOf(m102878B))).intValue();
                    }
                    hashMap.put(valueOf, Integer.valueOf(i14));
                    if (c23649f2.m123937e() < j11) {
                        j11 = c23649f2.m123937e();
                        c23649f = c23649f2;
                    }
                    if (c23649f2.m123934b() >= 0) {
                        i12 = Math.min(i12, c23649f2.m123934b());
                    }
                    if (c23649f2.m123938f() > 0) {
                        j12++;
                    }
                    if (c23649f2.m123939g()) {
                        i13++;
                    }
                    i11++;
                    z11 = false;
                }
                JSONObject jSONObject2 = new JSONObject();
                for (Integer num : hashMap.keySet()) {
                    jSONObject2.put(num.toString(), hashMap.get(num));
                }
                jSONObject.put("mt", jSONObject2);
                jSONObject.put("mts", j11);
                if (i12 != Integer.MAX_VALUE) {
                    jSONObject.put("mi", i12);
                }
                if (j12 > 0) {
                    jSONObject.put("ttl", j12);
                }
                if (c23649f != null && AbstractC19646n0.m102878B(c23649f.m123933a(), false) == 46) {
                    if (c23649f.m123935c() != null) {
                        jSONObject.put("mid", c23649f.m123935c());
                    }
                    jSONObject.put("mine", c23649f.m123941i() ? 1 : 0);
                    jSONObject.put("pc", c23649f.m123940h() ? 1 : 0);
                }
                if (i13 > 0) {
                    jSONObject.put("e2ee", i13);
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: p */
    void m2115p(int i11, byte[] bArr, int i12, s sVar) {
        try {
            if (this.f2818c.get(i12)) {
                return;
            }
            String m120898Ed = AbstractC23309i.m120898Ed(i12);
            if (TextUtils.isEmpty(m120898Ed)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f2817b = new C20097d();
            AbstractC20110a.m104535d("uploadUrl: %s", m120898Ed);
            this.f2818c.put(i12, true);
            this.f2817b.m104501g(m120898Ed, bArr, new k(i12, sVar, currentTimeMillis), AbstractC23309i.m120926F4(), CoreUtility.f89226b, CoreUtility.f89227c, i11);
        } catch (Throwable th2) {
            AbstractC23350e.m122778h(th2);
        }
    }

    /* renamed from: q */
    public JSONObject m2116q(String str, List list, List list2) {
        JSONObject m2114n = m2114n(str, (C23649f[]) list.toArray(new C23649f[0]));
        try {
            if (list2.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                HashMap hashMap = new HashMap();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    int i11 = 1;
                    if (contactProfile.m40374K0()) {
                        if (hashMap.containsKey(C7962g.f43287r)) {
                            i11 = 1 + ((Integer) hashMap.get(C7962g.f43287r)).intValue();
                        }
                        hashMap.put(C7962g.f43287r, Integer.valueOf(i11));
                    } else if (contactProfile.m40372J0()) {
                        if (hashMap.containsKey("ft")) {
                            i11 = 1 + ((Integer) hashMap.get("ft")).intValue();
                        }
                        hashMap.put("ft", Integer.valueOf(i11));
                    } else if (contactProfile.m40382P0()) {
                        if (hashMap.containsKey(C18711c.f94014e)) {
                            i11 = 1 + ((Integer) hashMap.get(C18711c.f94014e)).intValue();
                        }
                        hashMap.put(C18711c.f94014e, Integer.valueOf(i11));
                    } else {
                        if (hashMap.containsKey("un")) {
                            i11 = 1 + ((Integer) hashMap.get("un")).intValue();
                        }
                        hashMap.put("un", Integer.valueOf(i11));
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    jSONObject.put(str2, hashMap.get(str2));
                }
                m2114n.put("des_ct", jSONObject);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return m2114n;
    }

    /* renamed from: r */
    public String m2117r(String str, List list, C23662s c23662s) {
        try {
            JSONObject m2114n = m2114n(str, (C23649f[]) list.toArray(new C23649f[0]));
            m2114n.put("se", c23662s.m123984c().m123986c());
            m2114n.put("del", c23662s.m123982a().m123971c());
            m2114n.put("nm", c23662s.m123983b());
            return m2114n.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122773c(e11);
            return "";
        }
    }

    /* renamed from: s */
    public String m2118s(String str, C23649f... c23649fArr) {
        return m2114n(str, c23649fArr).toString();
    }

    /* renamed from: t */
    public String m2119t(String str, String str2, boolean z11, int i11, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
            jSONObject.put("empty", z11 ? 1 : 0);
            jSONObject.put("quit_before_done", i11);
            jSONObject.put("duration_load", j11);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: u */
    public String m2120u(String str, String str2, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
            jSONObject.put("e2ee_state", i11);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: v */
    public String m2121v(int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i11);
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: w */
    public String m2122w(String str, String str2, boolean z11, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
            jSONObject.put("click_upgrade", z11 ? 1 : 0);
            jSONObject.put("last_seen", i11);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: x */
    public String m2123x(String str, String str2, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
            jSONObject.put("ht", z11 ? 1 : 0);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: y */
    public String m2124y(String str, String str2, long j11, Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
            jSONObject.put("mts", j11);
            JSONObject jSONObject2 = new JSONObject();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                jSONObject2.put(intValue + "", map.get(Integer.valueOf(intValue)));
            }
            jSONObject.put("mt", jSONObject2);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: z */
    public String m2125z(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tid", m2076E(str, str2));
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }
}
