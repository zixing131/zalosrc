package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bo.C3013n3;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7852a;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.zview.AbstractC17466e;
import is.AbstractC20814p0;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31903ea;
import p716zh.C31942h4;
import p716zh.C32123ta;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import vg.C28227x3;

/* loaded from: classes4.dex */
public class FeedBackgroundView extends FrameLayout {

    /* renamed from: A */
    C23528a f44234A;

    /* renamed from: B */
    Paint f44235B;

    /* renamed from: C */
    TextPaint f44236C;

    /* renamed from: p */
    AspectRatioImageView f44237p;

    /* renamed from: q */
    RobotoTextView f44238q;

    /* renamed from: r */
    StatusComposeEditText f44239r;

    /* renamed from: s */
    CharSequence f44240s;

    /* renamed from: t */
    ArrayList f44241t;

    /* renamed from: u */
    int f44242u;

    /* renamed from: v */
    int f44243v;

    /* renamed from: w */
    int f44244w;

    /* renamed from: x */
    int f44245x;

    /* renamed from: y */
    int f44246y;

    /* renamed from: z */
    int f44247z;

    /* renamed from: com.zing.zalo.feed.components.FeedBackgroundView$a */
    /* loaded from: classes4.dex */
    public class C8082a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C31890dc f44248l1;

        /* renamed from: m1 */
        final /* synthetic */ CharSequence f44249m1;

        /* renamed from: n1 */
        final /* synthetic */ float f44250n1;

        /* renamed from: o1 */
        final /* synthetic */ int f44251o1;

