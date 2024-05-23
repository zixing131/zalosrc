package r00;

import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19060k;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import p363nh.C23744a;
import r00.C25596a;
import vg.C28023b6;

/* renamed from: r00.b */
/* loaded from: classes4.dex */
public final class C25597b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static volatile C25597b f122397a;

    /* renamed from: r00.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25597b m132226a() {
            C25597b c25597b = C25597b.f122397a;
            if (c25597b == null) {
                synchronized (this) {
                    c25597b = new C25597b();
                    C25597b.f122397a = c25597b;
                }
            }
            return c25597b;
        }
    }

    /* renamed from: r00.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42286U9();
            C25597b.this.m132223c();
            C23744a.Companion.m124119a().m124116d(6026, new Object[0]);
        }
    }

    /* renamed from: r00.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ JSONObject f122399a;

        c(JSONObject jSONObject) {
            this.f122399a = jSONObject;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42295V8(this.f122399a.toString());
        }
    }

    /* renamed from: r00.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0939u {
        d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42126G0();
        }
    }

    /* renamed from: d */
    public static final C25597b m132222d() {
        return Companion.m132226a();
    }

    /* renamed from: c */
    public final void m132223c() {
        long j11;
        Date parse;
        C25596a m132219a = C25596a.Companion.m132219a();
        if (m132219a.m132207e()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
            try {
                parse = simpleDateFormat.parse(AbstractC7306b.f40032b);
            } catch (ParseException e11) {
                e11.printStackTrace();
            }
            if (parse != null) {
                j11 = parse.getTime();
                if (m132219a.m132211j() < 31536000000L && m132219a.m132213l() - j11 >= m132219a.m132211j() && System.currentTimeMillis() - AbstractC0924m0.m3333P6() >= 10800000) {
                    C28023b6.m141250h0().m141316T1(m132219a.m132216o());
                    return;
                } else {
                    if (m132219a.m132210i() < 2628000000L && m132219a.m132213l() - j11 >= m132219a.m132210i() && AbstractC0924m0.m3333P6() == 0) {
                        C28023b6.m141250h0().m141316T1(m132219a.m132216o());
                        return;
                    }
                    return;
                }
            }
            j11 = 0;
            if (m132219a.m132211j() < 31536000000L) {
            }
            if (m132219a.m132210i() < 2628000000L) {
            }
        }
    }

    /* renamed from: e */
    public final void m132224e() {
        C0824j.m2153b(new b());
    }

    /* renamed from: f */
    public final void m132225f(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("android");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("last_modified");
                C25596a.a aVar = C25596a.Companion;
                C25596a m132219a = aVar.m132219a();
                if (optLong == m132219a.m132209h()) {
                    return;
                }
                if (optJSONObject.optInt("version_code") % 100000 > m132219a.m132215n() % 100000) {
                    AbstractC0924m0.m2975Cp(0L);
                    AbstractC0924m0.m3814fi(false);
                }
                aVar.m132219a().m132218q(optJSONObject);
                C0824j.m2153b(new c(optJSONObject));
                m132223c();
                C23744a.Companion.m124119a().m124116d(6026, new Object[0]);
                return;
            }
            C0824j.m2153b(new d());
            return;
        }
        C7960e.m41971c6().m42126G0();
    }
}
