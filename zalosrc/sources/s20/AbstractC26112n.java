package s20;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.shortvideo.data.model.Content;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19044c;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import java.util.Arrays;
import java.util.Iterator;
import ln0.AbstractC22543l;
import p338m2.InterfaceC22715a;
import pm0.C24848g0;
import q20.C25078a;
import s20.AbstractC26112n;
import u20.C26983d;
import u20.ViewOnClickListenerC26991l;
import v00.AbstractC27408c;

/* renamed from: s20.n */
/* loaded from: classes5.dex */
public abstract class AbstractC26112n {

    /* renamed from: s20.n$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        public static final a f124314q = new a();

        a() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m134435a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m134435a(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: s20.n$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        public static final b f124315q = new b();

        b() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m134436a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m134436a(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: s20.n$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f124316q = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m134437a(Editable editable) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m134437a((Editable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: s20.n$d */
    /* loaded from: classes5.dex */
    public static final class d implements TextWatcher {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18511r f124317p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18511r f124318q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f124319r;

        d(InterfaceC18511r interfaceC18511r, InterfaceC18511r interfaceC18511r2, InterfaceC18505l interfaceC18505l) {
            this.f124317p = interfaceC18511r;
            this.f124318q = interfaceC18511r2;
            this.f124319r = interfaceC18505l;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f124319r.mo205i9(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f124317p.mo49340Uc(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f124318q.mo49340Uc(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    /* renamed from: s20.n$e */
    /* loaded from: classes5.dex */
    public static final class e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C19051f0 f124320p;

        /* renamed from: q */
        final /* synthetic */ RecyclerView f124321q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f124322r;

        e(C19051f0 c19051f0, RecyclerView recyclerView, InterfaceC18505l interfaceC18505l) {
            this.f124320p = c19051f0;
            this.f124321q = recyclerView;
            this.f124322r = interfaceC18505l;
        }

        /* renamed from: b */
        public static final void m134439b(RecyclerView recyclerView, e eVar) {
            AbstractC19074t.m100208f(recyclerView, "$this_doOnAnimationFinished");
            AbstractC19074t.m100208f(eVar, "this$0");
            recyclerView.post(eVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f124320p.f94928p && !this.f124321q.m9859U0()) {
                try {
                    this.f124322r.mo205i9(this.f124321q);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (this.f124321q.m9859U0()) {
                this.f124320p.f94928p = false;
            }
            RecyclerView.AbstractC1885l itemAnimator = this.f124321q.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.m10051q(new RecyclerView.AbstractC1885l.a() { // from class: s20.o

                    /* renamed from: b */
                    public final /* synthetic */ AbstractC26112n.e f124330b;

                    public /* synthetic */ C26113o(AbstractC26112n.e this) {
                        r2 = this;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l.a
                    /* renamed from: a */
                    public final void mo10061a() {
                        AbstractC26112n.e.m134439b(RecyclerView.this, r2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s20.n$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f124323q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC18509p interfaceC18509p) {
            super(3);
            this.f124323q = interfaceC18509p;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m134440a((TextView) obj, ((Number) obj2).intValue(), (KeyEvent) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m134440a(TextView textView, int i11, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(textView, "view");
            if (i11 == 6) {
                this.f124323q.mo240pC(textView, keyEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s20.n$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f124324q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC18509p interfaceC18509p) {
            super(3);
            this.f124324q = interfaceC18509p;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m134441a((TextView) obj, ((Number) obj2).intValue(), (KeyEvent) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m134441a(TextView textView, int i11, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(textView, "view");
            if (i11 == 3) {
                this.f124324q.mo240pC(textView, keyEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s20.n$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f124325q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC18509p interfaceC18509p) {
            super(3);
            this.f124325q = interfaceC18509p;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m134442a((TextView) obj, ((Number) obj2).intValue(), (KeyEvent) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m134442a(TextView textView, int i11, KeyEvent keyEvent) {
            AbstractC19074t.m100208f(textView, "view");
            if (i11 == 4) {
                this.f124325q.mo240pC(textView, keyEvent);
            }
        }
    }

    /* renamed from: s20.n$i */
    /* loaded from: classes5.dex */
    public static final class i implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ View f124326p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f124327q;

        i(View view, InterfaceC18494a interfaceC18494a) {
            this.f124326p = view;
            this.f124327q = interfaceC18494a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            this.f124326p.clearAnimation();
            InterfaceC18494a interfaceC18494a = this.f124327q;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }
    }

    /* renamed from: s20.n$j */
    /* loaded from: classes5.dex */
    public static final class j extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ View f124328a;

        j(View view) {
            this.f124328a = view;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, this.f124328a.getWidth(), this.f124328a.getHeight(), 6.0f);
        }
    }

    /* renamed from: A */
    public static final Rect m134360A(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        Rect rect = new Rect();
        view.getHitRect(rect);
        return rect;
    }

    /* renamed from: B */
    public static final InputMethodManager m134361B(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    /* renamed from: C */
    public static final String m134362C(View view, int i11, int i12, Object... objArr) {
        AbstractC19074t.m100208f(view, "<this>");
        AbstractC19074t.m100208f(objArr, "formatArgs");
        if (objArr.length == 0) {
            String quantityString = view.getResources().getQuantityString(i11, i12);
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        String quantityString2 = view.getResources().getQuantityString(i11, i12, Arrays.copyOf(objArr, objArr.length));
        AbstractC19074t.m100207e(quantityString2, "getQuantityString(...)");
        return quantityString2;
    }

    /* renamed from: D */
    public static final String m134363D(View view, int i11, long j11, Object... objArr) {
        long m116589l;
        AbstractC19074t.m100208f(view, "<this>");
        AbstractC19074t.m100208f(objArr, "formatArgs");
        m116589l = AbstractC22543l.m116589l(j11, -2147483648L, 2147483647L);
        return m134362C(view, i11, (int) m116589l, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: E */
    public static final Typeface m134364E(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        Context context = view.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return C13718q1.m76694c(context, i11);
    }

    /* renamed from: F */
    public static final int m134365F(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "<this>");
        int identifier = viewGroup.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return viewGroup.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: G */
    public static final String m134366G(View view, int i11, Object... objArr) {
        AbstractC19074t.m100208f(view, "<this>");
        AbstractC19074t.m100208f(objArr, "formatArgs");
        if (objArr.length == 0) {
            String string = view.getResources().getString(i11);
            AbstractC19074t.m100207e(string, "getString(...)");
            return string;
        }
        String string2 = view.getResources().getString(i11, Arrays.copyOf(objArr, objArr.length));
        AbstractC19074t.m100207e(string2, "getString(...)");
        return string2;
    }

    /* renamed from: H */
    public static final void m134367H(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setVisibility(8);
    }

    /* renamed from: I */
    public static final void m134368I(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setAlpha(0.3f);
    }

    /* renamed from: J */
    public static final boolean m134369J(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        return m134361B(view).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: K */
    public static final View m134370K(ViewGroup viewGroup, int i11, boolean z11) {
        AbstractC19074t.m100208f(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, z11);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        return inflate;
    }

    /* renamed from: L */
    public static final InterfaceC22715a m134371L(ViewGroup viewGroup, InterfaceC18510q interfaceC18510q, boolean z11) {
        AbstractC19074t.m100208f(viewGroup, "<this>");
        AbstractC19074t.m100208f(interfaceC18510q, "inflateMethod");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        AbstractC19074t.m100207e(from, "from(...)");
        return (InterfaceC22715a) interfaceC18510q.mo45599Hr(from, viewGroup, Boolean.valueOf(z11));
    }

    /* renamed from: M */
    public static /* synthetic */ View m134372M(ViewGroup viewGroup, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return m134370K(viewGroup, i11, z11);
    }

    /* renamed from: N */
    public static /* synthetic */ InterfaceC22715a m134373N(ViewGroup viewGroup, InterfaceC18510q interfaceC18510q, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m134371L(viewGroup, interfaceC18510q, z11);
    }

    /* renamed from: O */
    public static final void m134374O(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setVisibility(4);
    }

    /* renamed from: P */
    public static final boolean m134375P(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (m134380U(view) && view.getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public static final boolean m134376Q(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public static final boolean m134377R(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static final boolean m134378S(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static final boolean m134379T(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (view.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public static final boolean m134380U(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public static final void m134381V(View view, int i11, int i12) {
        AbstractC19074t.m100208f(view, "<this>");
        view.layout(i12, i11 - view.getMeasuredHeight(), view.getMeasuredWidth() + i12, i11);
    }

    /* renamed from: W */
    public static final void m134382W(View view, int i11, int i12) {
        AbstractC19074t.m100208f(view, "<this>");
        view.layout(i12 - view.getMeasuredWidth(), i11 - view.getMeasuredHeight(), i12, i11);
    }

    /* renamed from: X */
    public static final void m134383X(View view, int i11, int i12) {
        AbstractC19074t.m100208f(view, "<this>");
        view.layout(i12, i11, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i11);
    }

    /* renamed from: Y */
    public static final void m134384Y(View view, int i11, int i12) {
        AbstractC19074t.m100208f(view, "<this>");
        view.layout(i12 - view.getMeasuredWidth(), i11, i12, view.getMeasuredHeight() + i11);
    }

    /* renamed from: Z */
    public static final void m134385Z(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setAlpha(0.0f);
    }

    /* renamed from: a0 */
    public static final void m134387a0(View view, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, i12), View.MeasureSpec.makeMeasureSpec(i13, i14));
    }

    /* renamed from: b0 */
    public static final void m134389b0(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        if (C25078a.f120479a.m129999a()) {
            view.setForeground(m134434z(view, AbstractC27408c.zch_bg_ripple_quick_anim));
            view.setClipToOutline(true);
            view.setOutlineProvider(new j(view));
            return;
        }
        view.setBackground(m134434z(view, AbstractC27408c.zch_bg_ripple_rectangle));
    }

    /* renamed from: c */
    private static final void m134390c(EditText editText, InterfaceC18511r interfaceC18511r, InterfaceC18511r interfaceC18511r2, InterfaceC18505l interfaceC18505l) {
        editText.addTextChangedListener(new d(interfaceC18511r, interfaceC18511r2, interfaceC18505l));
    }

    /* renamed from: c0 */
    public static final void m134391c0(View view, int i11, float f11) {
        AbstractC19074t.m100208f(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f11);
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }

    /* renamed from: d */
    static /* synthetic */ void m134392d(EditText editText, InterfaceC18511r interfaceC18511r, InterfaceC18511r interfaceC18511r2, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC18511r = a.f124314q;
        }
        if ((i11 & 2) != 0) {
            interfaceC18511r2 = b.f124315q;
        }
        if ((i11 & 4) != 0) {
            interfaceC18505l = c.f124316q;
        }
        m134390c(editText, interfaceC18511r, interfaceC18511r2, interfaceC18505l);
    }

    /* renamed from: d0 */
    public static final void m134393d0(TextView textView, Content content) {
        AbstractC19074t.m100208f(textView, "<this>");
        if (content == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(content.m50896c());
        Content.Highlight[] m50895b = content.m50895b();
        if (m50895b != null && m50895b.length != 0) {
            Iterator m100149a = AbstractC19044c.m100149a(content.m50895b());
            while (m100149a.hasNext()) {
                Content.Highlight highlight = (Content.Highlight) m100149a.next();
                Integer m50901d = highlight.m50901d();
                if (m50901d != null) {
                    m50901d.intValue();
                    Integer m50900c = highlight.m50900c();
                    if (m50900c != null) {
                        m50900c.intValue();
                        spannableString.setSpan(new C26983d(m134364E(textView, 9)), Math.max(highlight.m50901d().intValue(), 0), Math.min(content.m50896c().length(), highlight.m50900c().intValue() + 1), 33);
                        if (highlight.m50899b() != null) {
                            int parseColor = Color.parseColor(highlight.m50899b());
                            Float m50898a = highlight.m50898a();
                            if (m50898a != null) {
                                spannableString.setSpan(new ForegroundColorSpan(Color.argb((int) (m50898a.floatValue() * 255), (parseColor >> 16) & 255, (parseColor >> 8) & 255, parseColor & 255)), Math.max(highlight.m50901d().intValue(), 0), Math.min(content.m50896c().length(), highlight.m50900c().intValue() + 1), 33);
                            }
                        }
                    }
                }
            }
        }
        textView.setText(spannableString);
    }

    /* renamed from: e */
    public static final void m134394e(View view, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(view, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100205c(layoutParams);
        interfaceC18505l.mo205i9(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: e0 */
    public static final void m134395e0(TextView textView, Content content) {
        AbstractC19074t.m100208f(textView, "<this>");
        if (content == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(content.m50896c());
        Content.Highlight[] m50895b = content.m50895b();
        if (m50895b != null && m50895b.length != 0) {
            Iterator m100149a = AbstractC19044c.m100149a(content.m50895b());
            while (m100149a.hasNext()) {
                Content.Highlight highlight = (Content.Highlight) m100149a.next();
                Integer m50901d = highlight.m50901d();
                if (m50901d != null) {
                    m50901d.intValue();
                    Integer m50900c = highlight.m50900c();
                    if (m50900c != null) {
                        m50900c.intValue();
                        spannableString.setSpan(new C26983d(m134364E(textView, 9)), Math.max(highlight.m50901d().intValue(), 0), Math.min(content.m50896c().length(), highlight.m50900c().intValue() + 1), 33);
                    }
                }
            }
        }
        textView.setText(spannableString);
    }

    /* renamed from: f */
    public static final void m134396f(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setAlpha(1.0f);
    }

    /* renamed from: f0 */
    public static final void m134397f0(TextView textView, Drawable drawable) {
        AbstractC19074t.m100208f(textView, "<this>");
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    /* renamed from: g */
    public static final void m134398g(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setEnabled(false);
    }

    /* renamed from: g0 */
    public static final void m134399g0(TextView textView, int i11) {
        AbstractC19074t.m100208f(textView, "<this>");
        m134401h0(textView, m134434z(textView, i11));
    }

    /* renamed from: h */
    public static final void m134400h(EditText editText, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(editText, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        m134392d(editText, null, null, interfaceC18505l, 3, null);
    }

    /* renamed from: h0 */
    public static final void m134401h0(TextView textView, Drawable drawable) {
        AbstractC19074t.m100208f(textView, "<this>");
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    /* renamed from: i */
    public static final void m134402i(EditText editText, InterfaceC18510q interfaceC18510q) {
        AbstractC19074t.m100208f(editText, "<this>");
        AbstractC19074t.m100208f(interfaceC18510q, "action");
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: s20.m
            public /* synthetic */ C26111m() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m134404j;
                m134404j = AbstractC26112n.m134404j(InterfaceC18510q.this, textView, i11, keyEvent);
                return m134404j;
            }
        });
    }

    /* renamed from: i0 */
    public static final void m134403i0(TextView textView, Drawable drawable) {
        AbstractC19074t.m100208f(textView, "<this>");
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    /* renamed from: j */
    public static final boolean m134404j(InterfaceC18510q interfaceC18510q, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(interfaceC18510q, "$action");
        AbstractC19074t.m100205c(textView);
        interfaceC18510q.mo45599Hr(textView, Integer.valueOf(i11), keyEvent);
        return true;
    }

    /* renamed from: j0 */
    public static final void m134405j0(View view, View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(view, "<this>");
        AbstractC19074t.m100208f(onClickListener, "listener");
        view.setOnClickListener(new ViewOnClickListenerC26991l(onClickListener));
    }

    /* renamed from: k */
    public static final void m134406k(RecyclerView recyclerView, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(recyclerView, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        C19051f0 c19051f0 = new C19051f0();
        c19051f0.f94928p = true;
        recyclerView.post(new e(c19051f0, recyclerView, interfaceC18505l));
    }

    /* renamed from: k0 */
    public static final void m134407k0(View view, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(view, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        view.setOnClickListener(new ViewOnClickListenerC26991l(new View.OnClickListener() { // from class: s20.l
            public /* synthetic */ ViewOnClickListenerC26110l() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC26112n.m134409l0(InterfaceC18505l.this, view2);
            }
        }));
    }

    /* renamed from: l */
    public static final void m134408l(EditText editText, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(editText, "<this>");
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        m134402i(editText, new f(interfaceC18509p));
    }

    /* renamed from: l0 */
    public static final void m134409l0(InterfaceC18505l interfaceC18505l, View view) {
        AbstractC19074t.m100208f(interfaceC18505l, "$tmp0");
        interfaceC18505l.mo205i9(view);
    }

    /* renamed from: m */
    public static final void m134410m(EditText editText, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(editText, "<this>");
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        m134402i(editText, new g(interfaceC18509p));
    }

    /* renamed from: m0 */
    public static final void m134411m0(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    /* renamed from: n */
    public static final void m134412n(EditText editText, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(editText, "<this>");
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        m134402i(editText, new h(interfaceC18509p));
    }

    /* renamed from: n0 */
    public static final void m134413n0(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setPadding(i11, view.getPaddingTop(), i11, view.getPaddingBottom());
    }

    /* renamed from: o */
    public static final void m134414o(EditText editText, InterfaceC18511r interfaceC18511r) {
        AbstractC19074t.m100208f(editText, "<this>");
        AbstractC19074t.m100208f(interfaceC18511r, "action");
        m134392d(editText, null, interfaceC18511r, null, 5, null);
    }

    /* renamed from: o0 */
    public static final void m134415o0(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setPadding(i11, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    /* renamed from: p */
    public static final void m134416p(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setEnabled(true);
    }

    /* renamed from: p0 */
    public static final void m134417p0(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i11, view.getPaddingBottom());
    }

    /* renamed from: q */
    public static final void m134418q(View view, long j11, long j12, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(view, "<this>");
        view.animate().cancel();
        view.animate().alpha(1.0f).setStartDelay(j11).setListener(new i(view, interfaceC18494a)).setDuration(j12).start();
    }

    /* renamed from: q0 */
    public static final void m134419q0(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* renamed from: r */
    public static /* synthetic */ void m134420r(View view, long j11, long j12, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = 300;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            interfaceC18494a = null;
        }
        m134418q(view, j13, j14, interfaceC18494a);
    }

    /* renamed from: r0 */
    public static final void m134421r0(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i11);
    }

    /* renamed from: s */
    public static final int m134422s(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        return (view.getRight() + view.getLeft()) / 2;
    }

    /* renamed from: s0 */
    public static final void m134423s0(View view, float f11) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setScaleX(f11);
        view.setScaleY(f11);
    }

    /* renamed from: t */
    public static final int m134424t(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        return (view.getBottom() + view.getTop()) / 2;
    }

    /* renamed from: t0 */
    public static final void m134425t0(TextView textView, int i11) {
        AbstractC19074t.m100208f(textView, "<this>");
        textView.setTextColor(m134426u(textView, i11));
    }

    /* renamed from: u */
    public static final int m134426u(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        return AbstractC1401h.m7080d(view.getResources(), i11, view.getContext().getTheme());
    }

    /* renamed from: u0 */
    public static final boolean m134427u0(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        InputMethodManager m134361B = m134361B(view);
        m134416p(view);
        view.requestFocus();
        return m134361B.showSoftInput(view, 1);
    }

    /* renamed from: v */
    public static final int m134428v(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        return (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
    }

    /* renamed from: v0 */
    public static final void m134429v0(ImageView imageView, int i11) {
        AbstractC19074t.m100208f(imageView, "<this>");
        if (imageView.getDrawable() != null) {
            AbstractC1414a.m7196n(imageView.getDrawable(), i11);
        }
    }

    /* renamed from: w */
    public static final int m134430w(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        return view.getTop() + view.getPaddingTop();
    }

    /* renamed from: w0 */
    public static final void m134431w0(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setVisibility(0);
    }

    /* renamed from: x */
    public static final int m134432x(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        return (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    /* renamed from: y */
    public static final int m134433y(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        return view.getResources().getDimensionPixelSize(i11);
    }

    /* renamed from: z */
    public static final Drawable m134434z(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        Drawable m7082f = AbstractC1401h.m7082f(view.getResources(), i11, view.getContext().getTheme());
        if (m7082f != null) {
            return m7082f;
        }
        throw new Resources.NotFoundException();
    }
}
