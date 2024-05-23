package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.p077ui.widget.ImeFrameLayout;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fb0.C18865a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class ImeFrameLayout extends KeyboardFrameLayout {

    /* renamed from: A */
    private KeyboardFrameLayout.InterfaceC13508a f69333A;

    /* renamed from: w */
    private final InterfaceC13506a f69334w;

    /* renamed from: x */
    private int f69335x;

    /* renamed from: y */
    private View f69336y;

    /* renamed from: z */
    private List f69337z;

    /* renamed from: com.zing.zalo.ui.widget.ImeFrameLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13506a {

        /* renamed from: com.zing.zalo.ui.widget.ImeFrameLayout$a$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC13506a {

            /* renamed from: a */
            public static final a f69338a = new a();

            private a() {
            }
        }

        /* renamed from: com.zing.zalo.ui.widget.ImeFrameLayout$a$b */
        /* loaded from: classes6.dex */
        public static final class b implements InterfaceC13506a {

            /* renamed from: a */
            public static final b f69339a = new b();

            private b() {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC13506a interfaceC13506a;
        InterfaceC27218a interfaceC27218a;
        AbstractC19074t.m100208f(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            if (context instanceof InterfaceC27218a) {
                interfaceC27218a = (InterfaceC27218a) context;
            } else {
                interfaceC27218a = null;
            }
            if (interfaceC27218a == null || !interfaceC27218a.mo35567d1()) {
                interfaceC13506a = InterfaceC13506a.a.f69338a;
                this.f69334w = interfaceC13506a;
                this.f69337z = new ArrayList();
            }
        }
        interfaceC13506a = InterfaceC13506a.b.f69339a;
        this.f69334w = interfaceC13506a;
        this.f69337z = new ArrayList();
    }

    /* renamed from: A */
    private final void m75747A(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    /* renamed from: D */
    private final void m75748D() {
        InterfaceC27218a interfaceC27218a;
        C17487o0 mo35579p;
        ZaloView m93012K0;
        Object context = getContext();
        if (context instanceof InterfaceC27218a) {
            interfaceC27218a = (InterfaceC27218a) context;
        } else {
            interfaceC27218a = null;
        }
        if (interfaceC27218a != null && (mo35579p = interfaceC27218a.mo35579p()) != null && (m93012K0 = mo35579p.m93012K0()) != null) {
            m75749G(m93012K0);
        }
    }

    /* renamed from: G */
    private final void m75749G(ZaloView zaloView) {
        if (zaloView.m92685rJ()) {
            if (AbstractC19074t.m100204b(this.f69334w, InterfaceC13506a.a.f69338a)) {
                m75754s();
            } else {
                InterfaceC27218a m92676n2 = zaloView.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35554O(18);
                }
            }
        }
        zaloView.m92657cJ().getLifecycle().mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.ui.widget.ImeFrameLayout$registerLifecycleObserver$2

            /* renamed from: q */
            final /* synthetic */ ZaloView f69341q;

            /* renamed from: com.zing.zalo.ui.widget.ImeFrameLayout$registerLifecycleObserver$2$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C13507a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f69342a;

                static {
                    int[] iArr = new int[AbstractC1785o.a.values().length];
                    try {
                        iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f69342a = iArr;
                }
            }

            public ImeFrameLayout$registerLifecycleObserver$2(ZaloView zaloView2) {
                r2 = zaloView2;
            }

            @Override // androidx.lifecycle.InterfaceC1795t
            /* renamed from: X6 */
            public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                ImeFrameLayout.InterfaceC13506a interfaceC13506a;
                AbstractC19074t.m100208f(interfaceC1801w, "source");
                AbstractC19074t.m100208f(aVar, "event");
                int i11 = C13507a.f69342a[aVar.ordinal()];
                if (i11 == 1) {
                    interfaceC13506a = ImeFrameLayout.this.f69334w;
                    if (AbstractC19074t.m100204b(interfaceC13506a, ImeFrameLayout.InterfaceC13506a.a.f69338a)) {
                        ImeFrameLayout.this.m75754s();
                        return;
                    }
                    InterfaceC27218a m92676n22 = r2.m92676n2();
                    if (m92676n22 != null) {
                        m92676n22.mo35554O(18);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    ImeFrameLayout.this.m75753q();
                } else if (i11 == 3) {
                    r2.m92657cJ().getLifecycle().mo9338d(this);
                }
            }
        });
    }

    /* renamed from: q */
    public final void m75753q() {
        InterfaceC27218a interfaceC27218a;
        Window window;
        View findViewById;
        View view = this.f69336y;
        if (view == null) {
            return;
        }
        Object context = getContext();
        if (context instanceof InterfaceC27218a) {
            interfaceC27218a = (InterfaceC27218a) context;
        } else {
            interfaceC27218a = null;
        }
        if (interfaceC27218a != null && (window = interfaceC27218a.getWindow()) != null && (findViewById = window.findViewById(R.id.content)) != null) {
            C18865a.m98890d(findViewById, view);
        }
    }

    /* renamed from: s */
    public final void m75754s() {
        InterfaceC27218a interfaceC27218a;
        Window window;
        View findViewById;
        View view = this.f69336y;
        if (view == null) {
            return;
        }
        Object context = getContext();
        if (context instanceof InterfaceC27218a) {
            interfaceC27218a = (InterfaceC27218a) context;
        } else {
            interfaceC27218a = null;
        }
        if (interfaceC27218a != null && (window = interfaceC27218a.getWindow()) != null && (findViewById = window.findViewById(R.id.content)) != null) {
            C18865a.m98888a(findViewById, view);
        }
    }

    /* renamed from: v */
    private final void m75755v(boolean z11, int i11, int i12, int i13, int i14) {
        m75762h(z11, i11, i12, i13, i14);
    }

    /* renamed from: w */
    private final void m75756w(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    /* renamed from: x */
    private final void m75757x(int i11, int i12) {
        m75763i(i11, i12);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        InterfaceC13506a interfaceC13506a = this.f69334w;
        if (AbstractC19074t.m100204b(interfaceC13506a, InterfaceC13506a.b.f69339a)) {
            m75756w(z11, i11, i12, i13, i14);
        } else if (AbstractC19074t.m100204b(interfaceC13506a, InterfaceC13506a.a.f69338a)) {
            m75755v(z11, i11, i12, i13, i14);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        InterfaceC13506a interfaceC13506a = this.f69334w;
        if (AbstractC19074t.m100204b(interfaceC13506a, InterfaceC13506a.b.f69339a)) {
            m75747A(i11, i12);
        } else if (AbstractC19074t.m100204b(interfaceC13506a, InterfaceC13506a.a.f69338a)) {
            m75757x(i11, i12);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout
    public void setBottomViewsGroup(ArrayList<View> arrayList) {
        AbstractC19074t.m100208f(arrayList, "bottomViewsGroup");
        this.f69337z = arrayList;
        super.setBottomViewsGroup(arrayList);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout
    public void setOnKeyboardListener(KeyboardFrameLayout.InterfaceC13508a interfaceC13508a) {
        this.f69333A = interfaceC13508a;
        super.setOnKeyboardListener(interfaceC13508a);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout
    public void setPaddingBottom(int i11) {
        this.f69335x = i11;
        super.setPaddingBottom(i11);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout
    public void setTopViewGroup(View view) {
        super.setTopViewGroup(view);
        this.f69336y = view;
        m75748D();
    }

    /* renamed from: u */
    public final boolean m75758u() {
        return AbstractC19074t.m100204b(this.f69334w, InterfaceC13506a.a.f69338a);
    }
}
