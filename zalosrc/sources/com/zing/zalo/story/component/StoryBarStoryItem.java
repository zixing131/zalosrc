package com.zing.zalo.story.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StoryBarItemImageView;
import com.zing.zalo.p077ui.widget.StoryPreviewView;
import com.zing.zalo.story.component.StoryBarStoryItem;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22052u;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p716zh.C31980jc;
import t80.C26598k;

/* loaded from: classes5.dex */
public class StoryBarStoryItem extends RelativeLayout implements AbstractC22055v0.n {

    /* renamed from: z */
    public static final float f55105z;

    /* renamed from: p */
    int f55106p;

    /* renamed from: q */
    C23528a f55107q;

    /* renamed from: r */
    RecyclingImageView f55108r;

    /* renamed from: s */
    ImageView f55109s;

    /* renamed from: t */
    RobotoTextView f55110t;

    /* renamed from: u */
    ModulesView f55111u;

    /* renamed from: v */
    C26598k f55112v;

    /* renamed from: w */
    C31980jc f55113w;

    /* renamed from: x */
    String f55114x;

    /* renamed from: y */
    Animator f55115y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.story.component.StoryBarStoryItem$a */
    /* loaded from: classes5.dex */
    public class C10914a extends AnimatorListenerAdapter {
        C10914a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                Animator animator2 = StoryBarStoryItem.this.f55115y;
                if (animator2 != null && animator2.equals(animator)) {
                    StoryBarStoryItem storyBarStoryItem = StoryBarStoryItem.this;
                    storyBarStoryItem.f55115y = null;
                    C22052u.f108594e = false;
                    storyBarStoryItem.f55114x = "";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                Animator animator2 = StoryBarStoryItem.this.f55115y;
                if (animator2 != null && animator2.equals(animator)) {
                    StoryBarStoryItem storyBarStoryItem = StoryBarStoryItem.this;
                    storyBarStoryItem.f55115y = null;
                    C22052u.f108594e = false;
                    storyBarStoryItem.f55114x = "";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        float f11;
        if (AbstractC22055v0.m115153m() == 1) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        f55105z = f11;
    }

    public StoryBarStoryItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m56589e(AbstractC22055v0.l lVar, C31980jc c31980jc, View view) {
        int i11;
        C22052u.f108594e = false;
        if (lVar != null) {
            if (C22013a0.m114923b() == 1) {
                i11 = 360;
            } else {
                i11 = 334;
            }
            lVar.mo47172c(c31980jc, this, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m56590f(AbstractC22055v0.l lVar, C31980jc c31980jc, C16719g c16719g) {
        int i11;
        C22052u.f108594e = false;
        if (lVar != null) {
            if (C22013a0.m114923b() == 1) {
                i11 = 360;
            } else {
                i11 = 334;
            }
            lVar.mo47172c(c31980jc, this, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:            r0 = com.zing.zalocore.CoreUtility.f89233i.equals(r7.f147023p);        r2 = r6.f55110t;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:            if (r2 == null) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:            if (r0 == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:            r2.setText(me0.AbstractC23136l9.m118743r0(com.zing.zalo.AbstractC8020f0.str_my_stories));     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:            if (android.text.TextUtils.isEmpty(r7.f147024q) != false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:            r6.f55110t.setText(p304ks.AbstractC21935u.m114542i(r7.f147023p, r7.f147024q));     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:            r6.f55110t.setText("");     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:            me0.AbstractC23124k8.m118621k(r8, r7, getContext(), r6.f55107q, r6.f55108r);        r8 = r7.m153829v();        ((com.zing.zalo.p077ui.widget.StoryBarItemImageView) r6.f55108r).setHasSeenAll(r8);        ((com.zing.zalo.p077ui.widget.StoryBarItemImageView) r6.f55108r).m75945C(r7.f147033z, false);        r5 = 1.0f;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:            if (r7.f147033z == false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:            me0.AbstractC23136l9.m118744r1(r6.f55109s, 8);        r0 = r6.f55108r;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:            if (r8 == false) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:            r5 = com.zing.zalo.story.component.StoryBarStoryItem.f55105z;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:            r0.setAlpha(r5);        r6.f55110t.setEnabled(true);        r6.f55110t.setTextStyleBold(!r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0137, code lost:            r8 = new n30.ViewOnClickListenerC23534e(r6, r9, r7);        setOnClickListener(r8);        r7 = r6.f55108r;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0141, code lost:            if (r7 == null) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0143, code lost:            r7.setOnClickListener(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:            if (r0 == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:            if (l30.C22052u.f108594e == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:            if (r8 == false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:            if (r0 != false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:            r6.f55110t.setEnabled(true);        r6.f55108r.setAlpha(com.zing.zalo.story.component.StoryBarStoryItem.f55105z);        r6.f55110t.setTextStyleBold(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:            if (r7.f147023p.equals(com.zing.zalocore.CoreUtility.f89233i) == false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:            if (l30.C22052u.m115085y().m115105z() == false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:            r6.f55108r.setAlpha(com.zing.zalo.story.component.StoryBarStoryItem.f55105z);        me0.AbstractC23136l9.m118744r1(r6.f55109s, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:            r0 = r6.f55108r;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:            if (r8 == false) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:            r5 = com.zing.zalo.story.component.StoryBarStoryItem.f55105z;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:            r0.setAlpha(r5);        me0.AbstractC23136l9.m118744r1(r6.f55109s, 8);     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:            if (r0 == false) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c4, code lost:            if (android.text.TextUtils.isEmpty(r6.f55114x) == false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:            r0 = ((com.zing.zalo.p077ui.widget.StoryBarItemImageView) r6.f55108r).getAnim();        r0.addListener(new com.zing.zalo.story.component.StoryBarStoryItem.C10914a(r6));        r6.f55115y = r0;        r6.f55114x = r7.f147023p;        r0.start();     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:            r6.f55110t.setTextStyleBold(true);        r6.f55108r.setAlpha(1.0f);     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:            if (r6.f55114x.equals(r7.f147023p) != false) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:            r0 = r6.f55115y;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:            if (r0 == null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:            r0.cancel();        r6.f55115y = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:            ((com.zing.zalo.p077ui.widget.StoryBarItemImageView) r6.f55108r).setAnimProgress(100);     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:            r0 = false;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m56591c(final C31980jc c31980jc, C31980jc c31980jc2, final AbstractC22055v0.l lVar) {
        C26598k c26598k;
        try {
            this.f55113w = c31980jc;
            int i11 = this.f55106p;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2 && (c26598k = this.f55112v) != null) {
                    c26598k.m136551z1(c31980jc, c31980jc2);
                    this.f55112v.mo89109M0(new C16719g.c() { // from class: n30.f
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            StoryBarStoryItem.this.m56590f(lVar, c31980jc, c16719g);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m56592d(Context context, int i11) {
        this.f55106p = i11;
        this.f55107q = new C23528a(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        int i12 = this.f55106p;
        if (i12 == 0 || i12 == 1) {
            layoutParams.width = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_avatar_width);
        }
        setLayoutParams(layoutParams);
        setGravity(17);
        setMinimumWidth(AbstractC23136l9.m118655I(AbstractC16802y.story_bar_avatar_width));
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            int i13 = this.f55106p;
            if (i13 != 1 && i13 != 0) {
                if (i13 == 2) {
                    layoutInflater.inflate(AbstractC7409c0.story_bar_item_content_large, this);
                    this.f55111u = (ModulesView) findViewById(AbstractC6918a0.story_bar_story_item_module_view);
                    C26598k c26598k = new C26598k(context);
                    this.f55112v = c26598k;
                    ModulesView modulesView = this.f55111u;
                    if (modulesView != null) {
                        modulesView.mo69681L(c26598k);
                    }
                }
            }
            layoutInflater.inflate(AbstractC7409c0.story_bar_item_content, this);
            this.f55108r = (RecyclingImageView) findViewById(AbstractC6918a0.ic_story_avatar);
            this.f55109s = (ImageView) findViewById(AbstractC6918a0.ic_story_sent_fail);
            this.f55110t = (RobotoTextView) findViewById(AbstractC6918a0.tv_story_name);
            m56593g();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    void m56593g() {
        int i11;
        int i12;
        try {
            int i13 = this.f55106p;
            if (i13 == 1) {
                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_height);
            } else if (i13 == 0) {
                i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width);
                i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_height);
            } else {
                i11 = 0;
                i12 = 0;
            }
            RecyclingImageView recyclingImageView = this.f55108r;
            if (recyclingImageView != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclingImageView.getLayoutParams();
                layoutParams.width = i11;
                layoutParams.height = i12;
                this.f55108r.setLayoutParams(layoutParams);
                RecyclingImageView recyclingImageView2 = this.f55108r;
                if (recyclingImageView2 instanceof StoryPreviewView) {
                    ((StoryPreviewView) recyclingImageView2).setShape(this.f55106p);
                    ((StoryPreviewView) this.f55108r).setPadding(AbstractC22055v0.m115157q(this.f55106p));
                }
            }
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
        C26598k c26598k = this.f55112v;
        if (c26598k != null) {
            return c26598k.m136550A1();
        }
        return null;
    }

    @Override // l30.AbstractC22055v0.j
    public int getThumbRoundCorner() {
        int i11 = this.f55106p;
        if (i11 != 0 && i11 != 1) {
            return AbstractC23136l9.m118655I(AbstractC16802y.story_bar_item_large_roundrect_corner_radius);
        }
        RecyclingImageView recyclingImageView = this.f55108r;
        if (recyclingImageView instanceof StoryBarItemImageView) {
            return ((StoryBarItemImageView) recyclingImageView).getRoundCorner();
        }
        return 0;
    }

    @Override // l30.AbstractC22055v0.j
    public View getThumbView() {
        return this.f55108r;
    }

    public C31980jc getUserStory() {
        return this.f55113w;
    }

    @Override // l30.AbstractC22055v0.n
    /* renamed from: p */
    public void mo17230p(C31980jc c31980jc, C23528a c23528a) {
    }

    public StoryBarStoryItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
