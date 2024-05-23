package com.zing.zalo.p077ui.imgdecor.caption;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.colorpalette.ColorPalette;
import com.zing.zalo.camera.sizepicker.SizePicker;
import com.zing.zalo.p077ui.imgdecor.caption.CaptionView;
import com.zing.zalo.p077ui.imgdecor.caption.InterfaceC12098a;
import com.zing.zalo.p077ui.imgdecor.caption.customview.AutoSizeEditText;
import com.zing.zalo.p077ui.imgdecor.caption.customview.CaptionRoundedTextView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.uicontrol.C16572d1;
import dg0.AbstractC17927b;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import l70.C22106b;
import l70.InterfaceC22105a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23081g9;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.C20218v;
import p276jt.AbstractC21351f;
import p276jt.C21357l;
import p298kf.C21700a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p500s1.C26088c;
import p646xi.C29669a;
import p649xl.C29991q1;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import se.AbstractC26235a;
import zh0.AbstractC32212c;

/* loaded from: classes5.dex */
public final class CaptionView extends KeyboardFrameLayout implements InterfaceC22105a, SizePicker.InterfaceC7736b, View.OnClickListener, View.OnLayoutChangeListener, KeyboardFrameLayout.InterfaceC13508a {
    public static final C12091a Companion = new C12091a(null);

    /* renamed from: A */
    private boolean f63104A;

    /* renamed from: B */
    private boolean f63105B;

    /* renamed from: C */
    private boolean f63106C;

    /* renamed from: D */
    private int f63107D;

    /* renamed from: E */
    private boolean f63108E;

    /* renamed from: F */
    private int f63109F;

    /* renamed from: G */
    private int f63110G;

    /* renamed from: H */
    private int f63111H;

    /* renamed from: I */
    private int f63112I;

    /* renamed from: J */
    private int f63113J;

    /* renamed from: K */
    private int f63114K;

    /* renamed from: L */
    private boolean f63115L;

    /* renamed from: M */
    private C16572d1 f63116M;

    /* renamed from: N */
    private final TextWatcher f63117N;

    /* renamed from: w */
    private InterfaceC12092b f63118w;

    /* renamed from: x */
    private AnimatorSet f63119x;

    /* renamed from: y */
    private final InterfaceC24854k f63120y;

    /* renamed from: z */
    private final InterfaceC24854k f63121z;

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$a */
    /* loaded from: classes5.dex */
    public static final class C12091a {
        private C12091a() {
        }

