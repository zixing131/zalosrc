package a50;

import a50.ViewOnClickListenerC0139g;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ViewSwitcher;
import au.AbstractC2366p0;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import c50.C3295f;
import c50.C3297h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p297kd.C21688c;
import p297kd.C21690e;
import p320ld.C22438j;
import p320ld.C22442n;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.AbstractC23775p0;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28618c;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.C28624i;
import sc.C26220b;
import si.C26263i;
import ui0.C27280g;

/* renamed from: a50.g */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC0139g implements View.OnClickListener, SyncBannerCommonView.InterfaceC11142a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f718A;

    /* renamed from: B */
    private int f719B;

    /* renamed from: C */
    private final Handler f720C;

    /* renamed from: D */
    private C21690e f721D;

    /* renamed from: p */
    private ViewGroup f722p;

    /* renamed from: q */
    private ZaloView f723q;

    /* renamed from: r */
    private final b f724r;

    /* renamed from: s */
    private ViewSwitcher f725s;

    /* renamed from: t */
    private RelativeLayout f726t;

    /* renamed from: u */
    private ProgressBar f727u;

    /* renamed from: v */
    private RobotoTextView f728v;

    /* renamed from: w */
    private SyncBannerCommonView f729w;

    /* renamed from: x */
    private ImageView f730x;

    /* renamed from: y */
    private final C3295f f731y;

    /* renamed from: z */
    private boolean f732z;

    /* renamed from: a50.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public static final void m599d() {
            AbstractC23309i.m121694Zw(true);
        }

        /* renamed from: e */
        public static final void m600e() {
            C28624i.Companion.m143166a().m143165j("PC_TRANSFER", false);
        }

        /* renamed from: f */
        private final boolean m601f(int i11) {
            if (C22447s.m116022Z(i11) || C22447s.f109797a.m116072X(i11) || i11 == 1) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        private final boolean m602g(C21690e c21690e) {
            if (C22447s.m116022Z(c21690e.f105269f) || AbstractC23309i.m122012iA()) {
                return false;
            }
            if ((C22447s.m116021W(c21690e.f105269f) && !C22447s.f109797a.m116073Y(c21690e.f105269f) && C26263i.m135055u().m135071M()) || c21690e.m143170d(AbstractC23309i.m120934Fc()) || c21690e.m143171e() || c21690e.mo96995c()) {
                return false;
            }
            if (!C22447s.m116048n(c21690e) && !m601f(c21690e.f105269f)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m603c(AbstractC28627l abstractC28627l, boolean z11) {
            AbstractC19074t.m100208f(abstractC28627l, "message");
            if (abstractC28627l.m143180c()) {
                if (abstractC28627l instanceof C21688c.c) {
                    return true;
                }
                if (!(abstractC28627l instanceof C21688c.b)) {
                    return false;
                }
                C21688c.b bVar = (C21688c.b) abstractC28627l;
                if (C22447s.f109797a.m116073Y(bVar.m111856g()) && C26263i.m135055u().m135071M()) {
                    return true;
                }
                if (C22447s.m116021W(bVar.m111856g()) && C26263i.m135055u().m135071M()) {
                    return false;
                }
                return m601f(bVar.m111856g());
            }
            if (abstractC28627l.m143178a() == null) {
                return false;
            }
            if (z11) {
                C21688c.Companion.m111854a().m111850w();
                AbstractC0924m0.m2934Bd(false);
                if (abstractC28627l instanceof C21688c.b) {
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: a50.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC0139g.a.m599d();
                        }
                    });
                } else if (abstractC28627l instanceof C21688c.c) {
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: a50.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC0139g.a.m600e();
                        }
                    });
                }
                return false;
            }
            if (abstractC28627l instanceof C21688c.b) {
                if (!(abstractC28627l.m143178a() instanceof C21690e)) {
                    return false;
                }
                AbstractC28626k m143178a = abstractC28627l.m143178a();
                AbstractC19074t.m100206d(m143178a, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncSessionInfo");
                return m602g((C21690e) m143178a);
            }
            if (abstractC28627l instanceof C21688c.c) {
                AbstractC28626k m143178a2 = abstractC28627l.m143178a();
                AbstractC19074t.m100205c(m143178a2);
                if (m143178a2.m143171e()) {
                    AbstractC28626k m143178a3 = abstractC28627l.m143178a();
                    AbstractC19074t.m100205c(m143178a3);
                    if (!m143178a3.m143170d(AbstractC23309i.m120934Fc())) {
                        return true;
                    }
                }
                AbstractC28626k m143178a4 = abstractC28627l.m143178a();
                AbstractC19074t.m100205c(m143178a4);
                if (m143178a4.mo96995c()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a50.g$b */
    /* loaded from: classes5.dex */
    public interface b {
        void onDismiss();
    }

    /* renamed from: a50.g$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC2366p0 {

        /* renamed from: d */
        final /* synthetic */ int f733d;

        /* renamed from: e */
        final /* synthetic */ ViewOnClickListenerC0139g f734e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, ViewOnClickListenerC0139g viewOnClickListenerC0139g, Handler handler) {
            super(300L, ZAbstractBase.ZVU_BLEND_PERCENTAGE, handler);
            this.f733d = i11;
            this.f734e = viewOnClickListenerC0139g;
        }

        @Override // au.AbstractC2366p0
        /* renamed from: a */
        public void mo604a() {
            InterfaceC27218a m92676n2;
            C17487o0 mo35579p;
            InterfaceC27218a m92676n22;
            C17487o0 mo35579p2;
            if (this.f733d == AbstractC6918a0.rl_progress) {
                if (this.f734e.f719B != 1) {
                    int unused = this.f734e.f719B;
                } else {
                    AbstractC23647d.m123897g("5580121");
                    ZaloView m594k = this.f734e.m594k();
                    if (m594k != null && (m92676n22 = m594k.m92676n2()) != null && (mo35579p2 = m92676n22.mo35579p()) != null) {
                        C22438j.m115953v(mo35579p2, null);
                    }
                }
            }
            if (this.f733d == AbstractC6918a0.banner_result) {
                if (this.f734e.f719B == 1) {
                    C21690e c21690e = this.f734e.f721D;
                    if (c21690e == null) {
                        AbstractC19074t.m100223u("sessionInfo");
                        c21690e = null;
                    }
                    if (c21690e.m143172f()) {
                        try {
                            AbstractC23647d.m123897g("5580121");
                            ZaloView m594k2 = this.f734e.m594k();
                            if (m594k2 != null && (m92676n2 = m594k2.m92676n2()) != null && (mo35579p = m92676n2.mo35579p()) != null) {
                                C22438j.m115953v(mo35579p, null);
                            }
                            this.f734e.m579l();
                            return;
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                            return;
                        }
                    }
                    ViewOnClickListenerC0139g viewOnClickListenerC0139g = this.f734e;
                    viewOnClickListenerC0139g.mo596x9(viewOnClickListenerC0139g.f729w.getSyncCommonAction(), this.f734e.m593j());
                    return;
                }
                int unused2 = this.f734e.f719B;
            }
        }
    }

    /* renamed from: a50.g$d */
    /* loaded from: classes5.dex */
    public static final class d extends ClickableSpan {
        d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC23306f.m120585H1().m16679D();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(ViewOnClickListenerC0139g.this.f729w.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    public ViewOnClickListenerC0139g(ViewGroup viewGroup, ZaloView zaloView, b bVar) {
        AbstractC19074t.m100208f(viewGroup, "view");
        AbstractC19074t.m100208f(bVar, "dismissRootListener");
        this.f722p = viewGroup;
        this.f723q = zaloView;
        this.f724r = bVar;
        this.f731y = new C3295f(null, 0, 0, 0, 0, 31, null);
        this.f732z = true;
        this.f720C = new Handler(Looper.getMainLooper());
        View findViewById = this.f722p.findViewById(AbstractC6918a0.vs_progress_result);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById;
        this.f725s = viewSwitcher;
        viewSwitcher.setMeasureAllChildren(false);
        View findViewById2 = this.f722p.findViewById(AbstractC6918a0.rl_progress);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById2;
        this.f726t = relativeLayout;
        relativeLayout.setOnClickListener(this);
        View findViewById3 = this.f722p.findViewById(AbstractC6918a0.progress_state);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        this.f727u = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(C23212s8.m119607o(progressBar.getContext(), AbstractC16781w.AppPrimaryColor), PorterDuff.Mode.SRC_IN);
        View findViewById4 = this.f722p.findViewById(AbstractC6918a0.msg_state);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f728v = (RobotoTextView) findViewById4;
        View findViewById5 = this.f722p.findViewById(AbstractC6918a0.banner_result);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        SyncBannerCommonView syncBannerCommonView = (SyncBannerCommonView) findViewById5;
        this.f729w = syncBannerCommonView;
        syncBannerCommonView.setOnSyncBannerListener(this);
        syncBannerCommonView.setMovementMethod(null);
        syncBannerCommonView.setOnClickListener(this);
        View findViewById6 = this.f722p.findViewById(AbstractC6918a0.icon_state);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f730x = (ImageView) findViewById6;
    }

    /* renamed from: i */
    private final int m578i(int i11) {
        if (i11 == 1) {
            return 10;
        }
        if (i11 == 2) {
            return 45;
        }
        if (i11 != 3) {
            return i11 != 4 ? 0 : 80;
        }
        return 60;
    }

    /* renamed from: l */
    public final void m579l() {
        this.f724r.onDismiss();
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: a50.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC0139g.m580m();
            }
        });
    }

    /* renamed from: m */
    public static final void m580m() {
        AbstractC23309i.m121694Zw(true);
        AbstractC23775p0.m124197b("db");
    }

    /* renamed from: n */
    public static final void m581n() {
        C28624i.Companion.m143166a().m143165j("PC_TRANSFER", false);
    }

    /* renamed from: o */
    private final void m582o(C21690e c21690e) {
        C17487o0 m92662fJ;
        C26220b.m134826i("SMLHomeSyncHandler", "onRestoreFinish(): sessionInfo=" + c21690e, null, 4, null);
        ZaloView zaloView = this.f723q;
        if (zaloView != null && (m92662fJ = zaloView.m92662fJ()) != null) {
            AbstractC23306f.m120564A1().m105694c(m92662fJ);
        }
    }

    /* renamed from: p */
    private final boolean m583p(int i11) {
        if (this.f718A == i11) {
            return false;
        }
        this.f718A = i11;
        return true;
    }

    /* renamed from: q */
    private final boolean m584q(int i11) {
        if (i11 == this.f719B) {
            return false;
        }
        this.f719B = i11;
        return true;
    }

    /* renamed from: r */
    private final void m585r() {
        if (this.f725s.getDisplayedChild() != 0) {
            this.f725s.setDisplayedChild(0);
        }
        m591y();
    }

    /* renamed from: s */
    private final void m586s() {
        if (this.f725s.getDisplayedChild() != 1) {
            this.f725s.setDisplayedChild(1);
        }
        m591y();
    }

    /* renamed from: u */
    private final void m587u(C21688c.b bVar) {
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.m104564x("SMLHomeSyncHandler").mo104548a("handleSyncState: %s", Integer.valueOf(bVar.f132722a));
        if (!(bVar.m143178a() instanceof C21690e)) {
            aVar.mo104551d("[updateSyncStatus] Session info is null", new Object[0]);
            this.f724r.onDismiss();
            return;
        }
        this.f729w.setTransferMsg(false);
        AbstractC28626k m143178a = bVar.m143178a();
        AbstractC19074t.m100206d(m143178a, "null cannot be cast to non-null type com.zing.zalo.backuprestore.model.SyncSessionInfo");
        this.f721D = (C21690e) m143178a;
        m584q(1);
        int i11 = bVar.f105263d;
        int i12 = bVar.f132722a;
        boolean z11 = bVar.f105265f;
        ImageView imageView = this.f730x;
        Context context = imageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        imageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_backup_solid_24, AbstractC2807a.accent_blue_icon));
        C21690e c21690e = null;
        if (i12 > 0 && i12 <= 17) {
            C21690e c21690e2 = this.f721D;
            if (c21690e2 == null) {
                AbstractC19074t.m100223u("sessionInfo");
                c21690e2 = null;
            }
            int m115991A = C22447s.m115991A(c21690e2, bVar.m111856g());
            switch (i12) {
                case 12:
                case 13:
                case 15:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    aVar.mo104548a("phaseName=%s", C22447s.m116000F(i12));
                    return;
                case 14:
                default:
                    if (i12 == 17) {
                        C21690e c21690e3 = this.f721D;
                        if (c21690e3 == null) {
                            AbstractC19074t.m100223u("sessionInfo");
                            c21690e3 = null;
                        }
                        m582o(c21690e3);
                    }
                    this.f722p.setVisibility(0);
                    m585r();
                    if (i11 >= 0) {
                        if (i11 > 100) {
                            try {
                                C19067n0 c19067n0 = C19067n0.f94947a;
                                String format = String.format("Bug progress over 100 - (%d) - %d", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i11)}, 2));
                                AbstractC19074t.m100207e(format, "format(...)");
                                C26220b.m134826i("SMLHomeSyncHandler", format, null, 4, null);
                                return;
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                                return;
                            }
                        }
                        String m115989e = C22442n.m115989e(i12, m115991A, z11);
                        this.f727u.setIndeterminate(false);
                        C3297h.f14104a.m16745m(this.f727u, i11);
                        String str = m115989e + " " + i11 + "%";
                        this.f728v.setText(str);
                        aVar.mo104548a("updateSyncStatus phase= " + i12 + ", phaseName=" + str, new Object[0]);
                        return;
                    }
                    String m115989e2 = C22442n.m115989e(i12, m115991A, z11);
                    this.f727u.setIndeterminate(true);
                    this.f728v.setText(m115989e2);
                    aVar.mo104548a("updateSyncStatus phase= " + i12 + ", phaseName=" + m115989e2, new Object[0]);
                    return;
            }
        }
        if (i12 == 0) {
            C21690e c21690e4 = this.f721D;
            if (c21690e4 == null) {
                AbstractC19074t.m100223u("sessionInfo");
                c21690e4 = null;
            }
            int i13 = c21690e4.f105269f;
            C21690e c21690e5 = this.f721D;
            if (c21690e5 == null) {
                AbstractC19074t.m100223u("sessionInfo");
                c21690e5 = null;
            }
            if (c21690e5.m143172f()) {
                if (AbstractC0924m0.m3477U5() == 1 && this.f732z) {
                    AbstractC0924m0.m4385yo(2);
                    this.f724r.onDismiss();
                    return;
                }
                if (AbstractC0924m0.m3477U5() == 2) {
                    this.f724r.onDismiss();
                    return;
                }
                C3297h.m16732b(this.f729w, 1);
                this.f731y.m16724f();
                C21690e c21690e6 = this.f721D;
                if (c21690e6 == null) {
                    AbstractC19074t.m100223u("sessionInfo");
                } else {
                    c21690e = c21690e6;
                }
                String m115985a = C22442n.m115985a(c21690e);
                ImageView imageView2 = this.f730x;
                Context context2 = imageView2.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                imageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_backup_success_solid_24, AbstractC2807a.success_icon));
                this.f731y.m16729k(m115985a);
                this.f729w.m58393f(this.f731y);
                this.f722p.setVisibility(0);
                m586s();
                aVar.mo104548a(m115985a, new Object[0]);
                if (AbstractC0924m0.m3477U5() != 1) {
                    AbstractC0924m0.m4385yo(1);
                }
            } else {
                C21690e c21690e7 = this.f721D;
                if (c21690e7 == null) {
                    AbstractC19074t.m100223u("sessionInfo");
                    c21690e7 = null;
                }
                int m115997D = C22447s.m115997D(c21690e7);
                if (m115997D == 0) {
                    this.f724r.onDismiss();
                    return;
                }
                int m115993B = C22447s.m115993B(i13);
                C21690e c21690e8 = this.f721D;
                if (c21690e8 == null) {
                    AbstractC19074t.m100223u("sessionInfo");
                    c21690e8 = null;
                }
                C21690e c21690e9 = this.f721D;
                if (c21690e9 == null) {
                    AbstractC19074t.m100223u("sessionInfo");
                    c21690e9 = null;
                }
                int m115991A2 = C22447s.m115991A(c21690e8, c21690e9.f105269f);
                C21690e c21690e10 = this.f721D;
                if (c21690e10 == null) {
                    AbstractC19074t.m100223u("sessionInfo");
                    c21690e10 = null;
                }
                String m115988d = C22442n.m115988d(m115993B, m115997D, 1, m115991A2, c21690e10.m111869G());
                C21690e c21690e11 = this.f721D;
                if (c21690e11 == null) {
                    AbstractC19074t.m100223u("sessionInfo");
                } else {
                    c21690e = c21690e11;
                }
                String m16738h = C3297h.m16738h(m115988d, c21690e);
                int m116061v = C22447s.m116061v(m115997D, m115993B);
                if (C22447s.m116056r0(m115997D)) {
                    C3297h.m16733c(this.f729w, 1);
                } else {
                    C3297h.m16731a(this.f729w, 1);
                }
                ImageView imageView3 = this.f730x;
                Context context3 = imageView3.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                imageView3.setImageDrawable(C27280g.m139660c(context3, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.accent_red_icon));
                this.f731y.m16724f();
                C3297h.m16737g(this.f731y, m16738h, m116061v);
                this.f729w.m58393f(this.f731y);
                this.f722p.setVisibility(0);
                m586s();
                aVar.mo104548a(m16738h, new Object[0]);
            }
            this.f732z = false;
            return;
        }
        aVar.mo104562v("wtf phase: %s", Integer.valueOf(i12));
        this.f724r.onDismiss();
    }

    /* renamed from: v */
    private final void m588v(C21688c.c cVar) {
        String string;
        int m127173b0;
        String m127114D;
        if (!AbstractC19074t.m100204b(cVar.m143179b(), CoreUtility.f89233i)) {
            this.f724r.onDismiss();
            return;
        }
        AbstractC20110a.f98889a.m104564x("SMLHomeSyncHandler").mo104548a("updateTransferStatus: %s", Integer.valueOf(cVar.f132722a));
        this.f729w.setTransferMsg(true);
        m584q(2);
        try {
            int i11 = cVar.f132722a;
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                    this.f722p.setVisibility(0);
                    m585r();
                    if (m583p(1)) {
                        ImageView imageView = this.f730x;
                        imageView.setImageResource(C23212s8.m119611s(imageView.getContext(), AbstractC16781w.ic_pc_transfer_progress));
                        ViewGroup viewGroup = this.f722p;
                        viewGroup.setBackgroundColor(C23212s8.m119607o(viewGroup.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                    }
                    int m578i = m578i(cVar.f132722a);
                    this.f727u.setIndeterminate(false);
                    this.f727u.setProgress(m578i);
                    this.f728v.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.transfer_message_in_progress) + " (" + m578i + "%)");
                    return;
                }
                return;
            }
            AbstractC28626k m143178a = cVar.m143178a();
            if (m143178a == null) {
                C26263i.m135034d0("Home Banner updateTransferStatus phase NONE but job result null");
                return;
            }
            if (m143178a.mo96995c()) {
                this.f724r.onDismiss();
                return;
            }
            this.f722p.setVisibility(0);
            m586s();
            boolean m143172f = m143178a.m143172f();
            this.f722p.post(new Runnable() { // from class: a50.c

                /* renamed from: q */
                public final /* synthetic */ boolean f717q;

                public /* synthetic */ RunnableC0135c(boolean m143172f2) {
                    r2 = m143172f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC0139g.m589w(ViewOnClickListenerC0139g.this, r2);
                }
            });
            if (m143172f2) {
                SyncBannerCommonView syncBannerCommonView = this.f729w;
                String string2 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.transfer_message_success);
                AbstractC19074t.m100207e(string2, "getString(...)");
                syncBannerCommonView.setMsgSpanned(string2);
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: a50.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0139g.m590x();
                    }
                });
                return;
            }
            AbstractC28618c m143169b = m143178a.m143169b();
            if (m143169b != null && m143169b.mo97004e()) {
                string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.transfer_message_error_network);
                AbstractC19074t.m100205c(string);
            } else {
                string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.transfer_message_error);
                AbstractC19074t.m100205c(string);
            }
            m127173b0 = AbstractC24342w.m127173b0(string, "#x#", 0, false, 6, null);
            m127114D = AbstractC24341v.m127114D(string, "#x#", " ", false, 4, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m127114D);
            spannableStringBuilder.setSpan(new d(), m127173b0 + 1, m127114D.length(), 33);
            this.f729w.setMovementMethod(CustomMovementMethod.m56305e());
            this.f729w.setMsgSpanned(spannableStringBuilder);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: w */
    public static final void m589w(ViewOnClickListenerC0139g viewOnClickListenerC0139g, boolean z11) {
        AbstractC19074t.m100208f(viewOnClickListenerC0139g, "this$0");
        viewOnClickListenerC0139g.f729w.setHasIconResult(true);
        viewOnClickListenerC0139g.f729w.setHasIconClose(true);
        if (z11) {
            if (viewOnClickListenerC0139g.m583p(2)) {
                SyncBannerCommonView syncBannerCommonView = viewOnClickListenerC0139g.f729w;
                syncBannerCommonView.setIconResultRes(C23212s8.m119611s(syncBannerCommonView.getContext(), AbstractC16781w.ic_pc_transfer_success));
                ViewGroup viewGroup = viewOnClickListenerC0139g.f722p;
                viewGroup.setBackgroundColor(C23212s8.m119607o(viewGroup.getContext(), AbstractC16781w.transfer_banner_success));
                return;
            }
            return;
        }
        if (viewOnClickListenerC0139g.m583p(3)) {
            SyncBannerCommonView syncBannerCommonView2 = viewOnClickListenerC0139g.f729w;
            syncBannerCommonView2.setIconResultRes(C23212s8.m119611s(syncBannerCommonView2.getContext(), AbstractC16781w.ic_pc_transfer_fail));
            ViewGroup viewGroup2 = viewOnClickListenerC0139g.f722p;
            viewGroup2.setBackgroundColor(C23212s8.m119607o(viewGroup2.getContext(), AbstractC16781w.transfer_banner_error));
        }
    }

    /* renamed from: x */
    public static final void m590x() {
        AbstractC0924m0.m2934Bd(true);
    }

    /* renamed from: y */
    private final void m591y() {
        View currentView = this.f725s.getCurrentView();
        if (currentView != null && currentView.getVisibility() != 0) {
            currentView.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
    /* renamed from: Rf */
    public void mo592Rf(View view) {
        AbstractC19074t.m100208f(view, "view");
        try {
            AbstractC23647d.m123897g("5580123");
            int i11 = this.f719B;
            if (i11 == 1) {
                AbstractC23647d.m123897g("5580123");
                m579l();
                C21690e m133053o = AbstractC23306f.m120692n().m133053o();
                if (m133053o != null && m133053o.m143172f()) {
                    m133053o.m143176k(true);
                }
            } else if (i11 == 2) {
                this.f724r.onDismiss();
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: a50.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0139g.m581n();
                    }
                });
                C21688c.Companion.m111854a().m111840C(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public final ViewGroup m593j() {
        return this.f722p;
    }

    /* renamed from: k */
    public final ZaloView m594k() {
        return this.f723q;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, "clickView");
        new c(view.getId(), this, this.f720C).m12383b();
    }

    /* renamed from: t */
    public final void m595t(AbstractC28627l abstractC28627l) {
        try {
            if (abstractC28627l instanceof C21688c.b) {
                AbstractC20110a.f98889a.m104564x("HOME-updateJobStatus").mo104548a("udpate sync status %d when Message view", Integer.valueOf(((C21688c.b) abstractC28627l).f132722a));
                m587u((C21688c.b) abstractC28627l);
            } else if (abstractC28627l instanceof C21688c.c) {
                AbstractC20110a.f98889a.m104564x("HOME-updateJobStatus").mo104548a("Messages View  - Transfer phase: %d", Integer.valueOf(((C21688c.c) abstractC28627l).f132722a));
                m588v((C21688c.c) abstractC28627l);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
    /* renamed from: x9 */
    public void mo596x9(int i11, View view) {
        InterfaceC27218a interfaceC27218a;
        AbstractC19074t.m100208f(view, "view");
        if (i11 == 3 || i11 == 4) {
            AbstractC23647d.m123897g("5580122");
        }
        ZaloView zaloView = this.f723q;
        InterfaceC27218a interfaceC27218a2 = null;
        if (zaloView != null) {
            interfaceC27218a = zaloView.m92676n2();
        } else {
            interfaceC27218a = null;
        }
        if (interfaceC27218a != null) {
            if (i11 == 2) {
                C22447s.f109797a.m116079z0("handle common action ADD_OR_UPDATE_ACCOUNT_GGDRIVE at HomeSyncProgressHandler");
                return;
            }
            ZaloView zaloView2 = this.f723q;
            if (zaloView2 != null) {
                interfaceC27218a2 = zaloView2.m92676n2();
            }
            C22447s.m116012N(i11, interfaceC27218a2, 1, 0, 8, null);
        }
    }
}
