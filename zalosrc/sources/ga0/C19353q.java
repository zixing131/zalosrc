package ga0;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import ai.InterfaceC0861a;
import am.AbstractC0939u;
import android.os.Bundle;
import android.text.TextUtils;
import ap0.C2279a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.AcceptFriendView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19051f0;
import ga0.C19353q;
import gg0.AbstractC19444a;
import ha0.C19955h;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.C23024b7;
import me0.C23055e5;
import me0.C23139m1;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18644n;
import p207he.C20024r;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p612wk.AbstractC29069a;
import p716zh.C32002l4;
import t00.C26446c;
import tk.InterfaceC26722a;
import vg.C28203u6;

/* renamed from: ga0.q */
/* loaded from: classes6.dex */
public final class C19353q extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final String f96120s;

    /* renamed from: t */
    private final InterfaceC26722a f96121t;

    /* renamed from: u */
    private final AbstractC29069a.p f96122u;

    /* renamed from: v */
    private final int f96123v;

    /* renamed from: w */
    private final boolean f96124w;

    /* renamed from: x */
    private InterfaceC0765j f96125x;

    /* renamed from: y */
    private InterfaceC0765j f96126y;

    /* renamed from: ga0.q$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ga0.q$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19325g1 f96127a;

        /* renamed from: b */
        final /* synthetic */ C19353q f96128b;

        /* renamed from: c */
        final /* synthetic */ String f96129c;

        /* renamed from: d */
        final /* synthetic */ ContactProfile f96130d;

        b(C19325g1 c19325g1, C19353q c19353q, String str, ContactProfile contactProfile) {
            this.f96127a = c19325g1;
            this.f96128b = c19353q;
            this.f96129c = str;
            this.f96130d = contactProfile;
        }

        /* renamed from: g */
        public static final void m101409g(int i11, String str, C19325g1 c19325g1, C19353q c19353q, ContactProfile contactProfile) {
            ZaloView zaloView;
            AbstractC19074t.m100208f(str, "$uidToProcess");
            AbstractC19074t.m100208f(c19325g1, "$searchSessionData");
            AbstractC19074t.m100208f(c19353q, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$profile");
            if (i11 == 0) {
                AbstractC21935u.m114533W(str, 3, "");
                c19325g1.m101178D0(str);
                InterfaceC18319c m101438e = c19353q.m101438e();
                if (m101438e != null) {
                    return;
                }
                return;
            }
            Object m101438e2 = c19353q.m101438e();
            if (m101438e2 instanceof ZaloView) {
                zaloView = (ZaloView) m101438e2;
            } else {
                zaloView = null;
            }
            if (!AbstractC23216t1.m119641f(zaloView, i11, true)) {
                ToastUtils.m89259g(i11);
            }
        }

        /* renamed from: h */
        public static final void m101410h(C19353q c19353q) {
            AbstractC19074t.m100208f(c19353q, "this$0");
            try {
                InterfaceC18319c m101438e = c19353q.m101438e();
                if (m101438e != null) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: i */
        public static final void m101411i(C19353q c19353q) {
            AbstractC19074t.m100208f(c19353q, "this$0");
            InterfaceC18319c m101438e = c19353q.m101438e();
            if (m101438e != null) {
            }
        }

        /* renamed from: j */
        public static final void m101412j(C19325g1 c19325g1, C19353q c19353q) {
            InterfaceC18319c m101438e;
            C18316b c18316b;
            AbstractC19074t.m100208f(c19325g1, "$searchSessionData");
            AbstractC19074t.m100208f(c19353q, "this$0");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestFail));
                    c19325g1.m101197W(false);
                    m101438e = c19353q.m101438e();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    c19325g1.m101197W(false);
                    m101438e = c19353q.m101438e();
                    if (m101438e != null) {
                        c18316b = new C18316b("ACTION_DISMISS_LOADING_VIEW", null, null, null, 14, null);
                    } else {
                        return;
                    }
                }
                if (m101438e != null) {
                    c18316b = new C18316b("ACTION_DISMISS_LOADING_VIEW", null, null, null, 14, null);
                }
            } catch (Throwable th2) {
                c19325g1.m101197W(false);
                InterfaceC18319c m101438e2 = c19353q.m101438e();
                if (m101438e2 != null) {
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.u

                /* renamed from: q */
                public final /* synthetic */ C19353q f96172q;

                public /* synthetic */ RunnableC19363u(C19353q c19353q) {
                    r2 = c19353q;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19353q.b.m101412j(C19325g1.this, r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            RunnableC19361t runnableC19361t;
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        AbstractC19444a.m101695c(new Runnable() { // from class: ga0.r

                            /* renamed from: p */
                            public final /* synthetic */ int f96147p;

                            /* renamed from: q */
                            public final /* synthetic */ String f96148q;

                            /* renamed from: r */
                            public final /* synthetic */ C19325g1 f96149r;

                            /* renamed from: s */
                            public final /* synthetic */ C19353q f96150s;

                            /* renamed from: t */
                            public final /* synthetic */ ContactProfile f96151t;

                            public /* synthetic */ RunnableC19356r(int i11, String str, C19325g1 c19325g1, C19353q c19353q, ContactProfile contactProfile) {
                                r1 = i11;
                                r2 = str;
                                r3 = c19325g1;
                                r4 = c19353q;
                                r5 = contactProfile;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C19353q.b.m101409g(r1, r2, r3, r4, r5);
                            }
                        });
                    }
                    this.f96127a.m101197W(false);
                    AbstractC19444a.m101695c(new Runnable() { // from class: ga0.s
                        public /* synthetic */ RunnableC19359s() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19353q.b.m101410h(C19353q.this);
                        }
                    });
                    runnableC19361t = new Runnable() { // from class: ga0.t
                        public /* synthetic */ RunnableC19361t() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19353q.b.m101411i(C19353q.this);
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    this.f96127a.m101197W(false);
                    AbstractC19444a.m101695c(new Runnable() { // from class: ga0.s
                        public /* synthetic */ RunnableC19359s() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19353q.b.m101410h(C19353q.this);
                        }
                    });
                    runnableC19361t = new Runnable() { // from class: ga0.t
                        public /* synthetic */ RunnableC19361t() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19353q.b.m101411i(C19353q.this);
                        }
                    };
                }
                AbstractC19444a.m101694b(runnableC19361t, 300L);
            } catch (Throwable th2) {
                this.f96127a.m101197W(false);
                AbstractC19444a.m101695c(new Runnable() { // from class: ga0.s
                    public /* synthetic */ RunnableC19359s() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19353q.b.m101410h(C19353q.this);
                    }
                });
                AbstractC19444a.m101694b(new Runnable() { // from class: ga0.t
                    public /* synthetic */ RunnableC19361t() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19353q.b.m101411i(C19353q.this);
                    }
                }, 300L);
                throw th2;
            }
        }
    }

    /* renamed from: ga0.q$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19325g1 f96131a;

        /* renamed from: b */
        final /* synthetic */ C19353q f96132b;

        /* renamed from: c */
        final /* synthetic */ String f96133c;

        /* renamed from: d */
        final /* synthetic */ ContactProfile f96134d;

        c(C19325g1 c19325g1, C19353q c19353q, String str, ContactProfile contactProfile) {
            this.f96131a = c19325g1;
            this.f96132b = c19353q;
            this.f96133c = str;
            this.f96134d = contactProfile;
        }

        /* renamed from: f */
        public static final void m101416f(int i11, int i12, int i13, int i14, String str, C19353q c19353q, ContactProfile contactProfile, C19325g1 c19325g1, C19051f0 c19051f0, int i15) {
            AbstractC19074t.m100208f(str, "$userId");
            AbstractC19074t.m100208f(c19353q, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$profile");
            AbstractC19074t.m100208f(c19325g1, "$searchSessionData");
            AbstractC19074t.m100208f(c19051f0, "$needDismissLoading");
            if (i11 != 1) {
                if (i11 < 0) {
                    switch (i11) {
                        case -44:
                        case -43:
                        case -42:
                        case -41:
                        case -40:
                            String m119317b = AbstractC23161o1.m119317b(i11);
                            AbstractC19074t.m100207e(m119317b, "getErrorDialogFriendRequest(...)");
                            c19325g1.m101222k0(m119317b);
                            InterfaceC18319c m101438e = c19353q.m101438e();
                            if (m101438e != null) {
                                return;
                            }
                            return;
                        default:
                            Object m101438e2 = c19353q.m101438e();
                            if (AbstractC23216t1.m119641f(m101438e2 instanceof ZaloView ? (ZaloView) m101438e2 : null, i11, false)) {
                                return;
                            }
                            ToastUtils.m89259g(i11);
                            return;
                    }
                }
                return;
            }
            if (i12 != 0 || i13 != 0) {
                c19325g1.m101224l0(str);
                if (i13 == 0) {
                    if (i12 != 0) {
                        AbstractC23063f2.m118349a(C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null));
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                        AbstractC23059e9.m118317F(str);
                        AbstractC21935u.m114533W(str, 3, "");
                        c19325g1.m101178D0(str);
                        return;
                    }
                    return;
                }
                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(str);
                if (mo98491j != null) {
                    mo98491j.f42369Q = i15;
                }
                C7960e.m41971c6().m42566vd(str, i15);
                InterfaceC18319c m101438e3 = c19353q.m101438e();
                if (m101438e3 != null) {
                    return;
                }
                return;
            }
            if (i14 != 0) {
                if (i14 != 1) {
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                AbstractC23059e9.m118317F(str);
                c19325g1.m101178D0(str);
                AbstractC21935u.m114533W(str, 3, "");
                if (AbstractC21935u.m114558y(str)) {
                    return;
                }
                c19353q.m101403y(str);
                return;
            }
            if (!C18644n.m98531l().m98558u(str)) {
                Object m101438e4 = c19353q.m101438e();
                ZaloView zaloView = m101438e4 instanceof BaseZaloView ? (BaseZaloView) m101438e4 : null;
                if (zaloView != null && AbstractC21935u.m114553t(3)) {
                    TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
                    trackingSource.m40677a("sourceView", 11);
                    C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                    Bundle bundle = new Bundle();
                    bundle.putString("uid", contactProfile.f42434r);
                    bundle.putString("dpn", contactProfile.f42437s);
                    bundle.putString("phone", contactProfile.f42455y);
                    bundle.putString("avatar", contactProfile.f42446v);
                    InterfaceC27218a m92676n2 = zaloView.m92676n2();
                    if (m92676n2 != null) {
                        m92676n2.mo35581q(WriteInvitationView.class, bundle, 1085, 1, true);
                        return;
                    }
                    return;
                }
                c19353q.m101402x(c19325g1, contactProfile);
                c19051f0.f94928p = false;
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
            AbstractC23059e9.m118317F(str);
            c19325g1.m101178D0(str);
            AbstractC21935u.m114533W(str, 3, "");
        }

        /* renamed from: g */
        public static final void m101417g(C19051f0 c19051f0, C19353q c19353q) {
            InterfaceC18319c m101438e;
            AbstractC19074t.m100208f(c19051f0, "$needDismissLoading");
            AbstractC19074t.m100208f(c19353q, "this$0");
            if (c19051f0.f94928p && (m101438e = c19353q.m101438e()) != null) {
            }
            InterfaceC18319c m101438e2 = c19353q.m101438e();
            if (m101438e2 != null) {
            }
        }

        /* renamed from: h */
        public static final void m101418h(C19325g1 c19325g1, C19353q c19353q) {
            InterfaceC18319c m101438e;
            C18316b c18316b;
            AbstractC19074t.m100208f(c19325g1, "$searchSessionData");
            AbstractC19074t.m100208f(c19353q, "this$0");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    c19325g1.m101212f0(false);
                    m101438e = c19353q.m101438e();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    c19325g1.m101212f0(false);
                    m101438e = c19353q.m101438e();
                    if (m101438e != null) {
                        c18316b = new C18316b("ACTION_DISMISS_LOADING_VIEW", null, null, null, 14, null);
                    } else {
                        return;
                    }
                }
                if (m101438e != null) {
                    c18316b = new C18316b("ACTION_DISMISS_LOADING_VIEW", null, null, null, 14, null);
                }
            } catch (Throwable th2) {
                c19325g1.m101212f0(false);
                InterfaceC18319c m101438e2 = c19353q.m101438e();
                if (m101438e2 != null) {
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.x

                /* renamed from: q */
                public final /* synthetic */ C19353q f96196q;

                public /* synthetic */ RunnableC19369x(C19353q c19353q) {
                    r2 = c19353q;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19353q.c.m101418h(C19325g1.this, r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            RunnableC19367w runnableC19367w;
            int i11;
            int i12;
            int i13;
            AbstractC19074t.m100208f(obj, "entity");
            C19051f0 c19051f0 = new C19051f0();
            c19051f0.f94928p = true;
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
                    z11 = false;
                    try {
                        try {
                            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.v

                                /* renamed from: p */
                                public final /* synthetic */ int f96175p;

                                /* renamed from: q */
                                public final /* synthetic */ int f96176q;

                                /* renamed from: r */
                                public final /* synthetic */ int f96177r;

                                /* renamed from: s */
                                public final /* synthetic */ int f96178s;

                                /* renamed from: t */
                                public final /* synthetic */ String f96179t;

                                /* renamed from: u */
                                public final /* synthetic */ C19353q f96180u;

                                /* renamed from: v */
                                public final /* synthetic */ ContactProfile f96181v;

                                /* renamed from: w */
                                public final /* synthetic */ C19325g1 f96182w;

                                /* renamed from: x */
                                public final /* synthetic */ C19051f0 f96183x;

                                /* renamed from: y */
                                public final /* synthetic */ int f96184y;

                                public /* synthetic */ RunnableC19365v(int i14, int i112, int i132, int i122, String str, C19353q c19353q, ContactProfile contactProfile, C19325g1 c19325g1, C19051f0 c19051f02, int i15) {
                                    r1 = i14;
                                    r2 = i112;
                                    r3 = i132;
                                    r4 = i122;
                                    r5 = str;
                                    r6 = c19353q;
                                    r7 = contactProfile;
                                    r8 = c19325g1;
                                    r9 = c19051f02;
                                    r10 = i15;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C19353q.c.m101416f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
                                }
                            });
                        } catch (Throwable th2) {
                            th = th2;
                            this.f96131a.m101212f0(z11);
                            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.w

                                /* renamed from: q */
                                public final /* synthetic */ C19353q f96193q;

                                public /* synthetic */ RunnableC19367w(C19353q c19353q) {
                                    r2 = c19353q;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C19353q.c.m101417g(C19051f0.this, r2);
                                }
                            });
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                        this.f96131a.m101212f0(z11);
                        runnableC19367w = new Runnable() { // from class: ga0.w

                            /* renamed from: q */
                            public final /* synthetic */ C19353q f96193q;

                            public /* synthetic */ RunnableC19367w(C19353q c19353q) {
                                r2 = c19353q;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C19353q.c.m101417g(C19051f0.this, r2);
                            }
                        };
                        AbstractC19444a.m101695c(runnableC19367w);
                    }
                } else {
                    z11 = false;
                }
                this.f96131a.m101212f0(z11);
                runnableC19367w = new Runnable() { // from class: ga0.w

                    /* renamed from: q */
                    public final /* synthetic */ C19353q f96193q;

                    public /* synthetic */ RunnableC19367w(C19353q c19353q) {
                        r2 = c19353q;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19353q.c.m101417g(C19051f0.this, r2);
                    }
                };
            } catch (Exception e12) {
                e = e12;
                z11 = false;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
                this.f96131a.m101212f0(z11);
                AbstractC19444a.m101695c(new Runnable() { // from class: ga0.w

                    /* renamed from: q */
                    public final /* synthetic */ C19353q f96193q;

                    public /* synthetic */ RunnableC19367w(C19353q c19353q) {
                        r2 = c19353q;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19353q.c.m101417g(C19051f0.this, r2);
                    }
                });
                throw th;
            }
            AbstractC19444a.m101695c(runnableC19367w);
        }
    }

    /* renamed from: ga0.q$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19325g1 f96135a;

        /* renamed from: b */
        final /* synthetic */ C19353q f96136b;

        /* renamed from: c */
        final /* synthetic */ String f96137c;

        /* renamed from: d */
        final /* synthetic */ ContactProfile f96138d;

        d(C19325g1 c19325g1, C19353q c19353q, String str, ContactProfile contactProfile) {
            this.f96135a = c19325g1;
            this.f96136b = c19353q;
            this.f96137c = str;
            this.f96138d = contactProfile;
        }

        /* renamed from: e */
        public static final void m101421e(C19353q c19353q) {
            AbstractC19074t.m100208f(c19353q, "this$0");
            try {
                InterfaceC18319c m101438e = c19353q.m101438e();
                if (m101438e != null) {
                }
                InterfaceC18319c m101438e2 = c19353q.m101438e();
                if (m101438e2 != null) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public static final void m101422f(C19325g1 c19325g1, C19353q c19353q) {
            InterfaceC18319c m101438e;
            C18316b c18316b;
            AbstractC19074t.m100208f(c19325g1, "$searchSessionData");
            AbstractC19074t.m100208f(c19353q, "this$0");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                    c19325g1.m101172A0(false);
                    m101438e = c19353q.m101438e();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    c19325g1.m101172A0(false);
                    m101438e = c19353q.m101438e();
                    if (m101438e != null) {
                        c18316b = new C18316b("ACTION_DISMISS_LOADING_VIEW", null, null, null, 14, null);
                    } else {
                        return;
                    }
                }
                if (m101438e != null) {
                    c18316b = new C18316b("ACTION_DISMISS_LOADING_VIEW", null, null, null, 14, null);
                }
            } catch (Throwable th2) {
                c19325g1.m101172A0(false);
                InterfaceC18319c m101438e2 = c19353q.m101438e();
                if (m101438e2 != null) {
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.y

                /* renamed from: q */
                public final /* synthetic */ C19353q f96199q;

                public /* synthetic */ RunnableC19371y(C19353q c19353q) {
                    r2 = c19353q;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19353q.d.m101422f(C19325g1.this, r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            RunnableC19373z runnableC19373z;
            JSONObject jSONObject;
            ZaloView zaloView;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(this.f96137c);
                            AbstractC21935u.m114533W(this.f96137c, 3, "");
                            this.f96135a.m101178D0(this.f96137c);
                            AbstractC23063f2.m118349a(this.f96138d);
                        } else {
                            AbstractC23063f2.m118357i(i11, this.f96138d.f42434r);
                            switch (i11) {
                                case -44:
                                case -43:
                                case -42:
                                case -41:
                                case -40:
                                    C19325g1 c19325g1 = this.f96135a;
                                    String m119317b = AbstractC23161o1.m119317b(i11);
                                    AbstractC19074t.m100207e(m119317b, "getErrorDialogFriendRequest(...)");
                                    c19325g1.m101222k0(m119317b);
                                    InterfaceC18319c m101438e = this.f96136b.m101438e();
                                    if (m101438e != null) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object m101438e2 = this.f96136b.m101438e();
                                    if (m101438e2 instanceof ZaloView) {
                                        zaloView = (ZaloView) m101438e2;
                                    } else {
                                        zaloView = null;
                                    }
                                    if (!AbstractC23216t1.m119641f(zaloView, i11, false)) {
                                        ToastUtils.m89259g(i11);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    this.f96135a.m101172A0(false);
                    runnableC19373z = new Runnable() { // from class: ga0.z
                        public /* synthetic */ RunnableC19373z() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19353q.d.m101421e(C19353q.this);
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    this.f96135a.m101172A0(false);
                    runnableC19373z = new Runnable() { // from class: ga0.z
                        public /* synthetic */ RunnableC19373z() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19353q.d.m101421e(C19353q.this);
                        }
                    };
                }
                AbstractC19444a.m101695c(runnableC19373z);
            } catch (Throwable th2) {
                this.f96135a.m101172A0(false);
                AbstractC19444a.m101695c(new Runnable() { // from class: ga0.z
                    public /* synthetic */ RunnableC19373z() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19353q.d.m101421e(C19353q.this);
                    }
                });
                throw th2;
            }
        }
    }

    /* renamed from: ga0.q$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: ga0.q$e$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f96139a;

            a(ContactProfile contactProfile) {
                this.f96139a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f96139a.f42434r);
            }
        }

        e() {
        }

        /* renamed from: e */
        public static final void m101425e(Object obj) {
            AbstractC19074t.m100208f(obj, "$entity");
            try {
                ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                C18644n.m98531l().m98543e(contactProfile);
                C0824j.m2153b(new a(contactProfile));
                C18644n.m98524E();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("HandleClickActionMsg", e11);
            }
        }

        /* renamed from: f */
        public static final void m101426f() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.b0
                @Override // java.lang.Runnable
                public final void run() {
                    C19353q.e.m101426f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.a0

                /* renamed from: p */
                public final /* synthetic */ Object f95870p;

                public /* synthetic */ RunnableC19306a0(Object obj2) {
                    r1 = obj2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19353q.e.m101425e(r1);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19353q(InterfaceC18319c interfaceC18319c, String str, InterfaceC26722a interfaceC26722a, AbstractC29069a.p pVar, int i11, boolean z11) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(pVar, "typeAction");
        this.f96120s = str;
        this.f96121t = interfaceC26722a;
        this.f96122u = pVar;
        this.f96123v = i11;
        this.f96124w = z11;
        this.f96125x = new C0766k();
        this.f96126y = new C0766k();
    }

    /* renamed from: p */
    private final void m101394p(C19325g1 c19325g1, InterfaceC26722a interfaceC26722a, String str, AbstractC29069a.p pVar) {
        C23024b7 c23024b7;
        InterfaceC0861a m118067o;
        if (interfaceC26722a != null && (m118067o = (c23024b7 = C23024b7.f111993a).m118067o(interfaceC26722a)) != null) {
            C7960e.m41971c6().m42423i8(str, m118067o.mo2478b(), C23139m1.f112256a.m118800q(m118067o), m118067o.mo2481g());
            C7960e.m41971c6().m42211N7(m118067o.mo2478b(), System.currentTimeMillis());
            if (m118067o instanceof ContactProfile) {
                ContactProfile contactProfile = (ContactProfile) m118067o;
                if (!contactProfile.m40374K0() && C28203u6.m141798e(C28203u6.f131407a, contactProfile.f42434r, null, 2, null) == null) {
                    C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
                }
            }
            if ((AbstractC19074t.m100204b(pVar, AbstractC29069a.p.l.f134728b) || AbstractC19074t.m100204b(pVar, AbstractC29069a.p.k.f134727b) || AbstractC19074t.m100204b(pVar, AbstractC29069a.p.e.f134719c)) && !C21927m.m114302u().m114345m(m118067o.mo2478b())) {
                C7960e.m41971c6().m42230P7(m118067o.mo2478b(), System.currentTimeMillis());
                c23024b7.m118075x(c19325g1);
            }
            m101398u();
        }
    }

    /* renamed from: r */
    public static final void m101395r(C19353q c19353q) {
        AbstractC19074t.m100208f(c19353q, "this$0");
        InterfaceC18319c m101438e = c19353q.m101438e();
        if (m101438e != null) {
        }
    }

    /* renamed from: s */
    private final void m101396s(ContactProfile contactProfile) {
        AbstractC19444a.m101695c(new Runnable() { // from class: ga0.o

            /* renamed from: q */
            public final /* synthetic */ ContactProfile f96099q;

            public /* synthetic */ RunnableC19347o(ContactProfile contactProfile2) {
                r2 = contactProfile2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19353q.m101397t(C19353q.this, r2);
            }
        });
    }

    /* renamed from: t */
    public static final void m101397t(C19353q c19353q, ContactProfile contactProfile) {
        ZaloView zaloView;
        AbstractC19074t.m100208f(c19353q, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$contactCall");
        Object m101438e = c19353q.m101438e();
        if (m101438e instanceof ZaloView) {
            zaloView = (ZaloView) m101438e;
        } else {
            zaloView = null;
        }
        if (zaloView != null) {
            try {
                if (!AbstractC23057e7.m118300g(zaloView.f88762c0.m92648SI())) {
                    if (C23055e5.m118272g(true)) {
                        if (C20024r.m103941j()) {
                            if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                                C20024r.m103949w();
                            } else {
                                ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                            }
                        } else if (AbstractC23034c6.m118167n(zaloView.f88762c0.m92686rK(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                            c19353q.m101440g(new C18316b("ACTION_REQUEST_PERMISSION", new String[]{"android.permission.RECORD_AUDIO"}, new C18316b("Search.Result.ClickItem", c19353q.f96121t, c19353q.f96122u, Integer.valueOf(c19353q.f96123v)), null, 8, null));
                        } else {
                            C2279a m120722w0 = AbstractC23306f.m120722w0();
                            String str = contactProfile.f42434r;
                            AbstractC19074t.m100207e(str, "uid");
                            String m40383Q = contactProfile.m40383Q(true, false);
                            AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                            String str2 = contactProfile.f42446v;
                            AbstractC19074t.m100207e(str2, "avt");
                            m120722w0.m101508a(new C2279a.a(str, m40383Q, str2, false, 47, null, 32, null));
                        }
                    }
                } else {
                    ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: u */
    private final void m101398u() {
        AbstractC19444a.m101694b(new Runnable() { // from class: ga0.p
            public /* synthetic */ RunnableC19350p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19353q.m101399w(C19353q.this);
            }
        }, 125L);
    }

    /* renamed from: w */
    public static final void m101399w(C19353q c19353q) {
        AbstractC19074t.m100208f(c19353q, "this$0");
        c19353q.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* renamed from: o */
    public final void m101400o(C19325g1 c19325g1, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(c19325g1, "searchSessionData");
        AbstractC19074t.m100208f(contactProfile, "profile");
        if (c19325g1.m101181G()) {
            return;
        }
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null) {
        }
        c19325g1.m101197W(true);
        this.f96126y.mo1704o8(new b(c19325g1, this, str, contactProfile));
        this.f96126y.mo1497O3(str);
    }

    /* renamed from: q */
    public final void m101401q(C19325g1 c19325g1, ContactProfile contactProfile, String str) {
        AbstractC19074t.m100208f(c19325g1, "searchSessionData");
        AbstractC19074t.m100208f(contactProfile, "profile");
        AbstractC19074t.m100208f(str, "userId");
        try {
            if (c19325g1.m101184J()) {
                return;
            }
            InterfaceC18319c m101438e = m101438e();
            if (m101438e != null) {
            }
            c19325g1.m101212f0(true);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(c19325g1, this, str, contactProfile));
            c19325g1.m101199Y(contactProfile);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            c19325g1.m101212f0(false);
            AbstractC19444a.m101695c(new Runnable() { // from class: ga0.n
                public /* synthetic */ RunnableC19344n() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19353q.m101395r(C19353q.this);
                }
            });
        }
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        ContactProfile m118066m;
        ContactProfile m118066m2;
        int i11;
        ContactProfile m118066m3;
        String str;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 == null) {
            return;
        }
        AbstractC29069a.p pVar = this.f96122u;
        int i12 = 0;
        if (AbstractC19074t.m100204b(pVar, AbstractC29069a.p.l.f134728b)) {
            InterfaceC26722a interfaceC26722a = this.f96121t;
            if (interfaceC26722a != null && (m118066m3 = C23024b7.f111993a.m118066m(interfaceC26722a)) != null && (str = m118066m3.f42434r) != null) {
                if (TextUtils.isEmpty(str)) {
                    ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                    return;
                }
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
                if (m141798e == null) {
                    m141798e = new ContactProfile(str);
                }
                if (C21927m.m114302u().m114345m(str)) {
                    AbstractC23647d.m123897g("5801129");
                }
                m101396s(m141798e);
                AbstractC23647d.m123897g("400305");
                i12 = 4;
            } else {
                return;
            }
        } else if (!AbstractC19074t.m100204b(pVar, AbstractC29069a.p.k.f134727b)) {
            if (AbstractC19074t.m100204b(pVar, AbstractC29069a.p.b.f134716c) || AbstractC19074t.m100204b(pVar, AbstractC29069a.p.i.f134724c)) {
                InterfaceC26722a interfaceC26722a2 = this.f96121t;
                if (interfaceC26722a2 != null && (m118066m = C23024b7.f111993a.m118066m(interfaceC26722a2)) != null) {
                    String str2 = m118066m.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    m101401q(c19325g1, m118066m, str2);
                    i12 = 3;
                } else {
                    return;
                }
            } else if (AbstractC19074t.m100204b(pVar, AbstractC29069a.p.a.f134715c)) {
                InterfaceC26722a interfaceC26722a3 = this.f96121t;
                if (interfaceC26722a3 != null && (m118066m2 = C23024b7.f111993a.m118066m(interfaceC26722a3)) != null) {
                    if (AbstractC23063f2.m118361m(m118066m2.f42434r)) {
                        m101404z(c19325g1, m118066m2);
                    } else {
                        TrackingSource trackingSource = new TrackingSource(273);
                        trackingSource.m40677a("sourceView", 11);
                        C21927m.m114302u().m114330e0(m118066m2.f42434r, trackingSource);
                        C32002l4 m154287a = C32002l4.Companion.m154287a(8);
                        if (!(this.f96121t instanceof AbstractC29069a.o)) {
                            i11 = 33554432;
                        } else {
                            i11 = -1;
                        }
                        m101440g(new C18316b("ACTION_OPEN_PROFILE", new C26365a.b(m118066m2.f42434r, m154287a).m135761t(true).m135738E(i11).m135743b(), null, null, 12, null));
                    }
                    i12 = 7;
                } else {
                    return;
                }
            } else if (!AbstractC19074t.m100204b(pVar, AbstractC29069a.p.e.f134719c) && !AbstractC19074t.m100204b(pVar, AbstractC29069a.p.f.f134720c) && !AbstractC19074t.m100204b(pVar, AbstractC29069a.p.d.f134718a) && !AbstractC19074t.m100204b(pVar, AbstractC29069a.p.c.f134717a)) {
                AbstractC19074t.m100204b(pVar, AbstractC29069a.p.m.f134729c);
            }
        }
        m101394p(c19325g1, this.f96121t, this.f96120s, this.f96122u);
        InterfaceC26722a interfaceC26722a4 = this.f96121t;
        if (interfaceC26722a4 != null) {
            C19955h.f98250a.m103730s(c19325g1, interfaceC26722a4, this.f96123v, i12);
        }
    }

    /* renamed from: x */
    public final void m101402x(C19325g1 c19325g1, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(c19325g1, "searchSessionData");
        AbstractC19074t.m100208f(contactProfile, "ct");
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        if (c19325g1.m101195U()) {
            return;
        }
        c19325g1.m101172A0(true);
        this.f96125x.mo1704o8(new d(c19325g1, this, str, contactProfile));
        TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
        trackingSource.m40677a("sourceView", 11);
        this.f96125x.mo1620d7(contactProfile.f42434r, "", contactProfile.f42373R0, trackingSource.m40682o());
    }

    /* renamed from: y */
    public final void m101403y(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "userID");
        try {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                i11 = m141798e.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new e());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1040));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    public final void m101404z(C19325g1 c19325g1, ContactProfile contactProfile) {
        BaseZaloView baseZaloView;
        AbstractC19074t.m100208f(c19325g1, "searchSessionData");
        AbstractC19074t.m100208f(contactProfile, "profile");
        try {
            Object m101438e = m101438e();
            if (m101438e instanceof BaseZaloView) {
                baseZaloView = (BaseZaloView) m101438e;
            } else {
                baseZaloView = null;
            }
            if (baseZaloView == null) {
                return;
            }
            TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
            trackingSource.m40677a("sourceView", 11);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            if (C26446c.m136326b().m136329d()) {
                Bundle bundle = new Bundle();
                bundle.putString("data", contactProfile.m40373K());
                bundle.putString("message", contactProfile.m40378N());
                C17487o0 m92662fJ = baseZaloView.f72421L0.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93066i2(AcceptFriendView.class, bundle, 10099, 1, true);
                    return;
                }
                return;
            }
            m101400o(c19325g1, contactProfile);
        } catch (Exception unused) {
        }
    }
}
