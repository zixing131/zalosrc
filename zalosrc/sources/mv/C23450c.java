package mv;

import ae.C0766k;
import ag0.C0809c1;
import ag0.C0815e1;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.widget.layout.MovableView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23056e6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mv.C23450c;
import org.json.JSONException;
import org.json.JSONObject;
import p142ey.C18644n;
import p207he.C20024r;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p361nb.C23655l;
import p361nb.C23669z;
import p420pb.C24709a;
import p645xh.C29628e;
import p716zh.C31901e8;
import p716zh.C31930g7;
import vg.C28023b6;
import wd0.C28931k;
import xd0.C29593i;

/* renamed from: mv.c */
/* loaded from: classes4.dex */
public class C23450c extends PhoneStateListener {

    /* renamed from: m */
    static C23450c f113907m;

    /* renamed from: n */
    static Map f113908n = new HashMap();

    /* renamed from: a */
    C23528a f113909a;

    /* renamed from: c */
    WindowManager f113911c;

    /* renamed from: d */
    Context f113912d;

    /* renamed from: k */
    long f113919k;

    /* renamed from: l */
    boolean f113920l;

    /* renamed from: b */
    MovableView f113910b = null;

    /* renamed from: e */
    Handler f113913e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    ContactProfile f113914f = null;

    /* renamed from: g */
    boolean f113915g = false;

    /* renamed from: h */
    String f113916h = "";

    /* renamed from: i */
    String f113917i = "";

    /* renamed from: j */
    int f113918j = 0;

    /* renamed from: mv.c$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f113921a;

        a(C23669z c23669z) {
            this.f113921a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f113921a);
        }
    }

    /* renamed from: mv.c$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f113923a;

        b(String str) {
            this.f113923a = str;
        }

        /* renamed from: e */
        public /* synthetic */ void m123147e(ContactProfile contactProfile, String str) {
            C23450c.this.m123144l(contactProfile, str);
        }

