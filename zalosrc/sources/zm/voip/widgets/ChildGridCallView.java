package zm.voip.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bp0.AbstractC3082b0;
import bp0.AbstractC3098j0;
import bp0.AbstractC3105q;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import org.webrtc.TextureViewRenderer;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* loaded from: classes7.dex */
public class ChildGridCallView extends FrameLayout {

    /* renamed from: p */
    public TextureViewRenderer f149893p;

    /* renamed from: q */
    public BlurImageView f149894q;

    /* renamed from: r */
    C24003n f149895r;

    /* renamed from: s */
    LinearLayout f149896s;

    /* renamed from: t */
    AppCompatImageView f149897t;

    /* renamed from: u */
    AppCompatImageView f149898u;

    /* renamed from: v */
    C23528a f149899v;

    /* renamed from: zm.voip.widgets.ChildGridCallView$a */
    /* loaded from: classes7.dex */
    class C32479a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149900l1;

        C32479a(String str) {
            this.f149900l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null && this.f149900l1.equals(str)) {
                        interfaceC3968a.setImageInfo(c3979l);
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e("ChildGridCallView", "updateCaptureViewMask : " + e11.getMessage(), e11);
                }
            }
        }
    }

    public ChildGridCallView(Context context) {
        super(context);
        setLayoutParams(AbstractC3105q.m15698a(-1, -1));
        m157275a(context);
    }

    /* renamed from: a */
    void m157275a(Context context) {
        this.f149899v = new C23528a(context);
        C24003n c24003n = new C24003n();
        this.f149895r = c24003n;
        c24003n.f116264e = 1006;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116271l = AbstractC16803z.avatar_blur_default;
        mo157276b();
    }

    /* renamed from: b */
    void mo157276b() {
    }

    /* renamed from: c */
    public void m157277c() {
        AbstractC3098j0.m15580c(this.f149893p);
    }

    /* renamed from: d */
    public void m157278d(String str) {
        try {
            if (this.f149894q != null && !TextUtils.isEmpty(str)) {
                AbstractC3082b0.m15421c("ChildGridCallView", "load mask view " + str);
                if (!C23302b.f113247a.m120523d(str)) {
                    ((C23528a) this.f149899v.m123612r(this.f149894q)).m123577A(str, this.f149895r, 1, new C32479a(str));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m157279e() {
        try {
            TextureViewRenderer textureViewRenderer = this.f149893p;
            if (textureViewRenderer != null) {
                textureViewRenderer.registerSurfaceViewCallback(null);
                this.f149893p.release();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m157280f(boolean z11) {
        int i11;
        AppCompatImageView appCompatImageView = this.f149897t;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        appCompatImageView.setVisibility(i11);
    }
}
