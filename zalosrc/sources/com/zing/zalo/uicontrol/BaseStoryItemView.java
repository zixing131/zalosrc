package com.zing.zalo.uicontrol;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.view.AbstractC1579n0;
import au.C2343e;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.components.FeedBackgroundView;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.feed.mvp.storymusic.view.StoryBoxLyric;
import com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import e90.C18310c;
import e90.C18311d;
import gg0.AbstractC19444a;
import hm0.C20096c;
import ho0.AbstractC20110a;
import io.C20638b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jo.C21322c;
import kr.InterfaceC21910a;
import kr.InterfaceC21911b;
import l30.AbstractC22055v0;
import l30.C22021e0;
import lr.C22640a;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mr.InterfaceC23431j;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p500s1.C26087b;
import p509sp.C26361j;
import p588vw.C28652r;
import p666y1.C30256b;
import p716zh.C31845ac;
import p716zh.C31877d;
import p716zh.C31890dc;
import p716zh.C31980jc;
import p716zh.C32123ta;
import th.AbstractC26681b;
import ui0.C27280g;
import vg.C28203u6;
import zl0.AbstractC32226c;
import zl0.AbstractC32229f;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public abstract class BaseStoryItemView extends FrameLayout {

    /* renamed from: x0 */
    private static final int f83086x0 = AbstractC6918a0.tag_story_id;

    /* renamed from: A */
    ImageView f83087A;

    /* renamed from: B */
    AspectRatioImageView f83088B;

    /* renamed from: C */
    public RecyclingImageView f83089C;

    /* renamed from: D */
    public ZVideoView f83090D;

    /* renamed from: E */
    public FeedBackgroundView f83091E;

    /* renamed from: F */
    StorySongInfoView f83092F;

    /* renamed from: G */
    StoryBoxLyric f83093G;

    /* renamed from: H */
    View f83094H;

    /* renamed from: I */
    View f83095I;

    /* renamed from: J */
    public View f83096J;

    /* renamed from: K */
    TextView f83097K;

    /* renamed from: L */
    ButtonWithProgress f83098L;

    /* renamed from: M */
    Button f83099M;

    /* renamed from: N */
    View f83100N;

    /* renamed from: O */
    public View f83101O;

    /* renamed from: P */
    public RoundCornerImageView f83102P;

    /* renamed from: Q */
    public View f83103Q;

    /* renamed from: R */
    View f83104R;

    /* renamed from: S */
    public FrameLayout f83105S;

    /* renamed from: T */
    float f83106T;

    /* renamed from: U */
    AnimatorSet f83107U;

    /* renamed from: V */
    protected C32123ta f83108V;

    /* renamed from: W */
    C23528a f83109W;

    /* renamed from: a0 */
    public C31980jc f83110a0;

    /* renamed from: b0 */
    C3977j f83111b0;

    /* renamed from: c0 */
    Drawable f83112c0;

    /* renamed from: d0 */
    int f83113d0;

    /* renamed from: e0 */
    Rect f83114e0;

    /* renamed from: f0 */
    ZaloView f83115f0;

    /* renamed from: g0 */
    Handler f83116g0;

    /* renamed from: h0 */
    int f83117h0;

    /* renamed from: i0 */
    int f83118i0;

    /* renamed from: j0 */
    int f83119j0;

    /* renamed from: k0 */
    boolean f83120k0;

    /* renamed from: l0 */
    boolean f83121l0;

    /* renamed from: m0 */
    VelocityTracker f83122m0;

    /* renamed from: n0 */
    View.OnTouchListener f83123n0;

    /* renamed from: o0 */
    int f83124o0;

    /* renamed from: p */
    public View f83125p;

    /* renamed from: p0 */
    boolean f83126p0;

    /* renamed from: q */
    public View f83127q;

    /* renamed from: q0 */
    AbstractC32226c.b f83128q0;

    /* renamed from: r */
    View f83129r;

    /* renamed from: r0 */
    AbstractC32226c.b f83130r0;

    /* renamed from: s */
    RecyclingImageView f83131s;

    /* renamed from: s0 */
    AbstractC32226c.b f83132s0;

    /* renamed from: t */
    ViewSwitcher f83133t;

    /* renamed from: t0 */
    private AnimatorSet f83134t0;

    /* renamed from: u */
    TextView f83135u;

    /* renamed from: u0 */
    private boolean f83136u0;

    /* renamed from: v */
    TextView f83137v;

    /* renamed from: v0 */
    View.OnClickListener f83138v0;

    /* renamed from: w */
    RobotoTextView f83139w;

    /* renamed from: w0 */
    InterfaceC16456f f83140w0;

    /* renamed from: x */
    public PlaylistProgressBar f83141x;

    /* renamed from: y */
    LinearLayout f83142y;

    /* renamed from: z */
    ImageView f83143z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.BaseStoryItemView$a */
    /* loaded from: classes4.dex */
    public class C16451a implements Handler.Callback {
        C16451a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 && BaseStoryItemView.this.f83133t.getDisplayedChild() != 0) {
                        BaseStoryItemView.this.f83133t.setDisplayedChild(0);
                    }
                } else if (BaseStoryItemView.this.f83133t.getDisplayedChild() != 1) {
                    BaseStoryItemView.this.f83133t.setDisplayedChild(1);
                }
            } else if (!BaseStoryItemView.this.m87717z()) {
                BaseStoryItemView.this.m87701Z(true, true);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.BaseStoryItemView$b */
    /* loaded from: classes4.dex */
    public class ViewOnTouchListenerC16452b implements View.OnTouchListener {
        ViewOnTouchListenerC16452b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:89:0x0215, code lost:            if (r0 == false) goto L238;     */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z11;
            VelocityTracker velocityTracker;
            boolean mo87694S;
            boolean z12;
            InterfaceC16456f interfaceC16456f;
            InterfaceC16456f interfaceC16456f2 = BaseStoryItemView.this.f83140w0;
            if (interfaceC16456f2 == null || !interfaceC16456f2.mo84782q()) {
                return true;
            }
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (actionMasked == 0) {
                    BaseStoryItemView baseStoryItemView = BaseStoryItemView.this;
                    if (!baseStoryItemView.f83120k0 && !baseStoryItemView.f83121l0) {
                        ZaloView zaloView = baseStoryItemView.f83115f0;
                        if (zaloView != null && zaloView.m92672lJ()) {
                            return false;
                        }
                        BaseStoryItemView baseStoryItemView2 = BaseStoryItemView.this;
                        baseStoryItemView2.f83140w0.mo84761I(baseStoryItemView2);
                        BaseStoryItemView baseStoryItemView3 = BaseStoryItemView.this;
                        baseStoryItemView3.f83121l0 = true;
                        baseStoryItemView3.f83117h0 = pointerId;
                        baseStoryItemView3.f83118i0 = (int) motionEvent.getX();
                        BaseStoryItemView.this.f83119j0 = (int) motionEvent.getY();
                        VelocityTracker velocityTracker2 = BaseStoryItemView.this.f83122m0;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                        InterfaceC16456f interfaceC16456f3 = BaseStoryItemView.this.f83140w0;
                        if (interfaceC16456f3 != null) {
                            interfaceC16456f3.mo84787v();
                        }
                        AbstractC23647d.m123897g("4915302");
                        BaseStoryItemView.this.f83116g0.sendEmptyMessageDelayed(1, 500L);
                        return true;
                    }
                }
                BaseStoryItemView baseStoryItemView4 = BaseStoryItemView.this;
                int i11 = baseStoryItemView4.f83117h0;
                if (pointerId == i11 && (actionMasked == 3 || actionMasked == 1 || actionMasked == 6)) {
                    baseStoryItemView4.f83116g0.removeMessages(1);
                    if (BaseStoryItemView.this.f83136u0) {
                        BaseStoryItemView.this.m87701Z(false, true);
                    }
                    BaseStoryItemView baseStoryItemView5 = BaseStoryItemView.this;
                    baseStoryItemView5.f83120k0 = false;
                    baseStoryItemView5.f83121l0 = false;
                    VelocityTracker velocityTracker3 = baseStoryItemView5.f83122m0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float scaledTouchSlop = ViewConfiguration.get(BaseStoryItemView.this.getContext()).getScaledTouchSlop();
                    if (Math.abs(motionEvent.getX() - BaseStoryItemView.this.f83118i0) <= scaledTouchSlop && Math.abs(motionEvent.getY() - BaseStoryItemView.this.f83119j0) <= scaledTouchSlop && motionEvent.getEventTime() - motionEvent.getDownTime() <= ViewConfiguration.getTapTimeout() + ViewConfiguration.getPressedStateDuration()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!BaseStoryItemView.this.f83140w0.mo84780o()) {
                        if (z11) {
                            View view2 = BaseStoryItemView.this.f83103Q;
                            if (view2 == null || !view2.isShown() || !BaseStoryItemView.this.getBottomIndicatorHitRect().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || !BaseStoryItemView.this.mo87689N()) {
                                BaseStoryItemView baseStoryItemView6 = BaseStoryItemView.this;
                                Rect rect = baseStoryItemView6.f83114e0;
                                if (rect != null && rect.contains(baseStoryItemView6.f83118i0, baseStoryItemView6.f83119j0, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    AbstractC23647d.m123906p("4915300");
                                } else {
                                    AbstractC23647d.m123906p("4915301");
                                }
                                AbstractC23647d.m123893c();
                                InterfaceC16456f interfaceC16456f4 = BaseStoryItemView.this.f83140w0;
                                if (interfaceC16456f4 != null) {
                                    interfaceC16456f4.mo84753A(!z12);
                                    if (!BaseStoryItemView.this.f83140w0.mo84789x(true ^ z12) && (interfaceC16456f = BaseStoryItemView.this.f83140w0) != null) {
                                        interfaceC16456f.mo84754B();
                                    }
                                }
                            }
                        } else {
                            View view3 = BaseStoryItemView.this.f83096J;
                            if ((view3 == null || !view3.isShown()) && (velocityTracker = BaseStoryItemView.this.f83122m0) != null) {
                                velocityTracker.computeCurrentVelocity(1000);
                                int scaledMinimumFlingVelocity = ViewConfiguration.get(BaseStoryItemView.this.getContext()).getScaledMinimumFlingVelocity();
                                int y11 = ((int) motionEvent.getY()) - BaseStoryItemView.this.f83119j0;
                                if ((y11 < 0 && Math.abs(y11) >= BaseStoryItemView.this.f83113d0 / 5.0f) || (BaseStoryItemView.this.f83122m0.getYVelocity() < 0.0f && Math.abs(BaseStoryItemView.this.f83122m0.getYVelocity()) > scaledMinimumFlingVelocity)) {
                                    mo87694S = BaseStoryItemView.this.mo87695T();
                                    InterfaceC16456f interfaceC16456f5 = BaseStoryItemView.this.f83140w0;
                                    if (interfaceC16456f5 != null) {
                                        interfaceC16456f5.mo84783r();
                                    }
                                } else if ((y11 > 0 && Math.abs(y11) >= BaseStoryItemView.this.f83113d0 / 5.0f) || (BaseStoryItemView.this.f83122m0.getYVelocity() > 0.0f && Math.abs(BaseStoryItemView.this.f83122m0.getYVelocity()) > scaledMinimumFlingVelocity)) {
                                    mo87694S = BaseStoryItemView.this.mo87694S();
                                }
                            }
                            InterfaceC16456f interfaceC16456f6 = BaseStoryItemView.this.f83140w0;
                            if (interfaceC16456f6 != null) {
                                interfaceC16456f6.mo84754B();
                            }
                        }
                    }
                    InterfaceC16456f interfaceC16456f7 = BaseStoryItemView.this.f83140w0;
                    if (interfaceC16456f7 != null && !z11) {
                        interfaceC16456f7.mo84786u(motionEvent.getEventTime() - motionEvent.getDownTime());
                    }
                } else if (pointerId == i11 && actionMasked == 2) {
                    int x11 = ((int) motionEvent.getX()) - BaseStoryItemView.this.f83118i0;
                    int y12 = ((int) motionEvent.getY()) - BaseStoryItemView.this.f83119j0;
                    float m155454b = AbstractC32232i.m155454b(0.4f, false);
                    View view4 = BaseStoryItemView.this.f83096J;
                    if (view4 == null || !view4.isShown()) {
                        BaseStoryItemView baseStoryItemView7 = BaseStoryItemView.this;
                        if (baseStoryItemView7.f83121l0 && !baseStoryItemView7.f83120k0) {
                            if (y12 < 0 && Math.abs(y12) >= m155454b && Math.abs(y12) / 3 > Math.abs(x11)) {
                                BaseStoryItemView baseStoryItemView8 = BaseStoryItemView.this;
                                baseStoryItemView8.f83121l0 = false;
                                baseStoryItemView8.f83120k0 = true;
                                baseStoryItemView8.f83118i0 = (int) motionEvent.getX();
                                BaseStoryItemView.this.f83119j0 = (int) motionEvent.getY();
                                BaseStoryItemView baseStoryItemView9 = BaseStoryItemView.this;
                                if (baseStoryItemView9.f83122m0 == null) {
                                    baseStoryItemView9.f83122m0 = VelocityTracker.obtain();
                                }
                                BaseStoryItemView.this.f83122m0.addMovement(motionEvent);
                            }
                        }
                    }
                    BaseStoryItemView baseStoryItemView10 = BaseStoryItemView.this;
                    if (baseStoryItemView10.f83120k0) {
                        baseStoryItemView10.f83116g0.removeMessages(1);
                        VelocityTracker velocityTracker4 = BaseStoryItemView.this.f83122m0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.addMovement(motionEvent);
                        }
                        BaseStoryItemView.this.mo87696U(y12);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.BaseStoryItemView$c */
    /* loaded from: classes4.dex */
    public class C16453c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f83146l1;

        /* renamed from: m1 */
        final /* synthetic */ String f83147m1;

        /* renamed from: n1 */
        final /* synthetic */ C24003n f83148n1;

        /* renamed from: o1 */
        final /* synthetic */ C32123ta f83149o1;

        C16453c(String str, String str2, C24003n c24003n, C32123ta c32123ta) {
            this.f83146l1 = str;
            this.f83147m1 = str2;
            this.f83148n1 = c24003n;
            this.f83149o1 = c32123ta;
        }

        /* renamed from: I3 */
        public /* synthetic */ void m87720I3(C18311d c18311d) {
            BaseStoryItemView.this.setImageBgGradient(c18311d);
        }

        /* renamed from: J3 */
        public /* synthetic */ void m87721J3(String str, C18311d c18311d) {
            if (c18311d == null) {
                return;
            }
            try {
                if (AbstractC19444a.m101693a()) {
                    BaseStoryItemView.this.setImageBgGradient(c18311d);
                } else {
                    BaseStoryItemView.this.f83116g0.post(new Runnable() { // from class: com.zing.zalo.uicontrol.m

                        /* renamed from: q */
                        public final /* synthetic */ C18311d f83832q;

                        public /* synthetic */ RunnableC16617m(C18311d c18311d2) {
                            r2 = c18311d2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseStoryItemView.C16453c.this.m87720I3(r2);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (BaseStoryItemView.this.f83089C.getTag(BaseStoryItemView.f83086x0) != null && !BaseStoryItemView.this.f83089C.getTag(BaseStoryItemView.f83086x0).equals(this.f83146l1)) {
                return;
            }
            RecyclingImageView recyclingImageView = BaseStoryItemView.this.f83089C;
            if (recyclingImageView != null) {
                recyclingImageView.setImageInfo(c3979l);
            }
            if (c3979l != null && c3979l.m18839c() != null) {
                C18310c.f92602a.m97230d(this.f83147m1, 0.1f, c3979l.m18839c(), new C18310c.a() { // from class: com.zing.zalo.uicontrol.l
                    public /* synthetic */ C16613l() {
                    }

                    @Override // e90.C18310c.a
                    /* renamed from: a */
                    public final void mo88380a(String str2, C18311d c18311d) {
                        BaseStoryItemView.C16453c.this.m87721J3(str2, c18311d);
                    }
                });
            }
            if (c3979l != null && c3979l.m18839c() != null && this.f83147m1.equals(str)) {
                this.f83148n1.f116261b = new BitmapDrawable(MainApplication.getAppContext().getResources(), c3979l.m18839c());
            } else {
                this.f83148n1.f116261b = null;
            }
            String str2 = this.f83149o1.f148147m;
            if (!TextUtils.isEmpty(str2) && !C23999j.m125692J2(str2, BaseStoryItemView.this.f83089C)) {
                BaseStoryItemView baseStoryItemView = BaseStoryItemView.this;
                ((C23528a) baseStoryItemView.f83109W.m123612r(baseStoryItemView.f83089C)).m123618x(str2, this.f83148n1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.BaseStoryItemView$d */
    /* loaded from: classes4.dex */
    public class C16454d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f83151p;

        C16454d(boolean z11) {
            this.f83151p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            BaseStoryItemView baseStoryItemView = BaseStoryItemView.this;
            if (baseStoryItemView.f83107U == animator) {
                baseStoryItemView.f83107U = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f83151p) {
                BaseStoryItemView baseStoryItemView = BaseStoryItemView.this;
                if (baseStoryItemView.f83107U == animator) {
                    AbstractC23136l9.m118744r1(baseStoryItemView.f83104R, 8);
                    AbstractC23136l9.m118744r1(BaseStoryItemView.this.f83105S, 8);
                    InterfaceC16456f interfaceC16456f = BaseStoryItemView.this.f83140w0;
                    if (interfaceC16456f != null) {
                        interfaceC16456f.mo84790y(false);
                        BaseStoryItemView.this.f83140w0.mo84762J(false);
                    }
                }
                BaseStoryItemView.this.f83126p0 = false;
            }
            BaseStoryItemView baseStoryItemView2 = BaseStoryItemView.this;
            if (baseStoryItemView2.f83107U == animator) {
                baseStoryItemView2.f83107U = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.BaseStoryItemView$e */
    /* loaded from: classes4.dex */
    public class ViewOnClickListenerC16455e implements View.OnClickListener {
        ViewOnClickListenerC16455e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.img_story_avatar && id2 != AbstractC6918a0.tv_story_username) {
                if (id2 == AbstractC6918a0.story_black_overlay) {
                    BaseStoryItemView.this.m87713v(true);
                    InterfaceC16456f interfaceC16456f = BaseStoryItemView.this.f83140w0;
                    if (interfaceC16456f != null) {
                        interfaceC16456f.mo84778m();
                    }
                    BaseStoryItemView.this.mo87693R();
                    return;
                }
                return;
            }
            BaseStoryItemView.this.mo87687L();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.BaseStoryItemView$f */
    /* loaded from: classes4.dex */
    public interface InterfaceC16456f {
        /* renamed from: A */
        void mo84753A(boolean z11);

        /* renamed from: B */
        boolean mo84754B();

        /* renamed from: C */
        void mo84755C();

        /* renamed from: D */
        void mo84756D();

        /* renamed from: E */
        int mo84757E();

        /* renamed from: F */
        ZaloView mo84758F(C32123ta c32123ta, C31980jc c31980jc, BaseStoryItemView baseStoryItemView);

        /* renamed from: G */
        void mo84759G();

        /* renamed from: H */
        void mo84760H(String str);

        /* renamed from: I */
        void mo84761I(BaseStoryItemView baseStoryItemView);

        /* renamed from: J */
        void mo84762J(boolean z11);

        /* renamed from: K */
        void mo84763K(C32123ta c32123ta);

        /* renamed from: L */
        void mo84764L(BaseStoryItemView baseStoryItemView, boolean z11);

        /* renamed from: M */
        void mo84765M(String str, int i11, int i12);

        /* renamed from: a */
        void mo84766a(C32123ta c32123ta);

        /* renamed from: b */
        void mo84767b(C32123ta c32123ta);

        /* renamed from: c */
        void mo84768c(C32123ta c32123ta);

        /* renamed from: d */
        void mo84769d();

        /* renamed from: e */
        void mo84770e();

        /* renamed from: f */
        void mo84771f(String str, int i11, int i12, int i13);

        /* renamed from: g */
        boolean mo84772g();

        /* renamed from: h */
        void mo84773h(String str, int i11, int i12, int i13, String str2, View.OnClickListener onClickListener);

        /* renamed from: i */
        void mo84774i(BaseStoryItemView baseStoryItemView, int i11);

        /* renamed from: j */
        void mo84775j(C32123ta c32123ta);

        /* renamed from: k */
        void mo84776k(int i11);

        /* renamed from: l */
        void mo84777l(C32123ta c32123ta);

        /* renamed from: m */
        void mo84778m();

        /* renamed from: n */
        void mo84779n(String str, String str2, C31877d c31877d);

        /* renamed from: o */
        boolean mo84780o();

        /* renamed from: p */
        void mo84781p(String str, String str2, String str3);

        /* renamed from: q */
        boolean mo84782q();

        /* renamed from: r */
        void mo84783r();

        /* renamed from: s */
        void mo84784s(String str);

        /* renamed from: t */
        boolean mo84785t();

        /* renamed from: u */
        void mo84786u(long j11);

        /* renamed from: v */
        void mo84787v();

        /* renamed from: w */
        boolean mo84788w(String str, boolean z11, boolean z12);

        /* renamed from: x */
        boolean mo84789x(boolean z11);

        /* renamed from: y */
        void mo84790y(boolean z11);
    }

    public BaseStoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83106T = 0.0f;
        this.f83108V = null;
        this.f83110a0 = null;
        this.f83116g0 = new Handler(Looper.getMainLooper(), new C16451a());
        this.f83120k0 = false;
        this.f83121l0 = false;
        this.f83123n0 = new ViewOnTouchListenerC16452b();
        this.f83124o0 = 0;
        this.f83126p0 = false;
        this.f83136u0 = false;
        this.f83138v0 = new ViewOnClickListenerC16455e();
        this.f83113d0 = AbstractC23136l9.m118719j0(getContext());
        this.f83114e0 = new Rect(0, 0, Math.max(AbstractC23136l9.m118731n0(getContext()) / 3, AbstractC32232i.m155453a(77.0f)), this.f83113d0);
    }

    /* renamed from: C */
    public static /* synthetic */ void m87664C(InterfaceC23431j interfaceC23431j, InterfaceC21910a interfaceC21910a) {
        if (interfaceC23431j != null) {
            interfaceC23431j.mo84672Bn(interfaceC21910a.mo46940d(), new SongInfo(interfaceC21910a.mo14159b(), interfaceC21910a.mo14160c().mo14227a(), interfaceC21910a.mo14161e().mo14188a()), interfaceC21910a.mo14160c().getState());
        }
    }

    /* renamed from: D */
    public /* synthetic */ void m87665D(View view) {
        InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84756D();
        }
    }

    /* renamed from: E */
    public static /* synthetic */ void m87666E(WeakReference weakReference, C32123ta c32123ta, int i11, String str, C31890dc c31890dc) {
        int i12;
        int i13;
        if (i11 == 0 && c31890dc != null) {
            try {
                FeedBackgroundView feedBackgroundView = (FeedBackgroundView) weakReference.get();
                if (feedBackgroundView != null && str.equals(feedBackgroundView.getTag(1090453510))) {
                    if (c31890dc.m153249t()) {
                        i12 = C31890dc.f146485E;
                    } else {
                        i12 = c31890dc.f146497c;
                    }
                    CharSequence m143356G = C28652r.m143349v().m143356G(new SpannableStringBuilder(c32123ta.f148115R), AbstractC23136l9.m118742r(i12));
                    feedBackgroundView.setContent(m143356G);
                    int i14 = 8;
                    if (!TextUtils.isEmpty(m143356G)) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    feedBackgroundView.setVisibility(i13);
                    if (c32123ta.f148117T.m14430a()) {
                        int i15 = AbstractC6918a0.tag_visibility;
                        if (!TextUtils.isEmpty(m143356G)) {
                            i14 = 0;
                        }
                        feedBackgroundView.m43644q(i15, Integer.valueOf(i14));
                        feedBackgroundView.setTypeRender(1);
                        feedBackgroundView.m43641m(c31890dc, false, false, m143356G, C32123ta.m155029B(), 8);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: F */
    public /* synthetic */ void m87667F(int i11, View view) {
        AbstractC23647d.m123906p("4915306");
        AbstractC23647d.m123893c();
        InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84776k(i11);
        }
    }

    /* renamed from: G */
    public /* synthetic */ void m87668G(C32123ta c32123ta, View view) {
        mo87699X(c32123ta);
    }

    /* renamed from: H */
    public /* synthetic */ void m87669H() {
        InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84755C();
        }
    }

    /* renamed from: I */
    public /* synthetic */ void m87670I(boolean z11, View view) {
        if (z11) {
            InterfaceC16456f interfaceC16456f = this.f83140w0;
            if (interfaceC16456f != null) {
                interfaceC16456f.mo84756D();
                return;
            }
            return;
        }
        this.f83098L.m90547h(true);
        Handler handler = this.f83116g0;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.k
                public /* synthetic */ RunnableC16609k() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseStoryItemView.this.m87669H();
                }
            }, 500L);
        }
    }

    /* renamed from: J */
    public /* synthetic */ void m87671J() {
        InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84772g();
        }
    }

    /* renamed from: K */
    public /* synthetic */ void m87672K(View view) {
        AbstractC23136l9.m118744r1(this.f83096J, 8);
        setBottomBarVisibility(0);
        Handler handler = this.f83116g0;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.i
                public /* synthetic */ RunnableC16601i() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseStoryItemView.this.m87671J();
                }
            }, 500L);
        }
    }

    /* renamed from: m */
    private void m87684m(InterfaceC21910a interfaceC21910a, InterfaceC23431j interfaceC23431j) {
        if (this.f83093G != null && (interfaceC21910a.mo14161e() instanceof InterfaceC21911b)) {
            InterfaceC21911b interfaceC21911b = (InterfaceC21911b) interfaceC21910a.mo14161e();
            if (!interfaceC21911b.mo14189c().m45711h() && !interfaceC21911b.mo14189c().m45712i() && interfaceC21910a.mo14158a().isPlaying()) {
                this.f83093G.setVisibility(0);
                this.f83093G.m46962e(interfaceC21910a, new StoryBoxLyric.InterfaceC8773a() { // from class: com.zing.zalo.uicontrol.j
                    public /* synthetic */ C16605j() {
                    }

                    @Override // com.zing.zalo.feed.mvp.storymusic.view.StoryBoxLyric.InterfaceC8773a
                    /* renamed from: a */
                    public final void mo46964a(InterfaceC21910a interfaceC21910a2) {
                        BaseStoryItemView.m87664C(InterfaceC23431j.this, interfaceC21910a2);
                    }
                });
                StoryMusicAttachment mo46948b = interfaceC21911b.mo46948b();
                this.f83093G.setRotation((float) mo46948b.m46926d());
                this.f83093G.setScaleX((float) mo46948b.m46927e());
                this.f83093G.setScaleY((float) mo46948b.m46927e());
                float m46928f = ((float) mo46948b.m46928f()) * AbstractC23136l9.m118722k0();
                float m46929g = (((float) mo46948b.m46929g()) * AbstractC23136l9.m118713h0()) - (this.f83093G.getHeight() / 2.0f);
                this.f83093G.setX(m46928f - (this.f83093G.getWidth() / 2.0f));
                this.f83093G.setY(m46929g);
                return;
            }
            this.f83093G.setVisibility(8);
        }
    }

    private void setMarginStatusBar(View view) {
        FrameLayout.LayoutParams layoutParams;
        if (view != null && (layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams()) != null) {
            layoutParams.setMargins(layoutParams.leftMargin, AbstractC23136l9.m118737p0() + layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
    }

    /* renamed from: A */
    public boolean m87685A() {
        View view = this.f83096J;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m87686B() {
        return this.f83121l0 || this.f83120k0;
    }

    /* renamed from: L */
    protected void mo87687L() {
        InterfaceC16456f interfaceC16456f;
        C31980jc c31980jc = this.f83110a0;
        if (c31980jc != null && (interfaceC16456f = this.f83140w0) != null) {
            interfaceC16456f.mo84760H(c31980jc.f147023p);
        }
    }

    /* renamed from: M */
    public void m87688M(boolean z11) {
        if (z11) {
            this.f83105S.setId(AbstractC6918a0.fl_story_item_overlay);
        } else {
            this.f83105S.setId(-1);
        }
        mo87698W(z11);
    }

    /* renamed from: N */
    public abstract boolean mo87689N();

    /* renamed from: O */
    public abstract void mo87690O();

    /* renamed from: P */
    public abstract void mo87691P(boolean z11);

    /* renamed from: Q */
    public abstract void mo87692Q();

    /* renamed from: R */
    public abstract void mo87693R();

    /* renamed from: S */
    public abstract boolean mo87694S();

    /* renamed from: T */
    public abstract boolean mo87695T();

    /* renamed from: U */
    public abstract void mo87696U(int i11);

    /* renamed from: V */
    public abstract void mo87697V();

    /* renamed from: W */
    public abstract void mo87698W(boolean z11);

    /* renamed from: X */
    public abstract void mo87699X(C32123ta c32123ta);

    /* renamed from: Y */
    public void m87700Y() {
        try {
            ZVideoView zVideoView = this.f83090D;
            if (zVideoView != null) {
                zVideoView.setOnPlayerStateChangedListener(null);
                this.f83090D.m92429s0();
                this.f83090D.m92412f0(true);
            }
            RecyclingImageView recyclingImageView = this.f83089C;
            if (recyclingImageView != null) {
                recyclingImageView.setImageDrawable(null);
            }
            this.f83140w0 = null;
            mo87697V();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    public void m87701Z(boolean z11, boolean z12) {
        float f11;
        this.f83116g0.removeMessages(1);
        AnimatorSet animatorSet = this.f83134t0;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f83134t0.cancel();
        }
        if (z11) {
            this.f83136u0 = true;
            f11 = 0.0f;
        } else {
            this.f83136u0 = false;
            f11 = 1.0f;
        }
        if (z12) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f83134t0 = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f83127q, "alpha", f11));
            this.f83134t0.setDuration(200L);
            this.f83134t0.start();
            return;
        }
        this.f83127q.setAlpha(f11);
    }

    /* renamed from: a0 */
    public void mo87702a0(int i11, C32123ta c32123ta, C20096c c20096c) {
        String str;
        try {
            m87716y();
            boolean z11 = true;
            if (i11 == 0) {
                AbstractC20110a.b m104543l = AbstractC20110a.m104543l("[Flow post video]");
                Object[] objArr = new Object[1];
                if (c32123ta != null) {
                    str = c32123ta.f148138h;
                } else {
                    str = "null";
                }
                objArr[0] = str;
                m104543l.mo104556o(8, "[BaseStoryItemView] bind story post fail, storyId=%s", objArr);
                if (this.f83096J != null) {
                    setBottomBarVisibility(8);
                    this.f83096J.setVisibility(0);
                    if (c32123ta != null && c32123ta.m155065A() == 50001) {
                        this.f83097K.setText(AbstractC8020f0.str_connection_error);
                    } else {
                        this.f83097K.setText(AbstractC8020f0.str_story_upload_fail);
                    }
                    this.f83098L.setVisibility(0);
                    this.f83098L.getButton().setText(AbstractC8020f0.str_story_retry);
                    this.f83098L.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.e

                        /* renamed from: q */
                        public final /* synthetic */ C32123ta f83785q;

                        public /* synthetic */ ViewOnClickListenerC16585e(C32123ta c32123ta2) {
                            r2 = c32123ta2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseStoryItemView.this.m87668G(r2, view);
                        }
                    });
                    this.f83099M.setVisibility(0);
                    this.f83099M.setOnClickListener(m87711s(1001));
                    C20638b c20638b = new C20638b();
                    c20638b.m107557c(this.f83110a0);
                    c20638b.m107558d(getViewMode());
                    if (C21322c.m110409n().mo110390c(c20638b).isEmpty()) {
                        this.f83100N.setVisibility(8);
                    } else {
                        this.f83100N.setVisibility(0);
                        this.f83100N.setOnClickListener(m87711s(1007));
                    }
                }
            } else if (i11 == 1) {
                AbstractC23136l9.m118744r1(this.f83142y, 8);
                if (this.f83096J != null) {
                    if (C22021e0.m114963p().f108442j.containsKey(this.f83110a0.f147023p)) {
                        this.f83096J.setVisibility(8);
                    } else {
                        this.f83096J.setVisibility(0);
                        setBottomBarVisibility(8);
                        this.f83100N.setVisibility(8);
                        int viewMode = getViewMode();
                        this.f83097K.setText(AbstractC8020f0.str_story_load_fail);
                        if (viewMode != 0 && viewMode != 4 && this.f83110a0.f147031x.size() == 0) {
                            this.f83098L.getButton().setText(AbstractC8020f0.str_story_back);
                        } else {
                            this.f83098L.getButton().setText(AbstractC8020f0.str_story_retry);
                            z11 = false;
                        }
                        this.f83098L.setVisibility(0);
                        this.f83098L.m90547h(false);
                        this.f83098L.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.f

                            /* renamed from: q */
                            public final /* synthetic */ boolean f83794q;

                            public /* synthetic */ ViewOnClickListenerC16589f(boolean z112) {
                                r2 = z112;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseStoryItemView.this.m87670I(r2, view);
                            }
                        });
                        this.f83099M.setVisibility(8);
                    }
                }
            } else if (i11 == 2) {
                setBottomBarVisibility(8);
                this.f83096J.setVisibility(0);
                this.f83097K.setText(AbstractC8020f0.str_story_load_fail);
                this.f83098L.setVisibility(0);
                this.f83098L.getButton().setText(AbstractC8020f0.str_story_retry);
                this.f83098L.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.g
                    public /* synthetic */ ViewOnClickListenerC16593g() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseStoryItemView.this.m87672K(view);
                    }
                });
                this.f83099M.setVisibility(8);
                this.f83100N.setVisibility(8);
            } else if (i11 == 3) {
                AbstractC23136l9.m118744r1(this.f83142y, 8);
                setBottomBarVisibility(8);
                View view = this.f83096J;
                if (view != null) {
                    view.setVisibility(0);
                    this.f83100N.setVisibility(8);
                    if (c32123ta2 != null) {
                        ContactProfile m141809c = C28203u6.f131407a.m141809c(c32123ta2.f148136g);
                        if (m141809c != null && !CoreUtility.f89233i.equals(m141809c.f42434r)) {
                            this.f83097K.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_error_deleted_new, AbstractC21935u.m114542i(m141809c.f42434r, m141809c.f42437s)));
                        } else {
                            this.f83097K.setText(AbstractC8020f0.str_story_error_deleted);
                        }
                    } else {
                        this.f83097K.setText(AbstractC8020f0.str_story_error_deleted);
                    }
                    this.f83098L.setVisibility(8);
                    this.f83099M.setVisibility(8);
                }
            }
            mo87690O();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b0 */
    public void m87703b0(boolean z11) {
        float f11;
        int i11;
        View view = this.f83104R;
        if (view != null) {
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            view.setAlpha(f11);
            View view2 = this.f83104R;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view2.setVisibility(i11);
        }
    }

    /* renamed from: c0 */
    public void m87704c0(boolean z11) {
        AspectRatioImageView aspectRatioImageView = this.f83088B;
        if (aspectRatioImageView == null) {
            return;
        }
        if (!z11) {
            aspectRatioImageView.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_off_speaker_solid_24, AbstractC2808b.wht_a100));
            this.f83088B.setBackgroundResource(AbstractC16803z.bg_btn_speaker_story_off);
        } else {
            aspectRatioImageView.setImageDrawable(C27280g.m139659b(getContext(), AbstractC23322a.zds_ic_speaker_solid_24, AbstractC2808b.ng100));
            this.f83088B.setBackgroundResource(AbstractC16803z.bg_btn_speaker_story_on);
        }
        this.f83088B.setVisibility(0);
    }

    /* renamed from: d0 */
    public void m87705d0(boolean z11, Animator.AnimatorListener animatorListener) {
        AbstractC23136l9.m118744r1(this.f83105S, 0);
        AbstractC23136l9.m118744r1(this.f83104R, 0);
        if (z11) {
            InterfaceC16456f interfaceC16456f = this.f83140w0;
            if (interfaceC16456f != null) {
                interfaceC16456f.mo84790y(true);
                this.f83140w0.mo84762J(true);
            }
            this.f83107U = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f83105S, "translationY", 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f83104R, "alpha", 1.0f));
            this.f83107U.playTogether(arrayList);
            this.f83107U.setDuration(Math.max(50.0f, (this.f83105S.getTranslationY() / this.f83106T) * 200.0f));
        } else {
            this.f83107U = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ObjectAnimator.ofFloat(this.f83105S, "translationY", this.f83106T));
            arrayList2.add(ObjectAnimator.ofFloat(this.f83104R, "alpha", 0.0f));
            this.f83107U.playTogether(arrayList2);
            this.f83107U.setDuration(200L);
        }
        this.f83107U.setInterpolator(new C26087b());
        if (animatorListener != null) {
            this.f83107U.addListener(animatorListener);
        }
        this.f83107U.addListener(new C16454d(z11));
        if (!z11) {
            this.f83126p0 = true;
        }
        this.f83107U.start();
    }

    Rect getBottomIndicatorHitRect() {
        Rect rect = new Rect();
        this.f83103Q.getHitRect(rect);
        return rect;
    }

    public C32123ta getLastBindStoryItem() {
        return this.f83108V;
    }

    public abstract String getStoryMessageToSend();

    public int getViewMode() {
        InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            return interfaceC16456f.mo84757E();
        }
        return 0;
    }

    /* renamed from: l */
    public void m87706l() {
        if (this.f83130r0 == null) {
            this.f83130r0 = new AbstractC32226c.b(this.f83129r);
            if (AbstractC32229f.m155448t(getContext())) {
                AbstractC32226c.b bVar = this.f83130r0;
                bVar.f148631c = true;
                bVar.f148635g = getResources().getDimensionPixelSize(AbstractC16802y.story_details_top_layout_padding_top_inset);
            } else {
                AbstractC32226c.b bVar2 = this.f83130r0;
                bVar2.f148631c = true;
                bVar2.f148635g = getResources().getDimensionPixelSize(AbstractC16802y.story_details_top_layout_padding_top);
            }
        }
        AbstractC32226c.m155403b(this.f83130r0, false);
        if (this.f83128q0 == null) {
            this.f83128q0 = new AbstractC32226c.b(this.f83094H);
            if (AbstractC32229f.m155448t(getContext())) {
                AbstractC32226c.b bVar3 = this.f83128q0;
                bVar3.f148631c = true;
                bVar3.f148635g = getResources().getDimensionPixelSize(AbstractC16802y.story_details_top_layout_padding_top_inset);
            } else {
                AbstractC32226c.b bVar4 = this.f83128q0;
                bVar4.f148631c = true;
                bVar4.f148635g = getResources().getDimensionPixelSize(AbstractC16802y.story_details_top_layout_padding_top);
            }
        }
        AbstractC32226c.m155403b(this.f83128q0, false);
        if (this.f83132s0 == null) {
            this.f83132s0 = new AbstractC32226c.b(this.f83141x);
            if (AbstractC32229f.m155448t(getContext())) {
                AbstractC32226c.b bVar5 = this.f83132s0;
                bVar5.f148631c = true;
                bVar5.f148630b = true;
                bVar5.f148632d = true;
                bVar5.f148639k = false;
                bVar5.f148635g = AbstractC32232i.m155453a(20.0f);
                this.f83132s0.f148634f = AbstractC32232i.m155453a(10.0f);
                this.f83132s0.f148636h = AbstractC32232i.m155453a(10.0f);
            } else {
                AbstractC32226c.b bVar6 = this.f83132s0;
                bVar6.f148631c = true;
                bVar6.f148630b = true;
                bVar6.f148632d = true;
                bVar6.f148639k = false;
                bVar6.f148635g = AbstractC32232i.m155453a(10.0f);
                this.f83132s0.f148634f = AbstractC32232i.m155453a(10.0f);
                this.f83132s0.f148636h = AbstractC32232i.m155453a(10.0f);
            }
        }
        AbstractC32226c.m155403b(this.f83132s0, false);
    }

    /* renamed from: n */
    public void m87707n(InterfaceC21910a interfaceC21910a, InterfaceC23431j interfaceC23431j) {
        C32123ta c32123ta;
        if (this.f83092F != null) {
            C31980jc c31980jc = this.f83110a0;
            if (c31980jc != null) {
                c32123ta = c31980jc.m153825r();
            } else {
                c32123ta = null;
            }
            if (c32123ta != null && c32123ta.f148138h.equals(interfaceC21910a.mo46940d())) {
                this.f83092F.setVisibility(0);
                this.f83092F.m47004b(interfaceC21910a, interfaceC23431j);
                if (interfaceC21910a.mo14161e() instanceof InterfaceC21911b) {
                    m87684m(interfaceC21910a, interfaceC23431j);
                }
                m87704c0(interfaceC21910a.mo14160c().mo14228b());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f83109W = new C23528a(getContext());
        this.f83129r = findViewById(AbstractC6918a0.story_details_top_layout);
        this.f83131s = (RecyclingImageView) findViewById(AbstractC6918a0.img_story_avatar);
        this.f83135u = (TextView) findViewById(AbstractC6918a0.tv_story_username);
        this.f83131s.setOnClickListener(this.f83138v0);
        this.f83135u.setOnClickListener(this.f83138v0);
        this.f83133t = (ViewSwitcher) findViewById(AbstractC6918a0.viewswitcher_story_avatar_ring);
        this.f83137v = (TextView) findViewById(AbstractC6918a0.tv_story_create_time);
        this.f83141x = (PlaylistProgressBar) findViewById(AbstractC6918a0.story_playlist_progress_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC6918a0.ll_story_item_top_right_controls);
        this.f83142y = linearLayout;
        ImageView imageView = (ImageView) linearLayout.findViewById(AbstractC6918a0.btn_story_settings);
        this.f83143z = imageView;
        if (imageView instanceof TrackingImageView) {
            ((TrackingImageView) imageView).setIdTracking("click_option_story");
        }
        ImageView imageView2 = (ImageView) this.f83142y.findViewById(AbstractC6918a0.btn_story_close);
        this.f83087A = imageView2;
        if (imageView2 instanceof TrackingImageView) {
            ((TrackingImageView) imageView2).setIdTracking("click_close_story");
        }
        this.f83088B = (AspectRatioImageView) this.f83129r.findViewById(AbstractC6918a0.btn_music_speaker);
        StorySongInfoView storySongInfoView = (StorySongInfoView) this.f83129r.findViewById(AbstractC6918a0.story_song_info_view);
        this.f83092F = storySongInfoView;
        if (storySongInfoView != null) {
            storySongInfoView.setVisibility(8);
            this.f83092F.m47005c();
        }
        this.f83125p = findViewById(AbstractC6918a0.story_details_content);
        this.f83127q = findViewById(AbstractC6918a0.story_overlay_content);
        this.f83089C = (RecyclingImageView) findViewById(AbstractC6918a0.story_details_image);
        ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.story_details_video);
        this.f83090D = zVideoView;
        zVideoView.setForceHideController(true);
        if (this.f83090D.getVideoController() != null) {
            this.f83090D.getVideoController().setAllowShowLoadingView(false);
        }
        this.f83090D.setUseVideoRatio(false);
        FeedBackgroundView feedBackgroundView = (FeedBackgroundView) findViewById(AbstractC6918a0.story_bg_feed_view);
        this.f83091E = feedBackgroundView;
        feedBackgroundView.setModeUse(0);
        this.f83091E.setModeView(1);
        this.f83091E.setBackgroundImageGravity(17);
        this.f83094H = findViewById(AbstractC6918a0.story_top_gradient);
        this.f83095I = findViewById(AbstractC6918a0.story_bottom_gradient);
        this.f83101O = findViewById(AbstractC6918a0.story_details_animation_layout);
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) findViewById(AbstractC6918a0.story_item_anim_imv);
        this.f83102P = roundCornerImageView;
        roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(roundCornerImageView.getContext(), AbstractC16781w.ProfileBackgroundColor));
        this.f83105S = (FrameLayout) findViewById(AbstractC6918a0.fl_story_item_overlay);
        View findViewById = findViewById(AbstractC6918a0.story_black_overlay);
        this.f83104R = findViewById;
        findViewById.setAlpha(0.0f);
        this.f83104R.setOnClickListener(this.f83138v0);
        this.f83111b0 = new C3977j(getContext());
        this.f83093G = (StoryBoxLyric) findViewById(AbstractC6918a0.story_box_lyric);
        if (AbstractC26681b.f126358c) {
            m87706l();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        try {
            int size = View.MeasureSpec.getSize(i12);
            this.f83124o0 = size;
            if (size > 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f83124o0, 1073741824));
            } else {
                super.onMeasure(i11, i12);
            }
        } catch (Exception unused) {
            super.onMeasure(i11, i12);
        }
    }

    /* renamed from: p */
    public void m87708p(C32123ta c32123ta, C22640a c22640a, View.OnClickListener onClickListener, boolean z11) {
        if (c32123ta != null) {
            if ((C26361j.f125215a.m135702h(c32123ta) && z11 && !c32123ta.m155068H()) || c32123ta.f148140i == 2) {
                m87704c0(c22640a.mo117210a());
                this.f83088B.setOnClickListener(onClickListener);
                return;
            } else {
                m87714w();
                return;
            }
        }
        m87714w();
    }

    /* renamed from: q */
    public void mo87709q(C31980jc c31980jc) {
        try {
            this.f83110a0 = c31980jc;
            if (c31980jc == null) {
                return;
            }
            if (!TextUtils.isEmpty(c31980jc.f147025r)) {
                if (C23302b.f113247a.m120523d(c31980jc.f147025r) && !CoreUtility.f89233i.equals(c31980jc.f147023p)) {
                    int m12307a = C2343e.m12307a(c31980jc.f147023p, false);
                    this.f83131s.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q)), m12307a));
                } else {
                    C24003n m120152s = C23278z2.m120152s(getContext());
                    this.f83131s.setImageDrawable(m120152s.f116261b);
                    ((C23528a) this.f83109W.m123612r(this.f83131s)).m123618x(c31980jc.f147025r, m120152s);
                }
            } else {
                RecyclingImageView recyclingImageView = this.f83131s;
                recyclingImageView.setImageDrawable(C23212s8.m119609q(recyclingImageView.getContext(), AbstractC16781w.default_avatar));
            }
            if (!TextUtils.isEmpty(c31980jc.f147024q) && !TextUtils.isEmpty(c31980jc.f147023p)) {
                this.f83135u.setText(AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q));
            }
            setupStoryItemCount(c31980jc);
            mo87715x();
            setOnTouchListener(this.f83123n0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    public void mo87710r(C32123ta c32123ta) {
        int viewMode = getViewMode();
        this.f83108V = c32123ta;
        if (c32123ta != null) {
            if (c32123ta.f148160z == 1) {
                RecyclingImageView recyclingImageView = this.f83089C;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                recyclingImageView.setScaleType(scaleType);
                this.f83102P.setScaleType(scaleType);
                if (this.f83090D.getLoadingView() != null) {
                    this.f83090D.getLoadingView().setScaleType(scaleType);
                }
            } else {
                RecyclingImageView recyclingImageView2 = this.f83089C;
                ImageView.ScaleType scaleType2 = ImageView.ScaleType.FIT_CENTER;
                recyclingImageView2.setScaleType(scaleType2);
                this.f83102P.setScaleType(scaleType2);
                if (this.f83090D.getLoadingView() != null) {
                    this.f83090D.getLoadingView().setScaleType(scaleType2);
                }
            }
            ImageView imageView = this.f83087A;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.c
                    public /* synthetic */ ViewOnClickListenerC16563c() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseStoryItemView.this.m87665D(view);
                    }
                });
            }
            if (c32123ta.m155070J()) {
                this.f83102P.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f83091E.setTypeRender(1);
                this.f83091E.m43639k(c32123ta.f148117T, c32123ta.f148115R, C32123ta.m155029B());
                this.f83091E.setTag(1090453510, String.valueOf(c32123ta.f148116S));
                C31845ac.m152996J().m153057o0(c32123ta.f148116S, new C31845ac.e() { // from class: com.zing.zalo.uicontrol.d

                    /* renamed from: a */
                    public final /* synthetic */ WeakReference f83677a;

                    /* renamed from: b */
                    public final /* synthetic */ C32123ta f83678b;

                    public /* synthetic */ C16570d(WeakReference weakReference, C32123ta c32123ta2) {
                        r1 = weakReference;
                        r2 = c32123ta2;
                    }

                    @Override // p716zh.C31845ac.e
                    /* renamed from: a */
                    public final void mo39491a(int i11, String str, C31890dc c31890dc) {
                        BaseStoryItemView.m87666E(r1, r2, i11, str, c31890dc);
                    }
                });
            } else if (c32123ta2.f148140i == 1) {
                String str = c32123ta2.f148146l;
                String str2 = c32123ta2.f148138h;
                C24003n m115156p = AbstractC22055v0.m115156p();
                RecyclingImageView recyclingImageView3 = this.f83089C;
                if (recyclingImageView3 != null) {
                    recyclingImageView3.setImageInfo(null);
                    this.f83089C.setBackground(null);
                }
                C24003n m120101V0 = C23278z2.m120101V0();
                if (!TextUtils.isEmpty(str)) {
                    this.f83089C.setTag(f83086x0, str2);
                    ((C23528a) this.f83109W.m123612r(this.f83111b0)).m123579C(str, m115156p, new C16453c(str2, str, m120101V0, c32123ta2));
                }
            } else {
                if (!TextUtils.isEmpty(c32123ta2.f148146l)) {
                    if (c32123ta2.f148140i == 2) {
                        ((C23528a) this.f83109W.m123612r(this.f83089C)).m123618x(c32123ta2.f148146l, C23278z2.m120105X0());
                    } else {
                        ((C23528a) this.f83109W.m123612r(this.f83089C)).m123618x(c32123ta2.f148146l, C23278z2.m120099U0());
                    }
                }
                if (c32123ta2.f148126b == 2 && this.f83090D.getLoadingView() != null) {
                    this.f83090D.getLoadingView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
            }
            if (this.f83137v != null) {
                if (AbstractC25495a.m132086k(c32123ta2.f148136g)) {
                    this.f83137v.setVisibility(8);
                } else {
                    this.f83137v.setVisibility(0);
                    if (viewMode == 5) {
                        this.f83135u.setText(AbstractC23160o0.m119263k(c32123ta2.f148150p));
                        this.f83137v.setText(AbstractC23160o0.m119266l(c32123ta2.f148150p));
                    } else {
                        this.f83137v.setText(AbstractC23160o0.m119269m(getContext(), (int) (c32123ta2.f148150p / 1000)));
                    }
                }
            }
            this.f83141x.setVisibility(0);
            setupStoryItemCount(this.f83110a0);
            return;
        }
        TextView textView = this.f83137v;
        if (textView != null) {
            textView.setText("");
        }
        this.f83141x.setVisibility(8);
        setShowLoading(true);
        mo87702a0(1, c32123ta2, null);
    }

    /* renamed from: s */
    public View.OnClickListener m87711s(int i11) {
        return new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.h

            /* renamed from: q */
            public final /* synthetic */ int f83803q;

            public /* synthetic */ ViewOnClickListenerC16597h(int i112) {
                r2 = i112;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseStoryItemView.this.m87667F(r2, view);
            }
        };
    }

    public void setBottomBarVisibility(int i11) {
        AbstractC23136l9.m118744r1(this.f83103Q, i11);
    }

    public void setImageBgGradient(C18311d c18311d) {
        try {
            if (this.f83089C != null) {
                Drawable drawable = c18311d.f92605b;
                C30256b m97234b = c18311d.m97234b(2);
                C30256b m97234b2 = c18311d.m97234b(4);
                if (m97234b != null && m97234b2 != null) {
                    int m149239f = m97234b.m149239f(0);
                    int m149239f2 = m97234b2.m149239f(0);
                    if (m149239f == 0 && m149239f2 == 0) {
                        drawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -16777216});
                    }
                }
                if (this.f83112c0 != null) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.f83112c0, drawable});
                    transitionDrawable.startTransition(100);
                    drawable = transitionDrawable;
                }
                this.f83112c0 = c18311d.f92605b;
                AbstractC1579n0.m7807D0(this.f83089C, drawable);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public void setInChatHead(boolean z11) {
        if (z11) {
            setMarginStatusBar(this.f83129r);
            setMarginStatusBar(this.f83141x);
        }
    }

    public void setOnStoryItemViewInteractListener(InterfaceC16456f interfaceC16456f) {
        this.f83140w0 = interfaceC16456f;
    }

    public void setShowLoading(boolean z11) {
        if (z11) {
            this.f83116g0.removeMessages(3);
            if (!this.f83116g0.hasMessages(2)) {
                this.f83116g0.sendEmptyMessageDelayed(2, 500L);
                return;
            }
            return;
        }
        InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null && interfaceC16456f.mo84785t()) {
            return;
        }
        this.f83116g0.removeMessages(2);
        if (!this.f83116g0.hasMessages(3)) {
            this.f83116g0.sendEmptyMessage(3);
        }
    }

    public void setupStoryItemCount(C31980jc c31980jc) {
        int size = c31980jc.f147031x.size();
        int i11 = c31980jc.f147017B;
        if (i11 >= 0 && i11 < size) {
            this.f83141x.setTotalCount(size);
            this.f83141x.m87782b(c31980jc.f147017B);
        } else {
            this.f83141x.setTotalCount(0);
        }
    }

    /* renamed from: u */
    public void m87712u() {
        StorySongInfoView storySongInfoView = this.f83092F;
        if (storySongInfoView != null) {
            storySongInfoView.setVisibility(8);
        }
        StoryBoxLyric storyBoxLyric = this.f83093G;
        if (storyBoxLyric != null) {
            storyBoxLyric.setVisibility(8);
        }
    }

    /* renamed from: v */
    public void m87713v(boolean z11) {
        mo87691P(z11);
    }

    /* renamed from: w */
    public void m87714w() {
        AspectRatioImageView aspectRatioImageView = this.f83088B;
        if (aspectRatioImageView != null) {
            aspectRatioImageView.setVisibility(8);
        }
    }

    /* renamed from: x */
    protected void mo87715x() {
    }

    /* renamed from: y */
    public void m87716y() {
        if (this.f83096J == null) {
            View inflate = ((ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_error_layout)).inflate();
            this.f83096J = inflate;
            this.f83097K = (TextView) inflate.findViewById(AbstractC6918a0.error_text);
            this.f83098L = (ButtonWithProgress) this.f83096J.findViewById(AbstractC6918a0.btn_retry);
            this.f83099M = (Button) this.f83096J.findViewById(AbstractC6918a0.btn_delete_failed_story);
            this.f83100N = this.f83096J.findViewById(AbstractC6918a0.btn_error_story_settings);
        }
    }

    /* renamed from: z */
    public boolean m87717z() {
        FrameLayout frameLayout = this.f83105S;
        if (frameLayout != null && frameLayout.getVisibility() == 0 && !this.f83126p0) {
            return true;
        }
        return false;
    }
}
