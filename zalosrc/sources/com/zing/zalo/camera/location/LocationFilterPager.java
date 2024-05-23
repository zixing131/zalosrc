package com.zing.zalo.camera.location;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import bf.AbstractC2790b;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.camera.location.LocationFilterPager;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p500s1.C26087b;

/* loaded from: classes3.dex */
public class LocationFilterPager extends FrameLayout implements View.OnClickListener {

    /* renamed from: A */
    final int f41331A;

    /* renamed from: B */
    final int f41332B;

    /* renamed from: C */
    int f41333C;

    /* renamed from: p */
    View f41334p;

    /* renamed from: q */
    ActiveImageButton f41335q;

    /* renamed from: r */
    RecyclingImageView f41336r;

    /* renamed from: s */
    ViewPager f41337s;

    /* renamed from: t */
    LocationFilterSlidingTabLayout f41338t;

    /* renamed from: u */
    RobotoTextView f41339u;

    /* renamed from: v */
    C7673c f41340v;

    /* renamed from: w */
    InterfaceC7674d f41341w;

    /* renamed from: x */
    AbstractC2790b f41342x;

    /* renamed from: y */
    WeakReference f41343y;

    /* renamed from: z */
    List f41344z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.location.LocationFilterPager$a */
    /* loaded from: classes3.dex */
    public class C7671a extends ViewPager.C6879n {
        C7671a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            InterfaceC7674d interfaceC7674d = LocationFilterPager.this.f41341w;
            if (interfaceC7674d != null) {
                interfaceC7674d.mo38309j("121N061");
                LocationFilterPager.this.f41341w.mo38310k("location_swipe_right");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.location.LocationFilterPager$b */
    /* loaded from: classes3.dex */
    public class C7672b implements SlidingTabLayout.InterfaceC13531d {
        C7672b() {
        }

        @Override // com.zing.zalo.p077ui.widget.SlidingTabLayout.InterfaceC13531d
        /* renamed from: a */
        public int mo39372a(int i11) {
            if (i11 == LocationFilterPager.this.f41337s.getCurrentItem()) {
                return LocationFilterPager.this.f41331A;
            }
            return LocationFilterPager.this.f41332B;
        }

        @Override // com.zing.zalo.p077ui.widget.SlidingTabLayout.InterfaceC13531d
        /* renamed from: b */
        public int mo39373b(int i11) {
            return 0;
        }
    }

    /* renamed from: com.zing.zalo.camera.location.LocationFilterPager$c */
    /* loaded from: classes3.dex */
    public class C7673c extends AbstractC6881a {
        public C7673c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m39377z(AbstractC2790b abstractC2790b, View view) {
            LocationFilterPager locationFilterPager = LocationFilterPager.this;
            locationFilterPager.f41342x = abstractC2790b;
            InterfaceC7674d interfaceC7674d = locationFilterPager.f41341w;
            if (interfaceC7674d != null) {
                interfaceC7674d.mo38313n(abstractC2790b);
                LocationFilterPager.this.f41341w.mo38309j("121N062");
            }
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: d */
        public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: g */
        public int mo35335g() {
            List list = LocationFilterPager.this.f41344z;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: h */
        public int mo35336h(Object obj) {
            return -2;
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: k */
        public Object mo35339k(ViewGroup viewGroup, int i11) {
            ViewGroup viewGroup2;
            int i12;
            int i13;
            final ProgressBar progressBar;
            final AbstractC2790b abstractC2790b;
            boolean z11;
            float f11;
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.camera_location_filter_page_item, viewGroup, false);
            viewGroup.addView(frameLayout);
            try {
                View view = (View) LocationFilterPager.this.getParent();
                int width = view.getWidth();
                int height = view.getHeight();
                int width2 = viewGroup.getWidth();
                int height2 = viewGroup.getHeight();
                viewGroup2 = (FrameLayout) frameLayout.findViewById(AbstractC6918a0.location_filter_page_content);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
                if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                    float f12 = (width * 1.0f) / height;
                    if (LocationFilterPager.this.f41343y.get() != null) {
                        if (((ImageDecorView) LocationFilterPager.this.f41343y.get()).m39773c0()) {
                            if (f12 <= 1.0f) {
                                height2 = (int) (width2 * f12);
                            }
                        } else if (f12 > 1.0f) {
                            f11 = height2 / f12;
                            width2 = (int) f11;
                        }
                        f11 = height2 * f12;
                        width2 = (int) f11;
                    }
                    layoutParams.width = width2;
                    layoutParams.height = height2;
                }
                i12 = width2;
                i13 = height2;
                viewGroup2.setLayoutParams(layoutParams);
                progressBar = (ProgressBar) frameLayout.findViewById(AbstractC6918a0.location_filter_page_progress);
                abstractC2790b = (AbstractC2790b) LocationFilterPager.this.f41344z.get(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (LocationFilterPager.this.f41343y.get() != null && !((ImageDecorView) LocationFilterPager.this.f41343y.get()).m39773c0()) {
                z11 = false;
                new RecyclingImageView(viewGroup.getContext()).setScaleType(ImageView.ScaleType.CENTER_CROP);
                AbstractC23136l9.m118744r1(progressBar, 0);
                abstractC2790b.mo13436j(viewGroup2, i12, i13, z11, new AbstractC2790b.a() { // from class: ze.a
                    @Override // bf.AbstractC2790b.a
                    /* renamed from: a */
                    public final void mo13450a() {
                        AbstractC23136l9.m118744r1(progressBar, 8);
                    }
                });
                viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: ze.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        LocationFilterPager.C7673c.this.m39377z(abstractC2790b, view2);
                    }
                });
                return frameLayout;
            }
            z11 = true;
            new RecyclingImageView(viewGroup.getContext()).setScaleType(ImageView.ScaleType.CENTER_CROP);
            AbstractC23136l9.m118744r1(progressBar, 0);
            abstractC2790b.mo13436j(viewGroup2, i12, i13, z11, new AbstractC2790b.a() { // from class: ze.a
                @Override // bf.AbstractC2790b.a
                /* renamed from: a */
                public final void mo13450a() {
                    AbstractC23136l9.m118744r1(progressBar, 8);
                }
            });
            viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: ze.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LocationFilterPager.C7673c.this.m39377z(abstractC2790b, view2);
                }
            });
            return frameLayout;
        }

