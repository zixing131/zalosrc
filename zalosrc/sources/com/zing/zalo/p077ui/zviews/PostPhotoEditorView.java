package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import au.C2370r0;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.AnimationLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.uicontrols.C8880k;
import com.zing.zalo.feed.uicontrols.C8884o;
import com.zing.zalo.feed.uicontrols.FeedGridModulesView;
import com.zing.zalo.p077ui.picker.landingpage.LandingPageView;
import com.zing.zalo.p077ui.zviews.PostPhotoEditorView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import i40.C20275e;
import is.AbstractC20784a0;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m90.EnumC22962a;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23171p0;
import me0.AbstractC23211s7;
import me0.AbstractC23280z4;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import np.InterfaceC23923b;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23999j;
import p509sp.C26361j;

/* loaded from: classes6.dex */
public class PostPhotoEditorView extends BaseZaloView implements View.OnClickListener, FeedGridModulesView.InterfaceC8857a, InterfaceC0733x, InterfaceC23923b {

    /* renamed from: M0 */
    View f76037M0;

    /* renamed from: N0 */
    ScrollView f76038N0;

    /* renamed from: O0 */
    FeedGridModulesView f76039O0;

    /* renamed from: P0 */
    View f76040P0;

    /* renamed from: Q0 */
    Button f76041Q0;

    /* renamed from: R0 */
    View f76042R0;

    /* renamed from: S0 */
    C23528a f76043S0;

    /* renamed from: T0 */
    AnimationLayout f76044T0;

    /* renamed from: U0 */
    LandingPageView f76045U0;

    /* renamed from: X0 */
    ArrayList f76048X0;

    /* renamed from: Y0 */
    boolean f76049Y0;

    /* renamed from: Z0 */
    HandlerThread f76050Z0;

    /* renamed from: a1 */
    C14771f f76051a1;

    /* renamed from: c1 */
    int f76053c1;

    /* renamed from: d1 */
    int f76054d1;

    /* renamed from: e1 */
    C20275e f76055e1;

    /* renamed from: V0 */
    ArrayList f76046V0 = new ArrayList();

    /* renamed from: W0 */
    ArrayList f76047W0 = new ArrayList();

    /* renamed from: b1 */
    boolean f76052b1 = false;

    /* renamed from: f1 */
    SparseIntArray f76056f1 = new SparseIntArray();

    /* renamed from: g1 */
    SparseIntArray f76057g1 = new SparseIntArray();

