package jo0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1579n0;
import bp0.AbstractC3082b0;
import bp0.AbstractC3103o;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.mediapicker.model.PhotoCallItem;
import com.zing.zalo.zview.ZaloView;
import java.util.LinkedList;
import java.util.List;
import oo0.C24386a;
import p354n3.C23528a;
import p379o3.C24003n;
import p430px.InterfaceC24921e;
import zm.voip.p721ui.incall.FullImageZaloView;

/* renamed from: jo0.j */
/* loaded from: classes7.dex */
public class C21332j extends AbstractC6881a {

    /* renamed from: F */
    static Interpolator f103862F = new AccelerateDecelerateInterpolator();

    /* renamed from: G */
    static int f103863G = 100;

    /* renamed from: A */
    GestureDetector f103864A;

    /* renamed from: B */
    C24386a f103865B;

    /* renamed from: C */
    b f103866C;

    /* renamed from: D */
    int f103867D;

    /* renamed from: E */
    boolean f103868E = false;

    /* renamed from: r */
    List f103869r;

    /* renamed from: s */
    Context f103870s;

    /* renamed from: t */
    ZaloView f103871t;

    /* renamed from: u */
    LayoutInflater f103872u;

    /* renamed from: v */
    ViewPager f103873v;

    /* renamed from: w */
    View f103874w;

    /* renamed from: x */
    View f103875x;

    /* renamed from: y */
    C23528a f103876y;

    /* renamed from: z */
    C24003n f103877z;

    /* renamed from: jo0.j$a */
    /* loaded from: classes7.dex */
    class a implements Runnable {

        /* renamed from: p */
        float f103878p;

        /* renamed from: q */
        float f103879q;

        /* renamed from: r */
        long f103880r;

        /* renamed from: s */
        long f103881s;

        /* renamed from: t */
        DecelerateInterpolator f103882t;

        /* renamed from: u */
        float f103883u;

        /* renamed from: v */
        float f103884v;

        public a(float f11, float f12, long j11) {
            View m110455A = C21332j.this.m110455A();
            if (m110455A == null) {
                this.f103878p = 0.0f;
            } else {
                this.f103878p = m110455A.getTranslationY();
            }
            this.f103879q = f11;
            View m110459z = C21332j.this.m110459z();
            C21332j.this.f103875x = m110459z;
            if (m110459z != null) {
                this.f103883u = m110459z.getAlpha();
            }
            this.f103884v = f12;
            this.f103881s = System.currentTimeMillis();
            this.f103880r = j11;
            this.f103882t = new DecelerateInterpolator();
        }

