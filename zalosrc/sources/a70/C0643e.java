package a70;

import a70.C0643e;
import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23138m0;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19966e;
import p304ks.AbstractC21935u;
import p304ks.C21927m;

/* renamed from: a70.e */
/* loaded from: classes5.dex */
public final class C0643e extends AbstractC19962a implements InterfaceC19966e {

    /* renamed from: t */
    private ContactProfile f2168t;

    /* renamed from: u */
    private boolean f2169u;

    /* renamed from: v */
    private String f2170v;

    /* renamed from: a70.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a70.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32615a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f2172a;

            C32615a(ContactProfile contactProfile) {
                this.f2172a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f2172a.f42434r);
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m925d(C0643e c0643e) {
            AbstractC19074t.m100208f(c0643e, "this$0");
            ((InterfaceC0641c) c0643e.m103742Dp()).mo917cr(AbstractC8020f0.str_hint_alreadyFriend);
            ContactProfile m920Jp = c0643e.m920Jp();
            if (m920Jp != null && !AbstractC21935u.m114558y(m920Jp.f42434r)) {
                m920Jp.f42330D = 0L;
                C18644n.m98531l().m98543e(m920Jp);
                C0824j.m2153b(new C32615a(m920Jp));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C0643e.this.m922Mp(false);
            ((InterfaceC0641c) C0643e.this.m103742Dp()).mo49315c4();
            ((InterfaceC0641c) C0643e.this.m103742Dp()).mo917cr(AbstractC8020f0.error_message);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            AbstractC19074t.m100208f(obj, "entity");
            C0643e.this.m922Mp(false);
            ((InterfaceC0641c) C0643e.this.m103742Dp()).mo49315c4();
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.isNull("data")) {
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
                            if (i12 != 0) {
                                if (i12 == 1) {
                                    InterfaceC0641c interfaceC0641c = (InterfaceC0641c) C0643e.this.m103742Dp();
                                    final C0643e c0643e = C0643e.this;
                                    interfaceC0641c.mo70710wy(new Runnable() { // from class: a70.d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C0643e.a.m925d(C0643e.this);
                                        }
                                    });
                                    ContactProfile m920Jp = C0643e.this.m920Jp();
                                    AbstractC19074t.m100205c(m920Jp);
                                    AbstractC23074g2.m118375a(0, m920Jp.f42434r, "", 5);
                                    return;
                                }
                                return;
                            }
                            ContactProfile m920Jp2 = C0643e.this.m920Jp();
                            AbstractC19074t.m100205c(m920Jp2);
                            if (!AbstractC21935u.m114558y(m920Jp2.f42434r)) {
                                ContactProfile m920Jp3 = C0643e.this.m920Jp();
                                AbstractC19074t.m100205c(m920Jp3);
                                TrackingSource trackingSource = new TrackingSource(m920Jp3.f42373R0);
                                trackingSource.m40677a("sourceView", 22);
                                C21927m m114302u = C21927m.m114302u();
                                ContactProfile m920Jp4 = C0643e.this.m920Jp();
                                AbstractC19074t.m100205c(m920Jp4);
                                m114302u.m114330e0(m920Jp4.f42434r, trackingSource);
                                Bundle bundle = new Bundle();
                                ContactProfile m920Jp5 = C0643e.this.m920Jp();
                                AbstractC19074t.m100205c(m920Jp5);
                                bundle.putString("uid", m920Jp5.f42434r);
                                ContactProfile m920Jp6 = C0643e.this.m920Jp();
                                AbstractC19074t.m100205c(m920Jp6);
                                bundle.putString("dpn", m920Jp6.f42437s);
                                ContactProfile m920Jp7 = C0643e.this.m920Jp();
                                AbstractC19074t.m100205c(m920Jp7);
                                bundle.putString("avatar", m920Jp7.f42446v);
                                ContactProfile m920Jp8 = C0643e.this.m920Jp();
                                AbstractC19074t.m100205c(m920Jp8);
                                bundle.putString("phone", m920Jp8.f42455y);
                                ((InterfaceC0641c) C0643e.this.m103742Dp()).mo916Rz(2, bundle);
                                return;
                            }
                            ((InterfaceC0641c) C0643e.this.m103742Dp()).mo917cr(AbstractC8020f0.str_hint_alreadyFriend);
                            ((InterfaceC0641c) C0643e.this.m103742Dp()).sendEmptyMessageDelayed(1, 0L);
                            ContactProfile m920Jp9 = C0643e.this.m920Jp();
                            AbstractC19074t.m100205c(m920Jp9);
                            AbstractC23074g2.m118375a(0, m920Jp9.f42434r, "", 5);
                            return;
                        }
                        if (i13 != 0) {
                            C18635e m118350b = AbstractC23063f2.m118350b(false);
                            ContactProfile m920Jp10 = C0643e.this.m920Jp();
                            AbstractC19074t.m100205c(m920Jp10);
                            ContactProfile mo98491j = m118350b.mo98491j(m920Jp10.f42434r);
                            if (mo98491j != null) {
                                mo98491j.f42369Q = optInt2;
                            }
                            C7960e m41971c6 = C7960e.m41971c6();
                            ContactProfile m920Jp11 = C0643e.this.m920Jp();
                            AbstractC19074t.m100205c(m920Jp11);
                            m41971c6.m42566vd(m920Jp11.f42434r, optInt2);
                            InterfaceC0641c interfaceC0641c2 = (InterfaceC0641c) C0643e.this.m103742Dp();
                            ContactProfile m920Jp12 = C0643e.this.m920Jp();
                            AbstractC19074t.m100205c(m920Jp12);
                            interfaceC0641c2.mo916Rz(3, m920Jp12);
                            return;
                        }
                        if (i11 != 0) {
                            AbstractC23063f2.m118349a(C0643e.this.m920Jp());
                            ((InterfaceC0641c) C0643e.this.m103742Dp()).mo917cr(AbstractC8020f0.str_already_send_friend_request_new);
                            ContactProfile m920Jp13 = C0643e.this.m920Jp();
                            AbstractC19074t.m100205c(m920Jp13);
                            AbstractC23074g2.m118375a(0, m920Jp13.f42434r, "", 5);
                            return;
                        }
                        return;
                    }
                    if (optInt < 0) {
                        switch (optInt) {
                            case -44:
                            case -43:
                            case -42:
                            case -41:
                            case -40:
                                C0643e c0643e2 = C0643e.this;
                                String m119317b = AbstractC23161o1.m119317b(optInt);
                                AbstractC19074t.m100207e(m119317b, "getErrorDialogFriendRequest(...)");
                                c0643e2.m923Np(m119317b);
                                if (!TextUtils.isEmpty(C0643e.this.m919Ip())) {
                                    ToastUtils.showMess(C0643e.this.m919Ip());
                                    return;
                                }
                                return;
                            default:
                                if (!AbstractC23216t1.m119641f(((InterfaceC0641c) C0643e.this.m103742Dp()).mo918k(), optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                    return;
                                }
                                return;
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643e(InterfaceC0641c interfaceC0641c) {
        super(interfaceC0641c);
        AbstractC19074t.m100208f(interfaceC0641c, "mvpView");
        this.f2170v = "";
    }

    /* renamed from: Ip */
    public final String m919Ip() {
        return this.f2170v;
    }

    /* renamed from: Jp */
    public final ContactProfile m920Jp() {
        return this.f2168t;
    }

    /* renamed from: Kp */
    public void m921Kp(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profile");
        if (this.f2169u || !AbstractC23138m0.Companion.m118777d()) {
            return;
        }
        ((InterfaceC0641c) m103742Dp()).mo46829Y();
        this.f2169u = true;
        this.f2168t = contactProfile;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a());
        c0766k.mo1615ca(contactProfile.f42434r);
    }

    /* renamed from: Mp */
    public final void m922Mp(boolean z11) {
        this.f2169u = z11;
    }

    /* renamed from: Np */
    public final void m923Np(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f2170v = str;
    }
}
