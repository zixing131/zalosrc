package com.zing.zalo.p077ui.imageviewer;

import ac.C0732w;
import ag0.AbstractC0837p0;
import ag0.C0810d;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2344e0;
import au.EnumC2363o;
import b40.C2526d;
import b40.C2535j;
import ce0.C3446a;
import ce0.C3449d;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.indicator.C12073a;
import com.zing.zalo.p077ui.imageviewer.indicator.ChatPhotoIndicatorRecyclerView;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mycloud.collection.PopupAddItemsToCollection;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import com.zing.zalo.p077ui.widget.reaction.ReactionDetailView;
import com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView;
import com.zing.zalo.p077ui.widget.reaction.bottomsheet.BottomSheetExpandReactionPickerView;
import com.zing.zalo.p077ui.widget.textview.PhotoDescriptionTextView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.p077ui.zviews.wa0;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C18013y0;
import fe0.C18896e;
import g60.C19258d;
import gw.AbstractC19646n0;
import hm0.C20096c;
import i60.C20338d;
import i60.C20350p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kw.C21955a;
import l80.C22134i;
import l80.C22137l;
import lb0.C22423y;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23078g6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23202r9;
import me0.AbstractC23222t7;
import me0.C23250w4;
import mm0.AbstractC23350e;
import od0.InterfaceC24223a;
import p103di.AbstractC17936c;
import p161fg.C18922m;
import p172fy.C19171b;
import p241ij.C20568e;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p392oh.C24261h;
import p392oh.C24265l;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p577vj.C28266a;
import p698yz.AbstractC31125u;
import p716zh.AbstractC32146v5;
import p716zh.C31973j5;
import p716zh.C32002l4;
import pd0.C24730d;
import pd0.EnumC24734h;
import ph.C24751d;
import ph.C24753f;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import vg.C28203u6;

/* loaded from: classes5.dex */
public abstract class BaseChatImageViewer extends BaseImageViewer implements wa0, C23744a.c, ZaloView.InterfaceC17425j {

    /* renamed from: A2 */
    View f62547A2;

    /* renamed from: B2 */
    View f62548B2;

    /* renamed from: C2 */
    View f62549C2;

    /* renamed from: D2 */
    View f62550D2;

    /* renamed from: E2 */
    View f62551E2;

    /* renamed from: F2 */
    View f62552F2;

    /* renamed from: G2 */
    View f62553G2;

    /* renamed from: H2 */
    View f62554H2;

    /* renamed from: I2 */
    ModulesView f62555I2;

    /* renamed from: J2 */
    C22137l f62556J2;

    /* renamed from: K2 */
    ModulesView f62557K2;

    /* renamed from: L2 */
    C22134i f62558L2;

    /* renamed from: M2 */
    View f62559M2;

    /* renamed from: N2 */
    View f62560N2;

    /* renamed from: O2 */
    protected View f62561O2;

    /* renamed from: P2 */
    protected ChatPhotoIndicatorRecyclerView f62562P2;

    /* renamed from: Q2 */
    protected PreCacheLinearLayoutManager f62563Q2;

    /* renamed from: R2 */
    protected C12073a f62564R2;

    /* renamed from: S2 */
    CharSequence f62565S2;

    /* renamed from: T2 */
    boolean f62566T2;

    /* renamed from: U2 */
    boolean f62567U2;

    /* renamed from: V2 */
    boolean f62568V2;

    /* renamed from: W2 */
    boolean f62569W2;

    /* renamed from: Z2 */
    protected MessageId f62572Z2;

    /* renamed from: h3 */
    String f62580h3;

    /* renamed from: j2 */
    boolean f62582j2;

    /* renamed from: k2 */
    boolean f62583k2;

    /* renamed from: m2 */
    boolean f62585m2;

    /* renamed from: o2 */
    boolean f62587o2;

    /* renamed from: p2 */
    boolean f62588p2;

    /* renamed from: r2 */
    public AnimChat f62590r2;

    /* renamed from: s2 */
    View f62591s2;

    /* renamed from: t2 */
    View f62592t2;

    /* renamed from: u2 */
    View f62593u2;

    /* renamed from: v2 */
    View f62594v2;

    /* renamed from: w2 */
    View f62595w2;

    /* renamed from: x2 */
    View f62596x2;

    /* renamed from: y2 */
    View f62597y2;

    /* renamed from: z2 */
    PhotoDescriptionTextView f62598z2;

    /* renamed from: l2 */
    boolean f62584l2 = true;

    /* renamed from: n2 */
    int f62586n2 = 0;

    /* renamed from: q2 */
    boolean f62589q2 = true;

    /* renamed from: X2 */
    int f62570X2 = 1;

    /* renamed from: Y2 */
    boolean f62571Y2 = true;

    /* renamed from: a3 */
    protected boolean f62573a3 = false;

