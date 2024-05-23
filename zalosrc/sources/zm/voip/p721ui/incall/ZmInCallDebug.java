package zm.voip.p721ui.incall;

import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zview.dialog.C17460a;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import lo0.C22592c;
import lo0.C22626t;
import p097db.C17843b;
import ro0.AbstractRunnableC25943g;
import ro0.C25939c;
import ro0.C25949m;
import zm.voip.p721ui.incall.ZmInCallDebug;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.HandlerC32324p;

/* loaded from: classes7.dex */
public class ZmInCallDebug extends FrameLayout implements View.OnClickListener {

    /* renamed from: A */
    private final C25939c f149778A;

    /* renamed from: B */
    private final Context f149779B;

    /* renamed from: C */
    int f149780C;

    /* renamed from: D */
    int f149781D;

    /* renamed from: E */
    int f149782E;

    /* renamed from: F */
    ActivityManager.MemoryInfo f149783F;

    /* renamed from: G */
    ActivityManager f149784G;

    /* renamed from: p */
    final String[] f149785p;

    /* renamed from: q */
    final String[] f149786q;

    /* renamed from: r */
    C25949m f149787r;

    /* renamed from: s */
    TextView f149788s;

    /* renamed from: t */
    TextView f149789t;

    /* renamed from: u */
    TextView f149790u;

    /* renamed from: v */
    TextView f149791v;

    /* renamed from: w */
    SeekBar f149792w;

    /* renamed from: x */
    TextView f149793x;

    /* renamed from: y */
    KeyEventCallbackC17462c f149794y;

    /* renamed from: z */
    volatile boolean f149795z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$a */
    /* loaded from: classes7.dex */
    public class C32446a extends AbstractRunnableC25943g {
        C32446a() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94198r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$b */
    /* loaded from: classes7.dex */
    public class C32447b implements SeekBar.OnSeekBarChangeListener {
        C32447b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            ZmInCallDebug.this.f149793x.setText(ZmInCallDebug.m157168k(i11));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress = seekBar.getProgress();
            ZmInCallDebug.this.f149793x.setText(ZmInCallDebug.m157168k(progress));
            C17843b.m94137o().m94160W(progress);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$c */
    /* loaded from: classes7.dex */
    public class C32448c extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ String f149798p;

