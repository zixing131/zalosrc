package ss;

import ae.C0766k;
import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import me0.AbstractC23136l9;
import nh0.C23793c;
import on0.C24321d;
import org.json.JSONObject;
import p142ey.C18644n;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import ss.C26376h;

/* renamed from: ss.f */
/* loaded from: classes4.dex */
public final class C26374f extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final InterfaceC24854k f125283A;

    /* renamed from: B */
    private final C1761c0 f125284B;

    /* renamed from: C */
    private final C1761c0 f125285C;

    /* renamed from: D */
    private final C1761c0 f125286D;

    /* renamed from: E */
    private final C1761c0 f125287E;

    /* renamed from: F */
    private final C1761c0 f125288F;

    /* renamed from: G */
    private final C1761c0 f125289G;

    /* renamed from: H */
    private final C1761c0 f125290H;

    /* renamed from: I */
    private final C1761c0 f125291I;

    /* renamed from: J */
    private final C1761c0 f125292J;

    /* renamed from: K */
    private final C1761c0 f125293K;

    /* renamed from: L */
    private final C1761c0 f125294L;

    /* renamed from: M */
    private final C1761c0 f125295M;

    /* renamed from: N */
    private final C1761c0 f125296N;

    /* renamed from: O */
    private final C1761c0 f125297O;

    /* renamed from: P */
    private final C1761c0 f125298P;

    /* renamed from: Q */
    private final C1761c0 f125299Q;

    /* renamed from: R */
    private boolean f125300R;

    /* renamed from: S */
    private boolean f125301S;

    /* renamed from: T */
    private boolean f125302T;

    /* renamed from: U */
    private final InterfaceC24854k f125303U;

    /* renamed from: V */
    private final InterfaceC24854k f125304V;

    /* renamed from: W */
    private final InterfaceC24854k f125305W;

    /* renamed from: s */
    private final int f125306s;

    /* renamed from: t */
    private final InterfaceC24854k f125307t;

    /* renamed from: u */
    private final String f125308u;

    /* renamed from: v */
    private C26376h f125309v;

    /* renamed from: w */
    private C26376h f125310w;

    /* renamed from: x */
    private String f125311x;

    /* renamed from: y */
    private final InterfaceC24854k f125312y;

    /* renamed from: z */
    private final InterfaceC24854k f125313z;

    /* renamed from: ss.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ss.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f125314q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC0924m0.m4005m());
        }
    }

    /* renamed from: ss.f$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f125315q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24860q mo12V4() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 12);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(12, 90);
            return new C24860q(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    /* renamed from: ss.f$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f125316q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24860q mo12V4() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 18);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(12, 810);
            return new C24860q(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    /* renamed from: ss.f$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f125317q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24860q mo12V4() {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(6, 1);
            return new C24860q(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    /* renamed from: ss.f$f */
    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a */
        private final long f125318a;

        /* renamed from: b */
        private final long f125319b;

        /* renamed from: c */
        private final boolean f125320c;

        public f(long j11, long j12, boolean z11) {
            this.f125318a = j11;
            this.f125319b = j12;
            this.f125320c = z11;
        }

        /* renamed from: a */
        public final boolean m135865a() {
            return this.f125320c;
        }

        /* renamed from: b */
        public final long m135866b() {
            return this.f125319b;
        }

        /* renamed from: c */
        public final long m135867c() {
            return this.f125318a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f125318a == fVar.f125318a && this.f125319b == fVar.f125319b && this.f125320c == fVar.f125320c;
        }

        public int hashCode() {
            return (((AbstractC2147g0.m11521a(this.f125318a) * 31) + AbstractC2147g0.m11521a(this.f125319b)) * 31) + AbstractC2144f.m11520a(this.f125320c);
        }

        public String toString() {
            return "TimeRangeARData(start=" + this.f125318a + ", end=" + this.f125319b + ", daily=" + this.f125320c + ")";
        }
    }

    /* renamed from: ss.f$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {
        g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            C26374f.this.f125290H.mo9221n(Boolean.FALSE);
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                C26374f.this.f125292J.mo9221n(m104492d);
            }
            C26374f.this.m135828K0(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C26374f.this.f125290H.mo9221n(Boolean.FALSE);
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_successfully), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            C26374f.this.f125291I.mo9221n(Boolean.TRUE);
            C26374f.this.m135828K0(false);
        }
    }

    /* renamed from: ss.f$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC20094a {
        h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            C26374f.this.f125290H.mo9221n(Boolean.FALSE);
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                C26374f.this.f125292J.mo9221n(m104492d);
            }
            C26374f.this.m135829L0(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C26374f.this.f125290H.mo9221n(Boolean.FALSE);
            C26374f.this.f125291I.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: ss.f$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f125323q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: ss.f$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f125324q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: ss.f$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f125325q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: ss.f$l */
    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC20094a {
        l() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            C26374f.this.f125290H.mo9221n(Boolean.FALSE);
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                C26374f.this.f125292J.mo9221n(m104492d);
            }
            C26374f.this.m135838T0(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C26374f.this.f125290H.mo9221n(Boolean.FALSE);
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_successfully), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            C26374f.this.f125291I.mo9221n(Boolean.TRUE);
            C26374f.this.m135838T0(false);
        }
    }

    public C26374f() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        int m4035n = AbstractC0924m0.m4035n();
        this.f125306s = m4035n;
        m129210a = AbstractC24856m.m129210a(b.f125314q);
        this.f125307t = m129210a;
        this.f125308u = (m135811b0() / 1000) + "." + ((m135811b0() % 1000) / 100);
        this.f125310w = new C26376h(0L, 0L, false, 0L, 0L, null, null, null, 0, 511, null);
        this.f125311x = CoreUtility.f89233i + "_" + C23793c.Companion.m124321a().mo124310e();
        m129210a2 = AbstractC24856m.m129210a(k.f125325q);
        this.f125312y = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(j.f125324q);
        this.f125313z = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(i.f125323q);
        this.f125283A = m129210a4;
        this.f125284B = new C1761c0();
        this.f125285C = new C1761c0();
        this.f125286D = new C1761c0();
        this.f125287E = new C1761c0();
        this.f125288F = new C1761c0();
        this.f125289G = new C1761c0();
        Boolean bool = Boolean.FALSE;
        this.f125290H = new C1761c0(bool);
        this.f125291I = new C1761c0(bool);
        this.f125292J = new C1761c0();
        this.f125293K = new C1761c0();
        this.f125294L = new C1761c0();
        this.f125295M = new C1761c0();
        this.f125296N = new C1761c0();
        this.f125297O = new C1761c0();
        this.f125298P = new C1761c0();
        this.f125299Q = new C1761c0(Integer.valueOf(m4035n));
        m129210a5 = AbstractC24856m.m129210a(e.f125317q);
        this.f125303U = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(c.f125315q);
        this.f125304V = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(d.f125316q);
        this.f125305W = m129210a7;
    }

    /* renamed from: I0 */
    private final void m135795I0() {
        C26376h c26376h = this.f125310w;
        c26376h.m135897z(((Number) m135848g0().m129215c()).longValue());
        c26376h.m135894w(((Number) m135848g0().m129216d()).longValue());
        c26376h.m135893v(new C26376h.a((byte) 0, null, 2, 0 == true ? 1 : 0));
        m135827J0();
    }

    /* renamed from: Q */
    private final void m135799Q() {
        if (this.f125310w.m135876c().length() == 0) {
            this.f125284B.mo9221n(Boolean.FALSE);
            return;
        }
        if (this.f125310w.m135884l() == -1) {
            this.f125284B.mo9221n(Boolean.FALSE);
        } else if (this.f125310w.m135888p() >= this.f125310w.m135879f()) {
            this.f125284B.mo9221n(Boolean.FALSE);
        } else {
            this.f125284B.mo9221n(Boolean.valueOf(m135815m0()));
        }
    }

    /* renamed from: R0 */
    private final void m135800R0(byte b11) {
        this.f125310w.m135895x(b11);
        this.f125286D.mo9221n(Byte.valueOf(b11));
        m135799Q();
        if (b11 == 0 || b11 == 1) {
            ArrayList m135886n = this.f125310w.m135886n();
            if (m135886n != null) {
                m135886n.clear();
            }
            m135809a0().clear();
            this.f125295M.mo9221n(null);
            this.f125296N.mo9221n(null);
            return;
        }
        if (b11 == 2) {
            m135807Z().clear();
            Iterator it = m135809a0().iterator();
            while (it.hasNext()) {
                m135807Z().add(Integer.valueOf(Integer.parseInt(((InviteContactProfile) it.next()).mo2478b())));
            }
            m135810a1();
            this.f125296N.mo9221n(null);
            return;
        }
        if (b11 == 3) {
            m135805Y().clear();
            Iterator it2 = m135809a0().iterator();
            while (it2.hasNext()) {
                m135805Y().add(Integer.valueOf(Integer.parseInt(((InviteContactProfile) it2.next()).mo2478b())));
            }
            m135808Z0();
            this.f125295M.mo9221n(null);
        }
    }

    /* renamed from: S */
    private final void m135801S() {
        C26376h c26376h = this.f125310w;
        long mo124310e = C23793c.Companion.m124321a().mo124310e();
        if (c26376h.m135888p() > mo124310e) {
            long m135888p = (((c26376h.m135888p() - mo124310e) / 86400000) + 1) * 86400000;
            c26376h.m135897z(c26376h.m135888p() - m135888p);
            c26376h.m135894w(c26376h.m135879f() - m135888p);
        }
    }

    /* renamed from: T */
    private final void m135802T() {
        if (this.f125300R) {
            return;
        }
        this.f125290H.mo9221n(Boolean.TRUE);
        this.f125300R = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g());
        C26376h c26376h = this.f125310w;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sessionId", this.f125311x);
        jSONObject.put("start_time", c26376h.m135888p());
        jSONObject.put("end_time", c26376h.m135879f());
        jSONObject.put("receiver_option", Byte.valueOf(c26376h.m135884l()));
        int i11 = 0;
        if (c26376h.m135884l() == 3) {
            int m98555r = C18644n.m98531l().m98555r();
            ArrayList m135886n = c26376h.m135886n();
            if (m135886n != null) {
                i11 = m135886n.size();
            }
            jSONObject.put("receiver_count", m98555r - i11);
        } else {
            ArrayList m135886n2 = c26376h.m135886n();
            if (m135886n2 != null) {
                i11 = m135886n2.size();
            }
            jSONObject.put("receiver_count", i11);
        }
        jSONObject.put("char_count", c26376h.m135876c().length());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c0766k.mo1401C4(c26376h.m135888p(), c26376h.m135879f(), c26376h.m135876c(), c26376h.m135884l(), c26376h.m135883k(), c26376h.m135886n(), jSONObject2);
    }

    /* renamed from: U */
    private final void m135803U(long j11) {
        if (this.f125302T) {
            return;
        }
        this.f125290H.mo9221n(Boolean.TRUE);
        this.f125302T = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h());
        c0766k.mo1473L3(j11);
    }

    /* renamed from: W */
    private final void m135804W(C26376h c26376h) {
        C26376h m135874a = c26376h.m135874a();
        this.f125310w = m135874a;
        C1761c0 c1761c0 = this.f125299Q;
        int length = m135874a.m135876c().length();
        int i11 = this.f125306s;
        if (length > i11) {
            i11 = Integer.MAX_VALUE;
        }
        c1761c0.mo9221n(Integer.valueOf(i11));
        m135827J0();
    }

    /* renamed from: Y */
    private final ArrayList m135805Y() {
        return (ArrayList) this.f125283A.getValue();
    }

    /* renamed from: Y0 */
    private final void m135806Y0() {
        m135809a0().clear();
        ArrayList m135886n = this.f125310w.m135886n();
        if (m135886n != null) {
            Iterator it = m135886n.iterator();
            while (it.hasNext()) {
                ContactProfile m98552o = C18644n.m98531l().m98552o(String.valueOf(((Number) it.next()).intValue()));
                if (m98552o != null) {
                    AbstractC19074t.m100205c(m98552o);
                    m135809a0().add(new InviteContactProfile(m98552o));
                }
            }
        }
    }

    /* renamed from: Z */
    private final ArrayList m135807Z() {
        return (ArrayList) this.f125313z.getValue();
    }

    /* renamed from: Z0 */
    private final void m135808Z0() {
        try {
            if (m135809a0().size() > 0) {
                if (m135809a0().size() <= 2) {
                    String m40485u1 = ((InviteContactProfile) m135809a0().get(0)).m40485u1();
                    if (m135809a0().size() == 2) {
                        m40485u1 = m40485u1 + ", " + ((InviteContactProfile) m135809a0().get(1)).m40485u1();
                    }
                    this.f125296N.mo9221n(m40485u1);
                    return;
                }
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_friend_selected_desc);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{((InviteContactProfile) m135809a0().get(0)).m40485u1(), Integer.valueOf(m135809a0().size() - 1)}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f125296N.mo9221n(format);
                return;
            }
            this.f125296N.mo9221n(null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            this.f125296N.mo9221n(null);
        }
    }

    /* renamed from: a0 */
    private final ArrayList m135809a0() {
        return (ArrayList) this.f125312y.getValue();
    }

    /* renamed from: a1 */
    private final void m135810a1() {
        try {
            if (m135809a0().size() > 0) {
                if (m135809a0().size() <= 2) {
                    String m40485u1 = ((InviteContactProfile) m135809a0().get(0)).m40485u1();
                    if (m135809a0().size() == 2) {
                        m40485u1 = m40485u1 + ", " + ((InviteContactProfile) m135809a0().get(1)).m40485u1();
                    }
                    this.f125295M.mo9221n(m40485u1);
                    return;
                }
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_friend_selected_desc);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{((InviteContactProfile) m135809a0().get(0)).m40485u1(), Integer.valueOf(m135809a0().size() - 1)}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f125295M.mo9221n(format);
                return;
            }
            this.f125295M.mo9221n(null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            this.f125295M.mo9221n(null);
        }
    }

    /* renamed from: b0 */
    private final int m135811b0() {
        return ((Number) this.f125307t.getValue()).intValue();
    }

    /* renamed from: b1 */
    private final void m135812b1() {
        if (this.f125301S) {
            return;
        }
        this.f125290H.mo9221n(Boolean.TRUE);
        this.f125301S = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new l());
        C26376h c26376h = this.f125310w;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sessionId", this.f125311x);
        jSONObject.put("message_updated", m135816n0());
        if (m135816n0()) {
            jSONObject.put("char_count", c26376h.m135876c().length());
        }
        int i11 = 0;
        jSONObject.put("enable_updated", false);
        jSONObject.put("time_updated", m135818p0());
        if (m135818p0()) {
            jSONObject.put("start_time", c26376h.m135888p());
            jSONObject.put("end_time", c26376h.m135879f());
        }
        jSONObject.put("receiver_updated", m135817o0());
        if (m135817o0()) {
            jSONObject.put("receiver_option", Byte.valueOf(c26376h.m135884l()));
            if (c26376h.m135884l() == 3) {
                int m98555r = C18644n.m98531l().m98555r();
                ArrayList m135886n = c26376h.m135886n();
                if (m135886n != null) {
                    i11 = m135886n.size();
                }
                jSONObject.put("receiver_count", m98555r - i11);
            } else {
                ArrayList m135886n2 = c26376h.m135886n();
                if (m135886n2 != null) {
                    i11 = m135886n2.size();
                }
                jSONObject.put("receiver_count", i11);
            }
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c0766k.mo1533S7(c26376h.m135880g(), c26376h.m135878e(), c26376h.m135888p(), c26376h.m135879f(), c26376h.m135876c(), c26376h.m135884l(), c26376h.m135883k(), c26376h.m135886n(), jSONObject2);
    }

    /* renamed from: k0 */
    private final void m135813k0(long j11) {
        C26376h c26376h = this.f125309v;
        if (c26376h != null && c26376h.m135880g() == j11 && !this.f125302T && AbstractC19074t.m100204b(this.f125291I.mo9215f(), Boolean.FALSE)) {
            this.f125292J.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_fail));
            this.f125291I.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: l0 */
    private final void m135814l0(long j11) {
        C26376h m135958m;
        C26376h c26376h = this.f125309v;
        if (c26376h != null && c26376h.m135880g() == j11 && AbstractC19074t.m100204b(this.f125291I.mo9215f(), Boolean.FALSE) && (m135958m = C26379k.f125351a.m135935f().m135958m(j11)) != null) {
            C26376h m135874a = m135958m.m135874a();
            m135804W(m135874a);
            this.f125309v = m135874a;
            this.f125292J.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_notify_update));
        }
    }

    /* renamed from: m0 */
    private final boolean m135815m0() {
        if (!m135816n0() && !m135817o0() && !m135818p0()) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    private final boolean m135816n0() {
        String str;
        C26376h c26376h = this.f125309v;
        if (c26376h == null || (str = c26376h.m135876c()) == null) {
            str = "";
        }
        return !AbstractC19074t.m100204b(str, this.f125310w.m135876c());
    }

    /* renamed from: o0 */
    private final boolean m135817o0() {
        String str;
        C26376h.a m135877d;
        C26376h c26376h = this.f125309v;
        if (c26376h == null || (m135877d = c26376h.m135877d()) == null || (str = m135877d.m135898a()) == null) {
            str = "";
        }
        return !AbstractC19074t.m100204b(str, this.f125310w.m135877d().m135898a());
    }

    /* renamed from: p0 */
    private final boolean m135818p0() {
        long j11;
        C26376h c26376h = this.f125309v;
        long j12 = 0;
        if (c26376h != null) {
            j11 = c26376h.m135888p();
        } else {
            j11 = 0;
        }
        if (j11 == this.f125310w.m135888p()) {
            C26376h c26376h2 = this.f125309v;
            if (c26376h2 != null) {
                j12 = c26376h2.m135879f();
            }
            if (j12 == this.f125310w.m135879f()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r0 */
    private final boolean m135819r0(String str) {
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        if (bytes.length > m135811b0()) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public final void m135820A0(byte b11) {
        ArrayList m135805Y;
        ArrayList m135807Z;
        if (b11 == 0 || b11 == 1) {
            m135800R0(b11);
            return;
        }
        if (b11 == 2) {
            C1761c0 c1761c0 = this.f125293K;
            if (this.f125310w.m135884l() == b11) {
                m135807Z = this.f125310w.m135887o();
            } else {
                m135807Z = m135807Z();
            }
            c1761c0.mo9221n(m135807Z);
            return;
        }
        if (b11 == 3) {
            C1761c0 c1761c02 = this.f125294L;
            if (this.f125310w.m135884l() == b11) {
                m135805Y = this.f125310w.m135887o();
            } else {
                m135805Y = m135805Y();
            }
            c1761c02.mo9221n(m135805Y);
        }
    }

    /* renamed from: B0 */
    public final void m135821B0() {
        long j11;
        long j12;
        if (this.f125310w.m135888p() > 0 && this.f125310w.m135879f() > 0 && this.f125310w.m135888p() < this.f125310w.m135879f() && this.f125310w.m135879f() - this.f125310w.m135888p() < 86400000) {
            j11 = this.f125310w.m135888p();
            j12 = this.f125310w.m135879f();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j13 = 600000 + currentTimeMillis;
            long j14 = currentTimeMillis + 3600000;
            j11 = j13;
            j12 = j14;
        }
        this.f125298P.mo9221n(new C24860q(Long.valueOf(j11), Long.valueOf(j12)));
    }

    /* renamed from: C0 */
    public final void m135822C0(long j11, long j12) {
        if (j11 < j12) {
            C26376h c26376h = this.f125310w;
            c26376h.m135897z(j11);
            c26376h.m135894w(j12);
            this.f125297O.mo9221n(new f(this.f125310w.m135888p(), this.f125310w.m135879f(), this.f125310w.m135891s()));
            m135799Q();
        }
    }

    /* renamed from: D0 */
    public final void m135823D0(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("oldItemId")) {
                m135832O0(bundle.getLong("oldItemId"));
            }
            if (bundle.containsKey("newItem")) {
                this.f125310w = new C26376h(new JSONObject(bundle.getString("newItem", "")));
                m135827J0();
            }
            if (bundle.containsKey("sessionId")) {
                String string = bundle.getString("sessionId", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f125311x = string;
            }
        }
    }

    /* renamed from: E0 */
    public final LiveData m135824E0() {
        return this.f125294L;
    }

    /* renamed from: F0 */
    public final LiveData m135825F0() {
        return this.f125293K;
    }

    /* renamed from: G0 */
    public final LiveData m135826G0() {
        return this.f125298P;
    }

    /* renamed from: J0 */
    public final void m135827J0() {
        m135806Y0();
        C26376h c26376h = this.f125310w;
        this.f125285C.mo9221n(c26376h.m135876c());
        m135800R0(c26376h.m135884l());
        this.f125297O.mo9221n(new f(c26376h.m135888p(), c26376h.m135879f(), c26376h.m135891s()));
    }

    /* renamed from: K0 */
    public final void m135828K0(boolean z11) {
        this.f125300R = z11;
    }

    /* renamed from: L0 */
    public final void m135829L0(boolean z11) {
        this.f125302T = z11;
    }

    /* renamed from: M0 */
    public final LiveData m135830M0() {
        return this.f125296N;
    }

    /* renamed from: N0 */
    public final LiveData m135831N0() {
        return this.f125295M;
    }

    /* renamed from: O0 */
    public final void m135832O0(long j11) {
        C26376h m135958m = C26379k.f125351a.m135935f().m135958m(j11);
        if (m135958m != null) {
            C26376h m135874a = m135958m.m135874a();
            this.f125309v = m135874a;
            if (m135874a != null) {
                this.f125287E.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_auto_reply_editing_title));
                m135804W(m135958m);
                m135799Q();
                this.f125288F.mo9221n(Boolean.TRUE);
            }
        }
    }

    /* renamed from: P */
    public final LiveData m135833P() {
        return this.f125287E;
    }

    /* renamed from: P0 */
    public final LiveData m135834P0() {
        return this.f125299Q;
    }

    /* renamed from: Q0 */
    public final LiveData m135835Q0() {
        return this.f125286D;
    }

    /* renamed from: R */
    public final LiveData m135836R() {
        return this.f125291I;
    }

    /* renamed from: S0 */
    public final LiveData m135837S0() {
        return this.f125297O;
    }

    /* renamed from: T0 */
    public final void m135838T0(boolean z11) {
        this.f125301S = z11;
    }

    /* renamed from: U0 */
    public final LiveData m135839U0() {
        return this.f125288F;
    }

    /* renamed from: V */
    public final LiveData m135840V() {
        return this.f125284B;
    }

    /* renamed from: V0 */
    public final LiveData m135841V0() {
        return this.f125289G;
    }

    /* renamed from: W0 */
    public final LiveData m135842W0() {
        return this.f125290H;
    }

    /* renamed from: X */
    public final LiveData m135843X() {
        return this.f125285C;
    }

    /* renamed from: X0 */
    public final LiveData m135844X0() {
        return this.f125292J;
    }

    /* renamed from: c0 */
    public final int m135845c0() {
        return this.f125306s;
    }

    /* renamed from: e0 */
    public final C24860q m135846e0() {
        return (C24860q) this.f125304V.getValue();
    }

    /* renamed from: f0 */
    public final C24860q m135847f0() {
        return (C24860q) this.f125305W.getValue();
    }

    /* renamed from: g0 */
    public final C24860q m135848g0() {
        return (C24860q) this.f125303U.getValue();
    }

    /* renamed from: h0 */
    public final String m135849h0() {
        return this.f125311x;
    }

    /* renamed from: i0 */
    public final String m135850i0() {
        return this.f125310w.m135889q(true);
    }

    /* renamed from: j0 */
    public final void m135851j0(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 165) {
            if (i11 == 166) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Long");
                m135813k0(((Long) obj).longValue());
                return;
            }
            return;
        }
        Object obj2 = objArr[0];
        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Long");
        m135814l0(((Long) obj2).longValue());
    }

    /* renamed from: q0 */
    public final void m135852q0(Bundle bundle) {
        if (bundle != null && bundle.containsKey("EXTRA_AUTO_REPLY_ID")) {
            m135832O0(bundle.getLong("EXTRA_AUTO_REPLY_ID"));
        }
        if (this.f125309v == null) {
            m135795I0();
        }
        m135799Q();
    }

    /* renamed from: s0 */
    public final void m135853s0() {
        C26376h c26376h = this.f125309v;
        if (c26376h != null) {
            m135803U(c26376h.m135880g());
        }
    }

    /* renamed from: t0 */
    public final void m135854t0(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f125310w.m135892u(str);
        m135799Q();
    }

    /* renamed from: u0 */
    public final void m135855u0() {
        if (this.f125309v != null) {
            this.f125289G.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: v0 */
    public final void m135856v0() {
        if (m135819r0(this.f125310w.m135876c())) {
            C1761c0 c1761c0 = this.f125292J;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_reach_message_limit_byte);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{this.f125308u}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            c1761c0.mo9221n(format);
            return;
        }
        if (m135818p0()) {
            m135801S();
        }
        if (this.f125309v != null) {
            m135812b1();
        } else {
            if (C26379k.f125351a.m135932c(true)) {
                return;
            }
            m135802T();
        }
    }

    /* renamed from: w0 */
    public final void m135857w0(int i11, Intent intent) {
        C24848g0 c24848g0;
        String mo2478b;
        if (i11 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
            ArrayList<InviteContactProfile> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
            if (parcelableArrayListExtra != null) {
                ArrayList m135886n = this.f125310w.m135886n();
                if (m135886n != null) {
                    m135886n.clear();
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 == null) {
                    this.f125310w.m135896y(new ArrayList());
                }
                m135809a0().clear();
                for (InviteContactProfile inviteContactProfile : parcelableArrayListExtra) {
                    m135809a0().add(inviteContactProfile);
                    if (inviteContactProfile != null && (mo2478b = inviteContactProfile.mo2478b()) != null) {
                        AbstractC19074t.m100205c(mo2478b);
                        int parseInt = Integer.parseInt(mo2478b);
                        ArrayList m135886n2 = this.f125310w.m135886n();
                        if (m135886n2 != null) {
                            m135886n2.add(Integer.valueOf(parseInt));
                        }
                    }
                }
            }
            m135800R0((byte) 3);
        }
    }

    /* renamed from: x0 */
    public final void m135858x0(int i11, Intent intent) {
        C24848g0 c24848g0;
        String mo2478b;
        if (i11 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
            ArrayList<InviteContactProfile> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
            if (parcelableArrayListExtra != null) {
                ArrayList m135886n = this.f125310w.m135886n();
                if (m135886n != null) {
                    m135886n.clear();
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 == null) {
                    this.f125310w.m135896y(new ArrayList());
                }
                m135809a0().clear();
                for (InviteContactProfile inviteContactProfile : parcelableArrayListExtra) {
                    m135809a0().add(inviteContactProfile);
                    if (inviteContactProfile != null && (mo2478b = inviteContactProfile.mo2478b()) != null) {
                        AbstractC19074t.m100205c(mo2478b);
                        int parseInt = Integer.parseInt(mo2478b);
                        ArrayList m135886n2 = this.f125310w.m135886n();
                        if (m135886n2 != null) {
                            m135886n2.add(Integer.valueOf(parseInt));
                        }
                    }
                }
            }
            m135800R0((byte) 2);
        }
    }

    /* renamed from: y0 */
    public final void m135859y0(int i11, Intent intent) {
        if (i11 == -1 && intent != null && intent.hasExtra("EXTRA_START_TIME") && intent.hasExtra("EXTRA_END_TIME")) {
            m135822C0(intent.getLongExtra("EXTRA_START_TIME", 0L), intent.getLongExtra("EXTRA_END_TIME", 0L));
        }
    }

    /* renamed from: z0 */
    public final void m135860z0(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        C26376h c26376h = this.f125309v;
        if (c26376h != null) {
            bundle.putLong("oldItemId", c26376h.m135880g());
        }
        bundle.putString("newItem", this.f125310w.m135873A().toString());
        bundle.putString("sessionId", this.f125311x);
    }
}