        @Override // com.zing.p058v4.view.AbstractC6881a
        /* renamed from: l */
        public boolean mo35340l(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.zing.zalo.camera.location.LocationFilterPager$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7674d {
        /* renamed from: j */
        void mo38309j(String str);

        /* renamed from: k */
        void mo38310k(String str);

        /* renamed from: l */
        void mo38311l();

        /* renamed from: m */
        void mo38312m();

        /* renamed from: n */
        void mo38313n(AbstractC2790b abstractC2790b);
    }

    public LocationFilterPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41344z = new ArrayList();
        this.f41333C = -1;
        this.f41331A = AbstractC23136l9.m118641B(context, AbstractC16801x.location_sliding_tab_layout_selected_indicator);
        this.f41332B = AbstractC23136l9.m118641B(context, AbstractC16801x.location_sliding_tab_layout_unselected_indicator);
    }

    /* renamed from: a */
    private void m39368a() {
        this.f41334p = findViewById(AbstractC6918a0.location_filter_top_panel);
        ActiveImageButton activeImageButton = (ActiveImageButton) findViewById(AbstractC6918a0.btn_location_filter_back);
        this.f41335q = activeImageButton;
        activeImageButton.setOnClickListener(this);
        RecyclingImageView recyclingImageView = (RecyclingImageView) findViewById(AbstractC6918a0.btn_location_filter_select);
        this.f41336r = recyclingImageView;
        recyclingImageView.setOnClickListener(this);
        this.f41340v = new C7673c();
        ViewPager viewPager = (ViewPager) findViewById(AbstractC6918a0.location_filter_view_pager);
        this.f41337s = viewPager;
        viewPager.setAdapter(this.f41340v);
        this.f41337s.setOffscreenPageLimit(1);
        this.f41337s.addOnPageChangeListener(new C7671a());
        LocationFilterSlidingTabLayout locationFilterSlidingTabLayout = (LocationFilterSlidingTabLayout) findViewById(AbstractC6918a0.location_filter_sliding_tabs);
        this.f41338t = locationFilterSlidingTabLayout;
        locationFilterSlidingTabLayout.setViewPager(this.f41337s);
        this.f41338t.setSelectedIndicatorColors(this.f41331A);
        this.f41338t.setEnableDivider(true);
        this.f41338t.setDividerColors(0);
        this.f41338t.setCustomTabColorizer(new C7672b());
        RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.btn_location_filter_cancel);
        this.f41339u = robotoTextView;
        robotoTextView.setOnClickListener(this);
    }

    /* renamed from: c */
    private void m39369c() {
        InterfaceC7674d interfaceC7674d = this.f41341w;
        if (interfaceC7674d != null) {
            interfaceC7674d.mo38312m();
            this.f41341w.mo38310k("location_back");
        }
    }

    /* renamed from: b */
    public void m39370b() {
        this.f41340v.mo35341m();
        this.f41338t.m75891d();
    }

    /* renamed from: d */
    public void m39371d(int i11) {
        this.f41333C = i11;
    }

    public Animator getCloseAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41339u, "translationY", AbstractC23222t7.f112539R), ObjectAnimator.ofFloat(this.f41339u, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f41334p, "translationY", -AbstractC23222t7.f112539R), ObjectAnimator.ofFloat(this.f41334p, "alpha", 0.0f));
        long j11 = 250;
        animatorSet2.setDuration(j11);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f41338t, "translationY", r14.getHeight()), ObjectAnimator.ofFloat(this.f41338t, "alpha", 0.0f));
        animatorSet3.setDuration(j11);
        animatorSet3.setStartDelay(20L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f41337s, "scaleX", 1.1f), ObjectAnimator.ofFloat(this.f41337s, "scaleY", 1.1f), ObjectAnimator.ofFloat(this.f41337s, "alpha", 0.0f));
        animatorSet4.setDuration(j11);
        animatorSet4.setStartDelay(40L);
        animatorSet.playTogether(animatorSet2, animatorSet3, animatorSet4);
        animatorSet.setInterpolator(new C26087b());
        return animatorSet;
    }

    public AbstractC2790b getLocationFilter() {
        return this.f41342x;
    }

    public Animator getOpenAnim() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41337s, "scaleX", 1.1f, 1.0f), ObjectAnimator.ofFloat(this.f41337s, "scaleY", 1.1f, 1.0f), ObjectAnimator.ofFloat(this.f41337s, "alpha", 0.0f, 1.0f));
        long j11 = 250;
        animatorSet2.setDuration(j11);
        this.f41338t.setTranslationY(r9.getHeight());
        this.f41338t.setAlpha(0.0f);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f41338t, "translationY", 0.0f), ObjectAnimator.ofFloat(this.f41338t, "alpha", 1.0f));
        animatorSet3.setDuration(j11);
        animatorSet3.setStartDelay(20L);
        this.f41339u.setTranslationY(AbstractC23222t7.f112539R);
        this.f41339u.setAlpha(0.0f);
        this.f41334p.setTranslationY(-AbstractC23222t7.f112539R);
        this.f41334p.setAlpha(0.0f);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f41339u, "translationY", 0.0f), ObjectAnimator.ofFloat(this.f41339u, "alpha", 1.0f), ObjectAnimator.ofFloat(this.f41334p, "translationY", 0.0f), ObjectAnimator.ofFloat(this.f41334p, "alpha", 1.0f));
        animatorSet4.setDuration(j11);
        animatorSet4.setStartDelay(40L);
        animatorSet.playTogether(animatorSet2, animatorSet3, animatorSet4);
        animatorSet.setInterpolator(new C26087b());
        return animatorSet;
    }

    public View getTopPanel() {
        return this.f41334p;
    }

    public ViewPager getViewPager() {
        return this.f41337s;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_location_filter_back) {
            m39369c();
            return;
        }
        if (id2 == AbstractC6918a0.btn_location_filter_select) {
            try {
                if (this.f41341w != null) {
                    AbstractC2790b abstractC2790b = (AbstractC2790b) this.f41344z.get(this.f41337s.getCurrentItem());
                    this.f41342x = abstractC2790b;
                    this.f41341w.mo38313n(abstractC2790b);
                    this.f41341w.mo38309j("121N064");
                    return;
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.btn_location_filter_cancel) {
            this.f41342x = null;
            InterfaceC7674d interfaceC7674d = this.f41341w;
            if (interfaceC7674d != null) {
                interfaceC7674d.mo38311l();
                this.f41341w.mo38309j("121N063");
                this.f41341w.mo38310k("location_delete");
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m39368a();
    }

    public void setImageDecorView(ImageDecorView imageDecorView) {
        this.f41343y = new WeakReference(imageDecorView);
    }

    public void setLocationFilterSelected(AbstractC2790b abstractC2790b) {
        this.f41342x = abstractC2790b;
        if (this.f41343y.get() != null) {
            ((ImageDecorView) this.f41343y.get()).mo39680s();
        }
    }

    public void setLocationFilters(List<AbstractC2790b> list) {
        try {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                AbstractC2790b.m13443f(list, arrayList, this.f41333C);
            }
            this.f41344z = arrayList;
            m39370b();
            boolean z11 = false;
            if (this.f41342x != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f41344z.size()) {
                        break;
                    }
                    if (this.f41342x.f11109a == ((AbstractC2790b) this.f41344z.get(i11)).f11109a) {
                        this.f41337s.setCurrentItem(i11);
                        break;
                    }
                    i11++;
                }
            }
            RecyclingImageView recyclingImageView = this.f41336r;
            if (this.f41344z.size() > 0) {
                z11 = true;
            }
            recyclingImageView.setEnabled(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnLocationFilterSelectedListener(InterfaceC7674d interfaceC7674d) {
        this.f41341w = interfaceC7674d;
    }
}
