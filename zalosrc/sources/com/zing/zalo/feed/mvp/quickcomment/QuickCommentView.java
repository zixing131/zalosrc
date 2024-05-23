package com.zing.zalo.feed.mvp.quickcomment;

import ac.InterfaceC0733x;
import ag0.C0820h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ar.AbstractC2298a0;
import ar.C2310k;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3020p0;
import bo.C3039t0;
import bo.C3051w0;
import c30.C3246i0;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.mvp.quickcomment.QuickCommentView;
import com.zing.zalo.feed.reactions.bottomsheet.C8840a;
import com.zing.zalo.feed.uicontrols.commentpreview.CommentPreviewView;
import com.zing.zalo.feed.uicontrols.suggestcomment.C8890a;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.settings.SettingTimelineV2View;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.clock.ClockListView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.FeedStickerSuggestView;
import com.zing.zalo.p077ui.zviews.PreviewStickerDialogView;
import com.zing.zalo.p077ui.zviews.TimelineSkeletonView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.C10881t;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.CommentSupportGifEditText;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18505l;
import gs.C19591a;
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20789d;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import l80.C22126c0;
import me0.AbstractC23041d2;
import me0.AbstractC23093i;
import me0.AbstractC23115k;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import nb0.C23672c;
import no.C23909b;
import no.C23912e;
import np.InterfaceC23923b;
import p006a0.C0012a;
import p084cs.AbstractC17569c;
import p084cs.C17567a;
import p084cs.C17570d;
import p109ds.C18062a;
import p109ds.C18063b;
import p109ds.C18064c;
import p172fy.C19171b;
import p243ip.C20647c;
import p243ip.C20648d;
import p243ip.C20649e;
import p243ip.InterfaceC20645a;
import p243ip.InterfaceC20646b;
import p262jb.AbstractC21196a;
import p302ko.C21785g;
import p304ks.AbstractC21935u;
import p322lf.AbstractC22470k;
import p330lp.C22633a;
import p330lp.C22634b;
import p330lp.C22635c;
import p330lp.C22636d;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p458qr.C25470c;
import p458qr.C25471d;
import p471r3.C25630b;
import p489rn.C25849b;
import p494rv.C25979a;
import p500s1.C26087b;
import p509sp.C26361j;
import p510sq.C26365a;
import p556ur.C27360c;
import p583vq.AbstractC28568a;
import p583vq.C28587j0;
import p584vr.InterfaceC28604a;
import p588vw.C28644j;
import p588vw.C28652r;
import p619wr.C29197d;
import p690yq.C31050b;
import p691yr.C31060j;
import p716zh.C31933ga;
import p716zh.C32002l4;
import p726zr.C32546b;
import pr.C24906b;
import sn.C26333b;
import th.AbstractC26681b;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;
import ti0.C26708g;
import tn.C26746f;
import vg.C28020b3;
import vg.C28209v3;
import w20.InterfaceC28698a;
import y90.EnumC30858b;
import y90.EnumC30861e;
import z90.AbstractC31727b;

/* loaded from: classes4.dex */
public class QuickCommentView extends BottomSheetZaloViewWithAnim implements InterfaceC8721b, InterfaceC20646b, C23744a.c, TextWatcher, InterfaceC28698a, InterfaceC0733x, InterfaceC23923b {

    /* renamed from: F2 */
    public static int f46766F2;

    /* renamed from: A1 */
    private TextView f46767A1;

    /* renamed from: B1 */
    private TextView f46769B1;

    /* renamed from: B2 */
    private C20649e f46770B2;

    /* renamed from: C1 */
    private View f46771C1;

    /* renamed from: C2 */
    private C16572d1 f46772C2;

    /* renamed from: D1 */
    private View f46773D1;

    /* renamed from: D2 */
    PreviewStickerDialogView f46774D2;

    /* renamed from: E1 */
    private CommentSupportGifEditText f46775E1;

    /* renamed from: F1 */
    private ImageButton f46777F1;

    /* renamed from: G1 */
    private RedDotImageButton f46778G1;

    /* renamed from: H1 */
    private RedDotImageButton f46779H1;

    /* renamed from: I1 */
    private View f46780I1;

    /* renamed from: J1 */
    RelativeLayout f46781J1;

    /* renamed from: K1 */
    RelativeLayout f46782K1;

    /* renamed from: L1 */
    Divider f46783L1;

    /* renamed from: M1 */
    private View f46784M1;

    /* renamed from: N1 */
    private ModulesView f46785N1;

    /* renamed from: O1 */
    private C18063b f46786O1;

    /* renamed from: P1 */
    private C18064c f46787P1;

    /* renamed from: Q1 */
    private C22126c0 f46788Q1;

    /* renamed from: R1 */
    private View f46789R1;

    /* renamed from: T1 */
    private RecyclerView f46791T1;

    /* renamed from: U1 */
    private LinearLayoutManager f46792U1;

    /* renamed from: V1 */
    private C8840a f46793V1;

    /* renamed from: W1 */
    private LinearLayout f46795W1;

    /* renamed from: X1 */
    private RobotoTextView f46797X1;

    /* renamed from: Y1 */
    private RelativeLayout f46799Y1;

    /* renamed from: Z1 */
    private View f46801Z1;

    /* renamed from: a1 */
    int f46802a1;

    /* renamed from: a2 */
    private View f46803a2;

    /* renamed from: b2 */
    private SuggestCommentView f46805b2;

    /* renamed from: c2 */
    private CommentPreviewView f46807c2;

    /* renamed from: d1 */
    private int f46808d1;

    /* renamed from: d2 */
    private boolean f46809d2;

    /* renamed from: e2 */
    private StickerPanelView f46811e2;

    /* renamed from: f1 */
    boolean f46812f1;

    /* renamed from: f2 */
    private FeedStickerSuggestView f46813f2;

    /* renamed from: g1 */
    Editable f46814g1;

    /* renamed from: g2 */
    private C8009j f46815g2;

    /* renamed from: h2 */
    private TimelineSkeletonView f46817h2;

    /* renamed from: i1 */
    int f46818i1;

    /* renamed from: i2 */
    private C20275e f46819i2;

    /* renamed from: j1 */
    private C23528a f46820j1;

    /* renamed from: j2 */
    private int f46821j2;

    /* renamed from: k1 */
    private KeyboardFrameLayout f46822k1;

    /* renamed from: k2 */
    private View f46823k2;

    /* renamed from: l1 */
    private View f46824l1;

    /* renamed from: l2 */
    private C25849b f46825l2;

    /* renamed from: m1 */
    private SwipeRefreshListView f46826m1;

    /* renamed from: m2 */
    private View f46827m2;

    /* renamed from: n1 */
    private ClockListView f46828n1;

    /* renamed from: n2 */
    private View f46829n2;

    /* renamed from: o1 */
    private View f46830o1;

    /* renamed from: o2 */
    private View f46831o2;

    /* renamed from: p1 */
    private RobotoTextView f46832p1;

    /* renamed from: p2 */
    private View f46833p2;

    /* renamed from: q1 */
    private FrameLayout f46834q1;

    /* renamed from: r1 */
    private LinearLayout f46836r1;

    /* renamed from: r2 */
    private AnimatorSet f46837r2;

    /* renamed from: s1 */
    private FrameLayout f46838s1;

    /* renamed from: s2 */
    private boolean f46839s2;

    /* renamed from: t1 */
    private View f46840t1;

    /* renamed from: t2 */
    private int f46841t2;

    /* renamed from: u1 */
    private LinearLayout f46842u1;

    /* renamed from: u2 */
    private int f46843u2;

    /* renamed from: v1 */
    private TextView f46844v1;

    /* renamed from: v2 */
    private int f46845v2;

    /* renamed from: w1 */
    private LinearLayout f46846w1;

    /* renamed from: w2 */
    private int f46847w2;

    /* renamed from: x1 */
    private TextView f46848x1;

    /* renamed from: x2 */
    private int f46849x2;

    /* renamed from: y1 */
    private ImageView f46850y1;

    /* renamed from: y2 */
    private InterfaceC8720a f46851y2;

    /* renamed from: z1 */
    private View f46852z1;

    /* renamed from: z2 */
    private InterfaceC20645a f46853z2;

    /* renamed from: W0 */
    private final int f46794W0 = 0;

    /* renamed from: X0 */
    private final int f46796X0 = 1;

    /* renamed from: Y0 */
    private final int f46798Y0 = 2;

    /* renamed from: Z0 */
    private int f46800Z0 = 0;

    /* renamed from: b1 */
    Handler f46804b1 = new Handler(Looper.getMainLooper(), new C8711g());

    /* renamed from: c1 */
    private final Runnable f46806c1 = new RunnableC8712h();

    /* renamed from: e1 */
    C0820h.a f46810e1 = new C8713i();

    /* renamed from: h1 */
    private final Runnable f46816h1 = new RunnableC8714j();

    /* renamed from: S1 */
    private final C13704p1 f46790S1 = new C13704p1(1);

    /* renamed from: q2 */
    private boolean f46835q2 = false;

    /* renamed from: A2 */
    private final C22636d f46768A2 = new C22636d();

