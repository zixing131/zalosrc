package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import bo.C2945a0;
import bo.C2950b0;
import bo.C2955c0;
import bo.C3000l0;
import bo.C3020p0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import ho0.AbstractC20110a;
import java.util.Calendar;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;

/* loaded from: classes4.dex */
public class FeedItemYearDivider extends RelativeLayout {

    /* renamed from: p */
    private final Context f44911p;

    /* renamed from: q */
    private RobotoTextView f44912q;

    /* renamed from: r */
    private int f44913r;

    /* renamed from: s */
    private RecyclingImageView f44914s;

    /* renamed from: t */
    protected C23528a f44915t;

    /* renamed from: u */
    private ZSimpleGIFView f44916u;

    public FeedItemYearDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44911p = context;
    }

    /* renamed from: a */
    private void m44261a() {
        RecyclingImageView recyclingImageView = this.f44914s;
        if (recyclingImageView != null) {
            recyclingImageView.setVisibility(8);
        }
        ZSimpleGIFView zSimpleGIFView = this.f44916u;
        if (zSimpleGIFView != null) {
            zSimpleGIFView.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m44262c(C2950b0 c2950b0, boolean z11) {
        try {
            ZSimpleGIFView zSimpleGIFView = this.f44916u;
            if (zSimpleGIFView != null && c2950b0 != null) {
                zSimpleGIFView.setVisibility(0);
                this.f44916u.m88227l(new ZSimpleGIFView.C16554f(c2950b0.m13973e(), c2950b0.m13972d(), c2950b0.m13971c().f131648a, c2950b0.m13971c().f131649b, "FeedItemYearDivider"), 0, null);
                this.f44916u.setScrolling(!z11);
                this.f44916u.m88224g(100L);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: d */
    private void m44263d(C2950b0 c2950b0) {
        if (c2950b0 != null) {
            this.f44914s.setVisibility(0);
            ((C23528a) this.f44915t.m123612r(this.f44914s)).m123579C(c2950b0.m13973e(), C23278z2.m120160w(this.f44911p, AbstractC23006a0.m117928x()), new C23999j().m125764I1(150));
        }
    }

    /* renamed from: f */
    private void m44264f() {
        RecyclingImageView recyclingImageView = this.f44914s;
        if (recyclingImageView != null) {
            recyclingImageView.setVisibility(0);
            RecyclingImageView recyclingImageView2 = this.f44914s;
            recyclingImageView2.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView2.getContext(), AbstractC16803z.year_banner_default));
        }
    }

    private void setTextYear(int i11) {
        RobotoTextView robotoTextView = this.f44912q;
        if (robotoTextView != null) {
            robotoTextView.setText(i11 + "");
        }
    }

    /* renamed from: b */
    public void m44265b() {
        this.f44915t = new C23528a(this.f44911p);
        ((LayoutInflater) this.f44911p.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_year_divider_content, this);
        this.f44913r = AbstractC23136l9.m118641B(this.f44911p, AbstractC16801x.cProfileDotStroke);
        this.f44912q = (RobotoTextView) findViewById(AbstractC6918a0.tvYearDivider);
        this.f44914s = (RecyclingImageView) findViewById(AbstractC6918a0.banner_year);
        this.f44916u = (ZSimpleGIFView) findViewById(AbstractC6918a0.simple_gif_view);
    }

    /* renamed from: e */
    public void m44266e(C3000l0 c3000l0, boolean z11) {
        C3020p0 m14322a0;
        if (c3000l0 == null || (m14322a0 = c3000l0.m14322a0()) == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m14322a0.f12062u);
        int i11 = calendar.get(1);
        setTextYear(i11);
        m44261a();
        C2945a0 m14000d = C2955c0.m13996b().m14000d(String.valueOf(i11));
        if (m14000d != null && m14000d.m13942c() != null) {
            if (m14000d.m13946g() && this.f44914s != null) {
                m44263d(m14000d.m13942c());
            }
            if (m14000d.m13945f() && this.f44916u != null) {
                m44262c(m14000d.m13942c(), z11);
                return;
            }
            return;
        }
        m44264f();
    }
}
