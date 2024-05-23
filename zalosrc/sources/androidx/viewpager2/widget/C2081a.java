package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes2.dex */
public final class C2081a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f8912b;

    /* renamed from: a */
    private LinearLayoutManager f8913a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.a$a */
    /* loaded from: classes2.dex */
    public class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f8912b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2081a(LinearLayoutManager linearLayoutManager) {
        this.f8913a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m11280a() {
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i11;
        int bottom;
        int i12;
        int m10110a = this.f8913a.m10110a();
        if (m10110a == 0) {
            return true;
        }
        if (this.f8913a.m9750h() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, m10110a, 2);
        for (int i13 = 0; i13 < m10110a; i13++) {
            View m10105V = this.f8913a.m10105V(i13);
            if (m10105V != null) {
                ViewGroup.LayoutParams layoutParams = m10105V.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f8912b;
                }
                int[] iArr2 = iArr[i13];
                if (z11) {
                    top = m10105V.getLeft();
                    i11 = marginLayoutParams.leftMargin;
                } else {
                    top = m10105V.getTop();
                    i11 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i11;
                int[] iArr3 = iArr[i13];
                if (z11) {
                    bottom = m10105V.getRight();
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    bottom = m10105V.getBottom();
                    i12 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i12;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new a());
        for (int i14 = 1; i14 < m10110a; i14++) {
            if (iArr[i14 - 1][1] != iArr[i14][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i15 = iArr4[1];
        int i16 = iArr4[0];
        int i17 = i15 - i16;
        if (i16 <= 0 && iArr[m10110a - 1][1] >= i17) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m11281b() {
        int m10110a = this.f8913a.m10110a();
        for (int i11 = 0; i11 < m10110a; i11++) {
            if (m11282c(this.f8913a.m10105V(i11))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m11282c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (m11282c(viewGroup.getChildAt(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m11283d() {
        if ((!m11280a() || this.f8913a.m10110a() <= 1) && m11281b()) {
            return true;
        }
        return false;
    }
}