        C8082a(C31890dc c31890dc, CharSequence charSequence, float f11, int i11) {
            this.f44248l1 = c31890dc;
            this.f44249m1 = charSequence;
            this.f44250n1 = f11;
            this.f44251o1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            FeedBackgroundView feedBackgroundView;
            AspectRatioImageView aspectRatioImageView;
            try {
                try {
                    feedBackgroundView = FeedBackgroundView.this;
                    aspectRatioImageView = feedBackgroundView.f44237p;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (aspectRatioImageView == null) {
                    feedBackgroundView.m43640l(this.f44248l1, this.f44249m1, this.f44250n1, c3979l, false, this.f44251o1);
                    return;
                }
                if (aspectRatioImageView.getTag(AbstractC6918a0.tag_bg_id) != null && ((Integer) FeedBackgroundView.this.f44237p.getTag(AbstractC6918a0.tag_bg_id)).intValue() == this.f44248l1.f146495a) {
                    super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                }
                if (FeedBackgroundView.this.f44237p.getTag(AbstractC6918a0.tag_visibility) != null) {
                    AspectRatioImageView aspectRatioImageView2 = FeedBackgroundView.this.f44237p;
                    aspectRatioImageView2.setVisibility(((Integer) aspectRatioImageView2.getTag(AbstractC6918a0.tag_visibility)).intValue());
                }
                FeedBackgroundView.this.m43640l(this.f44248l1, this.f44249m1, this.f44250n1, c3979l, false, this.f44251o1);
            } catch (Throwable th2) {
                FeedBackgroundView.this.m43640l(this.f44248l1, this.f44249m1, this.f44250n1, c3979l, false, this.f44251o1);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedBackgroundView$b */
    /* loaded from: classes4.dex */
    public class C8083b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C31942h4 f44253l1;

        /* renamed from: m1 */
        final /* synthetic */ float f44254m1;

        /* renamed from: n1 */
        final /* synthetic */ int f44255n1;

        /* renamed from: o1 */
        final /* synthetic */ int f44256o1;

        C8083b(C31942h4 c31942h4, float f11, int i11, int i12) {
            this.f44253l1 = c31942h4;
            this.f44254m1 = f11;
            this.f44255n1 = i11;
            this.f44256o1 = i12;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (c3979l.m18839c().getWidth() != 0 && c3979l.m18839c().getHeight() != 0) {
                    C7852a.d m43634f = FeedBackgroundView.this.m43634f(c3979l, this.f44253l1, this.f44254m1);
                    Point m43633e = FeedBackgroundView.this.m43633e(this.f44253l1.f146762c, this.f44254m1, m43634f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((AspectRatioImageView) FeedBackgroundView.this.f44241t.get(this.f44255n1)).getLayoutParams();
                    layoutParams.setMargins(m43633e.x + ((int) (this.f44253l1.f146763d * AbstractC23136l9.m118722k0())), m43633e.y + ((int) (this.f44253l1.f146764e * AbstractC23136l9.m118722k0() * this.f44254m1)), 0, 0);
                    layoutParams.width = m43634f.f42176a;
                    ((AspectRatioImageView) FeedBackgroundView.this.f44241t.get(this.f44255n1)).setRatio((m43634f.f42177b * 1.0f) / m43634f.f42176a);
                    ((AspectRatioImageView) FeedBackgroundView.this.f44241t.get(this.f44255n1)).requestLayout();
                    if (((AspectRatioImageView) FeedBackgroundView.this.f44241t.get(this.f44255n1)).getTag(AbstractC6918a0.tag_typo_id) != null && ((Integer) ((AspectRatioImageView) FeedBackgroundView.this.f44241t.get(this.f44255n1)).getTag(AbstractC6918a0.tag_typo_id)).intValue() == this.f44256o1) {
                        super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public FeedBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44242u = 0;
        this.f44243v = 0;
        this.f44244w = 0;
        this.f44245x = AbstractC23136l9.m118742r(16.0f);
        this.f44246y = AbstractC23136l9.m118742r(16.0f);
        this.f44247z = AbstractC23136l9.m118742r(30.0f);
        m43636h(context);
    }

    /* renamed from: c */
    public static int m43629c(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 2 : 3;
        }
        return 4;
    }

    /* renamed from: a */
    void m43630a() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(getContext());
        aspectRatioImageView.setScaleOption(6);
        if (this.f44241t == null) {
            this.f44241t = new ArrayList();
        }
        this.f44241t.add(aspectRatioImageView);
        addView(aspectRatioImageView, layoutParams);
    }

    /* renamed from: b */
    void m43631b() {
        RobotoTextView robotoTextView = this.f44238q;
        if (robotoTextView != null) {
            robotoTextView.bringToFront();
        }
        StatusComposeEditText statusComposeEditText = this.f44239r;
        if (statusComposeEditText != null) {
            statusComposeEditText.bringToFront();
        }
    }

    /* renamed from: d */
    C28227x3 m43632d(int i11, int i12) {
        boolean z11;
        if (i11 != 0 && i12 != 0) {
            C28227x3 c28227x3 = new C28227x3(i11, i12);
            if (i11 >= i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f11 = (i12 * 1.0f) / i11;
            if (z11) {
                while (i11 > 480) {
                    i11 /= 2;
                }
                i12 = (int) (i11 * f11);
            } else {
                while (i12 > 480) {
                    i12 /= 2;
                }
                i11 = (int) (i12 / f11);
            }
            c28227x3.f131648a = i11;
            c28227x3.f131649b = i12;
            return c28227x3;
        }
        return null;
    }

    /* renamed from: e */
    protected Point m43633e(int i11, float f11, C7852a.d dVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m118722k0 = AbstractC23136l9.m118722k0();
        int i16 = (int) (m118722k0 * f11);
        int i17 = 0;
        switch (i11) {
            case 1:
            default:
                i14 = 0;
                break;
            case 2:
                i12 = (m118722k0 - dVar.f42176a) / 2;
                i17 = i12;
                i14 = 0;
                break;
            case 3:
                i12 = m118722k0 - dVar.f42176a;
                i17 = i12;
                i14 = 0;
                break;
            case 4:
                i13 = (i16 - dVar.f42177b) / 2;
                i14 = i13;
                break;
            case 5:
                i17 = (m118722k0 - dVar.f42176a) / 2;
                i14 = (i16 - dVar.f42177b) / 2;
                break;
            case 6:
                i17 = m118722k0 - dVar.f42176a;
                i14 = (i16 - dVar.f42177b) / 2;
                break;
            case 7:
                i13 = i16 - dVar.f42177b;
                i14 = i13;
                break;
            case 8:
                i17 = (m118722k0 - dVar.f42176a) / 2;
                i15 = dVar.f42177b;
                i14 = i16 - i15;
                break;
            case 9:
                i17 = m118722k0 - dVar.f42176a;
                i15 = dVar.f42177b;
                i14 = i16 - i15;
                break;
        }
        return new Point(i17, i14);
    }

    /* renamed from: f */
    protected C7852a.d m43634f(C3979l c3979l, C31942h4 c31942h4, float f11) {
        int i11;
        int i12;
        Bitmap m18839c;
        float m118722k0;
        int i13;
        float f12;
        float height;
        int height2;
        float f13;
        float f14;
        if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() != 0 && c3979l.m18839c().getHeight() != 0) {
            int i14 = 0;
            try {
                m18839c = c3979l.m18839c();
                m118722k0 = AbstractC23136l9.m118722k0();
                i13 = (int) (f11 * m118722k0);
                f12 = c31942h4.f146765f;
                height = (c3979l.m18839c().getHeight() * 1.0f) / c3979l.m18839c().getWidth();
                String str = c31942h4.f146761b;
                switch (str.hashCode()) {
                    case 2402104:
                        if (str.equals(Image.SCALE_TYPE_NONE)) {
                            i12 = 0;
                            break;
                        }
                        i12 = -1;
                        break;
                    case 182565115:
                        if (str.equals(Image.SCALE_TYPE_FIXED_WIDTH)) {
                            i12 = 1;
                            break;
                        }
                        i12 = -1;
                        break;
                    case 931556466:
                        if (str.equals(Image.SCALE_TYPE_FIXED_HEIGHT)) {
                            i12 = 2;
                            break;
                        }
                        i12 = -1;
                        break;
                    case 1244896183:
                        if (str.equals(Image.SCALE_TYPE_SCREEN)) {
                            i12 = 3;
                            break;
                        }
                        i12 = -1;
                        break;
                    default:
                        i12 = -1;
                        break;
                }
                try {
                } catch (Exception e11) {
                    i11 = i12;
                    e = e11;
                    e.printStackTrace();
                    i12 = i11;
                    return new C7852a.d(i12, i14);
                }
            } catch (Exception e12) {
                e = e12;
                i11 = 0;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            i12 = (int) (m18839c.getWidth() * f12);
                            height2 = m18839c.getHeight();
                        } else {
                            i12 = (int) (m118722k0 * f12);
                            f14 = i13;
                            f13 = f14 * f12;
                            i14 = (int) f13;
                            return new C7852a.d(i12, i14);
                        }
                    } else {
                        int i15 = (int) (i13 / f12);
                        i11 = (int) (i15 / height);
                        i14 = i15;
                        i12 = i11;
                        return new C7852a.d(i12, i14);
                    }
                } else {
                    i12 = (int) (m118722k0 * f12);
                    f13 = i12 * height;
                    i14 = (int) f13;
                    return new C7852a.d(i12, i14);
                }
            } else {
                i12 = (int) (m18839c.getWidth() * f12);
                height2 = m18839c.getHeight();
            }
            f14 = height2;
            f13 = f14 * f12;
            i14 = (int) f13;
            return new C7852a.d(i12, i14);
        }
        return null;
    }

    /* renamed from: g */
    void m43635g() {
        try {
            ArrayList arrayList = this.f44241t;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i11 = 0; i11 < this.f44241t.size(); i11++) {
                    ((AspectRatioImageView) this.f44241t.get(i11)).setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public TextView getViewRender() {
        return this.f44243v == 0 ? this.f44238q : this.f44239r;
    }

    /* renamed from: h */
    void m43636h(Context context) {
        this.f44234A = new C23528a(context);
        Paint paint = new Paint(1);
        this.f44235B = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f44236C = new TextPaint(1);
        setLongClickable(true);
        setClickable(true);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(context);
        this.f44237p = aspectRatioImageView;
        aspectRatioImageView.setScaleOption(3);
        addView(this.f44237p, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        int i11 = this.f44245x;
        layoutParams2.setMargins(i11, 0, i11, 0);
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f44238q = robotoTextView;
        robotoTextView.setId(AbstractC6918a0.tvMessage);
        this.f44238q.setVisibility(8);
        this.f44238q.setIncludeFontPadding(true);
        this.f44238q.setLineSpacing(0.8f, 1.0f);
        this.f44238q.setTextSize(1, 15.0f);
        this.f44238q.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        addView(this.f44238q, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        int i12 = this.f44246y;
        layoutParams3.setMargins(i12, i12, i12, i12);
        try {
            this.f44239r = (StatusComposeEditText) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.bg_feed_edittext_layout, (ViewGroup) this, false);
        } catch (Exception e11) {
            e11.printStackTrace();
            StatusComposeEditText statusComposeEditText = new StatusComposeEditText(context);
            this.f44239r = statusComposeEditText;
            statusComposeEditText.setId(AbstractC6918a0.etDesc);
            this.f44239r.setVisibility(8);
            this.f44239r.setTextSize(1, 16.0f);
            this.f44239r.setBackgroundResource(AbstractC17466e.transparent);
            this.f44239r.setGravity(48);
            this.f44239r.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.status_default_text));
            this.f44239r.setImeOptions(6);
            this.f44239r.setIncludeFontPadding(true);
            this.f44239r.setSingleLine(false);
            this.f44239r.setInputType(180225);
            this.f44239r.setMinLines(2);
            this.f44239r.setSaveEnabled(false);
            this.f44239r.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f44239r.setHintTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f44239r.setLinkTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        }
        addView(this.f44239r, layoutParams3);
    }

    /* renamed from: i */
    void m43637i(C31942h4 c31942h4, int i11, float f11, boolean z11, int i12) {
        if (this.f44241t.get(i11) != null && !TextUtils.isEmpty(c31942h4.f146760a)) {
            ((AspectRatioImageView) this.f44241t.get(i11)).setTag(AbstractC6918a0.tag_typo_id, Integer.valueOf(i12));
            if (!z11 || C23999j.m125696L2(c31942h4.f146760a, C23278z2.m120162x())) {
                ((C23528a) this.f44234A.m123612r((InterfaceC3968a) this.f44241t.get(i11))).m123579C(c31942h4.f146760a, C23278z2.m120162x(), new C8083b(c31942h4, f11, i11, i12).m125762H1(AbstractC23006a0.f111912c).m125764I1(150));
            }
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    /* renamed from: j */
    public void m43638j(C3013n3 c3013n3, CharSequence charSequence) {
        float f11;
        if (c3013n3 != null) {
            f11 = c3013n3.f11989a;
        } else {
            f11 = 1.0f;
        }
        m43639k(c3013n3, charSequence, f11);
    }

    /* renamed from: k */
    public void m43639k(C3013n3 c3013n3, CharSequence charSequence, float f11) {
        if (c3013n3 != null) {
            try {
                if (c3013n3.m14430a() && !TextUtils.isEmpty(charSequence)) {
                    TextView viewRender = getViewRender();
                    if (viewRender != null) {
                        viewRender.setText(charSequence);
                        viewRender.setTextColor(c3013n3.f11990b);
                        viewRender.setTextAlignment(m43629c(c3013n3.f11992d));
                        ((FrameLayout.LayoutParams) viewRender.getLayoutParams()).gravity = 17;
                    }
                    AspectRatioImageView aspectRatioImageView = this.f44237p;
                    if (aspectRatioImageView != null) {
                        aspectRatioImageView.setVisibility(0);
                        this.f44237p.setRatio(f11);
                        this.f44237p.setBackgroundColor(c3013n3.f11991c);
                        this.f44237p.setImageResource(AbstractC17466e.transparent);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0123 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0006, B:8:0x000e, B:9:0x002a, B:12:0x0041, B:14:0x004a, B:15:0x0050, B:18:0x0063, B:20:0x006b, B:22:0x0071, B:27:0x0092, B:28:0x0096, B:29:0x009e, B:37:0x00b0, B:38:0x00b1, B:39:0x00e9, B:43:0x00f1, B:44:0x00f6, B:46:0x0123, B:49:0x012a, B:50:0x012d, B:56:0x0177, B:58:0x0195, B:59:0x019d, B:52:0x0171, B:64:0x00f4, B:65:0x00ad, B:68:0x0099, B:70:0x00be, B:72:0x00d4, B:74:0x001e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0006, B:8:0x000e, B:9:0x002a, B:12:0x0041, B:14:0x004a, B:15:0x0050, B:18:0x0063, B:20:0x006b, B:22:0x0071, B:27:0x0092, B:28:0x0096, B:29:0x009e, B:37:0x00b0, B:38:0x00b1, B:39:0x00e9, B:43:0x00f1, B:44:0x00f6, B:46:0x0123, B:49:0x012a, B:50:0x012d, B:56:0x0177, B:58:0x0195, B:59:0x019d, B:52:0x0171, B:64:0x00f4, B:65:0x00ad, B:68:0x0099, B:70:0x00be, B:72:0x00d4, B:74:0x001e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0006, B:8:0x000e, B:9:0x002a, B:12:0x0041, B:14:0x004a, B:15:0x0050, B:18:0x0063, B:20:0x006b, B:22:0x0071, B:27:0x0092, B:28:0x0096, B:29:0x009e, B:37:0x00b0, B:38:0x00b1, B:39:0x00e9, B:43:0x00f1, B:44:0x00f6, B:46:0x0123, B:49:0x012a, B:50:0x012d, B:56:0x0177, B:58:0x0195, B:59:0x019d, B:52:0x0171, B:64:0x00f4, B:65:0x00ad, B:68:0x0099, B:70:0x00be, B:72:0x00d4, B:74:0x001e), top: B:2:0x0006 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m43640l(C31890dc c31890dc, CharSequence charSequence, float f11, C3979l c3979l, boolean z11, int i11) {
        String m153343h;
        int i12;
        Canvas canvas;
        int i13;
        int i14;
        TextPaint textPaint;
        int m118742r;
        Typeface m153062r0;
        Typeface typeface;
        StaticLayout staticLayout;
        C28227x3 m43632d;
        Bitmap bitmap;
        boolean z12;
        float f12;
        float f13;
        float f14;
        int i15 = i11;
        try {
            if (this.f44244w != 1) {
                return;
            }
            if (z11) {
                m153343h = C31903ea.f146582a.m153344i(charSequence.toString(), c31890dc.f146495a);
            } else {
                m153343h = C31903ea.f146582a.m153343h(charSequence.toString(), c31890dc.f146495a);
            }
            C24003n m120133j = C23278z2.m120133j(getContext(), AbstractC23006a0.m117930z(), C32123ta.m155029B());
            if (C23999j.m125696L2(m153343h, m120133j)) {
                return;
            }
            int m118722k0 = AbstractC23136l9.m118722k0();
            if (f11 > 0.0f) {
                i12 = (int) (m118722k0 * f11);
            } else {
                i12 = m118722k0;
            }
            Bitmap createBitmap = Bitmap.createBitmap(m118722k0, i12, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            if (c31890dc.f146519y == 0) {
                if (c3979l != null) {
                    bitmap = c3979l.m18839c();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    float f15 = m118722k0;
                    float width = bitmap.getWidth();
                    float f16 = (f15 * 1.0f) / width;
                    float f17 = i12;
                    float height = bitmap.getHeight();
                    float f18 = (f17 * 1.0f) / height;
                    if (f16 >= f18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        f12 = f17 - (height * f16);
                    } else {
                        f12 = f15 - (width * f18);
                    }
                    float f19 = f12 / 2.0f;
                    if (z12) {
                        f13 = 0.0f;
                    } else {
                        f13 = f19;
                    }
                    if (z12) {
                        f14 = f19;
                    } else {
                        f14 = 0.0f;
                    }
                    if (!z12) {
                        f15 -= f19;
                    }
                    if (z12) {
                        f17 -= f19;
                    }
                    canvas2.drawBitmap(bitmap, (Rect) null, new RectF(f13, f14, f15, f17), this.f44235B);
                    canvas = canvas2;
                } else {
                    this.f44235B.setColor(c31890dc.f146516v);
                    canvas = canvas2;
                    canvas2.drawRect(0.0f, 0.0f, m118722k0, i12, this.f44235B);
                }
            } else {
                canvas = canvas2;
                this.f44235B.setColor(c31890dc.f146516v);
                canvas.drawRect(0.0f, 0.0f, m118722k0, i12, this.f44235B);
            }
            int i16 = this.f44244w;
            if (i16 != 0 && i16 != 2) {
                i13 = this.f44247z;
                i14 = m118722k0 - (i13 * 2);
                textPaint = new TextPaint();
                m118742r = AbstractC23136l9.m118742r(c31890dc.m153244m(charSequence, i15));
                this.f44236C.setColor(c31890dc.m153237b());
                m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
                if (m153062r0 != null) {
                    this.f44236C.setTypeface(m153062r0);
                }
                while (true) {
                    if (m153062r0 != null) {
                        textPaint.setTypeface(m153062r0);
                    }
                    float f21 = m118742r;
                    textPaint.setTextSize(f21);
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    typeface = m153062r0;
                    int m118742r2 = AbstractC23136l9.m118742r(c31890dc.m153241g(this.f44240s, i15)) - ((int) (fontMetrics.descent - fontMetrics.ascent));
                    this.f44236C.setTextSize(f21);
                    staticLayout = new StaticLayout(charSequence, this.f44236C, i14, AbstractC22055v0.m115165y(c31890dc.f146515u), 1.0f, m118742r2, true);
                    m118742r -= AbstractC23136l9.m118742r(1.0f);
                    if (m118742r != 0 || staticLayout.getHeight() <= i12) {
                        break;
                    }
                    i15 = i11;
                    m153062r0 = typeface;
                }
                canvas.save();
                Canvas canvas3 = canvas;
                canvas3.translate(i13, (i12 - staticLayout.getHeight()) / 2);
                staticLayout.draw(canvas3);
                canvas3.restore();
                m43632d = m43632d(m118722k0, i12);
                if (m43632d == null) {
                    m43632d = new C28227x3(m118722k0 / 2, i12 / 2);
                }
                C23999j.m125686E1(new C3979l(Bitmap.createScaledBitmap(createBitmap, m43632d.f131648a, m43632d.f131649b, false), m120133j.f116266g), m153343h, m120133j);
            }
            i13 = this.f44245x;
            i14 = m118722k0 - (i13 * 2);
            textPaint = new TextPaint();
            m118742r = AbstractC23136l9.m118742r(c31890dc.m153244m(charSequence, i15));
            this.f44236C.setColor(c31890dc.m153237b());
            m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
            if (m153062r0 != null) {
            }
            while (true) {
                if (m153062r0 != null) {
                }
                float f212 = m118742r;
                textPaint.setTextSize(f212);
                Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
                typeface = m153062r0;
                int m118742r22 = AbstractC23136l9.m118742r(c31890dc.m153241g(this.f44240s, i15)) - ((int) (fontMetrics2.descent - fontMetrics2.ascent));
                this.f44236C.setTextSize(f212);
                staticLayout = new StaticLayout(charSequence, this.f44236C, i14, AbstractC22055v0.m115165y(c31890dc.f146515u), 1.0f, m118742r22, true);
                m118742r -= AbstractC23136l9.m118742r(1.0f);
                if (m118742r != 0) {
                    break;
                }
                i15 = i11;
                m153062r0 = typeface;
            }
            canvas.save();
            Canvas canvas32 = canvas;
            canvas32.translate(i13, (i12 - staticLayout.getHeight()) / 2);
            staticLayout.draw(canvas32);
            canvas32.restore();
            m43632d = m43632d(m118722k0, i12);
            if (m43632d == null) {
            }
            C23999j.m125686E1(new C3979l(Bitmap.createScaledBitmap(createBitmap, m43632d.f131648a, m43632d.f131649b, false), m120133j.f116266g), m153343h, m120133j);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[Catch: Exception -> 0x008d, TryCatch #0 {Exception -> 0x008d, blocks: (B:3:0x000a, B:5:0x0030, B:10:0x011f, B:13:0x0039, B:15:0x005f, B:16:0x006a, B:18:0x0072, B:20:0x0090, B:21:0x00a1, B:25:0x00c8, B:27:0x00cf, B:29:0x00d5, B:32:0x00e1, B:33:0x010d, B:34:0x00cc, B:35:0x012b, B:37:0x012f), top: B:2:0x000a }] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m43641m(C31890dc c31890dc, boolean z11, boolean z12, CharSequence charSequence, float f11, int i11) {
        String str;
        String str2;
        try {
            m43643p(c31890dc, z11, charSequence, i11);
            float m108597C = AbstractC20814p0.m108597C(AbstractC23136l9.m118722k0() - (this.f44245x * 2), AbstractC23136l9.m118722k0(), f11, c31890dc, charSequence, this.f44236C, null, getViewRender());
            if (c31890dc != null) {
                int i12 = c31890dc.f146519y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        this.f44237p.setRatio(m108597C);
                        AbstractC23136l9.m118696b1(this.f44237p, c31890dc.m153240e());
                        this.f44237p.setImageResource(AbstractC16803z.trans);
                        this.f44237p.setTag(AbstractC6918a0.tag_bg_id, -100);
                        List list = c31890dc.f146492B;
                        if (list != null) {
                            m43646s(c31890dc.f146495a, list.size());
                            for (int i13 = 0; i13 < c31890dc.f146492B.size(); i13++) {
                                m43637i((C31942h4) c31890dc.f146492B.get(i13), i13, f11, z12, c31890dc.f146495a);
                            }
                        }
                        m43640l(c31890dc, charSequence, f11, null, false, i11);
                    }
                } else {
                    this.f44237p.setRatio(m108597C);
                    this.f44237p.setBackgroundColor(c31890dc.f146516v);
                    this.f44237p.setImageResource(AbstractC16803z.trans);
                    this.f44237p.setTag(AbstractC6918a0.tag_bg_id, Integer.valueOf(c31890dc.f146495a));
                    int i14 = this.f44244w;
                    if (i14 != 0 && i14 != 2) {
                        str = c31890dc.f146513s;
                        str2 = str;
                        if (!TextUtils.isEmpty(str2)) {
                            boolean m125696L2 = C23999j.m125696L2(str2, C23278z2.m120163y());
                            if (!z12 || m125696L2) {
                                ((C23528a) this.f44234A.m123612r(this.f44237p)).m123579C(str2, C23278z2.m120163y(), new C8082a(c31890dc, charSequence, m108597C, i11).m125762H1(AbstractC23006a0.f111912c).m125764I1(150));
                            }
                        }
                        m43640l(c31890dc, charSequence, f11, null, true, i11);
                        m43635g();
                    }
                    str = c31890dc.f146512r;
                    str2 = str;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    m43640l(c31890dc, charSequence, f11, null, true, i11);
                    m43635g();
                }
                setTag(AbstractC6918a0.tag_typo_id, Integer.valueOf(c31890dc.f146495a));
                return;
            }
            AspectRatioImageView aspectRatioImageView = this.f44237p;
            if (aspectRatioImageView != null) {
                aspectRatioImageView.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public void m43642n(C31890dc c31890dc, boolean z11) {
        m43643p(c31890dc, z11, "", 7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (AbstractC26683d.f126393l) {
            AbstractC28245z3.m142219b(this.f44240s, null);
        }
    }

    /* renamed from: p */
    public void m43643p(C31890dc c31890dc, boolean z11, CharSequence charSequence, int i11) {
        float m153241g;
        try {
            TextView viewRender = getViewRender();
            if (c31890dc != null && viewRender != null) {
                if (c31890dc.m153249t()) {
                    viewRender.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
                } else {
                    viewRender.setTextColor(c31890dc.m153237b());
                }
                viewRender.setHintTextColor(c31890dc.m153238c());
                viewRender.setTextSize(1, c31890dc.m153244m(charSequence, i11));
                viewRender.setTextAlignment(m43629c(c31890dc.f146515u));
                Typeface m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
                if (m153062r0 != null) {
                    viewRender.setTypeface(m153062r0);
                }
                if (c31890dc.m153249t()) {
                    viewRender.setLineSpacing(AbstractC23136l9.m118742r(c31890dc.m153239d()), 1.0f);
                    if (!z11) {
                        viewRender.setTextSize(1, C31890dc.f146485E);
                    }
                } else {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTypeface(m153062r0);
                    textPaint.setTextSize(viewRender.getTextSize());
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int i12 = (int) (fontMetrics.descent - fontMetrics.ascent);
                    if (c31890dc.m153248s()) {
                        m153241g = c31890dc.m153242i(i11);
                    } else {
                        m153241g = c31890dc.m153241g(charSequence, i11);
                    }
                    viewRender.setLineSpacing(AbstractC23136l9.m118742r(m153241g) - i12, 1.0f);
                }
                if (viewRender.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    if (c31890dc.m153248s()) {
                        ((FrameLayout.LayoutParams) viewRender.getLayoutParams()).gravity = 51;
                    } else {
                        ((FrameLayout.LayoutParams) viewRender.getLayoutParams()).gravity = 17;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public void m43644q(int i11, Object obj) {
        AspectRatioImageView aspectRatioImageView = this.f44237p;
        if (aspectRatioImageView != null) {
            aspectRatioImageView.setTag(i11, obj);
        }
    }

    /* renamed from: r */
    public boolean m43645r(C31890dc c31890dc, CharSequence charSequence, float f11) {
        float m108597C = AbstractC20814p0.m108597C(AbstractC23136l9.m118722k0() - (this.f44245x * 2), AbstractC23136l9.m118722k0(), f11, c31890dc, charSequence, this.f44236C, null, getViewRender());
        AspectRatioImageView aspectRatioImageView = this.f44237p;
        if (aspectRatioImageView != null && m108597C != aspectRatioImageView.getRatio()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    void m43646s(int i11, int i12) {
        int i13;
        try {
            if (getTag(AbstractC6918a0.tag_typo_id) != null && ((Integer) getTag(AbstractC6918a0.tag_typo_id)).intValue() == i11) {
                return;
            }
            ArrayList arrayList = this.f44241t;
            if (arrayList != null) {
                i13 = arrayList.size();
            } else {
                i13 = 0;
            }
            if (i12 > i13) {
                int i14 = i12 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    m43630a();
                }
            }
            m43635g();
            m43631b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setBackgroundImageGravity(int i11) {
        AspectRatioImageView aspectRatioImageView = this.f44237p;
        if (aspectRatioImageView != null && (aspectRatioImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) this.f44237p.getLayoutParams()).gravity = i11;
        }
    }

    public void setContent(CharSequence charSequence) {
        this.f44240s = charSequence;
        if (getViewRender() != null) {
            getViewRender().setText(charSequence);
        }
        if (AbstractC26683d.f126393l) {
            AbstractC28245z3.m142219b(this.f44240s, this);
        }
    }

    public void setHeight(int i11) {
        if (getLayoutParams() != null && i11 >= 0) {
            getLayoutParams().height = i11;
            this.f44237p.setRatio((i11 * 1.0f) / getWidth());
            requestLayout();
        }
    }

    public void setModeUse(int i11) {
        this.f44243v = i11;
        try {
            if (i11 == 0) {
                this.f44238q.setVisibility(0);
                this.f44239r.setVisibility(8);
            } else {
                this.f44238q.setVisibility(8);
                this.f44239r.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setModeView(int i11) {
        this.f44244w = i11;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        RobotoTextView robotoTextView = this.f44238q;
                        if (robotoTextView != null) {
                            ((FrameLayout.LayoutParams) robotoTextView.getLayoutParams()).leftMargin = this.f44245x;
                            ((FrameLayout.LayoutParams) this.f44238q.getLayoutParams()).rightMargin = this.f44245x;
                            this.f44238q.requestLayout();
                        }
                        AspectRatioImageView aspectRatioImageView = this.f44237p;
                        if (aspectRatioImageView != null) {
                            aspectRatioImageView.setScaleOption(1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                RobotoTextView robotoTextView2 = this.f44238q;
                if (robotoTextView2 != null) {
                    ((FrameLayout.LayoutParams) robotoTextView2.getLayoutParams()).leftMargin = this.f44247z;
                    ((FrameLayout.LayoutParams) this.f44238q.getLayoutParams()).rightMargin = this.f44247z;
                    this.f44238q.requestLayout();
                }
                AspectRatioImageView aspectRatioImageView2 = this.f44237p;
                if (aspectRatioImageView2 != null) {
                    aspectRatioImageView2.setScaleOption(6);
                    return;
                }
                return;
            }
            RobotoTextView robotoTextView3 = this.f44238q;
            if (robotoTextView3 != null) {
                ((FrameLayout.LayoutParams) robotoTextView3.getLayoutParams()).leftMargin = this.f44245x;
                ((FrameLayout.LayoutParams) this.f44238q.getLayoutParams()).rightMargin = this.f44245x;
                this.f44238q.requestLayout();
            }
            AspectRatioImageView aspectRatioImageView3 = this.f44237p;
            if (aspectRatioImageView3 != null) {
                aspectRatioImageView3.setScaleOption(6);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[Catch: Exception -> 0x0012, TRY_LEAVE, TryCatch #0 {Exception -> 0x0012, blocks: (B:2:0x0000, B:11:0x000b, B:13:0x000f, B:14:0x001a, B:16:0x001e, B:21:0x0014, B:23:0x0018), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStatusLeftRightMargin(int i11) {
        RobotoTextView robotoTextView;
        try {
            int i12 = this.f44244w;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return;
                    }
                } else {
                    if (i11 != this.f44247z) {
                        this.f44247z = i11;
                        robotoTextView = this.f44238q;
                        if (robotoTextView == null) {
                            ((FrameLayout.LayoutParams) robotoTextView.getLayoutParams()).leftMargin = i11;
                            ((FrameLayout.LayoutParams) this.f44238q.getLayoutParams()).rightMargin = i11;
                            this.f44238q.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (i11 != this.f44245x) {
                this.f44245x = i11;
                robotoTextView = this.f44238q;
                if (robotoTextView == null) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setTypeRender(int i11) {
        this.f44242u = i11;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f44237p.setVisibility(0);
                }
            } else {
                this.f44237p.setVisibility(8);
            }
            m43635g();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
