package p304ks;

import ae.C0766k;
import ag0.AbstractC0837p0;
import com.zing.zalo.cleanupcontact.p061ui.RemindCleanUpView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.mini_user_detail.MiniUserDetailView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p132ej.C18451m;
import p142ey.C18644n;
import p173fz.C19172a;
import p542ub.InterfaceC27218a;
import r30.C25641k;

/* renamed from: ks.r */
/* loaded from: classes4.dex */
public final class C21932r {

    /* renamed from: a */
    public static final C21932r f107858a = new C21932r();

    /* renamed from: b */
    private static boolean f107859b;

    /* renamed from: c */
    private static int f107860c;

    /* renamed from: d */
    private static List f107861d;

    /* renamed from: ks.r$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f107862a;

        a(InterfaceC20094a interfaceC20094a) {
            this.f107862a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC20094a interfaceC20094a = this.f107862a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            long j11;
            ContactProfile contactProfile;
            JSONArray optJSONArray;
            try {
                ArrayList arrayList = new ArrayList();
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        ContactProfile m98552o = C18644n.m98531l().m98552o(String.valueOf(optJSONArray.optInt(i11, 0)));
                        if (m98552o != null && !C25641k.m132506o().m132527w(m98552o.f42434r)) {
                            arrayList.add(m98552o);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                for (C18451m c18451m : C19669z.m103159g0(C19669z.Companion.m103232a(), null, 1, null)) {
                    hashMap.put(c18451m.mo97719a(), c18451m);
                }
                long mo124314i = C23793c.Companion.m124321a().mo124314i();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile2 = (ContactProfile) it.next();
                    if (hashMap.containsKey(contactProfile2.f42434r)) {
                        C18451m c18451m2 = (C18451m) hashMap.get(contactProfile2.f42434r);
                        if (c18451m2 != null && (contactProfile = c18451m2.f92992c) != null) {
                            j11 = contactProfile.m40402e0();
                        } else {
                            j11 = 0;
                        }
                        if (mo124314i - j11 > 2592000000L) {
                            arrayList2.add(contactProfile2);
                        }
                    } else {
                        arrayList2.add(contactProfile2);
                    }
                }
                C21932r.f107858a.m114402g(arrayList2);
                InterfaceC20094a interfaceC20094a = this.f107862a;
                if (interfaceC20094a != null) {
                    interfaceC20094a.mo927b(obj);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ks.r$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ZaloView f107863a;

        b(ZaloView zaloView) {
            this.f107863a = zaloView;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21932r.f107858a.m114396h(this.f107863a);
        }
    }

    private C21932r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m114396h(final ZaloView zaloView) {
        List list = f107861d;
        if (list != null && list.size() > 1) {
            AbstractC19444a.m101697e(new Runnable() { // from class: ks.q
                @Override // java.lang.Runnable
                public final void run() {
                    C21932r.m114397i(ZaloView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m114397i(ZaloView zaloView) {
        ZaloView zaloView2;
        ZaloView zaloView3;
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        if (zaloView != null && zaloView.m92672lJ()) {
            InterfaceC27218a m92676n2 = zaloView.m92676n2();
            if (m92676n2 != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
                zaloView2 = mo35579p2.m93012K0();
            } else {
                zaloView2 = null;
            }
            if (!(zaloView2 instanceof MainTabView)) {
                InterfaceC27218a m92676n22 = zaloView.m92676n2();
                if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
                    zaloView3 = mo35579p.m93012K0();
                } else {
                    zaloView3 = null;
                }
                if (!(zaloView3 instanceof MiniUserDetailView)) {
                    return;
                }
            }
            if (MainTabView.m67645lM().m67696kM() == C24099q0.Companion.m125984a().m125972p() && !f107859b) {
                f107859b = true;
                InterfaceC27218a m92676n23 = zaloView.m92676n2();
                if (m92676n23 != null) {
                    m92676n23.mo35573l4(RemindCleanUpView.class, null, 1, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m114398k(ZaloView zaloView) {
        List list = f107861d;
        if (list != null && !list.isEmpty()) {
            f107858a.m114396h(zaloView);
        } else {
            f107858a.m114401f(new b(zaloView));
        }
    }

    /* renamed from: d */
    public final void m114399d() {
        f107859b = false;
        f107860c = 0;
        List list = f107861d;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: e */
    public final List m114400e() {
        return f107861d;
    }

    /* renamed from: f */
    public final void m114401f(InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(interfaceC20094a));
        c0766k.mo1440H1();
    }

    /* renamed from: g */
    public final void m114402g(List list) {
        f107861d = list;
    }

    /* renamed from: j */
    public final void m114403j(final ZaloView zaloView) {
        int m100600k;
        if (C19172a.m100600k("suggest_cleanup_relation@enable", 0) != 1 || (m100600k = C19172a.m100600k("suggest_cleanup_relation@trigger", 2)) < 1) {
            return;
        }
        int m100600k2 = C19172a.m100600k("suggest_cleanup_relation@friendcount_min", 1000);
        int m100600k3 = C19172a.m100600k("suggest_cleanup_relation@friendcount_max", 1500);
        int m98555r = C18644n.m98531l().m98555r();
        if (m100600k2 <= m98555r && m98555r <= m100600k3) {
            int i11 = f107860c + 1;
            f107860c = i11;
            if (i11 >= m100600k) {
                AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: ks.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21932r.m114398k(ZaloView.this);
                    }
                });
            }
        }
    }
}
