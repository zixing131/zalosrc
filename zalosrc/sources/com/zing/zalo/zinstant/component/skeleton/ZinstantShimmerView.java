package com.zing.zalo.zinstant.component.skeleton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.zing.zalo.zinstant.component.p081ui.ZinstantView;
import com.zing.zalo.zinstant.component.skeleton.C17108a;
import com.zing.zalo.zinstant.zom.node.ZOMGlobalConfig;
import com.zing.zalo.zinstant.zom.node.ZOMSkeleton;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zinstant.zom.properties.ZOMSkeletonBackdropConfig;
import nk0.AbstractC23825g0;
import nk0.C23859u0;
import sj0.C26280e;

/* loaded from: classes7.dex */
public class ZinstantShimmerView extends ZinstantView {

    /* renamed from: K */
    private final Paint f87488K;

    /* renamed from: L */
    private final C17109b f87489L;

    /* renamed from: M */
    protected C26280e f87490M;

    /* renamed from: N */
    float f87491N;

    /* renamed from: O */
    float f87492O;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0080 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:16:0x0020, B:18:0x0026, B:4:0x0050, B:6:0x0080, B:7:0x0089, B:3:0x002d), top: B:15:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZinstantShimmerView(Context context, C23859u0 c23859u0, ZOMGlobalConfig zOMGlobalConfig) {
        super(context);
        ZOMSkeletonBackdropConfig skeletonBackdropConfig;
        ZOMBorder zOMBorder;
        this.f87488K = new Paint();
        this.f87489L = new C17109b();
        this.f87491N = 1.0f;
        this.f87492O = 0.2f;
        m91465K();
        if (zOMGlobalConfig != null) {
            try {
                if (zOMGlobalConfig.getSkeletonBackdropConfig() != null) {
                    skeletonBackdropConfig = zOMGlobalConfig.getSkeletonBackdropConfig();
                    ZOMRect zOMRect = skeletonBackdropConfig.mDimen;
                    C26280e c26280e = new C26280e(skeletonBackdropConfig.mWidth, skeletonBackdropConfig.mHeight);
                    this.f87490M = c26280e;
                    c26280e.setBounds(zOMRect.left, zOMRect.top, zOMRect.right, zOMRect.bottom);
                    C26280e c26280e2 = this.f87490M;
                    float f11 = skeletonBackdropConfig.mRadius;
                    boolean[] zArr = skeletonBackdropConfig.mCornersToggle;
                    c26280e2.m135234m(f11, zArr[0], zArr[1], zArr[2], zArr[3]);
                    zOMBorder = skeletonBackdropConfig.mBorder;
                    if (zOMBorder != null) {
                        this.f87490M.m135236p(zOMBorder.width, zOMBorder.color);
                    }
                    this.f87490M.m135231j(skeletonBackdropConfig.mBackgroundColor);
                    this.f87490M.setColorFilter(skeletonBackdropConfig.mBackgroundColor, PorterDuff.Mode.SRC_ATOP);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ZOMSkeleton zOMSkeleton = (ZOMSkeleton) ((AbstractC23825g0) c23859u0.f115208H.get(0)).m131007J();
        skeletonBackdropConfig = new ZOMSkeletonBackdropConfig(zOMSkeleton.mBound, zOMSkeleton.mWidth, zOMSkeleton.mHeight, zOMSkeleton.mRadius, zOMSkeleton.mCornersToggle, zOMSkeleton.mBorder, zOMSkeleton.mSkeletonBackgroundColor);
        ZOMRect zOMRect2 = skeletonBackdropConfig.mDimen;
        C26280e c26280e3 = new C26280e(skeletonBackdropConfig.mWidth, skeletonBackdropConfig.mHeight);
        this.f87490M = c26280e3;
        c26280e3.setBounds(zOMRect2.left, zOMRect2.top, zOMRect2.right, zOMRect2.bottom);
        C26280e c26280e22 = this.f87490M;
        float f112 = skeletonBackdropConfig.mRadius;
        boolean[] zArr2 = skeletonBackdropConfig.mCornersToggle;
        c26280e22.m135234m(f112, zArr2[0], zArr2[1], zArr2[2], zArr2[3]);
        zOMBorder = skeletonBackdropConfig.mBorder;
        if (zOMBorder != null) {
        }
        this.f87490M.m135231j(skeletonBackdropConfig.mBackgroundColor);
        this.f87490M.setColorFilter(skeletonBackdropConfig.mBackgroundColor, PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: K */
    private void m91465K() {
        setWillNotDraw(false);
        this.f87489L.setCallback(this);
        setShimmer(new C17108a.a().m91472c(this.f87491N).m91473d(this.f87492O).m91471a());
    }

    /* renamed from: L */
    public void m91466L() {
        this.f87489L.m91484i();
    }

    /* renamed from: M */
    public void m91467M() {
        this.f87489L.m91485j();
    }

    public Drawable getBackdrop() {
        return this.f87490M;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17109b c17109b = this.f87489L;
        if (c17109b != null && c17109b.m91480c()) {
            m91466L();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m91467M();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.component.p081ui.ZinstantView, android.view.View
    public void onDraw(Canvas canvas) {
        if ((!this.f87489L.m91482e() || !this.f87489L.m91481d()) && this.f87489L.m91480c()) {
            this.f87489L.m91484i();
            return;
        }
        canvas.save();
        super.onDraw(canvas);
        this.f87489L.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f87489L.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.ZinstantView, wj0.InterfaceC29061b
    public void onStart() {
        super.onStart();
    }

    @Override // com.zing.zalo.zinstant.component.p081ui.ZinstantView, wj0.InterfaceC29061b
    public void onStop() {
        this.f87489L.m91485j();
        super.onStop();
    }

    public void setShimmer(C17108a c17108a) {
        this.f87489L.m91483h(c17108a);
        if (c17108a != null) {
            setLayerType(2, this.f87488K);
        } else {
            setLayerType(0, null);
        }
    }
}
