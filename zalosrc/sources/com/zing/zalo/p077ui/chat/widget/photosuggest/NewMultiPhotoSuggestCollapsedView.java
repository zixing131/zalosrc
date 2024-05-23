package com.zing.zalo.p077ui.chat.widget.photosuggest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23278z2;
import me0.ViewOnTouchListenerC23157n8;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* loaded from: classes5.dex */
public class NewMultiPhotoSuggestCollapsedView extends DrawableCallbackView {

    /* renamed from: P */
    public static final int f61123P = AbstractC23136l9.m118742r(110.0f);

    /* renamed from: Q */
    static final int f61124Q = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: R */
    static final int f61125R = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: S */
    static final int f61126S;

    /* renamed from: T */
    static final int f61127T;

    /* renamed from: U */
    static final int f61128U;

    /* renamed from: V */
    static final int f61129V;

    /* renamed from: W */
    public static final int f61130W;

    /* renamed from: a0 */
    public static final int f61131a0;

    /* renamed from: b0 */
    public static final int f61132b0;

    /* renamed from: c0 */
    public static final int f61133c0;

    /* renamed from: d0 */
    public static final int f61134d0;

    /* renamed from: e0 */
    public static final int f61135e0;

    /* renamed from: f0 */
    public static final int f61136f0;

    /* renamed from: g0 */
    static final int f61137g0;

    /* renamed from: h0 */
    static final int f61138h0;

    /* renamed from: i0 */
    static final int f61139i0;

    /* renamed from: j0 */
    static final int f61140j0;

    /* renamed from: k0 */
    static final int f61141k0;

    /* renamed from: l0 */
    static final int f61142l0;

    /* renamed from: m0 */
    static final int f61143m0;

    /* renamed from: n0 */
    static final int f61144n0;

    /* renamed from: o0 */
    static final int f61145o0;

    /* renamed from: p0 */
    static C13704p1 f61146p0;

    /* renamed from: q0 */
    static int f61147q0;

    /* renamed from: r0 */
    static int f61148r0;

    /* renamed from: s0 */
    static int f61149s0;

    /* renamed from: t0 */
    static String f61150t0;

    /* renamed from: u0 */
    private static int f61151u0;

    /* renamed from: A */
    private final Drawable f61152A;

    /* renamed from: B */
    private final Drawable f61153B;

    /* renamed from: C */
    private final Drawable f61154C;

    /* renamed from: D */
    private final Drawable f61155D;

    /* renamed from: E */
    private final Drawable f61156E;

    /* renamed from: F */
    boolean f61157F;

    /* renamed from: G */
    boolean f61158G;

    /* renamed from: H */
    List f61159H;

    /* renamed from: I */
    InterfaceC11762c f61160I;

    /* renamed from: J */
    NewMultiPhotoSuggestCollapsedView f61161J;

    /* renamed from: K */
    final ViewOnTouchListenerC23157n8 f61162K;

    /* renamed from: L */
    boolean f61163L;

    /* renamed from: M */
    boolean f61164M;

    /* renamed from: N */
    boolean f61165N;

    /* renamed from: O */
    boolean f61166O;

    /* renamed from: q */
    int f61167q;

    /* renamed from: r */
    int f61168r;

    /* renamed from: s */
    C23528a f61169s;

    /* renamed from: t */
    String f61170t;

    /* renamed from: u */
    C13697o f61171u;

    /* renamed from: v */
    C13697o f61172v;

    /* renamed from: w */
    C3977j f61173w;

    /* renamed from: x */
    C3977j f61174x;

    /* renamed from: y */
    int f61175y;

    /* renamed from: z */
    int f61176z;

    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView$a */
    /* loaded from: classes5.dex */
    class C11760a extends ViewOnTouchListenerC23157n8.c {

        /* renamed from: a */
        boolean f61177a = true;

