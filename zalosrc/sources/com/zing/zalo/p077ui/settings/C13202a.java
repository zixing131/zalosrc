package com.zing.zalo.p077ui.settings;

import ae.C0766k;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bo.C3006m1;
import bp0.C3080a0;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.settings.C13202a;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.C16786d;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import kz.AbstractC21970a;
import la0.C22229g7;
import la0.C22340u;
import la0.InterfaceC22266l;
import la0.InterfaceC22275m;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23216t1;
import me0.AbstractC23217t2;
import me0.C23055e5;
import me0.C23269y3;
import mm0.AbstractC23350e;
import na0.C23642c;
import org.json.JSONArray;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p458qr.C25487t;
import p492rr.C25959b;
import p492rr.C25973p;
import p716zh.C32002l4;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25368s;
import s00.AbstractC26084s;
import s00.C26071f;
import yt.EnumC31080j;

/* renamed from: com.zing.zalo.ui.settings.a */
/* loaded from: classes6.dex */
public final class C13202a extends AbstractC19962a implements InterfaceC22266l {

    /* renamed from: A */
    private boolean f68086A;

    /* renamed from: B */
    private final Object f68087B;

    /* renamed from: C */
    private boolean f68088C;

    /* renamed from: t */
    private final C23642c f68089t;

    /* renamed from: u */
    private C22229g7[] f68090u;

    /* renamed from: v */
    private C22340u f68091v;

    /* renamed from: w */
    private volatile boolean f68092w;

    /* renamed from: x */
    private boolean f68093x;

    /* renamed from: y */
    private boolean f68094y;

    /* renamed from: z */
    private boolean f68095z;

    /* renamed from: com.zing.zalo.ui.settings.a$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C13202a.this.m74375Mp(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C13202a.this.m74375Mp(false);
            AbstractC23309i.m122552wr(System.currentTimeMillis());
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                AbstractC23148n.m118844r(jSONObject);
                if (!jSONObject.isNull("privacy")) {
                    AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            ((InterfaceC22275m) C13202a.this.m103742Dp()).mo73550ao();
            C3080a0.f13112a.m15414e(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m74391e(C13202a c13202a, boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            AbstractC19074t.m100208f(c13202a, "this$0");
            try {
                if (((InterfaceC22275m) c13202a.m103742Dp()).mo78947bg()) {
                    return;
                }
                if (z11) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_unmap_profile", z12);
                    bundle.putBoolean("is_bypass_password", z13);
                    bundle.putInt("source_type_change_phone", 1);
                    ((InterfaceC22275m) c13202a.m103742Dp()).mo73552l4(ChangePhoneNumberView.class, bundle, 1, true);
                    return;
                }
                Bundle bundle2 = new Bundle();
                if (jSONArray != null) {
                    bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                }
                ((InterfaceC22275m) c13202a.m103742Dp()).mo73552l4(NotChangePhoneNumberView.class, bundle2, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m74392f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                Object m74372Kp = C13202a.this.m74372Kp();
                C13202a c13202a = C13202a.this;
                synchronized (m74372Kp) {
                    c13202a.m74376Np(false);
                    ((InterfaceC22275m) c13202a.m103742Dp()).mo49315c4();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                if (((InterfaceC22275m) C13202a.this.m103742Dp()).mo78947bg() || AbstractC23216t1.m119643h(((InterfaceC22275m) C13202a.this.m103742Dp()).mo73551k(), c20096c, new AbstractC23216t1.d() { // from class: la0.o
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        C13202a.b.m74392f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11;
            final boolean z12;
            final boolean z13;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                Object m74372Kp = C13202a.this.m74372Kp();
                C13202a c13202a = C13202a.this;
                synchronized (m74372Kp) {
                    c13202a.m74376Np(false);
                    ((InterfaceC22275m) c13202a.m103742Dp()).mo49315c4();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                    AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                    AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                    if (optJSONObject.optInt("allow_change_phonenumber", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (optJSONObject.optInt("bypass_verify_pwd", 0) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    final JSONArray optJSONArray = optJSONObject.optJSONArray("valid_error");
                    InterfaceC22275m interfaceC22275m = (InterfaceC22275m) C13202a.this.m103742Dp();
                    final C13202a c13202a2 = C13202a.this;
                    interfaceC22275m.mo70710wy(new Runnable() { // from class: la0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13202a.b.m74391e(C13202a.this, z11, z12, z13, optJSONArray);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    if (CoreUtility.f89233i.equals(jSONObject.optString("uid"))) {
                        SettingAccountAndSecurityV2View.C13115a c13115a = SettingAccountAndSecurityV2View.Companion;
                        c13115a.m73673c(jSONObject.optInt("verify_status", -1));
                        if (c13115a.m73671a() > -1) {
                            AbstractC0924m0.m2963Cd(c13115a.m73671a());
                        }
                        ((InterfaceC22275m) C13202a.this.m103742Dp()).mo73550ao();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f68099a;

        /* renamed from: b */
        final /* synthetic */ long f68100b;

