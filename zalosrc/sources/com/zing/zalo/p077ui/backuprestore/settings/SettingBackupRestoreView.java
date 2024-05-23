package com.zing.zalo.p077ui.backuprestore.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.ZAppCompatImageView;
import b50.C2556d;
import c50.C3294e;
import c50.C3295f;
import c50.C3297h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.settings.SettingBackupRestoreView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessagePassManageView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageSetPassView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBackupInfoV2View;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncProcessorViewV2;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.PcSyncRequestView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.settingreminder.SettingReminderZinstantBanner;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import i30.C20223b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kn.AbstractC21777d;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p262jb.AbstractC21196a;
import p297kd.C21688c;
import p297kd.C21690e;
import p320ld.C22438j;
import p320ld.C22442n;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p421pc.C24720a;
import p484ri.C25804a;
import p484ri.C25806c;
import p525ti.C26701b;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p649xl.C29875jb;
import pm0.C24848g0;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import sc.C26220b;
import si.C26263i;
import x60.AbstractC29394g;
import z40.C31272h;
import z40.InterfaceC31258a;
import z40.InterfaceC31260b;

/* loaded from: classes5.dex */
public final class SettingBackupRestoreView extends SlidableZaloView implements InterfaceC31260b, InterfaceC28625j, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, SyncEmptyBackupView.InterfaceC11144a, SyncBannerCommonView.InterfaceC11142a, SyncProcessorViewV2.InterfaceC11147a, InterfaceC17463d.d {
    public static final C11119a Companion = new C11119a(null);

    /* renamed from: P0 */
    private C29875jb f55964P0;

    /* renamed from: Q0 */
    private View f55965Q0;

    /* renamed from: R0 */
    private View f55966R0;

    /* renamed from: S0 */
    private RobotoTextView f55967S0;

    /* renamed from: T0 */
    private SyncEmptyBackupView f55968T0;

    /* renamed from: U0 */
    private SyncProcessorViewV2 f55969U0;

    /* renamed from: V0 */
    private SyncBannerCommonView f55970V0;

    /* renamed from: W0 */
    private SyncBannerCommonView f55971W0;

    /* renamed from: X0 */
    private KeyEventCallbackC17462c f55972X0;

    /* renamed from: Y0 */
    private Rect f55973Y0;

    /* renamed from: Z0 */
    private final sh0 f55974Z0 = new sh0();

    /* renamed from: a1 */
    private final RunnableC11120b f55975a1 = new RunnableC11120b();

    /* renamed from: b1 */
    private InterfaceC31258a f55976b1;

    /* renamed from: c1 */
    private C11128a f55977c1;

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$a */
    /* loaded from: classes5.dex */
    public static final class C11119a {
        private C11119a() {
        }

        public /* synthetic */ C11119a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$b */
    /* loaded from: classes5.dex */
    private final class RunnableC11120b implements Runnable {

        /* renamed from: p */
        private int f55978p;

        /* renamed from: q */
        private int f55979q;

        /* renamed from: r */
        private int f55980r;

        /* renamed from: s */
        private int f55981s;

        /* renamed from: t */
        private C21690e f55982t;

        /* renamed from: u */
        private boolean f55983u = true;

        /* renamed from: v */
        private boolean f55984v;

        public RunnableC11120b() {
        }

        /* renamed from: a */
        private final void m58217a() {
            SettingBackupRestoreView.this.mo58195Y0();
            SettingBackupRestoreView.this.mo58191R1(3);
            SettingBackupRestoreView.this.m58161uN();
        }