        C11760a() {
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: a */
        public void mo65452a() {
            if (!TextUtils.isEmpty(NewMultiPhotoSuggestCollapsedView.this.f61170t)) {
                NewMultiPhotoSuggestCollapsedView newMultiPhotoSuggestCollapsedView = NewMultiPhotoSuggestCollapsedView.this;
                NewMultiPhotoSuggestCollapsedView.f61150t0 = newMultiPhotoSuggestCollapsedView.f61170t;
                newMultiPhotoSuggestCollapsedView.m65451j();
                NewMultiPhotoSuggestCollapsedView.this.f61161J.invalidate();
                NewMultiPhotoSuggestCollapsedView.this.f61170t = null;
            }
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: b */
        public void mo65453b() {
            InterfaceC11762c interfaceC11762c = NewMultiPhotoSuggestCollapsedView.this.f61160I;
            if (interfaceC11762c != null) {
                interfaceC11762c.onDismiss();
            }
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: d */
        public void mo65454d(float f11, boolean z11) {
            if (z11) {
                if (this.f61177a) {
                    NewMultiPhotoSuggestCollapsedView.this.f61170t = NewMultiPhotoSuggestCollapsedView.f61150t0;
                    NewMultiPhotoSuggestCollapsedView.f61150t0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_multi_photos_close_expand);
                    NewMultiPhotoSuggestCollapsedView.this.m65451j();
                    NewMultiPhotoSuggestCollapsedView.this.f61161J.invalidate();
                    this.f61177a = false;
                    return;
                }
                return;
            }
            if (!this.f61177a) {
                NewMultiPhotoSuggestCollapsedView newMultiPhotoSuggestCollapsedView = NewMultiPhotoSuggestCollapsedView.this;
                NewMultiPhotoSuggestCollapsedView.f61150t0 = newMultiPhotoSuggestCollapsedView.f61170t;
                newMultiPhotoSuggestCollapsedView.m65451j();
                NewMultiPhotoSuggestCollapsedView.this.f61161J.invalidate();
                this.f61177a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView$b */
    /* loaded from: classes5.dex */
    public class C11761b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ MediaItem f61179l1;

        /* renamed from: m1 */
        final /* synthetic */ C3977j f61180m1;

        /* renamed from: n1 */
        final /* synthetic */ C13697o f61181n1;

        C11761b(MediaItem mediaItem, C3977j c3977j, C13697o c13697o) {
            this.f61179l1 = mediaItem;
            this.f61180m1 = c3977j;
            this.f61181n1 = c13697o;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(this.f61179l1.mo41083a0()) || str.equals(this.f61179l1.m41113N())) {
                        C3977j c3977j = this.f61180m1;
                        if (c3977j != null) {
                            c3977j.setImageInfo(c3979l, false);
                        }
                        if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                            if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                                if (this.f61179l1.getWidth() == 0 || this.f61179l1.getHeight() == 0) {
                                    this.f61181n1.m76481v(m18839c.getWidth(), m18839c.getHeight());
                                }
                                this.f61181n1.m76480u(m18839c, false);
                                NewMultiPhotoSuggestCollapsedView.this.m65451j();
                                NewMultiPhotoSuggestCollapsedView.this.f61161J.requestLayout();
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC11762c {
        /* renamed from: a */
        void mo65455a();

        /* renamed from: b */
        void mo65456b();

        /* renamed from: c */
        void mo65457c();

        /* renamed from: d */
        void mo65458d();

        void onDismiss();
    }

    static {
        int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_send_btn_collapse_shadow_bottom);
        f61126S = m118736p;
        int m118736p2 = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_send_btn_collapse_shadow_top);
        f61127T = m118736p2;
        f61128U = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_send_close_btn_height) + m118736p + m118736p2;
        f61129V = AbstractC23136l9.m118742r(34.0f);
        f61130W = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_btns_bot_spacing) - m118736p;
        f61131a0 = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_btns_top_spacing) - m118736p2;
        f61132b0 = AbstractC23136l9.m118742r(2.5f);
        int m118742r = AbstractC23136l9.m118742r(3.5f);
        f61133c0 = m118742r;
        int m118742r2 = AbstractC23136l9.m118742r(3.5f);
        f61134d0 = m118742r2;
        int m118742r3 = AbstractC23136l9.m118742r(3.5f);
        f61135e0 = m118742r3;
        int m118742r4 = AbstractC23136l9.m118742r(3.5f);
        f61136f0 = m118742r4;
        f61137g0 = m118742r + m118742r2;
        f61138h0 = m118742r3 + m118742r4;
        f61139i0 = AbstractC23136l9.m118742r(24.0f);
        f61140j0 = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_left_btn_size) + (AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_expand_btn_collapse_shadow_top) * 2);
        int m118736p3 = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_close_btn_size);
        f61141k0 = m118736p3;
        f61142l0 = AbstractC23136l9.m118742r(3.0f);
        f61143m0 = AbstractC23136l9.m118742r(4.0f) + (m118736p3 / 4);
        f61144n0 = m118736p3 / 3;
        f61145o0 = AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_expand_btn_collapse_shadow_bottom) - AbstractC23136l9.m118736p(AbstractC16802y.multi_photo_suggest_expand_btn_collapse_shadow_top);
        f61147q0 = 0;
        f61148r0 = 0;
        f61149s0 = 0;
        f61151u0 = -1;
    }

    public NewMultiPhotoSuggestCollapsedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61161J = this;
        this.f61162K = new ViewOnTouchListenerC23157n8(new C11760a());
        this.f61152A = AbstractC1388a.m6964f(context, AbstractC16803z.bg_9patch_suggest_multiphoto);
        this.f61153B = AbstractC1388a.m6964f(context, AbstractC16803z.bg_9patch_suggest_multiphoto);
        this.f61154C = AbstractC1388a.m6964f(context, AbstractC16803z.bg_send_suggest_photos_btn_collapse);
        this.f61155D = AbstractC1388a.m6964f(context, AbstractC16803z.bg_expand_suggest_photos_btn_collapse);
        this.f61156E = AbstractC23136l9.m118665N(context, AbstractC16803z.ic_icon_suggest_photo_remove_all);
        m65444c(context);
    }

    /* renamed from: a */
    public static void m65442a(int i11) {
        if (f61151u0 != i11) {
            f61151u0 = i11;
            m65443b();
        }
    }

    /* renamed from: b */
    private static void m65443b() {
        f61146p0 = null;
    }

    /* renamed from: c */
    private void m65444c(Context context) {
        this.f61169s = new C23528a(context);
        this.f61173w = new C3977j(context);
        this.f61174x = new C3977j(context);
        this.f61171u = new C13697o(this);
        this.f61172v = new C13697o(this);
        C13697o c13697o = this.f61171u;
        int i11 = f61124Q;
        c13697o.m76461I(new float[]{i11, i11, i11, i11, i11, i11, i11, i11});
        this.f61171u.m76482w(-2105377);
        C13697o c13697o2 = this.f61171u;
        int i12 = f61125R;
        c13697o2.m76484y(i12);
        this.f61172v.m76461I(new float[]{i11, i11, i11, i11, i11, i11, i11, i11});
        this.f61172v.m76482w(-2105377);
        this.f61172v.m76484y(i12);
        this.f61162K.m119175g(1.0f);
    }

    private C13704p1 getTextPaint() {
        if (f61146p0 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f61146p0 = c13704p1;
            c13704p1.m76614d(AbstractC23136l9.m118759w1(12), false);
            f61146p0.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Medium.ttf"));
            f61146p0.setColor(AbstractC23136l9.m118639A(AbstractC16801x.bg_btn_type2_text));
        }
        return f61146p0;
    }

    /* renamed from: i */
    private void m65445i(C13697o c13697o, C3977j c3977j, MediaItem mediaItem) {
        String mo41083a0;
        try {
            if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                mo41083a0 = mediaItem.m41113N();
            } else {
                mo41083a0 = mediaItem.mo41083a0();
            }
            if (!TextUtils.isEmpty(mo41083a0)) {
                ((C23528a) this.f61169s.m123612r(c3977j)).m123579C(mo41083a0, C23278z2.m120065D0(), new C11761b(mediaItem, c3977j, c13697o));
            } else {
                c13697o.m76477r();
                this.f61161J.invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m65446k(C13697o c13697o, int i11, int i12) {
        if (i11 > 0 && i12 > 0) {
            float f11 = (i11 * 1.0f) / i12;
            float m118722k0 = AbstractC23136l9.m118722k0() * 1.0f;
            int i13 = f61123P;
            if (f11 <= m118722k0 / (i13 * 2)) {
                c13697o.m76462J(4, i13);
            } else {
                c13697o.m76463K(5, AbstractC23136l9.m118722k0() / 2, i13);
            }
            c13697o.m76481v(i11, i12);
            return;
        }
        int i14 = f61123P;
        c13697o.m76462J(4, i14);
        c13697o.m76481v(f61149s0, i14);
    }

    /* renamed from: d */
    public boolean m65447d(float f11, float f12) {
        int i11 = f61141k0 + (f61142l0 * 2);
        int i12 = this.f61175y;
        return f11 >= ((float) (i12 - i11)) && f11 <= ((float) i12) && f12 >= 0.0f && f12 <= ((float) i11);
    }

    /* renamed from: e */
    public boolean m65448e(float f11, float f12) {
        if (!this.f61157F) {
            return false;
        }
        int i11 = ((this.f61176z - f61128U) - f61131a0) - f61130W;
        int i12 = f61144n0;
        int i13 = i11 - i12;
        if (f11 < 0.0f) {
            return false;
        }
        int i14 = f61140j0;
        if (f11 >= i14) {
            return false;
        }
        double d11 = f12;
        return d11 >= (((double) (i13 - i14)) / 2.0d) + ((double) i12) && d11 <= ((((double) (i13 + i14)) / 2.0d) + ((double) i12)) + ((double) f61145o0);
    }

    /* renamed from: f */
    public boolean m65449f(float f11, float f12) {
        float f13;
        if (this.f61157F) {
            f13 = f61140j0 / 2.0f;
        } else {
            f13 = 0.0f;
        }
        if (!m65448e(f11, f12) && f11 >= f13 && f11 <= this.f61175y - f61143m0 && f12 >= f61144n0 && f12 < ((this.f61176z - f61128U) - f61131a0) - f61130W) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m65450g(float f11, float f12) {
        int i11 = this.f61167q - ((f61149s0 - f61147q0) / 2);
        int i12 = (this.f61176z - f61128U) - f61130W;
        if (f11 >= i11 && f11 <= i11 + r1 && f12 >= i12 && f12 <= i12 + r3) {
            return true;
        }
        return false;
    }

    public int getViewHeight() {
        return this.f61176z;
    }

    public int getViewWidth() {
        return this.f61175y;
    }

    /* renamed from: j */
    void m65451j() {
        int i11;
        int i12;
        if (this.f61158G) {
            i11 = f61132b0 + f61139i0;
        } else {
            i11 = 0;
        }
        if (this.f61157F) {
            i12 = f61140j0 / 2;
        } else {
            i12 = 0;
        }
        int i13 = f61138h0;
        int i14 = f61132b0;
        int m76472k = i13 + (i14 * 2) + this.f61171u.m76472k();
        int m76473l = this.f61171u.m76473l() + (i14 * 2);
        int i15 = f61137g0;
        int i16 = m76473l + i15 + i11;
        int i17 = f61143m0;
        this.f61175y = i16 + i12 + i17;
        int i18 = f61128U;
        int i19 = m76472k + i18 + f61130W;
        int i21 = f61131a0;
        int i22 = f61144n0;
        this.f61176z = i19 + i21 + i22;
        f61147q0 = AbstractC23136l9.m118764y0(getTextPaint(), f61150t0);
        f61148r0 = AbstractC23136l9.m118761x0(getTextPaint(), f61150t0);
        f61149s0 = Math.max(i16 - i17, f61147q0 + f61129V);
        this.f61167q = ((i16 / 2) + i12) - (f61147q0 / 2);
        this.f61168r = ((i18 + f61148r0) / 2) + m76472k + i21 + i22;
        this.f61171u.m76460H(i12 + i11 + (i15 / 2) + i14, f61135e0 + i14 + i22);
        if (this.f61158G) {
            this.f61172v.m76460H((this.f61171u.m76469h() - i14) - i11, ((m76472k - ((int) (this.f61171u.m76472k() * 0.8f))) / 2) + i22);
            this.f61172v.m76459G(new Rect(0, 0, i11 + this.f61171u.m76473l(), this.f61172v.m76472k()));
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i11 = this.f61176z;
        int i12 = f61128U;
        int i13 = f61131a0;
        int i14 = ((i11 - i12) - i13) - f61130W;
        int i15 = f61144n0;
        int i16 = i14 - i15;
        int i17 = f61138h0;
        int i18 = f61132b0;
        int m76472k = (int) (i17 + (i18 * 2) + (this.f61171u.m76472k() * 0.8f));
        int i19 = this.f61167q;
        int i21 = f61149s0;
        int i22 = i19 - ((i21 - f61147q0) / 2);
        this.f61154C.setBounds(i22, i14 + i13, i21 + i22, i13 + i14 + i12);
        this.f61154C.draw(canvas);
        canvas.drawText(f61150t0, this.f61167q, this.f61168r, getTextPaint());
        if (this.f61158G) {
            int i23 = f61137g0;
            int m76473l = (i18 * 3) + i23 + this.f61171u.m76473l() + f61139i0;
            int m76469h = (this.f61172v.m76469h() - i18) - (i23 / 2);
            this.f61153B.setBounds(m76469h, ((i16 - m76472k) / 2) + i15, m76473l + m76469h, ((m76472k + i16) / 2) + i15);
            this.f61153B.draw(canvas);
            this.f61172v.m76467d(canvas);
        }
        int i24 = f61137g0;
        int m76473l2 = (i18 * 2) + i24 + this.f61171u.m76473l();
        int m76469h2 = (this.f61171u.m76469h() - i18) - (i24 / 2);
        this.f61152A.setBounds(m76469h2, i15, m76473l2 + m76469h2, i14);
        this.f61152A.draw(canvas);
        this.f61171u.m76467d(canvas);
        int i25 = this.f61175y;
        int i26 = f61141k0;
        int i27 = f61142l0;
        int i28 = (i25 - i26) - i27;
        this.f61156E.setBounds(i28, i27, i28 + i26, i26 + i27);
        this.f61156E.draw(canvas);
        if (this.f61157F) {
            Drawable drawable = this.f61155D;
            int i29 = f61140j0;
            drawable.setBounds(0, ((i16 - i29) / 2) + i15, i29, ((i16 + i29) / 2) + i15 + f61145o0);
            this.f61155D.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f61175y, this.f61176z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && !this.f61162K.m119173e() && this.f61160I != null) {
                if (this.f61166O && m65447d(x11, y11)) {
                    this.f61160I.mo65455a();
                } else if (this.f61163L && m65449f(x11, y11)) {
                    this.f61160I.mo65456b();
                } else if (this.f61165N && m65450g(x11, y11)) {
                    this.f61160I.mo65457c();
                } else if (this.f61164M && m65448e(x11, y11)) {
                    this.f61160I.mo65458d();
                }
            }
        } else {
            this.f61166O = m65447d(x11, y11);
            this.f61163L = m65449f(x11, y11);
            this.f61164M = m65448e(x11, y11);
            this.f61165N = m65450g(x11, y11);
        }
        this.f61162K.onTouch(this, motionEvent);
        return true;
    }

    public void setData(List<MediaItem> list) {
        if (list != null && list.size() != 0) {
            this.f61159H = list;
            if (list.size() > 1) {
                this.f61157F = true;
                f61150t0 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_multi_photos_instant_send), Integer.valueOf(this.f61159H.size()));
            } else {
                this.f61157F = false;
                f61150t0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_send_photo);
            }
            MediaItem mediaItem = list.get(list.size() - 1);
            m65446k(this.f61171u, mediaItem.getWidth(), mediaItem.getHeight());
            m65445i(this.f61171u, this.f61173w, mediaItem);
            if (this.f61159H.size() > 1) {
                MediaItem mediaItem2 = list.get(list.size() - 2);
                this.f61158G = true;
                this.f61172v.m76462J(4, (int) (this.f61171u.m76472k() * 0.8f));
                this.f61172v.m76481v(mediaItem2.getWidth(), mediaItem2.getHeight());
                m65445i(this.f61172v, this.f61174x, mediaItem2);
            } else {
                this.f61158G = false;
            }
            m65451j();
            this.f61161J.requestLayout();
        }
    }

    public void setListener(InterfaceC11762c interfaceC11762c) {
        this.f61160I = interfaceC11762c;
    }
}
