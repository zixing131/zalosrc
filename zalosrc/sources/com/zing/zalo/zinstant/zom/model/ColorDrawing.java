package com.zing.zalo.zinstant.zom.model;

import android.graphics.Color;
import com.zing.zalo.zinstant.utils.C17206r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ColorDrawing {
    public static final Companion Companion = new Companion(null);
    private Companion.ColorModel mColor;
    private int mColorInt;
    private int mDestinationColor;
    private Companion.ColorModel mDiffColor;
    private float mFraction;
    private Companion.ColorModel mStartColor = new Companion.ColorModel(0, 0, 0, 0, 15, null);

    /* loaded from: classes7.dex */
    public static final class Companion {

        /* loaded from: classes7.dex */
        public static final class ColorModel {
            private int alpha;
            private int blue;
            private int green;
            private int red;

            public ColorModel() {
                this(0, 0, 0, 0, 15, null);
            }

            public static /* synthetic */ ColorModel copy$default(ColorModel colorModel, int i11, int i12, int i13, int i14, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    i11 = colorModel.red;
                }
                if ((i15 & 2) != 0) {
                    i12 = colorModel.green;
                }
                if ((i15 & 4) != 0) {
                    i13 = colorModel.blue;
                }
                if ((i15 & 8) != 0) {
                    i14 = colorModel.alpha;
                }
                return colorModel.copy(i11, i12, i13, i14);
            }

            public final int component1() {
                return this.red;
            }

            public final int component2() {
                return this.green;
            }

            public final int component3() {
                return this.blue;
            }

            public final int component4() {
                return this.alpha;
            }

            public final ColorModel copy(int i11, int i12, int i13, int i14) {
                return new ColorModel(i11, i12, i13, i14);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorModel)) {
                    return false;
                }
                ColorModel colorModel = (ColorModel) obj;
                return this.red == colorModel.red && this.green == colorModel.green && this.blue == colorModel.blue && this.alpha == colorModel.alpha;
            }

            public final int getAlpha() {
                return this.alpha;
            }

            public final int getBlue() {
                return this.blue;
            }

            public final int getGreen() {
                return this.green;
            }

            public final int getRed() {
                return this.red;
            }

            public int hashCode() {
                return (((((this.red * 31) + this.green) * 31) + this.blue) * 31) + this.alpha;
            }

            public final ColorModel minus(ColorModel colorModel) {
                AbstractC19074t.m100208f(colorModel, "rhs");
                return new ColorModel(this.red - colorModel.red, this.green - colorModel.green, this.blue - colorModel.blue, this.alpha - colorModel.alpha);
            }

            public final void setAlpha(int i11) {
                this.alpha = i11;
            }

            public final void setBlue(int i11) {
                this.blue = i11;
            }

            public final void setGreen(int i11) {
                this.green = i11;
            }

            public final void setRed(int i11) {
                this.red = i11;
            }

            public String toString() {
                return "ColorModel(red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ", alpha=" + this.alpha + ')';
            }

            public ColorModel(int i11, int i12, int i13, int i14) {
                this.red = i11;
                this.green = i12;
                this.blue = i13;
                this.alpha = i14;
            }

            public /* synthetic */ ColorModel(int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
                this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final void combine(ColorModel colorModel, float f11, ColorModel colorModel2, ColorModel colorModel3) {
            AbstractC19074t.m100208f(colorModel, "destination");
            AbstractC19074t.m100208f(colorModel2, "startColor");
            AbstractC19074t.m100208f(colorModel3, "diffColor");
            colorModel.setRed((int) (colorModel2.getRed() + (colorModel3.getRed() * f11)));
            colorModel.setGreen((int) (colorModel2.getGreen() + (colorModel3.getGreen() * f11)));
            colorModel.setBlue((int) (colorModel2.getBlue() + (colorModel3.getBlue() * f11)));
            colorModel.setAlpha((int) (colorModel2.getAlpha() + (colorModel3.getAlpha() * f11)));
        }
    }

    public ColorDrawing() {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        this.mColor = new Companion.ColorModel(0, i11, i12, i13, 15, null);
        this.mDiffColor = new Companion.ColorModel(i11, i12, i13, 0, 15, null);
    }

    public final int getBackgroundColor() {
        return this.mColorInt;
    }

    public final boolean handleNewBackgroundColor(int i11) {
        if (this.mDestinationColor == i11) {
            return false;
        }
        this.mDestinationColor = i11;
        this.mStartColor = this.mColor;
        this.mDiffColor = new Companion.ColorModel(Color.red(i11), Color.green(i11), Color.blue(i11), Color.alpha(i11)).minus(this.mStartColor);
        this.mColor = Companion.ColorModel.copy$default(this.mStartColor, 0, 0, 0, 0, 15, null);
        this.mFraction = 0.0f;
        return true;
    }

    public final boolean setFraction(float f11) {
        if (C17206r.m91844b(f11, this.mFraction, 0.0d, 4, null)) {
            return false;
        }
        this.mFraction = f11;
        Companion.combine(this.mColor, f11, this.mStartColor, this.mDiffColor);
        this.mColorInt = Color.argb(this.mColor.getAlpha(), this.mColor.getRed(), this.mColor.getGreen(), this.mColor.getBlue());
        return true;
    }
}
