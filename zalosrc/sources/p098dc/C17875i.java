package p098dc;

import android.util.AttributeSet;
import android.view.animation.AnimationSet;
import java.io.File;

/* renamed from: dc.i */
/* loaded from: classes3.dex */
public class C17875i extends AbstractC17874h {

    /* renamed from: a */
    private final AnimationSet f90321a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C17875i(AttributeSet attributeSet, File file) {
        AnimationSet animationSet = new AnimationSet(attributeSet.getAttributeBooleanValue(null, "android:shareInterpolator", true));
        this.f90321a = animationSet;
        AbstractC17874h.m94404a(attributeSet, animationSet, file);
    }

    @Override // p098dc.AbstractC17874h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AnimationSet mo94403b() {
        return this.f90321a;
    }
}
