package com.zing.zalo.feed.components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bo.C3021p1;
import bo.C3031r1;
import bo.C3036s1;
import bo.C3040t1;
import bo.C3044u1;
import bo.C3052w1;
import bo.C3056x1;
import br.InterfaceC3116a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p133ek.AbstractC18458a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.AbstractC31969j1;

/* loaded from: classes4.dex */
public class SocialMemoryIntroPage extends BaseSocialMemoryPage {

    /* renamed from: B */
    RecyclingImageView f45130B;

    /* renamed from: C */
    View f45131C;

    /* renamed from: D */
    View f45132D;

    /* renamed from: E */
    C3977j f45133E;

    /* renamed from: F */
    C3977j f45134F;

    /* renamed from: G */
    View f45135G;

    /* renamed from: H */
    View f45136H;

    /* renamed from: I */
    RobotoTextView f45137I;

    /* renamed from: J */
    ValueAnimator f45138J;

    /* renamed from: K */
    ValueAnimator.AnimatorUpdateListener f45139K;

    /* renamed from: com.zing.zalo.feed.components.SocialMemoryIntroPage$a */
    /* loaded from: classes4.dex */
    public class C8220a extends C23999j {
        C8220a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (str != null && str.equals(SocialMemoryIntroPage.this.f45133E.getTag(AbstractC6918a0.tag_url_recycling_image_module))) {
                SocialMemoryIntroPage.this.f45133E.setImageInfo(c3979l, false);
                SocialMemoryIntroPage socialMemoryIntroPage = SocialMemoryIntroPage.this;
                InterfaceC3116a interfaceC3116a = socialMemoryIntroPage.f44136x;
                if (interfaceC3116a != null) {
                    interfaceC3116a.mo15737Tl(socialMemoryIntroPage.f44135w);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.SocialMemoryIntroPage$b */
    /* loaded from: classes4.dex */
    public class C8221b extends C23999j {
        C8221b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (str != null && str.equals(SocialMemoryIntroPage.this.f45134F.getTag(AbstractC6918a0.tag_url_recycling_image_module))) {
                SocialMemoryIntroPage.this.f45134F.setImageInfo(c3979l, false);
                SocialMemoryIntroPage socialMemoryIntroPage = SocialMemoryIntroPage.this;
                InterfaceC3116a interfaceC3116a = socialMemoryIntroPage.f44136x;
                if (interfaceC3116a != null) {
                    interfaceC3116a.mo15737Tl(socialMemoryIntroPage.f44135w);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.SocialMemoryIntroPage$c */
    /* loaded from: classes4.dex */
    public class C8222c implements ValueAnimator.AnimatorUpdateListener {
        C8222c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SocialMemoryIntroPage.this.f45136H.setRotation((int) (AbstractC23222t7.f112572m * floatValue));
            SocialMemoryIntroPage.this.f45136H.setTranslationX((int) (AbstractC23222t7.f112586t * floatValue));
            SocialMemoryIntroPage.this.f45135G.setTranslationX((int) (AbstractC23222t7.f112586t * floatValue));
        }
    }

    public SocialMemoryIntroPage(Context context) {
        super(context);
        this.f45139K = new C8222c();
    }

    /* renamed from: j */
    private void m44514j(C3040t1 c3040t1, C23528a c23528a) {
        if (c3040t1 != null && !TextUtils.isEmpty(c3040t1.f12248a) && !TextUtils.isEmpty(c3040t1.f12249b) && c23528a != null) {
            this.f45133E.setTag(AbstractC6918a0.tag_url_recycling_image_module, c3040t1.f12248a);
            ((C23528a) c23528a.m123612r(this.f45133E)).m123579C(c3040t1.f12248a, C23278z2.m120106Y(), new C8220a());
            this.f45134F.setTag(AbstractC6918a0.tag_url_recycling_image_module, c3040t1.f12249b);
            ((C23528a) c23528a.m123612r(this.f45134F)).m123579C(c3040t1.f12249b, C23278z2.m120106Y(), new C8221b());
        }
    }

    /* renamed from: k */
    private void m44515k(C3021p1 c3021p1, C23528a c23528a) {
        if (this.f45130B == null) {
            return;
        }
        if (c3021p1 != null && !TextUtils.isEmpty(c3021p1.f12070c) && c23528a != null) {
            ((C23528a) c23528a.m123612r(this.f45130B)).m123618x(c3021p1.f12070c, C23278z2.m120129h());
            this.f45130B.setVisibility(0);
        } else {
            this.f45130B.setVisibility(8);
        }
    }

    /* renamed from: l */
    private void m44516l() {
        int i11;
        RobotoTextView robotoTextView = this.f45137I;
        if (robotoTextView != null) {
            if (this.f44135w == 0) {
                i11 = AbstractC8020f0.str_social_memory_swipe_desc;
            } else {
                i11 = AbstractC8020f0.str_social_memory_swipe_continue_desc;
            }
            robotoTextView.setText(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: m */
    private void m44517m() {
        this.f45136H.setRotation(AbstractC23222t7.f112572m);
        this.f45136H.setTranslationX(AbstractC23222t7.f112586t);
        this.f45135G.setTranslationX(AbstractC23222t7.f112586t);
        if (this.f45138J == null) {
            this.f45138J = ValueAnimator.ofFloat(1.0f, -1.0f);
        }
        this.f45138J.setDuration(800L);
        this.f45138J.setRepeatCount(-1);
        this.f45138J.setRepeatMode(2);
        this.f45138J.removeAllUpdateListeners();
        this.f45138J.addUpdateListener(this.f45139K);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: c */
    public void mo43512c(C3056x1 c3056x1, C23528a c23528a) {
        C3052w1 c3052w1;
        C3040t1 c3040t1;
        super.mo43512c(c3056x1, c23528a);
        if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null) {
            m44515k(c3052w1.f12305d, c23528a);
            C3044u1 c3044u1 = c3052w1.f12304c;
            if (c3044u1 != null) {
                c3040t1 = c3044u1.f12273e;
            } else {
                c3040t1 = null;
            }
            m44514j(c3040t1, c23528a);
            m44516l();
        }
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: d */
    protected void mo43513d(C3031r1 c3031r1) {
        if (this.f44131s == null) {
            return;
        }
        int eventType = getEventType();
        if (eventType == 0) {
            Typeface m153697b = AbstractC31969j1.m153697b(getContext(), 0);
            if (m153697b != null) {
                this.f44131s.setTypeface(m153697b);
            }
            if (C13778s1.m76966g()) {
                this.f44131s.setTextSize(1, C13778s1.m76962c() * 24.0f);
                this.f44131s.setLineSpacing(C13778s1.m76962c() * 8.0f, 1.0f);
            } else {
                this.f44131s.setTextSize(1, 24.0f);
                this.f44131s.setLineSpacing(8.0f, 1.0f);
            }
        } else if (eventType == 1) {
            Typeface m153697b2 = AbstractC31969j1.m153697b(getContext(), 5);
            if (m153697b2 != null) {
                this.f44131s.setTypeface(m153697b2);
            }
            if (C13778s1.m76966g()) {
                this.f44131s.setTextSize(1, C13778s1.m76962c() * 36.0f);
                this.f44131s.setLineSpacing(C13778s1.m76962c() * 12.0f, 1.0f);
            } else {
                this.f44131s.setTextSize(1, 36.0f);
                this.f44131s.setLineSpacing(12.0f, 1.0f);
            }
        }
        if (c3031r1 != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f44131s.setText(c3031r1.f12216a);
            } else {
                this.f44131s.setText(c3031r1.f12217b);
            }
            this.f44131s.setVisibility(0);
            return;
        }
        this.f44131s.setText("");
        this.f44131s.setVisibility(8);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: e */
    protected void mo43514e(C3036s1 c3036s1) {
        if (this.f44130r == null) {
            return;
        }
        int eventType = getEventType();
        if (eventType == 0) {
            Typeface m153697b = AbstractC31969j1.m153697b(getContext(), 5);
            if (m153697b != null) {
                this.f44130r.setTypeface(m153697b);
            }
            if (C13778s1.m76966g()) {
                this.f44130r.setTextSize(1, C13778s1.m76962c() * 36.0f);
                this.f44130r.setLineSpacing(C13778s1.m76962c() * 12.0f, 1.0f);
            } else {
                this.f44130r.setTextSize(1, 36.0f);
                this.f44130r.setLineSpacing(12.0f, 1.0f);
            }
        } else if (eventType == 1) {
            Typeface m153697b2 = AbstractC31969j1.m153697b(getContext(), 0);
            if (m153697b2 != null) {
                this.f44130r.setTypeface(m153697b2);
            }
            if (C13778s1.m76966g()) {
                this.f44130r.setTextSize(1, C13778s1.m76962c() * 24.0f);
                this.f44130r.setLineSpacing(C13778s1.m76962c() * 8.0f, 1.0f);
            } else {
                this.f44130r.setTextSize(1, 24.0f);
                this.f44130r.setLineSpacing(8.0f, 1.0f);
            }
        }
        if (c3036s1 != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f44130r.setText(c3036s1.f12234a);
            } else {
                this.f44130r.setText(c3036s1.f12235b);
            }
            this.f44130r.setVisibility(0);
            return;
        }
        this.f44130r.setText("");
        this.f44130r.setVisibility(8);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: g */
    public void mo43516g() {
        super.mo43516g();
        this.f45130B = (RecyclingImageView) findViewById(AbstractC6918a0.img_icon);
        this.f45131C = findViewById(AbstractC6918a0.swipe_intro_view);
        this.f45132D = findViewById(AbstractC6918a0.content_view);
        this.f45133E = new C3977j(getContext());
        this.f45134F = new C3977j(getContext());
        this.f45135G = findViewById(AbstractC6918a0.img_arrow);
        this.f45136H = findViewById(AbstractC6918a0.img_hand);
        this.f45137I = (RobotoTextView) findViewById(AbstractC6918a0.txt_swipe_desc);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    protected int getBackgroundColorDefault() {
        InterfaceC3116a interfaceC3116a = this.f44136x;
        if (interfaceC3116a != null) {
            return interfaceC3116a.mo15739tx(this.f44135w + 1);
        }
        return SocialMemoryView.f46925H1;
    }

    public Bitmap getBottomDecorFrame() {
        C3040t1 c3040t1;
        String str;
        C3979l c3979l;
        C3977j c3977j;
        C3044u1 memoryDetailDecorInfo = getMemoryDetailDecorInfo();
        if (memoryDetailDecorInfo != null) {
            c3040t1 = memoryDetailDecorInfo.f12273e;
        } else {
            c3040t1 = null;
        }
        if (c3040t1 != null) {
            str = c3040t1.f12249b;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && (c3977j = this.f45134F) != null && str.equals(c3977j.getTag(AbstractC6918a0.tag_url_recycling_image_module))) {
            c3979l = this.f45134F.m18836a();
        } else {
            c3979l = null;
        }
        if (c3979l == null) {
            return null;
        }
        return c3979l.m18839c();
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    public View getContentView() {
        return this.f45132D;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    int getLayoutResource() {
        return AbstractC7409c0.social_memory_intro_page_view;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage, com.zing.zalo.feed.components.InterfaceC8411v6
    public int getOverlayColor() {
        C3044u1 memoryDetailDecorInfo = getMemoryDetailDecorInfo();
        if (memoryDetailDecorInfo != null) {
            return memoryDetailDecorInfo.f12272d;
        }
        return 0;
    }

    public Bitmap getTopDecorFrame() {
        C3040t1 c3040t1;
        String str;
        C3979l c3979l;
        C3977j c3977j;
        C3044u1 memoryDetailDecorInfo = getMemoryDetailDecorInfo();
        if (memoryDetailDecorInfo != null) {
            c3040t1 = memoryDetailDecorInfo.f12273e;
        } else {
            c3040t1 = null;
        }
        if (c3040t1 != null) {
            str = c3040t1.f12248a;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && (c3977j = this.f45133E) != null && str.equals(c3977j.getTag(AbstractC6918a0.tag_url_recycling_image_module))) {
            c3979l = this.f45133E.m18836a();
        } else {
            c3979l = null;
        }
        if (c3979l == null) {
            return null;
        }
        return c3979l.m18839c();
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: i */
    public void mo43517i() {
        super.mo43517i();
        m44517m();
        Typeface m153697b = AbstractC31969j1.m153697b(getContext(), 3);
        if (m153697b != null) {
            this.f45137I.setTypeface(m153697b);
        }
    }

    /* renamed from: n */
    public void m44518n() {
        ValueAnimator valueAnimator = this.f45138J;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f45138J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: p */
    public void m44519p() {
        ValueAnimator valueAnimator = this.f45138J;
        if (valueAnimator != null && valueAnimator.isPaused()) {
            this.f45138J.resume();
        } else {
            m44517m();
            this.f45138J.start();
        }
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    public void setupViewsByData(C3056x1 c3056x1) {
        super.setupViewsByData(c3056x1);
    }

    public SocialMemoryIntroPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45139K = new C8222c();
    }

    public SocialMemoryIntroPage(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f45139K = new C8222c();
    }
}
