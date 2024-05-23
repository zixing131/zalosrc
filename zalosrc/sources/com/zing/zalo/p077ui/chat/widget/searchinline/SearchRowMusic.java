package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13658k;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p611wj.C29057e;
import p716zh.C31902e9;

/* loaded from: classes5.dex */
public class SearchRowMusic extends SearchRow {

    /* renamed from: R */
    static final int f61434R = AbstractC23136l9.m118742r(69.0f);

    /* renamed from: S */
    static final int f61435S = AbstractC23136l9.m118742r(140.0f);

    /* renamed from: T */
    static C13704p1 f61436T;

    /* renamed from: U */
    static C13704p1 f61437U;

    /* renamed from: D */
    C31902e9 f61438D;

    /* renamed from: E */
    InterfaceC11810b f61439E;

    /* renamed from: F */
    StaticLayout f61440F;

    /* renamed from: G */
    StaticLayout f61441G;

    /* renamed from: H */
    StaticLayout f61442H;

    /* renamed from: I */
    C13658k f61443I;

    /* renamed from: J */
    C3977j f61444J;

    /* renamed from: K */
    C23528a f61445K;

    /* renamed from: L */
    Rect f61446L;

    /* renamed from: M */
    int f61447M;

    /* renamed from: N */
    int f61448N;

    /* renamed from: O */
    int f61449O;

    /* renamed from: P */
    int f61450P;

