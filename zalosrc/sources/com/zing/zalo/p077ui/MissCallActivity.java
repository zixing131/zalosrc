package com.zing.zalo.p077ui;

import ac.C0697c0;
import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ap0.C2279a;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.MissCallActivity;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import me0.AbstractC23028c0;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import org.json.JSONObject;
import p056cj.C3535c;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p716zh.C31991k8;
import p716zh.C32002l4;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes5.dex */
public class MissCallActivity extends BaseZaloActivity implements View.OnClickListener {

    /* renamed from: B0 */
    C23528a f55362B0;

    /* renamed from: D0 */
    ContactProfile f55364D0;

    /* renamed from: i0 */
    ImageView f55366i0;

    /* renamed from: j0 */
    CircleImage f55367j0;

    /* renamed from: k0 */
    RecyclingImageView f55368k0;

    /* renamed from: l0 */
    RobotoTextView f55369l0;

    /* renamed from: m0 */
    RobotoTextView f55370m0;

    /* renamed from: n0 */
    RobotoTextView f55371n0;

    /* renamed from: o0 */
    RobotoTextView f55372o0;

    /* renamed from: p0 */
    RobotoTextView f55373p0;

    /* renamed from: q0 */
    ImageView f55374q0;

    /* renamed from: r0 */
    LinearLayout f55375r0;

    /* renamed from: s0 */
    LinearLayout f55376s0;

    /* renamed from: t0 */
    View f55377t0;

    /* renamed from: u0 */
    View f55378u0;

    /* renamed from: v0 */
    String f55379v0;

    /* renamed from: w0 */
    String f55380w0;

    /* renamed from: x0 */
    String f55381x0;

    /* renamed from: y0 */
    String f55382y0;

    /* renamed from: z0 */
    String f55383z0;

    /* renamed from: A0 */
    long f55361A0 = 0;

    /* renamed from: C0 */
    boolean f55363C0 = false;

    /* renamed from: E0 */
    InterfaceC20094a f55365E0 = new C10956a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MissCallActivity$a */
    /* loaded from: classes5.dex */
    public class C10956a implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.MissCallActivity$a$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f55385a;

            /* renamed from: b */
            final /* synthetic */ int f55386b;

