package com.zing.zalo.camera.photocrop;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.photocrop.CropOverlayView;
import com.zing.zalo.camera.photocrop.CropView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import java.util.ArrayList;
import me0.AbstractC23222t7;
import p500s1.C26086a;
import p500s1.C26088c;

/* loaded from: classes3.dex */
public class CropView extends FrameLayout {

    /* renamed from: F */
    public static final RectF f41490F = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: A */
    int f41491A;

    /* renamed from: B */
    int f41492B;

    /* renamed from: C */
    int f41493C;

    /* renamed from: D */
    int f41494D;

    /* renamed from: E */
    public InterfaceC7716a f41495E;

    /* renamed from: p */
    final float[] f41496p;

    /* renamed from: q */
    View f41497q;

    /* renamed from: r */
    ActiveImageButton f41498r;

    /* renamed from: s */
    ActiveImageButton f41499s;

    /* renamed from: t */
    ActiveImageButton f41500t;

    /* renamed from: u */
    RobotoTextView f41501u;

    /* renamed from: v */
    public CropOverlayView f41502v;

    /* renamed from: w */
    CropImageOptions f41503w;

    /* renamed from: x */
    int f41504x;

    /* renamed from: y */
    int f41505y;

    /* renamed from: z */
    int f41506z;

    /* renamed from: com.zing.zalo.camera.photocrop.CropView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7716a {
        /* renamed from: a */
        void mo39484a();
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41496p = new float[8];
        this.f41492B = 0;
    }

    /* renamed from: e */
    private void m39474e() {
        View findViewById = findViewById(AbstractC6918a0.btn_square_crop);
        findViewById.setVisibility(8);
        findViewById.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ boolean m39475f(View view, MotionEvent motionEvent) {
        InterfaceC7716a interfaceC7716a;
        CropOverlayView cropOverlayView = this.f41502v;
        if (cropOverlayView != null) {
            cropOverlayView.m39466N(motionEvent);
            if (motionEvent != null && motionEvent.getAction() == 1 && this.f41502v.f41460S && (interfaceC7716a = this.f41495E) != null) {
                interfaceC7716a.mo39484a();
            }
        }
        return true;
    }

    /* renamed from: g */
    private void m39476g(int i11, int i12, int i13, int i14) {
        try {
            float[] fArr = this.f41496p;
            float f11 = i11;
            fArr[0] = f11;
            float f12 = i12;
            fArr[1] = f12;
            float f13 = i11 + i13;
            fArr[2] = f13;
            fArr[3] = f12;
            fArr[4] = f13;
            float f14 = i12 + i14;
            fArr[5] = f14;
            fArr[6] = f11;
            fArr[7] = f14;
            m39478k(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    private void m39477i() {
        int i11;
        try {
            int i12 = this.f41492B;
            if (i12 != 1) {
                if (i12 != 2 && i12 != 4) {
                    if (i12 != 5) {
                    }
                } else {
                    CropOverlayView cropOverlayView = this.f41502v;
                    if (cropOverlayView != null) {
                        if (!cropOverlayView.m39464A()) {
                            this.f41502v.setAspectRatioX(this.f41493C);
                            this.f41502v.setAspectRatioY(this.f41494D);
                            this.f41502v.setFixedAspectRatio(true);
                        }
                        this.f41502v.setCropShape(CropOverlayView.EnumC7713b.OVAL);
                    }
                }
                i11 = this.f41492B;
                if (i11 != 1 || i11 == 2 || i11 == 4 || i11 == 5) {
                    m39474e();
                }
                return;
            }
            CropOverlayView cropOverlayView2 = this.f41502v;
            if (cropOverlayView2 != null && !cropOverlayView2.m39464A()) {
                this.f41502v.setAspectRatioX(this.f41493C);
                this.f41502v.setAspectRatioY(this.f41494D);
                this.f41502v.setFixedAspectRatio(true);
            }
            i11 = this.f41492B;
            if (i11 != 1) {
            }
            m39474e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m39478k(boolean z11) {
        float[] fArr;
        int i11;
        try {
            int i12 = this.f41506z;
            if (i12 > 0 && (i11 = this.f41491A) > 0 && !z11) {
                this.f41502v.m39468P(i12, i11);
            }
            CropOverlayView cropOverlayView = this.f41502v;
            if (z11) {
                fArr = null;
            } else {
                fArr = this.f41496p;
            }
            cropOverlayView.m39467O(fArr, this.f41504x, this.f41505y);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    boolean m39479b(RectF rectF) {
        RectF rectF2 = f41490F;
        if (rectF == rectF2) {
            return true;
        }
        if (rectF != null && rectF.left == rectF2.left && rectF.top == rectF2.top && rectF.right == rectF2.right && rectF.bottom == rectF2.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public Animator m39480c(Animator animator) {
        AnimatorSet animatorSet = new AnimatorSet();
        RectF rect = this.f41502v.getRect();
        if (rect != null && rect.width() != 0.0f && rect.height() != 0.0f) {
            AbstractC1579n0.m7839T0(this.f41502v, rect.centerX());
            AbstractC1579n0.m7841U0(this.f41502v, rect.centerY());
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f41498r, "alpha", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41499s, "alpha", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41500t, "alpha", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41501u, "alpha", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41499s, "translationY", AbstractC23222t7.f112539R));
        arrayList.add(ObjectAnimator.ofFloat(this.f41500t, "translationY", AbstractC23222t7.f112539R));
        if (animator != null) {
            arrayList.add(animator);
        }
        animatorSet2.setDuration(350L);
        animatorSet2.playTogether(arrayList);
        animatorSet2.setInterpolator(new C26086a());
        animatorSet.playSequentially(ObjectAnimator.ofFloat(this.f41502v, "alpha", 0.0f).setDuration(150L), animatorSet2);
        return animatorSet;
    }

    /* renamed from: d */
    public Animator m39481d(Animator animator) {
        AnimatorSet animatorSet = new AnimatorSet();
        RectF rect = this.f41502v.getRect();
        if (rect != null && rect.width() != 0.0f && rect.height() != 0.0f) {
            AbstractC1579n0.m7839T0(this.f41502v, rect.centerX());
            AbstractC1579n0.m7841U0(this.f41502v, rect.centerY());
        }
        this.f41502v.setAlpha(0.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f41498r, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41499s, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41500t, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41501u, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41499s, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41500t, "translationY", 0.0f));
        if (animator != null) {
            arrayList.add(animator);
        }
        animatorSet2.setDuration(300L);
        animatorSet2.playTogether(arrayList);
        animatorSet2.setInterpolator(new C26088c());
        animatorSet.playSequentially(animatorSet2, ObjectAnimator.ofFloat(this.f41502v, "alpha", 1.0f).setDuration(250L));
        return animatorSet;
    }

    public RectF getBoundingBox() {
        return this.f41502v.getBoundBox();
    }

    public ActiveImageButton getBtnBackCrop() {
        return this.f41498r;
    }

    public RobotoTextView getBtnFinishCrop() {
        return this.f41501u;
    }

    public RectF getCropOverlayRect() {
        return this.f41502v.getRect();
    }

    public RectF getCropOverlayRectInPercentage() {
        RectF rect;
        try {
            CropOverlayView cropOverlayView = this.f41502v;
            if (cropOverlayView != null && (rect = cropOverlayView.getRect()) != null) {
                RectF rectF = new RectF(rect);
                rectF.offset(-((this.f41504x - this.f41506z) / 2), -((this.f41505y - this.f41491A) / 2));
                float f11 = rectF.left;
                int i11 = this.f41506z;
                rectF.left = f11 / i11;
                float f12 = rectF.top;
                int i12 = this.f41491A;
                rectF.top = f12 / i12;
                rectF.right /= i11;
                rectF.bottom /= i12;
                return rectF;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public View getTopPanel() {
        return this.f41497q;
    }

    /* renamed from: h */
    public void m39482h(int i11, int i12) {
        this.f41493C = i11;
        this.f41494D = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0122 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:6:0x0023, B:8:0x0027, B:13:0x0031, B:16:0x003b, B:18:0x0052, B:19:0x0067, B:20:0x0118, B:22:0x0122, B:24:0x0126, B:30:0x005d, B:32:0x0087, B:33:0x0089, B:35:0x0090, B:36:0x00d6, B:37:0x00b6, B:40:0x001b, B:43:0x00e1, B:45:0x00e7, B:46:0x010e, B:47:0x00fb), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m39483j(int i11, int i12, int i13, int i14, RectF rectF, boolean z11, boolean z12) {
        RectF rectF2;
        try {
            this.f41506z = i11;
            this.f41491A = i12;
            this.f41504x = i13;
            this.f41505y = i14;
            int i15 = (i13 - i11) / 2;
            int i16 = (i14 - i12) / 2;
            int i17 = this.f41492B;
            if ((i17 != 2 && i17 != 4) || (!z12 && rectF != null && !m39479b(rectF))) {
                if (this.f41493C == 0 || this.f41494D == 0 || (!z11 && !z12 && rectF != null && !m39479b(rectF))) {
                    if (rectF == null) {
                        rectF = f41490F;
                    }
                    RectF rectF3 = new RectF();
                    if (z11) {
                        float f11 = rectF.top;
                        int i18 = this.f41506z;
                        rectF3.left = f11 * i18;
                        rectF3.right = rectF.bottom * i18;
                        float f12 = 1.0f - rectF.right;
                        int i19 = this.f41491A;
                        rectF3.top = f12 * i19;
                        rectF3.bottom = (1.0f - rectF.left) * i19;
                    } else {
                        float f13 = rectF.left;
                        int i21 = this.f41506z;
                        rectF3.left = f13 * i21;
                        rectF3.right = rectF.right * i21;
                        float f14 = rectF.top;
                        int i22 = this.f41491A;
                        rectF3.top = f14 * i22;
                        rectF3.bottom = rectF.bottom * i22;
                    }
                    rectF3.offset(i15, i16);
                    this.f41502v.setRect(rectF3);
                    m39476g(i15, i16, i11, i12);
                    m39477i();
                    if (this.f41506z > 0 && this.f41491A > 0) {
                        m39478k(false);
                        return;
                    }
                    return;
                }
                RectF rectF4 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i23 = this.f41506z;
                int i24 = this.f41491A;
                float f15 = i23 / i24;
                int i25 = this.f41493C;
                int i26 = this.f41494D;
                if (f15 > i25 / i26) {
                    float f16 = i24;
                    rectF4.bottom = f16;
                    rectF4.right = (f16 * i25) / i26;
                } else {
                    float f17 = i23;
                    rectF4.right = f17;
                    rectF4.bottom = (f17 * i26) / i25;
                }
                rectF4.offset(i15 + ((i23 - rectF4.width()) / 2.0f), i16 + ((this.f41491A - rectF4.height()) / 2.0f));
                this.f41502v.setRect(rectF4);
                m39476g(i15, i16, i11, i12);
                m39477i();
                if (this.f41506z > 0) {
                    return;
                } else {
                    return;
                }
            }
            if (this.f41506z < this.f41491A) {
                int i27 = this.f41491A;
                rectF2 = new RectF(0.0f, (i27 - r13) / 2.0f, this.f41506z, i27 - ((i27 - r13) / 2.0f));
            } else {
                int i28 = this.f41506z;
                rectF2 = new RectF((i28 - r13) / 2.0f, 0.0f, i28 - ((i28 - r13) / 2.0f), this.f41491A);
            }
            rectF2.offset(i15, i16);
            this.f41502v.setRect(rectF2);
            m39476g(i15, i16, i11, i12);
            m39477i();
            if (this.f41506z > 0) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        CropImageOptions cropImageOptions;
        super.onFinishInflate();
        this.f41497q = findViewById(AbstractC6918a0.crop_top_panel);
        this.f41498r = (ActiveImageButton) findViewById(AbstractC6918a0.btn_back_crop);
        this.f41499s = (ActiveImageButton) findViewById(AbstractC6918a0.btn_rotate_left_crop);
        this.f41500t = (ActiveImageButton) findViewById(AbstractC6918a0.btn_square_crop);
        this.f41501u = (RobotoTextView) findViewById(AbstractC6918a0.btn_finish_crop_photo);
        if (this.f41503w == null) {
            this.f41503w = new CropImageOptions();
        }
        CropOverlayView cropOverlayView = (CropOverlayView) findViewById(AbstractC6918a0.crop_overlay_view);
        this.f41502v = cropOverlayView;
        if (cropOverlayView != null && (cropImageOptions = this.f41503w) != null) {
            cropOverlayView.setInitialAttributeValues(cropImageOptions);
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: jf.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m39475f;
                m39475f = CropView.this.m39475f(view, motionEvent);
                return m39475f;
            }
        });
    }

    public void setCropMode(int i11) {
        this.f41492B = i11;
    }
}