        /* renamed from: c */
        final /* synthetic */ C13202a f68101c;

        d(int i11, long j11, C13202a c13202a) {
            this.f68099a = i11;
            this.f68100b = j11;
            this.f68101c = c13202a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            if (c20096c != null) {
                try {
                    try {
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (c20096c.m104491c() == 515) {
                        i11 = AbstractC8020f0.WRONG_DATE_TIME_MSG;
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                        ((InterfaceC22275m) this.f68101c.m103742Dp()).mo73550ao();
                        this.f68101c.m74377Op(false);
                        ((InterfaceC22275m) this.f68101c.m103742Dp()).mo78960q3();
                    }
                } catch (Throwable th2) {
                    this.f68101c.m74377Op(false);
                    ((InterfaceC22275m) this.f68101c.m103742Dp()).mo78960q3();
                    throw th2;
                }
            }
            i11 = AbstractC8020f0.str_update_failed;
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
            ((InterfaceC22275m) this.f68101c.m103742Dp()).mo73550ao();
            this.f68101c.m74377Op(false);
            ((InterfaceC22275m) this.f68101c.m103742Dp()).mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if ((obj instanceof JSONObject) && ((JSONObject) obj).has("data")) {
                        JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                        if (optJSONObject != null && optJSONObject.optBoolean("results")) {
                            C25959b c25959b = C25959b.f123885a;
                            c25959b.m133738i(this.f68099a);
                            c25959b.m133737h(this.f68100b);
                            c25959b.m133736g();
                            C3006m1 c3006m1 = new C3006m1();
                            c3006m1.m14416g(c25959b.m133733b());
                            c3006m1.m14415f(c25959b.m133732a());
                            C25973p.f123927a.m133796i(c3006m1);
                            C23744a.Companion.m124119a().m124116d(6022, new Object[0]);
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                        }
                    }
                    ((InterfaceC22275m) this.f68101c.m103742Dp()).mo73550ao();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f68101c.m74377Op(false);
                ((InterfaceC22275m) this.f68101c.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                this.f68101c.m74377Op(false);
                ((InterfaceC22275m) this.f68101c.m103742Dp()).mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ List f68102q;

        /* renamed from: r */
        final /* synthetic */ C13202a f68103r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, C13202a c13202a) {
            super(1);
            this.f68102q = list;
            this.f68103r = c13202a;
        }

        /* renamed from: a */
        public final void m74393a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            try {
                try {
                    for (C24860q c24860q : this.f68102q) {
                        AbstractC23148n.m118848v(((Number) c24860q.m129215c()).intValue(), ((Number) c24860q.m129216d()).intValue());
                    }
                    ((InterfaceC22275m) this.f68103r.m103742Dp()).mo73550ao();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                this.f68103r.f68092w = false;
                ((InterfaceC22275m) this.f68103r.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                this.f68103r.f68092w = false;
                ((InterfaceC22275m) this.f68103r.m103742Dp()).mo78960q3();
                throw th2;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74393a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18509p {
        f() {
            super(2);
        }

        /* renamed from: a */
        public final void m74394a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            try {
                try {
                    if (i11 == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    ((InterfaceC22275m) C13202a.this.m103742Dp()).mo73550ao();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C13202a.this.f68092w = false;
                ((InterfaceC22275m) C13202a.this.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                C13202a.this.f68092w = false;
                ((InterfaceC22275m) C13202a.this.m103742Dp()).mo78960q3();
                throw th2;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m74394a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$g */
    /* loaded from: classes6.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f68106b;

        /* renamed from: c */
        final /* synthetic */ int f68107c;

        g(int i11, int i12) {
            this.f68106b = i11;
            this.f68107c = i12;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    ((InterfaceC22275m) C13202a.this.m103742Dp()).mo73550ao();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C13202a.this.m74378Pp(false);
                ((InterfaceC22275m) C13202a.this.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                C13202a.this.m74378Pp(false);
                ((InterfaceC22275m) C13202a.this.m103742Dp()).mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "arg0");
            try {
                try {
                    AbstractC23148n.m118848v(this.f68106b, this.f68107c);
                    ((InterfaceC22275m) C13202a.this.m103742Dp()).mo73550ao();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C13202a.this.m74378Pp(false);
                ((InterfaceC22275m) C13202a.this.m103742Dp()).mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.a$h */
    /* loaded from: classes6.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f68108a;

        /* renamed from: b */
        final /* synthetic */ int f68109b;

        /* renamed from: c */
        final /* synthetic */ C13202a f68110c;

        h(int i11, int i12, C13202a c13202a) {
            this.f68108a = i11;
            this.f68109b = i12;
            this.f68110c = c13202a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m74397e(String[] strArr, int i11) {
            AbstractC19074t.m100208f(strArr, "$arrayCode");
            try {
                String str = strArr[i11];
                AbstractC19074t.m100207e(str, "get(...)");
                C23269y3.m120035a(str);
                AbstractC21970a.m114741j(0L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m74398f(C13202a c13202a) {
            AbstractC19074t.m100208f(c13202a, "this$0");
            BaseZaloActivity baseZaloActivity = (BaseZaloActivity) ((InterfaceC22275m) c13202a.m103742Dp()).mo73551k().m92648SI();
            AbstractC19074t.m100205c(baseZaloActivity);
            baseZaloActivity.recreate();
            C16786d.a aVar = C16786d.Companion;
            if (aVar.m89649f()) {
                C16786d.a.m89644c(aVar, null, 1, null).m89642j0(EnumC31080j.f143273q);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (c20096c != null) {
                    try {
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                        ((InterfaceC22275m) this.f68110c.m103742Dp()).mo73550ao();
                        this.f68110c.f68086A = false;
                        ((InterfaceC22275m) this.f68110c.m103742Dp()).mo78960q3();
                    }
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                ((InterfaceC22275m) this.f68110c.m103742Dp()).mo73550ao();
                this.f68110c.f68086A = false;
                ((InterfaceC22275m) this.f68110c.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                this.f68110c.f68086A = false;
                ((InterfaceC22275m) this.f68110c.m103742Dp()).mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    int i11 = this.f68108a;
                    AbstractC23148n.m118851y(i11, this.f68109b, i11);
                    if (this.f68108a == 11) {
                        ((InterfaceC22275m) this.f68110c.m103742Dp()).mo78960q3();
                        final String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
                        AbstractC19074t.m100207e(m118755v0, "getStringArray(...)");
                        final int i12 = this.f68109b;
                        AbstractC19444a.m101697e(new Runnable() { // from class: la0.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13202a.h.m74397e(m118755v0, i12);
                            }
                        });
                        C23269y3.m120040i(((InterfaceC22275m) this.f68110c.m103742Dp()).mo73551k().m92648SI());
                        AbstractC20826v0.m108770L0(true);
                        C25487t.f122084a.m132028c(C25487t.a.f122098v);
                        AbstractC0924m0.m2943Bm(true);
                        final C13202a c13202a = this.f68110c;
                        AbstractC19444a.m101697e(new Runnable() { // from class: la0.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13202a.h.m74398f(C13202a.this);
                            }
                        });
                    }
                    ((InterfaceC22275m) this.f68110c.m103742Dp()).mo73550ao();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f68110c.f68086A = false;
                ((InterfaceC22275m) this.f68110c.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                this.f68110c.f68086A = false;
                ((InterfaceC22275m) this.f68110c.m103742Dp()).mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13202a(InterfaceC22275m interfaceC22275m, C23642c c23642c) {
        super(interfaceC22275m);
        AbstractC19074t.m100208f(interfaceC22275m, "mvpView");
        AbstractC19074t.m100208f(c23642c, "settingRepo");
        this.f68089t = c23642c;
        this.f68087B = new Object();
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: Ie */
    public void mo74371Ie(int i11, int i12) {
        try {
            if (C23055e5.m118272g(true)) {
                if (this.f68094y) {
                    ((InterfaceC22275m) m103742Dp()).mo46829Y();
                    return;
                }
                this.f68094y = true;
                ((InterfaceC22275m) m103742Dp()).mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new g(i11, i12));
                c0766k.mo1545U3(i11, i12, "");
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            ((InterfaceC22275m) m103742Dp()).mo73550ao();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Kp */
    public final Object m74372Kp() {
        return this.f68087B;
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: L8 */
    public View mo74373L8() {
        C22340u c22340u;
        if (this.f68090u == null) {
            this.f68090u = ((InterfaceC22275m) m103742Dp()).mo73523od();
        }
        C22229g7[] c22229g7Arr = this.f68090u;
        if (c22229g7Arr != null && (c22340u = this.f68091v) != null) {
            for (C22229g7 c22229g7 : c22229g7Arr) {
                if (c22340u.m115790c() == c22229g7.m115785a()) {
                    return c22229g7.m115786b();
                }
            }
            return null;
        }
        return null;
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: MA */
    public void mo74374MA() {
        this.f68091v = null;
        AbstractC23217t2.m119650b(((InterfaceC22275m) m103742Dp()).m115787L3());
    }

    /* renamed from: Mp */
    public final void m74375Mp(boolean z11) {
        this.f68093x = z11;
    }

    /* renamed from: Np */
    public final void m74376Np(boolean z11) {
        this.f68088C = z11;
    }

    /* renamed from: Op */
    public final void m74377Op(boolean z11) {
        this.f68095z = z11;
    }

    /* renamed from: Pp */
    public final void m74378Pp(boolean z11) {
        this.f68094y = z11;
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: Vp */
    public void mo74379Vp() {
        JSONObject jSONObject;
        int i11;
        Bundle m115787L3 = ((InterfaceC22275m) m103742Dp()).m115787L3();
        if (m115787L3 != null) {
            String string = m115787L3.getString("EXTRA_HIGHTLIGHT_SETTING_DATA");
            C24848g0 c24848g0 = null;
            if (string != null && string.length() != 0) {
                jSONObject = new JSONObject(string);
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.f68091v = new C22340u(jSONObject);
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null && (i11 = m115787L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1)) >= 0) {
                this.f68091v = new C22340u(i11, m115787L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0));
            }
        }
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: Vx */
    public void mo74380Vx() {
        if (this.f68093x) {
            return;
        }
        if (C23055e5.m118272g(false)) {
            this.f68093x = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a());
            c0766k.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: Xi */
    public void mo74381Xi() {
        ArrayList m131500h;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c());
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        m131500h = AbstractC25368s.m131500h(Integer.valueOf(Integer.parseInt(str)));
        c0766k.mo1782y5(m131500h, new TrackingSource(1163));
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: Xm */
    public void mo74382Xm() {
        if (this.f68090u == null) {
            this.f68090u = ((InterfaceC22275m) m103742Dp()).mo73523od();
        }
        C22229g7[] c22229g7Arr = this.f68090u;
        if (c22229g7Arr != null) {
            for (C22229g7 c22229g7 : c22229g7Arr) {
                if (c22229g7.m115786b() instanceof ViewGroup) {
                    View m115786b = c22229g7.m115786b();
                    AbstractC19074t.m100206d(m115786b, "null cannot be cast to non-null type android.view.ViewGroup");
                    C26071f m134251H = AbstractC26084s.m134251H((ViewGroup) m115786b, c22229g7.m115785a());
                    if (this.f68091v == null && m134251H != null) {
                        AbstractC19074t.m100205c(m134251H);
                        C22340u c22340u = m134251H.f124238m;
                        if (c22340u != null) {
                            this.f68091v = c22340u;
                            if (mo74373L8() != null) {
                                InterfaceC22275m interfaceC22275m = (InterfaceC22275m) m103742Dp();
                                C22340u c22340u2 = this.f68091v;
                                AbstractC19074t.m100205c(c22340u2);
                                interfaceC22275m.mo73549Cd(c22340u2);
                                m134251H.m134180k();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: a6 */
    public void mo74383a6(View view) {
        AbstractC19074t.m100208f(view, "itemView");
        if (this.f68090u == null) {
            this.f68090u = ((InterfaceC22275m) m103742Dp()).mo73523od();
        }
        C22229g7[] c22229g7Arr = this.f68090u;
        if (c22229g7Arr != null) {
            for (C22229g7 c22229g7 : c22229g7Arr) {
                if (AbstractC19074t.m100204b(c22229g7.m115786b(), view)) {
                    AbstractC26084s.m134269q(0, c22229g7.m115785a());
                    C0815e1.m2079N(c22229g7.m115785a(), 1, 0, 0, 0);
                    return;
                }
            }
        }
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: a7 */
    public void mo74384a7() {
        try {
            synchronized (this.f68087B) {
                if (this.f68088C) {
                    ((InterfaceC22275m) m103742Dp()).mo46829Y();
                    return;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                synchronized (this.f68087B) {
                    this.f68088C = true;
                    ((InterfaceC22275m) m103742Dp()).mo46829Y();
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b());
                c0766k.mo1743t7(1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (this.f68090u == null) {
            this.f68090u = ((InterfaceC22275m) m103742Dp()).mo73523od();
        }
        C22229g7[] c22229g7Arr = this.f68090u;
        if (c22229g7Arr != null) {
            for (C22229g7 c22229g7 : c22229g7Arr) {
                if (c22229g7.m115786b().getId() == i11) {
                    return c22229g7.m115785a();
                }
            }
            return -10;
        }
        return -10;
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: gy */
    public void mo74385gy(int i11, long j11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (C23055e5.m118272g(false)) {
            if (this.f68095z) {
                ((InterfaceC22275m) m103742Dp()).mo46829Y();
                return;
            }
            this.f68095z = true;
            ((InterfaceC22275m) m103742Dp()).mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(i11, j11, this));
            c0766k.m1803C0(28, i11, j11, C25973p.f123927a.m133793f(c32002l4));
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
        ((InterfaceC22275m) m103742Dp()).mo78960q3();
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: lI */
    public void mo74386lI(List list) {
        AbstractC19074t.m100208f(list, "listPrivacySetting");
        try {
            if (C23055e5.m118272g(true)) {
                if (this.f68092w) {
                    ((InterfaceC22275m) m103742Dp()).mo46829Y();
                    return;
                }
                this.f68092w = true;
                ((InterfaceC22275m) m103742Dp()).mo46829Y();
                this.f68089t.m123883c(list, new e(list, this), new f());
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            ((InterfaceC22275m) m103742Dp()).mo73550ao();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: o3 */
    public void mo74387o3(int i11, int i12) {
        try {
            if (this.f68086A) {
                return;
            }
            if (C23055e5.m118272g(true)) {
                this.f68086A = true;
                ((InterfaceC22275m) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new h(i11, i12, this));
                c0766k.mo1699o3(i11, i12);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                ((InterfaceC22275m) m103742Dp()).mo73550ao();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // la0.InterfaceC22266l
    /* renamed from: vd */
    public void mo74388vd() {
        C22340u c22340u = this.f68091v;
        if (c22340u != null) {
            AbstractC19074t.m100205c(c22340u);
            if (c22340u.m115790c() >= 0) {
                InterfaceC22275m interfaceC22275m = (InterfaceC22275m) m103742Dp();
                C22340u c22340u2 = this.f68091v;
                AbstractC19074t.m100205c(c22340u2);
                interfaceC22275m.mo73549Cd(c22340u2);
            }
        }
    }
}
