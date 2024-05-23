package com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneEmptyContentViewCell;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import n50.C23571e;
import p649xl.C30048t6;

/* loaded from: classes5.dex */
public final class RingtoneEmptyContentViewCell extends RelativeLayout {

    /* renamed from: p */
    private C30048t6 f56560p;

    /* renamed from: q */
    private InterfaceC11246a f56561q;

    /* renamed from: r */
    private boolean f56562r;

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.viewcell.RingtoneEmptyContentViewCell$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11246a {
        /* renamed from: ze */
        void mo58775ze(C23571e c23571e);
    }

    public RingtoneEmptyContentViewCell(Context context) {
        super(context);
        m58995j(context);
    }

    /* renamed from: f */
    public static final void m58989f(RingtoneEmptyContentViewCell ringtoneEmptyContentViewCell, C23571e c23571e, View view) {
        AbstractC19074t.m100208f(ringtoneEmptyContentViewCell, "this$0");
        InterfaceC11246a interfaceC11246a = ringtoneEmptyContentViewCell.f56561q;
        if (interfaceC11246a != null) {
            interfaceC11246a.mo58775ze(c23571e);
        }
    }

    /* renamed from: g */
    public static final void m58990g(RingtoneEmptyContentViewCell ringtoneEmptyContentViewCell, C23571e c23571e, View view) {
        AbstractC19074t.m100208f(ringtoneEmptyContentViewCell, "this$0");
        InterfaceC11246a interfaceC11246a = ringtoneEmptyContentViewCell.f56561q;
        if (interfaceC11246a != null) {
            interfaceC11246a.mo58775ze(c23571e);
        }
    }

