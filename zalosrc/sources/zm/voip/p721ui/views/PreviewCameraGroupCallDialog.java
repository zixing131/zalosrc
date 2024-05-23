package zm.voip.p721ui.views;

import ag0.C0815e1;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.LinearLayout;
import bp0.AbstractC3098j0;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.ViewRenderListener;
import p361nb.C23648e;
import zm.voip.p721ui.views.PreviewCameraGroupCallDialog;
import zm.voip.service.AbstractC32273e3;

/* loaded from: classes7.dex */
public final class PreviewCameraGroupCallDialog extends DialogView implements View.OnClickListener, ViewRenderListener {

    /* renamed from: M0 */
    public static final C32471a f149858M0 = new C32471a(null);

    /* renamed from: N0 */
    private static final int f149859N0 = AbstractC3104p.m15650a(280.0f);

    /* renamed from: H0 */
    private TextureViewRenderer f149860H0;

    /* renamed from: I0 */
    private Configuration f149861I0;

    /* renamed from: J0 */
    private long f149862J0;

    /* renamed from: K0 */
    private String f149863K0 = "";

    /* renamed from: L0 */
    private int f149864L0 = -1;

    /* renamed from: zm.voip.ui.views.PreviewCameraGroupCallDialog$a */
    /* loaded from: classes7.dex */
    public static final class C32471a {
        private C32471a() {
        }

