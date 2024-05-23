package mn;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.zing.zalo.expandableview.button.CameraActionButton;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import jg0.AbstractC21248c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: mn.b */
/* loaded from: classes3.dex */
public abstract class AbstractC23359b {

    /* renamed from: p */
    private final View f113580p;

    /* renamed from: q */
    private final InterfaceC24854k f113581q;

    /* renamed from: r */
    private final InterfaceC24854k f113582r;

    /* renamed from: mn.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return AbstractC23359b.this.f113580p.findViewById(AbstractC21248c.cea_gradient_bg);
        }
    }

    /* renamed from: mn.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutCompat mo12V4() {
            return (LinearLayoutCompat) AbstractC23359b.this.f113580p.findViewById(AbstractC21248c.cea_container);
        }
    }

    public AbstractC23359b(View view) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(view, "view");
        this.f113580p = view;
        m129210a = AbstractC24856m.m129210a(new b());
        this.f113581q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new a());
        this.f113582r = m129210a2;
    }

    /* renamed from: j */
    public final View m122809j() {
        return m122811l();
    }

    /* renamed from: k */
    public final View m122810k() {
        Object value = this.f113582r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* renamed from: l */
    public final LinearLayoutCompat m122811l() {
        Object value = this.f113581q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (LinearLayoutCompat) value;
    }

    /* renamed from: m */
    public final void m122812m(int i11, int i12) {
        CameraActionButton cameraActionButton = (CameraActionButton) m122811l().findViewById(i11);
        if (cameraActionButton != null) {
            cameraActionButton.setButtonBackgroundResource(i12);
        }
    }
}
