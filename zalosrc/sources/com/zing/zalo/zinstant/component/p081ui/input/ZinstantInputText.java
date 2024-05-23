package com.zing.zalo.zinstant.component.p081ui.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.C17189a;
import com.zing.zalo.zinstant.utils.C17193e;
import com.zing.zalo.zinstant.utils.C17202n;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.model.TransformDrawing;
import com.zing.zalo.zinstant.zom.node.ZOMInput;
import com.zing.zalo.zinstant.zom.properties.ZOMInputText;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ln0.AbstractC22543l;
import nk0.AbstractC23838k1;
import nk0.C23813c0;
import nk0.C23855s0;
import nk0.InterfaceC23860v;
import qk0.InterfaceC25307c;
import uk0.C27291e;
import uk0.InterfaceC27287a;
import vj0.AbstractC28274h;
import wj0.AbstractC29060a;
import wj0.InterfaceC29061b;
import xj0.C29684c;
import xj0.InterfaceC29683b;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class ZinstantInputText extends AppCompatEditText implements InterfaceC29061b, InterfaceC29683b {

    /* renamed from: s */
    private final C23813c0 f87549s;

    /* renamed from: t */
    private WeakReference f87550t;

    /* renamed from: u */
    private final Rect f87551u;

    /* renamed from: v */
    private C27291e f87552v;

    /* renamed from: w */
    private TextWatcher f87553w;

    /* renamed from: x */
    private final UnderlineSpan f87554x;

    /* renamed from: com.zing.zalo.zinstant.component.ui.input.ZinstantInputText$a */
    /* loaded from: classes7.dex */
    public static final class C17120a implements TextWatcher {

        /* renamed from: p */
        private String f87555p = "";

        /* renamed from: q */
        private int f87556q;

        /* renamed from: r */
        private int f87557r;

        /* renamed from: s */
        private int f87558s;

        C17120a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String str;
            int m116584g;
            String str2 = "";
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            ZOMInputText zOMInputText = ZinstantInputText.this.getZINSNode().zomInputText;
            if (zOMInputText != null) {
                ZinstantInputText zinstantInputText = ZinstantInputText.this;
                String str3 = zOMInputText.mask;
                if (str3 != null) {
                    str2 = str3;
                }
                AbstractC19074t.m100207e(str2, "it.mask ?: \"\"");
                if (str2.length() > 0) {
                    String preMaskedInput = zOMInputText.preMaskedInput(str2, str, zOMInputText.maxLength);
                    if (preMaskedInput == null) {
                        preMaskedInput = str;
                    } else {
                        AbstractC19074t.m100207e(preMaskedInput, "it.preMaskedInput(mask, …e, it.maxLength) ?: value");
                    }
                    int length = preMaskedInput.length();
                    if (!AbstractC19074t.m100204b(this.f87555p, preMaskedInput)) {
                        m116584g = AbstractC22543l.m116584g(this.f87556q + this.f87557r, str.length());
                        String obj = str.subSequence(0, m116584g).toString();
                        String preMaskedInput2 = zOMInputText.preMaskedInput(str2, obj, zOMInputText.maxLength);
                        if (preMaskedInput2 != null) {
                            AbstractC19074t.m100207e(preMaskedInput2, "it.preMaskedInput(mask, …it.maxLength) ?: subValue");
                            obj = preMaskedInput2;
                        }
                        length = obj.length();
                    } else {
                        int i11 = this.f87557r;
                        int i12 = this.f87558s;
                        if (i11 - i12 < 0) {
                            length = ((this.f87556q + i11) - i12) + 1;
                        }
                    }
                    zinstantInputText.setInternalText(preMaskedInput);
                    zinstantInputText.setInternalSelection(length);
                }
                zinstantInputText.m91537s();
                String valueOf = String.valueOf(zinstantInputText.getText());
                if (!AbstractC19074t.m100204b(this.f87555p, valueOf)) {
                    zinstantInputText.f87549s.m124410h1(valueOf);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String str;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            this.f87555p = str;
            this.f87556q = i11;
            this.f87557r = i13;
            this.f87558s = i12;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String str;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            ZinstantInputText.this.f87549s.m124414n1(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZinstantInputText(Context context, C23813c0 c23813c0, InterfaceC23860v interfaceC23860v) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23813c0, "inputNode");
        this.f87549s = c23813c0;
        this.f87550t = new WeakReference(null);
        this.f87551u = new Rect();
        this.f87554x = new UnderlineSpan();
        this.f87550t = new WeakReference(interfaceC23860v);
        c23813c0.m124415p1(this);
        setBackground(null);
        mo91545m();
        mo91546p();
        m91525C();
        m91547r();
    }

    /* renamed from: A */
    private final void m91523A() {
        m91526E();
        m91527F();
    }

    /* renamed from: B */
    private final void m91524B(int i11) {
        setGravity(AbstractC28274h.a.m142465a(i11));
    }

    /* renamed from: C */
    private final void m91525C() {
        C17120a c17120a = new C17120a();
        this.f87553w = c17120a;
        addTextChangedListener(c17120a);
    }

    /* renamed from: E */
    private final void m91526E() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getZINSNode().mWidth;
            layoutParams.height = getZINSNode().mHeight;
        }
    }

    /* renamed from: F */
    private final void m91527F() {
        setPadding(getZINSNode().mAfterPaddingNode.left - getZINSNode().mBound.left, getZINSNode().mAfterPaddingNode.top - getZINSNode().mBound.top, getZINSNode().mBound.right - getZINSNode().mAfterPaddingNode.right, getZINSNode().mBound.bottom - getZINSNode().mAfterPaddingNode.bottom);
    }

    /* renamed from: G */
    private final boolean m91528G(Rect rect) {
        if (!isShown()) {
            return false;
        }
        return AbstractC17201m.m91822n(this, rect);
    }

    /* renamed from: H */
    private final void m91529H(int i11, int i12) {
        int i13 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i12 != 1) {
                            i13 = ZMediaPlayer.OnNativeInvokeListener.ZEVENT_ZSEGMENT_IOCONTROL_LIVE;
                        }
                    } else {
                        i13 = 16;
                    }
                } else {
                    i13 = 131074;
                }
            } else {
                i13 = 3;
            }
        } else {
            i13 = 33;
        }
        setInputType(i13);
    }

    /* renamed from: I */
    private final void m91530I() {
        setPaintFlags(getPaintFlags() | 16);
    }

    /* renamed from: J */
    private final void m91531J() {
        Editable text = getText();
        if (text != null) {
            text.setSpan(this.f87554x, 0, text.length(), 0);
        }
    }

    /* renamed from: K */
    private final void m91532K() {
        C29684c m124411j1 = this.f87549s.m124411j1();
        C17189a c17189a = C17189a.f87752a;
        setHintTextColor(c17189a.m91796b(this.f87549s.m130996B(), m124411j1.m147632j()));
        setTextColor(c17189a.m91796b(this.f87549s.m130996B(), m124411j1.m147631i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m91537s() {
        C29684c m124411j1 = this.f87549s.m124411j1();
        if (m124411j1.m147637p()) {
            m91531J();
        } else {
            m91539z();
        }
        if (m124411j1.m147636o()) {
            m91530I();
        } else {
            m91538v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInternalSelection(int i11) {
        int i12;
        int m116580c;
        int m116584g;
        Editable text = getText();
        if (text != null) {
            i12 = text.length();
        } else {
            i12 = 0;
        }
        m116580c = AbstractC22543l.m116580c(i11, 0);
        m116584g = AbstractC22543l.m116584g(m116580c, i12);
        setSelection(m116584g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInternalText(CharSequence charSequence) {
        TextWatcher textWatcher = this.f87553w;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
        }
        setText(charSequence);
        TextWatcher textWatcher2 = this.f87553w;
        if (textWatcher2 != null) {
            addTextChangedListener(textWatcher2);
        }
    }

    /* renamed from: v */
    private final void m91538v() {
        setPaintFlags(getPaintFlags() & (-17));
    }

    /* renamed from: z */
    private final void m91539z() {
        Editable text = getText();
        if (text != null) {
            text.removeSpan(this.f87554x);
        }
    }

    /* renamed from: D */
    public final void m91540D() {
        String str;
        boolean z11;
        TextWatcher textWatcher = this.f87553w;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
        }
        C29684c m124411j1 = this.f87549s.m124411j1();
        m91524B(m124411j1.m147623a());
        setLines(m124411j1.m147628f());
        setEllipsize(TextUtils.TruncateAt.END);
        if (getMaxLines() != m124411j1.m147628f()) {
            setMaxLines(m124411j1.m147628f());
            if (m124411j1.m147628f() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            setSingleLine(z11);
        }
        setLineSpacing(m124411j1.m147629g(), m124411j1.m147630h());
        setTextSize(0, m124411j1.m147633k());
        setLetterSpacing(m124411j1.m147625c());
        m91532K();
        m91529H(getZINSNode().inputType, m124411j1.m147628f());
        setTypeface(m124411j1.m147634l());
        setHint(m124411j1.m147624b());
        setEnabled(!getZINSNode().disabled);
        m91537s();
        ArrayList arrayList = new ArrayList();
        if (m124411j1.m147627e() > 0) {
            arrayList.add(new InputFilter.LengthFilter(m124411j1.m147627e()));
        }
        Object[] array = arrayList.toArray(new InputFilter[0]);
        AbstractC19074t.m100206d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setFilters((InputFilter[]) array);
        if (m124411j1.m147635m().length() > 0) {
            String m147626d = m124411j1.m147626d();
            int m147627e = m124411j1.m147627e();
            ZOMInputText zOMInputText = getZINSNode().zomInputText;
            if (zOMInputText != null) {
                str = zOMInputText.preMaskedInput(m147626d, m124411j1.m147635m(), m147627e);
            } else {
                str = null;
            }
            if (str == null) {
                str = m124411j1.m147635m();
            }
            if (!AbstractC19074t.m100204b(String.valueOf(getText()), str)) {
                setText(str);
                setInternalSelection(str.length());
            }
        } else {
            setText("");
        }
        TextWatcher textWatcher2 = this.f87553w;
        if (textWatcher2 != null) {
            addTextChangedListener(textWatcher2);
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: b */
    public void mo91541b() {
        C17193e.f87755a.m91803b(this);
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: c */
    public void mo91542c(InterfaceC25307c.a aVar) {
        AbstractC19074t.m100208f(aVar, "intersectCallback");
        C17202n.m91830a(this, new Rect(0, 0, getZINSNode().mBound.getWidth(), getZINSNode().mBound.getHeight()), new Rect());
        aVar.mo92118a(new ZOMRect(r0.left, r0.top, r0.right, r0.bottom));
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: d */
    public void mo91543d() {
        m91547r();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && isFocused()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: f */
    public boolean mo91512f(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "idSlider");
        AbstractC19074t.m100208f(str2, "idNode");
        return false;
    }

    @Override // wj0.InterfaceC29061b
    public ZOMRect getGlobalZOMRect() {
        ZOMRect zOMRect = getZINSNode().mBound;
        AbstractC19074t.m100207e(zOMRect, "zinsNode.mBound");
        return zOMRect;
    }

    @Override // wj0.InterfaceC29061b
    public ZinstantInputText getView() {
        return this;
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: l */
    public void mo91544l(int i11) {
        if ((i11 & 32) != 0) {
            setVisibility(getZINSNode().mRelativeVisibility);
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: m */
    public void mo91545m() {
        m91540D();
        invalidate();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: n */
    public void mo91515n() {
        InterfaceC23860v interfaceC23860v;
        InterfaceC27287a mo92025d;
        if (getZINSNode().mInsight != null && getZINSNode().mInsight.mImpressionTimeout >= 5000) {
            if (this.f87552v == null) {
                this.f87552v = new C27291e(getZINSNode().mID, getZINSNode().mInsight);
            }
            if (m91528G(this.f87551u) && (interfaceC23860v = (InterfaceC23860v) this.f87550t.get()) != null && (mo92025d = interfaceC23860v.mo92025d()) != null) {
                C27291e c27291e = this.f87552v;
                AbstractC19074t.m100205c(c27291e);
                mo92025d.mo92021a(c27291e);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        this.f87549s.m124413l1(z11);
    }

    @Override // wj0.InterfaceC29061b
    public void onPause() {
    }

    @Override // wj0.InterfaceC29061b
    public void onResume() {
    }

    @Override // wj0.InterfaceC29061b
    public void onStart() {
    }

    @Override // wj0.InterfaceC29061b
    public void onStop() {
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: p */
    public void mo91546p() {
        setVisibility(getZINSNode().mRelativeVisibility);
        m91523A();
        requestLayout();
        invalidate();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: q */
    public /* synthetic */ void mo91517q(AbstractC23838k1 abstractC23838k1) {
        AbstractC29060a.m145137b(this, abstractC23838k1);
    }

    /* renamed from: r */
    public final void m91547r() {
        TransformDrawing transformDrawing = this.f87549s.m131026t().getTransformDrawing();
        if (transformDrawing != null) {
            float[] fArr = transformDrawing.getTransformMatrix().matrix;
            setTranslationX(fArr[4]);
            setTranslationY(fArr[5]);
            setScaleX(fArr[0]);
            setScaleY(fArr[3]);
        }
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: u */
    public boolean mo91519u(String str) {
        AbstractC19074t.m100208f(str, "idNode");
        if (TextUtils.equals(str, getZINSNode().mID)) {
            ZinstantLayout.m91934E0(this, getTop());
            return true;
        }
        return false;
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: w */
    public /* synthetic */ void mo91520w(C23855s0 c23855s0, AbstractC23838k1 abstractC23838k1) {
        AbstractC29060a.m145136a(this, c23855s0, abstractC23838k1);
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: x */
    public void mo91548x() {
        m91532K();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: y */
    public void mo91521y() {
    }

    @Override // wj0.InterfaceC29061b
    public ZOMInput getZINSNode() {
        return (ZOMInput) this.f87549s.m131007J();
    }
}
