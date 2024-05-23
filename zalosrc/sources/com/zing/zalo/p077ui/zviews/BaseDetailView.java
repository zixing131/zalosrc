package com.zing.zalo.p077ui.zviews;

import ag0.C0820h;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3020p0;
import bo.EnumC2963d3;
import bo.InterfaceC2946a1;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.components.FeedItemFooterActionBarModulesView;
import com.zing.zalo.feed.components.FeedItemMusicModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.music.transfer.MusicDetailResult;
import com.zing.zalo.feed.uicontrols.FeedLikeButtonModulesView;
import com.zing.zalo.feed.uicontrols.commentpreview.CommentPreviewView;
import com.zing.zalo.feed.uicontrols.suggestcomment.C8890a;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.CommentSupportGifEditText;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18505l;
import gs.C19591a;
import hf0.C20043e;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import java.util.Iterator;
import java.util.List;
import l80.C22126c0;
import me0.AbstractC23093i;
import me0.AbstractC23115k;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import no.C23909b;
import np.InterfaceC23923b;
import p006a0.C0012a;
import p109ds.C18063b;
import p109ds.C18064c;
import p167fs.C19140e;
import p205hc.C19965d;
import p215hp.C20111a;
import p302ko.InterfaceC21779a;
import p302ko.InterfaceC21780b;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p471r3.C25630b;
import p489rn.C25849b;
import p490rp.AbstractC25950a;
import p554up.C27353a;
import p690yq.C31050b;
import p691yr.AbstractC31062l;
import p691yr.AbstractC31064n;
import p691yr.C31060j;
import p691yr.C31063m;
import p716zh.C31933ga;
import pm0.C24848g0;
import pr.C24906b;
import sn.C26333b;
import th.AbstractC26681b;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;
import ti0.C26708g;
import ui0.C27280g;
import vg.C28020b3;
import w20.InterfaceC28698a;
import y90.EnumC30858b;
import y90.EnumC30861e;

/* loaded from: classes6.dex */
public abstract class BaseDetailView extends FeedCallbackZaloView implements InterfaceC21780b, InterfaceC28698a, View.OnClickListener, InterfaceC23923b {

    /* renamed from: A1 */
    FrameLayout f72259A1;

    /* renamed from: B1 */
    FrameLayout f72260B1;

    /* renamed from: C1 */
    FeedItemFooterActionBarModulesView f72261C1;

    /* renamed from: D1 */
    PreviewStickerDialogView f72262D1;

    /* renamed from: E1 */
    View f72263E1;

    /* renamed from: F1 */
    protected C18063b f72264F1;

    /* renamed from: G1 */
    protected C18064c f72265G1;

    /* renamed from: H1 */
    ModulesView f72266H1;

    /* renamed from: J1 */
    C22126c0 f72268J1;

    /* renamed from: K1 */
    RelativeLayout f72269K1;

    /* renamed from: L1 */
    Divider f72270L1;

    /* renamed from: M1 */
    TextView f72271M1;

    /* renamed from: O1 */
    C27353a f72273O1;

    /* renamed from: P1 */
    C20111a f72274P1;

    /* renamed from: R0 */
    C23528a f72276R0;

    /* renamed from: R1 */
    private int f72277R1;

    /* renamed from: S0 */
    View f72278S0;

    /* renamed from: T0 */
    SwipeRefreshListView f72280T0;

    /* renamed from: T1 */
    int f72281T1;

    /* renamed from: U0 */
    ImageView f72282U0;

    /* renamed from: V0 */
    RelativeLayout f72284V0;

    /* renamed from: V1 */
    TextView f72285V1;

    /* renamed from: W0 */
    TextView f72286W0;

    /* renamed from: W1 */
    TextView f72287W1;

    /* renamed from: X0 */
    View f72288X0;

    /* renamed from: Y0 */
    ImageView f72289Y0;

    /* renamed from: Z0 */
    LinearLayout f72290Z0;

    /* renamed from: a1 */
    RobotoTextView f72291a1;

    /* renamed from: b1 */
    View f72292b1;

    /* renamed from: c1 */
    CommentPreviewView f72293c1;

    /* renamed from: d1 */
    SuggestCommentView f72294d1;

    /* renamed from: e1 */
    LinearLayout f72295e1;

    /* renamed from: f1 */
    TextView f72296f1;

    /* renamed from: g1 */
    LinearLayout f72297g1;

    /* renamed from: i1 */
    LinearLayout f72299i1;

    /* renamed from: j1 */
    C8009j f72300j1;

    /* renamed from: k1 */
    CommentSupportGifEditText f72301k1;

    /* renamed from: l1 */
    View f72302l1;

    /* renamed from: m1 */
    ListView f72303m1;

    /* renamed from: n1 */
    C25849b f72304n1;

    /* renamed from: p1 */
    FeedStickerSuggestView f72306p1;

    /* renamed from: q1 */
    StickerPanelView f72307q1;

    /* renamed from: r1 */
    RelativeLayout f72308r1;

    /* renamed from: s1 */
    FeedLikeButtonModulesView f72309s1;

    /* renamed from: t1 */
    RobotoTextView f72310t1;

    /* renamed from: u1 */
    RelativeLayout f72311u1;

    /* renamed from: v1 */
    RecyclingImageView f72312v1;

    /* renamed from: w1 */
    ImageButton f72313w1;

    /* renamed from: x1 */
    RedDotImageButton f72314x1;

    /* renamed from: y1 */
    public KeyboardFrameLayout f72315y1;