    /* renamed from: E2 */
    AbstractC22055v0.g f46776E2 = new C8708d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$a */
    /* loaded from: classes4.dex */
    public class C8705a extends RecyclerView.AbstractC1892s {
        C8705a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            boolean z11;
            super.mo10176d(recyclerView, i11, i12);
            int m9745c2 = QuickCommentView.this.f46792U1.m9745c2();
            int m10127i = QuickCommentView.this.f46792U1.m10127i();
            if (QuickCommentView.this.f46770B2 != null && QuickCommentView.this.f46770B2.m107631c() != 2 && QuickCommentView.this.f46770B2.m107629a() != 12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m9745c2 >= m10127i - 1 && QuickCommentView.this.f46793V1 != null && z11 && i12 != 0) {
                QuickCommentView.this.f46853z2.mo107591ec();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$b */
    /* loaded from: classes4.dex */
    public class C8706b implements C8890a.f {

        /* renamed from: a */
        final /* synthetic */ C2976g1 f46855a;

        C8706b(C2976g1 c2976g1) {
            this.f46855a = c2976g1;
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: c */
        public void mo46559c() {
            QuickCommentView.this.mo46544d4();
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: d */
        public void mo46560d(C2988i3 c2988i3, int i11, int i12) {
            QuickCommentView.this.f46851y2.mo46606Z3(c2988i3);
            QuickCommentView.this.f46851y2.mo46601T1(i11, i12, c2988i3.m14164c());
            QuickCommentView.this.mo46544d4();
            C24906b.f119505a.m129550N(this.f46855a, true);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$c */
    /* loaded from: classes4.dex */
    class C8707c extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ String f46857p;

        C8707c(String str) {
            this.f46857p = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                if (!TextUtils.isEmpty(this.f46857p)) {
                    new C19171b().m101508a(new C19171b.a(QuickCommentView.this.f72421L0.m92676n2(), new C26365a.b(this.f46857p, C32002l4.m154265h(10010, 5)).m135739F("18600").m135741H(new TrackingSource(-1)).m135743b(), 0, 1));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(QuickCommentView.this.getContext(), AbstractC21196a.TextColor1));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$d */
    /* loaded from: classes4.dex */
    class C8708d implements AbstractC22055v0.g {
        C8708d() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            if (QuickCommentView.this.f46825l2 != null) {
                QuickCommentView.this.f46825l2.notifyDataSetChanged();
            }
            if (QuickCommentView.this.f46793V1 != null) {
                QuickCommentView.this.f46793V1.m10008p();
            }
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (QuickCommentView.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$e */
    /* loaded from: classes4.dex */
    public class C8709e extends AnimatorListenerAdapter {
        C8709e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            QuickCommentView.this.f46839s2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$f */
    /* loaded from: classes4.dex */
    public class C8710f extends AbstractC31727b {
        C8710f() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: c */
        public void mo46563c(String str) {
            C25630b m143290W;
            try {
                if (!TextUtils.isEmpty(str) && (m143290W = C28644j.m143233Y().m143290W(str)) != null && !m143290W.m132399G()) {
                    AbstractC20789d.m108472f(301, QuickCommentView.this.f72421L0.m92649TI());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            char charAt;
            try {
                StringBuilder sb2 = new StringBuilder();
                int selectionEnd = QuickCommentView.this.f46775E1.getSelectionEnd();
                if (selectionEnd == QuickCommentView.this.f46775E1.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                    if (selectionEnd > 0 && (charAt = QuickCommentView.this.f46775E1.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                        sb2.append(" ");
                        sb2.append(str);
                    }
                    if (selectionEnd == QuickCommentView.this.f46775E1.getText().length()) {
                        if (sb2.length() == 0) {
                            sb2.append(str);
                            sb2.append(" ");
                        } else {
                            sb2.append(" ");
                        }
                    }
                    if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                        str = sb2.toString();
                    }
                    if (QuickCommentView.this.f46775E1 != null && (QuickCommentView.this.f46851y2.mo46598R() - QuickCommentView.this.f46775E1.length()) - str.length() >= 0) {
                        C0820h.m2140c(QuickCommentView.this.f46775E1.getText(), selectionEnd, str, 0.0f, QuickCommentView.this.f46810e1);
                        return;
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                        return;
                    }
                }
                if (QuickCommentView.this.f46775E1 != null && (QuickCommentView.this.f46851y2.mo46598R() - QuickCommentView.this.f46775E1.length()) - str.length() >= 0) {
                    C0820h.m2140c(QuickCommentView.this.f46775E1.getText(), selectionEnd, str, 0.0f, QuickCommentView.this.f46810e1);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    QuickCommentView quickCommentView = QuickCommentView.this;
                    quickCommentView.f46804b1.postDelayed(quickCommentView.f46806c1, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    QuickCommentView quickCommentView2 = QuickCommentView.this;
                    quickCommentView2.f46804b1.removeCallbacks(quickCommentView2.f46806c1);
                    QuickCommentView quickCommentView3 = QuickCommentView.this;
                    quickCommentView3.f46802a1++;
                    if (!quickCommentView3.f46804b1.hasMessages(2)) {
                        QuickCommentView.this.f46804b1.sendEmptyMessage(2);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            QuickCommentView quickCommentView = QuickCommentView.this;
            quickCommentView.m46459TN(quickCommentView.f46811e2, false);
            QuickCommentView.this.f46851y2.mo46599R1(c25630b, i11);
            AbstractC23647d.m123897g("49180008");
        }

        @Override // z90.AbstractC31727b
        /* renamed from: p */
        public void mo46564p(C25630b c25630b, int i11, int i12, int i13) {
            QuickCommentView.this.f46851y2.mo46602W(c25630b, i11, i12, i13);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$g */
    /* loaded from: classes4.dex */
    class C8711g implements Handler.Callback {
        C8711g() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 2) {
                QuickCommentView.this.m46538XN();
                QuickCommentView quickCommentView = QuickCommentView.this;
                int i11 = quickCommentView.f46802a1 - 1;
                quickCommentView.f46802a1 = i11;
                if (i11 > 0) {
                    quickCommentView.f46804b1.sendEmptyMessageDelayed(2, 50L);
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$h */
    /* loaded from: classes4.dex */
    class RunnableC8712h implements Runnable {
        RunnableC8712h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (QuickCommentView.this.f46775E1.getText().length() > 0) {
                    QuickCommentView.this.m46538XN();
                    QuickCommentView quickCommentView = QuickCommentView.this;
                    quickCommentView.f46804b1.postDelayed(quickCommentView.f46806c1, 50L);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$i */
    /* loaded from: classes4.dex */
    public class C8713i implements C0820h.a {
        C8713i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m46566c(Editable editable, int i11, int i12) {
            try {
                if (QuickCommentView.this.f46775E1 != null) {
                    QuickCommentView quickCommentView = QuickCommentView.this;
                    int i13 = 1;
                    quickCommentView.f46812f1 = true;
                    quickCommentView.f46775E1.setText(editable);
                    if (i11 != QuickCommentView.this.f46775E1.getText().length() || AbstractC23309i.m121379Rd() != 1) {
                        i13 = 0;
                    }
                    QuickCommentView.this.f46775E1.setSelection(i12 + i13);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // ag0.C0820h.a
        /* renamed from: a */
        public void mo2144a(final Editable editable, final int i11, final int i12) {
            QuickCommentView.this.f46804b1.post(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.j
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCommentView.C8713i.this.m46566c(editable, i11, i12);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$j */
    /* loaded from: classes4.dex */
    class RunnableC8714j implements Runnable {
        RunnableC8714j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                QuickCommentView quickCommentView = QuickCommentView.this;
                if (quickCommentView.f46814g1 == null) {
                    return;
                }
                if (quickCommentView.f46812f1) {
                    quickCommentView.f46812f1 = false;
                } else {
                    C28652r.m143349v().m143362X(QuickCommentView.this.f46814g1, 0.0f);
                    C0820h.f2880z = null;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$k */
    /* loaded from: classes4.dex */
    public class C8715k implements AbsListView.OnScrollListener {
        C8715k() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (QuickCommentView.this.f46825l2 != null) {
                    if (i11 == 0) {
                        QuickCommentView.this.f46825l2.m133438m(false);
                        QuickCommentView.this.f46825l2.notifyDataSetChanged();
                    } else {
                        QuickCommentView.this.f46825l2.m133438m(true);
                        QuickCommentView.this.f46826m1.m88202K();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$l */
    /* loaded from: classes4.dex */
    public class C8716l implements C25849b.a {
        C8716l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m46568n(C10873l c10873l) {
            QuickCommentView.this.f46851y2.mo46612e0(c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: a */
        public void mo46569a() {
            QuickCommentView.this.m46442Ka(0);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: b */
        public void mo46570b(final C10873l c10873l, View view, C20275e c20275e, int i11) {
            QuickCommentView.this.m46442Ka(0);
            QuickCommentView.this.f46819i2 = c20275e;
            QuickCommentView.this.f46821j2 = i11;
            QuickCommentView.this.f46823k2 = view;
            QuickCommentView.this.f46804b1.postDelayed(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.k
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCommentView.C8716l.this.m46568n(c10873l);
                }
            }, 100L);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: c */
        public void mo46571c(String str) {
            QuickCommentView.this.f46851y2.mo46591H(str);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: d */
        public View mo46572d() {
            return null;
        }

        @Override // p489rn.C25849b.a
        /* renamed from: e */
        public void mo46573e(C20096c c20096c) {
            QuickCommentView.this.f46851y2.mo46589C(c20096c);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: f */
        public void mo46574f(C10866e c10866e) {
            if (c10866e instanceof C23672c) {
                FeedActionZUtils.m47541b(QuickCommentView.this, new C28209v3(true, ((C23672c) c10866e).f114678g0, 2));
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: f1 */
        public void mo46575f1(int i11, int i12, String str, int i13) {
            if (i11 > 0) {
                try {
                    if (QuickCommentView.this.f72421L0.m92676n2() != null) {
                        AbstractC23152n3.m119066r0(QuickCommentView.this.f72421L0.m92676n2(), i11, "", i12, str, i13);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: g */
        public void mo46576g(boolean z11, int i11) {
        }

        @Override // p489rn.C25849b.a
        /* renamed from: h */
        public void mo46577h(C10873l c10873l) {
            try {
                QuickCommentView.this.f46851y2.mo46635y(c10873l, true);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: i */
        public void mo46578i(String str) {
            QuickCommentView.this.f46851y2.mo46634x6(str, true, true);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: j */
        public void mo46579j(String str) {
            QuickCommentView.this.f46851y2.mo46634x6(str, false, false);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: k */
        public void mo46580k(C10873l c10873l) {
            int i11;
            if (c10873l != null) {
                QuickCommentView quickCommentView = QuickCommentView.this;
                int i12 = c10873l.f54909Y;
                List list = c10873l.f54910Z;
                if (list != null) {
                    i11 = list.size();
                } else {
                    i11 = 0;
                }
                quickCommentView.f46849x2 = i12 + i11;
                QuickCommentView.this.m46467YN(1);
                QuickCommentView.this.m46488lN(c10873l.m56493u(), true);
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: k0 */
        public void mo46581k0(C10873l c10873l) {
            QuickCommentView.this.f46851y2.mo46622k0(c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: l */
        public void mo46582l(int i11) {
            QuickCommentView.this.f46851y2.mo46605Y(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$m */
    /* loaded from: classes4.dex */
    public class C8717m implements KeyboardFrameLayout.InterfaceC13508a {
        C8717m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m46584b() {
            if (QuickCommentView.this.f46800Z0 != 2 && QuickCommentView.this.f46822k1 != null) {
                QuickCommentView.this.f46822k1.setPaddingBottom(0);
                QuickCommentView.this.f46822k1.requestLayout();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            QuickCommentView.this.f46804b1.post(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.l
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCommentView.C8717m.this.m46584b();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            QuickCommentView.this.m46473bO(i11, true);
            QuickCommentView.this.f46800Z0 = 1;
            if (QuickCommentView.this.m46486jN().m75553g()) {
                QuickCommentView.this.m46486jN().setMinimizedWithAnimation(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$n */
    /* loaded from: classes4.dex */
    public class C8718n implements FeedStickerSuggestView.InterfaceC14282c {
        C8718n() {
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14282c
        /* renamed from: a */
        public void mo46585a(C25630b c25630b, int i11) {
            QuickCommentView.this.mo46522E0(c25630b, i11);
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14282c
        /* renamed from: b */
        public void mo46586b(C25630b c25630b, int i11, String str, int i12, String str2) {
            QuickCommentView.this.f46851y2.mo46623l3(c25630b, i11);
            AbstractC23647d.m123897g("49180009");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.QuickCommentView$o */
    /* loaded from: classes4.dex */
    public class C8719o extends FeedStickerSuggestView {
        C8719o(Context context, ZaloView zaloView, ActionEditText actionEditText, FeedStickerSuggestView.InterfaceC14282c interfaceC14282c) {
            super(context, zaloView, actionEditText, interfaceC14282c);
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView
        /* renamed from: m */
        public void mo46587m() {
            QuickCommentView.this.m46442Ka(0);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 16);
            C17487o0 m46491mN = QuickCommentView.this.m46491mN();
            if (m46491mN != null) {
                m46491mN.m93066i2(SettingTimelineV2View.class, bundle, 1035, 1, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public /* synthetic */ void m46421AN(View view, boolean z11) {
        if (!z11) {
            m46442Ka(0);
        } else {
            m46442Ka(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public /* synthetic */ void m46423BN(ActionEditText actionEditText, String str, KeyEvent keyEvent) {
        onKeyUp(4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public /* synthetic */ boolean m46425CN(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6 && i11 != 4) {
            return false;
        }
        this.f46851y2.mo46611c0(mo46548im(), m46493nN());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public /* synthetic */ void m46427DN(View view) {
        this.f46851y2.mo46596N3();
        m46552qN();
        m46481fO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public /* synthetic */ void m46429EN(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.f46818i1 == 0 && i14 != i18) {
            this.f46841t2 = i14 - i12;
            if (m46487kN() > f46766F2 && !this.f46835q2) {
                m46486jN().setMinimizedWithAnimation(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public /* synthetic */ void m46431FN(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.f46818i1 == 1 && i14 != i18) {
            this.f46843u2 = i14 - i12;
            if (m46487kN() > f46766F2 && !this.f46835q2) {
                m46486jN().setMinimizedWithAnimation(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public /* synthetic */ void m46433GN(InterfaceC28604a interfaceC28604a) {
        this.f46853z2.mo107588K9(interfaceC28604a, m92676n2(), this.f46851y2.mo46617g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public /* synthetic */ Object m46435HN(ArrayList arrayList) {
        this.f46851y2.mo46615f0(arrayList);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public /* synthetic */ void m46437IN() {
        try {
            this.f46828n1.setSelection(this.f46825l2.getCount());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public /* synthetic */ void m46439JN(int i11, int i12) {
        this.f46851y2.mo46616f2(i12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public /* synthetic */ void m46441KN(InterfaceC17463d interfaceC17463d) {
        if (interfaceC17463d == this.f46815g2) {
            this.f46815g2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ka */
    public void m46442Ka(int i11) {
        if (i11 == this.f46800Z0) {
            return;
        }
        this.f46800Z0 = i11;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC2379w.m12430d(this.f46775E1);
                        CommentSupportGifEditText commentSupportGifEditText = this.f46775E1;
                        if (commentSupportGifEditText != null && !TextUtils.isEmpty(commentSupportGifEditText.getText())) {
                            C31933ga.f146718a.m153475r(EnumC30858b.f142393q);
                        } else {
                            C31933ga.f146718a.m153475r(EnumC30858b.f142392p);
                        }
                        this.f46778G1.setImageResource(AbstractC16803z.ic_postfeed_keyboard);
                        m46457SN();
                        this.f46809d2 = false;
                        if (m46486jN() != null) {
                            m46486jN().setEnableScrollY(true);
                            m46486jN().setMinimizedWithAnimation(false);
                        }
                        if (this.f46811e2 == null) {
                            m46502sN();
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(this.f46808d1));
                        }
                        m46459TN(this.f46811e2, true);
                        return;
                    }
                    return;
                }
                m46459TN(this.f46811e2, false);
                this.f46778G1.setImageResource(AbstractC16803z.icn_emoji);
                m46457SN();
                this.f46809d2 = true;
                AbstractC2379w.m12432f(this.f46775E1);
                if (m46486jN() != null) {
                    m46486jN().setEnableScrollY(true);
                    return;
                }
                return;
            }
            AbstractC2379w.m12430d(this.f46775E1);
            m46459TN(this.f46811e2, false);
            this.f46778G1.setImageResource(AbstractC16803z.icn_emoji);
            m46495oN();
            this.f46809d2 = false;
            if (m46486jN() != null) {
                m46486jN().setEnableScrollY(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public /* synthetic */ void m46444LN(C2976g1 c2976g1) {
        SuggestCommentView suggestCommentView = this.f46805b2;
        if (suggestCommentView != null) {
            suggestCommentView.setVisibility(0);
            this.f46805b2.m47447j(c2976g1.m14117c(), c2976g1.m14115a(), true);
            this.f46805b2.setOnSuggestCommentClickListener(new C8706b(c2976g1));
            C26333b.f125013a.m135521q(c2976g1.m14115a(), 2, this.f46851y2.mo46617g(), Integer.valueOf(this.f46805b2.getContentType()), Integer.valueOf(this.f46851y2.mo46595M3()));
        }
    }

    /* renamed from: MN */
    private void m46446MN() {
        this.f46851y2.mo46614eh();
        this.f46851y2.mo46637z6();
    }

    /* renamed from: NN */
    private void m46448NN(float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        View view = this.f46773D1;
        float f16 = 0.0f;
        if (view != null) {
            if (this.f46800Z0 == 0) {
                f15 = -f11;
            } else {
                f15 = 0.0f;
            }
            view.setTranslationY(f15);
        }
        View view2 = this.f46801Z1;
        if (view2 != null) {
            if (this.f46800Z0 == 0) {
                f14 = -f11;
            } else {
                f14 = 0.0f;
            }
            view2.setTranslationY(f14);
        }
        LinearLayout linearLayout = this.f46795W1;
        if (linearLayout != null) {
            if (this.f46800Z0 == 0) {
                f13 = -f11;
            } else {
                f13 = 0.0f;
            }
            linearLayout.setTranslationY(f13);
        }
        FeedStickerSuggestView feedStickerSuggestView = this.f46813f2;
        if (feedStickerSuggestView != null) {
            if (this.f46800Z0 == 0) {
                f12 = -f11;
            } else {
                f12 = 0.0f;
            }
            feedStickerSuggestView.setTranslationY(f12);
        }
        SuggestCommentView suggestCommentView = this.f46805b2;
        if (suggestCommentView != null) {
            if (this.f46800Z0 == 0) {
                f16 = -f11;
            }
            suggestCommentView.setTranslationY(f16);
        }
    }

    /* renamed from: PN */
    private void m46451PN() {
        View view;
        if (this.f46813f2 != null && (view = this.f46801Z1) != null && !AbstractC23136l9.m118666N0(view)) {
            this.f46813f2.setVisibility(0);
            this.f46813f2.setOwnerID(this.f46851y2.mo46620i1());
            this.f46813f2.m79741p(this.f46775E1.getText().toString(), true);
        }
    }

    /* renamed from: QN */
    private void m46453QN(List list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(new C27360c(0, new C29197d(AbstractC23136l9.m118743r0(AbstractC8020f0.only_see_reactions_on_friends))));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C27360c(1, this.f46853z2.mo107587C7((LikeContactItem) it.next())));
        }
        C8840a c8840a = this.f46793V1;
        if (c8840a != null) {
            c8840a.m47181N(arrayList);
            this.f46793V1.m10008p();
        }
    }

    /* renamed from: RN */
    private void m46455RN(View view) {
        this.f46769B1 = (TextView) view.findViewById(AbstractC6918a0.tvNoComment);
        new C26708g(this.f46769B1).m137319a(C26705d.m137293a(m92689tK(), AbstractC2814h.t_large_m));
        this.f46769B1.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        C26703b m137293a = C26705d.m137293a(m92689tK(), AbstractC2814h.t_small);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvNoCommentSuggest);
        new C26708g(textView).m137319a(m137293a);
        textView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        C26703b m137293a2 = C26705d.m137293a(m92689tK(), AbstractC2814h.t_small_m);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.tvSuggestSeeMore);
        this.f46848x1 = textView2;
        new C26708g(textView2).m137319a(m137293a2);
        this.f46848x1.setTextColor(C23212s8.m119606n(AbstractC2807a.cta_link));
    }

    /* renamed from: SN */
    private void m46457SN() {
        try {
            KeyboardFrameLayout keyboardFrameLayout = this.f46822k1;
            if (keyboardFrameLayout != null) {
                keyboardFrameLayout.setPaddingBottom(this.f46808d1);
                this.f46822k1.requestLayout();
            }
            if (m46486jN() != null && !this.f46835q2) {
                m46486jN().setMinimizedWithAnimation(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public void m46459TN(ZaloView zaloView, boolean z11) {
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
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: UN */
    private void m46461UN(boolean z11, C19591a c19591a) {
        try {
            if (z11) {
                mo46544d4();
                m46537VN();
                this.f46807c2.m47334d(c19591a);
                this.f46803a2.setVisibility(0);
                FeedStickerSuggestView feedStickerSuggestView = this.f46813f2;
                if (feedStickerSuggestView != null) {
                    feedStickerSuggestView.m79734f();
                }
            } else {
                m46552qN();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: WN */
    private void m46464WN(View view) {
        if (view != null && view.getVisibility() != 0) {
            AbstractC23115k.m118571b(view, AbstractC10919t.quick_comment_fade_in);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YN */
    public void m46467YN(int i11) {
        if (i11 != this.f46818i1) {
            this.f46818i1 = i11;
            int i12 = 8;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC23136l9.m118744r1(this.f46830o1, 0);
                    AbstractC23136l9.m118744r1(this.f46789R1, 0);
                    AbstractC23136l9.m118744r1(this.f46840t1, 0);
                    AbstractC23136l9.m118744r1(this.f46773D1, 8);
                    AbstractC23136l9.m118744r1(this.f46801Z1, 8);
                    AbstractC23136l9.m118744r1(this.f46795W1, 8);
                    FeedStickerSuggestView feedStickerSuggestView = this.f46813f2;
                    if (feedStickerSuggestView != null) {
                        feedStickerSuggestView.m79734f();
                    }
                    mo46544d4();
                    m46442Ka(0);
                    m46476dN(true);
                    return;
                }
                return;
            }
            AbstractC23136l9.m118744r1(this.f46830o1, 8);
            AbstractC23136l9.m118744r1(this.f46789R1, 8);
            AbstractC23136l9.m118744r1(this.f46840t1, 4);
            AbstractC23136l9.m118744r1(this.f46773D1, 0);
            this.f46851y2.mo46600S0();
            this.f46853z2.mo107589S0();
            this.f46793V1.m47179L();
            LinearLayout linearLayout = this.f46795W1;
            if (this.f46851y2.mo46608ai()) {
                i12 = 0;
            }
            AbstractC23136l9.m118744r1(linearLayout, i12);
            m46451PN();
            m46476dN(false);
            RobotoTextView robotoTextView = this.f46832p1;
            if (robotoTextView != null) {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_title));
            }
        }
    }

    /* renamed from: ZN */
    private void m46469ZN(boolean z11) {
        int i11;
        TextView textView = this.f46767A1;
        if (textView == null) {
            return;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = AbstractC23222t7.f112576o;
        }
        AbstractC23136l9.m118717i1(textView, i11);
    }

    /* renamed from: aO */
    private void m46471aO() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f46811e2 = (StickerPanelView) m92996E0;
        }
        if (this.f46811e2 != null) {
            m46504tN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public void m46473bO(int i11, boolean z11) {
        KeyboardFrameLayout keyboardFrameLayout;
        this.f46808d1 = i11;
        if (z11 && (keyboardFrameLayout = this.f46822k1) != null) {
            keyboardFrameLayout.setPaddingBottom(i11);
            this.f46822k1.requestLayout();
        }
    }

    /* renamed from: cN */
    private void m46474cN() {
        try {
            int i11 = AbstractC23222t7.f112576o;
            if (this.f46786O1 == null) {
                C18063b c18063b = new C18063b(m92689tK());
                this.f46786O1 = c18063b;
                c18063b.m89106L().m89033Q(i11).m89036T(i11).m89027K(true);
            }
            C18064c c18064c = new C18064c(m92689tK());
            this.f46787P1 = c18064c;
            c18064c.m89106L().m89028L(-2, -2).m89033Q(i11).m89036T(i11).m89027K(true);
            if (this.f46788Q1 == null) {
                C26703b m137293a = C26705d.m137293a(m92689tK(), AbstractC2814h.t_xsmall_m);
                C22126c0 c22126c0 = new C22126c0(this.f72421L0.getContext());
                this.f46788Q1 = c22126c0;
                c22126c0.m89106L().m89034R(AbstractC23222t7.f112556e).m89029M(12).m89033Q(i11).m89036T(i11).m89027K(true);
                new C26707f(this.f46788Q1).m137318a(m137293a);
                this.f46788Q1.m111962J1(C23212s8.m119606n(AbstractC2807a.text_secondary));
            }
            this.f46790S1.m76614d(this.f46788Q1.m111977q1(), false);
            this.f46790S1.setTypeface(this.f46788Q1.m111978r1());
            this.f46785N1.mo44090O();
            this.f46785N1.mo69681L(this.f46786O1);
            this.f46785N1.mo69681L(this.f46787P1);
            this.f46785N1.mo69681L(this.f46788Q1);
            m46484hN();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: cO */
    private void m46475cO(C3020p0 c3020p0) {
        List arrayList;
        List m150943l;
        C3039t0 c3039t0 = c3020p0.f12025E;
        C3051w0 c3051w0 = c3039t0.f12246d;
        C32546b c32546b = c3039t0.f12247e;
        int i11 = c3039t0.f12244b;
        if (c3051w0 != null && c3051w0.m14637a()) {
            arrayList = AbstractC20826v0.m108792W0(c3051w0.f12301a);
        } else {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        if (c32546b != null) {
            m150943l = c32546b.m157606b();
        } else {
            m150943l = C31060j.f143193a.m150943l();
        }
        C17570d c17570d = new C17570d(m92689tK());
        String m93559b = AbstractC17569c.Companion.m93559b(c17570d, c3020p0.f12064w, list, i11, 14);
        float measureText = this.f46790S1.measureText(m93559b);
        int size = m150943l.size();
        C17567a c17567a = new C17567a();
        c17567a.m93550a(this.f46790S1, c17570d, measureText, 0.0f, c3020p0.f12064w, i11);
        this.f46788Q1.m111959G1(c17567a.m93551c(0, size, m93559b));
    }

    /* renamed from: dN */
    private void m46476dN(boolean z11) {
        float f11;
        float f12;
        float f13;
        if (this.f46839s2) {
            return;
        }
        float f14 = 0.0f;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = -this.f46836r1.getWidth();
        }
        if (z11) {
            f12 = -this.f46836r1.getWidth();
        } else {
            f12 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f46836r1, "translationX", f11, f12);
        if (z11) {
            f13 = this.f46836r1.getWidth();
        } else {
            f13 = 0.0f;
        }
        if (!z11) {
            f14 = this.f46836r1.getWidth();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f46838s1, "translationX", f13, f14);
        if (this.f46837r2 == null) {
            this.f46837r2 = new AnimatorSet();
        }
        this.f46837r2.playTogether(ofFloat, ofFloat2);
        this.f46837r2.setInterpolator(new C26087b());
        this.f46837r2.setDuration(200L);
        this.f46837r2.addListener(new C8709e());
        this.f46837r2.start();
    }

    /* renamed from: dO */
    private void m46477dO(C3020p0 c3020p0) {
        C3039t0 c3039t0;
        boolean z11;
        if (c3020p0 != null && (c3039t0 = c3020p0.f12025E) != null) {
            int i11 = c3039t0.f12244b;
            int i12 = 0;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m46483gO(c3020p0);
            m46475cO(c3020p0);
            ModulesView modulesView = this.f46785N1;
            if (i11 <= 0) {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(modulesView, i12);
            m46469ZN(z11);
        }
    }

    /* renamed from: eN */
    private void m46478eN(boolean z11, C32546b c32546b) {
        List m150943l;
        C18063b c18063b = this.f46786O1;
        if (c18063b == null) {
            return;
        }
        if (z11) {
            if (c32546b != null) {
                m150943l = c32546b.m157606b();
            } else {
                m150943l = C31060j.f143193a.m150943l();
            }
            c18063b.m96028o1(m150943l);
            return;
        }
        c18063b.m96028o1(new ArrayList());
    }

    /* renamed from: eO */
    private void m46479eO(ItemAlbumMobile itemAlbumMobile) {
        List m150943l;
        if (itemAlbumMobile != null) {
            C3051w0 c3051w0 = itemAlbumMobile.f42562M;
            C32546b c32546b = itemAlbumMobile.f42563N;
            List m108792W0 = AbstractC20826v0.m108792W0(c3051w0.f12301a);
            int parseInt = Integer.parseInt(itemAlbumMobile.f42560K);
            if (parseInt > 0 && getContext() != null) {
                if (c32546b != null) {
                    m150943l = c32546b.m157606b();
                } else {
                    m150943l = C31060j.f143193a.m150943l();
                }
                this.f46786O1.m96028o1(m150943l);
                C17570d c17570d = new C17570d(getContext());
                String m93559b = AbstractC17569c.Companion.m93559b(c17570d, itemAlbumMobile.f42552E.equals("1"), m108792W0, parseInt, 14);
                float measureText = this.f46790S1.measureText(m93559b);
                int size = m150943l.size();
                C17567a c17567a = new C17567a();
                c17567a.m93550a(this.f46790S1, c17570d, measureText, 0.0f, itemAlbumMobile.f42552E.equals("1"), parseInt);
                this.f46788Q1.m111959G1(c17567a.m93551c(0, size, m93559b));
                AbstractC23136l9.m118744r1(this.f46785N1, 0);
                return;
            }
            AbstractC23136l9.m118744r1(this.f46785N1, 8);
        }
    }

    /* renamed from: fN */
    private void m46480fN(int i11, boolean z11, C3051w0 c3051w0, C32546b c32546b) {
        C18064c c18064c = this.f46787P1;
        if (c18064c == null) {
            return;
        }
        if (i11 <= 0 && !z11) {
            c18064c.m96030p1(new ArrayList());
        } else {
            this.f46787P1.m96030p1(new C18062a().m96026a(z11, i11, c3051w0, c32546b));
        }
    }

    /* renamed from: fO */
    private void m46481fO() {
        boolean z11;
        try {
            String mo46548im = mo46548im();
            ImageButton imageButton = this.f46777F1;
            if (!this.f46851y2.mo46621i2() && TextUtils.isEmpty(mo46548im)) {
                z11 = false;
                imageButton.setEnabled(z11);
            }
            z11 = true;
            imageButton.setEnabled(z11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: gN */
    private void m46482gN() {
        SuggestCommentView suggestCommentView = this.f46805b2;
        if (suggestCommentView != null && suggestCommentView.getVisibility() == 0 && this.f46805b2.m47445f() && !TextUtils.isEmpty(this.f46851y2.mo46593I())) {
            C26333b.f125013a.m135521q(this.f46851y2.mo46593I(), 2, this.f46851y2.mo46617g(), Integer.valueOf(this.f46805b2.getContentType()), Integer.valueOf(this.f46851y2.mo46595M3()));
        }
    }

    /* renamed from: gO */
    private void m46483gO(C3020p0 c3020p0) {
        boolean z11;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 == null) {
            return;
        }
        int i11 = c3039t0.f12244b;
        boolean z12 = c3020p0.f12064w;
        if (!z12 && i11 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C3051w0 c3051w0 = c3039t0.f12246d;
        C32546b c32546b = c3039t0.f12247e;
        if (C31060j.m150913U()) {
            m46480fN(i11, z12, c3051w0, c32546b);
        } else {
            m46478eN(z11, c32546b);
        }
    }

    /* renamed from: hN */
    private void m46484hN() {
        C16719g c16719g;
        if (this.f46786O1 != null && this.f46787P1 != null) {
            if (C31060j.m150913U()) {
                this.f46787P1.mo44614b1(0);
                this.f46786O1.mo44614b1(8);
                c16719g = this.f46787P1;
            } else {
                this.f46786O1.mo44614b1(0);
                this.f46787P1.mo44614b1(8);
                c16719g = this.f46786O1;
            }
            C22126c0 c22126c0 = this.f46788Q1;
            if (c22126c0 != null) {
                c22126c0.m89106L().m89054h0(c16719g);
            }
        }
    }

    /* renamed from: iN */
    private void m46485iN(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(AbstractC6918a0.btn_like);
        this.f46781J1 = relativeLayout;
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(AbstractC6918a0.btn_comment);
        this.f46782K1 = relativeLayout2;
        relativeLayout2.setVisibility(8);
        Divider divider = (Divider) view.findViewById(AbstractC6918a0.layout_like_info_divider);
        this.f46783L1 = divider;
        divider.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public BottomSheetLayout m46486jN() {
        return this.f72454M0;
    }

    /* renamed from: kN */
    private int m46487kN() {
        int i11;
        int i12;
        int i13;
        f46766F2 = mo37127dM() - mo37128eM();
        if (this.f46818i1 == 0) {
            i11 = this.f46841t2;
        } else {
            i11 = this.f46843u2;
        }
        View view = this.f46830o1;
        int i14 = 0;
        if (view != null) {
            i12 = view.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        View view2 = this.f46780I1;
        if (view2 != null) {
            i13 = view2.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        View view3 = this.f46773D1;
        if (view3 != null) {
            i14 = view3.getMeasuredHeight();
        }
        return i12 + i13 + i11 + i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public void m46488lN(String str, boolean z11) {
        int i11;
        int i12 = 0;
        if (z11) {
            i11 = 2;
        } else if (!TextUtils.isEmpty(this.f46851y2.mo46631w4())) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    i12 = this.f46849x2;
                }
            } else {
                i12 = this.f46847w2;
            }
        } else {
            i12 = this.f46845v2;
        }
        if (this.f46832p1 != null && getContext() != null) {
            this.f46832p1.setText(this.f46768A2.m117196a(i12, i11));
        }
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_LIKE_FEED_ID", this.f46851y2.mo46593I());
        bundle.putString("EXTRA_LIKE_PHOTO_ID", this.f46851y2.mo46631w4());
        bundle.putString("EXTRA_LIKE_COMMENT_ID", str);
        bundle.putInt("EXTRA_LIKE_MODE", i11);
        bundle.putString("EXTRA_OWNER_ID", this.f46851y2.mo46603W2());
        this.f46853z2.mo995Nd(C20648d.m107627a(bundle), null);
        this.f46853z2.mo107593r1();
    }

    /* renamed from: lb */
    private void m46489lb(long j11) {
        ClockListView clockListView = this.f46828n1;
        if (clockListView != null) {
            clockListView.postDelayed(new Runnable() { // from class: vq.c0
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCommentView.this.m46437IN();
                }
            }, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public C17487o0 m46491mN() {
        BottomSheetZaloViewWithAnim.InterfaceC14117c interfaceC14117c = this.f72458P0;
        if (interfaceC14117c != null) {
            return interfaceC14117c.mo78545c();
        }
        return null;
    }

    /* renamed from: nN */
    private String m46493nN() {
        LinearLayout linearLayout = this.f46795W1;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return this.f46797X1.getText().toString();
        }
        return "";
    }

    /* renamed from: oN */
    private void m46495oN() {
        try {
            KeyboardFrameLayout keyboardFrameLayout = this.f46822k1;
            if (keyboardFrameLayout != null) {
                keyboardFrameLayout.setPaddingBottom(0);
                this.f46822k1.requestLayout();
            }
            this.f46804b1.postDelayed(new Runnable() { // from class: vq.w
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCommentView.this.m46512xN();
                }
            }, 400L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pN */
    private void m46497pN() {
        AbstractC23136l9.m118744r1(this.f46795W1, 8);
        RobotoTextView robotoTextView = this.f46797X1;
        if (robotoTextView != null) {
            robotoTextView.setText("");
        }
    }

    /* renamed from: rN */
    private void m46500rN(View view) {
        View findViewById = view.findViewById(AbstractC6918a0.layout_like_description_container_view);
        this.f46784M1 = findViewById;
        findViewById.setOnClickListener(this);
        this.f46785N1 = (ModulesView) view.findViewById(AbstractC6918a0.layout_like_description);
    }

    /* renamed from: sN */
    private void m46502sN() {
        try {
            this.f46851y2.mo46627qk();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: tN */
    private void m46504tN() {
        this.f46811e2.m72709oO(new C8710f());
    }

    /* renamed from: uN */
    private void m46506uN(View view) {
        try {
            AbstractC23136l9.m118744r1(this.f72456O0, 8);
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                view.setLayoutParams(marginLayoutParams);
            }
            this.f46818i1 = 0;
            this.f72455N0.setBackgroundResource(AbstractC16803z.quick_comment_bg);
            this.f46822k1 = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.keyboard_frame_layout);
            this.f46799Y1 = (RelativeLayout) view.findViewById(AbstractC6918a0.main_comment_view);
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
            this.f46826m1 = swipeRefreshListView;
            swipeRefreshListView.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
            this.f46826m1.setSwipeRefreshEnable(false);
            ClockListView clockListView = (ClockListView) this.f46826m1.f83579m0;
            this.f46828n1 = clockListView;
            AbstractC1579n0.m7831P0(clockListView, true);
            LayoutInflater layoutInflater = (LayoutInflater) this.f72421L0.m92648SI().getSystemService("layout_inflater");
            if (layoutInflater != null) {
                View inflate = layoutInflater.inflate(AbstractC7409c0.quick_comment_header, (ViewGroup) null, false);
                View findViewById = inflate.findViewById(AbstractC6918a0.layoutCommentLoading);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
                }
                this.f46828n1.addHeaderView(inflate);
            }
            this.f46842u1 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutMore);
            TextView textView = (TextView) view.findViewById(AbstractC6918a0.btnLoadMore);
            this.f46844v1 = textView;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutLoadingComment);
            this.f46846w1 = linearLayout;
            AbstractC23136l9.m118744r1(linearLayout, 8);
            ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.imvEmptyIcon);
            this.f46850y1 = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(this);
                if (this.f46850y1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) this.f46850y1.getLayoutParams()).topMargin = AbstractC23222t7.f112540S;
                }
            }
            this.f46767A1 = (TextView) view.findViewById(AbstractC6918a0.tvComment);
            this.f46771C1 = view.findViewById(AbstractC6918a0.layout_no_comment_suggest);
            m46455RN(view);
            TextView textView2 = this.f46848x1;
            if (textView2 != null) {
                textView2.setOnClickListener(this);
            }
            this.f46833p2 = view.findViewById(AbstractC6918a0.layout_comment_error);
            View findViewById2 = view.findViewById(AbstractC6918a0.btn_refresh);
            this.f46827m2 = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(this);
            }
            View findViewById3 = view.findViewById(AbstractC6918a0.image_error);
            this.f46829n2 = findViewById3;
            if (findViewById3 != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById3.getLayoutParams();
                layoutParams.width -= AbstractC23136l9.m118742r(20.0f);
                layoutParams.height -= AbstractC23136l9.m118742r(20.0f);
                layoutParams.setMargins(0, AbstractC23136l9.m118742r(20.0f), 0, 0);
                this.f46829n2.setLayoutParams(layoutParams);
            }
            View findViewById4 = view.findViewById(AbstractC6918a0.error_title);
            this.f46831o2 = findViewById4;
            if (findViewById4 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById4.getLayoutParams();
                layoutParams2.setMargins(0, AbstractC23136l9.m118742r(20.0f), 0, 0);
                this.f46831o2.setLayoutParams(layoutParams2);
            }
            this.f46830o1 = view.findViewById(AbstractC6918a0.title_bar);
            this.f46832p1 = (RobotoTextView) view.findViewById(AbstractC6918a0.quick_comment_title);
            this.f46834q1 = (FrameLayout) view.findViewById(AbstractC6918a0.content_section);
            this.f46836r1 = (LinearLayout) view.findViewById(AbstractC6918a0.comment_container);
            this.f46838s1 = (FrameLayout) view.findViewById(AbstractC6918a0.like_container);
            LinearLayout linearLayout2 = this.f46836r1;
            if (linearLayout2 != null) {
                linearLayout2.post(new Runnable() { // from class: vq.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickCommentView.this.m46516zN();
                    }
                });
            }
            View findViewById5 = view.findViewById(AbstractC6918a0.icn_back);
            this.f46840t1 = findViewById5;
            if (findViewById5 != null) {
                findViewById5.setOnClickListener(this);
            }
            this.f46773D1 = view.findViewById(AbstractC6918a0.commentinputbar);
            CommentSupportGifEditText commentSupportGifEditText = (CommentSupportGifEditText) view.findViewById(AbstractC6918a0.cmtinput_text);
            this.f46775E1 = commentSupportGifEditText;
            if (commentSupportGifEditText != null) {
                commentSupportGifEditText.addTextChangedListener(this);
                this.f46775E1.setFocusable(false);
                this.f46775E1.setFocusableInTouchMode(true);
                this.f46775E1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: vq.e0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z11) {
                        QuickCommentView.this.m46421AN(view2, z11);
                    }
                });
                this.f46775E1.setOnClickListener(this);
                this.f46775E1.setmOnImeBack(new ActionEditText.InterfaceC16448a() { // from class: vq.f0
                    @Override // com.zing.zalo.uicontrol.ActionEditText.InterfaceC16448a
                    /* renamed from: a */
                    public final void mo87301a(ActionEditText actionEditText, String str, KeyEvent keyEvent) {
                        QuickCommentView.this.m46423BN(actionEditText, str, keyEvent);
                    }
                });
                this.f46775E1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: vq.g0
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                        boolean m46425CN;
                        m46425CN = QuickCommentView.this.m46425CN(textView3, i11, keyEvent);
                        return m46425CN;
                    }
                });
            }
            ImageButton imageButton = (ImageButton) view.findViewById(AbstractC6918a0.cmtinput_send);
            this.f46777F1 = imageButton;
            if (imageButton != null) {
                imageButton.setOnClickListener(this);
            }
            RedDotImageButton redDotImageButton = (RedDotImageButton) view.findViewById(AbstractC6918a0.imgEmoSticker);
            this.f46778G1 = redDotImageButton;
            if (redDotImageButton != null) {
                redDotImageButton.setOnClickListener(this);
            }
            RedDotImageButton redDotImageButton2 = (RedDotImageButton) view.findViewById(AbstractC6918a0.btnGallery);
            this.f46779H1 = redDotImageButton2;
            if (redDotImageButton2 != null) {
                redDotImageButton2.setOnClickListener(this);
            }
            m46481fO();
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutReplyComment);
            this.f46795W1 = linearLayout3;
            AbstractC23136l9.m118744r1(linearLayout3, 8);
            this.f46797X1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvUserNameToReply);
            View findViewById6 = view.findViewById(AbstractC6918a0.imvRemoveLayoutReplyComment);
            if (findViewById6 != null) {
                findViewById6.setOnClickListener(this);
            }
            View findViewById7 = view.findViewById(AbstractC6918a0.layout_container_comment_preview);
            this.f46801Z1 = findViewById7;
            AbstractC23136l9.m118744r1(findViewById7, 8);
            View findViewById8 = view.findViewById(AbstractC6918a0.ic_edit_photo_preview);
            this.f46803a2 = findViewById8;
            if (findViewById8 != null) {
                findViewById8.setOnClickListener(this);
            }
            CommentPreviewView commentPreviewView = (CommentPreviewView) view.findViewById(AbstractC6918a0.comment_preview);
            this.f46807c2 = commentPreviewView;
            commentPreviewView.setVisibility(8);
            this.f46807c2.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: vq.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuickCommentView.this.m46427DN(view2);
                }
            });
            SuggestCommentView suggestCommentView = (SuggestCommentView) view.findViewById(AbstractC6918a0.suggest_comment_view);
            this.f46805b2 = suggestCommentView;
            suggestCommentView.setMode(11);
            this.f46805b2.setVisibility(8);
            View findViewById9 = view.findViewById(AbstractC6918a0.layoutLikeInfo);
            this.f46780I1 = findViewById9;
            findViewById9.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.bottom_sheet_container));
            AbstractC23136l9.m118744r1(this.f46780I1, 8);
            m46485iN(view);
            m46500rN(view);
            m46474cN();
            this.f46789R1 = view.findViewById(AbstractC6918a0.likeinfo_divider);
            this.f46828n1.setTranscriptMode(0);
            this.f46828n1.setFastScrollEnabled(false);
            this.f46828n1.setVerticalScrollBarEnabled(true);
            this.f46828n1.setVerticalScrollbarPosition(2);
            this.f46828n1.setScrollBarDefaultDelayBeforeFade(100);
            this.f46828n1.setScrollBarFadeDuration(200);
            this.f46828n1.setOnScrollListener(new C8715k());
            ViewGroup.LayoutParams layoutParams3 = this.f46828n1.getLayoutParams();
            layoutParams3.height = -2;
            this.f46828n1.setLayoutParams(layoutParams3);
            this.f46828n1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: vq.i0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    QuickCommentView.this.m46429EN(view2, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            });
            C25849b c25849b = new C25849b(m92676n2(), 0, this.f46820j1, new C8716l());
            this.f46825l2 = c25849b;
            this.f46828n1.setAdapter((ListAdapter) c25849b);
            this.f46822k1.setTopViewGroup(this.f46799Y1);
            ArrayList<View> arrayList = new ArrayList<>();
            View findViewById10 = this.f46824l1.findViewById(AbstractC6918a0.sticker_panel_container);
            if (findViewById10 != null) {
                arrayList.add(findViewById10);
            }
            this.f46822k1.setBottomViewsGroup(arrayList);
            this.f46822k1.setOnKeyboardListener(new C8717m());
            C8719o c8719o = new C8719o(view.getContext(), this, this.f46775E1, new C8718n());
            this.f46813f2 = c8719o;
            c8719o.setProcessStickerCallback(new FeedStickerSuggestView.InterfaceC14281b() { // from class: vq.s
                @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14281b
                /* renamed from: a */
                public final void mo79746a() {
                    QuickCommentView.this.mo46544d4();
                }
            });
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams4.addRule(2, this.f46795W1.getId());
            this.f46799Y1.addView(this.f46813f2, layoutParams4);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.likesListview);
            this.f46791T1 = recyclerView;
            recyclerView.m9826E(new C8705a());
            this.f46791T1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: vq.t
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    QuickCommentView.this.m46431FN(view2, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            });
            C8840a c8840a = new C8840a();
            this.f46793V1 = c8840a;
            c8840a.m47182O(new C8840a.c() { // from class: vq.u
                @Override // com.zing.zalo.feed.reactions.bottomsheet.C8840a.c
                /* renamed from: a */
                public final void mo47168a(InterfaceC28604a interfaceC28604a) {
                    QuickCommentView.this.m46433GN(interfaceC28604a);
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            this.f46792U1 = linearLayoutManager;
            this.f46791T1.setLayoutManager(linearLayoutManager);
            this.f46791T1.setAdapter(this.f46793V1);
            this.f46851y2.mo46632w8();
            this.f46851y2.mo46604Xn();
            m78539iM(true);
            if (m46486jN() != null) {
                m46486jN().setEnableToggleWHenClickNoConsume(false);
                m46486jN().setMinMaxAnimDuration(400L);
                m46486jN().setCanOverTranslateMaxY(true);
                this.f46851y2.mo46613ee();
            }
            this.f46772C2 = new C16572d1(this.f46775E1, true, new InterfaceC18505l() { // from class: vq.v
                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    Object m46435HN;
                    m46435HN = QuickCommentView.this.m46435HN((ArrayList) obj);
                    return m46435HN;
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public /* synthetic */ void m46508vN() {
        m46442Ka(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public /* synthetic */ void m46510wN() {
        C3246i0.a aVar;
        try {
            PreviewStickerDialogView previewStickerDialogView = this.f46774D2;
            if (previewStickerDialogView != null && (aVar = previewStickerDialogView.f76068K0) != null) {
                aVar.m16491v();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public /* synthetic */ void m46512xN() {
        if (m46486jN() != null && m46487kN() < f46766F2) {
            StickerPanelView stickerPanelView = this.f46811e2;
            if ((stickerPanelView == null || stickerPanelView.m92679oJ()) && this.f46818i1 == 0 && !this.f46835q2) {
                m46486jN().setMinimizedWithAnimation(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public /* synthetic */ void m46514yN() {
        SuggestCommentView suggestCommentView = this.f46805b2;
        if (suggestCommentView != null) {
            suggestCommentView.setVisibility(8);
            this.f46805b2.m47444e();
            C26333b.f125013a.m135518n(this.f46851y2.mo46593I(), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public /* synthetic */ void m46516zN() {
        FrameLayout frameLayout = this.f46838s1;
        if (frameLayout != null) {
            frameLayout.setTranslationX(this.f46836r1.getMeasuredWidth());
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: A1 */
    public boolean mo46517A1() {
        CommentPreviewView commentPreviewView = this.f46807c2;
        if (commentPreviewView == null || this.f46813f2 == null || this.f46775E1 == null) {
            return true;
        }
        if (commentPreviewView.getVisibility() != 0) {
            if (this.f46813f2.getVisibility() != 0) {
                return true;
            }
            if (this.f46813f2.m79738k() && TextUtils.isEmpty(this.f46775E1.getText())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: Az */
    public void mo46518Az(boolean z11) {
        if (z11) {
            m46442Ka(1);
        } else {
            m46442Ka(0);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: B0 */
    public void mo46519B0(String str, C3020p0 c3020p0, String str2) {
        try {
            m46442Ka(1);
            String m114542i = AbstractC21935u.m114542i(str, str2);
            if (c3020p0 != null && c3020p0.m14518m0()) {
                this.f46797X1.setText(m114542i);
            } else {
                SpannableString spannableString = new SpannableString(m114542i);
                spannableString.setSpan(new C8707c(str), 0, m114542i.length(), 33);
                this.f46797X1.setText(spannableString);
                this.f46797X1.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.f46795W1.setVisibility(0);
            this.f46795W1.startAnimation(AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_in_from_bottom_timeline));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: C7 */
    public void mo46520C7(C23909b c23909b, boolean z11) {
        if (c23909b == null) {
            return;
        }
        int i11 = c23909b.f115533a;
        if (i11 == 0) {
            if (z11) {
                AbstractC23136l9.m118744r1(this.f46846w1, 8);
                AbstractC23136l9.m118744r1(this.f46817h2, 8);
                AbstractC23136l9.m118744r1(this.f46833p2, 8);
                m46464WN(this.f46826m1);
                C25849b c25849b = this.f46825l2;
                if (c25849b != null) {
                    c25849b.m133434i(true);
                }
                AbstractC23136l9.m118744r1(this.f46780I1, 0);
            } else if (c23909b.f115537e) {
                if (this.f46817h2 == null) {
                    TimelineSkeletonView timelineSkeletonView = (TimelineSkeletonView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.layout_time_line_loading_state, (ViewGroup) null);
                    this.f46817h2 = timelineSkeletonView;
                    timelineSkeletonView.setSkeletonLayoutType(2);
                    FrameLayout frameLayout = this.f46834q1;
                    if (frameLayout != null) {
                        frameLayout.addView(this.f46817h2, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
                AbstractC23136l9.m118744r1(this.f46817h2, 0);
                this.f46817h2.m85153i();
                AbstractC23136l9.m118744r1(this.f46846w1, 8);
                AbstractC23136l9.m118744r1(this.f46780I1, 8);
            } else {
                AbstractC23136l9.m118744r1(this.f46842u1, 0);
                AbstractC23136l9.m118744r1(this.f46844v1, 8);
                AbstractC23136l9.m118744r1(this.f46846w1, 0);
                AbstractC23136l9.m118744r1(this.f46817h2, 8);
                TimelineSkeletonView timelineSkeletonView2 = this.f46817h2;
                if (timelineSkeletonView2 != null) {
                    timelineSkeletonView2.m85154j();
                }
                AbstractC23136l9.m118744r1(this.f46780I1, 0);
            }
            AbstractC23136l9.m118744r1(this.f46833p2, 8);
        } else if (i11 == 3) {
            if (c23909b.f115534b == 11) {
                m46464WN(this.f46833p2);
                AbstractC23136l9.m118744r1(this.f46842u1, 8);
                AbstractC23136l9.m118744r1(this.f46846w1, 8);
                AbstractC23136l9.m118744r1(this.f46852z1, 0);
                AbstractC23136l9.m118744r1(this.f46780I1, 0);
                AbstractC23136l9.m118744r1(this.f46817h2, 8);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
            C25849b c25849b2 = this.f46825l2;
            if (c25849b2 != null) {
                c25849b2.m133434i(false);
            }
        } else {
            SwipeRefreshListView swipeRefreshListView = this.f46826m1;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
                if (this.f46826m1.getVisibility() != 0) {
                    this.f46826m1.startAnimation(AnimationUtils.loadAnimation(getContext(), AbstractC10919t.quick_comment_fade_in));
                }
            }
            AbstractC23136l9.m118744r1(this.f46846w1, 8);
            AbstractC23136l9.m118744r1(this.f46817h2, 8);
            AbstractC23136l9.m118744r1(this.f46833p2, 8);
            TimelineSkeletonView timelineSkeletonView3 = this.f46817h2;
            if (timelineSkeletonView3 != null) {
                timelineSkeletonView3.m85154j();
            }
            AbstractC23136l9.m118744r1(this.f46780I1, 0);
            C25849b c25849b3 = this.f46825l2;
            if (c25849b3 != null) {
                c25849b3.m133434i(false);
            }
            ImageView imageView = this.f46850y1;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f46850y1.setImageResource(C23212s8.m119610r(AbstractC16781w.empty_state_comment));
            }
            TextView textView = this.f46769B1;
            if (textView != null) {
                textView.setText(c23909b.f115535c);
            }
            int i12 = c23909b.f115533a;
            if (i12 != 1) {
                if (i12 == 2) {
                    AbstractC23136l9.m118744r1(this.f46850y1, 8);
                    AbstractC23136l9.m118744r1(this.f46769B1, 8);
                    AbstractC23136l9.m118744r1(this.f46771C1, 8);
                    m46464WN(this.f46826m1);
                }
            } else {
                m46464WN(this.f46850y1);
                m46464WN(this.f46769B1);
                m46464WN(this.f46771C1);
            }
        }
        int i13 = c23909b.f115536d;
        if (i13 != 20) {
            if (i13 == 21) {
                this.f46846w1.setGravity(19);
                m46464WN(this.f46842u1);
                m46464WN(this.f46844v1);
                return;
            }
            return;
        }
        AbstractC23136l9.m118744r1(this.f46842u1, 8);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f46820j1 = new C23528a(getContext());
        C8723d c8723d = new C8723d(this, C21785g.m112430F0());
        this.f46851y2 = c8723d;
        c8723d.mo995Nd(C28587j0.m143000a(m92642L3()), null);
        this.f46853z2 = new C20647c(this, new C22634b(), new C22635c(), new C22633a(), new C22636d());
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: DE */
    public void mo46521DE(C3020p0 c3020p0) {
        boolean z11;
        if (c3020p0 == null) {
            return;
        }
        try {
            m46477dO(c3020p0);
            int i11 = c3020p0.f12025E.f12244b;
            this.f46845v2 = i11;
            int i12 = 0;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            View view = this.f46784M1;
            if (!z11) {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(view, i12);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: E0 */
    public void mo46522E0(C25630b c25630b, int i11) {
        try {
            AbstractC20789d.m108483q(this.f46774D2, this.f72421L0.m92676n2());
            Bundle bundle = new Bundle();
            bundle.putSerializable("gifInfo", c25630b);
            bundle.putInt("source", i11);
            this.f46774D2 = AbstractC20789d.m108482p(301, this, this.f72421L0.m92649TI(), bundle);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // w20.InterfaceC28698a
    /* renamed from: Gg */
    public int mo46523Gg() {
        if (this.f46800Z0 == 0) {
            return 0;
        }
        return this.f46808d1;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: H3 */
    public void mo46524H3() {
        SuggestCommentView suggestCommentView = this.f46805b2;
        if (suggestCommentView != null && suggestCommentView.m47445f()) {
            this.f46805b2.m47446i();
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: I2 */
    public void mo46525I2(boolean z11, C19591a c19591a) {
        try {
            m46461UN(z11, c19591a);
            m46481fO();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            super.mo39024IJ();
            this.f46851y2.mo46633we(mo46548im());
            this.f46851y2.mo46624n();
            AbstractC20789d.m108483q(this.f46774D2, this.f72421L0.m92676n2());
            this.f46811e2 = null;
            this.f46774D2 = null;
            C26746f.m137569i();
            this.f46853z2.mo107592n();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: J */
    public void mo46526J(C26365a c26365a) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), c26365a, 0, 1));
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: J1 */
    public void mo46527J1(final C2976g1 c2976g1) {
        this.f46804b1.post(new Runnable() { // from class: vq.x
            @Override // java.lang.Runnable
            public final void run() {
                QuickCommentView.this.m46444LN(c2976g1);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 55);
        C23744a.m124114c().m124117e(this, 55);
        C23744a.m124114c().m124117e(this, 11);
        C23744a.m124114c().m124117e(this, 6013);
        C23744a.m124114c().m124117e(this, 3002);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: Lh */
    public void mo46528Lh(boolean z11) {
        if (z11) {
            try {
                m46448NN(mo37128eM());
                m46442Ka(0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: MB */
    public void mo46529MB(String str) {
        if (this.f46775E1 != null && !TextUtils.isEmpty(str)) {
            this.f46775E1.setText(str);
            this.f46775E1.setSelection(str.length());
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: N2 */
    public void mo46530N2(C19591a c19591a, boolean z11) {
        if (this.f46807c2 != null) {
            if (z11) {
                m46442Ka(1);
            }
            mo46544d4();
            m46537VN();
            this.f46803a2.setVisibility(8);
            this.f46807c2.m47334d(c19591a);
            m46481fO();
            FeedStickerSuggestView feedStickerSuggestView = this.f46813f2;
            if (feedStickerSuggestView != null) {
                feedStickerSuggestView.m79734f();
            }
            this.f46807c2.setStickerUniqueId(String.valueOf(c19591a.m102559b().m132429g()));
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: Nn */
    public void mo46531Nn(boolean z11) {
        boolean z12;
        int i11;
        if (z11) {
            z12 = true;
            i11 = 25;
        } else {
            z12 = false;
            i11 = 1;
        }
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, z12, true, null, null, false, 401, C28020b3.f130648a.m141208y("STICKER_PANEL_", m92676n2()), z11, i11, AbstractC16781w.indicator_bg_color, z11, this.f46808d1, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f46811e2 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f46811e2, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m46504tN();
        }
    }

    /* renamed from: ON */
    public void m46532ON(String str) {
        if (!TextUtils.isEmpty(str)) {
            MediaItem mediaItem = new MediaItem(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaItem);
            this.f46851y2.mo46615f0(arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        SuggestCommentView suggestCommentView;
        View view;
        if (!m46486jN().m75553g() && (view = this.f46824l1) != null) {
            return view;
        }
        if (m46486jN().m75553g() && (suggestCommentView = this.f46805b2) != null && suggestCommentView.getVisibility() == 0) {
            return this.f46805b2;
        }
        return null;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: R */
    public void mo46533R(C2310k c2310k) {
        this.f46819i2.m105865K(this.f46821j2);
        AbstractC2298a0.m12150b(c2310k, m92676n2(), 1004, (ImageView) this.f46823k2, this.f46820j1, this.f46819i2);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C26333b.f125013a.m135515e();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: S0 */
    public void mo46534S0() {
        try {
            m46442Ka(2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            ZaloView m92650VI = m92650VI();
            int m131953a = C25471d.m131951c().m131953a(this.f46851y2.mo46610c());
            bundle.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            if (m92650VI != null && m92650VI.m92642L3() != null) {
                m92650VI.m92642L3().putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: T2 */
    public void mo42955T2(float f11) {
        m46448NN(f11);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: U3 */
    public void mo46535U3(List list) {
        if (list != null && !list.isEmpty()) {
            this.f46775E1.setText("");
            this.f46769B1.setVisibility(8);
            this.f46771C1.setVisibility(8);
            this.f46850y1.setVisibility(8);
        }
        m46489lb(500L);
        m46497pN();
        FeedActionZUtils.m47541b(this, AbstractC23304d.f113308N2);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: Us */
    public void mo46536Us(List list, String str) {
        int i11;
        C25849b c25849b = this.f46825l2;
        if (c25849b != null) {
            c25849b.m133435j(list);
            TextView textView = this.f46767A1;
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = this.f46767A1;
            if (TextUtils.isEmpty(str)) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(textView2, i11);
            this.f46825l2.notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        try {
            super.mo37712VJ();
            m46442Ka(0);
            C0820h.m2142e();
            C8009j c8009j = this.f46815g2;
            if (c8009j != null && c8009j.m92868m()) {
                this.f46815g2.dismiss();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: VN */
    public void m46537VN() {
        this.f46801Z1.setVisibility(0);
        this.f46807c2.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        if (z11) {
            AbstractC23647d.m123897g("4915802");
            this.f46835q2 = true;
            close();
        } else {
            m46486jN().setMinimizedWithAnimation(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
            this.f72421L0.m92676n2().mo35554O(18);
        }
        if (z11 && !z12) {
            m46473bO(AbstractC23309i.m122007i5(MainApplication.getAppContext()), false);
            this.f46851y2.mo46592H3(true);
            m46446MN();
        }
    }

    /* renamed from: XN */
    protected void m46538XN() {
        try {
            C0820h.f2880z = null;
            CommentSupportGifEditText commentSupportGifEditText = this.f46775E1;
            if (commentSupportGifEditText != null) {
                commentSupportGifEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f46775E1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            this.f46814g1 = editable;
            String trim = this.f46775E1.getText().toString().trim();
            if (trim.length() > this.f46851y2.mo46598R()) {
                this.f46775E1.setText(trim.substring(0, this.f46851y2.mo46598R()));
                this.f46775E1.setSelection(this.f46851y2.mo46598R());
            }
            this.f46804b1.removeCallbacks(this.f46816h1);
            this.f46804b1.postDelayed(this.f46816h1, 150L);
            m46451PN();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: b4 */
    public void mo46539b4(String str) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) this.f72421L0.m92648SI().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            new C0012a(clipboardManager, new SensitiveData("clipboard_copy_comment_feed", "social_timeline")).m16c(ClipData.newPlainText("Comment Copy", str));
            if (AbstractC26681b.f126359d) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copied));
            }
        } catch (SensitiveDataException unused) {
            if (AbstractC26681b.f126359d) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_clipboard_block_title));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: c0 */
    public boolean mo46540c0(String str) {
        return AbstractC22055v0.m115146f(str, m92676n2(), this, 1006, 354, null, this.f46776E2);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: cb */
    public void mo46541cb(ItemAlbumMobile itemAlbumMobile) {
        boolean z11;
        if (itemAlbumMobile == null) {
            return;
        }
        try {
            m46479eO(itemAlbumMobile);
            int parseInt = Integer.parseInt(itemAlbumMobile.f42560K);
            this.f46847w2 = parseInt;
            int i11 = 0;
            if (parseInt > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            View view = this.f46784M1;
            if (!z11) {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(view, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        this.f46804b1.postDelayed(new Runnable() { // from class: vq.r
            @Override // java.lang.Runnable
            public final void run() {
                QuickCommentView.this.m46508vN();
            }
        }, 100L);
        super.close();
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: d2 */
    public void mo46543d2() {
        if (!this.f46809d2) {
            m46442Ka(1);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: d4 */
    public void mo46544d4() {
        this.f46804b1.post(new Runnable() { // from class: vq.a0
            @Override // java.lang.Runnable
            public final void run() {
                QuickCommentView.this.m46514yN();
            }
        });
    }

    @Override // p243ip.InterfaceC20646b
    /* renamed from: dC */
    public void mo42994dC(C20649e c20649e) {
        if (c20649e == null) {
            return;
        }
        this.f46770B2 = c20649e;
        int m107631c = c20649e.m107631c();
        if (m107631c != 0) {
            if (m107631c != 1) {
                if (m107631c == 2) {
                    this.f46793V1.m47187V(false);
                    this.f46793V1.m47185S(false);
                    this.f46793V1.m47184Q(true, c20649e.m107630b());
                }
            } else {
                this.f46793V1.m47187V(true);
                this.f46793V1.m47185S(false);
                this.f46793V1.m47183P(false);
            }
        } else {
            this.f46793V1.m47187V(false);
            this.f46793V1.m47185S(false);
            this.f46793V1.m47183P(false);
            m46453QN(c20649e.m107632d(), c20649e.m107634f());
        }
        int m107629a = c20649e.m107629a();
        if (m107629a != 11) {
            if (m107629a == 12) {
                this.f46793V1.m47187V(false);
                this.f46793V1.m47186T(true, c20649e.m107630b());
                this.f46793V1.m47183P(false);
            }
        } else {
            this.f46793V1.m47187V(true);
            this.f46793V1.m47185S(false);
            this.f46793V1.m47183P(false);
        }
        if (this.f46832p1 != null && !TextUtils.isEmpty(c20649e.m107633e())) {
            this.f46832p1.setText(c20649e.m107633e());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return AbstractC23136l9.m118713h0();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: e3 */
    public void mo46545e3(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            new C31050b().m101508a(new C31050b.a(c3020p0));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return this.f46808d1;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.quick_comment_view, (ViewGroup) linearLayout, true);
        this.f46824l1 = inflate;
        m46506uN(inflate);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        this.f46851y2.mo46597O3();
        this.f46851y2.mo46590D2();
        this.f46851y2.mo46633we(mo46548im());
        ItemAlbumMobile mo46626qe = this.f46851y2.mo46626qe();
        Intent intent = new Intent();
        if (mo46626qe != null) {
            intent.putExtra("EXTRA_RESULT_ITEM_ALBUM_MOBILE", mo46626qe);
        }
        if (m92650VI() != null) {
            m92650VI().mo50035CK(-1, intent);
        }
        super.finish();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: g1 */
    public void mo46546g1(MediaItem mediaItem) {
        if (mediaItem != null) {
            try {
                if (AbstractC23041d2.m118194A(mediaItem.mo41081Q())) {
                    AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 1005, 2, AbstractC28568a.m142995a(mediaItem));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickCommentView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: h0 */
    public boolean mo45894h0() {
        return !mo60294yp();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        this.f46851y2.mo46607ae();
        this.f46851y2.mo46636y2(false);
        this.f46851y2.mo46619g8();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: i4 */
    public void mo46547i4(boolean z11) {
        try {
            m46486jN().setMinimized(false);
            CommentSupportGifEditText commentSupportGifEditText = this.f46775E1;
            if (commentSupportGifEditText != null) {
                commentSupportGifEditText.clearFocus();
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_timeline_comment_feed", "social_timeline"));
            AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), ZAbstractBase.ZVU_BLEND_PERCENTAGE, 17, z11, bundle);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: im */
    public String mo46548im() {
        CommentSupportGifEditText commentSupportGifEditText = this.f46775E1;
        if (commentSupportGifEditText != null && commentSupportGifEditText.getText() != null) {
            return this.f46775E1.getText().toString().trim();
        }
        return "";
    }

    @Override // p243ip.InterfaceC20646b
    /* renamed from: jB */
    public void mo42995jB(String str) {
        try {
            if (AbstractC22055v0.m115146f(str, m92676n2(), this, 1006, 355, null, this.f46776E2)) {
                this.f46825l2.notifyDataSetChanged();
                this.f46793V1.m10008p();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: k4 */
    public void mo46549k4(String str) {
        CommentSupportGifEditText commentSupportGifEditText = this.f46775E1;
        if (commentSupportGifEditText != null) {
            commentSupportGifEditText.setText(str);
            this.f46775E1.requestFocus();
            CommentSupportGifEditText commentSupportGifEditText2 = this.f46775E1;
            commentSupportGifEditText2.setSelection(commentSupportGifEditText2.getText().length());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 1002 && i12 == -1) {
                if (intent != null) {
                    this.f46851y2.mo46615f0(GalleryPickerView.m71440ZM(intent));
                }
            } else if (i11 == 1004) {
                if (i12 == -1 && intent != null) {
                    this.f46851y2.mo46625n0(intent.getStringArrayListExtra("EXTRA_DELETED_COMMENTS"));
                }
            } else if (i11 == 1005 && i12 == -1 && intent != null) {
                this.f46851y2.mo46594K2(C23912e.m125039a(intent), this.f46807c2.getPreviewData());
            }
            StickerPanelView stickerPanelView = this.f46811e2;
            if (stickerPanelView != null) {
                stickerPanelView.onActivityResult(i11, i12, intent);
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        super.onClick(view);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnLoadMore) {
            if (C23055e5.m118272g(true)) {
                AbstractC23647d.m123897g("18400");
                if (this.f46828n1 != null && this.f46826m1.m35364k()) {
                    return;
                }
                AbstractC23136l9.m118744r1(this.f46844v1, 8);
                this.f46851y2.mo46636y2(true);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.cmtinput_send) {
            this.f46851y2.mo46611c0(mo46548im(), m46493nN());
            return;
        }
        if (id2 == AbstractC6918a0.cmtinput_text) {
            m46448NN(0.0f);
            mo46543d2();
            AbstractC23647d.m123897g("188014");
            return;
        }
        if (id2 == AbstractC6918a0.ic_edit_photo_preview) {
            m46442Ka(0);
            CommentSupportGifEditText commentSupportGifEditText = this.f46775E1;
            if (commentSupportGifEditText != null) {
                commentSupportGifEditText.clearFocus();
            }
            this.f46851y2.mo46629s3(this.f46807c2.getPreviewData());
            return;
        }
        if (id2 == AbstractC6918a0.imvRemoveLayoutReplyComment) {
            AbstractC23136l9.m118744r1(this.f46795W1, 8);
            this.f46851y2.mo46628rk();
            return;
        }
        if (id2 == AbstractC6918a0.imgEmoSticker) {
            if (!this.f46809d2 && this.f46800Z0 == 2) {
                CommentSupportGifEditText commentSupportGifEditText2 = this.f46775E1;
                if (commentSupportGifEditText2 != null) {
                    commentSupportGifEditText2.requestFocus();
                }
                m46442Ka(1);
                AbstractC23647d.m123897g("188022");
                return;
            }
            m46442Ka(2);
            AbstractC23647d.m123897g("188020");
            return;
        }
        if (id2 != AbstractC6918a0.imvEmptyIcon && id2 != AbstractC6918a0.tvSuggestSeeMore) {
            if (id2 == AbstractC6918a0.btnGallery) {
                mo46547i4(true);
                AbstractC23647d.m123897g("188010");
                return;
            }
            if (id2 == AbstractC6918a0.layout_like_description_container_view) {
                AbstractC23647d.m123897g("4915804");
                m46467YN(1);
                m46488lN("", false);
                return;
            } else if (id2 == AbstractC6918a0.btn_refresh) {
                this.f46851y2.mo46636y2(false);
                return;
            } else {
                if (id2 == AbstractC6918a0.icn_back) {
                    AbstractC23647d.m123897g("4915805");
                    m46467YN(0);
                    return;
                }
                return;
            }
        }
        if (this.f46800Z0 != 2) {
            m46442Ka(2);
            if (view.getId() == AbstractC6918a0.imvEmptyIcon) {
                str = "18804";
            } else {
                str = "18805";
            }
            AbstractC23647d.m123897g(str);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent) || C25979a.m133814e(m92650VI(), i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            if (this.f46800Z0 == 1) {
                m46442Ka(0);
                return true;
            }
            StickerPanelView stickerPanelView = this.f46811e2;
            if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
                m46442Ka(0);
                return true;
            }
            if (this.f46818i1 == 1) {
                m46467YN(0);
                return true;
            }
            close();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f46809d2) {
            m46442Ka(1);
        }
        this.f46851y2.mo46618g3();
        m46482gN();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        try {
            m46481fO();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: q0 */
    public void mo46550q0() {
        C25849b c25849b = this.f46825l2;
        if (c25849b != null) {
            c25849b.notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: q4 */
    public void mo46551q4(CharSequence charSequence, final int i11, boolean z11, boolean z12, boolean z13, boolean z14) {
        try {
            C8009j c8009j = (C8009j) AbstractC23093i.m118460m(this.f72421L0.m92648SI(), z11, z12, z13, z14, charSequence, new AbstractC23093i.a() { // from class: vq.y
                @Override // me0.AbstractC23093i.a
                /* renamed from: a */
                public final void mo87380a(int i12) {
                    QuickCommentView.this.m46439JN(i11, i12);
                }
            });
            this.f46815g2 = c8009j;
            if (c8009j != null && !c8009j.m92868m()) {
                this.f46815g2.m92855F(new InterfaceC17463d.e() { // from class: vq.z
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        QuickCommentView.this.m46441KN(interfaceC17463d);
                    }
                });
                this.f46815g2.mo13822K();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: qN */
    public void m46552qN() {
        this.f46801Z1.setVisibility(8);
        this.f46807c2.m47332a();
        this.f46803a2.setVisibility(8);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: r2 */
    public void mo46553r2(C19591a c19591a) {
        m46442Ka(1);
        mo46525I2(true, c19591a);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: s3 */
    public void mo46554s3(C19591a c19591a) {
        CommentPreviewView commentPreviewView = this.f46807c2;
        if (commentPreviewView != null) {
            commentPreviewView.m47333b(c19591a);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: t1 */
    public void mo46555t1() {
        m46442Ka(0);
        m46552qN();
        this.f46851y2.mo46596N3();
        m46481fO();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: vg */
    public void mo46556vg(boolean z11) {
        boolean z12 = false;
        if (!z11 && m46487kN() <= f46766F2) {
            z12 = true;
        }
        m46486jN().setMinimized(z12);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 11) {
                if (i11 != 55) {
                    if (i11 != 3002) {
                        if (i11 == 6013) {
                            this.f46851y2.mo46630w();
                            return;
                        }
                        return;
                    }
                    if (objArr != null && objArr.length > 0) {
                        Object obj = objArr[0];
                        if (obj instanceof String) {
                            this.f46853z2.mo107590c5(this.f46793V1.m47180M(), (String) obj);
                            C25849b c25849b = this.f46825l2;
                            if (c25849b != null) {
                                c25849b.notifyDataSetChanged();
                            }
                            C8840a c8840a = this.f46793V1;
                            if (c8840a != null) {
                                c8840a.m10008p();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (objArr != null && objArr.length > 0) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof C10881t) {
                        this.f46851y2.mo46588B((C10881t) obj2);
                        return;
                    }
                    return;
                }
                return;
            }
            mo70710wy(new Runnable() { // from class: vq.b0
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCommentView.this.m46510wN();
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        C25470c m131954b;
        C25470c m131954b2;
        super.mo37135xJ(bundle);
        this.f46851y2.mo46592H3(false);
        if (bundle != null) {
            int i12 = bundle.getInt("EXTRA_DATA_RETAIN_KEY", -1);
            if (i12 != -1 && (m131954b2 = C25471d.m131951c().m131954b(i12)) != null) {
                this.f46851y2.mo46609b(m131954b2);
            }
            m46471aO();
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (i11 = m92642L3.getInt("EXTRA_DATA_RETAIN_KEY", -1)) != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            this.f46851y2.mo46609b(m131954b);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: y3 */
    public void mo46557y3() {
        m46442Ka(0);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b
    /* renamed from: yh */
    public void mo46558yh() {
        try {
            FeedActionZUtils.m47541b(this.f72421L0, AbstractC23304d.f113308N2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 55);
        C23744a.m124114c().m124115b(this, 55);
        C23744a.m124114c().m124115b(this, 11);
        C23744a.m124114c().m124115b(this, 6013);
        C23744a.m124114c().m124115b(this, 3002);
    }
}
