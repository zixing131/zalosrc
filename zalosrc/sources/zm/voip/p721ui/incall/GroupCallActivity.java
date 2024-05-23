package zm.voip.p721ui.incall;

import ac.C0697c0;
import ac.C0722p;
import ac.InterfaceC0724q;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.animation.ValueAnimator;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Rational;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.C1421e;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1623z0;
import androidx.core.view.C1580n1;
import androidx.core.view.C1593q2;
import androidx.core.view.InterfaceC1551g0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3085d;
import bp0.AbstractC3087e;
import bp0.AbstractC3096i0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import bp0.AbstractC3108t;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.widget.RobotoChronometer;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17927b;
import dp0.AbstractC18044d;
import ed0.AbstractC18391a;
import ep0.C18556p;
import gp0.C19577z;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jo0.C21329g;
import jo0.C21333k;
import jo0.C21334l;
import kg.AbstractC21705b;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21715l;
import ko0.C21791f;
import lo0.C22592c;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23269y3;
import mj0.AbstractC23322a;
import org.webrtc.TextureViewRenderer;
import p097db.C17846e;
import p133ek.AbstractC18458a;
import p207he.C20024r;
import p266jg.AbstractC21245c;
import p308kx.C21965i;
import p361nb.C23648e;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p716zh.C32150v9;
import ro0.C25942f;
import s30.AbstractC26125a;
import so0.C26350a;
import so0.C26351b;
import to0.InterfaceC26856a;
import to0.InterfaceC26857b;
import ui0.C27280g;
import uo0.C27352b;
import vg.C28203u6;
import vo0.AbstractC28386c;
import vo0.AbstractC28394d;
import vo0.ViewOnLayoutChangeListenerC28517t0;
import vo0.ViewOnLayoutChangeListenerC28551y;
import wo0.C29118a0;
import zl0.AbstractC32234k;
import zm.voip.dialog.SpeakerChooserDialog;
import zm.voip.p721ui.incall.BottomCallView;
import zm.voip.p721ui.incall.GroupCallActivity;
import zm.voip.p721ui.views.PreviewCameraGroupCallDialog;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32252b;
import zm.voip.service.C32257b4;
import zm.voip.service.C32318n3;
import zm.voip.service.C32319o;
import zm.voip.service.C32328p3;
import zm.voip.service.HeadsetButtonReceiver;
import zm.voip.widgets.BlurImageView;
import zm.voip.widgets.CallKeyboardLayout;
import zm.voip.widgets.CircleBackgroundAnswer;
import zm.voip.widgets.CircleBackgroundImageView;
import zm.voip.widgets.GestureBottomLayout;
import zm.voip.widgets.GestureRightLayout;
import zm.voip.widgets.HandleTapRecyclerView;
import zm.voip.widgets.PhysicalSelfLayout;
import zm.voip.widgets.RoundedCallView;
import zm.voip.widgets.SelfCallView;
import zm.voip.widgets.VoIPButtonWithText;
import zm.voip.widgets.moduleviews.GCallAvatarView;
import zm.voip.widgets.moduleviews.ToastCountdownCustomView;
import zm.voip.widgets.moduleviews.VoIPItemAva;

/* loaded from: classes7.dex */
public class GroupCallActivity extends ZaloActivity implements C23744a.c, InterfaceC26857b, InterfaceC0724q {

    /* renamed from: I1 */
    private static final int f149346I1 = AbstractC23136l9.m118742r(320.0f);

    /* renamed from: A0 */
    private SelfCallView f149347A0;

    /* renamed from: A1 */
    private C21709f f149348A1;

    /* renamed from: B0 */
    private View f149349B0;

    /* renamed from: B1 */
    private C21709f f149350B1;

    /* renamed from: C0 */
    private LinearLayout f149351C0;

    /* renamed from: C1 */
    private C21709f f149352C1;

    /* renamed from: D0 */
    private Chronometer f149353D0;

    /* renamed from: D1 */
    private C21709f f149354D1;

    /* renamed from: E0 */
    private View f149355E0;

    /* renamed from: E1 */
    private C21709f f149356E1;

    /* renamed from: F0 */
    private LinearLayout f149357F0;

    /* renamed from: F1 */
    private ValueAnimator f149358F1;

    /* renamed from: G0 */
    private LinearLayout f149359G0;

    /* renamed from: H0 */
    private VoIPButtonWithText f149361H0;

    /* renamed from: I0 */
    private VoIPButtonWithText f149363I0;

    /* renamed from: J0 */
    private CircleBackgroundAnswer f149364J0;

    /* renamed from: K0 */
    private VoIPButtonWithText f149365K0;

    /* renamed from: L0 */
    private VoIPButtonWithText f149366L0;

    /* renamed from: M0 */
    private VoIPButtonWithText f149367M0;

    /* renamed from: N0 */
    private VoIPButtonWithText f149368N0;

    /* renamed from: O0 */
    private VoIPButtonWithText f149369O0;

    /* renamed from: P0 */
    private VoIPButtonWithText f149370P0;

    /* renamed from: Q0 */
    private CircleBackgroundImageView f149371Q0;

    /* renamed from: R0 */
    private VoIPButtonWithText f149372R0;

    /* renamed from: S */
    private C26351b f149373S;

    /* renamed from: S0 */
    private CircleBackgroundImageView f149374S0;

    /* renamed from: T */
    private InterfaceC26856a f149375T;

    /* renamed from: T0 */
    private RobotoTextView f149376T0;

    /* renamed from: U0 */
    private RobotoTextView f149378U0;

    /* renamed from: V0 */
    private VoIPButtonWithText f149380V0;

    /* renamed from: W */
    private C21329g f149381W;

    /* renamed from: W0 */
    Drawable f149382W0;

    /* renamed from: X */
    private C21334l f149383X;

    /* renamed from: X0 */
    Drawable f149384X0;

    /* renamed from: Y */
    private GridLayoutManager f149385Y;

    /* renamed from: Y0 */
    private LinearLayout f149386Y0;

    /* renamed from: Z */
    private LinearLayoutManager f149387Z;

    /* renamed from: Z0 */
    private GCallAvatarView f149388Z0;

    /* renamed from: a0 */
    private C17487o0 f149389a0;

    /* renamed from: a1 */
    private RobotoTextView f149390a1;

    /* renamed from: b0 */
    private AbstractC18044d f149391b0;

    /* renamed from: b1 */
    private RobotoTextView f149392b1;

    /* renamed from: c0 */
    private C21965i f149393c0;

    /* renamed from: c1 */
    private GestureRightLayout f149394c1;

    /* renamed from: d1 */
    private AppCompatImageView f149396d1;

    /* renamed from: e1 */
    private RecyclerView f149398e1;

    /* renamed from: f1 */
    private LinearLayout f149400f1;

    /* renamed from: g1 */
    private AppCompatImageView f149402g1;

    /* renamed from: i0 */
    private boolean f149405i0;

    /* renamed from: i1 */
    private ToastCountdownCustomView f149406i1;

    /* renamed from: j1 */
    DialogView f149408j1;

    /* renamed from: k0 */
    private View.OnLayoutChangeListener f149409k0;

    /* renamed from: k1 */
    private ZmInCallDebug f149410k1;

    /* renamed from: l0 */
    private View.OnLayoutChangeListener f149411l0;

    /* renamed from: l1 */
    private GestureBottomLayout f149412l1;

    /* renamed from: m0 */
    private int f149413m0;

    /* renamed from: m1 */
    private CallKeyboardLayout f149414m1;

    /* renamed from: n0 */
    private int f149415n0;

    /* renamed from: n1 */
    private View f149416n1;

    /* renamed from: o0 */
    private int f149417o0;

    /* renamed from: o1 */
    private LinearLayout f149418o1;

    /* renamed from: p0 */
    private int f149419p0;

    /* renamed from: p1 */
    private RecyclerView f149420p1;

    /* renamed from: q1 */
    private C21333k f149422q1;

    /* renamed from: r1 */
    private LinearLayoutManager f149424r1;

    /* renamed from: s1 */
    private MultiStateView f149426s1;

    /* renamed from: t1 */
    private CustomEditText f149428t1;

    /* renamed from: u1 */
    private Configuration f149430u1;

    /* renamed from: x0 */
    private FrameLayout f149435x0;

    /* renamed from: x1 */
    private C21709f f149436x1;

    /* renamed from: y0 */
    private HandleTapRecyclerView f149437y0;

    /* renamed from: y1 */
    private C21709f f149438y1;

    /* renamed from: z0 */
    private PhysicalSelfLayout f149439z0;

    /* renamed from: z1 */
    private C21709f f149440z1;

    /* renamed from: U */
    private final HandlerC32400r f149377U = new HandlerC32400r(this);

    /* renamed from: V */
    private final AbstractC21705b f149379V = C21715l.m112062k();

    /* renamed from: d0 */
    private boolean f149395d0 = false;

    /* renamed from: e0 */
    private boolean f149397e0 = false;

    /* renamed from: f0 */
    private boolean f149399f0 = false;

    /* renamed from: g0 */
    private volatile boolean f149401g0 = false;

    /* renamed from: h0 */
    private boolean f149403h0 = false;

    /* renamed from: j0 */
    private boolean f149407j0 = false;

    /* renamed from: q0 */
    private int f149421q0 = 0;

    /* renamed from: r0 */
    private int f149423r0 = AbstractC3104p.m15634K();

    /* renamed from: s0 */
    private final long f149425s0 = System.currentTimeMillis();

    /* renamed from: t0 */
    private boolean f149427t0 = false;

    /* renamed from: u0 */
    private boolean f149429u0 = false;

    /* renamed from: v0 */
    private boolean f149431v0 = false;

    /* renamed from: w0 */
    private boolean f149433w0 = false;

    /* renamed from: h1 */
    private BottomCallView f149404h1 = null;

    /* renamed from: v1 */
    private final TextWatcher f149432v1 = new C32386d();

    /* renamed from: w1 */
    private volatile boolean f149434w1 = false;

    /* renamed from: G1 */
    private boolean f149360G1 = false;