        /* renamed from: f */
        public static /* synthetic */ void m123148f() {
            try {
                C31930g7.m153408g().m153412d();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C23450c c23450c = C23450c.f113907m;
                c20096c.m104492d();
                int m104491c = c20096c.m104491c();
                if (m104491c != 1001 && m104491c != 50001) {
                    if (m104491c == 1011 || m104491c == 1012) {
                        C23450c.f113908n.put(this.f113923a, new ContactProfile());
                    }
                } else {
                    C31930g7.m153408g().m153410b(this.f113923a, System.currentTimeMillis());
                    C23450c.this.f113913e.postDelayed(new Runnable() { // from class: mv.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23450c.b.m123148f();
                        }
                    }, 12000L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            if (obj != null) {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.isNull("data")) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(jSONObject2.getString("data"));
                    }
                    if (jSONObject != null) {
                        ContactProfile contactProfile = new ContactProfile(jSONObject);
                        C23450c.f113908n.put(this.f113923a, contactProfile);
                        C23450c.this.f113913e.post(new Runnable() { // from class: mv.d

                            /* renamed from: q */
                            public final /* synthetic */ ContactProfile f113931q;

                            /* renamed from: r */
                            public final /* synthetic */ String f113932r;

                            public /* synthetic */ RunnableC23451d(ContactProfile contactProfile2, String str) {
                                r2 = contactProfile2;
                                r3 = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C23450c.b.this.m123147e(r2, r3);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: mv.c$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f113925a;

        /* renamed from: b */
        final /* synthetic */ int f113926b;

        /* renamed from: c */
        final /* synthetic */ boolean f113927c;

        /* renamed from: d */
        final /* synthetic */ long f113928d;

        c(String str, int i11, boolean z11, long j11) {
            this.f113925a = str;
            this.f113926b = i11;
            this.f113927c = z11;
            this.f113928d = j11;
        }

        /* renamed from: e */
        public /* synthetic */ void m123151e(ContactProfile contactProfile, String str) {
            C23450c.this.m123144l(contactProfile, str);
        }

        /* renamed from: f */
        public static /* synthetic */ void m123152f() {
            try {
                C31930g7.m153408g().m153412d();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            int m104491c;
            try {
                if (this.f113926b != -1 && ((m104491c = c20096c.m104491c()) == 1001 || m104491c == 50001)) {
                    C31930g7.m153408g().m153410b(this.f113925a, System.currentTimeMillis());
                    C23450c.this.f113913e.postDelayed(new Runnable() { // from class: mv.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23450c.c.m123152f();
                        }
                    }, 12000L);
                }
                if (c20096c.m104491c() == 1011 || c20096c.m104491c() == 1012) {
                    C23450c.f113908n.put(this.f113925a, new ContactProfile());
                }
                C23450c c23450c = C23450c.this;
                boolean z12 = this.f113927c;
                if (this.f113926b == -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c23450c.m123137g(z12, z11, 4);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            int i11;
            boolean z11 = false;
            boolean z12 = true;
            try {
                if (obj != null) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.isNull("data")) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(jSONObject2.getString("data"));
                    }
                    if (jSONObject != null) {
                        ContactProfile contactProfile = new ContactProfile(jSONObject);
                        C23450c.f113908n.put(this.f113925a, contactProfile);
                        if (this.f113926b != -1) {
                            C23450c.this.f113913e.post(new Runnable() { // from class: mv.g

                                /* renamed from: q */
                                public final /* synthetic */ ContactProfile f113934q;

                                /* renamed from: r */
                                public final /* synthetic */ String f113935r;

                                public /* synthetic */ RunnableC23454g(ContactProfile contactProfile2, String str) {
                                    r2 = contactProfile2;
                                    r3 = str;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C23450c.c.this.m123151e(r2, r3);
                                }
                            });
                        }
                        if (C18644n.m98531l().m98558u(contactProfile2.f42434r)) {
                            C23450c c23450c = C23450c.this;
                            boolean z13 = this.f113927c;
                            if (this.f113926b != -1) {
                                z12 = false;
                            }
                            c23450c.m123137g(z13, z12, 0);
                            C23450c c23450c2 = C23450c.this;
                            int parseInt = Integer.parseInt(contactProfile2.f42434r);
                            if (this.f113927c) {
                                i11 = AbstractC8020f0.str_des_call_native_outgoing;
                            } else {
                                i11 = AbstractC8020f0.str_des_call_native;
                            }
                            c23450c2.m123142h(parseInt, AbstractC23136l9.m118743r0(i11), this.f113927c, false, true, this.f113926b, this.f113928d, true);
                            return;
                        }
                        C23450c c23450c3 = C23450c.this;
                        boolean z14 = this.f113927c;
                        if (this.f113926b == -1) {
                            z11 = true;
                        }
                        c23450c3.m123137g(z14, z11, 1);
                        return;
                    }
                    C23450c c23450c4 = C23450c.this;
                    boolean z15 = this.f113927c;
                    if (this.f113926b == -1) {
                        z11 = true;
                    }
                    c23450c4.m123137g(z15, z11, 2);
                    return;
                }
                C23450c c23450c5 = C23450c.this;
                boolean z16 = this.f113927c;
                if (this.f113926b == -1) {
                    z11 = true;
                }
                c23450c5.m123137g(z16, z11, 2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C23450c(Context context) {
        this.f113912d = context;
        this.f113911c = (WindowManager) context.getSystemService("window");
        this.f113909a = new C23528a(context);
    }

    /* renamed from: e */
    private String m123135e() {
        if (C29628e.m147249E0().m93432x()) {
            int m118267a = C23055e5.m118267a(MainApplication.getAppContext());
            if (m118267a != 1) {
                if (m118267a != 2 && m118267a != 3 && m118267a != 4 && m118267a != 5) {
                    return "4";
                }
                return "2";
            }
            return "1";
        }
        return "0";
    }

    /* renamed from: f */
    private ContactProfile m123136f(String str) {
        ContactProfile contactProfile;
        ContactProfile contactProfile2 = null;
        try {
            C31901e8 m2800f = AbstractC0906d0.m2800f(this.f113912d, AbstractC23056e6.m118285k(str));
            if (m2800f != null) {
                contactProfile = C18644n.m98531l().m98552o("" + m2800f.m153300r());
            } else {
                contactProfile = null;
            }
            if (contactProfile == null) {
                try {
                    ContactProfile contactProfile3 = (ContactProfile) f113908n.get(str);
                    if (contactProfile3 != null) {
                        try {
                            if (TextUtils.isEmpty(contactProfile3.f42434r)) {
                                return null;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            contactProfile2 = contactProfile3;
                            e.printStackTrace();
                            return contactProfile2;
                        }
                    }
                    contactProfile2 = contactProfile3;
                } catch (Exception e12) {
                    e = e12;
                    contactProfile2 = contactProfile;
                }
            } else {
                contactProfile2 = contactProfile;
            }
            if (contactProfile2 == null) {
                if (C23055e5.m118271f()) {
                    String m121779c5 = AbstractC23309i.m121779c5();
                    if (m121779c5 == null) {
                        m121779c5 = AbstractC23309i.m121704a5();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new b(str));
                    c0766k.mo1583Y9(str, m121779c5, 2);
                } else {
                    C31930g7.m153408g().m153410b(str, System.currentTimeMillis());
                }
            }
        } catch (Exception e13) {
            e = e13;
        }
        return contactProfile2;
    }

    /* renamed from: g */
    public void m123137g(boolean z11, boolean z12, int i11) {
        try {
            if (!AbstractC23304d.f113311O1) {
                return;
            }
            String m123135e = m123135e();
            if (z11) {
                C0815e1.m2075D().m2100V(new C23648e(37, "native_call", 1, "native_call", new String[0]).m123926s(String.valueOf(2), String.valueOf(i11), m123135e), false);
            } else if (z12) {
                C0815e1.m2075D().m2100V(new C23648e(37, "native_call", 1, "native_call", new String[0]).m123926s(String.valueOf(1), String.valueOf(i11), m123135e), false);
            } else {
                C0815e1.m2075D().m2100V(new C23648e(37, "native_call", 1, "native_call", new String[0]).m123926s(String.valueOf(0), String.valueOf(i11), m123135e), false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m123138j(boolean z11, int i11, String str, int i12, boolean z12, String str2, boolean z13, long j11, boolean z14) {
        boolean z15;
        String str3;
        String str4;
        boolean z16;
        long j12;
        String str5;
        int i13;
        int i14;
        int i15;
        C17969i0 m94929K2;
        try {
            boolean m121414Sb = AbstractC23309i.m121414Sb();
            int m121377Rb = AbstractC23309i.m121377Rb();
            if (m121377Rb != 0) {
                if (m121377Rb != 2 || z11) {
                    if ((m121377Rb == 3 && z11) || !m121414Sb) {
                        return;
                    }
                    if (i11 == -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        str3 = "recommened.calltime";
                    } else {
                        str3 = "recommened.misscall";
                    }
                    C17945a0 m2603B = AbstractC23306f.m120584H0().m2603B(str);
                    if (m2603B == null || !m2603B.m95042W5() || (m94929K2 = m2603B.m94929K2()) == null) {
                        str4 = "";
                        z16 = false;
                        j12 = 0;
                    } else {
                        j12 = m2603B.m94974P4();
                        z16 = m2603B.m95032V6();
                        str4 = m94929K2.f91016u;
                    }
                    if ((z11 || i11 != -1) && z16 == z11 && str3.equals(str4) && System.currentTimeMillis() - j12 < AbstractC23309i.m120775B1() * 1000) {
                        return;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(AbstractC23309i.m121304Pc());
                    if (AbstractC23160o0.m119235a1(Calendar.getInstance(), calendar)) {
                        if ((z11 || i11 != -1) && AbstractC23309i.m120746A9() >= AbstractC23309i.m122311q8()) {
                            return;
                        }
                        if (!z11 && i11 == -1) {
                            if (AbstractC23309i.m120783B9() >= AbstractC23309i.m122348r8()) {
                                return;
                            } else {
                                AbstractC23309i.m122296pu(AbstractC23309i.m120783B9() + 1);
                            }
                        }
                        AbstractC23309i.m122259ou(AbstractC23309i.m120746A9() + 1);
                    } else {
                        AbstractC23309i.m122296pu(0);
                        if (!z11 && i11 == -1) {
                            if (AbstractC23309i.m120783B9() >= AbstractC23309i.m122348r8()) {
                                return;
                            } else {
                                AbstractC23309i.m122296pu(1);
                            }
                        }
                        AbstractC23309i.m122074jy(System.currentTimeMillis());
                        AbstractC23309i.m122259ou(1);
                    }
                    if (z11) {
                        str5 = CoreUtility.f89233i;
                    } else {
                        str5 = "" + i12;
                    }
                    C17945a0.w wVar = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", "" + i12, str5), 12);
                    if (z11) {
                        String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_call_out_come);
                        Object[] objArr = new Object[1];
                        if (z12) {
                            i14 = AbstractC8020f0.str_video_call_type;
                        } else {
                            i14 = AbstractC8020f0.str_voice_call_type;
                        }
                        objArr[0] = AbstractC23136l9.m118743r0(i14);
                        wVar.m95382r(String.format(string, objArr));
                        if (str2.equalsIgnoreCase(AbstractC23160o0.m119256h1(0L))) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                        wVar.m95386v(i15);
                    } else if (str3.equals("recommened.calltime")) {
                        String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_call_in_come);
                        Object[] objArr2 = new Object[1];
                        if (z12) {
                            i13 = AbstractC8020f0.str_video_call_type;
                        } else {
                            i13 = AbstractC8020f0.str_voice_call_type;
                        }
                        objArr2[0] = AbstractC23136l9.m118743r0(i13);
                        wVar.m95382r(String.format(string2, objArr2));
                    } else {
                        wVar.m95382r(MainApplication.getAppContext().getString(AbstractC8020f0.missed_call));
                    }
                    String format = String.format("{\"calltype\":%d,\"callback\":%d,\"reason\":%d,\"duration\":%d,\"isCallNative\":%d}", Integer.valueOf(z12 ? 1 : 0), Integer.valueOf(z13 ? 1 : 0), Integer.valueOf(i11), Long.valueOf(j11), Integer.valueOf(z14 ? 1 : 0));
                    wVar.m95387w(0);
                    wVar.m95368d(new C18013y0(str2, 0, "", AbstractC23306f.m120583H().m110204g().m116324p(), "", str3, format));
                    C17945a0 m95365a = wVar.m95365a();
                    m95365a.m94951M9();
                    AbstractC23306f.m120681k0().m101500a(new C29593i.a(String.valueOf(i12), m95365a, C28931k.d.m144581e()));
                    AbstractC23306f.m120724x().m99492f(m95365a);
                    if (z11) {
                        C20024r.m103937c().m103950f(i12, 0, 0L, 0);
                        AbstractC23647d.m123897g("400400");
                    } else if (z15) {
                        C20024r.m103937c().m103950f(i12, 1, j11, 0);
                        AbstractC23647d.m123897g("400401");
                    } else {
                        C20024r.m103937c().m103950f(i12, 2, 0L, 0);
                        AbstractC23647d.m123897g("400402");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m123139k(Context context) {
        if (f113907m == null) {
            f113907m = new C23450c(context);
            if (AbstractC23057e7.m118298e()) {
                ((TelephonyManager) context.getSystemService("phone")).listen(f113907m, 32);
            }
        }
    }

    /* renamed from: c */
    void m123140c(String str, boolean z11, int i11, long j11) {
        ContactProfile contactProfile;
        int i12;
        String m118285k = AbstractC23056e6.m118285k(str);
        if (TextUtils.isEmpty(m118285k) || m118285k.equals(AbstractC23056e6.f112062a) || !C8937j0.m47663l("call_log_noti_call")) {
            return;
        }
        C8937j0.m47655c().m37627b(new SensitiveData("call_log_noti_call", "comm_call"));
        C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), m118285k);
        if (m2800f != null && m2800f.m153300r() > 0) {
            contactProfile = C18644n.m98531l().m98552o(String.valueOf(m2800f.m153300r()));
        } else {
            contactProfile = null;
        }
        if (contactProfile == null && (contactProfile = (ContactProfile) f113908n.get(str)) != null && TextUtils.isEmpty(contactProfile.f42434r)) {
            return;
        }
        boolean z12 = true;
        if (contactProfile != null) {
            if (i11 != -1) {
                m123144l(contactProfile, str);
            }
            if (C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                if (i11 != -1) {
                    z12 = false;
                }
                m123137g(z11, z12, 0);
                int parseInt = Integer.parseInt(contactProfile.mo2478b());
                if (z11) {
                    i12 = AbstractC8020f0.str_des_call_native_outgoing;
                } else {
                    i12 = AbstractC8020f0.str_des_call_native;
                }
                m123142h(parseInt, AbstractC23136l9.m118743r0(i12), z11, false, true, i11, j11, true);
                return;
            }
            return;
        }
        if (C23055e5.m118271f()) {
            String m121779c5 = AbstractC23309i.m121779c5();
            if (m121779c5 == null) {
                m121779c5 = AbstractC23309i.m121704a5();
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(str, i11, z11, j11));
            c0766k.mo1583Y9(str, m121779c5, 2);
            return;
        }
        if (i11 != -1) {
            m123137g(z11, false, 3);
            if (AbstractC23309i.m121342Qd()) {
                C31930g7.m153408g().m153410b(str, System.currentTimeMillis());
                return;
            }
            return;
        }
        m123137g(z11, true, 3);
    }

    /* renamed from: d */
    public void m123141d(int i11, String str) {
        String str2;
        int i12 = this.f113918j;
        if (i12 == i11) {
            return;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i12 != 1) {
                        this.f113920l = false;
                        this.f113919k = System.currentTimeMillis();
                        if (str == null) {
                            str = "";
                        }
                        this.f113917i = str;
                    } else {
                        this.f113920l = true;
                        this.f113919k = System.currentTimeMillis();
                        if (TextUtils.isEmpty(str)) {
                            str = this.f113917i;
                        }
                        this.f113917i = str;
                    }
                }
            } else {
                this.f113920l = true;
                this.f113919k = System.currentTimeMillis();
                if (str == null) {
                    str = "";
                }
                this.f113917i = str;
            }
        } else {
            try {
                int m121377Rb = AbstractC23309i.m121377Rb();
                if (TextUtils.isEmpty(str)) {
                    str2 = this.f113917i;
                } else {
                    str2 = str;
                }
                this.f113917i = str2;
                if (this.f113918j == 1) {
                    if (m121377Rb == 1 || m121377Rb == 3) {
                        m123140c(str2, false, 0, -1L);
                    }
                } else if (this.f113920l) {
                    if (m121377Rb == 1 || m121377Rb == 3) {
                        m123140c(str2, false, -1, (System.currentTimeMillis() - this.f113919k) / 1000);
                    }
                } else if (m121377Rb == 1 || m121377Rb == 2) {
                    m123140c(str2, true, -1, -1L);
                }
                this.f113917i = "";
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (AbstractC23309i.m120962G3(1) == 1) {
                try {
                    C23655l c23655l = new C23655l();
                    c23655l.f114654a = 1;
                    c23655l.f114655b = 2;
                    c23655l.f114656c = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("phone", str);
                        jSONObject.put("time", this.f113919k);
                    } catch (JSONException e12) {
                        e12.printStackTrace();
                    }
                    c23655l.f114659f[0] = jSONObject.toString();
                    if (this.f113918j == 1) {
                        c23655l.f114657d = 1;
                    } else if (this.f113920l) {
                        c23655l.f114657d = 0;
                    } else {
                        c23655l.f114657d = 2;
                    }
                    C0809c1.m2050b(new a(c23655l));
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        this.f113918j = i11;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: mv.b.<init>(boolean, int, java.lang.String, int, boolean, java.lang.String, boolean, long, boolean):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: h */
    void m123142h(int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, int r21, long r22, boolean r24) {
        /*
            r15 = this;
            int r0 = p348mi.AbstractC23309i.m121377Rb()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = com.zing.zalocore.CoreUtility.f89233i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = com.zing.zalocore.CoreUtility.f89233i
            java.lang.String r1 = java.lang.String.valueOf(r16)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            goto L41
        L1c:
            java.lang.String r0 = java.lang.String.valueOf(r16)
            mg.a r12 = mg.C23288a.f113033a
            eg0.b r13 = new eg0.b
            mv.b r14 = new mv.b
            r1 = r14
            r2 = r18
            r3 = r21
            r4 = r0
            r5 = r16
            r6 = r19
            r7 = r17
            r8 = r20
            r9 = r22
            r11 = r24
            r1.<init>()
            r13.<init>(r0, r14)
            r12.mo13474a(r13)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.C23450c.m123142h(int, java.lang.String, boolean, boolean, boolean, int, long, boolean):void");
    }

    /* renamed from: i */
    boolean m123143i(ContactProfile contactProfile) {
        if (contactProfile != null && !CoreUtility.f89233i.equals(contactProfile.f42434r) && !AbstractC21935u.m114550q(contactProfile.f42434r)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    void m123144l(ContactProfile contactProfile, String str) {
        try {
            if (AbstractC23309i.m121342Qd() && m123143i(contactProfile)) {
                C31930g7.m153408g().m153424r(str);
                AbstractC23647d.m123906p("158000");
                C28023b6.m141250h0().m141366n2(contactProfile, System.currentTimeMillis(), str);
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i11, String str) {
        super.onCallStateChanged(i11, str);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CALL_STATE_RINGING:");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("state:");
            sb3.append(i11);
            String str2 = "";
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        this.f113916h = "";
                    } else {
                        this.f113915g = false;
                        this.f113916h = "";
                    }
                } else {
                    this.f113915g = true;
                    if (str != null) {
                        str2 = str;
                    }
                    this.f113916h = str2;
                }
            } else {
                if (AbstractC23309i.m121377Rb() == 0 && this.f113915g && AbstractC23309i.m121342Qd()) {
                    m123144l(m123136f(this.f113916h), this.f113916h);
                }
                this.f113915g = false;
                this.f113916h = "";
            }
            m123141d(i11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
