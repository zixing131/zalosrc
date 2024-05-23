package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import p611wj.C29056d;
import p716zh.C31902e9;

/* loaded from: classes5.dex */
public class SearchRowLocation extends SearchRow {

    /* renamed from: N */
    static final int f61413N = AbstractC23136l9.m118742r(69.0f);

    /* renamed from: O */
    static final int f61414O = AbstractC23136l9.m118742r(52.0f);

    /* renamed from: P */
    static final int f61415P = AbstractC23136l9.m118742r(165.0f);

    /* renamed from: Q */
    static C13704p1 f61416Q;

    /* renamed from: R */
    static C13704p1 f61417R;

    /* renamed from: D */
    C31902e9 f61418D;

    /* renamed from: E */
    InterfaceC11807b f61419E;

    /* renamed from: F */
    StaticLayout f61420F;

    /* renamed from: G */
    StaticLayout f61421G;

    /* renamed from: H */
    C13658k f61422H;

    /* renamed from: I */
    C3977j f61423I;

    /* renamed from: J */
    C23528a f61424J;

    /* renamed from: K */
    int f61425K;

    /* renamed from: L */
    boolean f61426L;

    /* renamed from: M */
    String f61427M;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowLocation$a */
    /* loaded from: classes5.dex */
    public class C11806a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f61428l1;

