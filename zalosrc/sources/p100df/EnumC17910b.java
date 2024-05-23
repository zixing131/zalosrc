package p100df;

import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import java.lang.ref.WeakReference;

/* renamed from: df.b */
/* loaded from: classes3.dex */
public enum EnumC17910b {
    INSTANCE;


    /* renamed from: p */
    WeakReference f90434p;

    /* renamed from: q */
    WeakReference f90435q;

    /* renamed from: c */
    public CommonZaloview m94487c() {
        WeakReference weakReference = this.f90435q;
        if (weakReference != null) {
            return (CommonZaloview) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public ZaloCameraView m94488d() {
        WeakReference weakReference = this.f90434p;
        if (weakReference != null) {
            return (ZaloCameraView) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public void m94489e(ZaloCameraView zaloCameraView) {
        this.f90434p = new WeakReference(zaloCameraView);
    }

    /* renamed from: g */
    public void m94490g(CommonZaloview commonZaloview) {
        this.f90435q = new WeakReference(commonZaloview);
    }
}