    /* renamed from: b3 */
    private final View.OnLayoutChangeListener f62574b3 = new View.OnLayoutChangeListener() { // from class: j70.v
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            BaseChatImageViewer.this.m66654NP(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };

    /* renamed from: c3 */
    private final long f62575c3 = 300;

    /* renamed from: d3 */
    Runnable f62576d3 = new RunnableC12003f();

    /* renamed from: e3 */
    Runnable f62577e3 = new RunnableC12004g();

    /* renamed from: f3 */
    private boolean f62578f3 = true;

    /* renamed from: g3 */
    boolean f62579g3 = false;

    /* renamed from: i3 */
    boolean f62581i3 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$a */
    /* loaded from: classes5.dex */
    public class C11998a implements InterfaceC24223a {

        /* renamed from: a */
        final /* synthetic */ String f62599a;

        C11998a(String str) {
            this.f62599a = str;
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: a */
        public void mo50006a(Intent intent) {
            try {
                BaseChatImageViewer.this.f62579g3 = false;
                C31973j5 m4472f = C0943w.m4462l().m4472f(BaseChatImageViewer.this.f62580h3);
                if (m4472f != null) {
                    String stringExtra = intent.getStringExtra("urlUploadedServer");
                    if (TextUtils.isEmpty(stringExtra)) {
                        stringExtra = this.f62599a;
                    }
                    C0943w.m4462l().m4481u(m4472f.m153781r(), stringExtra);
                    AbstractC23184q2.m119438C(m4472f.m153781r());
                }
                if (m4472f != null) {
                    C18922m.m99141t().m99151U("group_" + m4472f.m153781r(), m4472f.m153756e());
                }
                ToastUtils.m89266n(AbstractC8020f0.str_toast_updateAvtSuccess, new Object[0]);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: b */
        public void mo50007b(String str) {
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: c */
        public void mo50008c(C20096c c20096c) {
            try {
                ToastUtils.showMess(c20096c.m104492d());
                BaseChatImageViewer.this.f62579g3 = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$b */
    /* loaded from: classes5.dex */
    public class C11999b implements C17945a0.y {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f62601a;

        C11999b(C17945a0 c17945a0) {
            this.f62601a = c17945a0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m66750e() {
            BaseChatImageViewer baseChatImageViewer = BaseChatImageViewer.this;
            baseChatImageViewer.f62581i3 = false;
            baseChatImageViewer.f72421L0.mo49315c4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m66751f() {
            BaseChatImageViewer baseChatImageViewer = BaseChatImageViewer.this;
            baseChatImageViewer.f62581i3 = false;
            baseChatImageViewer.f72421L0.mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_already_save_in));
        }

        @Override // dj.C17945a0.y
        /* renamed from: a */
        public void mo66752a() {
            this.f62601a.m94901Gb(null);
            BaseChatImageViewer.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.b
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.C11999b.this.m66750e();
                }
            });
        }

        @Override // dj.C17945a0.y
        /* renamed from: b */
        public void mo66753b() {
            this.f62601a.m94901Gb(null);
            BaseChatImageViewer.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.C11999b.this.m66751f();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$c */
    /* loaded from: classes5.dex */
    class C12000c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f62603a;

        /* renamed from: b */
        final /* synthetic */ C28266a f62604b;

        C12000c(String str, C28266a c28266a) {
            this.f62603a = str;
            this.f62604b = c28266a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24261h.m126630v().m126639M(this.f62603a, this.f62604b);
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$d */
    /* loaded from: classes5.dex */
    class C12001d extends RecyclerView.AbstractC1887n {
        C12001d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            if (recyclerView.m9817A0(view) > 0) {
                rect.left = AbstractC23222t7.f112552c;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$e */
    /* loaded from: classes5.dex */
    class C12002e extends RecyclerView.AbstractC1892s {
        C12002e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            BaseChatImageViewer baseChatImageViewer = BaseChatImageViewer.this;
            if (baseChatImageViewer.f62589q2) {
                if (i11 == 0) {
                    baseChatImageViewer.m66690oP();
                } else if (i11 == 1) {
                    baseChatImageViewer.m66689nP();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$f */
    /* loaded from: classes5.dex */
    class RunnableC12003f implements Runnable {

        /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$f$a */
        /* loaded from: classes5.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }
        }

        /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$f$b */
        /* loaded from: classes5.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = BaseChatImageViewer.this.f62562P2;
                if (chatPhotoIndicatorRecyclerView != null) {
                    chatPhotoIndicatorRecyclerView.setVisibility(4);
                }
            }
        }

        RunnableC12003f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseChatImageViewer baseChatImageViewer = BaseChatImageViewer.this;
                if (baseChatImageViewer.f62557K2 != null && baseChatImageViewer.m66719jP()) {
                    BaseChatImageViewer.this.f62557K2.setVisibility(0);
                    AbstractC23202r9.m119539g(BaseChatImageViewer.this.f62557K2, 300L, new a());
                }
                BaseChatImageViewer baseChatImageViewer2 = BaseChatImageViewer.this;
                ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = baseChatImageViewer2.f62562P2;
                if (chatPhotoIndicatorRecyclerView != null && baseChatImageViewer2.f62589q2) {
                    AbstractC23202r9.m119541i(chatPhotoIndicatorRecyclerView, 300L, new b());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$g */
    /* loaded from: classes5.dex */
    class RunnableC12004g implements Runnable {

        /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$g$a */
        /* loaded from: classes5.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ModulesView modulesView = BaseChatImageViewer.this.f62557K2;
                if (modulesView != null) {
                    modulesView.setVisibility(4);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$g$b */
        /* loaded from: classes5.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }
        }

        RunnableC12004g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseChatImageViewer baseChatImageViewer = BaseChatImageViewer.this;
                if (baseChatImageViewer.f62557K2 != null && baseChatImageViewer.m66719jP()) {
                    AbstractC23202r9.m119541i(BaseChatImageViewer.this.f62557K2, 300L, new a());
                }
                BaseChatImageViewer baseChatImageViewer2 = BaseChatImageViewer.this;
                ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = baseChatImageViewer2.f62562P2;
                if (chatPhotoIndicatorRecyclerView != null && baseChatImageViewer2.f62589q2) {
                    chatPhotoIndicatorRecyclerView.setVisibility(0);
                    AbstractC23202r9.m119539g(BaseChatImageViewer.this.f62562P2, 300L, new b());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$h */
    /* loaded from: classes5.dex */
    class C12005h implements C22134i.a {
        C12005h() {
        }

        @Override // l80.C22134i.a
        /* renamed from: a */
        public void mo66754a(String str, String str2, C24753f c24753f) {
            BaseChatImageViewer.this.m66707bQ(str, str2, c24753f);
        }

        @Override // l80.C22134i.a
        /* renamed from: b */
        public void mo66755b(String str, String str2, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$i */
    /* loaded from: classes5.dex */
    public class C12006i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ItemAlbumMobile f62615a;

        /* renamed from: b */
        final /* synthetic */ int f62616b;

        /* renamed from: c */
        final /* synthetic */ int f62617c;

        /* renamed from: d */
        final /* synthetic */ boolean f62618d;

        /* renamed from: e */
        final /* synthetic */ String f62619e;

        C12006i(ItemAlbumMobile itemAlbumMobile, int i11, int i12, boolean z11, String str) {
            this.f62615a = itemAlbumMobile;
            this.f62616b = i11;
            this.f62617c = i12;
            this.f62618d = z11;
            this.f62619e = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(this.f62615a.m40496C());
                if (m2635r != null && m2635r.m95022U7()) {
                    ToastUtils.showMess(AbstractC31125u.m151165W(BaseChatImageViewer.this.f62665Y0, m2635r));
                } else {
                    BaseChatImageViewer.this.m66734qP(m2635r, this.f62616b, this.f62617c, this.f62618d, this.f62619e);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$j */
    /* loaded from: classes5.dex */
    class C12007j implements BaseImageViewer.InterfaceC12022n {
        C12007j() {
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: a */
        public void mo66756a(int i11) {
            BaseChatImageViewer.this.m66762EN(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer.InterfaceC12022n
        /* renamed from: b */
        public void mo66757b(C12063c.f fVar, String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    BaseChatImageViewer.this.m66725mP(str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.BaseChatImageViewer$k */
    /* loaded from: classes5.dex */
    public class C12008k implements ZDSReactionDetailItemView.InterfaceC13749a {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f62622a;

        C12008k(C17945a0 c17945a0) {
            this.f62622a = c17945a0;
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView.InterfaceC13749a
        /* renamed from: a */
        public void mo60328a(C24753f c24753f, boolean z11) {
            if (z11) {
                AbstractC19646n0.m103004m2(this.f62622a, false);
            } else {
                AbstractC19646n0.m103012o2(c24753f.m128595h(), this.f62622a, false);
            }
            BaseChatImageViewer.this.m66698Et();
        }

        @Override // com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView.InterfaceC13749a
        /* renamed from: b */
        public void mo60329b(ContactProfile contactProfile) {
            if (contactProfile != null) {
                try {
                    BaseChatImageViewer.this.m66713fQ(contactProfile.f42434r);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            BaseChatImageViewer.this.m66698Et();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AP */
    public /* synthetic */ void m66631AP() {
        boolean z11;
        C22137l c22137l = this.f62556J2;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        c22137l.m115470p1(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C());
        this.f62556J2.m115467m1();
        C22137l c22137l2 = this.f62556J2;
        boolean z12 = false;
        if (c22137l2 != null && c22137l2.f109028L0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f62566T2 = z11;
        if (this.f62567U2 || z11) {
            z12 = true;
        }
        this.f62568V2 = z12;
        m66732pQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BP */
    public /* synthetic */ void m66632BP(ItemAlbumMobile itemAlbumMobile) {
        C24751d c24751d;
        ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
        if (itemAlbumMobile2 != null && itemAlbumMobile2.m40496C() != null) {
            C24261h m126630v = C24261h.m126630v();
            ItemAlbumMobile itemAlbumMobile3 = this.f62686n1;
            c24751d = m126630v.m126632A(itemAlbumMobile3.f42579d0, itemAlbumMobile3.m40496C());
        } else {
            c24751d = null;
        }
        if (c24751d != null && this.f62686n1 == itemAlbumMobile) {
            this.f72827B0.post(new Runnable() { // from class: j70.h
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66631AP();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CP */
    public /* synthetic */ void m66633CP(C20568e c20568e, String str, int i11, MessageId messageId) {
        try {
            if (c20568e != null) {
                mo66741uP(c20568e);
                this.f62573a3 = c20568e.m107022f();
            } else {
                mo66718iQ(str, i11, messageId, false);
            }
            AbstractC17936c abstractC17936c = this.f62688p1;
            if (abstractC17936c != null) {
                abstractC17936c.m94602q(messageId);
            }
            if (messageId != null) {
                this.f62572Z2 = messageId;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DP */
    public /* synthetic */ void m66634DP() {
        boolean z11;
        int i11;
        PhotoDescriptionTextView photoDescriptionTextView;
        m66714gP();
        boolean z12 = true;
        int i12 = 0;
        if (TextUtils.isEmpty(this.f62565S2) && !this.f62566T2) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f62568V2 = z11;
        View view = this.f62597y2;
        if (z11 && !m66746yP()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        m66877pO(view, i11);
        if (!this.f62568V2 || ((photoDescriptionTextView = this.f62598z2) != null && photoDescriptionTextView.m77058q())) {
            z12 = false;
        }
        View view2 = this.f62595w2;
        if (view2 != null) {
            if (z12) {
                i12 = AbstractC23136l9.m118641B(view2.getContext(), AbstractC16801x.black_40);
            }
            view2.setBackgroundColor(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EP */
    public /* synthetic */ void m66636EP(Object[] objArr) {
        int i11;
        try {
            m66698Et();
            if (objArr.length > 1) {
                MessageId messageId = (MessageId) objArr[0];
                String str = (String) objArr[1];
                if (this.f72421L0.m92662fJ() != null && m92662fJ() != null && m92656bJ() != null && m92674mJ() && !m92681pJ()) {
                    Bundle m78535kL = BottomPickerView.m78535kL();
                    if (this instanceof MediaStoreImageViewer) {
                        i11 = 2;
                    } else {
                        i11 = 4;
                    }
                    BottomSheetExpandReactionPickerView.m76833rM(m78535kL, messageId, i11, str);
                    this.f72421L0.m92662fJ().m93066i2(BottomSheetExpandReactionPickerView.class, m78535kL, 0, 2, true);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FP */
    public /* synthetic */ void m66638FP(CameraInputParams cameraInputParams) {
        AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 1001, 0, cameraInputParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GP */
    public /* synthetic */ void m66640GP(String str) {
        try {
            final CameraInputParams m39199i = CameraInputParams.m39199i(AbstractC23078g6.m118383a(str));
            m39199i.f41128r0 = mo66847ZM();
            m39199i.f41130s0 = this.f62655T0;
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            m39199i.f41132t0 = itemAlbumMobile.f42564O;
            m39199i.f41134u0 = 3;
            m39199i.f41136v0 = itemAlbumMobile.f42579d0;
            mo70710wy(new Runnable() { // from class: j70.p
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66638FP(m39199i);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HP */
    public /* synthetic */ void m66642HP() {
        m66762EN(1);
        this.f62581i3 = false;
        this.f72421L0.mo49315c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IP */
    public /* synthetic */ void m66644IP() {
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(this.f62686n1.m40496C());
        if (m2635r == null) {
            mo70710wy(new Runnable() { // from class: j70.i
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66642HP();
                }
            });
        } else {
            m2635r.m94901Gb(new C11999b(m2635r));
            m2635r.m95084aa(true, new SensitiveData("gallery_save_video_detail", "video_download"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JP */
    public /* synthetic */ void m66646JP(C17945a0 c17945a0, int i11, String str) {
        AbstractC19646n0.m102966d0(this.f72421L0.m92676n2(), c17945a0, true, i11, m66867jN(), str, this.f62655T0, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KP */
    public static /* synthetic */ void m66648KP() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_react));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LP */
    public static /* synthetic */ void m66650LP() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_imgnoexist));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MP */
    public /* synthetic */ void m66652MP(int i11) {
        boolean z11 = true;
        if (Math.abs(i11 - this.f62685m1) != 1) {
            z11 = false;
        }
        mo66729oO(i11, Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NP */
    public /* synthetic */ void m66654NP(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.f62650Q1 != null) {
            this.f62650Q1.m100950D(view.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OP */
    public /* synthetic */ void m66656OP() {
        ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = this.f62562P2;
        if (chatPhotoIndicatorRecyclerView != null) {
            chatPhotoIndicatorRecyclerView.m67368i2(this.f62685m1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PP */
    public /* synthetic */ void m66658PP(ArrayList arrayList, String str, String str2) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        m78535kL.putParcelableArrayList("listMsgId", arrayList);
        m78535kL.putString("entryPoint", str);
        m78535kL.putString("jsDataLog", str2);
        this.f72421L0.m92693xK().mo89694j2(PopupAddItemsToCollection.class, m78535kL, 0, null, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QP */
    public /* synthetic */ void m66660QP(final String str) {
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(this.f62686n1.m40496C());
        if (m2635r != null) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            arrayList.add(m2635r);
            arrayList2.add(m2635r.m95029V3());
            final String m114643j = C21955a.f108070a.m114643j(arrayList);
            mo70710wy(new Runnable() { // from class: j70.o
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66658PP(arrayList2, str, m114643j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RP */
    public /* synthetic */ void m66662RP(CameraInputParams cameraInputParams) {
        AbstractC22470k.m116167s(this.f72421L0.m92676n2(), ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, cameraInputParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SP */
    public /* synthetic */ void m66664SP(String str) {
        try {
            final CameraInputParams m39202l = CameraInputParams.m39202l(AbstractC23078g6.m118383a(str));
            mo70710wy(new Runnable() { // from class: j70.s
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66662RP(m39202l);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TP */
    public /* synthetic */ void m66666TP(Rect rect, String str) {
        int centerX = rect.centerX();
        int[] iArr = new int[2];
        this.f62590r2.getLocationOnScreen(iArr);
        this.f62590r2.m76123v0(str, centerX, (this.f62590r2.getHeight() - rect.centerY()) + iArr[1], 50.0f, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UP */
    public /* synthetic */ void m66668UP(ItemAlbumMobile itemAlbumMobile, C12063c.h hVar, int i11) {
        this.f62650Q1.m100955I();
        this.f62650Q1.m100964u(this.f62667Z0, itemAlbumMobile, hVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VP */
    public static /* synthetic */ void m66670VP() {
        ToastUtils.showMess(AbstractC23161o1.m119318c(1001, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WP */
    public /* synthetic */ void m66672WP(final ItemAlbumMobile itemAlbumMobile) {
        final int i11;
        try {
            C25821b m128917N = AbstractC23306f.m120639Z1().m128917N(itemAlbumMobile.m40496C());
            if (m128917N != null) {
                C27373c m102939V0 = AbstractC19646n0.m102939V0(m128917N);
                itemAlbumMobile.f42588m0 = m102939V0;
                if (m102939V0 != null) {
                    View view = this.f62595w2;
                    if (view != null) {
                        i11 = view.getHeight();
                    } else {
                        i11 = -1;
                    }
                    final C12063c.h hVar = (C12063c.h) this.f62677e1.m67289w();
                    mo70710wy(new Runnable() { // from class: j70.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseChatImageViewer.this.m66668UP(itemAlbumMobile, hVar, i11);
                        }
                    });
                    return;
                }
                return;
            }
            throw new Exception("Can not find cloudItem");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            mo70710wy(new Runnable() { // from class: j70.n
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.m66670VP();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XP */
    public /* synthetic */ void m66674XP(C12063c.f fVar) {
        try {
            this.f72421L0.mo49315c4();
            File mo66832Rd = mo66832Rd(fVar.f62951b, fVar.f62952c);
            if (mo66832Rd != null && mo66832Rd.length() > 0) {
                m66710dQ(mo66832Rd.getAbsolutePath());
            } else {
                this.f62579g3 = false;
                ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f62579g3 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YP */
    public /* synthetic */ void m66676YP(final C12063c.f fVar, int i11, C3979l c3979l, int i12) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: j70.r
            @Override // java.lang.Runnable
            public final void run() {
                BaseChatImageViewer.this.m66674XP(fVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZP */
    public /* synthetic */ void m66678ZP(boolean z11) {
        View view = this.f62595w2;
        if (view instanceof ViewGroup) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, new ChangeBounds());
        }
        this.f62569W2 = z11;
        m66691rQ();
        m66888vO(mo66740uN());
    }

    /* renamed from: hQ */
    private void m66685hQ(final ItemAlbumMobile itemAlbumMobile) {
        C12063c c12063c;
        int i11;
        if (itemAlbumMobile.f42591p == 2 && (c12063c = this.f62677e1) != null && (c12063c.m67289w() instanceof C12063c.h)) {
            m66716hP(itemAlbumMobile);
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(itemAlbumMobile.m40496C());
            if (m2635r != null) {
                if (itemAlbumMobile.f42588m0 == null) {
                    itemAlbumMobile.f42588m0 = AbstractC19646n0.m102936U0(m2635r);
                }
                if (itemAlbumMobile.f42588m0 != null) {
                    View view = this.f62595w2;
                    if (view != null) {
                        i11 = view.getHeight();
                    } else {
                        i11 = -1;
                    }
                    C12063c.h hVar = (C12063c.h) this.f62677e1.m67289w();
                    this.f62650Q1.m100955I();
                    this.f62650Q1.m100964u(this.f62667Z0, itemAlbumMobile, hVar, i11);
                    return;
                }
                return;
            }
            if (itemAlbumMobile.f42551D0 == ItemAlbumMobile.EnumC7884d.ZCLOUD && itemAlbumMobile.m40496C() != null) {
                if (itemAlbumMobile.f42588m0 == null) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseChatImageViewer.this.m66672WP(itemAlbumMobile);
                        }
                    });
                    return;
                }
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(1001, ""));
            return;
        }
        C19258d c19258d = this.f62650Q1;
        if (c19258d != null) {
            c19258d.m100955I();
        }
    }

    /* renamed from: kP */
    private void m66686kP(int i11, int i12) {
        List list;
        if (i12 != i11 && (list = this.f62684l1) != null && i11 > 0 && i11 < list.size()) {
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(i11);
            if (itemAlbumMobile.f42591p == 2 && this.f62650Q1.m100957h() > 0) {
                C2526d.f10270a.m12725r0(this.f62655T0, itemAlbumMobile.f42589n0, Math.round(this.f62650Q1.m100957h() / 1000.0f), Math.round(this.f62650Q1.m100956g() / 1000.0f), TextUtils.equals(itemAlbumMobile.f42593q, CoreUtility.f89233i), false, this.f62650Q1.m100960m());
            }
            this.f62650Q1.m100947A();
        }
    }

    /* renamed from: lQ */
    private void m66687lQ(boolean z11) {
        int i11;
        View view = this.f62561O2;
        if (view != null && this.f62589q2) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: mQ */
    private boolean m66688mQ() {
        ItemAlbumMobile itemAlbumMobile;
        if (!this.f62585m2 && !m66746yP() && ((itemAlbumMobile = this.f62686n1) == null || !itemAlbumMobile.m40511V())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nP */
    public void m66689nP() {
        if (this.f62578f3) {
            this.f62578f3 = false;
            Handler handler = this.f62656T1;
            if (handler != null) {
                handler.removeCallbacks(this.f62576d3);
                this.f62656T1.removeCallbacks(this.f62577e3);
                this.f62656T1.post(this.f62577e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oP */
    public void m66690oP() {
        this.f62578f3 = true;
        Handler handler = this.f62656T1;
        if (handler != null) {
            handler.removeCallbacks(this.f62576d3);
            this.f62656T1.removeCallbacks(this.f62577e3);
            this.f62656T1.postDelayed(this.f62576d3, AbstractC23309i.m121850e0());
        }
    }

    /* renamed from: rQ */
    private void m66691rQ() {
        int i11;
        View view = this.f62559M2;
        int i12 = 0;
        if (this.f62569W2 && !m66746yP()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        boolean z11 = true;
        m66879qO(view, i11, true);
        if (!this.f62568V2 || this.f62569W2) {
            z11 = false;
        }
        View view2 = this.f62595w2;
        if (view2 != null) {
            if (z11) {
                i12 = AbstractC23136l9.m118641B(view2.getContext(), AbstractC16801x.black_40);
            }
            view2.setBackgroundColor(i12);
        }
    }

    /* renamed from: sP */
    private SensitiveData m66692sP() {
        return new SensitiveData("gallery_in_doodle", "comm_csc");
    }

    /* renamed from: sQ */
    private void m66693sQ(int i11) {
        ItemAlbumMobile itemAlbumMobile;
        boolean z11;
        int i12;
        int i13;
        int i14;
        ActionBar actionBar;
        C12063c c12063c = this.f62677e1;
        if (c12063c != null) {
            itemAlbumMobile = c12063c.m67290x(i11);
        } else {
            itemAlbumMobile = null;
        }
        int i15 = 0;
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f62629A1 = z11;
        if (z11) {
            m66877pO(this.f62557K2, 8);
            m66877pO(this.f62595w2, 8);
            m66877pO(this.f62596x2, 8);
            ActionBarMenu actionBarMenu = this.f88763d0;
            if (actionBarMenu != null) {
                actionBarMenu.setVisibility(8);
            }
            ActionBar actionBar2 = this.f88760a0;
            if (actionBar2 != null) {
                actionBar2.setVisibility(0);
                this.f88760a0.setTitle("");
                return;
            }
            return;
        }
        View view = this.f62595w2;
        if (m66688mQ()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        m66877pO(view, i12);
        View view2 = this.f62596x2;
        if (m66688mQ()) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        m66877pO(view2, i13);
        ModulesView modulesView = this.f62557K2;
        if (m66719jP() && !m66746yP()) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        m66877pO(modulesView, i14);
        ActionBarMenu actionBarMenu2 = this.f88763d0;
        if (actionBarMenu2 != null) {
            if (m66746yP()) {
                i15 = 8;
            }
            actionBarMenu2.setVisibility(i15);
        }
        if (!this.f62690r1 && (actionBar = this.f88760a0) != null) {
            actionBar.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000c, B:8:0x001f, B:10:0x0026, B:11:0x0029, B:13:0x002f, B:14:0x0032, B:16:0x0036, B:18:0x003b, B:23:0x0015), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000c, B:8:0x001f, B:10:0x0026, B:11:0x0029, B:13:0x002f, B:14:0x0032, B:16:0x0036, B:18:0x003b, B:23:0x0015), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:2:0x0000, B:4:0x000c, B:8:0x001f, B:10:0x0026, B:11:0x0029, B:13:0x002f, B:14:0x0032, B:16:0x0036, B:18:0x003b, B:23:0x0015), top: B:1:0x0000 }] */
    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: AO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo66694AO() {
        int i11;
        try {
            super.mo66694AO();
            View view = this.f62591s2;
            boolean z11 = false;
            if (!m66743wP()) {
                if (m66747zP()) {
                }
                i11 = 8;
                m66877pO(view, i11);
                if (this.f62584l2) {
                    m66735qQ();
                }
                if (m66719jP()) {
                    m66714gP();
                }
                if (!this.f62567U2 || this.f62566T2) {
                    z11 = true;
                }
                this.f62568V2 = z11;
                m66732pQ();
            }
            if (!m66746yP()) {
                i11 = 0;
                m66877pO(view, i11);
                if (this.f62584l2) {
                }
                if (m66719jP()) {
                }
                if (!this.f62567U2) {
                }
                z11 = true;
                this.f62568V2 = z11;
                m66732pQ();
            }
            i11 = 8;
            m66877pO(view, i11);
            if (this.f62584l2) {
            }
            if (m66719jP()) {
            }
            if (!this.f62567U2) {
            }
            z11 = true;
            this.f62568V2 = z11;
            m66732pQ();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: BO */
    public void mo66695BO() {
        try {
            this.f62566T2 = false;
            this.f62567U2 = false;
            this.f62569W2 = false;
            this.f62568V2 = false;
            this.f62565S2 = "";
            super.mo66695BO();
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null) {
                this.f62565S2 = itemAlbumMobile.f42556G;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: DO */
    public void mo66696DO() {
        int i11;
        boolean z11;
        super.mo66696DO();
        Iterator it = this.f62645O0.iterator();
        while (true) {
            i11 = 0;
            if (it.hasNext()) {
                if (((View) it.next()).getVisibility() == 0) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ActionBarMenuItem actionBarMenuItem = this.f62643N0;
        if (actionBarMenuItem != null) {
            if (!z11) {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Ee */
    public void mo66697Ee(C12063c.c cVar, int i11) {
        ItemAlbumMobile itemAlbumMobile;
        super.mo66697Ee(cVar, i11);
        if (cVar != null && i11 == this.f62685m1) {
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                itemAlbumMobile = c12063c.m67290x(i11);
            } else {
                itemAlbumMobile = null;
            }
            if (itemAlbumMobile != null) {
                m66685hQ(itemAlbumMobile);
            }
        }
    }

    /* renamed from: Et */
    void m66698Et() {
        try {
            m66700KH("ReactionDetailView");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        m66686kP(this.f62685m1, -1);
        super.mo39024IJ();
        View view = this.f62595w2;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f62574b3);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: Ic */
    public void mo66699Ic(C12063c.g gVar, C12063c.f fVar, int i11, int i12) {
        super.mo66699Ic(gVar, fVar, i11, i12);
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.m40511V()) {
            this.f62564R2.m67380V(this.f62686n1);
            m66693sQ(mo66858ea());
        }
    }

    /* renamed from: KH */
    public void m66700KH(String str) {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0(str);
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        PhotoDescriptionTextView photoDescriptionTextView;
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 47);
        C23744a.m124114c().m124117e(this, 52);
        C23744a.m124114c().m124117e(this, 9);
        C23744a.m124114c().m124117e(this, 75);
        C23744a.m124114c().m124117e(this, 177);
        if (AbstractC26683d.f126393l && (photoDescriptionTextView = this.f62598z2) != null) {
            AbstractC28245z3.m142218a(this.f62565S2, photoDescriptionTextView);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: NM */
    public void mo66701NM(ItemAlbumMobile itemAlbumMobile, String str, int i11, String str2) {
        try {
            ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
            if (itemAlbumMobile2 != null && itemAlbumMobile2.f42567R) {
                new C3446a().m17353g(new C3449d.d(str2, null, m66692sP()), new C3449d.a() { // from class: j70.b
                    @Override // ce0.C3449d.a
                    /* renamed from: a */
                    public final void mo17354a(C3449d.e eVar) {
                        BaseChatImageViewer.this.m66842WN(eVar);
                    }
                });
            } else {
                super.mo66701NM(itemAlbumMobile, str, i11, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: OM */
    public void mo66702OM() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        C17945a0 m102950Z = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C());
        if (m102950Z != null && m102950Z.m95022U7()) {
            ToastUtils.showMess(AbstractC31125u.m151165W(this.f62665Y0, m102950Z));
        } else {
            super.mo66702OM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.wa0
    /* renamed from: SA */
    public void mo66703SA(final String str, final Rect rect) {
        if (!TextUtils.isEmpty(str) && rect != null) {
            if (this.f62590r2 == null) {
                AnimChat animChat = new AnimChat(getContext());
                this.f62590r2 = animChat;
                ((ViewGroup) this.f62673c1).addView(animChat, new ViewGroup.LayoutParams(-1, -1));
                AnimChat animChat2 = this.f62590r2;
                animChat2.f69990e0 = true;
                animChat2.m76125x0();
            }
            if (this.f62590r2.getHeight() == 0) {
                this.f62656T1.post(new Runnable() { // from class: j70.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseChatImageViewer.this.m66666TP(rect, str);
                    }
                });
                return;
            }
            int centerX = rect.centerX();
            int[] iArr = new int[2];
            this.f62590r2.getLocationOnScreen(iArr);
            this.f62590r2.m76123v0(str, centerX, (this.f62590r2.getHeight() - rect.centerY()) + iArr[1], 50.0f, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: SN */
    public void mo66704SN(C12063c.f fVar) {
        super.mo66704SN(fVar);
        if (fVar.f62952c == 1) {
            m66716hP(fVar.f62950a);
        }
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null) {
            this.f62564R2.m67380V(itemAlbumMobile);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aQ */
    public boolean m66705aQ() {
        return m66723lP();
    }

    @Override // com.zing.zalo.zview.ZaloView.InterfaceC17425j
    /* renamed from: bC */
    public Class mo66706bC() {
        return BaseImageViewer.class;
    }

    /* renamed from: bQ */
    public void m66707bQ(String str, String str2, C24753f c24753f) {
        ItemAlbumMobile itemAlbumMobile;
        try {
            if (this.f62630B1 == 0 && (itemAlbumMobile = this.f62686n1) != null) {
                if (C28203u6.f131407a.m141819r(itemAlbumMobile.f42579d0)) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                    return;
                }
                MessageId m40496C = this.f62686n1.m40496C();
                if (m40496C == null) {
                    return;
                }
                Rect m66864hN = m66864hN();
                int m40497D = this.f62686n1.m40497D();
                C23250w4.f112644a.m119834e0(m40496C, m40497D, this.f62696x1, c24753f, mo66739tP(), this, m66864hN);
                C0732w.Companion.m1189a().m1187q("reaction_send", "viewfull", null, C22423y.m115851b(c24753f.m128595h(), m40497D));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: c6 */
    public void mo66708c6(List list) {
        int i11;
        super.mo66708c6(list);
        m66717iP();
        C12073a c12073a = this.f62564R2;
        if (c12073a != null) {
            c12073a.m67385a0(this.f62684l1, false);
            PreCacheLinearLayoutManager preCacheLinearLayoutManager = this.f62563Q2;
            if (preCacheLinearLayoutManager != null) {
                i11 = preCacheLinearLayoutManager.m10110a();
            } else {
                i11 = 0;
            }
            int i12 = this.f62685m1;
            int i13 = i11 / 2;
            int i14 = i12 - i13;
            int i15 = i12 + i13;
            C12073a c12073a2 = this.f62564R2;
            int max = Math.max(i14, 0);
            if (i15 >= this.f62564R2.mo10003k()) {
                i15 = this.f62564R2.mo10003k() - 1;
            }
            c12073a2.m10013u(max, i15);
            ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = this.f62562P2;
            if (chatPhotoIndicatorRecyclerView != null) {
                chatPhotoIndicatorRecyclerView.m67368i2(this.f62685m1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: cQ */
    public void m66709cQ(final String str) {
        try {
            if (this.f62686n1 != null) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseChatImageViewer.this.m66660QP(str);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.layout_image_viewer_csc;
    }

    /* renamed from: dQ */
    void m66710dQ(final String str) {
        if (!this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ() && !TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.q
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66664SP(str);
                }
            });
        } else {
            this.f62579g3 = false;
            m66762EN(1);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: dr */
    public void mo66711dr(C12063c.g gVar, int i11, float f11) {
        boolean z11;
        super.mo66711dr(gVar, i11, f11);
        if (f11 == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        m66687lQ(z11);
    }

    /* renamed from: eQ */
    public void m66712eQ() {
        try {
            C12063c.c m66839VM = m66839VM();
            if (m66839VM instanceof C12063c.g) {
                String m67344s = ((C12063c.g) m66839VM).m67344s();
                if (AbstractC23041d2.m118194A(m67344s)) {
                    m66725mP(m67344s);
                } else {
                    C12063c.f m66845YM = m66845YM();
                    if (m66845YM != null) {
                        m66828QM(m66845YM, true, new C12007j());
                    } else {
                        m66762EN(1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fQ */
    public void m66713fQ(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C32002l4 m154264g = C32002l4.m154264g(33);
                String str2 = "";
                if (str.equals(AbstractC23304d.f113368c0.f42434r)) {
                    str2 = "9520";
                }
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(str, m154264g).m135739F(str2).m135743b(), 0, 1));
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gP */
    void m66714gP() {
        if (!m66719jP()) {
            return;
        }
        boolean z11 = false;
        try {
            this.f62566T2 = false;
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null) {
                this.f62556J2.m115468n1();
                if (C24261h.m126630v().m126650x(this.f62686n1.m40496C()) != null) {
                    C22137l c22137l = this.f62556J2;
                    ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                    c22137l.m115470p1(itemAlbumMobile2.f42579d0, itemAlbumMobile2.m40496C());
                    this.f62556J2.m115467m1();
                    boolean z12 = this.f62556J2.f109028L0;
                    this.f62566T2 = z12;
                    if (this.f62567U2 || z12) {
                        z11 = true;
                    }
                    this.f62568V2 = z11;
                    m66732pQ();
                } else {
                    final ItemAlbumMobile itemAlbumMobile3 = this.f62686n1;
                    C24261h.m126630v().m126651y().mo13474a(new Runnable() { // from class: j70.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseChatImageViewer.this.m66632BP(itemAlbumMobile3);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gQ */
    public void m66715gQ(String str) {
        try {
            if (this.f62686n1 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            new CreateMediaStoreParam(this.f62686n1.f42579d0, EnumC2363o.f9889p, null).m40913f(bundle);
            bundle.putString("extra_media_store_source_local", str);
            if (this.f62586n2 == 3) {
                bundle.putInt("extra_type_id", EnumC2344e0.f9854s.ordinal());
            }
            this.f72421L0.m92662fJ().m93066i2(MediaStoreView.class, bundle, 0, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: hO */
    public String mo50254hO(ItemAlbumMobile itemAlbumMobile) {
        if (this.f62587o2) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.group_avatar);
        }
        return super.mo50254hO(itemAlbumMobile);
    }

    /* renamed from: hP */
    protected void m66716hP(ItemAlbumMobile itemAlbumMobile) {
        C17945a0 m2635r;
        if (itemAlbumMobile != null && (m2635r = AbstractC23306f.m120584H0().m2635r(itemAlbumMobile.m40496C())) != null && m2635r.m94959N6()) {
            C2535j.f10308a.m12771n(m2635r.m95029V3());
            m2635r.m95165ic(4, true);
            MediaStoreItem mediaStoreItem = itemAlbumMobile.f42598s0;
            if (mediaStoreItem != null) {
                mediaStoreItem.m40565E0(m2635r);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:            if (r0.size() > 1) goto L10;     */
    /* renamed from: iP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m66717iP() {
        boolean z11;
        if (AbstractC23309i.m122041j2() && (r0 = this.f62684l1) != null) {
            z11 = true;
        }
        z11 = false;
        this.f62589q2 = z11;
    }

    /* renamed from: iQ */
    public void mo66718iQ(String str, int i11, MessageId messageId, boolean z11) {
        int i12;
        boolean z12;
        List list;
        try {
            if (mo66744xP(i11) && (list = this.f62684l1) != null && list.size() > 0) {
                synchronized (this.f62684l1) {
                    i12 = -1;
                    z12 = false;
                    for (int i13 = 0; i13 < this.f62684l1.size(); i13++) {
                        try {
                            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f62684l1.get(i13);
                            if (itemAlbumMobile != null && messageId != null && messageId.equals(itemAlbumMobile.m40496C())) {
                                if (itemAlbumMobile.f42591p == 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                i12 = i13;
                            }
                        } finally {
                        }
                    }
                }
            } else {
                i12 = -1;
                z12 = false;
            }
            if (i12 > -1 && m66857eO(i12, true)) {
                if (z12) {
                    ToastUtils.m89266n(AbstractC8020f0.str_tv_videonoexist, new Object[0]);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_tv_imgnoexist, new Object[0]);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jP */
    protected boolean m66719jP() {
        ItemAlbumMobile itemAlbumMobile;
        if (this.f62583k2 && (itemAlbumMobile = this.f62686n1) != null && !itemAlbumMobile.m40511V()) {
            return true;
        }
        return false;
    }

    /* renamed from: jQ */
    void m66720jQ() {
        try {
            ArrayList arrayList = AbstractC23304d.f113413n;
            if (arrayList.size() > 0) {
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    mo66741uP((C20568e) it.next());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: kN */
    public void mo66721kN(Message message) {
        super.mo66721kN(message);
        if (message != null) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 4) {
                    m66687lQ(false);
                    return;
                }
                return;
            }
            m66687lQ(this.f62690r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kQ */
    public void m66722kQ() {
        C17945a0 c17945a0;
        try {
            if (this.f62579g3) {
                return;
            }
            this.f62579g3 = true;
            C12063c.c m66839VM = m66839VM();
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null && (m66839VM instanceof C12063c.g)) {
                String m67344s = ((C12063c.g) m66839VM).m67344s();
                if (!TextUtils.isEmpty(this.f62696x1)) {
                    this.f62580h3 = this.f62696x1;
                } else if (!TextUtils.isEmpty(itemAlbumMobile.f42579d0)) {
                    this.f62580h3 = itemAlbumMobile.f42579d0;
                } else {
                    if (this.f62686n1.m40496C() != null) {
                        ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                        c17945a0 = AbstractC19646n0.m102950Z(itemAlbumMobile2.f42579d0, itemAlbumMobile2.m40496C());
                    } else {
                        c17945a0 = null;
                    }
                    if (c17945a0 != null) {
                        this.f62580h3 = itemAlbumMobile.f42579d0;
                    } else {
                        this.f62579g3 = false;
                        m66762EN(1);
                        return;
                    }
                }
                if (AbstractC25495a.m132079d(this.f62580h3)) {
                    this.f62580h3 = AbstractC25495a.m132088m(this.f62580h3);
                }
                if (!TextUtils.isEmpty(this.f62580h3) && !TextUtils.isEmpty(m67344s)) {
                    File mo66832Rd = mo66832Rd(m67344s, 1);
                    if (mo66832Rd != null && mo66832Rd.exists() && mo66832Rd.length() > 0) {
                        m66710dQ(mo66832Rd.getAbsolutePath());
                    } else if (m67344s.startsWith("http")) {
                        mo46829Y();
                        mo66826Ot(null, AbstractC32146v5.m155118a(m67344s, 1), this.f62685m1, new C12063c.d.a() { // from class: j70.k
                            @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                            /* renamed from: a */
                            public final void mo67298a(C12063c.f fVar, int i11, C3979l c3979l, int i12) {
                                BaseChatImageViewer.this.m66676YP(fVar, i11, c3979l, i12);
                            }
                        });
                    } else {
                        ToastUtils.m89266n(AbstractC8020f0.str_tv_imgnoexist, new Object[0]);
                        this.f62579g3 = false;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f62579g3 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lP */
    public boolean m66723lP() {
        if (this.f62695w1) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(this.f62696x1);
            if (m4473g == null || !m4473g.m153770l0()) {
                return false;
            }
            return true;
        }
        if (!AbstractC23047d8.m118263o(this.f62696x1) && !AbstractC25495a.m132078c(this.f62696x1)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: la */
    public boolean mo66724la() {
        return true;
    }

    /* renamed from: mP */
    void m66725mP(final String str) {
        C17945a0 c17945a0;
        if (this.f62686n1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.f
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66640GP(str);
                }
            });
            return;
        }
        if (this.f62686n1.m40496C() != null) {
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            c17945a0 = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C());
        } else {
            c17945a0 = null;
        }
        if (c17945a0 != null && c17945a0.m95022U7()) {
            ToastUtils.showMess(AbstractC31125u.m151165W(this.f62665Y0, c17945a0));
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_imgnoexist));
        if (c17945a0 != null) {
            AbstractC23306f.m120662f1().m101508a(new C18896e.a(c17945a0, c17945a0.m95029V3(), new C20568e(c17945a0.m95029V3(), c17945a0.mo95039W2(), 3, true, false, false, "")));
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: mp */
    public void mo66726mp(C12063c.g gVar, C12063c.f fVar, int i11, C3979l c3979l) {
        super.mo66726mp(gVar, fVar, i11, c3979l);
        if (fVar.f62952c == 1) {
            m66716hP(fVar.f62950a);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        super.mo66727nN(bundle);
        boolean z17 = false;
        if (bundle != null) {
            if (bundle.containsKey("EXTRA_CAN_EDIT_PHOTO") && bundle.getBoolean("EXTRA_CAN_EDIT_PHOTO")) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f62582j2 = z12;
            this.f62586n2 = bundle.getInt("EXTRA_MEDIA_MODE", 0);
            this.f62583k2 = bundle.getBoolean("EXTRA_BOL_ENABLE_REACTION", false);
            if (bundle.containsKey("EXTRA_BOL_IS_GROUP_AVATAR") && bundle.getBoolean("EXTRA_BOL_IS_GROUP_AVATAR")) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f62587o2 = z13;
            if (bundle.containsKey("EXTRA_BOL_ENABLE_CAPTION") && !bundle.getBoolean("EXTRA_BOL_ENABLE_CAPTION")) {
                z14 = false;
            } else {
                z14 = true;
            }
            this.f62584l2 = z14;
            if (bundle.containsKey("EXTRA_BOL_HIDE_LAYOUT_BOTTOM") && bundle.getBoolean("EXTRA_BOL_HIDE_LAYOUT_BOTTOM")) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f62585m2 = z15;
            if (bundle.containsKey("extra_is_oldest_first_list") && !bundle.getBoolean("extra_is_oldest_first_list")) {
                z16 = false;
            } else {
                z16 = true;
            }
            this.f62571Y2 = z16;
            m66717iP();
            this.f62653S0 = 28;
        }
        boolean z18 = this.f62583k2;
        if (C24265l.m126676s().m126681C() && !this.f62697y1 && !this.f62585m2) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z19 = z18 & z11;
        this.f62583k2 = z19;
        boolean z21 = this.f62582j2;
        boolean z22 = this.f62697y1;
        this.f62582j2 = z21 & (!z22);
        boolean z23 = this.f62584l2;
        if (!z22 && !this.f62585m2) {
            z17 = true;
        }
        this.f62584l2 = z17 & z23;
        this.f62585m2 &= !z22;
        this.f62578f3 = z19;
        if ((this.f62695w1 || this.f62587o2) && !TextUtils.isEmpty(this.f62696x1)) {
            String str = this.f62696x1;
            if (AbstractC25495a.m132079d(str)) {
                str = AbstractC25495a.m132088m(str);
            }
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            if (m4472f != null) {
                if (m4472f.m153742T() || !m4472f.m153761g0()) {
                    this.f62588p2 = true;
                }
            }
        }
    }

    /* renamed from: nQ */
    public void m66728nQ() {
        C24751d m115465i1;
        C17945a0 c17945a0;
        int i11;
        C22137l c22137l = this.f62556J2;
        if (c22137l != null && (m115465i1 = c22137l.m115465i1()) != null && m115465i1.m128572p() != 0) {
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null && this.f62686n1.m40496C().m41059z()) {
                c17945a0 = new C17945a0.w(this.f62686n1.m40496C(), 3).m95365a();
            } else {
                c17945a0 = null;
            }
            if (this instanceof MediaStoreImageViewer) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            this.f72421L0.m92649TI().m93060e2(0, ReactionDetailView.m76795pL(getContext(), c17945a0, m115465i1, new C12008k(c17945a0), i11), "ReactionDetailView", 0, false);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: oO */
    public void mo66729oO(int i11, Boolean bool) {
        ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView;
        if ((bool == null || !bool.booleanValue()) && (chatPhotoIndicatorRecyclerView = this.f62562P2) != null) {
            chatPhotoIndicatorRecyclerView.m67368i2(i11);
        }
        super.mo66729oO(i11, bool);
        m66693sQ(i11);
    }

    /* renamed from: oQ */
    void m66730oQ(String str) {
        C24730d.m128465h().m128477p(str, EnumC24734h.GROUP_AVATAR, Integer.parseInt(this.f62580h3), false, "", null, new C11998a(str));
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle bundle;
        try {
            this.f72421L0.invalidateOptionsMenu();
            if (i11 == 1001) {
                if (i12 == -1) {
                    if (intent != null) {
                        bundle = intent.getExtras();
                    } else {
                        bundle = null;
                    }
                    if (bundle != null) {
                        String string = bundle.getString("extra_result_output_path");
                        String string2 = bundle.getString("extra_result_camera_log");
                        if (!TextUtils.isEmpty(string) && AbstractC23041d2.m118194A(string)) {
                            this.f72421L0.m92676n2().setRequestedOrientation(1);
                            Intent intent2 = new Intent();
                            intent2.putExtra("extra_chat_photo_action", 1);
                            intent2.putExtra("extra_chat_result_photo_path", string);
                            intent2.putExtra("extra_result_camera_log", string2);
                            this.f72421L0.mo50035CK(-1, intent2);
                            finish();
                            this.f62691s1 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 1002) {
                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                    String string3 = intent.getExtras().getString("extra_result_output_path");
                    if (string3 != null && !TextUtils.isEmpty(string3) && AbstractC23041d2.m118194A(string3) && !TextUtils.isEmpty(this.f62580h3)) {
                        m66730oQ(string3);
                        return;
                    } else {
                        this.f62579g3 = false;
                        m66762EN(1);
                        return;
                    }
                }
                this.f62579g3 = false;
                return;
            }
            if (i11 == 1003) {
                mo50252cO();
            } else {
                super.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_share) {
                if (!m66815DM()) {
                    return;
                }
                mo66737rP(6, 7, false, mo66847ZM());
            } else {
                if (id2 == AbstractC6918a0.reaction_info_bar) {
                    if (!m66815DM()) {
                        return;
                    }
                    m66728nQ();
                    return;
                }
                super.onClick(view);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f62570X2 = configuration.orientation;
        try {
            C12063c c12063c = this.f62677e1;
            if (c12063c != null) {
                c12063c.mo35341m();
                this.f62677e1.m67287C(this.f62685m1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        super.onPageScrollStateChanged(i11);
        if (this.f62589q2) {
            if (i11 != 0) {
                if (i11 == 1) {
                    m66689nP();
                    return;
                }
                return;
            }
            m66690oP();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        ItemAlbumMobile itemAlbumMobile;
        boolean z11;
        m66686kP(this.f62685m1, i11);
        C12063c c12063c = this.f62677e1;
        if (c12063c != null) {
            itemAlbumMobile = c12063c.m67290x(i11);
        } else {
            itemAlbumMobile = null;
        }
        if (itemAlbumMobile == null) {
            return;
        }
        super.onPageSelected(i11);
        if (itemAlbumMobile.f42591p == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f62629A1 = z11;
        if (z11) {
            if (i11 == 0) {
                AbstractC23647d.m123897g("900144042");
            }
            if (i11 == this.f62677e1.mo35335g() - 1) {
                AbstractC23647d.m123897g("900144043");
            }
        }
        m66693sQ(i11);
        m66687lQ(!this.f62629A1);
        if (this.f62688p1 != null && !this.f62629A1 && i11 <= AbstractC23309i.m121411S8()) {
            this.f62688p1.mo94588c();
        }
        ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = this.f62562P2;
        if (chatPhotoIndicatorRecyclerView != null && this.f62589q2) {
            chatPhotoIndicatorRecyclerView.m67369n2(i11);
        }
        m66685hQ(itemAlbumMobile);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 109) {
            if (AbstractC23034c6.m118121G()) {
                if (m66882sN()) {
                    m66731pP();
                    return;
                } else {
                    mo66702OM();
                    return;
                }
            }
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            m66720jQ();
            this.f72827B0.post(new Runnable() { // from class: j70.w
                @Override // java.lang.Runnable
                public final void run() {
                    BaseChatImageViewer.this.m66656OP();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pP */
    public void m66731pP() {
        try {
            if (!AbstractC23034c6.m118118E() && m92676n2() != null) {
                AbstractC23034c6.m118186w0(m92676n2(), AbstractC23034c6.f112029f, 109);
                return;
            }
            if (this.f62581i3) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.media_being_loaded_message));
                return;
            }
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null) {
                this.f72421L0.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_loading), true);
                this.f62581i3 = true;
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseChatImageViewer.this.m66644IP();
                    }
                });
                return;
            }
            m66762EN(1);
        } catch (Exception unused) {
            m66762EN(-1);
            this.f62581i3 = false;
            this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: pQ */
    protected void m66732pQ() {
        boolean z11;
        int i11;
        int i12;
        int i13;
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        int i14 = 0;
        if (itemAlbumMobile != null && itemAlbumMobile.m40511V()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ModulesView modulesView = this.f62557K2;
        if (m66719jP() && !m66746yP()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        m66877pO(modulesView, i11);
        ModulesView modulesView2 = this.f62555I2;
        if (this.f62566T2 && !m66746yP() && !z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        m66877pO(modulesView2, i12);
        View view = this.f62597y2;
        if (this.f62568V2 && !m66746yP()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        m66877pO(view, i13);
        View view2 = this.f62548B2;
        if (!this.f62694v1 || m66746yP() || z11) {
            i14 = 8;
        }
        m66877pO(view2, i14);
        if (this.f62584l2) {
            m66691rQ();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: qN */
    public void mo66733qN(View view) {
        super.mo66733qN(view);
        this.f62591s2 = view.findViewById(AbstractC6918a0.layout_hq_control);
        this.f62594v2 = view.findViewById(AbstractC6918a0.btn_load_hq_image);
        this.f62593u2 = view.findViewById(AbstractC6918a0.view_hd_image);
        this.f62592t2 = view.findViewById(AbstractC6918a0.rl_hd_loading);
        this.f62595w2 = view.findViewById(AbstractC6918a0.layout_bottom);
        this.f62547A2 = view.findViewById(AbstractC6918a0.layout_bottom_action);
        this.f62548B2 = view.findViewById(AbstractC6918a0.btn_share);
        this.f62596x2 = view.findViewById(AbstractC6918a0.view_bottom_gradient);
        this.f62555I2 = (ModulesView) view.findViewById(AbstractC6918a0.reaction_info_bar);
        this.f62557K2 = (ModulesView) view.findViewById(AbstractC6918a0.react_action_bar);
        this.f62559M2 = view.findViewById(AbstractC6918a0.overlay_description);
        this.f62597y2 = view.findViewById(AbstractC6918a0.layout_description);
        this.f62598z2 = (PhotoDescriptionTextView) view.findViewById(AbstractC6918a0.tv_caption);
        this.f62560N2 = view.findViewById(AbstractC6918a0.background_qr_gradient);
        View view2 = this.f62594v2;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        View view3 = this.f62593u2;
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
        View view4 = this.f62548B2;
        if (view4 != null) {
            view4.setOnClickListener(this);
        }
        try {
            C12073a c12073a = new C12073a(this.f62665Y0, this.f62684l1);
            this.f62564R2 = c12073a;
            c12073a.m67382X(new C12073a.a() { // from class: j70.c
                @Override // com.zing.zalo.p077ui.imageviewer.indicator.C12073a.a
                /* renamed from: a */
                public final void mo67387a(int i11) {
                    BaseChatImageViewer.this.m66652MP(i11);
                }
            });
            this.f62564R2.m67386b0(this.f62651R0);
            this.f62561O2 = view.findViewById(AbstractC6918a0.layout_indicator_slider);
            PreCacheLinearLayoutManager preCacheLinearLayoutManager = new PreCacheLinearLayoutManager(this.f62665Y0, 0, false);
            this.f62563Q2 = preCacheLinearLayoutManager;
            preCacheLinearLayoutManager.m67263N2(150);
            ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = (ChatPhotoIndicatorRecyclerView) view.findViewById(AbstractC6918a0.rc_chat_photo_indicator);
            this.f62562P2 = chatPhotoIndicatorRecyclerView;
            if (chatPhotoIndicatorRecyclerView != null) {
                chatPhotoIndicatorRecyclerView.setBaseChatImageViewer(this);
                this.f62562P2.setLayoutManager(this.f62563Q2);
                this.f62562P2.setAdapter(this.f62564R2);
                this.f62562P2.m9816A(new C12001d());
                this.f62562P2.m9826E(new C12002e());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        View view5 = this.f62595w2;
        if (view5 != null) {
            view5.addOnLayoutChangeListener(this.f62574b3);
        }
    }

    /* renamed from: qP */
    public void m66734qP(final C17945a0 c17945a0, final int i11, int i12, boolean z11, final String str) {
        boolean z12;
        try {
            if (c17945a0 != null) {
                boolean z13 = c17945a0.m94929K2() instanceof C18013y0;
                boolean z14 = c17945a0.m94929K2() instanceof C17961f1;
                boolean z15 = true;
                if (c17945a0.m94954N0() && (!TextUtils.isEmpty(c17945a0.m94983Q3()) || z13 || z14)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!c17945a0.m95054X6() || !TextUtils.isEmpty(c17945a0.m95090b5())) {
                    z15 = false;
                }
                if (z14) {
                    i11 = i12;
                }
                if (z12) {
                    this.f62656T1.post(new Runnable() { // from class: j70.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseChatImageViewer.this.m66646JP(c17945a0, i11, str);
                        }
                    });
                    return;
                }
                if (z15) {
                    this.f62656T1.post(new Runnable() { // from class: j70.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseChatImageViewer.m66648KP();
                        }
                    });
                    return;
                }
                if (c17945a0.m94871D7()) {
                    m66885tO(i11);
                    return;
                } else if (z14) {
                    ToastUtils.m89266n(AbstractC8020f0.video_player_share_not_downloaded_message, new Object[0]);
                    return;
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_imp_alias_data_error, new Object[0]);
                    return;
                }
            }
            if (z11) {
                m66885tO(i11);
            } else {
                this.f62656T1.post(new Runnable() { // from class: j70.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseChatImageViewer.m66650LP();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qQ */
    public void m66735qQ() {
        ItemAlbumMobile itemAlbumMobile;
        if (!this.f62584l2) {
            return;
        }
        try {
            PhotoDescriptionTextView photoDescriptionTextView = this.f62598z2;
            if (photoDescriptionTextView != null) {
                photoDescriptionTextView.setOriginalText((String) this.f62565S2);
                this.f62598z2.setMovementMethod(CustomMovementMethod.m56305e());
                int i11 = 0;
                this.f62567U2 = !TextUtils.isEmpty(this.f62565S2);
                this.f62569W2 = this.f62598z2.m77058q();
                PhotoDescriptionTextView photoDescriptionTextView2 = this.f62598z2;
                if (!this.f62567U2 || m66746yP()) {
                    i11 = 8;
                }
                m66877pO(photoDescriptionTextView2, i11);
                if (!TextUtils.isEmpty(this.f62565S2) && (itemAlbumMobile = this.f62686n1) != null && itemAlbumMobile.m40506Q() && this.f62686n1.m40533u() != null) {
                    Iterator it = this.f62686n1.m40533u().iterator();
                    while (it.hasNext()) {
                        C10866e c10866e = (C10866e) it.next();
                        c10866e.m56377U(this.f72421L0.m92651WI().getColor(AbstractC16801x.cTime1));
                        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                        ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                        C10866e.m56358d(c10866e, m92676n2, itemAlbumMobile2.f42595r, itemAlbumMobile2.f42593q, itemAlbumMobile2.f42599t, itemAlbumMobile2.m40501J());
                    }
                }
                if (AbstractC26683d.f126393l) {
                    AbstractC28245z3.m142219b(this.f62565S2, this.f62598z2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: rO */
    public void mo66736rO(int i11) {
        super.mo66736rO(i11);
        C12073a c12073a = this.f62564R2;
        if (c12073a != null) {
            c12073a.m67386b0(i11);
        }
    }

    /* renamed from: rP */
    public void mo66737rP(int i11, int i12, boolean z11, String str) {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null) {
            C0824j.m2153b(new C12006i(this.f62686n1, i11, i12, z11, str));
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: sO */
    public void mo66738sO() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        PhotoDescriptionTextView photoDescriptionTextView;
        int i17;
        boolean m66688mQ = m66688mQ();
        int i18 = 8;
        m66877pO(this.f62591s2, 8);
        View view = this.f62595w2;
        if (m66688mQ) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        m66877pO(view, i11);
        View view2 = this.f62596x2;
        if (m66688mQ) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        m66877pO(view2, i12);
        View view3 = this.f62547A2;
        if (m66688mQ) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        m66877pO(view3, i13);
        View view4 = this.f62548B2;
        if (this.f62694v1 && !m66746yP()) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        m66877pO(view4, i14);
        m66877pO(this.f62555I2, 8);
        m66877pO(this.f62559M2, 8);
        View view5 = this.f62597y2;
        if (m66688mQ) {
            i15 = 8;
        } else {
            i15 = 0;
        }
        m66877pO(view5, i15);
        PhotoDescriptionTextView photoDescriptionTextView2 = this.f62598z2;
        if (this.f62584l2 && !m66746yP()) {
            i16 = 0;
        } else {
            i16 = 8;
        }
        m66877pO(photoDescriptionTextView2, i16);
        ModulesView modulesView = this.f62557K2;
        if (modulesView != null) {
            if (m66719jP()) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            modulesView.setVisibility(i17);
        }
        View view6 = this.f62561O2;
        if (view6 != null) {
            if (this.f62589q2) {
                i18 = 0;
            }
            view6.setVisibility(i18);
        }
        ChatPhotoIndicatorRecyclerView chatPhotoIndicatorRecyclerView = this.f62562P2;
        if (chatPhotoIndicatorRecyclerView != null) {
            chatPhotoIndicatorRecyclerView.setVisibility(4);
        }
        if (this.f62584l2 && (photoDescriptionTextView = this.f62598z2) != null) {
            photoDescriptionTextView.setActivity(m92676n2());
            this.f62598z2.setOnCollapseExpandListener(new PhotoDescriptionTextView.InterfaceC13798a() { // from class: j70.u
                @Override // com.zing.zalo.p077ui.widget.textview.PhotoDescriptionTextView.InterfaceC13798a
                /* renamed from: a */
                public final void mo77060a(boolean z11) {
                    BaseChatImageViewer.this.m66678ZP(z11);
                }
            });
        }
        if (this.f62583k2) {
            ModulesView modulesView2 = this.f62555I2;
            if (modulesView2 != null) {
                modulesView2.setOnClickListener(this);
                C22137l c22137l = new C22137l(getContext(), this.f62555I2, 1);
                this.f62556J2 = c22137l;
                c22137l.m115469o1(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(6.0f));
                this.f62555I2.mo69681L(this.f62556J2);
            }
            if (this.f62557K2 != null) {
                C22134i c22134i = new C22134i(getContext(), 1, AbstractC23304d.m120539j(), 3, 0, 3);
                this.f62558L2 = c22134i;
                c22134i.m115460q1(40, 40, 10);
                this.f62558L2.m115459p1(new C12005h());
                this.f62557K2.mo69681L(this.f62558L2);
            }
        }
        super.mo66738sO();
    }

    /* renamed from: tP */
    public abstract int mo66739tP();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: uN */
    public boolean mo66740uN() {
        if (super.mo66740uN() && !this.f62569W2) {
            return true;
        }
        return false;
    }

    /* renamed from: uP */
    protected void mo66741uP(C20568e c20568e) {
        if (c20568e == null) {
            return;
        }
        mo66718iQ(c20568e.m107020d(), c20568e.m107019c(), c20568e.m107018b(), c20568e.m107022f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vP */
    public boolean m66742vP() {
        C31973j5 m4472f;
        if (!this.f62695w1 || (m4472f = C0943w.m4462l().m4472f(this.f62696x1)) == null || !m4472f.m153747Y()) {
            return false;
        }
        return true;
    }

    /* renamed from: wP */
    protected boolean m66743wP() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.f42566Q) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        MessageId messageId;
        String str = "";
        boolean z11 = false;
        try {
            if (i11 != 9) {
                if (i11 != 47) {
                    if (i11 != 52) {
                        if (i11 != 75) {
                            if (i11 == 177 && (this instanceof MediaStoreImageViewer) && objArr.length > 0) {
                                ((MediaStoreImageViewer) this).m67252xQ(false, (List) objArr[0]);
                                return;
                            }
                            return;
                        }
                        this.f62656T1.post(new Runnable() { // from class: j70.a0
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseChatImageViewer.this.m66636EP(objArr);
                            }
                        });
                        return;
                    }
                    if (!TextUtils.isEmpty(this.f62696x1)) {
                        str = AbstractC25495a.m132088m(this.f62696x1);
                    }
                    if (AbstractC23184q2.m119459q(str, i11, objArr)) {
                        finish();
                        return;
                    }
                    return;
                }
                if (m66719jP() && objArr.length > 0) {
                    C20350p c20350p = (C20350p) objArr[0];
                    String m106090e = c20350p.m106090e();
                    if (TextUtils.isEmpty(m106090e) || C11318b.m60507e().m60515j(m106090e)) {
                        z11 = true;
                    }
                    if (!z11) {
                        for (MessageId messageId2 : c20350p.m106088c()) {
                            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                            if (itemAlbumMobile != null) {
                                messageId = itemAlbumMobile.m40496C();
                            } else {
                                messageId = null;
                            }
                            if (messageId2.equals(messageId)) {
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        return;
                    }
                    C28266a m102752J = AbstractC23306f.m120606O1().m102752J(m106090e);
                    if (m102752J != null) {
                        C0810d.m2053b(new C12000c(m106090e, m102752J));
                    }
                    this.f62656T1.post(new Runnable() { // from class: j70.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseChatImageViewer.this.m66634DP();
                        }
                    });
                    return;
                }
                return;
            }
            if (objArr.length > 0) {
                C20338d c20338d = (C20338d) objArr[0];
                final int m106049g = c20338d.m106049g();
                C17945a0 m106046d = c20338d.m106046d();
                final MessageId m106047e = c20338d.m106047e();
                final C20568e m106048f = c20338d.m106048f();
                if (m106046d != null) {
                    str = m106046d.mo95039W2();
                }
                final String str2 = str;
                this.f62656T1.post(new Runnable() { // from class: j70.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseChatImageViewer.this.m66633CP(m106048f, str2, m106049g, m106047e);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m66698Et();
    }

    /* renamed from: xP */
    public boolean mo66744xP(int i11) {
        return i11 == 3 || i11 == 4 || i11 == 2 || i11 == 19;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: yO */
    public void mo66745yO(C12063c.g gVar) {
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        try {
            super.mo66745yO(gVar);
            int i13 = 8;
            if (gVar == null) {
                View view = this.f62594v2;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.f62592t2;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f62593u2;
                if (view3 != null) {
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            boolean z13 = true;
            if (this.f62594v2 != null) {
                if (m66743wP() && !this.f62637I1 && !this.f62638J1 && !this.f62635G1 && !this.f62634F1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view4 = this.f62594v2;
                if (!z12) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                view4.setVisibility(i12);
            }
            if (this.f62592t2 != null) {
                if (m66743wP() && this.f62637I1 && !gVar.f62975u) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                View view5 = this.f62592t2;
                if (!z11) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                view5.setVisibility(i11);
            }
            if (this.f62593u2 != null) {
                boolean m66747zP = m66747zP();
                if (!m66743wP() || !this.f62638J1) {
                    z13 = false;
                }
                View view6 = this.f62593u2;
                if (z13 || m66747zP) {
                    i13 = 0;
                }
                view6.setVisibility(i13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yP */
    protected boolean m66746yP() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.f42549C0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 47);
        C23744a.m124114c().m124115b(this, 52);
        C23744a.m124114c().m124115b(this, 9);
        C23744a.m124114c().m124115b(this, 75);
        C23744a.m124114c().m124115b(this, 177);
    }

    /* renamed from: zP */
    protected boolean m66747zP() {
        ItemAlbumMobile itemAlbumMobile = this.f62686n1;
        if (itemAlbumMobile != null && itemAlbumMobile.f42589n0) {
            return true;
        }
        return false;
    }
}