        /* renamed from: b */
        public final void m58218b(C21688c.b bVar) {
            AbstractC19074t.m100208f(bVar, "syncStateMessage");
            this.f55978p = bVar.f105263d;
            this.f55979q = bVar.f132722a;
            this.f55980r = bVar.m111856g();
            this.f55981s = bVar.m111855f();
            this.f55984v = bVar.f105265f;
            AbstractC28626k m143178a = bVar.m143178a();
            if (m143178a != null) {
                C21690e c21690e = (C21690e) m143178a;
                this.f55982t = c21690e;
                this.f55983u = c21690e.m111898x();
            }
            AbstractC20110a.f98889a.mo104548a("SyncStateMessage=" + bVar, new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            C3294e c3294e;
            InterfaceC31258a interfaceC31258a = null;
            if (C22447s.m116035g0(this.f55979q)) {
                m58217a();
                int i11 = this.f55979q;
                if (i11 != 12 && i11 != 13 && i11 != 15 && i11 != 16) {
                    String m115989e = C22442n.m115989e(this.f55979q, C22447s.m115991A(this.f55982t, this.f55980r), this.f55984v);
                    int i12 = this.f55978p;
                    if (i12 >= 0) {
                        m115989e = m115989e + " " + i12 + "%";
                    }
                    AbstractC20110a.f98889a.mo104548a(C22447s.m116000F(this.f55979q) + ", actionType=" + this.f55981s + ", msgText=" + m115989e, new Object[0]);
                    SyncProcessorViewV2 syncProcessorViewV2 = SettingBackupRestoreView.this.f55969U0;
                    if (syncProcessorViewV2 != null) {
                        c3294e = syncProcessorViewV2.getSyncStateData();
                    } else {
                        c3294e = null;
                    }
                    C3297h.m16735e(c3294e, m115989e, this.f55978p);
                    SettingBackupRestoreView.this.m58095LN();
                }
            }
            int i13 = this.f55979q;
            if (i13 != 0) {
                switch (i13) {
                    case 17:
                        SettingBackupRestoreView.this.m58103PN(this.f55982t);
                        return;
                    case 18:
                        SettingBackupRestoreView.this.f72421L0.mo49282B8(C22442n.m115989e(18, this.f55980r, this.f55984v), false);
                        return;
                    case 19:
                        SettingBackupRestoreView.this.f72421L0.mo49282B8(C22442n.m115989e(19, this.f55980r, this.f55984v), false);
                        return;
                    case 20:
                        SettingBackupRestoreView.this.f72421L0.mo49315c4();
                        InterfaceC31258a interfaceC31258a2 = SettingBackupRestoreView.this.f55976b1;
                        if (interfaceC31258a2 == null) {
                            AbstractC19074t.m100223u("presenter");
                            interfaceC31258a2 = null;
                        }
                        interfaceC31258a2.mo152126I1();
                        SettingBackupRestoreView.this.mo58198g4("");
                        SettingBackupRestoreView.this.mo58197a4();
                        InterfaceC31258a interfaceC31258a3 = SettingBackupRestoreView.this.f55976b1;
                        if (interfaceC31258a3 == null) {
                            AbstractC19074t.m100223u("presenter");
                        } else {
                            interfaceC31258a = interfaceC31258a3;
                        }
                        interfaceC31258a.mo152162w1();
                        return;
                    case 21:
                        SettingBackupRestoreView.this.f72421L0.mo49315c4();
                        ToastUtils.showMess(true, C22442n.m115989e(21, this.f55980r, this.f55984v));
                        return;
                    case 22:
                        SettingBackupRestoreView.this.f72421L0.mo49315c4();
                        return;
                    default:
                        return;
                }
            }
            SettingBackupRestoreView.this.f72421L0.mo49315c4();
            InterfaceC31258a interfaceC31258a4 = SettingBackupRestoreView.this.f55976b1;
            if (interfaceC31258a4 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC31258a = interfaceC31258a4;
            }
            interfaceC31258a.mo152128K();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$c */
    /* loaded from: classes5.dex */
    public static final class C11121c implements SyncBannerCommonView.InterfaceC11142a {
        C11121c() {
        }

        @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
        /* renamed from: Rf */
        public void mo592Rf(View view) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC23306f.m120688m().m132986E(System.currentTimeMillis());
            SettingBackupRestoreView.this.mo58184M0();
        }

        @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
        /* renamed from: x9 */
        public void mo596x9(int i11, View view) {
            AbstractC19074t.m100208f(view, "view");
            SettingBackupRestoreView.this.mo58206r(i11, 1);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC11122d implements Runnable {

        /* renamed from: q */
        final /* synthetic */ View f55988q;

        RunnableC11122d(View view) {
            this.f55988q = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (!SettingBackupRestoreView.this.f55974Z0.m87411l(this.f55988q, this)) {
                    C11128a c11128a = SettingBackupRestoreView.this.f55977c1;
                    AbstractC19074t.m100205c(c11128a);
                    int m58221a = c11128a.m58221a();
                    C29875jb c29875jb = null;
                    if (m58221a == 58) {
                        C29875jb c29875jb2 = SettingBackupRestoreView.this.f55964P0;
                        if (c29875jb2 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29875jb2 = null;
                        }
                        linearLayout = c29875jb2.f138299C;
                    } else if (m58221a == 60) {
                        C29875jb c29875jb3 = SettingBackupRestoreView.this.f55964P0;
                        if (c29875jb3 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29875jb3 = null;
                        }
                        linearLayout = c29875jb3.f138303G;
                    } else if (m58221a == 112) {
                        C29875jb c29875jb4 = SettingBackupRestoreView.this.f55964P0;
                        if (c29875jb4 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29875jb4 = null;
                        }
                        linearLayout = c29875jb4.f138301E;
                    } else if (m58221a == 128) {
                        C29875jb c29875jb5 = SettingBackupRestoreView.this.f55964P0;
                        if (c29875jb5 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29875jb5 = null;
                        }
                        linearLayout = c29875jb5.f138300D;
                    } else {
                        linearLayout = null;
                    }
                    sh0 sh0Var = SettingBackupRestoreView.this.f55974Z0;
                    C29875jb c29875jb6 = SettingBackupRestoreView.this.f55964P0;
                    if (c29875jb6 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29875jb = c29875jb6;
                    }
                    HightLightSettingView hightLightSettingView = c29875jb.f138332w;
                    C11128a c11128a2 = SettingBackupRestoreView.this.f55977c1;
                    AbstractC19074t.m100205c(c11128a2);
                    sh0Var.m87409j(linearLayout, hightLightSettingView, c11128a2.m58222b());
                    SettingBackupRestoreView.this.m58130eN();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$e */
    /* loaded from: classes5.dex */
    public static final class C11123e extends ClickableSpan {
        C11123e() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            SettingBackupRestoreView.this.m58107RN();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                C29875jb c29875jb = SettingBackupRestoreView.this.f55964P0;
                if (c29875jb == null) {
                    AbstractC19074t.m100223u("binding");
                    c29875jb = null;
                }
                textPaint.setColor(C23212s8.m119607o(c29875jb.f138310N.getContext(), AbstractC16781w.AppPrimaryColor));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$f */
    /* loaded from: classes5.dex */
    public static final class C11124f extends C7145n.g {
        C11124f() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            try {
                ZaloView m92996E0 = SettingBackupRestoreView.this.f72421L0.m92649TI().m92996E0("Popup_delete_backup");
                if (m92996E0 != null) {
                    SettingBackupRestoreView.this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (i11 == AbstractC6918a0.option_delete_backup) {
                SettingBackupRestoreView.this.m58111TN();
            } else {
                super.mo36357a(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$g */
    /* loaded from: classes5.dex */
    static final class C11125g extends AbstractC19075u implements InterfaceC18494a {
        C11125g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m58219a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m58219a() {
            C29875jb c29875jb = SettingBackupRestoreView.this.f55964P0;
            InterfaceC31258a interfaceC31258a = null;
            if (c29875jb == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb = null;
            }
            c29875jb.f138329t.performClick();
            InterfaceC31258a interfaceC31258a2 = SettingBackupRestoreView.this.f55976b1;
            if (interfaceC31258a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC31258a = interfaceC31258a2;
            }
            interfaceC31258a.mo152158s2(true);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$h */
    /* loaded from: classes5.dex */
    static final class C11126h extends AbstractC19075u implements InterfaceC18494a {
        C11126h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m58220a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m58220a() {
            InterfaceC31258a interfaceC31258a = SettingBackupRestoreView.this.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo152148m2();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.SettingBackupRestoreView$i */
    /* loaded from: classes5.dex */
    public static final class C11127i implements AbstractC29394g.a {
        C11127i() {
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: a */
        public void mo57176a() {
            InterfaceC31258a interfaceC31258a = SettingBackupRestoreView.this.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo152132M();
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: b */
        public void mo57177b(int i11) {
            InterfaceC31258a interfaceC31258a = SettingBackupRestoreView.this.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo152157s0(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m58073AN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        settingBackupRestoreView.m58099NN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public static final void m58075BN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152123G1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m58077CN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152145g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public static final void m58079DN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        BaseZaloView baseZaloView = settingBackupRestoreView.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        interfaceC31258a.mo152154q3(baseZaloView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public static final void m58081EN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152140T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public static final void m58083FN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152147k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static final void m58085GN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152134N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public static final void m58087HN(final SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_SETTING_BACKUP", new Runnable() { // from class: z40.z
            @Override // java.lang.Runnable
            public final void run() {
                SettingBackupRestoreView.m58089IN(SettingBackupRestoreView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public static final void m58089IN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152129K1();
    }

    /* renamed from: JN */
    private final void m58091JN() {
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        AbstractC26084s.m134251H(c29875jb.f138299C, 58);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb3 = null;
        }
        AbstractC26084s.m134251H(c29875jb3.f138301E, 112);
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb4 = null;
        }
        AbstractC26084s.m134251H(c29875jb4.f138303G, 60);
        C29875jb c29875jb5 = this.f55964P0;
        if (c29875jb5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb5;
        }
        AbstractC26084s.m134251H(c29875jb2.f138300D, 128);
    }

    /* renamed from: KN */
    private final boolean m58093KN() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        if (c29875jb.f138323a0.getDisplayedChild() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public final void m58095LN() {
        SyncProcessorViewV2 syncProcessorViewV2 = this.f55969U0;
        if (syncProcessorViewV2 != null) {
            syncProcessorViewV2.m58412d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public static final void m58097MN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152136P2();
    }

    /* renamed from: NN */
    private final void m58099NN() {
        int[] iArr = new int[2];
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138330u.getLocationOnScreen(iArr);
        int m118742r = iArr[0] + AbstractC23136l9.m118742r(6.0f);
        int m118742r2 = iArr[1] - AbstractC23136l9.m118742r(28.0f);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb3 = null;
        }
        int measuredWidth = c29875jb3.f138330u.getMeasuredWidth() + m118742r;
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb4;
        }
        Rect rect = new Rect(m118742r, m118742r2, measuredWidth, c29875jb2.f138330u.getMeasuredHeight() + m118742r2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7145n.b(m92689tK(), 5, AbstractC6918a0.option_delete_backup, AbstractC23136l9.m118743r0(AbstractC8020f0.str_option_menu_delete_backup), ""));
        this.f72421L0.m92649TI().m93060e2(0, SimpleMenuListPopupView.m87992ML(arrayList, new C11124f(), rect, -1), "Popup_delete_backup", 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public static final void m58101ON(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152136P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PN */
    public final void m58103PN(C21690e c21690e) {
        C26220b.m134826i("SMLSettingBackupRestoreView", "onRestoreFinish(): sessionInfo=" + c21690e, null, 4, null);
        C20223b m120564A1 = AbstractC23306f.m120564A1();
        C17487o0 m92693xK = m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        m120564A1.m105694c(m92693xK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public static final void m58105QN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        settingBackupRestoreView.m58127bN();
    }

    /* renamed from: RM */
    private final void m58106RM(View view, boolean z11) {
        if (z11) {
            if (!view.isEnabled()) {
                view.setEnabled(true);
            }
            if (view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        if (view.getAlpha() != 0.3f) {
            view.setAlpha(0.3f);
        }
        if (view.isEnabled()) {
            view.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public final void m58107RN() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 27);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1, true);
        }
    }

    /* renamed from: SM */
    private final void m58108SM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout linearLayout = c29875jb.f138298B;
        AbstractC19074t.m100207e(linearLayout, "llSettingAccountGgdrive");
        m58106RM(linearLayout, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SN */
    public static final void m58109SN(SimpleAdapter simpleAdapter, String str, SettingBackupRestoreView settingBackupRestoreView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$adapter");
        AbstractC19074t.m100208f(str, "$emailBackup");
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (intValue == AbstractC8020f0.str_change_account) {
            AbstractC23647d.m123897g("580107");
            InterfaceC27218a m92692wK = settingBackupRestoreView.f72421L0.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C22447s.m116007J(0, 2, str, m92692wK, false, false, 48, null);
            return;
        }
        if (intValue == AbstractC8020f0.str_not_use_gdrvie_account) {
            InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo152120A2();
        }
    }

    /* renamed from: TM */
    private final void m58110TM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout linearLayout = c29875jb.f138299C;
        AbstractC19074t.m100207e(linearLayout, "llSettingAutoBackup");
        m58106RM(linearLayout, z11);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb3 = null;
        }
        StencilSwitch stencilSwitch = c29875jb3.f138306J;
        AbstractC19074t.m100207e(stencilSwitch, "ssAutoBackup");
        m58106RM(stencilSwitch, z11);
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb4;
        }
        RobotoTextView robotoTextView = c29875jb2.f138315S;
        AbstractC19074t.m100207e(robotoTextView, "tvTitleSetting");
        m58106RM(robotoTextView, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public final void m58111TN() {
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        if (interfaceC31258a.mo152153q0()) {
            return;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(1);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        aVar.m43172u(c6895a.m35500c().getString(AbstractC8020f0.str_dialog_delete_backup_title));
        aVar.m43173v(3);
        aVar.m43162k(c6895a.m35500c().getString(AbstractC8020f0.str_dialog_delete_backup_msg));
        aVar.m43170s(c6895a.m35500c().getString(AbstractC8020f0.delete), new InterfaceC17463d.d() { // from class: z40.b0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SettingBackupRestoreView.m58113UN(SettingBackupRestoreView.this, interfaceC17463d, i11);
            }
        });
        aVar.m43165n(c6895a.m35500c().getString(AbstractC8020f0.str_sync_summary_cancel), new InterfaceC17463d.d() { // from class: z40.c0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SettingBackupRestoreView.m58115VN(SettingBackupRestoreView.this, interfaceC17463d, i11);
            }
        });
        aVar.m43152a().mo13822K();
    }

    /* renamed from: UM */
    private final void m58112UM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout linearLayout = c29875jb.f138300D;
        AbstractC19074t.m100207e(linearLayout, "llSettingBackupE2ee");
        m58106RM(linearLayout, z11);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb3;
        }
        StencilSwitch stencilSwitch = c29875jb2.f138307K;
        AbstractC19074t.m100207e(stencilSwitch, "ssBackupE2ee");
        m58106RM(stencilSwitch, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public static final void m58113UN(SettingBackupRestoreView settingBackupRestoreView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
                InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
                if (interfaceC31258a == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC31258a = null;
                }
                interfaceC31258a.mo152124G3();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: VM */
    private final void m58114VM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout linearLayout = c29875jb.f138335z;
        AbstractC19074t.m100207e(linearLayout, "llBackupInfoResult");
        m58106RM(linearLayout, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m58115VN(SettingBackupRestoreView settingBackupRestoreView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
            }
        }
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152143Z0();
    }

    /* renamed from: WM */
    private final void m58116WM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout linearLayout = c29875jb.f138301E;
        AbstractC19074t.m100207e(linearLayout, "llSettingBackupPwd");
        m58106RM(linearLayout, z11);
        View view = this.f55965Q0;
        if (view != null) {
            m58106RM(view, z11);
        }
    }

    /* renamed from: WN */
    private final void m58117WN(ViewSwitcher viewSwitcher, int i11) {
        if (viewSwitcher.getDisplayedChild() != i11) {
            viewSwitcher.setDisplayedChild(i11);
        }
    }

    /* renamed from: XM */
    private final void m58118XM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout linearLayout = c29875jb.f138303G;
        AbstractC19074t.m100207e(linearLayout, "llSettingNetworkCondition");
        m58106RM(linearLayout, z11);
    }

    /* renamed from: XN */
    private final void m58119XN() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        ViewSwitcher viewSwitcher = c29875jb.f138322Z;
        AbstractC19074t.m100207e(viewSwitcher, "vsBackupInfo");
        m58117WN(viewSwitcher, 0);
    }

    /* renamed from: YM */
    private final void m58120YM(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        ZAppCompatImageView zAppCompatImageView = c29875jb.f138330u;
        AbstractC19074t.m100207e(zAppCompatImageView, "btnSettingDeleteBackup");
        m58106RM(zAppCompatImageView, z11);
    }

    /* renamed from: YN */
    private final void m58121YN() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        ViewSwitcher viewSwitcher = c29875jb.f138322Z;
        AbstractC19074t.m100207e(viewSwitcher, "vsBackupInfo");
        m58117WN(viewSwitcher, 1);
    }

    /* renamed from: ZM */
    private final void m58122ZM(boolean z11) {
        C29875jb c29875jb = null;
        if (z11) {
            C29875jb c29875jb2 = this.f55964P0;
            if (c29875jb2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb = c29875jb2;
            }
            c29875jb.f138333x.setVisibility(0);
            return;
        }
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb = c29875jb3;
        }
        c29875jb.f138333x.setVisibility(8);
    }

    /* renamed from: ZN */
    private final void m58123ZN() {
        View[] viewArr = new View[1];
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        viewArr[0] = c29875jb.f138303G;
        m58125aO(viewArr);
    }

    /* renamed from: aN */
    private final void m58124aN(boolean z11) {
        C29875jb c29875jb = null;
        if (z11) {
            C29875jb c29875jb2 = this.f55964P0;
            if (c29875jb2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb = c29875jb2;
            }
            c29875jb.f138310N.setVisibility(0);
            return;
        }
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb = c29875jb3;
        }
        c29875jb.f138310N.setVisibility(8);
    }

    /* renamed from: aO */
    private final void m58125aO(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                if (view.getVisibility() == 0) {
                    return;
                } else {
                    view.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: bB */
    private final void m58126bB() {
        if (this.f55974Z0.m87408i() != null) {
            SettingReminderZinstantBanner m87408i = this.f55974Z0.m87408i();
            AbstractC19074t.m100205c(m87408i);
            if (m87408i.getVisibility() != 8) {
                SettingReminderZinstantBanner m87408i2 = this.f55974Z0.m87408i();
                AbstractC19074t.m100205c(m87408i2);
                m87408i2.setVisibility(8);
            }
        }
    }

    /* renamed from: bN */
    private final void m58127bN() {
        C11128a c11128a = this.f55977c1;
        if (c11128a != null && c11128a.m58228h()) {
            InterfaceC31258a interfaceC31258a = this.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo152149n3();
            C11128a c11128a2 = this.f55977c1;
            if (c11128a2 != null) {
                c11128a2.m58232l(false);
            }
        }
    }

    /* renamed from: cN */
    private final boolean m58128cN() {
        if (AbstractC21777d.m112310a(this.f72421L0.m92693xK(), this.f72421L0.m92642L3())) {
            return true;
        }
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ == null || m92662fJ.m93018M0() > 1) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92662fJ.m93069k2(MainTabView.class, bundle, 1, true);
        return true;
    }

    /* renamed from: dN */
    private final boolean m58129dN(View view) {
        if (view != null) {
            if (this.f55973Y0 == null) {
                this.f55973Y0 = new Rect();
            }
            if (view.getGlobalVisibleRect(this.f55973Y0)) {
                Rect rect = this.f55973Y0;
                AbstractC19074t.m100205c(rect);
                int i11 = rect.bottom;
                Rect rect2 = this.f55973Y0;
                AbstractC19074t.m100205c(rect2);
                if (i11 - rect2.top > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public final void m58130eN() {
        C11128a c11128a = this.f55977c1;
        if (c11128a != null) {
            c11128a.m58230j(-1);
        }
        C11128a c11128a2 = this.f55977c1;
        if (c11128a2 != null) {
            c11128a2.m58231k(0);
        }
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public static final void m58131fN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        settingBackupRestoreView.m58091JN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public static final void m58133gN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152159u3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public static final void m58135hN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152159u3(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public static final void m58137iN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152159u3(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public static final void m58139jN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152159u3(3);
    }

    /* renamed from: kN */
    private final void m58141kN(boolean z11) {
        C29875jb c29875jb = null;
        if (z11) {
            C29875jb c29875jb2 = this.f55964P0;
            if (c29875jb2 == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb2 = null;
            }
            if (!c29875jb2.f138329t.isEnabled()) {
                C29875jb c29875jb3 = this.f55964P0;
                if (c29875jb3 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29875jb = c29875jb3;
                }
                RobotoTextView robotoTextView = c29875jb.f138329t;
                robotoTextView.setEnabled(true);
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.AppPrimaryColor));
                robotoTextView.setAlpha(1.0f);
                return;
            }
            return;
        }
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb4 = null;
        }
        if (c29875jb4.f138329t.isEnabled()) {
            C29875jb c29875jb5 = this.f55964P0;
            if (c29875jb5 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb = c29875jb5;
            }
            RobotoTextView robotoTextView2 = c29875jb.f138329t;
            robotoTextView2.setEnabled(false);
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.DisableTextColor1));
            robotoTextView2.setAlpha(0.5f);
        }
    }

    /* renamed from: lN */
    private final void m58143lN() {
        ViewStub viewStub;
        View view;
        View view2;
        int m127173b0;
        if (this.f55965Q0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            RobotoTextView robotoTextView = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_banner_remind_backup_password);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.f55965Q0 = view;
            if (view != null) {
                view2 = view.findViewById(AbstractC6918a0.btn_close_banner);
            } else {
                view2 = null;
            }
            this.f55966R0 = view2;
            View view3 = this.f55965Q0;
            if (view3 != null) {
                robotoTextView = (RobotoTextView) view3.findViewById(AbstractC6918a0.txt_remind_banner_set_pass_content);
            }
            this.f55967S0 = robotoTextView;
            View view4 = this.f55965Q0;
            if (view4 != null) {
                view4.setOnClickListener(new View.OnClickListener() { // from class: z40.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        SettingBackupRestoreView.m58145mN(SettingBackupRestoreView.this, view5);
                    }
                });
            }
            View view5 = this.f55966R0;
            if (view5 != null) {
                view5.setOnClickListener(new View.OnClickListener() { // from class: z40.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        SettingBackupRestoreView.m58147nN(view6);
                    }
                });
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_highlight_action_set_pass_backup);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remind_banner_set_pass_backup);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m127173b0 = AbstractC24342w.m127173b0(m118743r02, m118743r0, 0, false, 6, null);
            if (m127173b0 != -1) {
                int length = m118743r0.length() + m127173b0;
                SpannableString spannableString = new SpannableString(m118743r02);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor)), m127173b0, length, 33);
                RobotoTextView robotoTextView2 = this.f55967S0;
                if (robotoTextView2 != null) {
                    robotoTextView2.setText(spannableString);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public static final void m58145mN(SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152123G1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m58147nN(View view) {
        C2556d.m12981o().m13007x(3);
    }

    /* renamed from: oN */
    private final void m58149oN() {
        ViewStub viewStub;
        if (this.f55971W0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            View view = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_banner_reauthen_gdrive);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncBannerCommonView syncBannerCommonView = (SyncBannerCommonView) view;
            this.f55971W0 = syncBannerCommonView;
            if (syncBannerCommonView != null) {
                syncBannerCommonView.setOnSyncBannerListener(new C11121c());
            }
            C3295f c3295f = new C3295f(null, 0, 0, 0, 0, 31, null);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_remind_reconnect_gdrive);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C3297h.m16737g(c3295f, m118743r0, 6);
            C3297h.m16733c(this.f55971W0, 0);
            SyncBannerCommonView syncBannerCommonView2 = this.f55971W0;
            if (syncBannerCommonView2 != null) {
                syncBannerCommonView2.m58393f(c3295f);
                syncBannerCommonView2.setMovementMethod(CustomMovementMethod.m56305e());
                syncBannerCommonView2.setVisibility(0);
            }
        }
    }

    /* renamed from: pN */
    private final void m58151pN() {
        ViewStub viewStub;
        if (this.f55970V0 == null && this.f72421L0.m92656bJ() != null) {
            InterfaceC31258a interfaceC31258a = this.f55976b1;
            View view = null;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            String mo152141U3 = interfaceC31258a.mo152141U3();
            if (mo152141U3.length() == 0) {
                return;
            }
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_banner_remind_restore);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncBannerCommonView syncBannerCommonView = (SyncBannerCommonView) view;
            this.f55970V0 = syncBannerCommonView;
            if (syncBannerCommonView != null) {
                syncBannerCommonView.setOnSyncBannerListener(this);
            }
            C3295f c3295f = new C3295f(null, 0, 0, 0, 0, 31, null);
            C3297h.m16737g(c3295f, mo152141U3, 7);
            C3297h.m16733c(this.f55970V0, 0);
            SyncBannerCommonView syncBannerCommonView2 = this.f55970V0;
            if (syncBannerCommonView2 != null) {
                syncBannerCommonView2.m58393f(c3295f);
                syncBannerCommonView2.setVisibility(0);
            }
        }
    }

    /* renamed from: qN */
    private final void m58153qN() {
        ViewStub viewStub;
        if (this.f55968T0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            View view = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_sync_empty_backup_view);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncEmptyBackupView syncEmptyBackupView = (SyncEmptyBackupView) view;
            this.f55968T0 = syncEmptyBackupView;
            if (syncEmptyBackupView != null) {
                syncEmptyBackupView.setOnEmptyBackupViewListener(this);
            }
        }
    }

    /* renamed from: rN */
    private final void m58155rN(long j11, View... viewArr) {
        for (final View view : viewArr) {
            if (view != null) {
                if (view.getVisibility() != 0) {
                    return;
                }
                if (j11 <= 0) {
                    view.setVisibility(8);
                } else {
                    view.animate().alpha(0.0f).setDuration(j11).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() { // from class: z40.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingBackupRestoreView.m58157sN(view);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m58157sN(View view) {
        view.setVisibility(8);
    }

    /* renamed from: tN */
    private final void m58159tN(View view) {
        try {
            if (this.f55977c1 == null) {
                return;
            }
            if (m58093KN()) {
                m58130eN();
                return;
            }
            C11128a c11128a = this.f55977c1;
            AbstractC19074t.m100205c(c11128a);
            if (c11128a.m58221a() >= 0) {
                view.postDelayed(new RunnableC11122d(view), 300L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public final void m58161uN() {
        AbstractC20110a.f98889a.mo104548a("hideAllBannerWhenSyncing", new Object[0]);
        m58126bB();
        mo58178I0();
        mo58215z0();
        mo58184M0();
    }

    /* renamed from: vN */
    private final void m58163vN() {
        int m127173b0;
        String m127114D;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_rules_see_more);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
        if (m127173b0 >= 0) {
            m127114D = AbstractC24341v.m127114D(m118743r0, "#x#", "", false, 4, null);
            SpannableString spannableString = new SpannableString(m127114D);
            spannableString.setSpan(new C11123e(), m127173b0, m127114D.length(), 33);
            C29875jb c29875jb = this.f55964P0;
            C29875jb c29875jb2 = null;
            if (c29875jb == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb = null;
            }
            c29875jb.f138310N.setMovementMethod(CustomMovementMethod.m56305e());
            C29875jb c29875jb3 = this.f55964P0;
            if (c29875jb3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb2 = c29875jb3;
            }
            c29875jb2.f138310N.setText(spannableString);
        }
    }

    /* renamed from: wN */
    private final void m58165wN() {
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138323a0.setMeasureAllChildren(false);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb3 = null;
        }
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = c29875jb3.f138305I;
        scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
        scrollViewVisibleChildViewDetector.setScanMode(0);
        scrollViewVisibleChildViewDetector.setScrollViewListener(new ScrollViewVisibleChildViewDetector.InterfaceC9359c() { // from class: z40.d0
            @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9359c
            /* renamed from: a */
            public final void mo50492a(ScrollView scrollView, int i11, int i12, int i13, int i14) {
                SettingBackupRestoreView.m58167xN(SettingBackupRestoreView.this, scrollView, i11, i12, i13, i14);
            }
        });
        sh0 sh0Var = this.f55974Z0;
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb4 = null;
        }
        sh0Var.m87415u(c29875jb4.f138305I);
        C29875jb c29875jb5 = this.f55964P0;
        if (c29875jb5 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb5 = null;
        }
        c29875jb5.f138299C.setOnClickListener(new View.OnClickListener() { // from class: z40.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58081EN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb6 = this.f55964P0;
        if (c29875jb6 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb6 = null;
        }
        StencilSwitch stencilSwitch = c29875jb6.f138306J;
        stencilSwitch.setOnCheckedChangeListener(null);
        stencilSwitch.setOnClickListener(new View.OnClickListener() { // from class: z40.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58083FN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb7 = this.f55964P0;
        if (c29875jb7 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb7 = null;
        }
        StencilSwitch stencilSwitch2 = c29875jb7.f138307K;
        stencilSwitch2.setOnCheckedChangeListener(null);
        stencilSwitch2.setOnClickListener(new View.OnClickListener() { // from class: z40.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58085GN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb8 = this.f55964P0;
        if (c29875jb8 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb8 = null;
        }
        c29875jb8.f138328s.setOnClickListener(new View.OnClickListener() { // from class: z40.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58087HN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb9 = this.f55964P0;
        if (c29875jb9 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb9 = null;
        }
        c29875jb9.f138329t.setOnClickListener(new View.OnClickListener() { // from class: z40.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58169yN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb10 = this.f55964P0;
        if (c29875jb10 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb10 = null;
        }
        c29875jb10.f138330u.setOnClickListener(new View.OnClickListener() { // from class: z40.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58073AN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb11 = this.f55964P0;
        if (c29875jb11 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb11 = null;
        }
        c29875jb11.f138322Z.setMeasureAllChildren(false);
        C29875jb c29875jb12 = this.f55964P0;
        if (c29875jb12 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb12 = null;
        }
        c29875jb12.f138301E.setOnClickListener(new View.OnClickListener() { // from class: z40.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58075BN(SettingBackupRestoreView.this, view);
            }
        });
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        if (!interfaceC31258a.mo152155r()) {
            View[] viewArr = new View[1];
            C29875jb c29875jb13 = this.f55964P0;
            if (c29875jb13 == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb13 = null;
            }
            viewArr[0] = c29875jb13.f138301E;
            m58155rN(0L, viewArr);
        }
        InterfaceC31258a interfaceC31258a2 = this.f55976b1;
        if (interfaceC31258a2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a2 = null;
        }
        if (!interfaceC31258a2.mo152139S3()) {
            View[] viewArr2 = new View[1];
            C29875jb c29875jb14 = this.f55964P0;
            if (c29875jb14 == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb14 = null;
            }
            viewArr2[0] = c29875jb14.f138300D;
            m58155rN(0L, viewArr2);
        }
        C29875jb c29875jb15 = this.f55964P0;
        if (c29875jb15 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb15 = null;
        }
        c29875jb15.f138303G.setOnClickListener(new View.OnClickListener() { // from class: z40.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58077CN(SettingBackupRestoreView.this, view);
            }
        });
        C29875jb c29875jb16 = this.f55964P0;
        if (c29875jb16 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb16;
        }
        c29875jb2.f138298B.setOnClickListener(new View.OnClickListener() { // from class: z40.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBackupRestoreView.m58079DN(SettingBackupRestoreView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public static final void m58167xN(SettingBackupRestoreView settingBackupRestoreView, ScrollView scrollView, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152138R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public static final void m58169yN(final SettingBackupRestoreView settingBackupRestoreView, View view) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_SETTING_RESTORE", new Runnable() { // from class: z40.v
            @Override // java.lang.Runnable
            public final void run() {
                SettingBackupRestoreView.m58171zN(SettingBackupRestoreView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public static final void m58171zN(SettingBackupRestoreView settingBackupRestoreView) {
        AbstractC19074t.m100208f(settingBackupRestoreView, "this$0");
        InterfaceC31258a interfaceC31258a = settingBackupRestoreView.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152130L0();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: B */
    public void mo58172B(String str) {
        AbstractC19074t.m100208f(str, "strCondNetwork");
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138313Q.setText(str);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: C3 */
    public void mo58173C3(boolean z11) {
        m58151pN();
        SyncBannerCommonView syncBannerCommonView = this.f55970V0;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setVisibility(0);
            syncBannerCommonView.setHasIconClose(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        C25804a m120688m = AbstractC23306f.m120688m();
        AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        this.f55976b1 = new C31272h(this, m120692n, m120688m, m120676j);
        this.f55977c1 = C11128a.Companion.m58233a(this.f72421L0.m92642L3());
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        InterfaceC31258a interfaceC31258a2 = null;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo995Nd(this.f55977c1, null);
        InterfaceC31258a interfaceC31258a3 = this.f55976b1;
        if (interfaceC31258a3 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31258a2 = interfaceC31258a3;
        }
        interfaceC31258a2.mo152163x3(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String m118743r0;
        if (i11 != 2) {
            if (i11 != 3) {
                InterfaceC31258a interfaceC31258a = null;
                if (i11 != 5) {
                    if (i11 != 6) {
                        return null;
                    }
                    Context m92686rK = this.f72421L0.m92686rK();
                    AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
                    C16972e0.a aVar = new C16972e0.a(m92686rK);
                    aVar.m90931h("backup_e2ee_modal_off_e2ee");
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_title);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    aVar.m90918B(m118743r02);
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_desc);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    aVar.m90949z(m118743r03);
                    aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
                    aVar.m90921E(true);
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_off_setting_backup_e2ee_btn_positive);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    aVar.m90943t(m118743r04, this);
                    aVar.m90947x("backup_e2ee_dialog_confirm_off");
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    aVar.m90934k(m118743r05, this);
                    aVar.m90937n("backup_e2ee_dialog_not_confirm_off");
                    return aVar.m90927d();
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                C8009j.a m43165n = aVar2.m43159h(4).m43172u(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_confirm_backup_overwrite_desc)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_ask_restore_before_backup_action_negative), new InterfaceC17463d.b());
                InterfaceC31258a interfaceC31258a2 = this.f55976b1;
                if (interfaceC31258a2 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC31258a = interfaceC31258a2;
                }
                if (interfaceC31258a.mo152161w0()) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_ask_restore_before_backup_action_positive);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_confirm_backup_overwrite_btn_positive_auto);
                }
                m43165n.m43170s(m118743r0, this);
                return aVar2.m43152a();
            }
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43159h(4).m43172u(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_desc_restore_before_backup_set_pwd)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_negative_btn_restore_before_backup_pwd), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_positive_btn_restore_before_backup_pwd), this);
            return aVar3.m43152a();
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        aVar4.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_title_turn_off_auto_backup));
        aVar4.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_desc_turn_off_auto_backup));
        aVar4.m43159h(8);
        aVar4.m43173v(3);
        aVar4.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_btn_negative_turn_off_auto_backup), this);
        aVar4.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this);
        return aVar4.m43152a();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: E1 */
    public void mo58174E1() {
        SyncEmptyBackupView syncEmptyBackupView = this.f55968T0;
        if (syncEmptyBackupView != null) {
            syncEmptyBackupView.m58401c(1);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: F */
    public void mo58175F() {
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(SyncMessagePassManageView.class, null, 1804, 1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29875jb m148128c = C29875jb.m148128c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148128c, "inflate(...)");
        this.f55964P0 = m148128c;
        m58165wN();
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        LinearLayout root = c29875jb.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: H */
    public void mo58176H(String[] strArr, int i11) {
        AbstractC19074t.m100208f(strArr, "arrayConditionWifi");
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f55972X0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        this.f55972X0 = AbstractC29394g.m146569n(this.f72421L0.m92648SI(), strArr, i11, MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_syncmes_sync_mes_setting_title), new C11127i(), 3);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: H1 */
    public void mo58177H1(String str, int i11) {
        C3294e c3294e;
        AbstractC19074t.m100208f(str, "msgText");
        SyncProcessorViewV2 syncProcessorViewV2 = this.f55969U0;
        if (syncProcessorViewV2 != null) {
            c3294e = syncProcessorViewV2.getSyncStateData();
        } else {
            c3294e = null;
        }
        C3297h.m16734d(c3294e, str, i11);
        m58095LN();
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        AbstractC19074t.m100208f(scrollView, "scrollView");
        if (z11) {
            AbstractC26084s.m134267o(this.f55974Z0.m87408i());
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: I0 */
    public void mo58178I0() {
        View view = this.f55965Q0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            this.f72421L0.mo49315c4();
            InterfaceC31258a interfaceC31258a = this.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo994F2();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        super.mo39024IJ();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: J0 */
    public void mo58179J0(boolean z11) {
        m58143lN();
        View view = this.f55965Q0;
        if (view != null) {
            view.setVisibility(0);
        }
        if (z11) {
            View view2 = this.f55966R0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            RobotoTextView robotoTextView = this.f55967S0;
            if (robotoTextView != null) {
                robotoTextView.setPadding(0, 0, 0, 0);
                return;
            }
            return;
        }
        View view3 = this.f55966R0;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        RobotoTextView robotoTextView2 = this.f55967S0;
        if (robotoTextView2 != null) {
            robotoTextView2.setPadding(0, 0, AbstractC23222t7.f112566j, 0);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: J2 */
    public void mo58180J2() {
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138326q.setVisibility(8);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb3 = null;
        }
        c29875jb3.f138327r.setVisibility(0);
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb4;
        }
        c29875jb2.f138330u.setVisibility(4);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f55965Q0 = null;
        this.f55968T0 = null;
        this.f55969U0 = null;
        this.f55970V0 = null;
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: K3 */
    public void mo58181K3() {
        C21688c.Companion.m111854a().m111849u(this, "SYNC_MES");
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            InterfaceC31258a interfaceC31258a = null;
            if (mo92862f != 2) {
                if (mo92862f != 3) {
                    if (mo92862f != 5) {
                        if (mo92862f == 6) {
                            if (i11 != -2) {
                                if (i11 == -1) {
                                    InterfaceC31258a interfaceC31258a2 = this.f55976b1;
                                    if (interfaceC31258a2 == null) {
                                        AbstractC19074t.m100223u("presenter");
                                    } else {
                                        interfaceC31258a = interfaceC31258a2;
                                    }
                                    interfaceC31258a.mo152135P1(false);
                                    interfaceC17463d.dismiss();
                                    return;
                                }
                                return;
                            }
                            interfaceC17463d.dismiss();
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        InterfaceC31258a interfaceC31258a3 = this.f55976b1;
                        if (interfaceC31258a3 == null) {
                            AbstractC19074t.m100223u("presenter");
                        } else {
                            interfaceC31258a = interfaceC31258a3;
                        }
                        interfaceC31258a.mo152148m2();
                        return;
                    }
                    return;
                }
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    InterfaceC31258a interfaceC31258a4 = this.f55976b1;
                    if (interfaceC31258a4 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC31258a = interfaceC31258a4;
                    }
                    interfaceC31258a.mo152150o0();
                    return;
                }
                return;
            }
            if (i11 != -2) {
                if (i11 == -1) {
                    AbstractC23647d.m123897g("5580103");
                    InterfaceC31258a interfaceC31258a5 = this.f55976b1;
                    if (interfaceC31258a5 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC31258a = interfaceC31258a5;
                    }
                    interfaceC31258a.mo152158s2(false);
                    interfaceC17463d.dismiss();
                    return;
                }
                return;
            }
            AbstractC23647d.m123897g("5580104");
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: L1 */
    public void mo58182L1() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        ViewSwitcher viewSwitcher = c29875jb.f138323a0;
        AbstractC19074t.m100207e(viewSwitcher, "vsContainerMainLayout");
        m58117WN(viewSwitcher, 0);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: M */
    public void mo58183M() {
        showDialog(3);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: M0 */
    public void mo58184M0() {
        SyncBannerCommonView syncBannerCommonView = this.f55971W0;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setVisibility(8);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: M1 */
    public void mo58185M1() {
        m58149oN();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: N0 */
    public void mo58186N0(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138306J.setChecked(z11);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: N1 */
    public void mo58187N1() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138298B.setVisibility(8);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: N3 */
    public void mo58188N3(final String str, List list) {
        AbstractC19074t.m100208f(str, "emailBackup");
        AbstractC19074t.m100208f(list, "entries");
        final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), list, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j m43152a = new C8009j.a(this.f72421L0.m92648SI()).m43172u(str).m43173v(100).m43155d(true).m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: z40.a0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SettingBackupRestoreView.m58109SN(simpleAdapter, str, this, interfaceC17463d, i11);
            }
        }).m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        if (!m43152a.m92868m()) {
            m43152a.mo13822K();
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: O0 */
    public void mo58189O0(int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        C17487o0 m92693xK = this.f72421L0.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        C22438j.m115936J(m92693xK, i11, targetBackupInfo);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            C11128a.Companion.m58234b(this.f55977c1, this.f72421L0.m92642L3());
            View m92656bJ = this.f72421L0.m92656bJ();
            if (m92656bJ != null) {
                m58159tN(m92656bJ);
            }
            this.f72827B0.post(new Runnable() { // from class: z40.t
                @Override // java.lang.Runnable
                public final void run() {
                    SettingBackupRestoreView.m58101ON(SettingBackupRestoreView.this);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: Q */
    public void mo58190Q() {
        C29875jb c29875jb = this.f55964P0;
        InterfaceC31258a interfaceC31258a = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        if (c29875jb.f138307K.isChecked()) {
            showDialog(6);
            return;
        }
        InterfaceC31258a interfaceC31258a2 = this.f55976b1;
        if (interfaceC31258a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31258a = interfaceC31258a2;
        }
        interfaceC31258a.mo152135P1(true);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: R1 */
    public void mo58191R1(int i11) {
        AbstractC20110a.f98889a.mo104548a("changeUISettings, state=" + i11, new Object[0]);
        InterfaceC31258a interfaceC31258a = null;
        C29875jb c29875jb = null;
        InterfaceC31258a interfaceC31258a2 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        mo58182L1();
                        m58121YN();
                        m58110TM(false);
                        m58118XM(false);
                        m58116WM(false);
                        m58108SM(false);
                        m58114VM(false);
                        m58122ZM(false);
                        m58124aN(false);
                        m58112UM(false);
                        m58120YM(false);
                        mo58208s0(true);
                        return;
                    }
                    return;
                }
                m58119XN();
                C29875jb c29875jb2 = this.f55964P0;
                if (c29875jb2 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29875jb = c29875jb2;
                }
                c29875jb.f138330u.setVisibility(4);
                m58110TM(false);
                m58116WM(false);
                m58118XM(false);
                m58108SM(false);
                m58114VM(true);
                mo58208s0(false);
                m58122ZM(false);
                m58124aN(false);
                m58112UM(false);
                return;
            }
            m58121YN();
            m58110TM(true);
            m58118XM(true);
            m58116WM(false);
            m58108SM(true);
            m58114VM(true);
            m58112UM(true);
            m58141kN(false);
            mo58208s0(false);
            m58122ZM(true);
            m58124aN(true);
            InterfaceC31258a interfaceC31258a3 = this.f55976b1;
            if (interfaceC31258a3 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a3 = null;
            }
            if (!interfaceC31258a3.mo152153q0()) {
                InterfaceC31258a interfaceC31258a4 = this.f55976b1;
                if (interfaceC31258a4 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC31258a2 = interfaceC31258a4;
                }
                interfaceC31258a2.mo152126I1();
                return;
            }
            return;
        }
        m58121YN();
        m58110TM(true);
        m58116WM(true);
        m58118XM(true);
        m58108SM(true);
        m58114VM(true);
        m58120YM(true);
        m58112UM(true);
        mo58182L1();
        m58141kN(true);
        m58122ZM(true);
        m58124aN(true);
        InterfaceC31258a interfaceC31258a5 = this.f55976b1;
        if (interfaceC31258a5 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31258a = interfaceC31258a5;
        }
        interfaceC31258a.mo152159u3(2);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            C21688c.Companion.m111854a().m111851x(this, "SYNC_MES");
            this.f55974Z0.m87414t();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
    /* renamed from: Rf */
    public void mo592Rf(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view == this.f55970V0) {
            InterfaceC31258a interfaceC31258a = this.f55976b1;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            interfaceC31258a.mo152133M0();
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: S2 */
    public void mo58192S2() {
        SyncEmptyBackupView syncEmptyBackupView = this.f55968T0;
        if (syncEmptyBackupView != null) {
            syncEmptyBackupView.m58401c(0);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: U */
    public void mo58193U(int i11) {
        SyncMsgEditPwdBaseView.Companion.m58335b(this.f72421L0.m92662fJ(), SyncMessageSetPassView.class, 1803, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        AbstractC26084s.m134256d(this);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 6003);
        bVar.m124119a().m124115b(this, 6024);
        bVar.m124119a().m124115b(this, 6025);
        m58091JN();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: V0 */
    public boolean mo58194V0() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        return c29875jb.f138301E.isEnabled();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 6003);
        bVar.m124119a().m124117e(this, 6024);
        bVar.m124119a().m124117e(this, 6025);
        InterfaceC31258a interfaceC31258a = null;
        this.f72827B0.removeCallbacksAndMessages(null);
        try {
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f55972X0;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f55972X0;
                AbstractC19074t.m100205c(keyEventCallbackC17462c2);
                keyEventCallbackC17462c2.dismiss();
            }
            InterfaceC31258a interfaceC31258a2 = this.f55976b1;
            if (interfaceC31258a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC31258a = interfaceC31258a2;
            }
            interfaceC31258a.mo152122F();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: Y0 */
    public void mo58195Y0() {
        ViewStub viewStub;
        if (this.f55969U0 == null && this.f72421L0.m92656bJ() != null) {
            View m92656bJ = this.f72421L0.m92656bJ();
            View view = null;
            if (m92656bJ != null) {
                viewStub = (ViewStub) m92656bJ.findViewById(AbstractC6918a0.viewstub_sync_processor);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            SyncProcessorViewV2 syncProcessorViewV2 = (SyncProcessorViewV2) view;
            this.f55969U0 = syncProcessorViewV2;
            if (syncProcessorViewV2 != null) {
                syncProcessorViewV2.setEventListener(this);
            }
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: Y3 */
    public void mo58196Y3(String str) {
        AbstractC19074t.m100208f(str, "extraDataKey");
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            m92642L3.remove(str);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152126I1();
        m58159tN(view);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: a4 */
    public void mo58197a4() {
        try {
            InterfaceC31258a interfaceC31258a = this.f55976b1;
            C29875jb c29875jb = null;
            if (interfaceC31258a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a = null;
            }
            if (interfaceC31258a.mo152156r0()) {
                C29875jb c29875jb2 = this.f55964P0;
                if (c29875jb2 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29875jb = c29875jb2;
                }
                c29875jb.f138312P.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sync_backup_password_created));
                return;
            }
            C29875jb c29875jb3 = this.f55964P0;
            if (c29875jb3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb = c29875jb3;
            }
            c29875jb.f138312P.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sync_backup_password_not_created));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_setting_auto_backup) {
            return 58;
        }
        if (i11 == AbstractC6918a0.ll_setting_backup_pwd) {
            return 112;
        }
        if (i11 == AbstractC6918a0.ll_setting_network_condition) {
            return 60;
        }
        return i11 == AbstractC6918a0.ll_setting_backup_e2ee ? 128 : -10;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (m58128cN()) {
            return;
        }
        super.finish();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: g4 */
    public void mo58198g4(String str) {
        C29875jb c29875jb = null;
        if (str != null && str.length() != 0) {
            C29875jb c29875jb2 = this.f55964P0;
            if (c29875jb2 == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb2 = null;
            }
            c29875jb2.f138311O.setText(str);
            C29875jb c29875jb3 = this.f55964P0;
            if (c29875jb3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb = c29875jb3;
            }
            c29875jb.f138311O.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb4 = null;
        }
        c29875jb4.f138311O.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_add_account_ggdrive));
        C29875jb c29875jb5 = this.f55964P0;
        if (c29875jb5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb = c29875jb5;
        }
        c29875jb.f138311O.setCompoundDrawablesWithIntrinsicBounds(AbstractC16803z.ic_warning_backup_media, 0, 0, 0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingBackupRestoreView";
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: j2 */
    public boolean mo58199j2() {
        View view = this.f55965Q0;
        if (view != null && view != null && view.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: j4 */
    public void mo58200j4(boolean z11) {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138307K.setChecked(z11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView.InterfaceC11144a
    /* renamed from: kx */
    public void mo57320kx() {
        SyncEmptyBackupView.InterfaceC11144a.a.m58402a(this);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: l3 */
    public void mo58201l3() {
        C29875jb c29875jb = this.f55964P0;
        InterfaceC31258a interfaceC31258a = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        if (c29875jb.f138306J.isChecked()) {
            showDialog(2);
            return;
        }
        InterfaceC31258a interfaceC31258a2 = this.f55976b1;
        if (interfaceC31258a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31258a = interfaceC31258a2;
        }
        interfaceC31258a.mo152149n3();
    }

    @Override // p586vt.InterfaceC28625j
    /* renamed from: lk */
    public void mo57172lk(AbstractC28627l abstractC28627l) {
        if (!(abstractC28627l instanceof C21688c.b)) {
            C26263i.m135034d0("Job message is not a sync message");
            return;
        }
        C21688c.b bVar = (C21688c.b) abstractC28627l;
        if (!mo45894h0()) {
            return;
        }
        AbstractC20110a.f98889a.mo104548a("SettingBackupRestoreView updateSyncStatus phase: %d = currentProgress: %d ", Integer.valueOf(bVar.f132722a), Integer.valueOf(bVar.f105263d));
        if (C22447s.m116019U(bVar.f132722a)) {
            RunnableC11120b runnableC11120b = new RunnableC11120b();
            runnableC11120b.m58218b(bVar);
            if (mo45894h0()) {
                this.f72827B0.post(runnableC11120b);
                return;
            }
            return;
        }
        this.f55975a1.m58218b(bVar);
        if (mo45894h0()) {
            this.f72827B0.post(this.f55975a1);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: m2 */
    public void mo58202m2(String str) {
        C3294e c3294e;
        AbstractC19074t.m100208f(str, "msgText");
        SyncProcessorViewV2 syncProcessorViewV2 = this.f55969U0;
        if (syncProcessorViewV2 != null) {
            c3294e = syncProcessorViewV2.getSyncStateData();
        } else {
            c3294e = null;
        }
        C3297h.m16736f(c3294e, str);
        m58095LN();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: m3 */
    public void mo58203m3() {
        C17487o0 m92662fJ;
        Context context = getContext();
        if (context != null && (m92662fJ = m92662fJ()) != null) {
            AbstractC23306f.m120696o().m126196B(context, m92662fJ, new C11125g(), new C11126h());
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: mk */
    public void mo58204mk(boolean z11) {
        if (z11) {
            m58123ZN();
            return;
        }
        View[] viewArr = new View[1];
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        viewArr[0] = c29875jb.f138303G;
        m58155rN(0L, viewArr);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: o0 */
    public ArrayList mo58205o0() {
        C29875jb c29875jb = this.f55964P0;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        return AbstractC26084s.m134263k(this, c29875jb.f138305I.getArrayChildViewVisible(), m92656bJ());
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152131L2(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4 && m58128cN()) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        InterfaceC31258a interfaceC31258a2 = null;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152144Z1();
        InterfaceC31258a interfaceC31258a3 = this.f55976b1;
        if (interfaceC31258a3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a3 = null;
        }
        interfaceC31258a3.mo152162w1();
        InterfaceC31258a interfaceC31258a4 = this.f55976b1;
        if (interfaceC31258a4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a4 = null;
        }
        interfaceC31258a4.mo152121C2();
        try {
            mo58181K3();
            InterfaceC31258a interfaceC31258a5 = this.f55976b1;
            if (interfaceC31258a5 == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31258a5 = null;
            }
            if (interfaceC31258a5.mo152153q0()) {
                InterfaceC31258a interfaceC31258a6 = this.f55976b1;
                if (interfaceC31258a6 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC31258a2 = interfaceC31258a6;
                }
                interfaceC31258a2.mo152151p();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        this.f55974Z0.m87413s();
        this.f72827B0.post(new Runnable() { // from class: z40.w
            @Override // java.lang.Runnable
            public final void run() {
                SettingBackupRestoreView.m58105QN(SettingBackupRestoreView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView.InterfaceC11144a
    /* renamed from: p0 */
    public void mo57325p0() {
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152152p0();
    }

    @Override // z40.InterfaceC31260b, com.zing.zalo.p077ui.backuprestore.widget.SyncProcessorViewV2.InterfaceC11147a
    /* renamed from: r */
    public void mo58206r(int i11, int i12) {
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        InterfaceC27218a m92692wK = this.f72421L0.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        interfaceC31258a.mo152142Y3(i11, m92692wK, i12);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: r0 */
    public void mo58207r0(int i11, TargetBackupInfo targetBackupInfo) {
        C17487o0 m92693xK = this.f72421L0.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        C22438j.m115930D(m92693xK, i11, targetBackupInfo);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: s0 */
    public void mo58208s0(boolean z11) {
        C29875jb c29875jb = null;
        if (z11) {
            C29875jb c29875jb2 = this.f55964P0;
            if (c29875jb2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29875jb = c29875jb2;
            }
            c29875jb.f138331v.setVisibility(0);
            return;
        }
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb = c29875jb3;
        }
        c29875jb.f138331v.setVisibility(8);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: s1 */
    public void mo58209s1(String str, String str2) {
        AbstractC19074t.m100208f(str, "pcName");
        AbstractC19074t.m100208f(str2, "syncSession");
        Bundle bundle = new Bundle();
        bundle.putString("extra_req_sync_from_pc_name", str);
        bundle.putString("extra_req_sync_from_pc_session", str2);
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93069k2(PcSyncRequestView.class, bundle, 0, true);
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: t0 */
    public boolean mo58210t0() {
        boolean z11;
        if (this.f55974Z0.m87408i() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m87405e = this.f55974Z0.m87405e(this, 39);
        if (z11 && m87405e && this.f55974Z0.m87408i() != null) {
            SettingReminderZinstantBanner m87408i = this.f55974Z0.m87408i();
            AbstractC19074t.m100205c(m87408i);
            if (m87408i.getVisibility() != 0) {
                AbstractC20110a.f98889a.mo104548a("invalidateDataBannersChanged invalidateDataRemindSettingBanner VISIBLE", new Object[0]);
                SettingReminderZinstantBanner m87408i2 = this.f55974Z0.m87408i();
                AbstractC19074t.m100205c(m87408i2);
                m87408i2.setVisibility(0);
            }
        }
        return m87405e;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncProcessorViewV2.InterfaceC11147a
    /* renamed from: u */
    public void mo58211u() {
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152160v2();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: u3 */
    public void mo58212u3() {
        Toast.makeText(getContext(), AbstractC8020f0.get_backupinfo_fail, 1).show();
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: w3 */
    public void mo58213w3() {
        try {
            m58153qN();
            C29875jb c29875jb = this.f55964P0;
            if (c29875jb == null) {
                AbstractC19074t.m100223u("binding");
                c29875jb = null;
            }
            ViewSwitcher viewSwitcher = c29875jb.f138323a0;
            AbstractC19074t.m100207e(viewSwitcher, "vsContainerMainLayout");
            m58117WN(viewSwitcher, 1);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: w4 */
    public boolean mo58214w4() {
        return m58129dN(this.f55965Q0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 6000) {
            if (i11 != 6003) {
                if (i11 != 6024) {
                    if (i11 == 6025) {
                        this.f72827B0.post(new Runnable() { // from class: z40.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingBackupRestoreView.m58139jN(SettingBackupRestoreView.this);
                            }
                        });
                        return;
                    }
                    return;
                }
                this.f72827B0.post(new Runnable() { // from class: z40.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingBackupRestoreView.m58137iN(SettingBackupRestoreView.this);
                    }
                });
                return;
            }
            this.f72827B0.post(new Runnable() { // from class: z40.q
                @Override // java.lang.Runnable
                public final void run() {
                    SettingBackupRestoreView.m58135hN(SettingBackupRestoreView.this);
                }
            });
            return;
        }
        this.f72827B0.post(new Runnable() { // from class: z40.o
            @Override // java.lang.Runnable
            public final void run() {
                SettingBackupRestoreView.m58131fN(SettingBackupRestoreView.this);
            }
        });
        this.f72827B0.post(new Runnable() { // from class: z40.p
            @Override // java.lang.Runnable
            public final void run() {
                SettingBackupRestoreView.m58133gN(SettingBackupRestoreView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView.InterfaceC11142a
    /* renamed from: x9 */
    public void mo596x9(int i11, View view) {
        AbstractC19074t.m100208f(view, "view");
        mo58206r(i11, 1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        InterfaceC31258a interfaceC31258a = this.f55976b1;
        InterfaceC31258a interfaceC31258a2 = null;
        if (interfaceC31258a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a = null;
        }
        interfaceC31258a.mo152137Q1();
        InterfaceC31258a interfaceC31258a3 = this.f55976b1;
        if (interfaceC31258a3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a3 = null;
        }
        interfaceC31258a3.mo152125I0();
        mo58197a4();
        m58163vN();
        InterfaceC31258a interfaceC31258a4 = this.f55976b1;
        if (interfaceC31258a4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31258a4 = null;
        }
        interfaceC31258a4.mo152127J2();
        InterfaceC31258a interfaceC31258a5 = this.f55976b1;
        if (interfaceC31258a5 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31258a2 = interfaceC31258a5;
        }
        interfaceC31258a2.mo152146k2();
        this.f72827B0.post(new Runnable() { // from class: z40.l
            @Override // java.lang.Runnable
            public final void run() {
                SettingBackupRestoreView.m58097MN(SettingBackupRestoreView.this);
            }
        });
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: z0 */
    public void mo58215z0() {
        SyncBannerCommonView syncBannerCommonView = this.f55970V0;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setVisibility(8);
        }
    }

    @Override // z40.InterfaceC31260b
    /* renamed from: z2 */
    public void mo58216z2(C26701b c26701b) {
        AbstractC19074t.m100208f(c26701b, "syncBackupInfoContent");
        C29875jb c29875jb = this.f55964P0;
        C29875jb c29875jb2 = null;
        if (c29875jb == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb = null;
        }
        c29875jb.f138326q.m58384V(c26701b);
        C29875jb c29875jb3 = this.f55964P0;
        if (c29875jb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb3 = null;
        }
        SyncBackupInfoV2View syncBackupInfoV2View = c29875jb3.f138326q;
        C29875jb c29875jb4 = this.f55964P0;
        if (c29875jb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb4 = null;
        }
        syncBackupInfoV2View.setTitleColor(C23212s8.m119607o(c29875jb4.f138326q.getContext(), AbstractC21196a.TextColor1));
        C29875jb c29875jb5 = this.f55964P0;
        if (c29875jb5 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb5 = null;
        }
        c29875jb5.f138326q.setVisibility(0);
        C29875jb c29875jb6 = this.f55964P0;
        if (c29875jb6 == null) {
            AbstractC19074t.m100223u("binding");
            c29875jb6 = null;
        }
        c29875jb6.f138327r.setVisibility(8);
        C29875jb c29875jb7 = this.f55964P0;
        if (c29875jb7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29875jb2 = c29875jb7;
        }
        c29875jb2.f138330u.setVisibility(0);
    }
}
