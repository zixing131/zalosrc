package com.zing.zalo.uicontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1617x0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.uicontrol.C16561b1;
import com.zing.zalo.uicontrol.Snackbar;
import me0.AbstractC23136l9;
import p500s1.C26087b;

/* loaded from: classes4.dex */
public final class Snackbar {

    /* renamed from: a */
    final ViewGroup f83469a;

    /* renamed from: b */
    final Context f83470b;

    /* renamed from: c */
    final SnackbarLayout f83471c;

    /* renamed from: d */
    int f83472d;

    /* renamed from: e */
    AbstractC16514e f83473e;

    /* renamed from: f */
    int f83474f = 0;

    /* renamed from: g */
    int f83475g = 250;

    /* renamed from: h */
    int f83476h = 0;

    /* renamed from: i */
    final C16561b1.a f83477i = new C16510a();

    /* renamed from: k */
    static final C26087b f83468k = new C26087b();

    /* renamed from: j */
    static final Handler f83467j = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.uicontrol.x0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m88015o;
            m88015o = Snackbar.m88015o(message);
            return m88015o;
        }
    });

    /* loaded from: classes4.dex */
    public static class SnackbarLayout extends LinearLayout {

        /* renamed from: p */
        TextView f83478p;

        /* renamed from: q */
        Button f83479q;

        /* renamed from: r */
        RecyclingImageView f83480r;

        /* renamed from: s */
        int f83481s;

        /* renamed from: t */
        int f83482t;

        /* renamed from: u */
        int f83483u;

        /* renamed from: v */
        int f83484v;

        /* renamed from: w */
        InterfaceC16509b f83485w;

        /* renamed from: x */
        InterfaceC16508a f83486x;

        /* renamed from: com.zing.zalo.uicontrol.Snackbar$SnackbarLayout$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16508a {
            void onViewAttachedToWindow(View view);

            void onViewDetachedFromWindow(View view);
        }

        /* renamed from: com.zing.zalo.uicontrol.Snackbar$SnackbarLayout$b */
        /* loaded from: classes4.dex */
        public interface InterfaceC16509b {
            /* renamed from: a */
            void mo88043a(View view, int i11, int i12, int i13, int i14);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f83483u = getResources().getDimensionPixelSize(AbstractC16802y.design_snackbar_padding_vertical_2lines);
            this.f83484v = getResources().getDimensionPixelSize(AbstractC16802y.design_snackbar_padding_vertical);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.SnackbarLayout);
            this.f83481s = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.SnackbarLayout_android_maxWidth, -1);
            this.f83482t = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(AbstractC8923h0.SnackbarLayout_elevation)) {
                AbstractC1579n0.m7817I0(this, obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(AbstractC7409c0.design_layout_snackbar_include, this);
            AbstractC1579n0.m7803B0(this, 1);
        }

        /* renamed from: d */
        static void m88038d(View view, int i11, int i12) {
            if (AbstractC1579n0.m7871g0(view)) {
                AbstractC1579n0.m7837S0(view, AbstractC1579n0.m7820K(view), i11, AbstractC1579n0.m7818J(view), i12);
            } else {
                view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i12);
            }
        }

        /* renamed from: a */
        void m88039a(int i11, int i12) {
            AbstractC1579n0.m7805C0(this.f83478p, 0.0f);
            long j11 = i12;
            long j12 = i11;
            AbstractC1579n0.m7864e(this.f83478p).m8215b(1.0f).m8220h(j11).m8223l(j12).m8225n();
            if (this.f83479q.getVisibility() == 0) {
                AbstractC1579n0.m7805C0(this.f83479q, 0.0f);
                AbstractC1579n0.m7864e(this.f83479q).m8215b(1.0f).m8220h(j11).m8223l(j12).m8225n();
            }
        }

        /* renamed from: b */
        void m88040b(int i11, int i12) {
            AbstractC1579n0.m7805C0(this.f83478p, 1.0f);
            long j11 = i12;
            long j12 = i11;
            AbstractC1579n0.m7864e(this.f83478p).m8215b(0.0f).m8220h(j11).m8223l(j12).m8225n();
            if (this.f83479q.getVisibility() == 0) {
                AbstractC1579n0.m7805C0(this.f83479q, 1.0f);
                AbstractC1579n0.m7864e(this.f83479q).m8215b(0.0f).m8220h(j11).m8223l(j12).m8225n();
            }
        }

        /* renamed from: c */
        public void m88041c(int i11, int i12) {
            this.f83483u = i11;
            this.f83484v = i12;
        }

        /* renamed from: e */
        boolean m88042e(int i11, int i12, int i13) {
            boolean z11;
            if (i11 != getOrientation()) {
                setOrientation(i11);
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f83478p.getPaddingTop() == i12 && this.f83478p.getPaddingBottom() == i13) {
                return z11;
            }
            m88038d(this.f83478p, i12, i13);
            return true;
        }

        Button getActionView() {
            return this.f83479q;
        }

        public RecyclingImageView getIconView() {
            return this.f83480r;
        }

        TextView getMessageView() {
            return this.f83478p;
        }

        public int getMultiLineVPadding() {
            return this.f83483u;
        }

        public int getSingleLineVPadding() {
            return this.f83484v;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            InterfaceC16508a interfaceC16508a = this.f83486x;
            if (interfaceC16508a != null) {
                interfaceC16508a.onViewAttachedToWindow(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            InterfaceC16508a interfaceC16508a = this.f83486x;
            if (interfaceC16508a != null) {
                interfaceC16508a.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.f83478p = (TextView) findViewById(AbstractC6918a0.snackbar_text);
            this.f83479q = (Button) findViewById(AbstractC6918a0.snackbar_action);
            this.f83480r = (RecyclingImageView) findViewById(AbstractC6918a0.snackbar_icon);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            InterfaceC16509b interfaceC16509b;
            super.onLayout(z11, i11, i12, i13, i14);
            if (z11 && (interfaceC16509b = this.f83485w) != null) {
                interfaceC16509b.mo88043a(this, i11, i12, i13, i14);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            boolean z11;
            super.onMeasure(i11, i12);
            if (this.f83481s > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f83481s;
                if (measuredWidth > i13) {
                    i11 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    super.onMeasure(i11, i12);
                }
            }
            int multiLineVPadding = getMultiLineVPadding();
            int singleLineVPadding = getSingleLineVPadding();
            if (this.f83478p.getLayout().getLineCount() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f83482t > 0 && this.f83479q.getMeasuredWidth() > this.f83482t) {
                if (!m88042e(1, multiLineVPadding, multiLineVPadding - singleLineVPadding)) {
                    return;
                }
            } else {
                if (!z11) {
                    multiLineVPadding = singleLineVPadding;
                }
                if (!m88042e(0, multiLineVPadding, multiLineVPadding)) {
                    return;
                }
            }
            super.onMeasure(i11, i12);
        }

        public void setMaxWidth(int i11) {
            this.f83481s = Math.min(i11, AbstractC23136l9.m118722k0());
        }

        void setOnAttachStateChangeListener(InterfaceC16508a interfaceC16508a) {
            this.f83486x = interfaceC16508a;
        }

        void setOnLayoutChangeListener(InterfaceC16509b interfaceC16509b) {
            this.f83485w = interfaceC16509b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.Snackbar$a */
    /* loaded from: classes4.dex */
    public class C16510a implements C16561b1.a {
        C16510a() {
        }

        @Override // com.zing.zalo.uicontrol.C16561b1.a
        /* renamed from: a */
        public void mo88044a() {
            Handler handler = Snackbar.f83467j;
            handler.sendMessage(handler.obtainMessage(0, Snackbar.this));
        }

        @Override // com.zing.zalo.uicontrol.C16561b1.a
        /* renamed from: b */
        public void mo88045b(int i11) {
            Handler handler = Snackbar.f83467j;
            handler.sendMessage(handler.obtainMessage(1, i11, 0, Snackbar.this));
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.Snackbar$b */
    /* loaded from: classes4.dex */
    public class C16511b implements SnackbarLayout.InterfaceC16508a {
        C16511b() {
        }

        /* renamed from: b */
        public /* synthetic */ void m88047b() {
            Snackbar.this.m88029r(3);
        }

        @Override // com.zing.zalo.uicontrol.Snackbar.SnackbarLayout.InterfaceC16508a
        public void onViewAttachedToWindow(View view) {
        }

        @Override // com.zing.zalo.uicontrol.Snackbar.SnackbarLayout.InterfaceC16508a
        public void onViewDetachedFromWindow(View view) {
            if (Snackbar.this.m88028l()) {
                Snackbar.f83467j.post(new Runnable() { // from class: com.zing.zalo.uicontrol.z0
                    public /* synthetic */ RunnableC16683z0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Snackbar.C16511b.this.m88047b();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.Snackbar$c */
    /* loaded from: classes4.dex */
    public class C16512c extends AbstractC1617x0 {
        C16512c() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            Snackbar snackbar = Snackbar.this;
            AbstractC16514e abstractC16514e = snackbar.f83473e;
            if (abstractC16514e != null) {
                abstractC16514e.mo82257b(snackbar);
            }
            C16561b1.m88240d().m88250l(Snackbar.this.f83477i);
        }

        @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            Snackbar snackbar = Snackbar.this;
            snackbar.f83471c.m88039a(snackbar.f83475g - 180, 180);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.Snackbar$d */
    /* loaded from: classes4.dex */
    public class C16513d extends AbstractC1617x0 {

        /* renamed from: a */
        final /* synthetic */ int f83490a;

        C16513d(int i11) {
            this.f83490a = i11;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            Snackbar.this.m88029r(this.f83490a);
        }

        @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            Snackbar.this.f83471c.m88040b(0, 180);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.Snackbar$e */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC16514e {
        /* renamed from: a */
        public void mo82256a(Snackbar snackbar, int i11) {
        }

        /* renamed from: b */
        public void mo82257b(Snackbar snackbar) {
        }
    }

    Snackbar(ViewGroup viewGroup) {
        this.f83469a = viewGroup;
        Context context = viewGroup.getContext();
        this.f83470b = context;
        this.f83471c = (SnackbarLayout) LayoutInflater.from(context).inflate(AbstractC7409c0.layout_snackbar_legacy, viewGroup, false);
    }

    /* renamed from: D */
    private void m88008D() {
        SnackbarLayout snackbarLayout;
        if (this.f83469a != null && (snackbarLayout = this.f83471c) != null && this.f83476h == 1 && (snackbarLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) this.f83471c.getLayoutParams()).gravity = 81;
        }
    }

    /* renamed from: h */
    static ViewGroup m88012h(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof RelativeLayout) && !(view instanceof FrameLayout)) {
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: m */
    public /* synthetic */ void m88013m(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        m88024g(1);
    }

    /* renamed from: n */
    public /* synthetic */ void m88014n(View view, int i11, int i12, int i13, int i14) {
        m88021d();
        this.f83471c.setOnLayoutChangeListener(null);
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m88015o(Message message) {
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 != 1) {
                return false;
            }
            ((Snackbar) message.obj).m88026j(message.arg1);
            return true;
        }
        ((Snackbar) message.obj).m88020C();
        return true;
    }

    /* renamed from: p */
    public static Snackbar m88016p(View view, int i11, int i12) {
        return m88017q(view, view.getResources().getText(i11), i12);
    }

    /* renamed from: q */
    public static Snackbar m88017q(View view, CharSequence charSequence, int i11) {
        Snackbar snackbar = new Snackbar(m88012h(view));
        snackbar.m88018A(charSequence);
        snackbar.m88033v(i11);
        return snackbar;
    }

    /* renamed from: A */
    public Snackbar m88018A(CharSequence charSequence) {
        this.f83471c.getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: B */
    public void m88019B() {
        C16561b1.m88240d().m88252n(this.f83472d, this.f83477i);
    }

    /* renamed from: C */
    void m88020C() {
        if (this.f83471c.getParent() == null) {
            this.f83469a.addView(this.f83471c);
            m88008D();
        }
        this.f83471c.setOnAttachStateChangeListener(new C16511b());
        if (AbstractC1579n0.m7865e0(this.f83471c)) {
            m88021d();
        } else {
            this.f83471c.setOnLayoutChangeListener(new SnackbarLayout.InterfaceC16509b() { // from class: com.zing.zalo.uicontrol.y0
                public /* synthetic */ C16680y0() {
                }

                @Override // com.zing.zalo.uicontrol.Snackbar.SnackbarLayout.InterfaceC16509b
                /* renamed from: a */
                public final void mo88043a(View view, int i11, int i12, int i13, int i14) {
                    Snackbar.this.m88014n(view, i11, i12, i13, i14);
                }
            });
        }
    }

    /* renamed from: d */
    void m88021d() {
        AbstractC1579n0.m7857b1(this.f83471c, r0.getHeight() + this.f83474f);
        AbstractC1579n0.m7864e(this.f83471c).m8227p(0.0f - (this.f83474f * 1.0f)).m8221i(f83468k).m8220h(this.f83475g).m8222j(new C16512c()).m8225n();
    }

    /* renamed from: e */
    void m88022e(int i11) {
        AbstractC1579n0.m7864e(this.f83471c).m8227p(this.f83471c.getHeight() + (this.f83474f * 1.0f)).m8221i(f83468k).m8220h(this.f83475g).m8222j(new C16513d(i11)).m8225n();
    }

    /* renamed from: f */
    public void m88023f() {
        m88024g(3);
    }

    /* renamed from: g */
    void m88024g(int i11) {
        C16561b1.m88240d().m88243c(this.f83477i, i11);
    }

    /* renamed from: i */
    public View m88025i() {
        return this.f83471c;
    }

    /* renamed from: j */
    void m88026j(int i11) {
        if (this.f83471c.getVisibility() != 0) {
            m88029r(i11);
        } else {
            m88022e(i11);
        }
    }

    /* renamed from: k */
    public boolean m88027k() {
        return C16561b1.m88240d().m88245f(this.f83477i);
    }

    /* renamed from: l */
    public boolean m88028l() {
        return C16561b1.m88240d().m88246g(this.f83477i);
    }

    /* renamed from: r */
    void m88029r(int i11) {
        C16561b1.m88240d().m88249k(this.f83477i);
        AbstractC16514e abstractC16514e = this.f83473e;
        if (abstractC16514e != null) {
            abstractC16514e.mo82256a(this, i11);
        }
        ViewParent parent = this.f83471c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f83471c);
        }
    }

    /* renamed from: s */
    public Snackbar m88030s(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = this.f83471c.getActionView();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.w0

                /* renamed from: q */
                public final /* synthetic */ View.OnClickListener f84574q;

                public /* synthetic */ ViewOnClickListenerC16674w0(View.OnClickListener onClickListener2) {
                    r2 = onClickListener2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.this.m88013m(r2, view);
                }
            });
        } else {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
        }
        return this;
    }

    /* renamed from: t */
    public Snackbar m88031t(int i11) {
        this.f83475g = Math.max(i11, 250);
        return this;
    }

    /* renamed from: u */
    public Snackbar m88032u(AbstractC16514e abstractC16514e) {
        this.f83473e = abstractC16514e;
        return this;
    }

    /* renamed from: v */
    public Snackbar m88033v(int i11) {
        this.f83472d = i11;
        return this;
    }

    /* renamed from: w */
    public Snackbar m88034w(int i11) {
        this.f83476h = i11;
        return this;
    }

    /* renamed from: x */
    public Snackbar m88035x(int i11) {
        this.f83474f = i11;
        return this;
    }

    /* renamed from: y */
    public Snackbar m88036y(int i11) {
        this.f83471c.setMaxWidth(i11);
        return this;
    }

    /* renamed from: z */
    public Snackbar m88037z(int i11, int i12) {
        this.f83471c.m88041c(i11, i12);
        return this;
    }
}
