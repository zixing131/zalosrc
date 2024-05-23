package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import p175g0.AbstractC19181d;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19186i;

/* renamed from: androidx.appcompat.widget.y1 */
/* loaded from: classes2.dex */
class C1226y1 {

    /* renamed from: a */
    private final Context f4764a;

    /* renamed from: b */
    private final View f4765b;

    /* renamed from: c */
    private final TextView f4766c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f4767d;

    /* renamed from: e */
    private final Rect f4768e;

    /* renamed from: f */
    private final int[] f4769f;

    /* renamed from: g */
    private final int[] f4770g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1226y1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4767d = layoutParams;
        this.f4768e = new Rect();
        this.f4769f = new int[2];
        this.f4770g = new int[2];
        this.f4764a = context;
        View inflate = LayoutInflater.from(context).inflate(AbstractC19184g.abc_tooltip, (ViewGroup) null);
        this.f4765b = inflate;
        this.f4766c = (TextView) inflate.findViewById(AbstractC19183f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = ZAbstractBase.ZVU_BLEND_PERCENTAGE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC19186i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m5774a(View view, int i11, int i12, boolean z11, WindowManager.LayoutParams layoutParams) {
        int height;
        int i13;
        int i14;
        int i15;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f4764a.getResources().getDimensionPixelOffset(AbstractC19181d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i11 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f4764a.getResources().getDimensionPixelOffset(AbstractC19181d.tooltip_precise_anchor_extra_offset);
            height = i12 + dimensionPixelOffset2;
            i13 = i12 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i13 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f4764a.getResources();
        if (z11) {
            i14 = AbstractC19181d.tooltip_y_offset_touch;
        } else {
            i14 = AbstractC19181d.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i14);
        View m5775b = m5775b(view);
        if (m5775b == null) {
            return;
        }
        m5775b.getWindowVisibleDisplayFrame(this.f4768e);
        Rect rect = this.f4768e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f4764a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i15 = resources2.getDimensionPixelSize(identifier);
            } else {
                i15 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f4768e.set(0, i15, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m5775b.getLocationOnScreen(this.f4770g);
        view.getLocationOnScreen(this.f4769f);
        int[] iArr = this.f4769f;
        int i16 = iArr[0];
        int[] iArr2 = this.f4770g;
        int i17 = i16 - iArr2[0];
        iArr[0] = i17;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i17 + i11) - (m5775b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4765b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f4765b.getMeasuredHeight();
        int i18 = this.f4769f[1];
        int i19 = ((i13 + i18) - dimensionPixelOffset3) - measuredHeight;
        int i21 = i18 + height + dimensionPixelOffset3;
        if (z11) {
            if (i19 >= 0) {
                layoutParams.y = i19;
                return;
            } else {
                layoutParams.y = i21;
                return;
            }
        }
        if (measuredHeight + i21 <= this.f4768e.height()) {
            layoutParams.y = i21;
        } else {
            layoutParams.y = i19;
        }
    }

    /* renamed from: b */
    private static View m5775b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5776c() {
        if (!m5777d()) {
            return;
        }
        ((WindowManager) this.f4764a.getSystemService("window")).removeView(this.f4765b);
    }

    /* renamed from: d */
    boolean m5777d() {
        if (this.f4765b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5778e(View view, int i11, int i12, boolean z11, CharSequence charSequence) {
        if (m5777d()) {
            m5776c();
        }
        this.f4766c.setText(charSequence);
        m5774a(view, i11, i12, z11, this.f4767d);
        ((WindowManager) this.f4764a.getSystemService("window")).addView(this.f4765b, this.f4767d);
    }
}
