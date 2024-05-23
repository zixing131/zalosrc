package com.zing.zalo.p077ui.chat.widget.photosuggest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import com.zing.zalo.zview.animation.AnimationTarget;
import me0.AbstractC23136l9;
import me0.C23278z2;
import me0.ViewOnTouchListenerC23157n8;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* loaded from: classes5.dex */
public class NewPhotoSuggestView extends DrawableCallbackView implements AnimationTarget {

    /* renamed from: I */
    static final int f61227I = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: J */
    static final int f61228J = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: K */
    static final int f61229K = AbstractC23136l9.m118742r(160.0f);

    /* renamed from: L */
    static final int f61230L = AbstractC23136l9.m118742r(9.0f);

    /* renamed from: M */
    static final int f61231M = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: N */
    static final int f61232N = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: O */
    static final int f61233O;

    /* renamed from: P */
    static final int f61234P;

    /* renamed from: Q */
    static final int f61235Q;

    /* renamed from: R */
    static final int f61236R;

    /* renamed from: S */
    static final int f61237S;

    /* renamed from: T */
    static final int f61238T;

    /* renamed from: U */
    static C13704p1 f61239U;

    /* renamed from: V */
    static int f61240V;

    /* renamed from: W */
    static int f61241W;

    /* renamed from: a0 */
    static String f61242a0;

    /* renamed from: A */
    Drawable f61243A;

    /* renamed from: B */
    Drawable f61244B;

    /* renamed from: C */
    boolean f61245C;

    /* renamed from: D */
    MediaItem f61246D;

    /* renamed from: E */
    final ViewOnTouchListenerC23157n8 f61247E;

    /* renamed from: F */
    NewPhotoSuggestView f61248F;

    /* renamed from: G */
    boolean f61249G;

    /* renamed from: H */
    InterfaceC11773c f61250H;

    /* renamed from: q */
    int f61251q;

    /* renamed from: r */
    int f61252r;

    /* renamed from: s */
    int f61253s;

    /* renamed from: t */
    C23528a f61254t;

    /* renamed from: u */
    C13697o f61255u;

    /* renamed from: v */
    C3977j f61256v;

    /* renamed from: w */
    boolean f61257w;

    /* renamed from: x */
    public int f61258x;

    /* renamed from: y */
    public int f61259y;

