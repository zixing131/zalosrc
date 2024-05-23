package sd;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23139m1;
import mm0.AbstractC23350e;
import on0.AbstractC24340u;
import on0.AbstractC24342w;
import p142ey.C18644n;
import p173fz.C19172a;
import p304ks.C21928n;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p422pd.C24726a;
import p444qd.C25227e;
import p461qu.AbstractC25495a;
import p480rd.AbstractC25731b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.C28203u6;

/* renamed from: sd.b */
/* loaded from: classes3.dex */
public final class C26231b {

    /* renamed from: a */
    public static final C26231b f124604a = new C26231b();

    /* renamed from: b */
    private static final InterfaceC24854k f124605b;

    /* renamed from: sd.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f124606q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final TimeZone mo12V4() {
            return TimeZone.getTimeZone("GMT+7:00");
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f124606q);
        f124605b = m129210a;
    }

    private C26231b() {
    }

    /* renamed from: b */
    public static final void m134863b(boolean z11) {
        boolean z12;
        List m130502i;
        boolean z13 = false;
        if (!z11) {
            try {
                if (!AbstractC0924m0.m4106pa() || !C24726a.f118764a.m128461c()) {
                    z12 = false;
                    if (C24726a.f118764a.m128460b() && (m130502i = C25227e.Companion.m130506a().m130502i()) != null && (!m130502i.isEmpty())) {
                        z13 = true;
                    }
                    if (!z12 || z13) {
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sd.a

                            /* renamed from: p */
                            public final /* synthetic */ boolean f124602p;

                            /* renamed from: q */
                            public final /* synthetic */ boolean f124603q;

                            public /* synthetic */ RunnableC26230a(boolean z122, boolean z132) {
                                r1 = z122;
                                r2 = z132;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C26231b.m134865d(r1, r2);
                            }
                        });
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
                return;
            }
        }
        z122 = true;
        if (C24726a.f118764a.m128460b()) {
            z132 = true;
        }
        if (!z122) {
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sd.a

            /* renamed from: p */
            public final /* synthetic */ boolean f124602p;

            /* renamed from: q */
            public final /* synthetic */ boolean f124603q;

            public /* synthetic */ RunnableC26230a(boolean z122, boolean z132) {
                r1 = z122;
                r2 = z132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26231b.m134865d(r1, r2);
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ void m134864c(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        m134863b(z11);
    }

    /* renamed from: d */
    public static final void m134865d(boolean z11, boolean z12) {
        if (z11) {
            AbstractC0924m0.m3993lh(false);
            C23744a.Companion.m124119a().m124116d(6100, new Object[0]);
        }
        if (z12) {
            C25227e.Companion.m130506a().m130504l(null);
            C23744a.Companion.m124119a().m124116d(6098, new Object[0]);
        }
        AbstractC23088h5.m118426g();
    }

    /* renamed from: j */
    public static final List m134866j() {
        boolean z11;
        List m130502i = C25227e.Companion.m130506a().m130502i();
        List list = m130502i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(m130502i.size());
        String m122303q0 = AbstractC23309i.m122303q0();
        if (m122303q0 != null && m122303q0.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z12 = !z11;
        Iterator it = m130502i.iterator();
        while (it.hasNext()) {
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, String.valueOf(((Number) it.next()).intValue()), false, 2, null);
            if (m141800i != null && f124604a.m134875n(m141800i, z12)) {
                arrayList.add(m141800i);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static final boolean m134867m() {
        if (C19172a.m100600k("features@setting@view_birthday", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final ArrayList m134868e(List list) {
        AbstractC19074t.m100208f(list, "listEventInfoOrg");
        ArrayList arrayList = new ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList;
        }
        try {
            TimeZone timeZone = TimeZone.getDefault();
            int m119252g0 = AbstractC23160o0.m119252g0(m134872i(), timeZone);
            for (int i11 = 0; i11 < list.size(); i11++) {
                AbstractC25731b abstractC25731b = (AbstractC25731b) list.get(i11);
                if (timeZone.useDaylightTime()) {
                    m119252g0 = AbstractC23160o0.m119255h0(m134872i(), timeZone, abstractC25731b.m132826d());
                }
                AbstractC25731b mo132823a = abstractC25731b.mo132823a();
                mo132823a.m132827e(mo132823a.m132826d() + m119252g0);
                arrayList.add(mo132823a);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Calendar m134869f() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(f124604a.m134872i());
        AbstractC19074t.m100207e(calendar, "apply(...)");
        return calendar;
    }

    /* renamed from: g */
    public final String m134870g(Calendar calendar, Context context) {
        AbstractC19074t.m100208f(calendar, "calendar");
        AbstractC19074t.m100208f(context, "context");
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        String[] stringArray = context.getResources().getStringArray(AbstractC16775v.array_days_of_week_full);
        AbstractC19074t.m100207e(stringArray, "getStringArray(...)");
        String[] stringArray2 = context.getResources().getStringArray(AbstractC16775v.array_months_full);
        AbstractC19074t.m100207e(stringArray2, "getStringArray(...)");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_birthday_hub_format_date_string_full_year);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{stringArray[calendar.get(7) - 1], Integer.valueOf(i11), stringArray2[i12 % stringArray2.length], Integer.valueOf(i13)}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:            r12 = on0.AbstractC24340u.m127107m((java.lang.String) r12.get(0));     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m134871h(ContactProfile contactProfile, Calendar calendar) {
        List m127132B0;
        Integer m127107m;
        AbstractC19074t.m100208f(contactProfile, "profile");
        if (contactProfile.f42400b0 != 0) {
            if (calendar == null) {
                calendar = m134869f();
            }
            calendar.setTimeInMillis(contactProfile.f42400b0 * 1000);
            AbstractC23160o0.m119283q1(calendar);
            return calendar.get(5);
        }
        String str = contactProfile.f42452x;
        if (str == null || str.length() == 0) {
            return -1;
        }
        String str2 = contactProfile.f42452x;
        AbstractC19074t.m100207e(str2, "dob");
        int i11 = 0;
        for (int i12 = 0; i12 < str2.length(); i12++) {
            if (str2.charAt(i12) == '/') {
                i11++;
            }
        }
        if (i11 < 1) {
            return -1;
        }
        String str3 = contactProfile.f42452x;
        AbstractC19074t.m100207e(str3, "dob");
        m127132B0 = AbstractC24342w.m127132B0(str3, new String[]{"/"}, false, 0, 6, null);
        if ((m127132B0.size() != 2 && m127132B0.size() != 3) || m127107m == null) {
            return -1;
        }
        return m127107m.intValue();
    }

    /* renamed from: i */
    public final TimeZone m134872i() {
        Object value = f124605b.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (TimeZone) value;
    }

    /* renamed from: k */
    public final int m134873k(ContactProfile contactProfile, Calendar calendar) {
        List m127132B0;
        Integer m127107m;
        AbstractC19074t.m100208f(contactProfile, "profile");
        if (contactProfile.f42400b0 != 0) {
            if (calendar == null) {
                calendar = m134869f();
            }
            calendar.setTimeInMillis(contactProfile.f42400b0 * 1000);
            AbstractC23160o0.m119283q1(calendar);
            return calendar.get(2);
        }
        String str = contactProfile.f42452x;
        if (str != null && str.length() != 0) {
            String str2 = contactProfile.f42452x;
            AbstractC19074t.m100207e(str2, "dob");
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < str2.length(); i13++) {
                if (str2.charAt(i13) == '/') {
                    i12++;
                }
            }
            if (i12 >= 1) {
                String str3 = contactProfile.f42452x;
                AbstractC19074t.m100207e(str3, "dob");
                m127132B0 = AbstractC24342w.m127132B0(str3, new String[]{"/"}, false, 0, 6, null);
                if (m127132B0.size() == 2 || m127132B0.size() == 3) {
                    m127107m = AbstractC24340u.m127107m((String) m127132B0.get(1));
                    if (m127107m != null) {
                        i11 = m127107m.intValue();
                    }
                    return i11 - 1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: l */
    public final ContactProfile m134874l(String str) {
        AbstractC19074t.m100208f(str, "uid");
        ContactProfile m98552o = C18644n.m98531l().m98552o(str);
        if (m98552o == null && !C18644n.m98531l().m98551n().get()) {
            return C21928n.Companion.m114389a().m114376e(str);
        }
        return m98552o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:            if (r4 < 1) goto L48;     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m134875n(ContactProfile contactProfile, boolean z11) {
        AbstractC19074t.m100208f(contactProfile, "profileFriend");
        if (AbstractC25495a.m132086k(contactProfile.mo2478b())) {
            return false;
        }
        if (contactProfile.f42400b0 == 0) {
            String str = contactProfile.f42452x;
            if (str != null && str.length() != 0) {
                String str2 = contactProfile.f42452x;
                AbstractC19074t.m100207e(str2, "dob");
                int i11 = 0;
                for (int i12 = 0; i12 < str2.length(); i12++) {
                    if (str2.charAt(i12) == '/') {
                        i11++;
                    }
                }
            }
            return false;
        }
        if (C23139m1.f112256a.m118802t(z11, contactProfile.mo2478b())) {
            return false;
        }
        return true;
    }
}
