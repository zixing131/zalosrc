package p219hw;

import ae.C0766k;
import ag0.AbstractC0852x;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0872f;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p219hw.C20152p;
import p219hw.InterfaceC20149m;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21932r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import pm0.C24848g0;
import vg.C28203u6;

/* renamed from: hw.p */
/* loaded from: classes4.dex */
public final class C20152p extends AbstractC19962a implements InterfaceC20148l {

    /* renamed from: t */
    private final C21927m f99496t;

    /* renamed from: u */
    private final C18644n f99497u;

    /* renamed from: v */
    private boolean f99498v;

    /* renamed from: w */
    private boolean f99499w;

    /* renamed from: x */
    private boolean f99500x;

    /* renamed from: hw.p$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f99502b;

        /* renamed from: hw.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32836a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f99503a;

            C32836a(String str) {
                this.f99503a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42413h8(this.f99503a);
            }
        }

        a(String str) {
            this.f99502b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m105145d(C20152p c20152p, String str) {
            AbstractC19074t.m100208f(c20152p, "this$0");
            AbstractC19074t.m100208f(str, "$uidFriend");
            InterfaceC20149m interfaceC20149m = (InterfaceC20149m) c20152p.m103742Dp();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_add_to_close_friends_list);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC20149m.mo48287e0(m118743r0);
            ((InterfaceC20149m) c20152p.m103742Dp()).mo48286ca(str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                if (((InterfaceC20149m) C20152p.this.m103742Dp()).mo45894h0()) {
                    InterfaceC20149m interfaceC20149m = (InterfaceC20149m) C20152p.this.m103742Dp();
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC20149m.mo48287e0(m118743r0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatPresenter", e11);
            }
            C20152p.this.f99499w = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject.optInt("error_code", -999) == 0) {
                            JSONArray jSONArray = new JSONArray();
                            try {
                                if (!jSONObject.isNull("data")) {
                                    jSONArray = new JSONArray(jSONObject.getString("data"));
                                }
                            } catch (JSONException e11) {
                                AbstractC23350e.m122776f("ChatPresenter", e11);
                            }
                            int length = jSONArray.length();
                            boolean z11 = true;
                            boolean z12 = true;
                            for (int i11 = 0; i11 < length; i11++) {
                                Object obj2 = jSONArray.get(i11);
                                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                                if (Integer.parseInt(this.f99502b) == ((Integer) obj2).intValue()) {
                                    z12 = false;
                                }
                            }
                            if (z12) {
                                if (!C20152p.this.f99496t.m114351p().contains(this.f99502b)) {
                                    C20152p.this.f99496t.m114351p().add(this.f99502b);
                                    AbstractC21935u.m114527Q(this.f99502b);
                                    z11 = false;
                                }
                                C0824j.m2153b(new C32836a(this.f99502b));
                                C18644n.m98524E();
                                ContactProfile m98552o = C20152p.this.f99497u.m98552o(this.f99502b);
                                if (m98552o != null && !z11) {
                                    String str = this.f99502b;
                                    AbstractC19646n0.m103026s0(str, AbstractC19620d0.m102692l(m98552o, str));
                                }
                            } else if (((InterfaceC20149m) C20152p.this.m103742Dp()).mo45894h0()) {
                                InterfaceC20149m interfaceC20149m = (InterfaceC20149m) C20152p.this.m103742Dp();
                                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cant_add_favorite_friend);
                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                interfaceC20149m.mo48287e0(m118743r0);
                            }
                        } else if (((InterfaceC20149m) C20152p.this.m103742Dp()).mo45894h0()) {
                            InterfaceC20149m interfaceC20149m2 = (InterfaceC20149m) C20152p.this.m103742Dp();
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            interfaceC20149m2.mo48287e0(m118743r02);
                        }
                        ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                        InterfaceC20149m interfaceC20149m3 = (InterfaceC20149m) C20152p.this.m103742Dp();
                        final C20152p c20152p = C20152p.this;
                        final String str2 = this.f99502b;
                        interfaceC20149m3.mo70710wy(new Runnable() { // from class: hw.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20152p.a.m105145d(C20152p.this, str2);
                            }
                        });
                        C20152p.this.f99499w = false;
                    } catch (Exception e12) {
                        AbstractC23350e.m122776f("ChatPresenter", e12);
                        ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                        InterfaceC20149m interfaceC20149m4 = (InterfaceC20149m) C20152p.this.m103742Dp();
                        final C20152p c20152p2 = C20152p.this;
                        final String str3 = this.f99502b;
                        interfaceC20149m4.mo70710wy(new Runnable() { // from class: hw.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20152p.a.m105145d(C20152p.this, str3);
                            }
                        });
                        C20152p.this.f99499w = false;
                    }
                } catch (Exception e13) {
                    AbstractC23350e.m122776f("ChatPresenter", e13);
                }
            } catch (Throwable th2) {
                try {
                    ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                    InterfaceC20149m interfaceC20149m5 = (InterfaceC20149m) C20152p.this.m103742Dp();
                    final C20152p c20152p3 = C20152p.this;
                    final String str4 = this.f99502b;
                    interfaceC20149m5.mo70710wy(new Runnable() { // from class: hw.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20152p.a.m105145d(C20152p.this, str4);
                        }
                    });
                    C20152p.this.f99499w = false;
                } catch (Exception e14) {
                    AbstractC23350e.m122776f("ChatPresenter", e14);
                }
                throw th2;
            }
        }
    }

    /* renamed from: hw.p$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f99504a;

        /* renamed from: b */
        final /* synthetic */ C20152p f99505b;

