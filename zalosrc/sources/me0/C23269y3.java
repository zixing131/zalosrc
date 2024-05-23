package me0;

import am.AbstractC0908e0;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import l30.C22013a0;
import l30.C22021e0;
import on0.AbstractC24341v;
import p133ek.AbstractC18458a;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p398oo.C24371m0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import s00.AbstractC26080o;
import vg.AbstractC28025b8;
import vg.C28119l3;
import vg.C28194t6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: me0.y3 */
/* loaded from: classes.dex */
public final class C23269y3 {

    /* renamed from: a */
    public static final C23269y3 f112776a = new C23269y3();

    /* renamed from: me0.y3$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f112777t;

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
            AbstractC28298d.m142578e();
            if (this.f112777t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC0924m0.m3468Tp(true);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private C23269y3() {
    }

    /* renamed from: a */
    public static final void m120035a(String str) {
        AbstractC19074t.m100208f(str, "language");
        AbstractC18458a.f93019a = str;
        AbstractC17158i1.f87698h = str;
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC23259x3.m119965a();
            LocaleList.setDefault(AbstractC23249w3.m119783a(new Locale[]{new Locale(str)}));
        } else {
            Locale.setDefault(new Locale(str));
        }
        MainApplication.C6895a c6895a = MainApplication.Companion;
        c6895a.m35507j();
        C23212s8.m119597d(null, false, 0, 0, 14, null);
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str2);
        if (str2.length() > 0) {
            AbstractC23309i.m122022ij(str, false);
        } else {
            AbstractC23309i.m121132Kp(str);
        }
        AbstractC23148n.m118828b(c6895a.m35500c());
        if (AbstractC19074t.m100204b("my", str)) {
            AbstractC23309i.m122148lw(c6895a.m35500c(), 1, false);
            AbstractC19646n0.m102940V1();
        }
        AbstractC23306f.m120721w().m154796m(false);
    }

    /* renamed from: c */
    public static final Context m120036c(Context context, String str) {
        AbstractC19074t.m100208f(str, "newLanguage");
        if (context != null) {
            Configuration configuration = new Configuration();
            Configuration configuration2 = context.getResources().getConfiguration();
            AbstractC19074t.m100207e(configuration2, "getConfiguration(...)");
            String m120038e = m120038e(configuration2);
            if (!AbstractC19074t.m100204b(str, "") && !AbstractC19074t.m100204b(str, m120038e)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC23259x3.m119965a();
                    LocaleList m119783a = AbstractC23249w3.m119783a(new Locale[]{new Locale(str)});
                    LocaleList.setDefault(m119783a);
                    configuration.setLocales(m119783a);
                } else {
                    Locale locale = new Locale(str);
                    Locale.setDefault(locale);
                    configuration.setLocale(locale);
                }
                return context.createConfigurationContext(configuration);
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    public static /* synthetic */ Context m120037d(Context context, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = AbstractC18458a.f93019a;
            AbstractC19074t.m100207e(str, "defaultLanguage");
        }
        return m120036c(context, str);
    }

    /* renamed from: e */
    public static final String m120038e(Configuration configuration) {
        Locale locale;
        LocaleList locales;
        int size;
        LocaleList locales2;
        AbstractC19074t.m100208f(configuration, "config");
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            if (size > 0) {
                locales2 = configuration.getLocales();
                locale = locales2.get(0);
                String language = locale.getLanguage();
                AbstractC19074t.m100207e(language, "getLanguage(...)");
                return language;
            }
        }
        locale = configuration.locale;
        String language2 = locale.getLanguage();
        AbstractC19074t.m100207e(language2, "getLanguage(...)");
        return language2;
    }

    /* renamed from: g */
    public static final String m120039g(String[] strArr) {
        try {
            Configuration configuration = Resources.getSystem().getConfiguration();
            AbstractC19074t.m100207e(configuration, "getConfiguration(...)");
            String m120038e = m120038e(configuration);
            if (m120038e.length() > 0) {
                if (strArr == null) {
                    strArr = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
                    AbstractC19074t.m100207e(strArr, "getStringArray(...)");
                }
                for (String str : strArr) {
                    if (AbstractC19074t.m100204b(str, m120038e)) {
                        return m120038e;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return AbstractC18458a.f93019a;
    }

    /* renamed from: i */
    public static final void m120040i(Context context) {
        try {
            AbstractC23309i.m121311Pj("");
            AbstractC23188q6.f112416a = "";
            AbstractC23188q6.f112417b = "";
            AbstractC23309i.m121348Qj(0L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (context != null) {
            C24371m0.a aVar = C24371m0.Companion;
            aVar.m127483a().mo127472d(0).m127392B();
            aVar.m127483a().mo127472d(1).m127392B();
            if (C22013a0.m114928g()) {
                C22021e0.m114963p().m114977J(context);
                C22013a0.m114924c().m114931a();
                AbstractC23304d.f113359a1 = true;
            }
            AbstractC23309i.m121097Jr(0L);
            AbstractC23309i.m121134Kr(0L);
            AbstractC23309i.m121245Nr(0L);
            AbstractC23309i.m121282Or(0L);
            AbstractC23309i.m121171Lr((System.currentTimeMillis() - AbstractC23309i.m121333Q4()) - AbstractC26080o.a.f124275b);
            AbstractC23309i.m120763Aq(0L);
            AbstractC23309i.m120800Bq(0L);
            AbstractC23309i.m120761Ao("");
            AbstractC23309i.m120798Bo("");
            C28194t6.m141765b().m141766a();
            AbstractC28025b8.m141434E();
            C21933s.m114405m();
            AbstractC19646n0.m102940V1();
        }
    }

    /* renamed from: b */
    public final void m120041b(Configuration configuration) {
        boolean m127126v;
        AbstractC19074t.m100208f(configuration, "config");
        try {
            m127126v = AbstractC24341v.m127126v(m120038e(configuration), AbstractC18458a.f93019a, true);
            if (!m127126v) {
                String str = AbstractC18458a.f93019a;
                AbstractC19074t.m100207e(str, "defaultLanguage");
                m120035a(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public final String m120042f(boolean z11) {
        String str;
        String m2815i;
        try {
            if (z11) {
                String m121738b1 = AbstractC23309i.m121738b1();
                AbstractC19074t.m100205c(m121738b1);
                if (m121738b1.length() > 0) {
                    m2815i = AbstractC23309i.m122158m5();
                } else {
                    m2815i = AbstractC23309i.m122196n5();
                }
            } else {
                String m2815i2 = AbstractC0908e0.m2815i("currentUserUid", "", false);
                AbstractC19074t.m100205c(m2815i2);
                if (m2815i2.length() > 0) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    str = String.format("currentLanguageSetting_%s", Arrays.copyOf(new Object[]{m2815i2}, 1));
                    AbstractC19074t.m100207e(str, "format(...)");
                } else {
                    str = "CURRENT_LANGUAGE_SETTING_WITHOUT_USERID";
                }
                m2815i = AbstractC0908e0.m2815i(str, C28119l3.m141601c().m141604d(), false);
            }
            AbstractC19074t.m100205c(m2815i);
            return m2815i;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    public final void m120043h(CoroutineScope coroutineScope) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        String m120042f = m120042f(MainApplication.f37852R);
        if (m120042f.length() == 0) {
            m120042f = C28119l3.m141601c().m141604d();
        }
        if (AbstractC19074t.m100204b(m120042f, "my")) {
            BuildersKt__Builders_commonKt.m112540d(coroutineScope, Dispatchers.m112680b(), null, new a(null), 2, null);
            m120042f = "en";
        }
        AbstractC18458a.f93019a = m120042f;
        AbstractC17158i1.f87698h = m120042f;
    }
}
