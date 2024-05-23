package p098dc;

import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import java.io.File;

/* renamed from: dc.g */
/* loaded from: classes3.dex */
public class C17873g extends AbstractC17874h {

    /* renamed from: a */
    final AlphaAnimation f90318a;

    public C17873g(AttributeSet attributeSet, File file) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(attributeSet.getAttributeFloatValue(null, "android:fromAlpha", 1.0f), attributeSet.getAttributeFloatValue(null, "android:toAlpha", 1.0f));
        this.f90318a = alphaAnimation;
        AbstractC17874h.m94404a(attributeSet, alphaAnimation, file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p098dc.AbstractC17874h
    /* renamed from: b */
    public Animation mo94403b() {
        return this.f90318a;
    }
}