        C11806a(String str) {
            this.f61428l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C31902e9 c31902e9 = SearchRowLocation.this.f61418D;
                if (c31902e9 != null && c31902e9.m153314f() != null && TextUtils.equals(SearchRowLocation.this.f61418D.m153314f().m145118f(), this.f61428l1) && c3979l != null && c3979l.m18839c() != null) {
                    boolean z11 = true;
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    C3977j c3977j = SearchRowLocation.this.f61423I;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13658k c13658k = SearchRowLocation.this.f61422H;
                    Bitmap m18839c = c3979l.m18839c();
                    String str2 = SearchRowLocation.this.f61427M;
                    if (str2 != null && str2.equals(this.f61428l1)) {
                        z11 = false;
                    }
                    c13658k.m76334m(m18839c, z11);
                    SearchRowLocation searchRowLocation = SearchRowLocation.this;
                    searchRowLocation.f61427M = this.f61428l1;
                    searchRowLocation.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowLocation$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11807b {
        /* renamed from: a */
        void mo65636a(View view, C31902e9 c31902e9);
    }

    public SearchRowLocation(Context context) {
        super(context);
        this.f61424J = new C23528a(context);
        C13658k c13658k = new C13658k(this);
        this.f61422H = c13658k;
        c13658k.m76343v(false);
        this.f61423I = new C3977j(MainApplication.getAppContext());
        if (f61416Q == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f61416Q = c13704p1;
            c13704p1.m76613c();
            C13704p1 c13704p12 = new C13704p1(1);
            f61417R = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
        }
        f61416Q.setTextSize(MainApplication.getAppContext().getResources().getDimension(AbstractC16802y.f85293f0));
        f61417R.setTextSize(MainApplication.getAppContext().getResources().getDimension(AbstractC16802y.f71));
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: e */
    public void mo65614e() {
        setSearchResult(this.f61418D);
    }

    /* renamed from: l */
    boolean m65634l(float f11, float f12) {
        float f13 = 0;
        return f11 > f13 && f11 < ((float) this.f61425K) && f12 > f13 && f12 < ((float) f61413N);
    }

    /* renamed from: m */
    void m65635m() {
        try {
            C31902e9 c31902e9 = this.f61418D;
            if (c31902e9 != null && c31902e9.m153314f() != null && !TextUtils.isEmpty(this.f61418D.m153314f().m145118f())) {
                C24003n m120136k0 = C23278z2.m120136k0();
                String m145118f = this.f61418D.m153314f().m145118f();
                if (C23999j.m125696L2(m145118f, m120136k0)) {
                    C3979l m123606l = this.f61424J.m123606l(m145118f, m120136k0.f116260a, m120136k0.f116263d, m120136k0.f116266g);
                    if (m123606l != null) {
                        C3977j c3977j = this.f61423I;
                        if (c3977j != null) {
                            c3977j.setImageInfo(m123606l, false);
                        }
                        this.f61422H.m76334m(m123606l.m18839c(), false);
                        invalidate();
                        return;
                    }
                    return;
                }
                ((C23528a) this.f61424J.m123612r(this.f61423I)).m123579C(m145118f, m120136k0, new C11806a(m145118f));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        try {
            this.f61422H.m76325a(canvas);
            if (this.f61420F.getLineCount() == 1) {
                i11 = AbstractC23136l9.m118742r(6.0f);
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.translate(f61414O + AbstractC23136l9.m118742r(10.0f), 0.0f);
            StaticLayout staticLayout = this.f61420F;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
                canvas.translate(0.0f, this.f61420F.getHeight() + i11);
            }
            StaticLayout staticLayout2 = this.f61421G;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
                canvas.translate(0.0f, this.f61421G.getHeight());
            }
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        StaticLayout staticLayout;
        int i13;
        int min;
        StaticLayout staticLayout2 = this.f61420F;
        if ((staticLayout2 != null && staticLayout2.getLineCount() > 1) || ((staticLayout = this.f61421G) != null && staticLayout.getLineCount() > 1)) {
            min = f61415P;
        } else {
            StaticLayout staticLayout3 = this.f61420F;
            if (staticLayout3 != null) {
                i13 = Math.max(0, (int) staticLayout3.getLineWidth(0));
            } else {
                i13 = 0;
            }
            StaticLayout staticLayout4 = this.f61421G;
            if (staticLayout4 != null) {
                i13 = Math.max(i13, (int) staticLayout4.getLineWidth(0));
            }
            min = Math.min(f61415P, i13);
        }
        int m118742r = f61414O + AbstractC23136l9.m118742r(10.0f) + min;
        this.f61425K = m118742r;
        setMeasuredDimension(m118742r, f61413N);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        InterfaceC11807b interfaceC11807b;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            if (m65634l(x11, y11)) {
                this.f61426L = true;
            }
            z11 = this.f61426L;
            if (z11) {
                m65619k();
            }
        } else {
            if (motionEvent.getAction() != 2) {
                m65613d();
            }
            if (motionEvent.getAction() == 1) {
                if (m65634l(x11, y11)) {
                    if (this.f61426L && (interfaceC11807b = this.f61419E) != null) {
                        interfaceC11807b.mo65636a(this, this.f61418D);
                    }
                    this.f61426L = false;
                }
            } else if (motionEvent.getAction() == 3) {
                this.f61426L = false;
            }
            z11 = false;
        }
        if (!z11) {
            return super.onTouchEvent(motionEvent);
        }
        return z11;
    }

    public void setListener(InterfaceC11807b interfaceC11807b) {
        this.f61419E = interfaceC11807b;
    }

    public void setSearchResult(C31902e9 c31902e9) {
        this.f61420F = null;
        this.f61421G = null;
        C13704p1 c13704p1 = f61416Q;
        if (c13704p1 != null) {
            c13704p1.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            f61417R.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
        }
        this.f61418D = c31902e9;
        C13658k c13658k = this.f61422H;
        int i11 = f61414O;
        c13658k.m76337p(i11, i11);
        this.f61422H.m76339r(0, (f61413N / 2) - (i11 / 2));
        if (c31902e9 != null && c31902e9.m153314f() != null) {
            C29056d m153314f = c31902e9.m153314f();
            if (!TextUtils.isEmpty(m153314f.m145117e())) {
                this.f61420F = AbstractC23214t.m119625l(m153314f.m145117e(), f61416Q, f61415P, 2);
            }
            if (!TextUtils.isEmpty(m153314f.m145115c())) {
                this.f61421G = AbstractC23214t.m119625l(m153314f.m145115c(), f61417R, f61415P, 2);
            }
        }
        m65635m();
        requestLayout();
    }
}
