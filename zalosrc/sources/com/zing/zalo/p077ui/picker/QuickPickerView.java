package com.zing.zalo.p077ui.picker;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ak0.InterfaceC0887b;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.C2040d;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import au.AbstractC2374t0;
import b40.C2522b;
import b40.C2526d;
import c30.C3251l;
import cg.AbstractC3460h;
import cl.C3570a;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.AnimationLayout;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.picker.C12669c;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView;
import com.zing.zalo.p077ui.picker.landingpage.LandingPageView;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.ChangeableHeightRelativeLayout;
import com.zing.zalo.p077ui.widget.ChangeableHeightView;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuControl;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gd0.C19406k;
import gd0.InterfaceC19397b;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import i40.AbstractC20279i;
import i40.C20275e;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m90.EnumC22962a;
import m90.EnumC22963b;
import me0.AbstractC23006a0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23171p0;
import me0.AbstractC23202r9;
import me0.AbstractC23222t7;
import me0.AbstractC23237v1;
import me0.AbstractC23280z4;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p100df.EnumC17910b;
import p105dn.EnumC18030a;
import p133ek.C18460c;
import p142ey.C18644n;
import p193h0.AbstractC19694b;
import p207he.C20024r;
import p239ih.C20556f;
import p241ij.C20564a;
import p262jb.AbstractC21196a;
import p266jg.C21243a;
import p270jk.EnumC21281b;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p369ns.AbstractC23933a;
import p379o3.C23999j;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p559uv.C27373c;
import p716zh.C31890dc;
import p716zh.C31986k3;
import p716zh.C32050o7;
import p716zh.C32084r;
import th.AbstractC26689j;
import vg.C28020b3;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class QuickPickerView extends ZaloView implements TouchInterceptionFrameLayout.InterfaceC13549b {

    /* renamed from: A0 */
    private float f65896A0;

    /* renamed from: A1 */
    private InterfaceC12662x f65897A1;

    /* renamed from: B0 */
    private float f65898B0;

    /* renamed from: B1 */
    private boolean f65899B1;

    /* renamed from: C0 */
    private ChangeableHeightView f65900C0;

    /* renamed from: C1 */
    private boolean f65901C1;

    /* renamed from: D0 */
    private float f65902D0;

    /* renamed from: D1 */
    private boolean f65903D1;

    /* renamed from: E0 */
    private float f65904E0;

    /* renamed from: E1 */
    private C12667b f65905E1;

    /* renamed from: F0 */
    private int f65906F0;

    /* renamed from: F1 */
    private int[] f65907F1;

    /* renamed from: G0 */
    public boolean f65908G0;

    /* renamed from: G1 */
    public AbstractC20279i.a f65909G1;

    /* renamed from: H0 */
    private int f65910H0;

    /* renamed from: H1 */
    private int f65911H1;

    /* renamed from: I0 */
    private int f65912I0;

    /* renamed from: I1 */
    private int f65913I1;

    /* renamed from: J0 */
    private float f65914J0;

    /* renamed from: J1 */
    private final Handler f65915J1;

    /* renamed from: K0 */
    private boolean f65916K0;

    /* renamed from: K1 */
    private String f65917K1;

    /* renamed from: L0 */
    private volatile boolean f65918L0;

    /* renamed from: L1 */
    private C13306b f65919L1;

    /* renamed from: M0 */
    private int f65920M0;

    /* renamed from: M1 */
    private boolean f65921M1;

    /* renamed from: N0 */
    private boolean f65922N0;

    /* renamed from: N1 */
    public String f65923N1;

    /* renamed from: O0 */
    private boolean f65924O0;

    /* renamed from: O1 */
    private boolean f65925O1;

    /* renamed from: P0 */
    EnumC22962a f65926P0;

    /* renamed from: P1 */
    private SensitiveData f65927P1;

    /* renamed from: Q0 */
    EnumC22963b f65928Q0;

    /* renamed from: Q1 */
    private final InterfaceC12654p f65929Q1;

    /* renamed from: R0 */
    private String f65930R0;

    /* renamed from: R1 */
    private int f65931R1;

    /* renamed from: S0 */
    private boolean f65932S0;

    /* renamed from: S1 */
    private InterfaceC12664z f65933S1;

    /* renamed from: T0 */
    private boolean f65934T0;

    /* renamed from: T1 */
    private InterfaceC12663y f65935T1;

    /* renamed from: U0 */
    private Conversation f65936U0;

    /* renamed from: U1 */
    private InterfaceC12661w f65937U1;

    /* renamed from: V0 */
    private boolean f65938V0;

    /* renamed from: V1 */
    private final List f65939V1;

    /* renamed from: W0 */
    private C20556f f65940W0;

    /* renamed from: W1 */
    private C12669c f65941W1;

    /* renamed from: X0 */
    int f65942X0;

    /* renamed from: X1 */
    private RecyclerView f65943X1;

    /* renamed from: Y0 */
    private boolean f65944Y0;

    /* renamed from: Y1 */
    private ZinstantOAFullMenuControl f65945Y1;

    /* renamed from: Z0 */
    private boolean f65946Z0;

    /* renamed from: Z1 */
    private InterfaceC0887b f65947Z1;

    /* renamed from: a1 */
    private boolean f65948a1;

    /* renamed from: a2 */
    private final C19406k f65949a2;

    /* renamed from: b1 */
    private boolean f65950b1;

    /* renamed from: c1 */
    MediaPickerView f65951c1;

    /* renamed from: d1 */
    StickerPanelView f65952d1;

    /* renamed from: e1 */
    private boolean f65953e1;

    /* renamed from: f1 */
    private int f65954f1;

    /* renamed from: g1 */
    private int f65955g1;

    /* renamed from: h1 */
    private int f65956h1;

    /* renamed from: i1 */
    public boolean f65957i1;

    /* renamed from: j1 */
    private boolean f65958j1;

    /* renamed from: k1 */
    private boolean f65959k1;

    /* renamed from: l1 */
    private LocationPickerView f65960l1;

    /* renamed from: m1 */
    private BackgroundPickerView f65961m1;

    /* renamed from: n1 */
    private boolean f65962n1;

    /* renamed from: o1 */
    private long f65963o1;

    /* renamed from: p1 */
    private AnimationLayout f65964p1;

    /* renamed from: q1 */
    private C20275e f65965q1;

    /* renamed from: r1 */
    private C2040d f65966r1;

    /* renamed from: s1 */
    private C2040d f65967s1;

    /* renamed from: t1 */
    private LandingPageView f65968t1;

    /* renamed from: u1 */
    private int f65969u1;

    /* renamed from: v1 */
    private InterfaceC12655q f65970v1;

    /* renamed from: w0 */
    private C23528a f65971w0;

    /* renamed from: w1 */
    private InterfaceC12658t f65972w1;

    /* renamed from: x0 */
    private ChangeableHeightRelativeLayout f65973x0;

    /* renamed from: x1 */
    private InterfaceC12659u f65974x1;

    /* renamed from: y0 */
    private TouchInterceptionFrameLayout f65975y0;

    /* renamed from: y1 */
    private InterfaceC12657s f65976y1;

    /* renamed from: z0 */
    View f65977z0;

    /* renamed from: z1 */
    private InterfaceC12656r f65978z1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ClearSelectedConfirmDialog extends DialogView {

        /* renamed from: H0 */
        QuickPickerView f65979H0;

        ClearSelectedConfirmDialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: XK */
        public /* synthetic */ void m71298XK(InterfaceC17463d interfaceC17463d, int i11) {
            try {
                QuickPickerView quickPickerView = this.f65979H0;
                if (quickPickerView != null) {
                    quickPickerView.m71181qM();
                }
                if (interfaceC17463d != null) {
                    interfaceC17463d.dismiss();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
        /* renamed from: CJ */
        public void mo37111CJ(Bundle bundle) {
            super.mo37111CJ(bundle);
            if (m92650VI() instanceof QuickPickerView) {
                this.f65979H0 = (QuickPickerView) m92650VI();
            }
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            try {
                if (this.f65979H0 == null) {
                    dismiss();
                    return super.mo13885LK(bundle);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43159h(1).m43162k(m92652XI(AbstractC8020f0.str_clear_selected_list_message_v2)).m43170s(m92652XI(AbstractC8020f0.str_leave), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.picker.a0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    QuickPickerView.ClearSelectedConfirmDialog.this.m71298XK(interfaceC17463d, i11);
                }
            }).m43165n(m92652XI(AbstractC8020f0.str_stay), new InterfaceC17463d.b());
            C8009j m43152a = aVar.m43152a();
            m43152a.m92873y(true);
            return m43152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$a */
    /* loaded from: classes6.dex */
    public class C12639a extends AnimatorListenerAdapter {
        C12639a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = false;
            quickPickerView.f65916K0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                QuickPickerView quickPickerView = QuickPickerView.this;
                quickPickerView.f65908G0 = false;
                quickPickerView.f65916K0 = false;
                if (QuickPickerView.this.f65935T1 != null) {
                    QuickPickerView quickPickerView2 = QuickPickerView.this;
                    if (quickPickerView2.f65951c1 != null) {
                        quickPickerView2.f65935T1.mo45289n();
                        if (!QuickPickerView.this.f65962n1 && QuickPickerView.this.m71246WM()) {
                            QuickPickerView.this.f65962n1 = true;
                            QuickPickerView.this.invalidateOptionsMenu();
                            QuickPickerView.this.mo37493TJ();
                        }
                        QuickPickerView.this.f65951c1.m72222ZO(true);
                        QuickPickerView.this.f65951c1.m72232hP();
                        if (QuickPickerView.this.f65905E1 != null) {
                            QuickPickerView.this.f65905E1.m71355j();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickPickerView.this.f65908G0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$b */
    /* loaded from: classes6.dex */
    public class C12640b extends AnimatorListenerAdapter {
        C12640b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = false;
            quickPickerView.f65916K0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = false;
            quickPickerView.f65916K0 = false;
            QuickPickerView.this.m71166kO();
            QuickPickerView.this.f65962n1 = false;
            QuickPickerView.this.mo37493TJ();
            if (QuickPickerView.this.f65935T1 != null) {
                QuickPickerView.this.f65935T1.mo45288m();
            }
            MediaPickerView mediaPickerView = QuickPickerView.this.f65951c1;
            if (mediaPickerView != null) {
                mediaPickerView.m72222ZO(false);
                QuickPickerView.this.f65951c1.m72232hP();
            }
            if (QuickPickerView.this.f65905E1 != null) {
                QuickPickerView.this.f65905E1.m71355j();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = true;
            MediaPickerView mediaPickerView = quickPickerView.f65951c1;
            if (mediaPickerView != null) {
                mediaPickerView.m72255zN();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$c */
    /* loaded from: classes6.dex */
    public class C12641c extends AnimatorListenerAdapter {
        C12641c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = false;
            quickPickerView.f65916K0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                QuickPickerView quickPickerView = QuickPickerView.this;
                quickPickerView.f65942X0 = -1;
                quickPickerView.f65908G0 = false;
                quickPickerView.f65916K0 = false;
                QuickPickerView.this.f65962n1 = false;
                QuickPickerView.this.m71292xM();
                if (QuickPickerView.this.f65935T1 != null) {
                    QuickPickerView.this.f65935T1.mo45280b();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickPickerView.this.f65908G0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$d */
    /* loaded from: classes6.dex */
    public class C12642d extends AnimatorListenerAdapter {
        C12642d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = false;
            quickPickerView.f65916K0 = false;
            try {
                QuickPickerView.this.m71083CO();
                if (QuickPickerView.this.f65975y0.getVisibility() == 0 && !QuickPickerView.this.f65962n1) {
                    QuickPickerView.this.f65975y0.setPosition(QuickPickerView.this.f65904E0);
                }
                if (QuickPickerView.this.f65973x0 != null) {
                    QuickPickerView.this.f65973x0.setHeight(QuickPickerView.this.f65906F0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = false;
            quickPickerView.f65916K0 = false;
            try {
                QuickPickerView.this.m71083CO();
                if (QuickPickerView.this.f65975y0.getVisibility() == 0 && !QuickPickerView.this.f65962n1) {
                    QuickPickerView.this.f65975y0.setPosition(QuickPickerView.this.f65904E0);
                }
                if (QuickPickerView.this.f65973x0 != null) {
                    QuickPickerView.this.f65973x0.setHeight(QuickPickerView.this.f65906F0);
                }
                if (QuickPickerView.this.f65905E1 != null) {
                    QuickPickerView.this.f65905E1.m71355j();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65908G0 = true;
            if (quickPickerView.f65954f1 >= 0 && QuickPickerView.this.f65943X1 != null) {
                QuickPickerView.this.f65943X1.m9837K1(QuickPickerView.this.f65954f1);
                QuickPickerView.this.f65954f1 = -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$e */
    /* loaded from: classes6.dex */
    public class C12643e extends GridLayoutManager.AbstractC1865b {
        C12643e() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            if (QuickPickerView.this.f65941W1 != null && QuickPickerView.this.f65941W1.m71358N(i11)) {
                return 4;
            }
            return 1;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$f */
    /* loaded from: classes6.dex */
    class C12644f extends C19406k {
        C12644f() {
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: f */
        public void mo60355f(boolean z11) {
            if (z11) {
                QuickPickerView.this.f65942X0 = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10;
            }
            super.mo60355f(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$g */
    /* loaded from: classes6.dex */
    class C12645g implements InterfaceC12655q {

        /* renamed from: a */
        final /* synthetic */ InterfaceC12655q f65986a;

        C12645g(InterfaceC12655q interfaceC12655q) {
            this.f65986a = interfaceC12655q;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12655q
        /* renamed from: a */
        public void mo71299a(List list) {
            InterfaceC12655q interfaceC12655q = this.f65986a;
            if (interfaceC12655q != null) {
                interfaceC12655q.mo71299a(list);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12655q
        /* renamed from: b */
        public void mo71300b(boolean z11) {
            QuickPickerView.this.m71091FO(z11);
            InterfaceC12655q interfaceC12655q = this.f65986a;
            if (interfaceC12655q != null) {
                interfaceC12655q.mo71300b(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$h */
    /* loaded from: classes6.dex */
    class C12646h implements AnimationLayout.OnEventListener {
        C12646h() {
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onBeforeExpanding(int i11) {
            if (AnimationLayout.isTypeShowFullscreen(i11) && !QuickPickerView.this.f88762c0.m92676n2().mo35576n3()) {
                AbstractC23136l9.m118686X0(QuickPickerView.this.f88762c0.m92676n2().getWindow(), true);
            }
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onExpanded(int i11) {
            C24559a.m127933c("QuickPickerView", "Animation Layout onExpanded");
            C24559a.m127933c("QuickPickerView", "showLandingPageFragment onExpanded");
            QuickPickerView.this.m71169lO(false);
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onShrunk() {
            QuickPickerView.this.f65903D1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$i */
    /* loaded from: classes6.dex */
    public class C12647i implements InterfaceC12654p {
        C12647i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m71302e(int[] iArr) {
            if (!QuickPickerView.this.f65899B1 && QuickPickerView.this.m71240UM() && QuickPickerView.this.f65905E1 != null) {
                if (QuickPickerView.this.f65905E1.m71351e() != null && QuickPickerView.this.f65905E1.m71351e().getParent() == null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iArr[0], iArr[1]);
                    QuickPickerView quickPickerView = QuickPickerView.this;
                    ((RelativeLayout) quickPickerView.f65977z0).addView(quickPickerView.f65905E1.m71351e(), -1, layoutParams);
                }
                QuickPickerView.this.f65905E1.m71352f();
                QuickPickerView.this.f65905E1.m71355j();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12654p
        /* renamed from: a */
        public void mo71303a() {
            if (QuickPickerView.this.m71237TM() && QuickPickerView.this.f65905E1 != null) {
                if (QuickPickerView.this.f65905E1.m71351e() != null && QuickPickerView.this.f65905E1.m71351e().getVisibility() == 0 && !QuickPickerView.this.f65905E1.f66008h) {
                    int[] iArr = new int[2];
                    QuickPickerView.this.f65905E1.m71351e().getLocationInWindow(iArr);
                    for (int i11 = iArr[1]; i11 > 0; i11 -= 2) {
                        QuickPickerView.this.f65907F1[0] = iArr[0];
                        QuickPickerView.this.f65907F1[1] = i11;
                        QuickPickerView.this.f65905E1.m71354i(QuickPickerView.this.f65907F1);
                    }
                    QuickPickerView.this.f65905E1.m71351e().setVisibility(4);
                }
                QuickPickerView.this.f65905E1.f66008h = true;
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12654p
        /* renamed from: b */
        public void mo71304b(final int[] iArr) {
            if (QuickPickerView.this.m71237TM() && iArr[0] > 0 && iArr[1] > 0) {
                QuickPickerView quickPickerView = QuickPickerView.this;
                if (quickPickerView.f65977z0 != null && quickPickerView.f65905E1 != null) {
                    QuickPickerView.this.f65977z0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.picker.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            QuickPickerView.C12647i.this.m71302e(iArr);
                        }
                    }, 200L);
                }
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12654p
        /* renamed from: c */
        public void mo71305c(int[] iArr) {
            if (!QuickPickerView.this.m71237TM()) {
                return;
            }
            QuickPickerView quickPickerView = QuickPickerView.this;
            if (quickPickerView.f65908G0 || quickPickerView.f65907F1 == null || iArr == null || QuickPickerView.this.f65907F1[1] <= iArr[1]) {
                QuickPickerView.this.f65907F1 = iArr;
                if (QuickPickerView.this.f65905E1 != null) {
                    QuickPickerView.this.f65905E1.m71354i(iArr);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$j */
    /* loaded from: classes6.dex */
    public class C12648j implements BackgroundPickerView.InterfaceC12675c {
        C12648j() {
        }

        @Override // com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView.InterfaceC12675c
        /* renamed from: i */
        public void mo39149i(C31890dc c31890dc) {
            if (QuickPickerView.this.f65935T1 != null) {
                QuickPickerView.this.f65935T1.mo45284i(c31890dc);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView.InterfaceC12675c
        /* renamed from: j */
        public void mo39150j() {
            if (QuickPickerView.this.f65935T1 != null) {
                QuickPickerView.this.f65935T1.mo45285j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$k */
    /* loaded from: classes6.dex */
    public class C12649k implements LocationPickerView.InterfaceC12771b {
        C12649k() {
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: a */
        public void mo60384a(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            if (QuickPickerView.this.f65935T1 != null) {
                QuickPickerView.this.f65935T1.mo45279K(c18460c, str, str2, i11, footerLogData);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: h */
        public void mo60385h() {
            if (QuickPickerView.this.f65935T1 != null) {
                QuickPickerView.this.f65935T1.mo45283h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$l */
    /* loaded from: classes6.dex */
    public class C12650l implements MediaPickerView.InterfaceC12784b {

        /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$l$a */
        /* loaded from: classes6.dex */
        class a extends SimpleAnimationTarget {

            /* renamed from: p */
            final /* synthetic */ View f65993p;

            a(View view) {
                this.f65993p = view;
            }

            @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
            public Rect getAnimTargetLocationOnScreen() {
                int[] iArr = new int[2];
                this.f65993p.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                return new Rect(i11, i12, this.f65993p.getWidth() + i11, this.f65993p.getHeight() + i12);
            }
        }

        C12650l() {
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: a */
        public void mo71306a(String str) {
            QuickPickerView quickPickerView = QuickPickerView.this;
            if (quickPickerView.f88760a0 != null && quickPickerView.f65962n1) {
                QuickPickerView.this.f88760a0.setTitle(str + " ");
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: b */
        public void mo71307b(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e, String str, String str2) {
            if (QuickPickerView.this.f65897A1 == null || !QuickPickerView.this.f65897A1.mo71344n()) {
                QuickPickerView.this.m71194uN(4);
                if (QuickPickerView.this.f65976y1 != null) {
                    QuickPickerView.this.f65976y1.mo45274a();
                }
                QuickPickerView.this.m71088EN((VideoItem) mediaItem, animationTarget, c20275e, str, str2);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: c */
        public void mo71308c(List list) {
            if (QuickPickerView.this.f65976y1 != null) {
                QuickPickerView.this.f65976y1.mo45278e(list, false);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: d */
        public void mo71309d(View view) {
            if (!AbstractC22470k.m116151c()) {
                return;
            }
            if (QuickPickerView.this.f65897A1 != null && QuickPickerView.this.f65897A1.mo71344n()) {
                return;
            }
            if (QuickPickerView.this.f65976y1 != null) {
                QuickPickerView.this.f65976y1.mo45277d();
            }
            AbstractC23237v1.m119715c("camera-open");
            QuickPickerView.this.f65909G1 = AbstractC20279i.m105895c(new a(view));
            QuickPickerView quickPickerView = QuickPickerView.this;
            quickPickerView.f65909G1.f100224c += quickPickerView.f65912I0 + AbstractC17484n.Companion.m92931b();
            QuickPickerView.this.f65905E1.m71353h();
            QuickPickerView.this.m71194uN(3);
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12784b
        /* renamed from: e */
        public void mo71310e(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e) {
            MediaPickerView mediaPickerView;
            try {
                if (QuickPickerView.this.f65897A1 != null && QuickPickerView.this.f65897A1.mo71344n()) {
                    return;
                }
                if (QuickPickerView.this.f65976y1 != null) {
                    QuickPickerView.this.f65976y1.mo45276c(i11);
                }
                if (!AbstractC23280z4.m120328g0(QuickPickerView.this.f65955g1) || ((mediaPickerView = QuickPickerView.this.f65951c1) != null && mediaPickerView.m72197ON(mediaItem))) {
                    QuickPickerView.this.m71194uN(1);
                    QuickPickerView.this.m71204zO("gallery_openviewfull");
                    QuickPickerView.this.m71082CN(mediaItem, animationTarget, c20275e, "", "");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$m */
    /* loaded from: classes6.dex */
    public class C12651m implements MediaPickerView.InterfaceC12793e {
        C12651m() {
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12793e
        /* renamed from: a */
        public void mo71311a() {
            ActionBar actionBar = QuickPickerView.this.f88760a0;
            if (actionBar != null && actionBar.getTitleTextView() != null) {
                QuickPickerView.this.m71077BM();
                QuickPickerView.this.m71114NL();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12793e
        /* renamed from: b */
        public void mo71312b() {
            QuickPickerView.this.f65963o1 = System.currentTimeMillis();
            ActionBar actionBar = QuickPickerView.this.f88760a0;
            if (actionBar != null && actionBar.getTitleTextView() != null) {
                QuickPickerView.this.m71081CM();
                QuickPickerView.this.m71114NL();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$n */
    /* loaded from: classes6.dex */
    public class C12652n implements LandingPageView.InterfaceC12717p {
        C12652n() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: a */
        public void mo71313a(C3979l c3979l) {
            if (QuickPickerView.this.f65965q1 != null) {
                QuickPickerView.this.f65965q1.m105864J(c3979l);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: b */
        public void mo71314b(SparseIntArray sparseIntArray) {
            if (QuickPickerView.this.f65965q1 != null) {
                QuickPickerView.this.f65965q1.m105856B(sparseIntArray);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: c */
        public void mo71315c(int i11) {
            if (QuickPickerView.this.f65965q1 != null) {
                QuickPickerView.this.f65965q1.m105866L(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: d */
        public void mo71316d(int i11) {
            MediaPickerView mediaPickerView = QuickPickerView.this.f65951c1;
            if (mediaPickerView != null) {
                if (mediaPickerView.m72251wN()) {
                    i11++;
                }
                QuickPickerView.this.f65951c1.m72214VN(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: e */
        public void mo71317e() {
            if (QuickPickerView.this.f65965q1 != null && !QuickPickerView.this.f65965q1.m105878o()) {
                QuickPickerView.this.f65965q1.m105877m(QuickPickerView.this.f65964p1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$o */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnPreDrawListenerC12653o implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC12653o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                View view = QuickPickerView.this.f65977z0;
                if (view != null) {
                    view.requestLayout();
                    QuickPickerView.this.f65977z0.getViewTreeObserver().removeOnPreDrawListener(this);
                    return false;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$p */
    /* loaded from: classes6.dex */
    public interface InterfaceC12654p {
        /* renamed from: a */
        void mo71303a();

        /* renamed from: b */
        void mo71304b(int[] iArr);

        /* renamed from: c */
        void mo71305c(int[] iArr);
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$q */
    /* loaded from: classes6.dex */
    public interface InterfaceC12655q {
        /* renamed from: a */
        void mo71299a(List list);

        /* renamed from: b */
        void mo71300b(boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$r */
    /* loaded from: classes6.dex */
    public interface InterfaceC12656r {
        /* renamed from: o */
        void mo71318o();
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$s */
    /* loaded from: classes6.dex */
    public interface InterfaceC12657s {
        /* renamed from: Z */
        void mo45273Z(C27373c c27373c, String str);

        /* renamed from: a */
        void mo45274a();

        /* renamed from: b */
        boolean mo45275b();

        /* renamed from: c */
        void mo45276c(int i11);

        /* renamed from: d */
        void mo45277d();

        /* renamed from: e */
        void mo45278e(List list, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$t */
    /* loaded from: classes6.dex */
    public interface InterfaceC12658t {
        /* renamed from: f */
        void mo71319f(int i11);

        /* renamed from: q */
        void mo71320q();
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$u */
    /* loaded from: classes6.dex */
    public interface InterfaceC12659u {
        /* renamed from: O */
        void mo45270O(MediaItem mediaItem);

        /* renamed from: m */
        void mo45271m(List list);

        /* renamed from: n */
        void mo45272n(boolean z11, boolean z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$v */
    /* loaded from: classes6.dex */
    public class C12660v extends AbstractC31727b {
        @Override // z90.AbstractC31727b
        /* renamed from: a */
        public boolean mo71321a() {
            if (QuickPickerView.this.f65933S1 != null && QuickPickerView.this.f65933S1.mo64343a()) {
                return true;
            }
            return false;
        }

        @Override // z90.AbstractC31727b
        /* renamed from: b */
        public void mo71322b() {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64350h();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: c */
        public void mo46563c(String str) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64351i(str);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64345c(str);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64348f(i11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: f */
        public void mo71323f(String str, int i11, int i12) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64344b(str, i11, i12);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: g */
        public void mo71324g() {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64352j();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: h */
        public void mo71325h(C3251l c3251l) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71338c(c3251l);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: i */
        public void mo71326i(C3251l c3251l, int i11) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71339d(c3251l, i11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: k */
        public void mo71327k(C3251l c3251l, C2522b c2522b) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71343l(c3251l, c2522b);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: l */
        public void mo71328l(C3251l c3251l, int i11) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71337b(c3251l, i11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: m */
        public void mo71329m() {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71336a();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: n */
        public void mo71330n(String str) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71345p(str);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64349g(c25630b, i11, i12, i13);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: p */
        public void mo46564p(C25630b c25630b, int i11, int i12, int i13) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64346d(c25630b, i11, i12, i13);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: r */
        public void mo71331r(C3251l c3251l, int i11, int i12, int i13, String str) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71340h(c3251l, i11, i12, i13, str);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: s */
        public void mo71332s(C3251l c3251l, int i11, int i12, int i13, String str) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71341j(c3251l, i11, i12, i13, str);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: t */
        public void mo71333t(C25630b c25630b, int i11, int i12, int i13, String str) {
            if (QuickPickerView.this.f65933S1 != null) {
                QuickPickerView.this.f65933S1.mo64347e(c25630b, i11, i12, i13, str);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: u */
        public void mo71334u(String str) {
            if (QuickPickerView.this.f65897A1 != null) {
                QuickPickerView.this.f65897A1.mo71342k(str);
            }
        }

        private C12660v() {
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$w */
    /* loaded from: classes6.dex */
    public interface InterfaceC12661w {
        /* renamed from: i */
        void mo71335i(int i11, C20564a c20564a);
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$x */
    /* loaded from: classes6.dex */
    public interface InterfaceC12662x {
        /* renamed from: a */
        void mo71336a();

        /* renamed from: b */
        void mo71337b(C3251l c3251l, int i11);

        /* renamed from: c */
        void mo71338c(C3251l c3251l);

        /* renamed from: d */
        void mo71339d(C3251l c3251l, int i11);

        /* renamed from: h */
        void mo71340h(C3251l c3251l, int i11, int i12, int i13, String str);

        /* renamed from: j */
        void mo71341j(C3251l c3251l, int i11, int i12, int i13, String str);

        /* renamed from: k */
        void mo71342k(String str);

        /* renamed from: l */
        void mo71343l(C3251l c3251l, C2522b c2522b);

        /* renamed from: n */
        boolean mo71344n();

        /* renamed from: p */
        void mo71345p(String str);
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$y */
    /* loaded from: classes6.dex */
    public interface InterfaceC12663y {
        /* renamed from: K */
        void mo45279K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData);

        /* renamed from: b */
        void mo45280b();

        /* renamed from: e */
        void mo45281e();

        /* renamed from: g */
        void mo45282g();

        /* renamed from: h */
        void mo45283h();

        /* renamed from: i */
        void mo45284i(C31890dc c31890dc);

        /* renamed from: j */
        void mo45285j();

        /* renamed from: k */
        void mo45286k(Bundle bundle);

        /* renamed from: l */
        void mo45287l();

        /* renamed from: m */
        void mo45288m();

        /* renamed from: n */
        void mo45289n();

        /* renamed from: o */
        void mo45290o();
    }

    /* renamed from: com.zing.zalo.ui.picker.QuickPickerView$z */
    /* loaded from: classes6.dex */
    public interface InterfaceC12664z {
        /* renamed from: a */
        boolean mo64343a();

        /* renamed from: b */
        void mo64344b(String str, int i11, int i12);

        /* renamed from: c */
        void mo64345c(String str);

        /* renamed from: d */
        void mo64346d(C25630b c25630b, int i11, int i12, int i13);

        /* renamed from: e */
        void mo64347e(C25630b c25630b, int i11, int i12, int i13, String str);

        /* renamed from: f */
        void mo64348f(int i11);

        /* renamed from: g */
        void mo64349g(C25630b c25630b, int i11, int i12, int i13);

        /* renamed from: h */
        void mo64350h();

        /* renamed from: i */
        void mo64351i(String str);

        /* renamed from: j */
        void mo64352j();
    }

    public QuickPickerView() {
        this.f65896A0 = 0.0f;
        this.f65898B0 = 0.0f;
        this.f65902D0 = 0.0f;
        this.f65904E0 = 0.0f;
        this.f65906F0 = 0;
        this.f65908G0 = false;
        this.f65910H0 = 0;
        this.f65912I0 = 0;
        this.f65914J0 = 0.0f;
        this.f65916K0 = false;
        this.f65918L0 = false;
        this.f65926P0 = EnumC22962a.f111693q;
        this.f65928Q0 = EnumC22963b.f111700p;
        this.f65930R0 = "";
        this.f65932S0 = false;
        this.f65934T0 = false;
        this.f65938V0 = false;
        this.f65942X0 = -1;
        this.f65944Y0 = false;
        this.f65946Z0 = false;
        this.f65948a1 = false;
        this.f65950b1 = false;
        this.f65953e1 = false;
        this.f65954f1 = -1;
        this.f65955g1 = 15;
        this.f65956h1 = -1;
        this.f65957i1 = false;
        this.f65958j1 = false;
        this.f65959k1 = false;
        this.f65962n1 = false;
        this.f65963o1 = 0L;
        this.f65969u1 = 1;
        this.f65899B1 = false;
        this.f65901C1 = false;
        this.f65903D1 = false;
        this.f65907F1 = new int[2];
        this.f65911H1 = -1;
        this.f65913I1 = 0;
        this.f65915J1 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.ui.picker.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m71165kN;
                m71165kN = QuickPickerView.this.m71165kN(message);
                return m71165kN;
            }
        });
        this.f65917K1 = "";
        this.f65921M1 = false;
        this.f65923N1 = null;
        this.f65925O1 = false;
        this.f65927P1 = null;
        this.f65929Q1 = new C12647i();
        this.f65931R1 = 0;
        this.f65939V1 = new ArrayList();
        this.f65941W1 = null;
        this.f65947Z1 = null;
        this.f65949a2 = new C12644f();
    }

    /* renamed from: AN */
    private void m71074AN(boolean z11) {
        m71162jO(this.f65960l1, false);
        m71162jO(this.f65961m1, false);
        m71201yM();
        m71203zM();
        m71162jO(this.f65952d1, false);
        RecyclerView recyclerView = this.f65943X1;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        if (z11) {
            m71199xO();
        } else {
            m71197wO();
        }
    }

    /* renamed from: AO */
    private void m71075AO() {
        ZaloView m92996E0 = this.f88762c0.m92649TI().m92996E0("MEDIA_PICKER_VIEW_TAG");
        if (m92996E0 instanceof MediaPickerView) {
            this.f65951c1 = (MediaPickerView) m92996E0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public void m71077BM() {
        if (this.f65966r1 == null && getContext() != null) {
            this.f65966r1 = C2040d.m11045b(getContext(), AbstractC16803z.avd_arrow_collapse);
        }
        this.f88760a0.getTitleTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f65966r1, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN, reason: merged with bridge method [inline-methods] */
    public void m71182qN(CameraInputParams cameraInputParams, VideoItem videoItem) {
        try {
            cameraInputParams.f41108a0 = false;
            cameraInputParams.f41139x = videoItem.mo41081Q();
            cameraInputParams.f41141y = videoItem.mo41083a0();
            if (cameraInputParams.f41082A == null) {
                C27373c c27373c = new C27373c();
                c27373c.m140250e0(videoItem.mo41081Q());
                c27373c.m140237V(videoItem.mo41083a0());
                cameraInputParams.f41082A = c27373c;
            }
            cameraInputParams.f41093L = true;
            ZaloCameraView m116167s = AbstractC22470k.m116167s(this.f88762c0.m92676n2(), 11112, 0, cameraInputParams);
            if (m116167s != null) {
                m116167s.f40833A1 = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: BO */
    private void m71079BO() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f65952d1 = (StickerPanelView) m92996E0;
        }
        if (this.f65952d1 != null) {
            m71119PM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public void m71081CM() {
        if (this.f65967s1 == null && getContext() != null) {
            this.f65967s1 = C2040d.m11045b(getContext(), AbstractC16803z.avd_arrow_dropdown);
        }
        this.f88760a0.getTitleTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f65967s1, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public void m71082CN(MediaItem mediaItem, AnimationTarget animationTarget, C20275e c20275e, String str, String str2) {
        int i11;
        MediaItem mediaItem2;
        int i12;
        String str3;
        String str4;
        boolean z11;
        try {
            i11 = this.f65942X0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if ((i11 == 100 || i11 == 106) && !this.f65903D1 && !m71255ZM()) {
            this.f65903D1 = true;
            List m71242VL = m71242VL();
            List m71277nM = m71277nM();
            EnumC22962a enumC22962a = this.f65926P0;
            EnumC22962a enumC22962a2 = EnumC22962a.f111694r;
            if (enumC22962a == enumC22962a2) {
                if (this.f65942X0 == 106) {
                    mediaItem2 = mediaItem;
                    i12 = 16;
                } else {
                    mediaItem2 = mediaItem;
                    i12 = 3;
                }
            } else {
                mediaItem2 = mediaItem;
                i12 = 15;
            }
            int m120299K = AbstractC23280z4.m120299K(m71242VL, mediaItem2);
            String str5 = "";
            if (this.f65926P0 != enumC22962a2) {
                str3 = "";
            } else {
                str3 = this.f65930R0;
            }
            MediaPickerView mediaPickerView = this.f65951c1;
            if (mediaPickerView == null) {
                str4 = "";
            } else {
                str4 = mediaPickerView.m72223aN();
            }
            EnumC22962a enumC22962a3 = this.f65926P0;
            MediaPickerView mediaPickerView2 = this.f65951c1;
            if (mediaPickerView2 != null && mediaPickerView2.m72190LN()) {
                z11 = true;
            } else {
                z11 = false;
            }
            Conversation conversation = this.f65936U0;
            if (conversation != null) {
                str5 = conversation.f42893q;
            }
            Bundle m71644lP = LandingPageView.m71644lP(i12, enumC22962a3, m120299K, 0, z11, str3, str5, str4, "chat_gallery_viewfull");
            if (this.f65926P0 == enumC22962a2) {
                boolean z12 = !m71277nM.isEmpty();
                Iterator it = m71277nM.iterator();
                while (true) {
                    if (it.hasNext()) {
                        MediaItem mediaItem3 = (MediaItem) it.next();
                        if (!(mediaItem3 instanceof VideoItem) || mediaItem3.f42962h0 != 1) {
                            break;
                        }
                    } else if (z12) {
                        m71644lP.putInt("extra_view_mode", 1);
                        m71644lP.putString("extra_msg_show_snack_bar", str);
                        m71644lP.putString("extra_param_log_video_over_size", str2);
                        m71644lP.putString("source_start_view", "viewfull_aftersend");
                    }
                }
            }
            this.f65968t1 = new LandingPageView(m71644lP, m71242VL, m71277nM);
            m71097IM();
            this.f65965q1 = c20275e;
            if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(getContext())) {
                C3979l m125676A2 = C23999j.m125676A2(AbstractC23280z4.m120361x(mediaItem), AbstractC23006a0.m117875E(), C23278z2.m120110a());
                if (m125676A2 == null) {
                    m125676A2 = this.f65971w0.m123605k(AbstractC23280z4.m120364z(mediaItem), AbstractC23006a0.m117883M(), C23278z2.m120110a());
                }
                if (this.f65964p1 != null && animationTarget != null && m125676A2 != null && m125676A2.m18839c() != null) {
                    C20275e c20275e2 = this.f65965q1;
                    if (c20275e2 != null) {
                        c20275e2.m105864J(m125676A2);
                    }
                    C24559a.m127933c("QuickPickerView", "showLandingPageFragment with animation");
                    this.f65964p1.expand(animationTarget, m125676A2);
                } else {
                    C24559a.m127933c("QuickPickerView", "showLandingPageFragment no bitmap");
                    m71169lO(true);
                }
                this.f65915J1.sendEmptyMessageDelayed(2, 800L);
            }
            C24559a.m127933c("QuickPickerView", "showLandingPageFragment low end device");
            m71169lO(true);
            this.f65915J1.sendEmptyMessageDelayed(2, 800L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CO */
    public void m71083CO() {
        int i11;
        int measuredHeight;
        if (!this.f88762c0.m92676n2().mo35576n3()) {
            if (m92656bJ() != null && m92656bJ().getParent() != null && ((View) m92656bJ().getParent()).getMeasuredHeight() > 0) {
                View view = this.f65977z0;
                if (view != null && view.getHeight() > 0) {
                    measuredHeight = this.f65977z0.getHeight();
                } else {
                    measuredHeight = ((View) m92656bJ().getParent()).getMeasuredHeight();
                }
                this.f65910H0 = measuredHeight - AbstractC32226c.m155409h(this.f65977z0);
            } else {
                this.f65910H0 = m92651WI().getDisplayMetrics().heightPixels - AbstractC23136l9.m118737p0();
            }
        } else {
            View findViewById = this.f88762c0.m92676n2().findViewById(AbstractC6918a0.zalo_view_container);
            if (findViewById != null && findViewById.getMeasuredWidth() > 0 && findViewById.getMeasuredHeight() > 0 && (findViewById instanceof UpArrowLayout)) {
                Point pointTo = ((UpArrowLayout) findViewById).getPointTo();
                if (m92651WI().getConfiguration().orientation == 1) {
                    this.f65910H0 = findViewById.getMeasuredHeight() - pointTo.y;
                } else {
                    Rect rect = new Rect();
                    findViewById.getRootView().getWindowVisibleDisplayFrame(rect);
                    int measuredHeight2 = findViewById.getMeasuredHeight();
                    if (rect.top != 0) {
                        i11 = AbstractC17484n.Companion.m92931b();
                    } else {
                        i11 = 0;
                    }
                    this.f65910H0 = measuredHeight2 - i11;
                }
            } else if (m92656bJ() != null && m92656bJ().getParent() != null) {
                this.f65910H0 = ((View) m92656bJ().getParent()).getMeasuredHeight();
            }
        }
        int dimension = (int) m92651WI().getDimension(AbstractC17454d.action_bar_default_height);
        this.f65912I0 = dimension;
        float m71143dM = ((this.f65910H0 - dimension) - m71143dM()) - this.f65931R1;
        this.f65904E0 = m71143dM;
        this.f65906F0 = ((int) m71143dM) - 1;
    }

    /* renamed from: DM */
    private void m71085DM() {
        int i11 = this.f65956h1;
        if (i11 != 100 && i11 != 101 && i11 != 106) {
            this.f65975y0.setVisibility(4);
        }
        this.f65975y0.post(new Runnable() { // from class: com.zing.zalo.ui.picker.y
            @Override // java.lang.Runnable
            public final void run() {
                QuickPickerView.this.m71147eN();
            }
        });
    }

    /* renamed from: EM */
    private void m71087EM() {
        if (this.f65961m1 == null) {
            this.f65961m1 = new BackgroundPickerView();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_HEIGHT_VIEW_OFFSET", (this.f65910H0 - m71143dM()) - this.f65912I0);
            this.f65961m1.mo60305zK(bundle);
            if (this.f88762c0.m92676n2() != null && !this.f88762c0.m92676n2().isFinishing() && !mo60294yp()) {
                m71090FM();
                m92649TI().m93058d2(AbstractC6918a0.container_location, this.f65961m1, 0, "BackgroundPickerView", 0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public void m71088EN(final VideoItem videoItem, AnimationTarget animationTarget, C20275e c20275e, String str, String str2) {
        C27373c c27373c;
        VideoBlendingParam videoBlendingParam;
        try {
            if (this.f65942X0 == -1) {
                return;
            }
            AbstractC23647d.m123897g("9177110");
            C7853b.m40052a0().m40136j1();
            if (this.f65942X0 == 106) {
                m71082CN(videoItem, animationTarget, c20275e, str, str2);
                return;
            }
            final CameraInputParams cameraInputParams = new CameraInputParams();
            cameraInputParams.f41129s = 5;
            EnumC22962a enumC22962a = this.f65926P0;
            if (enumC22962a == EnumC22962a.f111694r) {
                cameraInputParams.f41105X = "2";
                cameraInputParams.f41119l0 = new SendInputParams(1);
                m71182qN(cameraInputParams, videoItem);
                return;
            }
            if (enumC22962a == EnumC22962a.f111693q) {
                cameraInputParams.f41133u = 2;
                cameraInputParams.f41105X = "6";
                cameraInputParams.f41119l0 = new SendInputParams(2);
                cameraInputParams.f41083B = videoItem.m41177y();
                if (videoItem.m41217x1() != null && (videoBlendingParam = (c27373c = (C27373c) videoItem.m41217x1()).f128947T) != null && (videoBlendingParam.f48264P != 0 || videoBlendingParam.f48265Q != 0)) {
                    cameraInputParams.f41082A = c27373c;
                }
                if (AbstractC26689j.f126436b) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.picker.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            QuickPickerView.this.m71185rN(videoItem, cameraInputParams);
                        }
                    });
                } else {
                    m71182qN(cameraInputParams, videoItem);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FM */
    private void m71090FM() {
        BackgroundPickerView backgroundPickerView = this.f65961m1;
        if (backgroundPickerView != null) {
            backgroundPickerView.m71399zM(new C12648j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FO */
    public void m71091FO(boolean z11) {
        if (this.f65923N1 == null) {
            this.f65923N1 = "";
        } else if (z11) {
            this.f65923N1 = m71134YL();
        }
    }

    /* renamed from: GM */
    private void m71093GM() {
        int i11;
        try {
            if (this.f65905E1 != null || (!m71237TM() && !m71240UM())) {
                C12667b c12667b = this.f65905E1;
                if (c12667b != null && c12667b.m71351e() != null) {
                    this.f65905E1.m71351e().setVisibility(8);
                    MediaPickerView mediaPickerView = this.f65951c1;
                    if (mediaPickerView != null) {
                        mediaPickerView.m72204QO(this.f65929Q1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f65973x0 != null) {
                i11 = this.f65906F0;
            } else {
                i11 = (this.f65910H0 - this.f65906F0) - this.f65912I0;
            }
            int[] iArr = this.f65907F1;
            iArr[0] = 0;
            iArr[1] = i11;
            C12667b c12667b2 = new C12667b(this, this.f65976y1, this.f65978z1);
            this.f65905E1 = c12667b2;
            c12667b2.m71351e().setVisibility(4);
            this.f65905E1.m71351e().bringToFront();
            TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
            if (touchInterceptionFrameLayout != null) {
                touchInterceptionFrameLayout.setPositionListener(new TouchInterceptionFrameLayout.InterfaceC13548a() { // from class: com.zing.zalo.ui.picker.x
                    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13548a
                    /* renamed from: a */
                    public final void mo72876a(float f11) {
                        QuickPickerView.this.m71149fN(f11);
                    }
                });
            }
            m92646QI().bringToFront();
            this.f65951c1.m72204QO(this.f65929Q1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: HN */
    private void m71095HN(boolean z11) {
        int i11;
        try {
            this.f65903D1 = false;
            this.f65899B1 = false;
            if (this.f65968t1 != null) {
                C17487o0 m92649TI = this.f88762c0.m92649TI();
                LandingPageView landingPageView = this.f65968t1;
                if (z11) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                m92649TI.mo92702G1(landingPageView, i11);
                this.f65968t1 = null;
            }
            MediaPickerView mediaPickerView = this.f65951c1;
            if (mediaPickerView != null) {
                mediaPickerView.m72224aP(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: IM */
    private void m71097IM() {
        LandingPageView landingPageView = this.f65968t1;
        if (landingPageView != null) {
            landingPageView.m71704hP(new LandingPageView.InterfaceC12718q() { // from class: com.zing.zalo.ui.picker.j
                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12718q
                /* renamed from: a */
                public final void mo71513a(int i11, boolean z11, List list, List list2) {
                    QuickPickerView.this.m71153gN(i11, z11, list, list2);
                }
            });
            this.f65968t1.m71705iP(new LandingPageView.InterfaceC12719r() { // from class: com.zing.zalo.ui.picker.k
                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12719r
                /* renamed from: a */
                public final void mo71514a(boolean z11) {
                    QuickPickerView.this.m71155hN(z11);
                }
            });
            this.f65968t1.m71703gP(new C12652n());
            this.f65968t1.m71706jP(new LandingPageView.InterfaceC12720s() { // from class: com.zing.zalo.ui.picker.l
                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12720s
                /* renamed from: a */
                public final void mo71515a(List list, List list2) {
                    QuickPickerView.this.m71216JO(list, list2);
                }
            });
        }
    }

    /* renamed from: IN */
    private void m71098IN() {
        if (this.f65952d1 == null) {
            return;
        }
        m92649TI().mo92702G1(this.f65952d1, 0);
        this.f65952d1 = null;
    }

    /* renamed from: JM */
    private void m71101JM() {
        LocationPickerView locationPickerView = this.f65960l1;
        if (locationPickerView != null) {
            locationPickerView.m72044zN(new C12649k());
        }
    }

    /* renamed from: JN */
    private void m71102JN() {
        try {
            m71280oq(null);
            m71232S4(null);
            m71250Xv(null);
            m71109LN();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: KM */
    private void m71105KM(SensitiveData sensitiveData) {
        boolean z11;
        try {
            LocationPickerView locationPickerView = this.f65960l1;
            if (locationPickerView == null) {
                this.f65960l1 = new LocationPickerView();
                Bundle bundle = new Bundle();
                int m71143dM = (this.f65910H0 - m71143dM()) - this.f65912I0;
                if (this.f65926P0 == EnumC22962a.f111693q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bundle.putBoolean("extra_from_update_status", z11);
                bundle.putInt("height_view_offset", m71143dM);
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", sensitiveData);
                this.f65960l1.mo60305zK(bundle);
                if (this.f88762c0.m92676n2() != null && !this.f88762c0.m92676n2().isFinishing() && !mo60294yp()) {
                    m92649TI().m93058d2(AbstractC6918a0.container_location, this.f65960l1, 0, "LocationPickerView", 0, false);
                    m71101JM();
                }
            } else {
                locationPickerView.m72040TM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LM */
    private void m71108LM() {
        TouchInterceptionFrameLayout touchInterceptionFrameLayout = (TouchInterceptionFrameLayout) this.f65977z0.findViewById(AbstractC6918a0.update_status_draggable_layout);
        this.f65975y0 = touchInterceptionFrameLayout;
        touchInterceptionFrameLayout.setScrollInterceptionListener(this);
        m71085DM();
    }

    /* renamed from: LN */
    private void m71109LN() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72193MO();
        }
    }

    /* renamed from: MM */
    private void m71112MM(boolean z11, SensitiveData sensitiveData) {
        boolean z12;
        boolean z13;
        try {
            if (this.f88762c0.m92676n2() != null && !this.f88762c0.m92676n2().isFinishing() && !mo60294yp()) {
                if (m71237TM() && m71240UM()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (AbstractC23309i.m122504vg() && AbstractC23309i.m121048If()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Bundle m72162rN = MediaPickerView.m72162rN(this.f65955g1, this.f65926P0, this.f65938V0, false, z11, z12, z13, new ArrayList(), 0, "", sensitiveData);
                MediaPickerView mediaPickerView = new MediaPickerView();
                this.f65951c1 = mediaPickerView;
                mediaPickerView.mo60305zK(m72162rN);
                m92649TI().m93058d2(AbstractC6918a0.update_status_draggable_layout, this.f65951c1, 0, "MEDIA_PICKER_VIEW_TAG", 0, false);
                m71115NM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public void m71114NL() {
        InterfaceC2038b interfaceC2038b = (InterfaceC2038b) this.f88760a0.getTitleTextView().getCompoundDrawables()[2];
        if (interfaceC2038b.isRunning()) {
            interfaceC2038b.stop();
        }
        interfaceC2038b.start();
    }

    /* renamed from: NM */
    private void m71115NM() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72219XO(m71164kM());
            this.f65951c1.m72211TO(this.f65970v1);
            this.f65951c1.m72215VO(m71160jM());
            this.f65951c1.m72221YO(this.f65974x1);
            this.f65951c1.m72208SO(m71152gM());
        }
    }

    /* renamed from: OL */
    private void m71117OL() {
        int i11;
        int i12;
        Configuration configuration;
        try {
            int m118763y = AbstractC23136l9.m118763y(getContext());
            int m118737p0 = AbstractC23136l9.m118737p0();
            int m71143dM = m71143dM();
            if (this.f88762c0.m92676n2().mo35576n3()) {
                if (this.f88762c0.m92651WI() != null) {
                    configuration = this.f88762c0.m92651WI().getConfiguration();
                } else {
                    configuration = null;
                }
                if (configuration != null) {
                    if (configuration.orientation == 1) {
                        i11 = m118763y - (C21243a.f103540o + m118737p0);
                        i12 = ((i11 - this.f65912I0) - m71143dM) - 1;
                        if (i12 <= 0 && this.f65906F0 > i12) {
                            this.f65914J0 = i12 / 10.0f;
                            return;
                        } else {
                            this.f65914J0 = this.f65906F0 / 10.0f;
                        }
                    }
                } else {
                    throw new Exception();
                }
            } else if (!AbstractC32226c.m155415n(this.f88762c0.m92676n2())) {
                m118737p0 = 0;
            }
            i11 = m118763y - m118737p0;
            i12 = ((i11 - this.f65912I0) - m71143dM) - 1;
            if (i12 <= 0) {
            }
            this.f65914J0 = this.f65906F0 / 10.0f;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f65914J0 = this.f65906F0 / 10.0f;
        }
    }

    /* renamed from: PM */
    private void m71119PM() {
        this.f65952d1.m72709oO(new C12660v());
    }

    /* renamed from: QL */
    private void m71121QL() {
        for (int i11 = 0; i11 < this.f65939V1.size(); i11++) {
            if (this.f65939V1.get(i11) != null && ((C20564a) this.f65939V1.get(i11)).m106981e()) {
                this.f65954f1 = i11;
                return;
            }
        }
    }

    /* renamed from: QM */
    private void m71122QM() {
        ZinstantOAFullMenuControl zinstantOAFullMenuControl = (ZinstantOAFullMenuControl) this.f65977z0.findViewById(AbstractC6918a0.zinstant_full_menu_control);
        this.f65945Y1 = zinstantOAFullMenuControl;
        zinstantOAFullMenuControl.setZinstantOAListener(this.f65949a2);
    }

    /* renamed from: RM */
    private void m71124RM(EnumC18030a enumC18030a, String str, int i11, C11598e.e eVar) {
        if (this.f65943X1 == null) {
            RecyclerView recyclerView = (RecyclerView) ((ViewStub) this.f65977z0.findViewById(AbstractC6918a0.stub_chat_plus_panel)).inflate();
            this.f65943X1 = recyclerView;
            recyclerView.setVerticalScrollBarEnabled(false);
            RecyclerView recyclerView2 = this.f65943X1;
            recyclerView2.setBackgroundColor(C23212s8.m119607o(recyclerView2.getContext(), AbstractC16781w.ChatBarBackgroundColor));
            GridLayoutManager gridLayoutManager = new GridLayoutManager(m92648SI(), 4);
            C12643e c12643e = new C12643e();
            gridLayoutManager.m9671f3(c12643e);
            c12643e.m9689i(true);
            this.f65943X1.setLayoutManager(gridLayoutManager);
            C12669c c12669c = new C12669c(this.f65939V1, new C23528a(m92648SI()));
            this.f65941W1 = c12669c;
            this.f65943X1.setAdapter(c12669c);
            this.f65941W1.m71360P(new C12669c.c() { // from class: com.zing.zalo.ui.picker.r
                @Override // com.zing.zalo.p077ui.picker.C12669c.c
                /* renamed from: a */
                public final void mo71365a(View view, C20564a c20564a) {
                    QuickPickerView.this.m71157iN(view, c20564a);
                }
            });
            m71213HM(enumC18030a, str, i11, eVar);
        }
        int m71143dM = m71143dM();
        if (m71143dM != this.f65943X1.getLayoutParams().height) {
            this.f65943X1.getLayoutParams().height = m71143dM;
            this.f65943X1.requestLayout();
        }
    }

    /* renamed from: SL */
    private void m71126SL(int i11, int i12, Intent intent) {
        try {
            LandingPageView landingPageView = this.f65968t1;
            if (landingPageView != null) {
                landingPageView.onActivityResult(i11, i12, intent);
            }
            StickerPanelView stickerPanelView = this.f65952d1;
            if (stickerPanelView != null) {
                stickerPanelView.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: XM */
    private boolean m71132XM() {
        ZaloView zaloView;
        if (this.f88762c0.m92676n2() != null && this.f88762c0.m92676n2().mo35579p() != null) {
            zaloView = this.f88762c0.m92676n2().mo35579p().m93012K0();
        } else {
            zaloView = null;
        }
        if (!(zaloView instanceof GroupLiveStreamView) && !(zaloView instanceof GroupLiveStreamPlaybackView)) {
            return false;
        }
        return true;
    }

    /* renamed from: YL */
    private String m71134YL() {
        return this.f65968t1 != null ? "chat_gallery_viewfull" : this.f65962n1 ? "chat_gallery_full" : "chat_gallery_mini";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m71137aN(MediaItem mediaItem) {
        C27373c c27373c;
        VideoBlendingParam videoBlendingParam;
        try {
            if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                CameraInputParams cameraInputParams = new CameraInputParams();
                if (mediaItem instanceof VideoItem) {
                    cameraInputParams.f41129s = 5;
                    if (AbstractC23280z4.m120327g(this.f65955g1, 18, 16)) {
                        cameraInputParams.f41105X = "2";
                        if (AbstractC23280z4.m120327g(this.f65955g1, 16)) {
                            cameraInputParams.f41108a0 = false;
                        }
                    } else {
                        cameraInputParams.f41133u = 2;
                    }
                    cameraInputParams.f41139x = mediaItem.mo41081Q();
                    cameraInputParams.f41141y = mediaItem.mo41083a0();
                    cameraInputParams.f41119l0 = new SendInputParams(2);
                    cameraInputParams.f41083B = mediaItem.m41177y();
                    if (((VideoItem) mediaItem).m41217x1() != null && (videoBlendingParam = (c27373c = (C27373c) ((VideoItem) mediaItem).m41217x1()).f128947T) != null && (videoBlendingParam.f48264P != 0 || videoBlendingParam.f48265Q != 0)) {
                        cameraInputParams.f41082A = c27373c;
                    }
                    if (((VideoItem) mediaItem).m41219z1()) {
                        cameraInputParams.f41094M = 1;
                    }
                    ZaloCameraView m116167s = AbstractC22470k.m116167s(this.f88762c0.m92676n2(), 11114, 1, cameraInputParams);
                    if (m116167s != null) {
                        m116167s.f40833A1 = true;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m71139bN(int i11, String str, final String str2) {
        try {
            if (i11 != -1) {
                AbstractC2374t0.m12414a(m92648SI(), this.f65940W0);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                this.f65940W0 = null;
                return;
            }
            this.f65940W0 = new C20556f(str);
            String m120303O = AbstractC23280z4.m120303O(str, Environment.DIRECTORY_DCIM, AbstractC23041d2.m118212k(str), false, false, false, new SensitiveData("gallery_save_photo_when_post_feed", "social_timeline"));
            if (m120303O != null && m120303O.length() != 0) {
                str = m120303O;
            }
            final MediaItem m120331i = AbstractC23280z4.m120331i(str, false);
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.picker.n
                @Override // java.lang.Runnable
                public final void run() {
                    QuickPickerView.this.m71141cN(m120331i, str2);
                }
            }, 500L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: dM */
    private int m71143dM() {
        return AbstractC23309i.m122007i5(m92689tK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public /* synthetic */ void m71144dN() {
        if (this.f65978z1 != null && !mo60294yp()) {
            this.f65978z1.mo71318o();
        }
    }

    /* renamed from: eM */
    private String m71146eM() {
        Conversation conversation = this.f65936U0;
        if (conversation == null) {
            return "0";
        }
        return C2526d.f10270a.m12733y(conversation.f42893q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public /* synthetic */ void m71147eN() {
        float f11;
        try {
            if (!m92681pJ() && !m92677nJ()) {
                m71083CO();
                m71117OL();
                this.f65902D0 = 0.0f;
                if (this.f65942X0 == -1) {
                    this.f65975y0.setPosition(this.f65910H0);
                    ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
                    if (changeableHeightRelativeLayout != null) {
                        changeableHeightRelativeLayout.setHeight(this.f65910H0);
                    }
                    this.f65975y0.setVisibility(4);
                } else {
                    this.f65975y0.setVisibility(0);
                    TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
                    if (this.f65957i1) {
                        f11 = this.f65902D0;
                    } else {
                        f11 = this.f65904E0;
                    }
                    touchInterceptionFrameLayout.setPosition(f11);
                    ChangeableHeightRelativeLayout changeableHeightRelativeLayout2 = this.f65973x0;
                    if (changeableHeightRelativeLayout2 != null) {
                        changeableHeightRelativeLayout2.setHeight(this.f65906F0);
                    }
                }
                if (this.f65905E1 != null && m71237TM()) {
                    this.f65905E1.m71351e().setVisibility(0);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public /* synthetic */ void m71149fN(float f11) {
        C12667b c12667b;
        if (this.f65908G0 && m71237TM() && (c12667b = this.f65905E1) != null) {
            c12667b.m71355j();
        }
    }

    /* renamed from: fO */
    private void m71150fO() {
        View findViewById;
        View view = this.f65977z0;
        if (view != null && (findViewById = view.findViewById(AbstractC6918a0.viewFakeActionBar)) != null && AbstractC32226c.m155415n(m92676n2())) {
            findViewById.getLayoutParams().height = m92651WI().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC32226c.m155411j(this.f88762c0.m92676n2()).top;
        }
    }

    /* renamed from: gM */
    private MediaPickerView.InterfaceC12784b m71152gM() {
        return new C12650l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public /* synthetic */ void m71153gN(int i11, boolean z11, List list, List list2) {
        try {
            if (m92676n2() != null && m92676n2().mo35576n3() && !m92672lJ()) {
                return;
            }
            m71095HN(true);
            m71184rM(i11, z11, list, list2);
            if (this.f65962n1) {
                invalidateOptionsMenu();
                mo37493TJ();
            } else {
                InterfaceC12663y interfaceC12663y = this.f65935T1;
                if (interfaceC12663y != null) {
                    interfaceC12663y.mo45290o();
                }
            }
            if (AbstractC23309i.m121232Ne()) {
                C23744a.m124114c().m124116d(96, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public /* synthetic */ void m71155hN(boolean z11) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72206RO(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public /* synthetic */ void m71157iN(View view, C20564a c20564a) {
        try {
            int m106977a = c20564a.m106977a();
            InterfaceC12661w interfaceC12661w = this.f65937U1;
            if (interfaceC12661w != null) {
                interfaceC12661w.mo71335i(m106977a, c20564a);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iO */
    private void m71158iO() {
        new ClearSelectedConfirmDialog().m92602UK(m92649TI(), "dialog");
    }

    /* renamed from: jM */
    private MediaPickerView.InterfaceC12787c m71160jM() {
        return new MediaPickerView.InterfaceC12787c() { // from class: com.zing.zalo.ui.picker.h
            @Override // com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView.InterfaceC12787c
            /* renamed from: a */
            public final void mo71512a(MediaItem mediaItem) {
                QuickPickerView.this.m71137aN(mediaItem);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public /* synthetic */ void m71161jN() {
        InterfaceC0887b interfaceC0887b;
        try {
            ZinstantOAFullMenuControl zinstantOAFullMenuControl = this.f65945Y1;
            if (zinstantOAFullMenuControl != null && (interfaceC0887b = this.f65947Z1) != null) {
                zinstantOAFullMenuControl.m88908h(interfaceC0887b);
                this.f65947Z1 = null;
                this.f65945Y1.m88911p();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f65949a2.mo60357h(e11);
        }
    }

    /* renamed from: jO */
    private void m71162jO(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
                C12667b c12667b = this.f65905E1;
                if (c12667b != null && c12667b.m71351e() != null) {
                    if ((zaloView instanceof MediaPickerView) && m71237TM() && z11) {
                        C12667b c12667b2 = this.f65905E1;
                        if (!c12667b2.f66008h) {
                            c12667b2.m71351e().setVisibility(0);
                            return;
                        }
                    }
                    this.f65905E1.m71351e().setVisibility(8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: kM */
    private MediaPickerView.InterfaceC12793e m71164kM() {
        return new C12651m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public /* synthetic */ boolean m71165kN(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 == 2) {
                this.f65903D1 = false;
            }
        } else {
            m71289vO();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kO */
    public void m71166kO() {
        int i11;
        ActionBar actionBar = this.f88760a0;
        if (!this.f65962n1 && !this.f65958j1) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(actionBar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public /* synthetic */ void m71168lN(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        if (i11 != i15 || i13 != i17 || i12 != i16 || i14 != i18) {
            try {
                m71083CO();
                if (this.f65975y0.getVisibility() == 0 && !this.f65962n1) {
                    this.f65975y0.setPosition(this.f65904E0);
                }
                ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
                if (changeableHeightRelativeLayout != null) {
                    if (this.f65942X0 == -1) {
                        i19 = this.f65910H0;
                    } else {
                        i19 = this.f65906F0;
                    }
                    changeableHeightRelativeLayout.setHeight(i19);
                }
                BackgroundPickerView backgroundPickerView = this.f65961m1;
                if (backgroundPickerView != null) {
                    backgroundPickerView.m71386CM(this.f65906F0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lO */
    public void m71169lO(boolean z11) {
        try {
            this.f65899B1 = true;
            m92649TI().m93058d2(AbstractC6918a0.quick_picker_fragment, this.f65968t1, 0, "LANDING_PAGE_VIEW_TAG", z11 ? 1 : 0, false);
            m71162jO(this.f65968t1, true);
            MediaPickerView mediaPickerView = this.f65951c1;
            if (mediaPickerView != null) {
                mediaPickerView.m72224aP(true);
            }
            InterfaceC12663y interfaceC12663y = this.f65935T1;
            if (interfaceC12663y != null) {
                interfaceC12663y.mo45287l();
                if (AbstractC23309i.m121232Ne()) {
                    C23744a.m124114c().m124116d(97, new Object[0]);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public /* synthetic */ void m71171mN(MotionEvent motionEvent, float f11) {
        if (this.f65918L0) {
            return;
        }
        this.f65916K0 = true;
        float rawY = this.f65898B0 + (motionEvent.getRawY() - this.f65896A0);
        float f12 = this.f65902D0;
        if (rawY < f12) {
            rawY = f12;
        }
        this.f65975y0.setPosition(rawY);
        if (f11 > this.f65904E0) {
            ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
            if (changeableHeightRelativeLayout != null) {
                int i11 = this.f65910H0;
                int i12 = this.f65912I0;
                changeableHeightRelativeLayout.setHeight((i11 - i12) - ((i11 - i12) - ((int) f11)));
            }
            ChangeableHeightView changeableHeightView = this.f65900C0;
            if (changeableHeightView != null) {
                changeableHeightView.setHeight((this.f65910H0 - this.f65912I0) - ((int) f11));
            }
            InterfaceC12658t interfaceC12658t = this.f65972w1;
            if (interfaceC12658t != null) {
                interfaceC12658t.mo71319f((this.f65910H0 - this.f65912I0) - ((int) f11));
            }
        }
        if (this.f65905E1 != null && m71237TM()) {
            this.f65905E1.m71355j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public /* synthetic */ void m71173nN(MotionEvent motionEvent, float f11) {
        if (this.f65918L0) {
            return;
        }
        this.f65916K0 = true;
        float rawY = this.f65898B0 + (motionEvent.getRawY() - this.f65896A0);
        if (rawY < this.f65902D0) {
            return;
        }
        this.f65975y0.setPosition(rawY);
        if (f11 > this.f65904E0) {
            ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
            if (changeableHeightRelativeLayout != null) {
                int i11 = this.f65910H0;
                int i12 = this.f65912I0;
                changeableHeightRelativeLayout.setHeight((i11 - i12) - ((i11 - i12) - ((int) f11)));
            }
            ChangeableHeightView changeableHeightView = this.f65900C0;
            if (changeableHeightView != null) {
                changeableHeightView.setHeight((this.f65910H0 - this.f65912I0) - ((int) f11));
            }
            InterfaceC12658t interfaceC12658t = this.f65972w1;
            if (interfaceC12658t != null) {
                interfaceC12658t.mo71319f((this.f65910H0 - this.f65912I0) - ((int) f11));
            }
        }
        if (this.f65905E1 != null && m71237TM()) {
            this.f65905E1.m71355j();
        }
    }

    /* renamed from: nO */
    private void m71174nO() {
        switch (this.f65942X0) {
            case 100:
                m71281pO(false, this.f65927P1);
                return;
            case 101:
                m71284sO(false, this.f65927P1);
                return;
            case 102:
                m71283rO();
                return;
            case 103:
            case 105:
            case 107:
            default:
                return;
            case 104:
                m71276mO(this.f65927P1);
                return;
            case 106:
                m71279oO(this.f65957i1, null);
                return;
            case 108:
                m71271hO(false);
                return;
            case 109:
                int i11 = this.f65911H1;
                if (i11 == -1) {
                    i11 = m71143dM();
                }
                m71286uO(i11);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public /* synthetic */ void m71176oN(View view) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72229gP(this.f88760a0);
        }
    }

    /* renamed from: pM */
    private void m71178pM(final int i11, final String str, final String str2) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.picker.v
            @Override // java.lang.Runnable
            public final void run() {
                QuickPickerView.this.m71139bN(i11, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public void m71181qM() {
        try {
            m71210GG(m71146eM(), false);
            m71280oq(null);
            m71232S4(null);
            m71250Xv(null);
            if (this.f65975y0.getPosition() == this.f65902D0) {
                this.f65951c1.m72198OO(0);
                m71289vO();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    private void m71184rM(int i11, boolean z11, List list, List list2) {
        try {
            m71216JO(list, list2);
            if (i11 == -1) {
                InterfaceC12657s interfaceC12657s = this.f65976y1;
                if (interfaceC12657s != null) {
                    interfaceC12657s.mo45278e(m71230RL(), true);
                }
            } else {
                InterfaceC12659u interfaceC12659u = this.f65974x1;
                if (interfaceC12659u != null) {
                    interfaceC12659u.mo45271m(m71230RL());
                }
            }
            m71208EO(z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public /* synthetic */ void m71185rN(final VideoItem videoItem, final CameraInputParams cameraInputParams) {
        if (AbstractC3460h.m17438f(videoItem.mo41081Q(), 2) > AbstractC26689j.m137108q(2)) {
            videoItem.m41209E1(true);
            cameraInputParams.f41094M = 1;
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.picker.q
            @Override // java.lang.Runnable
            public final void run() {
                QuickPickerView.this.m71182qN(cameraInputParams, videoItem);
            }
        });
    }

    /* renamed from: sM */
    private void m71187sM(int i11, Intent intent) {
        if (intent != null) {
            m71178pM(i11, intent.getStringExtra("extra_result_output_path"), intent.getStringExtra("extra_result_camera_log"));
            View view = this.f65977z0;
            if (view != null && view.getViewTreeObserver() != null) {
                this.f65977z0.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC12653o());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public /* synthetic */ void m71188sN() {
        if (this.f65962n1) {
            m71295yO();
        } else {
            m71197wO();
        }
    }

    /* renamed from: tM */
    private void m71190tM(int i11, Intent intent) {
        String str;
        boolean z11;
        if (i11 == -1 && intent != null) {
            try {
                C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
                String stringExtra = intent.getStringExtra("extra_result_video_log");
                String stringExtra2 = intent.getStringExtra("extra_result_decor_data");
                if (intent.hasExtra("extra_result_original_path")) {
                    str = intent.getStringExtra("extra_result_original_path");
                } else {
                    str = null;
                }
                if (c27373c != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!TextUtils.isEmpty(str)) {
                    MediaItem m72243pN = this.f65951c1.m72243pN(str);
                    if (m72243pN instanceof VideoItem) {
                        VideoItem videoItem = (VideoItem) m72243pN;
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        videoItem.m41099E0(stringExtra);
                        videoItem.m41211G1(c27373c);
                        if (stringExtra2 == null) {
                            stringExtra2 = "";
                        }
                        videoItem.m41101G0(stringExtra2);
                        if (z11) {
                            if (!TextUtils.equals(c27373c.m140268v(), videoItem.m41214u1())) {
                                LandingPageView.m71692yN(videoItem);
                                videoItem.m41208D1(c27373c.m140268v());
                            }
                        } else {
                            LandingPageView.m71692yN(videoItem);
                        }
                        this.f65951c1.m72237kP(videoItem);
                        this.f65951c1.m72202Pq();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        AbstractC23136l9.m118686X0(this.f88762c0.m92676n2().getWindow(), false);
    }

    /* renamed from: tN */
    private void m71191tN() {
        InterfaceC0887b interfaceC0887b = this.f65947Z1;
        if (interfaceC0887b != null && interfaceC0887b.mo2741e() && this.f65945Y1 != null) {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.picker.s
                @Override // java.lang.Runnable
                public final void run() {
                    QuickPickerView.this.m71161jN();
                }
            });
        }
    }

    /* renamed from: uM */
    private void m71193uM(int i11, Intent intent) {
        String str;
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("EXTRA_VIDEO_INFO")) {
                    C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
                    String stringExtra = intent.getStringExtra("extra_result_video_log");
                    String stringExtra2 = intent.getStringExtra("extra_result_decor_data");
                    InterfaceC12657s interfaceC12657s = this.f65976y1;
                    if (interfaceC12657s != null && c27373c != null) {
                        interfaceC12657s.mo45273Z(c27373c, stringExtra);
                    }
                    if (this.f65926P0 == EnumC22962a.f111693q) {
                        if (intent.hasExtra("extra_result_original_path")) {
                            str = intent.getStringExtra("extra_result_original_path");
                        } else {
                            str = null;
                        }
                        MediaItem m72231hN = this.f65951c1.m72231hN(str);
                        if (m72231hN instanceof VideoItem) {
                            VideoItem videoItem = (VideoItem) m72231hN;
                            if (stringExtra == null) {
                                stringExtra = "";
                            }
                            videoItem.m41099E0(stringExtra);
                            videoItem.m41211G1(c27373c);
                            if (stringExtra2 == null) {
                                stringExtra2 = "";
                            }
                            videoItem.m41101G0(stringExtra2);
                            if (c27373c != null) {
                                c27373c.m140232Q(str);
                                if (!TextUtils.equals(c27373c.m140268v(), videoItem.m41214u1())) {
                                    videoItem.m41208D1(c27373c.m140268v());
                                }
                            }
                            m71220MN(0);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(videoItem);
                            m71216JO(arrayList, new ArrayList());
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* renamed from: uN */
    public void m71194uN(int i11) {
        try {
            switch (i11) {
                case 0:
                    if (this.f65926P0 == EnumC22962a.f111694r) {
                        if (!this.f65962n1) {
                            AbstractC23647d.m123897g("917140");
                        } else {
                            AbstractC23647d.m123897g("917753");
                        }
                    } else if (!this.f65962n1) {
                        AbstractC23647d.m123897g("13510");
                    } else {
                        AbstractC23647d.m123897g("13523");
                    }
                    return;
                case 1:
                    if (!this.f65962n1) {
                        if (this.f65926P0 == EnumC22962a.f111694r) {
                            AbstractC23647d.m123897g("917141");
                        } else {
                            AbstractC23647d.m123897g("13511");
                        }
                    }
                    return;
                case 2:
                    if (this.f65926P0 == EnumC22962a.f111694r) {
                        int i12 = this.f65942X0;
                        if (i12 == 101) {
                            AbstractC23647d.m123897g("917743");
                        } else if (i12 == 100) {
                            AbstractC23647d.m123897g("917143");
                        }
                    } else {
                        int i13 = this.f65942X0;
                        if (i13 == 101) {
                            AbstractC23647d.m123897g("136010");
                        } else if (i13 == 100) {
                            AbstractC23647d.m123897g("13513");
                        }
                    }
                    return;
                case 3:
                    EnumC22962a enumC22962a = this.f65926P0;
                    if (enumC22962a == EnumC22962a.f111694r && !this.f65962n1) {
                        AbstractC23647d.m123897g("917740");
                    } else if (enumC22962a == EnumC22962a.f111693q) {
                        if (this.f65962n1) {
                            AbstractC23647d.m123897g("136015");
                        } else {
                            AbstractC23647d.m123897g("13514");
                        }
                    }
                    return;
                case 4:
                    EnumC22962a enumC22962a2 = this.f65926P0;
                    if (enumC22962a2 == EnumC22962a.f111694r) {
                        AbstractC23647d.m123897g("917741");
                    } else if (enumC22962a2 == EnumC22962a.f111693q) {
                        if (this.f65962n1) {
                            AbstractC23647d.m123897g("136016");
                        } else {
                            AbstractC23647d.m123897g("13515");
                        }
                    }
                    return;
                case 5:
                    EnumC22962a enumC22962a3 = this.f65926P0;
                    if (enumC22962a3 == EnumC22962a.f111694r) {
                        AbstractC23647d.m123897g("917750");
                    } else if (enumC22962a3 == EnumC22962a.f111693q) {
                        int i14 = this.f65942X0;
                        if (i14 == 100) {
                            AbstractC23647d.m123897g("13520");
                        } else if (i14 == 101) {
                            AbstractC23647d.m123897g("136013");
                        }
                    }
                    return;
                case 6:
                    EnumC22962a enumC22962a4 = this.f65926P0;
                    if (enumC22962a4 == EnumC22962a.f111694r) {
                        AbstractC23647d.m123897g("917751");
                    } else if (enumC22962a4 == EnumC22962a.f111693q) {
                        int i15 = this.f65942X0;
                        if (i15 == 100) {
                            AbstractC23647d.m123897g("13521");
                        } else if (i15 == 101) {
                            AbstractC23647d.m123897g("136012");
                        }
                    }
                    return;
                case 7:
                default:
                    return;
                case 8:
                    EnumC22962a enumC22962a5 = this.f65926P0;
                    if (enumC22962a5 == EnumC22962a.f111694r) {
                        AbstractC23647d.m123897g("917751");
                    } else if (enumC22962a5 == EnumC22962a.f111693q) {
                        int i16 = this.f65942X0;
                        if (i16 == 100) {
                            AbstractC23647d.m123897g("13521");
                        } else if (i16 == 101) {
                            AbstractC23647d.m123897g("136011");
                        }
                    }
                    return;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wO */
    private void m71197wO() {
        int i11;
        try {
            m71083CO();
            if (this.f65975y0.getPosition() <= this.f65904E0 && this.f65975y0.getVisibility() == 0) {
                return;
            }
            this.f65975y0.setVisibility(0);
            this.f65975y0.setPosition(this.f65910H0 - this.f65912I0);
            ChangeableHeightView changeableHeightView = this.f65900C0;
            if (changeableHeightView != null) {
                changeableHeightView.setHeight(m71143dM());
            }
            ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
            if (changeableHeightRelativeLayout != null) {
                i11 = this.f65906F0;
            } else {
                i11 = (this.f65910H0 - this.f65906F0) - this.f65912I0;
            }
            AbstractC23202r9.m119545m(this.f65975y0, changeableHeightRelativeLayout, this.f65904E0, i11, null, -0.0f, new C12642d());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xO */
    private void m71199xO() {
        int i11;
        m71083CO();
        this.f65975y0.setVisibility(0);
        View view = this.f65973x0;
        if (view != null) {
            i11 = this.f65906F0;
        } else {
            i11 = (this.f65910H0 - this.f65906F0) - this.f65912I0;
        }
        int i12 = i11;
        if (view == null) {
            view = this.f65900C0;
        }
        AbstractC23202r9.m119537e(this.f65975y0, null, 150L, view, this.f65902D0, i12, null, 0.0f, new C12639a());
    }

    /* renamed from: yM */
    private void m71201yM() {
        InterfaceC12663y interfaceC12663y = this.f65935T1;
        if (interfaceC12663y != null) {
            interfaceC12663y.mo45281e();
        }
    }

    /* renamed from: zM */
    private void m71203zM() {
        ZinstantOAFullMenuControl zinstantOAFullMenuControl = this.f65945Y1;
        if (zinstantOAFullMenuControl != null) {
            zinstantOAFullMenuControl.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zO */
    public void m71204zO(String str) {
        String str2;
        if (this.f65926P0 == EnumC22962a.f111694r) {
            str2 = "chat_gallery";
        } else {
            str2 = "social_galleryupload";
        }
        C0815e1.m2075D().m2100V(new C23648e(34, str2, 0, str, new String[0]), false);
    }

    /* renamed from: AM */
    public void m71205AM(int i11) {
        int i12;
        float f11;
        this.f65931R1 = i11;
        m71083CO();
        TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
        if (touchInterceptionFrameLayout != null) {
            if (this.f65942X0 == -1) {
                f11 = this.f65910H0;
            } else {
                f11 = this.f65904E0;
            }
            touchInterceptionFrameLayout.setPosition(f11);
        }
        ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
        if (changeableHeightRelativeLayout != null) {
            if (this.f65942X0 == -1) {
                i12 = this.f65910H0;
            } else {
                i12 = this.f65906F0;
            }
            changeableHeightRelativeLayout.setHeight(i12);
        }
        C12669c c12669c = this.f65941W1;
        if (c12669c != null) {
            c12669c.m71361Q();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        EnumC22963b enumC22963b;
        super.mo37111CJ(bundle);
        this.f65971w0 = new C23528a(getContext());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            EnumC22962a enumC22962a = (EnumC22962a) m92642L3.get("extra_media_picker_source");
            this.f65926P0 = enumC22962a;
            if (enumC22962a == null) {
                this.f65926P0 = EnumC22962a.f111694r;
            }
            if (m92642L3.containsKey("extra_media_picker_sub_source")) {
                Object obj = m92642L3.get("extra_media_picker_sub_source");
                if (obj instanceof EnumC22963b) {
                    enumC22963b = (EnumC22963b) obj;
                } else {
                    enumC22963b = EnumC22963b.f111700p;
                }
                this.f65928Q0 = enumC22963b;
            }
            this.f65938V0 = m92642L3.getBoolean("extra_enable_inline_banner", false);
            this.f65955g1 = 15;
            if (this.f65926P0 == EnumC22962a.f111694r) {
                this.f65955g1 = 16;
            }
            this.f65956h1 = m92642L3.getInt("extra_preload_grid_mode", -1);
            this.f65959k1 = m92642L3.getBoolean("extra_should_init_media_picker", false);
            this.f65930R0 = m92642L3.getString("extra_chat_str_send_to", "");
            this.f65936U0 = (Conversation) m92642L3.getParcelable("extra_chat_uid_to");
            this.f65932S0 = m92642L3.getBoolean("extra_is_group", false);
            this.f65913I1 = m92642L3.getInt("extra_sticker_panel_height", 0);
            this.f65927P1 = (SensitiveData) m92642L3.getParcelable("EXTRA_SENSITIVE_DATA");
            this.f65934T0 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY", false);
        }
        this.f65910H0 = m92651WI().getDisplayMetrics().heightPixels - AbstractC32226c.m155405d(this.f88762c0.m92676n2());
        this.f65912I0 = (int) m92651WI().getDimension(AbstractC17454d.action_bar_default_height);
        this.f65917K1 = C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f88762c0.m92676n2());
    }

    /* renamed from: DN */
    public void m71206DN(List list, MediaItem mediaItem, AnimationTarget animationTarget, C20275e c20275e) {
        boolean z11;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (!this.f65903D1 && !m71255ZM()) {
            this.f65903D1 = true;
            ArrayList arrayList = new ArrayList(list);
            int m120299K = AbstractC23280z4.m120299K(list, mediaItem);
            MediaPickerView mediaPickerView = this.f65951c1;
            if (mediaPickerView != null && !mediaPickerView.m72190LN()) {
                z11 = false;
                this.f65968t1 = new LandingPageView(LandingPageView.m71644lP(4, EnumC22962a.f111693q, m120299K, 0, z11, "", "", "", ""), list, arrayList);
                m71097IM();
                this.f65965q1 = c20275e;
                if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(getContext())) {
                    C3979l m108841w = AbstractC20826v0.m108841w(AbstractC23280z4.m120361x(mediaItem), Integer.valueOf(AbstractC23006a0.m117875E()), Integer.valueOf(C23278z2.m120136k0().f116260a), Integer.valueOf(AbstractC23006a0.m117871A()), Integer.valueOf(AbstractC23006a0.m117873C()), Integer.valueOf(AbstractC23006a0.m117928x()));
                    if (this.f65964p1 == null && animationTarget != null && m108841w != null && m108841w.m18839c() != null) {
                        C20275e c20275e2 = this.f65965q1;
                        if (c20275e2 != null) {
                            c20275e2.m105864J(m108841w);
                        }
                        this.f65964p1.setRounded(c20275e.m105874i());
                        this.f65964p1.expand(animationTarget, m108841w);
                    } else {
                        m71169lO(true);
                    }
                    this.f65915J1.sendEmptyMessageDelayed(2, 800L);
                }
                m71169lO(true);
                this.f65915J1.sendEmptyMessageDelayed(2, 800L);
            }
            z11 = true;
            this.f65968t1 = new LandingPageView(LandingPageView.m71644lP(4, EnumC22962a.f111693q, m120299K, 0, z11, "", "", "", ""), list, arrayList);
            m71097IM();
            this.f65965q1 = c20275e;
            if (!AbstractC23171p0.m119371c()) {
                C3979l m108841w2 = AbstractC20826v0.m108841w(AbstractC23280z4.m120361x(mediaItem), Integer.valueOf(AbstractC23006a0.m117875E()), Integer.valueOf(C23278z2.m120136k0().f116260a), Integer.valueOf(AbstractC23006a0.m117871A()), Integer.valueOf(AbstractC23006a0.m117873C()), Integer.valueOf(AbstractC23006a0.m117928x()));
                if (this.f65964p1 == null) {
                }
                m71169lO(true);
                this.f65915J1.sendEmptyMessageDelayed(2, 800L);
            }
            m71169lO(true);
            this.f65915J1.sendEmptyMessageDelayed(2, 800L);
        }
    }

    /* renamed from: DO */
    public void m71207DO() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72232hP();
        }
    }

    /* renamed from: EO */
    public void m71208EO(boolean z11) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72234iP(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            if (this.f65962n1 && m71246WM()) {
                actionBarMenu.m92750r();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FN */
    public void m71209FN(MediaItem mediaItem) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72186IO(mediaItem);
            this.f65951c1.m72202Pq();
            this.f65951c1.m72232hP();
        }
    }

    /* renamed from: GG */
    public void m71210GG(String str, boolean z11) {
        if (this.f65925O1) {
            return;
        }
        try {
            List m71277nM = m71277nM();
            if (m71225Od() && !m71277nM.isEmpty()) {
                C2526d.f10270a.m12714i(str, this.f65923N1, z11, m71277nM);
            }
            this.f65925O1 = true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.quick_picker_view, viewGroup, false);
        this.f65977z0 = inflate;
        inflate.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.picker.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                QuickPickerView.this.m71168lN(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        m92637BK(true);
        return this.f65977z0;
    }

    /* renamed from: GN */
    public void m71211GN(String str) {
        MediaItem m72231hN;
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null && (m72231hN = mediaPickerView.m72231hN(str)) != null) {
            m71209FN(m72231hN);
        }
    }

    /* renamed from: GO */
    public void m71212GO(int i11) {
        if (i11 == this.f65969u1) {
            return;
        }
        this.f65969u1 = i11;
        if (this.f65952d1 != null) {
            if (m71254ZL() == 102) {
                m71098IN();
                m71223OM(this.f65969u1);
            } else {
                this.f65953e1 = true;
            }
        }
    }

    /* renamed from: HM */
    public void m71213HM(EnumC18030a enumC18030a, String str, int i11, C11598e.e eVar) {
        C32084r m120721w = AbstractC23306f.m120721w();
        m120721w.m154793j(enumC18030a);
        m71227PN(m120721w.m154790g(enumC18030a, !C18644n.m98531l().m98558u(str), this.f88762c0.m92676n2().mo35576n3(), AbstractC25495a.m132078c(str), i11, eVar, C31986k3.f147083a.m154105P1(str)));
    }

    /* renamed from: HO */
    public void m71214HO() {
        int i11;
        float f11;
        try {
            m71083CO();
            TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
            if (touchInterceptionFrameLayout != null) {
                if (this.f65942X0 == -1) {
                    f11 = this.f65910H0;
                } else {
                    f11 = this.f65904E0;
                }
                touchInterceptionFrameLayout.setPosition(f11);
            }
            ChangeableHeightRelativeLayout changeableHeightRelativeLayout = this.f65973x0;
            if (changeableHeightRelativeLayout != null) {
                if (this.f65942X0 == -1) {
                    i11 = this.f65910H0;
                } else {
                    i11 = this.f65906F0;
                }
                changeableHeightRelativeLayout.setHeight(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C12667b c12667b = this.f65905E1;
        if (c12667b != null) {
            c12667b.m71350b();
            ((RelativeLayout) this.f65977z0).removeView(this.f65905E1.m71351e());
            this.f65905E1 = null;
        }
    }

    /* renamed from: IO */
    public void m71215IO(boolean z11) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72240mP(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AnimationLayout animationLayout = this.f65964p1;
        if (animationLayout != null) {
            animationLayout.detachFromActivity();
        }
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72205RM(null);
            this.f65951c1.m72199PM(null);
            this.f65951c1.m72189JO(null);
            this.f65951c1.m72193MO();
        }
    }

    /* renamed from: JO */
    public void m71216JO(List list, List list2) {
        try {
            MediaPickerView mediaPickerView = this.f65951c1;
            if (mediaPickerView != null) {
                mediaPickerView.m72242nP(list, list2);
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.picker.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickPickerView.this.m71291wN();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Jz */
    public void mo71217Jz(View view, final MotionEvent motionEvent, float f11, float f12, boolean z11) {
        InterfaceC12658t interfaceC12658t;
        if (this.f65908G0) {
            return;
        }
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null && (mediaPickerView.m72200PN() || !this.f65951c1.m72192MN())) {
            return;
        }
        StickerPanelView stickerPanelView = this.f65952d1;
        if (stickerPanelView != null && stickerPanelView.m72710uN()) {
            return;
        }
        if (!this.f65901C1 && (interfaceC12658t = this.f65972w1) != null) {
            this.f65901C1 = true;
            interfaceC12658t.mo71320q();
        }
        final float position = this.f65975y0.getPosition();
        if (!z11) {
            this.f65915J1.post(new Runnable() { // from class: com.zing.zalo.ui.picker.t
                @Override // java.lang.Runnable
                public final void run() {
                    QuickPickerView.this.m71171mN(motionEvent, position);
                }
            });
        } else {
            this.f65915J1.post(new Runnable() { // from class: com.zing.zalo.ui.picker.u
                @Override // java.lang.Runnable
                public final void run() {
                    QuickPickerView.this.m71173nN(motionEvent, position);
                }
            });
        }
    }

    /* renamed from: KN */
    public void m71218KN() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72191LO();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        this.f65896A0 = motionEvent.getRawY();
        this.f65898B0 = this.f65975y0.getPosition();
        this.f65918L0 = false;
    }

    /* renamed from: MN */
    public void m71220MN(int i11) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72198OO(i11);
        }
    }

    /* renamed from: NN */
    public void m71221NN(int i11) {
        C12669c c12669c;
        if (this.f65943X1 != null && (c12669c = this.f65941W1) != null) {
            this.f65943X1.m9837K1(c12669c.m71357M(i11));
        }
    }

    /* renamed from: Nf */
    public void m71222Nf(List list) {
        if (this.f65951c1 != null && list != null && list.size() > 0) {
            this.f65951c1.m72196Nf(list);
            m71291wN();
        }
    }

    /* renamed from: OM */
    public void m71223OM(int i11) {
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        int i14;
        EnumC22962a enumC22962a = this.f65926P0;
        EnumC22962a enumC22962a2 = EnumC22962a.f111694r;
        if (enumC22962a == enumC22962a2) {
            i12 = 250;
        } else if (enumC22962a != EnumC22962a.f111693q && enumC22962a != EnumC22962a.f111695s) {
            i12 = 0;
        } else {
            i12 = 251;
        }
        if (i11 == 1) {
            if (i12 == 250) {
                i14 = 29;
            } else {
                i14 = 25;
            }
            if (this.f65922N0) {
                i14 |= 2;
            }
            i13 = i14;
            z11 = true;
        } else {
            z11 = false;
            i13 = 1;
        }
        if (i11 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (enumC22962a == enumC22962a2 && ((C3570a) C3570a.Companion.m122672a()).m18143l()) {
            z13 = true;
        } else {
            z13 = false;
        }
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, z11, true, null, null, false, i12, this.f65917K1, z12, i13, AbstractC16781w.indicator_bg_color, z12, m71143dM() + this.f65913I1, this.f65924O0, z13);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f65952d1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        this.f65952d1.m72708nO(this.f65919L1);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.update_status_draggable_layout, this.f65952d1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m71119PM();
        }
    }

    /* renamed from: ON */
    public void m71224ON(ChangeableHeightRelativeLayout changeableHeightRelativeLayout) {
        this.f65973x0 = changeableHeightRelativeLayout;
        int i11 = this.f65906F0;
        if (i11 > 0) {
            changeableHeightRelativeLayout.setHeight(i11);
        }
    }

    /* renamed from: Od */
    public boolean m71225Od() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null && mediaPickerView.m72190LN()) {
            return true;
        }
        return false;
    }

    /* renamed from: PL */
    public boolean m71226PL() {
        ZinstantOAFullMenuControl zinstantOAFullMenuControl;
        int i11 = this.f65942X0;
        if ((i11 != 109 && i11 != 110) || (zinstantOAFullMenuControl = this.f65945Y1) == null || zinstantOAFullMenuControl.getCurrentZinstantDataVersion() != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: PN */
    public void m71227PN(List list) {
        if (list.size() == 0) {
            return;
        }
        this.f65939V1.clear();
        this.f65939V1.addAll(list);
        C12669c c12669c = this.f65941W1;
        if (c12669c != null) {
            c12669c.m71359O(list);
            this.f65941W1.m10008p();
        }
        m71121QL();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        InterfaceC12657s interfaceC12657s;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (this.f65968t1 != null && m71255ZM()) {
            return this.f65968t1.mo37491QJ(i11);
        }
        if (i11 == 16908332) {
            if (this.f65958j1 && (interfaceC12657s = this.f65976y1) != null && interfaceC12657s.mo45275b()) {
                return true;
            }
            if (this.f65951c1 != null) {
                m71194uN(5);
                if (System.currentTimeMillis() - this.f65963o1 < 300 || this.f65951c1.m72195NN()) {
                    return true;
                }
                if (this.f65926P0 == EnumC22962a.f111694r && this.f65962n1 && this.f65955g1 != 9) {
                    if (this.f65951c1.m72253xN()) {
                        m71158iO();
                    } else {
                        m71181qM();
                    }
                    return true;
                }
                if (this.f65975y0.getPosition() == this.f65902D0 && !this.f65921M1) {
                    this.f65951c1.m72198OO(0);
                    m71295yO();
                    return true;
                }
            }
            if (!this.f65921M1) {
                m71295yO();
            }
            return true;
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QN */
    public void m71228QN(InterfaceC12661w interfaceC12661w) {
        this.f65937U1 = interfaceC12661w;
    }

    /* renamed from: RF */
    public void m71229RF() {
        ZinstantOAFullMenuControl zinstantOAFullMenuControl = this.f65945Y1;
        if (zinstantOAFullMenuControl != null) {
            zinstantOAFullMenuControl.m88910l();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C12669c c12669c = this.f65941W1;
        if (c12669c != null) {
            c12669c.m71361Q();
        }
    }

    /* renamed from: RL */
    public List m71230RL() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            return mediaPickerView.m72209TM();
        }
        return new ArrayList();
    }

    /* renamed from: RN */
    public void m71231RN(int i11) {
        this.f65942X0 = i11;
    }

    /* renamed from: S4 */
    public void m71232S4(List list) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72199PM(list);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        boolean z11;
        super.mo37118SJ(bundle);
        try {
            C20556f c20556f = this.f65940W0;
            if (c20556f != null) {
                bundle.putString("cameraImageUri", c20556f.m106842o());
            }
            bundle.putInt("currentMode", this.f65942X0);
            TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
            if (touchInterceptionFrameLayout != null) {
                float position = touchInterceptionFrameLayout.getPosition();
                float f11 = this.f65904E0;
                if (position == f11) {
                    bundle.putFloat("currentTranslation", f11);
                }
            }
            bundle.putSerializable("saveQuickPickerSource", this.f65926P0);
            bundle.putSerializable("extra_media_picker_sub_source", this.f65928Q0);
            bundle.putInt("modeStickerPanel", this.f65969u1);
            bundle.putInt("quickMediaGridInitializedHeight", this.f65906F0);
            bundle.putBoolean("isShowingLanding", this.f65899B1);
            bundle.putBoolean("mEnableLocationSlidingUp", this.f65944Y0);
            bundle.putBoolean("mEnableVoiceSlidingUP", this.f65946Z0);
            bundle.putBoolean("mEnableBgFeedSlidingUp", this.f65948a1);
            bundle.putBoolean("mEnableZinstantOAMenuSlidingUp", this.f65950b1);
            bundle.putInt("mZinstantOAHeight", this.f65911H1);
            if (m71237TM()) {
                ZaloCameraView m94488d = EnumC17910b.INSTANCE.m94488d();
                if (this.f65905E1 != null && m94488d != null && this.f88762c0.m92676n2().mo35579p().m93012K0() == m94488d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bundle.putBoolean("restoreCameraListener", z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: SM */
    public boolean m71233SM() {
        return this.f65916K0;
    }

    /* renamed from: SN */
    public void m71234SN(boolean z11) {
        this.f65958j1 = z11;
        m71166kO();
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        TouchInterceptionFrameLayout touchInterceptionFrameLayout;
        try {
            this.f65901C1 = false;
            this.f65918L0 = true;
            this.f65896A0 = 0.0f;
            this.f65898B0 = 0.0f;
            StickerPanelView stickerPanelView = this.f65952d1;
            if ((stickerPanelView != null && stickerPanelView.m72710uN()) || (touchInterceptionFrameLayout = this.f65975y0) == null || touchInterceptionFrameLayout.getVisibility() != 0 || this.f65908G0) {
                return;
            }
            float position = this.f65975y0.getPosition();
            if (!z11) {
                if (position > this.f65904E0 - this.f65914J0 && !this.f65921M1) {
                    m71295yO();
                    return;
                }
                if (position > this.f65902D0) {
                    m71194uN(2);
                    m71199xO();
                    return;
                }
                this.f65916K0 = false;
                InterfaceC12663y interfaceC12663y = this.f65935T1;
                if (interfaceC12663y != null && this.f65951c1 != null) {
                    interfaceC12663y.mo45289n();
                    if (!this.f65962n1 && m71246WM()) {
                        this.f65962n1 = true;
                        invalidateOptionsMenu();
                        mo37493TJ();
                    }
                    this.f65951c1.m72222ZO(true);
                    this.f65951c1.m72232hP();
                    return;
                }
                return;
            }
            float f11 = this.f65902D0;
            float f12 = this.f65914J0;
            if (position <= f11 + f12) {
                m71199xO();
                return;
            }
            float f13 = this.f65904E0;
            if ((position < f13 || position <= f13 + f12) && !this.f65921M1) {
                m71194uN(6);
                m71295yO();
            } else if (position > f13 + f12) {
                m71194uN(8);
                m71289vO();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBar actionBar;
        String m118743r0;
        int i11;
        super.mo37493TJ();
        try {
            if (m92648SI() != null && m92674mJ() && (actionBar = this.f88760a0) != null && this.f65977z0 != null) {
                actionBar.setTitleAlignCenter(true);
                this.f88760a0.setTitle("");
                final TextView titleTextView = this.f88760a0.getTitleTextView();
                MediaPickerView mediaPickerView = this.f65951c1;
                if (mediaPickerView != null && this.f65962n1) {
                    String m72223aN = mediaPickerView.m72223aN();
                    this.f88760a0.setTitle(m72223aN + " ");
                    titleTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC19694b.m103336d(this.f88760a0.getContext(), AbstractC16803z.icn_arrow_dropdown), (Drawable) null);
                    titleTextView.setCompoundDrawablePadding(AbstractC23222t7.f112562h);
                    titleTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.picker.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            QuickPickerView.this.m71176oN(view);
                        }
                    });
                    if (this.f65926P0 == EnumC22962a.f111694r) {
                        if (this.f65932S0) {
                            if (this.f65934T0) {
                                i11 = AbstractC8020f0.str_media_grid_full_subtitle_action_bar_community;
                            } else {
                                i11 = AbstractC8020f0.str_media_grid_full_subtitle_action_bar_group;
                            }
                            m118743r0 = AbstractC23136l9.m118743r0(i11);
                        } else if (this.f65921M1) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_to_my_cloud_title);
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_grid_full_subtitle_action_bar_1_1);
                        }
                        this.f88760a0.setSubtitle(String.format(m118743r0, this.f65930R0));
                        ActionBar actionBar2 = this.f88760a0;
                        actionBar2.setSubTitleColor(C23212s8.m119607o(actionBar2.getContext(), AbstractC21196a.TextColor2));
                        this.f88760a0.getSubtitleTextView().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.picker.p
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                titleTextView.performClick();
                            }
                        });
                    }
                }
                ActionBar actionBar3 = this.f88760a0;
                actionBar3.setTitleColor(C23212s8.m119607o(actionBar3.getContext(), AbstractC21196a.TextColor1));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
                ActionBar actionBar4 = this.f88760a0;
                actionBar4.setBackgroundColor(C23212s8.m119607o(actionBar4.getContext(), AbstractC16781w.HeaderFormColor));
                m71166kO();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TL */
    public void m71236TL(boolean z11) {
        this.f65924O0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: TM */
    public boolean m71237TM() {
        return m71246WM();
    }

    /* renamed from: TN */
    public void m71238TN(InterfaceC12655q interfaceC12655q) {
        this.f65970v1 = new C12645g(interfaceC12655q);
    }

    /* renamed from: UL */
    public void m71239UL(boolean z11) {
        this.f65922N0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: UM */
    public boolean m71240UM() {
        if (this.f65942X0 != 106 || !AbstractC23309i.m121232Ne() || this.f88762c0.m92676n2().mo35576n3() || this.f88762c0.m92676n2().mo35586v2() || C20024r.m103945n() || m71132XM() || AbstractC23933a.m125287b(MainApplication.getAppContext(), "com.samsung.svmc.smm", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: UN */
    public void m71241UN(boolean z11) {
        QuickPickerView quickPickerView;
        this.f65921M1 = z11;
        TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
        if (!z11) {
            quickPickerView = this;
        } else {
            quickPickerView = null;
        }
        touchInterceptionFrameLayout.setScrollInterceptionListener(quickPickerView);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m71229RF();
    }

    /* renamed from: VL */
    public List m71242VL() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            return mediaPickerView.m72213VM();
        }
        return new ArrayList();
    }

    /* renamed from: VM */
    public boolean m71243VM(ArrayList arrayList) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null && mediaPickerView.m72188JN(arrayList)) {
            return true;
        }
        return false;
    }

    /* renamed from: VN */
    public void m71244VN(InterfaceC12656r interfaceC12656r) {
        this.f65978z1 = interfaceC12656r;
    }

    /* renamed from: WL */
    public BackgroundPickerView m71245WL() {
        return this.f65961m1;
    }

    /* renamed from: WM */
    public boolean m71246WM() {
        int i11 = this.f65942X0;
        return i11 == 100 || i11 == 101 || i11 == 106;
    }

    /* renamed from: WN */
    public void m71247WN(InterfaceC12657s interfaceC12657s) {
        this.f65976y1 = interfaceC12657s;
    }

    /* renamed from: XL */
    public View m71248XL() {
        StickerPanelView stickerPanelView = this.f65952d1;
        if (stickerPanelView == null) {
            return null;
        }
        return stickerPanelView.m72699UM();
    }

    /* renamed from: XN */
    public void m71249XN(InterfaceC12658t interfaceC12658t) {
        this.f65972w1 = interfaceC12658t;
    }

    /* renamed from: Xv */
    public void m71250Xv(List list) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72189JO(list);
            this.f65951c1.m72202Pq();
        }
    }

    /* renamed from: YM */
    public boolean m71251YM() {
        ZaloCameraView m94488d = EnumC17910b.INSTANCE.m94488d();
        if (m94488d != null) {
            return m94488d.f40833A1;
        }
        return false;
    }

    /* renamed from: YN */
    public void m71252YN(InterfaceC12659u interfaceC12659u) {
        this.f65974x1 = interfaceC12659u;
    }

    /* renamed from: Yg */
    public boolean m71253Yg() {
        String str = this.f65923N1;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        m71150fO();
        m71108LM();
        m71166kO();
        m71122QM();
        m71191tN();
        try {
            if (m92656bJ() != null) {
                m92656bJ().setClickable(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ZL */
    public int m71254ZL() {
        return this.f65942X0;
    }

    /* renamed from: ZM */
    public boolean m71255ZM() {
        LandingPageView landingPageView;
        if (this.f65899B1 && (landingPageView = this.f65968t1) != null && landingPageView.m92674mJ()) {
            return true;
        }
        return false;
    }

    /* renamed from: ZN */
    public void m71256ZN(int i11) {
        this.f65913I1 = i11;
    }

    /* renamed from: aM */
    public View m71257aM() {
        StickerPanelView stickerPanelView = this.f65952d1;
        if (stickerPanelView == null) {
            return null;
        }
        return stickerPanelView.m72700VM();
    }

    /* renamed from: aO */
    public void m71258aO(InterfaceC12662x interfaceC12662x) {
        this.f65897A1 = interfaceC12662x;
    }

    /* renamed from: b7 */
    public void m71259b7(int i11) {
        boolean z11;
        if (this.f65939V1.isEmpty()) {
            return;
        }
        for (C20564a c20564a : this.f65939V1) {
            if (i11 == c20564a.m106977a()) {
                z11 = true;
            } else {
                z11 = false;
            }
            c20564a.m106983g(z11);
        }
        C12669c c12669c = this.f65941W1;
        if (c12669c != null) {
            c12669c.m10008p();
        }
        m71121QL();
    }

    /* renamed from: bM */
    public View m71260bM() {
        StickerPanelView stickerPanelView = this.f65952d1;
        if (stickerPanelView == null) {
            return null;
        }
        return stickerPanelView.m72701WM();
    }

    /* renamed from: bO */
    public void m71261bO(InterfaceC12663y interfaceC12663y) {
        this.f65935T1 = interfaceC12663y;
    }

    /* renamed from: bd */
    public void m71262bd() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72226bd();
        }
    }

    /* renamed from: cM */
    public View m71263cM(int i11) {
        C12669c c12669c;
        if (this.f65943X1 != null && (c12669c = this.f65941W1) != null) {
            return this.f65943X1.getChildAt(c12669c.m71357M(i11));
        }
        return null;
    }

    /* renamed from: cO */
    public void m71264cO(InterfaceC12664z interfaceC12664z) {
        this.f65933S1 = interfaceC12664z;
    }

    /* renamed from: dO */
    public void m71265dO(boolean z11) {
        this.f65962n1 = z11;
    }

    /* renamed from: eO */
    public void m71266eO(boolean z11) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72222ZO(z11);
        }
    }

    /* renamed from: fM */
    public View m71267fM() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            return mediaPickerView.m72218XM();
        }
        return null;
    }

    /* renamed from: gO */
    public void m71268gO(InterfaceC19397b interfaceC19397b) {
        this.f65949a2.m101523k(interfaceC19397b);
    }

    /* renamed from: gt */
    public void m71269gt(int i11) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72230gt(i11);
            m71291wN();
        }
    }

    /* renamed from: hM */
    public View m71270hM() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            return mediaPickerView.m72225bN();
        }
        return null;
    }

    /* renamed from: hO */
    public void m71271hO(boolean z11) {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowVideoPicker when fragment is not added to activity");
            return;
        }
        this.f65942X0 = 108;
        m71087EM();
        m71162jO(this.f65951c1, false);
        m71162jO(this.f65960l1, false);
        m71162jO(this.f65961m1, true);
        if (!z11) {
            m71162jO(this.f65952d1, false);
        }
        m71201yM();
        m71203zM();
        RecyclerView recyclerView = this.f65943X1;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        this.f65915J1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.picker.f
            @Override // java.lang.Runnable
            public final void run() {
                QuickPickerView.this.m71188sN();
            }
        }, 150L);
    }

    /* renamed from: iM */
    public int m71272iM() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            return mediaPickerView.m72233iN();
        }
        return 0;
    }

    /* renamed from: lM */
    public View m71273lM(int i11) {
        try {
            RecyclerView recyclerView = this.f65943X1;
            if (recyclerView != null && recyclerView.getLayoutManager() != null) {
                for (int i12 = 0; i12 < this.f65939V1.size(); i12++) {
                    if (((C20564a) this.f65939V1.get(i12)).m106977a() == i11) {
                        return this.f65943X1.getLayoutManager().mo9732P(i12);
                    }
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        int i11;
        StickerPanelView stickerPanelView;
        InterfaceC12662x interfaceC12662x = this.f65897A1;
        if ((interfaceC12662x != null && interfaceC12662x.mo71344n()) || (i11 = this.f65942X0) == 102 || i11 == 103 || i11 == 107) {
            return false;
        }
        if (i11 == 104 && !this.f65944Y0) {
            return false;
        }
        if (i11 == 108 && !this.f65948a1) {
            return false;
        }
        if (i11 == 105 && !this.f65946Z0) {
            return false;
        }
        if ((i11 == 109 || i11 == 110) && !this.f65950b1) {
            return false;
        }
        if (!this.f65916K0 && z11 && Math.abs(f12) < this.f65920M0) {
            return false;
        }
        MediaPickerView mediaPickerView = this.f65951c1;
        if ((mediaPickerView != null && mediaPickerView.m72200PN()) || this.f65958j1) {
            return false;
        }
        float position = this.f65975y0.getPosition();
        if (this.f65942X0 != 100 && Math.abs(f11) > Math.abs(f12) && (!this.f65916K0 || ((stickerPanelView = this.f65952d1) != null && stickerPanelView.m92687sJ() && this.f65952d1.m72710uN()))) {
            return false;
        }
        if (!z12) {
            if (position <= this.f65902D0 && !this.f65916K0) {
                return false;
            }
            return true;
        }
        MediaPickerView mediaPickerView2 = this.f65951c1;
        if ((mediaPickerView2 == null || mediaPickerView2.m92679oJ() || !this.f65951c1.m72192MN()) && !this.f65916K0) {
            return false;
        }
        return true;
    }

    /* renamed from: mM */
    public View m71275mM() {
        StickerPanelView stickerPanelView = this.f65952d1;
        if (stickerPanelView == null) {
            return null;
        }
        return stickerPanelView.m72703bN();
    }

    /* renamed from: mO */
    public void m71276mO(SensitiveData sensitiveData) {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowVideoPicker when fragment is not added to activity");
            return;
        }
        this.f65942X0 = 104;
        m71105KM(sensitiveData);
        m71162jO(this.f65951c1, false);
        m71162jO(this.f65960l1, true);
        m71162jO(this.f65961m1, false);
        m71201yM();
        m71203zM();
        m71162jO(this.f65952d1, false);
        RecyclerView recyclerView = this.f65943X1;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        if (!this.f65944Y0 && this.f65960l1.m72043jN() != null) {
            int m71143dM = (this.f65910H0 - m71143dM()) - this.f65912I0;
            if (this.f65960l1.m72043jN().getHeight() == 0 || this.f65960l1.m72043jN().getHeight() != m71143dM) {
                this.f65960l1.m72043jN().getLayoutParams().height = m71143dM;
                this.f65960l1.m72043jN().requestLayout();
            }
        }
        m71197wO();
    }

    /* renamed from: nM */
    public List m71277nM() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            return mediaPickerView.m72245qN();
        }
        return new ArrayList();
    }

    /* renamed from: oM */
    public Conversation m71278oM() {
        return this.f65936U0;
    }

    /* renamed from: oO */
    public void m71279oO(boolean z11, SensitiveData sensitiveData) {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowVideoPicker when fragment is not added to activity");
            return;
        }
        this.f65957i1 = z11;
        C32050o7.m154655h().m154664n(System.currentTimeMillis());
        this.f65942X0 = 106;
        this.f65955g1 = 16;
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView == null) {
            m71112MM(z11, sensitiveData);
        } else {
            mediaPickerView.m72207SN(16, sensitiveData);
        }
        if (this.f65951c1 != null) {
            m71093GM();
            m71162jO(this.f65951c1, true);
            m71074AN(z11);
            mo37493TJ();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            switch (i11) {
                case 11111:
                    m71187sM(i12, intent);
                    break;
                case 11112:
                case 11113:
                    m71193uM(i12, intent);
                    break;
                case 11114:
                    m71190tM(i12, intent);
                    break;
            }
            m71126SL(i11, i12, intent);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        InterfaceC12657s interfaceC12657s;
        if (i11 == 4) {
            try {
                if (this.f65968t1 != null && m71255ZM()) {
                    return this.f65968t1.onKeyUp(i11, keyEvent);
                }
                if (this.f65908G0) {
                    return true;
                }
                if (this.f65958j1 && (interfaceC12657s = this.f65976y1) != null && interfaceC12657s.mo45275b()) {
                    return true;
                }
                MediaPickerView mediaPickerView = this.f65951c1;
                if (mediaPickerView != null) {
                    if (mediaPickerView.m72195NN()) {
                        return true;
                    }
                    if (this.f65975y0.getPosition() == this.f65902D0 && !this.f65921M1) {
                        m71194uN(5);
                        this.f65951c1.m72198OO(0);
                        m71295yO();
                        return true;
                    }
                }
                if (this.f65962n1 && !this.f65921M1) {
                    m71194uN(5);
                    m71295yO();
                    return true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 114 && strArr.length != 0 && iArr.length != 0) {
            int length = iArr.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (iArr[i12] != 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    C12667b c12667b = this.f65905E1;
                    if (c12667b != null) {
                        c12667b.m71353h();
                        if (!this.f65905E1.f66008h) {
                            this.f65951c1.m72228fN(new int[2]);
                        }
                    }
                }
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
    }

    /* renamed from: oq */
    public void m71280oq(List list) {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72205RM(list);
            this.f65951c1.m72232hP();
            this.f65951c1.m72198OO(0);
            this.f65951c1.m72202Pq();
        }
    }

    /* renamed from: pO */
    public void m71281pO(boolean z11, SensitiveData sensitiveData) {
        int i11;
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowPhotoPicker when fragment is not added to activity");
            return;
        }
        C32050o7.m154655h().m154664n(System.currentTimeMillis());
        this.f65942X0 = 100;
        if (this.f65926P0 == EnumC22962a.f111694r) {
            i11 = 3;
        } else {
            i11 = 15;
        }
        this.f65955g1 = i11;
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView == null) {
            m71112MM(false, sensitiveData);
        } else {
            mediaPickerView.m72210TN(i11, sensitiveData);
        }
        if (this.f65951c1 != null) {
            m71093GM();
            m71162jO(this.f65951c1, true);
            m71074AN(z11);
            mo37493TJ();
        }
    }

    /* renamed from: qO */
    public void m71282qO(EnumC18030a enumC18030a, String str, int i11, C11598e.e eVar) {
        this.f65942X0 = 107;
        m71124RM(enumC18030a, str, i11, eVar);
        this.f65943X1.bringToFront();
        this.f65943X1.setVisibility(0);
        m71162jO(this.f65952d1, false);
        m71162jO(this.f65951c1, false);
        m71162jO(this.f65960l1, false);
        m71201yM();
        m71203zM();
        m71197wO();
    }

    /* renamed from: rO */
    public void m71283rO() {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "showStickerPicker when fragment is not added to activity");
            return;
        }
        this.f65942X0 = 102;
        RecyclerView recyclerView = this.f65943X1;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        m71162jO(this.f65951c1, false);
        m71162jO(this.f65960l1, false);
        m71162jO(this.f65961m1, false);
        m71201yM();
        m71203zM();
        m71197wO();
        if (this.f65953e1) {
            m71098IN();
            this.f65953e1 = false;
        }
        StickerPanelView stickerPanelView = this.f65952d1;
        if (stickerPanelView == null) {
            m71223OM(this.f65969u1);
            return;
        }
        if (stickerPanelView.m92679oJ()) {
            m71162jO(this.f65952d1, true);
        } else {
            C23744a.m124114c().m124116d(8005, new Object[0]);
        }
        C23744a.m124114c().m124116d(8006, Integer.valueOf(m71143dM() + this.f65913I1));
    }

    /* renamed from: sO */
    public void m71284sO(boolean z11, SensitiveData sensitiveData) {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowVideoPicker when fragment is not added to activity");
            return;
        }
        this.f65942X0 = 101;
        this.f65955g1 = 9;
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView == null) {
            m71112MM(false, sensitiveData);
        } else {
            mediaPickerView.m72212UN(9, sensitiveData);
        }
        if (this.f65951c1 != null) {
            m71093GM();
            m71162jO(this.f65951c1, true);
            m71074AN(z11);
        }
    }

    /* renamed from: tO */
    public void m71285tO() {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowVideoPicker when fragment is not added to activity");
            return;
        }
        this.f65942X0 = 105;
        m71162jO(this.f65951c1, false);
        m71162jO(this.f65960l1, false);
        m71162jO(this.f65952d1, false);
        RecyclerView recyclerView = this.f65943X1;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        InterfaceC12663y interfaceC12663y = this.f65935T1;
        if (interfaceC12663y != null) {
            interfaceC12663y.mo45282g();
        }
        m71203zM();
        m71197wO();
    }

    /* renamed from: uO */
    public void m71286uO(int i11) {
        if (!m92674mJ()) {
            AbstractC23350e.m122774d("QuickPickerView", "ShowVideoPicker when fragment is not added to activity");
            return;
        }
        if (this.f65945Y1.getLayoutParams().height != i11) {
            this.f65911H1 = i11;
            this.f65945Y1.getLayoutParams().height = i11;
            this.f65945Y1.requestLayout();
        }
        this.f65942X0 = 109;
        this.f65945Y1.setVisibility(0);
        m71162jO(this.f65951c1, false);
        m71162jO(this.f65960l1, false);
        m71201yM();
        m71162jO(this.f65952d1, false);
        RecyclerView recyclerView = this.f65943X1;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        m71197wO();
    }

    /* renamed from: vM */
    public void m71287vM() {
        this.f65915J1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.picker.m
            @Override // java.lang.Runnable
            public final void run() {
                QuickPickerView.this.m71144dN();
            }
        }, 300L);
    }

    /* renamed from: vN */
    public void m71288vN(int i11) {
        ZinstantOAFullMenuControl zinstantOAFullMenuControl = this.f65945Y1;
        if (zinstantOAFullMenuControl != null) {
            zinstantOAFullMenuControl.m88909k(i11);
        }
    }

    /* renamed from: vO */
    public void m71289vO() {
        int i11;
        m71083CO();
        View view = this.f65973x0;
        if (view != null) {
            i11 = this.f65910H0;
        } else {
            i11 = 0;
        }
        if (view == null) {
            view = this.f65900C0;
        }
        AbstractC23202r9.m119545m(this.f65975y0, view, this.f65910H0, i11, null, -(0.0f - 0), new C12641c());
    }

    /* renamed from: wM */
    public boolean m71290wM() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null && mediaPickerView.m72254yN()) {
            return true;
        }
        return false;
    }

    /* renamed from: wN */
    public void m71291wN() {
        MediaPickerView mediaPickerView = this.f65951c1;
        if (mediaPickerView != null) {
            mediaPickerView.m72202Pq();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C20556f c20556f;
        EnumC22963b enumC22963b;
        super.mo37135xJ(bundle);
        try {
            if (bundle != null) {
                this.f65899B1 = bundle.getBoolean("isShowingLanding", false);
                this.f65944Y0 = bundle.getBoolean("mEnableLocationSlidingUp", false);
                this.f65946Z0 = bundle.getBoolean("mEnableVoiceSlidingUP", false);
                this.f65948a1 = bundle.getBoolean("mEnableBgFeedSlidingUp", false);
                this.f65950b1 = bundle.getBoolean("mEnableZinstantOAMenuSlidingUp", false);
                this.f65911H1 = bundle.getInt("mZinstantOAHeight", -1);
                if (bundle.containsKey("cameraImageUri")) {
                    c20556f = new C20556f(bundle.getString("cameraImageUri"));
                } else {
                    c20556f = null;
                }
                this.f65940W0 = c20556f;
                if (this.f65975y0 != null && bundle.containsKey("currentTranslation")) {
                    this.f65975y0.setPosition(bundle.getFloat("currentTranslation"));
                }
                this.f65926P0 = (EnumC22962a) bundle.get("saveQuickPickerSource");
                if (bundle.containsKey("extra_media_picker_sub_source")) {
                    Object obj = bundle.get("extra_media_picker_sub_source");
                    if (obj instanceof EnumC22963b) {
                        enumC22963b = (EnumC22963b) obj;
                    } else {
                        enumC22963b = EnumC22963b.f111700p;
                    }
                    this.f65928Q0 = enumC22963b;
                }
                this.f65969u1 = bundle.getInt("modeStickerPanel", 1);
                this.f65906F0 = bundle.getInt("quickMediaGridInitializedHeight");
                m71075AO();
                m71115NM();
                this.f65968t1 = (LandingPageView) m92649TI().m92996E0("LANDING_PAGE_VIEW_TAG");
                m71097IM();
                this.f65960l1 = (LocationPickerView) m92649TI().m92996E0("LocationPickerView");
                m71101JM();
                this.f65961m1 = (BackgroundPickerView) m92649TI().m92996E0("BackgroundPickerView");
                m71090FM();
                if (this.f65935T1 != null && m71255ZM()) {
                    this.f65935T1.mo45287l();
                    if (AbstractC23309i.m121232Ne()) {
                        C23744a.m124114c().m124116d(97, new Object[0]);
                    }
                }
                int i11 = this.f65942X0;
                if (i11 != 100 && i11 != 106 && i11 != 101) {
                    m71162jO(this.f65951c1, false);
                }
                m71079BO();
                m71174nO();
            } else {
                int i12 = this.f65956h1;
                if (i12 == 100 || i12 == 101 || i12 == 106 || this.f65959k1) {
                    this.f65942X0 = i12;
                    if (i12 == 101) {
                        this.f65955g1 = 9;
                    }
                    m71112MM(false, this.f65927P1);
                    if (this.f65951c1 != null) {
                        m71093GM();
                    }
                }
            }
            if (!this.f88762c0.m92676n2().mo35576n3()) {
                AnimationLayout animationLayout = new AnimationLayout(m92648SI());
                this.f65964p1 = animationLayout;
                animationLayout.setOnEventListener(new C12646h());
            }
            this.f65920M0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            InterfaceC12663y interfaceC12663y = this.f65935T1;
            if (interfaceC12663y != null) {
                interfaceC12663y.mo45286k(bundle);
            }
            EnumC22962a enumC22962a = this.f65926P0;
            if (enumC22962a != EnumC22962a.f111693q && enumC22962a != EnumC22962a.f111694r) {
                m71102JN();
            }
            m71095HN(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    public void m71292xM() {
        try {
            this.f65942X0 = -1;
            this.f65962n1 = false;
            TouchInterceptionFrameLayout touchInterceptionFrameLayout = this.f65975y0;
            if (touchInterceptionFrameLayout != null) {
                touchInterceptionFrameLayout.setPosition(this.f65910H0 - this.f65912I0);
                this.f65975y0.setVisibility(4);
                C12667b c12667b = this.f65905E1;
                if (c12667b != null && c12667b.m71351e() != null) {
                    this.f65905E1.m71351e().setVisibility(8);
                }
            }
            m71201yM();
            m71166kO();
            mo37493TJ();
            m71266eO(false);
            m71162jO(this.f65952d1, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xN */
    public void m71293xN(InterfaceC0887b interfaceC0887b) {
        this.f65947Z1 = interfaceC0887b;
        if (interfaceC0887b.mo2741e()) {
            m71191tN();
        } else {
            this.f65949a2.mo60356j();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: yJ */
    public void mo46830yJ(WindowInsets windowInsets) {
        super.mo46830yJ(windowInsets);
        m71150fO();
    }

    /* renamed from: yN, reason: merged with bridge method [inline-methods] */
    public void m71141cN(MediaItem mediaItem, String str) {
        int m3769e3;
        int i11;
        int i12;
        try {
            if (AbstractC23171p0.m119371c()) {
                MainApplication.m35468b0();
            }
            if (this.f65926P0 == EnumC22962a.f111694r) {
                m3769e3 = AbstractC0924m0.m4306w3();
            } else {
                m3769e3 = AbstractC0924m0.m3769e3();
            }
            MediaPickerView mediaPickerView = this.f65951c1;
            if (mediaPickerView != null) {
                i11 = mediaPickerView.m72239mN();
            } else {
                i11 = 0;
            }
            if (i11 < m3769e3) {
                if (!mediaItem.m41166q0()) {
                    mediaItem.m41099E0(str);
                }
                mediaItem.m41140d1(true);
                mediaItem.m41139c1(EnumC21281b.f103714u);
                MediaPickerView mediaPickerView2 = this.f65951c1;
                if (mediaPickerView2 != null) {
                    mediaPickerView2.m72183HM(mediaItem);
                    this.f88762c0.m92648SI().getContentResolver().notifyChange(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null);
                    this.f65951c1.m72232hP();
                    this.f65951c1.m72202Pq();
                }
                InterfaceC12657s interfaceC12657s = this.f65976y1;
                if (interfaceC12657s != null) {
                    interfaceC12657s.mo45276c(0);
                }
                this.f65915J1.sendEmptyMessageDelayed(1, 300L);
                return;
            }
            if (this.f65955g1 == 16) {
                i12 = AbstractC8020f0.str_upload_photo_video_reach_limit;
            } else {
                i12 = AbstractC8020f0.str_uploadphoto_reachlimit;
            }
            ToastUtils.showMess(String.format(m92652XI(i12), Integer.valueOf(m3769e3)));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: yO */
    public void m71295yO() {
        int i11;
        m71083CO();
        if (Float.compare(this.f65975y0.getPosition(), this.f65904E0) == 0) {
            return;
        }
        View view = this.f65973x0;
        if (view != null) {
            i11 = this.f65906F0;
        } else {
            i11 = (this.f65910H0 - this.f65906F0) - this.f65912I0;
        }
        int i12 = i11;
        if (view == null) {
            view = this.f65900C0;
        }
        AbstractC23202r9.m119537e(this.f65975y0, null, 150L, view, this.f65904E0, i12, null, -0.0f, new C12640b());
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yp */
    public boolean mo60294yp() {
        if (!m92677nJ() && !m92681pJ()) {
            return false;
        }
        return true;
    }

    /* renamed from: zN */
    public void m71296zN() {
        if (this.f65923N1 != null) {
            this.f65923N1 = "";
        }
        this.f65925O1 = false;
    }

    public QuickPickerView(C13306b c13306b) {
        this.f65896A0 = 0.0f;
        this.f65898B0 = 0.0f;
        this.f65902D0 = 0.0f;
        this.f65904E0 = 0.0f;
        this.f65906F0 = 0;
        this.f65908G0 = false;
        this.f65910H0 = 0;
        this.f65912I0 = 0;
        this.f65914J0 = 0.0f;
        this.f65916K0 = false;
        this.f65918L0 = false;
        this.f65926P0 = EnumC22962a.f111693q;
        this.f65928Q0 = EnumC22963b.f111700p;
        this.f65930R0 = "";
        this.f65932S0 = false;
        this.f65934T0 = false;
        this.f65938V0 = false;
        this.f65942X0 = -1;
        this.f65944Y0 = false;
        this.f65946Z0 = false;
        this.f65948a1 = false;
        this.f65950b1 = false;
        this.f65953e1 = false;
        this.f65954f1 = -1;
        this.f65955g1 = 15;
        this.f65956h1 = -1;
        this.f65957i1 = false;
        this.f65958j1 = false;
        this.f65959k1 = false;
        this.f65962n1 = false;
        this.f65963o1 = 0L;
        this.f65969u1 = 1;
        this.f65899B1 = false;
        this.f65901C1 = false;
        this.f65903D1 = false;
        this.f65907F1 = new int[2];
        this.f65911H1 = -1;
        this.f65913I1 = 0;
        this.f65915J1 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.ui.picker.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m71165kN;
                m71165kN = QuickPickerView.this.m71165kN(message);
                return m71165kN;
            }
        });
        this.f65917K1 = "";
        this.f65921M1 = false;
        this.f65923N1 = null;
        this.f65925O1 = false;
        this.f65927P1 = null;
        this.f65929Q1 = new C12647i();
        this.f65931R1 = 0;
        this.f65939V1 = new ArrayList();
        this.f65941W1 = null;
        this.f65947Z1 = null;
        this.f65949a2 = new C12644f();
        this.f65919L1 = c13306b;
    }
}
