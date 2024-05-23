package com.zing.zalo.zqrcode;

import androidx.annotation.Keep;
import fn0.AbstractC19074t;

@Keep
/* loaded from: classes7.dex */
public final class ResultPoint {

    /* renamed from: x */
    private float f88667x;

    /* renamed from: y */
    private float f88668y;

    @Keep
    public ResultPoint(float f11, float f12) {
        this.f88667x = f11;
        this.f88668y = f12;
    }

    public static /* synthetic */ ResultPoint copy$default(ResultPoint resultPoint, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = resultPoint.f88667x;
        }
        if ((i11 & 2) != 0) {
            f12 = resultPoint.f88668y;
        }
        return resultPoint.copy(f11, f12);
    }

    public final float component1() {
        return this.f88667x;
    }

    public final float component2() {
        return this.f88668y;
    }

    public final ResultPoint copy(float f11, float f12) {
        return new ResultPoint(f11, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPoint)) {
            return false;
        }
        ResultPoint resultPoint = (ResultPoint) obj;
        return AbstractC19074t.m100204b(Float.valueOf(this.f88667x), Float.valueOf(resultPoint.f88667x)) && AbstractC19074t.m100204b(Float.valueOf(this.f88668y), Float.valueOf(resultPoint.f88668y));
    }

    public final float getX() {
        return this.f88667x;
    }

    public final float getY() {
        return this.f88668y;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f88667x) * 31) + Float.floatToIntBits(this.f88668y);
    }

    public final void setX(float f11) {
        this.f88667x = f11;
    }

    public final void setY(float f11) {
        this.f88668y = f11;
    }

    public String toString() {
        return "ResultPoint(x=" + this.f88667x + ", y=" + this.f88668y + ')';
    }
}