        C32448c(String str) {
            this.f149798p = str;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94167b0(this.f149798p);
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$d */
    /* loaded from: classes7.dex */
    class C32449d extends AbstractRunnableC25943g {
        C32449d() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94200s0(true);
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$e */
    /* loaded from: classes7.dex */
    class C32450e extends AbstractRunnableC25943g {
        C32450e() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94200s0(false);
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$f */
    /* loaded from: classes7.dex */
    class C32451f extends AbstractRunnableC25943g {
        C32451f() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC32273e3.m155748Q().m155812I1();
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$g */
    /* loaded from: classes7.dex */
    class C32452g extends AbstractRunnableC25943g {
        C32452g() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94196q0(false);
        }
    }

    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$h */
    /* loaded from: classes7.dex */
    class C32453h extends AbstractRunnableC25943g {
        C32453h() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94196q0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$i */
    /* loaded from: classes7.dex */
    public interface InterfaceC32454i {
        /* renamed from: a */
        void mo157186a(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm.voip.ui.incall.ZmInCallDebug$j */
    /* loaded from: classes7.dex */
    public static class C32455j extends C17460a.a {

        /* renamed from: b */
        private final String[] f149805b;

        /* renamed from: c */
        private int f149806c;

        /* renamed from: d */
        private final InterfaceC32454i f149807d;

        public C32455j(Context context, String[] strArr, int i11, InterfaceC32454i interfaceC32454i) {
            super(context);
            this.f149805b = strArr;
            this.f149807d = interfaceC32454i;
            this.f149806c = i11 < 0 ? 0 : i11;
            m157189q();
        }

        /* renamed from: q */
        private void m157189q() {
            m92841l("Choose mode");
            m92839j(this.f149805b, this.f149806c, new InterfaceC17463d.d() { // from class: zm.voip.ui.incall.j
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZmInCallDebug.C32455j.this.m157190r(interfaceC17463d, i11);
                }
            });
            m92838i("Done", new InterfaceC17463d.d() { // from class: zm.voip.ui.incall.k
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZmInCallDebug.C32455j.this.m157191s(interfaceC17463d, i11);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m157190r(InterfaceC17463d interfaceC17463d, int i11) {
            this.f149806c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m157191s(InterfaceC17463d interfaceC17463d, int i11) {
            this.f149807d.mo157186a(this.f149806c);
            interfaceC17463d.dismiss();
        }
    }

    public ZmInCallDebug(Context context) {
        super(context);
        this.f149785p = new String[]{"Off", "QuietEarpieceOrHeadset", "Earpiece", "LoudEarpiece", "Speakerphone", "LoudSpeakerphone"};
        this.f149786q = new String[]{"Off", "Low", "Moderate", "High", "VeryHigh"};
        this.f149794y = null;
        this.f149795z = false;
        this.f149778A = new C25939c();
        this.f149780C = 0;
        this.f149781D = 0;
        this.f149782E = 0;
        this.f149779B = context;
        LinearLayout linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.gravity = 81;
        linearLayout.setLayoutParams(m15698a);
        linearLayout.setOrientation(1);
        this.f149788s = m157181j();
        this.f149790u = m157181j();
        this.f149789t = m157181j();
        TextView m157181j = m157181j();
        this.f149791v = m157181j;
        linearLayout.addView(m157181j);
        linearLayout.addView(this.f149788s);
        linearLayout.addView(this.f149790u);
        linearLayout.addView(this.f149789t);
        addView(linearLayout);
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-2, -2);
        m15698a2.gravity = 21;
        Button button = new Button(getContext());
        button.setLayoutParams(m15698a2);
        button.setText("Settings");
        button.setOnClickListener(new View.OnClickListener() { // from class: vo0.i6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallDebug.this.m157171p(view);
            }
        });
        addView(button);
        FrameLayout.LayoutParams m15698a3 = AbstractC3105q.m15698a(-2, -2);
        m15698a3.gravity = 19;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(m15698a3);
        addView(linearLayout2);
        setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        this.f149787r = new C25949m();
        this.f149783F = new ActivityManager.MemoryInfo();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f149784G = (ActivityManager) context.getSystemService("activity");
        } else {
            this.f149784G = null;
        }
    }

    /* renamed from: k */
    static String m157168k(int i11) {
        return "Agc: " + i11 + "/90";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m157169m(CompoundButton compoundButton, boolean z11) {
        m157183x(!z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m157170n(View view) {
        AbstractC3096i0.m15522W0("ToggleServer");
        HandlerC32324p.m156351d(new C32446a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m157171p(View view) {
        try {
            m157182l();
            this.f149794y.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m157172q(View view, int i11) {
        int i12;
        if (i11 >= 0 && i11 < this.f149785p.length) {
            C17843b m94137o = C17843b.m94137o();
            if (i11 == 0) {
                i12 = -1;
            } else {
                i12 = i11;
            }
            m94137o.m94159V(i12);
            ((Button) view).setText(this.f149785p[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m157173r(View view, int i11) {
        int i12;
        if (i11 >= 0 && i11 < this.f149785p.length) {
            C17843b m94137o = C17843b.m94137o();
            if (i11 == 0) {
                i12 = -1;
            } else {
                i12 = i11;
            }
            m94137o.m94158U(i12);
            ((Button) view).setText(this.f149785p[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m157174s(View view, int i11) {
        if (i11 >= 0 && i11 < this.f149786q.length) {
            C17843b.m94137o().m94177g0(i11);
            ((Button) view).setText(this.f149786q[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m157175u(C22626t c22626t) {
        String str;
        if (c22626t != null) {
            if (c22626t.m117126k0() || c22626t.m117082Z()) {
                String str2 = String.format("BitrateAll: %s:%d Kb/s,%s:%d Kb/s", "&#9650", Integer.valueOf(this.f149787r.f123785e), "&#9660", Integer.valueOf(this.f149787r.f123783d)) + String.format("<br>srtpMode: %d, srtpRTCP: %d", Integer.valueOf(this.f149787r.f123756H0), Integer.valueOf(this.f149787r.f123758I0));
                ActivityManager activityManager = this.f149784G;
                if (activityManager != null) {
                    activityManager.getMemoryInfo(this.f149783F);
                    ActivityManager.MemoryInfo memoryInfo = this.f149783F;
                    str2 = str2 + String.format(", Ram: %d %%", Integer.valueOf((int) ((memoryInfo.availMem / memoryInfo.totalMem) * 100.0d)));
                }
                this.f149791v.setText(Html.fromHtml(str2 + String.format("<br>ServerDebug: %s", this.f149787r.f123760J0)));
                String str3 = (String.format("Aud: %s:%d Kb(%dpk)-(%d),%s:%d Kb(%dpk)-(%d) EncMs: %d", "&#9650", Integer.valueOf(this.f149787r.f123791h), Integer.valueOf(this.f149787r.f123775Y), Integer.valueOf(this.f149787r.f123766P), "&#9660", Integer.valueOf(this.f149787r.f123789g), Integer.valueOf(this.f149787r.f123778a0), Integer.valueOf(this.f149787r.f123767Q), Integer.valueOf(this.f149787r.f123825y)) + String.format("<br>NACK: Req:%d, Sent:%d (%dKb), FEC: up:%dKb, dw:%dKb, BWE: %d", Integer.valueOf(this.f149787r.f123749E), Integer.valueOf(this.f149787r.f123753G), Integer.valueOf(this.f149787r.f123757I), Integer.valueOf(this.f149787r.f123759J), Integer.valueOf(this.f149787r.f123761K), Integer.valueOf(this.f149787r.f123771U))) + String.format("<br>Rtt:%dms, Loss: local: %d%%, remote: %d%%, num: %d", Integer.valueOf(this.f149787r.f123790g0), Integer.valueOf(this.f149787r.f123819v), Integer.valueOf(this.f149787r.f123821w), Integer.valueOf(this.f149787r.f123823x));
                if (this.f149787r.f123818u0 > 0) {
                    str3 = str3 + String.format("<br>FEC: run:%d (%d:%d), Recv:%d, befLoss: %d%%, afLoss: %d%% <br>maxDur:%d, recover:%d", Integer.valueOf(this.f149787r.f123820v0), Integer.valueOf(this.f149787r.f123822w0), Integer.valueOf(this.f149787r.f123824x0), Integer.valueOf(this.f149787r.f123826y0), Integer.valueOf(this.f149787r.f123828z0), Integer.valueOf(this.f149787r.f123742A0), Integer.valueOf(this.f149787r.f123744B0), Integer.valueOf(this.f149787r.f123750E0));
                }
                this.f149788s.setText(Html.fromHtml(str3));
                if (c22626t.m117047N0()) {
                    String str4 = ((String.format("Vid: %s:%d Kb/s(%dpkts),%s:%d Kb/s(%dpkts)", "&#9650", Integer.valueOf(this.f149787r.f123793i), Integer.valueOf(this.f149787r.f123776Z), "&#9660", Integer.valueOf(this.f149787r.f123787f), Integer.valueOf(this.f149787r.f123780b0)) + String.format("<br>Rtt:%dms NACK: Req:%d, Sent:%d(%dKb)", Integer.valueOf(this.f149787r.f123792h0), Integer.valueOf(this.f149787r.f123747D), Integer.valueOf(this.f149787r.f123751F), Integer.valueOf(this.f149787r.f123755H))) + String.format("<br>bwProfileId:%d encLevel: %d", Integer.valueOf(this.f149787r.f123786e0), Integer.valueOf(this.f149787r.f123788f0))) + String.format("<br>BWE: send:%d, rem:%d, Real: %d, audDelay: %d, vDelay: %d", Integer.valueOf(this.f149787r.f123768R), Integer.valueOf(this.f149787r.f123770T), Integer.valueOf(this.f149787r.f123769S), Integer.valueOf(this.f149787r.f123779b), Integer.valueOf(this.f149787r.f123781c));
                    C25949m c25949m = this.f149787r;
                    int i11 = c25949m.f123807p;
                    String str5 = i11 == 5 ? "H265" : "H264";
                    int i12 = c25949m.f123811r;
                    String str6 = i12 == 1 ? "Hw" : "Sw";
                    String str7 = c25949m.f123809q == 5 ? "H265" : "H264";
                    String str8 = c25949m.f123813s == 1 ? "Hw" : "Sw";
                    this.f149790u.setText(Html.fromHtml((str4 + String.format("<br>Enc: %s(%s), KeyF:%d, Time:%dms Delay:%dms<br> EncFps:%d(%dx%d), capFps:%d(%dx%d), level_idc:%d", str5, str6, Integer.valueOf(this.f149787r.f123806o0), Integer.valueOf(this.f149787r.f123803n), Integer.valueOf(this.f149787r.f123815t), Integer.valueOf(this.f149787r.f123765O), Integer.valueOf(this.f149787r.f123773W), Integer.valueOf(this.f149787r.f123772V), Integer.valueOf(this.f149787r.f123764N), Integer.valueOf(this.f149787r.f123763M), Integer.valueOf(this.f149787r.f123762L), Integer.valueOf((i12 == 1 && i11 == 4) ? c25949m.f123817u : -1))) + String.format("<br>Dec: %s(%s), KeyF:%d, Time:%dms <br> RenFps:%d(%dx%d), queue:%d, remoteFps:%d", str7, str8, Integer.valueOf(this.f149787r.f123808p0), Integer.valueOf(this.f149787r.f123805o), Integer.valueOf(this.f149787r.f123827z), Integer.valueOf(this.f149787r.f123743B), Integer.valueOf(this.f149787r.f123741A), Integer.valueOf(this.f149787r.f123745C), Integer.valueOf(this.f149787r.f123804n0))));
                    this.f149790u.setVisibility(0);
                } else {
                    this.f149790u.setVisibility(8);
                }
                String format = String.format("Level: In: %d, out: %d, Frame: Local: %dms, Partner: %dms", Integer.valueOf(this.f149787r.f123814s0), Integer.valueOf(this.f149787r.f123816t0), Integer.valueOf(this.f149787r.f123800l0), Integer.valueOf(this.f149787r.f123802m0));
                String str9 = "";
                if (TextUtils.isEmpty(this.f149787r.f123798k0)) {
                    str = "";
                } else {
                    str = "\nP2P:" + this.f149787r.f123798k0;
                }
                if (!TextUtils.isEmpty(this.f149787r.f123796j0)) {
                    str9 = "\nPartnerRtp:" + this.f149787r.f123796j0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(format);
                Object[] objArr = new Object[6];
                C25949m c25949m2 = this.f149787r;
                objArr[0] = c25949m2.f123794i0;
                objArr[1] = Integer.valueOf(c25949m2.f123812r0);
                C25949m c25949m3 = this.f149787r;
                objArr[2] = c25949m3.f123752F0 == 0 ? "UDP" : "TCP";
                objArr[3] = c25949m3.f123754G0 == 0 ? "UDP" : "TCP";
                objArr[4] = str9;
                objArr[5] = str;
                sb2.append(String.format("\nRtp: %s (Cache: %d, %s - %s)%s%s", objArr));
                this.f149789t.setText(sb2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m157176v(C22592c c22592c) {
        String str;
        if (c22592c.m116854J() || c22592c.m116838B()) {
            this.f149791v.setText(Html.fromHtml(String.format("BitrateAll: %s:%d Kb/s,%s:%d Kb/s", "&#9650", Integer.valueOf(this.f149787r.f123785e), "&#9660", Integer.valueOf(this.f149787r.f123783d))));
            String format = String.format("Aud: %s:%d Kb(%dpk)-(%d),%s:%d Kb(%dpk)-(%d) EncMs: %d", "&#9650", Integer.valueOf(this.f149787r.f123791h), Integer.valueOf(this.f149787r.f123775Y), Integer.valueOf(this.f149787r.f123766P), "&#9660", Integer.valueOf(this.f149787r.f123789g), Integer.valueOf(this.f149787r.f123778a0), Integer.valueOf(this.f149787r.f123767Q), Integer.valueOf(this.f149787r.f123825y));
            if (!AbstractC32273e3.f148886z) {
                format = format + String.format("<br>NACK: Req:%d, Sent:%d (%dKb), FEC: up:%dKb, dw:%dKb, BWE: %d", Integer.valueOf(this.f149787r.f123749E), Integer.valueOf(this.f149787r.f123753G), Integer.valueOf(this.f149787r.f123757I), Integer.valueOf(this.f149787r.f123759J), Integer.valueOf(this.f149787r.f123761K), Integer.valueOf(this.f149787r.f123771U));
            }
            String str2 = format + String.format("<br>Rtt:%dms, Loss: local: %d%%, remote: %d%%, num: %d", Integer.valueOf(this.f149787r.f123790g0), Integer.valueOf(this.f149787r.f123819v), Integer.valueOf(this.f149787r.f123821w), Integer.valueOf(this.f149787r.f123823x));
            if (this.f149787r.f123818u0 > 0) {
                str2 = str2 + String.format("<br>FEC: run:%d (%d:%d), Recv:%d, befLoss: %d%%, afLoss: %d%% <br>maxDur:%d, recover:%d", Integer.valueOf(this.f149787r.f123820v0), Integer.valueOf(this.f149787r.f123822w0), Integer.valueOf(this.f149787r.f123824x0), Integer.valueOf(this.f149787r.f123826y0), Integer.valueOf(this.f149787r.f123828z0), Integer.valueOf(this.f149787r.f123742A0), Integer.valueOf(this.f149787r.f123744B0), Integer.valueOf(this.f149787r.f123750E0));
            }
            this.f149788s.setText(Html.fromHtml(str2));
            String str3 = (String.format("Vid: %s:%d Kb/s(%dpkts),%s:%d Kb/s(%dpkts)", "&#9650", Integer.valueOf(this.f149787r.f123793i), Integer.valueOf(this.f149787r.f123776Z), "&#9660", Integer.valueOf(this.f149787r.f123787f), Integer.valueOf(this.f149787r.f123780b0)) + String.format("<br>Rtt:%dms NACK: Req:%d, Sent:%d(%dKb)", Integer.valueOf(this.f149787r.f123792h0), Integer.valueOf(this.f149787r.f123747D), Integer.valueOf(this.f149787r.f123751F), Integer.valueOf(this.f149787r.f123755H))) + String.format("<br>BWE: send:%d, rem:%d, Real: %d, audDelay: %d, vDelay: %d", Integer.valueOf(this.f149787r.f123768R), Integer.valueOf(this.f149787r.f123770T), Integer.valueOf(this.f149787r.f123769S), Integer.valueOf(this.f149787r.f123779b), Integer.valueOf(this.f149787r.f123781c));
            C25949m c25949m = this.f149787r;
            String str4 = c25949m.f123807p == 5 ? "H265" : "H264";
            String str5 = c25949m.f123811r == 1 ? "Hw" : "Sw";
            String str6 = c25949m.f123809q == 5 ? "H265" : "H264";
            String str7 = c25949m.f123813s == 1 ? "Hw" : "Sw";
            this.f149790u.setText(Html.fromHtml((str3 + String.format("<br>Enc: %s(%s), KeyF:%d, Time:%dms Delay:%dms<br> EncFps:%d(%dx%d), capFps:%d(%dx%d)", str4, str5, Integer.valueOf(this.f149787r.f123806o0), Integer.valueOf(this.f149787r.f123803n), Integer.valueOf(this.f149787r.f123815t), Integer.valueOf(this.f149787r.f123765O), Integer.valueOf(this.f149787r.f123773W), Integer.valueOf(this.f149787r.f123772V), Integer.valueOf(this.f149787r.f123764N), Integer.valueOf(this.f149787r.f123763M), Integer.valueOf(this.f149787r.f123762L))) + String.format("<br>Dec: %s(%s), KeyF:%d, Time:%dms <br> RenFps:%d(%dx%d), queue:%d, remoteFps:%d", str6, str7, Integer.valueOf(this.f149787r.f123808p0), Integer.valueOf(this.f149787r.f123805o), Integer.valueOf(this.f149787r.f123827z), Integer.valueOf(this.f149787r.f123743B), Integer.valueOf(this.f149787r.f123741A), Integer.valueOf(this.f149787r.f123745C), Integer.valueOf(this.f149787r.f123804n0))));
            this.f149790u.setVisibility(0);
            String format2 = String.format("Level: In: %d, out: %d, Frame: Local: %dms, Partner: %dms", Integer.valueOf(this.f149787r.f123814s0), Integer.valueOf(this.f149787r.f123816t0), Integer.valueOf(this.f149787r.f123800l0), Integer.valueOf(this.f149787r.f123802m0));
            String str8 = "";
            if (TextUtils.isEmpty(this.f149787r.f123798k0)) {
                str = "";
            } else {
                str = "\nP2P:" + this.f149787r.f123798k0;
            }
            if (!TextUtils.isEmpty(this.f149787r.f123796j0)) {
                str8 = "\nPartnerRtp:" + this.f149787r.f123796j0;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format2);
            Object[] objArr = new Object[6];
            C25949m c25949m2 = this.f149787r;
            objArr[0] = c25949m2.f123794i0;
            objArr[1] = Integer.valueOf(c25949m2.f123812r0);
            C25949m c25949m3 = this.f149787r;
            objArr[2] = c25949m3.f123752F0 == 0 ? "UDP" : "TCP";
            objArr[3] = c25949m3.f123754G0 == 0 ? "UDP" : "TCP";
            objArr[4] = str8;
            objArr[5] = str;
            sb2.append(String.format("\nRtp: %s (Cache: %d, %s - %s)%s%s", objArr));
            this.f149789t.setText(sb2.toString());
        }
    }

    /* renamed from: w */
    private void m157177w() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f149794y;
        if (keyEventCallbackC17462c == null) {
            return;
        }
        ((EditText) keyEventCallbackC17462c.m92864h(AbstractC6918a0.edit_text_fps)).setText(Integer.toString(this.f149778A.f123685d));
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_video_bitrate)).setText(Integer.toString(this.f149778A.f123684c));
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_bitrate)).setText(Integer.toString(this.f149778A.f123689h));
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_sample_rate)).setText(Integer.toString(this.f149778A.f123690i));
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_channel)).setText(Integer.toString(this.f149778A.f123691j));
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_encode_res)).setText(Integer.toString(this.f149778A.f123687f));
        ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_bw_estimate)).setChecked(this.f149778A.f123692k);
        ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_audio_nack)).setChecked(this.f149778A.f123688g);
        ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_video_nack)).setChecked(this.f149778A.f123686e);
        m157183x(!this.f149778A.f123692k);
    }

    /* renamed from: A */
    public void m157178A(String str, final C22626t c22626t) {
        if (!TextUtils.isEmpty(str) && this.f149787r != null && c22626t != null) {
            if ((!c22626t.m117126k0() && !c22626t.m117082Z()) || !this.f149787r.m133685a(str)) {
                return;
            }
            post(new Runnable() { // from class: vo0.j6
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallDebug.this.m157175u(c22626t);
                }
            });
        }
    }

    /* renamed from: B */
    public void m157179B(String str, final C22592c c22592c) {
        if (!TextUtils.isEmpty(str) && this.f149787r != null && c22592c != null) {
            if ((!c22592c.m116854J() && !c22592c.m116838B()) || !this.f149787r.m133685a(str)) {
                return;
            }
            post(new Runnable() { // from class: vo0.k6
                @Override // java.lang.Runnable
                public final void run() {
                    ZmInCallDebug.this.m157176v(c22592c);
                }
            });
        }
    }

    /* renamed from: i */
    void m157180i() {
        try {
            this.f149778A.f123685d = Integer.parseInt(((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_fps)).getText().toString());
        } catch (NumberFormatException e11) {
            AbstractC20110a.m104539h(e11);
        }
        try {
            this.f149778A.f123684c = Integer.parseInt(((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_video_bitrate)).getText().toString());
        } catch (NumberFormatException e12) {
            AbstractC20110a.m104539h(e12);
        }
        try {
            this.f149778A.f123689h = Integer.parseInt(((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_bitrate)).getText().toString());
        } catch (NumberFormatException e13) {
            AbstractC20110a.m104539h(e13);
        }
        try {
            this.f149778A.f123690i = Integer.parseInt(((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_sample_rate)).getText().toString());
        } catch (NumberFormatException e14) {
            AbstractC20110a.m104539h(e14);
        }
        try {
            this.f149778A.f123691j = Integer.parseInt(((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_channel)).getText().toString());
        } catch (NumberFormatException e15) {
            AbstractC20110a.m104539h(e15);
        }
        try {
            this.f149778A.f123687f = Integer.parseInt(((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_encode_res)).getText().toString());
        } catch (NumberFormatException e16) {
            AbstractC20110a.m104539h(e16);
        }
        this.f149778A.f123692k = ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_bw_estimate)).isChecked();
        this.f149778A.f123688g = ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_audio_nack)).isChecked();
        this.f149778A.f123686e = ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_video_nack)).isChecked();
        String m133649a = this.f149778A.m133649a();
        AbstractC3082b0.m15421c("ZmInCallDebug", "Set dev config:" + m133649a);
        HandlerC32324p.m156351d(new C32448c(m133649a));
    }

    /* renamed from: j */
    TextView m157181j() {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-1, -2);
        m15701d.topMargin = AbstractC3104p.m15650a(5.0f);
        textView.setLayoutParams(m15701d);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        textView.setBackgroundColor(getResources().getColor(AbstractC16801x.black_30));
        textView.setPadding(AbstractC3104p.m15650a(5.0f), 0, 0, 0);
        return textView;
    }

    /* renamed from: l */
    void m157182l() {
        if (this.f149794y != null) {
            return;
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c = new KeyEventCallbackC17462c(getContext(), R.style.Theme.Material.Light);
        this.f149794y = keyEventCallbackC17462c;
        keyEventCallbackC17462c.mo43148J("Setting");
        this.f149794y.m92850A(AbstractC7409c0.setting_dialog);
        m157177w();
        ((Button) this.f149794y.m92864h(AbstractC6918a0.button_save)).setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.button_cancel)).setOnClickListener(this);
        ((CheckBox) this.f149794y.m92864h(AbstractC6918a0.checkbox_bw_estimate)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vo0.l6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                ZmInCallDebug.this.m157169m(compoundButton, z11);
            }
        });
        ((Button) this.f149794y.m92864h(AbstractC6918a0.btn_off_h265_local)).setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.btn_off_h265_remote)).setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.btn_toogle_FEC)).setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.btn_reset_device)).setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.btn_toggle_server)).setOnClickListener(new View.OnClickListener() { // from class: vo0.m6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZmInCallDebug.this.m157170n(view);
            }
        });
        TextView textView = (TextView) this.f149794y.m92864h(AbstractC6918a0.agc_tv);
        this.f149793x = textView;
        textView.setText(m157168k(9));
        SeekBar seekBar = (SeekBar) this.f149794y.m92864h(AbstractC6918a0.agc_seekbar);
        this.f149792w = seekBar;
        seekBar.setMax(90);
        this.f149792w.setProgress(9);
        this.f149792w.setOnSeekBarChangeListener(new C32447b());
        m157185z();
        this.f149780C = C17843b.m94137o().m94176g();
        Button button = (Button) this.f149794y.m92864h(AbstractC6918a0.aec_internal_btn);
        button.setTransformationMethod(null);
        int i11 = this.f149780C;
        if (i11 >= 0) {
            String[] strArr = this.f149785p;
            if (i11 < strArr.length) {
                button.setText(strArr[i11]);
            }
        }
        button.setOnClickListener(this);
        this.f149781D = C17843b.m94137o().m94174f();
        Button button2 = (Button) this.f149794y.m92864h(AbstractC6918a0.aec_external_btn);
        button2.setTransformationMethod(null);
        int i12 = this.f149781D;
        if (i12 >= 0) {
            String[] strArr2 = this.f149785p;
            if (i12 < strArr2.length) {
                button2.setText(strArr2[i12]);
            }
        }
        button2.setOnClickListener(this);
        this.f149782E = C17843b.m94137o().m94197r();
        Button button3 = (Button) this.f149794y.m92864h(AbstractC6918a0.ns_btn);
        button3.setTransformationMethod(null);
        int i13 = this.f149782E;
        if (i13 >= 0 && i13 < this.f149786q.length) {
            button3.setText(this.f149785p[i13]);
        }
        button3.setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.rs_encoder_btn)).setOnClickListener(this);
        ((Button) this.f149794y.m92864h(AbstractC6918a0.fb_encoder_btn)).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.aec_internal_btn) {
            new C32455j(this.f149779B, this.f149785p, this.f149780C, new InterfaceC32454i() { // from class: zm.voip.ui.incall.g
                @Override // zm.voip.p721ui.incall.ZmInCallDebug.InterfaceC32454i
                /* renamed from: a */
                public final void mo157186a(int i11) {
                    ZmInCallDebug.this.m157172q(view, i11);
                }
            }).m92830a().mo13822K();
            return;
        }
        if (id2 == AbstractC6918a0.aec_external_btn) {
            new C32455j(this.f149779B, this.f149785p, this.f149781D, new InterfaceC32454i() { // from class: zm.voip.ui.incall.h
                @Override // zm.voip.p721ui.incall.ZmInCallDebug.InterfaceC32454i
                /* renamed from: a */
                public final void mo157186a(int i11) {
                    ZmInCallDebug.this.m157173r(view, i11);
                }
            }).m92830a().mo13822K();
            return;
        }
        if (id2 == AbstractC6918a0.ns_btn) {
            new C32455j(this.f149779B, this.f149786q, this.f149782E, new InterfaceC32454i() { // from class: zm.voip.ui.incall.i
                @Override // zm.voip.p721ui.incall.ZmInCallDebug.InterfaceC32454i
                /* renamed from: a */
                public final void mo157186a(int i11) {
                    ZmInCallDebug.this.m157174s(view, i11);
                }
            }).m92830a().mo13822K();
            return;
        }
        if (id2 == AbstractC6918a0.button_save) {
            m157180i();
            this.f149794y.mo88281l();
            return;
        }
        if (id2 == AbstractC6918a0.button_cancel) {
            this.f149794y.mo88281l();
            return;
        }
        if (id2 == AbstractC6918a0.btn_off_h265_local) {
            HandlerC32324p.m156351d(new C32449d());
            view.setEnabled(false);
            return;
        }
        if (id2 == AbstractC6918a0.btn_off_h265_remote) {
            HandlerC32324p.m156351d(new C32450e());
            view.setEnabled(false);
            return;
        }
        if (id2 != AbstractC6918a0.btn_toogle_FEC) {
            if (id2 == AbstractC6918a0.btn_reset_device) {
                HandlerC32324p.m156351d(new C32451f());
            } else if (id2 == AbstractC6918a0.rs_encoder_btn) {
                HandlerC32324p.m156351d(new C32452g());
            } else if (id2 == AbstractC6918a0.fb_encoder_btn) {
                HandlerC32324p.m156351d(new C32453h());
            }
        }
    }

    /* renamed from: x */
    void m157183x(boolean z11) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f149794y;
        if (keyEventCallbackC17462c == null) {
            return;
        }
        ((EditText) keyEventCallbackC17462c.m92864h(AbstractC6918a0.edit_text_fps)).setEnabled(z11);
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_video_bitrate)).setEnabled(z11);
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_encode_res)).setEnabled(z11);
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_bitrate)).setEnabled(z11);
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_sample_rate)).setEnabled(z11);
        ((EditText) this.f149794y.m92864h(AbstractC6918a0.edit_text_audio_channel)).setEnabled(z11);
    }

    /* renamed from: y */
    public void m157184y() {
        if (getVisibility() == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    /* renamed from: z */
    public void m157185z() {
        if (this.f149795z) {
            return;
        }
        this.f149795z = true;
        int m94178h = C17843b.m94137o().m94178h();
        SeekBar seekBar = this.f149792w;
        if (seekBar != null && this.f149793x != null) {
            seekBar.setProgress(m94178h);
            this.f149793x.setText(m157168k(m94178h));
        }
    }
}