        public /* synthetic */ C32471a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: YK */
    private final void m157223YK() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i11;
        int i12;
        Rect bounds2;
        int i13;
        int i14;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = m92692wK().mo35575n1().getWindowManager().getCurrentWindowMetrics();
                AbstractC19074t.m100207e(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
                AbstractC19074t.m100207e(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i11 = insetsIgnoringVisibility.left;
                int i15 = width - i11;
                i12 = insetsIgnoringVisibility.right;
                AbstractC3104p.f13184a = i15 - i12;
                bounds2 = currentWindowMetrics.getBounds();
                int height = bounds2.height();
                i13 = insetsIgnoringVisibility.top;
                i14 = insetsIgnoringVisibility.bottom;
                AbstractC3104p.f13185b = (height - i13) - i14;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Object systemService = m92692wK().mo35575n1().getSystemService("window");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
                AbstractC3104p.f13184a = displayMetrics.widthPixels;
                AbstractC3104p.f13185b = displayMetrics.heightPixels;
            }
            AbstractC3104p.f13188e = AbstractC17484n.Companion.m92931b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public static final void m157224ZK(PreviewCameraGroupCallDialog previewCameraGroupCallDialog) {
        AbstractC19074t.m100208f(previewCameraGroupCallDialog, "this$0");
        try {
            previewCameraGroupCallDialog.m157225aL();
            TextureViewRenderer textureViewRenderer = previewCameraGroupCallDialog.f149860H0;
            if (textureViewRenderer == null) {
                AbstractC19074t.m100223u("preview");
                textureViewRenderer = null;
            }
            AbstractC3098j0.m15580c(textureViewRenderer);
            AbstractC32273e3.m155748Q().mo155883g2(textureViewRenderer, true, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aL */
    private final void m157225aL() {
        TextureViewRenderer textureViewRenderer = this.f149860H0;
        TextureViewRenderer textureViewRenderer2 = null;
        if (textureViewRenderer == null) {
            AbstractC19074t.m100223u("preview");
            textureViewRenderer = null;
        }
        textureViewRenderer.setRenderListener(null);
        TextureViewRenderer textureViewRenderer3 = this.f149860H0;
        if (textureViewRenderer3 == null) {
            AbstractC19074t.m100223u("preview");
        } else {
            textureViewRenderer2 = textureViewRenderer3;
        }
        textureViewRenderer2.release();
    }

    /* renamed from: bL */
    private final void m157226bL() {
        TextureViewRenderer textureViewRenderer = this.f149860H0;
        TextureViewRenderer textureViewRenderer2 = null;
        if (textureViewRenderer == null) {
            AbstractC19074t.m100223u("preview");
            textureViewRenderer = null;
        }
        ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = Math.min((AbstractC3104p.m15657d0() * 2) / 5, f149859N0);
        TextureViewRenderer textureViewRenderer3 = this.f149860H0;
        if (textureViewRenderer3 == null) {
            AbstractC19074t.m100223u("preview");
        } else {
            textureViewRenderer2 = textureViewRenderer3;
        }
        textureViewRenderer2.setLayoutParams(layoutParams2);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("group_id", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f149863K0 = string;
                this.f149864L0 = m92642L3.getInt("preview_cam_dialog_source", -1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        Object obj;
        Context m92648SI = m92648SI();
        TextureViewRenderer textureViewRenderer = null;
        if (m92648SI != null) {
            obj = m92648SI.getSystemService("layout_inflater");
        } else {
            obj = null;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) obj).inflate(AbstractC7409c0.preview_camera_group_call_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(AbstractC6918a0.call_cam_opening_preview);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        TextureViewRenderer textureViewRenderer2 = (TextureViewRenderer) findViewById;
        this.f149860H0 = textureViewRenderer2;
        if (textureViewRenderer2 == null) {
            AbstractC19074t.m100223u("preview");
        } else {
            textureViewRenderer = textureViewRenderer2;
        }
        textureViewRenderer.setMirror(true);
        textureViewRenderer.setCorner(AbstractC3104p.m15688t());
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        AbstractC3098j0.m15580c(textureViewRenderer);
        textureViewRenderer.setRenderListener(this);
        ((RobotoTextView) inflate.findViewById(AbstractC6918a0.gc_preview_cam_off_btn)).setOnClickListener(this);
        ((RobotoTextView) inflate.findViewById(AbstractC6918a0.gc_preview_cam_on_btn)).setOnClickListener(this);
        KeyEventCallbackC17462c keyEventCallbackC17462c = new KeyEventCallbackC17462c(m92689tK());
        keyEventCallbackC17462c.m92851B(inflate);
        return keyEventCallbackC17462c;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m157225aL();
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        super.mo12457Tv(interfaceC17463d);
        m157225aL();
        C0815e1.m2075D().m2100V(new C23648e(36, "in_call", 1, "gc_camera_setup_dialog", new String[0]).m123926s(this.f149863K0, String.valueOf(System.currentTimeMillis() - this.f149862J0)), false);
    }

    /* renamed from: XK */
    public final void m157227XK() {
        AbstractC32273e3.m155748Q().mo155838P0(false);
        dismiss();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.gc_preview_cam_off_btn;
        if (num != null && num.intValue() == i11) {
            AbstractC32273e3.m155748Q().mo155838P0(false);
            dismiss();
            C0815e1.m2075D().m2100V(new C23648e(36, "in_call", 0, "gc_camera_setup_off", new String[0]).m123926s(this.f149863K0, String.valueOf(this.f149864L0)), false);
            return;
        }
        int i12 = AbstractC6918a0.gc_preview_cam_on_btn;
        if (num != null && num.intValue() == i12) {
            AbstractC32273e3.m155748Q().mo155838P0(true);
            dismiss();
            C0815e1.m2075D().m2100V(new C23648e(36, "in_call", 0, "gc_camera_setup_on", new String[0]).m123926s(this.f149863K0, String.valueOf(this.f149864L0)), false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.f149861I0;
        if (configuration2 != null) {
            if ((configuration.diff(configuration2) & 1024) != 0) {
                m157223YK();
                m157226bL();
            }
        } else {
            m157223YK();
            m157226bL();
        }
        this.f149861I0 = new Configuration(configuration);
    }

    @Override // org.webrtc.ViewRenderListener
    public void onRenderFail() {
        TextureViewRenderer textureViewRenderer = this.f149860H0;
        if (textureViewRenderer == null) {
            AbstractC19074t.m100223u("preview");
            textureViewRenderer = null;
        }
        textureViewRenderer.post(new Runnable() { // from class: yo0.g
            @Override // java.lang.Runnable
            public final void run() {
                PreviewCameraGroupCallDialog.m157224ZK(PreviewCameraGroupCallDialog.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        AbstractC32273e3 m155748Q = AbstractC32273e3.m155748Q();
        TextureViewRenderer textureViewRenderer = this.f149860H0;
        if (textureViewRenderer == null) {
            AbstractC19074t.m100223u("preview");
            textureViewRenderer = null;
        }
        m155748Q.mo155883g2(textureViewRenderer, true, 0);
        m157226bL();
        mo43041MK(true);
        m92596NK(false);
        this.f149862J0 = System.currentTimeMillis();
    }

    @Override // org.webrtc.ViewRenderListener
    public void onVideoFrameChange(int i11, int i12, int i13, int i14) {
    }
}
