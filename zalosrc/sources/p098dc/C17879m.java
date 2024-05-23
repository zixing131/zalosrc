package p098dc;

import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import java.io.File;
import p098dc.AbstractC17874h;

/* renamed from: dc.m */
/* loaded from: classes3.dex */
public class C17879m extends AbstractC17874h {

    /* renamed from: a */
    final TranslateAnimation f90362a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C17879m(AttributeSet attributeSet, File file) {
        AbstractC17874h.a m94405a = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:fromXDelta"));
        AbstractC17874h.a m94405a2 = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:toXDelta"));
        AbstractC17874h.a m94405a3 = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:fromYDelta"));
        AbstractC17874h.a m94405a4 = AbstractC17874h.a.m94405a(attributeSet.getAttributeValue(null, "android:toYDelta"));
        TranslateAnimation translateAnimation = new TranslateAnimation(m94405a.f90319a, m94405a.f90320b, m94405a2.f90319a, m94405a2.f90320b, m94405a3.f90319a, m94405a3.f90320b, m94405a4.f90319a, m94405a4.f90320b);
        this.f90362a = translateAnimation;
        AbstractC17874h.m94404a(attributeSet, translateAnimation, file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p098dc.AbstractC17874h
    /* renamed from: b */
    public Animation mo94403b() {
        return this.f90362a;
    }
}
