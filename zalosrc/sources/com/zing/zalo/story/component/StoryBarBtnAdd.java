package com.zing.zalo.story.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1579n0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StoryBarItemImageView;
import com.zing.zalo.p077ui.widget.StoryPreviewView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.story.component.StoryBarBtnAdd;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l30.AbstractC22055v0;
import l30.C22013a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p020ak.C0884c;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p500s1.C26086a;
import p716zh.C32207za;
import t80.C26596i;
import t80.C26599l;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* loaded from: classes5.dex */
public class StoryBarBtnAdd extends RelativeLayout implements AbstractC22055v0.j {

    /* renamed from: S */
    static int[] f55056S = {AbstractC16803z.icon_story_anim_camera2, AbstractC16803z.icon_story_anim_video2};

    /* renamed from: A */
    ImageView f55057A;

    /* renamed from: B */
    RobotoTextView f55058B;

    /* renamed from: C */
    ModulesView f55059C;

    /* renamed from: D */
    C26596i f55060D;

    /* renamed from: E */
    RecyclingImageView f55061E;

    /* renamed from: F */
    RobotoTextView f55062F;

    /* renamed from: G */
    RobotoTextView f55063G;

    /* renamed from: H */
    RobotoTextView f55064H;

    /* renamed from: I */
    View f55065I;

    /* renamed from: J */
    RecyclingImageView f55066J;

    /* renamed from: K */
    View f55067K;

    /* renamed from: L */
    RecyclingImageView f55068L;

    /* renamed from: M */
    Animation f55069M;

    /* renamed from: N */
    ModulesView f55070N;

    /* renamed from: O */
    C26599l f55071O;

    /* renamed from: P */
    int f55072P;

    /* renamed from: Q */
    boolean f55073Q;

    /* renamed from: R */
    Animator f55074R;

    /* renamed from: p */
    int f55075p;

    /* renamed from: q */
    C23528a f55076q;

    /* renamed from: r */
    StoryBarBtnAdd f55077r;

    /* renamed from: s */
    AbstractC7220t8 f55078s;

    /* renamed from: t */
    boolean f55079t;

    /* renamed from: u */
    C32207za f55080u;

    /* renamed from: v */
    AbstractC22055v0.m f55081v;

    /* renamed from: w */
    MediaItem f55082w;

    /* renamed from: x */
    Handler f55083x;

    /* renamed from: y */
    public View f55084y;

    /* renamed from: z */
    RecyclingImageView f55085z;

