package cd0;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.StoryBarItemImageView;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23136l9;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p716zh.C32123ta;
import vg.C28203u6;

/* renamed from: cd0.h */
/* loaded from: classes4.dex */
public class C3429h extends AbstractC3424c implements AbstractC22055v0.i, C22033k0.h {

    /* renamed from: w */
    C32123ta f14397w;

    /* renamed from: x */
    Handler f14398x = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public static C3429h m17214l(View view) {
        C3429h c3429h = new C3429h();
        if (view != null) {
            c3429h.m17192a(view);
        }
        return c3429h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m17215r(boolean z11) {
        if (z11) {
            if (this.f14382v == 8) {
                RecyclingImageView recyclingImageView = this.f14377q;
                if (recyclingImageView instanceof StoryBarItemImageView) {
                    ((StoryBarItemImageView) recyclingImageView).m75945C(z11, false);
                }
            } else {
                this.f14379s.setVisibility(0);
            }
            m17228s(false);
            return;
        }
        if (this.f14382v == 8) {
            RecyclingImageView recyclingImageView2 = this.f14377q;
            if (recyclingImageView2 instanceof StoryBarItemImageView) {
                ((StoryBarItemImageView) recyclingImageView2).m75945C(z11, false);
            }
        } else {
            this.f14379s.setVisibility(8);
        }
        C32123ta c32123ta = this.f14397w;
        if (c32123ta != null && c32123ta.f148128c == 2) {
            m17228s(true);
        }
    }

    @Override // l30.C22033k0.h
    /* renamed from: b */
    public String mo17216b() {
        return m17226o().f148136g;
    }

    @Override // l30.C22033k0.h
    /* renamed from: c */
    public String mo17217c() {
        ContactProfile m141809c;
        C32123ta m17226o = m17226o();
        if (m17226o != null && (m141809c = C28203u6.f131407a.m141809c(m17226o.f148138h)) != null) {
            return AbstractC21935u.m114542i(m141809c.f42434r, m141809c.f42437s);
        }
        return "";
    }

    @Override // l30.C22033k0.h
    /* renamed from: d */
    public String mo17218d() {
        return m17226o().f148138h;
    }

    @Override // l30.C22033k0.h
    /* renamed from: e */
    public void mo17219e(final boolean z11) {
        this.f14398x.post(new Runnable() { // from class: cd0.g
            @Override // java.lang.Runnable
            public final void run() {
                C3429h.this.m17215r(z11);
            }
        });
    }

    @Override // l30.C22033k0.h
    /* renamed from: g */
    public String mo17220g() {
        return m17226o().f148138h;
    }

    @Override // l30.C22033k0.h
    /* renamed from: h */
    public boolean mo17221h() {
        ProgressBar progressBar = this.f14379s;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // l30.C22033k0.h
    /* renamed from: i */
    public boolean mo17222i() {
        return false;
    }

    @Override // l30.C22033k0.h
    /* renamed from: j */
    public C32123ta mo17223j() {
        return m17226o();
    }

    @Override // l30.C22033k0.h
    /* renamed from: m */
    public boolean mo17224m() {
        return false;
    }

    @Override // l30.AbstractC22055v0.i
    /* renamed from: n */
    public void mo17225n(C32123ta c32123ta, C23528a c23528a) {
        boolean z11;
        this.f14397w = c32123ta;
        if (c32123ta != null) {
            AbstractC22055v0.m115130T(this.f14377q, c32123ta, c23528a, AbstractC22055v0.m115153m());
            if (this.f14380t != null) {
                if (this.f14397w.f148128c == 2 && !mo17221h()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m17228s(z11);
                return;
            }
            return;
        }
        this.f14376p.setVisibility(4);
    }

    /* renamed from: o */
    public C32123ta m17226o() {
        return this.f14397w;
    }

    @Override // l30.C22033k0.h
    /* renamed from: q */
    public void mo17227q() {
    }

    /* renamed from: s */
    void m17228s(boolean z11) {
        int i11;
        float f11;
        try {
            ImageView imageView = this.f14380t;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(imageView, i11);
            RecyclingImageView recyclingImageView = this.f14377q;
            if (recyclingImageView instanceof StoryBarItemImageView) {
                if (z11) {
                    f11 = 0.3f;
                } else {
                    f11 = 1.0f;
                }
                recyclingImageView.setAlpha(f11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
