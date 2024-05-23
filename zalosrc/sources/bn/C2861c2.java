package bn;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.os.Bundle;
import bn.C2861c2;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import org.json.JSONObject;
import p142ey.C18644n;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C32002l4;
import vg.C28203u6;

/* renamed from: bn.c2 */
/* loaded from: classes3.dex */
public class C2861c2 implements InterfaceC17463d.d {

    /* renamed from: p */
    InterfaceC27218a f11402p;

    /* renamed from: q */
    ContactProfile f11403q;

    /* renamed from: r */
    boolean f11404r = false;

    /* renamed from: s */
    public String f11405s = "";

    /* renamed from: t */
    boolean f11406t = false;

    /* renamed from: u */
    InterfaceC0765j f11407u = new C0766k();

    /* renamed from: v */
    boolean f11408v = false;

    /* renamed from: w */
    InterfaceC0765j f11409w = new C0766k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bn.c2$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f11410a;

        a(ContactProfile contactProfile) {
            this.f11410a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m13791d(Bundle bundle) {
            C2861c2.this.f11402p.mo35573l4(WriteInvitationView.class, bundle, 1, true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            C2861c2.this.m13786d();
            C2861c2.this.f11404r = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && !jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.isNull("isRequested")) {
                        i11 = 0;
                    } else {
                        i11 = jSONObject2.getInt("isRequested");
                    }
                    if (jSONObject2.isNull("isFriend")) {
                        i12 = 0;
                    } else {
                        i12 = jSONObject2.getInt("isFriend");
                    }
                    if (jSONObject2.isNull("isRequesting")) {
                        i13 = 0;
                    } else {
                        i13 = jSONObject2.getInt("isRequesting");
                    }
                    int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                    int optInt2 = jSONObject2.optInt("ranking", 0);
                    if (optInt == 1) {
                        if (i11 == 0 && i13 == 0) {
                            if (i12 == 0) {
                                if (!AbstractC21935u.m114558y(this.f11410a.f42434r)) {
                                    final Bundle bundle = new Bundle();
                                    bundle.putString("uid", this.f11410a.f42434r);
                                    bundle.putString("dpn", this.f11410a.f42437s);
                                    bundle.putString("avatar", this.f11410a.f42446v);
                                    bundle.putString("phone", this.f11410a.f42455y);
                                    InterfaceC27218a interfaceC27218a = C2861c2.this.f11402p;
                                    if (interfaceC27218a != null) {
                                        interfaceC27218a.runOnUiThread(new Runnable() { // from class: bn.b2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C2861c2.a.this.m13791d(bundle);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                AbstractC23059e9.m118317F(this.f11410a.f42434r);
                                AbstractC21935u.m114533W(this.f11410a.f42434r, 3, "");
                                return;
                            }
                            if (i12 == 1) {
                                ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                AbstractC23059e9.m118317F(this.f11410a.f42434r);
                                AbstractC21935u.m114533W(this.f11410a.f42434r, 3, "");
                                if (!AbstractC21935u.m114558y(this.f11410a.f42434r)) {
                                    C2861c2.this.m13789h(this.f11410a.f42434r);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i13 != 0) {
                            ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(this.f11410a.f42434r);
                            if (mo98491j != null) {
                                mo98491j.f42369Q = optInt2;
                            }
                            C7960e.m41971c6().m42566vd(this.f11410a.f42434r, optInt2);
                            if (AbstractC23063f2.m118361m(this.f11410a.f42434r)) {
                                C2861c2.this.m13784b(this.f11410a.f42434r);
                                return;
                            }
                            new C19171b().m101508a(new C19171b.a(C2861c2.this.f11402p, new C26365a.b(this.f11410a.f42434r, C32002l4.m154265h(0, 8)).m135743b(), 0, 1));
                            return;
                        }
                        if (i11 != 0) {
                            ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                            AbstractC23059e9.m118317F(this.f11410a.f42434r);
                            AbstractC21935u.m114533W(this.f11410a.f42434r, 3, "");
                            return;
                        }
                        return;
                    }
                    if (optInt < 0) {
                        if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                            InterfaceC27218a interfaceC27218a2 = C2861c2.this.f11402p;
                            if (interfaceC27218a2 != null && !AbstractC23216t1.m119641f(interfaceC27218a2.mo35579p().m93012K0(), optInt, false)) {
                                ToastUtils.m89259g(optInt);
                                return;
                            }
                            return;
                        }
                        C2861c2.this.f11405s = AbstractC23161o1.m119317b(optInt);
                        ToastUtils.showMess(C2861c2.this.f11405s);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bn.c2$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: bn.c2$b$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f11413a;

            a(ContactProfile contactProfile) {
                this.f11413a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f11413a.f42434r);
            }
        }

        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bn.c2$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f11415a;

        c(String str) {
            this.f11415a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89270r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C2861c2.this.m13786d();
                C2861c2.this.f11408v = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            AbstractC21935u.m114533W(this.f11415a, 3, "");
                        } else {
                            InterfaceC27218a interfaceC27218a = C2861c2.this.f11402p;
                            if (interfaceC27218a != null && !AbstractC23216t1.m119641f(interfaceC27218a.mo35579p().m93012K0(), i11, true)) {
                                ToastUtils.m89259g(i11);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C2861c2.this.m13786d();
                C2861c2.this.f11408v = false;
            } catch (Throwable th2) {
                C2861c2.this.m13786d();
                C2861c2.this.f11408v = false;
                throw th2;
            }
        }
    }

    public C2861c2(InterfaceC27218a interfaceC27218a, ContactProfile contactProfile) {
        this.f11402p = interfaceC27218a;
        this.f11403q = contactProfile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m13783f(BaseZaloView baseZaloView) {
        baseZaloView.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 == -1) {
            m13787e(this.f11403q);
        }
        interfaceC17463d.dismiss();
    }

    /* renamed from: b */
    public void m13784b(String str) {
        if (this.f11408v) {
            return;
        }
        m13788g();
        this.f11408v = true;
        this.f11409w.mo1704o8(new c(str));
        this.f11409w.mo1497O3(str);
    }

    /* renamed from: c */
    public KeyEventCallbackC17462c m13785c() {
        try {
            Context mo35575n1 = this.f11402p.mo35575n1();
            if (mo35575n1 == null && this.f11402p.getContext() != null) {
                mo35575n1 = this.f11402p.getContext();
            }
            return AbstractC23093i.m118456i(mo35575n1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_stranger_unsupport_title), AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_stranger_unsupport_new), AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_stranger_unsupport_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_imp_alias_stranger_unsupport_no), this, this);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public void m13786d() {
        Object obj = this.f11402p;
        if (obj instanceof BaseZaloView) {
            ((BaseZaloView) obj).mo78960q3();
        }
    }

    /* renamed from: e */
    public void m13787e(ContactProfile contactProfile) {
        if (this.f11404r || !AbstractC23138m0.m118770b()) {
            return;
        }
        m13788g();
        this.f11404r = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(contactProfile));
        c0766k.mo1615ca(contactProfile.f42434r);
    }

    /* renamed from: g */
    public void m13788g() {
        Object obj = this.f11402p;
        if (obj instanceof BaseZaloView) {
            final BaseZaloView baseZaloView = (BaseZaloView) obj;
            baseZaloView.mo70710wy(new Runnable() { // from class: bn.a2
                @Override // java.lang.Runnable
                public final void run() {
                    C2861c2.m13783f(BaseZaloView.this);
                }
            });
        }
    }

    /* renamed from: h */
    public void m13789h(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1022));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
