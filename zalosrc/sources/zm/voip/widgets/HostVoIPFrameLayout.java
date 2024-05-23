package zm.voip.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import bp0.AbstractC3104p;
import xl0.InterfaceC30160a;
import zm.voip.service.C32369y;
import zm.voip.widgets.HostVoIPFrameLayout;

/* loaded from: classes7.dex */
public class HostVoIPFrameLayout extends FrameLayout {

    /* renamed from: p */
    FrameLayout f150043p;

    /* renamed from: q */
    InterfaceC30160a f150044q;

    /* renamed from: r */
    private final C32369y f150045r;

    public HostVoIPFrameLayout(Context context, C32369y c32369y) {
        super(context);
        this.f150045r = c32369y;
        setBackgroundColor(0);
        setFitsSystemWindows(true);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ep0.k
            public /* synthetic */ ViewOnApplyWindowInsetsListenerC18551k() {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m157370b;
                m157370b = HostVoIPFrameLayout.this.m157370b(view, windowInsets);
                return m157370b;
            }
        });
        setSystemUiVisibility(1280);
        setMotionEventSplittingEnabled(false);
    }

    /* renamed from: b */
    public /* synthetic */ WindowInsets m157370b(View view, WindowInsets windowInsets) {
        InterfaceC30160a interfaceC30160a = this.f150044q;
        if (interfaceC30160a != null) {
            interfaceC30160a.mo35574m(windowInsets);
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        FrameLayout frameLayout = this.f150043p;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        if (C32369y.m156397E()) {
            if (getResources().getConfiguration().orientation == 2) {
                i13 = AbstractC3104p.m15650a(30.0f);
            } else {
                i13 = 0;
            }
            this.f150045r.m156431G(Resources.getSystem().getDisplayMetrics().widthPixels + i13, Resources.getSystem().getDisplayMetrics().heightPixels);
        } else {
            this.f150045r.m156431G(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        super.addView(view, i11);
        FrameLayout frameLayout = this.f150043p;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        FrameLayout frameLayout = this.f150043p;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, int i12) {
        super.addView(view, i11, i12);
        FrameLayout frameLayout = this.f150043p;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        FrameLayout frameLayout = this.f150043p;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }
}