            a(String str, int i11) {
                this.f55385a = str;
                this.f55386b = i11;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42609zd(this.f55385a, this.f55386b);
            }
        }

        /* renamed from: com.zing.zalo.ui.MissCallActivity$a$b */
        /* loaded from: classes5.dex */
        class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f55388a;

            /* renamed from: b */
            final /* synthetic */ String f55389b;

            /* renamed from: c */
            final /* synthetic */ String f55390c;

            b(String str, String str2, String str3) {
                this.f55388a = str;
                this.f55389b = str2;
                this.f55390c = str3;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                ContactProfile m41825s1 = C7959d.m41638d1().m41825s1(this.f55388a);
                if (m41825s1 != null && !TextUtils.isEmpty(this.f55389b) && !TextUtils.isEmpty(this.f55390c)) {
                    if (!this.f55389b.equals(m41825s1.f42446v) || !this.f55390c.equals(m41825s1.m40383Q(true, false))) {
                        C7959d.m41638d1().m41766Y2(this.f55388a, this.f55389b, this.f55390c);
                    }
                }
            }
        }

        C10956a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m56947d() {
            MissCallActivity missCallActivity = MissCallActivity.this;
            missCallActivity.f55363C0 = false;
            ContactProfile contactProfile = missCallActivity.f55364D0;
            if (contactProfile != null) {
                missCallActivity.m56939X3(contactProfile.f42446v, contactProfile.f42324B);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MissCallActivity.this.f55363C0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            if (obj != null) {
                try {
                    MissCallActivity.this.f55364D0 = new ContactProfile((JSONObject) obj);
                    if (C7960e.m41971c6() != null && (contactProfile = MissCallActivity.this.f55364D0) != null && contactProfile.f42434r.length() > 0 && !MissCallActivity.this.f55364D0.f42434r.equalsIgnoreCase("null")) {
                        C7960e m41971c6 = C7960e.m41971c6();
                        ContactProfile contactProfile2 = MissCallActivity.this.f55364D0;
                        m41971c6.m42221O7(contactProfile2, AbstractC21935u.m114558y(contactProfile2.f42434r));
                    }
                    C3535c m2634q = AbstractC23306f.m120584H0().m2634q(MissCallActivity.this.f55364D0.f42434r);
                    if (m2634q != null) {
                        m2634q.m17971y0().m40998a().f42458z = MissCallActivity.this.f55364D0.f42458z;
                    }
                    if (C21927m.m114302u().m114322U(MissCallActivity.this.f55364D0.f42434r)) {
                        if (C21927m.m114302u().m114357s().m153138j(MissCallActivity.this.f55364D0.f42434r) != null) {
                            ContactProfile contactProfile3 = MissCallActivity.this.f55364D0;
                            String str = contactProfile3.f42434r;
                            int i11 = contactProfile3.f42453x0;
                            if (i11 != C21927m.m114302u().m114357s().m153138j(MissCallActivity.this.f55364D0.f42434r).f42453x0) {
                                C21927m.m114302u().m114357s().m153138j(MissCallActivity.this.f55364D0.f42434r).f42453x0 = MissCallActivity.this.f55364D0.f42453x0;
                                C0824j.m2153b(new a(str, i11));
                            }
                        }
                    } else if (!AbstractC21935u.m114558y(MissCallActivity.this.f55364D0.f42434r)) {
                        ContactProfile contactProfile4 = MissCallActivity.this.f55364D0;
                        String str2 = contactProfile4.f42434r;
                        String str3 = contactProfile4.f42446v;
                        String m40383Q = contactProfile4.m40383Q(true, false);
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(m40383Q)) {
                            C0824j.m2153b(new b(str2, str3, m40383Q));
                        }
                    }
                    MissCallActivity.this.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            MissCallActivity.C10956a.this.m56947d();
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public /* synthetic */ void m56936v4(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        AbstractC23309i.m122412sz(false);
        finish();
    }

    /* renamed from: F4 */
    void m56937F4(String str) {
        try {
            AbstractC23647d.m123906p("158012");
            Intent m118998H = AbstractC23152n3.m118998H(new C31991k8(str, false, C32002l4.m154264g(11)));
            if (m118998H != null) {
                startActivity(m118998H);
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W3 */
    void m56938W3() {
        int i11;
        try {
            if (this.f55363C0) {
                return;
            }
            this.f55363C0 = true;
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f55379v0);
            this.f55364D0 = m141809c;
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f55365E0);
            c0766k.mo1514Q4(this.f55379v0, i11, new TrackingSource((short) 1024));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X3 */
    void m56939X3(String str, String str2) {
        try {
            AbstractC3972e.m18781f0(this.f55367j0);
            AbstractC3972e.m18781f0(this.f55368k0);
            this.f55367j0.setImageResource(AbstractC16803z.default_avatar);
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                if (C23302b.f113247a.m120523d(str)) {
                    int m12307a = C2343e.m12307a(this.f55379v0, false);
                    if (!TextUtils.isEmpty(this.f55381x0) && !str.equalsIgnoreCase("null")) {
                        this.f55367j0.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f55381x0), m12307a));
                    }
                } else {
                    ((C23528a) this.f55362B0.m123612r(this.f55367j0)).m123618x(str, C23278z2.m120143n());
                }
            }
            if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
                ((C23528a) this.f55362B0.m123612r(this.f55368k0)).m123618x(str2, C23278z2.m120132i0());
            } else {
                this.f55368k0.setImageResource(AbstractC16801x.cM1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity
    /* renamed from: Z1 */
    protected KeyEventCallbackC17462c mo35558Z1(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this);
        aVar.m43159h(5).m43162k(getString(AbstractC8020f0.str_ask_popup_miss_call)).m43165n(getString(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(getString(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: h40.o1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                MissCallActivity.this.m56936v4(interfaceC17463d, i12);
            }
        });
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(true);
        m43152a.mo13822K();
        return m43152a;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        C23212s8.m119599f(this, true, AbstractC8915g0.ThemeDefault_TranslucentDark, AbstractC8915g0.ThemeDefault_TranslucentLight);
    }

    /* renamed from: e4 */
    void m56940e4() {
        String str;
        RobotoTextView robotoTextView;
        try {
            m56939X3(this.f55380w0, this.f55382y0);
            if (!TextUtils.isEmpty(this.f55381x0) && (robotoTextView = this.f55369l0) != null) {
                robotoTextView.setText(this.f55381x0);
            }
            int i11 = 8;
            if (this.f55370m0 != null) {
                if (!TextUtils.isEmpty(this.f55383z0)) {
                    this.f55370m0.setVisibility(0);
                    this.f55370m0.setText(this.f55383z0);
                } else {
                    this.f55370m0.setVisibility(8);
                }
            }
            RobotoTextView robotoTextView2 = this.f55371n0;
            if (robotoTextView2 != null && this.f55361A0 > 0) {
                robotoTextView2.setText(m56941m4());
            }
            boolean m114558y = AbstractC21935u.m114558y(this.f55379v0);
            LinearLayout linearLayout = this.f55375r0;
            if (linearLayout != null) {
                if (m114558y) {
                    i11 = 0;
                }
                linearLayout.setVisibility(i11);
            }
            if (m114558y) {
                str = "158010";
            } else {
                str = "158011";
            }
            AbstractC23647d.m123906p(str);
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m4 */
    String m56941m4() {
        boolean z11;
        boolean z12;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            calendar2.setTimeInMillis(this.f55361A0);
            if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (calendar.get(1) == calendar2.get(1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            long j11 = currentTimeMillis - this.f55361A0;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm dd/MM");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            int i11 = ((int) j11) / 60000;
            if (i11 < 0) {
                i11 = 0;
            }
            if (!z12) {
                return simpleDateFormat3.format(calendar2.getTime());
            }
            if (!z11) {
                return simpleDateFormat2.format(calendar2.getTime());
            }
            if (i11 >= 60) {
                return simpleDateFormat.format(calendar2.getTime());
            }
            return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_truecaller_minutes_ago), Integer.valueOf(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.ll_info_layout && id2 != AbstractC6918a0.imvAvatar && id2 != AbstractC6918a0.cover_image) {
                if (id2 == AbstractC6918a0.ic_close) {
                    finish();
                    AbstractC23647d.m123906p("158014");
                    AbstractC23647d.m123893c();
                } else if (id2 == AbstractC6918a0.ic_setting) {
                    m35569f2(1);
                    m35587x2(1);
                    AbstractC23647d.m123906p("158015");
                    AbstractC23647d.m123893c();
                } else if (id2 == AbstractC6918a0.layout_send_msg) {
                    m56945z4(this.f55379v0);
                    finish();
                } else if (id2 == AbstractC6918a0.layout_callback) {
                    m56944y4(this.f55379v0, this.f55381x0, this.f55380w0);
                    finish();
                }
            }
            m56937F4(this.f55379v0);
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.f55362B0 = new C23528a((Activity) this);
        setContentView(AbstractC7409c0.miss_call_layout);
        m56943u4();
        m56942t4(getIntent());
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123906p("158014");
            AbstractC23647d.m123893c();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        m56942t4(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C0697c0.Companion.m1048b().m1035h("MissCallView");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C0697c0.Companion.m1048b().m1043u("MissCallView");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m35569f2(1);
        C0697c0.Companion.m1048b().m1035h("MissCallView");
    }

    @Override // com.zing.zalo.analytics.ZaloTrackingActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (z11) {
            C0697c0.Companion.m1048b().m1043u("MissCallView");
        }
    }

    /* renamed from: t4 */
    void m56942t4(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f55379v0 = extras.getString("extra_uid");
                this.f55380w0 = extras.getString("extra_avt");
                this.f55381x0 = extras.getString("extra_dpn");
                this.f55382y0 = extras.getString("extra_cover");
                this.f55383z0 = extras.getString("extra_status");
                this.f55361A0 = extras.getLong("extra_time_miss_call");
                if (extras.containsKey("extra_from_missed_call_notification") && extras.getBoolean("extra_from_missed_call_notification")) {
                    AbstractC23647d.m123897g("1608600");
                }
            }
            m56940e4();
            m56938W3();
            AbstractC23647d.m123906p("158002");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u4 */
    void m56943u4() {
        this.f55366i0 = (ImageView) findViewById(AbstractC6918a0.ic_close);
        this.f55367j0 = (CircleImage) findViewById(AbstractC6918a0.imvAvatar);
        this.f55368k0 = (RecyclingImageView) findViewById(AbstractC6918a0.cover_image);
        this.f55369l0 = (RobotoTextView) findViewById(AbstractC6918a0.user_display_name);
        this.f55370m0 = (RobotoTextView) findViewById(AbstractC6918a0.user_status);
        this.f55371n0 = (RobotoTextView) findViewById(AbstractC6918a0.tv_time_miss_call);
        this.f55372o0 = (RobotoTextView) findViewById(AbstractC6918a0.tv_miss_call);
        this.f55373p0 = (RobotoTextView) findViewById(AbstractC6918a0.sub_line);
        this.f55374q0 = (ImageView) findViewById(AbstractC6918a0.ic_setting);
        this.f55375r0 = (LinearLayout) findViewById(AbstractC6918a0.layout_reply);
        this.f55376s0 = (LinearLayout) findViewById(AbstractC6918a0.ll_info_layout);
        this.f55377t0 = findViewById(AbstractC6918a0.layout_send_msg);
        this.f55378u0 = findViewById(AbstractC6918a0.layout_callback);
        if (AbstractC23136l9.m118654H0(this)) {
            this.f55372o0.setTextSize(1, 13.0f);
            this.f55371n0.setTextSize(1, 13.0f);
            this.f55373p0.setTextSize(1, 13.0f);
        }
        this.f55376s0.setOnClickListener(this);
        this.f55366i0.setOnClickListener(this);
        this.f55374q0.setOnClickListener(this);
        this.f55367j0.setOnClickListener(this);
        this.f55368k0.setOnClickListener(this);
        this.f55377t0.setOnClickListener(this);
        this.f55378u0.setOnClickListener(this);
    }

    /* renamed from: y4 */
    void m56944y4(String str, String str2, String str3) {
        try {
            if (!AbstractC23057e7.m118300g(MainApplication.getAppContext()) && C23055e5.m118272g(true)) {
                AbstractC23306f.m120722w0().m101508a(new C2279a.a(str, str2, str3, false, 11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z4 */
    void m56945z4(String str) {
        try {
            AbstractC23647d.m123906p("158013");
            startActivity(AbstractC23152n3.m119014P(ChatView.class, new C27870vb(str).m140776b(), false));
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