    /* renamed from: H1 */
    private long f149362H1 = 0;

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$a */
    /* loaded from: classes7.dex */
    class C32383a implements AbstractC3085d.m {
        C32383a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            GroupCallActivity.this.f149351C0.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$b */
    /* loaded from: classes7.dex */
    public class ViewTreeObserverOnPreDrawListenerC32384b implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC32384b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            GroupCallActivity.this.m156561jd();
            GroupCallActivity.this.f149412l1.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$c */
    /* loaded from: classes7.dex */
    public class C32385c extends RecyclerView.AbstractC1892s {
        C32385c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    GroupCallActivity.this.f149422q1.m110467R(false);
                    GroupCallActivity.this.f149422q1.m10008p();
                } else {
                    GroupCallActivity.this.f149422q1.m110467R(true);
                    AbstractC3098j0.m15579b(GroupCallActivity.this.f149428t1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$d */
    /* loaded from: classes7.dex */
    class C32386d extends AbstractC18391a {
        C32386d() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (GroupCallActivity.this.f149428t1 != null) {
                Message message = new Message();
                message.what = 5;
                GroupCallActivity.this.mo138125Jv(message, 30000L);
                if (GroupCallActivity.this.f149428t1.getText() != null) {
                    GroupCallActivity.this.f149375T.mo138077U4(GroupCallActivity.this.f149428t1.getText().toString().trim().replaceAll("\\s+", " "));
                }
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$e */
    /* loaded from: classes7.dex */
    public class C32387e implements GestureBottomLayout.InterfaceC32491b {
        C32387e() {
        }

        @Override // zm.voip.widgets.GestureBottomLayout.InterfaceC32491b
        /* renamed from: a */
        public void mo156641a() {
            if (!GroupCallActivity.this.f149360G1) {
                GroupCallActivity.this.f149360G1 = true;
                GroupCallActivity.this.f149375T.mo138106td();
            }
            AbstractC3098j0.m15579b(GroupCallActivity.this.f149428t1);
        }

        @Override // zm.voip.widgets.GestureBottomLayout.InterfaceC32491b
        /* renamed from: b */
        public void mo156642b() {
            GroupCallActivity.this.m156621Q8();
            AbstractC3098j0.m15579b(GroupCallActivity.this.f149428t1);
        }

        @Override // zm.voip.widgets.GestureBottomLayout.InterfaceC32491b
        /* renamed from: c */
        public void mo156643c() {
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$f */
    /* loaded from: classes7.dex */
    public class C32388f implements AbstractC3085d.m {
        C32388f() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
            GroupCallActivity.this.f149431v0 = false;
            GroupCallActivity.this.f149429u0 = false;
            GroupCallActivity.this.f149404h1.setVisibility(8);
            GroupCallActivity.this.f149372R0.setSelected(false);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public /* synthetic */ void mo15466b() {
            AbstractC3087e.m15469b(this);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public void mo15467c() {
            GroupCallActivity.this.f149431v0 = false;
            GroupCallActivity.this.f149429u0 = false;
            GroupCallActivity.this.f149404h1.setVisibility(8);
            GroupCallActivity.this.f149372R0.setSelected(false);
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$g */
    /* loaded from: classes7.dex */
    public class C32389g extends AbstractC21707d {
        C32389g() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            GroupCallActivity.this.m156489Lc((float) c21709f.m112033d());
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            GroupCallActivity.this.m156479Jc();
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$h */
    /* loaded from: classes7.dex */
    public class C32390h extends RecyclerView.AbstractC1892s {
        C32390h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    GroupCallActivity.this.f149381W.m110445U(false);
                    GroupCallActivity.this.f149381W.m10008p();
                } else {
                    GroupCallActivity.this.f149381W.m110445U(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$i */
    /* loaded from: classes7.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC32391i implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC32391i() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            GroupCallActivity.this.f149359G0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.f149423r0 = groupCallActivity.f149359G0.getHeight();
            if (GroupCallActivity.this.f149439z0 != null) {
                GroupCallActivity.this.f149375T.mo138055Ad(GroupCallActivity.this.f149439z0.f150073r);
            }
            if (GroupCallActivity.this.f149400f1 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GroupCallActivity.this.f149400f1.getLayoutParams();
                layoutParams.bottomMargin = GroupCallActivity.this.f149423r0;
                GroupCallActivity.this.f149400f1.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$j */
    /* loaded from: classes7.dex */
    public class C32392j extends VoIPButtonWithText {
        C32392j(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            try {
                if (GroupCallActivity.this.f149359G0 != null && GroupCallActivity.this.f149364J0 != null) {
                    float x11 = GroupCallActivity.this.f149365K0.getX() + (GroupCallActivity.this.f149365K0.getWidth() >> 1);
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    GroupCallActivity.this.f149364J0.m157287f(x11, groupCallActivity.m156466G8(groupCallActivity.f149365K0.getButton()) + (GroupCallActivity.this.f149365K0.getButton().getWidth() >> 1));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$k */
    /* loaded from: classes7.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC32393k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC32393k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            GroupCallActivity.this.f149359G0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.f149423r0 = groupCallActivity.f149359G0.getHeight();
            if (GroupCallActivity.this.f149439z0 != null) {
                GroupCallActivity.this.f149375T.mo138055Ad(GroupCallActivity.this.f149439z0.f150073r);
            }
            if (GroupCallActivity.this.f149400f1 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GroupCallActivity.this.f149400f1.getLayoutParams();
                layoutParams.bottomMargin = GroupCallActivity.this.f149423r0;
                GroupCallActivity.this.f149400f1.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$l */
    /* loaded from: classes7.dex */
    public class C32394l extends GridLayoutManager.AbstractC1865b {
        C32394l() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            return GroupCallActivity.this.f149383X.m110481S(i11);
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$m */
    /* loaded from: classes7.dex */
    public class C32395m extends RecyclerView.AbstractC1892s {
        C32395m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                C0815e1.m2075D().m2100V(new C23648e(24, "in_call", 0, "gr_call_scroll", new String[0]).m123926s(String.valueOf(GroupCallActivity.this.f149375T.mo138100ob())), false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            if (i12 > AbstractC3104p.m15650a(8.0f)) {
                GroupCallActivity.this.mo138181pe();
                GroupCallActivity.this.f149375T.mo138093gk();
            }
            GroupCallActivity.this.m156556i7();
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$n */
    /* loaded from: classes7.dex */
    class C32396n implements AbstractC3085d.m {
        C32396n() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            GroupCallActivity.this.f149371Q0.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$o */
    /* loaded from: classes7.dex */
    class C32397o implements AbstractC3085d.m {
        C32397o() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            GroupCallActivity.this.f149374S0.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$p */
    /* loaded from: classes7.dex */
    class C32398p implements AbstractC3085d.m {
        C32398p() {
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: a */
        public void mo15465a() {
            GroupCallActivity.this.f149403h0 = false;
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: b */
        public void mo15466b() {
            GroupCallActivity.this.f149403h0 = true;
            GroupCallActivity.this.f149359G0.setVisibility(0);
        }

        @Override // bp0.AbstractC3085d.m
        /* renamed from: c */
        public /* synthetic */ void mo15467c() {
            AbstractC3087e.m15468a(this);
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$q */
    /* loaded from: classes7.dex */
    public class ViewOnTouchListenerC32399q implements View.OnTouchListener {

        /* renamed from: p */
        private Rect f149457p;

        /* renamed from: q */
        private final int f149458q;

        /* renamed from: r */
        private final Runnable f149459r;

        /* renamed from: s */
        private final C21709f f149460s;

        /* renamed from: t */
        private final int f149461t;

        /* renamed from: u */
        private boolean f149462u;

        ViewOnTouchListenerC32399q(GroupCallActivity groupCallActivity, int i11, C21709f c21709f) {
            this(i11, null, c21709f);
        }

        /* renamed from: a */
        void m156644a(View view, int i11) {
            this.f149462u = false;
            view.setPressed(false);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            if (i11 == 5 || i11 == 9 || i11 == 12) {
                GroupCallActivity.this.f149377U.removeMessages(2);
                GroupCallActivity.this.f149377U.sendEmptyMessageDelayed(2, 5000L);
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            this.f149460s.m112046s(0.0d);
                            if (this.f149462u) {
                                m156644a(view, this.f149458q);
                            }
                        }
                    } else if (this.f149462u) {
                        m156644a(view, this.f149458q);
                        this.f149460s.m112046s(0.0d);
                        if (this.f149457p.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                            GroupCallActivity.this.f149375T.mo138096ie(this.f149458q, Boolean.valueOf(!view.isSelected()));
                        }
                    }
                } else {
                    this.f149462u = true;
                    GroupCallActivity.this.f149377U.removeMessages(2);
                    view.performHapticFeedback(0);
                    this.f149457p = new Rect(view.getLeft() - this.f149461t, view.getTop() - this.f149461t, view.getRight() + this.f149461t, view.getBottom() + this.f149461t);
                    this.f149460s.m112046s(1.0d);
                }
                if (this.f149459r != null) {
                    if (action == 0) {
                        GroupCallActivity.this.f149377U.postDelayed(this.f149459r, ViewConfiguration.getLongPressTimeout());
                    } else if (action == 2) {
                        Rect rect = this.f149457p;
                        if (rect != null && !rect.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                            GroupCallActivity.this.f149377U.removeCallbacks(this.f149459r);
                        }
                    } else if (action == 1) {
                        GroupCallActivity.this.f149377U.removeCallbacks(this.f149459r);
                    }
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return true;
            }
        }

        ViewOnTouchListenerC32399q(int i11, Runnable runnable, C21709f c21709f) {
            this.f149461t = AbstractC3104p.m15650a(10.0f);
            this.f149458q = i11;
            this.f149459r = runnable;
            this.f149460s = c21709f;
        }
    }

    /* renamed from: zm.voip.ui.incall.GroupCallActivity$r */
    /* loaded from: classes7.dex */
    public static class HandlerC32400r extends Handler {

        /* renamed from: a */
        private final WeakReference f149464a;

        HandlerC32400r(GroupCallActivity groupCallActivity) {
            this.f149464a = new WeakReference(groupCallActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            GroupCallActivity groupCallActivity = (GroupCallActivity) this.f149464a.get();
            if (groupCallActivity != null) {
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                if (i11 == 6) {
                                    groupCallActivity.m156483K8(message.arg1, message.arg2);
                                    return;
                                }
                                return;
                            } else {
                                if (groupCallActivity.f149404h1 != null) {
                                    groupCallActivity.m156621Q8();
                                    return;
                                }
                                return;
                            }
                        }
                        if (message.obj instanceof C25942f) {
                            groupCallActivity.f149375T.mo138097j5((C25942f) message.obj, message.arg1);
                            return;
                        }
                        return;
                    }
                    groupCallActivity.f149375T.mo138072P8();
                    return;
                }
                groupCallActivity.f149375T.mo138081Xc();
            }
        }
    }

    /* renamed from: A7 */
    private void m156448A7() {
        m156628a8();
        m156634p7();
        m156476J7();
        m156636s7();
        m156618F7();
    }

    /* renamed from: A9 */
    public /* synthetic */ boolean m156449A9(View view, MotionEvent motionEvent) {
        m156621Q8();
        return true;
    }

    /* renamed from: Ab */
    public /* synthetic */ void m156450Ab(int i11) {
        this.f149375T.mo138054A0(i11);
    }

    /* renamed from: Cb */
    public /* synthetic */ void m156453Cb() {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112036m, 0);
    }

    /* renamed from: Ea */
    public /* synthetic */ void m156457Ea(boolean z11) {
        this.f149375T.mo138103s8(z11);
    }

    /* renamed from: Ee */
    private void m156458Ee() {
        int i11;
        int i12;
        LinearLayout linearLayout = this.f149359G0;
        if (linearLayout != null) {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC32393k());
            int m15682q = AbstractC3104p.m15682q();
            if (this.f149375T.mo138082Yb()) {
                i12 = AbstractC3104p.m15670k() / 5;
                i11 = (AbstractC3104p.m15670k() / 2) + AbstractC3104p.m15653b0();
                this.f149359G0.setBackgroundResource(AbstractC16803z.res_call_bg_video_control_layout);
            } else {
                this.f149359G0.setBackgroundResource(0);
                i11 = m15682q;
                i12 = 0;
            }
            this.f149359G0.setPadding(AbstractC3104p.m15650a(20.0f), i12, AbstractC3104p.m15650a(20.0f), i11);
        }
    }

    /* renamed from: F9 */
    public /* synthetic */ void m156460F9() {
        Message message = new Message();
        message.what = 5;
        mo138125Jv(message, 30000L);
    }

    /* renamed from: Fa */
    public /* synthetic */ void m156461Fa(View view) {
        this.f149375T.mo138067Ld(this.f149396d1.isSelected());
    }

    /* renamed from: Fd */
    private void m156462Fd() {
        try {
            m156490Le();
            m156473Ie();
            m156516Ve();
            if (this.f149431v0) {
                m156622Rd();
            }
            this.f149377U.postDelayed(new Runnable() { // from class: vo0.o
                public /* synthetic */ RunnableC28481o() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.m156605xc();
                }
            }, 200L);
            mo138191v0(0L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G8 */
    public int m156466G8(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getTop();
        }
        return view.getTop() + m156466G8((View) view.getParent());
    }

    /* renamed from: Gd */
    private void m156467Gd(boolean z11) {
        if (z11) {
            this.f149420p1.setVisibility(8);
            this.f149426s1.setVisibility(0);
            this.f149426s1.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f149375T.mo138058Dd().size() > 0) {
            this.f149426s1.setVisibility(8);
            this.f149420p1.setVisibility(0);
        } else {
            this.f149420p1.setVisibility(8);
            this.f149426s1.setVisibility(0);
            this.f149426s1.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: I9 */
    public /* synthetic */ void m156471I9() {
        CustomEditText customEditText = this.f149428t1;
        if (customEditText != null && this.f149431v0) {
            customEditText.clearFocus();
            this.f149428t1.requestFocus();
        }
        this.f149412l1.setMinimizedWithAnimation(0);
        CustomEditText customEditText2 = this.f149428t1;
        if (customEditText2 != null && this.f149431v0) {
            customEditText2.clearFocus();
            this.f149428t1.requestFocus();
        }
    }

    /* renamed from: Ic */
    public /* synthetic */ void m156472Ic(List list) {
        GCallAvatarView gCallAvatarView = this.f149388Z0;
        if (gCallAvatarView != null && list != null) {
            gCallAvatarView.m157441c0(list, list.size());
        }
    }

    /* renamed from: Ie */
    private void m156473Ie() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f149388Z0.getLayoutParams();
        layoutParams.height = AbstractC3104p.m15656d();
        this.f149388Z0.setLayoutParams(layoutParams);
    }

    /* renamed from: J7 */
    private void m156476J7() {
        if (this.f149401g0) {
            return;
        }
        this.f149401g0 = true;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149386Y0 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_vidInfoContainer);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-1, -2);
        m15700c.setMargins(AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15628E(), AbstractC3104p.m15650a(10.0f), 0);
        this.f149386Y0.setLayoutParams(m15700c);
        this.f149386Y0.setOrientation(1);
        GCallAvatarView gCallAvatarView = new GCallAvatarView(getContext());
        this.f149388Z0 = gCallAvatarView;
        gCallAvatarView.setId(AbstractC6918a0.call_vidAvatarView);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.gravity = 1;
        this.f149388Z0.setLayoutParams(m15701d);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f149390a1 = robotoTextView;
        robotoTextView.setId(AbstractC6918a0.call_vidRemoteName);
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        m15701d2.gravity = 1;
        m15701d2.topMargin = AbstractC3104p.m15646W();
        m15701d2.leftMargin = AbstractC3104p.m15650a(10.0f);
        m15701d2.rightMargin = AbstractC3104p.m15650a(10.0f);
        this.f149390a1.setLayoutParams(m15701d2);
        this.f149390a1.setSingleLine();
        this.f149390a1.setMaxLines(1);
        this.f149390a1.setEllipsize(TextUtils.TruncateAt.END);
        this.f149390a1.setTextColor(-1);
        this.f149390a1.setTextStyleBold(true);
        this.f149390a1.setTextSize(1, 24.0f);
        RobotoTextView robotoTextView2 = new RobotoTextView(getContext());
        this.f149392b1 = robotoTextView2;
        robotoTextView2.setId(AbstractC6918a0.call_vidCallStatus);
        LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(-2, -2);
        m15701d3.gravity = 1;
        m15701d3.topMargin = AbstractC3104p.m15650a(6.0f);
        this.f149392b1.setLayoutParams(m15701d3);
        this.f149392b1.setMaxLines(3);
        this.f149392b1.setGravity(17);
        this.f149392b1.setTextSize(1, 18.0f);
        this.f149392b1.setTextColor(-1);
        this.f149386Y0.addView(this.f149388Z0);
        this.f149386Y0.addView(this.f149390a1);
        this.f149386Y0.addView(this.f149392b1);
        this.f149435x0.addView(this.f149386Y0);
    }

    /* renamed from: J8 */
    private void m156477J8(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            mo70710wy(new Runnable() { // from class: vo0.t

                /* renamed from: q */
                public final /* synthetic */ Intent f132453q;

                public /* synthetic */ RunnableC28516t(Intent intent2) {
                    r2 = intent2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.m156488Lb(r2);
                }
            });
        }
    }

    /* renamed from: Ja */
    public /* synthetic */ void m156478Ja(View view) {
        this.f149375T.mo138096ie(24, new Object[0]);
        m156577pd();
    }

    /* renamed from: Jc */
    public void m156479Jc() {
        if (this.f149357F0.getAlpha() == 0.0f) {
            this.f149357F0.setVisibility(8);
            this.f149397e0 = false;
        } else {
            this.f149357F0.setVisibility(0);
        }
    }

    /* renamed from: Jd */
    private void m156480Jd() {
        MultiStateView multiStateView = this.f149426s1;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_loading));
        }
    }

    /* renamed from: K7 */
    private void m156482K7() {
        int m15650a = AbstractC3104p.m15650a(10.0f);
        int m15650a2 = AbstractC3104p.m15650a(30.0f);
        int i11 = m15650a2 + m15650a;
        if (this.f149394c1 == null) {
            FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
            m15698a.topMargin = AbstractC3104p.m15641R();
            m15698a.gravity = 5;
            GestureRightLayout gestureRightLayout = new GestureRightLayout(getContext());
            this.f149394c1 = gestureRightLayout;
            gestureRightLayout.setLayoutParams(m15698a);
        }
        this.f149394c1.setMinPosition(0);
        this.f149394c1.setMaxPosition(AbstractC3104p.m15663g0() + i11);
        this.f149394c1.setGestureListener(new GestureRightLayout.InterfaceC32493b() { // from class: vo0.y0
            public /* synthetic */ C28552y0() {
            }

            @Override // zm.voip.widgets.GestureRightLayout.InterfaceC32493b
            /* renamed from: a */
            public final void mo142946a(boolean z11) {
                GroupCallActivity.this.m156457Ea(z11);
            }
        });
        m156545ef(true);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(m15650a2, m15650a2);
        m15700c.gravity = 16;
        m15700c.leftMargin = m15650a;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f149396d1 = appCompatImageView;
        appCompatImageView.setLayoutParams(m15700c);
        this.f149396d1.setScaleType(ImageView.ScaleType.CENTER);
        this.f149396d1.setImageResource(AbstractC16803z.ic_pullbar_members_gc_selector);
        this.f149396d1.setOnClickListener(new View.OnClickListener() { // from class: vo0.z0
            public /* synthetic */ ViewOnClickListenerC28559z0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156461Fa(view);
            }
        });
        this.f149396d1.setVisibility(8);
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-2, -2);
        m15698a2.leftMargin = i11;
        m15698a2.height = AbstractC3104p.m15650a(48.0f);
        m15698a2.gravity = 5;
        RoundedCallView roundedCallView = new RoundedCallView(getContext());
        roundedCallView.setLayoutParams(m15698a2);
        roundedCallView.setBackgroundResource(AbstractC16803z.res_call_bg_members_group_call);
        roundedCallView.setCornerRadius(AbstractC23136l9.m118742r(24.0f));
        roundedCallView.setRoundedCorner(9);
        this.f149387Z = new LinearLayoutManager(this, 0, false);
        this.f149381W = new C21329g(this);
        FrameLayout.LayoutParams m15698a3 = AbstractC3105q.m15698a(-2, -1);
        m15698a3.gravity = 16;
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f149398e1 = recyclerView;
        recyclerView.setLayoutParams(m15698a3);
        this.f149398e1.setAdapter(this.f149381W);
        this.f149398e1.setLayoutManager(this.f149387Z);
        this.f149398e1.m9826E(new C32390h());
        roundedCallView.addView(this.f149398e1);
        this.f149394c1.addView(this.f149396d1);
        this.f149394c1.addView(roundedCallView);
        this.f149394c1.setMinimized(true);
    }

    /* renamed from: K8 */
    public void m156483K8(int i11, int i12) {
        this.f149383X.m110491d0(i11, i12);
    }

    /* renamed from: K9 */
    public /* synthetic */ void m156484K9(View view) {
        m156621Q8();
    }

    /* renamed from: Kb */
    public /* synthetic */ void m156485Kb(int i11, Object[] objArr) {
        if (i11 != 27) {
            if (i11 != 65) {
                if (i11 != 1003) {
                    if (i11 != 1006) {
                        if (i11 != 10018) {
                            if (i11 != 10022) {
                                if (i11 != 10035) {
                                    if (i11 != 40019) {
                                        if (i11 != 1000) {
                                            if (i11 != 1001) {
                                                switch (i11) {
                                                    case 40011:
                                                        if (objArr != null) {
                                                            this.f149375T.mo138109u2(Integer.valueOf(((Integer) objArr[0]).intValue()));
                                                            return;
                                                        }
                                                        return;
                                                    case 40012:
                                                        if (objArr != null) {
                                                            this.f149375T.mo138111xe((C25942f) objArr[0], Integer.valueOf(((Integer) objArr[1]).intValue()));
                                                            return;
                                                        }
                                                        return;
                                                    case 40013:
                                                        if (objArr != null && objArr.length == 3) {
                                                            C25942f c25942f = (C25942f) objArr[0];
                                                            C25942f c25942f2 = (C25942f) objArr[1];
                                                            this.f149375T.mo138061I4(((Integer) objArr[2]).intValue(), c25942f, c25942f2);
                                                            return;
                                                        }
                                                        return;
                                                    case 40014:
                                                        try {
                                                            this.f149375T.mo138113zp();
                                                            break;
                                                        } catch (Exception e11) {
                                                            e11.printStackTrace();
                                                            break;
                                                        }
                                                    case 40015:
                                                        try {
                                                            this.f149375T.mo138090f5(objArr);
                                                            return;
                                                        } catch (Exception e12) {
                                                            e12.printStackTrace();
                                                            return;
                                                        }
                                                    case 40016:
                                                        if (objArr != null) {
                                                            try {
                                                                if (objArr.length >= 1 && ((Integer) objArr[0]).intValue() == 0) {
                                                                    this.f149375T.mo138096ie(28, new Object[0]);
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (Exception e13) {
                                                                e13.printStackTrace();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    case 40017:
                                                        if (objArr != null && objArr.length == 1) {
                                                            this.f149375T.mo138075Ta((C25942f) objArr[0]);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        } else {
                                            this.f149375T.mo138064J7(objArr);
                                            return;
                                        }
                                    } else {
                                        runOnUiThread(new Runnable() { // from class: vo0.k0
                                            public /* synthetic */ RunnableC28451k0() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                GroupCallActivity.this.m156453Cb();
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    try {
                                        mo138166g3();
                                        return;
                                    } catch (Exception e14) {
                                        e14.printStackTrace();
                                        return;
                                    }
                                }
                            } else {
                                this.f149375T.mo138091ga(objArr);
                                return;
                            }
                        } else {
                            if (objArr != null && objArr.length >= 1) {
                                runOnUiThread(new Runnable() { // from class: vo0.j0

                                    /* renamed from: q */
                                    public final /* synthetic */ int f132354q;

                                    public /* synthetic */ RunnableC28443j0(int i12) {
                                        r2 = i12;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        GroupCallActivity.this.m156450Ab(r2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if (objArr != null && objArr.length >= 1) {
                        this.f149375T.mo138080W1(((Integer) objArr[1]).intValue());
                        return;
                    }
                    return;
                }
                try {
                    this.f149375T.mo138070Ok(i11, objArr);
                    return;
                } catch (Exception e15) {
                    AbstractC3082b0.m15423e("VOIP_GroupCallActivity", "handleNotificationCall failed", e15);
                    e15.printStackTrace();
                    return;
                }
            }
            try {
                this.f149375T.mo138105t1();
                return;
            } catch (Exception e16) {
                e16.printStackTrace();
                return;
            }
        }
        try {
            this.f149375T.mo138088c4(objArr);
        } catch (Exception e17) {
            e17.printStackTrace();
        }
    }

    /* renamed from: La */
    public static /* synthetic */ boolean m156487La(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: Lb */
    public /* synthetic */ void m156488Lb(Intent intent) {
        if (intent.getExtras().getBoolean("EXTRA_DATA_ACCEPT_CALL_FROM_NOTI")) {
            this.f149375T.mo138066Ki();
        }
    }

    /* renamed from: Lc */
    public void m156489Lc(float f11) {
        float f12 = 1.0f - f11;
        this.f149357F0.setTranslationX((this.f149417o0 - this.f149413m0) * f12);
        this.f149357F0.setTranslationY((this.f149419p0 - this.f149415n0) * f12);
        this.f149357F0.setScaleY(f11);
        this.f149357F0.setScaleX(f11);
        this.f149357F0.setAlpha(f11);
    }

    /* renamed from: Le */
    private void m156490Le() {
        int m15670k = AbstractC3104p.m15670k();
        int m15666i = AbstractC3104p.m15666i();
        CircleBackgroundAnswer circleBackgroundAnswer = this.f149364J0;
        if (circleBackgroundAnswer != null) {
            circleBackgroundAnswer.setDiameter(m15670k);
        }
        m156458Ee();
        VoIPButtonWithText voIPButtonWithText = this.f149363I0;
        if (voIPButtonWithText != null) {
            voIPButtonWithText.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
        VoIPButtonWithText voIPButtonWithText2 = this.f149365K0;
        if (voIPButtonWithText2 != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) voIPButtonWithText2.getLayoutParams();
            layoutParams.leftMargin = AbstractC3104p.m15659e0() / 4;
            this.f149365K0.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            this.f149365K0.setLayoutParams(layoutParams);
        }
        VoIPButtonWithText voIPButtonWithText3 = this.f149367M0;
        if (voIPButtonWithText3 != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) voIPButtonWithText3.getLayoutParams();
            this.f149367M0.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            this.f149367M0.setLayoutParams(layoutParams2);
        }
        VoIPButtonWithText voIPButtonWithText4 = this.f149369O0;
        if (voIPButtonWithText4 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) voIPButtonWithText4.getLayoutParams();
            layoutParams3.leftMargin = m15666i;
            this.f149369O0.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            this.f149369O0.setLayoutParams(layoutParams3);
        }
        VoIPButtonWithText voIPButtonWithText5 = this.f149370P0;
        if (voIPButtonWithText5 != null) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) voIPButtonWithText5.getLayoutParams();
            layoutParams4.leftMargin = m15666i;
            this.f149370P0.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
            this.f149370P0.setLayoutParams(layoutParams4);
        }
        VoIPButtonWithText voIPButtonWithText6 = this.f149368N0;
        if (voIPButtonWithText6 != null) {
            voIPButtonWithText6.m157418c(AbstractC3105q.m15703f(m15670k, m15670k));
        }
    }

    /* renamed from: Ma */
    public /* synthetic */ void m156493Ma(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f149413m0 = i11 + ((i13 - i11) / 2);
        this.f149415n0 = i12 + ((i14 - i12) / 2);
    }

    /* renamed from: Mc */
    private void m156494Mc(boolean z11) {
        this.f149375T.mo138068Mn(Boolean.valueOf(z11));
        m156520We(z11);
        if (z11) {
            C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 1, "call_miniview", new String[0]).m123926s(String.valueOf(2), "1"), false);
        } else {
            this.f149375T.mo138084ap(false);
            AbstractC32273e3.m155748Q().m155906p0();
        }
    }

    /* renamed from: N7 */
    private void m156496N7() {
        CircleBackgroundImageView circleBackgroundImageView = new CircleBackgroundImageView(getContext());
        this.f149371Q0 = circleBackgroundImageView;
        circleBackgroundImageView.setId(AbstractC6918a0.call_minimizeBtn);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15674m(), AbstractC3104p.m15674m());
        m15700c.topMargin = AbstractC3104p.m15626C();
        m15700c.leftMargin = AbstractC3104p.m15678o();
        this.f149371Q0.setLayoutParams(m15700c);
        this.f149371Q0.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_chevron_left_line_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
        this.f149371Q0.setEnabled(false);
        this.f149371Q0.setVisibility(4);
        this.f149371Q0.setOnClickListener(new View.OnClickListener() { // from class: vo0.l0
            public /* synthetic */ ViewOnClickListenerC28459l0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156478Ja(view);
            }
        });
        this.f149435x0.addView(this.f149371Q0);
    }

    /* renamed from: Nd */
    private void m156497Nd(int i11) {
        MultiStateView multiStateView = this.f149426s1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: O9 */
    public /* synthetic */ void m156500O9() {
        if (C23055e5.m118271f()) {
            this.f149375T.mo138106td();
            return;
        }
        m156467Gd(false);
        this.f149426s1.setState(MultiStateView.EnumC15914e.ERROR);
        this.f149426s1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        this.f149426s1.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
    }

    /* renamed from: Q9 */
    public /* synthetic */ void m156503Q9(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        VoIPButtonWithText voIPButtonWithText;
        if (!this.f149403h0 && (voIPButtonWithText = this.f149361H0) != null && this.f149357F0 != null) {
            int[] iArr = new int[2];
            voIPButtonWithText.getLocationInWindow(iArr);
            int i19 = iArr[0];
            int i21 = iArr[1];
            this.f149417o0 = ((i13 - i11) / 2) + i19;
            this.f149419p0 = i21;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149357F0.getLayoutParams();
            layoutParams.rightMargin = (this.f149435x0.getWidth() - i19) - this.f149361H0.getWidth();
            layoutParams.bottomMargin = m156610y8();
            this.f149357F0.setLayoutParams(layoutParams);
            if (this.f149357F0.isShown()) {
                mo138191v0(0L);
            }
        }
    }

    /* renamed from: R9 */
    public /* synthetic */ void m156506R9(View view) {
        this.f149375T.mo138096ie(5, Boolean.valueOf(true ^ this.f149367M0.isSelected()));
    }

    /* renamed from: Sc */
    private void m156508Sc(C1421e c1421e) {
        C1421e c1421e2 = AbstractC3104p.f13192i;
        if (c1421e2 != null && c1421e2.f6231b >= c1421e.f6231b && c1421e2.f6233d >= c1421e.f6233d) {
            return;
        }
        AbstractC3104p.f13192i = c1421e;
        CircleBackgroundImageView circleBackgroundImageView = this.f149371Q0;
        if (circleBackgroundImageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) circleBackgroundImageView.getLayoutParams();
            marginLayoutParams.topMargin = AbstractC3104p.m15626C();
            this.f149371Q0.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout = this.f149351C0;
        if (linearLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams2.topMargin = AbstractC3104p.m15626C();
            this.f149351C0.setLayoutParams(marginLayoutParams2);
        }
        CircleBackgroundImageView circleBackgroundImageView2 = this.f149374S0;
        if (circleBackgroundImageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) circleBackgroundImageView2.getLayoutParams();
            marginLayoutParams3.topMargin = AbstractC3104p.m15626C();
            this.f149374S0.setLayoutParams(marginLayoutParams3);
        }
        GestureRightLayout gestureRightLayout = this.f149394c1;
        if (gestureRightLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) gestureRightLayout.getLayoutParams();
            marginLayoutParams4.topMargin = AbstractC3104p.m15641R();
            this.f149394c1.setLayoutParams(marginLayoutParams4);
        }
        m156458Ee();
    }

    /* renamed from: T7 */
    private void m156511T7() {
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.leftMargin = AbstractC3104p.m15650a(16.0f);
        m15698a.rightMargin = AbstractC3104p.m15650a(16.0f);
        m15698a.topMargin = AbstractC3104p.m15650a(40.0f);
        ToastCountdownCustomView toastCountdownCustomView = new ToastCountdownCustomView(getContext());
        this.f149406i1 = toastCountdownCustomView;
        toastCountdownCustomView.setLayoutParams(m15698a);
        this.f149406i1.setVisibility(8);
        this.f149435x0.addView(this.f149406i1);
    }

    /* renamed from: Va */
    public /* synthetic */ void m156515Va(View view) {
        this.f149375T.mo138078Va();
    }

    /* renamed from: Ve */
    private void m156516Ve() {
        FrameLayout.LayoutParams m15698a;
        int m15685r0;
        int m15635L;
        int m15643T;
        int m15678o;
        if (this.f149439z0 == null) {
            return;
        }
        if (this.f149375T.mo138112zm()) {
            m15698a = (FrameLayout.LayoutParams) this.f149439z0.getLayoutParams();
            if (mo138118F2()) {
                m15685r0 = AbstractC3104p.m15679o0();
            } else {
                m15685r0 = AbstractC3104p.m15685r0();
            }
            m15698a.width = m15685r0;
            if (mo138118F2()) {
                m15635L = AbstractC3104p.m15631H();
            } else {
                m15635L = AbstractC3104p.m15635L();
            }
            m15698a.height = m15635L;
            m15698a.gravity = 8388661;
            if (mo138118F2()) {
                m15643T = AbstractC3104p.m15650a(5.0f);
            } else {
                m15643T = AbstractC3104p.m15643T();
            }
            m15698a.topMargin = m15643T;
            if (mo138118F2()) {
                m15678o = AbstractC3104p.m15650a(5.0f);
            } else {
                m15678o = AbstractC3104p.m15678o();
            }
            m15698a.rightMargin = m15678o;
        } else {
            m15698a = AbstractC3105q.m15698a(-1, -1);
        }
        this.f149439z0.setLayoutParams(m15698a);
    }

    /* renamed from: W7 */
    private void m156519W7() {
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 81;
        m15698a.bottomMargin = this.f149423r0;
        m15698a.leftMargin = AbstractC3104p.m15650a(8.0f);
        m15698a.rightMargin = AbstractC3104p.m15650a(8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149400f1 = linearLayout;
        linearLayout.setLayoutParams(m15698a);
        this.f149400f1.setPadding(AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(2.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(2.0f));
        this.f149400f1.setOrientation(0);
        this.f149400f1.setBackgroundResource(AbstractC16803z.bg_gcall_scroll_reminder);
        this.f149402g1 = new AppCompatImageView(getContext());
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.gravity = 48;
        m15701d.topMargin = 0;
        m15701d.bottomMargin = 0;
        this.f149402g1.setLayoutParams(m15701d);
        this.f149402g1.setPadding(0, 0, 0, 0);
        this.f149402g1.setImageResource(AbstractC16803z.ic_gcall_arrow_up);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        m15701d2.gravity = 16;
        m15701d2.setMargins(AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(4.0f), 0, AbstractC3104p.m15650a(4.0f));
        robotoTextView.setLayoutParams(m15701d2);
        robotoTextView.setTextColor(getResources().getColor(AbstractC16801x.white));
        robotoTextView.setText(getString(AbstractC8020f0.str_gcall_scroll_tip));
        robotoTextView.setTextSize(1, 14.0f);
        this.f149400f1.addView(this.f149402g1);
        this.f149400f1.addView(robotoTextView);
        FrameLayout frameLayout = this.f149435x0;
        frameLayout.addView(this.f149400f1, frameLayout.indexOfChild(this.f149404h1));
    }

    /* renamed from: We */
    private void m156520We(boolean z11) {
        try {
            this.f149383X.m110489b0(z11);
            if (!this.f149433w0) {
                this.f149383X.m110494h0();
            }
            m156528Ye();
            m156569n7();
            m156533af();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X7 */
    private void m156524X7() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149357F0 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_tableNewMenu);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 85;
        this.f149357F0.setLayoutParams(m15698a);
        this.f149357F0.setMinimumWidth(AbstractC3104p.m15650a(180.0f));
        this.f149357F0.setBackgroundResource(AbstractC16803z.bg_new_menu_video_call);
        this.f149357F0.setVisibility(8);
        this.f149357F0.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.s0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m156487La;
                m156487La = GroupCallActivity.m156487La(view, motionEvent);
                return m156487La;
            }
        });
        this.f149357F0.setOrientation(1);
        ViewOnLayoutChangeListenerC28517t0 viewOnLayoutChangeListenerC28517t0 = new View.OnLayoutChangeListener() { // from class: vo0.t0
            public /* synthetic */ ViewOnLayoutChangeListenerC28517t0() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                GroupCallActivity.this.m156493Ma(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f149411l0 = viewOnLayoutChangeListenerC28517t0;
        this.f149357F0.addOnLayoutChangeListener(viewOnLayoutChangeListenerC28517t0);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.leftMargin = AbstractC3104p.m15650a(14.0f);
        m15701d.gravity = 16;
        VoIPButtonWithText voIPButtonWithText = new VoIPButtonWithText(getContext(), 1);
        this.f149372R0 = voIPButtonWithText;
        voIPButtonWithText.m157418c(AbstractC3105q.m15703f(AbstractC3104p.m15676n(), AbstractC3104p.m15676n()));
        this.f149372R0.m157420e(AbstractC16803z.ic_gcall_add_members_selector);
        this.f149372R0.m157425j(true);
        this.f149372R0.setEnabled(false);
        this.f149372R0.m157421f(getString(AbstractC8020f0.str_gcall_add_member));
        this.f149372R0.m157423h(1, 15.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f));
        this.f149372R0.setPadding(AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f));
        this.f149372R0.setLayoutParams(layoutParams);
        this.f149372R0.setId(AbstractC6918a0.call_addMembersBtn);
        this.f149372R0.m157424i(m15701d);
        this.f149372R0.getButton().setContentDescription("Add member");
        this.f149372R0.setEnabled(false);
        this.f149372R0.setAlignmentTextView(4);
        this.f149372R0.getTextView().setMaxLines(1);
        this.f149372R0.getTextView().setSingleLine();
        this.f149372R0.m157422g(AbstractC23136l9.m118645D(getContext(), AbstractC16801x.color_call_text_more_menu));
        RobotoTextView textView = this.f149372R0.getTextView();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f149372R0.setOnClickListener(new View.OnClickListener() { // from class: vo0.u0
            public /* synthetic */ ViewOnClickListenerC28524u0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156515Va(view);
            }
        });
        this.f149376T0 = m156527Y7();
        this.f149378U0 = m156527Y7();
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        m15701d2.leftMargin = AbstractC3104p.m15650a(14.0f);
        m15701d2.gravity = 16;
        VoIPButtonWithText voIPButtonWithText2 = new VoIPButtonWithText(getContext(), 1);
        this.f149380V0 = voIPButtonWithText2;
        voIPButtonWithText2.m157418c(AbstractC3105q.m15703f(AbstractC3104p.m15676n(), AbstractC3104p.m15676n()));
        this.f149380V0.m157419d(m156570n8(m156631i9()));
        this.f149380V0.m157425j(true);
        this.f149380V0.setEnabled(false);
        this.f149380V0.m157422g(AbstractC23136l9.m118645D(getContext(), AbstractC16801x.color_call_text_more_menu));
        this.f149380V0.m157421f(getString(AbstractC8020f0.str_gcall_view_mode_single));
        this.f149380V0.m157423h(1, 15.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f));
        this.f149380V0.setPadding(AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f));
        this.f149380V0.setLayoutParams(layoutParams2);
        this.f149380V0.setId(AbstractC6918a0.call_gridViewBtn);
        this.f149380V0.m157424i(m15701d2);
        this.f149380V0.getButton().setContentDescription("view mode");
        this.f149380V0.setAlignmentTextView(4);
        this.f149380V0.getTextView().setMaxLines(1);
        this.f149380V0.getTextView().setSingleLine();
        this.f149380V0.getTextView().setEllipsize(truncateAt);
        this.f149380V0.setOnClickListener(new View.OnClickListener() { // from class: vo0.v0
            public /* synthetic */ ViewOnClickListenerC28531v0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156552hb(view);
            }
        });
        LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(-2, -2);
        m15701d3.leftMargin = AbstractC3104p.m15650a(14.0f);
        m15701d3.gravity = 16;
        VoIPButtonWithText voIPButtonWithText3 = new VoIPButtonWithText(getContext(), 1);
        this.f149366L0 = voIPButtonWithText3;
        voIPButtonWithText3.m157418c(AbstractC3105q.m15703f(AbstractC3104p.m15676n(), AbstractC3104p.m15676n()));
        this.f149366L0.m157420e(AbstractC16803z.ic_call_video_new_menu_speaker);
        this.f149366L0.m157425j(true);
        this.f149366L0.setEnabled(false);
        this.f149366L0.m157421f(getString(AbstractC8020f0.str_call_speaker_button_text));
        this.f149366L0.m157423h(1, 15.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(6.0f));
        this.f149366L0.setPadding(AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f), AbstractC3104p.m15650a(8.0f));
        this.f149366L0.setLayoutParams(layoutParams3);
        this.f149366L0.setId(AbstractC6918a0.call_speakerBtn);
        this.f149366L0.m157424i(m15701d3);
        this.f149366L0.getButton().setContentDescription("Change speaker");
        this.f149366L0.setAlignmentTextView(4);
        this.f149366L0.getTextView().setMaxLines(1);
        this.f149366L0.getTextView().setSingleLine();
        this.f149366L0.setVisibility(0);
        this.f149366L0.getTextView().setEllipsize(truncateAt);
        this.f149366L0.m157422g(AbstractC23136l9.m118645D(getContext(), AbstractC16801x.color_call_text_more_menu));
        this.f149366L0.setOnClickListener(new View.OnClickListener() { // from class: vo0.w0
            public /* synthetic */ ViewOnClickListenerC28538w0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156560jb(view);
            }
        });
        this.f149357F0.addView(this.f149372R0);
        this.f149357F0.addView(this.f149376T0);
        this.f149357F0.addView(this.f149380V0);
        this.f149357F0.addView(this.f149378U0);
        this.f149357F0.addView(this.f149366L0);
        this.f149435x0.addView(this.f149357F0);
    }

    /* renamed from: Xb */
    private void m156525Xb(boolean z11) {
        C1593q2 m7840U = AbstractC1579n0.m7840U(mo35585v());
        if (m7840U == null) {
            return;
        }
        if (z11) {
            m7840U.m8144a(C1580n1.m.m8118f());
            m7840U.m8145b(1);
        } else {
            m7840U.m8146c(C1580n1.m.m8118f());
        }
    }

    /* renamed from: Y7 */
    private RobotoTextView m156527Y7() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        robotoTextView.setId(AbstractC6918a0.call_newMenuSeparator);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC3104p.m15650a(0.5f));
        layoutParams.leftMargin = AbstractC3104p.m15650a(28.0f) + AbstractC3104p.m15676n();
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.call_divider_color));
        return robotoTextView;
    }

    /* renamed from: Ye */
    private void m156528Ye() {
        VoIPItemAva voIPItemAva;
        int i11;
        SelfCallView selfCallView = this.f149347A0;
        if (selfCallView != null && (voIPItemAva = selfCallView.f150101x) != null) {
            if (this.f149375T.mo138107ti(mo138118F2())) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            voIPItemAva.setVisibility(i11);
        }
    }

    /* renamed from: aa */
    public /* synthetic */ void m156532aa(View view) {
        this.f149375T.mo138096ie(3, new Object[0]);
    }

    /* renamed from: af */
    private void m156533af() {
        m156545ef(false);
    }

    /* renamed from: b9 */
    private void m156535b9() {
        try {
            if (this.f149404h1 == null) {
                m156578q7();
            } else {
                m156622Rd();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bb */
    public /* synthetic */ void m156536bb() {
        this.f149375T.mo138076Td(this.f149380V0.isSelected());
    }

    /* renamed from: c7 */
    private void m156537c7() {
        try {
            C0815e1.m2075D().m2100V(new C23648e(24, "in_call", 1, "gr_call_add_member_dialog", String.valueOf(this.f149375T.getGroupId()), String.valueOf(System.currentTimeMillis() - this.f149362H1)), false);
            this.f149362H1 = 0L;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c8 */
    private void m156538c8() {
        boolean isInPictureInPictureMode;
        PictureInPictureParams.Builder aspectRatio;
        PictureInPictureParams build;
        try {
            if (AbstractC3096i0.m15536f()) {
                isInPictureInPictureMode = isInPictureInPictureMode();
                if (isInPictureInPictureMode) {
                    return;
                }
                Rational rational = new Rational(AbstractC3104p.m15687s0(true), AbstractC3104p.m15636M(true));
                AbstractC28394d.m142928a();
                PictureInPictureParams.Builder m142926a = AbstractC28386c.m142926a();
                aspectRatio = m142926a.setAspectRatio(rational);
                aspectRatio.build();
                build = m142926a.build();
                enterPictureInPictureMode(build);
                this.f149375T.mo138073Pk(true, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ea */
    public /* synthetic */ void m156543ea(View view) {
        this.f149375T.mo138096ie(21, new Object[0]);
    }

    /* renamed from: ec */
    public /* synthetic */ void m156544ec(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i14 != i18) {
            this.f149375T.mo138062I5(i14);
        }
    }

    /* renamed from: ef */
    private void m156545ef(boolean z11) {
        int i11;
        long j11;
        GestureRightLayout gestureRightLayout = this.f149394c1;
        if (gestureRightLayout == null) {
            return;
        }
        if (this.f149375T.mo138083Yg(mo138118F2())) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        gestureRightLayout.setVisibility(i11);
        GestureRightLayout gestureRightLayout2 = this.f149394c1;
        boolean mo138083Yg = this.f149375T.mo138083Yg(mo138118F2());
        if (z11) {
            j11 = 0;
        } else {
            j11 = 200;
        }
        AbstractC3085d.m15443e(gestureRightLayout2, mo138083Yg, j11);
    }

    /* renamed from: fa */
    public /* synthetic */ void m156548fa(View view) {
        this.f149375T.mo138096ie(12, Boolean.valueOf(true ^ this.f149368N0.isSelected()));
    }

    /* renamed from: g7 */
    private void m156549g7() {
        try {
            this.f149436x1.m112030a(new C18556p(this.f149367M0.getButton()));
            this.f149438y1.m112030a(new C18556p(this.f149366L0.getButton()));
            this.f149440z1.m112030a(new C18556p(this.f149368N0.getButton()));
            this.f149348A1.m112030a(new C18556p(this.f149374S0));
            this.f149350B1.m112030a(new C18556p(this.f149361H0.getButton()));
            this.f149352C1.m112030a(new C18556p(this.f149369O0.getButton()));
            this.f149354D1.m112030a(new C18556p(this.f149370P0.getButton()));
            this.f149356E1.m112030a(new C32389g());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g8 */
    private void m156550g8() {
        DialogView dialogView = this.f149408j1;
        if (dialogView != null && dialogView.m92595KK()) {
            DialogView dialogView2 = this.f149408j1;
            if (dialogView2 instanceof PreviewCameraGroupCallDialog) {
                ((PreviewCameraGroupCallDialog) dialogView2).m157227XK();
            } else {
                dialogView2.dismiss();
            }
        }
    }

    /* renamed from: h9 */
    private void m156551h9() {
        FrameLayout frameLayout = new FrameLayout(this);
        this.f149435x0 = frameLayout;
        frameLayout.setId(AbstractC6918a0.call_main_frame);
        this.f149435x0.setBackgroundResource(AbstractC16803z.incall_actvitiy_background);
        this.f149435x0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: vo0.v
            public /* synthetic */ ViewOnLayoutChangeListenerC28530v() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                GroupCallActivity.this.m156544ec(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        AbstractC1579n0.m7833Q0(this.f149435x0, new InterfaceC1551g0() { // from class: vo0.w
            public /* synthetic */ C28537w() {
            }

            @Override // androidx.core.view.InterfaceC1551g0
            /* renamed from: c */
            public final C1580n1 mo4846c(View view, C1580n1 c1580n1) {
                C1580n1 m156553hc;
                m156553hc = GroupCallActivity.this.m156553hc(view, c1580n1);
                return m156553hc;
            }
        });
        AbstractC1623z0.m8281b(getWindow(), false);
        m156582r7();
        setContentView(this.f149435x0);
        m35584t2(true);
        this.f149389a0 = mo35579p();
    }

    /* renamed from: hb */
    public /* synthetic */ void m156552hb(View view) {
        AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_GRID_MODE_CALL_BUTTON", new Runnable() { // from class: vo0.a1
            public /* synthetic */ RunnableC28372a1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.m156536bb();
            }
        }, 500L);
    }

    /* renamed from: hc */
    public /* synthetic */ C1580n1 m156553hc(View view, C1580n1 c1580n1) {
        m156508Sc(c1580n1.m8054f(C1580n1.m.m8118f()));
        return c1580n1;
    }

    /* renamed from: i7 */
    public void m156556i7() {
        try {
            Rect rect = new Rect();
            int m9740Y1 = this.f149385Y.m9740Y1();
            int m9745c2 = this.f149385Y.m9745c2();
            this.f149385Y.mo9732P(m9740Y1).getGlobalVisibleRect(rect);
            int height = rect.height();
            this.f149385Y.mo9732P(m9745c2).getGlobalVisibleRect(rect);
            int height2 = rect.height();
            if (height < this.f149383X.m110480Q() / 2) {
                m9740Y1 = Math.max(this.f149385Y.m9737T1(), 0);
            }
            if (height2 < this.f149383X.m110480Q() / 2) {
                m9745c2 = Math.max(this.f149385Y.m9741Z1(), m9740Y1);
            }
            this.f149377U.removeMessages(6);
            HandlerC32400r handlerC32400r = this.f149377U;
            handlerC32400r.sendMessageDelayed(handlerC32400r.obtainMessage(6, m9740Y1, m9745c2), 100L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ic */
    public /* synthetic */ void m156557ic(InterfaceC17463d interfaceC17463d, int i11) {
        this.f149375T.mo138060Gc();
    }

    /* renamed from: j8 */
    private int m156559j8() {
        return AbstractC3104p.m15657d0();
    }

    /* renamed from: jb */
    public /* synthetic */ void m156560jb(View view) {
        this.f149375T.mo138096ie(6, new Object[0]);
    }

    /* renamed from: jd */
    public void m156561jd() {
        this.f149412l1.setMinPosition(0);
        this.f149412l1.setMaxPosition(m156602x8());
        this.f149412l1.setMinimized(2);
        m156622Rd();
    }

    /* renamed from: kb */
    public /* synthetic */ void m156563kb(float f11, float f12) {
        this.f149439z0.m157381b(f11, f12);
    }

    /* renamed from: la */
    public /* synthetic */ void m156565la(View view) {
        this.f149375T.mo138096ie(28, new Object[0]);
    }

    /* renamed from: mb */
    public /* synthetic */ void m156568mb() {
        this.f149375T.mo138096ie(11, new Object[0]);
    }

    /* renamed from: n7 */
    private void m156569n7() {
        if (this.f149406i1 != null && !this.f149375T.mo138059Dh(mo138118F2())) {
            this.f149406i1.m157456b();
        }
    }

    /* renamed from: n8 */
    private synchronized Drawable m156570n8(boolean z11) {
        try {
            if (z11) {
                if (this.f149384X0 == null) {
                    Drawable m139658a = C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_speaker_view_line_24);
                    this.f149384X0 = m139658a;
                    AbstractC1414a.m7197o(m139658a, AbstractC23136l9.m118645D(getContext(), AbstractC16801x.color_call_view_mode_selector));
                }
                return this.f149384X0;
            }
            if (this.f149382W0 == null) {
                this.f149382W0 = C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_grid_view_line_24);
            }
            return this.f149382W0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: nb */
    public /* synthetic */ boolean m156571nb(View view, MotionEvent motionEvent) {
        this.f149375T.mo138086bf();
        return false;
    }

    /* renamed from: o9 */
    private boolean m156575o9() {
        if (AbstractC0924m0.m3569Xa() && Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    /* renamed from: pc */
    public /* synthetic */ void m156576pc(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112033j, 200);
    }

    /* renamed from: pd */
    private void m156577pd() {
        try {
            if (AbstractC3096i0.m15536f()) {
                m156538c8();
            } else {
                super.onBackPressed();
            }
            m156538c8();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: q7 */
    private void m156578q7() {
        BottomCallView bottomCallView = new BottomCallView(getContext());
        this.f149404h1 = bottomCallView;
        bottomCallView.setId(AbstractC6918a0.call_bottomView);
        this.f149404h1.setPadding(0, AbstractC3104p.m15640Q(), 0, 0);
        this.f149404h1.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.b1
            public /* synthetic */ ViewOnTouchListenerC28380b1() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m156449A9;
                m156449A9 = GroupCallActivity.this.m156449A9(view, motionEvent);
                return m156449A9;
            }
        });
        this.f149404h1.setBottomCallViewPresenter(new BottomCallView.InterfaceC32380a() { // from class: vo0.c1
            public /* synthetic */ C28388c1() {
            }

            @Override // zm.voip.p721ui.incall.BottomCallView.InterfaceC32380a
            /* renamed from: a */
            public final void mo142927a() {
                GroupCallActivity.this.m156460F9();
            }
        });
        if (this.f149404h1.getParent() == null) {
            this.f149404h1.setVisibility(4);
            this.f149435x0.addView(this.f149404h1, AbstractC3105q.m15698a(-1, -1));
        }
        ToastCountdownCustomView toastCountdownCustomView = this.f149406i1;
        if (toastCountdownCustomView != null) {
            this.f149435x0.removeView(toastCountdownCustomView);
            this.f149435x0.addView(this.f149406i1);
        }
        RelativeLayout.LayoutParams m15705h = AbstractC3105q.m15705h(-1, -1);
        GestureBottomLayout gestureBottomLayout = new GestureBottomLayout(getContext());
        this.f149412l1 = gestureBottomLayout;
        gestureBottomLayout.setLayoutParams(m15705h);
        this.f149412l1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC32384b());
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
        CallKeyboardLayout callKeyboardLayout = new CallKeyboardLayout(getContext());
        this.f149414m1 = callKeyboardLayout;
        callKeyboardLayout.setId(AbstractC6918a0.call_mainInvite);
        this.f149414m1.setLayoutParams(m15698a);
        this.f149414m1.setListener(new CallKeyboardLayout.InterfaceC32478a() { // from class: vo0.d1
            public /* synthetic */ C28396d1() {
            }

            @Override // zm.voip.widgets.CallKeyboardLayout.InterfaceC32478a
            /* renamed from: a */
            public final void mo142929a() {
                GroupCallActivity.this.m156471I9();
            }
        });
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15650a(29.0f), AbstractC3104p.m15650a(4.0f));
        m15700c.gravity = 1;
        m15700c.bottomMargin = AbstractC3104p.m15650a(12.0f);
        View view = new View(getContext());
        this.f149416n1 = view;
        view.setId(AbstractC6918a0.call_pullBarInvite);
        this.f149416n1.setLayoutParams(m15700c);
        this.f149416n1.setBackgroundResource(AbstractC16803z.res_call_pull_bar);
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-1, -1);
        m15698a2.topMargin = AbstractC3104p.m15650a(16.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149418o1 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_areaInvite);
        this.f149418o1.setBackgroundResource(AbstractC16803z.res_call_bg_invite_group_call);
        this.f149418o1.setOrientation(1);
        this.f149418o1.setPadding(0, AbstractC3104p.m15650a(20.0f), 0, 0);
        this.f149418o1.setLayoutParams(m15698a2);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-1, -2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(m15701d);
        linearLayout2.setId(AbstractC6918a0.call_groupTitleInvite);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f(0, AbstractC3104p.m15650a(38.0f));
        m15703f.weight = 1.0f;
        m15703f.leftMargin = AbstractC3104p.m15650a(40.0f);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        robotoTextView.setLayoutParams(m15703f);
        robotoTextView.setId(AbstractC6918a0.call_inviteTitle);
        robotoTextView.setText(getString(AbstractC8020f0.str_call_add_partner_menu_title));
        robotoTextView.setGravity(17);
        robotoTextView.setTextSize(1, 16.0f);
        robotoTextView.setTextStyleBold(true);
        robotoTextView.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC26125a.ND300_old));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        robotoTextView.setEllipsize(truncateAt);
        robotoTextView.setMaxLines(1);
        robotoTextView.setPadding(AbstractC3104p.m15650a(5.0f), AbstractC3104p.m15650a(5.0f), AbstractC3104p.m15650a(5.0f), AbstractC3104p.m15650a(5.0f));
        LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(AbstractC3104p.m15650a(24.0f), AbstractC3104p.m15650a(24.0f));
        m15703f2.rightMargin = AbstractC3104p.m15650a(16.0f);
        m15703f2.gravity = 16;
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(m15703f2);
        imageView.setId(AbstractC6918a0.call_closeInvite);
        imageView.setImageResource(AbstractC16803z.res_call_close_button);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vo0.e1
            public /* synthetic */ ViewOnClickListenerC28404e1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupCallActivity.this.m156484K9(view2);
            }
        });
        linearLayout2.addView(robotoTextView);
        linearLayout2.addView(imageView);
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-1, -1);
        m15701d2.height = AbstractC3104p.m15650a(38.0f);
        m15701d2.leftMargin = AbstractC3104p.m15650a(16.0f);
        m15701d2.rightMargin = AbstractC3104p.m15650a(16.0f);
        m15701d2.topMargin = AbstractC3104p.m15650a(12.0f);
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.res_call_ic_search_box);
        if (m118665N != null) {
            m118665N.setBounds(0, 0, m118665N.getIntrinsicWidth(), m118665N.getIntrinsicHeight());
        }
        CustomEditText customEditText = new CustomEditText(getContext());
        this.f149428t1 = customEditText;
        customEditText.setId(AbstractC6918a0.call_inviteSearch);
        this.f149428t1.setBackgroundResource(AbstractC16803z.res_call_bg_search_bar);
        this.f149428t1.setCompoundDrawables(m118665N, null, null, null);
        this.f149428t1.setCompoundDrawablePadding(AbstractC3104p.m15650a(10.0f));
        this.f149428t1.setEllipsize(truncateAt);
        this.f149428t1.setMaxLines(1);
        this.f149428t1.setHint(AbstractC8020f0.str_call_groupcall_search_bar_text);
        CustomEditText customEditText2 = this.f149428t1;
        customEditText2.setInputType(customEditText2.getInputType() | 180224);
        this.f149428t1.setPadding(AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15650a(6.0f), AbstractC3104p.m15650a(10.0f), AbstractC3104p.m15650a(6.0f));
        this.f149428t1.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC26125a.ND300_old));
        this.f149428t1.setHintTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC26125a.ND500_old));
        AbstractC32234k.m155469a(this.f149428t1, AbstractC16803z.chat_bar_text_cursor);
        this.f149428t1.setTextSize(1, 14.0f);
        this.f149428t1.setLayoutParams(m15701d2);
        this.f149428t1.addTextChangedListener(this.f149432v1);
        LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(-1, -1);
        m15701d3.topMargin = AbstractC3104p.m15650a(12.0f);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(AbstractC6918a0.call_listInvite);
        frameLayout.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.transparent));
        frameLayout.setLayoutParams(m15701d3);
        LinearLayout.LayoutParams m15701d4 = AbstractC3105q.m15701d(-1, -1);
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f149420p1 = recyclerView;
        recyclerView.setId(AbstractC6918a0.call_rvInviteMember);
        this.f149420p1.setLayoutParams(m15701d4);
        this.f149424r1 = new LinearLayoutManager(getContext());
        this.f149422q1 = new C21333k(this);
        this.f149420p1.setLayoutManager(this.f149424r1);
        this.f149420p1.setAdapter(this.f149422q1);
        this.f149420p1.m9826E(new C32385c());
        FrameLayout.LayoutParams m15698a3 = AbstractC3105q.m15698a(-1, -2);
        m15698a3.gravity = 49;
        MultiStateView multiStateView = new MultiStateView(getContext());
        this.f149426s1 = multiStateView;
        multiStateView.setLayoutParams(m15698a3);
        this.f149426s1.setEmptyLayoutResourceId(AbstractC7409c0.layout_empty_state);
        this.f149426s1.setErrorLayoutResourceId(AbstractC7409c0.layout_error_state);
        this.f149426s1.setVisibility(0);
        this.f149426s1.setEnableLoadingText(true);
        m156497Nd(AbstractC8020f0.empty_list);
        m156480Jd();
        m156467Gd(true);
        ViewGroup.LayoutParams layoutParams = this.f149426s1.getLayoutParams();
        int m118742r = f149346I1 - AbstractC23136l9.m118742r(150.0f);
        if (m118742r > AbstractC3104p.m15657d0()) {
            m118742r = AbstractC3104p.m15657d0();
        }
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, m118742r);
        } else {
            layoutParams.height = m118742r;
        }
        this.f149426s1.setLayoutParams(layoutParams);
        this.f149426s1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: vo0.f1
            public /* synthetic */ C28412f1() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GroupCallActivity.this.m156500O9();
            }
        });
        frameLayout.addView(this.f149420p1);
        frameLayout.addView(this.f149426s1);
        this.f149418o1.addView(linearLayout2);
        this.f149418o1.addView(this.f149428t1);
        this.f149418o1.addView(frameLayout);
        this.f149414m1.addView(this.f149416n1);
        this.f149414m1.addView(this.f149418o1);
        this.f149412l1.addView(this.f149414m1);
        this.f149404h1.addView(this.f149412l1);
        this.f149427t0 = true;
    }

