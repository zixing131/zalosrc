package p716zh;

import android.graphics.Path;
import android.text.Layout;
import ho0.AbstractC20110a;

/* renamed from: zh.e6 */
/* loaded from: classes3.dex */
public class C31899e6 extends Path {

    /* renamed from: a */
    private Layout f146541a;

    /* renamed from: b */
    private int f146542b;

    /* renamed from: c */
    private float f146543c = -1.0f;

    /* renamed from: d */
    private float f146544d = -1.0f;

    /* renamed from: e */
    float f146545e;

    /* renamed from: f */
    float f146546f;

    /* renamed from: a */
    public int m153285a() {
        return (int) (this.f146546f + this.f146543c);
    }

    @Override // android.graphics.Path
    public void addRect(float f11, float f12, float f13, float f14, Path.Direction direction) {
        float f15;
        float f16;
        try {
            float f17 = this.f146544d;
            if (f17 == -1.0f) {
                this.f146544d = f12;
                this.f146543c = f12;
            } else if (f17 != f12) {
                this.f146544d = f12;
                this.f146542b++;
            }
            float lineRight = this.f146541a.getLineRight(this.f146542b);
            float lineLeft = this.f146541a.getLineLeft(this.f146542b);
            if (f11 >= lineRight) {
                return;
            }
            if (f13 > lineRight) {
                f15 = lineRight;
            } else {
                f15 = f13;
            }
            if (f11 < lineLeft) {
                f16 = lineLeft;
            } else {
                f16 = f11;
            }
            super.addRect(f16, f12, f15, f14, direction);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public void m153286b(Layout layout, int i11) {
        try {
            this.f146541a = layout;
            this.f146542b = layout.getLineForOffset(i11);
            this.f146544d = -1.0f;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // android.graphics.Path
    public void offset(float f11, float f12) {
        super.offset(f11, f12);
        this.f146545e = f11;
        this.f146546f = f12;
    }
}