    /* renamed from: com.zing.zalo.story.component.StoryBarBtnAdd$a */
    /* loaded from: classes5.dex */
    class HandlerC10909a extends Handler {
        HandlerC10909a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                StoryBarBtnAdd storyBarBtnAdd = StoryBarBtnAdd.this;
                MediaItem mediaItem = storyBarBtnAdd.f55082w;
                if (mediaItem != null && storyBarBtnAdd.f55080u != null) {
                    storyBarBtnAdd.f55081v.m115171d(mediaItem.m41093B());
                }
                C32207za c32207za = StoryBarBtnAdd.this.f55080u;
                if (c32207za != null) {
                    c32207za.m155314i();
                }
                StoryBarBtnAdd storyBarBtnAdd2 = StoryBarBtnAdd.this;
                storyBarBtnAdd2.f55082w = null;
                storyBarBtnAdd2.m56579q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.story.component.StoryBarBtnAdd$b */
    /* loaded from: classes5.dex */
    public class C10910b extends AnimatorListenerAdapter {
        C10910b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            StoryBarBtnAdd storyBarBtnAdd = StoryBarBtnAdd.this;
            int i11 = storyBarBtnAdd.f55072P + 1;
            storyBarBtnAdd.f55072P = i11;
            int[] iArr = StoryBarBtnAdd.f55056S;
            int length = i11 % iArr.length;
            storyBarBtnAdd.f55072P = length;
            ImageView imageView = storyBarBtnAdd.f55057A;
            if (imageView != null) {
                imageView.setImageResource(iArr[length]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.story.component.StoryBarBtnAdd$c */
    /* loaded from: classes5.dex */
    public class C10911c extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f55088p = false;

        C10911c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f55088p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (!this.f55088p) {
                    Animator animator2 = StoryBarBtnAdd.this.f55074R;
                    if (animator2 != null) {
                        animator2.start();
                    }
                } else {
                    ImageView imageView = StoryBarBtnAdd.this.f55057A;
                    if (imageView != null) {
                        AbstractC1579n0.m7845W0(imageView, 1.0f);
                        AbstractC1579n0.m7847X0(StoryBarBtnAdd.this.f55057A, 1.0f);
                        StoryBarBtnAdd storyBarBtnAdd = StoryBarBtnAdd.this;
                        storyBarBtnAdd.f55072P = 0;
                        storyBarBtnAdd.f55057A.setImageResource(StoryBarBtnAdd.f55056S[0]);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.story.component.StoryBarBtnAdd$d */
    /* loaded from: classes5.dex */
    public class C10912d extends C23999j {
        C10912d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18849m()) {
                AbstractC23136l9.m118744r1(StoryBarBtnAdd.this.f55057A, 8);
            } else {
                AbstractC23136l9.m118744r1(StoryBarBtnAdd.this.f55057A, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.story.component.StoryBarBtnAdd$e */
    /* loaded from: classes5.dex */
    public class ViewTreeObserverOnPreDrawListenerC10913e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ AbstractC7220t8 f55091p;

        ViewTreeObserverOnPreDrawListenerC10913e(AbstractC7220t8 abstractC7220t8) {
            this.f55091p = abstractC7220t8;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            AbstractC7220t8 abstractC7220t8;
            try {
                StoryBarBtnAdd.this.f55077r.getViewTreeObserver().removeOnPreDrawListener(this);
                if (StoryBarBtnAdd.this.f55077r.isShown() && (abstractC7220t8 = this.f55091p) != null) {
                    abstractC7220t8.mo36736d();
                    return false;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    public StoryBarBtnAdd(Context context) {
        super(context);
        this.f55083x = new HandlerC10909a(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m56569f(AbstractC22055v0.l lVar, View view) {
        m56574i(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m56570g(AbstractC22055v0.l lVar, C16719g c16719g) {
        m56574i(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m56571h(View view) {
        MediaItem mediaItem;
        AbstractC7220t8 abstractC7220t8 = this.f55078s;
        if (abstractC7220t8 != null && (mediaItem = this.f55082w) != null) {
            abstractC7220t8.mo36735c(mediaItem);
        }
        this.f55083x.removeMessages(0);
        this.f55083x.sendEmptyMessageDelayed(0, 500L);
    }

    /* renamed from: d */
    public void m56572d(AbstractC7220t8 abstractC7220t8, final AbstractC22055v0.l lVar, boolean z11) {
        try {
            this.f55078s = abstractC7220t8;
            this.f55079t = z11;
            m56579q();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: n30.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryBarBtnAdd.this.m56569f(lVar, view);
                }
            };
            int i11 = this.f55075p;
            if (i11 != 1 && i11 != 0) {
                if (i11 == 2) {
                    if (this.f55079t) {
                        C22013a0.a aVar = C22013a0.m114924c().f108394j;
                        if (aVar != null) {
                            if (this.f55061E != null) {
                                if (!TextUtils.isEmpty(aVar.f108400a)) {
                                    ((C23528a) this.f55076q.m123612r(this.f55061E)).m123618x(aVar.f108400a, C23278z2.m120097T0());
                                } else {
                                    this.f55061E.setImageResource(AbstractC16803z.graphic_fake_story);
                                }
                            }
                            RobotoTextView robotoTextView = this.f55062F;
                            if (robotoTextView != null) {
                                robotoTextView.setText(aVar.f108402c);
                            }
                            RobotoTextView robotoTextView2 = this.f55063G;
                            if (robotoTextView2 != null) {
                                robotoTextView2.setText(aVar.f108403d);
                            }
                            RobotoTextView robotoTextView3 = this.f55064H;
                            if (robotoTextView3 != null) {
                                robotoTextView3.setText(aVar.f108401b);
                            }
                            setOnClickListener(onClickListener);
                            return;
                        }
                        return;
                    }
                    C26596i c26596i = this.f55060D;
                    if (c26596i != null) {
                        c26596i.m136546B1();
                    }
                    C26596i c26596i2 = this.f55060D;
                    if (c26596i2 != null) {
                        c26596i2.mo89109M0(new C16719g.c() { // from class: n30.c
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                StoryBarBtnAdd.this.m56570g(lVar, c16719g);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            setOnClickListener(onClickListener);
            if (this.f55079t) {
                C22013a0.a aVar2 = C22013a0.m114924c().f108394j;
                if (aVar2 != null) {
                    RobotoTextView robotoTextView4 = this.f55058B;
                    if (robotoTextView4 != null) {
                        robotoTextView4.setText(aVar2.f108401b);
                    }
                    RobotoTextView robotoTextView5 = this.f55062F;
                    if (robotoTextView5 != null) {
                        robotoTextView5.setText(aVar2.f108402c);
                    }
                    RobotoTextView robotoTextView6 = this.f55063G;
                    if (robotoTextView6 != null) {
                        robotoTextView6.setText(aVar2.f108403d);
                    }
                }
            } else {
                RobotoTextView robotoTextView7 = this.f55058B;
                if (robotoTextView7 != null) {
                    robotoTextView7.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_story_add));
                }
            }
            m56576k();
            m56575j(abstractC7220t8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:            r6.inflate(com.zing.zalo.AbstractC7409c0.story_bar_item_empty_section_content, r4);        r4.f55062F = (com.zing.zalo.p077ui.widget.RobotoTextView) findViewById(com.zing.zalo.AbstractC6918a0.story_bar_empty_section_title);        r4.f55063G = (com.zing.zalo.p077ui.widget.RobotoTextView) findViewById(com.zing.zalo.AbstractC6918a0.story_bar_empty_section_description);        r5 = findViewById(com.zing.zalo.AbstractC6918a0.story_bar_btn_add_layout);        r4.f55065I = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:            if (r5 == null) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:            r5.setBackgroundColor(0);     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m56573e(Context context, int i11, boolean z11) {
        this.f55075p = i11;
        this.f55076q = new C23528a(context);
        this.f55077r = this;
        if (z11) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            setGravity(17);
            setPadding(AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(12.0f), 0);
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            setGravity(17);
        }
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            int i12 = this.f55075p;
            if (i12 != 1 && i12 != 0) {
                if (i12 == 2) {
                    if (z11) {
                        layoutInflater.inflate(AbstractC7409c0.story_bar_item_empty_section_content_large, this);
                        this.f55061E = (RecyclingImageView) findViewById(AbstractC6918a0.story_bar_empty_section_thumb);
                        this.f55062F = (RobotoTextView) findViewById(AbstractC6918a0.story_bar_empty_section_title);
                        this.f55063G = (RobotoTextView) findViewById(AbstractC6918a0.story_bar_empty_section_description);
                        this.f55064H = (RobotoTextView) findViewById(AbstractC6918a0.story_bar_empty_section_action);
                        return;
                    }
                    layoutInflater.inflate(AbstractC7409c0.story_bar_btn_add_content_large, this);
                    this.f55059C = (ModulesView) findViewById(AbstractC6918a0.story_bar_btn_add_module_view);
                    this.f55070N = (ModulesView) findViewById(AbstractC6918a0.story_suggestion_view);
                    C26596i c26596i = new C26596i(context);
                    this.f55060D = c26596i;
                    ModulesView modulesView = this.f55059C;
                    if (modulesView != null) {
                        modulesView.mo69681L(c26596i);
                        return;
                    }
                    return;
                }
                return;
            }
            layoutInflater.inflate(AbstractC7409c0.story_bar_btn_add_content, this);
            this.f55084y = findViewById(AbstractC6918a0.story_bar_item_avatar_group);
            this.f55085z = (RecyclingImageView) findViewById(AbstractC6918a0.ic_story_avatar);
            this.f55057A = (ImageView) findViewById(AbstractC6918a0.ic_story_add);
            this.f55058B = (RobotoTextView) findViewById(AbstractC6918a0.tv_story_name);
            this.f55066J = (RecyclingImageView) findViewById(AbstractC6918a0.img_story_promote_red_dot);
            m56578m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // l30.AbstractC22055v0.j
    public int getPopulatePosition() {
        return 0;
    }

    @Override // l30.AbstractC22055v0.j
    public C16719g getThumbModule() {
        return null;
    }

    @Override // l30.AbstractC22055v0.j
    public int getThumbRoundCorner() {
        RecyclingImageView recyclingImageView = this.f55085z;
        if (recyclingImageView instanceof StoryBarItemImageView) {
            return ((StoryBarItemImageView) recyclingImageView).getRoundCorner();
        }
        return 0;
    }

    @Override // l30.AbstractC22055v0.j
    public View getThumbView() {
        return this.f55085z;
    }

    /* renamed from: i */
    void m56574i(AbstractC22055v0.l lVar) {
        try {
            C28212v6 m141453i = AbstractC28025b8.m141453i("tip.timeline.createstory");
            if (m141453i != null && m141453i.f131580f) {
                m141453i.f131580f = false;
                m141453i.f131579e = false;
                AbstractC28025b8.m141437H(m141453i);
            }
            AbstractC23136l9.m118744r1(this.f55066J, 8);
            if (lVar != null) {
                lVar.mo48298a(this.f55077r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    void m56575j(AbstractC7220t8 abstractC7220t8) {
        String str;
        C28212v6 m141453i = AbstractC28025b8.m141453i("tip.timeline.createstory");
        if (m141453i != null && m141453i.m142167f()) {
            str = m141453i.f131585k;
        } else if (this.f55079t && C22013a0.m114924c().f108394j != null) {
            str = C22013a0.m114924c().f108394j.f108400a;
        } else {
            str = "";
        }
        int i11 = 0;
        if (!TextUtils.isEmpty(str)) {
            ((C23528a) this.f55076q.m123612r(this.f55085z)).m123579C(str, C23278z2.m120093R0(), new C10912d());
        } else {
            RecyclingImageView recyclingImageView = this.f55085z;
            if (recyclingImageView != null) {
                int i12 = this.f55075p;
                if (i12 == 1) {
                    recyclingImageView.setImageResource(AbstractC16803z.story_newstory_bg);
                } else if (i12 == 0) {
                    recyclingImageView.setImageResource(AbstractC16803z.icon_story_newstory_bg);
                }
            }
            AbstractC23136l9.m118744r1(this.f55057A, 0);
            ImageView imageView = this.f55057A;
            if (imageView != null) {
                imageView.setImageResource(f55056S[this.f55072P]);
            }
        }
        if (m141453i != null && m141453i.m142167f()) {
            RecyclingImageView recyclingImageView2 = this.f55066J;
            if (!m141453i.f131580f) {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(recyclingImageView2, i11);
            if (m141453i.f131579e && !TextUtils.isEmpty(m141453i.f131581g)) {
                getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC10913e(abstractC7220t8));
                return;
            }
            return;
        }
        AbstractC23136l9.m118744r1(this.f55066J, 8);
    }

    /* renamed from: k */
    public void m56576k() {
        C26596i c26596i;
        try {
            if (AbstractC22055v0.m115117G()) {
                ImageView imageView = this.f55057A;
                if (imageView != null) {
                    imageView.setImageResource(f55056S[this.f55072P]);
                    return;
                }
                return;
            }
            int i11 = this.f55075p;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2 && (c26596i = this.f55060D) != null) {
                    c26596i.m136547E1();
                    return;
                }
                return;
            }
            Animator animator = this.f55074R;
            if (animator != null && animator.isRunning()) {
                return;
            }
            ImageView imageView2 = this.f55057A;
            if (imageView2 != null) {
                AbstractC1579n0.m7845W0(imageView2, 1.0f);
                AbstractC1579n0.m7847X0(this.f55057A, 1.0f);
                this.f55057A.setImageResource(f55056S[this.f55072P]);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f55057A, "scaleX", 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f55057A, "scaleY", 1.0f, 0.0f);
            animatorSet.addListener(new C10910b());
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(350L);
            animatorSet.setStartDelay(1000L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f55057A, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f55057A, "scaleY", 0.0f, 1.0f));
            animatorSet2.setDuration(350L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(animatorSet).before(animatorSet2);
            animatorSet3.addListener(new C10911c());
            this.f55074R = animatorSet3;
            this.f55073Q = true;
            animatorSet3.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public void m56577l() {
        C26596i c26596i;
        try {
            int i11 = this.f55075p;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2 && (c26596i = this.f55060D) != null) {
                    c26596i.m136548F1();
                    return;
                }
                return;
            }
            this.f55073Q = false;
            Animator animator = this.f55074R;
            if (animator != null) {
                animator.cancel();
                this.f55074R = null;
            }
            ImageView imageView = this.f55057A;
            if (imageView != null) {
                AbstractC1579n0.m7845W0(imageView, 1.0f);
                AbstractC1579n0.m7847X0(this.f55057A, 1.0f);
                this.f55057A.setImageResource(f55056S[this.f55072P]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    void m56578m() {
        int i11;
        int i12;
        int i13;
        try {
            int i14 = this.f55075p;
            if (i14 == 1) {
                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_height);
                i13 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_item_circle_corner_radius);
            } else if (i14 == 0) {
                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width);
                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_height);
                i13 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_item_roundrect_corner_radius);
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            RecyclingImageView recyclingImageView = this.f55085z;
            if (recyclingImageView != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclingImageView.getLayoutParams();
                layoutParams.width = i11;
                layoutParams.height = i12;
                this.f55085z.setLayoutParams(layoutParams);
                RecyclingImageView recyclingImageView2 = this.f55085z;
                if (recyclingImageView2 instanceof RoundCornerImageView) {
                    ((RoundCornerImageView) recyclingImageView2).setRoundRadius(i13);
                    RecyclingImageView recyclingImageView3 = this.f55085z;
                    ((RoundCornerImageView) recyclingImageView3).setRoundCornerColor(C23212s8.m119607o(recyclingImageView3.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m56576k();
        C32207za m155306b = C32207za.m155306b();
        this.f55080u = m155306b;
        m155306b.m155315j(0);
        this.f55080u.m155317l(C22013a0.m114924c().f108399o);
        AbstractC22055v0.m mVar = new AbstractC22055v0.m();
        this.f55081v = mVar;
        this.f55080u.m155316k(mVar);
        this.f55080u.m155313h();
        if (this.f55080u.m155310c() == null) {
            this.f55080u.m155311f(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56577l();
        C32207za c32207za = this.f55080u;
        if (c32207za != null) {
            c32207za.m155319o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0211 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0010, B:8:0x001a, B:10:0x0022, B:12:0x0026, B:14:0x002c, B:15:0x0033, B:17:0x003d, B:19:0x0043, B:22:0x004f, B:24:0x0053, B:25:0x007d, B:30:0x0086, B:32:0x008a, B:34:0x0099, B:35:0x009c, B:37:0x00a2, B:38:0x00ad, B:40:0x00b8, B:41:0x00a9, B:42:0x0208, B:44:0x0211, B:45:0x0214, B:47:0x0218, B:48:0x021b, B:50:0x021f, B:55:0x00c9, B:57:0x00cd, B:59:0x00d1, B:61:0x00e4, B:63:0x00f6, B:65:0x00fa, B:66:0x0138, B:68:0x014d, B:70:0x0119, B:72:0x00da, B:73:0x0163, B:75:0x0169, B:76:0x016e, B:78:0x0172, B:80:0x017b, B:81:0x0186, B:82:0x0182, B:83:0x01a4, B:88:0x01af, B:90:0x01b3, B:92:0x01b9, B:93:0x01d0, B:94:0x01d5, B:96:0x01d9, B:97:0x01dd, B:99:0x01e1, B:101:0x01e7, B:102:0x01fe), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0218 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0010, B:8:0x001a, B:10:0x0022, B:12:0x0026, B:14:0x002c, B:15:0x0033, B:17:0x003d, B:19:0x0043, B:22:0x004f, B:24:0x0053, B:25:0x007d, B:30:0x0086, B:32:0x008a, B:34:0x0099, B:35:0x009c, B:37:0x00a2, B:38:0x00ad, B:40:0x00b8, B:41:0x00a9, B:42:0x0208, B:44:0x0211, B:45:0x0214, B:47:0x0218, B:48:0x021b, B:50:0x021f, B:55:0x00c9, B:57:0x00cd, B:59:0x00d1, B:61:0x00e4, B:63:0x00f6, B:65:0x00fa, B:66:0x0138, B:68:0x014d, B:70:0x0119, B:72:0x00da, B:73:0x0163, B:75:0x0169, B:76:0x016e, B:78:0x0172, B:80:0x017b, B:81:0x0186, B:82:0x0182, B:83:0x01a4, B:88:0x01af, B:90:0x01b3, B:92:0x01b9, B:93:0x01d0, B:94:0x01d5, B:96:0x01d9, B:97:0x01dd, B:99:0x01e1, B:101:0x01e7, B:102:0x01fe), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x021f A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0010, B:8:0x001a, B:10:0x0022, B:12:0x0026, B:14:0x002c, B:15:0x0033, B:17:0x003d, B:19:0x0043, B:22:0x004f, B:24:0x0053, B:25:0x007d, B:30:0x0086, B:32:0x008a, B:34:0x0099, B:35:0x009c, B:37:0x00a2, B:38:0x00ad, B:40:0x00b8, B:41:0x00a9, B:42:0x0208, B:44:0x0211, B:45:0x0214, B:47:0x0218, B:48:0x021b, B:50:0x021f, B:55:0x00c9, B:57:0x00cd, B:59:0x00d1, B:61:0x00e4, B:63:0x00f6, B:65:0x00fa, B:66:0x0138, B:68:0x014d, B:70:0x0119, B:72:0x00da, B:73:0x0163, B:75:0x0169, B:76:0x016e, B:78:0x0172, B:80:0x017b, B:81:0x0186, B:82:0x0182, B:83:0x01a4, B:88:0x01af, B:90:0x01b3, B:92:0x01b9, B:93:0x01d0, B:94:0x01d5, B:96:0x01d9, B:97:0x01dd, B:99:0x01e1, B:101:0x01e7, B:102:0x01fe), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m56579q() {
        View view;
        RecyclingImageView recyclingImageView;
        ModulesView modulesView;
        String mo41081Q;
        ViewStub viewStub;
        int i11;
        int i12;
        String mo41081Q2;
        long j11;
        try {
            MediaItem mediaItem = this.f55082w;
            this.f55082w = null;
            C32207za c32207za = this.f55080u;
            if (c32207za != null) {
                MediaItem m155310c = c32207za.m155310c();
                if (m155310c != null && !TextUtils.isEmpty(m155310c.mo41081Q())) {
                    this.f55082w = m155310c;
                }
                if (mediaItem == null && this.f55082w != null) {
                    C0884c c0884c = this.f55080u.f148586b;
                    if (c0884c != null) {
                        j11 = c0884c.m2728b();
                    } else {
                        j11 = 15000;
                    }
                    this.f55083x.removeMessages(0);
                    this.f55083x.sendEmptyMessageDelayed(0, j11);
                }
            }
            MediaItem mediaItem2 = this.f55082w;
            if (mediaItem2 != null && !TextUtils.isEmpty(mediaItem2.mo41081Q())) {
                if (this.f55069M == null) {
                    float m118742r = AbstractC23136l9.m118742r(2.0f);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -m118742r, m118742r);
                    this.f55069M = translateAnimation;
                    translateAnimation.setRepeatCount(-1);
                    this.f55069M.setRepeatMode(2);
                    this.f55069M.setDuration(500L);
                    this.f55069M.setInterpolator(new C26086a());
                }
                int i13 = this.f55075p;
                if (i13 != 0 && i13 != 1) {
                    if (i13 == 2) {
                        if (this.f55071O == null) {
                            C26599l c26599l = new C26599l(getContext());
                            this.f55071O = c26599l;
                            ModulesView modulesView2 = this.f55070N;
                            if (modulesView2 != null) {
                                modulesView2.mo69681L(c26599l);
                            }
                        }
                        MediaItem mediaItem3 = this.f55082w;
                        if (mediaItem3 instanceof VideoItem) {
                            mo41081Q2 = ((VideoItem) mediaItem3).m41212s1();
                        } else {
                            mo41081Q2 = mediaItem3.mo41081Q();
                        }
                        this.f55071O.m136552o1(mo41081Q2, this.f55076q);
                        ModulesView modulesView3 = this.f55070N;
                        if (modulesView3 != null) {
                            modulesView3.setVisibility(0);
                            this.f55070N.clearAnimation();
                            this.f55070N.startAnimation(this.f55069M);
                        }
                    }
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: n30.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            StoryBarBtnAdd.this.m56571h(view2);
                        }
                    };
                    view = this.f55067K;
                    if (view != null) {
                        view.setOnClickListener(onClickListener);
                    }
                    recyclingImageView = this.f55068L;
                    if (recyclingImageView != null) {
                        recyclingImageView.setOnClickListener(onClickListener);
                    }
                    modulesView = this.f55070N;
                    if (modulesView == null) {
                        modulesView.setOnClickListener(onClickListener);
                        return;
                    }
                    return;
                }
                if (this.f55067K == null) {
                    if (this.f55079t) {
                        viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_suggestion_empty_section);
                    } else {
                        viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_suggestion);
                    }
                    if (viewStub != null) {
                        View inflate = viewStub.inflate();
                        this.f55067K = inflate;
                        RecyclingImageView recyclingImageView2 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.imv_story_suggestion);
                        this.f55068L = recyclingImageView2;
                        if (recyclingImageView2 != null) {
                            int i14 = this.f55075p;
                            if (i14 == 1) {
                                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_height);
                            } else if (i14 == 0) {
                                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width);
                                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_height);
                            } else {
                                i11 = 0;
                                i12 = 0;
                            }
                            ViewGroup.LayoutParams layoutParams = this.f55068L.getLayoutParams();
                            layoutParams.width = i11;
                            layoutParams.height = i12;
                            this.f55068L.setLayoutParams(layoutParams);
                            RecyclingImageView recyclingImageView3 = this.f55068L;
                            if (recyclingImageView3 instanceof StoryPreviewView) {
                                ((StoryPreviewView) recyclingImageView3).setShape(AbstractC22055v0.m115153m());
                                ((StoryPreviewView) this.f55068L).setPadding(AbstractC22055v0.m115157q(this.f55075p));
                            }
                        }
                    }
                }
                RecyclingImageView recyclingImageView4 = this.f55068L;
                if (recyclingImageView4 instanceof StoryBarItemImageView) {
                    ((StoryBarItemImageView) recyclingImageView4).m75945C(false, false);
                }
                View view2 = this.f55067K;
                if (view2 != null) {
                    view2.setVisibility(0);
                    MediaItem mediaItem4 = this.f55082w;
                    if (mediaItem4 instanceof VideoItem) {
                        mo41081Q = ((VideoItem) mediaItem4).m41212s1();
                    } else {
                        mo41081Q = mediaItem4.mo41081Q();
                    }
                    ((C23528a) this.f55076q.m123612r(this.f55068L)).m123618x(mo41081Q, C23278z2.m120093R0());
                    this.f55067K.clearAnimation();
                    this.f55067K.startAnimation(this.f55069M);
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: n30.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        StoryBarBtnAdd.this.m56571h(view22);
                    }
                };
                view = this.f55067K;
                if (view != null) {
                }
                recyclingImageView = this.f55068L;
                if (recyclingImageView != null) {
                }
                modulesView = this.f55070N;
                if (modulesView == null) {
                }
            }
            int i15 = this.f55075p;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    ModulesView modulesView4 = this.f55070N;
                    if (modulesView4 != null) {
                        if (modulesView4.getAnimation() != null) {
                            this.f55070N.getAnimation().cancel();
                            this.f55070N.getAnimation().reset();
                            this.f55070N.clearAnimation();
                        }
                        this.f55070N.setVisibility(8);
                    }
                    C26599l c26599l2 = this.f55071O;
                    if (c26599l2 != null) {
                        c26599l2.m136553p1();
                    }
                }
                View.OnClickListener onClickListener22 = new View.OnClickListener() { // from class: n30.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        StoryBarBtnAdd.this.m56571h(view22);
                    }
                };
                view = this.f55067K;
                if (view != null) {
                }
                recyclingImageView = this.f55068L;
                if (recyclingImageView != null) {
                }
                modulesView = this.f55070N;
                if (modulesView == null) {
                }
            }
            View view3 = this.f55067K;
            if (view3 != null) {
                if (view3.getAnimation() != null) {
                    this.f55067K.getAnimation().cancel();
                    this.f55067K.getAnimation().reset();
                    this.f55067K.clearAnimation();
                }
                this.f55067K.setVisibility(8);
                this.f55068L.setImageBitmap(null);
            }
            View.OnClickListener onClickListener222 = new View.OnClickListener() { // from class: n30.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    StoryBarBtnAdd.this.m56571h(view22);
                }
            };
            view = this.f55067K;
            if (view != null) {
            }
            recyclingImageView = this.f55068L;
            if (recyclingImageView != null) {
            }
            modulesView = this.f55070N;
            if (modulesView == null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setVisibilityRedDot(boolean z11) {
        int i11;
        RecyclingImageView recyclingImageView = this.f55066J;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(recyclingImageView, i11);
    }

    public StoryBarBtnAdd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55083x = new HandlerC10909a(Looper.getMainLooper());
    }
}
