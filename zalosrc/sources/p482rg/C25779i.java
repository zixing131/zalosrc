package p482rg;

import ae.C0766k;
import ag0.AbstractC0852x;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p019aj.C0872f;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21932r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p482rg.C25779i;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vg.C28203u6;

/* renamed from: rg.i */
/* loaded from: classes3.dex */
public final class C25779i extends AbstractC19962a implements InterfaceC25774d {

    /* renamed from: t */
    private boolean f122962t;

    /* renamed from: u */
    private boolean f122963u;

    /* renamed from: rg.i$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC20094a {
        a() {
        }

        /* renamed from: e */
        public static final void m132918e(C25779i c25779i) {
            AbstractC19074t.m100208f(c25779i, "$this_run");
            List m114400e = C21932r.f107858a.m114400e();
            if (m114400e != null) {
                ((InterfaceC25775e) c25779i.m103742Dp()).mo39901ol(m114400e);
            }
            ((InterfaceC25775e) c25779i.m103742Dp()).mo39904tz(false);
        }

        /* renamed from: f */
        public static final void m132919f(C25779i c25779i) {
            AbstractC19074t.m100208f(c25779i, "$this_run");
            ((InterfaceC25775e) c25779i.m103742Dp()).mo39904tz(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ((InterfaceC25775e) C25779i.this.m103742Dp()).mo70710wy(new Runnable() { // from class: rg.h
                public /* synthetic */ RunnableC25778h() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25779i.a.m132919f(C25779i.this);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ((InterfaceC25775e) C25779i.this.m103742Dp()).mo70710wy(new Runnable() { // from class: rg.g
                public /* synthetic */ RunnableC25777g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25779i.a.m132918e(C25779i.this);
                }
            });
        }
    }

    /* renamed from: rg.i$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ List f122966b;

        /* renamed from: c */
        final /* synthetic */ boolean f122967c;

        /* renamed from: d */
        final /* synthetic */ List f122968d;

        b(List list, boolean z11, List list2) {
            this.f122966b = list;
            this.f122967c = z11;
            this.f122968d = list2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:            r6 = qm0.AbstractC25332a0.m131187O0(r6);     */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m132921d(C25779i c25779i, List list) {
            List m131187O0;
            AbstractC19074t.m100208f(c25779i, "this$0");
            AbstractC19074t.m100208f(list, "$listDeletedFriend");
            try {
                AbstractC23088h5.m118426g();
                if (((InterfaceC25775e) c25779i.m103742Dp()).mo45894h0()) {
                    if (list.size() == 1) {
                        InterfaceC25775e interfaceC25775e = (InterfaceC25775e) c25779i.m103742Dp();
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfriended);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        interfaceC25775e.mo39897e0(m118743r0);
                    } else {
                        InterfaceC25775e interfaceC25775e2 = (InterfaceC25775e) c25779i.m103742Dp();
                        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_unfriended_people, Integer.valueOf(list.size()));
                        AbstractC19074t.m100207e(m118746s0, "getString(...)");
                        interfaceC25775e2.mo39897e0(m118746s0);
                    }
                }
                List m114400e = C21932r.f107858a.m114400e();
                if (m114400e != null && m131187O0 != null) {
                    ((InterfaceC25775e) c25779i.m103742Dp()).mo39901ol(m131187O0);
                }
                ((InterfaceC25775e) c25779i.m103742Dp()).mo39902qc();
                ((InterfaceC25775e) c25779i.m103742Dp()).mo39891Au();
                ((InterfaceC25775e) c25779i.m103742Dp()).mo39899n9();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    ToastUtils.m89259g(c20096c.m104491c());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C25779i.this.m132914Mp(false);
                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "resObj");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        int i12 = -999;
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            if (i11 == -55) {
                                if (!jSONObject2.isNull("limit_friends_remove")) {
                                    i12 = jSONObject2.getInt("limit_friends_remove");
                                }
                                if (i12 > 0) {
                                    InterfaceC25775e interfaceC25775e = (InterfaceC25775e) C25779i.this.m103742Dp();
                                    C19067n0 c19067n0 = C19067n0.f94947a;
                                    String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_number_out_of_accepted) + " (%s)", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                                    AbstractC19074t.m100207e(format, "format(...)");
                                    interfaceC25775e.mo39897e0(format);
                                } else {
                                    ToastUtils.m89259g(i11);
                                }
                            } else {
                                ToastUtils.m89259g(i11);
                            }
                            C25779i.this.m132914Mp(false);
                            ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                            C19669z.f97569Q.set(false);
                            C18644n.m98524E();
                            C25779i.this.m132914Mp(false);
                            ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                            List m114400e = C21932r.f107858a.m114400e();
                            if (m114400e == null || m114400e.isEmpty()) {
                                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo39898g();
                                return;
                            }
                            return;
                        }
                    }
                    int size = this.f122966b.size();
                    ArrayList arrayList = new ArrayList(this.f122966b);
                    ArrayList arrayList2 = new ArrayList(size);
                    ArrayList arrayList3 = new ArrayList(size);
                    C7960e.m41971c6().m42194M(arrayList, "0");
                    for (int i13 = 0; i13 < size; i13++) {
                        String str = (String) this.f122966b.get(i13);
                        C28203u6.f131407a.m141827z(str, false);
                        arrayList2.add(C21927m.m114302u().m114312J().m153138j(str));
                        arrayList3.add(C18644n.m98531l().m98552o(str));
                    }
                    C18644n.m98531l().m98539G(arrayList);
                    C21927m.m114302u().m114343l(arrayList);
                    ArrayList m42347b6 = C7960e.m41971c6().m42347b6();
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    for (int i14 = 0; i14 < size; i14++) {
                        String str2 = (String) this.f122966b.get(i14);
                        C28203u6.f131407a.m141804B(str2, 0);
                        if (arrayList2.get(i14) == null && arrayList3.get(i14) != null) {
                            C7960e.m41971c6().m42221O7((ContactProfile) arrayList3.get(i14), false);
                        }
                        if (m42347b6 != null && (!m42347b6.isEmpty()) && m42347b6.contains(str2)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(Integer.valueOf(Integer.parseInt(str2)));
                        }
                        Map map = AbstractC23304d.f113421p;
                        AbstractC19074t.m100207e(map, "mapRecentClickUids");
                        synchronized (map) {
                            try {
                                if (map.containsKey(str2)) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(str2);
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                        AbstractC21935u.m114533W(str2, -1, "");
                        AbstractC23059e9.m118317F(str2);
                        C21920f.m114270a().m114272c(str2);
                    }
                    AbstractC0852x.m2347d(arrayList);
                    if (this.f122967c) {
                        SensitiveData sensitiveData = new SensitiveData("phonebook_delete_on_cleanup_relation", "phonebook_delete", null, 4, null);
                        Iterator it = this.f122968d.iterator();
                        while (it.hasNext()) {
                            AbstractC0852x.m2355l(MainApplication.Companion.m35500c(), ((ContactProfile) it.next()).f42455y, sensitiveData);
                        }
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty())) {
                        C21927m.m114302u().m114338i0(arrayList4);
                    }
                    if (arrayList5 != null && (!arrayList5.isEmpty())) {
                        C7960e.m41971c6().m42171K(arrayList5);
                    }
                    for (ContactProfile contactProfile : this.f122968d) {
                        List m114400e2 = C21932r.f107858a.m114400e();
                        if (m114400e2 != null) {
                            m114400e2.remove(contactProfile);
                        }
                    }
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo70710wy(new Runnable() { // from class: rg.j

                        /* renamed from: q */
                        public final /* synthetic */ List f122973q;

                        public /* synthetic */ RunnableC25780j(List list) {
                            r2 = list;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C25779i.b.m132921d(C25779i.this, r2);
                        }
                    });
                    C19669z.Companion.m103232a().m103198O0();
                    C23744a.Companion.m124119a().m124116d(6078, new Object[0]);
                    C19669z.f97569Q.set(false);
                    C18644n.m98524E();
                    C25779i.this.m132914Mp(false);
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                    List m114400e3 = C21932r.f107858a.m114400e();
                    if (m114400e3 != null && !m114400e3.isEmpty()) {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DeletePhoneBookView", e11);
                    C19669z.f97569Q.set(false);
                    C18644n.m98524E();
                    C25779i.this.m132914Mp(false);
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                    List m114400e4 = C21932r.f107858a.m114400e();
                    if (m114400e4 != null && !m114400e4.isEmpty()) {
                        return;
                    }
                }
                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo39898g();
            } catch (Throwable th2) {
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                C25779i.this.m132914Mp(false);
                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                List m114400e5 = C21932r.f107858a.m114400e();
                if (m114400e5 == null || m114400e5.isEmpty()) {
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo39898g();
                }
                throw th2;
            }
        }
    }

    /* renamed from: rg.i$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f122970b;

        /* renamed from: c */
        final /* synthetic */ boolean f122971c;

        c(ContactProfile contactProfile, boolean z11) {
            this.f122970b = contactProfile;
            this.f122971c = z11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:            r0 = qm0.AbstractC25332a0.m131187O0(r0);     */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m132923d(C25779i c25779i) {
            List m131187O0;
            AbstractC19074t.m100208f(c25779i, "this$0");
            List m114400e = C21932r.f107858a.m114400e();
            if (m114400e != null && m131187O0 != null) {
                ((InterfaceC25775e) c25779i.m103742Dp()).mo39901ol(m131187O0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                        i11 = -1000;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                ToastUtils.m89259g(i11);
            } finally {
                C25779i.this.m132915Np(false);
                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ContactProfile contactProfile = this.f122970b;
                            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && (AbstractC25495a.m132086k(this.f122970b.f42434r) || this.f122970b.m40372J0())) {
                                InterfaceC25775e interfaceC25775e = (InterfaceC25775e) C25779i.this.m103742Dp();
                                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_error_cannot_delete_this_contact);
                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                interfaceC25775e.mo39897e0(m118743r0);
                            } else {
                                ToastUtils.m89259g(i11);
                            }
                            C19669z.f97569Q.set(false);
                            C18644n.m98524E();
                            ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                            C25779i.this.m132915Np(false);
                            List m114400e = C21932r.f107858a.m114400e();
                            if (m114400e == null || m114400e.isEmpty()) {
                                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo39898g();
                                return;
                            }
                            return;
                        }
                    }
                    C21932r c21932r = C21932r.f107858a;
                    List m114400e2 = c21932r.m114400e();
                    if (m114400e2 != null) {
                        AbstractC19069o0.m100184a(m114400e2).remove(this.f122970b);
                    }
                    AbstractC19444a.m101697e(new Runnable() { // from class: rg.k
                        public /* synthetic */ RunnableC25781k() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C25779i.c.m132923d(C25779i.this);
                        }
                    });
                    C7960e m41971c6 = C7960e.m41971c6();
                    ContactProfile contactProfile2 = this.f122970b;
                    AbstractC19074t.m100205c(contactProfile2);
                    m41971c6.m42136Gd(contactProfile2.f42434r, false);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    String str = this.f122970b.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    c28203u6.m141827z(str, false);
                    ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f122970b.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f122970b.f42434r);
                    C18644n.m98531l().m98540I(this.f122970b.f42434r);
                    String str2 = this.f122970b.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    c28203u6.m141804B(str2, 0);
                    if (m153138j == null && m98552o != null) {
                        C7960e.m41971c6().m42221O7(m98552o, false);
                    }
                    C21927m.m114302u().m114350o0(this.f122970b.f42434r);
                    if (C7960e.m41971c6().m42096D9(this.f122970b.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        String str3 = this.f122970b.f42434r;
                        AbstractC19074t.m100207e(str3, "uid");
                        arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    if (!AbstractC25495a.m132084i(this.f122970b.f42434r) && AbstractC21935u.m114515E(this.f122970b.f42434r)) {
                        C0872f m120562A = AbstractC23306f.m120562A();
                        String str4 = this.f122970b.f42434r;
                        AbstractC19074t.m100207e(str4, "uid");
                        if (m120562A.m2529X(str4)) {
                            C7959d m41850e = C7959d.Companion.m41850e();
                            String str5 = this.f122970b.f42434r;
                            AbstractC19074t.m100207e(str5, "uid");
                            m41850e.m41774b3(str5, 2);
                        }
                    }
                    Map map = AbstractC23304d.f113421p;
                    AbstractC19074t.m100207e(map, "mapRecentClickUids");
                    ContactProfile contactProfile3 = this.f122970b;
                    synchronized (map) {
                        try {
                            if (map.containsKey(contactProfile3.f42434r)) {
                                C7960e.m41971c6().m42376e4(contactProfile3.f42434r);
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                    AbstractC21935u.m114533W(this.f122970b.f42434r, -1, "");
                    AbstractC23059e9.m118317F(this.f122970b.f42434r);
                    C21927m.m114302u().m114352p0(this.f122970b.f42434r);
                    C7960e.m41971c6().m42099Dc(this.f122970b.f42434r);
                    AbstractC0852x.m2332I(this.f122970b.f42434r);
                    if (this.f122971c) {
                        AbstractC0852x.m2355l(MainApplication.Companion.m35500c(), this.f122970b.f42455y, new SensitiveData("phonebook_delete_on_cleanup_relation", "phonebook_delete", null, 4, null));
                    }
                    AbstractC23088h5.m118426g();
                    if (((InterfaceC25775e) C25779i.this.m103742Dp()).mo45894h0()) {
                        InterfaceC25775e interfaceC25775e2 = (InterfaceC25775e) C25779i.this.m103742Dp();
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfriended);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        interfaceC25775e2.mo39897e0(m118743r02);
                    }
                    C19669z.Companion.m103232a().m103198O0();
                    C23744a.Companion.m124119a().m124116d(6078, new Object[0]);
                    C21920f.m114270a().m114272c(this.f122970b.f42434r);
                    C19669z.f97569Q.set(false);
                    C18644n.m98524E();
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                    C25779i.this.m132915Np(false);
                    List m114400e3 = c21932r.m114400e();
                    if (m114400e3 != null && !m114400e3.isEmpty()) {
                        return;
                    }
                } catch (Exception e11) {
                    String str6 = ZaloListView.f79554n2;
                    e11.toString();
                    C19669z.f97569Q.set(false);
                    C18644n.m98524E();
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                    C25779i.this.m132915Np(false);
                    List m114400e4 = C21932r.f107858a.m114400e();
                    if (m114400e4 != null && !m114400e4.isEmpty()) {
                        return;
                    }
                }
                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo39898g();
            } catch (Throwable th2) {
                C19669z.f97569Q.set(false);
                C18644n.m98524E();
                ((InterfaceC25775e) C25779i.this.m103742Dp()).mo78960q3();
                C25779i.this.m132915Np(false);
                List m114400e5 = C21932r.f107858a.m114400e();
                if (m114400e5 == null || m114400e5.isEmpty()) {
                    ((InterfaceC25775e) C25779i.this.m103742Dp()).mo39898g();
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25779i(InterfaceC25775e interfaceC25775e) {
        super(interfaceC25775e);
        AbstractC19074t.m100208f(interfaceC25775e, "mvpView");
    }

    /* renamed from: Jp */
    private final String m132912Jp(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("suggest_size_total", list.size());
            jSONObject.put("suggest_size_cur", list.size());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: Kp */
    public static final void m132913Kp(C25779i c25779i, List list) {
        AbstractC19074t.m100208f(c25779i, "this$0");
        AbstractC19074t.m100208f(list, "$it");
        ((InterfaceC25775e) c25779i.m103742Dp()).mo39901ol(list);
        ((InterfaceC25775e) c25779i.m103742Dp()).mo39904tz(false);
    }

    @Override // p482rg.InterfaceC25774d
    /* renamed from: B0 */
    public void mo132908B0(ContactProfile contactProfile, boolean z11) {
        if (this.f122963u) {
            return;
        }
        ((InterfaceC25775e) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(contactProfile, z11));
        this.f122963u = true;
        AbstractC19074t.m100205c(contactProfile);
        c0766k.mo1791z6(contactProfile.f42434r, 37);
    }

    @Override // p482rg.InterfaceC25774d
    /* renamed from: H1 */
    public void mo132909H1() {
        C24848g0 c24848g0;
        ((InterfaceC25775e) m103742Dp()).mo39904tz(true);
        C21932r c21932r = C21932r.f107858a;
        List m114400e = c21932r.m114400e();
        if (m114400e != null) {
            ((InterfaceC25775e) m103742Dp()).mo70710wy(new Runnable() { // from class: rg.f

                /* renamed from: q */
                public final /* synthetic */ List f122959q;

                public /* synthetic */ RunnableC25776f(List m114400e2) {
                    r2 = m114400e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25779i.m132913Kp(C25779i.this, r2);
                }
            });
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            c21932r.m114401f(new a());
        }
    }

    /* renamed from: Mp */
    public final void m132914Mp(boolean z11) {
        this.f122962t = z11;
    }

    /* renamed from: Np */
    public final void m132915Np(boolean z11) {
        this.f122963u = z11;
    }

    @Override // p482rg.InterfaceC25774d
    /* renamed from: eo */
    public void mo132910eo(boolean z11, List list) {
        int m131511r;
        AbstractC19074t.m100208f(list, "listDeletedFriend");
        if (this.f122962t) {
            return;
        }
        this.f122962t = true;
        ((InterfaceC25775e) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        ArrayList arrayList = new ArrayList();
        try {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str = ((ContactProfile) it.next()).f42434r;
                AbstractC19074t.m100207e(str, "uid");
                arrayList2.add(str);
            }
            arrayList.addAll(arrayList2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.f122962t = false;
            ((InterfaceC25775e) m103742Dp()).mo49315c4();
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(arrayList, z11, list));
            c0766k.mo1409D4(new ArrayList(arrayList), 0, m132912Jp(list));
        }
    }
}