        b(String str, C20152p c20152p) {
            this.f99504a = str;
            this.f99505b = c20152p;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ((InterfaceC20149m) this.f99505b.m103742Dp()).mo48278Fm(this.f99504a, true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            C28203u6.f131407a.m141826y(this.f99504a, ((JSONObject) obj).getString("data"));
            C18644n.m98524E();
            InterfaceC20149m.a.m105125a((InterfaceC20149m) this.f99505b.m103742Dp(), this.f99504a, false, 2, null);
        }
    }

    /* renamed from: hw.p$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f99507b;

        /* renamed from: hw.p$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f99508a;

            a(String str) {
                this.f99508a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42415hc(this.f99508a);
            }
        }

        c(String str) {
            this.f99507b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m105147d(C20152p c20152p, String str) {
            AbstractC19074t.m100208f(c20152p, "this$0");
            AbstractC19074t.m100208f(str, "$uidFriend");
            ((InterfaceC20149m) c20152p.m103742Dp()).mo48286ca(str);
            InterfaceC20149m interfaceC20149m = (InterfaceC20149m) c20152p.m103742Dp();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_remove_from_close_friends_list);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            interfaceC20149m.mo48287e0(m118743r0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                if (((InterfaceC20149m) C20152p.this.m103742Dp()).mo45894h0()) {
                    ((InterfaceC20149m) C20152p.this.m103742Dp()).mo59032jx(AbstractC8020f0.error_message);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatPresenter", e11);
            }
            C20152p.this.f99498v = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC20149m interfaceC20149m;
            Runnable runnable;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.optInt("error_code", -999) == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (JSONException e11) {
                            AbstractC23350e.m122776f("ChatPresenter", e11);
                        }
                        int length = jSONArray.length();
                        boolean z11 = true;
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                            if (Integer.parseInt(this.f99507b) == ((Integer) obj2).intValue()) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            C20152p.this.f99496t.m114340j0(this.f99507b);
                            AbstractC21935u.m114526P(this.f99507b);
                            C0824j.m2153b(new a(this.f99507b));
                        }
                    } else if (((InterfaceC20149m) C20152p.this.m103742Dp()).mo45894h0()) {
                        ((InterfaceC20149m) C20152p.this.m103742Dp()).mo59032jx(AbstractC8020f0.error_message);
                    }
                    ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                    C18644n.m98524E();
                    interfaceC20149m = (InterfaceC20149m) C20152p.this.m103742Dp();
                    final C20152p c20152p = C20152p.this;
                    final String str = this.f99507b;
                    runnable = new Runnable() { // from class: hw.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20152p.c.m105147d(C20152p.this, str);
                        }
                    };
                } catch (Exception e12) {
                    AbstractC23350e.m122776f("ChatPresenter", e12);
                    ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                    C18644n.m98524E();
                    interfaceC20149m = (InterfaceC20149m) C20152p.this.m103742Dp();
                    final C20152p c20152p2 = C20152p.this;
                    final String str2 = this.f99507b;
                    runnable = new Runnable() { // from class: hw.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20152p.c.m105147d(C20152p.this, str2);
                        }
                    };
                }
                interfaceC20149m.mo70710wy(runnable);
                C20152p.this.f99498v = false;
            } catch (Throwable th2) {
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo49315c4();
                C18644n.m98524E();
                InterfaceC20149m interfaceC20149m2 = (InterfaceC20149m) C20152p.this.m103742Dp();
                final C20152p c20152p3 = C20152p.this;
                final String str3 = this.f99507b;
                interfaceC20149m2.mo70710wy(new Runnable() { // from class: hw.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20152p.c.m105147d(C20152p.this, str3);
                    }
                });
                C20152p.this.f99498v = false;
                throw th2;
            }
        }
    }

    /* renamed from: hw.p$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f99510b;

        /* renamed from: c */
        final /* synthetic */ boolean f99511c;

