package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p357n6.AbstractC23576a;
import p382o6.C24048h;
import p382o6.C24050j;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map f36257i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m33322g0(View view, boolean z11) {
        boolean z12;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z11) {
            this.f36257i = new HashMap(childCount);
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = coordinatorLayout.getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof CoordinatorLayout.C1306e) && (((CoordinatorLayout.C1306e) childAt.getLayoutParams()).m6580f() instanceof FabTransformationScrimBehavior)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (childAt != view && !z12) {
                if (!z11) {
                    Map map = this.f36257i;
                    if (map != null && map.containsKey(childAt)) {
                        AbstractC1579n0.m7823L0(childAt, ((Integer) this.f36257i.get(childAt)).intValue());
                    }
                } else {
                    this.f36257i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    AbstractC1579n0.m7823L0(childAt, 4);
                }
            }
        }
        if (!z11) {
            this.f36257i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo33296H(View view, View view2, boolean z11, boolean z12) {
        m33322g0(view2, z11);
        return super.mo33296H(view, view2, z11, z12);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C6468e mo33320e0(Context context, boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC23576a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i11 = AbstractC23576a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C6468e c6468e = new FabTransformationBehavior.C6468e();
        c6468e.f36250a = C24048h.m125925d(context, i11);
        c6468e.f36251b = new C24050j(17, 0.0f, 0.0f);
        return c6468e;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
