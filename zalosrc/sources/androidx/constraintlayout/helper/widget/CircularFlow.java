package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: K */
    private static int f4890K;

    /* renamed from: L */
    private static float f4891L;

    /* renamed from: A */
    ConstraintLayout f4892A;

    /* renamed from: B */
    int f4893B;

    /* renamed from: C */
    private float[] f4894C;

    /* renamed from: D */
    private int[] f4895D;

    /* renamed from: E */
    private int f4896E;

    /* renamed from: F */
    private int f4897F;

    /* renamed from: G */
    private String f4898G;

    /* renamed from: H */
    private String f4899H;

    /* renamed from: I */
    private Float f4900I;

    /* renamed from: J */
    private Integer f4901J;

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    private void m5932A(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f5456r == null || (iArr = this.f4895D) == null) {
            return;
        }
        if (this.f4896E + 1 > iArr.length) {
            this.f4895D = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f4895D[this.f4896E] = (int) (Integer.parseInt(str) * this.f5456r.getResources().getDisplayMetrics().density);
        this.f4896E++;
    }

    /* renamed from: B */
    private void m5933B() {
        this.f4892A = (ConstraintLayout) getParent();
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            View m6382l = this.f4892A.m6382l(this.f5454p[i11]);
            if (m6382l != null) {
                int i12 = f4890K;
                float f11 = f4891L;
                int[] iArr = this.f4895D;
                if (iArr != null && i11 < iArr.length) {
                    i12 = iArr[i11];
                } else {
                    Integer num = this.f4901J;
                    if (num != null && num.intValue() != -1) {
                        this.f4896E++;
                        if (this.f4895D == null) {
                            this.f4895D = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f4895D = radius;
                        radius[this.f4896E - 1] = i12;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added radius to view with id: ");
                        sb2.append((String) this.f5462x.get(Integer.valueOf(m6382l.getId())));
                    }
                }
                float[] fArr = this.f4894C;
                if (fArr != null && i11 < fArr.length) {
                    f11 = fArr[i11];
                } else {
                    Float f12 = this.f4900I;
                    if (f12 != null && f12.floatValue() != -1.0f) {
                        this.f4897F++;
                        if (this.f4894C == null) {
                            this.f4894C = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f4894C = angles;
                        angles[this.f4897F - 1] = f11;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Added angle to view with id: ");
                        sb3.append((String) this.f5462x.get(Integer.valueOf(m6382l.getId())));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) m6382l.getLayoutParams();
                layoutParams.f5547r = f11;
                layoutParams.f5543p = this.f4893B;
                layoutParams.f5545q = i12;
                m6382l.setLayoutParams(layoutParams);
            }
        }
        m6363g();
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f4897F = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                m5934z(str.substring(i11).trim());
                return;
            } else {
                m5934z(str.substring(i11, indexOf).trim());
                i11 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f4896E = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                m5932A(str.substring(i11).trim());
                return;
            } else {
                m5932A(str.substring(i11, indexOf).trim());
                i11 = indexOf + 1;
            }
        }
    }

    /* renamed from: z */
    private void m5934z(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f5456r == null || (fArr = this.f4894C) == null) {
            return;
        }
        if (this.f4897F + 1 > fArr.length) {
            this.f4894C = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f4894C[this.f4897F] = Integer.parseInt(str);
        this.f4897F++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f4894C, this.f4897F);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f4895D, this.f4896E);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f4893B = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4898G = string;
                    setAngles(string);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f4899H = string2;
                    setRadius(string2);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f4891L));
                    this.f4900I = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f4890K));
                    this.f4901J = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4898G;
        if (str != null) {
            this.f4894C = new float[1];
            setAngles(str);
        }
        String str2 = this.f4899H;
        if (str2 != null) {
            this.f4895D = new int[1];
            setRadius(str2);
        }
        Float f11 = this.f4900I;
        if (f11 != null) {
            setDefaultAngle(f11.floatValue());
        }
        Integer num = this.f4901J;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m5933B();
    }

    public void setDefaultAngle(float f11) {
        f4891L = f11;
    }

    public void setDefaultRadius(int i11) {
        f4890K = i11;
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