    /* renamed from: z */
    public int f61260z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewPhotoSuggestView$a */
    /* loaded from: classes5.dex */
    public class C11771a extends ViewOnTouchListenerC23157n8.c {
        C11771a() {
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: b */
        public void mo65453b() {
            InterfaceC11773c interfaceC11773c = NewPhotoSuggestView.this.f61250H;
            if (interfaceC11773c != null) {
                interfaceC11773c.onDismiss();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewPhotoSuggestView$b */
    /* loaded from: classes5.dex */
    public class C11772b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f61262l1;

        C11772b(String str) {
            this.f61262l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!TextUtils.isEmpty(this.f61262l1) && str.equals(this.f61262l1)) {
                    C3977j c3977j = NewPhotoSuggestView.this.f61256v;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                        if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                            NewPhotoSuggestView newPhotoSuggestView = NewPhotoSuggestView.this;
                            newPhotoSuggestView.f61257w = true;
                            if (newPhotoSuggestView.f61246D.getWidth() == 0 || NewPhotoSuggestView.this.f61246D.getHeight() == 0) {
                                NewPhotoSuggestView.this.f61255u.m76481v(m18839c.getWidth(), m18839c.getHeight());
                            }
                            NewPhotoSuggestView.this.f61255u.m76480u(m18839c, true);
                            NewPhotoSuggestView.this.m65526c();
                            NewPhotoSuggestView.this.f61248F.requestLayout();
                            NewPhotoSuggestView.this.f61248F.invalidate();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.NewPhotoSuggestView$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC11773c {
        /* renamed from: a */
        void mo65527a(boolean z11);

        void onDismiss();
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        f61233O = m118742r;
        int m118742r2 = AbstractC23136l9.m118742r(6.0f);
        f61234P = m118742r2;
        int m118742r3 = AbstractC23136l9.m118742r(4.0f);
        f61235Q = m118742r3;
        int m118742r4 = AbstractC23136l9.m118742r(8.0f);
        f61236R = m118742r4;
        f61237S = m118742r + m118742r2;
        f61238T = m118742r3 + m118742r4;
    }

    public NewPhotoSuggestView(Context context, String str) {
        super(context);
        this.f61243A = AbstractC1388a.m6964f(MainApplication.getAppContext(), AbstractC16803z.bg_tooltip_foto);
        this.f61244B = AbstractC1388a.m6964f(MainApplication.getAppContext(), AbstractC16803z.bg_call_snapshot_send_btn);
        this.f61247E = new ViewOnTouchListenerC23157n8(new C11771a());
        this.f61248F = this;
        if (f61239U == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f61239U = c13704p1;
            c13704p1.setColor(AbstractC1388a.m6961c(context, AbstractC2808b.ng100));
            f61239U.m76613c();
        }
        f61239U.setTextSize(AbstractC23136l9.m118759w1(14));
        this.f61245C = AbstractC23306f.m120562A().m2515F().m2730d();
        f61242a0 = str;
        f61240V = AbstractC23136l9.m118764y0(f61239U, str);
        f61241W = AbstractC23136l9.m118761x0(f61239U, f61242a0);
        this.f61254t = new C23528a(context);
        this.f61256v = new C3977j(MainApplication.getAppContext());
        C13697o c13697o = new C13697o(this);
        this.f61255u = c13697o;
        int i11 = f61231M;
        c13697o.m76461I(new float[]{i11, i11, i11, i11, i11, i11, i11, i11});
        this.f61255u.m76482w(-2105377);
        this.f61255u.m76484y(f61232N);
    }

    /* renamed from: b */
    private void m65523b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C24003n m120120d0 = C23278z2.m120120d0();
                this.f61255u.m76477r();
                ((C23528a) this.f61254t.m123612r(this.f61256v)).m123579C(str, m120120d0, new C11772b(str));
            } else {
                this.f61255u.m76477r();
                this.f61248F.invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m65524d(int i11, int i12) {
        if (i11 > 0 && i12 > 0) {
            if (i11 >= i12) {
                this.f61255u.m76462J(1, f61229K);
            } else {
                this.f61255u.m76462J(4, f61229K);
            }
            this.f61255u.m76481v(i11, i12);
            m65526c();
            this.f61248F.requestLayout();
            return;
        }
        C13697o c13697o = this.f61255u;
        int i13 = f61229K;
        c13697o.m76462J(4, i13);
        this.f61255u.m76481v(f61240V, i13);
        m65526c();
        this.f61248F.requestLayout();
    }

    /* renamed from: a */
    public boolean m65525a(float f11, float f12) {
        return this.f61245C ? f11 >= 0.0f && f11 <= ((float) this.f61259y) && f12 >= 0.0f && f12 <= ((float) ((((this.f61260z - f61227I) - f61236R) - (f61230L * 2)) - f61241W)) : f11 >= 0.0f && f11 <= ((float) this.f61259y) && f12 >= 0.0f && f12 <= ((float) this.f61260z);
    }

    /* renamed from: c */
    void m65526c() {
        int i11;
        if (this.f61257w) {
            int i12 = f61237S;
            int i13 = f61227I;
            this.f61259y = (i13 * 2) + i12 + this.f61255u.m76473l();
            this.f61260z = f61238T + (i13 * 2) + this.f61255u.m76472k();
            C13697o c13697o = this.f61255u;
            c13697o.m76460H(f61233O + i13 + ((((this.f61259y - i12) - (i13 * 2)) - c13697o.m76473l()) / 2), f61235Q + i13);
        } else {
            int i14 = f61237S;
            int i15 = f61227I;
            this.f61259y = i14 + (i15 * 2) + this.f61255u.m76473l();
            int m76472k = f61238T + i15 + this.f61255u.m76472k();
            if (this.f61245C) {
                int i16 = f61230L;
                i11 = f61241W + i16 + i16;
            } else {
                i11 = i15;
            }
            this.f61260z = m76472k + i11;
            this.f61255u.m76460H(f61233O + i15, f61235Q + i15);
        }
        if (this.f61245C) {
            int i17 = f61233O;
            int i18 = f61227I;
            this.f61251q = i17 + i18 + ((((this.f61259y - f61237S) - (i18 * 2)) - f61240V) / 2);
            int m76472k2 = f61235Q + i18 + this.f61255u.m76472k() + f61228J;
            this.f61253s = m76472k2;
            int i19 = f61230L;
            int i21 = m76472k2 + i19 + f61241W;
            this.f61252r = i21;
            this.f61258x = i21 + i19;
            return;
        }
        this.f61258x = this.f61260z;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return getPhotoCoords();
    }

    public Rect getPhotoCoords() {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        this.f61248F.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + this.f61248F.getWidth();
        rect.bottom = rect.top + this.f61248F.getHeight();
        return rect;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f61243A.setBounds(0, 0, this.f61259y, this.f61260z);
        this.f61243A.draw(canvas);
        if (this.f61245C) {
            Drawable drawable = this.f61244B;
            int i11 = f61227I;
            drawable.setBounds(i11 * 2, this.f61253s, this.f61259y - (i11 * 2), this.f61252r + f61230L);
            this.f61244B.draw(canvas);
            canvas.drawText(f61242a0, this.f61251q, this.f61252r, f61239U);
        }
        this.f61255u.m76467d(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f61259y, this.f61258x);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC11773c interfaceC11773c;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && !this.f61247E.m119173e() && this.f61249G == m65525a(x11, y11) && (interfaceC11773c = this.f61250H) != null) {
                interfaceC11773c.mo65527a(this.f61249G);
            }
        } else {
            this.f61249G = m65525a(x11, y11);
        }
        this.f61247E.onTouch(this, motionEvent);
        return true;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public void setData(MediaItem mediaItem) {
        if (mediaItem == null) {
            return;
        }
        this.f61246D = mediaItem;
        m65524d(mediaItem.getWidth(), mediaItem.getHeight());
        m65523b(mediaItem.mo41081Q());
    }

    public void setListener(InterfaceC11773c interfaceC11773c) {
        this.f61250H = interfaceC11773c;
    }
}