    /* renamed from: z1 */
    boolean f72316z1;

    /* renamed from: h1 */
    RobotoTextView f72298h1 = null;

    /* renamed from: o1 */
    boolean f72305o1 = false;

    /* renamed from: I1 */
    protected final C13704p1 f72267I1 = new C13704p1(1);

    /* renamed from: N1 */
    protected final boolean f72272N1 = C31060j.m150913U();

    /* renamed from: Q1 */
    protected int f72275Q1 = 0;

    /* renamed from: S1 */
    protected boolean f72279S1 = false;

    /* renamed from: U1 */
    protected final Handler f72283U1 = new HandlerC14084a(Looper.getMainLooper());

    /* renamed from: com.zing.zalo.ui.zviews.BaseDetailView$a */
    /* loaded from: classes6.dex */
    class HandlerC14084a extends Handler {
        HandlerC14084a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 2) {
                BaseDetailView.this.m78364wN();
                BaseDetailView baseDetailView = BaseDetailView.this;
                int i11 = baseDetailView.f72281T1 - 1;
                baseDetailView.f72281T1 = i11;
                if (i11 > 0) {
                    baseDetailView.f72283U1.sendEmptyMessageDelayed(2, 50L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseDetailView$b */
    /* loaded from: classes6.dex */
    public class C14085b implements C8890a.f {

        /* renamed from: a */
        final /* synthetic */ C2976g1 f72318a;

        C14085b(C2976g1 c2976g1) {
            this.f72318a = c2976g1;
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: c */
        public void mo46559c() {
            BaseDetailView.this.mo78343d4();
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: d */
        public void mo46560d(C2988i3 c2988i3, int i11, int i12) {
            BaseDetailView.this.mo78324KM().mo112336Z3(c2988i3);
            BaseDetailView.this.mo78324KM().mo112335T1(i11, i12, c2988i3.m14164c());
            BaseDetailView.this.mo78343d4();
            C24906b.f119505a.m129550N(this.f72318a, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseDetailView$c */
    /* loaded from: classes6.dex */
    public class ViewOnClickListenerC14086c implements View.OnClickListener, C16719g.c {

        /* renamed from: p */
        int f72320p;

        /* renamed from: q */
        int f72321q;

        public ViewOnClickListenerC14086c(int i11) {
            this.f72321q = 0;
            this.f72320p = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseDetailView.this.mo78324KM().mo112332On(view, this.f72320p, this.f72321q);
        }

        @Override // com.zing.zalo.uidrawing.C16719g.c
        /* renamed from: y */
        public void mo929y(C16719g c16719g) {
            BaseDetailView.this.mo78324KM().mo112330Nn(c16719g, this.f72320p, this.f72321q);
        }

        public ViewOnClickListenerC14086c(int i11, int i12) {
            this.f72320p = i11;
            this.f72321q = i12;
        }
    }

    /* renamed from: FM */
    private void m78276FM() {
        SuggestCommentView suggestCommentView = this.f72294d1;
        if (suggestCommentView != null && suggestCommentView.getVisibility() == 0 && this.f72294d1.m47445f() && !TextUtils.isEmpty(mo78324KM().mo112324I())) {
            C26333b.f125013a.m135521q(mo78324KM().mo112324I(), 2, mo78324KM().mo112339g(), Integer.valueOf(this.f72294d1.getContentType()), Integer.valueOf(mo78324KM().mo112327M3()));
        }
    }

    /* renamed from: HM */
    private void m78277HM() {
        if (this.f72268J1 == null) {
            return;
        }
        new C26707f(this.f72268J1).m137318a(C26705d.m137293a(m92689tK(), AbstractC2814h.t_xsmall_m));
        this.f72268J1.m111962J1(C23212s8.m119606n(AbstractC2807a.text_secondary));
        this.f72267I1.m76614d(this.f72268J1.m111977q1(), false);
        this.f72267I1.setTypeface(this.f72268J1.m111978r1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public void m78278MM(InterfaceC2946a1 interfaceC2946a1) {
        mo78324KM().mo112329Nh(interfaceC2946a1);
    }

    /* renamed from: PM */
    private void m78279PM() {
        AbstractC23136l9.m118744r1(this.f72290Z0, 8);
        RobotoTextView robotoTextView = this.f72291a1;
        if (robotoTextView != null) {
            robotoTextView.setText("");
        }
    }

    /* renamed from: TM */
    private void m78280TM() {
        mo78336RM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public /* synthetic */ void m78281XM() {
        SuggestCommentView suggestCommentView = this.f72294d1;
        if (suggestCommentView != null) {
            suggestCommentView.setVisibility(8);
            this.f72294d1.m47444e();
            C26333b.f125013a.m135518n(mo78324KM().mo112324I(), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public /* synthetic */ void m78282YM(View view) {
        mo78324KM().mo112328N3();
        m78335QM();
        m78313AN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public /* synthetic */ void m78283ZM(C27353a.g gVar) {
        mo78352mN(gVar.m140010a(), gVar.m140011b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ C24848g0 m78284aN(C27353a.b bVar) {
        if (bVar instanceof C27353a.g) {
            final C27353a.g gVar = (C27353a.g) bVar;
            mo78325Ka(0);
            this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.w1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseDetailView.this.m78283ZM(gVar);
                }
            }, 200L);
            return null;
        }
        if (bVar instanceof C27353a.d) {
            mo78936E(((C27353a.d) bVar).m140007a());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m78285bN() {
        this.f72305o1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public /* synthetic */ void m78286cN() {
        try {
            this.f72305o1 = true;
            this.f72303m1.setSelection(this.f72304n1.getCount());
            this.f72303m1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.t1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseDetailView.this.m78285bN();
                }
            }, 200L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public /* synthetic */ void m78287dN(int i11) {
        ListView listView = this.f72303m1;
        if (listView != null) {
            if (i11 < 20) {
                listView.smoothScrollToPosition(i11);
            } else {
                listView.setSelection(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public /* synthetic */ void m78288eN(View view) {
        try {
            mo78350lb(300L);
            AbstractC23136l9.m118744r1(this.f72298h1, 8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public /* synthetic */ void m78289fN(int i11, int i12) {
        mo78324KM().mo112338f2(i12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public /* synthetic */ void m78290gN(InterfaceC17463d interfaceC17463d) {
        if (this.f72300j1 == interfaceC17463d) {
            this.f72300j1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public /* synthetic */ void m78291hN(C2976g1 c2976g1) {
        SuggestCommentView suggestCommentView = this.f72294d1;
        if (suggestCommentView != null) {
            suggestCommentView.setVisibility(0);
            this.f72294d1.m47447j(c2976g1.m14117c(), c2976g1.m14115a(), true);
            this.f72294d1.setOnSuggestCommentClickListener(new C14085b(c2976g1));
            C26333b.f125013a.m135521q(c2976g1.m14115a(), 2, mo78324KM().mo112339g(), Integer.valueOf(this.f72294d1.getContentType()), Integer.valueOf(mo78324KM().mo112327M3()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public /* synthetic */ void m78292iN() {
        try {
            int count = this.f72304n1.getCount();
            if (count < 20) {
                this.f72303m1.smoothScrollToPosition(count);
            } else {
                this.f72303m1.setSelection(count - 1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kN */
    private void m78293kN() {
        this.f72273O1.m139988b0().m9219j(this, new C19965d(new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.s1
            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m78284aN;
                m78284aN = BaseDetailView.this.m78284aN((C27353a.b) obj);
                return m78284aN;
            }
        }));
    }

    /* renamed from: lN */
    private void m78294lN() {
        this.f72273O1.m139983W().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.u1
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                BaseDetailView.this.m78278MM((InterfaceC2946a1) obj);
            }
        });
    }

    /* renamed from: oN */
    private void m78295oN(int i11) {
        final int min = Math.min(i11, this.f72303m1.getAdapter().getCount());
        if (min > 0) {
            this.f72303m1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.x1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseDetailView.this.m78287dN(min);
                }
            }, 300L);
        }
    }

    /* renamed from: pN */
    private void m78296pN() {
        AbstractC31062l m150961a = C31063m.f143208a.m150961a(m92689tK(), C31063m.a.f143213s);
        this.f72311u1.setBackground(AbstractC31064n.m150965a(m150961a));
        this.f72312v1.setImageDrawable(m150961a.m150959c());
    }

    /* renamed from: qN */
    private void m78298qN() {
        RelativeLayout relativeLayout = this.f72308r1;
        C31060j c31060j = C31060j.f143193a;
        Context m92689tK = m92689tK();
        C31063m.a aVar = C31063m.a.f143213s;
        relativeLayout.setBackground(c31060j.m150941g(0, m92689tK, aVar));
        this.f72309s1.m47306V(4, AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
        this.f72309s1.m47308X(false, 0);
        if (this.f72310t1 != null) {
            new C26708g(this.f72310t1).m137319a(C19140e.f95172a.m100454d(m92689tK()));
            this.f72310t1.setTextColor(c31060j.m150933J(0, m92689tK(), aVar));
        }
    }

    /* renamed from: rN */
    private void m78300rN(View view) {
        this.f72286W0 = (TextView) view.findViewById(AbstractC6918a0.tvNoComment);
        new C26708g(this.f72286W0).m137319a(C26705d.m137293a(m92689tK(), AbstractC2814h.t_large_m));
        this.f72286W0.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        C26703b m137293a = C26705d.m137293a(m92689tK(), AbstractC2814h.t_small);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tvNoCommentSuggest);
        this.f72285V1 = textView;
        new C26708g(textView).m137319a(m137293a);
        this.f72285V1.setTextColor(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        C26703b m137293a2 = C26705d.m137293a(m92689tK(), AbstractC2814h.t_small_m);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.tvSuggestSeeMore);
        this.f72287W1 = textView2;
        new C26708g(textView2).m137319a(m137293a2);
        this.f72287W1.setTextColor(C23212s8.m119606n(AbstractC2807a.cta_link));
    }

    /* renamed from: tN */
    private void m78303tN(boolean z11, C19591a c19591a) {
        try {
            if (z11) {
                mo78343d4();
                m78362uN();
                this.f72293c1.m47334d(c19591a);
                this.f72282U0.setVisibility(0);
                FeedStickerSuggestView feedStickerSuggestView = this.f72306p1;
                if (feedStickerSuggestView != null) {
                    feedStickerSuggestView.m79734f();
                }
            } else {
                m78335QM();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: yN */
    private void m78309yN() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f72307q1 = (StickerPanelView) m92996E0;
        }
        if (this.f72307q1 != null) {
            mo78340VM();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: A1 */
    public boolean mo78311A1() {
        CommentPreviewView commentPreviewView = this.f72293c1;
        if (commentPreviewView == null || this.f72306p1 == null || this.f72301k1 == null) {
            return true;
        }
        if (commentPreviewView.getVisibility() != 0) {
            if (this.f72306p1.getVisibility() != 0) {
                return true;
            }
            if (this.f72306p1.m79738k() && TextUtils.isEmpty(this.f72301k1.getText())) {
                return true;
            }
        }
        return false;
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: A6 */
    public void mo78312A6(boolean z11) {
        SwipeRefreshListView swipeRefreshListView = this.f72280T0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setRefreshing(false);
            if (z11) {
                this.f72280T0.m88209V();
            } else {
                this.f72280T0.m88202K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: AN */
    public void m78313AN() {
        String str;
        boolean z11;
        try {
            CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
            if (commentSupportGifEditText != null && commentSupportGifEditText.getText() != null) {
                str = this.f72301k1.getText().toString().trim();
            } else {
                str = "";
            }
            ImageButton imageButton = this.f72313w1;
            if (!mo78324KM().mo112342i2() && TextUtils.isEmpty(str)) {
                z11 = false;
                imageButton.setEnabled(z11);
            }
            z11 = true;
            imageButton.setEnabled(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: Ay */
    public void mo78314Ay(int i11) {
        C25849b c25849b = this.f72304n1;
        if (c25849b != null) {
            c25849b.m133436k(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m78280TM();
        mo78337SM();
    }

    /* renamed from: DM */
    public void m78315DM() {
        C16719g c16719g;
        C18063b c18063b = new C18063b(m92689tK());
        this.f72264F1 = c18063b;
        c18063b.m89106L().m89027K(true).m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112576o);
        C18064c c18064c = new C18064c(m92689tK());
        this.f72265G1 = c18064c;
        c18064c.m89106L().m89028L(-2, -2).m89027K(true);
        if (this.f72272N1) {
            c16719g = this.f72265G1;
        } else {
            c16719g = this.f72264F1;
        }
        C22126c0 c22126c0 = new C22126c0(this.f72421L0.getContext());
        this.f72268J1 = c22126c0;
        c22126c0.m89106L().m89034R(AbstractC23222t7.f112562h).m89029M(12).m89054h0(c16719g).m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112576o);
        m78277HM();
        ModulesView modulesView = this.f72266H1;
        if (modulesView != null) {
            modulesView.mo44090O();
            this.f72266H1.mo69681L(c16719g);
            this.f72266H1.mo69681L(this.f72268J1);
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: E0 */
    public void mo78316E0(C25630b c25630b, int i11) {
        try {
            AbstractC20789d.m108483q(this.f72262D1, this.f72421L0.m92676n2());
            Bundle bundle = new Bundle();
            bundle.putSerializable("gifInfo", c25630b);
            bundle.putInt("source", i11);
            this.f72262D1 = AbstractC20789d.m108482p(301, this, this.f72421L0.m92649TI(), bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: EM */
    public void m78317EM(boolean z11, Divider divider) {
        if (divider != null && (divider.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int i11 = 0;
            if (this.f72272N1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) divider.getLayoutParams();
                if (!z11) {
                    i11 = AbstractC23222t7.f112576o;
                }
                marginLayoutParams.topMargin = i11;
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) divider.getLayoutParams();
            if (!z11) {
                i11 = AbstractC23222t7.f112576o;
            }
            marginLayoutParams2.bottomMargin = i11;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo78323JM(), viewGroup, false);
        this.f72278S0 = inflate;
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: GM */
    public void m78318GM() {
        View view;
        if (this.f72272N1 && (view = this.f72263E1) != null && this.f72270L1 != null && this.f72308r1 != null && this.f72311u1 != null && this.f72271M1 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(3);
                layoutParams2.removeRule(9);
            }
            ViewGroup.LayoutParams layoutParams3 = this.f72270L1.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.addRule(3, this.f72263E1.getId());
                layoutParams4.bottomMargin = 0;
            }
            ViewGroup.LayoutParams layoutParams5 = this.f72308r1.getLayoutParams();
            if (layoutParams5 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                layoutParams6.addRule(3, this.f72270L1.getId());
                layoutParams6.topMargin = AbstractC23222t7.f112572m;
            }
            ViewGroup.LayoutParams layoutParams7 = this.f72311u1.getLayoutParams();
            if (layoutParams7 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
                layoutParams8.addRule(3, this.f72270L1.getId());
                layoutParams8.topMargin = AbstractC23222t7.f112572m;
            }
            AbstractC23136l9.m118717i1(this.f72271M1, AbstractC23222t7.f112576o);
        }
    }

    @Override // w20.InterfaceC28698a
    /* renamed from: Gg */
    public int mo46523Gg() {
        if (this.f72275Q1 == 0) {
            return 0;
        }
        return this.f72277R1;
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: H3 */
    public void mo78319H3() {
        SuggestCommentView suggestCommentView = this.f72294d1;
        if (suggestCommentView != null && suggestCommentView.m47445f()) {
            this.f72294d1.m47446i();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: I2 */
    public void mo78320I2(boolean z11, C19591a c19591a) {
        try {
            m78303tN(z11, c19591a);
            m78313AN();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IM */
    public View m78321IM() {
        FrameLayout frameLayout = this.f72259A1;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            return this.f72259A1.getChildAt(0);
        }
        return null;
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: J1 */
    public void mo78322J1(final C2976g1 c2976g1) {
        this.f72283U1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v1
            @Override // java.lang.Runnable
            public final void run() {
                BaseDetailView.this.m78291hN(c2976g1);
            }
        });
    }

    /* renamed from: JM */
    public abstract int mo78323JM();

    /* renamed from: KM */
    protected abstract InterfaceC21779a mo78324KM();

    /* renamed from: Ka */
    public void mo78325Ka(int i11) {
        this.f72275Q1 = i11;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC2379w.m12430d(this.f72301k1);
                        CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
                        if (commentSupportGifEditText != null && !TextUtils.isEmpty(commentSupportGifEditText.getText())) {
                            C31933ga.f146718a.m153475r(EnumC30858b.f142393q);
                        } else {
                            C31933ga.f146718a.m153475r(EnumC30858b.f142392p);
                        }
                        this.f72314x1.setImageResource(AbstractC16803z.ic_postfeed_keyboard);
                        this.f72315y1.setPaddingBottom(AbstractC23309i.m122007i5(MainApplication.getAppContext()));
                        this.f72315y1.requestLayout();
                        if (this.f72307q1 == null) {
                            mo78339UM();
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(this.f72277R1));
                        }
                        m78360sN(this.f72307q1, true);
                        return;
                    }
                    return;
                }
                m78360sN(this.f72307q1, false);
                this.f72314x1.setImageResource(AbstractC16803z.icn_emoji);
                this.f72315y1.setPaddingBottom(AbstractC23309i.m122007i5(MainApplication.getAppContext()));
                this.f72315y1.requestLayout();
                AbstractC2379w.m12432f(this.f72301k1);
                return;
            }
            AbstractC2379w.m12430d(this.f72301k1);
            m78360sN(this.f72307q1, false);
            this.f72314x1.setImageResource(AbstractC16803z.icn_emoji);
            this.f72315y1.setPaddingBottom(0);
            this.f72315y1.requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: LM */
    public void m78326LM(int i11, Intent intent) {
        C17487o0 c17487o0;
        if (i11 == -1 && intent != null) {
            try {
                MusicDetailResult m133686a = AbstractC25950a.m133686a(intent);
                if (m133686a != null) {
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    TrackingSource trackingSource = new TrackingSource(41);
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_SONG_ID", m133686a.m45741a());
                    bundle.putString("extra_tracking_source", trackingSource.m40686z());
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(UpdateStatusView.class, bundle, 0, 1, true);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: Ln */
    public void mo78327Ln(Runnable runnable) {
        Handler handler = this.f72827B0;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: Mg */
    public void mo78328Mg(String str, SongInfo songInfo, boolean z11) {
        m78347jN();
        this.f72273O1.m139997p0(str, songInfo, z11);
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: N2 */
    public void mo78329N2(C19591a c19591a, boolean z11) {
        if (this.f72293c1 != null) {
            mo78343d4();
            m78362uN();
            this.f72282U0.setVisibility(8);
            this.f72293c1.m47334d(c19591a);
            if (z11) {
                mo78325Ka(1);
            }
            m78313AN();
            FeedStickerSuggestView feedStickerSuggestView = this.f72306p1;
            if (feedStickerSuggestView != null) {
                feedStickerSuggestView.m79734f();
            }
            this.f72293c1.setStickerUniqueId(String.valueOf(c19591a.m102559b().m132429g()));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2263e
    /* renamed from: N4 */
    public void mo11979N4(String str) {
        this.f72273O1.m140000s0(str, mo78324KM().mo112339g());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        InterfaceC21779a mo78324KM = mo78324KM();
        if (i11 == 24 && mo78324KM != null) {
            mo78324KM.mo112326Le();
        }
        return super.mo39030NJ(i11, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: NM */
    public SparseArray m78330NM(View view, C3000l0 c3000l0) {
        List<Integer> list = null;
        if (view == null) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        if (view instanceof FeedItemBaseModuleView) {
            list = ((FeedItemBaseModuleView) view).getArrIdsListCallback();
        } else if (view instanceof FeedItemBase) {
            list = ((FeedItemBase) view).getArrIdsListCallback();
        }
        if (list != null) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 4) {
                            switch (intValue) {
                                case 8:
                                    sparseArray.put(8, new ViewOnClickListenerC14086c(11));
                                    break;
                                case 9:
                                    sparseArray.put(9, new ViewOnClickListenerC14086c(8));
                                    break;
                                case 10:
                                    sparseArray.put(10, new ViewOnClickListenerC14086c(4));
                                    break;
                                case 11:
                                    sparseArray.put(11, new ViewOnClickListenerC14086c(5));
                                    break;
                                case 12:
                                    sparseArray.put(12, new ViewOnClickListenerC14086c(2));
                                    break;
                                case 13:
                                    sparseArray.put(13, new ViewOnClickListenerC14086c(3));
                                    break;
                                case 14:
                                    if (!(view instanceof FeedItemVideo)) {
                                        break;
                                    } else {
                                        sparseArray.put(14, new ViewOnClickListenerC14086c(17));
                                        break;
                                    }
                                case 15:
                                    if (!(view instanceof FeedItemSocialAlbum)) {
                                        break;
                                    } else {
                                        sparseArray.put(15, new ViewOnClickListenerC14086c(18));
                                        break;
                                    }
                            }
                        } else {
                            sparseArray.put(4, new ViewOnClickListenerC14086c(14, 0));
                        }
                    } else {
                        sparseArray.put(1, new ViewOnClickListenerC14086c(15, 0));
                    }
                } else {
                    sparseArray.put(0, new ViewOnClickListenerC14086c(14, 0));
                }
            }
        }
        return sparseArray;
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: OB */
    public void mo78331OB() {
        this.f72273O1.m140004w0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: OM */
    public SparseArray m78332OM(View view) {
        List<Integer> list = null;
        if (view == null) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        if (view instanceof FeedItemBaseModuleView) {
            list = ((FeedItemBaseModuleView) view).getArrIdsListCallback();
        } else if (view instanceof FeedItemBase) {
            list = ((FeedItemBase) view).getArrIdsListCallback();
        }
        if (list != null) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 4) {
                            switch (intValue) {
                                case 8:
                                    sparseArray.put(8, new ViewOnClickListenerC14086c(11));
                                    break;
                                case 9:
                                    sparseArray.put(9, new ViewOnClickListenerC14086c(8));
                                    break;
                                case 10:
                                    sparseArray.put(10, new ViewOnClickListenerC14086c(4));
                                    break;
                                case 11:
                                    sparseArray.put(11, new ViewOnClickListenerC14086c(5));
                                    break;
                                case 12:
                                    sparseArray.put(12, new ViewOnClickListenerC14086c(2));
                                    break;
                                case 13:
                                    sparseArray.put(13, new ViewOnClickListenerC14086c(3));
                                    break;
                            }
                        } else {
                            sparseArray.put(4, new ViewOnClickListenerC14086c(14, 0));
                        }
                    } else {
                        sparseArray.put(1, new ViewOnClickListenerC14086c(15, 0));
                    }
                } else {
                    sparseArray.put(0, new ViewOnClickListenerC14086c(14, 0));
                }
            }
        }
        return sparseArray;
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: Ob */
    public void mo78333Ob(C23909b c23909b) {
        if (c23909b == null) {
            return;
        }
        if (c23909b.f115533a == 0) {
            AbstractC23136l9.m118744r1(this.f72295e1, 0);
            AbstractC23136l9.m118744r1(this.f72296f1, 8);
            AbstractC23136l9.m118744r1(this.f72297g1, 0);
        } else {
            SwipeRefreshListView swipeRefreshListView = this.f72280T0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
                this.f72280T0.setVisibility(0);
            }
            AbstractC23136l9.m118744r1(this.f72297g1, 8);
            ImageView imageView = this.f72289Y0;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f72289Y0.setImageResource(C23212s8.m119610r(AbstractC16781w.empty_state_comment));
            }
            TextView textView = this.f72286W0;
            if (textView != null) {
                textView.setText(c23909b.f115535c);
            }
            int i11 = c23909b.f115533a;
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC23136l9.m118744r1(this.f72289Y0, 8);
                    AbstractC23136l9.m118744r1(this.f72286W0, 8);
                    AbstractC23136l9.m118744r1(this.f72288X0, 8);
                }
            } else {
                AbstractC23136l9.m118744r1(this.f72289Y0, 0);
                m78363vN(this.f72286W0);
                m78363vN(this.f72288X0);
            }
        }
        int i12 = c23909b.f115536d;
        if (i12 != 20) {
            if (i12 == 21) {
                this.f72297g1.setGravity(19);
                m78363vN(this.f72295e1);
                m78363vN(this.f72296f1);
                return;
            }
            return;
        }
        AbstractC23136l9.m118744r1(this.f72295e1, 8);
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: PC */
    public void mo78334PC() {
        C27353a c27353a = this.f72273O1;
        if (c27353a != null) {
            c27353a.m139993i0(mo78324KM().mo112339g());
        }
    }

    /* renamed from: QM */
    public void m78335QM() {
        this.f72292b1.setVisibility(8);
        this.f72293c1.m47332a();
        this.f72282U0.setVisibility(8);
        m78313AN();
    }

    /* renamed from: RM */
    abstract void mo78336RM();

    /* renamed from: SM */
    abstract void mo78337SM();

    @Override // p302ko.InterfaceC21780b
    /* renamed from: U3 */
    public void mo78338U3(List list) {
        mo78349kC(list);
        this.f72301k1.setText("");
        this.f72286W0.setVisibility(8);
        this.f72288X0.setVisibility(8);
        this.f72289Y0.setVisibility(8);
        mo78350lb(300L);
        m78279PM();
    }

    /* renamed from: UM */
    protected abstract void mo78339UM();

    /* renamed from: VM */
    protected abstract void mo78340VM();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: WM */
    public void mo78341WM(View view) {
        if (view == null) {
            return;
        }
        try {
            this.f72276R0 = new C23528a(this.f72421L0.m92648SI());
            this.f72284V0 = (RelativeLayout) view.findViewById(AbstractC6918a0.main_comment_view);
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
            this.f72280T0 = swipeRefreshListView;
            this.f72303m1 = swipeRefreshListView.f83579m0;
            LayoutInflater layoutInflater = (LayoutInflater) this.f72421L0.m92648SI().getSystemService("layout_inflater");
            if (layoutInflater != null) {
                this.f72302l1 = layoutInflater.inflate(AbstractC7409c0.imagecomment_header, (ViewGroup) null, false);
            }
            this.f72303m1.addHeaderView(this.f72302l1);
            this.f72297g1 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutLoadingComment);
            this.f72290Z0 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutReplyComment);
            this.f72295e1 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutMore);
            this.f72291a1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvUserNameToReply);
            this.f72289Y0 = (ImageView) view.findViewById(AbstractC6918a0.imvEmptyIcon);
            m78300rN(view);
            this.f72288X0 = view.findViewById(AbstractC6918a0.layout_no_comment_suggest);
            this.f72296f1 = (TextView) view.findViewById(AbstractC6918a0.btnLoadMore);
            View findViewById = view.findViewById(AbstractC6918a0.layout_container_comment_preview);
            this.f72292b1 = findViewById;
            AbstractC23136l9.m118744r1(findViewById, 8);
            CommentPreviewView commentPreviewView = (CommentPreviewView) view.findViewById(AbstractC6918a0.comment_preview);
            this.f72293c1 = commentPreviewView;
            commentPreviewView.setVisibility(8);
            this.f72293c1.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseDetailView.this.m78282YM(view2);
                }
            });
            this.f72259A1 = (FrameLayout) view.findViewById(AbstractC6918a0.layoutFeedView);
            this.f72260B1 = (FrameLayout) view.findViewById(AbstractC6918a0.layoutFooterView);
            FeedItemFooterActionBarModulesView feedItemFooterActionBarModulesView = new FeedItemFooterActionBarModulesView(this.f72421L0.m92648SI());
            this.f72261C1 = feedItemFooterActionBarModulesView;
            feedItemFooterActionBarModulesView.m43745W();
            this.f72261C1.setVisibility(8);
            this.f72260B1.addView(this.f72261C1);
            this.f72314x1 = (RedDotImageButton) view.findViewById(AbstractC6918a0.imgEmoSticker);
            this.f72301k1 = (CommentSupportGifEditText) view.findViewById(AbstractC6918a0.cmtinput_text);
            this.f72299i1 = (LinearLayout) view.findViewById(AbstractC6918a0.commentinputbar);
            this.f72308r1 = (RelativeLayout) view.findViewById(AbstractC6918a0.btn_like);
            this.f72309s1 = (FeedLikeButtonModulesView) view.findViewById(AbstractC6918a0.btn_like_icon);
            this.f72310t1 = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_like_text);
            m78298qN();
            this.f72311u1 = (RelativeLayout) view.findViewById(AbstractC6918a0.btn_comment);
            this.f72312v1 = (RecyclingImageView) view.findViewById(AbstractC6918a0.btn_comment_icon);
            m78296pN();
            ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.ic_edit_photo_preview);
            this.f72282U0 = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            SuggestCommentView suggestCommentView = (SuggestCommentView) view.findViewById(AbstractC6918a0.suggest_comment_view);
            this.f72294d1 = suggestCommentView;
            suggestCommentView.setMode(11);
            this.f72294d1.setVisibility(8);
            this.f72313w1 = (ImageButton) view.findViewById(AbstractC6918a0.cmtinput_send);
            this.f72315y1 = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.keyboard_frame_layout);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Yx */
    public void mo11943Yx(C3020p0 c3020p0) {
        FeedActionZUtils.m47530R(c3020p0, this.f72421L0.m92676n2(), 11, mo78324KM().mo112339g());
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        mo78341WM(this.f72278S0);
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: b4 */
    public void mo78342b4(String str) {
        try {
            new C0012a((ClipboardManager) this.f72421L0.m92686rK().getSystemService("clipboard"), new SensitiveData("clipboard_copy_comment_feed", "social_timeline")).m16c(ClipData.newPlainText("Comment Copy", str));
            if (AbstractC26681b.f126359d) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copied));
            }
        } catch (SensitiveDataException unused) {
            if (AbstractC26681b.f126359d) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_clipboard_block_title));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: d4 */
    public void mo78343d4() {
        this.f72283U1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.r1
            @Override // java.lang.Runnable
            public final void run() {
                BaseDetailView.this.m78281XM();
            }
        });
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: e3 */
    public void mo78344e3(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            new C31050b().m101508a(new C31050b.a(c3020p0));
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: h8 */
    public void mo78345h8(int i11, boolean z11) {
        if (i11 != -1) {
            m78295oN(i11);
        } else if (z11) {
            mo78366xN(300L);
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: hd */
    public void mo78346hd() {
        try {
            if (this.f72298h1 == null) {
                this.f72298h1 = (RobotoTextView) ((LayoutInflater) this.f72421L0.m92648SI().getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_button_move_down, (ViewGroup) this.f72284V0, false);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(10.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(2, this.f72299i1.getId());
                this.f72284V0.addView(this.f72298h1, layoutParams);
                this.f72298h1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.y1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseDetailView.this.m78288eN(view);
                    }
                });
            }
            RobotoTextView robotoTextView = this.f72298h1;
            if (robotoTextView != null) {
                robotoTextView.bringToFront();
                this.f72298h1.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: iM */
    public int mo46047iM() {
        return 3;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_INT_REQUEST_CODE", 10014);
        C20043e.m104032w(this.f72421L0.m92676n2(), c3000l0.m14324b0(i11), c17391z, i12, bundle, mo78324KM().mo112339g());
    }

    /* renamed from: jN */
    void m78347jN() {
        if (this.f72273O1 != null) {
            m78293kN();
            m78294lN();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: k4 */
    public void mo78348k4(String str) {
        CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
        if (commentSupportGifEditText != null) {
            commentSupportGifEditText.setText(str);
            this.f72301k1.requestFocus();
            CommentSupportGifEditText commentSupportGifEditText2 = this.f72301k1;
            commentSupportGifEditText2.setSelection(commentSupportGifEditText2.getText().length());
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: kC */
    public void mo78349kC(List list) {
        C25849b c25849b;
        if (list != null && (c25849b = this.f72304n1) != null) {
            c25849b.m133435j(list);
            this.f72304n1.notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2263e
    /* renamed from: kb */
    public void mo11980kb(String str, String str2) {
        this.f72273O1.m140001t0(str, str2);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: kf */
    public void mo11960kf(View view, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35579p() != null) {
            FeedActionZUtils.m47524L(view, c3000l0, i11, this.f72421L0.m92676n2().mo35579p(), bundle, 68, 11, z11, mo78324KM().mo112339g());
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: lb */
    public void mo78350lb(long j11) {
        try {
            ListView listView = this.f72303m1;
            if (listView != null) {
                listView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseDetailView.this.m78286cN();
                    }
                }, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: lj */
    public void mo78351lj(List list, int i11, boolean z11) {
        try {
            this.f72421L0.mo49315c4();
            mo78349kC(list);
            mo78345h8(i11, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mN */
    protected abstract void mo78352mN(String str, String str2);

    @Override // p302ko.InterfaceC21780b
    /* renamed from: ms */
    public void mo78353ms(String str) {
        this.f72273O1.m139995n0(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: nN */
    public void m78354nN() {
        View view;
        if (this.f72306p1 != null && (view = this.f72292b1) != null && !AbstractC23136l9.m118666N0(view)) {
            this.f72306p1.setVisibility(0);
            this.f72306p1.setOwnerID(mo78324KM().mo112341i1());
            this.f72306p1.m79741p(this.f72301k1.getText().toString(), true);
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: oa */
    public void mo78355oa(boolean z11, int i11) {
        boolean z12;
        int i12;
        if (z11) {
            z12 = true;
            i12 = 25;
        } else {
            z12 = false;
            i12 = 1;
        }
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, z12, true, null, null, false, i11, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), z11, i12, AbstractC16781w.indicator_bg_color, z11, this.f72277R1, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f72307q1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f72307q1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            mo78340VM();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.ic_edit_photo_preview) {
            AbstractC2379w.m12430d(this.f72301k1);
            this.f72301k1.clearFocus();
            mo78324KM().mo112345s3(this.f72293c1.getPreviewData());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo78324KM().mo112340g3();
        m78276FM();
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: q0 */
    public void mo78356q0() {
        C25849b c25849b = this.f72304n1;
        if (c25849b != null) {
            c25849b.notifyDataSetChanged();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: q4 */
    public void mo78357q4(CharSequence charSequence, final int i11, boolean z11, boolean z12, boolean z13, boolean z14) {
        try {
            C8009j c8009j = (C8009j) AbstractC23093i.m118460m(this.f72421L0.m92648SI(), z11, z12, z13, z14, charSequence, new AbstractC23093i.a() { // from class: com.zing.zalo.ui.zviews.o1
                @Override // me0.AbstractC23093i.a
                /* renamed from: a */
                public final void mo87380a(int i12) {
                    BaseDetailView.this.m78289fN(i11, i12);
                }
            });
            this.f72300j1 = c8009j;
            if (c8009j != null && !c8009j.m92868m()) {
                this.f72300j1.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.p1
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        BaseDetailView.this.m78290gN(interfaceC17463d);
                    }
                });
                this.f72300j1.mo13822K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2263e
    /* renamed from: qg */
    public void mo11981qg(String str, String str2, EnumC2963d3 enumC2963d3) {
        if (enumC2963d3 == EnumC2963d3.f11684s) {
            Snackbar m90634w = Snackbar.m90634w(this.f72278S0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description), -1);
            m90634w.m90644J(C27280g.m139659b(m92689tK(), AbstractC23322a.zds_ic_info_circle_solid_24, AbstractC2808b.ng60));
            m90634w.m90648N();
            return;
        }
        this.f72273O1.m140002u0(str, str2, enumC2963d3);
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: r2 */
    public void mo78358r2(C19591a c19591a) {
        mo78325Ka(1);
        mo78320I2(true, c19591a);
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: s3 */
    public void mo78359s3(C19591a c19591a) {
        CommentPreviewView commentPreviewView = this.f72293c1;
        if (commentPreviewView != null) {
            commentPreviewView.m47333b(c19591a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: sN */
    public void m78360sN(ZaloView zaloView, boolean z11) {
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

    @Override // p302ko.InterfaceC21780b
    /* renamed from: t1 */
    public void mo78361t1() {
        try {
            AbstractC2379w.m12430d(this.f72301k1);
            m78360sN(this.f72307q1, false);
            mo78325Ka(0);
            mo78324KM().mo112328N3();
            m78335QM();
            m78313AN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uN */
    public void m78362uN() {
        this.f72292b1.setVisibility(0);
        this.f72293c1.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vN */
    public void m78363vN(View view) {
        if (view != null && view.getVisibility() != 0) {
            AbstractC23115k.m118571b(view, AbstractC10919t.fadein);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: wN */
    public void m78364wN() {
        try {
            C0820h.f2880z = null;
            CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
            if (commentSupportGifEditText != null) {
                commentSupportGifEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f72301k1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: wt */
    public void mo78365wt(InterfaceC2946a1 interfaceC2946a1) {
        View m78321IM = m78321IM();
        if (m78321IM instanceof FeedItemMusicModuleView) {
            FeedItemMusicModuleView feedItemMusicModuleView = (FeedItemMusicModuleView) m78321IM;
            feedItemMusicModuleView.setFeedMusicCallback(this);
            feedItemMusicModuleView.m43882z0(interfaceC2946a1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            m78309yN();
        }
    }

    /* renamed from: xN */
    protected void mo78366xN(long j11) {
        try {
            ListView listView = this.f72303m1;
            if (listView != null) {
                listView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseDetailView.this.m78292iN();
                    }
                }, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: zN */
    public void m78367zN(int i11) {
        this.f72277R1 = i11;
    }
}