    /* renamed from: h */
    private final void m58991h() {
        int i11;
        if (this.f56562r) {
            C30048t6 c30048t6 = this.f56560p;
            if (c30048t6 == null) {
                AbstractC19074t.m100223u("binding");
                c30048t6 = null;
            }
            if (c30048t6.f139391q.getVisibility() == 0) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                Rect rect = new Rect(i12, i13, c30048t6.f139391q.getRight() + i12, c30048t6.f139391q.getBottom() + i13);
                RecyclingImageView recyclingImageView = c30048t6.f139393s;
                if (rect.bottom > AbstractC23136l9.m118713h0()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                recyclingImageView.setVisibility(i11);
                this.f56562r = false;
                postDelayed(new Runnable() { // from class: s50.c
                    public /* synthetic */ RunnableC26149c() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        RingtoneEmptyContentViewCell.m58992i(C30048t6.this);
                    }
                }, 30L);
            }
        }
    }

    /* renamed from: i */
    public static final void m58992i(C30048t6 c30048t6) {
        AbstractC19074t.m100208f(c30048t6, "$this_run");
        c30048t6.f139393s.requestLayout();
        c30048t6.f139393s.invalidate();
    }

    /* renamed from: k */
    public static final void m58993k(RingtoneEmptyContentViewCell ringtoneEmptyContentViewCell, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(ringtoneEmptyContentViewCell, "this$0");
        ringtoneEmptyContentViewCell.m58991h();
    }

    /* renamed from: e */
    public final void m58994e(C23571e c23571e) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GradientDrawable gradientDrawable;
        if (c23571e == null) {
            return;
        }
        C30048t6 c30048t6 = this.f56560p;
        C30048t6 c30048t62 = null;
        if (c30048t6 == null) {
            AbstractC19074t.m100223u("binding");
            c30048t6 = null;
        }
        if (!c23571e.m123669x()) {
            c30048t6.f139394t.getLayoutParams().height = 0;
            c30048t6.f139394t.setVisibility(8);
        } else {
            c30048t6.f139394t.getLayoutParams().height = -2;
            c30048t6.f139394t.setVisibility(0);
        }
        c30048t6.f139395u.setHeight(c23571e.m123661p());
        ViewGroup.LayoutParams layoutParams = c30048t6.f139392r.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = c23571e.m123660o();
        }
        c30048t6.f139392r.setPadding(AbstractC23136l9.m118742r(24.0f), c23571e.m123662q(), AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(32.0f));
        if (c23571e.m123653h()) {
            LinearLayout linearLayout = c30048t6.f139392r;
            linearLayout.setBackground(AbstractC23136l9.m118665N(linearLayout.getContext(), AbstractC16803z.empty_album_background));
            Drawable background = c30048t6.f139392r.getBackground();
            if (background instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) background;
            } else {
                gradientDrawable = null;
            }
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(AbstractC23136l9.m118742r(1.0f), c23571e.m123647b(), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(4.0f));
            }
        } else {
            LinearLayout linearLayout2 = c30048t6.f139392r;
            linearLayout2.setBackground(AbstractC23136l9.m118665N(linearLayout2.getContext(), AbstractC16803z.rectangle_transparent));
        }
        if (c23571e.m123657l()) {
            c30048t6.f139397w.setText(c23571e.m123664s());
            c30048t6.f139397w.setTextColor(c23571e.m123666u());
            c30048t6.f139397w.setVisibility(0);
        } else {
            c30048t6.f139397w.setVisibility(8);
        }
        if (c23571e.m123654i()) {
            c30048t6.f139396v.setText(c23571e.m123648c());
            c30048t6.f139396v.setTextColor(c23571e.m123649d());
            c30048t6.f139396v.setVisibility(0);
        } else {
            c30048t6.f139396v.setVisibility(8);
        }
        if (c23571e.m123655j()) {
            c30048t6.f139393s.setImageResource(c23571e.m123658m());
            c30048t6.f139393s.setVisibility(0);
        } else {
            c30048t6.f139393s.setVisibility(8);
        }
        if (c23571e.m123651f()) {
            if (c23571e.m123656k()) {
                Button button = c30048t6.f139391q;
                button.setCompoundDrawables(AbstractC23136l9.m118665N(button.getContext(), c23571e.m123659n()), null, null, null);
            }
            c30048t6.f139391q.setText(c23571e.m123665t());
            c30048t6.f139391q.setVisibility(0);
        } else {
            c30048t6.f139391q.setVisibility(8);
        }
        this.f56562r = c23571e.m123668w();
        if (c23571e.m123650e()) {
            c30048t6.f139394t.setBackgroundColor(c23571e.m123646a());
        }
        C30048t6 c30048t63 = this.f56560p;
        if (c30048t63 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30048t62 = c30048t63;
        }
        c30048t62.f139391q.setOnClickListener(new View.OnClickListener() { // from class: s50.d

            /* renamed from: q */
            public final /* synthetic */ C23571e f124380q;

            public /* synthetic */ ViewOnClickListenerC26150d(C23571e c23571e2) {
                r2 = c23571e2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RingtoneEmptyContentViewCell.m58989f(RingtoneEmptyContentViewCell.this, r2, view);
            }
        });
        if (c23571e2.m123652g()) {
            c30048t6.f139394t.setOnClickListener(new View.OnClickListener() { // from class: s50.e

                /* renamed from: q */
                public final /* synthetic */ C23571e f124382q;

                public /* synthetic */ ViewOnClickListenerC26151e(C23571e c23571e2) {
                    r2 = c23571e2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RingtoneEmptyContentViewCell.m58990g(RingtoneEmptyContentViewCell.this, r2, view);
                }
            });
        }
    }

    public final InterfaceC11246a getEmptyContentListener() {
        return this.f56561q;
    }

    /* renamed from: j */
    public final void m58995j(Context context) {
        C30048t6 m148525c = C30048t6.m148525c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148525c, "inflate(...)");
        this.f56560p = m148525c;
        if (m148525c == null) {
            AbstractC19074t.m100223u("binding");
            m148525c = null;
        }
        m148525c.f139391q.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: s50.b
            public /* synthetic */ ViewOnLayoutChangeListenerC26148b() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                RingtoneEmptyContentViewCell.m58993k(RingtoneEmptyContentViewCell.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    public final void setEmptyContentListener(InterfaceC11246a interfaceC11246a) {
        this.f56561q = interfaceC11246a;
    }

    public RingtoneEmptyContentViewCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m58995j(context);
    }
}