    /* renamed from: qa */
    public /* synthetic */ void m156579qa(View view) {
        this.f149375T.mo138096ie(29, new Object[0]);
    }

    /* renamed from: r7 */
    private void m156582r7() {
        m156448A7();
        m156496N7();
        m156618F7();
        m156511T7();
        m156609y7();
        m156596v7();
    }

    /* renamed from: ra */
    public /* synthetic */ boolean m156583ra(int i11, View view, MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            float f11 = this.f149364J0.getmXCenterCir();
            float f12 = this.f149364J0.getmYCenterCir();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f149364J0.m157288h();
                        }
                    } else {
                        float sqrt = (float) Math.sqrt(Math.pow(Math.abs(motionEvent.getRawX() - f11), 2.0d) + Math.pow(Math.abs(motionEvent.getRawY() - f12), 2.0d));
                        if (sqrt >= (i11 >> 1) - 10) {
                            this.f149364J0.m157291k(sqrt);
                            if (this.f149364J0.getRadiusBackgroundSwipe() - sqrt <= 0.0f && !this.f149395d0) {
                                this.f149395d0 = true;
                                this.f149375T.mo138096ie(4, new Object[0]);
                            }
                        }
                    }
                } else if (!this.f149395d0) {
                    this.f149375T.mo138096ie(4, new Object[0]);
                }
            } else {
                this.f149395d0 = false;
                this.f149364J0.m157289i();
                this.f149364J0.m157291k(0.0f);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GroupCallActivity", "answerBtn.setOnTouchListener " + e11.getMessage(), e11);
        }
        return true;
    }

    /* renamed from: rd */
    private void m156584rd() {
        try {
            m156629d9();
            m156462Fd();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: re */
    private void m156585re() {
        m156489Lc(0.0f);
        m156479Jc();
    }

    /* renamed from: sb */
    public /* synthetic */ void m156587sb(View view) {
        this.f149375T.mo138096ie(16, new Object[0]);
    }

    /* renamed from: ta */
    public /* synthetic */ void m156590ta(View view) {
        this.f149375T.mo138063Ib();
    }

    /* renamed from: ua */
    public /* synthetic */ void m156593ua(View view) {
        this.f149375T.mo138096ie(9, new Object[0]);
    }

    /* renamed from: v7 */
    private void m156596v7() {
        TextView textView = new TextView(getContext());
        this.f149435x0.addView(textView, AbstractC3105q.m15699b(-2, -2, 80));
        textView.setVisibility(8);
        textView.setBackgroundColor(-16777216);
        textView.setTextColor(-1);
        if (this.f149375T.mo138057Cg()) {
            textView.setVisibility(0);
            textView.setText("Call Id: " + this.f149375T.mo138100ob());
        }
    }

    /* renamed from: vd */
    private void m156597vd() {
        VoIPButtonWithText voIPButtonWithText = this.f149361H0;
        if (voIPButtonWithText != null) {
            voIPButtonWithText.removeOnLayoutChangeListener(this.f149409k0);
        }
        LinearLayout linearLayout = this.f149357F0;
        if (linearLayout != null) {
            linearLayout.removeOnLayoutChangeListener(this.f149411l0);
        }
    }

    /* renamed from: wb */
    public /* synthetic */ void m156599wb(View view) {
        this.f149375T.mo138096ie(10, new Object[0]);
    }

    /* renamed from: wd */
    private void m156600wd() {
        try {
            SelfCallView selfCallView = this.f149347A0;
            if (selfCallView != null) {
                selfCallView.m157279e();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("VOIP_GroupCallActivity", "selfView release failed " + e11.toString());
        }
    }

    /* renamed from: x8 */
    private int m156602x8() {
        int i11 = f149346I1;
        if (i11 >= m156559j8()) {
            return 0;
        }
        return m156559j8() - i11;
    }

    /* renamed from: x9 */
    private boolean m156603x9() {
        return this.f149375T.mo138104sb();
    }

    /* renamed from: xb */
    public /* synthetic */ boolean m156604xb(View view, MotionEvent motionEvent) {
        this.f149375T.mo138110v0(200L);
        return false;
    }

    /* renamed from: xc */
    public /* synthetic */ void m156605xc() {
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110494h0();
        }
    }

    /* renamed from: xd */
    private void m156606xd() {
        try {
            this.f149436x1.m112041n();
            this.f149438y1.m112041n();
            this.f149440z1.m112041n();
            this.f149348A1.m112041n();
            this.f149350B1.m112041n();
            this.f149356E1.m112041n();
            this.f149352C1.m112041n();
            this.f149354D1.m112041n();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: y7 */
    private void m156609y7() {
        ZmInCallDebug zmInCallDebug = new ZmInCallDebug(this);
        this.f149410k1 = zmInCallDebug;
        zmInCallDebug.setId(AbstractC6918a0.call_debug_layout);
        this.f149410k1.setVisibility(8);
        this.f149435x0.addView(this.f149410k1, AbstractC3105q.m15698a(-1, -1));
    }

    /* renamed from: y8 */
    private int m156610y8() {
        int m15657d0;
        int m15650a;
        LinearLayout linearLayout = this.f149359G0;
        if (linearLayout != null) {
            m15657d0 = linearLayout.getHeight();
            m15650a = AbstractC3104p.m15675m0();
        } else {
            m15657d0 = AbstractC3104p.m15657d0();
            m15650a = AbstractC3104p.m15650a(30.0f);
        }
        return m15657d0 + m15650a;
    }

    /* renamed from: y9 */
    public /* synthetic */ boolean m156611y9(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !this.f149397e0) {
            return false;
        }
        this.f149375T.mo138096ie(21, new Object[0]);
        view.performClick();
        return true;
    }

    /* renamed from: yd */
    private void m156612yd() {
        try {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149349B0.getLayoutParams();
            if (this.f149375T.mo138112zm()) {
                layoutParams.height = AbstractC3104p.m15657d0() / 7;
                this.f149349B0.setBackgroundResource(AbstractC16803z.bg_mask_video_11_layout);
                this.f149349B0.setVisibility(0);
            } else if (this.f149375T.mo138087c1()) {
                layoutParams.height = AbstractC3104p.m15657d0() / 2;
                this.f149349B0.setBackgroundResource(AbstractC16803z.bg_mask_video_layout);
                this.f149349B0.setVisibility(0);
            } else {
                this.f149349B0.setVisibility(8);
            }
            this.f149349B0.setLayoutParams(layoutParams);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ye */
    private void m156613ye(boolean z11) {
        this.f149347A0.f149893p.setAnim(true);
        this.f149380V0.setSelected(!z11);
        if (z11) {
            this.f149439z0.setVisibility(8);
            SelfCallView selfCallView = this.f149347A0;
            if (selfCallView != null && selfCallView.f149893p != null) {
                this.f149375T.mo138092gg(null, true);
            }
            this.f149380V0.m157421f(getString(AbstractC8020f0.str_gcall_view_mode_single));
        } else {
            this.f149439z0.setVisibility(0);
            this.f149347A0.f149894q.setCornerRadius(AbstractC3104p.m15690u());
            TextureViewRenderer textureViewRenderer = this.f149347A0.f149893p;
            if (textureViewRenderer != null) {
                textureViewRenderer.setCorner(AbstractC3104p.m15690u());
                this.f149375T.mo138092gg(this.f149347A0.f149893p, true);
            }
            this.f149380V0.m157421f(getString(AbstractC8020f0.str_gcall_view_mode_multi));
        }
        this.f149380V0.m157419d(m156570n8(z11));
        m156533af();
    }

    /* renamed from: zc */
    public /* synthetic */ void m156616zc(ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() < 0.7d) {
            m156627Zd();
        } else {
            m156633ne();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: B9 */
    public void mo138114B9(HashSet hashSet) {
        C21329g c21329g = this.f149381W;
        if (c21329g != null) {
            c21329g.m110447W(hashSet);
            this.f149381W.m10008p();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: BC */
    public void mo138115BC() {
        try {
            this.f149372R0.setSelected(true);
            m156535b9();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Bs */
    public void mo138116Bs(boolean z11) {
        C21329g c21329g = this.f149381W;
        if (c21329g == null) {
            return;
        }
        if (z11) {
            LinearLayoutManager linearLayoutManager = this.f149387Z;
            if (linearLayoutManager != null) {
                linearLayoutManager.m9721B2(0, 0);
            }
            this.f149381W.m110444T(false);
            this.f149396d1.setSelected(false);
            return;
        }
        c21329g.m110444T(true);
        this.f149396d1.setSelected(true);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Cf */
    public void mo138117Cf(int i11, boolean z11, boolean z12) {
        C21334l c21334l = this.f149383X;
        if (c21334l == null) {
            return;
        }
        c21334l.m110496j0(i11, z11, z12);
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: E */
    public void mo78936E(String str) {
        AbstractC3096i0.m15522W0(str);
    }

    /* renamed from: E8 */
    public InterfaceC26856a m156617E8() {
        return this.f149375T;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: F2 */
    public boolean mo138118F2() {
        boolean isInPictureInPictureMode;
        if (Build.VERSION.SDK_INT >= 26) {
            isInPictureInPictureMode = isInPictureInPictureMode();
            if (isInPictureInPictureMode) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F7 */
    void m156618F7() {
        boolean z11;
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        boolean z12 = true;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z12 = false;
        }
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.topMargin = AbstractC3104p.m15641R();
        m15698a.gravity = 5;
        GestureRightLayout gestureRightLayout = new GestureRightLayout(getContext());
        this.f149394c1 = gestureRightLayout;
        gestureRightLayout.setLayoutParams(m15698a);
        CircleBackgroundImageView circleBackgroundImageView = new CircleBackgroundImageView(getContext());
        this.f149374S0 = circleBackgroundImageView;
        circleBackgroundImageView.setId(AbstractC6918a0.call_miniFlipCamBtn);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(AbstractC3104p.m15674m(), AbstractC3104p.m15674m());
        m15700c.topMargin = AbstractC3104p.m15626C();
        m15700c.rightMargin = AbstractC3104p.m15678o();
        m15700c.gravity = 53;
        this.f149374S0.setLayoutParams(m15700c);
        this.f149374S0.m157292f(C27280g.m139658a(getContext(), AbstractC23322a.zds_ic_flip_cam_2_solid_24), AbstractC23136l9.m118645D(getContext(), AbstractC16801x.call_icon_color_selector));
        this.f149374S0.setEnabled(false);
        this.f149374S0.setVisibility(8);
        if (z11 && z12) {
            this.f149374S0.setOnClickListener(new View.OnClickListener() { // from class: vo0.h0
                public /* synthetic */ ViewOnClickListenerC28427h0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156593ua(view);
                }
            });
        } else {
            this.f149374S0.setOnTouchListener(new ViewOnTouchListenerC32399q(this, 9, this.f149348A1));
        }
        this.f149435x0.addView(this.f149394c1);
        this.f149435x0.addView(this.f149374S0);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: GF */
    public void mo138119GF(ContactProfile contactProfile, String str) {
        if (!this.f149375T.mo138059Dh(mo138118F2())) {
            return;
        }
        this.f149406i1.m157460i(contactProfile, str, 3000);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Gi */
    public void mo138120Gi() {
        this.f149377U.removeMessages(2);
        this.f149377U.sendEmptyMessageDelayed(2, 5000L);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Gv */
    public void mo138121Gv() {
        VoIPButtonWithText voIPButtonWithText = this.f149365K0;
        if (voIPButtonWithText != null) {
            voIPButtonWithText.clearAnimation();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: ID */
    public boolean mo138122ID(int i11) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 6) {
                        return false;
                    }
                    return this.f149361H0.isSelected();
                }
                return this.f149368N0.isSelected();
            }
            return this.f149366L0.isSelected();
        }
        return this.f149367M0.isSelected();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: J9 */
    public void mo138123J9(C21791f c21791f) {
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110498l0(c21791f);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Jl */
    public void mo138124Jl(boolean z11) {
        if (this.f149367M0 != null) {
            C21709f c21709f = this.f149436x1;
            if (c21709f != null) {
                c21709f.m112046s(0.0d);
            }
            this.f149367M0.setSelected(z11);
        }
        SelfCallView selfCallView = this.f149347A0;
        if (selfCallView != null) {
            selfCallView.m157280f(z11);
            this.f149347A0.m157401k(this.f149375T.mo138099lg(z11, mo138118F2()));
        }
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110497k0(C21334l.f103899A.m110500a(), z11);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Jv */
    public void mo138125Jv(Message message, long j11) {
        if (message == null) {
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f149377U.sendMessageDelayed(message, j11);
        } else if (i11 == 5) {
            this.f149377U.removeMessages(i11);
            this.f149377U.sendMessageDelayed(message, j11);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: KD */
    public void mo138126KD(C21791f c21791f) {
        if (c21791f != null && this.f149383X != null && !this.f149437y0.m9861V0()) {
            this.f149383X.m110498l0(c21791f);
        }
    }

    /* renamed from: L8 */
    public void m156619L8() {
        this.f149375T.mo138056Ao();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Ll */
    public void mo138127Ll(String str) {
        RobotoTextView robotoTextView = this.f149390a1;
        if (robotoTextView != null && TextUtils.isEmpty(robotoTextView.getText()) && !this.f149390a1.getText().equals(str)) {
            this.f149390a1.setText(str);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Lr */
    public void mo138128Lr(List list) {
        this.f149377U.postDelayed(new Runnable() { // from class: vo0.x

            /* renamed from: q */
            public final /* synthetic */ List f132491q;

            public /* synthetic */ RunnableC28544x(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.m156472Ic(r2);
            }
        }, 300L);
    }

    /* renamed from: Md */
    void m156620Md() {
        this.f149436x1 = this.f149379V.m112019d();
        this.f149438y1 = this.f149379V.m112019d();
        this.f149440z1 = this.f149379V.m112019d();
        this.f149348A1 = this.f149379V.m112019d();
        this.f149350B1 = this.f149379V.m112019d();
        this.f149356E1 = this.f149379V.m112019d();
        this.f149352C1 = this.f149379V.m112019d();
        this.f149354D1 = this.f149379V.m112019d();
        this.f149436x1.m112048u(AbstractC21245c.f103555b);
        this.f149438y1.m112048u(AbstractC21245c.f103555b);
        this.f149440z1.m112048u(AbstractC21245c.f103555b);
        this.f149348A1.m112048u(AbstractC21245c.f103555b);
        this.f149350B1.m112048u(AbstractC21245c.f103555b);
        this.f149352C1.m112048u(AbstractC21245c.f103555b);
        this.f149354D1.m112048u(AbstractC21245c.f103555b);
        this.f149356E1.m112048u(AbstractC21245c.f103554a);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Mp */
    public void mo138129Mp() {
        if (this.f149368N0 != null) {
            C21709f c21709f = this.f149440z1;
            if (c21709f != null) {
                c21709f.m112046s(0.0d);
            }
            this.f149368N0.setEnabled(false);
        }
        if (this.f149374S0 != null) {
            C21709f c21709f2 = this.f149348A1;
            if (c21709f2 != null) {
                c21709f2.m112046s(0.0d);
            }
            this.f149374S0.setEnabled(false);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Mq */
    public void mo138130Mq(C26351b c26351b) {
        this.f149373S = c26351b;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Nk */
    public void mo138131Nk(String str, C22592c c22592c) {
        ZmInCallDebug zmInCallDebug = this.f149410k1;
        if (zmInCallDebug != null) {
            zmInCallDebug.m157179B(str, c22592c);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Oz */
    public void mo138132Oz() {
        if (this.f149368N0 != null) {
            C21709f c21709f = this.f149440z1;
            if (c21709f != null) {
                c21709f.m112046s(0.0d);
            }
            this.f149368N0.setEnabled(false);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Pc */
    public void mo138133Pc() {
        if (this.f149439z0 != null && this.f149437y0 != null) {
            m156613ye(true);
            this.f149407j0 = false;
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Pd */
    public void mo138134Pd(int i11, int i12) {
        C21334l c21334l = this.f149383X;
        if (c21334l == null) {
            return;
        }
        c21334l.m110499m0(i11, i12);
    }

    /* renamed from: Q8 */
    public void m156621Q8() {
        try {
            if (!this.f149429u0 && this.f149427t0) {
                this.f149429u0 = true;
                this.f149428t1.setText("");
                AbstractC3098j0.m15579b(this.f149428t1);
                if (this.f149431v0) {
                    m156537c7();
                }
                AbstractC3085d.m15454p(this.f149412l1, m156559j8(), 250L);
                AbstractC3085d.m15444f(this.f149404h1, false, 250L, new C32388f());
                LinearLayoutManager linearLayoutManager = this.f149424r1;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m9721B2(0, 0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Qc */
    public void mo138135Qc(boolean z11, boolean z12, boolean z13) {
        TextureViewRenderer textureViewRenderer;
        if (z13) {
            m156623U7();
            m156630g9(false);
            this.f149349B0.setVisibility(0);
            SelfCallView selfCallView = this.f149347A0;
            if (selfCallView != null && (textureViewRenderer = selfCallView.f149893p) != null) {
                textureViewRenderer.setMirror(z12);
                C21334l c21334l = this.f149383X;
                if (c21334l != null) {
                    c21334l.m110495i0(z12);
                }
            }
            m156458Ee();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Qd */
    public void mo138136Qd(HashSet hashSet) {
        C21333k c21333k = this.f149422q1;
        if (c21333k != null) {
            c21333k.m110469T(hashSet);
        }
        this.f149381W.m110447W(hashSet);
        this.f149381W.m10008p();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: R6 */
    public void mo138137R6(int i11) {
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: RD */
    public void mo138138RD(boolean z11) {
        int i11;
        VoIPButtonWithText voIPButtonWithText = this.f149366L0;
        if (voIPButtonWithText != null) {
            if (z11) {
                i11 = AbstractC16803z.ic_call_video_newmenu_bluetooth;
            } else {
                i11 = AbstractC16803z.ic_call_video_newmenu_speaker;
            }
            voIPButtonWithText.m157420e(i11);
            this.f149366L0.setEnabled(true);
        }
    }

    /* renamed from: Rd */
    public void m156622Rd() {
        if (this.f149404h1 != null) {
            this.f149362H1 = System.currentTimeMillis();
            this.f149431v0 = true;
            this.f149404h1.setAlpha(0.0f);
            this.f149404h1.setVisibility(0);
            AbstractC3085d.m15443e(this.f149404h1, true, 250L);
            this.f149412l1.setMaxPosition(m156602x8());
            this.f149412l1.setMinimizedWithAnimation(1);
            this.f149412l1.setListener(new C32387e());
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Rj */
    public int mo138139Rj() {
        PhysicalSelfLayout physicalSelfLayout = this.f149439z0;
        if (physicalSelfLayout != null) {
            return physicalSelfLayout.f150074s;
        }
        return -1;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: SG */
    public void mo138140SG(int i11) {
        C21333k c21333k = this.f149422q1;
        if (c21333k != null) {
            c21333k.m110464O().remove(Integer.valueOf(i11));
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Sa */
    public void mo138141Sa(ArrayList arrayList, String str) {
        try {
            if (this.f149427t0 && this.f149428t1.getText() != null && str.equals(this.f149428t1.getText().toString().trim().replaceAll("\\s+", " "))) {
                m156497Nd(AbstractC8020f0.str_emptyResult);
                m156467Gd(false);
                C21333k c21333k = this.f149422q1;
                if (c21333k != null) {
                    c21333k.m110468S(arrayList);
                    this.f149422q1.m10008p();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Si */
    public void mo138142Si(C21791f c21791f) {
        C21334l c21334l;
        if (c21791f != null && (c21334l = this.f149383X) != null) {
            this.f149383X.m110492f0(c21791f.m112477l(), this.f149437y0.m9900t0(c21334l.m110484W(c21791f.m112477l())));
        }
    }

    /* renamed from: U7 */
    public void m156623U7() {
        if (this.f149383X != null) {
            return;
        }
        C21334l c21334l = new C21334l(this);
        this.f149383X = c21334l;
        c21334l.m110488a0(this.f149375T.mo138102r8());
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 2, 1, false);
        this.f149385Y = gridLayoutManager;
        gridLayoutManager.m9671f3(new C32394l());
        this.f149437y0.m9826E(new C32395m());
        this.f149437y0.setAdapter(this.f149383X);
        this.f149437y0.setLayoutManager(this.f149385Y);
        this.f149437y0.setItemAnimator(null);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: U9 */
    public void mo138143U9(boolean z11) {
        PhysicalSelfLayout physicalSelfLayout = this.f149439z0;
        if (physicalSelfLayout != null) {
            physicalSelfLayout.f150076u = z11;
        }
    }

    /* renamed from: Uc */
    public void m156624Uc(int i11) {
        if (!this.f149407j0) {
            return;
        }
        this.f149375T.mo138074Pn(i11);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Uf */
    public boolean mo138144Uf() {
        LinearLayout linearLayout = this.f149400f1;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Ul */
    public void mo138145Ul(String str, boolean z11, boolean z12, int i11) {
        if (this.f149375T.mo138085be()) {
            C21334l c21334l = this.f149383X;
            if (c21334l != null) {
                C21334l.a aVar = C21334l.f103899A;
                this.f149383X.m110487Z(aVar.m110500a(), z12, z11, this.f149437y0.m9900t0(c21334l.m110484W(aVar.m110500a())));
                return;
            }
            return;
        }
        SelfCallView selfCallView = this.f149347A0;
        if (selfCallView != null && selfCallView.f149893p != null) {
            selfCallView.m157398g(str, z11, z12, i11);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: V6 */
    public void mo138146V6(String str, String str2) {
        this.f149367M0.setVisibility(8);
        this.f149368N0.setVisibility(8);
        this.f149374S0.setVisibility(8);
        this.f149365K0.setVisibility(8);
        this.f149364J0.setVisibility(8);
        this.f149363I0.setVisibility(8);
        this.f149361H0.setVisibility(8);
        this.f149371Q0.setEnabled(false);
        this.f149369O0.setVisibility(0);
        this.f149370P0.setVisibility(0);
        this.f149370P0.m157421f(str2);
        this.f149367M0.setEnabled(false);
        this.f149361H0.setEnabled(false);
        this.f149437y0.setVisibility(8);
        this.f149392b1.setText(str);
        AbstractC3085d.m15443e(this.f149355E0, true, 0L);
        m156458Ee();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: W1 */
    public void mo138147W1(int i11) {
        VoIPButtonWithText voIPButtonWithText = this.f149366L0;
        if (voIPButtonWithText == null) {
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                voIPButtonWithText.m157420e(AbstractC16803z.ic_call_video_newmenu_bluetooth);
                this.f149366L0.setEnabled(false);
                return;
            }
            return;
        }
        voIPButtonWithText.m157420e(AbstractC16803z.ic_call_video_newmenu_speaker);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: W4 */
    public void mo138148W4(int i11, boolean z11) {
        C21334l c21334l = this.f149383X;
        if (c21334l == null) {
            return;
        }
        c21334l.m110497k0(i11, z11);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Wm */
    public int mo138149Wm() {
        return this.f149423r0;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: XH */
    public void mo138150XH(boolean z11) {
        if (z11) {
            C21965i c21965i = this.f149393c0;
            if (c21965i != null && !c21965i.m114696B()) {
                AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "Acquire wake up lock");
                this.f149393c0.m114700x();
                return;
            }
            return;
        }
        C21965i c21965i2 = this.f149393c0;
        if (c21965i2 != null && c21965i2.m114696B()) {
            AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "Releasing wake up lock");
            this.f149393c0.m114697N();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Xw */
    public void mo138151Xw(int i11, boolean z11, boolean z12) {
        int i12;
        VoIPButtonWithText voIPButtonWithText;
        switch (i11) {
            case 1:
                this.f149367M0.setVisibility(0);
                this.f149368N0.setVisibility(0);
                this.f149363I0.setVisibility(0);
                this.f149357F0.setEnabled(false);
                this.f149367M0.setEnabled(false);
                this.f149368N0.setEnabled(false);
                this.f149374S0.setEnabled(false);
                this.f149365K0.setVisibility(8);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                this.f149361H0.setVisibility(0);
                break;
            case 2:
                this.f149367M0.setVisibility(0);
                this.f149368N0.setVisibility(0);
                this.f149374S0.setVisibility(0);
                this.f149363I0.setVisibility(0);
                this.f149357F0.setEnabled(true);
                this.f149367M0.setEnabled(false);
                this.f149368N0.setEnabled(false);
                this.f149365K0.setVisibility(8);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                this.f149361H0.setVisibility(0);
                this.f149361H0.setEnabled(true);
                this.f149371Q0.setVisibility(0);
                break;
            case 3:
                this.f149359G0.setBackgroundResource(0);
                this.f149361H0.setVisibility(8);
                this.f149367M0.setVisibility(8);
                this.f149368N0.setVisibility(8);
                this.f149374S0.setVisibility(8);
                this.f149363I0.setVisibility(0);
                this.f149367M0.setEnabled(false);
                this.f149368N0.setEnabled(false);
                this.f149365K0.setVisibility(0);
                this.f149364J0.m157288h();
                this.f149364J0.setVisibility(0);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                m156632ie();
                break;
            case 4:
                m156458Ee();
                m156639ue();
                this.f149367M0.setVisibility(0);
                this.f149368N0.setVisibility(0);
                this.f149367M0.setEnabled(false);
                this.f149363I0.setVisibility(0);
                this.f149361H0.setVisibility(0);
                if (!z11) {
                    this.f149361H0.setEnabled(false);
                }
                this.f149365K0.setEnabled(false);
                this.f149365K0.setVisibility(8);
                this.f149365K0.clearAnimation();
                this.f149364J0.m157289i();
                this.f149364J0.setVisibility(8);
                this.f149368N0.setEnabled(false);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                break;
            case 5:
                this.f149371Q0.setVisibility(0);
                this.f149361H0.setVisibility(0);
                this.f149361H0.setEnabled(true);
                this.f149374S0.setVisibility(0);
                this.f149363I0.setVisibility(0);
                this.f149367M0.setVisibility(0);
                this.f149367M0.setEnabled(true);
                this.f149380V0.setEnabled(true);
                this.f149372R0.setEnabled(true);
                this.f149368N0.setVisibility(0);
                this.f149368N0.setEnabled(true);
                this.f149365K0.setVisibility(8);
                m156639ue();
                this.f149365K0.clearAnimation();
                this.f149364J0.m157289i();
                this.f149364J0.setVisibility(8);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                this.f149361H0.setVisibility(0);
                break;
            case 6:
                this.f149359G0.setBackgroundResource(0);
                VoIPButtonWithText voIPButtonWithText2 = this.f149363I0;
                if (mo138122ID(6)) {
                    i12 = 4;
                } else {
                    i12 = 0;
                }
                voIPButtonWithText2.setVisibility(i12);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                this.f149361H0.setEnabled(false);
                this.f149367M0.setEnabled(false);
                this.f149368N0.setEnabled(false);
                this.f149380V0.setEnabled(false);
                this.f149372R0.setEnabled(false);
                this.f149349B0.setVisibility(8);
                if (!z11 && !z12) {
                    VoIPButtonWithText voIPButtonWithText3 = this.f149365K0;
                    if (voIPButtonWithText3 != null) {
                        voIPButtonWithText3.setEnabled(false);
                        this.f149365K0.clearAnimation();
                    }
                    int i13 = this.f149421q0;
                    if (i13 != 5 && i13 != 7 && i13 != 4 && (voIPButtonWithText = this.f149361H0) != null) {
                        voIPButtonWithText.setVisibility(8);
                    }
                    m156639ue();
                    this.f149364J0.m157289i();
                    if (this.f149365K0.getVisibility() != 0) {
                        this.f149367M0.setVisibility(0);
                        break;
                    }
                } else {
                    this.f149365K0.setVisibility(8);
                    this.f149367M0.setVisibility(0);
                    this.f149368N0.setVisibility(0);
                    break;
                }
                break;
            case 7:
                this.f149349B0.setVisibility(8);
                this.f149361H0.setEnabled(false);
                this.f149363I0.setVisibility(0);
                this.f149363I0.m157421f(getString(AbstractC8020f0.str_call_hangup_button_text));
                this.f149367M0.setVisibility(0);
                this.f149374S0.setVisibility(8);
                this.f149367M0.setEnabled(false);
                this.f149374S0.setEnabled(false);
                this.f149368N0.setVisibility(0);
                this.f149368N0.setEnabled(false);
                this.f149365K0.setVisibility(8);
                m156639ue();
                this.f149365K0.clearAnimation();
                this.f149364J0.m157289i();
                this.f149364J0.setVisibility(8);
                this.f149369O0.setVisibility(8);
                this.f149370P0.setVisibility(8);
                this.f149361H0.setVisibility(8);
                m156458Ee();
                break;
            default:
                this.f149359G0.setBackgroundResource(0);
                this.f149365K0.setVisibility(8);
                this.f149364J0.setVisibility(8);
                this.f149367M0.setVisibility(8);
                this.f149368N0.setVisibility(8);
                this.f149374S0.setVisibility(8);
                this.f149361H0.setVisibility(8);
                break;
        }
        this.f149421q0 = i11;
    }

    /* renamed from: Y8 */
    void m156625Y8() {
        C23212s8.m119595b(this);
        setRequestedOrientation(1);
        mo35554O(32);
        m156637sd();
        m156620Md();
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.call_bg_navigation_color));
        m156629d9();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Yb */
    public void mo138152Yb(C21791f c21791f, C21791f c21791f2) {
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110498l0(c21791f2);
        }
    }

    /* renamed from: Yd */
    public void m156626Yd(String str) {
        if (!this.f149375T.mo138059Dh(mo138118F2())) {
            return;
        }
        this.f149406i1.m157461j(str, 3000);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Z2 */
    public void mo138153Z2() {
        this.f149353D0.stop();
    }

    /* renamed from: Zd */
    void m156627Zd() {
        if (this.f149434w1) {
            return;
        }
        this.f149365K0.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.shake);
        this.f149434w1 = true;
        this.f149365K0.setAnimation(loadAnimation);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: Zr */
    public void mo138154Zr() {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112033j, 200);
    }

    /* renamed from: a8 */
    void m156628a8() {
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -1);
        HandleTapRecyclerView handleTapRecyclerView = new HandleTapRecyclerView(getContext());
        this.f149437y0 = handleTapRecyclerView;
        handleTapRecyclerView.setId(AbstractC6918a0.call_RecyclerRenderLayout);
        this.f149437y0.setLayoutParams(m15698a);
        this.f149437y0.m157368b2(new View.OnClickListener() { // from class: vo0.m0
            public /* synthetic */ ViewOnClickListenerC28467m0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156599wb(view);
            }
        });
        this.f149437y0.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.n0
            public /* synthetic */ ViewOnTouchListenerC28475n0() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m156604xb;
                m156604xb = GroupCallActivity.this.m156604xb(view, motionEvent);
                return m156604xb;
            }
        });
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-1, -1);
        PhysicalSelfLayout physicalSelfLayout = new PhysicalSelfLayout(getContext());
        this.f149439z0 = physicalSelfLayout;
        physicalSelfLayout.setId(AbstractC6918a0.call_selfContainer);
        this.f149439z0.f150075t = m156603x9();
        PhysicalSelfLayout physicalSelfLayout2 = this.f149439z0;
        physicalSelfLayout2.f150076u = true;
        physicalSelfLayout2.setLayoutParams(m15698a2);
        this.f149439z0.setAnimationUpdateListener(new PhysicalSelfLayout.InterfaceC32497a() { // from class: vo0.o0
            public /* synthetic */ C28482o0() {
            }

            @Override // zm.voip.widgets.PhysicalSelfLayout.InterfaceC32497a
            /* renamed from: a */
            public final void mo142941a(float f11, float f12) {
                GroupCallActivity.this.m156563kb(f11, f12);
            }
        });
        this.f149439z0.setBackgroundResource(AbstractC16803z.bg_call_self_layout_2);
        this.f149439z0.setVisibility(8);
        this.f149439z0.setOnClickListener(new PhysicalSelfLayout.InterfaceC32498b() { // from class: vo0.p0
            public /* synthetic */ C28489p0() {
            }

            @Override // zm.voip.widgets.PhysicalSelfLayout.InterfaceC32498b
            /* renamed from: a */
            public final void mo142944a() {
                GroupCallActivity.this.m156568mb();
            }
        });
        this.f149439z0.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.q0
            public /* synthetic */ ViewOnTouchListenerC28496q0() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m156571nb;
                m156571nb = GroupCallActivity.this.m156571nb(view, motionEvent);
                return m156571nb;
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149351C0 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_vidInfoLayout);
        this.f149351C0.setOrientation(1);
        FrameLayout.LayoutParams m15700c = AbstractC3105q.m15700c(-2, -2);
        m15700c.gravity = 49;
        m15700c.topMargin = AbstractC3104p.m15626C();
        this.f149351C0.setMinimumHeight(AbstractC3104p.m15650a(32.0f));
        this.f149351C0.setLayoutParams(m15700c);
        this.f149351C0.setVisibility(8);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(AbstractC6918a0.call_waterMaskZalo);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.gravity = 8388627;
        imageView.setLayoutParams(m15701d);
        imageView.setImageResource(AbstractC16803z.watermark_zalo);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vo0.r0
            public /* synthetic */ ViewOnClickListenerC28503r0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156587sb(view);
            }
        });
        RobotoChronometer robotoChronometer = new RobotoChronometer(this);
        this.f149353D0 = robotoChronometer;
        robotoChronometer.setId(AbstractC6918a0.call_vidElapsedTime);
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        m15701d2.gravity = 8388627;
        m15701d2.topMargin = AbstractC3104p.m15650a(2.0f);
        m15701d2.bottomMargin = AbstractC3104p.m15650a(2.0f);
        this.f149353D0.setLayoutParams(m15701d2);
        this.f149353D0.setGravity(17);
        this.f149353D0.setTextSize(1, 16.0f);
        this.f149353D0.setTextColor(-12397172);
        this.f149351C0.addView(imageView);
        this.f149351C0.addView(this.f149353D0);
        View view = new View(getContext());
        this.f149349B0 = view;
        view.setId(AbstractC6918a0.call_bgMaskVideoLayoutTop);
        FrameLayout.LayoutParams m15698a3 = AbstractC3105q.m15698a(-1, -1);
        m15698a3.height = AbstractC3104p.m15657d0() / 2;
        m15698a3.gravity = 48;
        this.f149349B0.setLayoutParams(m15698a3);
        this.f149349B0.setVisibility(8);
        this.f149349B0.setBackgroundResource(AbstractC16803z.bg_mask_video_layout);
        this.f149435x0.addView(this.f149437y0);
        this.f149435x0.addView(this.f149439z0);
        this.f149435x0.addView(this.f149349B0);
        this.f149435x0.addView(this.f149351C0);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        Context m120036c = C23269y3.m120036c(context, AbstractC18458a.f93019a);
        if (m120036c != null) {
            context = m120036c;
        }
        super.attachBaseContext(context);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: bn */
    public void mo138155bn() {
        if (this.f149381W == null) {
            return;
        }
        this.f149394c1.setMinimizedWithAnimation(true);
        this.f149396d1.setSelected(false);
        LinearLayoutManager linearLayoutManager = this.f149387Z;
        if (linearLayoutManager != null) {
            linearLayoutManager.m9721B2(0, 0);
        }
        this.f149381W.m110444T(false);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: bv */
    public void mo138156bv() {
        if (this.f149437y0 != null) {
            m156613ye(false);
            this.f149407j0 = true;
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: cC */
    public void mo138157cC(boolean z11) {
        this.f149349B0.setVisibility(8);
        this.f149353D0.stop();
        m156550g8();
        AbstractC3085d.m15443e(this.f149355E0, true, 0L);
        if (z11) {
            PhysicalSelfLayout physicalSelfLayout = this.f149439z0;
            if (physicalSelfLayout != null) {
                physicalSelfLayout.setVisibility(8);
            }
            VoIPButtonWithText voIPButtonWithText = this.f149361H0;
            if (voIPButtonWithText != null) {
                voIPButtonWithText.setEnabled(false);
            }
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: cd */
    public void mo138158cd(int i11) {
        this.f149377U.sendEmptyMessageDelayed(3, i11);
    }

    /* renamed from: d9 */
    void m156629d9() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i11;
        int i12;
        Rect bounds2;
        int i13;
        int i14;
        Rect bounds3;
        Rect bounds4;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i11 = insetsIgnoringVisibility.left;
                int i15 = width - i11;
                i12 = insetsIgnoringVisibility.right;
                AbstractC3104p.f13184a = i15 - i12;
                bounds2 = currentWindowMetrics.getBounds();
                int height = bounds2.height();
                i13 = insetsIgnoringVisibility.top;
                i14 = insetsIgnoringVisibility.bottom;
                AbstractC3104p.f13185b = (height - i13) - i14;
                bounds3 = currentWindowMetrics.getBounds();
                AbstractC3104p.f13186c = bounds3.height();
                bounds4 = currentWindowMetrics.getBounds();
                AbstractC3104p.f13187d = bounds4.width();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
                defaultDisplay.getMetrics(displayMetrics);
                AbstractC3104p.f13184a = displayMetrics.widthPixels;
                AbstractC3104p.f13185b = displayMetrics.heightPixels;
                if (!m156638th()) {
                    defaultDisplay.getRealMetrics(displayMetrics);
                }
                AbstractC3104p.f13186c = displayMetrics.heightPixels;
                AbstractC3104p.f13187d = displayMetrics.widthPixels;
            }
            AbstractC3104p.f13188e = AbstractC17484n.Companion.m92931b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: dG */
    public void mo138159dG(C21791f c21791f) {
        C21334l c21334l = this.f149383X;
        if (c21334l != null && this.f149437y0 != null) {
            int m110484W = c21334l.m110484W(c21791f.m112477l());
            if (m110484W >= 0) {
                this.f149383X.m110486Y(c21791f, this.f149437y0.m9902v0(m110484W));
            } else {
                this.f149383X.m110486Y(c21791f, null);
            }
            this.f149377U.postDelayed(new Runnable() { // from class: vo0.u
                public /* synthetic */ RunnableC28523u() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.m156556i7();
                }
            }, 200L);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: dq */
    public void mo138160dq(boolean z11) {
        int i11;
        SelfCallView selfCallView = this.f149347A0;
        if (selfCallView != null) {
            BlurImageView blurImageView = selfCallView.f149894q;
            int i12 = 8;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            blurImageView.setVisibility(i11);
            VoIPItemAva voIPItemAva = this.f149347A0.f150101x;
            if (z11) {
                i12 = 0;
            }
            voIPItemAva.setVisibility(i12);
        }
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110493g0(C21334l.f103899A.m110500a(), z11);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: dt */
    public void mo138161dt(boolean z11) {
        TextureViewRenderer textureViewRenderer = this.f149347A0.f149893p;
        if (textureViewRenderer != null) {
            textureViewRenderer.setMirror(z11);
        }
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110495i0(z11);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: e9 */
    public void mo138162e9(float f11, float f12, boolean z11, boolean z12) {
        PhysicalSelfLayout physicalSelfLayout = this.f149439z0;
        if (physicalSelfLayout != null) {
            physicalSelfLayout.m157380a(f11, f12, z11, z12);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: en */
    public void mo138163en() {
        AbstractC3085d.m15442d(this.f149355E0, true);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: eq */
    public void mo138164eq(boolean z11, boolean z12) {
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "onSwitchCamDone " + z11);
        if (this.f149368N0 != null && z12) {
            this.f149440z1.m112046s(0.0d);
            this.f149368N0.setSelected(z11);
            this.f149368N0.setEnabled(true);
        }
        if (this.f149374S0 == null) {
            return;
        }
        C21709f c21709f = this.f149348A1;
        if (c21709f != null) {
            c21709f.m112046s(0.0d);
        }
        this.f149374S0.setEnabled(!z11);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: fq */
    public void mo138165fq(boolean z11) {
        if (this.f149368N0 != null) {
            this.f149440z1.m112046s(0.0d);
            this.f149368N0.setEnabled(z11);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: g3 */
    public void mo138166g3() {
        finish();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: g5 */
    public C27352b mo138167g5() {
        return this.f149439z0.f150073r;
    }

    /* renamed from: g9 */
    public void m156630g9(boolean z11) {
        boolean z12;
        FrameLayout.LayoutParams m15698a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createCaptureLayout ");
        if (this.f149439z0 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        sb2.append(z12);
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", sb2.toString());
        if (z11) {
            m15698a = (FrameLayout.LayoutParams) this.f149439z0.getLayoutParams();
            m15698a.width = AbstractC3104p.m15685r0();
            m15698a.height = AbstractC3104p.m15635L();
            m15698a.gravity = 8388661;
            m15698a.topMargin = AbstractC3104p.m15643T();
            m15698a.rightMargin = AbstractC3104p.m15678o();
            this.f149439z0.clearAnimation();
        } else {
            m15698a = AbstractC3105q.m15698a(-1, -1);
        }
        if (this.f149347A0 == null) {
            SelfCallView selfCallView = new SelfCallView(getContext());
            this.f149347A0 = selfCallView;
            selfCallView.setId(AbstractC6918a0.call_selfView);
            this.f149347A0.m157400j(C28203u6.f131407a.m141808b(CoreUtility.f89233i));
        }
        this.f149347A0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f149439z0.setLayoutParams(m15698a);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: gd */
    public void mo138168gd(boolean z11) {
        if (this.f149366L0 != null) {
            C21709f c21709f = this.f149438y1;
            if (c21709f != null) {
                c21709f.m112046s(0.0d);
            }
            this.f149366L0.setEnabled(z11);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: gf */
    public void mo138169gf() {
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_more", String.valueOf(2)), false);
        this.f149377U.removeMessages(2);
        this.f149377U.sendEmptyMessageDelayed(2, 5000L);
        this.f149397e0 = true;
        this.f149361H0.setSelected(true);
        this.f149357F0.bringToFront();
        this.f149357F0.setVisibility(0);
        this.f149356E1.m112046s(1.0d);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: hm */
    public void mo138170hm(String str) {
        RobotoTextView robotoTextView;
        if (!TextUtils.isEmpty(str) && (robotoTextView = this.f149392b1) != null) {
            robotoTextView.setText(str);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: hq */
    public void mo138171hq() {
        if (this.f149381W == null) {
            return;
        }
        this.f149394c1.setMinimizedWithAnimation(false);
        this.f149396d1.setSelected(true);
        this.f149381W.m110444T(true);
    }

    /* renamed from: i9 */
    public boolean m156631i9() {
        return this.f149375T.mo138085be();
    }

    /* renamed from: ie */
    void m156632ie() {
        if (this.f149358F1 != null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f149358F1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vo0.x0
            public /* synthetic */ C28545x0() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.m156616zc(valueAnimator);
            }
        });
        this.f149358F1.setDuration(1000L);
        this.f149358F1.setInterpolator(new LinearInterpolator());
        this.f149358F1.setRepeatCount(-1);
        this.f149358F1.setRepeatMode(1);
        this.f149358F1.start();
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: jx */
    public void mo59032jx(int i11) {
        AbstractC3096i0.m15520V0(i11);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: k7 */
    public void mo138172k7(int i11, boolean z11) {
        C21334l c21334l = this.f149383X;
        if (c21334l == null) {
            return;
        }
        c21334l.m110493g0(i11, z11);
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: kl */
    public void mo78955kl(Runnable runnable, long j11) {
        this.f149377U.postDelayed(runnable, j11);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: km */
    public void mo138173km() {
        if (this.f149400f1 == null) {
            m156519W7();
        }
        this.f149402g1.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, AbstractC3104p.m15650a(6.0f), -AbstractC3104p.m15650a(4.0f));
        translateAnimation.setDuration(800L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        this.f149402g1.startAnimation(translateAnimation);
        this.f149377U.postDelayed(new Runnable() { // from class: vo0.s
            public /* synthetic */ RunnableC28509s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.mo138181pe();
            }
        }, 6000L);
        this.f149400f1.setVisibility(0);
        C0815e1.m2075D().m2100V(new C23648e(24, "in_call", 1, "gr_call_scroll_tip", new String[0]).m123926s(String.valueOf(this.f149375T.mo138100ob())), false);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: kw */
    public void mo138174kw(int i11) {
        MultiStateView.EnumC15915f enumC15915f;
        int i12;
        try {
            if (!this.f149427t0) {
                return;
            }
            m156467Gd(false);
            this.f149426s1.setState(MultiStateView.EnumC15914e.ERROR);
            MultiStateView multiStateView = this.f149426s1;
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView.setErrorType(enumC15915f);
            MultiStateView multiStateView2 = this.f149426s1;
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.str_tv_loadingMemberList_error;
            }
            multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0724q
    /* renamed from: l0 */
    public C0722p.b mo1166l0() {
        return C0722p.b.CALL;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: ly */
    public void mo138175ly() {
        m156525Xb(false);
        AbstractC3085d.m15442d(this.f149349B0, true);
        AbstractC3085d.m15450l(this.f149394c1, this.f149375T.mo138083Yg(mo138118F2()), 0.0f, 200L);
        AbstractC3085d.m15449k(this.f149371Q0, true, 0.0f, 0.0f, new C32396n());
        AbstractC3085d.m15449k(this.f149374S0, true, 0.0f, 0.0f, new C32397o());
        AbstractC3085d.m15449k(this.f149359G0, true, 0.0f, 0.0f, new C32398p());
        AbstractC3085d.m15449k(this.f149351C0, true, 0.0f, 0.0f, new C32383a());
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: m1 */
    public boolean mo138176m1() {
        return this.f149399f0;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: mt */
    public void mo138177mt(boolean z11, boolean z12) {
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "onOnOffCamDone " + z11);
        if (this.f149368N0 != null) {
            this.f149440z1.m112046s(0.0d);
            this.f149368N0.setSelected(z11);
            this.f149368N0.setEnabled(true);
        }
        if (this.f149374S0 == null) {
            return;
        }
        C21709f c21709f = this.f149348A1;
        if (c21709f != null) {
            c21709f.m112046s(0.0d);
        }
        this.f149374S0.setEnabled(!z11);
        SelfCallView selfCallView = this.f149347A0;
        if (selfCallView != null) {
            selfCallView.m157399i(z11, mo138118F2());
            this.f149347A0.m157401k(this.f149375T.mo138071Ol(mo138118F2()));
        }
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110493g0(C21334l.f103899A.m110500a(), z11);
        }
    }

    /* renamed from: ne */
    void m156633ne() {
        if (this.f149434w1) {
            this.f149365K0.clearAnimation();
        }
        this.f149434w1 = false;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: nr */
    public void mo138178nr(List list, HashSet hashSet) {
        C21333k c21333k = this.f149422q1;
        if (c21333k != null) {
            c21333k.m110469T(hashSet);
        }
        C21329g c21329g = this.f149381W;
        if (c21329g != null && this.f149398e1 != null) {
            c21329g.m110446V(new ArrayList(list));
            this.f149381W.m110447W(hashSet);
            this.f149381W.m10008p();
            if (this.f149381W.mo10003k() > 1) {
                this.f149396d1.setVisibility(0);
            } else {
                this.f149396d1.setVisibility(8);
            }
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: oE */
    public void mo138179oE(int i11, Bundle bundle) {
        String str;
        if (i11 != 3) {
            if (i11 != 4) {
                str = "";
            } else {
                this.f149408j1 = new PreviewCameraGroupCallDialog();
                str = "OPEN_CAM_CONFIRMATION_DIALOG";
            }
        } else {
            this.f149408j1 = new SpeakerChooserDialog(2);
            str = "SpeakerChooserDialog";
        }
        DialogView dialogView = this.f149408j1;
        if (dialogView != null) {
            dialogView.m92603VK(this.f149389a0, str, bundle);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: ok */
    public void mo138180ok() {
        m156525Xb(true);
        AbstractC3085d.m15442d(this.f149349B0, false);
        AbstractC3085d.m15450l(this.f149394c1, this.f149375T.mo138083Yg(mo138118F2()), -200.0f, 200L);
        AbstractC3085d.m15447i(this.f149371Q0, false, 0.0f, -200.0f, 300L);
        AbstractC3085d.m15447i(this.f149374S0, false, 0.0f, -200.0f, 300L);
        AbstractC3085d.m15447i(this.f149351C0, false, 0.0f, -200.0f, 300L);
        AbstractC3085d.m15447i(this.f149359G0, false, 0.0f, 200.0f, 300L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z11;
        C17487o0 c17487o0 = this.f149389a0;
        boolean z12 = false;
        if (c17487o0 != null) {
            ZaloView m92996E0 = c17487o0.m92996E0("SHOW_SETTING_PERMISSION_TAG");
            if (m92996E0 != null) {
                this.f149389a0.mo92702G1(m92996E0, 0);
                z11 = true;
            } else {
                z11 = false;
            }
            ZaloView m92996E02 = this.f149389a0.m92996E0("SHOW_ALERT_TAG");
            if (m92996E02 != null) {
                this.f149389a0.mo92702G1(m92996E02, 0);
            }
            z12 = z11;
        }
        if (this.f149431v0) {
            m156621Q8();
        } else {
            this.f149375T.mo138095i8(z12);
            m156577pd();
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "Configuration changed");
        this.f149375T.mo138101on();
        Configuration configuration2 = this.f149430u1;
        if (configuration2 != null) {
            if ((configuration.diff(configuration2) & 1024) != 0) {
                m156584rd();
            }
        } else {
            m156584rd();
        }
        this.f149430u1 = new Configuration(configuration);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        AbstractC3096i0.f13174r = 1;
        super.onCreate(bundle);
        if (C32150v9.f148254a.m155132g()) {
            startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
            finish();
            return;
        }
        AbstractC3082b0.m15424f("VOIP_GroupCallActivity", "onCreate " + System.identityHashCode(this));
        AbstractC3096i0.f13166j = true;
        AbstractC3096i0.f13159c = true;
        AbstractC3096i0.f13168l = false;
        AbstractC3096i0.f13167k = 1;
        C29118a0 c29118a0 = new C29118a0(this, AbstractC32273e3.m155748Q(), C32319o.m156293t(), C32257b4.m155726m(), C32328p3.m156358e(), C32318n3.m156214E(), C32252b.m155705e(), C17846e.m94223f(), C19577z.m102341J(), C20024r.m103937c());
        this.f149375T = c29118a0;
        c29118a0.mo995Nd(C26350a.m135670a(getIntent().getExtras()), null);
        m156477J8(getIntent());
        this.f149391b0 = AbstractC18044d.m95912a(this);
        C21965i c21965i = new C21965i(805306378, "zalo:zm.voip.onIncomingCall");
        this.f149393c0 = c21965i;
        c21965i.m114699Q(false);
        m156625Y8();
        m156551h9();
        takeKeyEvents(true);
        AbstractC3096i0.f13165i = true;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        AbstractC3096i0.f13174r = 6;
        AbstractC3082b0.m15424f("VOIP_GroupCallActivity", "onDestroy " + System.identityHashCode(this));
        AbstractC3096i0.f13159c = false;
        AbstractC3096i0.f13168l = false;
        AbstractC3096i0.f13169m = true;
        AbstractC3096i0.f13167k = 6;
        m156640ze();
        m156600wd();
        m156597vd();
        this.f149377U.removeCallbacksAndMessages(null);
        AbstractC3096i0.f13165i = false;
        m156639ue();
        this.f149375T.mo994F2();
        C21965i c21965i = this.f149393c0;
        if (c21965i != null && c21965i.m114696B()) {
            this.f149393c0.m114697N();
        }
        super.onDestroy();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "Key down : " + i11);
        if (i11 != 5 && i11 != 6) {
            if (i11 != 24) {
                if (i11 != 25) {
                    if (i11 != 79) {
                        if (i11 != 84) {
                            return super.onKeyDown(i11, keyEvent);
                        }
                    } else {
                        HeadsetButtonReceiver.m155534a(this);
                        return true;
                    }
                } else {
                    AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "onKeyDown: Volume button pressed");
                    this.f149375T.mo138069N7(true);
                    return super.onKeyDown(i11, keyEvent);
                }
            } else {
                AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "onKeyUp: Volume button pressed");
                this.f149375T.mo138069N7(false);
                return super.onKeyDown(i11, keyEvent);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "Key up : " + i11);
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 == 24 || i11 == 25 || i11 == 84) {
                        return true;
                    }
                    return super.onKeyUp(i11, keyEvent);
                }
                this.f149375T.mo138096ie(1, new Object[0]);
                return true;
            }
            this.f149375T.mo138096ie(3, new Object[0]);
            return true;
        }
        if (keyEvent.getRepeatCount() == 0) {
            onBackPressed();
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        setIntent(intent);
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "New intent is launched");
        super.onNewIntent(intent);
        m156477J8(intent);
        this.f149375T.mo138094hg();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        AbstractC3096i0.f13174r = 4;
        super.onPause();
        C0697c0.Companion.m1048b().m1035h("GroupCallView");
        AbstractC3082b0.m15424f("VOIP_GroupCallActivity", "onPause " + System.identityHashCode(this));
        this.f149375T.onPause();
        PhysicalSelfLayout physicalSelfLayout = this.f149439z0;
        if (physicalSelfLayout != null) {
            this.f149375T.mo138108to(physicalSelfLayout.f150074s);
        }
        m156606xd();
        if (!m156575o9()) {
            this.f149391b0.mo95910c();
        }
        m156550g8();
        m156538c8();
        AbstractC3096i0.f13167k = 4;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11, Configuration configuration) {
        super.onPictureInPictureModeChanged(z11, configuration);
        AbstractC32273e3.m155748Q().f148908v = z11;
        m156494Mc(z11);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        String[] strArr2 = AbstractC3108t.f13194b;
        if (i11 == 200) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC3108t.m15712a(this, strArr2) == 0) {
                this.f149375T.mo138079Vi();
            } else {
                AbstractC23034c6.m118168n0(this, new InterfaceC17463d.d() { // from class: vo0.q
                    public /* synthetic */ C28495q() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        GroupCallActivity.this.m156557ic(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: vo0.r
                    public /* synthetic */ C28502r() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        GroupCallActivity.this.m156576pc(interfaceC17463d, i12);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        AbstractC3096i0.f13174r = 3;
        super.onResume();
        C0697c0.Companion.m1048b().m1043u("GroupCallView");
        AbstractC3082b0.m15424f("VOIP_GroupCallActivity", "onResume " + System.identityHashCode(this));
        AbstractC3096i0.f13166j = true;
        AbstractC3096i0.f13167k = 3;
        this.f149375T.onResume();
        if (m156617E8().mo138089e8()) {
            String[] strArr = AbstractC3108t.f13194b;
            if (AbstractC3108t.m15712a(getBaseContext(), strArr) != 0 && !this.f149405i0) {
                synchronized (this) {
                    this.f149405i0 = true;
                }
                AbstractC3108t.m15713b(this, strArr, 200);
            }
        }
        if (!m156575o9()) {
            this.f149391b0.mo95911d();
        }
        m156549g7();
        if (mo138118F2()) {
            m156494Mc(true);
            this.f149375T.mo138073Pk(true, true);
        }
        m156516Ve();
        AbstractC32273e3.m155748Q().m155906p0();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        AbstractC3096i0.f13174r = 2;
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "onStart " + System.identityHashCode(this));
        if (!C23269y3.m120038e(getResources().getConfiguration()).equals(AbstractC18458a.f93019a)) {
            recreate();
        }
        super.onStart();
        AbstractC23775p0.m124219x(true);
        AbstractC3096i0.f13166j = true;
        if (AbstractC3096i0.m15513S()) {
            C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
            C0815e1.m2075D().m2096R(0, System.currentTimeMillis());
        }
        this.f149375T.onStart();
        AbstractC3096i0.f13171o = false;
        AbstractC32273e3.m155748Q().m155941y2(true, this, this.f149425s0);
        AbstractC3096i0.f13167k = 2;
        AbstractC32273e3.m155748Q().m155784B1();
        AbstractC3096i0.m15542i(getString(AbstractC8020f0.str_call_no_miniview_toast));
        if (this.f149375T.mo138112zm()) {
            C32318n3.m156214E().m156256Q();
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        AbstractC3096i0.f13174r = 5;
        AbstractC3082b0.m15421c("VOIP_GroupCallActivity", "onStop " + System.identityHashCode(this));
        super.onStop();
        C0697c0.Companion.m1048b().m1035h("GroupCallView");
        AbstractC23775p0.m124219x(false);
        this.f149375T.onStop();
        AbstractC3096i0.f13166j = false;
        AbstractC32273e3.m155748Q().f148908v = false;
        AbstractC3096i0.f13167k = 5;
        AbstractC32273e3.m155748Q().m155793D2();
        AbstractC32273e3.m155748Q().m155941y2(false, this, this.f149425s0);
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
        if (AbstractC3096i0.m15513S()) {
            if (!AbstractC3096i0.f13170n) {
                C0815e1.m2075D().m2096R(4, System.currentTimeMillis());
            } else {
                C0815e1.m2075D().m2096R(2, System.currentTimeMillis());
            }
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (z11) {
            C0697c0.Companion.m1048b().m1043u("GroupCallView");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        m156538c8();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        LinearLayout linearLayout = this.f149357F0;
        if (linearLayout != null) {
            linearLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        super.onWindowFocusChanged(z11);
    }

    /* renamed from: p7 */
    void m156634p7() {
        View view = new View(getContext());
        this.f149355E0 = view;
        view.setId(AbstractC6918a0.call_blurBackground);
        this.f149355E0.setBackgroundColor(getResources().getColor(AbstractC16801x.call_background_blur_video));
        this.f149355E0.setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        this.f149355E0.setVisibility(8);
        this.f149355E0.setOnTouchListener(new View.OnTouchListener() { // from class: vo0.i0
            public /* synthetic */ ViewOnTouchListenerC28435i0() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m156611y9;
                m156611y9 = GroupCallActivity.this.m156611y9(view2, motionEvent);
                return m156611y9;
            }
        });
        this.f149435x0.addView(this.f149355E0);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: pe */
    public void mo138181pe() {
        AppCompatImageView appCompatImageView = this.f149402g1;
        if (appCompatImageView != null) {
            appCompatImageView.clearAnimation();
        }
        LinearLayout linearLayout = this.f149400f1;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: pj */
    public boolean mo138182pj() {
        if (AbstractC3108t.m15712a(getBaseContext(), AbstractC3108t.f13194b) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q9 */
    public boolean m156635q9() {
        GestureRightLayout gestureRightLayout = this.f149394c1;
        if (gestureRightLayout != null && gestureRightLayout.m157366d()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: qb */
    public void mo138183qb(boolean z11) {
        m156612yd();
        m156458Ee();
        m156623U7();
        m156630g9(true);
        m156482K7();
        this.f149375T.mo138065Jc();
        this.f149371Q0.setEnabled(true);
        this.f149386Y0.setVisibility(8);
        PhysicalSelfLayout physicalSelfLayout = this.f149439z0;
        if (physicalSelfLayout != null) {
            physicalSelfLayout.addView(this.f149347A0);
            this.f149439z0.f150075t = m156603x9();
        }
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110499m0(C21334l.f103899A.m110500a(), 3);
        }
        this.f149363I0.m157421f(getString(AbstractC8020f0.str_call_hangup_button_text));
        this.f149435x0.setBackgroundColor(getResources().getColor(AbstractC16801x.black));
        this.f149351C0.setVisibility(0);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: qo */
    public void mo138184qo() {
        this.f149410k1.m157184y();
    }

    @Override // to0.InterfaceC26857b, p205hc.InterfaceC19967f
    public boolean removeCallbacks(Runnable runnable) {
        if (runnable != null) {
            this.f149377U.removeCallbacks(runnable);
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: rv */
    public void mo138185rv(long j11) {
        this.f149353D0.start();
        this.f149353D0.setBase(j11);
    }

    /* renamed from: s7 */
    void m156636s7() {
        boolean z11;
        int m15670k = AbstractC3104p.m15670k();
        int m15682q = AbstractC3104p.m15682q();
        int m15666i = AbstractC3104p.m15666i();
        CircleBackgroundAnswer circleBackgroundAnswer = new CircleBackgroundAnswer(getContext());
        this.f149364J0 = circleBackgroundAnswer;
        circleBackgroundAnswer.setId(AbstractC6918a0.call_answerBackground);
        this.f149364J0.setDiameter(m15670k);
        this.f149364J0.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f149359G0 = linearLayout;
        linearLayout.setId(AbstractC6918a0.call_controlLayouts);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-1, -2);
        m15698a.gravity = 80;
        this.f149359G0.setLayoutParams(m15698a);
        boolean z12 = false;
        this.f149359G0.setPadding(AbstractC3104p.m15650a(20.0f), 0, AbstractC3104p.m15650a(20.0f), m15682q);
        this.f149359G0.setOrientation(0);
        this.f149359G0.setGravity(49);
        this.f149359G0.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC32391i());
        LinearLayout.LayoutParams m15702e = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(0, -2);
        m15701d.weight = 1.0f;
        VoIPButtonWithText voIPButtonWithText = new VoIPButtonWithText(getContext(), 3);
        this.f149367M0 = voIPButtonWithText;
        voIPButtonWithText.m157424i(m15702e).m157421f(getString(AbstractC8020f0.str_call_mic_button_text)).m157425j(this.f149373S.f125195e).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_mic_selector);
        this.f149367M0.setId(AbstractC6918a0.call_muteBtn);
        this.f149367M0.getButton().setContentDescription("Mute record");
        this.f149367M0.setLayoutParams(m15701d);
        this.f149367M0.setAlignmentTextView(4);
        this.f149367M0.setVisibility(8);
        LinearLayout.LayoutParams m15702e2 = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e2.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(0, -2);
        m15701d2.weight = 1.0f;
        VoIPButtonWithText voIPButtonWithText2 = new VoIPButtonWithText(getContext(), 3);
        this.f149368N0 = voIPButtonWithText2;
        voIPButtonWithText2.m157424i(m15702e2).m157421f(getString(AbstractC8020f0.str_call_camera_button_text)).m157425j(this.f149373S.f125195e).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_cam_selector);
        this.f149368N0.setId(AbstractC6918a0.call_offCameraBtn);
        this.f149368N0.getButton().setContentDescription("On Off Camera");
        this.f149368N0.setLayoutParams(m15701d2);
        this.f149368N0.setAlignmentTextView(4);
        this.f149368N0.setVisibility(8);
        this.f149368N0.setClickable(true);
        LinearLayout.LayoutParams m15702e3 = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e3.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(0, -2);
        m15701d3.weight = 1.0f;
        VoIPButtonWithText m157417b = new VoIPButtonWithText(getContext(), 3).m157424i(m15702e3).m157425j(this.f149373S.f125195e).m157421f(getString(this.f149375T.mo138098kf())).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_end_selector);
        this.f149363I0 = m157417b;
        m157417b.setId(AbstractC6918a0.call_endBtn);
        this.f149363I0.getButton().setContentDescription("End call");
        this.f149363I0.setLayoutParams(m15701d3);
        this.f149363I0.setAlignmentTextView(4);
        LinearLayout.LayoutParams m15702e4 = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e4.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d4 = AbstractC3105q.m15701d(0, -2);
        m15701d4.weight = 1.0f;
        VoIPButtonWithText voIPButtonWithText3 = new VoIPButtonWithText(getContext(), 3);
        this.f149361H0 = voIPButtonWithText3;
        voIPButtonWithText3.m157424i(m15702e4).m157421f(getString(AbstractC8020f0.str_call_menu_button_text)).m157425j(this.f149373S.f125195e).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_more_menu_selector);
        this.f149361H0.setId(AbstractC6918a0.call_optionBtn);
        this.f149361H0.getButton().setContentDescription("More Button");
        this.f149361H0.setLayoutParams(m15701d4);
        this.f149361H0.setAlignmentTextView(4);
        this.f149361H0.setVisibility(8);
        this.f149361H0.setClickable(true);
        ViewOnLayoutChangeListenerC28551y viewOnLayoutChangeListenerC28551y = new View.OnLayoutChangeListener() { // from class: vo0.y
            public /* synthetic */ ViewOnLayoutChangeListenerC28551y() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                GroupCallActivity.this.m156503Q9(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f149409k0 = viewOnLayoutChangeListenerC28551y;
        this.f149361H0.addOnLayoutChangeListener(viewOnLayoutChangeListenerC28551y);
        m156524X7();
        this.f149365K0 = new C32392j(getContext(), 3);
        LinearLayout.LayoutParams m15702e5 = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e5.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d5 = AbstractC3105q.m15701d(0, -2);
        m15701d5.weight = 1.0f;
        m15701d5.leftMargin = AbstractC3104p.m15659e0() / 4;
        this.f149365K0.m157424i(m15702e5).m157425j(this.f149373S.f125195e).m157421f(getString(AbstractC8020f0.str_call_accept_button_text)).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_answer_video_selector);
        this.f149365K0.setId(AbstractC6918a0.call_answerBtn);
        this.f149365K0.getButton().setContentDescription("Accept call");
        this.f149365K0.setLayoutParams(m15701d5);
        this.f149365K0.setAlignmentTextView(4);
        LinearLayout.LayoutParams m15702e6 = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e6.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d6 = AbstractC3105q.m15701d(0, -2);
        m15701d6.weight = 1.0f;
        m15701d6.leftMargin = m15666i;
        VoIPButtonWithText voIPButtonWithText4 = new VoIPButtonWithText(getContext(), 3);
        this.f149369O0 = voIPButtonWithText4;
        voIPButtonWithText4.m157424i(m15702e6).m157421f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_no_partner_close_button)).m157425j(this.f149373S.f125195e).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_cancel_selector);
        this.f149369O0.setId(AbstractC6918a0.call_cancelBtn);
        this.f149369O0.getButton().setContentDescription("Mute record");
        this.f149369O0.setLayoutParams(m15701d6);
        this.f149369O0.setAlignmentTextView(4);
        LinearLayout.LayoutParams m15702e7 = AbstractC3105q.m15702e(-2, -2, 1.0f);
        m15702e7.topMargin = AbstractC3104p.m15675m0();
        LinearLayout.LayoutParams m15701d7 = AbstractC3105q.m15701d(0, -2);
        m15701d7.weight = 1.0f;
        m15701d7.leftMargin = m15666i;
        VoIPButtonWithText voIPButtonWithText5 = new VoIPButtonWithText(getContext(), 3);
        this.f149370P0 = voIPButtonWithText5;
        voIPButtonWithText5.m157424i(m15702e7).m157421f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_no_partner_callback_button)).m157425j(this.f149373S.f125195e).m157418c(AbstractC3105q.m15703f(m15670k, m15670k)).m157417b(AbstractC16803z.ic_call_answer_video_selector);
        this.f149370P0.setId(AbstractC6918a0.call_callbackBtn);
        this.f149370P0.getButton().setContentDescription("Mute record");
        this.f149370P0.setLayoutParams(m15701d7);
        this.f149370P0.setAlignmentTextView(4);
        this.f149359G0.addView(this.f149368N0);
        this.f149359G0.addView(this.f149367M0);
        this.f149359G0.addView(this.f149363I0);
        this.f149359G0.addView(this.f149361H0);
        this.f149359G0.addView(this.f149365K0);
        this.f149359G0.addView(this.f149369O0);
        this.f149359G0.addView(this.f149370P0);
        this.f149435x0.addView(this.f149364J0);
        this.f149435x0.addView(this.f149359G0);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z12 = true;
        }
        if (z11 && z12) {
            this.f149367M0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.z
                public /* synthetic */ ViewOnClickListenerC28558z() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156506R9(view);
                }
            });
            this.f149365K0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.a0
                public /* synthetic */ ViewOnClickListenerC28371a0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156532aa(view);
                }
            });
            this.f149361H0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.b0
                public /* synthetic */ ViewOnClickListenerC28379b0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156543ea(view);
                }
            });
            this.f149368N0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.c0
                public /* synthetic */ ViewOnClickListenerC28387c0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156548fa(view);
                }
            });
            this.f149369O0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.d0
                public /* synthetic */ ViewOnClickListenerC28395d0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156565la(view);
                }
            });
            this.f149370P0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.e0
                public /* synthetic */ ViewOnClickListenerC28403e0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.this.m156579qa(view);
                }
            });
        } else {
            this.f149367M0.getButton().setOnTouchListener(new ViewOnTouchListenerC32399q(this, 5, this.f149436x1));
            this.f149365K0.getButton().setOnTouchListener(new View.OnTouchListener() { // from class: vo0.f0

                /* renamed from: q */
                public final /* synthetic */ int f132321q;

                public /* synthetic */ ViewOnTouchListenerC28411f0(int m15670k2) {
                    r2 = m15670k2;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m156583ra;
                    m156583ra = GroupCallActivity.this.m156583ra(r2, view, motionEvent);
                    return m156583ra;
                }
            });
            this.f149368N0.getButton().setOnTouchListener(new ViewOnTouchListenerC32399q(this, 12, this.f149440z1));
            this.f149361H0.getButton().setOnTouchListener(new ViewOnTouchListenerC32399q(this, 21, this.f149350B1));
            this.f149369O0.getButton().setOnTouchListener(new ViewOnTouchListenerC32399q(this, 28, this.f149352C1));
            this.f149370P0.getButton().setOnTouchListener(new ViewOnTouchListenerC32399q(this, 29, this.f149354D1));
        }
        this.f149363I0.getButton().setOnClickListener(new View.OnClickListener() { // from class: vo0.g0
            public /* synthetic */ ViewOnClickListenerC28419g0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.m156590ta(view);
            }
        });
    }

    /* renamed from: sd */
    void m156637sd() {
        C23744a.m124114c().m124115b(this, 40013);
        C23744a.m124114c().m124115b(this, 1001);
        C23744a.m124114c().m124115b(this, ZAbstractBase.ZVU_BLEND_GEN_THUMB);
        C23744a.m124114c().m124115b(this, 1000);
        C23744a.m124114c().m124115b(this, 40011);
        C23744a.m124114c().m124115b(this, 40012);
        C23744a.m124114c().m124115b(this, 40014);
        C23744a.m124114c().m124115b(this, 1006);
        C23744a.m124114c().m124115b(this, 40015);
        C23744a.m124114c().m124115b(this, 10018);
        C23744a.m124114c().m124115b(this, 10019);
        C23744a.m124114c().m124115b(this, IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM);
        C23744a.m124114c().m124115b(this, IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM);
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 40016);
        C23744a.m124114c().m124115b(this, 65);
        C23744a.m124114c().m124115b(this, 40017);
        C23744a.m124114c().m124115b(this, 10035);
        C23744a.m124114c().m124115b(this, 40019);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: tF */
    public void mo138186tF(boolean z11, C21791f c21791f, int i11) {
        if (z11) {
            c21791f.m112459B(i11);
            this.f149383X.m110478N(c21791f);
        } else {
            mo138159dG(c21791f);
        }
    }

    /* renamed from: th */
    public boolean m156638th() {
        boolean isInMultiWindowMode;
        if (Build.VERSION.SDK_INT > 23) {
            isInMultiWindowMode = isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        return false;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: tp */
    public void mo138187tp(C21791f c21791f) {
        C21334l c21334l = this.f149383X;
        if (c21334l != null) {
            c21334l.m110498l0(c21791f);
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: uc */
    public void mo138188uc(C21791f c21791f, C21791f c21791f2) {
        this.f149383X.m110478N(c21791f2);
        mo138159dG(c21791f);
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: ud */
    public void mo138189ud(C27352b c27352b, int i11) {
        if (c27352b != null) {
            this.f149439z0.setThreshold(c27352b);
        }
        this.f149439z0.f150074s = i11;
    }

    /* renamed from: ue */
    void m156639ue() {
        ValueAnimator valueAnimator = this.f149358F1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f149358F1 = null;
        }
        m156633ne();
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: ux */
    public void mo138190ux(ArrayList arrayList) {
        try {
            if (!this.f149427t0) {
                return;
            }
            m156497Nd(AbstractC8020f0.str_emptyResult);
            m156467Gd(false);
            C21333k c21333k = this.f149422q1;
            if (c21333k != null) {
                c21333k.m110468S(arrayList);
                this.f149422q1.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: v0 */
    public void mo138191v0(long j11) {
        if (this.f149357F0 == null) {
            return;
        }
        this.f149377U.removeMessages(2);
        if (!this.f149397e0) {
            this.f149357F0.setVisibility(8);
            return;
        }
        this.f149361H0.setSelected(false);
        this.f149357F0.setVisibility(0);
        if (j11 == 0) {
            this.f149356E1.m112050w(0.0d);
            m156585re();
        } else {
            this.f149356E1.m112046s(0.0d);
        }
    }

    @Override // p205hc.InterfaceC19967f
    /* renamed from: wy */
    public void mo70710wy(Runnable runnable) {
        runOnUiThread(runnable);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        runOnUiThread(new Runnable() { // from class: vo0.p

            /* renamed from: q */
            public final /* synthetic */ int f132417q;

            /* renamed from: r */
            public final /* synthetic */ Object[] f132418r;

            public /* synthetic */ RunnableC28488p(int i112, Object[] objArr2) {
                r2 = i112;
                r3 = objArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.m156485Kb(r2, r3);
            }
        });
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: xF */
    public boolean mo138192xF() {
        return this.f149397e0;
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: xH */
    public void mo138193xH(C21791f c21791f) {
        if (this.f149383X != null) {
            CustomEditText customEditText = this.f149428t1;
            if (customEditText != null && this.f149431v0) {
                customEditText.clearFocus();
                this.f149428t1.requestFocus();
            }
            this.f149383X.m110478N(c21791f);
            CustomEditText customEditText2 = this.f149428t1;
            if (customEditText2 != null && this.f149431v0) {
                customEditText2.clearFocus();
                this.f149428t1.requestFocus();
            }
        }
    }

    @Override // to0.InterfaceC26857b
    /* renamed from: yg */
    public void mo138194yg(Runnable runnable) {
        if (runnable != null) {
            this.f149377U.post(runnable);
        }
    }

    /* renamed from: ze */
    void m156640ze() {
        try {
            C23744a.m124114c().m124117e(this, 40013);
            C23744a.m124114c().m124117e(this, ZAbstractBase.ZVU_BLEND_GEN_THUMB);
            C23744a.m124114c().m124117e(this, 1000);
            C23744a.m124114c().m124117e(this, 40011);
            C23744a.m124114c().m124117e(this, 40012);
            C23744a.m124114c().m124117e(this, 1001);
            C23744a.m124114c().m124117e(this, 40014);
            C23744a.m124114c().m124117e(this, 1006);
            C23744a.m124114c().m124117e(this, 40015);
            C23744a.m124114c().m124117e(this, 10018);
            C23744a.m124114c().m124117e(this, 10019);
            C23744a.m124114c().m124117e(this, IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM);
            C23744a.m124114c().m124117e(this, IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM);
            C23744a.m124114c().m124117e(this, 27);
            C23744a.m124114c().m124117e(this, 40016);
            C23744a.m124114c().m124117e(this, 65);
            C23744a.m124114c().m124117e(this, 40017);
            C23744a.m124114c().m124117e(this, 10035);
            C23744a.m124114c().m124117e(this, 40019);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_GroupCallActivity", "unregisterBroadcast " + e11.getMessage(), e11);
            e11.printStackTrace();
        }
    }
}