        d(ContactProfile contactProfile, boolean z11) {
            this.f99510b = contactProfile;
            this.f99511c = z11;
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
                C20152p.this.m105143Np(false);
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo78960q3();
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
                            ContactProfile contactProfile = this.f99510b;
                            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && (AbstractC25495a.m132086k(this.f99510b.f42434r) || this.f99510b.m40372J0())) {
                                InterfaceC20149m interfaceC20149m = (InterfaceC20149m) C20152p.this.m103742Dp();
                                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_error_cannot_delete_this_contact);
                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                interfaceC20149m.mo48287e0(m118743r0);
                            } else {
                                ToastUtils.m89259g(i11);
                            }
                            C19669z.f97569Q.set(false);
                            ((InterfaceC20149m) C20152p.this.m103742Dp()).mo48283Ud();
                            ((InterfaceC20149m) C20152p.this.m103742Dp()).mo78960q3();
                            InterfaceC20149m interfaceC20149m2 = (InterfaceC20149m) C20152p.this.m103742Dp();
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfriended);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            interfaceC20149m2.mo48287e0(m118743r02);
                            C20152p.this.m105143Np(false);
                            return;
                        }
                    }
                    C7960e m41971c6 = C7960e.m41971c6();
                    ContactProfile contactProfile2 = this.f99510b;
                    AbstractC19074t.m100205c(contactProfile2);
                    m41971c6.m42136Gd(contactProfile2.f42434r, false);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    String str = this.f99510b.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    c28203u6.m141827z(str, false);
                    ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f99510b.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f99510b.f42434r);
                    C18644n.m98531l().m98540I(this.f99510b.f42434r);
                    String str2 = this.f99510b.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    c28203u6.m141804B(str2, 0);
                    if (m153138j == null && m98552o != null) {
                        C7960e.m41971c6().m42221O7(m98552o, false);
                    }
                    C21927m.m114302u().m114350o0(this.f99510b.f42434r);
                    if (C7960e.m41971c6().m42096D9(this.f99510b.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        String str3 = this.f99510b.f42434r;
                        AbstractC19074t.m100207e(str3, "uid");
                        arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    if (!AbstractC25495a.m132084i(this.f99510b.f42434r) && AbstractC21935u.m114515E(this.f99510b.f42434r)) {
                        C0872f m120562A = AbstractC23306f.m120562A();
                        String str4 = this.f99510b.f42434r;
                        AbstractC19074t.m100207e(str4, "uid");
                        if (m120562A.m2529X(str4)) {
                            C7959d m41850e = C7959d.Companion.m41850e();
                            String str5 = this.f99510b.f42434r;
                            AbstractC19074t.m100207e(str5, "uid");
                            m41850e.m41774b3(str5, 2);
                        }
                    }
                    Map map = AbstractC23304d.f113421p;
                    AbstractC19074t.m100207e(map, "mapRecentClickUids");
                    ContactProfile contactProfile3 = this.f99510b;
                    synchronized (map) {
                        try {
                            if (map.containsKey(contactProfile3.f42434r)) {
                                C7960e.m41971c6().m42376e4(contactProfile3.f42434r);
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                    AbstractC21935u.m114533W(this.f99510b.f42434r, -1, "");
                    AbstractC23059e9.m118317F(this.f99510b.f42434r);
                    C21927m.m114302u().m114352p0(this.f99510b.f42434r);
                    C7960e.m41971c6().m42099Dc(this.f99510b.f42434r);
                    AbstractC0852x.m2332I(this.f99510b.f42434r);
                    if (this.f99511c) {
                        AbstractC0852x.m2355l(MainApplication.Companion.m35500c(), this.f99510b.f42455y, new SensitiveData("phonebook_delete_in_profile_card", "phonebook_delete", null, 4, null));
                    }
                    AbstractC23088h5.m118426g();
                    if (((InterfaceC20149m) C20152p.this.m103742Dp()).mo45894h0()) {
                        InterfaceC20149m interfaceC20149m3 = (InterfaceC20149m) C20152p.this.m103742Dp();
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfriended);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        interfaceC20149m3.mo48287e0(m118743r03);
                    }
                    C19669z.Companion.m103232a().m103198O0();
                    C23744a.Companion.m124119a().m124116d(6078, new Object[0]);
                    C21920f.m114270a().m114272c(this.f99510b.f42434r);
                    C21932r.f107858a.m114403j(((InterfaceC20149m) C20152p.this.m103742Dp()).mo48290k());
                } catch (Exception e11) {
                    C20152p.this.m105143Np(false);
                    AbstractC23350e.m122782l(e11.toString(), new Object[0]);
                }
                C19669z.f97569Q.set(false);
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo48283Ud();
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo78960q3();
                InterfaceC20149m interfaceC20149m4 = (InterfaceC20149m) C20152p.this.m103742Dp();
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfriended);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                interfaceC20149m4.mo48287e0(m118743r04);
                C20152p.this.m105143Np(false);
            } catch (Throwable th2) {
                C19669z.f97569Q.set(false);
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo48283Ud();
                ((InterfaceC20149m) C20152p.this.m103742Dp()).mo78960q3();
                InterfaceC20149m interfaceC20149m5 = (InterfaceC20149m) C20152p.this.m103742Dp();
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfriended);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                interfaceC20149m5.mo48287e0(m118743r05);
                C20152p.this.m105143Np(false);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20152p(InterfaceC20149m interfaceC20149m, C21927m c21927m, C18644n c18644n) {
        super(interfaceC20149m);
        AbstractC19074t.m100208f(interfaceC20149m, "mvpView");
        AbstractC19074t.m100208f(c21927m, "friendManager");
        AbstractC19074t.m100208f(c18644n, "zaloFriendManager");
        this.f99496t = c21927m;
        this.f99497u = c18644n;
    }

    @Override // p219hw.InterfaceC20148l
    /* renamed from: B0 */
    public void mo105121B0(ContactProfile contactProfile, boolean z11) {
        if (this.f99500x) {
            return;
        }
        ((InterfaceC20149m) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(contactProfile, z11));
        this.f99500x = true;
        AbstractC19074t.m100205c(contactProfile);
        c0766k.mo1791z6(contactProfile.f42434r, -1);
    }

    @Override // p219hw.InterfaceC20148l
    /* renamed from: Eg */
    public void mo105122Eg(String str) {
        AbstractC19074t.m100208f(str, "uidFriend");
        if (this.f99499w) {
            return;
        }
        ((InterfaceC20149m) m103742Dp()).mo46829Y();
        try {
            if (str.length() > 0 && this.f99496t.m114351p() != null && !this.f99496t.m114351p().contains(str) && this.f99496t.m114351p().size() >= AbstractC23309i.m121115K8()) {
                ((InterfaceC20149m) m103742Dp()).mo49315c4();
                ((InterfaceC20149m) m103742Dp()).mo48286ca(str);
                InterfaceC20149m interfaceC20149m = (InterfaceC20149m) m103742Dp();
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_limit_favorite_list);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC23309i.m121115K8())}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                interfaceC20149m.mo78936E(format);
                return;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPresenter", e11);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(str));
        this.f99499w = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        c0766k.mo1653h8(arrayList);
    }

    /* renamed from: Np */
    public final void m105143Np(boolean z11) {
        this.f99500x = z11;
    }

    @Override // p219hw.InterfaceC20148l
    /* renamed from: un */
    public void mo105123un(String str) {
        AbstractC19074t.m100208f(str, "uidFriend");
        if (this.f99498v) {
            return;
        }
        ((InterfaceC20149m) m103742Dp()).mo46829Y();
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPresenter", e11);
        }
        if (str.length() != 0) {
            if (this.f99496t.m114351p() != null) {
                if (!this.f99496t.m114351p().contains(str)) {
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c(str));
                this.f99498v = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                c0766k.mo1563W5(arrayList);
                return;
            }
        }
        ((InterfaceC20149m) m103742Dp()).mo49315c4();
    }

    @Override // p219hw.InterfaceC20148l
    /* renamed from: x0 */
    public void mo105124x0(String str) {
        AbstractC19074t.m100208f(str, "userId");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(str, this));
        c0766k.mo1771x0(str);
    }
}
