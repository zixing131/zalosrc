package com.zing.zalo.shortvideo.p072ui.widget.p074iv;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.androidquery.util.RecyclingImageView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import s20.AbstractC26105g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class RoundedImageView extends RecyclingImageView {

    /* renamed from: p */
    private float f54373p;

    /* renamed from: q */
    private EnumC10755b f54374q;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.RoundedImageView$a */
    /* loaded from: classes5.dex */
    public static final class C10754a extends ViewOutlineProvider {

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.RoundedImageView$a$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f54376a;

            static {
                int[] iArr = new int[EnumC10755b.values().length];
                try {
                    iArr[EnumC10755b.f54377p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC10755b.f54378q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC10755b.f54379r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC10755b.f54380s.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC10755b.f54381t.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC10755b.f54382u.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC10755b.f54383v.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC10755b.f54384w.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC10755b.f54385x.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f54376a = iArr;
            }
        }

        C10754a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            float cornerRadius = RoundedImageView.this.getCornerRadius();
            switch (a.f54376a[RoundedImageView.this.f54374q.ordinal()]) {
                case 1:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cornerRadius);
                    return;
                case 2:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) cornerRadius), cornerRadius);
                    return;
                case 3:
                    outline.setRoundRect(0, 0 - ((int) cornerRadius), view.getWidth(), view.getHeight(), cornerRadius);
                    return;
                case 4:
                    outline.setRoundRect(0, 0, view.getWidth() + ((int) cornerRadius), view.getHeight(), cornerRadius);
                    return;
                case 5:
                    outline.setRoundRect(0 - ((int) cornerRadius), 0, view.getWidth(), view.getHeight(), cornerRadius);
                    return;
                case 6:
                    int i11 = (int) cornerRadius;
                    outline.setRoundRect(0, 0, view.getWidth() + i11, view.getHeight() + i11, cornerRadius);
                    return;
                case 7:
                    int i12 = (int) cornerRadius;
                    outline.setRoundRect(0 - i12, 0, view.getWidth(), view.getHeight() + i12, cornerRadius);
                    return;
                case 8:
                    int i13 = (int) cornerRadius;
                    outline.setRoundRect(0, 0 - i13, view.getWidth() + i13, view.getHeight(), cornerRadius);
                    return;
                case 9:
                    int i14 = 0 - ((int) cornerRadius);
                    outline.setRoundRect(i14, i14, view.getWidth(), view.getHeight(), cornerRadius);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.RoundedImageView$b */
    /* loaded from: classes5.dex */
    public static final class EnumC10755b {

        /* renamed from: p */
        public static final EnumC10755b f54377p = new EnumC10755b("ALL_CORNER", 0);

        /* renamed from: q */
        public static final EnumC10755b f54378q = new EnumC10755b("TOP_CORNER", 1);

        /* renamed from: r */
        public static final EnumC10755b f54379r = new EnumC10755b("BOTTOM_CORNER", 2);

        /* renamed from: s */
        public static final EnumC10755b f54380s = new EnumC10755b("LEFT_CORNER", 3);

        /* renamed from: t */
        public static final EnumC10755b f54381t = new EnumC10755b("RIGHT_CORNER", 4);

        /* renamed from: u */
        public static final EnumC10755b f54382u = new EnumC10755b("TOP_LEFT_CORNER", 5);

        /* renamed from: v */
        public static final EnumC10755b f54383v = new EnumC10755b("TOP_RIGHT_CORNER", 6);

        /* renamed from: w */
        public static final EnumC10755b f54384w = new EnumC10755b("BOTTOM_LEFT_CORNER", 7);

        /* renamed from: x */
        public static final EnumC10755b f54385x = new EnumC10755b("BOTTOM_RIGHT_CORNER", 8);

        /* renamed from: y */
        private static final /* synthetic */ EnumC10755b[] f54386y;

        /* renamed from: z */
        private static final /* synthetic */ InterfaceC30165a f54387z;

        static {
            EnumC10755b[] m55956b = m55956b();
            f54386y = m55956b;
            f54387z = AbstractC30166b.m148796a(m55956b);
        }

        private EnumC10755b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC10755b[] m55956b() {
            return new EnumC10755b[]{f54377p, f54378q, f54379r, f54380s, f54381t, f54382u, f54383v, f54384w, f54385x};
        }

        public static EnumC10755b valueOf(String str) {
            return (EnumC10755b) Enum.valueOf(EnumC10755b.class, str);
        }

        public static EnumC10755b[] values() {
            return (EnumC10755b[]) f54386y.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public final float getCornerRadius() {
        float width;
        float f11 = this.f54373p;
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        if (f11 <= 1.0f) {
            width = f11 * getWidth();
        } else {
            if (f11 <= getWidth() / 2.0f) {
                return this.f54373p;
            }
            width = getWidth();
        }
        return width / 2.0f;
    }

    /* renamed from: j */
    public final void m55955j(float f11, EnumC10755b enumC10755b) {
        AbstractC19074t.m100208f(enumC10755b, "cornerType");
        this.f54374q = enumC10755b;
        this.f54373p = f11;
        invalidateOutline();
    }

    public /* synthetic */ RoundedImageView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f54373p = AbstractC26105g.m134347n(4);
        this.f54374q = EnumC10755b.f54377p;
        setClipToOutline(true);
        setOutlineProvider(new C10754a());
        setWillNotDraw(false);
    }
}
