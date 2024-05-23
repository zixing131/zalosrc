package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import au.AbstractC2379w;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class KeyboardFrameLayout extends FrameLayout {

    /* renamed from: p */
    private int f69343p;

    /* renamed from: q */
    private final AbstractC2379w.a f69344q;

    /* renamed from: r */
    private int f69345r;

    /* renamed from: s */
    private View f69346s;

    /* renamed from: t */
    private ArrayList f69347t;

    /* renamed from: u */
    private boolean f69348u;

    /* renamed from: v */
    private InterfaceC13508a f69349v;

    /* renamed from: com.zing.zalo.ui.widget.KeyboardFrameLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13508a {
        /* renamed from: y1 */
        void mo37136y1(int i11);

        /* renamed from: z3 */
        void mo37138z3(int i11);
    }

    public KeyboardFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69343p = 0;
        this.f69344q = new AbstractC2379w.a();
        this.f69345r = 0;
        this.f69347t = new ArrayList();
        this.f69348u = false;
        if (Build.VERSION.SDK_INT >= 30) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.widget.t0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets m75760e;
                    m75760e = KeyboardFrameLayout.this.m75760e(view, windowInsets);
                    return m75760e;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ WindowInsets m75760e(View view, WindowInsets windowInsets) {
        WindowInsets rootWindowInsets;
        int ime;
        boolean isVisible;
        rootWindowInsets = getRootWindowInsets();
        if (rootWindowInsets != null) {
            ime = WindowInsets.Type.ime();
            isVisible = rootWindowInsets.isVisible(ime);
            if (isVisible != this.f69348u) {
                requestLayout();
            }
        }
        return windowInsets;
    }

    /* renamed from: f */
    private void m75761f() {
        boolean z11;
        try {
            AbstractC2379w.m12429c(this, this.f69344q, AbstractC23309i.m122007i5(getContext()));
            int i11 = this.f69344q.f9930e;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = this.f69343p;
            if (i11 == i12) {
                if (!this.f69348u) {
                }
                if (!this.f69348u && !z11) {
                    this.f69348u = false;
                    InterfaceC13508a interfaceC13508a = this.f69349v;
                    if (interfaceC13508a != null) {
                        interfaceC13508a.mo37136y1(i12);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                this.f69348u = true;
                this.f69343p = i11;
                int i13 = this.f69345r;
                if (i13 > 0 && i13 != i11) {
                    this.f69345r = i11;
                }
                Iterator it = this.f69347t.iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    if (view != null) {
                        view.getLayoutParams().height = this.f69343p;
                    }
                }
                AbstractC23309i.m120984Gp(this.f69343p);
                InterfaceC13508a interfaceC13508a2 = this.f69349v;
                if (interfaceC13508a2 != null) {
                    interfaceC13508a2.mo37138z3(this.f69343p);
                    return;
                }
                return;
            }
            if (!this.f69348u) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m75762h(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m75763i(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0016, B:12:0x002b, B:16:0x0035, B:23:0x0057, B:25:0x0071, B:27:0x0079, B:29:0x0081, B:31:0x0087, B:34:0x008a, B:36:0x005a, B:37:0x005f, B:38:0x0062, B:39:0x0065, B:40:0x003a, B:41:0x003e, B:42:0x0040), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0016, B:12:0x002b, B:16:0x0035, B:23:0x0057, B:25:0x0071, B:27:0x0079, B:29:0x0081, B:31:0x0087, B:34:0x008a, B:36:0x005a, B:37:0x005f, B:38:0x0062, B:39:0x0065, B:40:0x003a, B:41:0x003e, B:42:0x0040), top: B:1:0x0000 }] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        try {
            int childCount = getChildCount();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt = getChildAt(i23);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i24 = layoutParams.gravity;
                    if (i24 == -1) {
                        i24 = 51;
                    }
                    int i25 = i24 & 112;
                    int i26 = i24 & 7;
                    if (i26 != 1) {
                        if (i26 != 5) {
                            i17 = layoutParams.leftMargin;
                            if (i25 == 16) {
                                if (i25 != 48) {
                                    if (i25 != 80) {
                                        i21 = layoutParams.topMargin;
                                    } else {
                                        i18 = (i14 - i12) - measuredHeight;
                                        i19 = layoutParams.bottomMargin;
                                    }
                                } else {
                                    i21 = layoutParams.topMargin;
                                }
                                for (i22 = 0; i22 < this.f69347t.size(); i22++) {
                                    if (childAt == this.f69347t.get(i22)) {
                                        i21 = this.f69346s.getBottom();
                                    }
                                }
                                childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                            } else {
                                i18 = (((i14 - i12) - measuredHeight) / 2) + layoutParams.topMargin;
                                i19 = layoutParams.bottomMargin;
                            }
                            i21 = i18 - i19;
                            while (i22 < this.f69347t.size()) {
                            }
                            childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                        } else {
                            i15 = i13 - measuredWidth;
                            i16 = layoutParams.rightMargin;
                        }
                    } else {
                        i15 = (((i13 - i11) - measuredWidth) / 2) + layoutParams.leftMargin;
                        i16 = layoutParams.rightMargin;
                    }
                    i17 = i15 - i16;
                    if (i25 == 16) {
                    }
                    i21 = i18 - i19;
                    while (i22 < this.f69347t.size()) {
                    }
                    childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m75761f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        if (getChildCount() > 0) {
            try {
                int size = View.MeasureSpec.getSize(i11);
                int size2 = View.MeasureSpec.getSize(i12);
                setMeasuredDimension(size, size2);
                AbstractC2379w.m12429c(this, this.f69344q, AbstractC23309i.m122007i5(getContext()));
                if ((this.f69344q.f9930e <= AbstractC23136l9.m118742r(20.0f) || this.f69344q.f9929d == size2) && (i13 = this.f69345r) > 0) {
                    size2 -= i13;
                }
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt == this.f69346s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i11, 0, i12, 0);
                    }
                }
                return;
            } catch (IllegalStateException unused) {
                super.onMeasure(i11, i12);
                return;
            } catch (Exception unused2) {
                super.onMeasure(i11, i12);
                return;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setBottomViewsGroup(ArrayList<View> arrayList) {
        this.f69347t = arrayList;
    }

    public void setOnKeyboardListener(InterfaceC13508a interfaceC13508a) {
        this.f69349v = interfaceC13508a;
    }

    public void setPaddingBottom(int i11) {
        this.f69345r = i11;
    }

    public void setTopViewGroup(View view) {
        this.f69346s = view;
    }
}