    /* renamed from: Q */
    boolean f61451Q;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowMusic$a */
    /* loaded from: classes5.dex */
    public class C11809a extends C23999j {
        C11809a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C31902e9 c31902e9 = SearchRowMusic.this.f61438D;
                if (c31902e9 != null && c31902e9.m153320l() != null && TextUtils.equals(str, SearchRowMusic.this.f61438D.m153320l().m145127g()) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    C3977j c3977j = SearchRowMusic.this.f61444J;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    SearchRowMusic.this.f61443I.m76334m(c3979l.m18839c(), true);
                    SearchRowMusic.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowMusic$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11810b {
        /* renamed from: a */
        void mo65642a(View view, C31902e9 c31902e9);
    }

    public SearchRowMusic(Context context, Rect rect) {
        super(context);
        this.f61445K = new C23528a(context);
        this.f61446L = rect == null ? new Rect(0, 0, 0, 0) : rect;
        C13658k c13658k = new C13658k(this);
        this.f61443I = c13658k;
        c13658k.m76343v(false);
        this.f61444J = new C3977j(MainApplication.getAppContext());
        if (f61436T == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f61436T = c13704p1;
            c13704p1.m76613c();
            C13704p1 c13704p12 = new C13704p1(1);
            f61437U = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
        }
        f61436T.setTextSize(MainApplication.getAppContext().getResources().getDimension(AbstractC16802y.f85293f0));
        f61437U.setTextSize(MainApplication.getAppContext().getResources().getDimension(AbstractC16802y.f71));
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: e */
    public void mo65614e() {
        setSearchResult(this.f61438D);
    }

    /* renamed from: l */
    boolean m65640l(float f11, float f12) {
        Rect rect = this.f61446L;
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = this.f61447M - rect.right;
        int i14 = this.f61448N - rect.bottom;
        if (f11 > i11 && f11 < i13 && f12 > i12 && f12 < i14) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    void m65641m() {
        try {
            C31902e9 c31902e9 = this.f61438D;
            if (c31902e9 != null && !TextUtils.isEmpty(c31902e9.m153320l().m145127g())) {
                String m145127g = this.f61438D.m153320l().m145127g();
                if (!TextUtils.isEmpty(m145127g)) {
                    C24003n m120136k0 = C23278z2.m120136k0();
                    C3979l m125676A2 = C23999j.m125676A2(m145127g, m120136k0.f116260a, m120136k0.f116266g);
                    if (m125676A2 != null) {
                        C3977j c3977j = this.f61444J;
                        if (c3977j != null) {
                            c3977j.setImageInfo(m125676A2, false);
                        }
                        this.f61443I.m76334m(m125676A2.m18839c(), false);
                        return;
                    }
                    this.f61443I.m76331h();
                    ((C23528a) this.f61445K.m123612r(this.f61444J)).m123579C(m145127g, C23278z2.m120136k0(), new C11809a());
                    return;
                }
                this.f61443I.m76331h();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            this.f61443I.m76325a(canvas);
            canvas.save();
            canvas.translate(this.f61449O + f61434R + AbstractC23136l9.m118742r(10.0f), this.f61450P);
            StaticLayout staticLayout = this.f61440F;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
                canvas.translate(0.0f, this.f61440F.getHeight() + AbstractC23136l9.m118742r(6.0f));
            }
            StaticLayout staticLayout2 = this.f61441G;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
                canvas.translate(0.0f, this.f61441G.getHeight() + AbstractC23136l9.m118742r(6.0f));
            }
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i13;
        int min;
        StaticLayout staticLayout3 = this.f61440F;
        int i14 = 0;
        if ((staticLayout3 != null && staticLayout3.getLineCount() > 1) || (((staticLayout = this.f61441G) != null && staticLayout.getLineCount() > 1) || ((staticLayout2 = this.f61442H) != null && staticLayout2.getLineCount() > 1))) {
            min = f61435S;
        } else {
            StaticLayout staticLayout4 = this.f61440F;
            if (staticLayout4 != null) {
                i13 = Math.max(0, (int) staticLayout4.getLineWidth(0));
            } else {
                i13 = 0;
            }
            StaticLayout staticLayout5 = this.f61441G;
            if (staticLayout5 != null) {
                i13 = Math.max(i13, (int) staticLayout5.getLineWidth(0));
            }
            min = Math.min(f61435S, i13);
        }
        StaticLayout staticLayout6 = this.f61440F;
        if (staticLayout6 != null) {
            i14 = AbstractC23136l9.m118742r(6.0f) + staticLayout6.getHeight();
        }
        StaticLayout staticLayout7 = this.f61441G;
        if (staticLayout7 != null) {
            i14 += staticLayout7.getHeight() + AbstractC23136l9.m118742r(6.0f);
        }
        int i15 = this.f61446L.left;
        int i16 = f61434R;
        this.f61447M = i15 + i16 + AbstractC23136l9.m118742r(10.0f) + min + this.f61446L.right + AbstractC23136l9.m118742r(10.0f);
        int max = this.f61446L.top + Math.max(i16, i14) + this.f61446L.bottom;
        this.f61448N = max;
        setMeasuredDimension(this.f61447M, max);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        InterfaceC11810b interfaceC11810b;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            if (m65640l(x11, y11)) {
                this.f61451Q = true;
            }
            z11 = this.f61451Q;
            if (z11) {
                m65619k();
            }
        } else {
            if (motionEvent.getAction() != 2) {
                m65613d();
            }
            if (motionEvent.getAction() == 1) {
                if (m65640l(x11, y11)) {
                    if (this.f61451Q && (interfaceC11810b = this.f61439E) != null) {
                        interfaceC11810b.mo65642a(this, this.f61438D);
                    }
                    this.f61451Q = false;
                }
            } else if (motionEvent.getAction() == 3) {
                this.f61451Q = false;
            }
            z11 = false;
        }
        if (!z11) {
            return super.onTouchEvent(motionEvent);
        }
        return z11;
    }

    public void setListener(InterfaceC11810b interfaceC11810b) {
        this.f61439E = interfaceC11810b;
    }

    public void setSearchResult(C31902e9 c31902e9) {
        this.f61440F = null;
        this.f61441G = null;
        this.f61442H = null;
        C13704p1 c13704p1 = f61436T;
        if (c13704p1 != null) {
            c13704p1.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            f61437U.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
        }
        this.f61438D = c31902e9;
        Rect rect = this.f61446L;
        this.f61449O = rect.left;
        this.f61450P = rect.top;
        C13658k c13658k = this.f61443I;
        int i11 = f61434R;
        c13658k.m76337p(i11, i11);
        this.f61443I.m76339r(this.f61449O, this.f61450P);
        if (c31902e9 != null && c31902e9.m153320l() != null) {
            C29057e m153320l = c31902e9.m153320l();
            if (!TextUtils.isEmpty(m153320l.m145123c())) {
                this.f61440F = AbstractC23214t.m119625l(m153320l.m145123c(), f61436T, f61435S, 2);
            }
            if (!TextUtils.isEmpty(m153320l.m145121a())) {
                this.f61441G = AbstractC23214t.m119625l(m153320l.m145121a(), f61437U, f61435S, 1);
            }
        }
        m65641m();
        requestLayout();
    }
}
