package com.zing.zalo.p077ui.imgdecor.doodle;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.InterfaceC1764d0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.colorpalette.ColorPalette;
import com.zing.zalo.camera.sizepicker.SizePicker;
import com.zing.zalo.p077ui.imgdecor.doodle.DoodleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.layout.LifecycleOwnerFrameLayout;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import n70.C23604c;
import n70.EnumC23613l;
import n70.InterfaceC23602a;
import n70.InterfaceC23603b;
import org.json.JSONObject;
import p276jt.C21358m;
import p348mi.AbstractC23306f;
import se.AbstractC26235a;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public class DoodleView extends LifecycleOwnerFrameLayout implements InterfaceC23603b, View.OnClickListener, SizePicker.InterfaceC7736b, Handler.Callback {

    /* renamed from: V */
    static final int f63164V;

    /* renamed from: W */
    static final int f63165W;

    /* renamed from: a0 */
    static final int f63166a0;

    /* renamed from: A */
    ImageButton f63167A;

    /* renamed from: B */
    ColorPalette f63168B;

    /* renamed from: C */
    ImageButton f63169C;

    /* renamed from: D */
    ImageButton f63170D;

    /* renamed from: E */
    ImageButton f63171E;

    /* renamed from: F */
    ImageButton f63172F;

    /* renamed from: G */
    ImageButton f63173G;

    /* renamed from: H */
    ImageButton f63174H;

    /* renamed from: I */
    SparseArray f63175I;

    /* renamed from: J */
    SparseArray f63176J;

    /* renamed from: K */
    ColorFilter f63177K;

    /* renamed from: L */
    SizePicker f63178L;

    /* renamed from: M */
    private C21358m f63179M;

    /* renamed from: N */
    private InterfaceC12102c f63180N;

    /* renamed from: O */
    ChangeBounds f63181O;

    /* renamed from: P */
    ChangeBounds f63182P;

    /* renamed from: Q */
    ChangeBounds f63183Q;

    /* renamed from: R */
    Runnable f63184R;

    /* renamed from: S */
    Runnable f63185S;

    /* renamed from: T */
    final Handler f63186T;

    /* renamed from: U */
    private InterfaceC23602a f63187U;

    /* renamed from: q */
    View f63188q;

    /* renamed from: r */
    View f63189r;

    /* renamed from: s */
    ActiveImageButton f63190s;

    /* renamed from: t */
    ImageButton f63191t;

    /* renamed from: u */
    ImageButton f63192u;

    /* renamed from: v */
    ImageButton f63193v;

    /* renamed from: w */
    RobotoTextView f63194w;

    /* renamed from: x */
    View f63195x;

    /* renamed from: y */
    ViewGroup f63196y;

    /* renamed from: z */
    ViewGroup f63197z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imgdecor.doodle.DoodleView$a */
    /* loaded from: classes5.dex */
    public class C12100a implements Transition.TransitionListener {
        C12100a() {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            ViewGroup viewGroup = DoodleView.this.f63196y;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            ViewGroup viewGroup = DoodleView.this.f63196y;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imgdecor.doodle.DoodleView$b */
    /* loaded from: classes5.dex */
    public class C12101b implements Transition.TransitionListener {
        C12101b() {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            ViewGroup viewGroup = DoodleView.this.f63197z;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            ViewGroup viewGroup = DoodleView.this.f63197z;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.doodle.DoodleView$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC12102c {
        /* renamed from: a */
        void mo38319a();

        /* renamed from: j */
        void mo38320j(String str);

        /* renamed from: k */
        void mo38321k(String str);

        /* renamed from: l */
        void mo38322l();

        /* renamed from: m */
        void mo38323m();
    }

    static {
        int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.doodle_panel_item_size);
        f63164V = m118736p;
        f63165W = m118736p * 3;
        f63166a0 = m118736p * 3;
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63175I = new SparseArray();
        this.f63176J = new SparseArray();
        this.f63186T = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: G */
    private void m67502G() {
        this.f63188q = findViewById(AbstractC6918a0.doodle_top_panel);
        this.f63189r = findViewById(AbstractC6918a0.doodle_type_container);
        ActiveImageButton activeImageButton = (ActiveImageButton) findViewById(AbstractC6918a0.btn_doodle_back);
        this.f63190s = activeImageButton;
        activeImageButton.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_undo);
        this.f63191t = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_header_brush);
        this.f63192u = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_header_shape);
        this.f63193v = imageButton3;
        imageButton3.setOnClickListener(this);
        RobotoTextView robotoTextView = (RobotoTextView) findViewById(AbstractC6918a0.btn_doodle_done);
        this.f63194w = robotoTextView;
        robotoTextView.setOnClickListener(this);
        this.f63195x = findViewById(AbstractC6918a0.doodle_bottom_panel);
        this.f63184R = new Runnable() { // from class: n70.f
            @Override // java.lang.Runnable
            public final void run() {
                DoodleView.this.m67507b0();
            }
        };
        this.f63185S = new Runnable() { // from class: n70.g
            @Override // java.lang.Runnable
            public final void run() {
                DoodleView.this.m67511g0();
            }
        };
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC6918a0.doodle_brush_panel);
        this.f63196y = viewGroup;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int i11 = f63164V;
        layoutParams.height = i11;
        this.f63196y.setLayoutParams(layoutParams);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(AbstractC6918a0.doodle_shape_panel);
        this.f63197z = viewGroup2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams2.height = i11;
        this.f63197z.setLayoutParams(layoutParams2);
        SizePicker sizePicker = (SizePicker) findViewById(AbstractC6918a0.doodle_brush_size_picker);
        this.f63178L = sizePicker;
        sizePicker.setDelegate(this);
        ImageButton imageButton4 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_type_selector);
        this.f63167A = imageButton4;
        imageButton4.setOnClickListener(this);
        ImageButton imageButton5 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_radial);
        this.f63169C = imageButton5;
        imageButton5.setOnClickListener(this);
        this.f63169C.setImageDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_editphoto_panel_brush_radial));
        this.f63175I.put(0, this.f63169C);
        ImageButton imageButton6 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_marker);
        this.f63170D = imageButton6;
        imageButton6.setOnClickListener(this);
        this.f63170D.setImageDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_editphoto_panel_brush_marker));
        this.f63175I.put(1, this.f63170D);
        ImageButton imageButton7 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_neon);
        this.f63171E = imageButton7;
        imageButton7.setImageDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_editphoto_panel_brush_neon));
        this.f63171E.setOnClickListener(this);
        this.f63175I.put(2, this.f63171E);
        ImageButton imageButton8 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_rectangular);
        this.f63172F = imageButton8;
        imageButton8.setImageDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_editphoto_panel_shape_rectangular));
        this.f63172F.setOnClickListener(this);
        this.f63176J.put(2, this.f63172F);
        ImageButton imageButton9 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_arrow);
        this.f63173G = imageButton9;
        imageButton9.setImageDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_editphoto_panel_shape_arrow));
        this.f63173G.setOnClickListener(this);
        this.f63176J.put(1, this.f63173G);
        ImageButton imageButton10 = (ImageButton) findViewById(AbstractC6918a0.btn_doodle_oval);
        this.f63174H = imageButton10;
        imageButton10.setImageDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_editphoto_panel_shape_oval));
        this.f63174H.setOnClickListener(this);
        this.f63176J.put(0, this.f63174H);
        ColorPalette colorPalette = (ColorPalette) findViewById(AbstractC6918a0.doodle_color_palette);
        this.f63168B = colorPalette;
        colorPalette.setColorPaletteListener(new ColorPalette.InterfaceC7576b() { // from class: n70.h
            @Override // com.zing.zalo.camera.colorpalette.ColorPalette.InterfaceC7576b
            /* renamed from: a */
            public final void mo39170a(int i12, AbstractC26235a abstractC26235a, boolean z11) {
                DoodleView.this.m67514i0(i12, abstractC26235a, z11);
            }
        });
        int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.doodle_active_btn_size);
        this.f63168B.setSpaceBetweenItems(AbstractC23136l9.m118736p(AbstractC16802y.doodle_active_btn_margin_left));
        this.f63168B.setExtraPaddingLeft(m118736p / 2);
    }

    /* renamed from: K0 */
    private void m67503K0(ViewGroup viewGroup, Transition transition) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.height = f63164V;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.requestLayout();
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m67504O() {
        m67503K0(this.f63196y, this.f63182P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m67505P() {
        m67503K0(this.f63197z, this.f63183Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m67506V() {
        AbstractC23136l9.m118744r1(this.f63191t, 0);
        this.f63191t.setAlpha(0.0f);
        this.f63191t.animate().alpha(1.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m67507b0() {
        m67520q(this.f63196y, f63165W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m67511g0() {
        m67520q(this.f63197z, f63166a0);
    }

    private int getCurrentColorInPalette() {
        AbstractC26235a colorItem = this.f63168B.getColorItem();
        if (colorItem instanceof AbstractC26235a.b) {
            return ((AbstractC26235a.b) colorItem).m134891c();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m67514i0(int i11, AbstractC26235a abstractC26235a, boolean z11) {
        this.f63187U.mo123746H5(abstractC26235a, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m67515l0(Integer num) {
        this.f63187U.mo123751Nj(num.intValue());
    }

    /* renamed from: p */
    private void m67518p(int i11, int i12, ColorFilter colorFilter, SparseArray sparseArray) {
        ImageButton imageButton = (ImageButton) sparseArray.get(i12);
        Drawable drawable = imageButton.getDrawable();
        if (i11 != i12) {
            colorFilter = this.f63177K;
        }
        if (colorFilter != this.f63177K || drawable.getColorFilter() != this.f63177K) {
            drawable.setColorFilter(colorFilter);
            imageButton.invalidate();
        }
    }

    /* renamed from: p0 */
    private void m67519p0() {
        InterfaceC23602a interfaceC23602a = this.f63187U;
        if (interfaceC23602a != null) {
            interfaceC23602a.mo123749N5();
        }
    }

    /* renamed from: q */
    private void m67520q(ViewGroup viewGroup, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.height = i11;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.requestLayout();
        TransitionManager.beginDelayedTransition(viewGroup, this.f63181O);
    }

    /* renamed from: u */
    private boolean m67521u() {
        C21358m c21358m = this.f63179M;
        if (c21358m != null && c21358m.m110686d0()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private boolean m67522w() {
        C21358m c21358m = this.f63179M;
        if (c21358m != null && c21358m.m110689f0()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private void m67523x() {
        ChangeBounds changeBounds = new ChangeBounds();
        this.f63181O = changeBounds;
        changeBounds.setDuration(150L);
        ChangeBounds changeBounds2 = new ChangeBounds();
        this.f63182P = changeBounds2;
        changeBounds2.addListener(new C12100a());
        this.f63182P.setDuration(150L);
        ChangeBounds changeBounds3 = new ChangeBounds();
        this.f63183Q = changeBounds3;
        changeBounds3.addListener(new C12101b());
        this.f63183Q.setDuration(150L);
    }

    /* renamed from: A */
    public void m67524A(EnumC23613l enumC23613l, boolean z11) {
        int i11;
        this.f63187U.mo123747H8(enumC23613l);
        EnumC23613l enumC23613l2 = EnumC23613l.f114471q;
        if (enumC23613l == enumC23613l2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(this.f63195x, i11);
        AbstractC23136l9.m118744r1(this.f63168B, i11);
        AbstractC23136l9.m118744r1(this.f63167A, i11);
        AbstractC23136l9.m118744r1(this.f63189r, i11);
        if (enumC23613l == enumC23613l2) {
            this.f63187U.mo123753Se();
        } else if (enumC23613l == EnumC23613l.f114472r) {
            this.f63187U.mo123748Hd(false);
        } else {
            this.f63187U.mo123748Hd(z11);
        }
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: Bv */
    public void mo67525Bv() {
        InterfaceC12102c interfaceC12102c = this.f63180N;
        if (interfaceC12102c != null) {
            interfaceC12102c.mo38322l();
        }
    }

    /* renamed from: C0 */
    public void m67526C0(JSONObject jSONObject) {
        this.f63187U.mo123752S1(jSONObject);
    }

    /* renamed from: D */
    public void m67527D(boolean z11) {
        this.f63187U.mo123747H8(EnumC23613l.f114470p);
        this.f63187U.mo123748Hd(z11);
    }

    /* renamed from: D0 */
    public void m67528D0() {
        this.f63187U.mo123762qh();
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: DI */
    public void mo67529DI() {
        AbstractC23136l9.m118744r1(this.f63167A, 0);
        AbstractC23136l9.m118744r1(this.f63196y, 8);
        AbstractC23136l9.m118744r1(this.f63197z, 0);
        this.f63197z.post(this.f63185S);
        this.f63197z.postDelayed(new Runnable() { // from class: n70.e
            @Override // java.lang.Runnable
            public final void run() {
                DoodleView.this.m67505P();
            }
        }, 3000L);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: Dn */
    public void mo67530Dn(int i11) {
        boolean z11;
        int i12;
        int i13;
        if (i11 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i12 = AbstractC16803z.bg_doodle_brush_panel_black;
        } else {
            i12 = AbstractC16803z.bg_doodle_brush_panel_white;
        }
        if (z11) {
            i13 = AbstractC16803z.bg_doodle_active_button_black;
        } else {
            i13 = AbstractC16803z.bg_doodle_active_button_white;
        }
        this.f63167A.setBackgroundResource(i13);
        ((LinearLayout) this.f63169C.getParent()).setBackgroundResource(i12);
        ((LinearLayout) this.f63172F.getParent()).setBackgroundResource(i12);
    }

    /* renamed from: H0 */
    public void m67531H0(String str) {
        this.f63187U.mo123757c9(str);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: Hf */
    public void mo67532Hf(boolean z11) {
        if (z11) {
            this.f63192u.setImageResource(AbstractC16803z.icn_header_editphoto_doodle_brush_select);
            this.f63193v.setImageResource(AbstractC16803z.icn_header_editphoto_doodle_shape_normal);
        } else {
            this.f63192u.setImageResource(AbstractC16803z.icn_header_editphoto_doodle_brush_normal);
            this.f63193v.setImageResource(AbstractC16803z.icn_header_editphoto_doodle_shape_select);
        }
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: Hx */
    public void mo67533Hx() {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110705z0();
            m67550n0();
        }
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: JE */
    public void mo67534JE(JSONObject jSONObject) {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110693l0(jSONObject);
        }
    }

    /* renamed from: L */
    public boolean m67535L() {
        return this.f63187U.mo123763qm();
    }

    /* renamed from: L0 */
    public void m67536L0() {
        this.f63178L.getOpenSizePickerAnimator().start();
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: L6 */
    public void mo67537L6() {
        this.f63186T.sendEmptyMessage(2);
    }

    /* renamed from: N */
    public boolean m67538N() {
        ColorPalette colorPalette = this.f63168B;
        if (colorPalette != null && (colorPalette.getColorItem() instanceof AbstractC26235a.c)) {
            return true;
        }
        return false;
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: OG */
    public void mo67539OG() {
        AbstractC23136l9.m118744r1(this.f63197z, 0);
        this.f63197z.post(this.f63185S);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: PA */
    public void mo67540PA(int i11, int i12) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        m67518p(i12, 2, porterDuffColorFilter, this.f63176J);
        m67518p(i12, 1, porterDuffColorFilter, this.f63176J);
        m67518p(i12, 0, porterDuffColorFilter, this.f63176J);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: Ru */
    public void mo67541Ru(String str) {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110695p0(str);
        }
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: Yl */
    public void mo67542Yl() {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110704y0();
            m67550n0();
        }
    }

    @Override // com.zing.zalo.camera.sizepicker.SizePicker.InterfaceC7736b
    /* renamed from: a */
    public void mo39488a(boolean z11) {
        SizePicker sizePicker = this.f63178L;
        if (sizePicker != null) {
            ObjectAnimator.ofFloat(sizePicker, "translationX", -sizePicker.getDistanceFromLeftEdgeToCenterOfPicker()).start();
            mo67547j("121N058");
        }
    }

    @Override // com.zing.zalo.camera.sizepicker.SizePicker.InterfaceC7736b
    /* renamed from: b */
    public void mo39489b() {
        SizePicker sizePicker = this.f63178L;
        if (sizePicker != null) {
            ObjectAnimator.ofFloat(sizePicker, "translationX", 0.0f).start();
        }
        mo67546hs();
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: bI */
    public void mo67543bI() {
        AbstractC23136l9.m118744r1(this.f63196y, 0);
        this.f63196y.post(this.f63184R);
        this.f63196y.postDelayed(new Runnable() { // from class: n70.i
            @Override // java.lang.Runnable
            public final void run() {
                DoodleView.this.m67504O();
            }
        }, 3000L);
    }

    @Override // com.zing.zalo.camera.sizepicker.SizePicker.InterfaceC7736b
    /* renamed from: c */
    public void mo39490c(float f11) {
        this.f63187U.mo123745E0(f11);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: cI */
    public void mo67544cI() {
        AbstractC23136l9.m118744r1(this.f63196y, 0);
        this.f63196y.post(this.f63184R);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: fy */
    public void mo67545fy(String str) {
        InterfaceC12102c interfaceC12102c = this.f63180N;
        if (interfaceC12102c != null) {
            interfaceC12102c.mo38321k(str);
        }
    }

    public Animator getCloseAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f63188q, "translationY", -AbstractC23222t7.f112539R), ObjectAnimator.ofFloat(this.f63178L, "translationX", -AbstractC23222t7.f112539R), ObjectAnimator.ofFloat(this.f63195x, "translationY", AbstractC23222t7.f112557e0), ObjectAnimator.ofFloat(this.f63167A, "translationY", AbstractC23222t7.f112539R), ObjectAnimator.ofFloat(this.f63168B, "translationY", AbstractC23222t7.f112539R), ObjectAnimator.ofFloat(this.f63188q, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f63195x, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f63167A, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f63168B, "alpha", 0.0f));
        return animatorSet;
    }

    public int getFooterHeight() {
        int height = this.f63195x.getHeight();
        if (height == 0) {
            return AbstractC23136l9.m118742r(68.0f);
        }
        return height;
    }

    public int getHeaderHeight() {
        int height = this.f63188q.getHeight();
        if (height == 0) {
            height = AbstractC23136l9.m118742r(48.0f);
        }
        return height + AbstractC32226c.m155409h(getRootView());
    }

    public View getTopPanel() {
        return this.f63188q;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 2 && this.f63179M != null) {
            if (this.f63191t.isShown()) {
                mo67548lH();
                return false;
            }
            this.f63191t.postDelayed(new Runnable() { // from class: n70.d
                @Override // java.lang.Runnable
                public final void run() {
                    DoodleView.this.m67506V();
                }
            }, 100L);
            return false;
        }
        return false;
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: hs */
    public void mo67546hs() {
        if (this.f63187U.mo123764sm()) {
            return;
        }
        if (AbstractC23136l9.m118666N0(this.f63196y)) {
            m67503K0(this.f63196y, this.f63182P);
        }
        if (AbstractC23136l9.m118666N0(this.f63197z)) {
            m67503K0(this.f63197z, this.f63183Q);
        }
        AbstractC23136l9.m118744r1(this.f63167A, 0);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: j */
    public void mo67547j(String str) {
        InterfaceC12102c interfaceC12102c = this.f63180N;
        if (interfaceC12102c != null) {
            interfaceC12102c.mo38320j(str);
        }
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: lH */
    public void mo67548lH() {
        int i11 = 4;
        if (this.f63187U.mo123764sm()) {
            ImageButton imageButton = this.f63191t;
            if (m67521u()) {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(imageButton, i11);
            return;
        }
        if (this.f63187U.mo123744Am()) {
            ImageButton imageButton2 = this.f63191t;
            if (m67522w()) {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(imageButton2, i11);
            return;
        }
        ImageButton imageButton3 = this.f63191t;
        if (m67556v()) {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(imageButton3, i11);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: ln */
    public void mo67549ln() {
        boolean z11;
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            if (!m67535L() && !m67538N()) {
                z11 = false;
            } else {
                z11 = true;
            }
            c21358m.m110697r0(z11);
        }
    }

    /* renamed from: n0 */
    public void m67550n0() {
        InterfaceC12102c interfaceC12102c = this.f63180N;
        if (interfaceC12102c != null) {
            interfaceC12102c.mo38319a();
        }
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: np */
    public void mo67551np(int i11, int i12) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        m67518p(i12, 0, porterDuffColorFilter, this.f63175I);
        m67518p(i12, 1, porterDuffColorFilter, this.f63175I);
        m67518p(i12, 2, porterDuffColorFilter, this.f63175I);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: og */
    public void mo67552og(int i11) {
        this.f63177K = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.layout.LifecycleOwnerFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f63187U.mo995Nd(null, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_doodle_back) {
            this.f63187U.mo123758l6();
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_undo) {
            m67519p0();
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_header_brush) {
            this.f63187U.mo123765tj(m67538N());
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_header_shape) {
            this.f63187U.mo123750Nb(m67538N());
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_done) {
            this.f63187U.mo123755Yl();
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_type_selector) {
            this.f63187U.mo123768xf();
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_radial) {
            this.f63187U.mo123761oe(m67538N());
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_marker) {
            this.f63187U.mo123767u6(m67538N());
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_neon) {
            this.f63187U.mo123760nd(m67538N());
            return;
        }
        if (id2 == AbstractC6918a0.btn_doodle_rectangular) {
            this.f63187U.mo123754Yf(m67538N());
        } else if (id2 == AbstractC6918a0.btn_doodle_arrow) {
            this.f63187U.mo123756b8(m67538N());
        } else if (id2 == AbstractC6918a0.btn_doodle_oval) {
            this.f63187U.mo123766u5(m67538N());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.layout.LifecycleOwnerFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f63187U.mo994F2();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f63187U = new C23604c(this, AbstractC23306f.m120715u());
        m67502G();
        m67523x();
    }

    /* renamed from: s */
    public Animator m67553s(boolean z11) {
        this.f63178L.setTranslationX(-AbstractC23222t7.f112539R);
        this.f63188q.setTranslationY(-AbstractC23222t7.f112539R);
        this.f63195x.setTranslationY(AbstractC23222t7.f112557e0);
        this.f63167A.setTranslationY(AbstractC23222t7.f112539R);
        this.f63168B.setTranslationY(AbstractC23222t7.f112539R);
        this.f63188q.setAlpha(0.0f);
        this.f63195x.setAlpha(0.0f);
        this.f63167A.setAlpha(0.0f);
        this.f63168B.setAlpha(0.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f63178L, "translationX", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63188q, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63195x, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63167A, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63168B, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63188q, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63195x, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63167A, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f63168B, "alpha", 1.0f));
        if (z11) {
            arrayList.add(this.f63178L.getOpenSizePickerAnimator());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // n70.InterfaceC23603b
    public void setBrushActiveButtonImage(int i11) {
        this.f63167A.setImageDrawable(((ImageButton) this.f63175I.get(i11)).getDrawable());
    }

    @Override // n70.InterfaceC23603b
    public void setColorPaletteData(List<AbstractC26235a> list) {
        this.f63168B.setColorList(list);
    }

    @Override // n70.InterfaceC23603b
    public void setColorPaletteSelectedPos(int i11) {
        this.f63168B.setSelectedPos(i11);
    }

    @Override // n70.InterfaceC23603b
    public void setCurrentBrushType(int i11) {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110699t0(i11);
        }
    }

    @Override // n70.InterfaceC23603b
    public void setCurrentColor(int i11) {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110698s0(i11);
        }
    }

    @Override // n70.InterfaceC23603b
    public void setCurrentShapeType(int i11) {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110700u0(i11);
        }
    }

    @Override // n70.InterfaceC23603b
    public void setCurrentSize(int i11) {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110702w0(i11, AbstractC23136l9.m118722k0());
        }
    }

    public void setDecorRenderer(C21358m c21358m) {
        this.f63179M = c21358m;
        if (c21358m != null) {
            c21358m.m110685c0().m9219j(this, new InterfaceC1764d0() { // from class: n70.j
                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    DoodleView.this.m67515l0((Integer) obj);
                }
            });
        }
        this.f63187U.mo123759lm(m67538N(), getCurrentColorInPalette());
    }

    public void setDoodleLayoutListener(InterfaceC12102c interfaceC12102c) {
        this.f63180N = interfaceC12102c;
    }

    @Override // n70.InterfaceC23603b
    public void setShapeActiveButtonImage(int i11) {
        this.f63167A.setImageDrawable(((ImageButton) this.f63176J.get(i11)).getDrawable());
    }

    @Override // n70.InterfaceC23603b
    public void setSizePickerLocation(float f11) {
        this.f63178L.setLocation(f11);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: u9 */
    public void mo67554u9() {
        AbstractC23136l9.m118744r1(this.f63167A, 8);
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: uv */
    public void mo67555uv() {
        C21358m c21358m = this.f63179M;
        if (c21358m != null) {
            c21358m.m110703x0();
            m67550n0();
        }
    }

    /* renamed from: v */
    public boolean m67556v() {
        C21358m c21358m = this.f63179M;
        if (c21358m != null && c21358m.m110688e0()) {
            return true;
        }
        return false;
    }

    @Override // n70.InterfaceC23603b
    /* renamed from: z7 */
    public void mo67557z7() {
        InterfaceC12102c interfaceC12102c = this.f63180N;
        if (interfaceC12102c != null) {
            interfaceC12102c.mo38323m();
        }
    }
}