    /* renamed from: com.zing.zalo.ui.zviews.PostPhotoEditorView$a */
    /* loaded from: classes6.dex */
    class C14766a implements AnimationLayout.OnEventListener {
        C14766a() {
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onBeforeExpanding(int i11) {
            if (AnimationLayout.isTypeShowFullscreen(i11) && !PostPhotoEditorView.this.f72421L0.m92676n2().mo35576n3()) {
                AbstractC23136l9.m118686X0(PostPhotoEditorView.this.f72421L0.m92676n2().getWindow(), true);
            }
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onExpanded(int i11) {
            PostPhotoEditorView.this.m82801rM();
        }

        @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
        public void onShrunk() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PostPhotoEditorView$b */
    /* loaded from: classes6.dex */
    class C14767b extends C20275e {
        C14767b() {
        }

        @Override // i40.C20275e
        /* renamed from: h */
        public int mo36887h(int i11) {
            return i11;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PostPhotoEditorView$c */
    /* loaded from: classes6.dex */
    class C14768c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f76060p;

        C14768c(Runnable runnable) {
            this.f76060p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            Runnable runnable = this.f76060p;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f76060p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PostPhotoEditorView$d */
    /* loaded from: classes6.dex */
    public class C14769d implements C8880k.f {
        C14769d() {
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: a */
        public void mo43488a(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            C20275e c20275e = PostPhotoEditorView.this.f76055e1;
            if (c20275e != null) {
                c20275e.m105865K(i11);
            }
            PostPhotoEditorView postPhotoEditorView = PostPhotoEditorView.this;
            postPhotoEditorView.m82797nM((MediaItem) postPhotoEditorView.f76046V0.get(i11), animationTarget, PostPhotoEditorView.this.f76055e1, i11, f11);
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: b */
        public void mo43489b(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            PostPhotoEditorView.this.f76055e1.m105865K(i11);
            PostPhotoEditorView postPhotoEditorView = PostPhotoEditorView.this;
            postPhotoEditorView.m82797nM((MediaItem) postPhotoEditorView.f76046V0.get(i11), animationTarget, PostPhotoEditorView.this.f76055e1, i11, f11);
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: c */
        public void mo43490c(int i11) {
            MediaItem mediaItem = (MediaItem) PostPhotoEditorView.this.f76046V0.get(i11);
            if (PostPhotoEditorView.this.f76046V0.contains(mediaItem)) {
                PostPhotoEditorView.this.f76046V0.remove(mediaItem);
                mediaItem.m41140d1(false);
            }
            PostPhotoEditorView.this.m82804uM();
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: d */
        public void mo43491d(ItemAlbumMobile itemAlbumMobile, int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PostPhotoEditorView$e */
    /* loaded from: classes6.dex */
    public class C14770e implements LandingPageView.InterfaceC12717p {
        C14770e() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: a */
        public void mo71313a(C3979l c3979l) {
            C20275e c20275e = PostPhotoEditorView.this.f76055e1;
            if (c20275e != null) {
                c20275e.m105864J(c3979l);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: b */
        public void mo71314b(SparseIntArray sparseIntArray) {
            C20275e c20275e = PostPhotoEditorView.this.f76055e1;
            if (c20275e != null) {
                c20275e.m105856B(sparseIntArray);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: c */
        public void mo71315c(int i11) {
            C20275e c20275e = PostPhotoEditorView.this.f76055e1;
            if (c20275e != null) {
                c20275e.m105866L(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: d */
        public void mo71316d(int i11) {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12717p
        /* renamed from: e */
        public void mo71317e() {
            PostPhotoEditorView postPhotoEditorView = PostPhotoEditorView.this;
            C20275e c20275e = postPhotoEditorView.f76055e1;
            if (c20275e != null) {
                c20275e.m105877m(postPhotoEditorView.f76044T0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PostPhotoEditorView$f */
    /* loaded from: classes6.dex */
    public class C14771f extends ContentObserver {
        C14771f(Handler handler) {
            super(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m82807b() {
            if (PostPhotoEditorView.this.m92672lJ()) {
                PostPhotoEditorView.this.m82804uM();
            } else {
                PostPhotoEditorView.this.f76052b1 = true;
            }
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            super.onChange(z11);
            PostPhotoEditorView postPhotoEditorView = PostPhotoEditorView.this;
            postPhotoEditorView.m82799pM(postPhotoEditorView.f76046V0);
            PostPhotoEditorView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.b60
                @Override // java.lang.Runnable
                public final void run() {
                    PostPhotoEditorView.C14771f.this.m82807b();
                }
            });
        }
    }

    /* renamed from: jM */
    private ArrayList m82788jM(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MediaItem((MediaItem) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m82789kM(int i11, boolean z11, List list, List list2) {
        try {
            m82800qM();
            m82805vM(list);
            m82804uM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m82790lM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        ArrayList arrayList = this.f76047W0;
        this.f76046V0 = arrayList;
        m82799pM(arrayList);
        m82795hM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m82791mM(ValueAnimator valueAnimator) {
        View view = this.f76037M0;
        if (view != null) {
            view.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ArrayList arrayList;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (bundle != null && bundle.containsKey("EXTRA_SAVE_SELECTED_PHOTOS")) {
            arrayList = bundle.getParcelableArrayList("EXTRA_SAVE_SELECTED_PHOTOS");
        } else if (m92642L3 != null) {
            arrayList = m92642L3.getParcelableArrayList("EXTRA_SELECTED_PHOTOS");
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            m82799pM(arrayList);
            m82805vM(arrayList);
            ArrayList arrayList2 = this.f76047W0;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                this.f76047W0 = new ArrayList();
            }
            this.f76047W0.addAll(m82788jM(arrayList));
        }
        if (m92642L3 != null) {
            this.f76049Y0 = m92642L3.getBoolean("extra_enable_inline_banner", false);
        }
        this.f76043S0 = new C23528a(this.f72421L0.m92648SI());
        m92637BK(true);
    }

    @Override // com.zing.zalo.feed.uicontrols.FeedGridModulesView.InterfaceC8857a
    /* renamed from: D0 */
    public void mo47301D0(int i11, int i12) {
        ScrollView scrollView = this.f76038N0;
        if (scrollView != null) {
            scrollView.scrollBy(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 10) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_discard_dialog_msg_postfeed_editor)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.z50
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                PostPhotoEditorView.this.m82790lM(interfaceC17463d, i12);
            }
        });
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            actionBarMenu.m92750r();
            View m92744k = actionBarMenu.m92744k(AbstractC6918a0.menu_done, AbstractC7409c0.action_bar_menu_item_blue_text_only);
            this.f76042R0 = m92744k;
            ((android.widget.Button) m92744k).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_finished));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.post_photo_editor_view, viewGroup, false);
        this.f76037M0 = inflate;
        this.f76038N0 = (ScrollView) inflate.findViewById(AbstractC6918a0.photo_scroll_view);
        this.f76039O0 = (FeedGridModulesView) this.f76037M0.findViewById(AbstractC6918a0.photo_preview_grid);
        this.f76040P0 = this.f76037M0.findViewById(AbstractC6918a0.preview_layout);
        Button button = (Button) this.f76037M0.findViewById(AbstractC6918a0.btn_photo_grid_add);
        this.f76041Q0 = button;
        if (button != null) {
            button.setOnClickListener(this);
        }
        this.f76053c1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC17484n.Companion.m92931b();
        this.f76054d1 = AbstractC23136l9.m118713h0();
        return this.f76037M0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        int i11;
        View view;
        if (z11 && (view = this.f76037M0) != null) {
            view.setTranslationY(AbstractC23136l9.m118713h0());
        }
        int i12 = 0;
        if (z11) {
            i11 = AbstractC23136l9.m118713h0();
        } else {
            i11 = 0;
        }
        if (!z11) {
            i12 = AbstractC23136l9.m118713h0();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i11, i12);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.a60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PostPhotoEditorView.this.m82791mM(valueAnimator);
            }
        });
        ofInt.setDuration(200L);
        if (!z11) {
            ofInt.setStartDelay(200L);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt);
        animatorSet.addListener(new C14768c(runnable));
        return animatorSet;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m82802sM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AnimationLayout animationLayout = this.f76044T0;
        if (animationLayout != null) {
            animationLayout.detachFromActivity();
        }
    }

    /* renamed from: Q6 */
    void m82792Q6() {
        if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().mo35576n3()) {
            AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        LandingPageView landingPageView;
        try {
            landingPageView = this.f76045U0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (landingPageView != null && landingPageView.m92674mJ()) {
            return this.f76045U0.mo37491QJ(i11);
        }
        if (i11 == 16908332) {
            m82795hM(false);
            return true;
        }
        if (i11 == AbstractC6918a0.menu_done) {
            m82795hM(true);
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            bundle.putParcelableArrayList("EXTRA_SAVE_SELECTED_PHOTOS", this.f76046V0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            this.f88760a0.setTitle("");
            this.f88760a0.getTitleTextView().setTextSize(16.0f);
            this.f88760a0.getTitleTextView().setTextColor(C23212s8.m119607o(this.f88760a0.getContext(), AbstractC21196a.TextColor1));
            m82803tM();
        }
    }

    @Override // com.zing.zalo.feed.uicontrols.FeedGridModulesView.InterfaceC8857a
    /* renamed from: V3 */
    public int mo47302V3() {
        return this.f76054d1;
    }

    @Override // com.zing.zalo.feed.uicontrols.FeedGridModulesView.InterfaceC8857a
    /* renamed from: Y1 */
    public int mo47303Y1() {
        return this.f76053c1;
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return C26361j.f125215a.m135697c(this.f72421L0);
    }

    /* renamed from: f0 */
    void m82793f0() {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_photo_type", 15);
            bundle.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
            bundle.putBoolean("extra_enable_inline_banner", this.f76049Y0);
            bundle.putParcelableArrayList("extra_external_selected_items", this.f76046V0);
            AbstractC23211s7.m119590w(this.f72421L0.m92676n2(), 1000, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    boolean m82794gM(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null && list2 != null) {
            try {
                if (list.size() != list2.size()) {
                    return false;
                }
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (!((MediaItem) list.get(i11)).mo41081Q().equals(((MediaItem) list2.get(i11)).mo41081Q())) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PostPhotoEditorView";
    }

    /* renamed from: hM */
    void m82795hM(boolean z11) {
        if (!z11 && !m82794gM(this.f76047W0, this.f76046V0)) {
            showDialog(10);
            return;
        }
        View view = this.f76037M0;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("EXTRA_SELECTED_PHOTOS", this.f76046V0);
        this.f76048X0 = new ArrayList();
        ArrayList arrayList = this.f76046V0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (!mediaItem.m41173u0() && !TextUtils.isEmpty(mediaItem.m41113N())) {
                    this.f76048X0.add(mediaItem);
                }
            }
        }
        intent.putParcelableArrayListExtra("EXTRA_MODIFIED_PHOTOS", this.f76048X0);
        mo50035CK(-1, intent);
        super.finish();
    }

    /* renamed from: iM */
    void m82796iM() {
        LandingPageView landingPageView = this.f76045U0;
        if (landingPageView != null) {
            landingPageView.m71704hP(new LandingPageView.InterfaceC12718q() { // from class: com.zing.zalo.ui.zviews.y50
                @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPageView.InterfaceC12718q
                /* renamed from: a */
                public final void mo71513a(int i11, boolean z11, List list, List list2) {
                    PostPhotoEditorView.this.m82789kM(i11, z11, list, list2);
                }
            });
            this.f76045U0.m71703gP(new C14770e());
        }
    }

    /* renamed from: nM */
    void m82797nM(MediaItem mediaItem, AnimationTarget animationTarget, C20275e c20275e, int i11, float f11) {
        if (c20275e != null) {
            try {
                c20275e.m105865K(i11);
                c20275e.m105862H(f11);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ArrayList arrayList = this.f76046V0;
        this.f76045U0 = new LandingPageView(LandingPageView.m71644lP(4, EnumC22962a.f111693q, AbstractC23280z4.m120299K(arrayList, mediaItem), 0, false, "", "", "", ""), arrayList, arrayList);
        m82796iM();
        if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(this.f72421L0.m92648SI())) {
            this.f76055e1 = c20275e;
            C3979l m125676A2 = C23999j.m125676A2(AbstractC23280z4.m120361x(mediaItem), AbstractC23006a0.m117875E(), C23278z2.m120110a());
            if (m125676A2 == null) {
                m125676A2 = this.f76043S0.m123605k(AbstractC23280z4.m120364z(mediaItem), AbstractC23006a0.m117883M(), C23278z2.m120110a());
            }
            if (this.f76044T0 != null && animationTarget != null && m125676A2 != null && m125676A2.m18839c() != null) {
                C20275e c20275e2 = this.f76055e1;
                if (c20275e2 != null) {
                    c20275e2.m105864J(m125676A2);
                }
                this.f76044T0.expand(animationTarget, m125676A2);
                return;
            }
            m82801rM();
            return;
        }
        m82801rM();
    }

    /* renamed from: oM */
    void m82798oM() {
        try {
            HandlerThread handlerThread = new HandlerThread("Z:PostPhotoEditor");
            this.f76050Z0 = handlerThread;
            handlerThread.start();
            this.f76051a1 = new C14771f(new Handler(this.f76050Z0.getLooper()));
            MainApplication.getAppContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f76051a1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        MediaItem[] mediaItemArr;
        try {
            if (i11 == 1000) {
                if (i12 == -1 && intent != null && (mediaItemArr = (MediaItem[]) intent.getParcelableArrayExtra("result_selected_items")) != null) {
                    m82805vM(Arrays.asList(mediaItemArr));
                    m82804uM();
                }
            } else if (i11 == 2001 || i11 == 2002) {
                m82792Q6();
                LandingPageView landingPageView = this.f76045U0;
                if (landingPageView != null && landingPageView.m92674mJ()) {
                    this.f76045U0.onActivityResult(i11, i12, intent);
                }
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.btn_photo_grid_add) {
                m82793f0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                LandingPageView landingPageView = this.f76045U0;
                if (landingPageView != null && landingPageView.m92674mJ()) {
                    return this.f76045U0.onKeyUp(i11, keyEvent);
                }
                m82795hM(false);
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f76052b1) {
            this.f76052b1 = false;
            m82804uM();
        }
    }

    /* renamed from: pM */
    void m82799pM(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((MediaItem) it.next()).m41159n0()) {
                    it.remove();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m82800qM() {
        int i11;
        try {
            if (this.f76045U0 != null) {
                C20275e c20275e = this.f76055e1;
                if (c20275e != null && !c20275e.m105878o()) {
                    i11 = 0;
                    this.f72421L0.m92649TI().mo92702G1(this.f76045U0, i11);
                    this.f76045U0 = null;
                }
                i11 = AbstractC10919t.fadeout;
                this.f72421L0.m92649TI().mo92702G1(this.f76045U0, i11);
                this.f76045U0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m82801rM() {
        try {
            this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.container_landing_page, this.f76045U0, 0, "LANDING_PAGE_VIEW_TAG", 0, false);
            if (this.f76045U0 != null) {
                C17487o0 m92649TI = this.f72421L0.m92649TI();
                if (this.f76045U0.m92679oJ()) {
                    m92649TI.m93077o2(this.f76045U0);
                }
                if (this.f76045U0.m92656bJ() != null) {
                    this.f76045U0.m92656bJ().bringToFront();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m82802sM() {
        try {
            MainApplication.getAppContext().getContentResolver().unregisterContentObserver(this.f76051a1);
            this.f76050Z0.quit();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m82803tM() {
        if (this.f88760a0 != null) {
            ArrayList arrayList = this.f76046V0;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f88760a0.setTitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_photo_selector_action_bar, Integer.valueOf(this.f76046V0.size())));
            } else {
                this.f88760a0.setTitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_photo_selector_action_bar, 0));
            }
        }
    }

    /* renamed from: uM */
    void m82804uM() {
        boolean z11;
        try {
            m82803tM();
            ArrayList arrayList = this.f76046V0;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (!AbstractC23136l9.m118666N0(this.f76039O0)) {
                    AbstractC23136l9.m118744r1(this.f76039O0, 0);
                }
                ArrayList arrayList2 = new ArrayList();
                List m108447k = AbstractC20784a0.m108447k(this.f76046V0);
                Iterator it = this.f76046V0.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    MediaItem mediaItem = (MediaItem) it.next();
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.m40513X(mediaItem, true);
                    if (i11 < m108447k.size()) {
                        itemAlbumMobile.f42596r0 = (ItemAlbumMobile.C7883c) m108447k.get(i11);
                    }
                    arrayList2.add(itemAlbumMobile);
                    i11++;
                }
                this.f76056f1.clear();
                this.f76057g1.clear();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    this.f76056f1.put(i12, 0);
                }
                this.f76057g1.put(0, 0);
                this.f76055e1.m105861G(new C2370r0(this.f76039O0));
                this.f76055e1.m105857C(this.f76056f1);
                this.f76055e1.m105858D(this.f76057g1);
                this.f76055e1.m105886y(true);
                this.f76055e1.m105855A(true);
                this.f76039O0.setWidth(AbstractC23136l9.m118725l0(this.f72421L0.getContext()));
                this.f76039O0.setSourceActionLog(1000);
                this.f76039O0.setLayoutMode(4);
                this.f76039O0.setUseFileCache(false);
                C8884o c8884o = new C8884o(arrayList2, 0, AbstractC20826v0.m108824n0(4), -1);
                FeedGridModulesView feedGridModulesView = this.f76039O0;
                if (arrayList2.size() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                feedGridModulesView.m47295V(c8884o, 0, true, z11);
                this.f76039O0.m47297X(c8884o, false, 0);
                this.f76039O0.setScrollDelegate(this);
                this.f76039O0.setItemClickListener(new C14769d());
                return;
            }
            AbstractC23136l9.m118744r1(this.f76039O0, 8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    void m82805vM(List list) {
        try {
            ArrayList arrayList = this.f76046V0;
            if (arrayList == null) {
                this.f76046V0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            this.f76046V0.addAll(list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f76045U0 = (LandingPageView) this.f72421L0.m92649TI().m92996E0("LANDING_PAGE_VIEW_TAG");
        m82796iM();
        AnimationLayout animationLayout = new AnimationLayout(this.f72421L0.m92648SI());
        this.f76044T0 = animationLayout;
        animationLayout.setOnEventListener(new C14766a());
        this.f76055e1 = new C14767b();
        m82804uM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        m82798oM();
    }
}
