package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import bd0.C2770a;
import c30.C3255n;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13700o2;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p379o3.C23995f;
import p471r3.C25630b;
import p588vw.C28644j;
import p716zh.C31902e9;
import vg.C28020b3;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class SearchRowSticker extends SearchRow implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C2770a.a {

    /* renamed from: M */
    public static final int f61465M = AbstractC23136l9.m118742r(63.0f);

    /* renamed from: N */
    public static final int f61466N = AbstractC23136l9.m118742r(68.0f);

    /* renamed from: O */
    public static final int f61467O = AbstractC23136l9.m118742r(18.0f);

    /* renamed from: D */
    private int f61468D;

    /* renamed from: E */
    private C31902e9 f61469E;

    /* renamed from: F */
    private C25630b f61470F;

    /* renamed from: G */
    private InterfaceC11814b f61471G;

    /* renamed from: H */
    private Rect f61472H;

    /* renamed from: I */
    private C13700o2 f61473I;

    /* renamed from: J */
    private C3977j f61474J;

    /* renamed from: K */
    private C23528a f61475K;

    /* renamed from: L */
    private String f61476L;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowSticker$a */
    /* loaded from: classes5.dex */
    public class C11813a extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ String f61477a;

        C11813a(String str) {
            this.f61477a = str;
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                if (SearchRowSticker.this.f61469E != null) {
                    if (TextUtils.equals(C3255n.m16562n().m16572l(SearchRowSticker.this.f61476L, "" + SearchRowSticker.this.f61469E.m153313e(), c25630b), this.f61477a)) {
                        SearchRowSticker.this.f61473I.m76530R(false);
                        if (c3979l.m18839c() != null) {
                            interfaceC3968a.setImageInfo(c3979l, false);
                            SearchRowSticker.this.f61473I.m76541e0(c3979l.m18839c());
                        }
                        if (!c25630b.m132395C()) {
                            SearchRowSticker.this.f61473I.m76529O(c25630b, this.f61477a, true, false, false, true);
                        } else {
                            SearchRowSticker.this.f61473I.m76537Z(false);
                        }
                        SearchRowSticker.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowSticker$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11814b {
        /* renamed from: a */
        boolean mo65662a();

        /* renamed from: b */
        boolean mo65663b();

        /* renamed from: c */
        void mo65664c(C31902e9 c31902e9);

        /* renamed from: d */
        void mo65665d(View view, C31902e9 c31902e9);

        /* renamed from: e */
        void mo65666e(C31902e9 c31902e9);

        /* renamed from: f */
        void mo65667f(View view, C31902e9 c31902e9);
    }

    public SearchRowSticker(Context context, int i11, Rect rect, String str) {
        super(context);
        this.f61476L = "";
        m65659p(context, i11, rect, str);
    }

    /* renamed from: p */
    private void m65659p(Context context, int i11, Rect rect, String str) {
        this.f61475K = new C23528a(context);
        this.f61468D = i11;
        this.f61472H = rect;
        this.f61473I = new C13700o2(new C2770a(this, C13700o2.d.f70835q, this.f61468D, null, true, true, false, C13700o2.Companion.m76549c(), false));
        this.f61474J = new C3977j(context);
        AbstractC23136l9.m118693a1(this.f61371z, this.f61364s);
        setOnClickListener(this);
        setOnLongClickListener(this);
        setOnTouchListener(this);
        this.f61476L = str;
    }

    /* renamed from: q */
    private void m65660q() {
        long j11;
        try {
            C25630b c25630b = this.f61470F;
            if (c25630b == null) {
                return;
            }
            boolean m132448z = c25630b.m132448z();
            C3255n m16562n = C3255n.m16562n();
            String str = this.f61476L;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            C31902e9 c31902e9 = this.f61469E;
            if (c31902e9 != null) {
                j11 = c31902e9.m153313e();
            } else {
                j11 = 0;
            }
            sb2.append(j11);
            String m16572l = m16562n.m16572l(str, sb2.toString(), c25630b);
            boolean z11 = false;
            if (m132448z) {
                this.f61473I.m76544n(c25630b, false);
                this.f61473I.m76529O(c25630b, m16572l, true, false, false, true);
            } else if (!TextUtils.isEmpty(c25630b.m132446x())) {
                C13700o2 c13700o2 = this.f61473I;
                if (C3255n.m16555f() && !c25630b.m132395C()) {
                    z11 = true;
                }
                c13700o2.m76537Z(z11);
                C28020b3.f130648a.m141182F(this.f61474J, this.f61475K, c25630b, null, false, new C11813a(m16572l));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    private void m65661r() {
        try {
            C25630b c25630b = this.f61470F;
            if (c25630b == null) {
                return;
            }
            this.f61473I.m76544n(c25630b, false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        InterfaceC11814b interfaceC11814b = this.f61471G;
        if (interfaceC11814b != null && interfaceC11814b.mo65662a()) {
            return true;
        }
        return false;
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: e */
    public void mo65614e() {
        setSearchResult(this.f61469E);
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: h */
    public void mo65616h() {
        super.mo65616h();
        InterfaceC11814b interfaceC11814b = this.f61471G;
        if (interfaceC11814b != null) {
            interfaceC11814b.mo65665d(this, this.f61469E);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC11814b interfaceC11814b = this.f61471G;
        if (interfaceC11814b != null) {
            interfaceC11814b.mo65667f(view, this.f61469E);
        }
        m65618j();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable m62300o2;
        if (this.f61469E == null) {
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        Rect rect = this.f61472H;
        canvas.translate(rect.left, rect.top);
        this.f61473I.m76545v(canvas);
        C25630b c25630b = this.f61470F;
        if (c25630b != null && c25630b.m132399G() && (m62300o2 = AbstractC11531v0.m62300o2()) != null) {
            int m76524H = this.f61473I.m76524H();
            int i11 = f61467O;
            int i12 = m76524H - i11;
            m62300o2.setBounds(i12, 0, i12 + i11, i11);
            m62300o2.draw(canvas);
        }
        canvas.restore();
        m65615f(canvas);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (this.f61471G != null && this.f61470F != null) {
            if (!C3255n.m16555f() || this.f61470F.m132399G()) {
                this.f61471G.mo65665d(view, this.f61469E);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m76524H = this.f61472H.left + this.f61473I.m76524H();
        Rect rect = this.f61472H;
        setMeasuredDimension(m76524H + rect.right, rect.top + this.f61468D + rect.bottom);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.setBackgroundResource(this.f61364s);
                InterfaceC11814b interfaceC11814b = this.f61471G;
                if (interfaceC11814b != null) {
                    interfaceC11814b.mo65664c(this.f61469E);
                    return false;
                }
                return false;
            }
            return false;
        }
        InterfaceC11814b interfaceC11814b2 = this.f61471G;
        if (interfaceC11814b2 != null) {
            interfaceC11814b2.mo65666e(this.f61469E);
            return false;
        }
        return false;
    }

    public void setListener(InterfaceC11814b interfaceC11814b) {
        this.f61471G = interfaceC11814b;
    }

    public void setSearchResult(C31902e9 c31902e9) {
        this.f61469E = c31902e9;
        this.f61473I.m76530R(false);
        C31902e9 c31902e92 = this.f61469E;
        if (c31902e92 != null && c31902e92.m153321m() != null) {
            C25630b m143282P0 = C28644j.m143233Y().m143282P0(this.f61469E.m153321m());
            this.f61470F = m143282P0;
            if (C28020b3.f130648a.m141205v(m143282P0, false) != null) {
                this.f61473I.m76544n(this.f61470F, false);
                this.f61473I.m76540d0(this.f61470F);
            } else {
                this.f61473I.m76527L(this.f61470F);
            }
            InterfaceC11814b interfaceC11814b = this.f61471G;
            if (interfaceC11814b != null && interfaceC11814b.mo65663b()) {
                m65661r();
            } else {
                m65660q();
            }
            requestLayout();
        }
    }
}
