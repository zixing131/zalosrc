package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import c30.C3251l;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7020b8;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;
import p471r3.C25630b;
import z90.InterfaceC31726a;

/* loaded from: classes6.dex */
public class StickerSuggestView extends RelativeLayout {

    /* renamed from: B */
    public static final int f69740B = AbstractC23136l9.m118742r(68.0f);

    /* renamed from: A */
    boolean f69741A;

    /* renamed from: p */
    int f69742p;

    /* renamed from: q */
    int f69743q;

    /* renamed from: r */
    ViewPager f69744r;

    /* renamed from: s */
    SlidingTabLayout f69745s;

    /* renamed from: t */
    C7020b8 f69746t;

    /* renamed from: u */
    AbstractC13540b f69747u;

    /* renamed from: v */
    boolean f69748v;

    /* renamed from: w */
    boolean f69749w;

    /* renamed from: x */
    boolean f69750x;

    /* renamed from: y */
    int f69751y;

    /* renamed from: z */
    int f69752z;

    /* renamed from: com.zing.zalo.ui.widget.StickerSuggestView$a */
    /* loaded from: classes6.dex */
    class C13539a implements InterfaceC31726a {
        C13539a() {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: a */
        public boolean mo16634a() {
            return false;
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: b */
        public void mo16635b(C3251l c3251l, int i11) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: c */
        public void mo16636c(C3251l c3251l) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: d */
        public void mo16637d(C3251l c3251l, int i11) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: e */
        public void mo16638e() {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: f */
        public void mo16639f(StickerView stickerView, int i11) {
            try {
                if (StickerSuggestView.this.f69747u != null && stickerView.getTag() != null) {
                    Object tag = stickerView.getTag();
                    if (tag instanceof C25630b) {
                        C25630b c25630b = (C25630b) tag;
                        if (c25630b.m132429g() == -100) {
                            AbstractC23647d.m123897g("91984");
                        } else {
                            StickerSuggestView.this.f69747u.mo75925b(c25630b);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: g */
        public void mo16640g(StickerView stickerView, int i11, int i12) {
            try {
                ViewPager viewPager = StickerSuggestView.this.f69744r;
                if (viewPager != null) {
                    viewPager.requestDisallowInterceptTouchEvent(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: h */
        public void mo16641h(String str) {
            try {
                ViewPager viewPager = StickerSuggestView.this.f69744r;
                if (viewPager != null) {
                    viewPager.requestDisallowInterceptTouchEvent(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: i */
        public void mo16642i(C3251l c3251l) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: j */
        public void mo16643j() {
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StickerSuggestView$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC13540b {
        /* renamed from: a */
        public abstract void mo75924a(PhotoToggleButton photoToggleButton, boolean z11);

        /* renamed from: b */
        public abstract void mo75925b(C25630b c25630b);
    }

    public StickerSuggestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69742p = 4;
        this.f69743q = 1;
        this.f69748v = true;
        this.f69749w = true;
        m75919b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m75918c(PhotoToggleButton photoToggleButton, boolean z11) {
        AbstractC13540b abstractC13540b = this.f69747u;
        if (abstractC13540b != null) {
            abstractC13540b.mo75924a(photoToggleButton, z11);
        }
    }

    /* renamed from: b */
    void m75919b() {
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.sticker_suggest_view, this);
        ViewPager viewPager = (ViewPager) findViewById(AbstractC6918a0.pager_sticker);
        this.f69744r = viewPager;
        if (viewPager instanceof ViewPagerFakeDragFixed) {
            ((ViewPagerFakeDragFixed) viewPager).setModeWrapContent(true);
        }
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(AbstractC6918a0.pager_sticker_indicator);
        this.f69745s = slidingTabLayout;
        slidingTabLayout.setSelectedIndicatorColors(-14435856);
        this.f69745s.setEnableDivider(true);
        this.f69745s.setDividerColors(0);
    }

    /* renamed from: d */
    public void m75920d() {
        this.f69746t.mo35341m();
    }

    /* renamed from: e */
    public void m75921e(boolean z11, int i11, int i12) {
        this.f69750x = z11;
        this.f69751y = i11;
        this.f69752z = i12;
    }

    /* renamed from: f */
    public void m75922f(int i11, int i12) {
        this.f69742p = i11;
        this.f69743q = i12;
    }

    /* renamed from: g */
    public void m75923g(List list) {
        try {
            if (this.f69744r != null) {
                C7020b8 c7020b8 = new C7020b8(getContext(), this.f69742p, this.f69743q, f69740B);
                this.f69746t = c7020b8;
                c7020b8.m35895K(this.f69750x, this.f69751y, this.f69752z, new PhotoToggleButton.InterfaceC11847c() { // from class: com.zing.zalo.ui.widget.q2
                    @Override // com.zing.zalo.p077ui.custom.PhotoToggleButton.InterfaceC11847c
                    /* renamed from: a */
                    public final void mo37055a(PhotoToggleButton photoToggleButton, boolean z11) {
                        StickerSuggestView.this.m75918c(photoToggleButton, z11);
                    }
                });
                this.f69746t.m35896L(this.f69741A);
                this.f69746t.m35898N(new C13539a());
                ArrayList arrayList = new ArrayList(list);
                if (arrayList.size() > 0 && this.f69748v) {
                    C25630b c25630b = new C25630b();
                    c25630b.m132405O(-100);
                    arrayList.add(c25630b);
                }
                this.f69746t.m35897M(arrayList);
                this.f69744r.setAdapter(this.f69746t);
                this.f69745s.setViewPager(this.f69744r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public List<C25630b> getSelectedStickers() {
        return this.f69746t.m35892D();
    }

    public void setHasIconClose(boolean z11) {
        this.f69748v = z11;
    }

    public void setHasIndicator(boolean z11) {
        int i11;
        this.f69749w = z11;
        SlidingTabLayout slidingTabLayout = this.f69745s;
        if (slidingTabLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            slidingTabLayout.setVisibility(i11);
        }
    }

    public void setHasProgressDownload(boolean z11) {
        this.f69741A = z11;
    }

    public void setListener(AbstractC13540b abstractC13540b) {
        this.f69747u = abstractC13540b;
    }
}
