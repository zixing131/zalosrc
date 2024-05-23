package p098dc;

import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import java.io.File;
import p098dc.AbstractC17874h;

/* renamed from: dc.k */
/* loaded from: classes3.dex */
public class C17877k extends AbstractC17874h {

    /* renamed from: a */
    final RotateAnimation f90360a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C17877k(AttributeSet attributeSet, File file) {
        float attributeFloatValue = attributeSet.getAttributeFloatValue(null, "android:fromDegrees", 0.0f);
        float attributeFloatValue2 = attributeSet.getAttributeFloatValue(null, "android:toDegrees", 0.0f);
        AbstractC17874h.a m94405a = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:pivotX"));
        AbstractC17874h.a m94405a2 = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:pivotY"));
        RotateAnimation rotateAnimation = new RotateAnimation(attributeFloatValue, attributeFloatValue2, m94405a.f90319a, m94405a.f90320b, m94405a2.f90319a, m94405a2.f90320b);
        this.f90360a = rotateAnimation;
        AbstractC17874h.m94404a(attributeSet, rotateAnimation, file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p098dc.AbstractC17874h
    /* renamed from: b */
    public Animation mo94403b() {
        return this.f90360a;
    }
}