        public /* synthetic */ C12091a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC12092b {
        /* renamed from: a */
        void mo38361a(AbstractC21351f abstractC21351f);

        /* renamed from: b */
        void mo38362b(C21357l c21357l);

        /* renamed from: c */
        void mo38363c(boolean z11);

        /* renamed from: j */
        void mo38364j(String str);

        /* renamed from: k */
        void mo38365k(String str);
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$c */
    /* loaded from: classes5.dex */
    static final class C12093c extends AbstractC19075u implements InterfaceC18494a {
        C12093c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29991q1 mo12V4() {
            C29991q1 m148385a = C29991q1.m148385a(CaptionView.this);
            AbstractC19074t.m100207e(m148385a, "bind(...)");
            return m148385a;
        }
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$d */
    /* loaded from: classes5.dex */
    public static final class C12094d implements ColorPalette.InterfaceC7576b {
        C12094d() {
        }

        @Override // com.zing.zalo.camera.colorpalette.ColorPalette.InterfaceC7576b
        /* renamed from: a */
        public void mo39170a(int i11, AbstractC26235a abstractC26235a, boolean z11) {
            AbstractC19074t.m100208f(abstractC26235a, "colorData");
            CaptionView.this.getPresenter().mo67481a5(abstractC26235a, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$e */
    /* loaded from: classes5.dex */
    static final class C12095e extends AbstractC19075u implements InterfaceC18494a {
        C12095e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22106b mo12V4() {
            CaptionView captionView = CaptionView.this;
            C29669a m120715u = AbstractC23306f.m120715u();
            AbstractC19074t.m100207e(m120715u, "provideCameraRepository(...)");
            return new C22106b(captionView, m120715u);
        }
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$f */
    /* loaded from: classes5.dex */
    public static final class C12096f extends AnimatorListenerAdapter {
        C12096f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            if (CaptionView.this.f63119x != null && AbstractC19074t.m100204b(CaptionView.this.f63119x, animator)) {
                CaptionView.this.f63119x = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            try {
                if (CaptionView.this.f63119x != null && AbstractC19074t.m100204b(CaptionView.this.f63119x, animator)) {
                    CaptionView captionView = CaptionView.this;
                    captionView.m67423H0(captionView.m67456g0());
                    CaptionView.this.f63119x = null;
                }
                CaptionView.this.m67431d1();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.CaptionView$g */
    /* loaded from: classes5.dex */
    public static final class C12097g extends AbstractC18391a {
        C12097g() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            boolean z11;
            int i14;
            int m127178g0;
            try {
                AutoSizeEditText autoSizeEditText = CaptionView.this.getBinding().f139073r;
                AbstractC19074t.m100207e(autoSizeEditText, "captionAutoSizeText");
                CaptionView captionView = CaptionView.this;
                if (autoSizeEditText.getLineCount() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                captionView.f63108E = z11;
                AppCompatImageButton appCompatImageButton = CaptionView.this.getBinding().f139072q;
                if (CaptionView.this.f63108E && !CaptionView.this.f63115L) {
                    ColorPalette colorPalette = CaptionView.this.getBinding().f139075t;
                    AbstractC19074t.m100207e(colorPalette, "captionColorPalette");
                    if (colorPalette.getVisibility() != 0) {
                        i14 = 0;
                        appCompatImageButton.setVisibility(i14);
                        if (charSequence != null && charSequence.length() != 0) {
                            autoSizeEditText.removeTextChangedListener(this);
                            if (((String[]) new C24329j("\r\n|\r|\n").m127021i(charSequence.toString(), 0).toArray(new String[0])).length > 20 && m127178g0 > 0 && m127178g0 < charSequence.length()) {
                                String substring = charSequence.toString().substring(0, m127178g0);
                                AbstractC19074t.m100207e(substring, "substring(...)");
                                autoSizeEditText.setText(substring);
                                autoSizeEditText.setSelection(substring.length());
                            }
                            autoSizeEditText.addTextChangedListener(this);
                        }
                        return;
                    }
                }
                i14 = 4;
                appCompatImageButton.setVisibility(i14);
                if (charSequence != null) {
                    autoSizeEditText.removeTextChangedListener(this);
                    if (((String[]) new C24329j("\r\n|\r|\n").m127021i(charSequence.toString(), 0).toArray(new String[0])).length > 20) {
                        m127178g0 = AbstractC24342w.m127178g0(charSequence.toString(), "\n", 0, false, 6, null);
                        String substring2 = charSequence.toString().substring(0, m127178g0);
                        AbstractC19074t.m100207e(substring2, "substring(...)");
                        autoSizeEditText.setText(substring2);
                        autoSizeEditText.setSelection(substring2.length());
                    }
                    autoSizeEditText.addTextChangedListener(this);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C12093c());
        this.f63120y = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12095e());
        this.f63121z = m129210a2;
        boolean z11 = true;
        this.f63104A = true;
        if (AbstractC32212c.m155331a(getContext()) != 90 && AbstractC32212c.m155331a(getContext()) != 270) {
            z11 = false;
        }
        this.f63115L = z11;
        this.f63117N = new C12097g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m67419C0(C29991q1 c29991q1) {
        AbstractC19074t.m100208f(c29991q1, "$this_with");
        c29991q1.f139075t.m39169j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public static final void m67421D0(CaptionView captionView) {
        AbstractC19074t.m100208f(captionView, "this$0");
        captionView.m67453X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public final void m67423H0(C21357l c21357l) {
        this.f63105B = false;
        InterfaceC12092b interfaceC12092b = this.f63118w;
        if (interfaceC12092b != null) {
            interfaceC12092b.mo38363c(false);
            interfaceC12092b.mo38362b(c21357l);
        }
        this.f63106C = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m67424K0(CaptionView captionView) {
        AbstractC19074t.m100208f(captionView, "this$0");
        captionView.requestLayout();
        captionView.getBinding().f139080y.getOpenSizePickerAnimator().start();
        InterfaceC12092b interfaceC12092b = captionView.f63118w;
        if (interfaceC12092b != null) {
            interfaceC12092b.mo38363c(true);
        }
    }

    /* renamed from: L0 */
    private final void m67426L0() {
        C29991q1 binding = getBinding();
        if (binding.f139075t.getVisibility() == 0) {
            int i11 = 4;
            binding.f139075t.setVisibility(4);
            binding.f139077v.setVisibility(0);
            AppCompatImageButton appCompatImageButton = binding.f139072q;
            if (this.f63108E) {
                i11 = 0;
            }
            appCompatImageButton.setVisibility(i11);
            binding.f139079x.setVisibility(0);
            binding.f139074s.setImageResource(AbstractC16803z.icn_header_editphoto_caption_color_normal);
            return;
        }
        getPresenter().mo67483fh();
        mo67462j("121N073");
        m67454b1("text_click_notclear");
    }

    /* renamed from: V */
    private final void m67429V(Integer num) {
        int i11;
        C29991q1 binding = getBinding();
        ViewGroup.LayoutParams layoutParams = binding.f139074s.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = binding.f139077v.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = binding.f139072q.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams4 = binding.f139079x.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        ViewGroup.LayoutParams layoutParams5 = binding.f139075t.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = this.f63107D;
        }
        marginLayoutParams.bottomMargin = this.f63109F + i11;
        marginLayoutParams2.bottomMargin = this.f63110G + i11;
        marginLayoutParams5.bottomMargin = this.f63113J + i11;
        marginLayoutParams4.bottomMargin = this.f63112I + i11;
        marginLayoutParams3.bottomMargin = i11 + this.f63111H;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m67430b0(CaptionView captionView, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        captionView.m67429V(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public final void m67431d1() {
        C29991q1 binding = getBinding();
        binding.f139081z.setAlpha(1.0f);
        binding.f139080y.setTranslationX(0.0f);
        binding.f139076u.setAlpha(1.0f);
        binding.f139074s.setAlpha(1.0f);
        binding.f139074s.setTranslationX(0.0f);
        binding.f139077v.setAlpha(1.0f);
        binding.f139075t.setAlpha(1.0f);
        binding.f139079x.setAlpha(1.0f);
        binding.f139079x.setTranslationX(0.0f);
        binding.f139072q.setAlpha(1.0f);
        binding.f139072q.setTranslationX(1.0f);
        getBinding().f139072q.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29991q1 getBinding() {
        return (C29991q1) this.f63120y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC12098a getPresenter() {
        return (InterfaceC12098a) this.f63121z.getValue();
    }

    private final float getTextScaleSize() {
        return getBinding().f139073r.getScaleSize();
    }

    private final List<Animator> getTopPanelAnimators() {
        ArrayList arrayList = new ArrayList();
        C29991q1 binding = getBinding();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(binding.f139081z, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat, "ofFloat(...)");
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(binding.f139076u, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat2, "ofFloat(...)");
        arrayList.add(ofFloat2);
        return arrayList;
    }

    /* renamed from: l0 */
    private final void m67432l0() {
        final C29991q1 binding = getBinding();
        binding.f139073r.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l70.d
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m67435n0;
                m67435n0 = CaptionView.m67435n0(C29991q1.this, view, windowInsets);
                return m67435n0;
            }
        });
        binding.f139076u.setOnClickListener(this);
        AutoSizeEditText autoSizeEditText = binding.f139073r;
        autoSizeEditText.setInputType(147457);
        autoSizeEditText.setImeOptions(1107296256);
        autoSizeEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(360)});
        autoSizeEditText.addTextChangedListener(this.f63117N);
        autoSizeEditText.setMaxWidth(Math.min(AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0()) - AbstractC23222t7.f112526H);
        autoSizeEditText.setMinEms(1);
        binding.f139080y.setDelegate(this);
        binding.f139080y.setLocation(0.5833333f);
        binding.f139079x.setIncludePadding(true);
        binding.f139079x.setOnClickListener(this);
        binding.f139077v.setOnClickListener(this);
        binding.f139072q.setOnClickListener(this);
        binding.f139074s.setOnClickListener(this);
        ColorPalette colorPalette = binding.f139075t;
        colorPalette.setColorPaletteListener(new C12094d());
        colorPalette.post(new Runnable() { // from class: l70.e
            @Override // java.lang.Runnable
            public final void run() {
                CaptionView.m67419C0(C29991q1.this);
            }
        });
        colorPalette.setVisibility(4);
        colorPalette.setExtraPaddingLeft(AbstractC23136l9.m118736p(AbstractC16802y.caption_color_button_size) / 2);
        this.f63116M = new C16572d1(binding.f139073r, false, null);
        setOnKeyboardListener(this);
        setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final WindowInsets m67435n0(final C29991q1 c29991q1, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(c29991q1, "$this_with");
        AbstractC19074t.m100208f(view, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "insets");
        c29991q1.f139073r.post(new Runnable() { // from class: l70.h
            @Override // java.lang.Runnable
            public final void run() {
                CaptionView.m67438p0(C29991q1.this);
            }
        });
        return windowInsets;
    }

    /* renamed from: n1 */
    private final void m67436n1(List list) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setInterpolator(new C26088c());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C12096f());
        animatorSet.start();
        this.f63119x = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m67438p0(C29991q1 c29991q1) {
        AbstractC19074t.m100208f(c29991q1, "$this_with");
        c29991q1.f139073r.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEditingDecorText$lambda$19$lambda$17(C29991q1 c29991q1) {
        AbstractC19074t.m100208f(c29991q1, "$this_with");
        c29991q1.f139073r.requestFocus();
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: Aq */
    public void mo67445Aq(C21700a c21700a) {
        if (c21700a != null) {
            CaptionRoundedTextView captionRoundedTextView = getBinding().f139077v;
            captionRoundedTextView.setText(c21700a.m111994e());
            captionRoundedTextView.setTypeface(c21700a.m111995f());
            captionRoundedTextView.setDrawStroke(true);
            captionRoundedTextView.setDrawBackground(false);
            captionRoundedTextView.setStrokeColor(-1);
            captionRoundedTextView.setTextColor(-1);
        }
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: I6 */
    public void mo67446I6(int i11) {
        AutoSizeEditText autoSizeEditText = getBinding().f139073r;
        ViewGroup.LayoutParams layoutParams = autoSizeEditText.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    autoSizeEditText.setGravity(3);
                    layoutParams2.gravity = 19;
                }
            } else {
                autoSizeEditText.setGravity(17);
                layoutParams2.gravity = 17;
            }
        } else {
            autoSizeEditText.setGravity(5);
            layoutParams2.gravity = 21;
        }
        autoSizeEditText.setLayoutParams(layoutParams2);
    }

    /* renamed from: P */
    public final void m67447P(boolean z11) {
        this.f63115L = z11;
        getPresenter().mo67484h1(!z11);
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: Q3 */
    public void mo67448Q3() {
        C29991q1 binding = getBinding();
        int i11 = 4;
        if (binding.f139075t.getVisibility() == 0) {
            binding.f139075t.setVisibility(4);
            binding.f139077v.setVisibility(0);
            AppCompatImageButton appCompatImageButton = binding.f139072q;
            if (this.f63108E) {
                i11 = 0;
            }
            appCompatImageButton.setVisibility(i11);
            binding.f139079x.setVisibility(0);
            binding.f139074s.setImageResource(AbstractC16803z.icn_header_editphoto_caption_color_normal);
            return;
        }
        binding.f139075t.setVisibility(0);
        binding.f139077v.setVisibility(4);
        binding.f139072q.setVisibility(4);
        binding.f139079x.setVisibility(4);
        binding.f139074s.setImageResource(AbstractC16803z.icn_header_editphoto_caption_color_collapsed);
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: Qe */
    public void mo67449Qe(C21357l c21357l) {
        InterfaceC12092b interfaceC12092b = this.f63118w;
        if (interfaceC12092b != null) {
            interfaceC12092b.mo38361a(c21357l);
        }
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: Qs */
    public void mo67450Qs(int i11, boolean z11) {
        int i12;
        CaptionRoundedTextView captionRoundedTextView = getBinding().f139079x;
        captionRoundedTextView.setPadding(0, 0, 0, 0);
        if (z11) {
            captionRoundedTextView.setDrawBackground(false);
            captionRoundedTextView.setDrawStroke(true);
            captionRoundedTextView.setTextColor(-1);
            captionRoundedTextView.setStrokeColor(-1);
            captionRoundedTextView.setBackgroundColor(0);
            captionRoundedTextView.setTextColor(captionRoundedTextView.getTextColors().withAlpha(i11));
            return;
        }
        captionRoundedTextView.setDrawBackground(true);
        if (i11 == 255) {
            i12 = -16777216;
        } else {
            i12 = -1;
        }
        captionRoundedTextView.setTextColor(i12);
        captionRoundedTextView.m67501i(-1, i11);
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: Sp */
    public void mo67451Sp(C21700a c21700a) {
        if (c21700a != null) {
            try {
                Paint.FontMetrics fontMetrics = getBinding().f139073r.getPaint().getFontMetrics();
                getBinding().f139073r.m67495s(c21700a, (int) (fontMetrics.descent - fontMetrics.ascent));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: W0 */
    public final void m67452W0(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        getPresenter().mo67478S1(jSONObject);
        try {
            jSONObject.put("color_selected_pos", getBinding().f139075t.getSelectedPos());
            jSONObject.put("font_picker_pos", getPresenter().mo67471Fe());
            jSONObject.put("caption_text", getText());
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: X0 */
    public final void m67453X0() {
        C29991q1 binding = getBinding();
        List<Animator> topPanelAnimators = getTopPanelAnimators();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(binding.f139080y, "translationX", -AbstractC23222t7.f112539R);
        AbstractC19074t.m100207e(ofFloat, "ofFloat(...)");
        topPanelAnimators.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(binding.f139074s, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat2, "ofFloat(...)");
        topPanelAnimators.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(binding.f139074s, "translationX", -AbstractC23222t7.f112539R);
        AbstractC19074t.m100207e(ofFloat3, "ofFloat(...)");
        topPanelAnimators.add(ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(binding.f139079x, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat4, "ofFloat(...)");
        topPanelAnimators.add(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(binding.f139079x, "translationX", AbstractC23222t7.f112539R);
        AbstractC19074t.m100207e(ofFloat5, "ofFloat(...)");
        topPanelAnimators.add(ofFloat5);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(binding.f139072q, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat6, "ofFloat(...)");
        topPanelAnimators.add(ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(binding.f139072q, "translationX", AbstractC23222t7.f112539R);
        AbstractC19074t.m100207e(ofFloat7, "ofFloat(...)");
        topPanelAnimators.add(ofFloat7);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(binding.f139075t, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat8, "ofFloat(...)");
        topPanelAnimators.add(ofFloat8);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(binding.f139077v, "alpha", 0.0f);
        AbstractC19074t.m100207e(ofFloat9, "ofFloat(...)");
        topPanelAnimators.add(ofFloat9);
        m67436n1(topPanelAnimators);
    }

    @Override // com.zing.zalo.camera.sizepicker.SizePicker.InterfaceC7736b
    /* renamed from: a */
    public void mo39488a(boolean z11) {
        ObjectAnimator.ofFloat(getBinding().f139080y, "translationX", -getBinding().f139080y.getDistanceFromLeftEdgeToCenterOfPicker()).start();
    }

    @Override // com.zing.zalo.camera.sizepicker.SizePicker.InterfaceC7736b
    /* renamed from: b */
    public void mo39489b() {
        ObjectAnimator.ofFloat(getBinding().f139080y, "translationX", 0.0f).start();
    }

    /* renamed from: b1 */
    public void m67454b1(String str) {
        AbstractC19074t.m100208f(str, "actionId");
        InterfaceC12092b interfaceC12092b = this.f63118w;
        if (interfaceC12092b != null) {
            interfaceC12092b.mo38365k(str);
        }
    }

    @Override // com.zing.zalo.camera.sizepicker.SizePicker.InterfaceC7736b
    /* renamed from: c */
    public void mo39490c(float f11) {
        getPresenter().mo67470E0(f11);
    }

    /* renamed from: f1 */
    public final void m67455f1(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        getPresenter().mo67482a8(jSONObject);
    }

    /* renamed from: g0 */
    public final C21357l m67456g0() {
        int i11;
        boolean z11;
        AbstractC2379w.m12430d(getBinding().f139073r);
        String text = getText();
        int length = text.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(text.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else {
                if (!z11) {
                    break;
                }
                length--;
            }
        }
        return getPresenter().mo67479Un(text.subSequence(i12, length + 1).toString(), getTextSize(), getBinding().f139075t.getSelectedPos(), getTextScaleSize());
    }

    public final AutoSizeEditText getCaptionInputText() {
        AutoSizeEditText autoSizeEditText = getBinding().f139073r;
        AbstractC19074t.m100207e(autoSizeEditText, "captionAutoSizeText");
        return autoSizeEditText;
    }

    public final FrameLayout getCaptionTopPanel() {
        FrameLayout frameLayout = getBinding().f139081z;
        AbstractC19074t.m100207e(frameLayout, "captionTopPanel");
        return frameLayout;
    }

    public final InterfaceC12092b getEventListener() {
        return this.f63118w;
    }

    public final int getInputTextWidth() {
        return getBinding().f139073r.getLayout().getWidth();
    }

    public final String getText() {
        String obj;
        Editable text = getBinding().f139073r.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final int getTextBottomMargin() {
        boolean z11;
        int i11;
        if (!AbstractC23136l9.m118666N0(getBinding().f139077v) && !AbstractC23136l9.m118666N0(getBinding().f139075t)) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i12 = this.f63107D;
        if (z11) {
            i11 = AbstractC23222t7.f112547Z * 2;
        } else {
            i11 = AbstractC23222t7.f112572m;
        }
        return i12 + i11;
    }

    public final int getTextHeight() {
        return Math.max(getBinding().f139073r.getHeight(), AbstractC23222t7.f112577o0);
    }

    public final int getTextSize() {
        return (int) getBinding().f139073r.getTextSize();
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: h1 */
    public void mo67457h1(boolean z11) {
        int i11;
        int i12 = 0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        C29991q1 binding = getBinding();
        binding.f139080y.setVisibility(i11);
        binding.f139074s.setVisibility(i11);
        binding.f139077v.setVisibility(i11);
        binding.f139079x.setVisibility(i11);
        AppCompatImageButton appCompatImageButton = binding.f139072q;
        if (!z11 || !this.f63108E) {
            i12 = 4;
        }
        appCompatImageButton.setVisibility(i12);
        binding.f139075t.setVisibility(4);
    }

    /* renamed from: i0 */
    public final void m67458i0() {
        getPresenter().mo67473Ne();
    }

    /* renamed from: i1 */
    public final void m67459i1() {
        getPresenter().mo67474O5(getBinding().f139075t.getSelectedPos());
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: iF */
    public void mo67460iF(int i11, int i12, int i13) {
        AutoSizeEditText autoSizeEditText = getBinding().f139073r;
        autoSizeEditText.setMemeMode(false);
        autoSizeEditText.setLightMode(getPresenter().mo67475Oh());
        autoSizeEditText.setTextColor(i11);
        autoSizeEditText.setTextColor(autoSizeEditText.getTextColors().withAlpha(255));
        autoSizeEditText.m67494r(i12, i13);
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: iG */
    public void mo67461iG(int i11) {
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = AbstractC16803z.icn_editphoto_align_panel_right_normal;
            } else {
                i12 = AbstractC16803z.icn_editphoto_align_panel_left_normal;
            }
        } else {
            i12 = AbstractC16803z.icn_editphoto_align_panel_center_normal;
        }
        getBinding().f139072q.setImageResource(i12);
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: j */
    public void mo67462j(String str) {
        AbstractC19074t.m100208f(str, "actionLog");
        InterfaceC12092b interfaceC12092b = this.f63118w;
        if (interfaceC12092b != null) {
            interfaceC12092b.mo38364j(str);
        }
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: l */
    public void mo67463l() {
        AbstractC17927b.Companion.m94536b().mo94527a("CAPTION_VIEW_ON_DONE", new Runnable() { // from class: l70.f
            @Override // java.lang.Runnable
            public final void run() {
                CaptionView.m67421D0(CaptionView.this);
            }
        }, 1000L);
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: ng */
    public void mo67464ng(float f11) {
        getBinding().f139073r.setScaleSize((f11 * 1.5f) + 0.375f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (view == this) {
            try {
                if (this.f63104A) {
                    m67426L0();
                    return;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.caption_done) {
            getPresenter().mo67483fh();
            m67454b1("text_done_notclear");
            return;
        }
        if (id2 == AbstractC6918a0.caption_color) {
            getPresenter().mo67476Q3();
            return;
        }
        if (id2 == AbstractC6918a0.caption_font_selector) {
            getPresenter().mo67472G6();
        } else if (id2 == AbstractC6918a0.caption_mode_selector) {
            getPresenter().mo67485jc();
        } else if (id2 == AbstractC6918a0.caption_align) {
            getPresenter().mo67469Cj();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f63107D = AbstractC23309i.m122007i5(getContext());
        this.f63109F = getResources().getDimensionPixelSize(AbstractC16802y.caption_color_margin_bottom);
        this.f63110G = getResources().getDimensionPixelSize(AbstractC16802y.caption_font_selector_margin_bottom);
        this.f63111H = getResources().getDimensionPixelSize(AbstractC16802y.caption_align_margin_bottom);
        this.f63112I = getResources().getDimensionPixelSize(AbstractC16802y.caption_mode_selector_margin_bottom);
        this.f63113J = getResources().getDimensionPixelSize(AbstractC16802y.caption_color_palette_margin_bottom);
        this.f63114K = getResources().getDimensionPixelSize(AbstractC16802y.caption_size_picker_margin_bottom);
        m67432l0();
        m67430b0(this, null, 1, null);
        requestLayout();
        addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (motionEvent.getY() < (AbstractC23136l9.m118713h0() - this.f63107D) - AbstractC23222t7.f112547Z) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f63104A = z11;
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int height;
        ViewGroup.LayoutParams layoutParams = getBinding().f139080y.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (getBinding().f139080y.getHeight() > 0) {
            height = getBinding().f139080y.getHeight();
        } else if (AbstractC23136l9.m118656I0()) {
            height = getHeight() / 3;
        } else {
            height = getHeight() / 2;
        }
        marginLayoutParams.bottomMargin = this.f63107D + (((getHeight() - this.f63107D) - height) / 2);
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i14 - i12;
        int i21 = i18 - i16;
        if (i19 == i21 || !this.f63106C) {
            return;
        }
        m67429V(Integer.valueOf(this.f63107D + (i19 - i21)));
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: pi */
    public void mo67465pi(int i11) {
        AutoSizeEditText autoSizeEditText = getBinding().f139073r;
        autoSizeEditText.setMemeMode(true);
        autoSizeEditText.setLightMode(getPresenter().mo67475Oh());
        autoSizeEditText.setTextColor(i11);
        if (autoSizeEditText.m67493i()) {
            autoSizeEditText.setTextColor(autoSizeEditText.getTextColors().withAlpha(127));
        } else {
            autoSizeEditText.setTextColor(autoSizeEditText.getTextColors().withAlpha(255));
        }
        autoSizeEditText.setBackgroundLineColor(0);
    }

    @Override // l70.InterfaceC22105a
    public void setColorPaletteData(List<? extends AbstractC26235a> list) {
        AbstractC19074t.m100208f(list, "colorPaletteData");
        getBinding().f139075t.setColorList(list);
    }

    @Override // l70.InterfaceC22105a
    public void setColorPaletteSelectedPos(int i11) {
        getBinding().f139075t.setSelectedPos(i11);
    }

    public final void setEditingDecorText(C21357l c21357l) {
        int i11;
        AbstractC19074t.m100208f(c21357l, "decorText");
        String m110654E0 = c21357l.m110654E0();
        final C29991q1 binding = getBinding();
        binding.f139073r.setText(m110654E0);
        AutoSizeEditText autoSizeEditText = binding.f139073r;
        Editable text = autoSizeEditText.getText();
        if (text != null) {
            i11 = text.length();
        } else {
            i11 = 0;
        }
        autoSizeEditText.setSelection(i11);
        binding.f139073r.setVisibility(0);
        setVisibility(0);
        AbstractC2379w.m12432f(binding.f139073r);
        binding.f139073r.postDelayed(new Runnable() { // from class: l70.g
            @Override // java.lang.Runnable
            public final void run() {
                CaptionView.setEditingDecorText$lambda$19$lambda$17(C29991q1.this);
            }
        }, 300L);
        AnimatorSet animatorSet = this.f63119x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i12 = c21357l.f104081g0;
        if (i12 >= 0) {
            binding.f139075t.setSelectedPos(i12);
        }
        binding.f139075t.m39169j();
        getPresenter().mo67477R7(c21357l.m110651B0());
        getPresenter().mo67480Zc(c21357l.m110650A0());
        int i13 = c21357l.f104082h0;
        String m110654E02 = c21357l.m110654E0();
        AbstractC19074t.m100207e(m110654E02, "getText(...)");
        if (m110654E02.length() > 0 && i13 >= 0 && i13 < getPresenter().mo67487ol()) {
            getPresenter().mo67486of(i13);
        } else {
            getPresenter().mo67486of(getPresenter().mo67471Fe());
        }
        InterfaceC12098a.a.m67488a(getPresenter(), binding.f139075t.getColorItem(), false, 2, null);
        this.f63105B = true;
    }

    public final void setEventListener(InterfaceC12092b interfaceC12092b) {
        this.f63118w = interfaceC12092b;
    }

    @Override // l70.InterfaceC22105a
    /* renamed from: wi */
    public void mo67466wi(boolean z11) {
        C23081g9.m118410g(30L);
        getBinding().f139075t.m39168g(z11);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        if (this.f63106C && this.f63105B) {
            getBinding().f139073r.setKeyboardHeight(i11);
            m67453X0();
        }
        this.f63106C = false;
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(int i11) {
        this.f63106C = true;
        this.f63107D = i11;
        AutoSizeEditText autoSizeEditText = getBinding().f139073r;
        autoSizeEditText.setBottomHeight(getBinding().f139072q.getMeasuredHeight() + (this.f63111H * 2));
        autoSizeEditText.setTopHeight(getBinding().f139081z.getMeasuredHeight() + AbstractC23222t7.f112586t);
        autoSizeEditText.setKeyboardHeight(i11);
        m67430b0(this, null, 1, null);
        postDelayed(new Runnable() { // from class: l70.c
            @Override // java.lang.Runnable
            public final void run() {
                CaptionView.m67424K0(CaptionView.this);
            }
        }, 50L);
    }
}
