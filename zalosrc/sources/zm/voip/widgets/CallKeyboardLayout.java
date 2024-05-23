package zm.voip.widgets;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import au.AbstractC2379w;
import p348mi.AbstractC23309i;
import zm.voip.widgets.CallKeyboardLayout;

/* loaded from: classes7.dex */
public class CallKeyboardLayout extends FrameLayout {

    /* renamed from: p */
    private final AbstractC2379w.a f149885p;

    /* renamed from: q */
    private InterfaceC32478a f149886q;

    /* renamed from: r */
    private int f149887r;

    /* renamed from: s */
    private boolean f149888s;

    /* renamed from: zm.voip.widgets.CallKeyboardLayout$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32478a {
        /* renamed from: a */
        void mo142929a();
    }

    public CallKeyboardLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m157270b(int i11) {
        InterfaceC32478a interfaceC32478a;
        if (i11 > 0 && i11 != this.f149887r && (interfaceC32478a = this.f149886q) != null) {
            interfaceC32478a.mo142929a();
        }
        this.f149887r = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ WindowInsets m157271c(Context context, View view, WindowInsets windowInsets) {
        AbstractC2379w.m12429c(this, this.f149885p, AbstractC23309i.m122007i5(context));
        m157270b(this.f149885p.f9930e);
        return windowInsets;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (!isInEditMode() && this.f149888s) {
            AbstractC2379w.m12429c(this, this.f149885p, AbstractC23309i.m122007i5(getContext()));
            m157270b(this.f149885p.f9930e);
        }
        super.onMeasure(i11, i12);
    }

    public void setListener(InterfaceC32478a interfaceC32478a) {
        this.f149886q = interfaceC32478a;
    }

    public CallKeyboardLayout(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149885p = new AbstractC2379w.a();
        this.f149887r = 0;
        this.f149888s = true;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f149888s = false;
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ep0.a
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets m157271c;
                    m157271c = CallKeyboardLayout.this.m157271c(context, view, windowInsets);
                    return m157271c;
                }
            });
        }
    }
}
