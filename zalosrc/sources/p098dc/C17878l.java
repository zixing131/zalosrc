package p098dc;

import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import java.io.File;
import p098dc.AbstractC17874h;

/* renamed from: dc.l */
/* loaded from: classes3.dex */
public class C17878l extends AbstractC17874h {

    /* renamed from: a */
    final ScaleAnimation f90361a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C17878l(AttributeSet attributeSet, File file) {
        float attributeFloatValue = attributeSet.getAttributeFloatValue(null, "android:fromXScale", 0.0f);
        float attributeFloatValue2 = attributeSet.getAttributeFloatValue(null, "android:toXScale", 0.0f);
        float attributeFloatValue3 = attributeSet.getAttributeFloatValue(null, "android:fromYScale", 0.0f);
        float attributeFloatValue4 = attributeSet.getAttributeFloatValue(null, "android:toYScale", 0.0f);
        AbstractC17874h.a m94405a = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:pivotX"));
        AbstractC17874h.a m94405a2 = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:pivotY"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(attributeFloatValue, attributeFloatValue2, attributeFloatValue3, attributeFloatValue4, m94405a.f90319a, m94405a.f90320b, m94405a2.f90319a, m94405a2.f90320b);
        this.f90361a = scaleAnimation;
        AbstractC17874h.m94404a(attributeSet, scaleAnimation, file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p098dc.AbstractC17874h
    /* renamed from: b */
    public Animation mo94403b() {
        return this.f90361a;
    }
}