        /* renamed from: a */
        float m110460a() {
            float min = Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f103881s)) * 1.0f) / ((float) this.f103880r));
            if (this.f103879q == 0.0f) {
                return this.f103882t.getInterpolation(min);
            }
            return C21332j.f103862F.getInterpolation(min);
        }

        @Override // java.lang.Runnable
        public void run() {
            View m110455A = C21332j.this.m110455A();
            if (m110455A == null) {
                return;
            }
            float m110460a = m110460a();
            float f11 = this.f103878p;
            float f12 = f11 + ((this.f103879q - f11) * m110460a);
            float f13 = this.f103883u;
            float f14 = f13 + ((this.f103884v - f13) * m110460a);
            m110455A.setY(f12);
            C21332j c21332j = C21332j.this;
            c21332j.f103875x = c21332j.m110459z();
            View view = C21332j.this.f103875x;
            if (view != null) {
                view.setAlpha(f14);
            }
            if (m110460a < 1.0f) {
                C21332j.m110452F(m110455A, this);
            }
            if (System.currentTimeMillis() - this.f103881s >= this.f103880r && this.f103879q != 0.0f) {
                C21332j c21332j2 = C21332j.this;
                if (c21332j2.f103868E) {
                    c21332j2.f103868E = false;
                    ZaloView zaloView = c21332j2.f103871t;
                    if (zaloView instanceof FullImageZaloView) {
                        ((FullImageZaloView) zaloView).m156446KK();
                        return;
                    }
                    return;
                }
            }
            if (System.currentTimeMillis() - this.f103881s >= this.f103880r && this.f103879q == 0.0f) {
                C21332j c21332j3 = C21332j.this;
                if (c21332j3.f103868E) {
                    c21332j3.f103868E = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jo0.j$b */
    /* loaded from: classes7.dex */
    public class b implements InterfaceC24921e {
        b() {
        }

        @Override // p430px.InterfaceC24921e
        /* renamed from: a */
        public void mo48367a(float f11, float f12, float f13, float f14) {
            if (Math.abs(f14) > Math.abs(f13)) {
                C21332j.this.m110458y(f11, f12);
            }
        }

        @Override // p430px.InterfaceC24921e
        /* renamed from: b */
        public void mo48369b(float f11, float f12, float f13) {
        }

        @Override // p430px.InterfaceC24921e
        /* renamed from: c */
        public void mo48371c(float f11, float f12, float f13) {
            AbstractC3082b0.m15421c("ImagePagerAdapter", "onRelease");
            View m110455A = C21332j.this.m110455A();
            if (m110455A == null) {
                return;
            }
            if (C21332j.this.m110457C(f11, f12, f13)) {
                m110455A.post(new a(-r7.f103867D, 0.0f, 200L));
            } else if (C21332j.this.m110456B(f11, f12, f13)) {
                m110455A.post(new a(r6.f103867D, 0.0f, 200L));
            } else {
                m110455A.post(new a(0.0f, 1.0f, 100L));
            }
        }

        @Override // p430px.InterfaceC24921e
        /* renamed from: d */
        public void mo48373d(float f11, float f12, float f13, float f14) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jo0.j$c */
    /* loaded from: classes7.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            View view = C21332j.this.f103874w;
            if (view != null) {
                if (view.getVisibility() != 0) {
                    C21332j.this.f103874w.setVisibility(0);
                    if (C21332j.this.f103871t.m92656bJ() != null) {
                        C21332j.this.f103871t.m92656bJ().setSystemUiVisibility(1280);
                        return true;
                    }
                    return true;
                }
                C21332j.this.f103874w.setVisibility(8);
                if (C21332j.this.f103871t.m92656bJ() != null) {
                    C21332j.this.f103871t.m92656bJ().setSystemUiVisibility(4);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public C21332j(ZaloView zaloView, List list, ViewPager viewPager, View view) {
        this.f103871t = zaloView;
        Context context = zaloView.getContext();
        this.f103870s = context;
        this.f103873v = viewPager;
        this.f103874w = view;
        this.f103872u = (LayoutInflater) context.getSystemService("layout_inflater");
        if (list != null) {
            this.f103869r = list;
        } else {
            this.f103869r = new LinkedList();
        }
        this.f103864A = new GestureDetector(this.f103870s, new c());
        this.f103865B = new C24386a(this.f103870s);
        b bVar = new b();
        this.f103866C = bVar;
        this.f103865B.m127543d(bVar);
        int i11 = this.f103870s.getResources().getDisplayMetrics().heightPixels;
        this.f103867D = i11;
        f103863G = (int) (i11 / 6.0f);
        this.f103876y = new C23528a(this.f103870s);
        C24003n c24003n = new C24003n();
        this.f103877z = c24003n;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116262c = -2;
        c24003n.f116260a = 920;
        c24003n.f116263d = true;
    }

    /* renamed from: D */
    public /* synthetic */ void m110450D(float f11, float f12, View view) {
        if (f11 == f12) {
            return;
        }
        try {
            this.f103868E = true;
            float y11 = view.getY();
            float abs = 1.0f - (Math.abs(y11) / (this.f103867D / 2.0f));
            view.setY(y11 + (f12 - f11));
            View m110459z = m110459z();
            this.f103875x = m110459z;
            if (m110459z != null && abs >= 0.0f && abs <= 1.0f) {
                AbstractC1579n0.m7805C0(m110459z, abs);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("ImagePagerAdapter", "dragUpOrDown: exception " + e11.toString());
        }
    }

    /* renamed from: E */
    public /* synthetic */ boolean m110451E(View view, MotionEvent motionEvent) {
        C24386a c24386a;
        GestureDetector gestureDetector = this.f103864A;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        if (AbstractC3103o.m15619h(11) && (c24386a = this.f103865B) != null && c24386a.m127542c(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static void m110452F(View view, Runnable runnable) {
        if (AbstractC3103o.m15619h(16)) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    /* renamed from: A */
    View m110455A() {
        int currentItem;
        ViewPager viewPager = this.f103873v;
        if (viewPager == null || (currentItem = viewPager.getCurrentItem()) < 0 || currentItem >= mo35335g()) {
            return null;
        }
        return this.f103873v.findViewWithTag("ImagePager" + currentItem);
    }

    /* renamed from: B */
    boolean m110456B(float f11, float f12, float f13) {
        return f12 > f11 && this.f103868E && (f12 - f11 >= ((float) f103863G) || f13 > 1000.0f);
    }

    /* renamed from: C */
    boolean m110457C(float f11, float f12, float f13) {
        return f11 > f12 && this.f103868E && (f11 - f12 >= ((float) f103863G) || f13 > 1000.0f);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        AbstractC3082b0.m15421c("ImagePagerAdapter", "destroyItem: " + i11);
        viewGroup.removeView((LinearLayout) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        List list = this.f103869r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        AbstractC3082b0.m15421c("ImagePagerAdapter", "instantiateItem:" + i11);
        View inflate = this.f103872u.inflate(AbstractC7409c0.image_pager_item, viewGroup, false);
        RecyclingImageView recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.image_pager_item_iv);
        recyclingImageView.setOnTouchListener(new View.OnTouchListener() { // from class: jo0.h
            public /* synthetic */ ViewOnTouchListenerC21330h() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m110451E;
                m110451E = C21332j.this.m110451E(view, motionEvent);
                return m110451E;
            }
        });
        ((C23528a) this.f103876y.m123612r(recyclingImageView)).m123618x(((PhotoCallItem) this.f103869r.get(i11)).m41201a(), this.f103877z);
        inflate.setTag("ImagePager" + i11);
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: y */
    void m110458y(float f11, float f12) {
        View m110455A = m110455A();
        if (m110455A == null) {
            return;
        }
        m110455A.post(new Runnable() { // from class: jo0.i

            /* renamed from: q */
            public final /* synthetic */ float f103859q;

            /* renamed from: r */
            public final /* synthetic */ float f103860r;

            /* renamed from: s */
            public final /* synthetic */ View f103861s;

            public /* synthetic */ RunnableC21331i(float f112, float f122, View m110455A2) {
                r2 = f112;
                r3 = f122;
                r4 = m110455A2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21332j.this.m110450D(r2, r3, r4);
            }
        });
    }

    /* renamed from: z */
    View m110459z() {
        View view = this.f103875x;
        if (view != null) {
            return view;
        }
        ViewPager viewPager = this.f103873v;
        if (viewPager == null) {
            return null;
        }
        Object parent = viewPager.getParent();
        if (parent != null && (parent instanceof View)) {
            this.f103875x = (View) parent;
        }
        return this.f103875x;
    }
}
